package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static AtomicInteger isQ;
  public HashMap<String, a> idu;
  
  static
  {
    GMTrace.i(17692715122688L, 131821);
    isQ = new AtomicInteger(1);
    GMTrace.o(17692715122688L, 131821);
  }
  
  public b()
  {
    GMTrace.i(10680912576512L, 79579);
    this.idu = new HashMap();
    GMTrace.o(10680912576512L, 79579);
  }
  
  public static int YO()
  {
    GMTrace.i(17692178251776L, 131817);
    int i = isQ.incrementAndGet();
    GMTrace.o(17692178251776L, 131817);
    return i;
  }
  
  public static b YP()
  {
    GMTrace.i(17692312469504L, 131818);
    b localb = a.isR;
    GMTrace.o(17692312469504L, 131818);
    return localb;
  }
  
  public final a ro(String paramString)
  {
    GMTrace.i(17692446687232L, 131819);
    if (this.idu.containsKey(paramString))
    {
      paramString = (a)this.idu.get(paramString);
      GMTrace.o(17692446687232L, 131819);
      return paramString;
    }
    GMTrace.o(17692446687232L, 131819);
    return null;
  }
  
  private static final class a
  {
    public static b isR;
    
    static
    {
      GMTrace.i(17692849340416L, 131822);
      isR = new b();
      GMTrace.o(17692849340416L, 131822);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */