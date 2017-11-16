package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.g.a.sn.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.ArrayList;

public final class u
  extends c<sn>
  implements e
{
  private boolean lkV;
  private sn riP;
  
  public u()
  {
    GMTrace.i(6904159928320L, 51440);
    this.lkV = false;
    this.vhf = sn.class.getName().hashCode();
    GMTrace.o(6904159928320L, 51440);
  }
  
  private void a(int paramInt, String paramString, k paramk)
  {
    boolean bool2 = false;
    GMTrace.i(6904562581504L, 51443);
    af localaf;
    if (this.riP != null)
    {
      this.riP.eXu.errCode = paramInt;
      this.riP.eXu.eAR = paramString;
      this.riP.eXu.eXv = n.byx().byS();
      paramString = this.riP.eXu;
      localaf = n.byx();
      if (((localaf.rju == null) || (!localaf.rju.byK())) && ((localaf.qWD == null) || (localaf.qWD.size() <= 0))) {
        break label747;
      }
      paramInt = 1;
      if (paramInt == 0) {
        break label752;
      }
      bool1 = false;
      label116:
      paramString.eXw = bool1;
      paramString = this.riP.eXu;
      localaf = n.byx();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      localaf.d(localArrayList1, localArrayList2);
      if (!af.bL(localArrayList2)) {
        break label783;
      }
    }
    label747:
    label752:
    label783:
    for (boolean bool1 = true;; bool1 = false)
    {
      paramString.eXx = bool1;
      this.riP.eXu.eXy = n.byx().byW().byK();
      this.riP.eXu.eXz = n.byx().byV();
      this.riP.eXu.eXA = n.byx().apc();
      this.riP.eXu.eXB = n.byx().byT();
      this.riP.eXu.eXC = n.byx().byW().byN();
      this.riP.eXu.eXD = "";
      paramString = this.riP.eXu;
      localaf = n.byx();
      bool1 = bool2;
      if (localaf.rjs != null)
      {
        bool1 = bool2;
        if (localaf.rjs.field_paymenu_use_new == 1) {
          bool1 = true;
        }
      }
      paramString.eXR = bool1;
      if ((paramk != null) && ((paramk instanceof o)))
      {
        this.riP.eXu.eXD = ((o)paramk).eXD;
        this.riP.eXu.eXE = ((o)paramk).eXE;
        this.riP.eXu.eXF = ((o)paramk).eXF;
        this.riP.eXu.eXG = ((o)paramk).eXG;
        this.riP.eXu.eXH = ((o)paramk).eXH;
        this.riP.eXu.scene = ((o)paramk).scene;
        this.riP.eXu.eXI = ((o)paramk).eXI;
        this.riP.eXu.eXJ = ((o)paramk).eXJ;
        this.riP.eXu.eXK = ((o)paramk).eXK;
        this.riP.eXu.eXL = ((o)paramk).eXL;
        this.riP.eXu.eXM = ((o)paramk).eXM;
        this.riP.eXu.eXN = ((o)paramk).eXN;
        this.riP.eXu.eXO = ((o)paramk).eXO;
        this.riP.eXu.title = ((o)paramk).title;
        this.riP.eXu.eXP = ((o)paramk).eXP;
        this.riP.eXu.eXQ = ((o)paramk).eXQ;
      }
      w.d("MicroMsg.WalletGetUserInfoEventListener", "mUserInfo needBind : " + this.riP.eXu.eXw + " hasNewTips : " + this.riP.eXu.eXx + " swipeOn : " + this.riP.eXu.eXy);
      if (this.riP.eDO != null) {
        this.riP.eDO.run();
      }
      if (this.riP.eXu.eXo != null) {
        this.riP.eXu.eXo.run();
      }
      if (this.lkV) {
        this.riP = null;
      }
      GMTrace.o(6904562581504L, 51443);
      return;
      paramInt = 0;
      break;
      if ((localaf.qWC != null) && (localaf.qWC.size() > 0))
      {
        bool1 = false;
        break label116;
      }
      bool1 = true;
      break label116;
    }
  }
  
  private boolean a(sn paramsn)
  {
    GMTrace.i(6904294146048L, 51441);
    if (!(paramsn instanceof sn))
    {
      w.f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
      GMTrace.o(6904294146048L, 51441);
      return false;
    }
    this.lkV = false;
    this.riP = paramsn;
    h.xz();
    h.xx().fYr.a(385, this);
    h.xz();
    h.xx().fYr.a(1518, this);
    if (n.byx().byR())
    {
      w.i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
      if (q.zR())
      {
        h.xz();
        h.xx().fYr.a(new a(), 0);
      }
    }
    for (;;)
    {
      GMTrace.o(6904294146048L, 51441);
      return true;
      h.xz();
      h.xx().fYr.a(new o(null, 1), 0);
      continue;
      paramsn = n.byx();
      long l = bg.aG(paramsn.rjz);
      w.i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time " + l, new Object[] { Long.valueOf(paramsn.rjz), Long.valueOf(System.currentTimeMillis() / 1000L) });
      int i;
      if (l > 0L) {
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          w.i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
          if (q.zR())
          {
            h.xz();
            h.xx().fYr.a(new a(), 0);
            break;
            i = 0;
            continue;
          }
          h.xz();
          h.xx().fYr.a(new o(null, 1), 0);
          break;
        }
      }
      this.lkV = true;
      w.i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
      a(0, "", null);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6904428363776L, 51442);
    if (((paramk instanceof o)) || ((paramk instanceof a)))
    {
      h.xz();
      h.xx().fYr.b(385, this);
      h.xz();
      h.xx().fYr.b(1518, this);
      this.lkV = true;
      a(paramInt2, paramString, paramk);
    }
    GMTrace.o(6904428363776L, 51442);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */