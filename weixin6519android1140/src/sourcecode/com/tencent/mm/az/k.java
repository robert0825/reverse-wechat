package com.tencent.mm.az;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  private static a gRO;
  
  static
  {
    GMTrace.i(1300569784320L, 9690);
    gRO = new a();
    GMTrace.o(1300569784320L, 9690);
  }
  
  public static void KC()
  {
    GMTrace.i(1299093389312L, 9679);
    gRO.gRQ = System.currentTimeMillis();
    w.v("MicroMsg.FTS.FTSWebReportLogic", "startH5Report %s", new Object[] { Long.valueOf(gRO.gRQ) });
    GMTrace.o(1299093389312L, 9679);
  }
  
  public static void KD()
  {
    GMTrace.i(1299227607040L, 9680);
    a locala = gRO;
    locala.gRR += System.currentTimeMillis() - gRO.gRQ;
    w.v("MicroMsg.FTS.FTSWebReportLogic", "stopH5Report %s", new Object[] { Long.valueOf(gRO.gRR) });
    GMTrace.o(1299227607040L, 9680);
  }
  
  public static void KE()
  {
    GMTrace.i(1299361824768L, 9681);
    a locala = gRO;
    locala.gLT += System.currentTimeMillis() - gRO.gRS;
    w.v("MicroMsg.FTS.FTSWebReportLogic", "stopTotalReport %s", new Object[] { Long.valueOf(gRO.gLT) });
    GMTrace.o(1299361824768L, 9681);
  }
  
  public static void KF()
  {
    GMTrace.i(1299496042496L, 9682);
    a locala = gRO;
    if (!locala.gRT)
    {
      g.ork.i(12044, new Object[] { Integer.valueOf(locala.scene), Integer.valueOf(locala.gRP), Long.valueOf(locala.gRR / 1000L), Long.valueOf(locala.gLT / 1000L) });
      locala.gRT = true;
    }
    w.v("MicroMsg.FTS.FTSWebReportLogic", "reportTime");
    GMTrace.o(1299496042496L, 9682);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    GMTrace.i(17863708508160L, 133095);
    if (paramInt1 == 21) {}
    for (int i = c.GL();; i = e.GL())
    {
      g.ork.i(14457, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
      GMTrace.o(17863708508160L, 133095);
      return;
    }
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, String paramString2, int paramInt5)
  {
    GMTrace.i(17862903201792L, 133089);
    w.v("MicroMsg.FTS.FTSWebReportLogic", "kvReportWebSearchGuideDisplay %d %d %s %d %d %s %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString2, Integer.valueOf(paramInt5) });
    g.ork.i(12098, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(e.GL()), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString2, Integer.valueOf(paramInt5) });
    GMTrace.o(17862903201792L, 133089);
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    GMTrace.i(1300435566592L, 9689);
    g.ork.i(13810, new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(0) });
    GMTrace.o(1300435566592L, 9689);
  }
  
  public static void a(int paramInt1, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    GMTrace.i(1298824953856L, 9677);
    int i;
    if (paramBoolean1) {
      i = 3;
    }
    for (;;)
    {
      g.ork.i(12042, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(paramInt2), bg.aq(paramString, "").replace(",", " ") });
      GMTrace.o(1298824953856L, 9677);
      return;
      if (paramBoolean2) {
        i = 2;
      } else {
        i = 1;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(19135824134144L, 142573);
    w.v("MicroMsg.FTS.FTSWebReportLogic", "kvReportWebSearchLocalPageClick %s %s %d %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3 });
    g.ork.i(14657, new Object[] { Uri.encode(paramString1), paramString2, Integer.valueOf(paramInt), paramString3 });
    GMTrace.o(19135824134144L, 142573);
  }
  
  public static void a(String paramString1, String paramString2, long paramLong, String paramString3)
  {
    GMTrace.i(19135958351872L, 142574);
    w.v("MicroMsg.FTS.FTSWebReportLogic", "kvReportWebSearchLocalPageExposure:");
    g.ork.i(14663, new Object[] { Uri.encode(paramString1), paramString2, Long.valueOf(paramLong), paramString3 });
    GMTrace.o(19135958351872L, 142574);
  }
  
  public static final void aX(int paramInt1, int paramInt2)
  {
    GMTrace.i(17863171637248L, 133091);
    if (paramInt1 == 21) {
      g.ork.a(649L, paramInt2, 1L, true);
    }
    GMTrace.o(17863171637248L, 133091);
  }
  
  public static void aY(int paramInt1, int paramInt2)
  {
    GMTrace.i(17863305854976L, 133092);
    c(paramInt1, paramInt2, "");
    GMTrace.o(17863305854976L, 133092);
  }
  
  public static void b(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(19135689916416L, 142572);
    g.ork.i(12845, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(paramInt2), paramString });
    GMTrace.o(19135689916416L, 142572);
  }
  
  public static void c(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(17863440072704L, 133093);
    a(paramInt1, paramInt2, 0, 0, paramString);
    GMTrace.o(17863440072704L, 133093);
  }
  
  public static void d(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1299898695680L, 9685);
    g.ork.i(12639, new Object[] { bg.aq(paramString, "").replace(",", " "), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt3) });
    GMTrace.o(1299898695680L, 9685);
  }
  
  public static void f(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(1300301348864L, 9688);
    g.ork.i(13809, new Object[] { Integer.valueOf(paramInt), paramString1, paramString2, Integer.valueOf(0) });
    GMTrace.o(1300301348864L, 9688);
  }
  
  public static void gR(int paramInt)
  {
    GMTrace.i(1298959171584L, 9678);
    gRO.scene = paramInt;
    gRO.gRP = 1;
    gRO.gRQ = System.currentTimeMillis();
    gRO.gRR = 0L;
    gRO.gRS = System.currentTimeMillis();
    gRO.gLT = 0L;
    gRO.gRT = false;
    w.v("MicroMsg.FTS.FTSWebReportLogic", "initReport %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
    GMTrace.o(1298959171584L, 9678);
  }
  
  public static void gS(int paramInt)
  {
    GMTrace.i(1299630260224L, 9683);
    w.v("MicroMsg.FTS.FTSWebReportLogic", "kvReportWebSearchVisit %d", new Object[] { Integer.valueOf(paramInt) });
    g.ork.i(12041, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(e.GL()) });
    GMTrace.o(1299630260224L, 9683);
  }
  
  public static final void gT(int paramInt)
  {
    GMTrace.i(17863037419520L, 133090);
    g.ork.a(649L, paramInt, 1L, true);
    GMTrace.o(17863037419520L, 133090);
  }
  
  public static final void kK(String paramString)
  {
    GMTrace.i(16175249489920L, 120515);
    w.v("MicroMsg.FTS.FTSWebReportLogic", "reportWebSuggestClick %s", new Object[] { paramString });
    g.ork.A(12721, paramString);
    GMTrace.o(16175249489920L, 120515);
  }
  
  public static void m(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19136092569600L, 142575);
    g.ork.i(14752, new Object[] { Integer.valueOf(1), paramString1, paramString2, paramString3 });
    GMTrace.o(19136092569600L, 142575);
  }
  
  public static void o(int paramInt, String paramString)
  {
    GMTrace.i(1298690736128L, 9676);
    g.ork.A(paramInt, paramString);
    GMTrace.o(1298690736128L, 9676);
  }
  
  public static void p(int paramInt, String paramString)
  {
    GMTrace.i(16262625230848L, 121166);
    g.ork.i(12070, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(e.GL()), paramString, Integer.valueOf(4), Integer.valueOf(0), "", Integer.valueOf(1), Integer.valueOf(0) });
    GMTrace.o(16262625230848L, 121166);
  }
  
  public static void r(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(17863574290432L, 133094);
    a(paramInt1, 3, paramInt2, paramInt3, "");
    GMTrace.o(17863574290432L, 133094);
  }
  
  public static final class a
  {
    long gLT;
    int gRP;
    long gRQ;
    long gRR;
    long gRS;
    boolean gRT;
    int scene;
    
    public a()
    {
      GMTrace.i(1325802717184L, 9878);
      this.gRT = true;
      GMTrace.o(1325802717184L, 9878);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */