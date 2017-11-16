package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;

public class ThreeDotsLoadingView
  extends FrameLayout
{
  private int xsX;
  private ViewGroup xsY;
  private ImageView xsZ;
  private ImageView xta;
  private ImageView xtb;
  private final Runnable xtc;
  private boolean yve;
  private boolean zZ;
  
  public ThreeDotsLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16428249907200L, 122400);
    this.xsX = -16777216;
    this.zZ = false;
    this.yve = false;
    this.xtc = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20289962377216L, 151172);
        ThreeDotsLoadingView.a(ThreeDotsLoadingView.this);
        ((AnimationDrawable)ThreeDotsLoadingView.b(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.c(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.d(ThreeDotsLoadingView.this).getDrawable()).start();
        GMTrace.o(20289962377216L, 151172);
      }
    };
    init(paramContext, paramAttributeSet);
    GMTrace.o(16428249907200L, 122400);
  }
  
  public ThreeDotsLoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16428384124928L, 122401);
    this.xsX = -16777216;
    this.zZ = false;
    this.yve = false;
    this.xtc = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20289962377216L, 151172);
        ThreeDotsLoadingView.a(ThreeDotsLoadingView.this);
        ((AnimationDrawable)ThreeDotsLoadingView.b(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.c(ThreeDotsLoadingView.this).getDrawable()).start();
        ((AnimationDrawable)ThreeDotsLoadingView.d(ThreeDotsLoadingView.this).getDrawable()).start();
        GMTrace.o(20289962377216L, 151172);
      }
    };
    init(paramContext, paramAttributeSet);
    GMTrace.o(16428384124928L, 122401);
  }
  
  private static AnimationDrawable a(int paramInt, float[] paramArrayOfFloat)
  {
    int i = 0;
    GMTrace.i(21008832528384L, 156528);
    AnimationDrawable localAnimationDrawable = new AnimationDrawable();
    localAnimationDrawable.setOneShot(false);
    while (i < 3)
    {
      localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[i]), 300);
      i += 1;
    }
    GMTrace.o(21008832528384L, 156528);
    return localAnimationDrawable;
  }
  
  private void cjv()
  {
    GMTrace.i(20291170336768L, 151181);
    this.xsZ.setImageDrawable(f(this.xsX, 0.4F));
    this.xta.setImageDrawable(f(this.xsX, 0.1F));
    this.xtb.setImageDrawable(f(this.xsX, 0.1F));
    GMTrace.o(20291170336768L, 151181);
  }
  
  private static Drawable f(int paramInt, float paramFloat)
  {
    GMTrace.i(16429189431296L, 122407);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.setIntrinsicHeight(32);
    localShapeDrawable.setIntrinsicWidth(32);
    localShapeDrawable.getPaint().setColor(paramInt);
    localShapeDrawable.getPaint().setAlpha((int)(255.0F * paramFloat));
    GMTrace.o(16429189431296L, 122407);
    return localShapeDrawable;
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(21008698310656L, 156527);
    this.xsY = ((ViewGroup)LayoutInflater.from(paramContext).inflate(a.h.geW, this, true));
    this.xsZ = ((ImageView)this.xsY.findViewById(a.g.gdr));
    this.xta = ((ImageView)this.xsY.findViewById(a.g.gds));
    this.xtb = ((ImageView)this.xsY.findViewById(a.g.gdt));
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.eob);
      this.xsX = paramContext.getColor(a.m.gho, -16777216);
      paramContext.recycle();
    }
    cjv();
    GMTrace.o(21008698310656L, 156527);
  }
  
  public final void ZI()
  {
    GMTrace.i(16428920995840L, 122405);
    this.yve = false;
    if (!this.zZ)
    {
      GMTrace.o(16428920995840L, 122405);
      return;
    }
    this.zZ = false;
    removeCallbacks(this.xtc);
    if ((this.xsZ.getDrawable() instanceof AnimationDrawable))
    {
      ((AnimationDrawable)this.xsZ.getDrawable()).stop();
      ((AnimationDrawable)this.xta.getDrawable()).stop();
      ((AnimationDrawable)this.xtb.getDrawable()).stop();
    }
    GMTrace.o(16428920995840L, 122405);
  }
  
  public final void cju()
  {
    GMTrace.i(16428786778112L, 122404);
    if (!z.al(this))
    {
      this.yve = true;
      GMTrace.o(16428786778112L, 122404);
      return;
    }
    if (this.zZ)
    {
      GMTrace.o(16428786778112L, 122404);
      return;
    }
    this.zZ = true;
    cjv();
    postDelayed(this.xtc, 300L);
    GMTrace.o(16428786778112L, 122404);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(21034333896704L, 156718);
    super.onAttachedToWindow();
    if (this.yve)
    {
      this.yve = false;
      cju();
    }
    GMTrace.o(21034333896704L, 156718);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(16428652560384L, 122403);
    if ((8 == paramInt) || (4 == paramInt)) {
      ZI();
    }
    super.setVisibility(paramInt);
    GMTrace.o(16428652560384L, 122403);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\ThreeDotsLoadingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */