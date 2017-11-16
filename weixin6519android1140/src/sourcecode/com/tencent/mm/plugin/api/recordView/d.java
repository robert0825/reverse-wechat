package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

final class d
{
  static float[] hwQ;
  static final float[] hwS;
  static final Object lock;
  int eSp;
  private int hwT;
  private int hwU;
  boolean hwV;
  int hwX;
  int hwY;
  ByteBuffer hwZ;
  ByteBuffer hxa;
  int hxb;
  int hxc;
  int hxd;
  int hxe;
  int hxf;
  int hxg;
  int hxh;
  int hxi;
  FloatBuffer hxj;
  FloatBuffer hxk;
  float[] hxl;
  float[] hxn;
  volatile boolean hxy;
  volatile boolean hxz;
  
  static
  {
    GMTrace.i(20181246017536L, 150362);
    hwQ = new float[] { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
    hwS = new float[] { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    lock = new Object();
    GMTrace.o(20181246017536L, 150362);
  }
  
  public d()
  {
    GMTrace.i(20180977582080L, 150360);
    this.hwT = 0;
    this.hwU = 0;
    this.hwV = false;
    this.hwX = 0;
    this.hwY = 0;
    this.eSp = 0;
    this.hxb = -1;
    this.hxc = -1;
    this.hxd = -1;
    this.hxl = new float[16];
    this.hxn = hwQ;
    this.hxy = false;
    this.hxz = false;
    this.hxy = false;
    GMTrace.o(20180977582080L, 150360);
  }
  
  public final void bj(int paramInt1, int paramInt2)
  {
    GMTrace.i(20181111799808L, 150361);
    w.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this });
    if ((paramInt1 != this.hwT) || (paramInt2 != this.hwU))
    {
      w.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged change viewpoint");
      GLES20.glViewport(0, 0, paramInt1, paramInt2);
      this.hwT = paramInt1;
      this.hwU = paramInt2;
    }
    GMTrace.o(20181111799808L, 150361);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */