package com.tencent.liteav.screencapture;

import javax.microedition.khronos.egl.EGLContext;

public abstract interface TXIScreenCaptureListener
{
  public abstract void onScreenCaptureDestory(Object paramObject);
  
  public abstract void onScreenCaptureFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong);
  
  public abstract void onStartResult(int paramInt, EGLContext paramEGLContext);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\screencapture\TXIScreenCaptureListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */