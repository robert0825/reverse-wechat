package com.tencent.mm.af;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.bco;
import com.tencent.mm.protocal.c.hg;
import com.tencent.mm.protocal.c.xp;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends i<b>
  implements com.tencent.mm.ad.e
{
  public static final String[] fTX;
  private com.tencent.mm.sdk.e.e fTZ;
  private final com.tencent.mm.sdk.e.k<a, c.a.a> gvy;
  
  static
  {
    GMTrace.i(4536424988672L, 33799);
    fTX = new String[] { i.a(b.fTp, "BizEnterprise") };
    GMTrace.o(4536424988672L, 33799);
  }
  
  public c(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, b.fTp, "BizEnterprise", null);
    GMTrace.i(4534411722752L, 33784);
    this.gvy = new com.tencent.mm.sdk.e.k() {};
    this.fTZ = parame;
    parame.eZ("BizEnterprise", "CREATE INDEX IF NOT EXISTS BizEnterpriseUserNameIndex ON BizEnterprise ( userName )");
    h.xx().fYr.a(1343, this);
    h.xx().fYr.a(1228, this);
    GMTrace.o(4534411722752L, 33784);
  }
  
  public static w a(String paramString, boolean paramBoolean, com.tencent.mm.ad.e parame)
  {
    GMTrace.i(4535753900032L, 33794);
    hg localhg = new hg();
    localhg.tVU = paramString;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      localhg.tWg = i;
      localhg.tWe = 0;
      paramString = new w(localhg, parame);
      if (!h.xx().fYr.a(paramString, 0)) {
        break;
      }
      GMTrace.o(4535753900032L, 33794);
      return paramString;
    }
    GMTrace.o(4535753900032L, 33794);
    return null;
  }
  
  public static void a(w paramw)
  {
    GMTrace.i(4536022335488L, 33796);
    h.xx().fYr.c(paramw);
    paramw.data = null;
    GMTrace.o(4536022335488L, 33796);
  }
  
  private boolean a(b paramb)
  {
    GMTrace.i(4535351246848L, 33791);
    if (paramb == null)
    {
      GMTrace.o(4535351246848L, 33791);
      return false;
    }
    boolean bool = super.b(paramb);
    int i = c.a.b.gvD;
    if (!bool)
    {
      bool = super.a(paramb);
      i = c.a.b.gvF;
    }
    for (;;)
    {
      if (bool)
      {
        c.a.a locala = new c.a.a();
        locala.gvB = paramb.field_userName;
        locala.gvA = i;
        locala.gvC = paramb;
        this.gvy.bI(locala);
        this.gvy.doNotify();
      }
      GMTrace.o(4535351246848L, 33791);
      return bool;
    }
  }
  
  private boolean a(hg paramhg)
  {
    GMTrace.i(4535485464576L, 33792);
    b localb = ir(paramhg.tVU);
    localb.field_userName = paramhg.tVU;
    localb.field_qyUin = paramhg.tWe;
    localb.field_userUin = paramhg.tWf;
    localb.field_wwMaxExposeTimes = paramhg.tWh;
    localb.field_wwUserVid = paramhg.tWi;
    localb.field_wwCorpId = paramhg.tWj;
    if ((paramhg.tWi == 0L) && (paramhg.tWj == 0L) && (paramhg.tWe != 0))
    {
      localb.field_wwUserVid = paramhg.tWf;
      localb.field_wwCorpId = paramhg.tWe;
    }
    paramhg.tWg &= 0xFFFFFFF7;
    localb.field_userFlag = (paramhg.tWg | localb.field_userFlag & 0x8);
    boolean bool = a(localb);
    GMTrace.o(4535485464576L, 33792);
    return bool;
  }
  
  public static boolean a(String paramString, com.tencent.mm.ad.e parame)
  {
    GMTrace.i(4535619682304L, 33793);
    if (bg.nm(paramString))
    {
      GMTrace.o(4535619682304L, 33793);
      return false;
    }
    if (f.iP(paramString)) {}
    for (int i = 1;; i = 2)
    {
      paramString = new r(paramString, i, parame);
      boolean bool = h.xx().fYr.a(paramString, 0);
      GMTrace.o(4535619682304L, 33793);
      return bool;
      if (!f.iO(paramString)) {
        break;
      }
    }
    GMTrace.o(4535619682304L, 33793);
    return false;
  }
  
  private b ir(String paramString)
  {
    GMTrace.i(4534948593664L, 33788);
    b localb = iq(paramString);
    if (localb == null)
    {
      localb = new b();
      localb.field_userName = paramString;
      localb.field_qyUin = 0;
      localb.field_userUin = 0;
      localb.field_userFlag = 0;
      localb.field_wwExposeTimes = 0;
      localb.field_wwMaxExposeTimes = 0;
      localb.field_wwUserVid = 0L;
      localb.field_wwCorpId = 0L;
      GMTrace.o(4534948593664L, 33788);
      return localb;
    }
    GMTrace.o(4534948593664L, 33788);
    return localb;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    int j = -1;
    GMTrace.i(4536290770944L, 33798);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(4536290770944L, 33798);
      return;
    }
    int i = paramInt2;
    Object localObject2;
    Object localObject1;
    if ((paramk instanceof r))
    {
      localObject2 = (r)paramk;
      if ((((r)localObject2).fUa != null) && (((r)localObject2).fUa.gtD.gtK != null)) {}
      for (localObject1 = (xp)((r)localObject2).fUa.gtD.gtK; (localObject1 == null) || (((xp)localObject1).tWa == null) || (((xp)localObject1).tWa.ret != 0) || (((xp)localObject1).upg == null); localObject1 = null)
      {
        GMTrace.o(4536290770944L, 33798);
        return;
      }
      if (!a(((xp)localObject1).upg)) {
        paramInt2 = -1;
      }
      localObject1 = (com.tencent.mm.ad.e)((r)localObject2).data;
      i = paramInt2;
      if (localObject1 != null)
      {
        ((com.tencent.mm.ad.e)localObject1).a(paramInt1, paramInt2, paramString, paramk);
        i = paramInt2;
      }
    }
    if ((paramk instanceof w))
    {
      localObject2 = (w)paramk;
      if ((((w)localObject2).fUa != null) && (((w)localObject2).fUa.gtD.gtK != null)) {}
      for (localObject1 = (bco)((w)localObject2).fUa.gtD.gtK; (localObject1 == null) || (((bco)localObject1).tWa == null) || (((bco)localObject1).tWa.ret != 0) || (((bco)localObject1).upg == null); localObject1 = null)
      {
        GMTrace.o(4536290770944L, 33798);
        return;
      }
      if (a(((bco)localObject1).upg)) {
        break label329;
      }
    }
    label329:
    for (paramInt2 = j;; paramInt2 = i)
    {
      localObject1 = (com.tencent.mm.ad.e)((w)localObject2).data;
      if (localObject1 != null) {
        ((com.tencent.mm.ad.e)localObject1).a(paramInt1, paramInt2, paramString, paramk);
      }
      GMTrace.o(4536290770944L, 33798);
      return;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4534680158208L, 33786);
    if (this.gvy != null) {
      this.gvy.remove(parama);
    }
    GMTrace.o(4534680158208L, 33786);
  }
  
  public final void a(a parama, Looper paramLooper)
  {
    GMTrace.i(4534545940480L, 33785);
    this.gvy.a(parama, paramLooper);
    GMTrace.o(4534545940480L, 33785);
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(4535217029120L, 33790);
    if (bg.nm(paramString))
    {
      GMTrace.o(4535217029120L, 33790);
      return false;
    }
    b localb = new b();
    localb.field_userName = paramString;
    boolean bool = super.a(localb, new String[] { "userName" });
    if (bool)
    {
      c.a.a locala = new c.a.a();
      locala.gvB = paramString;
      locala.gvA = c.a.b.gvE;
      locala.gvC = localb;
      this.gvy.bI(locala);
      this.gvy.doNotify();
    }
    GMTrace.o(4535217029120L, 33790);
    return bool;
  }
  
  public final b iq(String paramString)
  {
    GMTrace.i(4534814375936L, 33787);
    if (bg.nm(paramString))
    {
      GMTrace.o(4534814375936L, 33787);
      return null;
    }
    b localb = new b();
    localb.field_userName = paramString;
    if (super.b(localb, new String[0]))
    {
      GMTrace.o(4534814375936L, 33787);
      return localb;
    }
    a(paramString, null);
    GMTrace.o(4534814375936L, 33787);
    return null;
  }
  
  public final int is(String paramString)
  {
    GMTrace.i(4535082811392L, 33789);
    paramString = iq(paramString);
    if (paramString == null)
    {
      GMTrace.o(4535082811392L, 33789);
      return 0;
    }
    int i = paramString.field_qyUin;
    GMTrace.o(4535082811392L, 33789);
    return i;
  }
  
  public final void it(String paramString)
  {
    GMTrace.i(4535888117760L, 33795);
    paramString = ir(paramString);
    if (paramString.field_wwExposeTimes >= paramString.field_wwMaxExposeTimes)
    {
      GMTrace.o(4535888117760L, 33795);
      return;
    }
    paramString.field_wwExposeTimes += 1;
    a(paramString);
    GMTrace.o(4535888117760L, 33795);
  }
  
  public final boolean iu(String paramString)
  {
    GMTrace.i(4536156553216L, 33797);
    paramString = iq(paramString);
    if ((paramString != null) && ((paramString.field_userFlag & 0x1) != 0))
    {
      GMTrace.o(4536156553216L, 33797);
      return true;
    }
    GMTrace.o(4536156553216L, 33797);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
    
    public static final class a
    {
      public int gvA;
      public String gvB;
      public b gvC;
      
      public a()
      {
        GMTrace.i(4529177231360L, 33745);
        GMTrace.o(4529177231360L, 33745);
      }
    }
    
    public static enum b
    {
      static
      {
        GMTrace.i(4551725809664L, 33913);
        gvD = 1;
        gvE = 2;
        gvF = 3;
        gvG = new int[] { gvD, gvE, gvF };
        GMTrace.o(4551725809664L, 33913);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */