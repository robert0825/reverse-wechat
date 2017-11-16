package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

final class f
{
  private static long vfS;
  private static long vfT;
  aj euU;
  private boolean fUo;
  boolean lcN;
  public long vfU;
  public long vfV;
  private String vfW;
  private j vfX;
  
  static
  {
    GMTrace.i(3564554420224L, 26558);
    vfS = 125829120L;
    vfT = 314572800L;
    GMTrace.o(3564554420224L, 26558);
  }
  
  public f(j paramj)
  {
    GMTrace.i(3563212242944L, 26548);
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3580257894400L, 26675);
        f.this.kA(true);
        GMTrace.o(3580257894400L, 26675);
        return true;
      }
    }, true);
    this.vfU = 0L;
    this.vfV = 0L;
    this.vfW = null;
    this.fUo = false;
    this.lcN = false;
    this.vfX = paramj;
    GMTrace.o(3563212242944L, 26548);
  }
  
  public static boolean Ru(String paramString)
  {
    GMTrace.i(3563749113856L, 26552);
    if (i.Rw(paramString) > vfS)
    {
      w.e("MicroMsg.TrafficStatistic", "overTrafficAlertLine reach traffic alert line!");
      GMTrace.o(3563749113856L, 26552);
      return true;
    }
    GMTrace.o(3563749113856L, 26552);
    return false;
  }
  
  public final void cE(String paramString, int paramInt)
  {
    GMTrace.i(3563346460672L, 26549);
    if (bg.nm(paramString))
    {
      GMTrace.o(3563346460672L, 26549);
      return;
    }
    if (!paramString.equals(this.vfW)) {
      stop();
    }
    w.i("MicroMsg.TrafficStatistic", "pack size: " + paramInt);
    w.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE before : %s", new Object[] { Long.valueOf(vfS) });
    vfS = Math.max(paramInt * 4, vfS);
    vfS = Math.min(vfT, vfS);
    w.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE after : %s", new Object[] { Long.valueOf(vfS) });
    if (!this.fUo)
    {
      if (this.vfX.mContext != null) {
        this.lcN = am.isWifi(this.vfX.mContext);
      }
      this.euU.z(30000L, 30000L);
      this.fUo = true;
      this.vfW = paramString;
    }
    GMTrace.o(3563346460672L, 26549);
  }
  
  public final void kA(boolean paramBoolean)
  {
    long l = 0L;
    GMTrace.i(3563614896128L, 26551);
    if ((paramBoolean) || (this.vfU + this.vfV >= 524288L))
    {
      if (this.vfU + this.vfV > 0L)
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        localIntent.putExtra("intent_extra_flow_stat_upstream", this.vfU);
        localIntent.putExtra("intent_extra_flow_stat_downstream", this.vfV);
        if (this.vfX.mContext != null) {
          this.lcN = am.isWifi(this.vfX.mContext);
        }
        localIntent.putExtra("intent_extra_flow_stat_is_wifi", this.lcN);
        if (this.vfX.mContext != null) {
          this.vfX.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
        }
      }
      if (!bg.nm(this.vfW)) {
        break label206;
      }
      w.e("MicroMsg.TrafficStatistic", "traffic is null!");
    }
    for (;;)
    {
      if ((l >= vfS) && (this.vfX.pUw == 2))
      {
        w.e("MicroMsg.TrafficStatistic", "checkIfTrafficAlert reach traffic alert line!");
        this.vfX.cancel();
      }
      GMTrace.o(3563614896128L, 26551);
      return;
      label206:
      l = i.p(this.vfW, this.vfU, this.vfV);
      this.vfU = 0L;
      this.vfV = 0L;
    }
  }
  
  public final void stop()
  {
    GMTrace.i(3563480678400L, 26550);
    kA(true);
    this.euU.stopTimer();
    this.fUo = false;
    GMTrace.o(3563480678400L, 26550);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */