package com.tencent.mm.ui.tools;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.v.a.b;
import com.tencent.mm.v.a.g;

public final class j
{
  @TargetApi(14)
  public static final void a(View paramView, long paramLong, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(2029640482816L, 15122);
    if ((paramView == null) || (d.eu(14)))
    {
      GMTrace.o(2029640482816L, 15122);
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.gdO);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.animate().cancel();
    paramView.animate().setListener(null);
    paramView.animate().setDuration(paramLong).translationX(paramFloat1).translationY(0.0F).setInterpolator(new AccelerateInterpolator(paramFloat2));
    GMTrace.o(2029640482816L, 15122);
  }
  
  @TargetApi(14)
  public static final void a(View paramView, long paramLong, float paramFloat, a parama)
  {
    GMTrace.i(2029506265088L, 15121);
    if ((paramView == null) || (d.eu(14)))
    {
      GMTrace.o(2029506265088L, 15121);
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.gdO);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.animate().cancel();
    if (parama == null)
    {
      paramView.animate().setDuration(paramLong).translationX(paramFloat).translationY(0.0F);
      GMTrace.o(2029506265088L, 15121);
      return;
    }
    paramView.animate().setDuration(paramLong).translationX(paramFloat).translationY(0.0F).setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(2005078638592L, 14939);
        this.xhw.cil();
        GMTrace.o(2005078638592L, 14939);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(2004944420864L, 14938);
        this.xhw.onAnimationEnd();
        GMTrace.o(2004944420864L, 14938);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(2004810203136L, 14937);
        GMTrace.o(2004810203136L, 14937);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(2004675985408L, 14936);
        GMTrace.o(2004675985408L, 14936);
      }
    });
    GMTrace.o(2029506265088L, 15121);
  }
  
  @TargetApi(11)
  public static void a(View paramView, Animator.AnimatorListener paramAnimatorListener)
  {
    GMTrace.i(2029774700544L, 15123);
    if ((paramView == null) || (d.eu(11)))
    {
      GMTrace.o(2029774700544L, 15123);
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.gdO);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    localAnimator = AnimatorInflater.loadAnimator(paramView.getContext(), a.b.aMj);
    localAnimator.setTarget(paramView);
    if (paramAnimatorListener != null) {
      localAnimator.addListener(paramAnimatorListener);
    }
    localAnimator.start();
    paramView.setTag(a.g.gdO, localAnimator);
    GMTrace.o(2029774700544L, 15123);
  }
  
  @TargetApi(11)
  public static final void m(View paramView, float paramFloat)
  {
    GMTrace.i(2029237829632L, 15119);
    if ((paramView == null) || (d.eu(11)))
    {
      GMTrace.o(2029237829632L, 15119);
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.gdO);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.setScaleX(paramFloat);
    paramView.setScaleY(paramFloat);
    GMTrace.o(2029237829632L, 15119);
  }
  
  @TargetApi(14)
  public static final void n(View paramView, float paramFloat)
  {
    GMTrace.i(2029372047360L, 15120);
    if ((paramView == null) || (d.eu(14)))
    {
      GMTrace.o(2029372047360L, 15120);
      return;
    }
    Animator localAnimator = (Animator)paramView.getTag(a.g.gdO);
    if (localAnimator != null) {
      localAnimator.cancel();
    }
    paramView.animate().cancel();
    paramView.setTranslationX(paramFloat);
    paramView.setTranslationY(0.0F);
    GMTrace.o(2029372047360L, 15120);
  }
  
  public static abstract interface a
  {
    public abstract void cil();
    
    public abstract void onAnimationEnd();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */