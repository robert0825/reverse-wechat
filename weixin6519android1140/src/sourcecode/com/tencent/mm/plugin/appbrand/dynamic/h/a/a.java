package com.tencent.mm.plugin.appbrand.dynamic.h.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static Map<String, Long> gSn;
  private static Map<String, Long> gSo;
  private static Map<String, Long> gSp;
  private static Map<String, Long> gSq;
  
  static
  {
    GMTrace.i(20780796608512L, 154829);
    gSn = new HashMap();
    gSo = new HashMap();
    gSp = new HashMap();
    gSq = new HashMap();
    GMTrace.o(20780796608512L, 154829);
  }
  
  public static void L(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20780259737600L, 154825);
    w.i("SearchWidgetStartTraceFramework", "endGetReleaseUrl %s", new Object[] { paramString });
    long l;
    if (paramBoolean)
    {
      g.ork.r(717L, 8L);
      if (gSp.containsKey(paramString))
      {
        l = ((Long)gSp.get(paramString)).longValue();
        if (l <= 0L) {
          break label108;
        }
        h(720L, System.currentTimeMillis() - l);
      }
    }
    for (;;)
    {
      gSp.remove(paramString);
      GMTrace.o(20780259737600L, 154825);
      return;
      l = 0L;
      break;
      label108:
      w.e("SearchWidgetStartTraceFramework", "can't find widget get release url timestamp for appid %s", new Object[] { paramString });
      continue;
      g.ork.r(717L, 9L);
    }
  }
  
  private static void h(long paramLong1, long paramLong2)
  {
    int i = 6;
    GMTrace.i(20780393955328L, 154826);
    int j = (int)Math.floor(1.0D * paramLong2 / 500.0D);
    if (j > 6) {}
    for (;;)
    {
      w.i("SearchWidgetStartTraceFramework", "report time cost id %d, key %d", new Object[] { Long.valueOf(paramLong1), Integer.valueOf(i) });
      g.ork.r(paramLong1, i);
      GMTrace.o(20780393955328L, 154826);
      return;
      i = j;
    }
  }
  
  public static void pP(String paramString)
  {
    GMTrace.i(20779857084416L, 154822);
    w.i("SearchWidgetStartTraceFramework", "startLaunch %s", new Object[] { paramString });
    gSo.put(paramString, Long.valueOf(System.currentTimeMillis()));
    g.ork.r(717L, 4L);
    GMTrace.o(20779857084416L, 154822);
  }
  
  public static void pQ(String paramString)
  {
    GMTrace.i(20779991302144L, 154823);
    w.i("SearchWidgetStartTraceFramework", "endLaunch %s", new Object[] { paramString });
    g.ork.r(717L, 5L);
    long l;
    if (gSo.containsKey(paramString))
    {
      l = ((Long)gSo.get(paramString)).longValue();
      if (l <= 0L) {
        break label104;
      }
      h(719L, System.currentTimeMillis() - l);
    }
    for (;;)
    {
      gSo.remove(paramString);
      GMTrace.o(20779991302144L, 154823);
      return;
      l = 0L;
      break;
      label104:
      w.e("SearchWidgetStartTraceFramework", "can't find widget launch timestamp for appid %s", new Object[] { paramString });
    }
  }
  
  public static void pR(String paramString)
  {
    GMTrace.i(20780125519872L, 154824);
    w.i("SearchWidgetStartTraceFramework", "startGetReleaseUrl %s", new Object[] { paramString });
    gSp.put(paramString, Long.valueOf(System.currentTimeMillis()));
    g.ork.r(717L, 7L);
    GMTrace.o(20780125519872L, 154824);
  }
  
  public static void pS(String paramString)
  {
    GMTrace.i(20780528173056L, 154827);
    w.i("SearchWidgetStartTraceFramework", "syncLaunch %s", new Object[] { paramString });
    g.ork.r(717L, 23L);
    GMTrace.o(20780528173056L, 154827);
  }
  
  public static void pT(String paramString)
  {
    GMTrace.i(20780662390784L, 154828);
    w.i("SearchWidgetStartTraceFramework", "asyncLaunch %s", new Object[] { paramString });
    g.ork.r(717L, 24L);
    GMTrace.o(20780662390784L, 154828);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\h\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */