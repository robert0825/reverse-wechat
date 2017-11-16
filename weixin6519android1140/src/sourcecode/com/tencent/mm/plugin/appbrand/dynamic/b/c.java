package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.canvas.e.a;

final class c
  implements e
{
  c()
  {
    GMTrace.i(19914823827456L, 148377);
    GMTrace.o(19914823827456L, 148377);
  }
  
  public final Bitmap a(final String paramString1, final String paramString2, final e.a parama)
  {
    GMTrace.i(19914958045184L, 148378);
    Object localObject;
    if (paramString2.startsWith("wxfile://"))
    {
      paramString1 = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(paramString1, paramString2);
      if ((paramString1 == null) || (TextUtils.isEmpty(paramString1.gpy)))
      {
        GMTrace.o(19914958045184L, 148378);
        return null;
      }
      paramString2 = paramString1.gpy;
      paramString1 = paramString2;
      if (!paramString2.startsWith("file://")) {
        paramString1 = "file://" + paramString2;
      }
      localObject = b.CT().hx(paramString1);
    }
    for (;;)
    {
      GMTrace.o(19914958045184L, 148378);
      return (Bitmap)localObject;
      if ((paramString2.startsWith("https://")) || (paramString2.startsWith("http://")))
      {
        Bitmap localBitmap = b.CT().hx(paramString2);
        localObject = localBitmap;
        if (localBitmap == null)
        {
          b.CT().a(new b.h()
          {
            public final void CV()
            {
              GMTrace.i(19914286956544L, 148373);
              GMTrace.o(19914286956544L, 148373);
            }
            
            public final void CW()
            {
              GMTrace.i(19914555392000L, 148375);
              GMTrace.o(19914555392000L, 148375);
            }
            
            public final String CX()
            {
              GMTrace.i(19914689609728L, 148376);
              GMTrace.o(19914689609728L, 148376);
              return "WxaWidgetIcon";
            }
            
            public final void j(Bitmap paramAnonymousBitmap)
            {
              GMTrace.i(19914421174272L, 148374);
              if ((parama == null) || (paramAnonymousBitmap == null) || (paramAnonymousBitmap.isRecycled()))
              {
                GMTrace.o(19914421174272L, 148374);
                return;
              }
              parama.TR();
              GMTrace.o(19914421174272L, 148374);
            }
          }, paramString2, null, null);
          localObject = localBitmap;
        }
      }
      else
      {
        localObject = a.aV(paramString1, paramString2);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */