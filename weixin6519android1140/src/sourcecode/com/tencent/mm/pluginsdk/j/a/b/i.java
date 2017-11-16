package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.pluginsdk.j.a.e.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.h;

public final class i
{
  static final byte[] tqp;
  private static final String tqq;
  private static final String tqr;
  static final int[] tqs;
  
  static
  {
    GMTrace.i(849598218240L, 6330);
    tqp = new byte[] { 48, -126, 1, 75, 48, -126, 1, 3, 6, 7, 42, -122, 72, -50, 61, 2, 1, 48, -127, -9, 2, 1, 1, 48, 44, 6, 7, 42, -122, 72, -50, 61, 1, 1, 2, 33, 0, -1, -1, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 91, 4, 32, -1, -1, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -4, 4, 32, 90, -58, 53, -40, -86, 58, -109, -25, -77, -21, -67, 85, 118, -104, -122, -68, 101, 29, 6, -80, -52, 83, -80, -10, 59, -50, 60, 62, 39, -46, 96, 75, 3, 21, 0, -60, -99, 54, 8, -122, -25, 4, -109, 106, 102, 120, -31, 19, -99, 38, -73, -127, -97, 126, -112, 4, 65, 4, 107, 23, -47, -14, -31, 44, 66, 71, -8, -68, -26, -27, 99, -92, 64, -14, 119, 3, 125, -127, 45, -21, 51, -96, -12, -95, 57, 69, -40, -104, -62, -106, 79, -29, 66, -30, -2, 26, 127, -101, -114, -25, -21, 74, 124, 15, -98, 22, 43, -50, 51, 87, 107, 49, 94, -50, -53, -74, 64, 104, 55, -65, 81, -11, 2, 33, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -68, -26, -6, -83, -89, 23, -98, -124, -13, -71, -54, -62, -4, 99, 37, 81, 2, 1, 1, 3, 66, 0, 4, 52, 4, -14, 45, -10, -68, -118, -59, 62, 64, -101, 93, 6, -54, -27, 79, 94, 126, -9, -80, -61, -63, -38, 115, -53, 70, -63, 16, -20, -32, -80, -80, 38, 102, 16, 27, 28, 61, -60, -33, 65, 93, -25, 30, 83, 66, -24, 28, 39, 24, 69, -104, 55, -63, 108, 5, 56, -63, -4, -5, 88, -49, -126, 85 };
    tqq = e.ghz + "CheckResUpdate/";
    tqr = e.ghw + "CheckResUpdate/";
    tqs = new int[] { 27, 35, 29, 38, 40, 33, 37, 39, 41, 46 };
    GMTrace.o(849598218240L, 6330);
  }
  
  static String OJ(String paramString)
  {
    GMTrace.i(849195565056L, 6327);
    if (paramString.startsWith("38" + ".")) {}
    for (String str = tqr;; str = tqq)
    {
      h.Nj(str);
      paramString = str + paramString;
      GMTrace.o(849195565056L, 6327);
      return paramString;
    }
  }
  
  static boolean OK(String paramString)
  {
    GMTrace.i(849464000512L, 6329);
    if (bg.nm(paramString))
    {
      GMTrace.o(849464000512L, 6329);
      return false;
    }
    paramString = OJ(paramString);
    boolean bool1 = a.OS(paramString);
    boolean bool2 = a.OS(paramString + ".decompressed");
    boolean bool3 = a.OS(paramString + ".decrypted");
    GMTrace.o(849464000512L, 6329);
    return bool3 & bool1 & true & bool2;
  }
  
  public static String dU(int paramInt1, int paramInt2)
  {
    GMTrace.i(849329782784L, 6328);
    String str = String.format("%d.%d.data", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(849329782784L, 6328);
    return str;
  }
  
  static enum a
  {
    final int eQl;
    
    static
    {
      GMTrace.i(855235362816L, 6372);
      tqt = new a("ENCRYPTION", 0, 1);
      tqu = new a("COMPRESSION", 1, 2);
      tqv = new a[] { tqt, tqu };
      GMTrace.o(855235362816L, 6372);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(854564274176L, 6367);
      this.eQl = paramInt;
      GMTrace.o(854564274176L, 6367);
    }
    
    static int bKd()
    {
      GMTrace.i(854966927360L, 6370);
      int i = tqt.eQl;
      GMTrace.o(854966927360L, 6370);
      return i | 0x0;
    }
    
    static boolean yS(int paramInt)
    {
      GMTrace.i(854698491904L, 6368);
      if ((tqt.eQl & paramInt) > 0)
      {
        GMTrace.o(854698491904L, 6368);
        return true;
      }
      GMTrace.o(854698491904L, 6368);
      return false;
    }
    
    static boolean yT(int paramInt)
    {
      GMTrace.i(854832709632L, 6369);
      if ((tqu.eQl & paramInt) > 0)
      {
        GMTrace.o(854832709632L, 6369);
        return true;
      }
      GMTrace.o(854832709632L, 6369);
      return false;
    }
    
    static int yU(int paramInt)
    {
      GMTrace.i(855101145088L, 6371);
      int i = tqu.eQl;
      GMTrace.o(855101145088L, 6371);
      return i | paramInt;
    }
  }
  
  static enum b
  {
    final int eQl;
    
    static
    {
      GMTrace.i(860469854208L, 6411);
      tqw = new b("DoNothing", 0, 0);
      tqx = new b("DoCache", 1, 1);
      tqy = new b("DoDecrypt", 2, 2);
      tqz = new b("DoDelete", 3, 4);
      tqA = new b[] { tqw, tqx, tqy, tqz };
      GMTrace.o(860469854208L, 6411);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(859664547840L, 6405);
      this.eQl = paramInt;
      GMTrace.o(859664547840L, 6405);
    }
    
    static int OL(String paramString)
    {
      GMTrace.i(860335636480L, 6410);
      if ("cache".equals(paramString))
      {
        i = tqx.eQl;
        GMTrace.o(860335636480L, 6410);
        return i;
      }
      if ("delete".equals(paramString))
      {
        i = tqz.eQl;
        GMTrace.o(860335636480L, 6410);
        return i;
      }
      if ("decrypt".equals(paramString))
      {
        i = tqy.eQl;
        GMTrace.o(860335636480L, 6410);
        return i;
      }
      int i = tqw.eQl;
      GMTrace.o(860335636480L, 6410);
      return i;
    }
    
    static boolean yV(int paramInt)
    {
      GMTrace.i(859798765568L, 6406);
      if (paramInt == tqw.eQl)
      {
        GMTrace.o(859798765568L, 6406);
        return true;
      }
      GMTrace.o(859798765568L, 6406);
      return false;
    }
    
    static boolean yW(int paramInt)
    {
      GMTrace.i(859932983296L, 6407);
      if ((tqx.eQl & paramInt) > 0)
      {
        GMTrace.o(859932983296L, 6407);
        return true;
      }
      GMTrace.o(859932983296L, 6407);
      return false;
    }
    
    static boolean yX(int paramInt)
    {
      GMTrace.i(860067201024L, 6408);
      if ((tqy.eQl & paramInt) > 0)
      {
        GMTrace.o(860067201024L, 6408);
        return true;
      }
      GMTrace.o(860067201024L, 6408);
      return false;
    }
    
    static boolean yY(int paramInt)
    {
      GMTrace.i(860201418752L, 6409);
      if ((tqz.eQl & paramInt) > 0)
      {
        GMTrace.o(860201418752L, 6409);
        return true;
      }
      GMTrace.o(860201418752L, 6409);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */