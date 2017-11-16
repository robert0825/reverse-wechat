package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class s
  implements com.tencent.mm.ad.e
{
  private static s gQk;
  private boolean gqR;
  private int retryTimes;
  
  public s()
  {
    GMTrace.i(12944494559232L, 96444);
    this.gqR = false;
    this.retryTimes = 3;
    GMTrace.o(12944494559232L, 96444);
  }
  
  private static void Kd()
  {
    GMTrace.i(12945165647872L, 96449);
    h.xy().xh().set(81937, Long.valueOf(bg.Pu()));
    GMTrace.o(12945165647872L, 96449);
  }
  
  public static s Kh()
  {
    GMTrace.i(12944628776960L, 96445);
    if (gQk == null) {
      gQk = new s();
    }
    s locals = gQk;
    GMTrace.o(12944628776960L, 96445);
    return locals;
  }
  
  private void release()
  {
    GMTrace.i(12944897212416L, 96447);
    this.gqR = false;
    h.xx().fYr.b(159, this);
    h.xx().fYr.b(160, this);
    GMTrace.o(12944897212416L, 96447);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12945031430144L, 96448);
    if ((!(paramk instanceof com.tencent.mm.ad.m)) || (((com.tencent.mm.ad.m)paramk).DM() != 8))
    {
      w.d("MicroMsg.RegionCodeUpdater", "another scene");
      GMTrace.o(12945031430144L, 96448);
      return;
    }
    int i = paramk.getType();
    if (i == 159)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Kd();
        paramString = t.Kj().gJ(8);
        if ((paramString == null) || (paramString.length == 0))
        {
          w.i("MicroMsg.RegionCodeUpdater", "error no pkg found.");
          release();
          GMTrace.o(12945031430144L, 96448);
          return;
        }
        paramString = paramString[0];
        w.i("MicroMsg.RegionCodeUpdater", "dkregcode Pkg id:" + paramString.id + " version:" + paramString.version + " status:" + paramString.status + " type:" + paramString.eII);
        if (5 != paramString.status)
        {
          release();
          GMTrace.o(12945031430144L, 96448);
          return;
        }
        paramString = new j(paramString.id, 8);
        h.xx().fYr.a(paramString, 0);
        GMTrace.o(12945031430144L, 96448);
        return;
      }
      paramInt1 = this.retryTimes - 1;
      this.retryTimes = paramInt1;
      if (paramInt1 <= 0)
      {
        h.xy().xh().set(81937, Long.valueOf((bg.Pv() - 604800000L + 3600000L) / 1000L));
        this.retryTimes = 3;
      }
      release();
      GMTrace.o(12945031430144L, 96448);
      return;
    }
    if (i == 160)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        Kd();
      }
      release();
    }
    GMTrace.o(12945031430144L, 96448);
  }
  
  public final void update()
  {
    GMTrace.i(12944762994688L, 96446);
    if ((!this.gqR) && (h.xy().isSDCardAvailable()))
    {
      release();
      this.gqR = true;
      h.xx().fYr.a(159, this);
      h.xx().fYr.a(160, this);
      k localk = new k(8);
      h.xx().fYr.a(localk, 0);
    }
    GMTrace.o(12944762994688L, 96446);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */