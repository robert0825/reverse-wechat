package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.tencent.liteav.audio.TXCAudioPlayer;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.TXIAudioPlayListener;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRDef;
import com.tencent.liteav.basic.jitterbuffer.TXCVideoJitterBuffer;
import com.tencent.liteav.basic.jitterbuffer.TXIVideoJitterBufferListener;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.serverconfig.TXCConfigCenter;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.network.TXIStreamDownloaderListener;
import com.tencent.liteav.record.TXCStreamRecord;
import com.tencent.liteav.record.TXCStreamRecord.TXCStreamRecordParams;
import com.tencent.liteav.record.TXCStreamRecord.TXIStreamRecordListener;
import com.tencent.liteav.renderer.TXCVideoRender;
import com.tencent.liteav.renderer.TXCVideoRender.TXIYuvRenderTextureListener;
import com.tencent.liteav.renderer.TXIVideoRenderListener;
import com.tencent.liteav.renderer.TXIVideoRenderTextureListener;
import com.tencent.liteav.renderer.TXTweenFilter;
import com.tencent.liteav.videodecoder.TXCVideoDecoder;
import com.tencent.liteav.videodecoder.TXIVideoDecoderListener;
import com.tencent.rtmp.TXLivePlayStatsCollection;
import com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;
import com.tencent.ugc.TXRecordCommon.TXRecordResult;

public class TXCLivePlayer
  extends TXIPlayer
  implements TXIAudioPlayListener, TXIVideoJitterBufferListener, TXINotifyListener, TXIStreamDownloaderListener, TXCVideoRender.TXIYuvRenderTextureListener, TXIVideoRenderListener, TXIVideoRenderTextureListener, TXIVideoDecoderListener
{
  public static final String TAG = "TXCLivePlayer";
  private TXCAudioPlayer mAudioPlayer = null;
  private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
  private int mBits = 16;
  private int mChannels = 0;
  private int mDecodeHeight = 0;
  private int mDecodeWidth = 0;
  private volatile boolean mIsFirstPlay = true;
  private boolean mIsNeedClearLastImg = true;
  private boolean mIsPlaying = false;
  private long mLastVideoDecSucTick = 0L;
  private long mLastVideoLagWarning = 0L;
  private TXTweenFilter mLocalRenderFilter = null;
  private Handler mMainHandler = new Handler(Looper.getMainLooper());
  private float[] mMtx = new float[16];
  private boolean mMute = false;
  private TXTweenFilter mOesFilter = null;
  private TXLivePlayStatsCollection mPlayStats = null;
  private int mPlayType = -1;
  public TXRecordCommon.ITXVideoRecordListener mRecordListener;
  private boolean mRecording = false;
  private int mSampleRate = 0;
  private TXCStreamDownloader mStreamDownloader = null;
  private TXCVideoDecoder mVideoDecoder = null;
  private TXCVideoJitterBuffer mVideoJitterBuffer = null;
  private TXCStreamRecord mVideoRecord;
  public TXCVideoRender mVideoRender = null;
  private TextureView mVideoView;
  private float[] mYuvMtx = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F };
  
  public TXCLivePlayer(Context paramContext)
  {
    super(paramContext);
    this.mVideoRender.setNotifyListener(this);
  }
  
  private void checkStartRecordFilter()
  {
    if (this.mVideoRecord == null)
    {
      TXCStreamRecord.TXCStreamRecordParams localTXCStreamRecordParams = initVideoRecorder();
      this.mVideoRecord = new TXCStreamRecord();
      this.mVideoRecord.start(localTXCStreamRecordParams);
      this.mVideoRecord.setStreamRecordListener(new TXCStreamRecord.TXIStreamRecordListener()
      {
        public void onRecordComplete(int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
        {
          TXRecordCommon.TXRecordResult localTXRecordResult;
          if (TXCLivePlayer.this.mRecordListener != null)
          {
            localTXRecordResult = new TXRecordCommon.TXRecordResult();
            if (paramAnonymousInt != 0) {
              break label85;
            }
          }
          label85:
          for (localTXRecordResult.retCode = 0;; localTXRecordResult.retCode = -1)
          {
            localTXRecordResult.descMsg = paramAnonymousString1;
            localTXRecordResult.videoPath = paramAnonymousString2;
            localTXRecordResult.coverPath = paramAnonymousString3;
            TXCLivePlayer.this.mRecordListener.onRecordComplete(localTXRecordResult);
            TXCLivePlayer.this.mVideoRender.setTextureListener(null);
            TXCLivePlayer.this.mVideoRender.setYuvRenderTextureListener(null);
            return;
          }
        }
        
        public void onRecordProgress(long paramAnonymousLong)
        {
          if (TXCLivePlayer.this.mRecordListener != null) {
            TXCLivePlayer.this.mRecordListener.onRecordProgress(paramAnonymousLong);
          }
        }
      });
    }
    if (this.mOesFilter == null)
    {
      this.mOesFilter = new TXTweenFilter(Boolean.valueOf(true));
      this.mOesFilter.create();
      this.mOesFilter.setInputResolution(this.mDecodeWidth, this.mDecodeHeight);
      this.mOesFilter.setOutputResolution(this.mDecodeWidth, this.mDecodeHeight);
    }
    if (this.mLocalRenderFilter == null)
    {
      this.mLocalRenderFilter = new TXTweenFilter(Boolean.valueOf(false));
      this.mLocalRenderFilter.create();
      this.mLocalRenderFilter.setInputResolution(this.mVideoRender.getVideoView().getWidth(), this.mVideoRender.getVideoView().getHeight());
      this.mLocalRenderFilter.setOutputResolution(this.mVideoRender.getVideoView().getWidth(), this.mVideoRender.getVideoView().getHeight());
      Matrix.setIdentityM(this.mMtx, 0);
    }
  }
  
  private void checkStopRecordFilter()
  {
    if (this.mOesFilter != null)
    {
      this.mOesFilter.destroy();
      this.mOesFilter = null;
    }
    if (this.mLocalRenderFilter != null)
    {
      this.mLocalRenderFilter.destroy();
      this.mLocalRenderFilter = null;
    }
    if (this.mVideoRecord != null)
    {
      this.mVideoRecord.stop();
      this.mVideoRecord = null;
    }
  }
  
  private void initModules(int paramInt)
  {
    if (paramInt == 0) {
      this.mStreamDownloader = new TXCStreamDownloader(this.mApplicationContext, 0, 1);
    }
    for (;;)
    {
      this.mStreamDownloader.setListener(this);
      this.mStreamDownloader.setNotifyListener(this);
      this.mVideoRender.setListener(this);
      this.mVideoRender.start();
      this.mVideoDecoder = new TXCVideoDecoder();
      this.mVideoDecoder.setListener(this);
      this.mVideoDecoder.setNotifyListener(this);
      this.mVideoJitterBuffer = new TXCVideoJitterBuffer();
      this.mVideoJitterBuffer.setListener(this);
      this.mAudioPlayer = new TXCAudioPlayer(this.mApplicationContext);
      this.mAudioPlayer.setListener(this);
      this.mPlayStats = new TXLivePlayStatsCollection(this.mApplicationContext);
      this.mPlayStats.setAudioPlayer(this.mAudioPlayer);
      this.mPlayStats.setJitter(this.mVideoJitterBuffer);
      this.mPlayStats.setRender(this.mVideoRender);
      this.mPlayStats.setDownloader(this.mStreamDownloader);
      return;
      if (paramInt == 5) {
        this.mStreamDownloader = new TXCStreamDownloader(this.mApplicationContext, 0, 4);
      } else {
        this.mStreamDownloader = new TXCStreamDownloader(this.mApplicationContext, 0, 0);
      }
    }
  }
  
  private TXCStreamRecord.TXCStreamRecordParams initVideoRecorder()
  {
    int k = 480;
    int m = 640;
    int j = m;
    int i = k;
    if (this.mDecodeWidth > 0)
    {
      j = m;
      i = k;
      if (this.mDecodeHeight > 0)
      {
        i = this.mDecodeWidth;
        j = this.mDecodeHeight;
      }
    }
    TXCStreamRecord.TXCStreamRecordParams localTXCStreamRecordParams = new TXCStreamRecord.TXCStreamRecordParams();
    localTXCStreamRecordParams.mWidth = i;
    localTXCStreamRecordParams.mHeight = j;
    localTXCStreamRecordParams.mFPS = 20;
    double d = i * i;
    localTXCStreamRecordParams.mBitRateKb = ((int)(Math.sqrt(j * j + d * 1.0D) * 1.2D));
    localTXCStreamRecordParams.mChannels = this.mChannels;
    localTXCStreamRecordParams.mSampleRate = this.mSampleRate;
    localTXCStreamRecordParams.mBits = this.mBits;
    localTXCStreamRecordParams.mOutputFilePath = TXCStreamRecord.genFilePath(this.mApplicationContext, ".mp4");
    localTXCStreamRecordParams.mCoverImagePath = TXCStreamRecord.genFilePath(this.mApplicationContext, ".jpg");
    localTXCStreamRecordParams.mEglContext = this.mVideoRender.getGLContext();
    TXCLog.d("TXCLivePlayer", "record config: " + localTXCStreamRecordParams);
    return localTXCStreamRecordParams;
  }
  
  private void notifyEvent(final int paramInt, final String paramString)
  {
    if (this.mMainHandler != null) {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          TXCSystemUtil.notifyEvent(TXCLivePlayer.this.mNotifyListener, paramInt, paramString);
        }
      });
    }
  }
  
  private void setPlayCacheStrategy()
  {
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.setCacheTime(this.mConfig.cacheTime);
      this.mAudioPlayer.setAutojust(this.mConfig.autoAdjustCacheTime);
      this.mAudioPlayer.setAutoAdjustMinCache(this.mConfig.minAutoAdjustCacheTime);
      this.mAudioPlayer.setAutoAdjustMaxCache(this.mConfig.maxAutoAdjustCacheTime);
    }
  }
  
  private void setupRealTimePlayParams(int paramInt)
  {
    if (paramInt == 5) {
      if (this.mConfig.enableHWDec)
      {
        this.mConfig.autoAdjustCacheTime = true;
        this.mConfig.cacheTime = 0.3F;
        this.mConfig.minAutoAdjustCacheTime = 0.3F;
        this.mConfig.maxAutoAdjustCacheTime = 0.5F;
        if (this.mStreamDownloader != null)
        {
          if (this.mConfig.connectRetryCount < 5) {
            this.mConfig.connectRetryCount = 5;
          }
          if (this.mConfig.connectRetryInterval > 1) {
            this.mConfig.connectRetryInterval = 1;
          }
          this.mStreamDownloader.setRetryTimes(this.mConfig.connectRetryCount);
          this.mStreamDownloader.setRetryInterval(this.mConfig.connectRetryInterval);
        }
        if (this.mAudioPlayer != null)
        {
          TXCAudioPlayer.setTraeConfig(TXCConfigCenter.getInstance().getTRAEConfig());
          TXCAudioPlayer localTXCAudioPlayer = this.mAudioPlayer;
          if (!TXCConfigCenter.getInstance().getSysAecEnable(1)) {
            break label220;
          }
          paramInt = TXEAudioDef.TXE_AEC_SYSTEM;
          label161:
          localTXCAudioPlayer.setAECType(paramInt, this.mApplicationContext);
          this.mAudioPlayer.enableRealTimePlay(true);
        }
      }
    }
    label220:
    do
    {
      return;
      this.mConfig.autoAdjustCacheTime = true;
      this.mConfig.cacheTime = 0.2F;
      this.mConfig.minAutoAdjustCacheTime = 0.2F;
      this.mConfig.maxAutoAdjustCacheTime = 0.5F;
      break;
      paramInt = TXEAudioDef.TXE_AEC_TRAE;
      break label161;
      if (this.mStreamDownloader != null)
      {
        this.mStreamDownloader.setRetryTimes(this.mConfig.connectRetryCount);
        this.mStreamDownloader.setRetryInterval(this.mConfig.connectRetryInterval);
      }
    } while (this.mAudioPlayer == null);
    if ((this.mConfig != null) && (this.mConfig.enableAec))
    {
      TXCAudioPlayer.setTraeConfig(TXCConfigCenter.getInstance().getTRAEConfig());
      this.mAudioPlayer.setAECType(TXEAudioDef.TXE_AEC_TRAE, this.mApplicationContext);
      this.mAudioPlayer.enableRealTimePlay(true);
      return;
    }
    this.mAudioPlayer.setAECType(TXEAudioDef.TXE_AEC_NONE, this.mApplicationContext);
    this.mAudioPlayer.enableRealTimePlay(false);
  }
  
  private void startDecode(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool2;
    if ((this.mVideoDecoder != null) && (paramSurfaceTexture != null))
    {
      this.mVideoDecoder.setup(paramSurfaceTexture, null, null);
      paramSurfaceTexture = this.mVideoDecoder;
      bool2 = this.mConfig.enableHWDec;
      if (this.mPlayType == 5) {
        break label53;
      }
    }
    label53:
    for (boolean bool1 = true;; bool1 = false)
    {
      paramSurfaceTexture.start(bool2, bool1);
      return;
    }
  }
  
  private void uninitModules()
  {
    if (this.mPlayStats != null)
    {
      this.mPlayStats.setListener(null);
      this.mPlayStats.stop();
    }
    if (this.mStreamDownloader != null)
    {
      this.mStreamDownloader.setListener(null);
      this.mStreamDownloader.setNotifyListener(null);
      this.mStreamDownloader.stop();
      this.mStreamDownloader = null;
    }
    if (this.mVideoDecoder != null)
    {
      this.mVideoDecoder.setListener(null);
      this.mVideoDecoder.setNotifyListener(null);
      this.mVideoDecoder.stop();
      this.mVideoDecoder = null;
    }
    if (this.mAudioPlayer != null)
    {
      this.mAudioPlayer.setListener(null);
      this.mAudioPlayer.stopPlay();
      this.mAudioPlayer = null;
    }
    if (this.mVideoJitterBuffer != null)
    {
      this.mVideoJitterBuffer.setListener(null);
      this.mVideoJitterBuffer.stop();
      this.mVideoJitterBuffer = null;
    }
    if (this.mVideoRender != null)
    {
      this.mVideoRender.stop();
      this.mVideoRender.setListener(null);
    }
  }
  
  public TextureView getTextureView()
  {
    return this.mVideoView;
  }
  
  public boolean isPlaying()
  {
    return this.mIsPlaying;
  }
  
  public void onDecodeFrame(int paramInt)
  {
    if (paramInt < 0) {}
    try
    {
      if (this.mVideoJitterBuffer == null) {
        return;
      }
      this.mVideoJitterBuffer.nalConsumed((int)this.mVideoJitterBuffer.getDecoderFrames());
      return;
    }
    catch (Exception localException) {}
    if (this.mVideoJitterBuffer != null) {
      this.mVideoJitterBuffer.nalConsumed(paramInt);
    }
    long l1 = TXCTimeUtil.getTimeTick();
    if ((this.mLastVideoDecSucTick != 0L) && (l1 - this.mLastVideoDecSucTick > 1000L) && (l1 - this.mLastVideoLagWarning > 2000L))
    {
      long l2 = l1 - this.mLastVideoDecSucTick;
      TXCLog.w("TXCLivePlayer", "video decode frame interval[" + l2 + "]");
      notifyEvent(2105, "当前视频播放出现卡顿" + l2 + "ms");
      this.mLastVideoLagWarning = l1;
    }
    this.mLastVideoDecSucTick = l1;
    return;
  }
  
  public void onDecodeFrame(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3)
  {
    if (this.mVideoRender != null) {
      this.mVideoRender.renderYuvFrame(paramLong1, paramInt1, paramInt2);
    }
  }
  
  public void onDecodeFrame(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2, long paramLong1, long paramLong2) {}
  
  public void onNALAvaliable(TXSNALPacket paramTXSNALPacket)
  {
    try
    {
      TXCVideoDecoder localTXCVideoDecoder;
      if (this.mVideoDecoder != null)
      {
        localTXCVideoDecoder = this.mVideoDecoder;
        if (paramTXSNALPacket.nalType != 0) {
          break label39;
        }
      }
      label39:
      for (boolean bool = true;; bool = false)
      {
        localTXCVideoDecoder.pushNAL(bool, paramTXSNALPacket.nalData, paramTXSNALPacket.pts, paramTXSNALPacket.dts);
        return;
      }
      return;
    }
    catch (Exception paramTXSNALPacket) {}
  }
  
  public void onNotifyEvent(final int paramInt, final Bundle paramBundle)
  {
    if ((paramInt == 2003) && (this.mIsFirstPlay))
    {
      notifyEvent(2004, "视频播放开始");
      this.mIsFirstPlay = false;
    }
    if (this.mMainHandler != null) {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          TXCSystemUtil.notifyEvent(TXCLivePlayer.this.mNotifyListener, paramInt, paramBundle);
        }
      });
    }
  }
  
  public void onPlayAudioInfoChanged(TXSAudioPacket paramTXSAudioPacket)
  {
    TXCLog.d("TXCLivePlayer", "onPlayAudioInfoChanged, samplerate=" + paramTXSAudioPacket.sampleRate + ", channels=" + paramTXSAudioPacket.channelsPerSample + ", bits=" + paramTXSAudioPacket.bitsPerChannel);
    this.mChannels = paramTXSAudioPacket.channelsPerSample;
    this.mSampleRate = paramTXSAudioPacket.sampleRate;
    if (paramTXSAudioPacket.bitsPerChannel > 1) {
      this.mBits = paramTXSAudioPacket.bitsPerChannel;
    }
  }
  
  public void onPlayError(int paramInt, String paramString) {}
  
  public void onPlayJitterStateNotify(int paramInt)
  {
    if (paramInt == TXEAudioDef.TXE_AUDIO_JITTER_STATE_LOADING) {
      notifyEvent(2007, "视频缓冲中...");
    }
    do
    {
      return;
      if (paramInt == TXEAudioDef.TXE_AUDIO_JITTER_STATE_PLAYING)
      {
        notifyEvent(2004, "视频播放开始");
        return;
      }
    } while ((paramInt != TXEAudioDef.TXE_AUDIO_JITTER_STATE_FIRST_PLAY) || (!this.mIsFirstPlay));
    notifyEvent(2004, "视频播放开始");
    this.mIsFirstPlay = false;
  }
  
  public void onPlayPcmData(byte[] paramArrayOfByte, long paramLong)
  {
    long l = paramLong;
    if (this.mVideoRecord != null)
    {
      l = paramLong;
      if (paramLong <= 0L) {
        l = TXCTimeUtil.getTimeTick();
      }
      this.mVideoRecord.drainAudio(paramArrayOfByte, l);
    }
    if (this.mAudioRawDataListener != null) {
      this.mAudioRawDataListener.onPcmDataAvailable(paramArrayOfByte, l);
    }
  }
  
  public void onPlaySpeedPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void onPullAudio(TXSAudioPacket paramTXSAudioPacket)
  {
    if (!this.mIsPlaying) {}
    while (this.mAudioPlayer == null) {
      return;
    }
    this.mAudioPlayer.playData(paramTXSAudioPacket);
  }
  
  public void onPullNAL(TXSNALPacket paramTXSNALPacket)
  {
    if (!this.mIsPlaying) {}
    for (;;)
    {
      return;
      try
      {
        if (this.mVideoJitterBuffer != null)
        {
          this.mVideoJitterBuffer.pushNAL(paramTXSNALPacket);
          return;
        }
      }
      catch (Exception paramTXSNALPacket) {}
    }
  }
  
  public long onRequestAudioBufferDuration()
  {
    try
    {
      if (this.mAudioPlayer != null)
      {
        long l = this.mAudioPlayer.getCacheDuration();
        return l;
      }
    }
    catch (Exception localException) {}
    return 0L;
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture)
  {
    startDecode(paramSurfaceTexture);
  }
  
  public void onSurfaceTextureDestroy(SurfaceTexture paramSurfaceTexture)
  {
    try
    {
      TXCLog.w("TXCLivePlayer", "play:stop decode when surface texture release");
      if (this.mVideoDecoder != null) {
        this.mVideoDecoder.stop();
      }
      if (this.mVideoJitterBuffer != null) {
        this.mVideoJitterBuffer.nalConsumed((int)this.mVideoJitterBuffer.getDecoderFrames());
      }
      checkStopRecordFilter();
      stopRecord();
      return;
    }
    catch (Exception paramSurfaceTexture) {}
  }
  
  public int onTextureProcess(int paramInt, float[] paramArrayOfFloat)
  {
    TXCLog.d("TXCLivePlayer", "onTextureProcess:" + paramInt);
    if ((this.mVideoRecord != null) && (this.mOesFilter != null))
    {
      int i = this.mOesFilter.onDrawToTexture(paramInt);
      this.mVideoRecord.drainVideo(i, TXCTimeUtil.getTimeTick());
      this.mVideoRender.renderTexture(i, this.mDecodeWidth, this.mDecodeHeight, false, 0);
    }
    if (this.mRecording)
    {
      checkStartRecordFilter();
      return paramInt;
    }
    checkStopRecordFilter();
    return paramInt;
  }
  
  public void onTextureProcess(int paramInt)
  {
    TXCLog.d("TXCLivePlayer", "onTextureProcess:" + paramInt);
    if ((this.mVideoRecord != null) && (this.mLocalRenderFilter != null))
    {
      this.mLocalRenderFilter.setMatrix(this.mYuvMtx);
      int i = this.mLocalRenderFilter.onDrawToTexture(paramInt);
      this.mVideoRecord.drainVideo(i, TXCTimeUtil.getTimeTick());
      this.mLocalRenderFilter.setMatrix(this.mMtx);
      this.mLocalRenderFilter.onDraw(paramInt);
    }
    if (this.mRecording)
    {
      checkStartRecordFilter();
      return;
    }
    checkStopRecordFilter();
  }
  
  public void onVideoSizeChange(int paramInt1, int paramInt2)
  {
    this.mDecodeWidth = paramInt1;
    this.mDecodeHeight = paramInt2;
    if (this.mVideoRender != null) {
      this.mVideoRender.setVideoSize(paramInt1, paramInt2);
    }
    notifyEvent(2009, "分辨率改变");
  }
  
  public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener paramITXAudioRawDataListener)
  {
    this.mAudioRawDataListener = paramITXAudioRawDataListener;
  }
  
  public void setConfig(TXCPlayerConfig paramTXCPlayerConfig)
  {
    super.setConfig(paramTXCPlayerConfig);
    if (this.mPlayType != 5) {
      setPlayCacheStrategy();
    }
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mMute = paramBoolean;
    if (this.mAudioPlayer != null) {
      this.mAudioPlayer.setMute(this.mMute);
    }
  }
  
  public void setPlayerView(TextureView paramTextureView)
  {
    this.mVideoView = paramTextureView;
    if (this.mVideoRender != null) {
      this.mVideoRender.setup(this.mVideoView);
    }
  }
  
  public void setPlayerView(TXCloudVideoView paramTXCloudVideoView)
  {
    super.setPlayerView(paramTXCloudVideoView);
    if (this.mCloudVideoView != null)
    {
      this.mVideoView = this.mCloudVideoView.getVideoView();
      if (this.mVideoView == null) {
        this.mVideoView = new TextureView(this.mCloudVideoView.getContext());
      }
      this.mCloudVideoView.addVideoView(this.mVideoView);
    }
    if (this.mVideoRender != null) {
      this.mVideoRender.setup(this.mVideoView);
    }
  }
  
  public void setRenderMode(int paramInt)
  {
    if (this.mVideoRender != null) {
      this.mVideoRender.setRenderMode(paramInt);
    }
  }
  
  public void setRenderRotation(int paramInt)
  {
    if (this.mVideoRender != null) {
      this.mVideoRender.setRenderRotation(paramInt);
    }
  }
  
  public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener)
  {
    this.mRecordListener = paramITXVideoRecordListener;
  }
  
  public int startPlay(String paramString, int paramInt)
  {
    boolean bool = true;
    TXCLog.e("TXCLivePlayer", "===========================================================================================================================================================");
    TXCLog.e("TXCLivePlayer", "===========================================================================================================================================================");
    TXCLog.e("TXCLivePlayer", "=====  StartPlay url = " + paramString + " playType = " + paramInt + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
    TXCLog.e("TXCLivePlayer", "===========================================================================================================================================================");
    TXCLog.e("TXCLivePlayer", "===========================================================================================================================================================");
    initModules(paramInt);
    this.mPlayType = paramInt;
    this.mIsPlaying = true;
    this.mIsFirstPlay = true;
    setupRealTimePlayParams(paramInt);
    int i = this.mStreamDownloader.start(paramString, this.mConfig.enableNearestIP, this.mConfig.rtmpChannelType);
    if (i == 0)
    {
      this.mAudioPlayer.startPlay();
      this.mAudioPlayer.setMute(this.mMute);
      this.mVideoJitterBuffer.start();
      if (this.mVideoView != null) {
        this.mVideoView.setVisibility(0);
      }
      SurfaceTexture localSurfaceTexture = this.mVideoRender.getOESTexture();
      if (localSurfaceTexture != null) {
        startDecode(localSurfaceTexture);
      }
      setPlayCacheStrategy();
      this.mPlayStats.setListener(this);
      this.mPlayStats.setUrl(paramString);
      paramString = this.mPlayStats;
      if (paramInt == 5)
      {
        paramString.setRealTimeMode(bool);
        this.mPlayStats.start();
      }
    }
    for (;;)
    {
      this.mLastVideoDecSucTick = 0L;
      this.mLastVideoLagWarning = 0L;
      TXCDRApi.txReportDAU(this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_LIVE_PLAY);
      return i;
      bool = false;
      break;
      this.mIsPlaying = false;
      this.mPlayType = -1;
      uninitModules();
      if (this.mVideoView != null) {
        this.mVideoView.setVisibility(8);
      }
    }
  }
  
  public int startRecord(int paramInt)
  {
    if (this.mRecording)
    {
      TXCLog.e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
      return -1;
    }
    this.mRecording = true;
    this.mVideoRender.setTextureListener(this);
    this.mVideoRender.setYuvRenderTextureListener(this);
    TXCDRApi.txReportDAU(this.mApplicationContext, TXCDRDef.DR_DAU_EVENT_ID_UGC_PLAY_RECORD);
    return 0;
  }
  
  public int stopPlay(boolean paramBoolean)
  {
    int j = 0;
    int i;
    if (!isPlaying())
    {
      TXCLog.w("TXCLivePlayer", "play: ignore stop play when not started");
      i = -2;
    }
    do
    {
      do
      {
        return i;
        TXCLog.v("TXCLivePlayer", "play: stop");
        this.mIsPlaying = false;
        this.mIsFirstPlay = true;
        this.mPlayType = -1;
        this.mLastVideoDecSucTick = 0L;
        uninitModules();
        i = j;
      } while (this.mVideoView == null);
      i = j;
    } while (!paramBoolean);
    this.mVideoView.setVisibility(8);
    return 0;
  }
  
  public int stopRecord()
  {
    if (!this.mRecording)
    {
      TXCLog.w("TXCLivePlayer", "stopRecord: no recording task exist");
      return -1;
    }
    this.mRecording = false;
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXCLivePlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */