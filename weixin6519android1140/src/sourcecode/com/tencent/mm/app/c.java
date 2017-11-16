package com.tencent.mm.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class c
{
  public static final int[] erO;
  public static final int[] erP;
  public static final int[] erQ;
  public static final int[] erR;
  public static final int[] erS;
  public static final int[] erT;
  public static final int[] erU;
  public static final int[] erV;
  public static final int[] erW;
  public static final int[] erX;
  public static final int[] erY;
  public static final int[] erZ;
  private static final ArrayList<long[]> esa;
  private static boolean esb;
  private static long esc;
  private static long esd;
  private static byte ese;
  
  static
  {
    GMTrace.i(20321100890112L, 151404);
    erO = new int[] { 0, 1, 2 };
    erP = new int[] { 3, 13, 23 };
    erQ = new int[] { 4, 14, 24 };
    erR = new int[] { 5, 15, 25 };
    erS = new int[] { 6, 16, 26 };
    erT = new int[] { 7, 17, 27 };
    erU = new int[] { 8, 18, 28 };
    erV = new int[] { 9, 19, 29 };
    erW = new int[] { 63, 69, 75 };
    erX = new int[] { 64, 70, 76 };
    erY = new int[] { 65, 71, 77 };
    erZ = new int[] { 66, 72, 78 };
    esa = new ArrayList();
    esb = false;
    esc = 0L;
    esd = 0L;
    ese = 0;
    GMTrace.o(20321100890112L, 151404);
  }
  
  private static void a(int[] paramArrayOfInt, long paramLong)
  {
    GMTrace.i(20320295583744L, 151398);
    w.i("MicroMsg.BlinkStartup", "%s %s", new Object[] { Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(paramLong) });
    d(paramArrayOfInt[0], paramLong);
    if (a.mH)
    {
      d(paramArrayOfInt[1], paramLong);
      GMTrace.o(20320295583744L, 151398);
      return;
    }
    d(paramArrayOfInt[2], paramLong);
    GMTrace.o(20320295583744L, 151398);
  }
  
  public static void by(String paramString)
  {
    GMTrace.i(21020509470720L, 156615);
    if ((cW(512)) && (ab.bPS().equals(paramString)))
    {
      esb = true;
      w.i("MicroMsg.BlinkStartup", "report this time");
    }
    GMTrace.o(21020509470720L, 156615);
  }
  
  private static boolean cW(int paramInt)
  {
    GMTrace.i(20320564019200L, 151400);
    if ((ese & paramInt) == 0)
    {
      ese = (byte)(ese | paramInt);
      w.i("MicroMsg.BlinkStartup", "checkAndMark bit 0x%x", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20320564019200L, 151400);
      return true;
    }
    GMTrace.o(20320564019200L, 151400);
    return false;
  }
  
  public static void cX(int paramInt)
  {
    GMTrace.i(20320698236928L, 151401);
    if (esd == 0L)
    {
      w.e("MicroMsg.BlinkStartup", "sLastPhaseTimestamp is 0");
      GMTrace.o(20320698236928L, 151401);
      return;
    }
    long l = System.currentTimeMillis() - esd;
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20320698236928L, 151401);
      return;
      if (cW(1))
      {
        a(erP, l);
        esd = System.currentTimeMillis();
        GMTrace.o(20320698236928L, 151401);
        return;
        if (cW(2))
        {
          a(erQ, l);
          esd = System.currentTimeMillis();
          GMTrace.o(20320698236928L, 151401);
          return;
          if (cW(4))
          {
            a(erR, l);
            esd = System.currentTimeMillis();
            GMTrace.o(20320698236928L, 151401);
            return;
            if (cW(8))
            {
              a(erS, l);
              esd = System.currentTimeMillis();
              GMTrace.o(20320698236928L, 151401);
              return;
              if (cW(16))
              {
                fI(l);
                a(erT, l);
                esd = System.currentTimeMillis();
                GMTrace.o(20320698236928L, 151401);
                return;
                if (cW(32))
                {
                  fI(l);
                  a(erU, l);
                  esd = System.currentTimeMillis();
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static void d(long paramLong1, long paramLong2)
  {
    GMTrace.i(20320027148288L, 151396);
    esa.add(new long[] { 709L, paramLong1, paramLong2 });
    GMTrace.o(20320027148288L, 151396);
  }
  
  public static void fH(long paramLong)
  {
    GMTrace.i(21068827852800L, 156975);
    if (System.currentTimeMillis() - paramLong > 200L)
    {
      cW(512);
      esb = false;
    }
    GMTrace.o(21068827852800L, 156975);
  }
  
  private static void fI(long paramLong)
  {
    GMTrace.i(21068962070528L, 156976);
    if (paramLong > 10000L) {
      oV();
    }
    GMTrace.o(21068962070528L, 156976);
  }
  
  public static void oU()
  {
    GMTrace.i(21020643688448L, 156616);
    cW(512);
    GMTrace.o(21020643688448L, 156616);
  }
  
  public static void oV()
  {
    GMTrace.i(21020777906176L, 156617);
    cW(512);
    esb = false;
    GMTrace.o(21020777906176L, 156617);
  }
  
  public static boolean oW()
  {
    GMTrace.i(20320429801472L, 151399);
    if (!esb)
    {
      GMTrace.o(20320429801472L, 151399);
      return false;
    }
    boolean bool = cW(256);
    GMTrace.o(20320429801472L, 151399);
    return bool;
  }
  
  public static void oX()
  {
    GMTrace.i(20320832454656L, 151402);
    long l = System.currentTimeMillis() - esc;
    a(erV, l);
    if (l <= 3000L) {
      a(erW, 1L);
    }
    for (;;)
    {
      a(erO, 1L);
      GMTrace.o(20320832454656L, 151402);
      return;
      if ((l > 3000L) && (l <= 6000L)) {
        a(erX, 1L);
      } else if ((l > 6000L) && (l <= 10000L)) {
        a(erY, 1L);
      } else {
        a(erZ, 1L);
      }
    }
  }
  
  public static ArrayList<long[]> oY()
  {
    GMTrace.i(20320966672384L, 151403);
    ArrayList localArrayList = esa;
    GMTrace.o(20320966672384L, 151403);
    return localArrayList;
  }
  
  public static void v(long paramLong)
  {
    GMTrace.i(20320161366016L, 151397);
    esc = paramLong;
    esd = paramLong;
    GMTrace.o(20320161366016L, 151397);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */