package com.tencent.mm.plugin.zero;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelmulti.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bs;
import com.tencent.mm.y.bs.a;
import java.util.Queue;

public final class b
  implements c, com.tencent.mm.plugin.zero.b.b
{
  private bs tkh;
  private r tki;
  
  public b()
  {
    GMTrace.i(13621220343808L, 101486);
    GMTrace.o(13621220343808L, 101486);
  }
  
  public final r JF()
  {
    GMTrace.i(13621354561536L, 101487);
    h.xz();
    h.xw().wG();
    if (this.tki == null) {
      this.tki = new r();
    }
    r localr = this.tki;
    GMTrace.o(13621354561536L, 101487);
    return localr;
  }
  
  public final bs bIL()
  {
    GMTrace.i(13621488779264L, 101488);
    h.xz();
    h.xw().wG();
    if (this.tkh == null) {
      this.tkh = new bs(new bs.a()
      {
        public final boolean BS()
        {
          GMTrace.i(13625783746560L, 101520);
          if (b.this.JF().gOl == null)
          {
            GMTrace.o(13625783746560L, 101520);
            return true;
          }
          GMTrace.o(13625783746560L, 101520);
          return false;
        }
      });
    }
    bs localbs = this.tkh;
    GMTrace.o(13621488779264L, 101488);
    return localbs;
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(13621622996992L, 101489);
    GMTrace.o(13621622996992L, 101489);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(13621757214720L, 101490);
    if (this.tki != null)
    {
      r localr = this.tki;
      w.i("MicroMsg.SyncService", "clear synclist:%s notify:%s running:%s", new Object[] { Integer.valueOf(localr.gOi.size()), Integer.valueOf(localr.gOj.size()), localr.gOl });
      localr.gOi.clear();
      localr.gOj.clear();
    }
    if (this.tkh != null) {
      this.tkh.BN();
    }
    GMTrace.o(13621757214720L, 101490);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\zero\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */