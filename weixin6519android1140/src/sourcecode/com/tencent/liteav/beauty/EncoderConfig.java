package com.tencent.liteav.beauty;

import android.opengl.EGLContext;

public class EncoderConfig
{
  EGLContext mEglContext = null;
  final int mHeight;
  final int mWidth;
  
  public EncoderConfig(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
  }
  
  public EGLContext getLastEglContext()
  {
    return this.mEglContext;
  }
  
  public void updateEglContext(EGLContext paramEGLContext)
  {
    this.mEglContext = paramEGLContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\liteav\beauty\EncoderConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */