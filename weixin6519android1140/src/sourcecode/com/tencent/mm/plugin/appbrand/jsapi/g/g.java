package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.picker.d.a;
import com.tencent.mm.plugin.appbrand.widget.picker.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends a
{
  private static final int CTRL_INDEX = 258;
  private static final String NAME = "updateMultiPickerView";
  
  public g()
  {
    GMTrace.i(17392738500608L, 129586);
    GMTrace.o(17392738500608L, 129586);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17392872718336L, 129587);
    new c()
    {
      final void l(final JSONObject paramAnonymousJSONObject)
      {
        GMTrace.i(17392067411968L, 129581);
        final int j = paramAnonymousJSONObject.optInt("column", -1);
        JSONArray localJSONArray = paramAnonymousJSONObject.optJSONArray("array");
        if ((j < 0) || (localJSONArray == null) || (localJSONArray.length() < 0))
        {
          e("fail:invalid data", null);
          GMTrace.o(17392067411968L, 129581);
          return;
        }
        try
        {
          String[] arrayOfString = new String[localJSONArray.length()];
          int i = 0;
          while (i < arrayOfString.length)
          {
            arrayOfString[i] = localJSONArray.getString(i);
            i += 1;
          }
          paramAnonymousJSONObject = new d.a(arrayOfString, paramAnonymousJSONObject.optInt("current", 0));
          com.tencent.mm.plugin.appbrand.o.d.runOnUiThread(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(17394080677888L, 129596);
              com.tencent.mm.plugin.appbrand.widget.picker.d locald = (com.tencent.mm.plugin.appbrand.widget.picker.d)g.1.a(g.1.this, com.tencent.mm.plugin.appbrand.widget.picker.d.class);
              if (locald == null)
              {
                g.1.this.e("fail picker not exists", null);
                GMTrace.o(17394080677888L, 129596);
                return;
              }
              int i = j;
              d.a locala = paramAnonymousJSONObject;
              if ((i >= 0) && (i < locald.adK()) && (locala != null))
              {
                locald.S(true);
                locald.km(i).i(locala.iRJ);
                if (!bg.E(locala.iRJ)) {
                  locald.km(i).setValue(locala.iRK);
                }
                locald.S(false);
              }
              g.1.this.e("ok", null);
              GMTrace.o(17394080677888L, 129596);
            }
          });
          GMTrace.o(17392067411968L, 129581);
          return;
        }
        catch (Exception paramAnonymousJSONObject)
        {
          w.printErrStackTrace("MicroMsg.AppBrand.JsApiUpdateMultiPickerView", paramAnonymousJSONObject, "opt params", new Object[0]);
          e("fail:invalid data", null);
          GMTrace.o(17392067411968L, 129581);
        }
      }
    }.a(this, paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(17392872718336L, 129587);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */