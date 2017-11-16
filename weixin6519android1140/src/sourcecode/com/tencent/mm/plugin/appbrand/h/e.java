package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class e
{
  private static AtomicInteger isQ;
  public HashMap<String, c> idu;
  
  static
  {
    GMTrace.i(17695265259520L, 131840);
    isQ = new AtomicInteger(1);
    GMTrace.o(17695265259520L, 131840);
  }
  
  public e()
  {
    GMTrace.i(10680509923328L, 79576);
    this.idu = new HashMap();
    GMTrace.o(10680509923328L, 79576);
  }
  
  public static int YO()
  {
    GMTrace.i(17694862606336L, 131837);
    int i = isQ.incrementAndGet();
    GMTrace.o(17694862606336L, 131837);
    return i;
  }
  
  public static e YR()
  {
    GMTrace.i(17694996824064L, 131838);
    e locale = a.itk;
    GMTrace.o(17694996824064L, 131838);
    return locale;
  }
  
  public final c rr(String paramString)
  {
    GMTrace.i(10680644141056L, 79577);
    if (this.idu.containsKey(paramString))
    {
      paramString = (c)this.idu.get(paramString);
      GMTrace.o(10680644141056L, 79577);
      return paramString;
    }
    GMTrace.o(10680644141056L, 79577);
    return null;
  }
  
  private static final class a
  {
    public static e itk;
    
    static
    {
      GMTrace.i(10676080738304L, 79543);
      itk = new e();
      GMTrace.o(10676080738304L, 79543);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */