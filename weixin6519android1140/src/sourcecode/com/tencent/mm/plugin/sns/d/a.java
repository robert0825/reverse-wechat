package com.tencent.mm.plugin.sns.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bw.b;
import com.tencent.mm.memory.l;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static Bitmap b(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(8781329072128L, 65426);
    long l = System.currentTimeMillis();
    try
    {
      paramDecodeResultLogger = l.yn().a(paramString, paramOptions, paramDecodeResultLogger);
      paramOptions = paramDecodeResultLogger;
      if (paramDecodeResultLogger != null) {
        paramOptions = i.r(paramString, paramDecodeResultLogger);
      }
      w.d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramOptions });
      GMTrace.o(8781329072128L, 65426);
      return paramOptions;
    }
    catch (OutOfMemoryError paramString)
    {
      b.bVF();
      w.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + paramString.getMessage());
      GMTrace.o(8781329072128L, 65426);
    }
    return null;
  }
  
  public static n c(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    GMTrace.i(8781194854400L, 65425);
    long l = System.currentTimeMillis();
    try
    {
      paramDecodeResultLogger = l.yn().a(paramString, paramOptions, paramDecodeResultLogger);
      paramOptions = paramDecodeResultLogger;
      if (paramDecodeResultLogger != null) {
        paramOptions = i.r(paramString, paramDecodeResultLogger);
      }
      w.d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramOptions });
      paramString = n.i(paramOptions);
      GMTrace.o(8781194854400L, 65425);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      b.bVF();
      w.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + paramString.getMessage());
      GMTrace.o(8781194854400L, 65425);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */