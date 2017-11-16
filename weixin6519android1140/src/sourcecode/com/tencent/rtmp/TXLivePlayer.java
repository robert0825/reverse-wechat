package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.TXCPlayerConfig;
import com.tencent.liteav.TXIPlayer;
import com.tencent.liteav.TXPlayerFactory;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;

public class TXLivePlayer
  implements TXINotifyListener
{
  public static final int PLAY_TYPE_LIVE_FLV = 1;
  public static final int PLAY_TYPE_LIVE_RTMP = 0;
  public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
  public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
  public static final int PLAY_TYPE_VOD_FLV = 2;
  public static final int PLAY_TYPE_VOD_HLS = 3;
  public static final int PLAY_TYPE_VOD_MP4 = 4;
  public static final String TAG = "TXLivePlayer";
  private ITXAudioRawDataListener mAudioRawDataListener;
  private boolean mAutoPlay = true;
  private TXLivePlayConfig mConfig;
  private Context mContext;
  private boolean mEnableHWDec = false;
  private boolean mIsNeedClearLastImg = true;
  private ITXLivePlayListener mListener;
  private boolean mMute = false;
  private String mPlayUrl = "";
  private TXIPlayer mPlayer;
  private float mRate = 1.0F;
  private int mRenderMode;
  private int mRenderRotation;
  public boolean mSnapshotRunning = false;
  private Surface mSurface;
  private TXCloudVideoView mTXCloudVideoView;
  private ITXVideoRawDataListener mVideoRawDataListener;
  
  public TXLivePlayer(Context paramContext)
  {
    TXCLog.init();
    this.mListener = null;
    this.mContext = paramContext.getApplicationContext();
  }
  
  private String checkPlayUrl(String paramString, int paramInt)
  {
    Object localObject = paramString;
    if (paramInt != 6) {}
    label57:
    label82:
    label104:
    label201:
    label208:
    label214:
    for (;;)
    {
      StringBuilder localStringBuilder;
      int i;
      try
      {
        localObject = paramString.getBytes("UTF-8");
        localStringBuilder = new StringBuilder(localObject.length);
        paramInt = 0;
        if (paramInt >= localObject.length) {
          break label104;
        }
        if (localObject[paramInt] >= 0) {
          break label208;
        }
        i = localObject[paramInt] + 256;
      }
      catch (Exception localException)
      {
        str = paramString;
      }
      localStringBuilder.append(String.format("%%%02X", new Object[] { Integer.valueOf(i) }));
      break label201;
      localStringBuilder.append((char)i);
      break label201;
      String str;
      for (;;)
      {
        return str.trim();
        str = localStringBuilder.toString();
      }
      for (;;)
      {
        if ((i <= 32) || (i >= 127) || (i == 34) || (i == 37) || (i == 60) || (i == 62) || (i == 91) || (i == 125) || (i == 92) || (i == 93) || (i == 94) || (i == 96) || (i == 123)) {
          break label214;
        }
        if (i != 124) {
          break label82;
        }
        break label57;
        paramInt += 1;
        break;
        i = str[paramInt];
      }
    }
  }
  
  private boolean isAVCDecBlacklistDevices()
  {
    return (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) && (Build.MODEL.equalsIgnoreCase("Che2-TL00"));
  }
  
  private void postBitmapToMainThread(final ITXSnapshotListener paramITXSnapshotListener, final Bitmap paramBitmap)
  {
    if (paramITXSnapshotListener == null) {
      return;
    }
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        if (paramITXSnapshotListener != null) {
          paramITXSnapshotListener.onSnapshot(paramBitmap);
        }
        TXLivePlayer.this.mSnapshotRunning = false;
      }
    });
  }
  
  public boolean addVideoRawData(byte[] paramArrayOfByte)
  {
    return false;
  }
  
  public boolean enableHardwareDecode(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.mSurface != null)) {
      return false;
    }
    if (paramBoolean)
    {
      if (Build.VERSION.SDK_INT < 18)
      {
        TXCLog.e("HardwareDecode", "enableHardwareDecode failed, android system build.version = " + Build.VERSION.SDK_INT + ", the minimum build.version should be 18(android 4.3 or later)");
        return false;
      }
      if (isAVCDecBlacklistDevices())
      {
        TXCLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
        return false;
      }
    }
    this.mEnableHWDec = paramBoolean;
    if (this.mPlayer != null)
    {
      TXCPlayerConfig localTXCPlayerConfig2 = this.mPlayer.getConfig();
      TXCPlayerConfig localTXCPlayerConfig1 = localTXCPlayerConfig2;
      if (localTXCPlayerConfig2 == null) {
        localTXCPlayerConfig1 = new TXCPlayerConfig();
      }
      localTXCPlayerConfig1.enableHWDec = this.mEnableHWDec;
      this.mPlayer.setConfig(localTXCPlayerConfig1);
    }
    return true;
  }
  
  protected void finalize()
  {
    super.finalize();
  }
  
  public boolean isPlaying()
  {
    if (this.mPlayer != null) {
      return this.mPlayer.isPlaying();
    }
    return false;
  }
  
  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 15001)
    {
      if (this.mTXCloudVideoView != null) {
        this.mTXCloudVideoView.setLogText(paramBundle, null, 0);
      }
      if (this.mListener != null) {
        this.mListener.onNetStatus(paramBundle);
      }
    }
    do
    {
      return;
      if (this.mTXCloudVideoView != null) {
        this.mTXCloudVideoView.setLogText(null, paramBundle, paramInt);
      }
    } while (this.mListener == null);
    this.mListener.onPlayEvent(paramInt, paramBundle);
  }
  
  public void pause()
  {
    if (this.mPlayer != null) {
      this.mPlayer.pause();
    }
  }
  
  public void resume()
  {
    if (this.mPlayer != null) {
      this.mPlayer.resume();
    }
  }
  
  public void seek(int paramInt)
  {
    if (this.mPlayer != null) {
      this.mPlayer.seek(paramInt);
    }
  }
  
  public void setAudioRawDataListener(ITXAudioRawDataListener paramITXAudioRawDataListener)
  {
    this.mAudioRawDataListener = paramITXAudioRawDataListener;
    if (this.mPlayer != null) {
      this.mPlayer.setAudioRawDataListener(paramITXAudioRawDataListener);
    }
  }
  
  public void setAutoPlay(boolean paramBoolean)
  {
    this.mAutoPlay = paramBoolean;
  }
  
  public void setConfig(TXLivePlayConfig paramTXLivePlayConfig)
  {
    this.mConfig = paramTXLivePlayConfig;
    if (this.mConfig == null) {
      this.mConfig = new TXLivePlayConfig();
    }
    if (this.mPlayer != null)
    {
      TXCPlayerConfig localTXCPlayerConfig = this.mPlayer.getConfig();
      paramTXLivePlayConfig = localTXCPlayerConfig;
      if (localTXCPlayerConfig == null) {
        paramTXLivePlayConfig = new TXCPlayerConfig();
      }
      paramTXLivePlayConfig.cacheTime = this.mConfig.mCacheTime;
      paramTXLivePlayConfig.autoAdjustCacheTime = this.mConfig.mAutoAdjustCacheTime;
      paramTXLivePlayConfig.minAutoAdjustCacheTime = this.mConfig.mMinAutoAdjustCacheTime;
      paramTXLivePlayConfig.maxAutoAdjustCacheTime = this.mConfig.mMaxAutoAdjustCacheTime;
      paramTXLivePlayConfig.connectRetryCount = this.mConfig.mConnectRetryCount;
      paramTXLivePlayConfig.connectRetryInterval = this.mConfig.mConnectRetryInterval;
      paramTXLivePlayConfig.enableAec = this.mConfig.mEnableAec;
      paramTXLivePlayConfig.enableNearestIP = this.mConfig.mEnableNearestIP;
      paramTXLivePlayConfig.rtmpChannelType = this.mConfig.mRtmpChannelType;
      paramTXLivePlayConfig.enableHWDec = this.mEnableHWDec;
      paramTXLivePlayConfig.cacheFolderPath = this.mConfig.mCacheFolderPath;
      paramTXLivePlayConfig.maxCacheItems = this.mConfig.mMaxCacheItems;
      this.mPlayer.setConfig(paramTXLivePlayConfig);
    }
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mMute = paramBoolean;
    if (this.mPlayer != null) {
      this.mPlayer.setMute(paramBoolean);
    }
  }
  
  public void setPlayListener(ITXLivePlayListener paramITXLivePlayListener)
  {
    this.mListener = paramITXLivePlayListener;
  }
  
  public void setPlayerView(TXCloudVideoView paramTXCloudVideoView)
  {
    this.mTXCloudVideoView = paramTXCloudVideoView;
    if (this.mPlayer != null) {
      this.mPlayer.setPlayerView(paramTXCloudVideoView);
    }
  }
  
  public void setRate(float paramFloat)
  {
    this.mRate = paramFloat;
    if (this.mPlayer != null) {
      this.mPlayer.setRate(paramFloat);
    }
  }
  
  public void setRenderMode(int paramInt)
  {
    this.mRenderMode = paramInt;
    if (this.mPlayer != null) {
      this.mPlayer.setRenderMode(paramInt);
    }
  }
  
  public void setRenderRotation(int paramInt)
  {
    this.mRenderRotation = paramInt;
    if (this.mPlayer != null) {
      this.mPlayer.setRenderRotation(paramInt);
    }
  }
  
  public void setSurface(Surface paramSurface)
  {
    this.mSurface = paramSurface;
    if (this.mSurface != null) {
      enableHardwareDecode(true);
    }
  }
  
  public void setVideoRawDataListener(ITXVideoRawDataListener paramITXVideoRawDataListener)
  {
    this.mVideoRawDataListener = paramITXVideoRawDataListener;
  }
  
  public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener)
  {
    if (this.mPlayer != null) {
      this.mPlayer.setVideoRecordListener(paramITXVideoRecordListener);
    }
  }
  
  public void snapshot(ITXSnapshotListener paramITXSnapshotListener)
  {
    if ((this.mSnapshotRunning) || (paramITXSnapshotListener == null)) {
      return;
    }
    this.mSnapshotRunning = true;
    if (this.mPlayer != null) {}
    for (Object localObject = this.mPlayer.getTextureView();; localObject = null)
    {
      if (localObject != null)
      {
        Bitmap localBitmap2 = ((TextureView)localObject).getBitmap();
        Bitmap localBitmap1 = localBitmap2;
        if (localBitmap2 != null)
        {
          localObject = ((TextureView)localObject).getTransform(null);
          localBitmap1 = Bitmap.createBitmap(localBitmap2, 0, 0, localBitmap2.getWidth(), localBitmap2.getHeight(), (Matrix)localObject, true);
          localBitmap2.recycle();
        }
        postBitmapToMainThread(paramITXSnapshotListener, localBitmap1);
        return;
      }
      this.mSnapshotRunning = false;
      return;
    }
  }
  
  public int startPlay(String paramString, int paramInt)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString))) {
      return -1;
    }
    TXCDRApi.initCrashReport(this.mContext);
    stopPlay(this.mIsNeedClearLastImg);
    this.mPlayUrl = checkPlayUrl(paramString, paramInt);
    this.mPlayer = TXPlayerFactory.createPlayer(this.mContext, paramInt);
    if (this.mPlayer == null) {
      return -2;
    }
    setConfig(this.mConfig);
    if (this.mTXCloudVideoView != null)
    {
      this.mTXCloudVideoView.clearLog();
      this.mTXCloudVideoView.setVisibility(0);
    }
    this.mPlayer.setPlayerView(this.mTXCloudVideoView);
    this.mPlayer.setNotifyListener(this);
    this.mPlayer.setAutoPlay(this.mAutoPlay);
    this.mPlayer.startPlay(this.mPlayUrl, paramInt);
    this.mPlayer.setMute(this.mMute);
    this.mPlayer.setRate(this.mRate);
    this.mPlayer.setRenderRotation(this.mRenderRotation);
    this.mPlayer.setRenderMode(this.mRenderMode);
    this.mPlayer.setAudioRawDataListener(this.mAudioRawDataListener);
    return 0;
  }
  
  public int startRecord(int paramInt)
  {
    int i = -1;
    if (Build.VERSION.SDK_INT < 18)
    {
      TXCLog.e("TXLivePlayer", "API levl is too low (record need 18, current is" + Build.VERSION.SDK_INT + ")");
      i = -3;
    }
    do
    {
      return i;
      if (!isPlaying())
      {
        TXCLog.e("TXLivePlayer", "startRecord: there is no playing stream");
        return -1;
      }
    } while (this.mPlayer == null);
    return this.mPlayer.startRecord(paramInt);
  }
  
  public int stopPlay(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.mTXCloudVideoView != null)) {
      this.mTXCloudVideoView.setVisibility(8);
    }
    if (this.mPlayer != null) {
      this.mPlayer.stopPlay(paramBoolean);
    }
    this.mPlayUrl = "";
    return 0;
  }
  
  public int stopRecord()
  {
    if (this.mPlayer != null) {
      return this.mPlayer.stopRecord();
    }
    return -1;
  }
  
  public static abstract interface ITXAudioRawDataListener
  {
    public abstract void onPcmDataAvailable(byte[] paramArrayOfByte, long paramLong);
  }
  
  public static abstract interface ITXSnapshotListener
  {
    public abstract void onSnapshot(Bitmap paramBitmap);
  }
  
  public static abstract interface ITXVideoRawDataListener
  {
    public abstract void onVideoRawDataAvailable(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\TXLivePlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */