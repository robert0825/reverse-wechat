package com.tencent.mm.pluginsdk.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import java.util.concurrent.ConcurrentHashMap;

public final class l
{
  public static l tpu;
  private boolean lmH;
  private ConcurrentHashMap<String, Integer> tpr;
  private ConcurrentHashMap<String, Long> tps;
  private String tpt;
  
  static
  {
    GMTrace.i(702361370624L, 5233);
    tpu = new l("default");
    GMTrace.o(702361370624L, 5233);
  }
  
  public l(String paramString)
  {
    GMTrace.i(702092935168L, 5231);
    this.tpr = new ConcurrentHashMap();
    this.tps = new ConcurrentHashMap();
    this.tpt = "";
    this.lmH = false;
    if (b.bPq()) {
      this.lmH = true;
    }
    this.tpt = paramString;
    GMTrace.o(702092935168L, 5231);
  }
  
  public final void OG(String paramString)
  {
    GMTrace.i(702227152896L, 5232);
    if (!this.lmH)
    {
      GMTrace.o(702227152896L, 5232);
      return;
    }
    int i;
    if (this.tpr.containsKey(paramString))
    {
      i = ((Integer)this.tpr.get(paramString)).intValue();
      i += 1;
      this.tpr.put(paramString, Integer.valueOf(i));
      if (!this.tps.containsKey(paramString)) {
        break label183;
      }
    }
    label183:
    for (long l = ((Long)this.tps.get(paramString)).longValue();; l = 0L)
    {
      if (System.currentTimeMillis() - l > 1000L)
      {
        new StringBuilder().append(this.tpt).append("user get fps ").append(i).append(" fpswraper: ").append(paramString);
        this.tpr.put(paramString, Integer.valueOf(0));
        this.tps.put(paramString, Long.valueOf(System.currentTimeMillis()));
      }
      GMTrace.o(702227152896L, 5232);
      return;
      i = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\i\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */