package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.wallet_core.c.a.c;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WalletIbgOrderInfoUI
  extends WalletOrderInfoOldUI
{
  private String hyD;
  private String mTimeStamp;
  private String qXj;
  private String rqc;
  private String rqd;
  private String rqe;
  private String rqf;
  
  public WalletIbgOrderInfoUI()
  {
    GMTrace.i(6957578584064L, 51838);
    this.hyD = null;
    this.rqc = null;
    this.mTimeStamp = null;
    this.qXj = null;
    this.rqd = null;
    this.rqe = null;
    this.rqf = null;
    GMTrace.o(6957578584064L, 51838);
  }
  
  protected final void PY()
  {
    GMTrace.i(6957981237248L, 51841);
    this.hyD = getIntent().getStringExtra("appId");
    this.rqc = getIntent().getStringExtra("nonceStr");
    this.mTimeStamp = getIntent().getStringExtra("timeStamp");
    this.qXj = getIntent().getStringExtra("packageExt");
    this.rqd = getIntent().getStringExtra("paySignature");
    this.rqe = getIntent().getStringExtra("signtype");
    this.rqf = getIntent().getStringExtra("url");
    r(new c(this.hyD, this.rqc, this.mTimeStamp, this.qXj, this.rqd, this.rqe, this.rqf));
    GMTrace.o(6957981237248L, 51841);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6958115454976L, 51842);
    if ((paramk instanceof c))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.qYC = ((c)paramk).rcB;
        if (this.qYC != null) {
          this.rna = this.qYC.rhv;
        }
        c(this.qYC);
        w.d("MicroMsg.WalletIbgOrderInfoUI", "Coomdity:" + this.rna);
        if ((this.rna != null) && (this.rna.size() != 0))
        {
          paramString = (Orders.Commodity)this.rna.get(0);
          w.d("MicroMsg.WalletIbgOrderInfoUI", "Coomdity:" + paramString.toString());
          com.tencent.mm.kernel.h.xz();
          paramk = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString.nEs);
          if ((paramk == null) || ((int)paramk.fTq == 0)) {
            break label212;
          }
          K(paramk);
        }
        for (;;)
        {
          this.rnH.notifyDataSetChanged();
          bzH();
          GMTrace.o(6958115454976L, 51842);
          return true;
          label212:
          ak.a.gmX.a(paramString.nEs, "", this.rnO);
        }
      }
      setResult(0);
    }
    GMTrace.o(6958115454976L, 51842);
    return false;
  }
  
  public final void done()
  {
    GMTrace.i(6957847019520L, 51840);
    w.i("MicroMsg.WalletIbgOrderInfoUI", "hy: result is not set manly. set to OK");
    Iterator localIterator = this.rmZ.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bg.nm(str))
      {
        w.d("MicroMsg.WalletIbgOrderInfoUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str });
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new i(str), 0);
      }
    }
    setResult(-1);
    finish();
    GMTrace.o(6957847019520L, 51840);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6957712801792L, 51839);
    super.onCreate(paramBundle);
    this.xEL.hN(1565);
    GMTrace.o(6957712801792L, 51839);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\ibg\WalletIbgOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */