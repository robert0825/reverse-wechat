package com.tencent.mm.modelcdntran;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;

public final class d
{
  public static int gAa;
  public static int gAb;
  public static int gAc;
  public static int gAd;
  public static int gzR;
  public static int gzS;
  public static int gzT;
  public static int gzU;
  public static int gzV;
  public static int gzW;
  public static int gzX;
  public static int gzY;
  public static int gzZ;
  
  static
  {
    GMTrace.i(573378134016L, 4272);
    gzR = 1;
    gzS = 2;
    gzT = 3;
    gzU = -1;
    gzV = 3;
    gzW = 4;
    gzX = 5;
    gzY = 1;
    gzZ = 2;
    gAa = 55535;
    gAb = 55534;
    gAc = 55533;
    gAd = 55532;
    GMTrace.o(573378134016L, 4272);
  }
  
  public static String a(String paramString1, long paramLong, String paramString2, String paramString3)
  {
    GMTrace.i(572975480832L, 4269);
    w.d("MicroMsg.CdnUtil", "cdntra genClientId prefix[%s] createtime:%d talker[%s] suffix:[%s] stack[%s]", new Object[] { paramString1, Long.valueOf(paramLong), paramString2, paramString3, bg.bQW() });
    if (bg.nm(jA(paramString1)))
    {
      GMTrace.o(572975480832L, 4269);
      return null;
    }
    if (bg.nm(paramString2))
    {
      GMTrace.o(572975480832L, 4269);
      return null;
    }
    if (paramLong <= 0L)
    {
      GMTrace.o(572975480832L, 4269);
      return null;
    }
    paramString3 = bg.nl(jA(paramString3));
    paramString2 = g.n((q.zE() + "-" + paramString2).getBytes());
    paramString2 = "a" + paramString1 + "_" + paramString2.substring(0, 16) + "_" + paramLong;
    paramString1 = paramString2;
    if (!bg.nm(paramString3)) {
      paramString1 = paramString2 + "_" + paramString3;
    }
    GMTrace.o(572975480832L, 4269);
    return paramString1;
  }
  
  public static void a(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    GMTrace.i(572707045376L, 4267);
    byte[] arrayOfByte = paramArrayOfByte;
    if (bg.bq(paramArrayOfByte)) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte = new String(arrayOfByte);
    if (paramInt == 4)
    {
      w.e(paramString, paramArrayOfByte);
      GMTrace.o(572707045376L, 4267);
      return;
    }
    if (paramInt == 3)
    {
      w.w(paramString, paramArrayOfByte);
      GMTrace.o(572707045376L, 4267);
      return;
    }
    if (paramInt == 2)
    {
      w.i(paramString, paramArrayOfByte);
      GMTrace.o(572707045376L, 4267);
      return;
    }
    if (paramInt == 1)
    {
      w.d(paramString, paramArrayOfByte);
      GMTrace.o(572707045376L, 4267);
      return;
    }
    if (paramInt == 0) {
      w.v(paramString, paramArrayOfByte);
    }
    GMTrace.o(572707045376L, 4267);
  }
  
  public static int bb(Context paramContext)
  {
    GMTrace.i(573109698560L, 4270);
    int i;
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        i = gzR;
        GMTrace.o(573109698560L, 4270);
        return i;
      }
      if (paramContext.getType() == 1)
      {
        i = gzT;
        GMTrace.o(573109698560L, 4270);
        return i;
      }
      if (paramContext.getSubtype() == 1)
      {
        i = gzR;
        GMTrace.o(573109698560L, 4270);
        return i;
      }
      if (paramContext.getSubtype() == 2)
      {
        i = gzR;
        GMTrace.o(573109698560L, 4270);
        return i;
      }
      if (paramContext.getSubtype() >= 3)
      {
        i = gzS;
        GMTrace.o(573109698560L, 4270);
        return i;
      }
      i = gzR;
      GMTrace.o(573109698560L, 4270);
      return i;
    }
    catch (NullPointerException paramContext)
    {
      w.e("MicroMsg.CdnUtil", "exception:%s", new Object[] { bg.f(paramContext) });
      i = gzR;
      GMTrace.o(573109698560L, 4270);
    }
    return i;
  }
  
  public static int bc(Context paramContext)
  {
    GMTrace.i(573243916288L, 4271);
    int i = am.getNetType(paramContext);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext == null)
    {
      i = gzU;
      GMTrace.o(573243916288L, 4271);
      return i;
    }
    if (paramContext.getType() == 1)
    {
      i = gzY;
      GMTrace.o(573243916288L, 4271);
      return i;
    }
    if ((paramContext.getSubtype() == 1) || (paramContext.getSubtype() == 2))
    {
      i = gzV;
      GMTrace.o(573243916288L, 4271);
      return i;
    }
    if (paramContext.getSubtype() >= 13)
    {
      i = gzX;
      GMTrace.o(573243916288L, 4271);
      return i;
    }
    if (paramContext.getSubtype() >= 3)
    {
      i = gzW;
      GMTrace.o(573243916288L, 4271);
      return i;
    }
    if (am.isWap(i))
    {
      i = gzZ;
      GMTrace.o(573243916288L, 4271);
      return i;
    }
    i = gzV;
    GMTrace.o(573243916288L, 4271);
    return i;
  }
  
  private static String jA(String paramString)
  {
    GMTrace.i(572841263104L, 4268);
    if (!bg.nm(paramString))
    {
      int i = 0;
      while (i < paramString.length())
      {
        char c = paramString.charAt(i);
        if ((!bg.k(c)) && (!bg.l(c)))
        {
          GMTrace.o(572841263104L, 4268);
          return null;
        }
        i += 1;
      }
    }
    GMTrace.o(572841263104L, 4268);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */