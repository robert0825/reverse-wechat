package com.tencent.mm.plugin.appbrand.widget.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  private int iKP;
  public ValueAnimator iKQ;
  public View view;
  
  public c(View paramView)
  {
    GMTrace.i(18296292245504L, 136318);
    this.view = paramView;
    GMTrace.o(18296292245504L, 136318);
  }
  
  public final void a(int paramInt, final Runnable paramRunnable)
  {
    GMTrace.i(18296426463232L, 136319);
    if (this.view == null)
    {
      GMTrace.o(18296426463232L, 136319);
      return;
    }
    this.iKP = paramInt;
    if (((this.view.getBackground() instanceof ColorDrawable)) && (((ColorDrawable)this.view.getBackground()).getColor() == paramInt))
    {
      if (paramRunnable != null) {
        paramRunnable.run();
      }
      if (this.iKQ != null) {
        this.iKQ.cancel();
      }
      GMTrace.o(18296426463232L, 136319);
      return;
    }
    paramRunnable = new AnimatorListenerAdapter()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18296023810048L, 136316);
        c.this.iKQ = null;
        GMTrace.o(18296023810048L, 136316);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18296158027776L, 136317);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        c.this.iKQ = null;
        GMTrace.o(18296158027776L, 136317);
      }
    };
    if ((this.iKQ != null) && (this.iKQ.isStarted()) && (this.iKQ.isRunning()) && (this.iKP == paramInt))
    {
      this.iKQ.addListener(paramRunnable);
      GMTrace.o(18296426463232L, 136319);
      return;
    }
    if (this.iKQ != null) {
      this.iKQ.cancel();
    }
    if ((this.view.getBackground() instanceof ColorDrawable)) {}
    for (paramInt = ((ColorDrawable)this.view.getBackground()).getColor();; paramInt = 0)
    {
      this.iKQ = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.iKP) });
      this.iKQ.addListener(paramRunnable);
      this.iKQ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(18293607890944L, 136298);
          if (c.this.view != null) {
            c.this.view.setBackgroundColor(((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue());
          }
          GMTrace.o(18293607890944L, 136298);
        }
      });
      this.iKQ.start();
      GMTrace.o(18296426463232L, 136319);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */