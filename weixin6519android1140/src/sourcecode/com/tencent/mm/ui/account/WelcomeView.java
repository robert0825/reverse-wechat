package com.tencent.mm.ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public abstract class WelcomeView
  extends LinearLayout
{
  public WelcomeView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(2751194988544L, 20498);
    GMTrace.o(2751194988544L, 20498);
  }
  
  public WelcomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2751329206272L, 20499);
    GMTrace.o(2751329206272L, 20499);
  }
  
  public abstract void bZa();
  
  public final void dd(View paramView)
  {
    GMTrace.i(2751731859456L, 20502);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setInterpolator(new LinearInterpolator());
    localAlphaAnimation.setDuration(300L);
    localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(2655900401664L, 19788);
        GMTrace.o(2655900401664L, 19788);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(2655766183936L, 19787);
        GMTrace.o(2655766183936L, 19787);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(2655631966208L, 19786);
        GMTrace.o(2655631966208L, 19786);
      }
    });
    paramView.startAnimation(localAlphaAnimation);
    GMTrace.o(2751731859456L, 20502);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\WelcomeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */