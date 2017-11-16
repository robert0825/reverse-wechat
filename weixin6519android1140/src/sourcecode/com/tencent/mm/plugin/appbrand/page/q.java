package com.tencent.mm.plugin.appbrand.page;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;

public class q
  extends FrameLayout
{
  View Hw;
  private int hQ;
  View ivE;
  FrameLayout ivF;
  FrameLayout ivG;
  public boolean ivH;
  boolean ivI;
  private boolean ivJ;
  private boolean ivK;
  private boolean ivL;
  private int ivM;
  private int ivN;
  private int ivO;
  private ObjectAnimator ivP;
  
  public q(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10246047137792L, 76339);
    this.ivH = true;
    this.ivI = false;
    this.ivJ = false;
    this.ivK = false;
    this.ivL = false;
    this.ivP = null;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.hQ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    GMTrace.o(10246047137792L, 76339);
  }
  
  private boolean ZF()
  {
    GMTrace.i(10247120879616L, 76347);
    if ((this.Hw instanceof WebView))
    {
      if (((WebView)this.Hw).getWebScrollY() == 0)
      {
        GMTrace.o(10247120879616L, 76347);
        return true;
      }
      GMTrace.o(10247120879616L, 76347);
      return false;
    }
    if (this.Hw.getScrollY() == 0)
    {
      GMTrace.o(10247120879616L, 76347);
      return true;
    }
    GMTrace.o(10247120879616L, 76347);
    return false;
  }
  
  private void jl(int paramInt)
  {
    GMTrace.i(10247389315072L, 76349);
    int i = (int)this.ivG.getTranslationY();
    if (i == paramInt)
    {
      GMTrace.o(10247389315072L, 76349);
      return;
    }
    w.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (this.ivP != null) {
      this.ivP.cancel();
    }
    long l = (Math.abs(i - paramInt) / ZG() * 250.0F);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.ivG, "translationY", new float[] { i, paramInt });
    localObjectAnimator.setDuration(Math.min(l, 250L));
    localObjectAnimator.setInterpolator(new DecelerateInterpolator());
    localObjectAnimator.start();
    localObjectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(10217861414912L, 76129);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        q.this.jj((int)f);
        GMTrace.o(10217861414912L, 76129);
      }
    });
    this.ivP = localObjectAnimator;
    GMTrace.o(10247389315072L, 76349);
  }
  
  protected final void ZB()
  {
    GMTrace.i(17658892255232L, 131569);
    jl(ZG());
    if (!this.ivJ) {
      ZD();
    }
    this.ivK = true;
    this.ivJ = true;
    this.ivL = true;
    GMTrace.o(17658892255232L, 131569);
  }
  
  protected final void ZC()
  {
    GMTrace.i(10246584008704L, 76343);
    jl(0);
    if (this.ivJ) {
      ZE();
    }
    this.ivK = false;
    this.ivJ = false;
    this.ivL = false;
    GMTrace.o(10246584008704L, 76343);
  }
  
  protected void ZD()
  {
    GMTrace.i(10246718226432L, 76344);
    GMTrace.o(10246718226432L, 76344);
  }
  
  protected void ZE()
  {
    GMTrace.i(10246852444160L, 76345);
    GMTrace.o(10246852444160L, 76345);
  }
  
  protected int ZG()
  {
    GMTrace.i(10247255097344L, 76348);
    int i = this.ivE.getHeight();
    GMTrace.o(10247255097344L, 76348);
    return i;
  }
  
  public final void ct(boolean paramBoolean)
  {
    GMTrace.i(19901267836928L, 148276);
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.ivH = paramBoolean;
      GMTrace.o(19901267836928L, 148276);
      return;
    }
  }
  
  protected void jj(int paramInt)
  {
    GMTrace.i(10246986661888L, 76346);
    GMTrace.o(10246986661888L, 76346);
  }
  
  public final void jk(int paramInt)
  {
    GMTrace.i(19901402054656L, 148277);
    this.ivF.setBackgroundColor(paramInt);
    GMTrace.o(19901402054656L, 148277);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10246315573248L, 76341);
    if (this.ivH)
    {
      boolean bool = this.ivL;
      GMTrace.o(10246315573248L, 76341);
      return bool;
    }
    int i = paramMotionEvent.getAction();
    if ((i == 3) || (i == 1))
    {
      GMTrace.o(10246315573248L, 76341);
      return false;
    }
    if (this.ivK)
    {
      GMTrace.o(10246315573248L, 76341);
      return true;
    }
    switch (i)
    {
    }
    int k;
    int j;
    do
    {
      do
      {
        for (;;)
        {
          GMTrace.o(10246315573248L, 76341);
          return false;
          if (ZF())
          {
            this.ivM = ((int)paramMotionEvent.getX());
            this.ivN = ((int)paramMotionEvent.getY());
            this.ivO = ((int)paramMotionEvent.getY());
          }
        }
      } while (!ZF());
      i = (int)paramMotionEvent.getX();
      k = (int)paramMotionEvent.getY();
      j = this.ivM;
      k -= this.ivN;
    } while ((Math.abs(k) <= this.hQ) || (Math.abs(k) <= Math.abs(i - j)) || (k <= 0));
    this.ivK = true;
    GMTrace.o(10246315573248L, 76341);
    return true;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10246449790976L, 76342);
    if (this.ivH)
    {
      if (this.ivL) {
        ZC();
      }
      boolean bool = this.ivL;
      GMTrace.o(10246449790976L, 76342);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      GMTrace.o(10246449790976L, 76342);
      return false;
    case 0: 
      this.ivO = ((int)paramMotionEvent.getY());
      GMTrace.o(10246449790976L, 76342);
      return true;
    case 2: 
      int k = (int)paramMotionEvent.getY() - this.ivO;
      int i = k >> 1;
      int j = getHeight();
      if (i > j) {
        i = j;
      }
      for (;;)
      {
        j = i;
        if (this.ivJ) {
          j = i + ZG();
        }
        i = Math.max(j, 0);
        w.d("MicroMsg.AppBrandPullDownView", "real diff: %d, calc diff: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i) });
        j = Math.min(getHeight(), i);
        this.ivG.setTranslationY(j);
        jj(i);
        GMTrace.o(10246449790976L, 76342);
        return true;
      }
    }
    if ((this.ivG.getTranslationY() > this.ivE.getHeight()) && (this.ivI)) {
      ZB();
    }
    for (;;)
    {
      GMTrace.o(10246449790976L, 76342);
      return true;
      ZC();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */