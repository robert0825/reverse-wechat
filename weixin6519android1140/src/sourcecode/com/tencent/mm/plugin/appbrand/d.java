package com.tencent.mm.plugin.appbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.e;
import com.tencent.mm.plugin.appbrand.appcache.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.af;

public final class d
{
  private static final c<e> hyA;
  
  static
  {
    GMTrace.i(10569109209088L, 78746);
    hyA = new c() {};
    GMTrace.o(10569109209088L, 78746);
  }
  
  public static void Rz()
  {
    GMTrace.i(16057674760192L, 119639);
    com.tencent.mm.plugin.appbrand.o.d.xB().A(u.hJX);
    com.tencent.mm.plugin.appbrand.o.d.xB().A(com.tencent.mm.plugin.appbrand.appstorage.d.hJX);
    GMTrace.o(16057674760192L, 119639);
  }
  
  public static void release()
  {
    GMTrace.i(10568840773632L, 78744);
    a.vgX.c(hyA);
    GMTrace.o(10568840773632L, 78744);
  }
  
  public static void setup()
  {
    GMTrace.i(10568706555904L, 78743);
    a.vgX.a(hyA);
    GMTrace.o(10568706555904L, 78743);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */