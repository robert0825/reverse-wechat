package com.tencent.liteav.beauty.gpu_filters;

public abstract interface TXCGPUPituInterface
{
  public abstract void changeMotionTmpl(String paramString);
  
  public abstract void destroy();
  
  public abstract void doFaceDetect(int paramInt);
  
  public abstract int getDetectWidth();
  
  public abstract float[] getFacePoints();
  
  public abstract float[] getFacePointsPixels();
  
  public abstract boolean init();
  
  public abstract int onDrawToTexture(int paramInt);
  
  public abstract void onOutputSizeChanged(int paramInt1, int paramInt2);
  
  public abstract void setChinLevel(int paramInt);
  
  public abstract void setEyeScaleLevel(int paramInt);
  
  public abstract void setFaceShortLevel(int paramInt);
  
  public abstract void setFaceSlim(int paramInt);
  
  public abstract void setFaceVLevel(int paramInt);
  
  public abstract void setLevel(float paramFloat);
  
  public abstract void setNoseSlimLevel(int paramInt);
  
  public abstract void updatePoints(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUPituInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */