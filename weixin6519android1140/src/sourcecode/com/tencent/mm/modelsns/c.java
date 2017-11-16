package com.tencent.mm.modelsns;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class c
{
  public static int gVL;
  public static c gVM;
  
  static
  {
    GMTrace.i(4458444488704L, 33218);
    gVL = 0;
    gVM = new c();
    GMTrace.o(4458444488704L, 33218);
  }
  
  public c()
  {
    GMTrace.i(4458176053248L, 33216);
    GMTrace.o(4458176053248L, 33216);
  }
  
  public static void LS()
  {
    GMTrace.i(4458310270976L, 33217);
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100024");
    w.i("MicroMsg.StatisticsOplogAbTest", "test " + localc.field_rawXML + " " + localc.isValid());
    if (localc.isValid())
    {
      gVL = bg.Sy((String)localc.bSg().get("Switch"));
      w.i("MicroMsg.StatisticsOplogAbTest", "switchVal " + gVL);
    }
    GMTrace.o(4458310270976L, 33217);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsns\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */