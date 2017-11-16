package com.tencent.mm.plugin.clean.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;

public final class d
{
  private static long jSK;
  private static long jSL;
  private static com.tencent.mm.plugin.clean.c.a.b jSV;
  private static long jTa;
  private static long jTb;
  private static final ae jTj;
  private static HashSet<String> jTk;
  public static int jTl;
  private static ArrayList<b> jea;
  
  static
  {
    GMTrace.i(7047638679552L, 52509);
    jTj = new ae();
    jTb = 0L;
    jTa = 0L;
    jSL = 0L;
    jSK = 0L;
    jTl = 0;
    GMTrace.o(7047638679552L, 52509);
  }
  
  public static void a(com.tencent.mm.plugin.clean.c.a.b paramb)
  {
    GMTrace.i(7045893849088L, 52496);
    jSV = paramb;
    GMTrace.o(7045893849088L, 52496);
  }
  
  public static void aZ(long paramLong)
  {
    GMTrace.i(7046430720000L, 52500);
    jTb = paramLong;
    GMTrace.o(7046430720000L, 52500);
  }
  
  public static ArrayList<b> agb()
  {
    GMTrace.i(7046296502272L, 52499);
    ArrayList localArrayList = jea;
    GMTrace.o(7046296502272L, 52499);
    return localArrayList;
  }
  
  public static com.tencent.mm.plugin.clean.c.a.b anX()
  {
    boolean bool = true;
    GMTrace.i(7046028066816L, 52497);
    if (jSV == null) {}
    for (;;)
    {
      w.d("MicroMsg.CleanLogic", "getThreadController threadController is null? %b", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.plugin.clean.c.a.b localb = jSV;
      GMTrace.o(7046028066816L, 52497);
      return localb;
      bool = false;
    }
  }
  
  public static HashSet<String> anY()
  {
    GMTrace.i(20561619058688L, 153196);
    HashSet localHashSet = jTk;
    GMTrace.o(20561619058688L, 153196);
    return localHashSet;
  }
  
  public static long anZ()
  {
    GMTrace.i(7046564937728L, 52501);
    long l = jTb;
    GMTrace.o(7046564937728L, 52501);
    return l;
  }
  
  public static long aoa()
  {
    GMTrace.i(20561887494144L, 153198);
    long l = jSK;
    GMTrace.o(20561887494144L, 153198);
    return l;
  }
  
  public static long aob()
  {
    GMTrace.i(20562155929600L, 153200);
    long l = jSL;
    GMTrace.o(20562155929600L, 153200);
    return l;
  }
  
  public static long aoc()
  {
    GMTrace.i(7046833373184L, 52503);
    long l = jTa;
    GMTrace.o(7046833373184L, 52503);
    return l;
  }
  
  public static final void aod()
  {
    GMTrace.i(7046967590912L, 52504);
    w.i("MicroMsg.CleanLogic", "startCleanDataNow");
    jTj.removeCallbacksAndMessages(null);
    jTb = 0L;
    jTa = 0L;
    p(null);
    jTl = 0;
    GMTrace.o(7046967590912L, 52504);
  }
  
  public static final void aoe()
  {
    GMTrace.i(7047101808640L, 52505);
    w.i("MicroMsg.CleanLogic", "start to post clean runnable!!");
    jTj.removeCallbacksAndMessages(null);
    jTj.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7048175550464L, 52513);
        if (d.jTl == 0)
        {
          w.i("MicroMsg.CleanLogic", "clean data");
          d.aZ(0L);
          d.p(null);
          GMTrace.o(7048175550464L, 52513);
          return;
        }
        w.i("MicroMsg.CleanLogic", "clean data is using");
        GMTrace.o(7048175550464L, 52513);
      }
    }, 300000L);
    GMTrace.o(7047101808640L, 52505);
  }
  
  public static final void aof()
  {
    GMTrace.i(7047236026368L, 52506);
    jTl += 1;
    GMTrace.o(7047236026368L, 52506);
  }
  
  public static final void aog()
  {
    GMTrace.i(7047370244096L, 52507);
    jTl -= 1;
    GMTrace.o(7047370244096L, 52507);
  }
  
  public static void b(HashSet<String> paramHashSet)
  {
    GMTrace.i(20561484840960L, 153195);
    jTk = paramHashSet;
    GMTrace.o(20561484840960L, 153195);
  }
  
  public static void ba(long paramLong)
  {
    GMTrace.i(20561753276416L, 153197);
    jSK = paramLong;
    GMTrace.o(20561753276416L, 153197);
  }
  
  public static void bb(long paramLong)
  {
    GMTrace.i(20562021711872L, 153199);
    long l = paramLong;
    if (paramLong <= 0L) {
      l = 0L;
    }
    jSL = l;
    GMTrace.o(20562021711872L, 153199);
  }
  
  public static void bc(long paramLong)
  {
    GMTrace.i(7046699155456L, 52502);
    jTa = paramLong;
    GMTrace.o(7046699155456L, 52502);
  }
  
  public static void p(ArrayList<b> paramArrayList)
  {
    boolean bool = true;
    GMTrace.i(7046162284544L, 52498);
    if (paramArrayList == null) {}
    for (;;)
    {
      w.i("MicroMsg.CleanLogic", "set analyse data: is null? %b", new Object[] { Boolean.valueOf(bool) });
      jea = paramArrayList;
      GMTrace.o(7046162284544L, 52498);
      return;
      bool = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */