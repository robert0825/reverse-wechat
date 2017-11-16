package com.tencent.liteav.audio;

public abstract interface TXIAudioRecordListener
{
  public abstract void onRecordEncData(byte[] paramArrayOfByte, long paramLong);
  
  public abstract void onRecordError(int paramInt, String paramString);
  
  public abstract void onRecordPcmData(byte[] paramArrayOfByte, long paramLong);
  
  public abstract void onRecordSpeedPcmData(byte[] paramArrayOfByte, long paramLong);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\TXIAudioRecordListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */