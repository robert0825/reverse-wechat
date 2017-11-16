package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ai
{
  public static final g yO = new a();
  public WeakReference<View> yK;
  public Runnable yL = null;
  public Runnable yM = null;
  public int yN = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      yO = new f();
      return;
    }
    if (i >= 19)
    {
      yO = new e();
      return;
    }
    if (i >= 18)
    {
      yO = new c();
      return;
    }
    if (i >= 16)
    {
      yO = new d();
      return;
    }
    if (i >= 14)
    {
      yO = new b();
      return;
    }
  }
  
  ai(View paramView)
  {
    this.yK = new WeakReference(paramView);
  }
  
  public final ai a(am paramam)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.a(this, localView, paramam);
    }
    return this;
  }
  
  public final ai a(ao paramao)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.a(localView, paramao);
    }
    return this;
  }
  
  public final ai b(Interpolator paramInterpolator)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.a(localView, paramInterpolator);
    }
    return this;
  }
  
  public final void cancel()
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.a(this, localView);
    }
  }
  
  public final ai d(long paramLong)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.a(localView, paramLong);
    }
    return this;
  }
  
  public final ai e(long paramLong)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.b(localView, paramLong);
    }
    return this;
  }
  
  public final ai p(float paramFloat)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai q(float paramFloat)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai r(float paramFloat)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.c(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai s(float paramFloat)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.d(this, localView, paramFloat);
    }
    return this;
  }
  
  public final void start()
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.b(this, localView);
    }
  }
  
  public final ai t(float paramFloat)
  {
    View localView = (View)this.yK.get();
    if (localView != null) {
      yO.e(this, localView, paramFloat);
    }
    return this;
  }
  
  static class a
    implements ai.g
  {
    WeakHashMap<View, Runnable> yP = null;
    
    private void d(ai paramai, View paramView)
    {
      Runnable localRunnable = null;
      if (this.yP != null) {
        localRunnable = (Runnable)this.yP.get(paramView);
      }
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new a(paramai, paramView);
        if (this.yP == null) {
          this.yP = new WeakHashMap();
        }
        this.yP.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
    }
    
    public void a(ai paramai, View paramView)
    {
      d(paramai, paramView);
    }
    
    public void a(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void a(ai paramai, View paramView, am paramam)
    {
      paramView.setTag(2113929216, paramam);
    }
    
    public void a(View paramView, long paramLong) {}
    
    public void a(View paramView, ao paramao) {}
    
    public void a(View paramView, Interpolator paramInterpolator) {}
    
    public long ar(View paramView)
    {
      return 0L;
    }
    
    public void b(ai paramai, View paramView)
    {
      if (this.yP != null)
      {
        Runnable localRunnable = (Runnable)this.yP.get(paramView);
        if (localRunnable != null) {
          paramView.removeCallbacks(localRunnable);
        }
      }
      c(paramai, paramView);
    }
    
    public void b(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void b(View paramView, long paramLong) {}
    
    public final void c(ai paramai, View paramView)
    {
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof am)) {}
      for (localObject = (am)localObject;; localObject = null)
      {
        Runnable localRunnable1 = paramai.yL;
        Runnable localRunnable2 = paramai.yM;
        paramai.yL = null;
        paramai.yM = null;
        if (localRunnable1 != null) {
          localRunnable1.run();
        }
        if (localObject != null)
        {
          ((am)localObject).p(paramView);
          ((am)localObject).q(paramView);
        }
        if (localRunnable2 != null) {
          localRunnable2.run();
        }
        if (this.yP != null) {
          this.yP.remove(paramView);
        }
        return;
      }
    }
    
    public void c(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void d(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void e(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    final class a
      implements Runnable
    {
      WeakReference<View> ew;
      ai yQ;
      
      public a(ai paramai, View paramView)
      {
        this.ew = new WeakReference(paramView);
        this.yQ = paramai;
      }
      
      public final void run()
      {
        View localView = (View)this.ew.get();
        if (localView != null) {
          ai.a.this.c(this.yQ, localView);
        }
      }
    }
  }
  
  static class b
    extends ai.a
  {
    WeakHashMap<View, Integer> yS = null;
    
    public final void a(ai paramai, View paramView)
    {
      paramView.animate().cancel();
    }
    
    public final void a(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().alpha(paramFloat);
    }
    
    public void a(ai paramai, View paramView, am paramam)
    {
      paramView.setTag(2113929216, paramam);
      paramai = new a(paramai);
      paramView.animate().setListener(new aj.1(paramai, paramView));
    }
    
    public final void a(View paramView, long paramLong)
    {
      paramView.animate().setDuration(paramLong);
    }
    
    public final void a(View paramView, Interpolator paramInterpolator)
    {
      paramView.animate().setInterpolator(paramInterpolator);
    }
    
    public final long ar(View paramView)
    {
      return paramView.animate().getDuration();
    }
    
    public final void b(ai paramai, View paramView)
    {
      paramView.animate().start();
    }
    
    public final void b(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().translationX(paramFloat);
    }
    
    public final void b(View paramView, long paramLong)
    {
      paramView.animate().setStartDelay(paramLong);
    }
    
    public final void c(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().translationY(paramFloat);
    }
    
    public final void d(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().scaleX(paramFloat);
    }
    
    public final void e(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().scaleY(paramFloat);
    }
    
    static final class a
      implements am
    {
      ai yQ;
      boolean yT;
      
      a(ai paramai)
      {
        this.yQ = paramai;
      }
      
      public final void as(View paramView)
      {
        Object localObject = paramView.getTag(2113929216);
        if ((localObject instanceof am)) {}
        for (localObject = (am)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((am)localObject).as(paramView);
          }
          return;
        }
      }
      
      public final void p(View paramView)
      {
        this.yT = false;
        if (this.yQ.yN >= 0) {
          z.a(paramView, 2, null);
        }
        if (this.yQ.yL != null)
        {
          localObject = this.yQ.yL;
          this.yQ.yL = null;
          ((Runnable)localObject).run();
        }
        Object localObject = paramView.getTag(2113929216);
        if ((localObject instanceof am)) {}
        for (localObject = (am)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((am)localObject).p(paramView);
          }
          return;
        }
      }
      
      public final void q(View paramView)
      {
        if (this.yQ.yN >= 0)
        {
          z.a(paramView, this.yQ.yN, null);
          this.yQ.yN = -1;
        }
        if ((Build.VERSION.SDK_INT >= 16) || (!this.yT))
        {
          if (this.yQ.yM != null)
          {
            localObject = this.yQ.yM;
            this.yQ.yM = null;
            ((Runnable)localObject).run();
          }
          localObject = paramView.getTag(2113929216);
          if (!(localObject instanceof am)) {
            break label113;
          }
        }
        label113:
        for (Object localObject = (am)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((am)localObject).q(paramView);
          }
          this.yT = true;
          return;
        }
      }
    }
  }
  
  static class c
    extends ai.d
  {}
  
  static class d
    extends ai.b
  {
    public final void a(ai paramai, View paramView, am paramam)
    {
      if (paramam != null)
      {
        paramView.animate().setListener(new ak.1(paramam, paramView));
        return;
      }
      paramView.animate().setListener(null);
    }
  }
  
  static class e
    extends ai.c
  {
    public final void a(View paramView, ao paramao)
    {
      al.1 local1 = null;
      if (paramao != null) {
        local1 = new al.1(paramao, paramView);
      }
      paramView.animate().setUpdateListener(local1);
    }
  }
  
  static final class f
    extends ai.e
  {}
  
  public static abstract interface g
  {
    public abstract void a(ai paramai, View paramView);
    
    public abstract void a(ai paramai, View paramView, float paramFloat);
    
    public abstract void a(ai paramai, View paramView, am paramam);
    
    public abstract void a(View paramView, long paramLong);
    
    public abstract void a(View paramView, ao paramao);
    
    public abstract void a(View paramView, Interpolator paramInterpolator);
    
    public abstract long ar(View paramView);
    
    public abstract void b(ai paramai, View paramView);
    
    public abstract void b(ai paramai, View paramView, float paramFloat);
    
    public abstract void b(View paramView, long paramLong);
    
    public abstract void c(ai paramai, View paramView, float paramFloat);
    
    public abstract void d(ai paramai, View paramView, float paramFloat);
    
    public abstract void e(ai paramai, View paramView, float paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */