package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.l;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import org.json.JSONObject;

public class a
  extends d
{
  public a()
  {
    GMTrace.i(10325638250496L, 76932);
    GMTrace.o(10325638250496L, 76932);
  }
  
  public void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10325772468224L, 76933);
    GMTrace.o(10325772468224L, 76933);
  }
  
  public void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(15473424990208L, 115286);
    if ((paramc instanceof j))
    {
      if (!l.a((j)paramc, paramJSONObject, this))
      {
        paramc.v(paramInt, d(this.hXF, null));
        GMTrace.o(15473424990208L, 115286);
        return;
      }
      a((j)paramc, paramJSONObject, paramInt);
      GMTrace.o(15473424990208L, 115286);
      return;
    }
    if ((paramc instanceof AppBrandPageView))
    {
      a((AppBrandPageView)paramc, paramJSONObject, paramInt);
      GMTrace.o(15473424990208L, 115286);
      return;
    }
    GMTrace.o(15473424990208L, 115286);
  }
  
  public void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10325906685952L, 76934);
    GMTrace.o(10325906685952L, 76934);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */