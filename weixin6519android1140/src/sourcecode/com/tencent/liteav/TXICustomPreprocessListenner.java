package com.tencent.liteav;

public abstract interface TXICustomPreprocessListenner
{
  public abstract void onDetectFacePoints(float[] paramArrayOfFloat);
  
  public abstract int onTextureCustomProcess(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onTextureDestoryed();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\TXICustomPreprocessListenner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */