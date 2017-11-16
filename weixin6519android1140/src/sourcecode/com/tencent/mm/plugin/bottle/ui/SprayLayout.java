package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.ae;

public class SprayLayout
  extends FrameLayout
{
  private ae handler;
  private ImageView jrI;
  private ImageView jrJ;
  private ImageView jrK;
  Animation jrL;
  Animation jrM;
  Animation jrN;
  Animation jrO;
  Animation jrP;
  AnimationSet jrQ;
  AnimationSet jrR;
  AnimationSet jrS;
  private int jrT;
  private int jrU;
  private int jrV;
  private int jrW;
  private int jrX;
  private int jrY;
  private Runnable jrZ;
  private int repeatCount;
  
  public SprayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7645444440064L, 56963);
    GMTrace.o(7645444440064L, 56963);
  }
  
  public SprayLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7645578657792L, 56964);
    this.jrL = new ScaleAnimation(0.6F, 0.8F, 0.6F, 0.8F, 1, 0.5F, 1, 1.0F);
    this.jrM = new AlphaAnimation(0.2F, 1.0F);
    this.jrN = new ScaleAnimation(0.8F, 1.27F, 0.8F, 1.27F, 1, 0.5F, 1, 1.0F);
    this.jrO = new AlphaAnimation(1.0F, 0.5F);
    this.jrP = new ScaleAnimation(0.8F, 1.0F, 0.8F, 1.0F, 1, 0.5F, 1, 1.0F);
    this.jrQ = new AnimationSet(true);
    this.jrR = new AnimationSet(true);
    this.jrS = new AnimationSet(true);
    this.jrL.setDuration(280L);
    this.jrM.setDuration(280L);
    this.jrN.setDuration(280L);
    this.jrO.setDuration(280L);
    this.jrQ.addAnimation(this.jrL);
    this.jrQ.addAnimation(this.jrM);
    this.jrQ.setRepeatCount(1);
    this.jrQ.setDuration(280L);
    this.jrR.addAnimation(this.jrN);
    this.jrR.setRepeatCount(1);
    this.jrR.setDuration(280L);
    this.jrS.addAnimation(this.jrP);
    this.jrS.setRepeatCount(1);
    this.jrS.setDuration(280L);
    this.jrT = 0;
    this.repeatCount = 1;
    this.jrV = -1;
    this.jrW = -1;
    this.handler = new ae();
    this.jrZ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7613769056256L, 56727);
        if (SprayLayout.a(SprayLayout.this) == 0)
        {
          SprayLayout.b(SprayLayout.this);
          SprayLayout.c(SprayLayout.this).clearAnimation();
          SprayLayout.c(SprayLayout.this).setVisibility(8);
          SprayLayout.d(SprayLayout.this);
        }
        while (SprayLayout.g(SprayLayout.this) > SprayLayout.h(SprayLayout.this))
        {
          SprayLayout.this.stop();
          GMTrace.o(7613769056256L, 56727);
          return;
          if (SprayLayout.a(SprayLayout.this) == 1)
          {
            SprayLayout.e(SprayLayout.this).startAnimation(SprayLayout.this.jrQ);
            SprayLayout.e(SprayLayout.this).setVisibility(0);
            SprayLayout.f(SprayLayout.this).setVisibility(8);
            SprayLayout.c(SprayLayout.this).setVisibility(8);
          }
          else if (SprayLayout.a(SprayLayout.this) == 2)
          {
            SprayLayout.e(SprayLayout.this).startAnimation(SprayLayout.this.jrR);
            SprayLayout.f(SprayLayout.this).startAnimation(SprayLayout.this.jrQ);
            SprayLayout.f(SprayLayout.this).setVisibility(0);
          }
          else if (SprayLayout.a(SprayLayout.this) == 3)
          {
            SprayLayout.e(SprayLayout.this).clearAnimation();
            SprayLayout.e(SprayLayout.this).setVisibility(8);
            SprayLayout.f(SprayLayout.this).startAnimation(SprayLayout.this.jrR);
            SprayLayout.c(SprayLayout.this).startAnimation(SprayLayout.this.jrQ);
            SprayLayout.c(SprayLayout.this).setVisibility(0);
          }
          else if (SprayLayout.a(SprayLayout.this) == 4)
          {
            SprayLayout.c(SprayLayout.this).startAnimation(SprayLayout.this.jrS);
            SprayLayout.f(SprayLayout.this).clearAnimation();
            SprayLayout.f(SprayLayout.this).setVisibility(8);
          }
        }
        SprayLayout.j(SprayLayout.this).postDelayed(SprayLayout.i(SprayLayout.this), 280L);
        SprayLayout.a(SprayLayout.this, SprayLayout.k(SprayLayout.this) % 5);
        GMTrace.o(7613769056256L, 56727);
      }
    };
    GMTrace.o(7645578657792L, 56964);
  }
  
  public final void stop()
  {
    GMTrace.i(7645847093248L, 56966);
    this.handler.removeCallbacks(this.jrZ);
    setVisibility(8);
    GMTrace.o(7645847093248L, 56966);
  }
  
  public final void y(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7645712875520L, 56965);
    this.jrT = 0;
    this.repeatCount = paramInt1;
    this.jrU = 0;
    this.jrV = paramInt2;
    this.jrW = paramInt3;
    if (this.jrI == null)
    {
      this.jrI = ((ImageView)findViewById(R.h.bib));
      this.jrJ = ((ImageView)findViewById(R.h.bid));
      this.jrK = ((ImageView)findViewById(R.h.bic));
      DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
      this.jrX = (localDisplayMetrics.widthPixels * 35 / 96);
      this.jrY = (localDisplayMetrics.heightPixels / 16);
    }
    this.jrI.setVisibility(8);
    this.jrJ.setVisibility(8);
    this.jrK.setVisibility(8);
    setVisibility(0);
    this.handler.removeCallbacks(this.jrZ);
    this.handler.postDelayed(this.jrZ, 0L);
    GMTrace.o(7645712875520L, 56965);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\SprayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */