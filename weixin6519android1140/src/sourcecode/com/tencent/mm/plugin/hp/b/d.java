package com.tencent.mm.plugin.hp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ax;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import java.util.HashMap;

public final class d
  implements aq
{
  private final com.tencent.mm.sdk.b.c<ax> kmI;
  public boolean mhd;
  private final h mhe;
  private final com.tencent.mm.sdk.b.c<ck> mhf;
  private final f mhg;
  private final com.tencent.mm.sdk.b.c<bf> mhh;
  
  public d()
  {
    GMTrace.i(5745324064768L, 42806);
    this.mhd = true;
    this.mhe = new h();
    this.kmI = new com.tencent.mm.sdk.b.c() {};
    this.mhf = new com.tencent.mm.sdk.b.c() {};
    this.mhg = new f();
    this.mhh = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(5745324064768L, 42806);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5745726717952L, 42809);
    b.a(new g(), new String[] { "//tinker" });
    at.getSysCmdMsgExtension().a("checktinkerupdate", this.mhe, true);
    com.tencent.mm.sdk.b.a.vgX.b(this.kmI);
    this.mhf.bPu();
    com.tencent.mm.sdk.b.a.vgX.b(this.mhg);
    com.tencent.mm.sdk.b.a.vgX.b(this.mhh);
    w.d("Tinker.SubCoreHotpatch", "onAccountPostReset");
    com.tencent.mm.plugin.hp.tinker.g.cH(ab.getContext());
    try
    {
      at.AR();
      long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vyI, Long.valueOf(0L))).longValue();
      long l2 = System.currentTimeMillis();
      if (l2 - l1 >= 3600000L)
      {
        com.tinkerboots.sdk.a.csM().nj(true);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vyI, Long.valueOf(l2));
        w.i("Tinker.SubCoreHotpatch", "try to fetch patch update true when onAccountPostReset. current:%d lastUpdate:%d", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(l1) });
      }
      for (;;)
      {
        f.cB(l2);
        GMTrace.o(5745726717952L, 42809);
        return;
        com.tinkerboots.sdk.a.csM().nj(false);
        w.i("Tinker.SubCoreHotpatch", "try to fetch patch update false when onAccountPostReset.");
      }
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("Tinker.SubCoreHotpatch", localException, "", new Object[0]);
      GMTrace.o(5745726717952L, 42809);
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5745860935680L, 42810);
    GMTrace.o(5745860935680L, 42810);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5745592500224L, 42808);
    GMTrace.o(5745592500224L, 42808);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5745995153408L, 42811);
    b.C(new String[] { "//tinker" });
    at.getSysCmdMsgExtension().b("checktinkerupdate", this.mhe, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.kmI);
    this.mhf.dead();
    com.tencent.mm.sdk.b.a.vgX.c(this.mhg);
    com.tencent.mm.sdk.b.a.vgX.c(this.mhh);
    w.d("Tinker.SubCoreHotpatch", "onAccountRelease");
    GMTrace.o(5745995153408L, 42811);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5745458282496L, 42807);
    GMTrace.o(5745458282496L, 42807);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */