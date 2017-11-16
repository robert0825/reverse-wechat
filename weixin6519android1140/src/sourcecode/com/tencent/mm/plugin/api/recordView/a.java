package com.tencent.mm.plugin.api.recordView;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

final class a
  implements GLSurfaceView.Renderer
{
  static float[] hwQ;
  static float[] hwR;
  private static final float[] hwS;
  int eSp;
  private int hwT;
  private int hwU;
  boolean hwV;
  byte[] hwW;
  int hwX;
  int hwY;
  ByteBuffer hwZ;
  ByteBuffer hxa;
  private int hxb;
  private int hxc;
  private int hxd;
  private int hxe;
  private int hxf;
  private int hxg;
  private int hxh;
  private int hxi;
  FloatBuffer hxj;
  private FloatBuffer hxk;
  private float[] hxl;
  private boolean hxm;
  float[] hxn;
  boolean hxo;
  
  static
  {
    GMTrace.i(20850052956160L, 155345);
    hwQ = new float[] { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
    hwR = new float[] { -1.0F, -0.5F, 1.0F, -0.5F, -1.0F, 0.5F, 1.0F, 0.5F };
    hwS = new float[] { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    GMTrace.o(20850052956160L, 155345);
  }
  
  public a()
  {
    GMTrace.i(20849516085248L, 155341);
    this.hwT = 0;
    this.hwU = 0;
    this.hwV = false;
    this.hwW = null;
    this.hwX = 0;
    this.hwY = 0;
    this.eSp = 0;
    this.hxl = new float[16];
    this.hxm = false;
    this.hxn = hwQ;
    this.hxo = false;
    Point localPoint = d.aON();
    float f = localPoint.x / localPoint.y / 2.0F;
    hwR = new float[] { -1.0F, -f, 1.0F, -f, -1.0F, f, 1.0F, f };
    GMTrace.o(20849516085248L, 155341);
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    GMTrace.i(20849918738432L, 155344);
    bg.Pw();
    this.hwV = true;
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glClear(16640);
    if (this.hxm)
    {
      w.i("MicroMsg.MMSightCameraGLRenderer", "clearFrameRequest");
      this.hxm = false;
      this.hwV = false;
      this.hwW = null;
      this.hwX = -1;
      this.hwY = -1;
      GMTrace.o(20849918738432L, 155344);
      return;
    }
    if ((this.hxd != 0) && (this.hxb != -1) && (this.hxc != -1) && (this.hwX > 0) && (this.hwY > 0) && (this.hwW != null))
    {
      GLES20.glUseProgram(this.hxd);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.hxb);
      GLES20.glTexImage2D(3553, 0, 6409, this.hwX, this.hwY, 0, 6409, 5121, this.hwZ);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glUniform1i(this.hxg, 0);
      GLES20.glActiveTexture(33985);
      GLES20.glBindTexture(3553, this.hxc);
      GLES20.glTexImage2D(3553, 0, 6410, this.hwX / 2, this.hwY / 2, 0, 6410, 5121, this.hxa);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glUniform1i(this.hxh, 1);
      Matrix.setIdentityM(this.hxl, 0);
      Matrix.setRotateM(this.hxl, 0, this.eSp, 0.0F, 0.0F, -1.0F);
      GLES20.glUniformMatrix4fv(this.hxi, 1, false, this.hxl, 0);
      this.hxj.position(0);
      GLES20.glVertexAttribPointer(this.hxf, 2, 5126, false, 0, this.hxj);
      GLES20.glEnableVertexAttribArray(this.hxf);
      this.hxk.position(0);
      GLES20.glVertexAttribPointer(this.hxe, 2, 5126, false, 0, this.hxk);
      GLES20.glEnableVertexAttribArray(this.hxe);
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.hxf);
      GLES20.glDisableVertexAttribArray(this.hxe);
      GLES20.glBindTexture(3553, 0);
    }
    this.hwV = false;
    GMTrace.o(20849918738432L, 155344);
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    GMTrace.i(20849784520704L, 155343);
    w.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this });
    if ((paramInt1 != this.hwT) || (paramInt2 != this.hwU))
    {
      w.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
      GLES20.glViewport(0, 0, paramInt1, paramInt2);
      this.hwT = paramInt1;
      this.hwU = paramInt2;
    }
    GMTrace.o(20849784520704L, 155343);
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    GMTrace.i(20849650302976L, 155342);
    w.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", new Object[] { this });
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glDisable(2929);
    this.hxd = b.az("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
    if (this.hxd == 0) {
      w.e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
    }
    this.hxf = GLES20.glGetAttribLocation(this.hxd, "a_position");
    this.hxe = GLES20.glGetAttribLocation(this.hxd, "a_texCoord");
    this.hxg = GLES20.glGetUniformLocation(this.hxd, "y_texture");
    this.hxh = GLES20.glGetUniformLocation(this.hxd, "uv_texture");
    this.hxi = GLES20.glGetUniformLocation(this.hxd, "uMatrix");
    this.hxb = b.Rh();
    this.hxc = b.Rh();
    this.hxj = ByteBuffer.allocateDirect(this.hxn.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.hxj.put(this.hxn);
    this.hxj.position(0);
    this.hxk = ByteBuffer.allocateDirect(hwS.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.hxk.put(hwS);
    this.hxk.position(0);
    w.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", new Object[] { Integer.valueOf(this.hxb), Integer.valueOf(this.hxc), this });
    GMTrace.o(20849650302976L, 155342);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */