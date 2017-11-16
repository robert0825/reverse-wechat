package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.e;
import com.tencent.mm.plugin.appbrand.widget.picker.g;
import com.tencent.mm.plugin.appbrand.widget.picker.g.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

final class h
  extends c
{
  h()
  {
    GMTrace.i(10380264865792L, 77339);
    GMTrace.o(10380264865792L, 77339);
  }
  
  final void l(final JSONObject paramJSONObject)
  {
    GMTrace.i(10380399083520L, 77340);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("array");
    final int j = paramJSONObject.optInt("current", 0);
    if ((localJSONArray == null) || (localJSONArray.length() <= 0))
    {
      e("fail:invalid data", null);
      GMTrace.o(10380399083520L, 77340);
      return;
    }
    paramJSONObject = new String[localJSONArray.length()];
    int i = 0;
    try
    {
      while (i < localJSONArray.length())
      {
        paramJSONObject[i] = localJSONArray.getString(i);
        i += 1;
      }
      d.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10381875478528L, 77351);
          h localh = h.this;
          String[] arrayOfString = paramJSONObject;
          int i = j;
          e locale = (e)localh.r(e.class);
          if (locale == null)
          {
            localh.e("fail cant init view", null);
            GMTrace.o(10381875478528L, 77351);
            return;
          }
          a locala = localh.iRs;
          locala.post(new h.2(localh, locala));
          locale.i(arrayOfString);
          locale.setValue(i);
          locala.iRS = new h.3(localh, locala, locale);
          locala.show();
          GMTrace.o(10381875478528L, 77351);
        }
      });
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.AppBrand.JsApi.OptionsPickerHandler", "opt data.array, exp = %s", new Object[] { bg.f(paramJSONObject) });
      e("fail", null);
      GMTrace.o(10380399083520L, 77340);
      return;
    }
    GMTrace.o(10380399083520L, 77340);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */