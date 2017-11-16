package com.tencent.mm.ao.a.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.c;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class a
{
  public static Bitmap a(c paramc, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13717991325696L, 102207);
    if ((paramInt2 <= 0) || (paramInt3 <= 0))
    {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
      {
        paramc = d.Y(paramInt1, paramc.width, paramc.height);
        GMTrace.o(13717991325696L, 102207);
        return paramc;
      }
      paramc = d.Ag(paramInt1);
      GMTrace.o(13717991325696L, 102207);
      return paramc;
    }
    paramc = d.Y(paramInt1, paramInt2, paramInt3);
    GMTrace.o(13717991325696L, 102207);
    return paramc;
  }
  
  public static Bitmap a(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13717454454784L, 102203);
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
      {
        paramc = d.U(paramString, paramc.width, paramc.height);
        GMTrace.o(13717454454784L, 102203);
        return paramc;
      }
      paramc = d.RD(paramString);
      GMTrace.o(13717454454784L, 102203);
      return paramc;
    }
    paramc = d.e(paramString, paramInt2, paramInt1, false);
    GMTrace.o(13717454454784L, 102203);
    return paramc;
  }
  
  public static Bitmap a(c paramc, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    GMTrace.i(13717722890240L, 102205);
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0)) {
        paramc = d.decodeByteArray(paramArrayOfByte, paramc.width, paramc.height);
      }
    }
    for (;;)
    {
      if (paramBoolean1) {
        paramc = d.a(d.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2), paramInt1, paramInt2, false, true);
      }
      paramArrayOfByte = paramc;
      if (paramFloat > 0.0F) {
        paramArrayOfByte = d.c(paramc, paramFloat);
      }
      paramc = paramArrayOfByte;
      if (paramBoolean2) {
        paramc = d.Q(paramArrayOfByte);
      }
      GMTrace.o(13717722890240L, 102205);
      return paramc;
      paramc = d.bg(paramArrayOfByte);
      continue;
      paramc = d.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public static Bitmap b(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    int i = 0;
    GMTrace.i(13717588672512L, 102204);
    BitmapFactory.Options localOptions = d.RB(paramString);
    if ((localOptions != null) && ((localOptions.outWidth >= localOptions.outHeight * 2) || (localOptions.outWidth * 2 <= localOptions.outHeight)))
    {
      if ((paramInt1 <= 0) || (paramInt2 <= 0))
      {
        if ((paramc != null) && (paramc.width > 0) && (paramc.width > 0))
        {
          paramc = d.e(paramString, paramc.height, paramc.width, true);
          GMTrace.o(13717588672512L, 102204);
          return paramc;
        }
        if ((paramc != null) && (paramc.Da() != null)) {
          paramInt2 = paramc.Da().getMeasuredWidth();
        }
        for (paramInt1 = paramc.Da().getMeasuredHeight();; paramInt1 = i)
        {
          paramc = d.e(paramString, paramInt1, paramInt2, true);
          GMTrace.o(13717588672512L, 102204);
          return paramc;
          w.w("MicroMsg.imageloader.ImageLoaderUtils", "crop bitmap cant not un set width or height");
          paramInt2 = 0;
        }
      }
      paramc = d.e(paramString, paramInt2, paramInt1, true);
      GMTrace.o(13717588672512L, 102204);
      return paramc;
    }
    paramc = d.e(paramString, paramInt2, paramInt1, false);
    GMTrace.o(13717588672512L, 102204);
    return paramc;
  }
  
  public static Bitmap c(c paramc, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(13717857107968L, 102206);
    if (((paramInt1 > 0) && (paramInt2 > 0)) || (paramc != null)) {}
    try
    {
      if ((paramc.width > 0) && (paramc.width > 0))
      {
        paramc = d.V(paramString, paramc.width, paramc.height);
        GMTrace.o(13717857107968L, 102206);
        return paramc;
      }
      paramc = d.V(paramString, 0, 0);
      GMTrace.o(13717857107968L, 102206);
      return paramc;
    }
    catch (IOException paramc)
    {
      w.e("MicroMsg.imageloader.ImageLoaderUtils", "get bitmap from assert failed. :%s", new Object[] { paramc.toString() });
      GMTrace.o(13717857107968L, 102206);
    }
    paramc = d.V(paramString, paramInt1, paramInt2);
    GMTrace.o(13717857107968L, 102206);
    return paramc;
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */