package com.tencent.mm.plugin.fps_lighter.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fps_lighter.b.b;
import com.tencent.mm.plugin.fps_lighter.b.e;
import com.tencent.mm.plugin.fps_lighter.b.g;
import com.tencent.mm.plugin.fps_lighter.e.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements c
{
  private com.tencent.mm.plugin.fps_lighter.b.c lmg;
  private int lmh;
  private int lmi;
  private e lmj;
  
  public a(com.tencent.mm.plugin.fps_lighter.b.c paramc)
  {
    GMTrace.i(5235296698368L, 39006);
    this.lmg = paramc;
    this.lmj = g.aAl().lne;
    GMTrace.o(5235296698368L, 39006);
  }
  
  public final void a(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3, boolean paramBoolean1, long paramLong3, boolean paramBoolean2)
  {
    GMTrace.i(5235430916096L, 39007);
    b localb;
    if ((com.tencent.mm.plugin.fps_lighter.e.a.nL(paramInt2) == a.a.lnJ) && (!paramBoolean1))
    {
      w.i("MicroMsg.FrameAnalyseCallback", "Scene:%s pre:%s droppedFrames:%s isInputHandling:%s isOnCreateConsuming:%s", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
      localb = g.aAl().lnd;
      if (this.lmj.isStart) {
        break label266;
      }
    }
    label266:
    for (Object localObject = null;; localObject = GMTrace.getMainThreadBuffer())
    {
      int i = e.aAj();
      int j = this.lmh;
      long l1 = paramInt2;
      paramLong1 -= GMTrace.getStartTime();
      long l2 = GMTrace.getStartTime();
      w.i("MicroMsg.FPSAnalyser", "[immediateExec] preIndex:%s,curIndex：%s droopedCount:%s previousFrameMS:%s scene:%s isOnCreateConsuming:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(paramLong1), Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean1) });
      localObject = new com.tencent.mm.plugin.fps_lighter.d.a((long[])localObject, i, j, l1, paramLong1, paramLong2 - l2, paramInt3, paramInt1, paramBoolean1, paramLong3, paramBoolean2);
      ((com.tencent.mm.plugin.fps_lighter.d.a)localObject).lnF = localb;
      g.aAl();
      g.OW().post((Runnable)localObject);
      this.lmh = this.lmi;
      this.lmi = this.lmj.lmO;
      this.lmj.aAk();
      GMTrace.o(5235430916096L, 39007);
      return;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(5235699351552L, 39009);
    GMTrace.o(5235699351552L, 39009);
    return "MicroMsg.FrameAnalyseCallback";
  }
  
  public final void z(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(5235565133824L, 39008);
    if (paramInt == Integer.MAX_VALUE)
    {
      if (paramBoolean) {
        break label62;
      }
      g.aAl().lne.stopTrace();
    }
    for (;;)
    {
      this.lmh = this.lmi;
      this.lmi = this.lmj.lmO;
      this.lmj.aAk();
      GMTrace.o(5235565133824L, 39008);
      return;
      label62:
      e locale = g.aAl().lne;
      if (locale.isStart != true)
      {
        if (!GMTrace.isInit()) {
          GMTrace.init(true);
        }
        GMTrace.startTrace();
        locale.lmO = GMTrace.getMainThreadIndex();
        w.i("MicroMsg.FpsGMTraceHandler", "[startTrace] start:%s", new Object[] { Integer.valueOf(locale.lmO) });
        locale.isStart = true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */