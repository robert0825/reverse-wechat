package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 70;
  public static final String NAME = "hideKeyboard";
  
  public b()
  {
    GMTrace.i(10368990576640L, 77255);
    GMTrace.o(10368990576640L, 77255);
  }
  
  private void b(final c paramc, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(15479196352512L, 115329);
    com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10370735407104L, 77268);
        if (!paramc.isRunning())
        {
          GMTrace.o(10370735407104L, 77268);
          return;
        }
        Object localObject = paramc;
        if ((localObject instanceof AppBrandPageView))
        {
          localObject = (AppBrandPageView)localObject;
          if (!m.c((AppBrandPageView)localObject, this.ieF)) {
            break label98;
          }
        }
        label98:
        for (localObject = "ok";; localObject = "fail:input not exists")
        {
          paramc.v(paramInt, b.this.d((String)localObject, null));
          GMTrace.o(10370735407104L, 77268);
          return;
          localObject = a.b((j)localObject);
          break;
        }
      }
    });
    GMTrace.o(15479196352512L, 115329);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10369259012096L, 77257);
    b(paramj, paramJSONObject, paramInt);
    GMTrace.o(10369259012096L, 77257);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10369124794368L, 77256);
    b(paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(10369124794368L, 77256);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */