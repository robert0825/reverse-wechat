package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.k;
import com.tencent.mm.plugin.appbrand.page.m;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public abstract class d
  extends b
{
  public String hXF;
  
  public d()
  {
    GMTrace.i(10307921510400L, 76800);
    GMTrace.o(10307921510400L, 76800);
  }
  
  public static AppBrandPageView b(j paramj)
  {
    GMTrace.i(10308324163584L, 76803);
    paramj = paramj.hzM.hyJ;
    if ((paramj != null) && (paramj.Zs() != null))
    {
      paramj = paramj.Zs().Zh();
      GMTrace.o(10308324163584L, 76803);
      return paramj;
    }
    GMTrace.o(10308324163584L, 76803);
    return null;
  }
  
  public MMActivity a(j paramj)
  {
    GMTrace.i(17381195776000L, 129500);
    paramj = paramj.hzM.hyJ;
    if (paramj == null)
    {
      GMTrace.o(17381195776000L, 129500);
      return null;
    }
    paramj = paramj.getContext();
    if (!(paramj instanceof MMActivity))
    {
      GMTrace.o(17381195776000L, 129500);
      return null;
    }
    paramj = (MMActivity)paramj;
    GMTrace.o(17381195776000L, 129500);
    return paramj;
  }
  
  public final String d(String paramString, Map<String, ? extends Object> paramMap)
  {
    GMTrace.i(10308055728128L, 76801);
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", getName() + ":" + paramString);
    if (paramMap != null)
    {
      if ((com.tencent.mm.sdk.a.b.bPq()) && (paramMap.containsKey("errMsg"))) {
        Assert.assertTrue("api " + getName() + ": Cant put errMsg in res!!!", false);
      }
      localHashMap.putAll(paramMap);
    }
    com.tencent.mm.plugin.appbrand.o.d.k(localHashMap);
    paramString = new JSONObject(localHashMap).toString();
    GMTrace.o(10308055728128L, 76801);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */