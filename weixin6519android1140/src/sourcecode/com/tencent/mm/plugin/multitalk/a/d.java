package com.tencent.mm.plugin.multitalk.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class d
{
  public static int nme;
  public static int nmf;
  public static int nmg;
  public static int nmh;
  public static int nmi;
  
  static
  {
    GMTrace.i(4754797232128L, 35426);
    nme = 0;
    nmf = 0;
    nmg = 0;
    nmh = 0;
    nmi = 0;
    GMTrace.o(4754797232128L, 35426);
  }
  
  public static final void CO(String paramString)
  {
    GMTrace.i(4753723490304L, 35418);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkTalkFunction %s %d %d %d %d %d", new Object[] { paramString, Integer.valueOf(nme), Integer.valueOf(nmf), Integer.valueOf(nmg), Integer.valueOf(nmh), Integer.valueOf(nmi) });
    g.ork.i(12729, new Object[] { paramString, Integer.valueOf(nme), Integer.valueOf(nmf), Integer.valueOf(nmg), Integer.valueOf(nmh), Integer.valueOf(nmi) });
    cy(9, nme);
    cy(10, nmi);
    cy(11, nmf);
    cy(12, nmg);
    cy(13, nmh);
    nme = 0;
    nmf = 0;
    nmg = 0;
    nmh = 0;
    nmi = 0;
    GMTrace.o(4753723490304L, 35418);
  }
  
  public static final void a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString, int paramInt3)
  {
    GMTrace.i(4753455054848L, 35416);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkSelectContact %d %b %d %s %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramInt3) });
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      g.ork.i(12727, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt3) });
      GMTrace.o(4753455054848L, 35416);
      return;
    }
  }
  
  public static final void a(boolean paramBoolean, long paramLong, String paramString)
  {
    GMTrace.i(4752649748480L, 35410);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectSuccess %b %d %s", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong), paramString });
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      g.ork.i(12725, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Long.valueOf(paramLong), paramString });
      GMTrace.o(4752649748480L, 35410);
      return;
    }
  }
  
  public static final void a(boolean paramBoolean, long paramLong, String paramString, int paramInt)
  {
    GMTrace.i(4752783966208L, 35411);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectFail %b %d %s %d", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) });
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      g.ork.i(12725, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) });
      GMTrace.o(4752783966208L, 35411);
      return;
    }
  }
  
  public static final void aRa()
  {
    GMTrace.i(4752918183936L, 35412);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailSuccess");
    g.ork.i(12722, new Object[] { Integer.valueOf(1) });
    GMTrace.o(4752918183936L, 35412);
  }
  
  public static final void aRb()
  {
    GMTrace.i(4753052401664L, 35413);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailFail");
    g.ork.i(12722, new Object[] { Integer.valueOf(2) });
    GMTrace.o(4753052401664L, 35413);
  }
  
  public static final void aRc()
  {
    GMTrace.i(4753991925760L, 35420);
    g.ork.a(220L, 0L, 1L, false);
    GMTrace.o(4753991925760L, 35420);
  }
  
  public static final void aRd()
  {
    GMTrace.i(4754260361216L, 35422);
    g.ork.a(220L, 1L, 1L, false);
    GMTrace.o(4754260361216L, 35422);
  }
  
  public static final void aRe()
  {
    GMTrace.i(20507126661120L, 152790);
    g.ork.i(14849, new Object[] { Integer.valueOf(1) });
    GMTrace.o(20507126661120L, 152790);
  }
  
  public static final void aRf()
  {
    GMTrace.i(20507260878848L, 152791);
    g.ork.i(14849, new Object[] { Integer.valueOf(2) });
    GMTrace.o(20507260878848L, 152791);
  }
  
  public static final void aRg()
  {
    GMTrace.i(20507395096576L, 152792);
    g.ork.i(14849, new Object[] { Integer.valueOf(3) });
    GMTrace.o(20507395096576L, 152792);
  }
  
  public static final void aRh()
  {
    GMTrace.i(20507529314304L, 152793);
    g.ork.i(14849, new Object[] { Integer.valueOf(4) });
    GMTrace.o(20507529314304L, 152793);
  }
  
  public static final void aRi()
  {
    GMTrace.i(20507663532032L, 152794);
    g.ork.i(14849, new Object[] { Integer.valueOf(5) });
    GMTrace.o(20507663532032L, 152794);
  }
  
  public static final void aRj()
  {
    GMTrace.i(20507797749760L, 152795);
    g.ork.i(14849, new Object[] { Integer.valueOf(6) });
    GMTrace.o(20507797749760L, 152795);
  }
  
  public static final void aRk()
  {
    GMTrace.i(20507931967488L, 152796);
    g.ork.i(14849, new Object[] { Integer.valueOf(7) });
    GMTrace.o(20507931967488L, 152796);
  }
  
  public static final void aRl()
  {
    GMTrace.i(20508066185216L, 152797);
    g.ork.i(14849, new Object[] { Integer.valueOf(8) });
    GMTrace.o(20508066185216L, 152797);
  }
  
  public static final void aRm()
  {
    GMTrace.i(20508200402944L, 152798);
    g.ork.i(14849, new Object[] { Integer.valueOf(9) });
    GMTrace.o(20508200402944L, 152798);
  }
  
  public static final void aRn()
  {
    GMTrace.i(20508334620672L, 152799);
    g.ork.i(14849, new Object[] { Integer.valueOf(10) });
    GMTrace.o(20508334620672L, 152799);
  }
  
  public static final void ag(int paramInt, String paramString)
  {
    GMTrace.i(4753186619392L, 35414);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkReceiveCall %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    g.ork.i(12723, new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(4753186619392L, 35414);
  }
  
  private static void cy(int paramInt1, int paramInt2)
  {
    GMTrace.i(4754663014400L, 35425);
    g.ork.a(220L, paramInt1, paramInt2, false);
    GMTrace.o(4754663014400L, 35425);
  }
  
  public static final void d(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4753857708032L, 35419);
    if ((paramBoolean1) && (paramBoolean2))
    {
      g.ork.i(12917, new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(1) });
      GMTrace.o(4753857708032L, 35419);
      return;
    }
    if (paramBoolean1)
    {
      g.ork.i(12917, new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(2) });
      GMTrace.o(4753857708032L, 35419);
      return;
    }
    if (paramBoolean2)
    {
      g.ork.i(12917, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(1) });
      GMTrace.o(4753857708032L, 35419);
      return;
    }
    g.ork.i(12917, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(2) });
    GMTrace.o(4753857708032L, 35419);
  }
  
  public static final void gj(boolean paramBoolean)
  {
    GMTrace.i(4754126143488L, 35421);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(3);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(220);
      localIDKey.SetKey(4);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    g.ork.b(localArrayList, false);
    GMTrace.o(4754126143488L, 35421);
  }
  
  public static final void gk(boolean paramBoolean)
  {
    GMTrace.i(4754394578944L, 35423);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(5);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(220);
      localIDKey.SetKey(6);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    g.ork.b(localArrayList, false);
    GMTrace.o(4754394578944L, 35423);
  }
  
  public static final void m(long paramLong, String paramString)
  {
    GMTrace.i(4753320837120L, 35415);
    w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMutliTalkDuration %d %s", new Object[] { Long.valueOf(paramLong), paramString });
    g.ork.i(12726, new Object[] { Long.valueOf(paramLong), paramString });
    GMTrace.o(4753320837120L, 35415);
  }
  
  public static final void n(long paramLong, String paramString)
  {
    GMTrace.i(4753589272576L, 35417);
    if (paramLong > 1000L) {}
    for (paramLong /= 1000L;; paramLong = 1L)
    {
      w.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkVideoDuration %d %s", new Object[] { Long.valueOf(paramLong), paramString });
      g.ork.i(12728, new Object[] { Long.valueOf(paramLong), paramString });
      GMTrace.o(4753589272576L, 35417);
      return;
    }
  }
  
  public static final void ra(int paramInt)
  {
    GMTrace.i(4754528796672L, 35424);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(7);
    localIDKey.SetValue(paramInt);
    localArrayList.add(localIDKey);
    localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(8);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    g.ork.b(localArrayList, false);
    GMTrace.o(4754528796672L, 35424);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */