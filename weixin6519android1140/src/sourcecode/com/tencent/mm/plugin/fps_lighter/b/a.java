package com.tencent.mm.plugin.fps_lighter.b;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

class a
  implements Application.ActivityLifecycleCallbacks
{
  public boolean kmw;
  public boolean lmt;
  private Activity lmu;
  private Runnable lmv;
  public ArrayList<a> mListeners;
  private Handler mMainHandler;
  
  a()
  {
    GMTrace.i(5229793771520L, 38965);
    this.mListeners = new ArrayList();
    this.mMainHandler = new Handler(Looper.getMainLooper());
    GMTrace.o(5229793771520L, 38965);
  }
  
  public void c(Application paramApplication)
  {
    GMTrace.i(5229927989248L, 38966);
    paramApplication.registerActivityLifecycleCallbacks(this);
    GMTrace.o(5229927989248L, 38966);
  }
  
  public void d(Application paramApplication)
  {
    GMTrace.i(5230062206976L, 38967);
    paramApplication.unregisterActivityLifecycleCallbacks(this);
    this.mListeners.clear();
    GMTrace.o(5230062206976L, 38967);
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(5230464860160L, 38970);
    w.i("MicroMsg.BaseFrameBeatCore", "Activity:%s", new Object[] { paramActivity.getClass().getSimpleName() });
    this.lmu = paramActivity;
    paramBundle = this.mListeners.iterator();
    while (paramBundle.hasNext())
    {
      a locala = (a)paramBundle.next();
      try
      {
        locala.r(paramActivity);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.BaseFrameBeatCore", "Listener threw exception!", new Object[] { localException });
      }
    }
    GMTrace.o(5230464860160L, 38970);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    GMTrace.i(5231001731072L, 38974);
    GMTrace.o(5231001731072L, 38974);
  }
  
  public void onActivityPaused(final Activity paramActivity)
  {
    GMTrace.i(5230330642432L, 38969);
    w.i("MicroMsg.BaseFrameBeatCore", "[onActivityPaused] foreground:%s", new Object[] { Boolean.valueOf(this.kmw) });
    this.lmt = true;
    if (this.lmv != null) {
      this.mMainHandler.removeCallbacks(this.lmv);
    }
    Handler localHandler = this.mMainHandler;
    paramActivity = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5223217102848L, 38916);
        if ((a.this.kmw) && (a.this.lmt))
        {
          a.this.kmw = false;
          w.i("MicroMsg.BaseFrameBeatCore", "went background");
          Iterator localIterator = a.this.mListeners.iterator();
          while (localIterator.hasNext())
          {
            a.a locala = (a.a)localIterator.next();
            try
            {
              locala.q(paramActivity);
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.BaseFrameBeatCore", "Listener threw exception!", new Object[] { localException });
            }
          }
          GMTrace.o(5223217102848L, 38916);
          return;
        }
        w.i("MicroMsg.BaseFrameBeatCore", "still foreground");
        GMTrace.o(5223217102848L, 38916);
      }
    };
    this.lmv = paramActivity;
    localHandler.postDelayed(paramActivity, 600L);
    GMTrace.o(5230330642432L, 38969);
  }
  
  public void onActivityResumed(final Activity paramActivity)
  {
    GMTrace.i(5230196424704L, 38968);
    this.lmt = false;
    w.i("MicroMsg.BaseFrameBeatCore", "[onActivityResumed] foreground:%s", new Object[] { Boolean.valueOf(this.kmw) });
    if (!this.kmw) {}
    for (final boolean bool = true;; bool = false)
    {
      this.kmw = true;
      if (paramActivity == this.lmu) {
        break label126;
      }
      localObject = this.mListeners.iterator();
      while (((Iterator)localObject).hasNext())
      {
        a locala = (a)((Iterator)localObject).next();
        try
        {
          locala.s(paramActivity);
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.BaseFrameBeatCore", "Listener threw exception!", new Object[] { localException });
        }
      }
    }
    this.lmu = paramActivity;
    label126:
    Object localObject = this.mMainHandler;
    paramActivity = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5222948667392L, 38914);
        if (bool)
        {
          w.i("MicroMsg.BaseFrameBeatCore", "went foreground");
          Iterator localIterator = a.this.mListeners.iterator();
          while (localIterator.hasNext())
          {
            a.a locala = (a.a)localIterator.next();
            try
            {
              locala.p(paramActivity);
            }
            catch (Exception localException)
            {
              w.e("MicroMsg.BaseFrameBeatCore", "Listener threw exception!", new Object[] { localException });
            }
          }
          GMTrace.o(5222948667392L, 38914);
          return;
        }
        w.i("MicroMsg.BaseFrameBeatCore", "still foreground");
        GMTrace.o(5222948667392L, 38914);
      }
    };
    this.lmv = paramActivity;
    ((Handler)localObject).postDelayed(paramActivity, 600L);
    GMTrace.o(5230196424704L, 38968);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(5230867513344L, 38973);
    GMTrace.o(5230867513344L, 38973);
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    GMTrace.i(5230599077888L, 38971);
    GMTrace.o(5230599077888L, 38971);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    GMTrace.i(5230733295616L, 38972);
    GMTrace.o(5230733295616L, 38972);
  }
  
  protected static abstract interface a
  {
    public abstract void p(Activity paramActivity);
    
    public abstract void q(Activity paramActivity);
    
    public abstract void r(Activity paramActivity);
    
    public abstract void s(Activity paramActivity);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */