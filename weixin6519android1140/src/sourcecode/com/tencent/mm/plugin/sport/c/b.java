package com.tencent.mm.plugin.sport.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.g.a.fe.a;
import com.tencent.mm.g.a.fe.b;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import java.util.Calendar;
import org.json.JSONObject;

public final class b
{
  public c qqA;
  private long qqB;
  private long qqC;
  public c<qh> qqt;
  public e qqu;
  
  public b()
  {
    GMTrace.i(16735742722048L, 124691);
    this.qqA = new c() {};
    this.qqt = new c() {};
    this.qqA.bPu();
    this.qqt.bPu();
    GMTrace.o(16735742722048L, 124691);
  }
  
  public final long bqX()
  {
    GMTrace.i(16736145375232L, 124694);
    if (this.qqC == 0L) {
      this.qqC = h.J(516, 0L);
    }
    long l = this.qqC;
    GMTrace.o(16736145375232L, 124694);
    return l;
  }
  
  public final boolean ef(long paramLong)
  {
    GMTrace.i(16736011157504L, 124693);
    if (this.qqu != null) {
      com.tencent.mm.kernel.h.wS().c(this.qqu);
    }
    long l = System.currentTimeMillis();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    w.i("MicroMsg.Sport.ExtApiStepManager", "update Api Step time: %s stepCount: %s", new Object[] { k.ax(l), Long.valueOf(paramLong) });
    this.qqu = new e("", "gh_43f2581f6fd6", (int)(localCalendar.getTimeInMillis() / 1000L), (int)(l / 1000L), (int)paramLong, ba.bUs(), 2);
    com.tencent.mm.kernel.h.wS().a(this.qqu, 0);
    this.qqB = l;
    h.K(515, l);
    this.qqC = paramLong;
    h.J(516, this.qqC);
    GMTrace.o(16736011157504L, 124693);
    return true;
  }
  
  public final boolean i(com.tencent.mm.sdk.b.b paramb)
  {
    GMTrace.i(16735876939776L, 124692);
    paramb = (fe)paramb;
    switch (paramb.eHo.action)
    {
    default: 
      GMTrace.o(16735876939776L, 124692);
      return true;
    case 3: 
      for (;;)
      {
        try
        {
          JSONObject localJSONObject1 = f.bra().optJSONObject("extStepApiConfig");
          if (localJSONObject1 != null) {
            paramb.eHp.eHt = localJSONObject1.toString();
          }
          if (!bg.nm(paramb.eHp.eHt)) {
            continue;
          }
          paramb.eHp.eHv = 3905;
        }
        catch (Exception localException)
        {
          paramb.eHp.eHv = 3905;
          continue;
        }
        paramb.eHp.eHu = true;
        break;
        paramb.eHp.eHv = 1;
      }
    }
    long l4 = paramb.eHo.eHr;
    long l5 = System.currentTimeMillis();
    long l6 = paramb.eHo.eHs;
    fe.b localb = paramb.eHp;
    int i;
    if (!k.bqR()) {
      i = 3906;
    }
    for (;;)
    {
      localb.eHv = i;
      if (paramb.eHp.eHv == 1)
      {
        if (this.qqB == 0L) {
          this.qqB = h.J(515, 0L);
        }
        boolean bool1 = k.v(this.qqB, System.currentTimeMillis());
        boolean bool2 = k.w(bqX(), l4);
        if ((bool1) && (bool2)) {
          ef(l4);
        }
      }
      paramb.eHp.eHu = true;
      break;
      if (!k.brf())
      {
        i = 3902;
      }
      else
      {
        long l3 = h.J(513, 0L);
        long l2 = h.J(512, 0L);
        w.v("MicroMsg.Sport.ExtApiStepManager", "lastUpdateTime:%d lastUpdateStep:%d newUpdateTime:%d newUpdateStep:%d", new Object[] { Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(l5), Long.valueOf(l4) });
        if (l5 - l3 < 300000L)
        {
          w.w("MicroMsg.Sport.ExtApiStepManager", "update interval must larger than 5 minute");
          i = 3903;
        }
        else
        {
          JSONObject localJSONObject2 = f.bra();
          long l1 = l3;
          if (!bg.A(l5, l3))
          {
            l1 = bg.bQR();
            l2 = 0L;
          }
          l3 = l5 - l1;
          long l7 = l3 / 300000L;
          if (l3 % 300000L > 0L) {}
          for (i = 1;; i = 0)
          {
            long l8 = l7 + i;
            l7 = localJSONObject2.optInt("stepCounterMaxStep5m") * l8;
            w.v("MicroMsg.Sport.ExtApiStepManager", "interval5m %d intervalTime %d newUpdateTime:%d compareUpdateTime:%d maxIncreaseStep:%d", new Object[] { Long.valueOf(l8), Long.valueOf(l3), Long.valueOf(l5), Long.valueOf(l1), Long.valueOf(l7) });
            l1 = l4 - l2;
            if ((l1 >= 0L) && (l1 <= l7)) {
              break label547;
            }
            w.w("MicroMsg.Sport.ExtApiStepManager", "invalid step in 5 minute actual: %d max: %d", new Object[] { Long.valueOf(l1), Long.valueOf(l7) });
            i = 3904;
            break;
          }
          label547:
          w.i("MicroMsg.Sport.ExtApiStepManager", "can update time: %s, step: %d", new Object[] { k.ax(l5), Long.valueOf(l4) });
          h.K(513, l5);
          h.K(512, l4);
          h.K(514, l6);
          i = 1;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */