package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public final class d
  extends a
{
  public d(Context paramContext, View paramView1, final View paramView2, View paramView3, View paramView4, View paramView5, final View paramView6, View paramView7, View paramView8)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8);
    GMTrace.i(20426059153408L, 152186);
    paramView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(20425388064768L, 152181);
        paramView2.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView2.getLayoutParams();
        d.this.rPL = (localLayoutParams.leftMargin - d.this.nof);
        GMTrace.o(20425388064768L, 152181);
        return true;
      }
    });
    paramView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(16907272978432L, 125969);
        paramView6.getViewTreeObserver().removeOnPreDrawListener(this);
        d.this.rPK = 0;
        GMTrace.o(16907272978432L, 125969);
        return true;
      }
    });
    GMTrace.o(20426059153408L, 152186);
  }
  
  protected final void bFb()
  {
    GMTrace.i(20426193371136L, 152187);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.rPT[0][0] - this.rPJ >= 0.0F) {
      localValueAnimator.addUpdateListener(this.rPY);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.rPN, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.rPP, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.rPQ, "alpha", new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2, localObjectAnimator3 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20432367386624L, 152233);
          d.this.nhg = false;
          GMTrace.o(20432367386624L, 152233);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20432233168896L, 152232);
          d.this.nhg = false;
          if (d.this.rPV != null) {
            d.this.rPV.onAnimationEnd();
          }
          d.this.rPO.setVisibility(0);
          d.this.rPM.setPadding(0, 0, 0, 0);
          d.this.rPQ.setAlpha(1.0F);
          d.this.rPQ.setVisibility(8);
          GMTrace.o(20432233168896L, 152232);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20432501604352L, 152234);
          GMTrace.o(20432501604352L, 152234);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20432098951168L, 152231);
          d.this.nhg = true;
          if (d.this.rPV != null) {
            d.this.rPV.onAnimationStart();
          }
          d.this.rPP.setVisibility(0);
          d.this.rPN.setVisibility(0);
          d.this.rPR.setVisibility(8);
          GMTrace.o(20432098951168L, 152231);
        }
      });
      localAnimatorSet.start();
      GMTrace.o(20426193371136L, 152187);
      return;
      localValueAnimator.addUpdateListener(this.rPZ);
    }
  }
  
  protected final void bFc()
  {
    GMTrace.i(20426327588864L, 152188);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.rPT[0][0] - this.rPJ >= 0.0F) {
      localValueAnimator.addUpdateListener(this.rPW);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.rPN, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.rPP, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.rPQ, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2, localObjectAnimator3 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20426998677504L, 152193);
          d.this.nhg = false;
          GMTrace.o(20426998677504L, 152193);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20426864459776L, 152192);
          d.this.nhg = false;
          if (d.this.rPV != null) {
            d.this.rPV.onAnimationEnd();
          }
          d.this.rPR.setVisibility(0);
          d.this.rPP.setAlpha(1.0F);
          d.this.rPP.setVisibility(8);
          GMTrace.o(20426864459776L, 152192);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20427132895232L, 152194);
          GMTrace.o(20427132895232L, 152194);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20426730242048L, 152191);
          d.this.nhg = true;
          if (d.this.rPV != null) {
            d.this.rPV.onAnimationStart();
          }
          d.this.rPO.setVisibility(8);
          d.this.rPQ.setVisibility(0);
          GMTrace.o(20426730242048L, 152191);
        }
      });
      localAnimatorSet.start();
      GMTrace.o(20426327588864L, 152188);
      return;
      localValueAnimator.addUpdateListener(this.rPX);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */