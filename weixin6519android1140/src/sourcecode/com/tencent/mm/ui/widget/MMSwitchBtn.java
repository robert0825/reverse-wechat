package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.b;
import com.tencent.mm.bx.a.c;
import com.tencent.mm.bx.a.h;

public class MMSwitchBtn
  extends View
{
  private int lUQ;
  private int maxHeight;
  private int maxWidth;
  private Paint npn;
  private float qon;
  private float qoo;
  public boolean xrA;
  private RectF xrB;
  private RectF xrC;
  private b xrD;
  public a xrE;
  private long xrm;
  private int xrn;
  private int xro;
  private int xrp;
  private boolean xrq;
  private boolean xrr;
  private int xrs;
  private int xrt;
  private int xru;
  private float xrv;
  private float xrw;
  private int xrx;
  private int xry;
  private int xrz;
  
  public MMSwitchBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(13067303780352L, 97359);
    this.xrq = false;
    this.xrr = false;
    this.xrt = 80;
    this.xru = 300;
    this.xrA = false;
    this.npn = new Paint(1);
    this.xrB = new RectF();
    this.xrC = new RectF();
    this.xrD = new b();
    init();
    GMTrace.o(13067303780352L, 97359);
  }
  
  public MMSwitchBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(13067169562624L, 97358);
    this.xrq = false;
    this.xrr = false;
    this.xrt = 80;
    this.xru = 300;
    this.xrA = false;
    this.npn = new Paint(1);
    this.xrB = new RectF();
    this.xrC = new RectF();
    this.xrD = new b();
    init();
    GMTrace.o(13067169562624L, 97358);
  }
  
  private void ciA()
  {
    GMTrace.i(13068377522176L, 97367);
    if (this.xrC.left > this.xrn)
    {
      mL(true);
      GMTrace.o(13068377522176L, 97367);
      return;
    }
    mL(false);
    GMTrace.o(13068377522176L, 97367);
  }
  
  private void cji()
  {
    GMTrace.i(13067840651264L, 97363);
    if (this.xrp < this.maxHeight) {
      this.xrC.top = ((this.maxHeight - this.xrp) / 2 + this.xrs);
    }
    for (this.xrC.bottom = (this.xrC.top + this.xrp - this.xrs * 2); this.xrA; this.xrC.bottom = (this.maxHeight - this.xrs))
    {
      this.xrC.left = (this.xro + this.xrs);
      this.xrC.right = (this.maxWidth - this.xrs);
      GMTrace.o(13067840651264L, 97363);
      return;
      this.xrC.top = this.xrs;
    }
    this.xrC.left = this.xrs;
    this.xrC.right = ((int)(this.xrw * 2.0F) + this.xrs);
    GMTrace.o(13067840651264L, 97363);
  }
  
  private void cjj()
  {
    GMTrace.i(13067974868992L, 97364);
    if (this.xrC.left < this.xrs) {
      this.xrC.left = this.xrs;
    }
    if (this.xrC.left > this.xro + this.xrs) {
      this.xrC.left = (this.xro + this.xrs);
    }
    this.xrC.right = (this.xrC.left + (int)(this.xrw * 2.0F));
    GMTrace.o(13067974868992L, 97364);
  }
  
  private void dS(boolean paramBoolean)
  {
    GMTrace.i(13068243304448L, 97366);
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
    GMTrace.o(13068243304448L, 97366);
  }
  
  private void init()
  {
    GMTrace.i(13067437998080L, 97360);
    this.xrs = getResources().getDimensionPixelSize(a.c.aQQ);
    this.xrv = getResources().getDimensionPixelSize(a.c.xuX);
    this.xrw = getResources().getDimensionPixelSize(a.c.xuW);
    this.xrx = getResources().getColor(a.b.white);
    this.xry = getResources().getColor(a.b.xuR);
    this.xrz = getResources().getColor(a.b.xuS);
    this.lUQ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    GMTrace.o(13067437998080L, 97360);
  }
  
  private void mL(boolean paramBoolean)
  {
    GMTrace.i(13068109086720L, 97365);
    this.xrq = true;
    this.xrD.reset();
    if (paramBoolean) {
      this.xrD.xrG = (this.xro - this.xrC.left + this.xrs);
    }
    for (this.xrD.direction = 1;; this.xrD.direction = 0)
    {
      this.xrD.xrF = this.xrC.left;
      this.xrD.setDuration(this.xrt * this.xrD.xrG / this.xro);
      startAnimation(this.xrD);
      GMTrace.o(13068109086720L, 97365);
      return;
      this.xrD.xrG = (this.xrC.left);
    }
  }
  
  public final void mK(boolean paramBoolean)
  {
    GMTrace.i(13067572215808L, 97361);
    if (this.xrA != paramBoolean)
    {
      clearAnimation();
      this.xrA = paramBoolean;
      cji();
      this.xrq = false;
      invalidate();
    }
    if (paramBoolean) {}
    for (String str = getContext().getString(a.h.xvx);; str = getContext().getString(a.h.xvy))
    {
      setContentDescription(str);
      GMTrace.o(13067572215808L, 97361);
      return;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(13068645957632L, 97369);
    this.npn.setColor(this.xry);
    this.npn.setAlpha(255);
    paramCanvas.drawRoundRect(this.xrB, this.xrv, this.xrv, this.npn);
    this.npn.setColor(this.xrz);
    this.npn.setAlpha(Math.min(255, (int)(255.0F * ((this.xrC.left - this.xrs) / this.xro))));
    paramCanvas.drawRoundRect(this.xrB, this.xrv, this.xrv, this.npn);
    this.npn.setColor(this.xrx);
    paramCanvas.drawRoundRect(this.xrC, this.xrw, this.xrw, this.npn);
    GMTrace.o(13068645957632L, 97369);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13067706433536L, 97362);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.maxWidth = (paramInt3 - paramInt1);
    this.maxHeight = (paramInt4 - paramInt2);
    this.xro = (this.maxWidth - (int)(this.xrw * 2.0F) - this.xrs * 2);
    this.xrn = (this.xro / 2);
    this.xrp = getResources().getDimensionPixelSize(a.c.xuV);
    if (this.xrp < this.maxHeight) {
      this.xrB.top = ((this.maxHeight - this.xrp) / 2);
    }
    for (this.xrB.bottom = (this.xrB.top + this.xrp);; this.xrB.bottom = this.maxHeight)
    {
      this.xrB.left = 0.0F;
      this.xrB.right = this.maxWidth;
      cji();
      this.npn.setStyle(Paint.Style.FILL);
      this.npn.setColor(this.xry);
      GMTrace.o(13067706433536L, 97362);
      return;
      this.xrB.top = 0.0F;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    GMTrace.i(13068511739904L, 97368);
    if (this.xrq)
    {
      GMTrace.o(13068511739904L, 97368);
      return true;
    }
    if (!isEnabled())
    {
      GMTrace.o(13068511739904L, 97368);
      return true;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      if (this.xrr) {
        invalidate();
      }
      GMTrace.o(13068511739904L, 97368);
      return true;
      clearAnimation();
      this.qon = paramMotionEvent.getX();
      this.qoo = paramMotionEvent.getY();
      this.xrm = SystemClock.elapsedRealtime();
      this.xrr = false;
      continue;
      float f1;
      float f2;
      if (this.xrr)
      {
        dS(true);
        f1 = paramMotionEvent.getX();
        f2 = this.qon;
        RectF localRectF = this.xrC;
        localRectF.left = (f1 - f2 + localRectF.left);
        cjj();
      }
      for (;;)
      {
        this.qon = paramMotionEvent.getX();
        this.qoo = paramMotionEvent.getY();
        break;
        float f3 = paramMotionEvent.getX() - this.qon;
        f2 = paramMotionEvent.getY() - this.qoo;
        int i = j;
        if (Math.abs(f3) >= this.lUQ / 10.0F)
        {
          f1 = f2;
          if (f2 == 0.0F) {
            f1 = 1.0F;
          }
          i = j;
          if (Math.abs(f3 / f1) > 3.0F) {
            i = 1;
          }
        }
        if (i != 0)
        {
          this.xrr = true;
          dS(true);
        }
      }
      boolean bool;
      if (SystemClock.elapsedRealtime() - this.xrm < this.xru) {
        if (!this.xrA)
        {
          bool = true;
          label325:
          mL(bool);
        }
      }
      for (;;)
      {
        dS(false);
        this.xrr = false;
        break;
        bool = false;
        break label325;
        ciA();
      }
      if (this.xrr) {
        ciA();
      }
      dS(false);
      this.xrr = false;
    }
  }
  
  public static abstract interface a
  {
    public abstract void cc(boolean paramBoolean);
  }
  
  private final class b
    extends Animation
  {
    int direction;
    float xrF;
    long xrG;
    
    public b()
    {
      GMTrace.i(13052137177088L, 97246);
      this.direction = 0;
      this.xrF = 0.0F;
      this.xrG = 0L;
      setInterpolator(new AccelerateDecelerateInterpolator());
      setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          boolean bool2 = true;
          GMTrace.i(13071598747648L, 97391);
          boolean bool3 = MMSwitchBtn.a(MMSwitchBtn.this);
          if (MMSwitchBtn.b.this.direction == 1)
          {
            bool1 = true;
            if (bool3 != bool1)
            {
              paramAnonymousAnimation = MMSwitchBtn.this;
              if (MMSwitchBtn.b.this.direction != 1) {
                break label112;
              }
            }
          }
          label112:
          for (boolean bool1 = bool2;; bool1 = false)
          {
            MMSwitchBtn.a(paramAnonymousAnimation, bool1);
            MMSwitchBtn.this.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(13069988134912L, 97379);
                if (MMSwitchBtn.b(MMSwitchBtn.this) != null) {
                  MMSwitchBtn.b(MMSwitchBtn.this).cc(MMSwitchBtn.a(MMSwitchBtn.this));
                }
                GMTrace.o(13069988134912L, 97379);
              }
            });
            MMSwitchBtn.c(MMSwitchBtn.this);
            GMTrace.o(13071598747648L, 97391);
            return;
            bool1 = false;
            break;
          }
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(13071464529920L, 97390);
          GMTrace.o(13071464529920L, 97390);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(13071330312192L, 97389);
          GMTrace.o(13071330312192L, 97389);
        }
      });
      GMTrace.o(13052137177088L, 97246);
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      GMTrace.i(13052271394816L, 97247);
      if (this.direction == 0) {}
      for (MMSwitchBtn.d(MMSwitchBtn.this).left = (this.xrF - (float)this.xrG * paramFloat);; MMSwitchBtn.d(MMSwitchBtn.this).left = (this.xrF + (float)this.xrG * paramFloat))
      {
        MMSwitchBtn.e(MMSwitchBtn.this);
        MMSwitchBtn.this.invalidate();
        GMTrace.o(13052271394816L, 97247);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\MMSwitchBtn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */