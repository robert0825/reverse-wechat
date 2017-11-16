package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.TXCAudioJNI;
import com.tencent.liteav.audio.impl.TXCAudioRecorderWrapper;
import com.tencent.liteav.basic.enums.TXEAudioTypeDef;

public class TXCAudioRecorder
{
  public static final int DEFAULT_AEC_TYPE = TXEAudioDef.TXE_AEC_NONE;
  public static final int DEFAULT_BITS_PER_CHANNEL;
  public static final int DEFAULT_CHANNELS_PER_SAMPLE;
  public static final int DEFAULT_ENC_TYPE = TXEAudioDef.TXE_AUDIO_TYPE_AAC;
  public static final boolean DEFAULT_IS_AUDIO_PREVIEW = false;
  public static final boolean DEFAULT_IS_HW_ACCELERATION = false;
  public static final float DEFAULT_PLAY_RATE = 1.0F;
  public static final int DEFAULT_REVERB_TYPE;
  public static final int DEFAULT_SAMPLES_PER_AAC_FRAME = 1024;
  public static final int DEFAULT_SAMPLE_RATE = TXEAudioTypeDef.TXE_SAMPLE_RATE_48000;
  static TXCAudioRecorder instance = new TXCAudioRecorder();
  
  static
  {
    DEFAULT_CHANNELS_PER_SAMPLE = TXEAudioTypeDef.TXE_CHANNELS_PRE_SAMPLE_1;
    DEFAULT_BITS_PER_CHANNEL = TXEAudioTypeDef.TXE_BITS_PER_CHANNEL_16;
    DEFAULT_REVERB_TYPE = TXEAudioDef.TXE_REVERB_TYPE_0;
  }
  
  public static TXCAudioRecorder getInstance()
  {
    return instance;
  }
  
  public static void setTraeConfig(String paramString)
  {
    TXCAudioJNI.nativeSetTraeConfig(paramString);
  }
  
  public void enableAgc(boolean paramBoolean)
  {
    TXCAudioRecorderWrapper.getInstance().enableAgc(paramBoolean);
  }
  
  public void enableAudioPreview(boolean paramBoolean)
  {
    TXCAudioRecorderWrapper.getInstance().enableAudioPreview(paramBoolean);
  }
  
  public int getAECType()
  {
    return TXCAudioRecorderWrapper.getInstance().getAECType();
  }
  
  public int getBitsPerChannel()
  {
    return TXCAudioRecorderWrapper.getInstance().getBitsPerChannel();
  }
  
  public int getChannelsPerSample()
  {
    return TXCAudioRecorderWrapper.getInstance().getChannelsPerSample();
  }
  
  public int getEncType()
  {
    return TXCAudioRecorderWrapper.getInstance().getEncType();
  }
  
  public float getPlayRate()
  {
    return TXCAudioRecorderWrapper.getInstance().getPlayRate();
  }
  
  public int getReverbType()
  {
    return TXCAudioRecorderWrapper.getInstance().getReverbType();
  }
  
  public int getSampleRate()
  {
    return TXCAudioRecorderWrapper.getInstance().getSampleRate();
  }
  
  public boolean isAudioPreview()
  {
    return TXCAudioRecorderWrapper.getInstance().isAudioPreview();
  }
  
  public boolean isIsHWAcceleration()
  {
    return TXCAudioRecorderWrapper.getInstance().isHWAcceleration();
  }
  
  public boolean isPause()
  {
    return TXCAudioRecorderWrapper.getInstance().isPause();
  }
  
  public boolean isRecording()
  {
    return TXCAudioRecorderWrapper.getInstance().isRecording();
  }
  
  public int pauseRecord()
  {
    return TXCAudioRecorderWrapper.getInstance().pauseRecord();
  }
  
  public int resetRecord()
  {
    return TXCAudioRecorderWrapper.getInstance().resetRecord();
  }
  
  public int resumeRecord()
  {
    return TXCAudioRecorderWrapper.getInstance().resumeRecord();
  }
  
  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    TXCAudioRecorderWrapper.getInstance().sendCustomPCMData(paramArrayOfByte);
  }
  
  public void setAECType(int paramInt, Context paramContext)
  {
    if (paramInt == TXEAudioDef.TXE_AEC_SYSTEM) {
      TXCAudioJNI.setHeadsetOn(true);
    }
    TXCAudioRecorderWrapper.getInstance().setAECType(paramInt, paramContext);
  }
  
  public void setChannelsPerSample(int paramInt)
  {
    TXCAudioRecorderWrapper.getInstance().setChannelsPerSample(paramInt);
  }
  
  public void setEncType(int paramInt)
  {
    TXCAudioRecorderWrapper.getInstance().setEncType(paramInt);
  }
  
  public void setIsCustomRecord(boolean paramBoolean)
  {
    TXCAudioRecorderWrapper.getInstance().setIsCustomRecord(paramBoolean);
  }
  
  public void setIsHWAcceleration(boolean paramBoolean)
  {
    TXCAudioRecorderWrapper.getInstance().setHWAcceleration(paramBoolean);
  }
  
  public void setListener(TXIAudioRecordListener paramTXIAudioRecordListener)
  {
    TXCAudioRecorderWrapper.getInstance().setListener(paramTXIAudioRecordListener);
  }
  
  public void setMute(boolean paramBoolean)
  {
    TXCAudioRecorderWrapper.getInstance().setMute(paramBoolean);
  }
  
  public void setPlayRate(float paramFloat)
  {
    TXCAudioRecorderWrapper.getInstance().setPlayRate(paramFloat);
  }
  
  public void setResampleRate(int paramInt)
  {
    TXCAudioRecorderWrapper.getInstance().setResampleRate(paramInt);
  }
  
  public void setReverbType(int paramInt)
  {
    TXCAudioRecorderWrapper.getInstance().setReverbType(paramInt);
  }
  
  public void setSampleRate(int paramInt)
  {
    TXCAudioRecorderWrapper.getInstance().setSampleRate(paramInt);
  }
  
  public int startRecord(Context paramContext)
  {
    return TXCAudioRecorderWrapper.getInstance().startRecord(paramContext);
  }
  
  public int stopRecord()
  {
    return TXCAudioRecorderWrapper.getInstance().stopRecord();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\TXCAudioRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */