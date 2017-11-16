package com.tencent.liteav.beauty;

public abstract interface TXIVideoPreprocessorListener
{
  public abstract void didDetectFacePoints(float[] paramArrayOfFloat);
  
  public abstract void didProcessFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public abstract void didProcessFrame(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  public abstract int willAddWatermark(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\TXIVideoPreprocessorListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */