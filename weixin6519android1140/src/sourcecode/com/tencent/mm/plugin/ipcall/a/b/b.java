package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.ui.j;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;

public final class b
  implements e.a, d.a, HeadsetPlugReceiver.a
{
  public MMActivity ezR;
  public com.tencent.mm.compatible.util.b hez;
  public boolean mkA;
  public long mkB;
  public a mks;
  public c mkt;
  public d mku;
  public HeadsetPlugReceiver mkv;
  public j mkw;
  private boolean mkx;
  public a mky;
  public boolean mkz;
  
  public b()
  {
    GMTrace.i(11604330545152L, 86459);
    this.mkx = false;
    this.mkz = false;
    this.mkA = false;
    this.mkB = 0L;
    this.mks = new a();
    this.mkt = new c();
    this.mku = new d();
    this.hez = new com.tencent.mm.compatible.util.b(ab.getContext());
    this.mkv = new HeadsetPlugReceiver();
    GMTrace.o(11604330545152L, 86459);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(11604464762880L, 86460);
    this.mkw = paramj;
    if (paramj != null) {
      i.aIt().aHP();
    }
    GMTrace.o(11604464762880L, 86460);
  }
  
  public final void aIH()
  {
    GMTrace.i(11604598980608L, 86461);
    c localc = this.mkt;
    if (localc.isStart)
    {
      w.d("MicroMsg.IPCallRecorder", "startRecorder, already start");
      GMTrace.o(11604598980608L, 86461);
      return;
    }
    w.i("MicroMsg.IPCallRecorder", "start record");
    localc.isStart = true;
    localc.mkE = i.aIr().mks.mko;
    if (localc.mkE <= 10)
    {
      if (localc.mkE <= 0)
      {
        w.e("MicroMsg.IPCallRecorder", "playDelayInMs<=0");
        i.aIq().aIP();
      }
      localc.mkE = 92;
    }
    synchronized (localc.mkD)
    {
      com.tencent.mm.sdk.f.e.post(new c.2(localc), "IPCallRecorder_startRecord");
      GMTrace.o(11604598980608L, 86461);
      return;
    }
  }
  
  public final int aII()
  {
    GMTrace.i(11605270069248L, 86466);
    a locala = this.mks;
    if ((locala.mkm != null) && (locala.isStart))
    {
      int i = locala.mkm.btE();
      GMTrace.o(11605270069248L, 86466);
      return i;
    }
    GMTrace.o(11605270069248L, 86466);
    return -1;
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(11605001633792L, 86464);
    w.i("MicroMsg.IPCallDeviceManager", "onAudioStatChange, status: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11605001633792L, 86464);
      return;
      at.AS().sf();
      if ((at.AS().sh()) && (this.mky != null))
      {
        this.mky.fq(true);
        GMTrace.o(11605001633792L, 86464);
        return;
        this.mkz = true;
        if ((this.mky != null) && (!this.mkA))
        {
          this.mky.fr(true);
          GMTrace.o(11605001633792L, 86464);
          return;
          this.mkz = false;
          if ((this.mky != null) && (!this.mkA)) {
            this.mky.fr(false);
          }
        }
      }
    }
  }
  
  public final void fn(boolean paramBoolean)
  {
    GMTrace.i(11604733198336L, 86462);
    this.mks.fn(paramBoolean);
    GMTrace.o(11604733198336L, 86462);
  }
  
  public final void fo(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(11604867416064L, 86463);
    w.i("MicroMsg.IPCallDeviceManager", "onScreenDistanceChange, isClose: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    MMActivity localMMActivity;
    if (this.ezR != null)
    {
      localMMActivity = this.ezR;
      if (paramBoolean) {
        break label86;
      }
    }
    for (;;)
    {
      localMMActivity.dp(bool);
      if (!i.aIs().aIj()) {
        break label102;
      }
      if (!paramBoolean) {
        break;
      }
      this.mkx = a.sm();
      this.mks.fn(false);
      GMTrace.o(11604867416064L, 86463);
      return;
      label86:
      bool = false;
    }
    this.mks.fn(this.mkx);
    label102:
    GMTrace.o(11604867416064L, 86463);
  }
  
  public final void fp(boolean paramBoolean)
  {
    GMTrace.i(11605135851520L, 86465);
    w.i("MicroMsg.IPCallDeviceManager", "onHeadsetState, on: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.mky != null) && (paramBoolean != this.mkA))
    {
      this.mkA = paramBoolean;
      if (!this.mkz) {
        this.mky.fq(paramBoolean);
      }
    }
    GMTrace.o(11605135851520L, 86465);
  }
  
  public static abstract interface a
  {
    public abstract void fq(boolean paramBoolean);
    
    public abstract void fr(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */