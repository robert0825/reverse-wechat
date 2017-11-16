package com.tencent.mm.plugin.offline;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.offline.a.r.a;
import com.tencent.mm.plugin.offline.a.r.c;
import com.tencent.mm.plugin.offline.a.r.e;
import com.tencent.mm.plugin.offline.a.r.f;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

public final class m
  implements r.a
{
  c mKc;
  
  public m()
  {
    GMTrace.i(6255619866624L, 46608);
    this.mKc = new c() {};
    a.vgX.b(this.mKc);
    k.aVi();
    k.aVj().a(this);
    GMTrace.o(6255619866624L, 46608);
  }
  
  private static void aj(int paramInt, String paramString)
  {
    GMTrace.i(6255754084352L, 46609);
    tc localtc = new tc();
    localtc.eYy.eYA = paramInt;
    localtc.eYy.action = 4;
    localtc.eYy.content = paramString;
    a.vgX.m(localtc);
    GMTrace.o(6255754084352L, 46609);
  }
  
  public final boolean a(r.c paramc)
  {
    GMTrace.i(6255888302080L, 46610);
    if (paramc.nBn == 6)
    {
      paramc = (r.f)paramc;
      if ((paramc.nBu.rhv != null) && (paramc.nBu.rhv.size() > 0))
      {
        paramc = (Orders.Commodity)paramc.nBu.rhv.get(0);
        aj(0, ab.getContext().getString(a.i.thd, new Object[] { e.d(paramc.jWS, paramc.nEr) }));
      }
    }
    for (;;)
    {
      GMTrace.o(6255888302080L, 46610);
      return false;
      aj(9, ab.getContext().getString(a.i.thb));
      continue;
      if (paramc.nBn == 8) {
        aj(6, ab.getContext().getString(a.i.thb));
      } else if (paramc.nBn == 5) {
        aj(7, bg.aq(((r.e)paramc).nBr, ""));
      } else if (paramc.nBn == 4) {
        aj(8, ab.getContext().getString(a.i.thc));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */