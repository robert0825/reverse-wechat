package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class h
{
  private static AtomicInteger isQ;
  public HashMap<String, f> idu;
  
  static
  {
    GMTrace.i(17694191517696L, 131832);
    isQ = new AtomicInteger(1);
    GMTrace.o(17694191517696L, 131832);
  }
  
  public h()
  {
    GMTrace.i(10675006996480L, 79535);
    this.idu = new HashMap();
    GMTrace.o(10675006996480L, 79535);
  }
  
  public static int YO()
  {
    GMTrace.i(17693788864512L, 131829);
    int i = isQ.incrementAndGet();
    GMTrace.o(17693788864512L, 131829);
    return i;
  }
  
  public static h YS()
  {
    GMTrace.i(17693923082240L, 131830);
    h localh = a.itr;
    GMTrace.o(17693923082240L, 131830);
    return localh;
  }
  
  public final f rt(String paramString)
  {
    GMTrace.i(10675141214208L, 79536);
    if (this.idu.containsKey(paramString))
    {
      paramString = (f)this.idu.get(paramString);
      GMTrace.o(10675141214208L, 79536);
      return paramString;
    }
    GMTrace.o(10675141214208L, 79536);
    return null;
  }
  
  private static final class a
  {
    public static h itr;
    
    static
    {
      GMTrace.i(10675812302848L, 79541);
      itr = new h();
      GMTrace.o(10675812302848L, 79541);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */