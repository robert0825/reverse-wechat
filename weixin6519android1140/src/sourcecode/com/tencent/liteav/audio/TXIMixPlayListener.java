package com.tencent.liteav.audio;

public abstract interface TXIMixPlayListener
{
  public abstract void onMixPcmData(byte[] paramArrayOfByte);
  
  public abstract void onMixPlayBegin();
  
  public abstract void onMixPlayComplete(int paramInt);
  
  public abstract void onMixPlayProgress(long paramLong1, long paramLong2);
  
  public abstract void onPCMData(byte[] paramArrayOfByte);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\audio\TXIMixPlayListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */