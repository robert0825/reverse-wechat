package com.tencent.mm.cache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public abstract interface e
{
  public abstract Object get(Object paramObject);
  
  public abstract void o(Object paramObject1, Object paramObject2);
  
  public abstract Object remove(Object paramObject);
  
  public static final class a
  {
    private static Map<String, e> fMm;
    
    static
    {
      GMTrace.i(13637729124352L, 101609);
      fMm = new HashMap();
      GMTrace.o(13637729124352L, 101609);
    }
    
    private static <T> T a(e parame, String paramString)
    {
      GMTrace.i(13637594906624L, 101608);
      if (parame == null)
      {
        w.e("MicroMsg.ICacheService.Factory", "null service");
        GMTrace.o(13637594906624L, 101608);
        return null;
      }
      try
      {
        parame = parame.remove(paramString);
        GMTrace.o(13637594906624L, 101608);
        return parame;
      }
      catch (Exception parame)
      {
        w.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
        w.e("MicroMsg.ICacheService.Factory", "exception:%s", new Object[] { bg.f(parame) });
        GMTrace.o(13637594906624L, 101608);
      }
      return null;
    }
    
    private static <T> T a(e parame, String paramString, T paramT)
    {
      GMTrace.i(13637460688896L, 101607);
      if (parame == null)
      {
        w.e("MicroMsg.ICacheService.Factory", "null service");
        GMTrace.o(13637460688896L, 101607);
        return null;
      }
      try
      {
        parame = parame.get(paramString);
        GMTrace.o(13637460688896L, 101607);
        return parame;
      }
      catch (Exception parame)
      {
        w.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
        w.e("MicroMsg.ICacheService.Factory", "exception:%s", new Object[] { bg.f(parame) });
        GMTrace.o(13637460688896L, 101607);
      }
      return null;
    }
    
    public static void a(String paramString, e parame)
    {
      GMTrace.i(13636789600256L, 101602);
      fMm.put(paramString, parame);
      GMTrace.o(13636789600256L, 101602);
    }
    
    public static <T> void a(String paramString1, String paramString2, T paramT)
    {
      GMTrace.i(13637192253440L, 101605);
      paramString1 = dK(paramString1);
      if (paramString1 == null)
      {
        w.e("MicroMsg.ICacheService.Factory", "null service");
        GMTrace.o(13637192253440L, 101605);
        return;
      }
      paramString1.o(paramString2, paramT);
      GMTrace.o(13637192253440L, 101605);
    }
    
    private static e dK(String paramString)
    {
      GMTrace.i(13636923817984L, 101603);
      paramString = (e)fMm.get(paramString);
      GMTrace.o(13636923817984L, 101603);
      return paramString;
    }
    
    public static <T> T x(String paramString1, String paramString2)
    {
      GMTrace.i(13637058035712L, 101604);
      paramString1 = a(dK(paramString1), paramString2, null);
      GMTrace.o(13637058035712L, 101604);
      return paramString1;
    }
    
    public static <T> void y(String paramString1, String paramString2)
    {
      GMTrace.i(13637326471168L, 101606);
      a(dK(paramString1), paramString2);
      GMTrace.o(13637326471168L, 101606);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\cache\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */