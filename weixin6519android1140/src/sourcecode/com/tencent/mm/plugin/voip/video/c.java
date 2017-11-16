package com.tencent.mm.plugin.voip.video;

import android.opengl.GLSurfaceView.EGLContextFactory;
import com.tencent.gmtrace.GMTrace;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

final class c
  implements GLSurfaceView.EGLContextFactory
{
  private static int EGL_CONTEXT_CLIENT_VERSION;
  
  static
  {
    GMTrace.i(5384949465088L, 40121);
    EGL_CONTEXT_CLIENT_VERSION = 12440;
    GMTrace.o(5384949465088L, 40121);
  }
  
  c()
  {
    GMTrace.i(5384546811904L, 40118);
    GMTrace.o(5384546811904L, 40118);
  }
  
  public final EGLContext createContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
  {
    GMTrace.i(5384681029632L, 40119);
    int i = EGL_CONTEXT_CLIENT_VERSION;
    paramEGL10 = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { i, 2, 12344 });
    GMTrace.o(5384681029632L, 40119);
    return paramEGL10;
  }
  
  public final void destroyContext(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
  {
    GMTrace.i(5384815247360L, 40120);
    paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext);
    GMTrace.o(5384815247360L, 40120);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */