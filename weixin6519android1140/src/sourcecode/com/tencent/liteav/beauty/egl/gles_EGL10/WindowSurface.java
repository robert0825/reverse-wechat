package com.tencent.liteav.beauty.egl.gles_EGL10;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public class WindowSurface
  extends EglSurfaceBase
{
  private boolean mReleaseSurface;
  private Surface mSurface;
  
  public WindowSurface(EglCore paramEglCore, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramEglCore);
    createOffscreenSurface(paramInt1, paramInt2);
    this.mReleaseSurface = paramBoolean;
  }
  
  public WindowSurface(EglCore paramEglCore, SurfaceTexture paramSurfaceTexture)
  {
    super(paramEglCore);
    createWindowSurface(paramSurfaceTexture);
  }
  
  public WindowSurface(EglCore paramEglCore, Surface paramSurface, boolean paramBoolean)
  {
    super(paramEglCore);
    createWindowSurface(paramSurface);
    this.mSurface = paramSurface;
    this.mReleaseSurface = paramBoolean;
  }
  
  public void recreate(EglCore paramEglCore)
  {
    if (this.mSurface == null) {
      throw new RuntimeException("not yet implemented for SurfaceTexture");
    }
    this.mEglCore = paramEglCore;
    createWindowSurface(this.mSurface);
  }
  
  public void release()
  {
    releaseEglSurface();
    if (this.mSurface != null)
    {
      if (this.mReleaseSurface) {
        this.mSurface.release();
      }
      this.mSurface = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\egl\gles_EGL10\WindowSurface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */