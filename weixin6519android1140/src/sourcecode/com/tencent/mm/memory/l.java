package com.tencent.mm.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public abstract class l
{
  private static j ghO;
  private static m ghP;
  private static int ghQ;
  
  static
  {
    GMTrace.i(1287684882432L, 9594);
    ghO = new j();
    ghP = new m();
    ghQ = -1;
    GMTrace.o(1287684882432L, 9594);
  }
  
  public l()
  {
    GMTrace.i(1286745358336L, 9587);
    GMTrace.o(1286745358336L, 9587);
  }
  
  protected static void d(InputStream paramInputStream)
  {
    GMTrace.i(1287148011520L, 9590);
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported()) {
      if (!(paramInputStream instanceof FileInputStream)) {
        break label51;
      }
    }
    for (localObject = new i((FileInputStream)paramInputStream);; localObject = new BufferedInputStream(paramInputStream, 65536)) {
      try
      {
        ((InputStream)localObject).reset();
        GMTrace.o(1287148011520L, 9590);
        return;
      }
      catch (Exception paramInputStream)
      {
        label51:
        w.printErrStackTrace("MicroMsg.PlatformBitmapFactory", paramInputStream, "reset stream error: %s", new Object[] { paramInputStream.getMessage() });
        GMTrace.o(1287148011520L, 9590);
      }
    }
  }
  
  public static l yn()
  {
    GMTrace.i(1286879576064L, 9588);
    if (ghQ == -1) {
      if (!yo()) {
        break label67;
      }
    }
    label67:
    for (ghQ = 1;; ghQ = 2) {
      switch (ghQ)
      {
      default: 
        localObject = ghP;
        GMTrace.o(1286879576064L, 9588);
        return (l)localObject;
      }
    }
    Object localObject = ghO;
    GMTrace.o(1286879576064L, 9588);
    return (l)localObject;
    localObject = ghP;
    GMTrace.o(1286879576064L, 9588);
    return (l)localObject;
  }
  
  public static boolean yo()
  {
    GMTrace.i(1287013793792L, 9589);
    boolean bool = d.et(19);
    w.i("MicroMsg.PlatformBitmapFactory", "canUseInBitmapFactory, isVersionMatch: %b, isART: %b, result: %s", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(bg.bQZ()), Boolean.valueOf(bool) });
    GMTrace.o(1287013793792L, 9589);
    return bool;
  }
  
  public abstract Bitmap a(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger);
  
  public abstract Bitmap a(String paramString, Rect paramRect, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger);
  
  public abstract void h(Bitmap paramBitmap);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */