package com.tencent.mm.plugin.fingerprint;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fingerprint.b.b;
import com.tencent.mm.plugin.fingerprint.b.c;
import com.tencent.mm.plugin.fingerprint.b.d;
import com.tencent.mm.plugin.fingerprint.b.f;
import com.tencent.mm.plugin.fingerprint.b.g;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.plugin.fingerprint.b.j;
import com.tencent.mm.plugin.fingerprint.b.n;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;

public class a
  implements aq
{
  private n lkK;
  private i lkL;
  private j lkM;
  private b lkN;
  private f lkO;
  private g lkP;
  private c lkQ;
  
  static
  {
    GMTrace.i(10749363617792L, 80089);
    com.tencent.mm.wallet_core.a.h("FingerprintAuth", com.tencent.mm.plugin.fingerprint.ui.a.class);
    GMTrace.o(10749363617792L, 80089);
  }
  
  public a()
  {
    GMTrace.i(10748289875968L, 80081);
    this.lkK = new n();
    this.lkL = new i();
    this.lkM = new j();
    this.lkN = new b();
    this.lkO = new f();
    this.lkP = new g();
    GMTrace.o(10748289875968L, 80081);
  }
  
  public static a azq()
  {
    GMTrace.i(10748424093696L, 80082);
    a locala = (a)p.o(a.class);
    GMTrace.o(10748424093696L, 80082);
    return locala;
  }
  
  public static c azr()
  {
    GMTrace.i(10749229400064L, 80088);
    h.xw().wG();
    if (azq().lkQ == null) {
      azq().lkQ = new c();
    }
    c localc = azq().lkQ;
    GMTrace.o(10749229400064L, 80088);
    return localc;
  }
  
  public static void azs()
  {
    GMTrace.i(20380156690432L, 151844);
    if (com.tencent.d.b.a.cpG()) {}
    for (Object localObject = new com.tencent.mm.plugin.fingerprint.b.k();; localObject = new d())
    {
      ((com.tencent.mm.pluginsdk.k)localObject).azC();
      h.a(com.tencent.mm.pluginsdk.k.class, (com.tencent.mm.kernel.c.a)localObject);
      GMTrace.o(20380156690432L, 151844);
      return;
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(10748826746880L, 80085);
    w.i("MicroMsg.SubCoreFingerPrint", "alvinluo SoterWrapperApi isInit: %b in SubCoreFingerprint initTA", new Object[] { Boolean.valueOf(com.tencent.d.b.b.a.cpH().isInit()) });
    if (!com.tencent.d.b.b.a.cpH().isInit())
    {
      w.i("MicroMsg.SubCoreFingerPrint", "alvinluo soter is not initialized, do init");
      h.a(com.tencent.mm.pluginsdk.k.class, new d());
      h.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20964138024960L, 156195);
          w.i("MicroMsg.SubCoreFingerPrint", "alvinluo post 1500ms delayed");
          a.azs();
          GMTrace.o(20964138024960L, 156195);
        }
      }, 1500L);
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.b(this.lkK);
      com.tencent.mm.sdk.b.a.vgX.b(this.lkL);
      com.tencent.mm.sdk.b.a.vgX.b(this.lkM);
      com.tencent.mm.sdk.b.a.vgX.b(this.lkN);
      com.tencent.mm.sdk.b.a.vgX.b(this.lkO);
      com.tencent.mm.sdk.b.a.vgX.b(this.lkP);
      GMTrace.o(10748826746880L, 80085);
      return;
      azs();
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(10748960964608L, 80086);
    GMTrace.o(10748960964608L, 80086);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(10748692529152L, 80084);
    GMTrace.o(10748692529152L, 80084);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(10749095182336L, 80087);
    com.tencent.mm.sdk.b.a.vgX.c(this.lkK);
    this.lkL.release();
    com.tencent.mm.sdk.b.a.vgX.c(this.lkL);
    com.tencent.mm.sdk.b.a.vgX.c(this.lkM);
    com.tencent.mm.sdk.b.a.vgX.c(this.lkN);
    com.tencent.mm.sdk.b.a.vgX.c(this.lkO);
    if (this.lkQ != null)
    {
      c.abort();
      c.release();
      this.lkQ = null;
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.lkP);
    GMTrace.o(10749095182336L, 80087);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(10748558311424L, 80083);
    GMTrace.o(10748558311424L, 80083);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */