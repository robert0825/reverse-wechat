package com.tencent.mm.plugin.appbrand.task;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI1;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI2;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI3;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI4;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public final class d
{
  private static final LinkedList<e> iAl;
  private static final e iAm;
  private static final e iAn;
  
  static
  {
    GMTrace.i(10646284402688L, 79321);
    LinkedList localLinkedList = new LinkedList();
    iAl = localLinkedList;
    localLinkedList.add(new e(AppBrandUI.class, AppBrandTaskPreloadReceiver.class));
    iAl.add(new e(AppBrandUI1.class, AppBrandTaskPreloadReceiver1.class));
    iAl.add(new e(AppBrandUI2.class, AppBrandTaskPreloadReceiver2.class));
    iAl.add(new e(AppBrandUI3.class, AppBrandTaskPreloadReceiver3.class));
    iAl.add(new e(AppBrandUI4.class, AppBrandTaskPreloadReceiver4.class));
    iAm = new b();
    iAn = new a();
    GMTrace.o(10646284402688L, 79321);
  }
  
  public static int a(Context paramContext, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(20691676037120L, 154165);
    e locale;
    int i;
    Context localContext;
    int j;
    if (paramAppBrandInitConfig.hQw)
    {
      locale = iAm;
      i = 1;
      locale.a(paramAppBrandInitConfig.appId, paramAppBrandInitConfig.hKs, null);
      localContext = paramContext;
      if (paramContext == null) {
        localContext = ab.getContext();
      }
      paramContext = new Intent(localContext, locale.iAq);
      paramContext.putExtra("key_appbrand_init_config", paramAppBrandInitConfig);
      paramContext.putExtra("key_appbrand_stat_object", paramAppBrandStatObject);
      paramContext.addFlags(268435456);
      localContext.startActivity(paramContext);
      if (paramAppBrandStatObject != null) {
        break label171;
      }
      j = 0;
      label99:
      if (j != 1023) {
        break label180;
      }
      com.tencent.mm.plugin.appbrand.o.d.bU(localContext);
    }
    for (;;)
    {
      GMTrace.o(20691676037120L, 154165);
      return i;
      locale = sl(paramAppBrandInitConfig.appId);
      if (locale == null)
      {
        if (paramAppBrandInitConfig.hQx) {}
        for (locale = iAn;; locale = aav())
        {
          a(locale);
          i = 1;
          break;
        }
      }
      i = 2;
      break;
      label171:
      j = paramAppBrandStatObject.scene;
      break label99;
      label180:
      com.tencent.mm.plugin.appbrand.o.d.bW(localContext);
    }
  }
  
  static void a(e parame)
  {
    GMTrace.i(17273150504960L, 128695);
    if (!iAl.contains(parame))
    {
      GMTrace.o(17273150504960L, 128695);
      return;
    }
    iAl.remove(parame);
    iAl.addLast(parame);
    GMTrace.o(17273150504960L, 128695);
  }
  
  public static void aau()
  {
    GMTrace.i(10644405354496L, 79307);
    if (!com.tencent.mm.plugin.appbrand.c.a.Tj())
    {
      GMTrace.o(10644405354496L, 79307);
      return;
    }
    aav().yg();
    GMTrace.o(10644405354496L, 79307);
  }
  
  private static e aav()
  {
    GMTrace.i(17272345198592L, 128689);
    int i = 0;
    if (i < iAl.size()) {
      if (!((e)iAl.get(i)).iAs.keySet().isEmpty()) {}
    }
    for (e locale = (e)iAl.get(i);; locale = null)
    {
      if (locale != null)
      {
        GMTrace.o(17272345198592L, 128689);
        return locale;
        i += 1;
        break;
      }
      locale = (e)iAl.getFirst();
      GMTrace.o(17272345198592L, 128689);
      return locale;
    }
  }
  
  private static LinkedList<e> aaw()
  {
    GMTrace.i(17272882069504L, 128693);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(iAl);
    localLinkedList.add(iAm);
    localLinkedList.add(iAn);
    GMTrace.o(17272882069504L, 128693);
    return localLinkedList;
  }
  
  public static void as(String paramString, int paramInt)
  {
    GMTrace.i(10644002701312L, 79304);
    e locale = sl(paramString);
    if (locale == null)
    {
      GMTrace.o(10644002701312L, 79304);
      return;
    }
    if ((((Integer)locale.iAs.get(paramString)).intValue() == paramInt) && (locale.sp(paramString) != null)) {
      locale.sp(paramString).si(paramString);
    }
    GMTrace.o(10644002701312L, 79304);
  }
  
  static e bk(String paramString1, String paramString2)
  {
    GMTrace.i(17272747851776L, 128692);
    Iterator localIterator = aaw().iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if ((locale.iAs.keySet().contains(paramString1)) && (locale.iAp.equals(paramString2)))
      {
        GMTrace.o(17272747851776L, 128692);
        return locale;
      }
    }
    GMTrace.o(17272747851776L, 128692);
    return null;
  }
  
  public static void jy(int paramInt)
  {
    GMTrace.i(10644136919040L, 79305);
    if (2 == paramInt)
    {
      localIterator = aaw().iterator();
      while (localIterator.hasNext()) {
        ((e)localIterator.next()).aai();
      }
      aau();
      GMTrace.o(10644136919040L, 79305);
      return;
    }
    Iterator localIterator = aaw().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (e)localIterator.next();
      ((e)localObject).aai();
      localObject = ((e)localObject).iAt.values().iterator();
      while (((Iterator)localObject).hasNext())
      {
        AppBrandRemoteTaskController localAppBrandRemoteTaskController = (AppBrandRemoteTaskController)((Iterator)localObject).next();
        if (localAppBrandRemoteTaskController != null)
        {
          localAppBrandRemoteTaskController.izV = AppBrandRemoteTaskController.a.iAd;
          localAppBrandRemoteTaskController.izW = paramInt;
          localAppBrandRemoteTaskController.VL();
        }
      }
    }
    GMTrace.o(10644136919040L, 79305);
  }
  
  public static void onNetworkChange()
  {
    GMTrace.i(10644808007680L, 79310);
    Iterator localIterator1 = aaw().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((e)localIterator1.next()).iAt.values().iterator();
      while (localIterator2.hasNext())
      {
        AppBrandRemoteTaskController localAppBrandRemoteTaskController = (AppBrandRemoteTaskController)localIterator2.next();
        if (localAppBrandRemoteTaskController != null)
        {
          localAppBrandRemoteTaskController.izV = AppBrandRemoteTaskController.a.iAh;
          localAppBrandRemoteTaskController.VL();
        }
      }
    }
    GMTrace.o(10644808007680L, 79310);
  }
  
  public static void sj(String paramString)
  {
    GMTrace.i(17272210980864L, 128688);
    e locale = sl(paramString);
    if ((locale != null) && (locale.sp(paramString) != null)) {
      locale.sp(paramString).si(paramString);
    }
    GMTrace.o(17272210980864L, 128688);
  }
  
  public static void sk(String paramString)
  {
    GMTrace.i(10644539572224L, 79308);
    paramString = sm(paramString);
    if (paramString == null)
    {
      GMTrace.o(10644539572224L, 79308);
      return;
    }
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10643063177216L, 79297);
        this.iAo.yg();
        GMTrace.o(10643063177216L, 79297);
      }
    }, 500L);
    GMTrace.o(10644539572224L, 79308);
  }
  
  private static e sl(String paramString)
  {
    GMTrace.i(17272479416320L, 128690);
    Iterator localIterator = aaw().iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.iAs.keySet().contains(paramString))
      {
        GMTrace.o(17272479416320L, 128690);
        return locale;
      }
    }
    GMTrace.o(17272479416320L, 128690);
    return null;
  }
  
  static e sm(String paramString)
  {
    GMTrace.i(17272613634048L, 128691);
    Iterator localIterator = aaw().iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.iAp.equals(paramString))
      {
        GMTrace.o(17272613634048L, 128691);
        return locale;
      }
    }
    Assert.assertTrue(true);
    GMTrace.o(17272613634048L, 128691);
    return null;
  }
  
  public static boolean sn(String paramString)
  {
    GMTrace.i(10645210660864L, 79313);
    e locale = sl(paramString);
    if ((locale != null) && (locale.sp(paramString) != null))
    {
      paramString = locale.sp(paramString);
      paramString.izV = AppBrandRemoteTaskController.a.iAg;
      if (paramString.VL())
      {
        GMTrace.o(10645210660864L, 79313);
        return true;
      }
    }
    GMTrace.o(10645210660864L, 79313);
    return false;
  }
  
  static void so(String paramString)
  {
    GMTrace.i(17273016287232L, 128694);
    e locale = sl(paramString);
    if (locale != null)
    {
      locale.iAs.remove(paramString);
      locale.iAt.remove(paramString);
      if ((locale.iAs.keySet().isEmpty()) && (iAl.contains(locale)))
      {
        iAl.remove(locale);
        iAl.addFirst(locale);
      }
    }
    GMTrace.o(17273016287232L, 128694);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\task\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */