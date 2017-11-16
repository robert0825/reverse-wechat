package com.tencent.mm.plugin.api.recordView;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

class MMSightCameraGLSurfaceView
  extends GLSurfaceView
{
  int hwX;
  int hwY;
  a hxp;
  private int hxq;
  int hxr;
  
  public MMSightCameraGLSurfaceView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20850321391616L, 155347);
    this.hxp = null;
    this.hxq = 0;
    init();
    GMTrace.o(20850321391616L, 155347);
  }
  
  public MMSightCameraGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20850455609344L, 155348);
    this.hxp = null;
    this.hxq = 0;
    init();
    GMTrace.o(20850455609344L, 155348);
  }
  
  private void init()
  {
    GMTrace.i(20850589827072L, 155349);
    getHolder().addCallback(this);
    try
    {
      getHolder().setType(2);
      setEGLContextFactory(new b());
      setEGLConfigChooser(new a());
      this.hxp = new a();
      setRenderer(this.hxp);
      setRenderMode(0);
      GMTrace.o(20850589827072L, 155349);
      return;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          getHolder().setType(1);
        }
        catch (Exception localException2)
        {
          try
          {
            getHolder().setType(0);
          }
          catch (Exception localException3) {}
        }
      }
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20850992480256L, 155352);
    super.surfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
    w.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceChanged, format: %s, w: %s, h: %s this: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this });
    GMTrace.o(20850992480256L, 155352);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(20850724044800L, 155350);
    super.surfaceCreated(paramSurfaceHolder);
    w.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceCreated: %s this: %s %s", new Object[] { paramSurfaceHolder, this, Integer.valueOf(getId()) });
    GMTrace.o(20850724044800L, 155350);
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(20850858262528L, 155351);
    super.surfaceDestroyed(paramSurfaceHolder);
    w.i("MicroMsg.MMSightCameraGLSurfaceView", "surfaceDestroyed: %s this: %s", new Object[] { paramSurfaceHolder, this });
    GMTrace.o(20850858262528L, 155351);
  }
  
  final class a
    implements GLSurfaceView.EGLConfigChooser
  {
    private int EGL_OPENGL_ES2_BIT;
    private int[] hxs;
    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue;
    
    public a()
    {
      GMTrace.i(20851126697984L, 155353);
      this.EGL_OPENGL_ES2_BIT = 4;
      this.hxs = new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, this.EGL_OPENGL_ES2_BIT, 12344 };
      this.mValue = new int[1];
      this.mRedSize = 5;
      this.mGreenSize = 6;
      this.mBlueSize = 5;
      this.mAlphaSize = 0;
      this.mDepthSize = 0;
      this.mStencilSize = 0;
      GMTrace.o(20851126697984L, 155353);
    }
    
    private int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
    {
      GMTrace.i(20851529351168L, 155356);
      if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, this.mValue))
      {
        paramInt = this.mValue[0];
        GMTrace.o(20851529351168L, 155356);
        return paramInt;
      }
      GMTrace.o(20851529351168L, 155356);
      return 0;
    }
    
    private static void a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
    {
      GMTrace.i(20851663568896L, 155357);
      int k = paramArrayOfEGLConfig.length;
      w.i("GLConfigChooser", String.format("%d configurations", new Object[] { Integer.valueOf(k) }));
      int i = 0;
      while (i < k)
      {
        w.i("GLConfigChooser", String.format("Configuration %d:\n", new Object[] { Integer.valueOf(i) }));
        EGLConfig localEGLConfig = paramArrayOfEGLConfig[i];
        int[] arrayOfInt = new int[1];
        int j = 0;
        while (j < 33)
        {
          paramEGL10.eglGetConfigAttrib(paramEGLDisplay, localEGLConfig, new int[] { 12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354 }[j], arrayOfInt);
          j += 1;
        }
        i += 1;
      }
      GMTrace.o(20851663568896L, 155357);
    }
    
    private EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
    {
      GMTrace.i(20851395133440L, 155355);
      int j = paramArrayOfEGLConfig.length;
      int i = 0;
      while (i < j)
      {
        EGLConfig localEGLConfig = paramArrayOfEGLConfig[i];
        int k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325);
        int m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326);
        if ((k >= this.mDepthSize) && (m >= this.mStencilSize))
        {
          k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324);
          m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323);
          int n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322);
          int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321);
          if ((k == this.mRedSize) && (m == this.mGreenSize) && (n == this.mBlueSize) && (i1 == this.mAlphaSize))
          {
            GMTrace.o(20851395133440L, 155355);
            return localEGLConfig;
          }
        }
        i += 1;
      }
      GMTrace.o(20851395133440L, 155355);
      return null;
    }
    
    public final EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
    {
      GMTrace.i(20851260915712L, 155354);
      int[] arrayOfInt = new int[1];
      paramEGL10.eglChooseConfig(paramEGLDisplay, this.hxs, null, 0, arrayOfInt);
      int i = arrayOfInt[0];
      if (i <= 0) {
        throw new IllegalArgumentException("No configs match configSpec");
      }
      EGLConfig[] arrayOfEGLConfig = new EGLConfig[i];
      paramEGL10.eglChooseConfig(paramEGLDisplay, this.hxs, arrayOfEGLConfig, i, arrayOfInt);
      a(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
      paramEGL10 = chooseConfig(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
      GMTrace.o(20851260915712L, 155354);
      return paramEGL10;
    }
  }
  
  final class b
    implements GLSurfaceView.EGLContextFactory
  {
    private int EGL_CONTEXT_CLIENT_VERSION;
    
    b()
    {
      GMTrace.i(20851797786624L, 155358);
      this.EGL_CONTEXT_CLIENT_VERSION = 12440;
      GMTrace.o(20851797786624L, 155358);
    }
    
    public final EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
    {
      GMTrace.i(20851932004352L, 155359);
      w.w("MicroMsg.MMSightCameraGLSurfaceView", "creating OpenGL ES 2.0 context");
      int i = this.EGL_CONTEXT_CLIENT_VERSION;
      paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { i, 2, 12344 });
      GMTrace.o(20851932004352L, 155359);
      return paramEGL10;
    }
    
    public final void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
    {
      GMTrace.i(20852066222080L, 155360);
      paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext);
      GMTrace.o(20852066222080L, 155360);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\MMSightCameraGLSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */