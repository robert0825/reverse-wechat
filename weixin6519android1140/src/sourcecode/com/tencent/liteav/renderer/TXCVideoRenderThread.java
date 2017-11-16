package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

class TXCVideoRenderThread
  extends Thread
{
  private static final String TAG = "TXCVideoRenderThread";
  private int EGL_CONTEXT_CLIENT_VERSION = 12440;
  private int EGL_OPENGL_ES2_BIT = 4;
  private EGL10 egl;
  private EGLConfig eglConfig;
  private EGLContext eglContext;
  private EGLDisplay eglDisplay;
  private EGLSurface eglSurface;
  private WeakReference<TXCVideoRender> mRenderWeakRef;
  private boolean mRunning = false;
  private WeakReference<SurfaceTexture> mSurfaceTexture;
  
  TXCVideoRenderThread(WeakReference<TXCVideoRender> paramWeakReference)
  {
    this.mRenderWeakRef = paramWeakReference;
  }
  
  private EGLConfig chooseEglConfig()
  {
    int[] arrayOfInt1 = new int[1];
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    int[] arrayOfInt2 = getAttributes();
    if (!this.egl.eglChooseConfig(this.eglDisplay, arrayOfInt2, arrayOfEGLConfig, 1, arrayOfInt1)) {
      throw new IllegalArgumentException("Failed to choose config:" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
    }
    if (arrayOfInt1[0] > 0) {
      return arrayOfEGLConfig[0];
    }
    return null;
  }
  
  private EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, EGLContext paramEGLContext)
  {
    return paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, paramEGLContext, new int[] { this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344 });
  }
  
  private void deinitEGL()
  {
    this.egl.eglMakeCurrent(this.eglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
    this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
    this.egl.eglTerminate(this.eglDisplay);
    this.mSurfaceTexture = null;
    TXCLog.w("TXCVideoRenderThread", "vrender: uninit egl @context=" + this.eglContext + ",surface=" + this.eglSurface);
  }
  
  private void destroyTextureRender()
  {
    try
    {
      TXCVideoRender localTXCVideoRender = (TXCVideoRender)this.mRenderWeakRef.get();
      if (localTXCVideoRender != null) {
        localTXCVideoRender.destroyTextureRender();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private boolean drawFrame()
  {
    try
    {
      Thread.sleep(10L);
      if (this.mRenderWeakRef != null)
      {
        TXCVideoRender localTXCVideoRender = (TXCVideoRender)this.mRenderWeakRef.get();
        if (localTXCVideoRender != null)
        {
          boolean bool = localTXCVideoRender.drawFrame();
          return bool;
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  private int[] getAttributes()
  {
    return new int[] { 12352, this.EGL_OPENGL_ES2_BIT, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344 };
  }
  
  private void initEGL()
  {
    Object localObject = (TXCVideoRender)this.mRenderWeakRef.get();
    if (localObject == null) {}
    for (;;)
    {
      return;
      this.egl = ((EGL10)EGLContext.getEGL());
      this.eglDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      int[] arrayOfInt = new int[2];
      this.egl.eglInitialize(this.eglDisplay, arrayOfInt);
      this.eglConfig = chooseEglConfig();
      localObject = ((TXCVideoRender)localObject).getSurfaceTexture();
      if (localObject != null) {
        this.mSurfaceTexture = new WeakReference(localObject);
      }
      this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, localObject, null);
      this.eglContext = createContext(this.egl, this.eglDisplay, this.eglConfig, EGL10.EGL_NO_CONTEXT);
      TXCLog.w("TXCVideoRenderThread", "vrender: init egl @context=" + this.eglContext + ",surface=" + this.eglSurface);
      try
      {
        if ((this.eglSurface == null) || (this.eglSurface == EGL10.EGL_NO_SURFACE)) {
          throw new RuntimeException("GL error:" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
        }
        if (!this.egl.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
          throw new RuntimeException("GL Make current Error" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
        }
      }
      catch (Exception localException) {}
    }
  }
  
  private void initTextureRender()
  {
    try
    {
      TXCVideoRender localTXCVideoRender = (TXCVideoRender)this.mRenderWeakRef.get();
      if (localTXCVideoRender != null) {
        localTXCVideoRender.initTextureRender();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void destroySurface()
  {
    try
    {
      this.egl.eglMakeCurrent(this.eglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
      if (this.eglSurface != EGL10.EGL_NO_SURFACE)
      {
        this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
        this.eglSurface = EGL10.EGL_NO_SURFACE;
      }
      TXCLog.w("TXCVideoRenderThread", "vrender: destroy surface sucess @context=" + this.eglContext + ",surface=" + this.eglSurface);
      return;
    }
    catch (Exception localException)
    {
      TXCLog.w("TXCVideoRenderThread", "vrender: destroy surface fail @context=" + this.eglContext + ",surface=" + this.eglSurface);
    }
  }
  
  public EGLContext getGLContext()
  {
    return this.eglContext;
  }
  
  public void initSurface(SurfaceTexture paramSurfaceTexture)
  {
    try
    {
      if ((SurfaceTexture)this.mSurfaceTexture.get() == paramSurfaceTexture)
      {
        TXCLog.w("TXCVideoRenderThread", "vrender: ignore initSurface @" + paramSurfaceTexture);
        return;
      }
      destroySurface();
      this.mSurfaceTexture = new WeakReference(paramSurfaceTexture);
      this.eglSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, paramSurfaceTexture, null);
      if ((this.eglSurface == null) || (this.eglSurface == EGL10.EGL_NO_SURFACE)) {
        throw new RuntimeException("GL error:" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
      }
    }
    catch (Exception paramSurfaceTexture)
    {
      TXCLog.w("TXCVideoRenderThread", "vrender: init surface fail @context=" + this.eglContext + ",surface=" + this.eglSurface);
      return;
    }
    if (!this.egl.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext)) {
      throw new RuntimeException("GL Make current Error" + GLUtils.getEGLErrorString(this.egl.eglGetError()));
    }
    TXCLog.w("TXCVideoRenderThread", "vrender: init surface sucess @context=" + this.eglContext + ",surface=" + this.eglSurface);
  }
  
  public void quit()
  {
    this.mRunning = false;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: new 66	java/lang/StringBuilder
    //   4: dup
    //   5: ldc -24
    //   7: invokespecial 71	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   10: aload_0
    //   11: invokevirtual 236	com/tencent/liteav/renderer/TXCVideoRenderThread:getId	()J
    //   14: invokevirtual 239	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   17: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   20: invokevirtual 242	com/tencent/liteav/renderer/TXCVideoRenderThread:setName	(Ljava/lang/String;)V
    //   23: aload_0
    //   24: iconst_1
    //   25: putfield 39	com/tencent/liteav/renderer/TXCVideoRenderThread:mRunning	Z
    //   28: aload_0
    //   29: invokespecial 244	com/tencent/liteav/renderer/TXCVideoRenderThread:initEGL	()V
    //   32: aload_0
    //   33: invokespecial 245	com/tencent/liteav/renderer/TXCVideoRenderThread:initTextureRender	()V
    //   36: aload_0
    //   37: getfield 39	com/tencent/liteav/renderer/TXCVideoRenderThread:mRunning	Z
    //   40: ifeq +52 -> 92
    //   43: aload_0
    //   44: invokespecial 246	com/tencent/liteav/renderer/TXCVideoRenderThread:drawFrame	()Z
    //   47: ifeq -11 -> 36
    //   50: aload_0
    //   51: getfield 54	com/tencent/liteav/renderer/TXCVideoRenderThread:egl	Ljavax/microedition/khronos/egl/EGL10;
    //   54: ifnull -18 -> 36
    //   57: aload_0
    //   58: getfield 56	com/tencent/liteav/renderer/TXCVideoRenderThread:eglDisplay	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   61: ifnull -25 -> 36
    //   64: aload_0
    //   65: getfield 115	com/tencent/liteav/renderer/TXCVideoRenderThread:eglSurface	Ljavax/microedition/khronos/egl/EGLSurface;
    //   68: ifnull -32 -> 36
    //   71: aload_0
    //   72: getfield 54	com/tencent/liteav/renderer/TXCVideoRenderThread:egl	Ljavax/microedition/khronos/egl/EGL10;
    //   75: aload_0
    //   76: getfield 56	com/tencent/liteav/renderer/TXCVideoRenderThread:eglDisplay	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   79: aload_0
    //   80: getfield 115	com/tencent/liteav/renderer/TXCVideoRenderThread:eglSurface	Ljavax/microedition/khronos/egl/EGLSurface;
    //   83: invokeinterface 249 3 0
    //   88: pop
    //   89: goto -53 -> 36
    //   92: aload_0
    //   93: invokespecial 250	com/tencent/liteav/renderer/TXCVideoRenderThread:destroyTextureRender	()V
    //   96: aload_0
    //   97: invokespecial 252	com/tencent/liteav/renderer/TXCVideoRenderThread:deinitEGL	()V
    //   100: return
    //   101: astore_1
    //   102: aload_1
    //   103: athrow
    //   104: astore_1
    //   105: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	TXCVideoRenderThread
    //   101	2	1	localObject	Object
    //   104	1	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   23	36	101	finally
    //   36	89	101	finally
    //   92	100	101	finally
    //   23	36	104	java/lang/Exception
    //   36	89	104	java/lang/Exception
    //   92	100	104	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCVideoRenderThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */