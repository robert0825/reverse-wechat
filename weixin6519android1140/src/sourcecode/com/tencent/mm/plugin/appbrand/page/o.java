package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b.c;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.appcache.a;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.io.InputStream;

public final class o
{
  private static final b.i iuZ;
  
  static
  {
    GMTrace.i(17297712349184L, 128878);
    iuZ = new b.c();
    GMTrace.o(17297712349184L, 128878);
  }
  
  public static Bitmap g(e parame, String paramString)
  {
    GMTrace.i(18358300835840L, 136780);
    if (parame == null)
    {
      GMTrace.o(18358300835840L, 136780);
      return null;
    }
    Object localObject = a.oj(paramString);
    if (bg.nm((String)localObject))
    {
      GMTrace.o(18358300835840L, 136780);
      return null;
    }
    paramString = parame.hashCode() + 35 + (String)localObject;
    Bitmap localBitmap = iuZ.hC(paramString);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      GMTrace.o(18358300835840L, 136780);
      return localBitmap;
    }
    parame = com.tencent.mm.plugin.appbrand.appcache.w.d(parame, (String)localObject);
    if (parame != null) {}
    try
    {
      int i = parame.available();
      if (i <= 0)
      {
        if (parame != null) {
          bg.g(parame);
        }
        GMTrace.o(18358300835840L, 136780);
        return null;
      }
      localObject = d.decodeStream(parame);
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        iuZ.b(paramString, (Bitmap)localObject);
        if (parame != null) {
          bg.g(parame);
        }
        GMTrace.o(18358300835840L, 136780);
        return (Bitmap)localObject;
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandPageIconCache", "try decode icon e = %s", new Object[] { paramString });
        if (parame != null) {
          bg.g(parame);
        }
      }
    }
    finally
    {
      if (parame == null) {
        break label239;
      }
      bg.g(parame);
    }
    GMTrace.o(18358300835840L, 136780);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */