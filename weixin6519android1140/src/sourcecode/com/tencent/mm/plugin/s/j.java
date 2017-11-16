package com.tencent.mm.plugin.s;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  public boolean jGN;
  public g mVD;
  public ae mVE;
  public long mVK;
  public long mVs;
  public ae mWf;
  public ae mWg;
  public ae mWh;
  public long mWi;
  public boolean mWj;
  public k mWk;
  public boolean mWl;
  public a mWm;
  private ae.a mWn;
  private ae.a mWo;
  private ae.a mWp;
  public int state;
  
  public j(ae paramae, Looper paramLooper1, Looper paramLooper2, Looper paramLooper3, boolean paramBoolean)
  {
    GMTrace.i(12907987337216L, 96172);
    this.mWj = false;
    this.mWl = false;
    this.mWn = new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12909597949952L, 96184);
        int i = paramAnonymousMessage.what;
        w.i("MicroMsg.VideoPlayerImpl", "%s inner callback %d %d [%d]", new Object[] { j.this.mVD.aiJ(), Integer.valueOf(i), Integer.valueOf(j.this.state), Integer.valueOf(j.this.mWk.state) });
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(12909597949952L, 96184);
          return false;
          if (j.this.state < 2) {}
          for (i = 1; i == 0; i = 0)
          {
            GMTrace.o(12909597949952L, 96184);
            return false;
          }
          boolean bool2 = d.qr(j.this.mWk.state);
          boolean bool1 = bool2;
          if (j.this.mWm != null) {
            bool1 = bool2 & d.qr(j.this.mWm.state);
          }
          if (bool1)
          {
            j.this.setState(2);
            j.this.mVE.obtainMessage(1).sendToTarget();
            continue;
            j.this.aOK();
            continue;
            if (d.qu(j.this.state))
            {
              GMTrace.o(12909597949952L, 96184);
              return false;
            }
            if ((d.qv(j.this.state)) || (d.qt(j.this.state)))
            {
              j.this.setState(9);
              j.this.mVE.obtainMessage(2).sendToTarget();
              GMTrace.o(12909597949952L, 96184);
              return false;
            }
            bool2 = d.qu(j.this.mWk.state);
            bool1 = bool2;
            if (j.this.mWm != null) {
              bool1 = bool2 & d.qu(j.this.mWm.state);
            }
            if (bool1)
            {
              j.this.setState(9);
              j.this.mVE.obtainMessage(2).sendToTarget();
              continue;
              if ((j.this.mWj) && ((j.this.jGN) || (j.this.mWl))) {
                j.this.mVE.obtainMessage(6).sendToTarget();
              }
            }
          }
        }
      }
    };
    this.mWo = new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12906108289024L, 96158);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(12906108289024L, 96158);
          return false;
          if (j.this.mWk.aOG())
          {
            j.this.mVK = j.this.mWk.mVK;
            j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
          }
          else
          {
            j.this.mVE.obtainMessage(5, -1, -1).sendToTarget();
            GMTrace.o(12906108289024L, 96158);
            return false;
            paramAnonymousMessage = j.this.mVD;
            long l = bg.aI(paramAnonymousMessage.mVv);
            if ((paramAnonymousMessage.mVv > 0L) && (l >= 30L))
            {
              w.w("MicroMsg.PlayTimeLine", "%s do some work delay 30ms!!![%d, %d]", new Object[] { paramAnonymousMessage.aiJ(), Long.valueOf(paramAnonymousMessage.mVv), Long.valueOf(l) });
              paramAnonymousMessage.mVw = 0L;
            }
            if (d.qu(j.this.mWk.state))
            {
              j.this.mWh.obtainMessage(9).sendToTarget();
              j.this.mWf.removeMessages(2);
            }
            else
            {
              int j = j.this.mWk.m(j.this.mVs, j.this.mWi);
              if (d.qr(j)) {
                j.this.mWh.obtainMessage(2).sendToTarget();
              }
              if (j == 7) {}
              for (int i = 1;; i = 0)
              {
                if (i == 0) {
                  break label356;
                }
                j.this.mWh.obtainMessage(7).sendToTarget();
                j.this.mWf.removeMessages(2);
                break;
              }
              label356:
              if (d.qw(j))
              {
                j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                j.this.mVD.mVv = bg.Pw();
              }
              else
              {
                if (j.this.state == 3) {
                  j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), j.this.mVD.mVw);
                }
                for (;;)
                {
                  j.this.mVD.mVv = bg.Pw();
                  break;
                  if (j.this.state == 5) {
                    j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                  } else if (j.this.state == 1) {
                    j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                  } else if (j.this.state == 0) {
                    j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                  } else if (j.this.state == 6) {
                    j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                  } else {
                    j.this.mWf.removeMessages(2);
                  }
                }
                j.this.qA(3);
                j.this.mWk.start();
                j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                continue;
                j.this.qA(4);
                j.this.a(j.this.mWf, SystemClock.elapsedRealtime(), 0L);
                j.this.mWk.pause();
                continue;
                j.this.mWk.release();
                j.this.mWj = true;
                j.this.mWh.obtainMessage(0).sendToTarget();
              }
            }
          }
        }
      }
    };
    this.mWp = new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12899665838080L, 96110);
        if (j.this.mWm == null)
        {
          GMTrace.o(12899665838080L, 96110);
          return false;
        }
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(12899665838080L, 96110);
          return false;
          if (!j.this.mWm.aOG()) {
            j.this.mWm = null;
          }
          j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), 0L);
          continue;
          if (d.qu(j.this.mWm.state))
          {
            j.this.mWh.obtainMessage(9).sendToTarget();
            j.this.mWg.removeMessages(2);
          }
          else
          {
            if (d.qr(j.this.mWm.m(j.this.mVs, j.this.mWi))) {
              j.this.mWh.sendMessageDelayed(j.this.mWh.obtainMessage(2), 10L);
            }
            if (j.this.state == 3)
            {
              j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), j.this.mVD.mVw);
            }
            else if (j.this.state == 5)
            {
              j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), 0L);
            }
            else if (j.this.state == 1)
            {
              j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), 0L);
            }
            else if (j.this.state == 0)
            {
              j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), 0L);
            }
            else
            {
              j.this.mWg.removeMessages(2);
              continue;
              j.this.mWm.start();
              j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), 0L);
              continue;
              j.this.a(j.this.mWg, SystemClock.elapsedRealtime(), 0L);
              j.this.mWm.pause();
              continue;
              j.this.mWm.release();
              j.this.mWl = true;
              j.this.mWh.obtainMessage(0).sendToTarget();
            }
          }
        }
      }
    };
    this.mVE = paramae;
    this.jGN = false;
    this.mVD = new g(this.jGN);
    this.mWh = new ae(paramLooper1, this.mWn);
    this.mWk = new k(this.mVD, this.mVE);
    this.mWf = new ae(paramLooper2, this.mWo);
    if (paramLooper3 != null)
    {
      this.mWm = new a(this.mVD, this.mVE);
      this.mWg = new ae(paramLooper3, this.mWp);
    }
    GMTrace.o(12907987337216L, 96172);
  }
  
  public final void B(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(12908389990400L, 96175);
    w.i("MicroMsg.VideoPlayerImpl", "%s seek to [%d] is precision[%b]", new Object[] { this.mVD.aiJ(), Integer.valueOf(paramInt), Boolean.valueOf(true) });
    this.mWk.pause();
    if (this.mWm != null) {
      this.mWm.pause();
    }
    if (paramInt >= this.mVK)
    {
      w.i("MicroMsg.VideoPlayerImpl", "seekTo %d, duration %d ", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.mVK) });
      setState(6);
      this.mWh.obtainMessage(9).sendToTarget();
      GMTrace.o(12908389990400L, 96175);
      return;
    }
    long l = this.mWk.qy(paramInt);
    if ((l >= 0L) && (l < paramInt))
    {
      paramBoolean = true;
      w.i("MicroMsg.VideoPlayerImpl", "%s can seek precision[%b] after seek [%d, %d]", new Object[] { this.mVD.aiJ(), Boolean.valueOf(paramBoolean), Long.valueOf(l), Integer.valueOf(paramInt) });
      this.mWk.setState(6);
      setState(6);
      if (!paramBoolean) {
        break label255;
      }
    }
    label255:
    for (this.mVD.mVr = paramInt;; this.mVD.mVr = l)
    {
      qA(6);
      a(this.mWf, SystemClock.elapsedRealtime(), 0L);
      GMTrace.o(12908389990400L, 96175);
      return;
      paramBoolean = false;
      break;
    }
  }
  
  public final void a(ae paramae, long paramLong1, long paramLong2)
  {
    GMTrace.i(12909061079040L, 96180);
    if (d.qu(this.state))
    {
      GMTrace.o(12909061079040L, 96180);
      return;
    }
    try
    {
      Thread localThread = paramae.getLooper().getThread();
      if (localThread != null)
      {
        boolean bool = localThread.isAlive();
        if (!bool)
        {
          GMTrace.o(12909061079040L, 96180);
          return;
        }
      }
    }
    catch (Exception localException)
    {
      paramae.removeMessages(2);
      paramLong1 = paramLong1 + paramLong2 - SystemClock.elapsedRealtime();
      if (paramLong1 <= 0L)
      {
        paramae.sendEmptyMessage(2);
        GMTrace.o(12909061079040L, 96180);
        return;
      }
      paramae.sendEmptyMessageDelayed(2, paramLong1);
      GMTrace.o(12909061079040L, 96180);
    }
  }
  
  public final void aOI()
  {
    GMTrace.i(18681899778048L, 139191);
    w.i("MicroMsg.VideoPlayerImpl", "%s reset extractor time[%d]", new Object[] { this.mVD.aiJ(), Long.valueOf(this.mVD.mVt) });
    if (this.mWk != null)
    {
      this.mWk.o(this.mVD.mVt, -1L);
      this.mWk.aOE();
      this.mWk.mVH = 0L;
    }
    GMTrace.o(18681899778048L, 139191);
  }
  
  public final void aOJ()
  {
    GMTrace.i(16173236224000L, 120500);
    if (this.mWk != null)
    {
      w.i("MicroMsg.VideoPlayerImpl", "%s player flush surface", new Object[] { this.mVD.aiJ() });
      this.mWk.setState(10);
      a(this.mWf, SystemClock.elapsedRealtime(), 0L);
    }
    GMTrace.o(16173236224000L, 120500);
  }
  
  public final void aOK()
  {
    GMTrace.i(16084652523520L, 119840);
    w.i("MicroMsg.VideoPlayerImpl", "%s seek done", new Object[] { this.mVD.aiJ() });
    this.mWk.setState(5);
    if (this.mWm != null)
    {
      this.mVD.mVu = this.mWm.qy((int)this.mVD.mVr);
      this.mWm.setState(5);
    }
    qA(7);
    setState(4);
    this.mVE.obtainMessage(3, 0, 0).sendToTarget();
    this.mVD.mVt = (this.mVD.mVr * 1000L);
    this.mVD.mVr = -1L;
    GMTrace.o(16084652523520L, 119840);
  }
  
  public final void pause()
  {
    GMTrace.i(12908255772672L, 96174);
    setState(4);
    this.mWf.obtainMessage(4).sendToTarget();
    if (this.mWm != null) {
      this.mWg.obtainMessage(4).sendToTarget();
    }
    GMTrace.o(12908255772672L, 96174);
  }
  
  public final void qA(int paramInt)
  {
    GMTrace.i(12908926861312L, 96179);
    w.i("MicroMsg.VideoPlayerImpl", "%s update positions state %d timeline[%d %d %d]", new Object[] { this.mVD.aiJ(), Integer.valueOf(paramInt), Long.valueOf(this.mVD.mVp), Long.valueOf(this.mVD.mVq), Long.valueOf(this.mVD.mVs) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.mWi = this.mVD.mVp;
      this.mVs = this.mVD.mVs;
      w.i("MicroMsg.VideoPlayerImpl", "%s update positions end state[%d] ms[%d, %d]", new Object[] { this.mVD.aiJ(), Integer.valueOf(paramInt), Long.valueOf(this.mWi), Long.valueOf(this.mVs) });
      GMTrace.o(12908926861312L, 96179);
      return;
      g localg;
      if (this.mVD.mVq > 0L)
      {
        localg = this.mVD;
        localg.mVs += this.mVD.mVq - this.mVD.mVp;
        this.mVD.mVq = 0L;
      }
      this.mVD.mVp = SystemClock.elapsedRealtime();
      continue;
      if (this.mVD.mVp <= 0L)
      {
        this.mVD.mVq = 0L;
      }
      else
      {
        this.mVD.mVq = SystemClock.elapsedRealtime();
        continue;
        this.mVD.mVs = this.mVD.mVr;
        this.mVD.mVp = SystemClock.elapsedRealtime();
        this.mVD.mVq = 0L;
        localg = this.mVD;
        this.mVD.mVu = 0L;
        localg.mVt = 0L;
        continue;
        this.mVD.mVs = this.mVD.mVr;
        localg = this.mVD;
        this.mVD.mVq = 0L;
        localg.mVp = 0L;
        localg = this.mVD;
        this.mVD.mVu = 0L;
        localg.mVt = 0L;
        continue;
        this.mVD.mVs = this.mVD.mVr;
        localg = this.mVD;
        this.mVD.mVq = 0L;
        localg.mVp = 0L;
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(12908658425856L, 96177);
    setState(9);
    this.mWh.removeMessages(2);
    this.mWh.removeMessages(9);
    this.mWf.removeMessages(1);
    this.mWf.removeMessages(2);
    this.mWf.removeMessages(3);
    this.mWf.removeMessages(4);
    this.mWf.removeMessages(6);
    this.mWf.removeCallbacksAndMessages(null);
    try
    {
      this.mWk.setState(9);
      Object localObject = this.mWk;
      w.i("MicroMsg.VideoTrackDataSource", "%s isConfigureSurface [%b]", new Object[] { ((k)localObject).aiJ(), Boolean.valueOf(((k)localObject).mWs) });
      if ((((k)localObject).mWs) && (com.tencent.mm.compatible.util.d.ev(19))) {
        this.mWk.releaseDecoder();
      }
      this.mWf.obtainMessage(7).sendToTarget();
      if (this.mWg != null)
      {
        this.mWg.removeMessages(1);
        this.mWg.removeMessages(2);
        this.mWg.removeMessages(3);
        this.mWg.removeMessages(4);
        this.mWg.removeMessages(6);
        this.mWg.obtainMessage(7).sendToTarget();
      }
      localObject = this.mVD;
      ((g)localObject).mVp = 0L;
      ((g)localObject).mVq = 0L;
      ((g)localObject).mVr = -1L;
      ((g)localObject).mVs = 0L;
      ((g)localObject).mVt = 0L;
      ((g)localObject).mVu = 0L;
      GMTrace.o(12908658425856L, 96177);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.VideoPlayerImpl", localException, "release error %s", new Object[] { localException.toString() });
      }
    }
  }
  
  protected final void setState(int paramInt)
  {
    GMTrace.i(12908792643584L, 96178);
    w.i("MicroMsg.VideoPlayerImpl", "%s set state old %d new %d stack %s", new Object[] { this.mVD.aiJ(), Integer.valueOf(this.state), Integer.valueOf(paramInt), bg.bQW() });
    this.state = paramInt;
    this.mVD.mVv = 0L;
    GMTrace.o(12908792643584L, 96178);
  }
  
  public final void start()
  {
    GMTrace.i(12908121554944L, 96173);
    setState(3);
    this.mWf.obtainMessage(3).sendToTarget();
    if (this.mWm != null) {
      this.mWg.obtainMessage(3).sendToTarget();
    }
    GMTrace.o(12908121554944L, 96173);
  }
  
  public final void stop()
  {
    GMTrace.i(12908524208128L, 96176);
    setState(8);
    GMTrace.o(12908524208128L, 96176);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */