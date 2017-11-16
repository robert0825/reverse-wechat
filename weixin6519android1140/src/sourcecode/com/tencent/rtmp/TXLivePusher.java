package com.tencent.rtmp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.liteav.TXCLivePushConfig;
import com.tencent.liteav.TXCLivePusher;
import com.tencent.liteav.TXICustomPreprocessListenner;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class TXLivePusher
  implements TXICustomPreprocessListenner, TXINotifyListener
{
  private static final String TAG = TXLivePusher.class.getSimpleName();
  private TXLivePushConfig mConfig = null;
  private ITXLivePushListener mListener = null;
  private VideoCustomProcessListener mPreprocessListener;
  private TXCLivePusher mPusher = null;
  private boolean mPushing = false;
  private TXCloudVideoView mTXCloudVideoView;
  private int mVideoQuality = -1;
  
  public TXLivePusher(Context paramContext)
  {
    TXCLog.init();
    this.mPusher = new TXCLivePusher(paramContext);
    this.mPusher.setNotifyListener(this);
  }
  
  private int getAdjustStrategy(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1 == true)
    {
      if (paramBoolean2 == true) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
  
  private void setAdjustStrategy(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = getAdjustStrategy(paramBoolean1, paramBoolean2);
    if (i == -1)
    {
      this.mConfig.setAutoAdjustBitrate(false);
      this.mConfig.setAutoAdjustStrategy(-1);
      return;
    }
    this.mConfig.setAutoAdjustBitrate(true);
    this.mConfig.setAutoAdjustStrategy(i);
  }
  
  private void setSharpenLevel(int paramInt)
  {
    if (this.mPusher != null) {
      this.mPusher.setSharpenLevel(paramInt);
    }
  }
  
  protected void finalize()
  {
    super.finalize();
  }
  
  public TXLivePushConfig getConfig()
  {
    return this.mConfig;
  }
  
  public int getMaxZoom()
  {
    return this.mPusher.getMaxZoom();
  }
  
  public int getMusicDuration(String paramString)
  {
    return this.mPusher.getMusicDuration(paramString);
  }
  
  public boolean isPushing()
  {
    return this.mPushing;
  }
  
  public void onDetectFacePoints(float[] paramArrayOfFloat)
  {
    if (this.mPreprocessListener != null) {
      this.mPreprocessListener.onDetectFacePoints(paramArrayOfFloat);
    }
  }
  
  public void onLogRecord(String paramString)
  {
    TXCLog.d("User", paramString);
  }
  
  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 15002)
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
    this.mListener.onPushEvent(paramInt, paramBundle);
  }
  
  public int onTextureCustomProcess(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mPreprocessListener != null) {
      return this.mPreprocessListener.onTextureCustomProcess(paramInt1, paramInt2, paramInt3);
    }
    return 0;
  }
  
  public void onTextureDestoryed()
  {
    if (this.mPreprocessListener != null) {
      this.mPreprocessListener.onTextureDestoryed();
    }
  }
  
  public boolean pauseBGM()
  {
    return this.mPusher.pauseBGM();
  }
  
  public void pausePusher()
  {
    this.mPusher.pausePusher();
  }
  
  public boolean playBGM(String paramString)
  {
    return this.mPusher.playBGM(paramString);
  }
  
  public boolean resumeBGM()
  {
    return this.mPusher.resumeBGM();
  }
  
  public void resumePusher()
  {
    this.mPusher.resumePusher();
  }
  
  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    if (this.mPusher != null) {
      this.mPusher.sendCustomPCMData(paramArrayOfByte);
    }
  }
  
  public int sendCustomVideoData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    return 64536;
  }
  
  public void setBGMNofify(OnBGMNotify paramOnBGMNotify)
  {
    this.mPusher.setBGMNotify(paramOnBGMNotify);
  }
  
  public boolean setBGMVolume(float paramFloat)
  {
    return this.mPusher.setBGMVolume(paramFloat);
  }
  
  public boolean setBeautyFilter(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.mPusher != null)
    {
      this.mPusher.setBeautyStyle(paramInt1);
      this.mPusher.setBeautyFilter(paramInt2, paramInt3, paramInt4);
      if (this.mConfig != null)
      {
        this.mConfig.mBeautyLevel = paramInt2;
        this.mConfig.mWhiteningLevel = paramInt3;
        this.mConfig.mRuddyLevel = paramInt4;
      }
    }
    return true;
  }
  
  public void setChinLevel(int paramInt)
  {
    this.mPusher.setChinLevel(paramInt);
  }
  
  public void setConfig(TXLivePushConfig paramTXLivePushConfig)
  {
    TXLivePushConfig localTXLivePushConfig = paramTXLivePushConfig;
    if (paramTXLivePushConfig == null) {
      localTXLivePushConfig = new TXLivePushConfig();
    }
    this.mConfig = localTXLivePushConfig;
    if (this.mPusher != null)
    {
      paramTXLivePushConfig = this.mPusher.getConfig();
      paramTXLivePushConfig.bitRate = localTXLivePushConfig.mVideoBitrate;
      paramTXLivePushConfig.minBitrate = localTXLivePushConfig.mMinVideoBitrate;
      paramTXLivePushConfig.maxBitrate = localTXLivePushConfig.mMaxVideoBitrate;
      paramTXLivePushConfig.autoAdjustStrategy = localTXLivePushConfig.mAutoAdjustStrategy;
      paramTXLivePushConfig.autoAdjustBitrate = localTXLivePushConfig.mAutoAdjustBitrate;
      paramTXLivePushConfig.fps = localTXLivePushConfig.mVideoFPS;
      paramTXLivePushConfig.gop = localTXLivePushConfig.mVideoEncodeGop;
      paramTXLivePushConfig.videoEncType = localTXLivePushConfig.mHardwareAccel;
      paramTXLivePushConfig.resolution = localTXLivePushConfig.mVideoResolution;
      paramTXLivePushConfig.enableMainProfile = localTXLivePushConfig.mEnableVideoHardEncoderMainProfile;
      paramTXLivePushConfig.audioSample = localTXLivePushConfig.mAudioSample;
      paramTXLivePushConfig.audioChannels = localTXLivePushConfig.mAudioChannels;
      paramTXLivePushConfig.enableAec = localTXLivePushConfig.mEnableAec;
      paramTXLivePushConfig.pauseFlag = localTXLivePushConfig.mPauseFlag;
      paramTXLivePushConfig.pauseFps = localTXLivePushConfig.mPauseFps;
      paramTXLivePushConfig.pauseImg = localTXLivePushConfig.mPauseImg;
      paramTXLivePushConfig.pauseTime = localTXLivePushConfig.mPauseTime;
      paramTXLivePushConfig.pureAudioPush = localTXLivePushConfig.mEnablePureAudioPush;
      paramTXLivePushConfig.touchFoucus = localTXLivePushConfig.mTouchFocus;
      paramTXLivePushConfig.watermark = localTXLivePushConfig.mWatermark;
      paramTXLivePushConfig.watermarkX = localTXLivePushConfig.mWatermarkX;
      paramTXLivePushConfig.watermarkY = localTXLivePushConfig.mWatermarkY;
      paramTXLivePushConfig.watermarkXF = localTXLivePushConfig.mWatermarkXF;
      paramTXLivePushConfig.watermarkYF = localTXLivePushConfig.mWatermarkYF;
      paramTXLivePushConfig.watermarkWidth = localTXLivePushConfig.mWatermarkWidth;
      paramTXLivePushConfig.homeOrientation = localTXLivePushConfig.mHomeOrientation;
      paramTXLivePushConfig.enableNearestIP = localTXLivePushConfig.mEnableNearestIP;
      paramTXLivePushConfig.rtmpChannelType = localTXLivePushConfig.mRtmpChannelType;
      paramTXLivePushConfig.connectRetryCount = localTXLivePushConfig.mConnectRetryCount;
      paramTXLivePushConfig.connectRetryInterval = localTXLivePushConfig.mConnectRetryInterval;
      paramTXLivePushConfig.frontCamera = localTXLivePushConfig.mFrontCamera;
      paramTXLivePushConfig.customModeType = localTXLivePushConfig.mCustomModeType;
      paramTXLivePushConfig.mirror = localTXLivePushConfig.mVideoEncoderXMirror;
      paramTXLivePushConfig.enableHighCapture = localTXLivePushConfig.mEnableHighResolutionCapture;
      this.mPusher.setConfig(paramTXLivePushConfig);
      this.mPusher.setBeautyFilter(localTXLivePushConfig.mBeautyLevel, localTXLivePushConfig.mWhiteningLevel, localTXLivePushConfig.mRuddyLevel);
    }
  }
  
  public void setExposureCompensation(float paramFloat)
  {
    this.mPusher.setExposureCompensation(paramFloat);
  }
  
  public void setEyeScaleLevel(int paramInt)
  {
    this.mPusher.setEyeScaleLevel(paramInt);
    if (this.mConfig != null) {
      this.mConfig.setEyeScaleLevel(paramInt);
    }
  }
  
  public void setFaceShortLevel(int paramInt)
  {
    this.mPusher.setFaceShortLevel(paramInt);
  }
  
  public void setFaceSlimLevel(int paramInt)
  {
    this.mPusher.setFaceSlimLevel(paramInt);
    if (this.mConfig != null) {
      this.mConfig.setFaceSlimLevel(paramInt);
    }
  }
  
  public void setFaceVLevel(int paramInt)
  {
    this.mPusher.setFaceVLevel(paramInt);
  }
  
  public void setFilter(Bitmap paramBitmap)
  {
    if (this.mPusher != null) {
      this.mPusher.setFilter(paramBitmap);
    }
  }
  
  @TargetApi(18)
  public boolean setGreenScreenFile(String paramString)
  {
    return this.mPusher.setGreenScreenFile(paramString);
  }
  
  public boolean setMicVolume(float paramFloat)
  {
    return this.mPusher.setMicVolume(paramFloat);
  }
  
  public boolean setMirror(boolean paramBoolean)
  {
    if (this.mConfig != null) {
      this.mConfig.setVideoEncoderXMirror(paramBoolean);
    }
    return this.mPusher.setMirror(paramBoolean);
  }
  
  public void setMotionTmpl(String paramString)
  {
    this.mPusher.setMotionTmpl(paramString);
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mPusher.setMute(paramBoolean);
  }
  
  public void setNoseSlimLevel(int paramInt)
  {
    this.mPusher.setNoseSlimLevel(paramInt);
  }
  
  public void setPushListener(ITXLivePushListener paramITXLivePushListener)
  {
    this.mListener = paramITXLivePushListener;
  }
  
  public void setRenderRotation(int paramInt)
  {
    this.mPusher.setRenderRotation(paramInt);
  }
  
  public void setReverb(int paramInt)
  {
    if (this.mPusher != null) {
      this.mPusher.setReverb(paramInt);
    }
  }
  
  public void setSpecialRatio(float paramFloat)
  {
    this.mPusher.setSpecialRatio(paramFloat);
  }
  
  public void setVideoProcessListener(VideoCustomProcessListener paramVideoCustomProcessListener)
  {
    this.mPreprocessListener = paramVideoCustomProcessListener;
    if (this.mPreprocessListener == null)
    {
      this.mPusher.setCustomPreprocessListenner(null);
      return;
    }
    this.mPusher.setCustomPreprocessListenner(this);
  }
  
  public void setVideoQuality(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    int j = 1;
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 18) {
      if (paramInt != 2)
      {
        i = paramInt;
        if (paramInt != 3) {}
      }
      else
      {
        i = 1;
      }
    }
    if (this.mConfig == null) {
      this.mConfig = new TXLivePushConfig();
    }
    this.mConfig.setVideoFPS(15);
    Object localObject;
    switch (i)
    {
    default: 
      this.mConfig.setHardwareAcceleration(2);
      TXCLog.e(TAG, "setVideoPushQuality: invalid quality " + i);
      return;
    case 1: 
      this.mConfig.enableAEC(false);
      this.mConfig.setHardwareAcceleration(2);
      this.mConfig.setVideoResolution(0);
      this.mConfig.setAudioSampleRate(48000);
      setAdjustStrategy(paramBoolean1, paramBoolean2);
      this.mConfig.setMinVideoBitrate(301);
      this.mConfig.setVideoBitrate(800);
      this.mConfig.setMaxVideoBitrate(800);
      paramBoolean1 = false;
      this.mVideoQuality = i;
      localObject = this.mConfig;
      if (paramBoolean1)
      {
        paramBoolean2 = bool;
        label224:
        ((TXLivePushConfig)localObject).enableVideoHardEncoderMainProfile(paramBoolean2);
        localObject = this.mConfig;
        if (!paramBoolean1) {
          break label904;
        }
      }
      break;
    }
    label904:
    for (paramInt = j;; paramInt = 3)
    {
      ((TXLivePushConfig)localObject).setVideoEncodeGop(paramInt);
      localObject = this.mPusher.getConfig();
      if (localObject != null) {
        ((TXCLivePushConfig)localObject).realTimeMode = paramBoolean1;
      }
      setConfig(this.mConfig);
      return;
      this.mConfig.enableAEC(false);
      this.mConfig.setHardwareAcceleration(2);
      this.mConfig.setVideoResolution(1);
      this.mConfig.setAudioSampleRate(48000);
      setAdjustStrategy(paramBoolean1, paramBoolean2);
      this.mConfig.setMinVideoBitrate(600);
      this.mConfig.setVideoBitrate(1200);
      this.mConfig.setMaxVideoBitrate(1200);
      paramBoolean1 = false;
      break;
      this.mConfig.enableAEC(false);
      this.mConfig.setHardwareAcceleration(1);
      this.mConfig.setVideoResolution(2);
      this.mConfig.setAudioSampleRate(48000);
      setAdjustStrategy(paramBoolean1, paramBoolean2);
      this.mConfig.setMinVideoBitrate(600);
      this.mConfig.setVideoBitrate(1800);
      this.mConfig.setMaxVideoBitrate(1800);
      paramBoolean1 = false;
      break;
      this.mConfig.enableAEC(true);
      this.mConfig.setHardwareAcceleration(1);
      this.mConfig.setVideoResolution(0);
      this.mConfig.setAudioSampleRate(16000);
      this.mConfig.setAutoAdjustBitrate(true);
      this.mConfig.setAutoAdjustStrategy(5);
      this.mConfig.setMinVideoBitrate(190);
      this.mConfig.setVideoBitrate(400);
      this.mConfig.setMaxVideoBitrate(810);
      paramBoolean1 = true;
      break;
      if (Build.VERSION.SDK_INT < 18)
      {
        this.mConfig.enableAEC(true);
        this.mConfig.setHardwareAcceleration(0);
        this.mConfig.setVideoResolution(0);
        this.mConfig.setAutoAdjustBitrate(true);
        this.mConfig.setAutoAdjustStrategy(4);
        this.mConfig.setMinVideoBitrate(301);
        this.mConfig.setVideoBitrate(800);
        this.mConfig.setMaxVideoBitrate(800);
      }
      for (;;)
      {
        this.mConfig.setAudioSampleRate(48000);
        paramBoolean1 = true;
        break;
        if (this.mVideoQuality == 1)
        {
          this.mConfig.enableAEC(true);
          this.mConfig.setHardwareAcceleration(1);
          this.mConfig.setVideoResolution(0);
          this.mConfig.setAutoAdjustBitrate(true);
          this.mConfig.setAutoAdjustStrategy(4);
          this.mConfig.setMinVideoBitrate(301);
          this.mConfig.setVideoBitrate(800);
          this.mConfig.setMaxVideoBitrate(800);
        }
        else if (this.mVideoQuality == 3)
        {
          this.mConfig.enableAEC(true);
          this.mConfig.setHardwareAcceleration(1);
          this.mConfig.setVideoResolution(2);
          this.mConfig.setAutoAdjustBitrate(true);
          this.mConfig.setAutoAdjustStrategy(4);
          this.mConfig.setMinVideoBitrate(600);
          this.mConfig.setVideoBitrate(1800);
          this.mConfig.setMaxVideoBitrate(1800);
        }
        else
        {
          this.mConfig.enableAEC(true);
          this.mConfig.setHardwareAcceleration(1);
          this.mConfig.setVideoResolution(1);
          this.mConfig.setAutoAdjustBitrate(true);
          this.mConfig.setAutoAdjustStrategy(4);
          this.mConfig.setMinVideoBitrate(600);
          this.mConfig.setVideoBitrate(1200);
          this.mConfig.setMaxVideoBitrate(1200);
        }
      }
      this.mConfig.enableAEC(true);
      this.mConfig.setHardwareAcceleration(1);
      this.mConfig.setVideoResolution(6);
      this.mConfig.setAutoAdjustBitrate(false);
      this.mConfig.setVideoBitrate(350);
      this.mConfig.setAudioSampleRate(48000);
      paramBoolean1 = true;
      break;
      paramBoolean2 = true;
      break label224;
    }
  }
  
  public boolean setZoom(int paramInt)
  {
    return this.mPusher.setZoom(paramInt);
  }
  
  public void startCameraPreview(TXCloudVideoView paramTXCloudVideoView)
  {
    if (paramTXCloudVideoView == null) {
      return;
    }
    setConfig(this.mConfig);
    this.mTXCloudVideoView = paramTXCloudVideoView;
    this.mPusher.startCameraPreview(paramTXCloudVideoView);
  }
  
  public int startPusher(String paramString)
  {
    this.mPushing = true;
    if (this.mTXCloudVideoView != null) {
      this.mTXCloudVideoView.clearLog();
    }
    this.mPusher.startPush(paramString);
    return 0;
  }
  
  public void startScreenCapture()
  {
    this.mPusher.startScreenCapture();
  }
  
  public boolean stopBGM()
  {
    return this.mPusher.stopBGM();
  }
  
  public void stopCameraPreview(boolean paramBoolean)
  {
    this.mPusher.stopCameraPreview(paramBoolean);
  }
  
  public void stopPusher()
  {
    this.mPusher.stopPush();
    this.mPushing = false;
  }
  
  public void stopScreenCapture()
  {
    this.mPusher.stopScreenCapture();
  }
  
  public void switchCamera()
  {
    this.mPusher.switchCamera();
  }
  
  public boolean turnOnFlashLight(boolean paramBoolean)
  {
    this.mPusher.turnOnFlashLight(paramBoolean);
    return true;
  }
  
  public static abstract interface OnBGMNotify
  {
    public abstract void onBGMComplete(int paramInt);
    
    public abstract void onBGMProgress(long paramLong1, long paramLong2);
    
    public abstract void onBGMStart();
  }
  
  public static abstract interface VideoCustomProcessListener
  {
    public abstract void onDetectFacePoints(float[] paramArrayOfFloat);
    
    public abstract int onTextureCustomProcess(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void onTextureDestoryed();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\TXLivePusher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */