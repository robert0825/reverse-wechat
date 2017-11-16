package com.tencent.mm.protocal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends e
{
  public static String DEVICE_TYPE;
  public static final String tJA;
  public static long tJB;
  public static int tJC;
  public static boolean tJD;
  public static boolean tJE;
  public static boolean tJF;
  public static boolean tJG;
  public static boolean tJH;
  public static int tJI;
  public static final byte[] tJJ;
  public static final byte[] tJK;
  public static final byte[] tJL;
  public static final String tJv;
  public static final String tJw;
  public static String tJx;
  public static final String tJy;
  public static String tJz;
  
  static
  {
    GMTrace.i(13572767744000L, 101125);
    DEVICE_TYPE = "android-" + Build.VERSION.SDK_INT;
    tJv = Build.BRAND;
    tJw = Build.MODEL + Build.CPU_ABI;
    tJx = "android-" + Build.VERSION.SDK_INT;
    tJy = "android-" + Build.MANUFACTURER;
    tJz = Build.VERSION.SDK_INT;
    tJA = Build.MANUFACTURER + "-" + Build.MODEL;
    tJB = 0L;
    tJC = Integer.decode("0x26051334").intValue();
    try
    {
      int i = ab.getContext().getPackageManager().getApplicationInfo(ab.getPackageName(), 128).metaData.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
      if ((i > tJC) && (i - tJC < 255) && ((i & 0xFF) >= 48)) {
        tJC = i;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.j("MicroMsg.ConstantsProtocal", "", new Object[] { localException });
      }
    }
    tJD = bOb();
    tJE = bOa();
    tJF = bNY();
    tJG = bNX();
    tJH = bNZ();
    tJI = 5;
    tJJ = null;
    tJK = null;
    tJL = null;
    GMTrace.o(13572767744000L, 101125);
  }
  
  private static boolean bNX()
  {
    GMTrace.i(13572230873088L, 101121);
    if (((tJC & 0xFF) >= 32) && ((tJC & 0xFF) <= 47))
    {
      GMTrace.o(13572230873088L, 101121);
      return true;
    }
    GMTrace.o(13572230873088L, 101121);
    return false;
  }
  
  private static boolean bNY()
  {
    GMTrace.i(13572365090816L, 101122);
    if (((tJC & 0xFF) >= 0) && ((tJC & 0xFF) <= 31))
    {
      GMTrace.o(13572365090816L, 101122);
      return true;
    }
    GMTrace.o(13572365090816L, 101122);
    return false;
  }
  
  private static boolean bNZ()
  {
    GMTrace.i(20311437213696L, 151332);
    if (((tJC & 0xFF) >= 0) && ((tJC & 0xFF) <= 15))
    {
      GMTrace.o(20311437213696L, 151332);
      return true;
    }
    GMTrace.o(20311437213696L, 151332);
    return false;
  }
  
  private static boolean bOa()
  {
    GMTrace.i(13572499308544L, 101123);
    if (((tJC & 0xFF) >= 96) && ((tJC & 0xFF) <= 159))
    {
      GMTrace.o(13572499308544L, 101123);
      return true;
    }
    GMTrace.o(13572499308544L, 101123);
    return false;
  }
  
  private static boolean bOb()
  {
    GMTrace.i(13572633526272L, 101124);
    if (((tJC & 0xFF) >= 48) && ((tJC & 0xFF) <= 95))
    {
      GMTrace.o(13572633526272L, 101124);
      return true;
    }
    GMTrace.o(13572633526272L, 101124);
    return false;
  }
  
  public static void zM(int paramInt)
  {
    GMTrace.i(13572096655360L, 101120);
    tJC = paramInt;
    tJF = bNY();
    tJG = bNX();
    tJD = bOb();
    tJE = bOa();
    tJH = bNZ();
    GMTrace.o(13572096655360L, 101120);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */