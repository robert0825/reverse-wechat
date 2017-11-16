package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class k
{
  private static AtomicInteger isQ;
  private HashMap<String, j> idu;
  
  static
  {
    GMTrace.i(20765630005248L, 154716);
    isQ = new AtomicInteger(1);
    GMTrace.o(20765630005248L, 154716);
  }
  
  public k()
  {
    GMTrace.i(10670846246912L, 79504);
    this.idu = new HashMap();
    GMTrace.o(10670846246912L, 79504);
  }
  
  public static int YO()
  {
    GMTrace.i(20765495787520L, 154715);
    int i = isQ.incrementAndGet();
    GMTrace.o(20765495787520L, 154715);
    return i;
  }
  
  public static k YU()
  {
    GMTrace.i(20765227352064L, 154713);
    k localk = a.itB;
    GMTrace.o(20765227352064L, 154713);
    return localk;
  }
  
  public final boolean a(String paramString, j paramj)
  {
    GMTrace.i(20765361569792L, 154714);
    if (!this.idu.containsKey(paramString))
    {
      this.idu.put(paramString, paramj);
      GMTrace.o(20765361569792L, 154714);
      return true;
    }
    GMTrace.o(20765361569792L, 154714);
    return false;
  }
  
  public final j rA(String paramString)
  {
    GMTrace.i(10670980464640L, 79505);
    if (this.idu.containsKey(paramString))
    {
      paramString = (j)this.idu.get(paramString);
      GMTrace.o(10670980464640L, 79505);
      return paramString;
    }
    GMTrace.o(10670980464640L, 79505);
    return null;
  }
  
  public final boolean rB(String paramString)
  {
    GMTrace.i(10671114682368L, 79506);
    if (this.idu.containsKey(paramString))
    {
      paramString = (j)this.idu.remove(paramString);
      if (paramString != null) {
        paramString.c(paramString.ry("0"));
      }
      GMTrace.o(10671114682368L, 79506);
      return true;
    }
    GMTrace.o(10671114682368L, 79506);
    return false;
  }
  
  private static final class a
  {
    public static k itB;
    
    static
    {
      GMTrace.i(10670040940544L, 79498);
      itB = new k();
      GMTrace.o(10670040940544L, 79498);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */