package com.tencent.liteav.beauty.egl.gles_EGL10;

public class OffscreenSurface
  extends EglSurfaceBase
{
  public OffscreenSurface(EglCore paramEglCore, int paramInt1, int paramInt2)
  {
    super(paramEglCore);
    createOffscreenSurface(paramInt1, paramInt2);
  }
  
  public void release()
  {
    releaseEglSurface();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\liteav\beauty\egl\gles_EGL10\OffscreenSurface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */