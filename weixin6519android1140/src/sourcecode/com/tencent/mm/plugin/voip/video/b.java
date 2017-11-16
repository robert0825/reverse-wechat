package com.tencent.mm.plugin.voip.video;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import com.tencent.gmtrace.GMTrace;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

final class b
  implements GLSurfaceView.EGLConfigChooser
{
  private static int EGL_OPENGL_ES2_BIT;
  private static int[] hxs;
  protected int mAlphaSize;
  protected int mBlueSize;
  protected int mDepthSize;
  protected int mGreenSize;
  protected int mRedSize;
  protected int mStencilSize;
  private int[] mValue;
  
  static
  {
    GMTrace.i(5383607287808L, 40111);
    EGL_OPENGL_ES2_BIT = 4;
    hxs = new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, EGL_OPENGL_ES2_BIT, 12344 };
    GMTrace.o(5383607287808L, 40111);
  }
  
  public b()
  {
    GMTrace.i(5383070416896L, 40107);
    this.mValue = new int[1];
    this.mRedSize = 5;
    this.mGreenSize = 6;
    this.mBlueSize = 5;
    this.mAlphaSize = 0;
    this.mDepthSize = 0;
    this.mStencilSize = 0;
    GMTrace.o(5383070416896L, 40107);
  }
  
  private int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
  {
    GMTrace.i(5383473070080L, 40110);
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, this.mValue))
    {
      paramInt = this.mValue[0];
      GMTrace.o(5383473070080L, 40110);
      return paramInt;
    }
    GMTrace.o(5383473070080L, 40110);
    return 0;
  }
  
  private EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    GMTrace.i(5383338852352L, 40109);
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
          GMTrace.o(5383338852352L, 40109);
          return localEGLConfig;
        }
      }
      i += 1;
    }
    GMTrace.o(5383338852352L, 40109);
    return null;
  }
  
  public final EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
  {
    GMTrace.i(5383204634624L, 40108);
    int[] arrayOfInt = new int[1];
    paramEGL10.eglChooseConfig(paramEGLDisplay, hxs, null, 0, arrayOfInt);
    int i = arrayOfInt[0];
    if (i <= 0) {
      throw new IllegalArgumentException("No configs match configSpec");
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[i];
    paramEGL10.eglChooseConfig(paramEGLDisplay, hxs, arrayOfEGLConfig, i, arrayOfInt);
    paramEGL10 = chooseConfig(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
    GMTrace.o(5383204634624L, 40108);
    return paramEGL10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */