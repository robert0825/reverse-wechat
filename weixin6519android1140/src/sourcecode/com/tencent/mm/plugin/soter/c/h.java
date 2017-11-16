package com.tencent.mm.plugin.soter.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.r;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.q;

public final class h
{
  private static String TAG;
  
  static
  {
    GMTrace.i(7099044069376L, 52892);
    TAG = "MicroMsg.SoterUtil";
    GMTrace.o(7099044069376L, 52892);
  }
  
  public static void bqC()
  {
    GMTrace.i(7098909851648L, 52891);
    if (bg.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.xu().h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("SoterEntry"), 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.i(TAG, "alvinluo dynamic config support soter: %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.w.d(TAG, "alvinluo set all soter support flag to true");
        p.fQI.eVF = true;
        p.fQG.fQO = 1;
        p.fQG.fQP = 1;
        com.tencent.mm.sdk.platformtools.w.d(TAG, "alvinluo deviceInfo soter support: %b, force status: %d, allow external: %d", new Object[] { Boolean.valueOf(p.fQI.eVF), Integer.valueOf(p.fQG.fQO), Integer.valueOf(p.fQG.fQP) });
      }
      GMTrace.o(7098909851648L, 52891);
      return;
    }
  }
  
  public static String bqD()
  {
    GMTrace.i(18501645369344L, 137848);
    try
    {
      String str = g.n(q.zH().getBytes());
      if (str != null)
      {
        str = str.substring(0, 8);
        GMTrace.o(18501645369344L, 137848);
        return str;
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace(TAG, localException, "alvinluo get md5 exception", new Object[0]);
      GMTrace.o(18501645369344L, 137848);
    }
    return "";
  }
  
  public static String bqE()
  {
    GMTrace.i(18501779587072L, 137849);
    String str = "WechatAuthKeyPay&" + q.zH();
    GMTrace.o(18501779587072L, 137849);
    return str;
  }
  
  public static boolean bqF()
  {
    GMTrace.i(18998653616128L, 141551);
    if (!p.fQI.eVF)
    {
      com.tencent.mm.sdk.platformtools.w.i(TAG, "hy: dynamic config is not support soter");
      GMTrace.o(18998653616128L, 141551);
      return false;
    }
    boolean bool = com.tencent.d.b.a.cpG();
    GMTrace.o(18998653616128L, 141551);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */