package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;

public final class r
  extends q
{
  a ivR;
  b ivS;
  private boolean ivT;
  private LinearLayout ivU;
  TextView ivV;
  private View ivW;
  ImageView ivX;
  ImageView ivY;
  ImageView ivZ;
  private long iwa;
  
  public r(Context paramContext, t paramt)
  {
    super(paramContext);
    GMTrace.i(10257992515584L, 76428);
    this.ivT = false;
    this.iwa = 0L;
    paramt.xrW = this;
    paramt.cjm();
    this.ivU = ((LinearLayout)LayoutInflater.from(getContext()).inflate(o.g.hDc, this, false));
    paramContext = this.ivU;
    this.ivE = paramContext;
    this.ivF = new FrameLayout(getContext());
    this.ivF.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.ivF.addView(paramContext);
    this.Hw = paramt;
    this.ivG = new FrameLayout(getContext());
    this.ivG.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.ivG.addView(paramt);
    addView(this.ivF);
    addView(this.ivG);
    this.ivV = ((TextView)findViewById(o.f.hBm));
    this.ivW = findViewById(o.f.hBi);
    this.ivX = ((ImageView)findViewById(o.f.hBj));
    this.ivY = ((ImageView)findViewById(o.f.hBk));
    this.ivZ = ((ImageView)findViewById(o.f.hBl));
    GMTrace.o(10257992515584L, 76428);
  }
  
  static AnimationDrawable a(int paramInt, float[] paramArrayOfFloat)
  {
    GMTrace.i(10258932039680L, 76435);
    AnimationDrawable localAnimationDrawable = new AnimationDrawable();
    localAnimationDrawable.setOneShot(false);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[0]), 0);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[1]), 300);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[2]), 300);
    localAnimationDrawable.addFrame(f(paramInt, paramArrayOfFloat[3]), 300);
    GMTrace.o(10258932039680L, 76435);
    return localAnimationDrawable;
  }
  
  private static Drawable f(int paramInt, float paramFloat)
  {
    GMTrace.i(10259066257408L, 76436);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.setIntrinsicHeight(32);
    localShapeDrawable.setIntrinsicWidth(32);
    localShapeDrawable.getPaint().setColor(paramInt);
    localShapeDrawable.getPaint().setAlpha((int)(255.0F * paramFloat));
    GMTrace.o(10259066257408L, 76436);
    return localShapeDrawable;
  }
  
  protected final void ZD()
  {
    GMTrace.i(10258126733312L, 76429);
    ((AnimationDrawable)this.ivX.getDrawable()).start();
    ((AnimationDrawable)this.ivY.getDrawable()).start();
    ((AnimationDrawable)this.ivZ.getDrawable()).start();
    if (this.ivR != null) {
      this.ivR.Zz();
    }
    this.iwa = System.currentTimeMillis();
    GMTrace.o(10258126733312L, 76429);
  }
  
  protected final void ZE()
  {
    GMTrace.i(10258260951040L, 76430);
    ZI();
    GMTrace.o(10258260951040L, 76430);
  }
  
  protected final int ZG()
  {
    GMTrace.i(10258663604224L, 76433);
    int i = this.ivU.getHeight();
    GMTrace.o(10258663604224L, 76433);
    return i;
  }
  
  public final void ZH()
  {
    GMTrace.i(10258529386496L, 76432);
    long l = System.currentTimeMillis() - this.iwa;
    if (l < 1000L)
    {
      postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10222022164480L, 76160);
          r.this.ZC();
          GMTrace.o(10222022164480L, 76160);
        }
      }, 1000L - l);
      GMTrace.o(10258529386496L, 76432);
      return;
    }
    ZC();
    GMTrace.o(10258529386496L, 76432);
  }
  
  public final void ZI()
  {
    GMTrace.i(10258797821952L, 76434);
    ((AnimationDrawable)this.ivX.getDrawable()).stop();
    ((AnimationDrawable)this.ivX.getDrawable()).selectDrawable(0);
    ((AnimationDrawable)this.ivY.getDrawable()).stop();
    ((AnimationDrawable)this.ivY.getDrawable()).selectDrawable(0);
    ((AnimationDrawable)this.ivZ.getDrawable()).stop();
    ((AnimationDrawable)this.ivZ.getDrawable()).selectDrawable(0);
    GMTrace.o(10258797821952L, 76434);
  }
  
  public final void cs(boolean paramBoolean)
  {
    GMTrace.i(17659026472960L, 131570);
    this.ivT = paramBoolean;
    this.ivI = paramBoolean;
    View localView = this.ivW;
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      GMTrace.o(17659026472960L, 131570);
      return;
    }
  }
  
  protected final void jj(int paramInt)
  {
    GMTrace.i(10258395168768L, 76431);
    if (this.ivS != null) {
      this.ivS.ji(paramInt);
    }
    if (!this.ivT)
    {
      GMTrace.o(10258395168768L, 76431);
      return;
    }
    int i = paramInt;
    if (paramInt > this.ivU.getHeight()) {
      i = this.ivU.getHeight();
    }
    this.ivU.setTranslationY(i - this.ivU.getHeight());
    GMTrace.o(10258395168768L, 76431);
  }
  
  public static abstract interface a
  {
    public abstract void Zz();
  }
  
  public static abstract interface b
  {
    public abstract void ji(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */