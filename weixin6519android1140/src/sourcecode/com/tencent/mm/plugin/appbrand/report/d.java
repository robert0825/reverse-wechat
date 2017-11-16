package com.tencent.mm.plugin.appbrand.report;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static Object[] g(Object... paramVarArgs)
  {
    GMTrace.i(16167062208512L, 120454);
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0))
    {
      GMTrace.o(16167062208512L, 120454);
      return new Object[0];
    }
    Object[] arrayOfObject = new Object[paramVarArgs.length];
    int k = paramVarArgs.length;
    int j = 0;
    int i = 0;
    if (j < k)
    {
      Object localObject2 = paramVarArgs[j];
      Object localObject1;
      if (localObject2 == null) {
        localObject1 = "";
      }
      for (;;)
      {
        arrayOfObject[i] = String.valueOf(localObject1);
        j += 1;
        i += 1;
        break;
        localObject1 = localObject2;
        if ((localObject2 instanceof String)) {
          if (!((String)localObject2).contains(","))
          {
            localObject1 = localObject2;
            if (!((String)localObject2).contains("/")) {}
          }
          else
          {
            localObject1 = sd((String)localObject2);
          }
        }
      }
    }
    GMTrace.o(16167062208512L, 120454);
    return arrayOfObject;
  }
  
  private static String sd(String paramString)
  {
    GMTrace.i(16166927990784L, 120453);
    if (bg.nm(paramString))
    {
      GMTrace.o(16166927990784L, 120453);
      return "";
    }
    try
    {
      String str = bg.nl(p.encode(paramString));
      GMTrace.o(16166927990784L, 120453);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrand.ReportUtil", "safeEncode, given %s, e %s", new Object[] { paramString, localException });
      GMTrace.o(16166927990784L, 120453);
    }
    return "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */