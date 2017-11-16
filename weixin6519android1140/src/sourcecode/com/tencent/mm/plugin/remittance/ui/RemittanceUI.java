package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.remittance.c.l;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;

public class RemittanceUI
  extends RemittanceBaseUI
{
  public RemittanceUI()
  {
    GMTrace.i(10831504867328L, 80701);
    GMTrace.o(10831504867328L, 80701);
  }
  
  public final void bbC()
  {
    GMTrace.i(10832175955968L, 80706);
    final sm localsm = new sm();
    localsm.eXp.eXr = "7";
    localsm.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10821438537728L, 80626);
        if (!bg.nm(localsm.eXq.eXs))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)RemittanceUI.this.findViewById(a.f.sqJ), localsm.eXq.eXs, localsm.eXq.content, localsm.eXq.url);
          GMTrace.o(10821438537728L, 80626);
          return;
        }
        w.i("MicroMsg.RemittanceUI", "no bulletin data");
        GMTrace.o(10821438537728L, 80626);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(localsm);
    GMTrace.o(10832175955968L, 80706);
  }
  
  public final void bbw()
  {
    GMTrace.i(10831639085056L, 80702);
    if (bbF())
    {
      h.xz();
      this.onB = ((String)h.xy().xh().get(w.a.vwa, ""));
      h.xz();
      this.onC = ((String)h.xy().xh().get(w.a.vwe, ""));
      h.xz();
      this.onD = ((Integer)h.xy().xh().get(w.a.vwf, Integer.valueOf(0))).intValue();
      if ((bg.nm(this.onB)) || (bg.nm(this.onC)))
      {
        com.tencent.mm.plugin.wallet_core.c.t.a(true, null);
        GMTrace.o(10831639085056L, 80702);
        return;
      }
      com.tencent.mm.plugin.wallet_core.c.t.a(false, null);
    }
    GMTrace.o(10831639085056L, 80702);
  }
  
  public final void bbz()
  {
    GMTrace.i(10832041738240L, 80705);
    u.makeText(this.vKB.vKW, a.i.sXj, 0).show();
    GMTrace.o(10832041738240L, 80705);
  }
  
  public void dt(String paramString1, String paramString2)
  {
    GMTrace.i(10831907520512L, 80704);
    if (this.onh != null) {
      this.onh.j(3, new Object[] { Integer.valueOf(this.onk), Double.valueOf(this.oni) });
    }
    int i = getIntent().getIntExtra("pay_channel", -1);
    w.i("MicroMsg.RemittanceUI", "doSceneGenRemittance, channel: %s", new Object[] { Integer.valueOf(i) });
    paramString1 = new l(this.oni, "1", this.fKP, this.onk, this.gRb, paramString1, paramString2, this.onl, i);
    paramString1.fXf = "RemittanceProcess";
    l(paramString1);
    GMTrace.o(10831907520512L, 80704);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10831773302784L, 80703);
    super.onCreate(paramBundle);
    GMTrace.o(10831773302784L, 80703);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */