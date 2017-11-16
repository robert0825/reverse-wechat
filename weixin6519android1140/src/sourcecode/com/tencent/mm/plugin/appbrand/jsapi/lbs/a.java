package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.d;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.compat.a.d.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class a
{
  public static final Map<String, a> ieT;
  private static final d.a ieU;
  
  static
  {
    GMTrace.i(19711215534080L, 146860);
    ieT = new HashMap();
    ieU = new a()
    {
      public final void a(double paramAnonymousDouble1, double paramAnonymousDouble2, d.b paramAnonymousb, double paramAnonymousDouble3, double paramAnonymousDouble4, double paramAnonymousDouble5)
      {
        GMTrace.i(19710276009984L, 146853);
        synchronized (a.ieT)
        {
          a.a[] arrayOfa = (a.a[])a.ieT.values().toArray(new a.a[0]);
          int j = arrayOfa.length;
          int i = 0;
          if (i < j)
          {
            arrayOfa[i].a(paramAnonymousDouble1, paramAnonymousDouble2, paramAnonymousb, paramAnonymousDouble3, paramAnonymousDouble4, paramAnonymousDouble5);
            i += 1;
          }
        }
        GMTrace.o(19710276009984L, 146853);
      }
    };
    GMTrace.o(19711215534080L, 146860);
  }
  
  static void a(String paramString, a parama)
  {
    GMTrace.i(19710947098624L, 146858);
    if (bg.nm(paramString))
    {
      GMTrace.o(19710947098624L, 146858);
      return;
    }
    synchronized (ieT)
    {
      ieT.put(paramString, parama);
      if (ieT.size() == 1) {
        ((d)h.h(d.class)).a(ieU);
      }
      GMTrace.o(19710947098624L, 146858);
      return;
    }
  }
  
  static void qi(String paramString)
  {
    GMTrace.i(19711081316352L, 146859);
    if (bg.nm(paramString))
    {
      GMTrace.o(19711081316352L, 146859);
      return;
    }
    synchronized (ieT)
    {
      ieT.remove(paramString);
      if (ieT.size() == 0) {
        ((d)h.h(d.class)).b(ieU);
      }
      GMTrace.o(19711081316352L, 146859);
      return;
    }
  }
  
  static abstract interface a
    extends d.a
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\lbs\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */