package com.tencent.mm.plugin.music.a.f;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.plugin.music.a.e;
import com.tencent.mm.plugin.music.a.f;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public abstract class a
  implements c
{
  public ap nqD;
  protected boolean nqE;
  protected c.a nqF;
  
  public a()
  {
    GMTrace.i(15019366416384L, 111903);
    GMTrace.o(15019366416384L, 111903);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(15020574375936L, 111912);
    this.nqF = parama;
    GMTrace.o(15020574375936L, 111912);
  }
  
  public final void a(apv paramapv, int paramInt)
  {
    GMTrace.i(15020440158208L, 111911);
    w.i("MicroMsg.BaseMusicPlayer", "onErrorEvent with errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    jn localjn = new jn();
    localjn.eNp.action = 4;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "error";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    localjn.eNp.errCode = h.rC(paramInt);
    localjn.eNp.eAR = h.rD(paramInt);
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.aSp();
    GMTrace.o(15020440158208L, 111911);
  }
  
  protected final void aTf()
  {
    GMTrace.i(15019500634112L, 111904);
    this.nqD = new ap();
    this.nqD.eA(ab.getContext());
    this.nqD.a(new ap.a()
    {
      public final void dR(int paramAnonymousInt)
      {
        GMTrace.i(15022856077312L, 111929);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(15022856077312L, 111929);
          return;
          if (a.this.nqE)
          {
            a.this.nqE = false;
            a.this.resume();
            GMTrace.o(15022856077312L, 111929);
            return;
            if (a.this.JQ())
            {
              a.this.nqE = true;
              a.this.pause();
            }
          }
        }
      }
    });
    GMTrace.o(15019500634112L, 111904);
  }
  
  public final void l(apv paramapv)
  {
    GMTrace.i(15019634851840L, 111905);
    w.i("MicroMsg.BaseMusicPlayer", "onStartEvent %b", new Object[] { Boolean.valueOf(JQ()) });
    jn localjn = new jn();
    localjn.eNp.action = 0;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "play";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.aSp();
    f.grT = System.currentTimeMillis();
    f.npX = com.tencent.mm.plugin.music.a.h.aSs().aSi();
    GMTrace.o(15019634851840L, 111905);
  }
  
  public final void m(apv paramapv)
  {
    GMTrace.i(15019769069568L, 111906);
    w.i("MicroMsg.BaseMusicPlayer", "onResumeEvent");
    jn localjn = new jn();
    localjn.eNp.action = 1;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "play";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.grT = System.currentTimeMillis();
    GMTrace.o(15019769069568L, 111906);
  }
  
  public final void n(apv paramapv)
  {
    GMTrace.i(15019903287296L, 111907);
    w.i("MicroMsg.BaseMusicPlayer", "onPauseEvent");
    jn localjn = new jn();
    localjn.eNp.action = 3;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "pause";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.so();
    GMTrace.o(15019903287296L, 111907);
  }
  
  public final void o(apv paramapv)
  {
    GMTrace.i(15020037505024L, 111908);
    w.i("MicroMsg.BaseMusicPlayer", "onStopEvent");
    jn localjn = new jn();
    localjn.eNp.action = 2;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "stop";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.aSp();
    GMTrace.o(15020037505024L, 111908);
  }
  
  public final void p(apv paramapv)
  {
    GMTrace.i(15020171722752L, 111909);
    w.i("MicroMsg.BaseMusicPlayer", "onSeekToEvent");
    jn localjn = new jn();
    localjn.eNp.action = 8;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "seeked";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.aSp();
    GMTrace.o(15020171722752L, 111909);
  }
  
  public final void q(apv paramapv)
  {
    GMTrace.i(15020305940480L, 111910);
    w.i("MicroMsg.BaseMusicPlayer", "onStopEvent");
    jn localjn = new jn();
    localjn.eNp.action = 7;
    localjn.eNp.eNl = paramapv;
    localjn.eNp.state = "ended";
    localjn.eNp.duration = getDuration();
    localjn.eNp.eNr = aSJ();
    com.tencent.mm.sdk.b.a.vgX.a(localjn, Looper.getMainLooper());
    f.aSp();
    if (com.tencent.mm.plugin.music.a.h.aSs().mode == 2)
    {
      paramapv = com.tencent.mm.plugin.music.a.h.aSs();
      if (paramapv.mode != 1)
      {
        paramapv.npJ += 1;
        paramapv.npJ %= paramapv.npK.size();
        paramapv.e(null);
      }
    }
    GMTrace.o(15020305940480L, 111910);
  }
  
  public final void r(apv paramapv)
  {
    GMTrace.i(18969931022336L, 141337);
    w.i("MicroMsg.BaseMusicPlayer", "onErrorEvent");
    a(paramapv, -1);
    GMTrace.o(18969931022336L, 141337);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */