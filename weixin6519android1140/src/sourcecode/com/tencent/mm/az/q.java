package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class q
{
  private static Map<String, Long> gSn;
  private static Map<String, Long> gSo;
  private static Map<String, Long> gSp;
  private static Map<String, Long> gSq;
  
  static
  {
    GMTrace.i(20384854310912L, 151879);
    gSn = new HashMap();
    gSo = new HashMap();
    gSp = new HashMap();
    gSq = new HashMap();
    GMTrace.o(20384854310912L, 151879);
  }
  
  public q()
  {
    GMTrace.i(20384049004544L, 151873);
    GMTrace.o(20384049004544L, 151873);
  }
  
  public static void KJ()
  {
    GMTrace.i(20384720093184L, 151878);
    w.i("SearchWidgetStartTrace", "hasInitData %s", new Object[] { Boolean.valueOf(true) });
    g.ork.r(717L, 20L);
    GMTrace.o(20384720093184L, 151878);
  }
  
  public static void kO(String paramString)
  {
    GMTrace.i(20384183222272L, 151874);
    w.i("SearchWidgetStartTrace", "recv rsp widget %s", new Object[] { paramString });
    gSn.put(paramString, Long.valueOf(System.currentTimeMillis()));
    g.ork.r(717L, 1L);
    GMTrace.o(20384183222272L, 151874);
  }
  
  public static void kP(String paramString)
  {
    GMTrace.i(20384317440000L, 151875);
    w.i("SearchWidgetStartTrace", "jsapiInsertWidget %s", new Object[] { paramString });
    g.ork.r(717L, 19L);
    GMTrace.o(20384317440000L, 151875);
  }
  
  public static void kQ(String paramString)
  {
    GMTrace.i(20384451657728L, 151876);
    w.i("SearchWidgetStartTrace", "realInsert %s", new Object[] { paramString });
    g.ork.r(717L, 3L);
    GMTrace.o(20384451657728L, 151876);
  }
  
  public static void z(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20384585875456L, 151877);
    w.i("SearchWidgetStartTrace", "drawEnd %s,succ %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      g.ork.r(717L, 0L);
      if (gSn.containsKey(paramString)) {}
      for (long l = ((Long)gSn.get(paramString)).longValue(); l > 0L; l = 0L)
      {
        int j = (int)Math.floor((System.currentTimeMillis() - l) * 1.0D / 500.0D);
        int i = j;
        if (j > 16) {
          i = 16;
        }
        w.i("SearchWidgetStartTrace", "report time cost id %d, key %d", new Object[] { Long.valueOf(718L), Integer.valueOf(i) });
        g.ork.r(718L, i);
        GMTrace.o(20384585875456L, 151877);
        return;
      }
      w.e("SearchWidgetStartTrace", "can't find widget Recv timestamp for appid %s", new Object[] { paramString });
      GMTrace.o(20384585875456L, 151877);
      return;
    }
    g.ork.r(717L, 22L);
    GMTrace.o(20384585875456L, 151877);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\az\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */