package com.tencent.liteav.renderer;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

public class TXCGLSurfaceViewBase
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  public static final int DEBUG_CHECK_GL_ERROR = 1;
  public static final int DEBUG_LOG_GL_CALLS = 2;
  private static final boolean LOG_ATTACH_DETACH = false;
  private static final boolean LOG_EGL = false;
  private static final boolean LOG_PAUSE_RESUME = false;
  private static final boolean LOG_RENDERER = false;
  private static final boolean LOG_RENDERER_DRAW_FRAME = false;
  private static final boolean LOG_SURFACE = false;
  private static final boolean LOG_THREADS = false;
  public static final int RENDERMODE_CONTINUOUSLY = 1;
  public static final int RENDERMODE_WHEN_DIRTY = 0;
  private static final String TAG = "TXCGLSurfaceViewBase";
  private static final GLThreadManager sGLThreadManager = new GLThreadManager();
  private int mDebugFlags;
  private boolean mDetached;
  private EGLConfigChooser mEGLConfigChooser;
  private int mEGLContextClientVersion;
  private EGLContextFactory mEGLContextFactory;
  private EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
  protected boolean mEnableBackgroundRun = false;
  private GLThread mGLThread;
  private GLWrapper mGLWrapper;
  protected boolean mHasDefaultContext;
  protected boolean mHasDefaultSurface;
  private boolean mPreserveEGLContextOnPause;
  private GLSurfaceView.Renderer mRenderer;
  protected boolean mRunninInBackground = false;
  protected final WeakReference<TXCGLSurfaceViewBase> mThisWeakRef = new WeakReference(this);
  
  public TXCGLSurfaceViewBase(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public TXCGLSurfaceViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void checkRenderThreadState()
  {
    if (this.mGLThread != null) {
      throw new IllegalStateException("setRenderer has already been called for this instance.");
    }
  }
  
  private void init()
  {
    getHolder().addCallback(this);
  }
  
  protected int afterSwapBuffer()
  {
    return 0;
  }
  
  public void enableBackgroundRun(boolean paramBoolean)
  {
    this.mEnableBackgroundRun = paramBoolean;
    if ((!this.mEnableBackgroundRun) && (this.mRunninInBackground) && (this.mGLThread != null))
    {
      TXCLog.w("TXCGLSurfaceViewBase", "background capture destroy surface when not enable background run");
      this.mGLThread.surfaceDestroyed();
    }
  }
  
  protected void finalize()
  {
    try
    {
      if (this.mGLThread != null) {
        this.mGLThread.requestExitAndWait();
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public int getDebugFlags()
  {
    return this.mDebugFlags;
  }
  
  public EglHelper getEGLHelper()
  {
    return this.mGLThread.getEGLHelper();
  }
  
  public boolean getPreserveEGLContextOnPause()
  {
    return this.mPreserveEGLContextOnPause;
  }
  
  public int getRenderMode()
  {
    return this.mGLThread.getRenderMode();
  }
  
  public boolean isSurfaceBind()
  {
    return this.mGLThread.isSurfaceBind();
  }
  
  public boolean makeCurrent()
  {
    return this.mGLThread.makeCurrent();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.mDetached) && (this.mRenderer != null)) {
      if (this.mGLThread == null) {
        break label74;
      }
    }
    label74:
    for (int i = this.mGLThread.getRenderMode();; i = 1)
    {
      this.mGLThread = new GLThread(this.mThisWeakRef);
      if (i != 1) {
        this.mGLThread.setRenderMode(i);
      }
      this.mGLThread.start();
      this.mDetached = false;
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    if (this.mGLThread != null) {
      this.mGLThread.requestExitAndWait();
    }
    this.mDetached = true;
    super.onDetachedFromWindow();
  }
  
  public void onPause()
  {
    this.mGLThread.onPause();
  }
  
  public void onResume()
  {
    this.mGLThread.onResume();
  }
  
  public void queueEvent(Runnable paramRunnable)
  {
    this.mGLThread.queueEvent(paramRunnable);
  }
  
  public void requestRender()
  {
    this.mGLThread.requestRender();
  }
  
  public void setDebugFlags(int paramInt)
  {
    this.mDebugFlags = paramInt;
  }
  
  public void setEGLConfigChooser(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    setEGLConfigChooser(new ComponentSizeChooser(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6));
  }
  
  public void setEGLConfigChooser(EGLConfigChooser paramEGLConfigChooser)
  {
    checkRenderThreadState();
    this.mEGLConfigChooser = paramEGLConfigChooser;
  }
  
  public void setEGLConfigChooser(boolean paramBoolean)
  {
    setEGLConfigChooser(new SimpleEGLConfigChooser(paramBoolean));
  }
  
  public void setEGLContextClientVersion(int paramInt)
  {
    checkRenderThreadState();
    this.mEGLContextClientVersion = paramInt;
  }
  
  public void setEGLContextFactory(EGLContextFactory paramEGLContextFactory)
  {
    checkRenderThreadState();
    this.mEGLContextFactory = paramEGLContextFactory;
  }
  
  public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory paramEGLWindowSurfaceFactory)
  {
    checkRenderThreadState();
    this.mEGLWindowSurfaceFactory = paramEGLWindowSurfaceFactory;
  }
  
  public void setGLWrapper(GLWrapper paramGLWrapper)
  {
    this.mGLWrapper = paramGLWrapper;
  }
  
  public void setPreserveEGLContextOnPause(boolean paramBoolean)
  {
    this.mPreserveEGLContextOnPause = paramBoolean;
  }
  
  public void setRenderMode(int paramInt)
  {
    this.mGLThread.setRenderMode(paramInt);
  }
  
  public void setRenderer(GLSurfaceView.Renderer paramRenderer)
  {
    checkRenderThreadState();
    if (this.mEGLConfigChooser == null) {
      this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
    }
    if (this.mEGLContextFactory == null) {
      this.mEGLContextFactory = new DefaultContextFactory();
    }
    if (this.mEGLWindowSurfaceFactory == null) {
      this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
    }
    this.mRenderer = paramRenderer;
    this.mGLThread = new GLThread(this.mThisWeakRef);
    this.mGLThread.start();
  }
  
  protected void setRunInBackground(boolean paramBoolean)
  {
    this.mRunninInBackground = paramBoolean;
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mGLThread.onWindowResize(paramInt2, paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.mGLThread.surfaceCreated();
    setRunInBackground(false);
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    setRunInBackground(true);
    if (!this.mEnableBackgroundRun) {
      this.mGLThread.surfaceDestroyed();
    }
  }
  
  public int swapBuffer()
  {
    return this.mGLThread.swapBuffer();
  }
  
  private abstract class BaseConfigChooser
    implements TXCGLSurfaceViewBase.EGLConfigChooser
  {
    protected int[] mConfigSpec = filterConfigSpec(paramArrayOfInt);
    
    public BaseConfigChooser(int[] paramArrayOfInt) {}
    
    private int[] filterConfigSpec(int[] paramArrayOfInt)
    {
      if (TXCGLSurfaceViewBase.this.mEGLContextClientVersion != 2) {
        return paramArrayOfInt;
      }
      int i = paramArrayOfInt.length;
      int[] arrayOfInt = new int[i + 2];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i - 1);
      arrayOfInt[(i - 1)] = 12352;
      arrayOfInt[i] = 4;
      arrayOfInt[(i + 1)] = 12344;
      return arrayOfInt;
    }
    
    public EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
    {
      int[] arrayOfInt = new int[1];
      if (!paramEGL10.eglChooseConfig(paramEGLDisplay, this.mConfigSpec, null, 0, arrayOfInt)) {
        throw new IllegalArgumentException("eglChooseConfig failed");
      }
      int i = arrayOfInt[0];
      if (i <= 0) {
        throw new IllegalArgumentException("No configs match configSpec");
      }
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[i];
      if (!paramEGL10.eglChooseConfig(paramEGLDisplay, this.mConfigSpec, arrayOfEGLConfig, i, arrayOfInt)) {
        throw new IllegalArgumentException("eglChooseConfig#2 failed");
      }
      paramEGL10 = chooseConfig(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
      if (paramEGL10 == null) {
        throw new IllegalArgumentException("No config chosen");
      }
      return paramEGL10;
    }
    
    abstract EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig);
  }
  
  private class ComponentSizeChooser
    extends TXCGLSurfaceViewBase.BaseConfigChooser
  {
    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue = new int[1];
    
    public ComponentSizeChooser(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      super(new int[] { 12324, paramInt1, 12323, paramInt2, 12322, paramInt3, 12321, paramInt4, 12325, paramInt5, 12326, paramInt6, 12344 });
      this.mRedSize = paramInt1;
      this.mGreenSize = paramInt2;
      this.mBlueSize = paramInt3;
      this.mAlphaSize = paramInt4;
      this.mDepthSize = paramInt5;
      this.mStencilSize = paramInt6;
    }
    
    private int findConfigAttrib(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt1, int paramInt2)
    {
      if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt1, this.mValue)) {
        paramInt2 = this.mValue[0];
      }
      return paramInt2;
    }
    
    public EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
    {
      int j = paramArrayOfEGLConfig.length;
      int i = 0;
      while (i < j)
      {
        EGLConfig localEGLConfig = paramArrayOfEGLConfig[i];
        int k = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12325, 0);
        int m = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12326, 0);
        if ((k >= this.mDepthSize) && (m >= this.mStencilSize))
        {
          k = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12324, 0);
          m = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12323, 0);
          int n = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12322, 0);
          int i1 = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12321, 0);
          if ((k == this.mRedSize) && (m == this.mGreenSize) && (n == this.mBlueSize) && (i1 == this.mAlphaSize)) {
            return localEGLConfig;
          }
        }
        i += 1;
      }
      return null;
    }
  }
  
  private class DefaultContextFactory
    implements TXCGLSurfaceViewBase.EGLContextFactory
  {
    private int EGL_CONTEXT_CLIENT_VERSION = 12440;
    
    public DefaultContextFactory() {}
    
    public EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
    {
      int[] arrayOfInt = new int[3];
      arrayOfInt[0] = this.EGL_CONTEXT_CLIENT_VERSION;
      arrayOfInt[1] = TXCGLSurfaceViewBase.this.mEGLContextClientVersion;
      arrayOfInt[2] = 12344;
      EGLContext localEGLContext = EGL10.EGL_NO_CONTEXT;
      if (TXCGLSurfaceViewBase.this.mEGLContextClientVersion != 0) {}
      for (;;)
      {
        return paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, localEGLContext, arrayOfInt);
        arrayOfInt = null;
      }
    }
    
    public void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
    {
      if (!paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext))
      {
        TXCLog.e("DefaultContextFactory", "display:" + paramEGLDisplay + " context: " + paramEGLContext);
        TXCGLSurfaceViewBase.EglHelper.throwEglException("eglDestroyContex", paramEGL10.eglGetError());
      }
    }
  }
  
  private static class DefaultWindowSurfaceFactory
    implements TXCGLSurfaceViewBase.EGLWindowSurfaceFactory
  {
    public EGLSurface createWindowSurface(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject)
    {
      try
      {
        paramEGL10 = paramEGL10.eglCreateWindowSurface(paramEGLDisplay, paramEGLConfig, paramObject, null);
        return paramEGL10;
      }
      catch (IllegalArgumentException paramEGL10)
      {
        TXCLog.e("TXCGLSurfaceViewBase", "eglCreateWindowSurface");
        TXCLog.e("TXCGLSurfaceViewBase", paramEGL10.toString());
      }
      return null;
    }
    
    public void destroySurface(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
    {
      paramEGL10.eglDestroySurface(paramEGLDisplay, paramEGLSurface);
    }
  }
  
  public static abstract interface EGLConfigChooser
  {
    public abstract EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay);
  }
  
  public static abstract interface EGLContextFactory
  {
    public abstract EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig);
    
    public abstract void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext);
  }
  
  public static abstract interface EGLWindowSurfaceFactory
  {
    public abstract EGLSurface createWindowSurface(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, Object paramObject);
    
    public abstract void destroySurface(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface);
  }
  
  public static class EglHelper
  {
    EGL10 mEgl;
    EGLConfig mEglConfig;
    EGLContext mEglContext;
    EGLDisplay mEglDisplay;
    EGLSurface mEglSurface;
    private WeakReference<TXCGLSurfaceViewBase> mGLSurfaceViewWeakRef;
    
    public EglHelper(WeakReference<TXCGLSurfaceViewBase> paramWeakReference)
    {
      this.mGLSurfaceViewWeakRef = paramWeakReference;
    }
    
    private void destroySurfaceImp()
    {
      if ((this.mEglSurface != null) && (this.mEglSurface != EGL10.EGL_NO_SURFACE))
      {
        this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
        if (localTXCGLSurfaceViewBase != null)
        {
          localTXCGLSurfaceViewBase.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
          localTXCGLSurfaceViewBase.mHasDefaultSurface = false;
        }
        this.mEglSurface = null;
      }
    }
    
    public static String formatEglError(String paramString, int paramInt)
    {
      return paramString + " failed: " + paramInt;
    }
    
    public static void logEglErrorAsWarning(String paramString1, String paramString2, int paramInt)
    {
      TXCLog.w(paramString1, formatEglError(paramString2, paramInt));
    }
    
    private void throwEglException(String paramString)
    {
      throwEglException(paramString, this.mEgl.eglGetError());
    }
    
    public static void throwEglException(String paramString, int paramInt)
    {
      throw new RuntimeException(formatEglError(paramString, paramInt));
    }
    
    GL createGL()
    {
      GL localGL2 = this.mEglContext.getGL();
      TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
      Object localObject = localGL2;
      GL localGL1;
      int i;
      if (localTXCGLSurfaceViewBase != null)
      {
        localGL1 = localGL2;
        if (localTXCGLSurfaceViewBase.mGLWrapper != null) {
          localGL1 = localTXCGLSurfaceViewBase.mGLWrapper.wrap(localGL2);
        }
        localObject = localGL1;
        if ((localTXCGLSurfaceViewBase.mDebugFlags & 0x3) != 0)
        {
          i = 0;
          if ((localTXCGLSurfaceViewBase.mDebugFlags & 0x1) != 0) {
            i = 1;
          }
          if ((localTXCGLSurfaceViewBase.mDebugFlags & 0x2) == 0) {
            break label106;
          }
        }
      }
      label106:
      for (localObject = new TXCGLSurfaceViewBase.LogWriter();; localObject = null)
      {
        localObject = GLDebugHelper.wrap(localGL1, i, (Writer)localObject);
        return (GL)localObject;
      }
    }
    
    public boolean createSurface()
    {
      if (this.mEgl == null) {
        throw new RuntimeException("egl not initialized");
      }
      if (this.mEglDisplay == null) {
        throw new RuntimeException("eglDisplay not initialized");
      }
      if (this.mEglConfig == null) {
        throw new RuntimeException("mEglConfig not initialized");
      }
      destroySurfaceImp();
      TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
      if (localTXCGLSurfaceViewBase != null) {}
      for (this.mEglSurface = localTXCGLSurfaceViewBase.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, localTXCGLSurfaceViewBase.getHolder()); (this.mEglSurface == null) || (this.mEglSurface == EGL10.EGL_NO_SURFACE); this.mEglSurface = null)
      {
        if (this.mEgl.eglGetError() == 12299) {
          TXCLog.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
        }
        return false;
      }
      if (!this.mEgl.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext))
      {
        logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
        return false;
      }
      if (localTXCGLSurfaceViewBase != null) {
        localTXCGLSurfaceViewBase.mHasDefaultSurface = true;
      }
      return true;
    }
    
    public boolean createSurface(Surface paramSurface, boolean paramBoolean)
    {
      if (this.mEgl == null) {
        throw new RuntimeException("egl not initialized");
      }
      if (this.mEglDisplay == null) {
        throw new RuntimeException("eglDisplay not initialized");
      }
      if (this.mEglConfig == null) {
        throw new RuntimeException("mEglConfig not initialized");
      }
      destroySurfaceImp();
      this.mEglSurface = ((TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get()).mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, paramSurface);
      if ((this.mEglSurface == null) || (this.mEglSurface == EGL10.EGL_NO_SURFACE))
      {
        if (this.mEgl.eglGetError() == 12299) {
          TXCLog.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
        }
        return false;
      }
      if ((paramBoolean) && (!this.mEgl.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext)))
      {
        logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
        return false;
      }
      return true;
    }
    
    public void destroyExtraSurface()
    {
      if ((this.mEglSurface != null) && (this.mEglSurface != EGL10.EGL_NO_SURFACE))
      {
        this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
        if (localTXCGLSurfaceViewBase != null) {
          localTXCGLSurfaceViewBase.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
        }
        this.mEglSurface = null;
      }
    }
    
    public void destroySurface()
    {
      destroySurfaceImp();
    }
    
    public void finish()
    {
      if (this.mEglContext != null)
      {
        TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
        if (localTXCGLSurfaceViewBase != null) {
          localTXCGLSurfaceViewBase.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
        }
        this.mEglContext = null;
      }
      if (this.mEglDisplay != null)
      {
        this.mEgl.eglTerminate(this.mEglDisplay);
        this.mEglDisplay = null;
      }
    }
    
    public boolean makeCurrent()
    {
      if (!this.mEgl.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext))
      {
        logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
        return false;
      }
      return true;
    }
    
    public void start()
    {
      this.mEgl = ((EGL10)EGLContext.getEGL());
      this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      if (this.mEglDisplay == EGL10.EGL_NO_DISPLAY) {
        throw new RuntimeException("eglGetDisplay failed");
      }
      Object localObject = new int[2];
      if (!this.mEgl.eglInitialize(this.mEglDisplay, (int[])localObject)) {
        throw new RuntimeException("eglInitialize failed");
      }
      localObject = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
      if (localObject == null) {
        this.mEglConfig = null;
      }
      for (this.mEglContext = null;; this.mEglContext = ((TXCGLSurfaceViewBase)localObject).mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig))
      {
        if ((this.mEglContext == null) || (this.mEglContext == EGL10.EGL_NO_CONTEXT))
        {
          this.mEglContext = null;
          throwEglException("createContext");
        }
        if (localObject != null) {
          ((TXCGLSurfaceViewBase)localObject).mHasDefaultContext = true;
        }
        this.mEglSurface = null;
        return;
        this.mEglConfig = ((TXCGLSurfaceViewBase)localObject).mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
      }
    }
    
    public void start(EglHelper paramEglHelper)
    {
      this.mEgl = ((EGL10)EGLContext.getEGL());
      this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
      if (this.mEglDisplay == EGL10.EGL_NO_DISPLAY) {
        throw new RuntimeException("eglGetDisplay failed");
      }
      int[] arrayOfInt = new int[2];
      if (!this.mEgl.eglInitialize(this.mEglDisplay, arrayOfInt)) {
        throw new RuntimeException("eglInitialize failed");
      }
      if ((TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get() == null)
      {
        this.mEglConfig = null;
        this.mEglContext = null;
        return;
      }
      this.mEglConfig = paramEglHelper.mEglConfig;
      this.mEglContext = paramEglHelper.mEglContext;
    }
    
    public int swap()
    {
      if (!this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
        return this.mEgl.eglGetError();
      }
      return 12288;
    }
    
    public int swapBuffer()
    {
      return swap();
    }
  }
  
  static class GLThread
    extends Thread
  {
    private TXCGLSurfaceViewBase.EglHelper mEglHelper;
    private ArrayList<Runnable> mEventQueue = new ArrayList();
    private boolean mExited;
    private boolean mFinishedCreatingEglSurface;
    private WeakReference<TXCGLSurfaceViewBase> mGLSurfaceViewWeakRef;
    private boolean mHasSurface;
    private boolean mHaveEglContext;
    private boolean mHaveEglSurface;
    private int mHeight = 0;
    private boolean mPaused;
    private boolean mRenderComplete;
    private int mRenderMode = 1;
    private boolean mRequestPaused;
    private boolean mRequestRender = true;
    private boolean mShouldExit;
    private boolean mShouldReleaseEglContext;
    private boolean mSizeChanged = true;
    private boolean mSurfaceIsBad;
    private boolean mWaitingForSurface;
    private int mWidth = 0;
    
    GLThread(WeakReference<TXCGLSurfaceViewBase> paramWeakReference)
    {
      this.mGLSurfaceViewWeakRef = paramWeakReference;
    }
    
    /* Error */
    private void guardedRun()
    {
      // Byte code:
      //   0: aload_0
      //   1: new 68	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper
      //   4: dup
      //   5: aload_0
      //   6: getfield 56	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
      //   9: invokespecial 70	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:<init>	(Ljava/lang/ref/WeakReference;)V
      //   12: putfield 72	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEglHelper	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper;
      //   15: aload_0
      //   16: iconst_0
      //   17: putfield 74	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglContext	Z
      //   20: aload_0
      //   21: iconst_0
      //   22: putfield 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglSurface	Z
      //   25: iconst_0
      //   26: istore 10
      //   28: aconst_null
      //   29: astore 22
      //   31: iconst_0
      //   32: istore_1
      //   33: iconst_0
      //   34: istore_3
      //   35: iconst_0
      //   36: istore 5
      //   38: iconst_0
      //   39: istore 6
      //   41: iconst_0
      //   42: istore 7
      //   44: iconst_0
      //   45: istore 8
      //   47: iconst_0
      //   48: istore 9
      //   50: aconst_null
      //   51: astore 21
      //   53: iconst_0
      //   54: istore_2
      //   55: iconst_0
      //   56: istore 4
      //   58: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   61: astore 23
      //   63: aload 23
      //   65: monitorenter
      //   66: iload 10
      //   68: istore 11
      //   70: iload 7
      //   72: istore 10
      //   74: iload 4
      //   76: istore 14
      //   78: aload_0
      //   79: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mShouldExit	Z
      //   82: ifeq +34 -> 116
      //   85: aload 23
      //   87: monitorexit
      //   88: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   91: astore 21
      //   93: aload 21
      //   95: monitorenter
      //   96: aload_0
      //   97: invokespecial 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglSurfaceLocked	()V
      //   100: aload_0
      //   101: invokespecial 88	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglContextLocked	()V
      //   104: aload 21
      //   106: monitorexit
      //   107: return
      //   108: astore 22
      //   110: aload 21
      //   112: monitorexit
      //   113: aload 22
      //   115: athrow
      //   116: aload_0
      //   117: getfield 44	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEventQueue	Ljava/util/ArrayList;
      //   120: invokevirtual 92	java/util/ArrayList:isEmpty	()Z
      //   123: ifne +93 -> 216
      //   126: aload_0
      //   127: getfield 44	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEventQueue	Ljava/util/ArrayList;
      //   130: iconst_0
      //   131: invokevirtual 96	java/util/ArrayList:remove	(I)Ljava/lang/Object;
      //   134: checkcast 98	java/lang/Runnable
      //   137: astore 21
      //   139: iload 10
      //   141: istore 7
      //   143: iload 6
      //   145: istore 12
      //   147: iload_1
      //   148: istore 4
      //   150: iload 11
      //   152: istore 10
      //   154: iload 7
      //   156: istore 6
      //   158: iload 12
      //   160: istore 7
      //   162: iload_2
      //   163: istore_1
      //   164: iload 14
      //   166: istore_2
      //   167: aload 23
      //   169: monitorexit
      //   170: aload 21
      //   172: ifnull +614 -> 786
      //   175: aload 21
      //   177: invokeinterface 101 1 0
      //   182: iload 6
      //   184: istore 11
      //   186: aconst_null
      //   187: astore 21
      //   189: iload_1
      //   190: istore 12
      //   192: iload_2
      //   193: istore 6
      //   195: iload 4
      //   197: istore_1
      //   198: iload 12
      //   200: istore_2
      //   201: iload 6
      //   203: istore 4
      //   205: iload 7
      //   207: istore 6
      //   209: iload 11
      //   211: istore 7
      //   213: goto -155 -> 58
      //   216: aload_0
      //   217: getfield 103	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mPaused	Z
      //   220: aload_0
      //   221: getfield 105	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mRequestPaused	Z
      //   224: if_icmpeq +960 -> 1184
      //   227: aload_0
      //   228: getfield 105	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mRequestPaused	Z
      //   231: istore 19
      //   233: aload_0
      //   234: aload_0
      //   235: getfield 105	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mRequestPaused	Z
      //   238: putfield 103	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mPaused	Z
      //   241: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   244: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   247: iload_3
      //   248: istore 4
      //   250: aload_0
      //   251: getfield 112	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mShouldReleaseEglContext	Z
      //   254: ifeq +19 -> 273
      //   257: aload_0
      //   258: invokespecial 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglSurfaceLocked	()V
      //   261: aload_0
      //   262: invokespecial 88	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglContextLocked	()V
      //   265: aload_0
      //   266: iconst_0
      //   267: putfield 112	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mShouldReleaseEglContext	Z
      //   270: iconst_1
      //   271: istore 4
      //   273: iload 10
      //   275: istore 7
      //   277: iload 10
      //   279: ifeq +14 -> 293
      //   282: aload_0
      //   283: invokespecial 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglSurfaceLocked	()V
      //   286: aload_0
      //   287: invokespecial 88	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglContextLocked	()V
      //   290: iconst_0
      //   291: istore 7
      //   293: iload 19
      //   295: ifeq +14 -> 309
      //   298: aload_0
      //   299: getfield 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglSurface	Z
      //   302: ifeq +7 -> 309
      //   305: aload_0
      //   306: invokespecial 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglSurfaceLocked	()V
      //   309: iload 19
      //   311: ifeq +48 -> 359
      //   314: aload_0
      //   315: getfield 74	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglContext	Z
      //   318: ifeq +41 -> 359
      //   321: aload_0
      //   322: getfield 56	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
      //   325: invokevirtual 118	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   328: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
      //   331: astore 24
      //   333: aload 24
      //   335: ifnonnull +312 -> 647
      //   338: iconst_0
      //   339: istore 20
      //   341: iload 20
      //   343: ifeq +12 -> 355
      //   346: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   349: invokevirtual 123	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:shouldReleaseEGLContextWhenPausing	()Z
      //   352: ifeq +7 -> 359
      //   355: aload_0
      //   356: invokespecial 88	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglContextLocked	()V
      //   359: iload 19
      //   361: ifeq +19 -> 380
      //   364: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   367: invokevirtual 126	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:shouldTerminateEGLWhenPausing	()Z
      //   370: ifeq +10 -> 380
      //   373: aload_0
      //   374: getfield 72	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEglHelper	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper;
      //   377: invokevirtual 129	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:finish	()V
      //   380: aload_0
      //   381: getfield 131	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHasSurface	Z
      //   384: ifne +37 -> 421
      //   387: aload_0
      //   388: getfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mWaitingForSurface	Z
      //   391: ifne +30 -> 421
      //   394: aload_0
      //   395: getfield 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglSurface	Z
      //   398: ifeq +7 -> 405
      //   401: aload_0
      //   402: invokespecial 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglSurfaceLocked	()V
      //   405: aload_0
      //   406: iconst_1
      //   407: putfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mWaitingForSurface	Z
      //   410: aload_0
      //   411: iconst_0
      //   412: putfield 135	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mSurfaceIsBad	Z
      //   415: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   418: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   421: aload_0
      //   422: getfield 131	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHasSurface	Z
      //   425: ifeq +21 -> 446
      //   428: aload_0
      //   429: getfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mWaitingForSurface	Z
      //   432: ifeq +14 -> 446
      //   435: aload_0
      //   436: iconst_0
      //   437: putfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mWaitingForSurface	Z
      //   440: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   443: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   446: iload 14
      //   448: istore 12
      //   450: iload 5
      //   452: istore 13
      //   454: iload 14
      //   456: ifeq +20 -> 476
      //   459: iconst_0
      //   460: istore 13
      //   462: iconst_0
      //   463: istore 12
      //   465: aload_0
      //   466: iconst_1
      //   467: putfield 137	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mRenderComplete	Z
      //   470: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   473: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   476: iload 4
      //   478: istore_3
      //   479: iload 6
      //   481: istore 15
      //   483: iload 8
      //   485: istore 16
      //   487: iload 9
      //   489: istore 17
      //   491: iload 11
      //   493: istore 18
      //   495: aload_0
      //   496: invokespecial 140	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:readyToDraw	()Z
      //   499: ifeq +250 -> 749
      //   502: iload 4
      //   504: istore_3
      //   505: iload 11
      //   507: istore 10
      //   509: aload_0
      //   510: getfield 74	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglContext	Z
      //   513: ifne +14 -> 527
      //   516: iload 4
      //   518: ifeq +139 -> 657
      //   521: iconst_0
      //   522: istore_3
      //   523: iload 11
      //   525: istore 10
      //   527: aload_0
      //   528: getfield 74	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglContext	Z
      //   531: ifeq +642 -> 1173
      //   534: aload_0
      //   535: getfield 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglSurface	Z
      //   538: ifne +635 -> 1173
      //   541: aload_0
      //   542: iconst_1
      //   543: putfield 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglSurface	Z
      //   546: iconst_1
      //   547: istore 9
      //   549: iconst_1
      //   550: istore 5
      //   552: iconst_1
      //   553: istore 4
      //   555: aload_0
      //   556: getfield 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglSurface	Z
      //   559: ifeq +642 -> 1201
      //   562: aload_0
      //   563: getfield 46	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mSizeChanged	Z
      //   566: ifeq +590 -> 1156
      //   569: iconst_1
      //   570: istore_2
      //   571: aload_0
      //   572: getfield 48	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mWidth	I
      //   575: istore 6
      //   577: aload_0
      //   578: getfield 50	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHeight	I
      //   581: istore_1
      //   582: iconst_1
      //   583: istore 8
      //   585: iconst_1
      //   586: istore 5
      //   588: aload_0
      //   589: iconst_0
      //   590: putfield 46	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mSizeChanged	Z
      //   593: aload_0
      //   594: iconst_0
      //   595: putfield 52	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mRequestRender	Z
      //   598: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   601: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   604: iload 4
      //   606: istore 11
      //   608: iload 12
      //   610: istore 4
      //   612: iload 6
      //   614: istore 12
      //   616: iload 7
      //   618: istore 6
      //   620: iload_2
      //   621: istore 7
      //   623: iload 5
      //   625: istore 9
      //   627: iload 4
      //   629: istore_2
      //   630: iload_1
      //   631: istore 4
      //   633: iload 12
      //   635: istore_1
      //   636: iload 8
      //   638: istore 5
      //   640: iload 11
      //   642: istore 8
      //   644: goto -477 -> 167
      //   647: aload 24
      //   649: invokestatic 144	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$300	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Z
      //   652: istore 20
      //   654: goto -313 -> 341
      //   657: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   660: aload_0
      //   661: invokevirtual 148	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:tryAcquireEglContextLocked	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread;)Z
      //   664: istore 19
      //   666: iload 4
      //   668: istore_3
      //   669: iload 11
      //   671: istore 10
      //   673: iload 19
      //   675: ifeq -148 -> 527
      //   678: aload_0
      //   679: getfield 72	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEglHelper	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper;
      //   682: invokevirtual 151	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:start	()V
      //   685: aload_0
      //   686: iconst_1
      //   687: putfield 74	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mHaveEglContext	Z
      //   690: iconst_1
      //   691: istore 10
      //   693: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   696: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   699: iload 4
      //   701: istore_3
      //   702: goto -175 -> 527
      //   705: astore 21
      //   707: aload 23
      //   709: monitorexit
      //   710: aload 21
      //   712: athrow
      //   713: astore 22
      //   715: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   718: astore 21
      //   720: aload 21
      //   722: monitorenter
      //   723: aload_0
      //   724: invokespecial 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglSurfaceLocked	()V
      //   727: aload_0
      //   728: invokespecial 88	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:stopEglContextLocked	()V
      //   731: aload 21
      //   733: monitorexit
      //   734: aload 22
      //   736: athrow
      //   737: astore 21
      //   739: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   742: aload_0
      //   743: invokevirtual 155	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:releaseEglContextLocked	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread;)V
      //   746: aload 21
      //   748: athrow
      //   749: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   752: invokevirtual 158	java/lang/Object:wait	()V
      //   755: iload 12
      //   757: istore 14
      //   759: iload 13
      //   761: istore 5
      //   763: iload 15
      //   765: istore 6
      //   767: iload 7
      //   769: istore 10
      //   771: iload 16
      //   773: istore 8
      //   775: iload 17
      //   777: istore 9
      //   779: iload 18
      //   781: istore 11
      //   783: goto -705 -> 78
      //   786: iload 9
      //   788: ifeq +365 -> 1153
      //   791: aload_0
      //   792: getfield 72	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEglHelper	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper;
      //   795: invokevirtual 161	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:createSurface	()Z
      //   798: ifeq +264 -> 1062
      //   801: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   804: astore 23
      //   806: aload 23
      //   808: monitorenter
      //   809: aload_0
      //   810: iconst_1
      //   811: putfield 163	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mFinishedCreatingEglSurface	Z
      //   814: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   817: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   820: aload 23
      //   822: monitorexit
      //   823: iconst_0
      //   824: istore 9
      //   826: iload 8
      //   828: ifeq +322 -> 1150
      //   831: aload_0
      //   832: getfield 72	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEglHelper	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper;
      //   835: invokevirtual 167	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:createGL	()Ljavax/microedition/khronos/opengles/GL;
      //   838: checkcast 169	javax/microedition/khronos/opengles/GL10
      //   841: astore 22
      //   843: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   846: aload 22
      //   848: invokevirtual 173	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:checkGLDriver	(Ljavax/microedition/khronos/opengles/GL10;)V
      //   851: iconst_0
      //   852: istore 8
      //   854: iload 10
      //   856: istore 11
      //   858: iload 10
      //   860: ifeq +42 -> 902
      //   863: aload_0
      //   864: getfield 56	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
      //   867: invokevirtual 118	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   870: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
      //   873: astore 23
      //   875: aload 23
      //   877: ifnull +343 -> 1220
      //   880: aload 23
      //   882: invokestatic 177	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$400	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Landroid/opengl/GLSurfaceView$Renderer;
      //   885: aload 22
      //   887: aload_0
      //   888: getfield 72	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mEglHelper	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper;
      //   891: getfield 181	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:mEglConfig	Ljavax/microedition/khronos/egl/EGLConfig;
      //   894: invokeinterface 187 3 0
      //   899: goto +321 -> 1220
      //   902: iload 7
      //   904: istore 10
      //   906: iload 7
      //   908: ifeq +38 -> 946
      //   911: aload_0
      //   912: getfield 56	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
      //   915: invokevirtual 118	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   918: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
      //   921: astore 23
      //   923: aload 23
      //   925: ifnull +301 -> 1226
      //   928: aload 23
      //   930: invokestatic 177	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$400	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Landroid/opengl/GLSurfaceView$Renderer;
      //   933: aload 22
      //   935: iload_1
      //   936: iload 4
      //   938: invokeinterface 191 4 0
      //   943: goto +283 -> 1226
      //   946: aload_0
      //   947: getfield 56	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
      //   950: invokevirtual 118	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
      //   953: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
      //   956: astore 23
      //   958: aload 23
      //   960: ifnull +233 -> 1193
      //   963: aload 23
      //   965: invokestatic 177	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$400	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Landroid/opengl/GLSurfaceView$Renderer;
      //   968: aload 22
      //   970: invokeinterface 194 2 0
      //   975: aload 23
      //   977: invokevirtual 198	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:afterSwapBuffer	()I
      //   980: istore 12
      //   982: goto +250 -> 1232
      //   985: ldc -57
      //   987: ldc -55
      //   989: iload 12
      //   991: invokestatic 205	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$EglHelper:logEglErrorAsWarning	(Ljava/lang/String;Ljava/lang/String;I)V
      //   994: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   997: astore 23
      //   999: aload 23
      //   1001: monitorenter
      //   1002: aload_0
      //   1003: iconst_1
      //   1004: putfield 135	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mSurfaceIsBad	Z
      //   1007: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   1010: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   1013: aload 23
      //   1015: monitorexit
      //   1016: iload 6
      //   1018: istore 7
      //   1020: iload 5
      //   1022: ifeq +168 -> 1190
      //   1025: iconst_1
      //   1026: istore_2
      //   1027: iload_1
      //   1028: istore 12
      //   1030: iload_2
      //   1031: istore 6
      //   1033: iload 4
      //   1035: istore_1
      //   1036: iload 12
      //   1038: istore_2
      //   1039: iload 6
      //   1041: istore 4
      //   1043: iload 10
      //   1045: istore 6
      //   1047: iload 11
      //   1049: istore 10
      //   1051: goto -993 -> 58
      //   1054: astore 21
      //   1056: aload 23
      //   1058: monitorexit
      //   1059: aload 21
      //   1061: athrow
      //   1062: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   1065: astore 23
      //   1067: aload 23
      //   1069: monitorenter
      //   1070: aload_0
      //   1071: iconst_1
      //   1072: putfield 163	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mFinishedCreatingEglSurface	Z
      //   1075: aload_0
      //   1076: iconst_1
      //   1077: putfield 135	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThread:mSurfaceIsBad	Z
      //   1080: invokestatic 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:access$200	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager;
      //   1083: invokevirtual 110	java/lang/Object:notifyAll	()V
      //   1086: aload 23
      //   1088: monitorexit
      //   1089: iload 6
      //   1091: istore 11
      //   1093: iload_1
      //   1094: istore 12
      //   1096: iload_2
      //   1097: istore 6
      //   1099: iload 4
      //   1101: istore_1
      //   1102: iload 12
      //   1104: istore_2
      //   1105: iload 6
      //   1107: istore 4
      //   1109: iload 7
      //   1111: istore 6
      //   1113: iload 11
      //   1115: istore 7
      //   1117: goto -1059 -> 58
      //   1120: astore 21
      //   1122: aload 23
      //   1124: monitorexit
      //   1125: aload 21
      //   1127: athrow
      //   1128: iconst_1
      //   1129: istore 7
      //   1131: goto -111 -> 1020
      //   1134: astore 21
      //   1136: aload 23
      //   1138: monitorexit
      //   1139: aload 21
      //   1141: athrow
      //   1142: astore 22
      //   1144: aload 21
      //   1146: monitorexit
      //   1147: aload 22
      //   1149: athrow
      //   1150: goto -296 -> 854
      //   1153: goto -327 -> 826
      //   1156: iload 13
      //   1158: istore 8
      //   1160: iload_2
      //   1161: istore 6
      //   1163: iload 5
      //   1165: istore_2
      //   1166: iload 9
      //   1168: istore 5
      //   1170: goto -577 -> 593
      //   1173: iload 6
      //   1175: istore 5
      //   1177: iload 8
      //   1179: istore 4
      //   1181: goto -626 -> 555
      //   1184: iconst_0
      //   1185: istore 19
      //   1187: goto -940 -> 247
      //   1190: goto -163 -> 1027
      //   1193: sipush 12288
      //   1196: istore 12
      //   1198: goto +34 -> 1232
      //   1201: iload 5
      //   1203: istore 15
      //   1205: iload 4
      //   1207: istore 16
      //   1209: iload 9
      //   1211: istore 17
      //   1213: iload 10
      //   1215: istore 18
      //   1217: goto -468 -> 749
      //   1220: iconst_0
      //   1221: istore 11
      //   1223: goto -321 -> 902
      //   1226: iconst_0
      //   1227: istore 10
      //   1229: goto -283 -> 946
      //   1232: iload 6
      //   1234: istore 7
      //   1236: iload 12
      //   1238: lookupswitch	default:+26->1264, 12288:+-218->1020, 12302:+-110->1128
      //   1264: goto -279 -> 985
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1267	0	this	GLThread
      //   32	1070	1	i	int
      //   54	1112	2	j	int
      //   34	668	3	k	int
      //   56	1150	4	m	int
      //   36	1166	5	n	int
      //   39	1194	6	i1	int
      //   42	1193	7	i2	int
      //   45	1133	8	i3	int
      //   48	1162	9	i4	int
      //   26	1202	10	i5	int
      //   68	1154	11	i6	int
      //   145	1092	12	i7	int
      //   452	705	13	i8	int
      //   76	682	14	i9	int
      //   481	723	15	i10	int
      //   485	723	16	i11	int
      //   489	723	17	i12	int
      //   493	723	18	i13	int
      //   231	955	19	bool1	boolean
      //   339	314	20	bool2	boolean
      //   51	137	21	localObject1	Object
      //   705	6	21	localObject2	Object
      //   737	10	21	localRuntimeException	RuntimeException
      //   1054	6	21	localObject3	Object
      //   1120	6	21	localObject4	Object
      //   1134	11	21	localObject5	Object
      //   29	1	22	localObject6	Object
      //   108	6	22	localObject7	Object
      //   713	22	22	localObject8	Object
      //   841	128	22	localGL10	javax.microedition.khronos.opengles.GL10
      //   1142	6	22	localObject9	Object
      //   331	317	24	localTXCGLSurfaceViewBase	TXCGLSurfaceViewBase
      // Exception table:
      //   from	to	target	type
      //   96	107	108	finally
      //   110	113	108	finally
      //   78	88	705	finally
      //   116	139	705	finally
      //   167	170	705	finally
      //   216	247	705	finally
      //   250	270	705	finally
      //   282	290	705	finally
      //   298	309	705	finally
      //   314	333	705	finally
      //   346	355	705	finally
      //   355	359	705	finally
      //   364	380	705	finally
      //   380	405	705	finally
      //   405	421	705	finally
      //   421	446	705	finally
      //   465	476	705	finally
      //   495	502	705	finally
      //   509	516	705	finally
      //   527	546	705	finally
      //   555	569	705	finally
      //   571	582	705	finally
      //   588	593	705	finally
      //   593	604	705	finally
      //   647	654	705	finally
      //   657	666	705	finally
      //   678	685	705	finally
      //   685	690	705	finally
      //   693	699	705	finally
      //   707	710	705	finally
      //   739	749	705	finally
      //   749	755	705	finally
      //   58	66	713	finally
      //   175	182	713	finally
      //   710	713	713	finally
      //   791	809	713	finally
      //   831	851	713	finally
      //   863	875	713	finally
      //   880	899	713	finally
      //   911	923	713	finally
      //   928	943	713	finally
      //   946	958	713	finally
      //   963	982	713	finally
      //   985	1002	713	finally
      //   1059	1062	713	finally
      //   1062	1070	713	finally
      //   1125	1128	713	finally
      //   1139	1142	713	finally
      //   678	685	737	java/lang/RuntimeException
      //   809	823	1054	finally
      //   1056	1059	1054	finally
      //   1070	1089	1120	finally
      //   1122	1125	1120	finally
      //   1002	1016	1134	finally
      //   1136	1139	1134	finally
      //   723	734	1142	finally
      //   1144	1147	1142	finally
    }
    
    private boolean readyToDraw()
    {
      return (!this.mPaused) && (this.mHasSurface) && (!this.mSurfaceIsBad) && (this.mWidth > 0) && (this.mHeight > 0) && ((this.mRequestRender) || (this.mRenderMode == 1));
    }
    
    private void stopEglContextLocked()
    {
      if (this.mHaveEglContext)
      {
        this.mEglHelper.finish();
        this.mHaveEglContext = false;
        TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
        if (localTXCGLSurfaceViewBase != null) {
          localTXCGLSurfaceViewBase.mHasDefaultContext = false;
        }
        TXCGLSurfaceViewBase.sGLThreadManager.releaseEglContextLocked(this);
      }
    }
    
    private void stopEglSurfaceLocked()
    {
      if (this.mHaveEglSurface)
      {
        this.mHaveEglSurface = false;
        this.mEglHelper.destroySurface();
      }
    }
    
    public boolean ableToDraw()
    {
      return (this.mHaveEglContext) && (this.mHaveEglSurface) && (readyToDraw());
    }
    
    public TXCGLSurfaceViewBase.EglHelper getEGLHelper()
    {
      return this.mEglHelper;
    }
    
    public int getRenderMode()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        int i = this.mRenderMode;
        return i;
      }
    }
    
    public boolean isSurfaceBind()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.mGLSurfaceViewWeakRef.get();
        if (localTXCGLSurfaceViewBase != null)
        {
          boolean bool = localTXCGLSurfaceViewBase.mHasDefaultSurface;
          return bool;
        }
        return false;
      }
    }
    
    public boolean makeCurrent()
    {
      return this.mEglHelper.makeCurrent();
    }
    
    public void onPause()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mRequestPaused = true;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        for (;;)
        {
          if (!this.mExited)
          {
            boolean bool = this.mPaused;
            if (!bool) {
              try
              {
                TXCGLSurfaceViewBase.sGLThreadManager.wait();
              }
              catch (InterruptedException localInterruptedException)
              {
                Thread.currentThread().interrupt();
              }
            }
          }
        }
      }
    }
    
    public void onResume()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mRequestPaused = false;
        this.mRequestRender = true;
        this.mRenderComplete = false;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        for (;;)
        {
          if ((!this.mExited) && (this.mPaused))
          {
            boolean bool = this.mRenderComplete;
            if (!bool) {
              try
              {
                TXCGLSurfaceViewBase.sGLThreadManager.wait();
              }
              catch (InterruptedException localInterruptedException)
              {
                Thread.currentThread().interrupt();
              }
            }
          }
        }
      }
    }
    
    public void onWindowResize(int paramInt1, int paramInt2)
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mWidth = paramInt1;
        this.mHeight = paramInt2;
        this.mSizeChanged = true;
        this.mRequestRender = true;
        this.mRenderComplete = false;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        for (;;)
        {
          if ((!this.mExited) && (!this.mPaused) && (!this.mRenderComplete))
          {
            boolean bool = ableToDraw();
            if (bool) {
              try
              {
                TXCGLSurfaceViewBase.sGLThreadManager.wait();
              }
              catch (InterruptedException localInterruptedException)
              {
                Thread.currentThread().interrupt();
              }
            }
          }
        }
      }
    }
    
    public void queueEvent(Runnable paramRunnable)
    {
      if (paramRunnable == null) {
        throw new IllegalArgumentException("r must not be null");
      }
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mEventQueue.add(paramRunnable);
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        return;
      }
    }
    
    public void requestExitAndWait()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mShouldExit = true;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        for (;;)
        {
          boolean bool = this.mExited;
          if (!bool) {
            try
            {
              TXCGLSurfaceViewBase.sGLThreadManager.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
          }
        }
      }
    }
    
    public void requestReleaseEglContextLocked()
    {
      this.mShouldReleaseEglContext = true;
      TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
    }
    
    public void requestRender()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mRequestRender = true;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        return;
      }
    }
    
    public void run()
    {
      setName("GLThread " + getId());
      try
      {
        guardedRun();
        TXCGLSurfaceViewBase.sGLThreadManager.threadExiting(this);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException = localInterruptedException;
        TXCGLSurfaceViewBase.sGLThreadManager.threadExiting(this);
        return;
      }
      finally
      {
        localObject = finally;
        TXCGLSurfaceViewBase.sGLThreadManager.threadExiting(this);
        throw ((Throwable)localObject);
      }
    }
    
    public void setRenderMode(int paramInt)
    {
      if ((paramInt < 0) || (paramInt > 1)) {
        throw new IllegalArgumentException("renderMode");
      }
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mRenderMode = paramInt;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        return;
      }
    }
    
    public void surfaceCreated()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mHasSurface = true;
        this.mFinishedCreatingEglSurface = false;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        for (;;)
        {
          if ((this.mWaitingForSurface) && (!this.mFinishedCreatingEglSurface))
          {
            boolean bool = this.mExited;
            if (!bool) {
              try
              {
                TXCGLSurfaceViewBase.sGLThreadManager.wait();
              }
              catch (InterruptedException localInterruptedException)
              {
                Thread.currentThread().interrupt();
              }
            }
          }
        }
      }
    }
    
    public void surfaceDestroyed()
    {
      synchronized (TXCGLSurfaceViewBase.sGLThreadManager)
      {
        this.mHasSurface = false;
        TXCGLSurfaceViewBase.sGLThreadManager.notifyAll();
        for (;;)
        {
          if (!this.mWaitingForSurface)
          {
            boolean bool = this.mExited;
            if (!bool) {
              try
              {
                TXCGLSurfaceViewBase.sGLThreadManager.wait();
              }
              catch (InterruptedException localInterruptedException)
              {
                Thread.currentThread().interrupt();
              }
            }
          }
        }
      }
    }
    
    public int swapBuffer()
    {
      return this.mEglHelper.swapBuffer();
    }
  }
  
  private static class GLThreadManager
  {
    private static String TAG = "GLThreadManager";
    private static final int kGLES_20 = 131072;
    private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
    private TXCGLSurfaceViewBase.GLThread mEglOwner;
    private boolean mGLESDriverCheckComplete;
    private int mGLESVersion;
    private boolean mGLESVersionCheckComplete;
    private boolean mLimitedGLESContexts;
    private boolean mMultipleGLESContextsAllowed;
    
    private void checkGLESVersion()
    {
      this.mGLESVersion = 131072;
      this.mMultipleGLESContextsAllowed = true;
      this.mGLESVersionCheckComplete = true;
    }
    
    /* Error */
    public void checkGLDriver(javax.microedition.khronos.opengles.GL10 paramGL10)
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_3
      //   2: aload_0
      //   3: monitorenter
      //   4: aload_0
      //   5: getfield 43	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mGLESDriverCheckComplete	Z
      //   8: ifne +65 -> 73
      //   11: aload_0
      //   12: invokespecial 45	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:checkGLESVersion	()V
      //   15: aload_1
      //   16: sipush 7937
      //   19: invokeinterface 51 2 0
      //   24: astore_1
      //   25: aload_0
      //   26: getfield 35	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mGLESVersion	I
      //   29: ldc 12
      //   31: if_icmpge +23 -> 54
      //   34: aload_1
      //   35: ldc 15
      //   37: invokevirtual 57	java/lang/String:startsWith	(Ljava/lang/String;)Z
      //   40: ifne +36 -> 76
      //   43: iconst_1
      //   44: istore_2
      //   45: aload_0
      //   46: iload_2
      //   47: putfield 37	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mMultipleGLESContextsAllowed	Z
      //   50: aload_0
      //   51: invokevirtual 60	java/lang/Object:notifyAll	()V
      //   54: aload_0
      //   55: getfield 37	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mMultipleGLESContextsAllowed	Z
      //   58: ifne +23 -> 81
      //   61: iload_3
      //   62: istore_2
      //   63: aload_0
      //   64: iload_2
      //   65: putfield 62	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mLimitedGLESContexts	Z
      //   68: aload_0
      //   69: iconst_1
      //   70: putfield 43	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mGLESDriverCheckComplete	Z
      //   73: aload_0
      //   74: monitorexit
      //   75: return
      //   76: iconst_0
      //   77: istore_2
      //   78: goto -33 -> 45
      //   81: iconst_0
      //   82: istore_2
      //   83: goto -20 -> 63
      //   86: astore_1
      //   87: aload_0
      //   88: monitorexit
      //   89: aload_1
      //   90: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	91	0	this	GLThreadManager
      //   0	91	1	paramGL10	javax.microedition.khronos.opengles.GL10
      //   44	39	2	bool1	boolean
      //   1	61	3	bool2	boolean
      // Exception table:
      //   from	to	target	type
      //   4	43	86	finally
      //   45	54	86	finally
      //   54	61	86	finally
      //   63	73	86	finally
    }
    
    public void releaseEglContextLocked(TXCGLSurfaceViewBase.GLThread paramGLThread)
    {
      if (this.mEglOwner == paramGLThread) {
        this.mEglOwner = null;
      }
      notifyAll();
    }
    
    public boolean shouldReleaseEGLContextWhenPausing()
    {
      try
      {
        boolean bool = this.mLimitedGLESContexts;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    /* Error */
    public boolean shouldTerminateEGLWhenPausing()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial 45	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:checkGLESVersion	()V
      //   6: aload_0
      //   7: getfield 37	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$GLThreadManager:mMultipleGLESContextsAllowed	Z
      //   10: istore_1
      //   11: iload_1
      //   12: ifne +9 -> 21
      //   15: iconst_1
      //   16: istore_1
      //   17: aload_0
      //   18: monitorexit
      //   19: iload_1
      //   20: ireturn
      //   21: iconst_0
      //   22: istore_1
      //   23: goto -6 -> 17
      //   26: astore_2
      //   27: aload_0
      //   28: monitorexit
      //   29: aload_2
      //   30: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	31	0	this	GLThreadManager
      //   10	13	1	bool	boolean
      //   26	4	2	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	11	26	finally
    }
    
    public void threadExiting(TXCGLSurfaceViewBase.GLThread paramGLThread)
    {
      try
      {
        TXCGLSurfaceViewBase.GLThread.access$502(paramGLThread, true);
        if (this.mEglOwner == paramGLThread) {
          this.mEglOwner = null;
        }
        notifyAll();
        return;
      }
      finally {}
    }
    
    public boolean tryAcquireEglContextLocked(TXCGLSurfaceViewBase.GLThread paramGLThread)
    {
      if ((this.mEglOwner == paramGLThread) || (this.mEglOwner == null))
      {
        this.mEglOwner = paramGLThread;
        notifyAll();
      }
      do
      {
        return true;
        checkGLESVersion();
      } while (this.mMultipleGLESContextsAllowed);
      if (this.mEglOwner != null) {
        this.mEglOwner.requestReleaseEglContextLocked();
      }
      return false;
    }
  }
  
  public static abstract interface GLWrapper
  {
    public abstract GL wrap(GL paramGL);
  }
  
  static class LogWriter
    extends Writer
  {
    private StringBuilder mBuilder = new StringBuilder();
    
    private void flushBuilder()
    {
      if (this.mBuilder.length() > 0)
      {
        TXCLog.v("TXCGLSurfaceViewBase", this.mBuilder.toString());
        this.mBuilder.delete(0, this.mBuilder.length());
      }
    }
    
    public void close()
    {
      flushBuilder();
    }
    
    public void flush()
    {
      flushBuilder();
    }
    
    public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    {
      int i = 0;
      if (i < paramInt2)
      {
        char c = paramArrayOfChar[(paramInt1 + i)];
        if (c == '\n') {
          flushBuilder();
        }
        for (;;)
        {
          i += 1;
          break;
          this.mBuilder.append(c);
        }
      }
    }
  }
  
  private class SimpleEGLConfigChooser
    extends TXCGLSurfaceViewBase.ComponentSizeChooser
  {
    public SimpleEGLConfigChooser(boolean paramBoolean) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCGLSurfaceViewBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */