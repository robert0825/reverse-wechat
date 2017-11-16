package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static void a(View paramView, Context paramContext, a parama)
  {
    GMTrace.i(12530969739264L, 93363);
    paramContext = AnimationUtils.loadAnimation(paramContext, R.a.aLr);
    paramContext.setDuration(300L);
    paramContext.setFillAfter(true);
    paramContext.setRepeatCount(0);
    paramContext.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(12505199935488L, 93171);
        if (this.qDP != null) {
          this.qDP.btl();
        }
        GMTrace.o(12505199935488L, 93171);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(12505334153216L, 93172);
        GMTrace.o(12505334153216L, 93172);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(12505065717760L, 93170);
        GMTrace.o(12505065717760L, 93170);
      }
    });
    paramView.startAnimation(paramContext);
    GMTrace.o(12530969739264L, 93363);
  }
  
  public static void a(final View paramView, a parama)
  {
    GMTrace.i(12530835521536L, 93362);
    float f = paramView.getWidth();
    w.d("MicroMsg.VoiceViewAnimationHelper", "target " + f);
    Object localObject = new int[2];
    paramView.getLocationInWindow((int[])localObject);
    final int i = (int)(f + localObject[0]);
    w.d("MicroMsg.VoiceViewAnimationHelper", "location %d %d preX=%d", new Object[] { Integer.valueOf(localObject[0]), Integer.valueOf(localObject[1]), Integer.valueOf(i) });
    paramView.getParent();
    localObject = new TranslateAnimation(0, 0.0F, 0, -i, 1, 0.0F, 1, 0.0F);
    ((Animation)localObject).setDuration(200L);
    ((Animation)localObject).setStartOffset(0L);
    ((Animation)localObject).setRepeatMode(-1);
    ((Animation)localObject).setRepeatCount(0);
    ((Animation)localObject).setFillAfter(true);
    ((Animation)localObject).setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(12529761779712L, 93354);
        if (this.qDQ != null) {
          this.qDQ.btk();
        }
        w.d("MicroMsg.VoiceViewAnimationHelper", "onAnimationEnd ");
        paramAnonymousAnimation = new TranslateAnimation(0, i, 0, 0.0F, 1, 0.0F, 1, 0.0F);
        paramAnonymousAnimation.setDuration(200L);
        paramAnonymousAnimation.setStartOffset(0L);
        paramAnonymousAnimation.setRepeatMode(-1);
        paramAnonymousAnimation.setRepeatCount(0);
        paramAnonymousAnimation.setFillAfter(true);
        paramAnonymousAnimation.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymous2Animation)
          {
            GMTrace.i(12535264706560L, 93395);
            w.i("MicroMsg.VoiceViewAnimationHelper", "next end");
            if (a.2.this.qDQ != null) {
              a.2.this.qDQ.btl();
            }
            GMTrace.o(12535264706560L, 93395);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymous2Animation)
          {
            GMTrace.i(12535130488832L, 93394);
            GMTrace.o(12535130488832L, 93394);
          }
          
          public final void onAnimationStart(Animation paramAnonymous2Animation)
          {
            GMTrace.i(12534996271104L, 93393);
            GMTrace.o(12534996271104L, 93393);
          }
        });
        paramView.startAnimation(paramAnonymousAnimation);
        GMTrace.o(12529761779712L, 93354);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(12529627561984L, 93353);
        GMTrace.o(12529627561984L, 93353);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(12529493344256L, 93352);
        GMTrace.o(12529493344256L, 93352);
      }
    });
    paramView.startAnimation((Animation)localObject);
    GMTrace.o(12530835521536L, 93362);
  }
  
  public static abstract interface a
  {
    public abstract void btk();
    
    public abstract void btl();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */