package com.tencent.liteav.audio;

import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.basic.enums.TXEAudioTypeDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSAudioPacket;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;

public class TXCMixPlayer
  implements TXIMixPlayListener
{
  static TXCMixPlayer instance = new TXCMixPlayer();
  boolean mIsPlayMix = false;
  TXCAudioPlayer mPlayer = new TXCAudioPlayer(null);
  WeakReference<TXIMixPlayListener> mWeakListener;
  
  public static TXCMixPlayer getInstance()
  {
    return instance;
  }
  
  public long getCurProgress()
  {
    return TXCAudioJNI.getCurBGMProgress();
  }
  
  public int getMusicDuration(String paramString)
  {
    return TXCAudioJNI.getBGMDuration(paramString);
  }
  
  public void onMixPcmData(byte[] paramArrayOfByte)
  {
    Object localObject;
    if ((this.mIsPlayMix) && (this.mPlayer != null))
    {
      localObject = new TXSAudioPacket();
      ((TXSAudioPacket)localObject).audioData = paramArrayOfByte;
      ((TXSAudioPacket)localObject).packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_PCM_DATA;
      ((TXSAudioPacket)localObject).sampleRate = TXCAudioRecorder.getInstance().getSampleRate();
      ((TXSAudioPacket)localObject).channelsPerSample = TXCAudioRecorder.getInstance().getChannelsPerSample();
      ((TXSAudioPacket)localObject).bitsPerChannel = TXCAudioRecorder.getInstance().getBitsPerChannel();
      ((TXSAudioPacket)localObject).timestamp = TXCTimeUtil.getTimeTick();
      this.mPlayer.playData((TXSAudioPacket)localObject);
    }
    if (this.mWeakListener != null)
    {
      localObject = (TXIMixPlayListener)this.mWeakListener.get();
      if (localObject != null) {
        ((TXIMixPlayListener)localObject).onMixPcmData(paramArrayOfByte);
      }
    }
  }
  
  public void onMixPlayBegin()
  {
    if (this.mWeakListener != null)
    {
      TXIMixPlayListener localTXIMixPlayListener = (TXIMixPlayListener)this.mWeakListener.get();
      if (localTXIMixPlayListener != null) {
        localTXIMixPlayListener.onMixPlayBegin();
      }
    }
  }
  
  public void onMixPlayComplete(int paramInt)
  {
    if (this.mWeakListener != null)
    {
      TXIMixPlayListener localTXIMixPlayListener = (TXIMixPlayListener)this.mWeakListener.get();
      if (localTXIMixPlayListener != null) {
        localTXIMixPlayListener.onMixPlayComplete(paramInt);
      }
    }
  }
  
  public void onMixPlayProgress(long paramLong1, long paramLong2)
  {
    if (this.mWeakListener != null)
    {
      TXIMixPlayListener localTXIMixPlayListener = (TXIMixPlayListener)this.mWeakListener.get();
      if (localTXIMixPlayListener != null) {
        localTXIMixPlayListener.onMixPlayProgress(paramLong1, paramLong2);
      }
    }
  }
  
  public void onPCMData(byte[] paramArrayOfByte)
  {
    Object localObject;
    if ((!this.mIsPlayMix) && (this.mPlayer != null))
    {
      localObject = new TXSAudioPacket();
      ((TXSAudioPacket)localObject).audioData = paramArrayOfByte;
      ((TXSAudioPacket)localObject).packetType = TXEAudioTypeDef.TXE_AUDIO_PACKET_TYPE_PCM_DATA;
      ((TXSAudioPacket)localObject).sampleRate = TXCAudioRecorder.getInstance().getSampleRate();
      ((TXSAudioPacket)localObject).channelsPerSample = TXCAudioRecorder.getInstance().getChannelsPerSample();
      ((TXSAudioPacket)localObject).bitsPerChannel = TXCAudioRecorder.getInstance().getBitsPerChannel();
      ((TXSAudioPacket)localObject).timestamp = TXCTimeUtil.getTimeTick();
      this.mPlayer.playData((TXSAudioPacket)localObject);
    }
    if (this.mWeakListener != null)
    {
      localObject = (TXIMixPlayListener)this.mWeakListener.get();
      if (localObject != null) {
        ((TXIMixPlayListener)localObject).onPCMData(paramArrayOfByte);
      }
    }
  }
  
  public boolean pauseBGM()
  {
    TXCAudioJNI.pauseBGM();
    return true;
  }
  
  public long pcmBytesToTs(long paramLong)
  {
    return ((float)paramLong / (TXCAudioRecorder.getInstance().getChannelsPerSample() * 2.0F) / (TXCAudioRecorder.getInstance().getSampleRate() / 1000.0F));
  }
  
  public long pcmTsToBytes(long paramLong)
  {
    return ((float)(TXCAudioRecorder.getInstance().getChannelsPerSample() * 2 * paramLong * TXCAudioRecorder.getInstance().getSampleRate()) / 1000.0F);
  }
  
  public boolean playBGM(String paramString)
  {
    if (!TXCAudioRecorder.getInstance().isRecording()) {
      TXCLog.e("MixPlayer", "You must start audio record before start bgm!");
    }
    while (!TXCAudioJNI.playBGM(paramString, TXCAudioRecorder.getInstance().getSampleRate(), TXCAudioRecorder.getInstance().getChannelsPerSample(), TXEAudioDef.TXE_AUDIO_BGM_MODEL_NOMAL)) {
      return false;
    }
    TXCAudioJNI.setBGMNotify(this);
    this.mPlayer.startPlay();
    return true;
  }
  
  public boolean playBGM(String paramString, boolean paramBoolean, int paramInt)
  {
    if ((paramBoolean) && (!TXCAudioRecorder.getInstance().isRecording())) {
      TXCLog.e("MixPlayer", "You must start audio record before start bgm!");
    }
    while (!TXCAudioJNI.playBGM(paramString, TXCAudioRecorder.getInstance().getSampleRate(), TXCAudioRecorder.getInstance().getChannelsPerSample(), paramInt)) {
      return false;
    }
    TXCAudioJNI.setBGMNotify(this);
    this.mPlayer.startPlay();
    return true;
  }
  
  public boolean resumeBGM()
  {
    TXCAudioJNI.resumeBGM();
    return true;
  }
  
  public boolean seekBGM(int paramInt1, int paramInt2)
  {
    TXCAudioJNI.seekBGM(paramInt1, paramInt2);
    return true;
  }
  
  public boolean seekBGMWithByte(int paramInt1, int paramInt2)
  {
    TXCAudioJNI.seekBGMWithBytes(paramInt1, paramInt2);
    return true;
  }
  
  public void setBGMNofify(TXIMixPlayListener paramTXIMixPlayListener)
  {
    if (paramTXIMixPlayListener == null)
    {
      this.mWeakListener = null;
      return;
    }
    this.mWeakListener = new WeakReference(paramTXIMixPlayListener);
  }
  
  public boolean setBGMVolume(float paramFloat)
  {
    TXCAudioJNI.setBgmVolume(paramFloat);
    return true;
  }
  
  public void setBmgPlayRate(float paramFloat)
  {
    TXCAudioJNI.setBgmPlayRate(paramFloat);
  }
  
  public boolean setMicVolume(float paramFloat)
  {
    TXCAudioJNI.setMicVolume(paramFloat);
    return true;
  }
  
  public void setMixPlayRate(float paramFloat)
  {
    TXCAudioJNI.setMixPlayRate(paramFloat);
  }
  
  public boolean stopBGM()
  {
    TXCAudioJNI.stopBGM();
    this.mIsPlayMix = false;
    this.mPlayer.stopPlay();
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\TXCMixPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */