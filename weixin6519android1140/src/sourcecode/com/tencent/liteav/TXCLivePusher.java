package com.tencent.liteav;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.liteav.audio.TXCAudioRecorder;
import com.tencent.liteav.audio.TXCMixPlayer;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.TXIAudioRecordListener;
import com.tencent.liteav.audio.TXIMixPlayListener;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRDef;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.CropRect;
import com.tencent.liteav.basic.serverconfig.TXCConfigCenter;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXCVideoPreprocessor;
import com.tencent.liteav.beauty.TXIVideoPreprocessorListener;
import com.tencent.liteav.capturer.TXCCameraCapturer;
import com.tencent.liteav.network.TXCStreamUploader;
import com.tencent.liteav.network.TXSStreamUploaderParam;
import com.tencent.liteav.qos.TXCQoS;
import com.tencent.liteav.qos.TXIQoSListener;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.liteav.renderer.TXIVideoRenderListener;
import com.tencent.liteav.renderer.TXIVideoRenderTextureListener;
import com.tencent.liteav.screencapture.TXCScreenCapture;
import com.tencent.liteav.screencapture.TXIScreenCaptureListener;
import com.tencent.liteav.videoencoder.TXCVideoEncoder;
import com.tencent.liteav.videoencoder.TXIVideoEncoderListener;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.rtmp.TXLivePushStatsCollection;
import com.tencent.rtmp.TXLivePusher.OnBGMNotify;
import com.tencent.rtmp.TXLog;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

public class TXCLivePusher
  implements View.OnTouchListener, TXCBackgroundPusher.TXIBackgroudPushListener, TXIAudioRecordListener, TXINotifyListener, TXIVideoPreprocessorListener, TXIQoSListener, TXIVideoRenderListener, TXIVideoRenderTextureListener, TXIScreenCaptureListener, TXIVideoEncoderListener
{
  private static final String TAG = TXCLivePusher.class.getSimpleName();
  private static final int VIDEO_SRC_CAMERA = 0;
  private static final int VIDEO_SRC_SCREEN = 1;
  TXCBackgroundPusher mBackgoundPusher;
  public TXCCameraCapturer mCameraCapturer = null;
  public int mCameraType = 1;
  public TXCVideoPreprocessor mCameraVideoPreprocessor = null;
  public boolean mCapturing = false;
  public TXCLivePushConfig mConfig = null;
  private TXCloudVideoView mContainerView;
  public Context mContext = null;
  private boolean mDelayRecordAudio = false;
  private boolean mEnableEnergySavingMode = true;
  private boolean mEnableTextureSharp = false;
  private int mEncoderType = -1;
  private int mInputFormat = 4;
  private int mLastVideoEncodeHeigth = 0;
  private int mLastVideoEncodeWidth = 0;
  private Handler mMainHandler = null;
  private boolean mMirror = false;
  private boolean mMute = false;
  private Bundle mNetworkStats = null;
  public WeakReference<TXINotifyListener> mNotifyListener;
  TXLivePusher.OnBGMNotify mOldBGMNotify = null;
  TXIMixPlayListener mOldBGMNotifyProxy = null;
  private int mOrientaion = 0;
  private boolean mPausing = false;
  private WeakReference<TXICustomPreprocessListenner> mPreprocessListener;
  private TXLivePushStatsCollection mPushStats = null;
  private String mPushUrl = "";
  private boolean mPushing = false;
  private TXCQoS mQos = null;
  private TXCScreenCapture mScreenCapture = null;
  public EGLContext mScreenEGLContext = null;
  private TXCVideoPreprocessor mScreenVideoPreprocessor = null;
  private TXCStreamUploader mStreamUploader = null;
  private TXCVideoEncoder mVideoEncoder = null;
  private TXSVideoEncoderParam mVideoEncoderParam = null;
  public int mVideoHeight = 0;
  public int mVideoSrc = 0;
  public TXCGLSurfaceView mVideoView;
  public int mVideoWidth = 0;
  private int mViewRenderHeight = 0;
  private int mViewRenderWidth = 0;
  
  public TXCLivePusher(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mMainHandler = new Handler(Looper.getMainLooper());
    this.mConfig = new TXCLivePushConfig();
    initModules();
    TXCConfigCenter.getInstance().Init(paramContext);
  }
  
  private void encodeFrame(int paramInt1, int paramInt2, int paramInt3)
  {
    int k = 2;
    int j = 1;
    if ((!this.mPushing) || (this.mPausing)) {
      return;
    }
    int i = k;
    switch (this.mConfig.videoEncType)
    {
    default: 
      i = k;
    case 0: 
      if (this.mVideoSrc == 1) {
        i = j;
      }
      break;
    }
    for (;;)
    {
      j = this.mConfig.gop;
      if ((this.mVideoEncoder == null) || (this.mVideoWidth != paramInt2) || (this.mVideoHeight != paramInt3) || (this.mEncoderType != i) || ((this.mVideoEncoderParam != null) && (this.mVideoEncoderParam.gop != j))) {
        startEncoder(paramInt2, paramInt3, i);
      }
      this.mVideoEncoder.pushVideoFrame(paramInt1, paramInt2, paramInt3, TXCTimeUtil.getTimeTick());
      return;
      i = 1;
      break;
      i = 3;
      break;
    }
  }
  
  private int freshCameraResolution()
  {
    if (!this.mConfig.enableHighCapture) {}
    switch (this.mConfig.resolution)
    {
    case 3: 
    case 4: 
    case 5: 
    default: 
      return 7;
    case 0: 
      return 4;
    case 1: 
      return 5;
    case 2: 
      return 6;
    }
    return 3;
  }
  
  private boolean freshScreenCaptureResolution()
  {
    switch (this.mConfig.resolution)
    {
    default: 
      return false;
    case 0: 
      this.mConfig.width = 368;
      this.mConfig.height = 640;
      return false;
    case 1: 
      this.mConfig.width = 544;
      this.mConfig.height = 960;
      return false;
    case 2: 
      this.mConfig.width = 720;
      this.mConfig.height = 1280;
      return false;
    case 3: 
      this.mConfig.width = 640;
      this.mConfig.height = 368;
      return true;
    case 4: 
      this.mConfig.width = 960;
      this.mConfig.height = 544;
      return true;
    }
    this.mConfig.width = 1280;
    this.mConfig.height = 720;
    return true;
  }
  
  private void initCameraCaptureModule()
  {
    this.mVideoSrc = 0;
    this.mCameraCapturer = new TXCCameraCapturer();
    this.mCameraCapturer.setNotifyListener(this);
    this.mCameraCapturer.setHomeOriention(1);
    this.mCameraCapturer.setCameraType(1);
    this.mCameraCapturer.setResolution(freshCameraResolution());
    this.mCameraCapturer.setFPS(this.mConfig.fps);
  }
  
  private void initModules()
  {
    this.mCameraVideoPreprocessor = new TXCVideoPreprocessor(this.mContext, true);
    this.mVideoEncoder = null;
    this.mBackgoundPusher = new TXCBackgroundPusher(this);
  }
  
  private void initScreenCaptureModule()
  {
    this.mVideoSrc = 1;
    if (this.mScreenCapture == null)
    {
      this.mScreenCapture = new TXCScreenCapture(this.mContext);
      this.mScreenCapture.setListener(this);
      this.mScreenCapture.setNotifyListener(this);
    }
    this.mScreenVideoPreprocessor = new TXCVideoPreprocessor(this.mContext, true);
    this.mScreenVideoPreprocessor.setListener(this);
  }
  
  private void setViewSize(final int paramInt1, final int paramInt2)
  {
    this.mMainHandler.post(new Runnable()
    {
      public void run()
      {
        if (TXCLivePusher.this.mVideoView != null) {
          TXCLivePusher.this.mVideoView.getHolder().setFixedSize(paramInt1, paramInt2);
        }
      }
    });
  }
  
  private void startEncoder(int paramInt1, int paramInt2, int paramInt3)
  {
    label366:
    for (;;)
    {
      try
      {
        TXCLog.d(TAG, "New encode size width = " + paramInt1 + " height = " + paramInt2 + " encType = " + paramInt3);
        stopEncoder(this.mVideoEncoder);
        this.mVideoEncoder = null;
        this.mVideoEncoderParam = null;
        this.mVideoWidth = paramInt1;
        this.mVideoHeight = paramInt2;
        this.mEncoderType = paramInt3;
        this.mVideoEncoder = new TXCVideoEncoder(this.mEncoderType);
        Object localObject3;
        if ((!this.mBackgoundPusher.hasNAL()) || (this.mVideoHeight != paramInt2) || (this.mVideoWidth != paramInt1))
        {
          localObject3 = this.mBackgoundPusher;
          if (this.mVideoSrc == 0)
          {
            localObject1 = this.mVideoView.getGLContext();
            ((TXCBackgroundPusher)localObject3).generateNAL((EGLContext)localObject1, this.mContext, this.mConfig.pauseImg, paramInt1, paramInt2);
          }
        }
        else
        {
          this.mVideoEncoderParam = new TXSVideoEncoderParam();
          this.mVideoEncoderParam.width = paramInt1;
          this.mVideoEncoderParam.height = paramInt2;
          this.mVideoEncoderParam.fps = this.mConfig.fps;
          this.mVideoEncoderParam.gop = this.mConfig.gop;
          localObject1 = this.mVideoEncoderParam;
          if (this.mConfig.enableMainProfile != true) {
            break label366;
          }
          paramInt1 = 3;
          ((TXSVideoEncoderParam)localObject1).encoderProfile = paramInt1;
          this.mVideoEncoderParam.encoderMode = 1;
          localObject3 = this.mVideoEncoderParam;
          if (this.mVideoSrc != 0) {
            continue;
          }
          localObject1 = this.mVideoView.getGLContext();
          ((TXSVideoEncoderParam)localObject3).glContext = ((EGLContext)localObject1);
          this.mVideoEncoder.setListener(this);
          this.mVideoEncoder.setEventNotifyListener(this);
          this.mVideoEncoder.start(this.mVideoEncoderParam);
          this.mVideoEncoder.setBitrate(this.mConfig.bitRate);
          if (this.mPushStats != null) {
            this.mPushStats.setEncoder(this.mVideoEncoder);
          }
          return;
        }
        Object localObject1 = this.mScreenEGLContext;
        continue;
        localObject1 = this.mScreenEGLContext;
        continue;
        paramInt1 = 1;
      }
      finally {}
    }
  }
  
  private void stopEncoder(final TXCVideoEncoder paramTXCVideoEncoder)
  {
    if ((this.mVideoSrc == 0) && (this.mVideoView != null)) {
      this.mVideoView.runOnDraw(new Runnable()
      {
        public void run()
        {
          try
          {
            if (paramTXCVideoEncoder != null)
            {
              paramTXCVideoEncoder.stop();
              paramTXCVideoEncoder.setListener(null);
            }
            return;
          }
          catch (Exception localException) {}
        }
      });
    }
    if ((this.mVideoSrc == 1) && (this.mScreenCapture != null)) {
      this.mScreenCapture.post(new Runnable()
      {
        public void run()
        {
          try
          {
            if (paramTXCVideoEncoder != null)
            {
              paramTXCVideoEncoder.stop();
              paramTXCVideoEncoder.setListener(null);
            }
            return;
          }
          catch (Exception localException) {}
        }
      });
    }
  }
  
  private void updateRenderSize()
  {
    if ((this.mVideoView != null) && (this.mEnableEnergySavingMode))
    {
      if ((this.mCameraCapturer.getAngle() != 90) && (this.mCameraCapturer.getAngle() != 270)) {
        break label66;
      }
      this.mViewRenderWidth = 720;
    }
    for (this.mViewRenderHeight = 1280;; this.mViewRenderHeight = 720)
    {
      setViewSize(this.mViewRenderWidth, this.mViewRenderHeight);
      return;
      label66:
      this.mViewRenderWidth = 1280;
    }
  }
  
  public void didDetectFacePoints(float[] paramArrayOfFloat)
  {
    if (this.mPreprocessListener != null)
    {
      TXICustomPreprocessListenner localTXICustomPreprocessListenner = (TXICustomPreprocessListenner)this.mPreprocessListener.get();
      if (localTXICustomPreprocessListenner != null) {
        localTXICustomPreprocessListenner.onDetectFacePoints(paramArrayOfFloat);
      }
    }
  }
  
  public void didProcessFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    encodeFrame(paramInt1, paramInt2, paramInt3);
  }
  
  public void didProcessFrame(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
  
  public void enableTextureSharp(boolean paramBoolean)
  {
    this.mEnableTextureSharp = paramBoolean;
    if ((this.mCameraVideoPreprocessor != null) && (this.mEnableTextureSharp))
    {
      this.mCameraVideoPreprocessor.setSharnessLevel(9);
      return;
    }
    this.mCameraVideoPreprocessor.setSharnessLevel(0);
  }
  
  public void freshCamera()
  {
    if ((this.mCapturing) && (this.mCameraCapturer != null) && (this.mVideoView != null))
    {
      this.mCameraCapturer.stopCapture();
      this.mVideoView.invalidSurfaceTexture(false);
      this.mCameraCapturer.setResolution(freshCameraResolution());
      this.mCameraCapturer.setup(this.mVideoView.getSurfaceTexture());
      if (this.mCameraCapturer.startCapture() != 0) {
        break label98;
      }
      this.mCapturing = true;
      updateRenderSize();
      onNotifyEvent(1003, "打开摄像头成功");
    }
    for (;;)
    {
      this.mVideoView.start();
      return;
      label98:
      this.mCapturing = false;
      onNotifyEvent(64235, "打开摄像头失败，请确认摄像头权限是否打开");
    }
  }
  
  public TXCLivePushConfig getConfig()
  {
    return this.mConfig;
  }
  
  public int getMaxZoom()
  {
    if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null)) {
      return this.mCameraCapturer.getMaxZoom();
    }
    return 0;
  }
  
  public int getMusicDuration(String paramString)
  {
    return TXCMixPlayer.getInstance().getMusicDuration(paramString);
  }
  
  public boolean isPushing()
  {
    return this.mPushing;
  }
  
  public void onEnableDropStatusChanged(boolean paramBoolean)
  {
    if (this.mStreamUploader != null) {
      this.mStreamUploader.setDropEanble(paramBoolean);
    }
  }
  
  public void onEncodeFormat(MediaFormat paramMediaFormat) {}
  
  public void onEncodeNAL(TXSNALPacket paramTXSNALPacket, int paramInt)
  {
    if (paramInt == 0)
    {
      if (this.mQos != null) {
        this.mQos.setHasVideo(true);
      }
      if ((!this.mPausing) && (this.mStreamUploader != null)) {
        this.mStreamUploader.pushNAL(paramTXSNALPacket);
      }
    }
    while ((paramInt != 10000004) || (this.mEncoderType != 1)) {
      return;
    }
    this.mConfig.videoEncType = 0;
    onNotifyEvent(1103, "硬编码启动失败,采用软编码");
  }
  
  public void onEncoderParamsChanged(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((this.mCameraCapturer == null) || ((this.mCameraCapturer.getAngle() != 90) && (this.mCameraCapturer.getAngle() != 270))) {
        break label222;
      }
      this.mConfig.width = paramInt3;
    }
    for (this.mConfig.height = paramInt2;; this.mConfig.height = paramInt3)
    {
      if ((this.mCameraVideoPreprocessor != null) && (this.mCameraCapturer != null))
      {
        this.mCameraVideoPreprocessor.setOutputFrameSize(paramInt2, paramInt3);
        if (this.mCameraCapturer != null) {
          this.mCameraVideoPreprocessor.setRotate(this.mCameraCapturer.getAngle());
        }
      }
      if (this.mScreenVideoPreprocessor != null) {
        this.mScreenVideoPreprocessor.setOutputFrameSize(paramInt2, paramInt3);
      }
      if ((paramInt1 != 0) && (this.mVideoEncoder != null))
      {
        this.mConfig.bitRate = paramInt1;
        this.mVideoEncoder.setBitrate(paramInt1);
        TXCDRApi.reportEvent40003(this.mPushUrl, TXCDRDef.PEE_QOS_RESULT, "Qos Result", "mode:" + this.mConfig.autoAdjustStrategy + " bitrate:" + paramInt1 + " videosize:" + this.mConfig.width + " * " + this.mConfig.height);
      }
      return;
      label222:
      this.mConfig.width = paramInt2;
    }
  }
  
  public int onGetEncoderRealBitrate()
  {
    if (this.mVideoEncoder != null) {
      return (int)this.mVideoEncoder.getRealBitrate();
    }
    return 0;
  }
  
  public int onGetQueueInputSize()
  {
    int i = 0;
    if (this.mNetworkStats != null)
    {
      this.mConfig.realTimeMode = true;
      i = this.mNetworkStats.getInt("AUDIO_BITRATE") + this.mNetworkStats.getInt("qos_video_bitrate");
    }
    return i;
  }
  
  public int onGetQueueOutputSize()
  {
    int i = 0;
    if (this.mNetworkStats != null) {
      i = this.mNetworkStats.getInt("NET_SPEED");
    }
    return i;
  }
  
  public int onGetVideoDropCount()
  {
    int i = 0;
    if (this.mNetworkStats != null) {
      i = this.mNetworkStats.getInt("DROP_SIZE");
    }
    return i;
  }
  
  public int onGetVideoQueueCurrentCount()
  {
    int i = 0;
    if (this.mNetworkStats != null) {
      i = this.mNetworkStats.getInt("CACHE_SIZE");
    }
    return i;
  }
  
  public int onGetVideoQueueMaxCount()
  {
    return 5;
  }
  
  public void onNotifyEvent(final int paramInt, final Bundle paramBundle)
  {
    if (paramInt == 15002) {
      this.mNetworkStats = paramBundle;
    }
    if (paramInt == 1107)
    {
      if (this.mConfig == null) {
        break label104;
      }
      TXCDRApi.reportEvent40003(this.mPushUrl, TXCDRDef.PEE_VIDEO_ENCODE_SW_TO_HW, "video encode switch from soft to hard", "current videosize:" + this.mConfig.width + " * " + this.mConfig.height);
    }
    for (;;)
    {
      if (this.mMainHandler != null) {
        this.mMainHandler.post(new Runnable()
        {
          public void run()
          {
            TXCSystemUtil.notifyEvent(TXCLivePusher.this.mNotifyListener, paramInt, paramBundle);
          }
        });
      }
      return;
      label104:
      TXCDRApi.reportEvent40003(this.mPushUrl, TXCDRDef.PEE_VIDEO_ENCODE_SW_TO_HW, "video encode switch from soft to hard", "");
    }
  }
  
  public void onNotifyEvent(final int paramInt, final String paramString)
  {
    if (this.mMainHandler != null) {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          TXCSystemUtil.notifyEvent(TXCLivePusher.this.mNotifyListener, paramInt, paramString);
        }
      });
    }
  }
  
  public void onPushNal(TXSNALPacket paramTXSNALPacket)
  {
    if (!this.mPausing) {}
    while (this.mStreamUploader == null) {
      return;
    }
    paramTXSNALPacket.dts = TXCTimeUtil.getTimeTick();
    paramTXSNALPacket.pts = TXCTimeUtil.getTimeTick();
    this.mStreamUploader.pushNAL(paramTXSNALPacket);
  }
  
  public void onRecordEncData(byte[] paramArrayOfByte, long paramLong)
  {
    if (this.mStreamUploader != null) {
      this.mStreamUploader.pushAAC(paramArrayOfByte, paramLong);
    }
  }
  
  public void onRecordError(int paramInt, String paramString)
  {
    TXCLog.e(TAG, "onRecordError code = " + paramInt + ":" + paramString);
    if (paramInt == TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT) {
      onNotifyEvent(64234, "打开麦克风失败");
    }
  }
  
  public void onRecordPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void onRecordSpeedPcmData(byte[] paramArrayOfByte, long paramLong) {}
  
  public void onReleaseEncoder(final TXCVideoEncoder paramTXCVideoEncoder)
  {
    if (this.mVideoView != null) {
      this.mVideoView.runOnDraw(new Runnable()
      {
        public void run()
        {
          if (paramTXCVideoEncoder != null) {
            paramTXCVideoEncoder.stop();
          }
        }
      });
    }
  }
  
  public void onScreenCaptureDestory(Object paramObject)
  {
    try
    {
      try
      {
        if ((paramObject instanceof TXCVideoEncoder))
        {
          ((TXCVideoEncoder)paramObject).stop();
          ((TXCVideoEncoder)paramObject).setListener(null);
        }
        this.mScreenVideoPreprocessor.release();
        return;
      }
      finally {}
      return;
    }
    catch (Exception paramObject) {}
  }
  
  public void onScreenCaptureFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    int i = 720;
    if (paramInt1 == 0)
    {
      boolean bool = freshScreenCaptureResolution();
      this.mScreenVideoPreprocessor.setOutputFrameSize(this.mConfig.width, this.mConfig.height);
      this.mScreenVideoPreprocessor.setRotate(0);
      this.mScreenVideoPreprocessor.setMirror(false);
      if ((this.mLastVideoEncodeHeigth != this.mConfig.height) || (this.mLastVideoEncodeWidth != this.mConfig.width))
      {
        this.mLastVideoEncodeHeigth = this.mConfig.height;
        this.mLastVideoEncodeWidth = this.mConfig.width;
        onVideoEncodeSizeChanged();
      }
      this.mLastVideoEncodeHeigth = paramInt4;
      this.mLastVideoEncodeWidth = paramInt3;
      TXCVideoPreprocessor localTXCVideoPreprocessor = this.mScreenVideoPreprocessor;
      if (bool)
      {
        paramInt1 = 1280;
        if (!bool) {
          break label177;
        }
      }
      label177:
      for (paramInt3 = i;; paramInt3 = 1280)
      {
        encodeFrame(localTXCVideoPreprocessor.processFrame(paramInt2, paramInt1, paramInt3, 0, 0, 0), this.mConfig.width, this.mConfig.height);
        return;
        paramInt1 = 720;
        break;
      }
    }
    TXCLog.e(TAG, "onScreenCaptureFrame failed");
  }
  
  public void onStartResult(int paramInt, EGLContext paramEGLContext)
  {
    if (paramInt == 0)
    {
      this.mScreenEGLContext = paramEGLContext;
      return;
    }
    this.mScreenEGLContext = null;
    TXCLog.e(TAG, "Start screen capture failed");
  }
  
  public void onSurfaceTextureAvailable(final SurfaceTexture paramSurfaceTexture)
  {
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        TXCLivePusher.this.startCapture(paramSurfaceTexture);
      }
    });
  }
  
  public void onSurfaceTextureDestroy(SurfaceTexture paramSurfaceTexture)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.release();
    }
    if (this.mPreprocessListener != null)
    {
      paramSurfaceTexture = (TXICustomPreprocessListenner)this.mPreprocessListener.get();
      if (paramSurfaceTexture != null) {
        paramSurfaceTexture.onTextureDestoryed();
      }
    }
  }
  
  public int onTextureProcess(int paramInt, float[] paramArrayOfFloat)
  {
    int j;
    int i;
    Object localObject;
    boolean bool;
    if ((this.mCameraVideoPreprocessor != null) && (!this.mConfig.pureAudioPush) && (this.mCameraCapturer != null))
    {
      j = this.mConfig.width;
      i = this.mConfig.height;
      if ((this.mCameraCapturer.getAngle() == 90) || (this.mCameraCapturer.getAngle() == 270))
      {
        j = this.mConfig.height;
        i = this.mConfig.width;
      }
      if ((this.mLastVideoEncodeHeigth != i) || (this.mLastVideoEncodeWidth != j))
      {
        this.mLastVideoEncodeHeigth = i;
        this.mLastVideoEncodeWidth = j;
        onVideoEncodeSizeChanged();
      }
      this.mLastVideoEncodeHeigth = i;
      this.mLastVideoEncodeWidth = j;
      if (this.mCameraVideoPreprocessor != null)
      {
        localObject = TXCSystemUtil.cropTexture(this.mCameraCapturer.getPreviewWidth(), this.mCameraCapturer.getPreviewHeight(), this.mConfig.width, this.mConfig.height);
        this.mCameraVideoPreprocessor.setCrop((CropRect)localObject);
      }
      localObject = this.mCameraVideoPreprocessor;
      if (!this.mCameraCapturer.getIsFrontCamera()) {
        break label285;
      }
      if (this.mMirror) {
        break label279;
      }
      bool = true;
    }
    for (;;)
    {
      ((TXCVideoPreprocessor)localObject).setMirror(bool);
      this.mCameraVideoPreprocessor.setOutputFrameSize(j, i);
      this.mCameraVideoPreprocessor.setRotate(this.mCameraCapturer.getAngle());
      this.mCameraVideoPreprocessor.setInputMatrix(paramArrayOfFloat);
      this.mInputFormat = 4;
      this.mCameraVideoPreprocessor.processFrame(paramInt, this.mCameraCapturer.getPreviewWidth(), this.mCameraCapturer.getPreviewHeight(), this.mCameraCapturer.getAngle(), 4, 0);
      return 0;
      label279:
      bool = false;
      continue;
      label285:
      bool = this.mMirror;
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null)) {
      this.mCameraCapturer.setFocusPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY(), paramView, this.mLastVideoEncodeWidth, this.mLastVideoEncodeHeigth);
    }
    if ((this.mVideoSrc == 0) && (this.mContainerView != null) && (this.mConfig.touchFoucus)) {
      this.mContainerView.onTouchFocus((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    return false;
  }
  
  public void onVideoEncodeSizeChanged()
  {
    float f3 = 0.0F;
    Object localObject1;
    Object localObject2;
    float f2;
    if (this.mConfig.watermarkWidth != -1.0F)
    {
      if (this.mCameraVideoPreprocessor != null) {
        this.mCameraVideoPreprocessor.setWaterMark(this.mConfig.watermark, this.mConfig.watermarkXF, this.mConfig.watermarkYF, this.mConfig.watermarkWidth);
      }
      if (this.mScreenVideoPreprocessor != null)
      {
        localObject1 = this.mScreenVideoPreprocessor;
        localObject2 = this.mConfig.watermark;
        f3 = this.mConfig.watermarkXF;
        f2 = this.mConfig.watermarkYF;
        f1 = this.mConfig.watermarkWidth;
        ((TXCVideoPreprocessor)localObject1).setWaterMark((Bitmap)localObject2, f3, f2, f1);
      }
      label114:
      return;
    }
    float f4;
    if (this.mCameraVideoPreprocessor != null)
    {
      localObject1 = this.mCameraVideoPreprocessor;
      localObject2 = this.mConfig.watermark;
      f2 = this.mConfig.watermarkX / this.mLastVideoEncodeWidth;
      f4 = this.mConfig.watermarkY / this.mLastVideoEncodeHeigth;
      if (this.mConfig.watermark != null) {
        break label306;
      }
    }
    label306:
    for (float f1 = 0.0F;; f1 = this.mConfig.watermark.getWidth() / this.mLastVideoEncodeWidth)
    {
      ((TXCVideoPreprocessor)localObject1).setWaterMark((Bitmap)localObject2, f2, f4, f1);
      if (this.mScreenVideoPreprocessor == null) {
        break label114;
      }
      TXCVideoPreprocessor localTXCVideoPreprocessor = this.mScreenVideoPreprocessor;
      Bitmap localBitmap = this.mConfig.watermark;
      f4 = this.mConfig.watermarkX / this.mLastVideoEncodeWidth;
      float f5 = this.mConfig.watermarkY / this.mLastVideoEncodeHeigth;
      f2 = f5;
      f1 = f3;
      f3 = f4;
      localObject2 = localBitmap;
      localObject1 = localTXCVideoPreprocessor;
      if (this.mConfig.watermark == null) {
        break;
      }
      f1 = this.mConfig.watermark.getWidth() / this.mLastVideoEncodeWidth;
      f2 = f5;
      f3 = f4;
      localObject2 = localBitmap;
      localObject1 = localTXCVideoPreprocessor;
      break;
    }
  }
  
  public boolean pauseBGM()
  {
    return TXCMixPlayer.getInstance().pauseBGM();
  }
  
  public void pausePusher()
  {
    if (!isPushing()) {
      TXCLog.w(TAG, "ignore pause push when is not pushing");
    }
    for (;;)
    {
      return;
      this.mPausing = true;
      TXCLog.d(TAG, "bkgpush pause");
      if ((this.mConfig.pauseFlag & 0x1) == 1)
      {
        if (this.mVideoView != null) {
          this.mVideoView.enableBackgroundRun(false);
        }
        if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null))
        {
          this.mCameraCapturer.stopCapture();
          this.mCapturing = false;
        }
      }
      try
      {
        stopEncoder(this.mVideoEncoder);
        this.mVideoEncoder = null;
        if ((this.mVideoSrc == 1) && (this.mScreenCapture != null)) {
          this.mScreenCapture.enable(false);
        }
        if ((this.mBackgoundPusher != null) && (!this.mConfig.pureAudioPush)) {
          this.mBackgoundPusher.start(this.mConfig.pauseFps, this.mConfig.pauseTime);
        }
        if ((this.mConfig.pauseFlag & 0x2) != 2) {
          continue;
        }
        TXCAudioRecorder.getInstance().setMute(true);
        return;
      }
      finally {}
    }
  }
  
  public boolean playBGM(String paramString)
  {
    TXCDRApi.txReportDAU(this.mContext, TXCDRDef.DR_DAU_EVENT_ID_BGM);
    return TXCMixPlayer.getInstance().playBGM(paramString);
  }
  
  public boolean resumeBGM()
  {
    return TXCMixPlayer.getInstance().resumeBGM();
  }
  
  public void resumePusher()
  {
    if (!isPushing()) {
      TXCLog.w(TAG, "ignore resume push when is not pushing");
    }
    do
    {
      return;
      this.mPausing = false;
      TXCLog.d(TAG, "bkgpush resume");
      if ((this.mConfig.pauseFlag & 0x1) == 1)
      {
        if ((this.mBackgoundPusher != null) && (!this.mConfig.pureAudioPush)) {
          this.mBackgoundPusher.stop();
        }
        if ((this.mVideoSrc == 0) && (this.mVideoView != null)) {
          startCapture(this.mVideoView.getSurfaceTexture());
        }
        if ((this.mVideoSrc == 1) && (this.mScreenCapture != null)) {
          this.mScreenCapture.enable(true);
        }
        if (this.mVideoView != null) {
          this.mVideoView.enableBackgroundRun(true);
        }
      }
    } while ((this.mConfig.pauseFlag & 0x2) != 2);
    TXCAudioRecorder.getInstance().setMute(this.mMute);
  }
  
  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    TXCAudioRecorder.getInstance().sendCustomPCMData(paramArrayOfByte);
  }
  
  public void setBGMNotify(TXIMixPlayListener paramTXIMixPlayListener)
  {
    TXCMixPlayer.getInstance().setBGMNofify(paramTXIMixPlayListener);
  }
  
  public void setBGMNotify(TXLivePusher.OnBGMNotify paramOnBGMNotify)
  {
    if (paramOnBGMNotify == null)
    {
      this.mOldBGMNotifyProxy = null;
      this.mOldBGMNotify = null;
      TXCMixPlayer.getInstance().setBGMNofify(null);
      return;
    }
    this.mOldBGMNotify = paramOnBGMNotify;
    if (this.mOldBGMNotifyProxy == null) {
      this.mOldBGMNotifyProxy = new TXIMixPlayListener()
      {
        public void onMixPcmData(byte[] paramAnonymousArrayOfByte) {}
        
        public void onMixPlayBegin()
        {
          if (TXCLivePusher.this.mOldBGMNotify != null) {
            TXCLivePusher.this.mOldBGMNotify.onBGMStart();
          }
        }
        
        public void onMixPlayComplete(int paramAnonymousInt)
        {
          if (TXCLivePusher.this.mOldBGMNotify != null) {
            TXCLivePusher.this.mOldBGMNotify.onBGMComplete(paramAnonymousInt);
          }
        }
        
        public void onMixPlayProgress(long paramAnonymousLong1, long paramAnonymousLong2)
        {
          if (TXCLivePusher.this.mOldBGMNotify != null) {
            TXCLivePusher.this.mOldBGMNotify.onBGMProgress(paramAnonymousLong1, paramAnonymousLong2);
          }
        }
        
        public void onPCMData(byte[] paramAnonymousArrayOfByte) {}
      };
    }
    TXCMixPlayer.getInstance().setBGMNofify(this.mOldBGMNotifyProxy);
  }
  
  public boolean setBGMVolume(float paramFloat)
  {
    return TXCMixPlayer.getInstance().setBGMVolume(paramFloat);
  }
  
  public boolean setBeautyFilter(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mCameraVideoPreprocessor != null)
    {
      this.mCameraVideoPreprocessor.setBeautyLevel(paramInt1);
      this.mCameraVideoPreprocessor.setWhitenessLevel(paramInt2);
      this.mCameraVideoPreprocessor.setRuddyLevel(paramInt3);
    }
    return true;
  }
  
  public void setBeautyStyle(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setBeautyStyle(paramInt);
    }
  }
  
  public void setChinLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setChinLevel(paramInt);
    }
  }
  
  public void setConfig(TXCLivePushConfig paramTXCLivePushConfig)
  {
    boolean bool = false;
    int i;
    if ((this.mConfig != null) && (paramTXCLivePushConfig != null)) {
      if (this.mConfig.resolution != paramTXCLivePushConfig.resolution) {
        i = 1;
      }
    }
    for (;;)
    {
      if (paramTXCLivePushConfig != null)
      {
        this.mConfig = paramTXCLivePushConfig;
        label38:
        this.mMirror = this.mConfig.mirror;
        if ((!this.mCapturing) || (i == 0) || (this.mConfig.enableHighCapture) || (this.mVideoSrc != 0) || (this.mVideoView == null)) {
          break label478;
        }
        this.mVideoView.runOnDraw(new Runnable()
        {
          public void run()
          {
            TXCLivePusher.this.mConfig.updateResolution();
            TXCLivePusher.this.freshCamera();
          }
        });
        label99:
        if (this.mPushing)
        {
          if ((this.mConfig.customModeType & 0x1) == 0) {
            break label488;
          }
          TXCAudioRecorder.getInstance().setIsCustomRecord(true);
          TXCAudioRecorder.getInstance().setChannelsPerSample(this.mConfig.audioChannels);
          TXCAudioRecorder.getInstance().setSampleRate(this.mConfig.audioSample);
          label151:
          paramTXCLivePushConfig = TXCAudioRecorder.getInstance();
          if (!this.mConfig.enableAec) {
            break label598;
          }
          if (!TXCConfigCenter.getInstance().getSysAecEnable(1)) {
            break label591;
          }
          i = TXEAudioDef.TXE_AEC_SYSTEM;
          label179:
          paramTXCLivePushConfig.setAECType(i, this.mContext);
          if (this.mStreamUploader != null)
          {
            if (!this.mConfig.realTimeMode) {
              break label605;
            }
            this.mStreamUploader.setRetryInterval(1);
            this.mStreamUploader.setRetryTimes(5);
            this.mStreamUploader.setVideoDropParams(false, this.mConfig.fps, 1000);
          }
          label239:
          if (this.mCameraVideoPreprocessor != null)
          {
            if (true != this.mConfig.realTimeMode) {
              break label649;
            }
            this.mCameraVideoPreprocessor.setSharnessLevel(0);
          }
        }
      }
      for (;;)
      {
        if (this.mQos != null)
        {
          this.mQos.setAutoAdjustBitrate(this.mConfig.autoAdjustBitrate);
          this.mQos.setAutoAdjustStrategy(this.mConfig.autoAdjustStrategy);
          paramTXCLivePushConfig = this.mQos;
          i = this.mConfig.resolution;
          if ((this.mConfig.homeOrientation == 0) || (this.mConfig.homeOrientation == 2)) {
            bool = true;
          }
          paramTXCLivePushConfig.setDefaultVideoResolution(i, bool);
          this.mQos.setVideoEncBitrate(this.mConfig.minBitrate, this.mConfig.maxBitrate, this.mConfig.bitRate);
          this.mQos.stop();
          if (this.mConfig.autoAdjustBitrate) {
            this.mQos.start(2000L);
          }
        }
        if (this.mConfig.pauseImg != null) {
          this.mMainHandler.postDelayed(new Runnable()
          {
            public void run()
            {
              if (TXCLivePusher.this.mVideoView != null) {
                TXCLivePusher.this.mVideoView.runOnDraw(new Runnable()
                {
                  public void run()
                  {
                    try
                    {
                      if ((TXCLivePusher.this.mBackgoundPusher != null) && (TXCLivePusher.this.mVideoView != null) && (TXCLivePusher.this.mContext != null))
                      {
                        TXCBackgroundPusher localTXCBackgroundPusher = TXCLivePusher.this.mBackgoundPusher;
                        if (TXCLivePusher.this.mVideoSrc == 0) {}
                        for (EGLContext localEGLContext = TXCLivePusher.this.mVideoView.getGLContext();; localEGLContext = TXCLivePusher.this.mScreenEGLContext)
                        {
                          localTXCBackgroundPusher.generateNAL(localEGLContext, TXCLivePusher.this.mContext, TXCLivePusher.this.mConfig.pauseImg, TXCLivePusher.this.mVideoWidth, TXCLivePusher.this.mVideoHeight);
                          return;
                        }
                      }
                      return;
                    }
                    catch (Exception localException) {}
                  }
                });
              }
            }
          }, 1000L);
        }
        if ((this.mConfig.watermark != null) && (this.mVideoView != null)) {
          this.mVideoView.runOnDraw(new Runnable()
          {
            public void run()
            {
              try
              {
                TXCLivePusher.this.onVideoEncodeSizeChanged();
                return;
              }
              catch (Exception localException) {}
            }
          });
        }
        return;
        i = 0;
        break;
        this.mConfig = new TXCLivePushConfig();
        break label38;
        label478:
        this.mConfig.updateResolution();
        break label99;
        label488:
        if ((this.mConfig.enableAec) && (TXCConfigCenter.getInstance().getSysAecEnable(1)))
        {
          i = TXCConfigCenter.getInstance().getMaxRecordSampleRate();
          if (i > 0) {}
          for (;;)
          {
            TXCAudioRecorder.getInstance().setSampleRate(i);
            TXCAudioRecorder.getInstance().setResampleRate(this.mConfig.audioSample);
            TXCAudioRecorder.getInstance().enableAgc(TXCConfigCenter.getInstance().getAGCEnable());
            TXCAudioRecorder.getInstance().setChannelsPerSample(1);
            break;
            i = 16000;
          }
        }
        TXCAudioRecorder.getInstance().setChannelsPerSample(1);
        TXCAudioRecorder.getInstance().setSampleRate(this.mConfig.audioSample);
        break label151;
        label591:
        i = TXEAudioDef.TXE_AEC_TRAE;
        break label179;
        label598:
        i = TXEAudioDef.TXE_AEC_NONE;
        break label179;
        label605:
        this.mStreamUploader.setRetryInterval(this.mConfig.connectRetryInterval);
        this.mStreamUploader.setRetryTimes(this.mConfig.connectRetryCount);
        this.mStreamUploader.setVideoDropParams(true, 40, 3000);
        break label239;
        label649:
        this.mCameraVideoPreprocessor.setSharnessLevel(3);
      }
      i = 0;
    }
  }
  
  public void setCustomPreprocessListenner(TXICustomPreprocessListenner paramTXICustomPreprocessListenner)
  {
    this.mPreprocessListener = new WeakReference(paramTXICustomPreprocessListenner);
  }
  
  public void setExposureCompensation(float paramFloat)
  {
    if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null)) {
      this.mCameraCapturer.setExposureCompensation(paramFloat);
    }
  }
  
  public void setEyeScaleLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setEyeScaleLevel(paramInt);
    }
  }
  
  public void setFaceShortLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setFaceShortLevel(paramInt);
    }
  }
  
  public void setFaceSlimLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setFaceSlimLevel(paramInt);
    }
  }
  
  public void setFaceVLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setFaceVLevel(paramInt);
    }
  }
  
  public void setFilter(Bitmap paramBitmap)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setFilterImage(paramBitmap);
    }
  }
  
  public void setFilterMixLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setFilterMixLevel(paramInt);
    }
  }
  
  @TargetApi(18)
  public boolean setGreenScreenFile(String paramString)
  {
    if (this.mCameraVideoPreprocessor != null) {
      return this.mCameraVideoPreprocessor.setGreenScreenFile(paramString, true);
    }
    return false;
  }
  
  public boolean setMicVolume(float paramFloat)
  {
    return TXCMixPlayer.getInstance().setMicVolume(paramFloat);
  }
  
  public boolean setMirror(boolean paramBoolean)
  {
    boolean bool = false;
    this.mMirror = paramBoolean;
    TXCVideoPreprocessor localTXCVideoPreprocessor;
    if ((this.mCameraVideoPreprocessor != null) && (this.mCameraCapturer != null))
    {
      localTXCVideoPreprocessor = this.mCameraVideoPreprocessor;
      if (!this.mCameraCapturer.getIsFrontCamera()) {
        break label102;
      }
      if (!this.mMirror)
      {
        paramBoolean = true;
        localTXCVideoPreprocessor.setMirror(paramBoolean);
      }
    }
    else if ((this.mScreenVideoPreprocessor != null) && (this.mCameraCapturer != null))
    {
      localTXCVideoPreprocessor = this.mScreenVideoPreprocessor;
      if (!this.mCameraCapturer.getIsFrontCamera()) {
        break label110;
      }
      paramBoolean = bool;
      if (this.mMirror) {}
    }
    label102:
    label110:
    for (paramBoolean = true;; paramBoolean = this.mMirror)
    {
      localTXCVideoPreprocessor.setMirror(paramBoolean);
      return true;
      paramBoolean = false;
      break;
      paramBoolean = this.mMirror;
      break;
    }
  }
  
  public void setMotionTmpl(String paramString)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setMotionTmpl(paramString);
    }
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mMute = paramBoolean;
    TXCAudioRecorder.getInstance().setMute(paramBoolean);
  }
  
  public void setNoseSlimLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setNoseSlimLevel(paramInt);
    }
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifyListener = new WeakReference(paramTXINotifyListener);
  }
  
  public void setRenderRotation(int paramInt)
  {
    this.mOrientaion = paramInt;
  }
  
  public void setReverb(int paramInt)
  {
    TXCAudioRecorder.getInstance().setReverbType(paramInt);
    TXCDRApi.txReportDAU(this.mContext, TXCDRDef.DR_DAU_EVENT_ID_REVERB);
  }
  
  public void setSharpenLevel(int paramInt)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setSharnessLevel(paramInt);
    }
  }
  
  public void setSpecialRatio(float paramFloat)
  {
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setFilterMixLevel(paramFloat);
    }
  }
  
  public boolean setZoom(int paramInt)
  {
    if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null)) {
      return this.mCameraCapturer.setZoom(paramInt);
    }
    return false;
  }
  
  public void startCameraPreview(TXCloudVideoView paramTXCloudVideoView)
  {
    if (this.mConfig.pureAudioPush)
    {
      TXCLog.e(TAG, "enable pure audio push , so can not start preview!");
      return;
    }
    if (this.mMainHandler != null) {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCLivePusher.this.mVideoView != null) {
            TXCLivePusher.this.mVideoView.setVisibility(0);
          }
        }
      });
    }
    if (this.mConfig.frontCamera) {}
    for (int i = 1;; i = 2)
    {
      this.mCameraType = i;
      initCameraCaptureModule();
      TXCGLSurfaceView localTXCGLSurfaceView2 = paramTXCloudVideoView.getGLSurfaceView();
      TXCGLSurfaceView localTXCGLSurfaceView1 = localTXCGLSurfaceView2;
      if (localTXCGLSurfaceView2 == null)
      {
        localTXCGLSurfaceView1 = new TXCGLSurfaceView(paramTXCloudVideoView.getContext());
        paramTXCloudVideoView.addVideoView(localTXCGLSurfaceView1);
      }
      this.mVideoView = localTXCGLSurfaceView1;
      this.mContainerView = paramTXCloudVideoView;
      this.mVideoView.setListener(this);
      startCapture(this.mVideoView.getSurfaceTexture());
      if (this.mConfig.touchFoucus) {
        paramTXCloudVideoView.setOnTouchListener(this);
      }
      if (this.mCameraVideoPreprocessor != null) {
        this.mCameraVideoPreprocessor.setListener(this);
      }
      if (this.mVideoView == null) {
        break;
      }
      this.mVideoView.enableBackgroundRun(true);
      return;
    }
  }
  
  public void startCapture(SurfaceTexture paramSurfaceTexture)
  {
    if ((paramSurfaceTexture != null) && (!this.mCapturing) && (this.mCameraCapturer != null))
    {
      this.mCameraCapturer.setup(paramSurfaceTexture);
      this.mCameraCapturer.setFPS(this.mConfig.fps);
      this.mCameraCapturer.setCameraType(this.mCameraType);
      this.mCameraCapturer.setHomeOriention(this.mConfig.homeOrientation);
      this.mCameraCapturer.setTouchFocus(this.mConfig.touchFoucus);
      if (this.mCameraCapturer.startCapture() != 0) {
        break label280;
      }
      this.mCapturing = true;
      onNotifyEvent(1003, "打开摄像头成功");
      if (this.mVideoView != null)
      {
        this.mVideoView.setFPS(this.mConfig.fps);
        this.mVideoView.setTextureListener(this);
        this.mVideoView.setNotifyListener(this);
        this.mVideoView.start();
        updateRenderSize();
      }
      if ((this.mDelayRecordAudio) && (!TXCAudioRecorder.getInstance().isRecording()))
      {
        TXCAudioRecorder.getInstance().startRecord(this.mContext);
        this.mDelayRecordAudio = false;
      }
      if (this.mCameraCapturer != null)
      {
        int i = this.mConfig.width;
        int j = this.mConfig.height;
        if ((this.mCameraCapturer.getAngle() == 90) || (this.mCameraCapturer.getAngle() == 270))
        {
          i = this.mConfig.height;
          j = this.mConfig.width;
        }
        this.mCameraCapturer.setFocusPosition(this.mVideoView.getWidth() / 2, this.mVideoView.getHeight() / 2, this.mVideoView, i, j);
      }
    }
    return;
    label280:
    this.mCapturing = false;
    onNotifyEvent(64235, "打开摄像头失败，请确认摄像头权限是否打开");
  }
  
  public int startPush(String paramString)
  {
    if (isPushing())
    {
      TXCLog.w(TAG, "ignore startPush when pushing");
      return -2;
    }
    TXCLog.e(TAG, "================================================================================================================================================");
    TXCLog.e(TAG, "============= startPush pushUrl = " + paramString + "============");
    TXCLog.e(TAG, "================================================================================================================================================");
    TXCDRApi.initCrashReport(this.mContext);
    this.mPushUrl = paramString;
    this.mPushing = true;
    this.mPausing = false;
    TXCLog.d(TAG, "startPusher url " + paramString);
    int i;
    label194:
    label269:
    label432:
    label524:
    boolean bool;
    if ((this.mConfig.customModeType & 0x1) != 0)
    {
      TXCAudioRecorder.getInstance().setIsCustomRecord(true);
      TXCAudioRecorder.getInstance().setChannelsPerSample(this.mConfig.audioChannels);
      TXCAudioRecorder.getInstance().setSampleRate(this.mConfig.audioSample);
      TXCAudioRecorder.setTraeConfig(TXCConfigCenter.getInstance().getTRAEConfig());
      Object localObject = TXCAudioRecorder.getInstance();
      if (!this.mConfig.enableAec) {
        break label920;
      }
      if (!TXCConfigCenter.getInstance().getSysAecEnable(1)) {
        break label913;
      }
      i = TXEAudioDef.TXE_AEC_SYSTEM;
      ((TXCAudioRecorder)localObject).setAECType(i, this.mContext);
      TXCAudioRecorder.getInstance().setMute(this.mMute);
      TXCAudioRecorder.getInstance().setListener(this);
      if (((this.mConfig == null) || (!this.mConfig.pureAudioPush)) && (!this.mCapturing) && (this.mVideoSrc != 1)) {
        break label927;
      }
      this.mDelayRecordAudio = false;
      TXCAudioRecorder.getInstance().startRecord(this.mContext);
      if (this.mVideoEncoder != null)
      {
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
      }
      localObject = new TXSStreamUploaderParam();
      ((TXSStreamUploaderParam)localObject).audioChannels = TXCAudioRecorder.getInstance().getChannelsPerSample();
      ((TXSStreamUploaderParam)localObject).audioSamplerate = TXCAudioRecorder.getInstance().getSampleRate();
      ((TXSStreamUploaderParam)localObject).mode = 0;
      ((TXSStreamUploaderParam)localObject).videoFps = 20;
      ((TXSStreamUploaderParam)localObject).protocol = 0;
      ((TXSStreamUploaderParam)localObject).retryTimes = 3;
      ((TXSStreamUploaderParam)localObject).isWaitIFrame = true;
      ((TXSStreamUploaderParam)localObject).isNearestIp = true;
      ((TXSStreamUploaderParam)localObject).isQuicChannel = false;
      ((TXSStreamUploaderParam)localObject).maxDropVideoCount = 40;
      ((TXSStreamUploaderParam)localObject).maxDropVideoCacheTime = 5000;
      this.mStreamUploader = new TXCStreamUploader(this.mContext, (TXSStreamUploaderParam)localObject);
      if ((this.mConfig.customModeType & 0x1) == 0) {
        break label935;
      }
      if (this.mStreamUploader != null) {
        this.mStreamUploader.setAudioInfo(this.mConfig.audioSample, this.mConfig.audioChannels);
      }
      this.mStreamUploader.setNotifyListener(this);
      this.mStreamUploader.start(paramString, this.mConfig.enableNearestIP, this.mConfig.rtmpChannelType);
      if (this.mConfig.pureAudioPush) {
        this.mStreamUploader.setMode(1);
      }
      if (!this.mConfig.realTimeMode) {
        break label960;
      }
      this.mStreamUploader.setRetryInterval(1);
      this.mStreamUploader.setRetryTimes(5);
      this.mStreamUploader.setVideoDropParams(false, this.mConfig.fps, 1000);
      this.mPushStats = new TXLivePushStatsCollection(this.mContext);
      this.mPushStats.setUploader(this.mStreamUploader);
      this.mPushStats.setListener(this);
      this.mPushStats.setVideoBitrate(this.mConfig.bitRate);
      this.mPushStats.setAudioSamplerate(this.mConfig.audioSample);
      this.mPushStats.setVideoResolution(this.mConfig.width, this.mConfig.height);
      this.mPushStats.setUrl(paramString);
      this.mPushStats.setApplicationContext(this.mContext);
      this.mPushStats.start();
      this.mQos = new TXCQoS(true);
      this.mQos.setListener(this);
      this.mQos.setNotifyListener(this);
      this.mQos.setAutoAdjustBitrate(this.mConfig.autoAdjustBitrate);
      this.mQos.setAutoAdjustStrategy(this.mConfig.autoAdjustStrategy);
      paramString = this.mQos;
      i = this.mConfig.resolution;
      if ((this.mConfig.homeOrientation != 0) && (this.mConfig.homeOrientation != 2)) {
        break label1004;
      }
      bool = true;
      label725:
      paramString.setDefaultVideoResolution(i, bool);
      this.mQos.setVideoEncBitrate(this.mConfig.minBitrate, this.mConfig.maxBitrate, this.mConfig.bitRate);
      if (this.mConfig.autoAdjustBitrate) {
        this.mQos.start(2000L);
      }
      if (true != this.mConfig.realTimeMode) {
        break label1009;
      }
      this.mCameraVideoPreprocessor.setSharnessLevel(0);
    }
    for (;;)
    {
      TXCDRApi.txReportDAU(this.mContext, TXCDRDef.DR_DAU_EVENT_ID_LIVE_PUSH);
      return 0;
      if ((this.mConfig.enableAec) && (TXCConfigCenter.getInstance().getSysAecEnable(1)))
      {
        i = TXCConfigCenter.getInstance().getMaxRecordSampleRate();
        if (i > 0) {}
        for (;;)
        {
          TXCAudioRecorder.getInstance().setSampleRate(i);
          TXCAudioRecorder.getInstance().setResampleRate(this.mConfig.audioSample);
          TXCAudioRecorder.getInstance().enableAgc(TXCConfigCenter.getInstance().getAGCEnable());
          TXCAudioRecorder.getInstance().setChannelsPerSample(1);
          break;
          i = 16000;
        }
      }
      TXCAudioRecorder.getInstance().setChannelsPerSample(1);
      TXCAudioRecorder.getInstance().setSampleRate(this.mConfig.audioSample);
      break;
      label913:
      i = TXEAudioDef.TXE_AEC_TRAE;
      break label194;
      label920:
      i = TXEAudioDef.TXE_AEC_NONE;
      break label194;
      label927:
      this.mDelayRecordAudio = true;
      break label269;
      label935:
      if (this.mStreamUploader == null) {
        break label432;
      }
      this.mStreamUploader.setAudioInfo(this.mConfig.audioSample, 1);
      break label432;
      label960:
      this.mStreamUploader.setRetryInterval(this.mConfig.connectRetryInterval);
      this.mStreamUploader.setRetryTimes(this.mConfig.connectRetryCount);
      this.mStreamUploader.setVideoDropParams(true, 40, 3000);
      break label524;
      label1004:
      bool = false;
      break label725;
      label1009:
      this.mCameraVideoPreprocessor.setSharnessLevel(3);
    }
  }
  
  public void startScreenCapture()
  {
    int j = 720;
    if (Build.VERSION.SDK_INT < 21)
    {
      localObject = new Bundle();
      ((Bundle)localObject).putString("EVT_MSG", "录屏失败,不支持的Android系统版本,需要5.0以上的系统");
      onNotifyEvent(64227, (Bundle)localObject);
      TXLog.e(TAG, "Screen capture need running on Android Lollipop or higher version, current:" + Build.VERSION.SDK_INT);
      return;
    }
    initScreenCaptureModule();
    boolean bool = freshScreenCaptureResolution();
    Object localObject = this.mScreenCapture;
    int i;
    if (bool)
    {
      i = 1280;
      if (!bool) {
        break label135;
      }
    }
    for (;;)
    {
      ((TXCScreenCapture)localObject).start(i, j, this.mConfig.fps);
      this.mScreenCapture.enable(true);
      TXCDRApi.txReportDAU(this.mContext, TXCDRDef.DR_DAU_EVENT_ID_SCREEN_CAPTURE);
      return;
      i = 720;
      break;
      label135:
      j = 1280;
    }
  }
  
  public boolean stopBGM()
  {
    return TXCMixPlayer.getInstance().stopBGM();
  }
  
  public void stopCameraPreview(boolean paramBoolean)
  {
    if (this.mVideoView != null) {
      this.mVideoView.enableBackgroundRun(false);
    }
    if (this.mCameraVideoPreprocessor != null) {
      this.mCameraVideoPreprocessor.setListener(null);
    }
    if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null))
    {
      this.mCameraCapturer.setNotifyListener(null);
      this.mCameraCapturer.stopCapture();
    }
    this.mCapturing = false;
    if ((this.mConfig.touchFoucus) && (this.mVideoView != null)) {
      this.mVideoView.setOnTouchListener(null);
    }
    if ((this.mVideoSrc == 0) && (this.mVideoView != null))
    {
      this.mVideoView.runOnDraw(new Runnable()
      {
        public void run()
        {
          try
          {
            if (TXCLivePusher.this.mCameraVideoPreprocessor != null) {
              TXCLivePusher.this.mCameraVideoPreprocessor.release();
            }
            return;
          }
          catch (Exception localException) {}
        }
      });
      this.mVideoView.invalidSurfaceTextureSynced(paramBoolean);
      if ((paramBoolean) && (this.mMainHandler != null)) {
        this.mMainHandler.post(new Runnable()
        {
          public void run()
          {
            if (TXCLivePusher.this.mVideoView != null) {
              TXCLivePusher.this.mVideoView.setVisibility(8);
            }
          }
        });
      }
    }
  }
  
  public void stopPush()
  {
    if (!isPushing())
    {
      TXCLog.w(TAG, "ignore stopPush when not pushing");
      return;
    }
    this.mDelayRecordAudio = false;
    TXCLog.d(TAG, "stopPusher");
    this.mPushing = false;
    TXCAudioRecorder.getInstance().stopRecord();
    TXCAudioRecorder.getInstance().setListener(null);
    try
    {
      stopEncoder(this.mVideoEncoder);
      this.mVideoEncoder = null;
      if (this.mStreamUploader != null)
      {
        this.mStreamUploader.stop();
        this.mStreamUploader.setNotifyListener(null);
        this.mStreamUploader = null;
      }
      this.mConfig.realTimeMode = false;
      if (this.mQos != null)
      {
        this.mQos.stop();
        this.mQos.setListener(null);
        this.mQos.setNotifyListener(null);
        this.mQos = null;
      }
      if (this.mPushStats != null)
      {
        this.mPushStats.stop();
        this.mPushStats.setListener(null);
        this.mPushStats = null;
      }
      this.mLastVideoEncodeWidth = 0;
      this.mLastVideoEncodeHeigth = 0;
      return;
    }
    finally {}
  }
  
  public void stopScreenCapture()
  {
    if ((this.mVideoSrc == 1) && (this.mScreenCapture != null))
    {
      this.mScreenCapture.stop(this.mVideoEncoder);
      this.mVideoEncoder = null;
      this.mScreenCapture.enable(false);
    }
  }
  
  public void switchCamera()
  {
    if (this.mCameraType == 1) {}
    for (this.mCameraType = 2;; this.mCameraType = 1)
    {
      if ((this.mVideoSrc == 0) && (this.mVideoView != null)) {
        this.mVideoView.runOnDraw(new Runnable()
        {
          public void run()
          {
            if ((TXCLivePusher.this.mCapturing) && (TXCLivePusher.this.mCameraCapturer != null) && (TXCLivePusher.this.mVideoView != null))
            {
              TXCLivePusher.this.mCameraCapturer.stopCapture();
              TXCLivePusher.this.mVideoView.invalidSurfaceTexture(false);
              TXCLivePusher.this.mCameraCapturer.setup(TXCLivePusher.this.mVideoView.getSurfaceTexture());
              TXCLivePusher.this.mCameraCapturer.setCameraType(TXCLivePusher.this.mCameraType);
              if (TXCLivePusher.this.mCameraCapturer.startCapture() != 0) {
                break label132;
              }
              TXCLivePusher.this.mCapturing = true;
              TXCLivePusher.this.onNotifyEvent(1003, "打开摄像头成功");
            }
            for (;;)
            {
              TXCLivePusher.this.mVideoView.start();
              return;
              label132:
              TXCLivePusher.this.mCapturing = false;
              TXCLivePusher.this.onNotifyEvent(64235, "打开摄像头失败，请确认摄像头权限是否打开");
            }
          }
        });
      }
      return;
    }
  }
  
  public boolean turnOnFlashLight(boolean paramBoolean)
  {
    if ((this.mVideoSrc == 0) && (this.mCameraCapturer != null)) {
      this.mCameraCapturer.setFlashEnable(paramBoolean);
    }
    return true;
  }
  
  public int willAddWatermark(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    Object localObject;
    if (this.mPreprocessListener != null)
    {
      localObject = (TXICustomPreprocessListenner)this.mPreprocessListener.get();
      if (localObject != null) {
        paramInt1 = ((TXICustomPreprocessListenner)localObject).onTextureCustomProcess(paramInt1, paramInt2, paramInt3);
      }
    }
    for (;;)
    {
      if ((this.mVideoSrc == 0) && (this.mVideoView != null) && (this.mInputFormat != 2) && (this.mCapturing) && (this.mCameraCapturer != null))
      {
        if (!this.mEnableEnergySavingMode) {
          break label154;
        }
        localObject = this.mVideoView;
        i = this.mViewRenderWidth;
        j = this.mViewRenderHeight;
        if (!this.mCameraCapturer.getIsFrontCamera()) {
          break label145;
        }
        if (this.mMirror) {
          break label139;
        }
      }
      for (;;)
      {
        ((TXCGLSurfaceView)localObject).renderTexture(paramInt1, i, j, bool1, this.mOrientaion, paramInt2, paramInt3);
        return paramInt1;
        label139:
        bool1 = false;
        continue;
        label145:
        bool1 = this.mMirror;
      }
      label154:
      localObject = this.mVideoView;
      int i = this.mVideoView.getWidth();
      int j = this.mVideoView.getHeight();
      if (this.mCameraCapturer.getIsFrontCamera()) {
        if (!this.mMirror) {
          bool1 = bool2;
        }
      }
      for (;;)
      {
        ((TXCGLSurfaceView)localObject).renderTexture(paramInt1, i, j, bool1, this.mOrientaion, paramInt2, paramInt3);
        return paramInt1;
        bool1 = false;
        continue;
        bool1 = this.mMirror;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXCLivePusher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */