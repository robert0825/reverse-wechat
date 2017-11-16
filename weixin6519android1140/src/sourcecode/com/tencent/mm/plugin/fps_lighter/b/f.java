package com.tencent.mm.plugin.fps_lighter.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Debug;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

@TargetApi(16)
public final class f
  extends a
  implements Choreographer.FrameCallback, ViewTreeObserver.OnDrawListener, a.a
{
  private boolean hwV;
  private Choreographer ixm;
  public boolean lmR;
  private long[] lmS;
  private long lmT;
  private com.tencent.mm.sdk.b.c<kf> lmU;
  private long lmV;
  long lmW;
  long lmX;
  private long lmY;
  private c lmg;
  private ArrayList<com.tencent.mm.plugin.fps_lighter.a.c> mListeners;
  
  f(c paramc)
  {
    GMTrace.i(5224156626944L, 38923);
    this.ixm = null;
    this.mListeners = new ArrayList();
    this.lmR = false;
    this.lmS = new long[9];
    this.lmT = 0L;
    this.lmV = 0L;
    this.lmW = 0L;
    this.lmX = 0L;
    this.lmY = 0L;
    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
      throw new IllegalThreadStateException("not in main thread");
    }
    this.lmg = paramc;
    this.ixm = Choreographer.getInstance();
    GMTrace.o(5224156626944L, 38923);
  }
  
  public final void a(com.tencent.mm.plugin.fps_lighter.a.c paramc)
  {
    GMTrace.i(16096061030400L, 119925);
    if (!this.mListeners.contains(paramc)) {
      this.mListeners.add(paramc);
    }
    GMTrace.o(16096061030400L, 119925);
  }
  
  public final void c(Application paramApplication)
  {
    GMTrace.i(5224290844672L, 38924);
    super.c(paramApplication);
    w.i("MicroMsg.FrameBeatCore", "[setUp]");
    if (!this.mListeners.contains(this)) {
      this.mListeners.add(this);
    }
    if (this.lmU == null) {
      this.lmU = new com.tencent.mm.sdk.b.c() {};
    }
    this.lmU.bPu();
    GMTrace.o(5224290844672L, 38924);
  }
  
  public final void d(Application paramApplication)
  {
    GMTrace.i(5224425062400L, 38925);
    super.d(paramApplication);
    w.i("MicroMsg.FrameBeatCore", "[setOff]");
    this.mListeners.remove(this);
    if (this.lmU != null)
    {
      this.lmU.dead();
      this.lmU = null;
    }
    this.mListeners.clear();
    this.lmg.lmH = false;
    this.ixm.removeFrameCallback(this);
    GMTrace.o(5224425062400L, 38925);
  }
  
  public final void doFrame(long paramLong)
  {
    GMTrace.i(5225096151040L, 38930);
    long l2 = Debug.threadCpuTimeNanos();
    int i = 1;
    if (!this.lmg.lmH)
    {
      w.e("MicroMsg.FrameBeatCore", "[doFrame] unEnable!");
      i = 0;
    }
    if (this.mListeners.size() <= 0)
    {
      w.e("MicroMsg.FrameBeatCore", "has not any listener!");
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        this.lmT = 0L;
        localObject = this.mListeners.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((com.tencent.mm.plugin.fps_lighter.a.c)((Iterator)localObject).next()).z(Integer.MAX_VALUE, false);
        }
        Choreographer.getInstance().removeFrameCallback(this);
      }
      if (i == 0)
      {
        GMTrace.o(5225096151040L, 38930);
        return;
      }
      Object localObject = this.lmg;
      String str = this.lmg.lmL;
      label154:
      long l3;
      long l4;
      if (bg.nm(str))
      {
        w.i("MicroMsg.FPSConfig", "null == activityName");
        i = -1;
        l3 = Debug.threadCpuTimeNanos();
        l4 = System.nanoTime();
        if ((this.lmX == 0L) || (this.lmW == 0L)) {
          break label524;
        }
      }
      label524:
      for (long l1 = Math.round((float)(l3 - this.lmX) * 1.0F / (float)(l4 - this.lmW) * 100.0F);; l1 = 0L)
      {
        this.lmX = l3;
        this.lmW = l4;
        l3 = this.lmT;
        int j;
        if ((0L != this.lmT) && (i != -1) && (this.hwV))
        {
          j = com.tencent.mm.plugin.fps_lighter.e.a.b(paramLong - l3, this.lmg.lmC);
          localObject = this.mListeners.iterator();
        }
        for (;;)
        {
          if (((Iterator)localObject).hasNext())
          {
            ((com.tencent.mm.plugin.fps_lighter.a.c)((Iterator)localObject).next()).a(i, this.lmT / 1000000L, paramLong / 1000000L, j, (int)l1, this.lmR, this.lmV / 1000000L, this.hwV);
            continue;
            if (c.lmJ.containsKey(str))
            {
              localObject = (Integer)c.lmJ.get(str);
              if (localObject != null)
              {
                i = ((Integer)localObject).intValue();
                break label154;
              }
              i = -1;
              break label154;
            }
            if ((!c.lmJ.containsKey(((c)localObject).lmK)) || (!((c)localObject).lmL.equalsIgnoreCase("LauncherUI"))) {
              break;
            }
            localObject = (Integer)c.lmJ.get(((c)localObject).lmK);
            if (localObject != null)
            {
              i = ((Integer)localObject).intValue();
              break label154;
            }
            i = -1;
            break label154;
            localObject = this.mListeners.iterator();
            while (((Iterator)localObject).hasNext()) {
              ((com.tencent.mm.plugin.fps_lighter.a.c)((Iterator)localObject).next()).z(-1, false);
            }
          }
        }
        this.lmR = false;
        this.hwV = false;
        this.lmT = paramLong;
        this.ixm.postFrameCallback(this);
        this.lmV = (Debug.threadCpuTimeNanos() - l2);
        GMTrace.o(5225096151040L, 38930);
        return;
      }
    }
  }
  
  public final void onDraw()
  {
    GMTrace.i(16096195248128L, 119926);
    this.hwV = true;
    GMTrace.o(16096195248128L, 119926);
  }
  
  public final void p(Activity paramActivity)
  {
    GMTrace.i(5224559280128L, 38926);
    w.i("MicroMsg.FrameBeatCore", "[onBecameForeground]:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    paramActivity = this.lmg;
    if (paramActivity.lmM != 0) {
      if (paramActivity.lmM == 100) {
        paramActivity.lmH = true;
      }
    }
    for (;;)
    {
      if (paramActivity.lmH == true) {
        w.i("MicroMsg.FPSConfig", "you are so lucky! rand:%s", new Object[] { Integer.valueOf(paramActivity.lmM) });
      }
      boolean bool = paramActivity.lmH;
      if (!this.lmg.lmH) {
        break label192;
      }
      paramActivity = this.mListeners.iterator();
      while (paramActivity.hasNext()) {
        ((com.tencent.mm.plugin.fps_lighter.a.c)paramActivity.next()).z(Integer.MAX_VALUE, true);
      }
      if (1 == new Random().nextInt(100 / paramActivity.lmM)) {
        paramActivity.lmH = true;
      } else {
        paramActivity.lmH = false;
      }
    }
    this.ixm.removeFrameCallback(this);
    this.ixm.postFrameCallback(this);
    label192:
    GMTrace.o(5224559280128L, 38926);
  }
  
  public final void q(Activity paramActivity)
  {
    GMTrace.i(5224693497856L, 38927);
    w.i("MicroMsg.FrameBeatCore", "[onBecameBackground]:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    this.lmg.lmH = false;
    paramActivity = this.mListeners.iterator();
    while (paramActivity.hasNext()) {
      ((com.tencent.mm.plugin.fps_lighter.a.c)paramActivity.next()).z(Integer.MAX_VALUE, false);
    }
    GMTrace.o(5224693497856L, 38927);
  }
  
  public final void r(Activity paramActivity)
  {
    GMTrace.i(5224827715584L, 38928);
    w.i("MicroMsg.FrameBeatCore", "[onBegin]:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    this.lmg.t(paramActivity);
    this.lmR = true;
    GMTrace.o(5224827715584L, 38928);
  }
  
  public final void s(final Activity paramActivity)
  {
    GMTrace.i(5224961933312L, 38929);
    w.i("MicroMsg.FrameBeatCore", "[onChangeActivity] now Activity:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    this.lmg.t(paramActivity);
    paramActivity.getWindow().getDecorView().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16648903852032L, 124044);
        paramActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(f.this);
        paramActivity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(f.this);
        GMTrace.o(16648903852032L, 124044);
      }
    });
    GMTrace.o(5224961933312L, 38929);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */