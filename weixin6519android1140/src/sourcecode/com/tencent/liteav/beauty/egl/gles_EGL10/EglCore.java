package com.tencent.liteav.beauty.egl.gles_EGL10;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

public class EglCore
{
  private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
  private static final String TAG = "EglCore";
  private EGLConfig mEGLConfig;
  private final EGLContext mEGLContext;
  private EGLDisplay mEGLDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
  private EGLSurface mEGLSurface;
  private EGL10 mEgl = (EGL10)EGLContext.getEGL();
  
  public EglCore()
  {
    this(null);
  }
  
  public EglCore(EGLConfig paramEGLConfig)
  {
    if (this.mEGLDisplay == EGL10.EGL_NO_DISPLAY) {
      throw new RuntimeException("unable to get EGL10 display");
    }
    int[] arrayOfInt = new int[2];
    if (!this.mEgl.eglInitialize(this.mEGLDisplay, arrayOfInt))
    {
      this.mEGLDisplay = null;
      throw new RuntimeException("unable to initialize EGL10");
    }
    if (paramEGLConfig != null) {}
    for (this.mEGLConfig = paramEGLConfig;; this.mEGLConfig = getConfig())
    {
      this.mEGLContext = this.mEgl.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
      return;
    }
  }
  
  private void checkEglError(String paramString)
  {
    int i = this.mEgl.eglGetError();
    if (i != 12288) {
      throw new RuntimeException(paramString + ": EGL error: 0x" + Integer.toHexString(i));
    }
  }
  
  private EGLConfig getConfig()
  {
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    int[] arrayOfInt = new int[1];
    if (!this.mEgl.eglChooseConfig(this.mEGLDisplay, new int[] { 12339, 1, 12325, 16, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344 }, arrayOfEGLConfig, 1, arrayOfInt))
    {
      TXCLog.w("ImageEglSurface", "unable to find RGB8888  EGLConfig");
      return null;
    }
    return arrayOfEGLConfig[0];
  }
  
  public EGLSurface createOffscreenSurface(int paramInt1, int paramInt2)
  {
    this.mEGLSurface = this.mEgl.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[] { 12375, paramInt1, 12374, paramInt2, 12344 });
    checkEglError("eglCreatePbufferSurface");
    if (this.mEGLSurface == null) {
      throw new RuntimeException("surface was null");
    }
    return this.mEGLSurface;
  }
  
  public EGLSurface createWindowSurface(Object paramObject)
  {
    if ((!(paramObject instanceof Surface)) && (!(paramObject instanceof SurfaceTexture))) {
      throw new RuntimeException("invalid surface: " + paramObject);
    }
    this.mEGLSurface = this.mEgl.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, paramObject, new int[] { 12344 });
    checkEglError("eglCreateWindowSurface");
    if (this.mEGLSurface == null) {
      throw new RuntimeException("surface was null");
    }
    return this.mEGLSurface;
  }
  
  public EGLSurface getCurrentSurface()
  {
    return this.mEGLSurface;
  }
  
  public GL getGL()
  {
    return this.mEGLContext.getGL();
  }
  
  public int getGlVersion()
  {
    return 2;
  }
  
  public boolean isCurrent(EGLSurface paramEGLSurface)
  {
    return (this.mEGLContext.equals(this.mEGLContext)) && (paramEGLSurface.equals(this.mEGLSurface));
  }
  
  public void logCurrent(String paramString)
  {
    EGLDisplay localEGLDisplay = this.mEGLDisplay;
    EGLContext localEGLContext = this.mEGLContext;
    EGLSurface localEGLSurface = this.mEGLSurface;
    TXCLog.i("EglCore", "Current EGL (" + paramString + "): display=" + localEGLDisplay + ", context=" + localEGLContext + ", surface=" + localEGLSurface);
  }
  
  public void makeCurrent(EGLSurface paramEGLSurface)
  {
    EGLDisplay localEGLDisplay = this.mEGLDisplay;
    if (localEGLDisplay == EGL11.EGL_NO_DISPLAY) {
      TXCLog.d("EglCore", "NOTE: makeCurrent w/o display");
    }
    if (!this.mEgl.eglMakeCurrent(localEGLDisplay, paramEGLSurface, paramEGLSurface, this.mEGLContext)) {
      throw new RuntimeException("eglMakeCurrent failed");
    }
  }
  
  public void makeCurrent(EGLSurface paramEGLSurface1, EGLSurface paramEGLSurface2)
  {
    EGLDisplay localEGLDisplay = this.mEGLDisplay;
    if (localEGLDisplay == EGL11.EGL_NO_DISPLAY) {
      TXCLog.d("EglCore", "NOTE: makeCurrent w/o display");
    }
    if (!this.mEgl.eglMakeCurrent(localEGLDisplay, paramEGLSurface1, paramEGLSurface2, this.mEGLContext)) {
      throw new RuntimeException("eglMakeCurrent(draw,read) failed");
    }
  }
  
  public void makeNothingCurrent()
  {
    if (!this.mEgl.eglMakeCurrent(this.mEGLDisplay, EGL11.EGL_NO_SURFACE, EGL11.EGL_NO_SURFACE, EGL11.EGL_NO_CONTEXT)) {
      throw new RuntimeException("eglMakeCurrent failed");
    }
  }
  
  public String queryString(int paramInt)
  {
    return this.mEgl.eglQueryString(this.mEGLDisplay, paramInt);
  }
  
  public int querySurface(EGLSurface paramEGLSurface, int paramInt)
  {
    int[] arrayOfInt = new int[1];
    this.mEgl.eglQuerySurface(this.mEGLDisplay, paramEGLSurface, paramInt, arrayOfInt);
    return arrayOfInt[0];
  }
  
  public void release()
  {
    this.mEgl.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    this.mEgl.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
    this.mEgl.eglTerminate(this.mEGLDisplay);
  }
  
  public void releaseSurface(EGLSurface paramEGLSurface)
  {
    this.mEgl.eglDestroySurface(this.mEGLDisplay, paramEGLSurface);
  }
  
  public void setPresentationTime(EGLSurface paramEGLSurface, long paramLong) {}
  
  public boolean swapBuffers(EGLSurface paramEGLSurface)
  {
    return this.mEgl.eglSwapBuffers(this.mEGLDisplay, paramEGLSurface);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\egl\gles_EGL10\EglCore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */