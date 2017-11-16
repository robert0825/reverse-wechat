package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.TXAudioJitterBufferReportInfo;
import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.audio.impl.TXCAudioPlayerWrapper;
import com.tencent.liteav.basic.structs.TXSAudioPacket;

public class TXCAudioPlayer
{
  public static final int DEFAULT_AEC_TYPE = TXEAudioDef.TXE_AEC_NONE;
  public static float DEFAULT_AUTO_ADJUST_MAX_CACHE = 5.0F;
  public static float DEFAULT_AUTO_ADJUST_MIN_CACHE = 1.0F;
  public static float DEFAULT_CACHE_TIME = 5.0F;
  public static final boolean DEFAULT_HW_ACCELERATION = false;
  public static boolean DEFAULT_IS_AUTO_AJUST_CACHE = true;
  public static final boolean DEFAULT_IS_REAL_TIME_PLAY = false;
  public static final float DEFAULT_PLAY_RATE = 1.0F;
  private TXCAudioPlayerWrapper mPlayerWrapper = null;
  
  public TXCAudioPlayer(Context paramContext)
  {
    this.mPlayerWrapper = new TXCAudioPlayerWrapper(paramContext);
  }
  
  public static byte[] getAacHeader(int paramInt1, int paramInt2, int paramInt3)
  {
    return TXCAudioPlayerWrapper.getAacHeader(paramInt1, paramInt2, paramInt3);
  }
  
  public static void setAudioMode(Context paramContext, int paramInt)
  {
    if (paramInt == TXEAudioDef.TXE_AUDIO_MODE_RECEIVER)
    {
      TXCAudioPlayerWrapper.setSpeakerphoneOn(paramContext, false);
      return;
    }
    TXCAudioPlayerWrapper.setSpeakerphoneOn(paramContext, true);
  }
  
  public static void setTraeConfig(String paramString)
  {
    TXCAudioJNI.nativeSetTraeConfig(paramString);
  }
  
  public void enableRealTimePlay(boolean paramBoolean)
  {
    this.mPlayerWrapper.enableRealTimePlay(paramBoolean);
  }
  
  public int getAECType()
  {
    return this.mPlayerWrapper.getAECType();
  }
  
  public long getCacheDuration()
  {
    return this.mPlayerWrapper.getCacheDuration();
  }
  
  public float getPlayCache()
  {
    return this.mPlayerWrapper.getPlayCache();
  }
  
  public float getPlayRate()
  {
    return this.mPlayerWrapper.getPlayRate();
  }
  
  public TXAudioJitterBufferReportInfo getReportInfo()
  {
    return this.mPlayerWrapper.getReportInfo();
  }
  
  public boolean isHWAcceleration()
  {
    return this.mPlayerWrapper.isHWAcceleration();
  }
  
  public boolean isPause()
  {
    return this.mPlayerWrapper.isPause();
  }
  
  public boolean isPlaying()
  {
    return this.mPlayerWrapper.isIsPlaying();
  }
  
  public boolean isRealTimePlay()
  {
    return this.mPlayerWrapper.isRealTimePlay();
  }
  
  public int pausePlay()
  {
    return this.mPlayerWrapper.pausePlay();
  }
  
  public int playData(TXSAudioPacket paramTXSAudioPacket)
  {
    return this.mPlayerWrapper.playData(paramTXSAudioPacket);
  }
  
  public int resetPlay()
  {
    return this.mPlayerWrapper.resetPlay();
  }
  
  public int resumePlay()
  {
    return this.mPlayerWrapper.resumePlay();
  }
  
  public void setAECType(int paramInt, Context paramContext)
  {
    this.mPlayerWrapper.setAECType(paramInt, paramContext);
  }
  
  public void setAutoAdjustMaxCache(float paramFloat)
  {
    this.mPlayerWrapper.setAutoAdjustMaxCache(paramFloat);
  }
  
  public void setAutoAdjustMinCache(float paramFloat)
  {
    this.mPlayerWrapper.setAutoAdjustMinCache(paramFloat);
  }
  
  public void setAutojust(boolean paramBoolean)
  {
    this.mPlayerWrapper.setAutojust(paramBoolean);
  }
  
  public void setCacheTime(float paramFloat)
  {
    this.mPlayerWrapper.setCacheTime(paramFloat);
  }
  
  public void setHWAcceleration(boolean paramBoolean)
  {
    this.mPlayerWrapper.setHWAcceleration(paramBoolean);
  }
  
  public void setListener(TXIAudioPlayListener paramTXIAudioPlayListener)
  {
    this.mPlayerWrapper.setListener(paramTXIAudioPlayListener);
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.mPlayerWrapper.setMute(paramBoolean);
  }
  
  public void setPlayRate(float paramFloat)
  {
    this.mPlayerWrapper.setPlayRate(paramFloat);
  }
  
  public int startPlay()
  {
    return this.mPlayerWrapper.startPlay();
  }
  
  public int stopPlay()
  {
    return this.mPlayerWrapper.stopPlay();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\TXCAudioPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */