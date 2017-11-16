package com.tencent.mm.plugin.api.recordView;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class c
  extends Thread
{
  private d hxu;
  private SurfaceTexture hxw;
  volatile boolean hxx;
  private EGL10 mEgl;
  private EGLContext mEglContext;
  private EGLDisplay mEglDisplay;
  private EGLSurface mEglSurface;
  
  public c(SurfaceTexture paramSurfaceTexture, d paramd)
  {
    GMTrace.i(20186077855744L, 150398);
    this.mEglDisplay = EGL10.EGL_NO_DISPLAY;
    this.mEglContext = EGL10.EGL_NO_CONTEXT;
    this.mEglSurface = EGL10.EGL_NO_SURFACE;
    this.hxw = paramSurfaceTexture;
    this.hxu = paramd;
    GMTrace.o(20186077855744L, 150398);
  }
  
  public final void run()
  {
    GMTrace.i(20186212073472L, 150399);
    w.i("MicroMsg.MMSightRecordTextureViewRenderThread", "start render thread");
    this.mEgl = ((EGL10)EGLContext.getEGL());
    this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    int i;
    if (this.mEglDisplay == EGL10.EGL_NO_DISPLAY)
    {
      w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl get display error: %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
      i = -1;
    }
    Object localObject3;
    while (i < 0)
    {
      w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "init gl failed");
      GMTrace.o(20186212073472L, 150399);
      return;
      ??? = new int[2];
      if (!this.mEgl.eglInitialize(this.mEglDisplay, (int[])???))
      {
        w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl init error: %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
        i = -1;
      }
      else
      {
        ??? = new int[1];
        localObject3 = new EGLConfig[1];
        if (!this.mEgl.eglChooseConfig(this.mEglDisplay, new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344 }, (EGLConfig[])localObject3, 1, (int[])???))
        {
          w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl choose config failed: %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
          i = -1;
        }
        else
        {
          this.mEglContext = this.mEgl.eglCreateContext(this.mEglDisplay, localObject3[0], EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
          this.mEglSurface = this.mEgl.eglCreateWindowSurface(this.mEglDisplay, localObject3[0], this.hxw, null);
          if ((this.mEglSurface == EGL10.EGL_NO_SURFACE) || (this.mEglContext == EGL10.EGL_NO_CONTEXT))
          {
            if (this.mEgl.eglGetError() == 12299)
            {
              w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
              i = -1;
            }
            else
            {
              w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglCreateWindowSurface failed : %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
              i = -1;
            }
          }
          else
          {
            if (!this.mEgl.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext)) {
              w.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglMakeCurrent failed : %s", new Object[] { GLUtils.getEGLErrorString(this.mEgl.eglGetError()) });
            }
            i = 0;
          }
        }
      }
    }
    if (this.hxu != null) {
      localObject3 = this.hxu;
    }
    for (;;)
    {
      synchronized (d.lock)
      {
        w.i("MicroMsg.MMSightRecordTextureViewRenderer", "init this %s", new Object[] { localObject3 });
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glDisable(2929);
        ((d)localObject3).hxd = b.az("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        if (((d)localObject3).hxd == 0) {
          w.e("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceCreated, load program failed!");
        }
        ((d)localObject3).hxf = GLES20.glGetAttribLocation(((d)localObject3).hxd, "a_position");
        ((d)localObject3).hxe = GLES20.glGetAttribLocation(((d)localObject3).hxd, "a_texCoord");
        ((d)localObject3).hxg = GLES20.glGetUniformLocation(((d)localObject3).hxd, "y_texture");
        ((d)localObject3).hxh = GLES20.glGetUniformLocation(((d)localObject3).hxd, "uv_texture");
        ((d)localObject3).hxi = GLES20.glGetUniformLocation(((d)localObject3).hxd, "uMatrix");
        ((d)localObject3).hxb = b.Rh();
        ((d)localObject3).hxc = b.Rh();
        ((d)localObject3).hxj = ByteBuffer.allocateDirect(((d)localObject3).hxn.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ((d)localObject3).hxj.put(((d)localObject3).hxn);
        ((d)localObject3).hxj.position(0);
        ((d)localObject3).hxk = ByteBuffer.allocateDirect(d.hwS.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ((d)localObject3).hxk.put(d.hwS);
        ((d)localObject3).hxk.position(0);
        w.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", new Object[] { Integer.valueOf(((d)localObject3).hxb), Integer.valueOf(((d)localObject3).hxc), localObject3 });
        w.i("MicroMsg.MMSightRecordTextureViewRenderThread", "init renderer finish");
        if (!this.hxx) {
          break;
        }
        if (this.hxu != null) {
          if (this.hxu.hxz) {}
        }
      }
      try
      {
        Thread.sleep(10L);
        localObject3 = this.hxu;
        bg.Pw();
        ((d)localObject3).hwV = true;
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
      }
      catch (InterruptedException localInterruptedException)
      {
        synchronized (d.lock)
        {
          if ((((d)localObject3).hxd != -1) && (((d)localObject3).hxb != -1) && (((d)localObject3).hxc != -1) && (((d)localObject3).hwX > 0) && (((d)localObject3).hwY > 0) && (((d)localObject3).hxa != null) && (((d)localObject3).hwZ != null) && (((d)localObject3).hxa.limit() > 0) && (((d)localObject3).hwZ.limit() > 0) && (((d)localObject3).hxa.position() == 0) && (((d)localObject3).hwZ.position() == 0))
          {
            GLES20.glUseProgram(((d)localObject3).hxd);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, ((d)localObject3).hxb);
            GLES20.glTexImage2D(3553, 0, 6409, ((d)localObject3).hwX, ((d)localObject3).hwY, 0, 6409, 5121, ((d)localObject3).hwZ);
            GLES20.glTexParameterf(3553, 10241, 9729.0F);
            GLES20.glTexParameterf(3553, 10240, 9729.0F);
            GLES20.glTexParameterf(3553, 10242, 33071.0F);
            GLES20.glTexParameterf(3553, 10243, 33071.0F);
            GLES20.glUniform1i(((d)localObject3).hxg, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, ((d)localObject3).hxc);
            GLES20.glTexImage2D(3553, 0, 6410, ((d)localObject3).hwX / 2, ((d)localObject3).hwY / 2, 0, 6410, 5121, ((d)localObject3).hxa);
            GLES20.glTexParameterf(3553, 10241, 9729.0F);
            GLES20.glTexParameterf(3553, 10240, 9729.0F);
            GLES20.glTexParameterf(3553, 10242, 33071.0F);
            GLES20.glTexParameterf(3553, 10243, 33071.0F);
            GLES20.glUniform1i(((d)localObject3).hxh, 1);
            Matrix.setIdentityM(((d)localObject3).hxl, 0);
            Matrix.setRotateM(((d)localObject3).hxl, 0, ((d)localObject3).eSp, 0.0F, 0.0F, -1.0F);
            GLES20.glUniformMatrix4fv(((d)localObject3).hxi, 1, false, ((d)localObject3).hxl, 0);
            ((d)localObject3).hxj.position(0);
            GLES20.glVertexAttribPointer(((d)localObject3).hxf, 2, 5126, false, 0, ((d)localObject3).hxj);
            GLES20.glEnableVertexAttribArray(((d)localObject3).hxf);
            ((d)localObject3).hxk.position(0);
            GLES20.glVertexAttribPointer(((d)localObject3).hxe, 2, 5126, false, 0, ((d)localObject3).hxk);
            GLES20.glEnableVertexAttribArray(((d)localObject3).hxe);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(((d)localObject3).hxf);
            GLES20.glDisableVertexAttribArray(((d)localObject3).hxe);
            GLES20.glBindTexture(3553, 0);
          }
          ((d)localObject3).hwV = false;
          if (this.mEgl != null)
          {
            this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface);
            continue;
            localObject4 = finally;
            throw ((Throwable)localObject4);
            localInterruptedException = localInterruptedException;
            w.printErrStackTrace("MicroMsg.MMSightRecordTextureViewRenderThread", localInterruptedException, "", new Object[0]);
          }
        }
      }
    }
    w.i("MicroMsg.MMSightRecordTextureViewRenderThread", "finish render loop, start destroy gl");
    d locald;
    if (this.hxu != null) {
      locald = this.hxu;
    }
    synchronized (d.lock)
    {
      if (locald.hxd >= 0)
      {
        GLES20.glDeleteProgram(locald.hxd);
        locald.hxd = -1;
      }
      if (locald.hxc >= 0)
      {
        GLES20.glDeleteTextures(1, new int[] { locald.hxc }, 0);
        locald.hxc = -1;
      }
      if (locald.hxb >= 0)
      {
        GLES20.glDeleteTextures(1, new int[] { locald.hxb }, 0);
        locald.hxb = -1;
      }
      locald.hwY = -1;
      locald.hwX = -1;
      locald.hxy = true;
      locald.hwZ = null;
      locald.hxa = null;
      if ((this.mEgl != null) && (this.mEglContext != null) && (this.mEglSurface != null))
      {
        this.mEgl.eglDestroyContext(this.mEglDisplay, this.mEglContext);
        this.mEgl.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
        this.mEglContext = EGL10.EGL_NO_CONTEXT;
        this.mEglSurface = EGL10.EGL_NO_SURFACE;
      }
      if (this.hxw != null) {
        this.hxw.release();
      }
      w.i("MicroMsg.MMSightRecordTextureViewRenderThread", "finish render loop, finish destroy gl");
      GMTrace.o(20186212073472L, 150399);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */