package com.tencent.mm.plugin.sns.lucky.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Color;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class a
{
  public static n a(Bitmap paramBitmap, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(8801461731328L, 65576);
    paramBitmap = n.i(d.c(paramBitmap, paramInt2));
    if (paramBitmap == null) {
      w.e("MicroMsg.BlurHelper", "returnBitmap error2 ");
    }
    if (paramBitmap != null) {
      new Canvas(paramBitmap.yp()).drawColor(paramInt1);
    }
    try
    {
      d.a(paramBitmap.yp(), 70, Bitmap.CompressFormat.JPEG, paramString, false);
      w.i("MicroMsg.BlurHelper", "blur done bitmap  " + paramBitmap);
      GMTrace.o(8801461731328L, 65576);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.BlurHelper", "error for exception " + paramString.getMessage());
        w.printErrStackTrace("MicroMsg.BlurHelper", paramString, "", new Object[0]);
      }
    }
  }
  
  public static n dA(String paramString1, String paramString2)
  {
    GMTrace.i(8801327513600L, 65575);
    int i = Color.argb(51, 255, 255, 255);
    paramString1 = i.GT(paramString1);
    if (paramString1 == null)
    {
      w.e("MicroMsg.BlurHelper", "returnBitmap error1 ");
      GMTrace.o(8801327513600L, 65575);
      return null;
    }
    paramString1 = a(paramString1.yp(), paramString2, i, 55);
    GMTrace.o(8801327513600L, 65575);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */