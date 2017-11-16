package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class p
  implements f
{
  volatile int frameCount;
  long jst;
  int lhd;
  int mAB;
  boolean mZm;
  int nbX;
  int nbY;
  int nbZ;
  int nca;
  int ncb;
  long tick;
  
  public p(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7369627009024L, 54908);
    this.nbX = -1;
    this.frameCount = 0;
    this.jst = 0L;
    this.tick = 0L;
    this.nbY = -1;
    this.nbZ = -1;
    this.nca = -1;
    this.ncb = -1;
    this.mZm = paramBoolean;
    this.nbY = paramInt1;
    this.mAB = paramInt2;
    this.lhd = paramInt3;
    w.i("MicroMsg.MMSightX264YUVRecorder", "create MMSightX264YUVRecorder, needRotateEachFrame: %s, initRotate: %s, targetWidth: %s, targetHeight: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.nbY), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(7369627009024L, 54908);
  }
  
  public final long aPO()
  {
    GMTrace.i(7369895444480L, 54910);
    if (0L == this.jst)
    {
      w.w("MicroMsg.MMSightX264YUVRecorder", "do not start record");
      GMTrace.o(7369895444480L, 54910);
      return 0L;
    }
    long l1 = System.currentTimeMillis();
    long l2 = this.jst;
    GMTrace.o(7369895444480L, 54910);
    return l1 - l2;
  }
  
  public final int qM(int paramInt)
  {
    GMTrace.i(20852334657536L, 155362);
    if (paramInt < 0)
    {
      w.e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
      GMTrace.o(20852334657536L, 155362);
      return -1;
    }
    this.nbX = paramInt;
    try
    {
      this.frameCount = 0;
      this.jst = 0L;
      GMTrace.o(20852334657536L, 155362);
      return 0;
    }
    finally {}
  }
  
  public final void stop()
  {
    GMTrace.i(7369761226752L, 54909);
    try
    {
      this.frameCount = 0;
      this.jst = 0L;
      GMTrace.o(7369761226752L, 54909);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */