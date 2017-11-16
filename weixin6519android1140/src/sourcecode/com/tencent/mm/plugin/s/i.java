package com.tencent.mm.plugin.s;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
{
  Looper mVW;
  ae mVX;
  HandlerThread mVY;
  HandlerThread mVZ;
  HandlerThread mWa;
  public j mWb;
  public c mWc;
  private ae.a mWd;
  
  public i(Looper paramLooper)
  {
    this(paramLooper, (byte)0);
    GMTrace.i(12906242506752L, 96159);
    GMTrace.o(12906242506752L, 96159);
  }
  
  private i(Looper paramLooper, byte paramByte)
  {
    GMTrace.i(12906376724480L, 96160);
    this.mWd = new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12905839853568L, 96156);
        int i = paramAnonymousMessage.what;
        switch (i)
        {
        default: 
          w.w("MicroMsg.VideoPlayer", "%s it has no idea for msg %d ", new Object[] { i.this.aiJ(), Integer.valueOf(i) });
        }
        for (;;)
        {
          GMTrace.o(12905839853568L, 96156);
          return false;
          w.i("MicroMsg.VideoPlayer", "%s call prepared ", new Object[] { i.this.aiJ() });
          if (i.this.mWc != null)
          {
            i.this.mWc.Xq();
            continue;
            w.i("MicroMsg.VideoPlayer", "%s call completion ", new Object[] { i.this.aiJ() });
            if (i.this.mWc != null)
            {
              i.this.mWc.onCompletion();
              continue;
              w.i("MicroMsg.VideoPlayer", "%s call seek completion ", new Object[] { i.this.aiJ() });
              if (i.this.mWc != null)
              {
                i.this.mWc.aOx();
                continue;
                w.i("MicroMsg.VideoPlayer", "%s call video size changed size [%d, %d] degrees[%d]", new Object[] { i.this.aiJ(), Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2), Integer.valueOf(((Integer)paramAnonymousMessage.obj).intValue()) });
                if (i.this.mWc != null)
                {
                  i.this.mWc.F(paramAnonymousMessage.arg1, paramAnonymousMessage.arg2, ((Integer)paramAnonymousMessage.obj).intValue());
                  continue;
                  w.e("MicroMsg.VideoPlayer", "%s call play error [%d, %d]", new Object[] { i.this.aiJ(), Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2) });
                  if (i.this.mWc != null)
                  {
                    i.this.mWc.onError(paramAnonymousMessage.arg1, paramAnonymousMessage.arg2);
                    continue;
                    try
                    {
                      paramAnonymousMessage = i.this;
                      w.i("MicroMsg.VideoPlayer", "%s clear now.", new Object[] { paramAnonymousMessage.aiJ() });
                      paramAnonymousMessage.mVY.quit();
                      paramAnonymousMessage.mVZ.quit();
                      if (paramAnonymousMessage.mWa != null) {
                        paramAnonymousMessage.mWa.quit();
                      }
                      paramAnonymousMessage.mVX.removeMessages(1);
                      paramAnonymousMessage.mVX.removeMessages(2);
                      paramAnonymousMessage.mVX.removeMessages(3);
                      paramAnonymousMessage.mVX.removeMessages(4);
                      paramAnonymousMessage.mVX.removeMessages(5);
                      paramAnonymousMessage.mVY = null;
                      paramAnonymousMessage.mVZ = null;
                      paramAnonymousMessage.mVX = null;
                      paramAnonymousMessage.mVW = null;
                      paramAnonymousMessage.mWc = null;
                      paramAnonymousMessage.mWb = null;
                    }
                    catch (Exception paramAnonymousMessage) {}
                  }
                }
              }
            }
          }
        }
      }
    };
    this.mVY = e.cK("VideoPlayer:inner", -16);
    this.mVY.start();
    this.mVZ = e.cK("VideoPlayer:video", -16);
    this.mVZ.start();
    this.mWa = e.cK("VideoPlayer:audio", -16);
    this.mWa.start();
    this.mVW = paramLooper;
    this.mVX = new ae(this.mVW, this.mWd);
    ae localae = this.mVX;
    Looper localLooper1 = this.mVY.getLooper();
    Looper localLooper2 = this.mVZ.getLooper();
    if (this.mWa != null) {}
    for (paramLooper = this.mWa.getLooper();; paramLooper = null)
    {
      this.mWb = new j(localae, localLooper1, localLooper2, paramLooper, false);
      GMTrace.o(12906376724480L, 96160);
      return;
    }
  }
  
  public final boolean aOG()
  {
    GMTrace.i(12906913595392L, 96164);
    j localj = this.mWb;
    w.i("MicroMsg.VideoPlayerImpl", "%s player start to prepare ", new Object[] { localj.mVD.aiJ() });
    localj.mWf.obtainMessage(1).sendToTarget();
    if (localj.mWm != null) {
      localj.mWg.obtainMessage(1).sendToTarget();
    }
    GMTrace.o(12906913595392L, 96164);
    return true;
  }
  
  public final int aOH()
  {
    GMTrace.i(12907584684032L, 96169);
    j localj = this.mWb;
    int i;
    int j;
    if (localj.mVD != null)
    {
      i = (int)(localj.mVD.mVt / 1000L);
      j = (int)localj.mVD.mVr;
      if (j == -1)
      {
        j = i;
        if (i < localj.mVD.mVu / 1000L) {
          j = (int)(localj.mVD.mVu / 1000L);
        }
        w.i("MicroMsg.VideoPlayerImpl", "%s get curr play ms %d time[%d %d]", new Object[] { localj.mVD.aiJ(), Integer.valueOf(j), Long.valueOf(localj.mVD.mVt), Long.valueOf(localj.mVD.mVu) });
      }
    }
    for (;;)
    {
      GMTrace.o(12907584684032L, 96169);
      return j;
      i = j;
      break;
      j = 0;
    }
  }
  
  public final String aiJ()
  {
    GMTrace.i(12907853119488L, 96171);
    if (this.mWb != null)
    {
      String str = this.mWb.mVD.aiJ();
      GMTrace.o(12907853119488L, 96171);
      return str;
    }
    GMTrace.o(12907853119488L, 96171);
    return "has no player!";
  }
  
  public final void fT(boolean paramBoolean)
  {
    GMTrace.i(12906645159936L, 96162);
    if (this.mWb != null)
    {
      j localj = this.mWb;
      if (localj.mVD != null) {
        localj.mVD.mVy = paramBoolean;
      }
    }
    GMTrace.o(12906645159936L, 96162);
  }
  
  public final void fU(boolean paramBoolean)
  {
    GMTrace.i(18682033995776L, 139192);
    if (this.mWb != null)
    {
      j localj = this.mWb;
      if (localj.mVD != null)
      {
        w.i("MicroMsg.VideoPlayerImpl", "%s set is online video type [%b]", new Object[] { localj.mVD.aiJ(), Boolean.valueOf(paramBoolean) });
        localj.mVD.mVz = paramBoolean;
      }
    }
    GMTrace.o(18682033995776L, 139192);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(12907718901760L, 96170);
    boolean bool = d.qs(this.mWb.state);
    GMTrace.o(12907718901760L, 96170);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(12907182030848L, 96166);
    w.d("MicroMsg.VideoPlayer", "%s pause state[%d] stack %s", new Object[] { aiJ(), Integer.valueOf(this.mWb.state), bg.bQW() });
    if ((d.qv(this.mWb.state)) || (d.qt(this.mWb.state)))
    {
      w.w("MicroMsg.VideoPlayer", "%s it seek now, do not response pause event.", new Object[] { aiJ() });
      GMTrace.o(12907182030848L, 96166);
      return;
    }
    this.mWb.pause();
    GMTrace.o(12907182030848L, 96166);
  }
  
  public final void qz(int paramInt)
  {
    GMTrace.i(12907316248576L, 96167);
    this.mWb.B(paramInt, true);
    GMTrace.o(12907316248576L, 96167);
  }
  
  public final void release()
  {
    GMTrace.i(12907450466304L, 96168);
    try
    {
      this.mWb.release();
      GMTrace.o(12907450466304L, 96168);
      return;
    }
    catch (Exception localException)
    {
      GMTrace.o(12907450466304L, 96168);
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(17458370969600L, 130075);
    try
    {
      if (this.mWb != null)
      {
        j localj = this.mWb;
        if (localj.mWm != null)
        {
          w.i("MicroMsg.VideoPlayerImpl", "%s play set mute[%b]", new Object[] { localj.mVD.aiJ(), Boolean.valueOf(paramBoolean) });
          localj.mWm.setMute(paramBoolean);
        }
      }
      GMTrace.o(17458370969600L, 130075);
      return;
    }
    catch (Exception localException)
    {
      GMTrace.o(17458370969600L, 130075);
    }
  }
  
  public final void setPath(String paramString)
  {
    GMTrace.i(12906510942208L, 96161);
    w.i("MicroMsg.VideoPlayer", "%s video player set path %s", new Object[] { aiJ(), paramString });
    j localj = this.mWb;
    w.i("MicroMsg.VideoPlayerImpl", "%s set path %s", new Object[] { localj.mVD.aiJ(), paramString });
    localj.mWk.setPath(paramString);
    if (localj.mWm != null) {
      localj.mWm.setPath(paramString);
    }
    GMTrace.o(12906510942208L, 96161);
  }
  
  public final void setSurface(Surface paramSurface)
  {
    GMTrace.i(12906779377664L, 96163);
    if (paramSurface != null)
    {
      j localj = this.mWb;
      w.i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", new Object[] { localj.mVD.aiJ(), Integer.valueOf(paramSurface.hashCode()) });
      localj.mWk.mWr = paramSurface;
    }
    GMTrace.o(12906779377664L, 96163);
  }
  
  public final void start()
  {
    GMTrace.i(12907047813120L, 96165);
    w.d("MicroMsg.VideoPlayer", "%s start state[%d] stack %s", new Object[] { aiJ(), Integer.valueOf(this.mWb.state), bg.bQW() });
    if ((d.qv(this.mWb.state)) || (d.qt(this.mWb.state)))
    {
      w.w("MicroMsg.VideoPlayer", "%s it seek now, do not response start event.", new Object[] { aiJ() });
      GMTrace.o(12907047813120L, 96165);
      return;
    }
    this.mWb.start();
    GMTrace.o(12907047813120L, 96165);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */