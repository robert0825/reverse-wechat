package com.tencent.mm.plugin.appbrand.f;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 enum i
{
  private static final a hWu;
  
  static
  {
    GMTrace.i(10653129506816L, 79372);
    hWv = new i[0];
    hWu = new a();
    GMTrace.o(10653129506816L, 79372);
  }
  
  static List<com.tencent.mm.plugin.appbrand.c.e> Vy()
  {
    GMTrace.i(10652458418176L, 79367);
    LinkedList localLinkedList = new LinkedList();
    if (com.tencent.mm.plugin.appbrand.app.e.Sj() != null)
    {
      ArrayList localArrayList = com.tencent.mm.plugin.appbrand.app.e.Sj().TG();
      if (!bg.cc(localArrayList)) {
        localLinkedList.addAll(localArrayList);
      }
    }
    GMTrace.o(10652458418176L, 79367);
    return localLinkedList;
  }
  
  static void d(j.a parama)
  {
    GMTrace.i(10652861071360L, 79370);
    if (com.tencent.mm.plugin.appbrand.app.e.Sj() != null) {
      com.tencent.mm.plugin.appbrand.app.e.Sj().c(parama);
    }
    GMTrace.o(10652861071360L, 79370);
  }
  
  static void e(j.a parama)
  {
    GMTrace.i(10652995289088L, 79371);
    if (com.tencent.mm.plugin.appbrand.app.e.Sj() != null) {
      com.tencent.mm.plugin.appbrand.app.e.Sj().j(parama);
    }
    GMTrace.o(10652995289088L, 79371);
  }
  
  static void onCreate()
  {
    GMTrace.i(10652189982720L, 79365);
    q.UC().a(hWu, d.xB().ngv.getLooper());
    GMTrace.o(10652189982720L, 79365);
  }
  
  static void onDestroy()
  {
    GMTrace.i(10652324200448L, 79366);
    q.UC().j(hWu);
    GMTrace.o(10652324200448L, 79366);
  }
  
  static com.tencent.mm.plugin.appbrand.c.e pW(String paramString)
  {
    GMTrace.i(10652592635904L, 79368);
    if (com.tencent.mm.plugin.appbrand.app.e.Sj() == null)
    {
      GMTrace.o(10652592635904L, 79368);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.e.Sj().oG(paramString);
    GMTrace.o(10652592635904L, 79368);
    return paramString;
  }
  
  static com.tencent.mm.plugin.appbrand.c.e pX(String paramString)
  {
    GMTrace.i(10652726853632L, 79369);
    if (com.tencent.mm.plugin.appbrand.app.e.Sj() == null)
    {
      GMTrace.o(10652726853632L, 79369);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.e.Sj().oG(paramString);
    GMTrace.o(10652726853632L, 79369);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */