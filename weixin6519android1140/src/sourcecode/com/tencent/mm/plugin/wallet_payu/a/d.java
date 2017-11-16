package com.tencent.mm.plugin.wallet_payu.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.plugin.wallet_payu.pwd.a.f;
import com.tencent.mm.plugin.wallet_payu.pwd.a.g;
import com.tencent.mm.plugin.wallet_payu.remittance.a.i;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;

public class d
  implements aq
{
  public String ruf;
  private int rug;
  
  static
  {
    GMTrace.i(7933207248896L, 59107);
    a.h("PayUOpenProcess", com.tencent.mm.plugin.wallet_payu.create.a.c.class);
    a.h("PayUBindProcess", com.tencent.mm.plugin.wallet_payu.bind.model.c.class);
    a.h("PayUForgotPwdProcess", f.class);
    a.h("PayUModifyPasswordProcess", g.class);
    a.h("PayURemittanceProcess", i.class);
    a.h("PayUShowOrderProcess", com.tencent.mm.plugin.wallet_payu.order.a.d.class);
    GMTrace.o(7933207248896L, 59107);
  }
  
  public d()
  {
    GMTrace.i(7932267724800L, 59100);
    this.ruf = null;
    this.rug = -1;
    GMTrace.o(7932267724800L, 59100);
  }
  
  public static d bAm()
  {
    GMTrace.i(7932401942528L, 59101);
    d locald = (d)p.o(d.class);
    GMTrace.o(7932401942528L, 59101);
    return locald;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7932804595712L, 59104);
    GMTrace.o(7932804595712L, 59104);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7932938813440L, 59105);
    GMTrace.o(7932938813440L, 59105);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7932670377984L, 59103);
    GMTrace.o(7932670377984L, 59103);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7933073031168L, 59106);
    GMTrace.o(7933073031168L, 59106);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7932536160256L, 59102);
    GMTrace.o(7932536160256L, 59102);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */