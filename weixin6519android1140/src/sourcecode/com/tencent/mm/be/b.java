package com.tencent.mm.be;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public enum b
{
  static
  {
    GMTrace.i(12936307277824L, 96383);
    hga = new b("INSTANCE");
    hgb = new b[] { hga };
    GMTrace.o(12936307277824L, 96383);
  }
  
  private b()
  {
    GMTrace.i(12935501971456L, 96377);
    GMTrace.o(12935501971456L, 96377);
  }
  
  public static boolean Ok()
  {
    GMTrace.i(12935636189184L, 96378);
    if (!bg.nm(On()))
    {
      GMTrace.o(12935636189184L, 96378);
      return true;
    }
    GMTrace.o(12935636189184L, 96378);
    return false;
  }
  
  public static String Om()
  {
    GMTrace.i(12935904624640L, 96380);
    at.AR();
    String str = (String)c.xh().get(w.a.vwo, String.valueOf(""));
    w.i("MicroMsg.WebviewKeepManager", "getLastPageTitle : %s", new Object[] { str });
    GMTrace.o(12935904624640L, 96380);
    return str;
  }
  
  public static String On()
  {
    GMTrace.i(12935770406912L, 96379);
    at.AR();
    String str = (String)c.xh().get(w.a.vwn, String.valueOf(""));
    w.i("MicroMsg.WebviewKeepManager", "getLastPage : %s", new Object[] { str });
    GMTrace.o(12935770406912L, 96379);
    return str;
  }
  
  public static int Oo()
  {
    GMTrace.i(12936038842368L, 96381);
    at.AR();
    int i = bg.a((Integer)c.xh().get(w.a.vwz, null), 0);
    w.i("MicroMsg.WebviewKeepManager", "getLastPageKeepTopScene : %d", new Object[] { Integer.valueOf(i) });
    GMTrace.o(12936038842368L, 96381);
    return i;
  }
  
  public static void f(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(12936173060096L, 96382);
    w.i("MicroMsg.WebviewKeepManager", "saveLastPage : url=%s title=%s scene=%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    at.AR();
    c.xh().a(w.a.vwn, bg.nl(paramString1));
    at.AR();
    c.xh().a(w.a.vwo, bg.nl(paramString2));
    at.AR();
    c.xh().a(w.a.vwz, Integer.valueOf(paramInt));
    GMTrace.o(12936173060096L, 96382);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\be\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */