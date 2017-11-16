package com.tencent.mm.plugin.music.a.a;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.music.a.f.c;
import com.tencent.mm.plugin.music.a.f.c.a;
import com.tencent.mm.plugin.music.a.f.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.w;

public abstract class d
  implements c
{
  ap nqD;
  protected boolean nqE;
  protected c.a nqF;
  protected b.a nqz;
  
  public d()
  {
    GMTrace.i(19520760578048L, 145441);
    this.nqz = null;
    GMTrace.o(19520760578048L, 145441);
  }
  
  public final void a(b.a parama)
  {
    GMTrace.i(20500281556992L, 152739);
    this.nqz = parama;
    GMTrace.o(20500281556992L, 152739);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(19521968537600L, 145450);
    this.nqF = parama;
    GMTrace.o(19521968537600L, 145450);
  }
  
  public final void aSH()
  {
    GMTrace.i(19520894795776L, 145442);
    GMTrace.o(19520894795776L, 145442);
  }
  
  public final boolean aSI()
  {
    GMTrace.i(19521029013504L, 145443);
    GMTrace.o(19521029013504L, 145443);
    return false;
  }
  
  public boolean aSJ()
  {
    GMTrace.i(19521163231232L, 145444);
    GMTrace.o(19521163231232L, 145444);
    return false;
  }
  
  public final com.tencent.mm.at.d aSK()
  {
    GMTrace.i(19521297448960L, 145445);
    GMTrace.o(19521297448960L, 145445);
    return null;
  }
  
  public abstract String aSL();
  
  public final void aSM()
  {
    GMTrace.i(20499610468352L, 152734);
    w.i("MicroMsg.BaseMusicPlayer", "onPrepareEvent %b", new Object[] { Boolean.valueOf(JQ()) });
    u localu = new u();
    localu.eAQ.action = 7;
    localu.eAQ.state = "canplay";
    localu.eAQ.duration = getDuration();
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    GMTrace.o(20499610468352L, 152734);
  }
  
  public final void aSN()
  {
    GMTrace.i(20499744686080L, 152735);
    w.i("MicroMsg.BaseMusicPlayer", "onStartEvent %b", new Object[] { Boolean.valueOf(JQ()) });
    u localu = new u();
    localu.eAQ.action = 0;
    localu.eAQ.state = "play";
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    if (this.nqz != null) {
      this.nqz.onStart(aSL());
    }
    GMTrace.o(20499744686080L, 152735);
  }
  
  public final void aSO()
  {
    GMTrace.i(20499878903808L, 152736);
    w.i("MicroMsg.BaseMusicPlayer", "onResumeEvent");
    u localu = new u();
    localu.eAQ.action = 1;
    localu.eAQ.state = "play";
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    if (this.nqz != null) {
      this.nqz.onStart(aSL());
    }
    GMTrace.o(20499878903808L, 152736);
  }
  
  public final void aSP()
  {
    GMTrace.i(19521565884416L, 145447);
    w.i("MicroMsg.BaseMusicPlayer", "onPauseEvent");
    u localu = new u();
    localu.eAQ.action = 2;
    localu.eAQ.state = "pause";
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    if (this.nqz != null) {
      this.nqz.DB(aSL());
    }
    GMTrace.o(19521565884416L, 145447);
  }
  
  public final void aSQ()
  {
    GMTrace.i(19521700102144L, 145448);
    w.i("MicroMsg.BaseMusicPlayer", "onStopEvent");
    u localu = new u();
    localu.eAQ.action = 3;
    localu.eAQ.state = "stop";
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    if (this.nqz != null) {
      this.nqz.xB(aSL());
    }
    GMTrace.o(19521700102144L, 145448);
  }
  
  public final void aSR()
  {
    GMTrace.i(20500013121536L, 152737);
    w.i("MicroMsg.BaseMusicPlayer", "onStopEvent");
    u localu = new u();
    localu.eAQ.action = 5;
    localu.eAQ.state = "ended";
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    if (this.nqz != null) {
      this.nqz.DC(aSL());
    }
    GMTrace.o(20500013121536L, 152737);
  }
  
  public final void aSS()
  {
    GMTrace.i(20500147339264L, 152738);
    w.i("MicroMsg.BaseMusicPlayer", "onErrorEvent");
    ro(-1);
    GMTrace.o(20500147339264L, 152738);
  }
  
  public final void ro(int paramInt)
  {
    GMTrace.i(19521834319872L, 145449);
    w.i("MicroMsg.BaseMusicPlayer", "onErrorEvent with errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    u localu = new u();
    localu.eAQ.action = 4;
    localu.eAQ.state = "error";
    localu.eAQ.errCode = h.rC(paramInt);
    localu.eAQ.eAR = h.rD(paramInt);
    localu.eAQ.eAL = aSL();
    a.vgX.a(localu, Looper.getMainLooper());
    if (this.nqz != null) {
      this.nqz.onError(aSL());
    }
    GMTrace.o(19521834319872L, 145449);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */