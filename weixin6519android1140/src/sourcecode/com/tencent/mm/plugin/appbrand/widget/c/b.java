package com.tencent.mm.plugin.appbrand.widget.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.a;
import java.util.LinkedList;

public final class b
  extends FrameLayout
{
  public final c iKH;
  public final LinkedList<a> iKI;
  private final Runnable iKJ;
  private a iKK;
  public a iKL;
  public final View.OnClickListener mOnClickListener;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18292131495936L, 136287);
    this.iKH = new c(this);
    this.iKI = new LinkedList();
    this.mOnClickListener = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18293339455488L, 136296);
        if (paramAnonymousView == b.this) {
          b.a(b.this);
        }
        GMTrace.o(18293339455488L, 136296);
      }
    };
    this.iKJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18293071020032L, 136294);
        b.this.removeAllViews();
        b.this.setVisibility(8);
        GMTrace.o(18293071020032L, 136294);
      }
    };
    setVisibility(8);
    setBackgroundColor(0);
    setOnClickListener(this.mOnClickListener);
    GMTrace.o(18292131495936L, 136287);
  }
  
  public static void bN(View paramView)
  {
    GMTrace.i(18292399931392L, 136289);
    if ((paramView == null) || (paramView.getParent() == null))
    {
      GMTrace.o(18292399931392L, 136289);
      return;
    }
    ((ViewGroup)paramView.getParent()).removeView(paramView);
    GMTrace.o(18292399931392L, 136289);
  }
  
  public final void b(final a parama)
  {
    GMTrace.i(18292265713664L, 136288);
    if (parama.getContentView().getParent() != this)
    {
      GMTrace.o(18292265713664L, 136288);
      return;
    }
    if (this.iKK == parama)
    {
      GMTrace.o(18292265713664L, 136288);
      return;
    }
    this.iKK = parama;
    final View localView = parama.getContentView();
    localView.animate().cancel();
    localView.clearAnimation();
    Object localObject = AnimationUtils.loadInterpolator(localView.getContext(), o.a.hzY);
    Interpolator localInterpolator = AnimationUtils.loadInterpolator(localView.getContext(), o.a.hzX);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localView, "scaleX", new float[] { 1.0F, 0.9F }).setDuration(220L);
    localObjectAnimator1.setInterpolator((TimeInterpolator)localObject);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localView, "scaleY", new float[] { 1.0F, 0.9F }).setDuration(220L);
    localObjectAnimator2.setInterpolator((TimeInterpolator)localObject);
    localObject = ObjectAnimator.ofFloat(localView, "alpha", new float[] { 1.0F, 0.0F }).setDuration(150L);
    ((Animator)localObject).setInterpolator(localInterpolator);
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, localObject });
    localAnimatorSet.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18293876326400L, 136300);
        onAnimationEnd(paramAnonymousAnimator);
        GMTrace.o(18293876326400L, 136300);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(18294010544128L, 136301);
        localView.setVisibility(8);
        b.this.removeView(localView);
        b.b(b.this).remove(parama);
        b.c(b.this);
        GMTrace.o(18294010544128L, 136301);
      }
    });
    localAnimatorSet.start();
    if (this.iKI.size() <= 1) {
      this.iKH.a(0, this.iKJ);
    }
    GMTrace.o(18292265713664L, 136288);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */