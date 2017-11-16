package com.tencent.mm.plugin.appbrand.media;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class b
{
  private static String ird;
  private static Map<String, c> ire;
  private static ArrayList<String> irf;
  private static Map<String, c> irg;
  private static ArrayList<String> irh;
  private static AppBrandMainProcessService.a iri;
  private static boolean irj;
  
  static
  {
    GMTrace.i(19857915510784L, 147953);
    ird = "";
    ire = new HashMap();
    irf = new ArrayList();
    irg = new HashMap();
    irh = new ArrayList();
    iri = null;
    irj = false;
    GMTrace.o(19857915510784L, 147953);
  }
  
  public static String YC()
  {
    GMTrace.i(19857110204416L, 147947);
    String str = ird;
    GMTrace.o(19857110204416L, 147947);
    return str;
  }
  
  public static void YD()
  {
    GMTrace.i(19857244422144L, 147948);
    w.i("MicroMsg.AppBrandAudioService", "clearAudioListener");
    Iterator localIterator = irf.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localObject = (c)ire.remove(localObject);
      if (localObject != null) {
        a.vgX.c((c)localObject);
      }
    }
    ire.clear();
    irf.clear();
    localIterator = irh.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localObject = (c)irg.remove(localObject);
      if (localObject != null) {
        a.vgX.c((c)localObject);
      }
    }
    irg.clear();
    irh.clear();
    GMTrace.o(19857244422144L, 147948);
  }
  
  public static void YE()
  {
    GMTrace.i(20749658095616L, 154597);
    if (iri == null) {
      iri = new AppBrandMainProcessService.a()
      {
        public final void onDisconnected(String paramAnonymousString)
        {
          GMTrace.i(20749523877888L, 154596);
          super.onDisconnected(paramAnonymousString);
          w.e("MicroMsg.AppBrandAudioService", "The process is be killed by system, processName:%s, and do destroyAllAudioPlayerByProcessName", new Object[] { paramAnonymousString });
          w.i("MicroMsg.AudioPlayerHelper", "destroyAllAudioPlayerByProcessName processName:%s", new Object[] { paramAnonymousString });
          t localt = new t();
          localt.eAJ.action = 15;
          localt.eAJ.processName = paramAnonymousString;
          a.vgX.m(localt);
          GMTrace.o(20749523877888L, 154596);
        }
      };
    }
    if (!irj)
    {
      w.i("MicroMsg.AppBrandAudioService", "addMainServiceEventListener success");
      irj = true;
      AppBrandMainProcessService.a(iri);
    }
    GMTrace.o(20749658095616L, 154597);
  }
  
  public static void YF()
  {
    GMTrace.i(20749792313344L, 154598);
    if ((iri != null) && (irj))
    {
      w.i("MicroMsg.AppBrandAudioService", "removeServiceEventListener success");
      irj = false;
      AppBrandMainProcessService.b(iri);
    }
    GMTrace.o(20749792313344L, 154598);
  }
  
  public static void a(String paramString, c paramc)
  {
    GMTrace.i(19857378639872L, 147949);
    if (ire.containsKey(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId:%s has add listener", new Object[] { paramString });
      GMTrace.o(19857378639872L, 147949);
      return;
    }
    if (paramc == null)
    {
      w.e("MicroMsg.AppBrandAudioService", "listener is null");
      GMTrace.o(19857378639872L, 147949);
      return;
    }
    w.i("MicroMsg.AppBrandAudioService", "addRecordListener,appId:%s", new Object[] { paramString });
    ire.put(paramString, paramc);
    if (!irf.contains(paramString)) {
      irf.add(paramString);
    }
    a.vgX.a(paramc);
    GMTrace.o(19857378639872L, 147949);
  }
  
  public static void b(String paramString, c paramc)
  {
    GMTrace.i(19857647075328L, 147951);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId is empty");
      GMTrace.o(19857647075328L, 147951);
      return;
    }
    if (paramc == null)
    {
      w.e("MicroMsg.AppBrandAudioService", "listener is null");
      GMTrace.o(19857647075328L, 147951);
      return;
    }
    if (irg.containsKey(paramString)) {
      rf(paramString);
    }
    w.i("MicroMsg.AppBrandAudioService", "addAudioPlayerListener,appId:%s", new Object[] { paramString });
    irg.put(paramString, paramc);
    if (!irh.contains(paramString)) {
      irh.add(paramString);
    }
    a.vgX.a(paramc);
    GMTrace.o(19857647075328L, 147951);
  }
  
  public static void rd(String paramString)
  {
    GMTrace.i(19856975986688L, 147946);
    ird = paramString;
    GMTrace.o(19856975986688L, 147946);
  }
  
  public static void re(String paramString)
  {
    GMTrace.i(19857512857600L, 147950);
    if (!ire.containsKey(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId:%s not exist the appId for listener", new Object[] { paramString });
      GMTrace.o(19857512857600L, 147950);
      return;
    }
    w.i("MicroMsg.AppBrandAudioService", "removeRecordListener,appId:%s", new Object[] { paramString });
    irf.remove(paramString);
    paramString = (c)ire.remove(paramString);
    if (paramString != null) {
      a.vgX.c(paramString);
    }
    GMTrace.o(19857512857600L, 147950);
  }
  
  public static void rf(String paramString)
  {
    GMTrace.i(19857781293056L, 147952);
    if (!irg.containsKey(paramString))
    {
      w.e("MicroMsg.AppBrandAudioService", "appId:%s not exist the appId for listener", new Object[] { paramString });
      GMTrace.o(19857781293056L, 147952);
      return;
    }
    w.i("MicroMsg.AppBrandAudioService", "removeAudioPlayerListener,appId:%s", new Object[] { paramString });
    irh.remove(paramString);
    paramString = (c)irg.remove(paramString);
    if (paramString != null) {
      a.vgX.c(paramString);
    }
    GMTrace.o(19857781293056L, 147952);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */