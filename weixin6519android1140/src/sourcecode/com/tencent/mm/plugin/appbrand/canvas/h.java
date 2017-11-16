package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.page.o;

final class h
  implements e
{
  h()
  {
    GMTrace.i(19891604160512L, 148204);
    GMTrace.o(19891604160512L, 148204);
  }
  
  public final Bitmap a(String paramString1, String paramString2, e.a parama)
  {
    GMTrace.i(19891738378240L, 148205);
    if (paramString2.startsWith("wxfile://"))
    {
      paramString1 = c.aJ(paramString1, paramString2);
      if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.gpy)))
      {
        GMTrace.o(19891738378240L, 148205);
        return null;
      }
      paramString2 = paramString1.gpy;
      paramString1 = paramString2;
      if (!paramString2.startsWith("file://")) {
        paramString1 = "file://" + paramString2;
      }
      paramString1 = b.CT().hx(paramString1);
    }
    for (;;)
    {
      GMTrace.o(19891738378240L, 148205);
      return paramString1;
      if ((paramString2.startsWith("https://")) || (paramString2.startsWith("http://")))
      {
        parama = b.CT().hx(paramString2);
        paramString1 = parama;
        if (parama == null)
        {
          b.CT().hy(paramString2);
          paramString1 = parama;
        }
      }
      else
      {
        paramString1 = o.g(a.nI(paramString1), paramString2);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */