package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.task.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class m
  extends FrameLayout
{
  private String hyD;
  com.tencent.mm.plugin.appbrand.e hzM;
  public a iuA;
  public LinkedList<k> iuv;
  private LinkedList<k> iuw;
  private AppBrandPageView iux;
  public n iuy;
  private boolean iuz;
  
  public m(Context paramContext, com.tencent.mm.plugin.appbrand.e parame)
  {
    super(paramContext);
    GMTrace.i(15455708250112L, 115154);
    this.iuv = new LinkedList();
    this.iuw = new LinkedList();
    this.iuz = false;
    this.hzM = parame;
    this.hyD = parame.hyD;
    this.iuy = new n(this.hzM);
    GMTrace.o(15455708250112L, 115154);
  }
  
  private void a(Animator paramAnimator, final Runnable paramRunnable)
  {
    GMTrace.i(10227122438144L, 76198);
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(20351970967552L, 151634);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(20351970967552L, 151634);
      }
    });
    paramAnimator.start();
    GMTrace.o(10227122438144L, 76198);
  }
  
  private void a(k paramk)
  {
    GMTrace.i(10226451349504L, 76193);
    paramk.setVisibility(8);
    paramk.Zg();
    removeView(paramk);
    paramk.cleanup();
    GMTrace.o(10226451349504L, 76193);
  }
  
  private void a(k paramk1, k paramk2)
  {
    GMTrace.i(10225914478592L, 76189);
    Iterator localIterator = this.iuv.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      if (localk == paramk1)
      {
        i = 1;
      }
      else
      {
        if (localk == paramk2) {
          break;
        }
        if (i != 0)
        {
          a(localk);
          localIterator.remove();
        }
      }
    }
    GMTrace.o(10225914478592L, 76189);
  }
  
  private void a(final k paramk1, final k paramk2, z paramz)
  {
    GMTrace.i(10226048696320L, 76190);
    this.iuv.remove(paramk2);
    if (!paramk2.iur)
    {
      Runnable local5 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10235980808192L, 76264);
          m.b(m.this, paramk2);
          GMTrace.o(10235980808192L, 76264);
        }
      };
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(paramk2, "translationX", new float[] { 0.0F, paramk2.getWidth() });
      localObjectAnimator.setDuration(250L);
      a(localObjectAnimator, local5);
    }
    for (;;)
    {
      w.i("MicroMsg.AppBrandPageContainer", "switchPageClear, in: %s out: %s", new Object[] { paramk1.Zi(), paramk2.Zi() });
      paramk1.a(paramz);
      paramk1.Ze();
      if (paramk2.iur) {
        break;
      }
      paramk2 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10268864151552L, 76509);
          paramk1.Zn();
          GMTrace.o(10268864151552L, 76509);
        }
      };
      paramk1 = ObjectAnimator.ofFloat(paramk1, "translationX", new float[] { -(paramk1.getWidth() * 0.25F), 0.0F });
      paramk1.setDuration(250L);
      a(paramk1, paramk2);
      GMTrace.o(10226048696320L, 76190);
      return;
      a(paramk2);
    }
    paramk1.Zn();
    GMTrace.o(10226048696320L, 76190);
  }
  
  private void a(final k paramk, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(17293685817344L, 128848);
        if (paramk == null)
        {
          GMTrace.o(17293685817344L, 128848);
          return;
        }
        this.iuv.remove(paramk);
        this.iuv.push(paramk);
        this.iuw.remove(paramk);
        paramk.bringToFront();
        requestLayout();
        invalidate();
        paramk.Ze();
        Runnable local8 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16180483981312L, 120554);
            m.this.Zu();
            paramk.Zn();
            GMTrace.o(16180483981312L, 120554);
          }
        };
        if (paramBoolean)
        {
          paramk = ObjectAnimator.ofFloat(paramk, "translationX", new float[] { paramk.getWidth(), 0.0F });
          paramk.setDuration(250L);
          a(paramk, local8);
          GMTrace.o(17293685817344L, 128848);
          continue;
        }
        local8.run();
      }
      finally {}
      GMTrace.o(17293685817344L, 128848);
    }
  }
  
  private void b(final String paramString, final z paramz)
  {
    GMTrace.i(10225511825408L, 76186);
    w.d("MicroMsg.AppBrandPageContainer", "navigateToNext: %s, Staging Count: %d", new Object[] { paramString, Integer.valueOf(this.iuw.size()) });
    boolean bool;
    final Object localObject;
    label67:
    final boolean[] arrayOfBoolean;
    final Runnable local2;
    if (paramz == z.iwO)
    {
      bool = true;
      if (!bool) {
        break label276;
      }
      localObject = new e(getContext(), this);
      this.iuw.push(localObject);
      addView((View)localObject, 0);
      arrayOfBoolean = new boolean[1];
      arrayOfBoolean[0] = false;
      local2 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20352239403008L, 151636);
          arrayOfBoolean[0] = true;
          if (m.this.getPageCount() == 0)
          {
            GMTrace.o(20352239403008L, 151636);
            return;
          }
          if (m.a(m.this).isEmpty()) {}
          for (k localk = null;; localk = (k)m.a(m.this).getFirst())
          {
            if ((paramz == z.iwO) || (paramz == z.iwM) || (paramz == z.iwN)) {
              m.a(m.this, localk);
            }
            boolean bool1 = m.b(paramz);
            boolean bool2 = m.c(paramz);
            m.a(m.this, localk, bool1, bool2);
            m.a(m.this, localObject, bool1);
            if (localk != null) {
              m.b(m.this).b(localk.Zh(), paramString);
            }
            m.b(m.this).d(localObject.Zh());
            GMTrace.o(20352239403008L, 151636);
            return;
          }
        }
      };
      if (this.iuv.size() != 0) {
        break label293;
      }
      postDelayed(local2, 5000L);
    }
    for (;;)
    {
      final long l = System.currentTimeMillis();
      ((k)localObject).Zh().a(new AppBrandPageView.e()
      {
        public final void onReady()
        {
          int j = 2;
          GMTrace.i(20352507838464L, 151638);
          localObject.Zh().b(this);
          if (arrayOfBoolean[0] == 0)
          {
            m.this.removeCallbacks(local2);
            m.this.post(local2);
          }
          m.c(m.this);
          long l = System.currentTimeMillis() - l;
          n localn = m.b(m.this);
          z localz = this.iuD;
          int i;
          switch (n.4.iuY[localz.ordinal()])
          {
          default: 
            i = 2;
            localn.g(l, i);
            g.ork.a(390L, 0L, 1L, false);
            i = j;
            switch ((int)l / 250)
            {
            default: 
              i = 7;
            }
            break;
          }
          for (;;)
          {
            g.ork.a(390L, i, 1L, false);
            w.i("MicroMsg.AppBrandPageContainer", "onReady received, time: %d", new Object[] { Long.valueOf(l) });
            GMTrace.o(20352507838464L, 151638);
            return;
            i = 1;
            break;
            i = 3;
            break;
            i = 1;
            continue;
            i = 3;
            continue;
            i = 4;
            continue;
            i = 5;
            continue;
            i = 6;
          }
        }
      });
      ((k)localObject).loadUrl(paramString);
      ((k)localObject).a(paramz);
      GMTrace.o(10225511825408L, 76186);
      return;
      if ((paramz == z.iwM) || (paramz == z.iwN))
      {
        bool = this.hzM.hyH.hPA.pf(paramString);
        break;
      }
      int j = this.iuv.size();
      if (paramz == z.iwL) {}
      for (int i = 1;; i = 0)
      {
        if ((!this.hzM.hyH.hPA.pf(paramString)) || (j + 1 - i != 1)) {
          break label270;
        }
        bool = true;
        break;
      }
      label270:
      bool = false;
      break;
      label276:
      localObject = new s(getContext(), this);
      break label67;
      label293:
      postDelayed(local2, 500L);
    }
  }
  
  private void rK(final String paramString)
  {
    GMTrace.i(10225646043136L, 76187);
    final AppBrandPageView[] arrayOfAppBrandPageView = new AppBrandPageView[1];
    final Object localObject = new k[1];
    AppBrandPageView.b local4 = new AppBrandPageView.b()
    {
      public final void Wb()
      {
        GMTrace.i(20351031443456L, 151627);
        arrayOfAppBrandPageView[0].b(this);
        if (!bg.nm(arrayOfAppBrandPageView[0].ivj.hZo)) {
          m.b(m.this).b(arrayOfAppBrandPageView[0], paramString);
        }
        m.b(m.this).d(localObject[0].Zh());
        GMTrace.o(20351031443456L, 151627);
      }
    };
    k localk = rL(paramString);
    localObject[0] = localk;
    if (localk != null)
    {
      localObject = localk.Zh();
      arrayOfAppBrandPageView[0] = localObject;
      ((AppBrandPageView)localObject).a(local4);
      localk.loadUrl(paramString);
      localk.a(z.iwO);
      localk.Zn();
      GMTrace.o(10225646043136L, 76187);
      return;
    }
    localk = rM(paramString);
    localObject[0] = localk;
    if (localk != null)
    {
      localObject = localk.Zh();
      arrayOfAppBrandPageView[0] = localObject;
      ((AppBrandPageView)localObject).a(local4);
      localk.loadUrl(paramString);
      paramString = (k)this.iuv.getFirst();
      a(paramString, localk);
      a(localk, paramString, z.iwO);
    }
    GMTrace.o(10225646043136L, 76187);
  }
  
  private k rL(String paramString)
  {
    GMTrace.i(10226182914048L, 76191);
    if (this.iuv.size() == 0)
    {
      GMTrace.o(10226182914048L, 76191);
      return null;
    }
    if (((this.iuv.getFirst() instanceof e)) && (((k)this.iuv.getFirst()).rF(paramString)))
    {
      paramString = (k)this.iuv.getFirst();
      GMTrace.o(10226182914048L, 76191);
      return paramString;
    }
    GMTrace.o(10226182914048L, 76191);
    return null;
  }
  
  private k rM(String paramString)
  {
    GMTrace.i(10226317131776L, 76192);
    if (this.iuv.size() < 2)
    {
      GMTrace.o(10226317131776L, 76192);
      return null;
    }
    int i = 1;
    while (i < this.iuv.size())
    {
      if (((this.iuv.get(i) instanceof e)) && (((k)this.iuv.get(i)).rF(paramString)))
      {
        paramString = (k)this.iuv.get(i);
        GMTrace.o(10226317131776L, 76192);
        return paramString;
      }
      i += 1;
    }
    GMTrace.o(10226317131776L, 76192);
    return null;
  }
  
  public final void P(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(17293551599616L, 128847);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10224572301312L, 76179);
        m localm = m.this;
        String str = paramString;
        if (paramBoolean) {}
        for (z localz = z.iwN;; localz = z.iwM)
        {
          m.a(localm, str, localz);
          GMTrace.o(10224572301312L, 76179);
          return;
        }
      }
    });
    GMTrace.o(17293551599616L, 128847);
  }
  
  /* Error */
  public final String Zi()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 595
    //   5: ldc_w 597
    //   8: invokestatic 75	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: invokevirtual 601	com/tencent/mm/plugin/appbrand/page/m:Zs	()Lcom/tencent/mm/plugin/appbrand/page/k;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +21 -> 38
    //   20: aload_1
    //   21: invokevirtual 216	com/tencent/mm/plugin/appbrand/page/k:Zi	()Ljava/lang/String;
    //   24: astore_1
    //   25: ldc2_w 595
    //   28: ldc_w 597
    //   31: invokestatic 103	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: areturn
    //   38: aconst_null
    //   39: astore_1
    //   40: ldc2_w 595
    //   43: ldc_w 597
    //   46: invokestatic 103	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   49: goto -15 -> 34
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	m
    //   15	25	1	localObject1	Object
    //   52	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	52	finally
    //   20	34	52	finally
    //   40	49	52	finally
  }
  
  public final void Zr()
  {
    GMTrace.i(10225243389952L, 76184);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10236517679104L, 76268);
        m.this.jg(1);
        GMTrace.o(10236517679104L, 76268);
      }
    });
    GMTrace.o(10225243389952L, 76184);
  }
  
  /* Error */
  public final k Zs()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 610
    //   5: ldc_w 612
    //   8: invokestatic 75	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 84	com/tencent/mm/plugin/appbrand/page/m:iuw	Ljava/util/LinkedList;
    //   15: invokevirtual 615	java/util/LinkedList:isEmpty	()Z
    //   18: ifne +27 -> 45
    //   21: aload_0
    //   22: getfield 84	com/tencent/mm/plugin/appbrand/page/m:iuw	Ljava/util/LinkedList;
    //   25: invokevirtual 301	java/util/LinkedList:getFirst	()Ljava/lang/Object;
    //   28: checkcast 136	com/tencent/mm/plugin/appbrand/page/k
    //   31: astore_1
    //   32: ldc2_w 610
    //   35: ldc_w 612
    //   38: invokestatic 103	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield 82	com/tencent/mm/plugin/appbrand/page/m:iuv	Ljava/util/LinkedList;
    //   49: invokevirtual 301	java/util/LinkedList:getFirst	()Ljava/lang/Object;
    //   52: checkcast 136	com/tencent/mm/plugin/appbrand/page/k
    //   55: astore_1
    //   56: ldc2_w 610
    //   59: ldc_w 612
    //   62: invokestatic 103	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: goto -24 -> 41
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: ldc -48
    //   76: aload_1
    //   77: invokevirtual 618	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   80: invokestatic 621	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: aconst_null
    //   84: astore_1
    //   85: goto -29 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	m
    //   31	25	1	localk	k
    //   68	4	1	localObject1	Object
    //   73	4	1	localException	Exception
    //   84	1	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	41	68	finally
    //   45	56	68	finally
    //   56	65	68	finally
    //   74	83	68	finally
    //   45	56	73	java/lang/Exception
  }
  
  public final AppBrandPageView Zt()
  {
    GMTrace.i(10226854002688L, 76196);
    if (this.iux == null) {
      if ((!this.hzM.hyH.hPC) && (c.aaq())) {
        break label120;
      }
    }
    label120:
    for (AppBrandPageView localAppBrandPageView1 = c.sh(this.hzM.hyD);; localAppBrandPageView1 = null)
    {
      AppBrandPageView localAppBrandPageView2 = localAppBrandPageView1;
      if (localAppBrandPageView1 == null) {
        localAppBrandPageView2 = new AppBrandPageView();
      }
      localAppBrandPageView2.a(getContext(), this.hzM);
      GMTrace.o(10226854002688L, 76196);
      return localAppBrandPageView2;
      localAppBrandPageView1 = this.iux;
      this.iux = null;
      localAppBrandPageView1.iuf.setVisibility(0);
      removeView(localAppBrandPageView1.iuf);
      GMTrace.o(10226854002688L, 76196);
      return localAppBrandPageView1;
    }
  }
  
  public final void Zu()
  {
    GMTrace.i(10226988220416L, 76197);
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20350763008000L, 151625);
        if (m.d(m.this) != null)
        {
          GMTrace.o(20350763008000L, 151625);
          return;
        }
        long l = System.currentTimeMillis();
        AppBrandPageView localAppBrandPageView = new AppBrandPageView();
        localAppBrandPageView.a(m.this.getContext(), m.e(m.this));
        localAppBrandPageView.iuf.setVisibility(4);
        m.this.addView(localAppBrandPageView.iuf, 0);
        m.a(m.this, localAppBrandPageView);
        w.i("MicroMsg.AppBrandPageContainer", "preloadNextPageView: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(20350763008000L, 151625);
      }
    }, 200L);
    GMTrace.o(10226988220416L, 76197);
  }
  
  public final void c(final String paramString1, final String paramString2, final int[] paramArrayOfInt)
  {
    GMTrace.i(17293820035072L, 128849);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16280744624128L, 121301);
        m.a(m.this, paramString1, paramString2, paramArrayOfInt);
        GMTrace.o(16280744624128L, 121301);
      }
    });
    GMTrace.o(17293820035072L, 128849);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10226719784960L, 76195);
    Object localObject = this.iuy;
    k localk = Zs();
    if ((localk == null) || (((n)localObject).iuq)) {}
    for (;;)
    {
      localObject = this.iuv.iterator();
      while (((Iterator)localObject).hasNext())
      {
        localk = (k)((Iterator)localObject).next();
        localk.Zg();
        localk.cleanup();
      }
      ((n)localObject).b(localk);
    }
    localObject = this.iuw.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localk = (k)((Iterator)localObject).next();
      localk.Zg();
      localk.cleanup();
    }
    if (this.iux != null) {
      this.iux.cleanup();
    }
    this.iuv.clear();
    this.iuw.clear();
    GMTrace.o(10226719784960L, 76195);
  }
  
  public final int getPageCount()
  {
    GMTrace.i(17293417381888L, 128846);
    int i = this.iuv.size();
    int j = this.iuw.size();
    GMTrace.o(17293417381888L, 128846);
    return i + j;
  }
  
  public final void jg(final int paramInt)
  {
    GMTrace.i(10225377607680L, 76185);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10217592979456L, 76127);
        m.a(m.this, paramInt);
        GMTrace.o(10217592979456L, 76127);
      }
    });
    GMTrace.o(10225377607680L, 76185);
  }
  
  public final void rI(final String paramString)
  {
    GMTrace.i(15455842467840L, 115155);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10240141557760L, 76295);
        m.a(m.this, paramString, z.iwL);
        GMTrace.o(10240141557760L, 76295);
      }
    });
    GMTrace.o(15455842467840L, 115155);
  }
  
  public final void rJ(final String paramString)
  {
    GMTrace.i(10225109172224L, 76183);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10231014752256L, 76227);
        m.a(m.this, paramString, z.iwO);
        GMTrace.o(10231014752256L, 76227);
      }
    });
    GMTrace.o(10225109172224L, 76183);
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(10224974954496L, 76182);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      GMTrace.o(10224974954496L, 76182);
      return;
    }
    post(paramRunnable);
    GMTrace.o(10224974954496L, 76182);
  }
  
  public static abstract interface a
  {
    public abstract void RN();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */