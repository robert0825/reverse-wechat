package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.protocal.c.m;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.vending.g.b;

public final class d
  implements com.tencent.mm.ad.e
{
  private static int hoA;
  private static int hoB;
  private static int hoC;
  private static long hoD;
  private static long hoE;
  public String hoF;
  public String hoG;
  b how;
  
  static
  {
    GMTrace.i(5602113748992L, 41739);
    hoA = 20;
    hoB = 20;
    hoC = 20;
    hoD = 4000000L;
    hoE = 200000L;
    GMTrace.o(5602113748992L, 41739);
  }
  
  public d()
  {
    GMTrace.i(5601308442624L, 41733);
    this.hoF = "";
    this.hoG = "";
    GMTrace.o(5601308442624L, 41733);
  }
  
  private d(String paramString1, String paramString2)
  {
    GMTrace.i(5601442660352L, 41734);
    this.hoF = "";
    this.hoG = "";
    this.hoF = paramString1;
    this.hoG = paramString2;
    GMTrace.o(5601442660352L, 41734);
  }
  
  public static int PK()
  {
    GMTrace.i(5601576878080L, 41735);
    com.tencent.mm.kernel.h.xz();
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvk, Integer.valueOf(hoA))).intValue();
    GMTrace.o(5601576878080L, 41735);
    return i;
  }
  
  public static int PL()
  {
    GMTrace.i(5601711095808L, 41736);
    com.tencent.mm.kernel.h.xz();
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvm, Integer.valueOf(hoC))).intValue();
    GMTrace.o(5601711095808L, 41736);
    return i;
  }
  
  public static long PM()
  {
    GMTrace.i(5601845313536L, 41737);
    com.tencent.mm.kernel.h.xz();
    long l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvo, Long.valueOf(hoE))).longValue();
    GMTrace.o(5601845313536L, 41737);
    return l;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5601979531264L, 41738);
    w.i("MicroMsg.AAOperationData", "get AAOperation, onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((com.tencent.mm.plugin.aa.a.a.h)paramk).hpo;
      w.i("MicroMsg.AAOperationData", "get AAOperation data, retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", new Object[] { Integer.valueOf(paramString.jWs), paramString.jWt, Integer.valueOf(paramString.tMn), Integer.valueOf(paramString.tMo), Integer.valueOf(paramString.tMp), Long.valueOf(paramString.tMq), Long.valueOf(paramString.tMr), paramString.jWE, paramString.jWF });
      if (paramString.jWs == 0)
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vvk, Integer.valueOf(paramString.tMn));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vvl, Integer.valueOf(paramString.tMo));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vvm, Integer.valueOf(paramString.tMp));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vvn, Long.valueOf(paramString.tMq));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vvo, Long.valueOf(paramString.tMr));
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 33L, 1L, false);
        com.tencent.mm.vending.g.g.a(this.how, new Object[] { new d(paramString.jWF, paramString.jWE) });
        GMTrace.o(5601979531264L, 41738);
        return;
      }
      com.tencent.mm.vending.g.g.ckh().bU(Boolean.valueOf(false));
      com.tencent.mm.plugin.report.service.g.ork.a(407L, 35L, 1L, false);
      GMTrace.o(5601979531264L, 41738);
      return;
    }
    com.tencent.mm.vending.g.g.ckh().bU(Boolean.valueOf(false));
    com.tencent.mm.plugin.report.service.g.ork.a(407L, 34L, 1L, false);
    GMTrace.o(5601979531264L, 41738);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */