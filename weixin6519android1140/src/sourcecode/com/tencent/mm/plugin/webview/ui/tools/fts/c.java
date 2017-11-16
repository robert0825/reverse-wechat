package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class c
  extends a
{
  public c(Context paramContext, View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, View paramView6, View paramView7, View paramView8)
  {
    super(paramContext, paramView1, paramView2, paramView3, paramView4, paramView5, paramView6, paramView7, paramView8);
    GMTrace.i(20430756773888L, 152221);
    GMTrace.o(20430756773888L, 152221);
  }
  
  protected final void bFb()
  {
    GMTrace.i(20430890991616L, 152222);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.rPT[0][0] - this.rPJ >= 0.0F) {
      localValueAnimator.addUpdateListener(this.rPY);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.rPS, "alpha", new float[] { 0.0F, 1.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.rPN, "alpha", new float[] { 0.0F, 1.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20437870313472L, 152274);
          c.this.nhg = false;
          GMTrace.o(20437870313472L, 152274);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20437736095744L, 152273);
          c.this.nhg = false;
          if (c.this.rPV != null) {
            c.this.rPV.onAnimationEnd();
          }
          GMTrace.o(20437736095744L, 152273);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20438004531200L, 152275);
          GMTrace.o(20438004531200L, 152275);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20437601878016L, 152272);
          c.this.nhg = true;
          if (c.this.rPV != null) {
            c.this.rPV.onAnimationStart();
          }
          c.this.rPP.setVisibility(0);
          c.this.rPN.setVisibility(0);
          c.this.rPR.setVisibility(8);
          c.this.rPS.setVisibility(0);
          c.this.rPQ.setVisibility(8);
          GMTrace.o(20437601878016L, 152272);
        }
      });
      localAnimatorSet.start();
      GMTrace.o(20430890991616L, 152222);
      return;
      localValueAnimator.addUpdateListener(this.rPZ);
    }
  }
  
  protected final void bFc()
  {
    GMTrace.i(20431025209344L, 152223);
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    if (this.rPT[0][0] - this.rPJ >= 0.0F) {
      localValueAnimator.addUpdateListener(this.rPW);
    }
    for (;;)
    {
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.rPS, "alpha", new float[] { 1.0F, 0.0F });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.rPN, "alpha", new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localValueAnimator, localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20438407184384L, 152278);
          c.this.nhg = false;
          GMTrace.o(20438407184384L, 152278);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20438272966656L, 152277);
          c.this.nhg = false;
          if (c.this.rPV != null) {
            c.this.rPV.onAnimationEnd();
          }
          c.this.rPR.setVisibility(0);
          c.this.rPS.setAlpha(1.0F);
          c.this.rPS.setVisibility(8);
          c.this.rPN.setAlpha(1.0F);
          c.this.rPN.setVisibility(8);
          GMTrace.o(20438272966656L, 152277);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20438541402112L, 152279);
          GMTrace.o(20438541402112L, 152279);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20438138748928L, 152276);
          c.this.nhg = true;
          if (c.this.rPV != null) {
            c.this.rPV.onAnimationStart();
          }
          GMTrace.o(20438138748928L, 152276);
        }
      });
      localAnimatorSet.start();
      GMTrace.o(20431025209344L, 152223);
      return;
      localValueAnimator.addUpdateListener(this.rPX);
    }
  }
  
  protected final boolean bFd()
  {
    GMTrace.i(20431159427072L, 152224);
    GMTrace.o(20431159427072L, 152224);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */