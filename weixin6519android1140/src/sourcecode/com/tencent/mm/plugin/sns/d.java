package com.tencent.mm.plugin.sns;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.hn;
import com.tencent.mm.g.a.hn.a;
import com.tencent.mm.g.a.ns;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.p;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends c<hn>
  implements e
{
  private int oWJ;
  private bfh oWK;
  private m oWL;
  private aj oWM;
  
  public d()
  {
    GMTrace.i(8862665015296L, 66032);
    this.vhf = hn.class.getName().hashCode();
    GMTrace.o(8862665015296L, 66032);
  }
  
  private boolean a(hn paramhn)
  {
    GMTrace.i(8862799233024L, 66033);
    if (!(paramhn instanceof hn))
    {
      w.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
      GMTrace.o(8862799233024L, 66033);
      return false;
    }
    this.oWJ = paramhn.eKO.eGH;
    this.oWL = ae.bjd().va(this.oWJ);
    this.oWK = ai.m(this.oWL);
    if ((this.oWK != null) && (((this.oWK.uEI == 3) && (this.oWK.uRb != null) && (this.oWK.uRb.size() > 0)) || ((this.oWK.uEI == 5) && (this.oWK.uDw != null) && (this.oWK.uDw.size() > 0))))
    {
      paramhn.eKP.eKQ = this.oWK;
      GMTrace.o(8862799233024L, 66033);
      return true;
    }
    paramhn = new p(this.oWL.field_snsId);
    ((bfi)paramhn.fUa.gtC.gtK).uRh = 1;
    h.xz();
    h.xx().fYr.a(210, this);
    h.xz();
    h.xx().fYr.a(paramhn, 0);
    this.oWM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(8311164370944L, 61923);
        ns localns = new ns();
        localns.eSI.eKQ = null;
        a.vgX.m(localns);
        GMTrace.o(8311164370944L, 61923);
        return false;
      }
    }, false);
    this.oWM.z(10000L, 10000L);
    GMTrace.o(8862799233024L, 66033);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8862933450752L, 66034);
    w.i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.oWM.stopTimer();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ae.bjd().dU(this.oWL.field_snsId);
      paramk = new ns();
      paramk.eSI.eKQ = ai.m(paramString);
      a.vgX.m(paramk);
      GMTrace.o(8862933450752L, 66034);
      return;
    }
    paramString = new ns();
    paramString.eSI.eKQ = null;
    a.vgX.m(paramString);
    GMTrace.o(8862933450752L, 66034);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */