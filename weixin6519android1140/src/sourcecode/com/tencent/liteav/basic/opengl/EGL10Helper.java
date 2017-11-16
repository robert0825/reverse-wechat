package com.tencent.liteav.basic.opengl;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class EGL10Helper
{
  private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
  private static final int EGL_RECORDABLE_ANDROID = 12610;
  public static final String TAG = EGL10Helper.class.getSimpleName();
  private static int[] configSpecBuffer = { 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344 };
  private static int[] configSpecWindow = { 12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344 };
  private EGL10 mEGL;
  private EGLConfig mEGLConfig;
  private EGLContext mEGLContext;
  private EGLDisplay mEGLDisplay;
  private EGLSurface mEGLSurface;
  private int mHeight = 0;
  private boolean mSharedConfig;
  private boolean mSharedContext;
  private int[] mVersion = new int[2];
  private int mWidth = 0;
  
  public static EGL10Helper createEGLSurface(EGLConfig paramEGLConfig, EGLContext paramEGLContext, Surface paramSurface, int paramInt1, int paramInt2)
  {
    EGL10Helper localEGL10Helper = new EGL10Helper();
    localEGL10Helper.mWidth = paramInt1;
    localEGL10Helper.mHeight = paramInt2;
    if (localEGL10Helper.initEGLSurface(paramEGLConfig, paramEGLContext, paramSurface)) {
      return localEGL10Helper;
    }
    return null;
  }
  
  private boolean initEGLSurface(EGLConfig paramEGLConfig, EGLContext paramEGLContext, Surface paramSurface)
  {
    boolean bool = true;
    this.mEGL = ((EGL10)EGLContext.getEGL());
    this.mEGLDisplay = this.mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    this.mEGL.eglInitialize(this.mEGLDisplay, this.mVersion);
    if (paramEGLConfig == null)
    {
      int[] arrayOfInt = new int[1];
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
      EGL10 localEGL10 = this.mEGL;
      EGLDisplay localEGLDisplay = this.mEGLDisplay;
      if (paramSurface == null)
      {
        paramEGLConfig = configSpecBuffer;
        localEGL10.eglChooseConfig(localEGLDisplay, paramEGLConfig, arrayOfEGLConfig, 1, arrayOfInt);
        this.mEGLConfig = arrayOfEGLConfig[0];
        this.mSharedConfig = true;
        label111:
        paramEGLConfig = new int[3];
        EGLConfig tmp116_115 = paramEGLConfig;
        tmp116_115[0] = '゘';
        EGLConfig tmp122_116 = tmp116_115;
        tmp122_116[1] = 2;
        EGLConfig tmp126_122 = tmp122_116;
        tmp126_122[2] = '〸';
        tmp126_122;
        if (paramEGLContext != null) {
          break label197;
        }
        this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, EGL10.EGL_NO_CONTEXT, paramEGLConfig);
        label162:
        if (this.mEGLContext != EGL10.EGL_NO_CONTEXT) {
          break label228;
        }
        cpEGL();
        bool = false;
      }
    }
    label197:
    label228:
    do
    {
      return bool;
      paramEGLConfig = configSpecWindow;
      break;
      this.mEGLConfig = paramEGLConfig;
      break label111;
      this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, paramEGLContext, paramEGLConfig);
      this.mSharedContext = true;
      break label162;
      int i = this.mWidth;
      int j = this.mHeight;
      if (paramSurface == null) {}
      for (this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[] { 12375, i, 12374, j, 12344 }); this.mEGLSurface == EGL10.EGL_NO_SURFACE; this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, paramSurface, null))
      {
        cpEGL();
        return false;
      }
    } while (this.mEGL.eglMakeCurrent(this.mEGLDisplay, this.mEGLSurface, this.mEGLSurface, this.mEGLContext));
    cpEGL();
    return false;
  }
  
  public void cpEGL()
  {
    int i = this.mEGL.eglGetError();
    if (i != 12288) {
      TXCLog.e(TAG, "EGL error: 0x" + Integer.toHexString(i));
    }
  }
  
  public EGLConfig getConfig()
  {
    return this.mEGLConfig;
  }
  
  public EGLContext getContext()
  {
    return this.mEGLContext;
  }
  
  public void makeCurrent()
  {
    this.mEGL.eglMakeCurrent(this.mEGLDisplay, this.mEGLSurface, this.mEGLSurface, this.mEGLContext);
    cpEGL();
  }
  
  public void release()
  {
    this.mEGL.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    if (this.mEGLSurface != null) {
      this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
    }
    if (this.mEGLContext != null) {
      this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
    }
    this.mEGL.eglTerminate(this.mEGLDisplay);
    cpEGL();
    this.mEGLDisplay = null;
    this.mEGLSurface = null;
    this.mEGLDisplay = null;
  }
  
  public void releaseSurface()
  {
    this.mEGL.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    if (this.mEGLSurface != null) {
      this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
    }
    this.mEGLSurface = null;
  }
  
  public boolean swap()
  {
    boolean bool = this.mEGL.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
    cpEGL();
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\opengl\EGL10Helper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */