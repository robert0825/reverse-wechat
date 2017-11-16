package com.tencent.mm.be;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum a
{
  static
  {
    GMTrace.i(16866605006848L, 125666);
    hfY = new a("INSTANCE");
    hfZ = new a[] { hfY };
    GMTrace.o(16866605006848L, 125666);
  }
  
  private a()
  {
    GMTrace.i(16865933918208L, 125661);
    GMTrace.o(16865933918208L, 125661);
  }
  
  public static boolean Ok()
  {
    GMTrace.i(16866068135936L, 125662);
    if (!bg.nm(Ol()))
    {
      GMTrace.o(16866068135936L, 125662);
      return true;
    }
    GMTrace.o(16866068135936L, 125662);
    return false;
  }
  
  public static String Ol()
  {
    GMTrace.i(16866202353664L, 125663);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vwC, String.valueOf(""));
    w.i("MicroMsg.WebviewKeepManager", "getLastPageUrl : %s", new Object[] { str });
    GMTrace.o(16866202353664L, 125663);
    return str;
  }
  
  public static String Om()
  {
    GMTrace.i(16866336571392L, 125664);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vwE, String.valueOf(""));
    w.i("MicroMsg.WebviewKeepManager", "getLastPageTitle : %s", new Object[] { str });
    GMTrace.o(16866336571392L, 125664);
    return str;
  }
  
  public static void p(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16866470789120L, 125665);
    h.xz();
    h.xy().xh().a(w.a.vwC, paramString1);
    h.xz();
    h.xy().xh().a(w.a.vwE, paramString2);
    h.xz();
    h.xy().xh().a(w.a.vwD, paramString3);
    GMTrace.o(16866470789120L, 125665);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\be\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */