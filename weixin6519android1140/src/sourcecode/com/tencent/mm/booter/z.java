package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mg;
import com.tencent.mm.g.a.op;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.s;
import java.util.HashSet;
import java.util.Locale;

public final class z
{
  public static z fJI;
  public s fJJ;
  public c fJK;
  public c fJL;
  public a fJM;
  public int fJN;
  HashSet<Long> fJO;
  HashSet<Long> fJP;
  public long fJQ;
  public long fJR;
  public String fJS;
  public long fJT;
  public int fJU;
  public int fJV;
  public int fJW;
  public int fJX;
  public boolean hasInit;
  
  static
  {
    GMTrace.i(500497907712L, 3729);
    fJI = new z();
    GMTrace.o(500497907712L, 3729);
  }
  
  private z()
  {
    GMTrace.i(500229472256L, 3727);
    this.fJK = new c() {};
    this.fJL = new c() {};
    this.fJN = 0;
    this.fJO = new HashSet();
    this.fJP = new HashSet();
    this.fJT = -1L;
    this.fJU = 20;
    this.fJV = 24;
    this.fJW = 30;
    this.fJX = 10800;
    this.hasInit = false;
    this.fJJ = new s(com.tencent.mm.storage.w.ghv + "staytime.cfg");
    GMTrace.o(500229472256L, 3727);
  }
  
  public final void ds(String paramString)
  {
    GMTrace.i(500363689984L, 3728);
    a.vgX.c(this.fJK);
    a.vgX.c(this.fJL);
    this.fJP.clear();
    this.fJO.clear();
    if ((paramString == null) || (this.fJM == null))
    {
      if (this.fJM == null) {}
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.StayTimeReport", "exitChattingUI chatUser or reprotingItem is null, chatUser:%s, reportingItem is null:%b", new Object[] { paramString, Boolean.valueOf(bool) });
        GMTrace.o(500363689984L, 3728);
        return;
      }
    }
    if (!paramString.equals(this.fJM.fJZ))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.StayTimeReport", "exitChattingUI no startedUI: %s, start:", new Object[] { paramString, this.fJM.fJZ });
      GMTrace.o(500363689984L, 3728);
      return;
    }
    paramString = this.fJM;
    paramString.time += t.aI(this.fJQ) / 1000L;
    paramString = (String)this.fJJ.get(5, "");
    this.fJJ.set(5, paramString + this.fJM.toString());
    long l = this.fJJ.getLong(4, 0L);
    int i = this.fJJ.Ar(6) + 1;
    this.fJJ.setInt(6, i);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.StayTimeReport", "exitChattingUI, chatUser:%s, type:%d, stayTime:%d, stayWebTime:%d, chattingReportCnt:%d", new Object[] { this.fJM.fJZ, Integer.valueOf(this.fJM.type), Long.valueOf(this.fJM.time), Integer.valueOf(this.fJM.fKd), Integer.valueOf(i) });
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.StayTimeReport", "exitChattingUI goBackHistoryStatus:%d, recnCnt:%d, sendCnt:%d", new Object[] { Integer.valueOf(this.fJM.fKe), Integer.valueOf(this.fJM.fKf), Integer.valueOf(this.fJM.fKg) });
    if ((t.aG(l) > this.fJX) || (i > this.fJW)) {}
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        paramString = (String)this.fJJ.get(5, "");
        paramString = paramString + "," + l + "," + t.Pu();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.StayTimeReport", "report （13062） %d: %s", new Object[] { Integer.valueOf(13062), paramString });
        g.ork.A(13062, paramString);
        this.fJJ.setInt(6, 0);
        this.fJJ.set(5, "");
      }
      this.fJM = null;
      GMTrace.o(500363689984L, 3728);
      return;
    }
  }
  
  public final class a
  {
    public int eAs;
    public String fJZ;
    public int fKa;
    public int fKb;
    public long fKc;
    public int fKd;
    public int fKe;
    int fKf;
    int fKg;
    public long time;
    public int type;
    
    public a()
    {
      GMTrace.i(492713279488L, 3671);
      this.fKe = 0;
      this.fKf = 0;
      this.fKg = 0;
      GMTrace.o(492713279488L, 3671);
    }
    
    public final String toString()
    {
      GMTrace.i(492847497216L, 3672);
      String str = String.format(Locale.US, "%d#%d#%d#%d#%d#%d#%d#%s#%d#%d#%d|", new Object[] { Integer.valueOf(this.type), Long.valueOf(this.time), Integer.valueOf(this.fKa), Integer.valueOf(this.eAs), Integer.valueOf(this.fKb), Long.valueOf(this.fKc), Integer.valueOf(this.fKd), this.fJZ, Integer.valueOf(this.fKe), Integer.valueOf(this.fKf), Integer.valueOf(this.fKg) });
      GMTrace.o(492847497216L, 3672);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */