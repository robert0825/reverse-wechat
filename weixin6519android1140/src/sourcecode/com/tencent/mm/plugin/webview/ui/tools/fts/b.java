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

public final class b
  extends a
{
  public b(Context paramContext, View paramView1, final View paramView2, View paramView3, View paramView4, View paramView5, final View paramView6, View paramView7, View paramView8)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8);
    GMTrace.i(20431293644800L, 152225);
    paramView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(20446862901248L, 152341);
        paramView2.getViewTreeObserver().removeOnPreDrawListener(this);
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView2.getLayoutParams();
        b.this.rPL = (localLayoutParams.leftMargin - b.this.nof);
        GMTrace.o(20446862901248L, 152341);
        return true;
      }
    });
    paramView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(16898817261568L, 125906);
        paramView6.getViewTreeObserver().removeOnPreDrawListener(this);
        b.this.rPK = ((int)paramView6.getX());
        GMTrace.o(16898817261568L, 125906);
        return true;
      }
    });
    GMTrace.o(20431293644800L, 152225);
  }
  
  public final void P(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20431562080256L, 152227);
    if (paramInt == this.rPU)
    {
      GMTrace.o(20431562080256L, 152227);
      return;
    }
    switch (6.rQd[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(20431562080256L, 152227);
      return;
      bFb();
      GMTrace.o(20431562080256L, 152227);
      return;
      if (paramBoolean)
      {
        bFc();
        GMTrace.o(20431562080256L, 152227);
        return;
      }
      this.rPN.setAlpha(0.0F);
      this.rPR.setVisibility(0);
      this.rPP.setAlpha(1.0F);
      this.rPP.setVisibility(8);
      this.rPQ.setAlpha(1.0F);
      this.rPM.setPadding(this.rPL, 0, 0, 0);
      paramInt = this.rPI;
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.rPM.getLayoutParams();
      localLayoutParams.leftMargin = (this.rPI - paramInt);
      localLayoutParams.rightMargin = (this.rPI - paramInt);
      localLayoutParams.width = (paramInt * 2 + (int)this.rPT[2][0]);
      this.rPM.setLayoutParams(localLayoutParams);
      this.rPM.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20430219902976L, 152217);
          b.this.rPM.setY(b.this.rPT[0][1]);
          b.this.rPM.setX(b.this.rPT[1][1]);
          GMTrace.o(20430219902976L, 152217);
        }
      });
    }
  }
  
  protected final void bFb()
  {
    GMTrace.i(20431696297984L, 152228);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.rPT[0][0] - this.rPJ >= 0.0F) {
      localValueAnimator.addUpdateListener(this.rPY);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.rPN, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.rPP, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20437199224832L, 152269);
          b.this.nhg = false;
          GMTrace.o(20437199224832L, 152269);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20437065007104L, 152268);
          b.this.nhg = false;
          if (b.this.rPV != null) {
            b.this.rPV.onAnimationEnd();
          }
          b.this.rPO.setVisibility(0);
          b.this.rPM.setPadding(0, 0, 0, 0);
          b.this.rPQ.setAlpha(1.0F);
          GMTrace.o(20437065007104L, 152268);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20437333442560L, 152270);
          GMTrace.o(20437333442560L, 152270);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20436930789376L, 152267);
          b.this.nhg = true;
          if (b.this.rPV != null) {
            b.this.rPV.onAnimationStart();
          }
          b.this.rPP.setVisibility(0);
          b.this.rPN.setVisibility(0);
          b.this.rPR.setVisibility(8);
          b.this.rPQ.setVisibility(8);
          GMTrace.o(20436930789376L, 152267);
        }
      });
      localAnimatorSet.start();
      GMTrace.o(20431696297984L, 152228);
      return;
      localValueAnimator.addUpdateListener(this.rPZ);
    }
  }
  
  protected final void bFc()
  {
    GMTrace.i(20431830515712L, 152229);
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
          GMTrace.i(20436662353920L, 152265);
          b.this.nhg = false;
          GMTrace.o(20436662353920L, 152265);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20436528136192L, 152264);
          b.this.nhg = false;
          if (b.this.rPV != null) {
            b.this.rPV.onAnimationEnd();
          }
          b.this.rPR.setVisibility(0);
          b.this.rPP.setAlpha(1.0F);
          b.this.rPP.setVisibility(8);
          GMTrace.o(20436528136192L, 152264);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20436796571648L, 152266);
          GMTrace.o(20436796571648L, 152266);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20436393918464L, 152263);
          b.this.nhg = true;
          if (b.this.rPV != null) {
            b.this.rPV.onAnimationStart();
          }
          b.this.rPO.setVisibility(8);
          b.this.rPQ.setVisibility(0);
          GMTrace.o(20436393918464L, 152263);
        }
      });
      localAnimatorSet.start();
      GMTrace.o(20431830515712L, 152229);
      return;
      localValueAnimator.addUpdateListener(this.rPX);
    }
  }
  
  public final void yg(int paramInt)
  {
    GMTrace.i(20431427862528L, 152226);
    P(paramInt, true);
    GMTrace.o(20431427862528L, 152226);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */