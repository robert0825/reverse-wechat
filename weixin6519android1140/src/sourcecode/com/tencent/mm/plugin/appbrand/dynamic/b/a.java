package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b.c;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.dynamic.i.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  private static final b.i hTh;
  
  static
  {
    GMTrace.i(19912273690624L, 148358);
    hTh = new b.c();
    GMTrace.o(19912273690624L, 148358);
  }
  
  public static Bitmap aV(String paramString1, String paramString2)
  {
    GMTrace.i(19912139472896L, 148357);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      GMTrace.o(19912139472896L, 148357);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.appbrand.appcache.a.oj(paramString2);
    if (bg.nm((String)localObject))
    {
      GMTrace.o(19912139472896L, 148357);
      return null;
    }
    paramString2 = paramString1 + '#' + (String)localObject;
    Bitmap localBitmap = hTh.hC(paramString2);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      GMTrace.o(19912139472896L, 148357);
      return localBitmap;
    }
    paramString1 = c.aX(paramString1, (String)localObject);
    if (paramString1 != null) {}
    try
    {
      if (paramString1.mInputStream != null)
      {
        int i = paramString1.mInputStream.available();
        if (i > 0) {}
      }
      else
      {
        if (paramString1 != null) {
          bg.g(paramString1.mInputStream);
        }
        GMTrace.o(19912139472896L, 148357);
        return null;
      }
      localObject = d.decodeStream(paramString1.mInputStream);
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        hTh.b(paramString2, (Bitmap)localObject);
        if (paramString1 != null) {
          bg.g(paramString1.mInputStream);
        }
        GMTrace.o(19912139472896L, 148357);
        return (Bitmap)localObject;
      }
    }
    catch (IOException paramString2)
    {
      for (;;)
      {
        w.e("MicroMsg.CanvasImageCache", "try decode icon e = %s", new Object[] { paramString2 });
        if (paramString1 != null) {
          bg.g(paramString1.mInputStream);
        }
      }
    }
    finally
    {
      if (paramString1 == null) {
        break label276;
      }
      bg.g(paramString1.mInputStream);
    }
    GMTrace.o(19912139472896L, 148357);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */