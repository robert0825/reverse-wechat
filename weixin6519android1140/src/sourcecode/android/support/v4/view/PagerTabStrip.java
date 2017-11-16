package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class PagerTabStrip
  extends PagerTitleStrip
{
  private final Rect dF = new Rect();
  private int hQ;
  private int wG = this.xj;
  private int wH;
  private int wI;
  private int wJ;
  private int wK;
  private int wL;
  private final Paint wM = new Paint();
  private int wN = 255;
  private boolean wO = false;
  private boolean wP = false;
  private int wQ;
  private boolean wR;
  private float wS;
  private float wT;
  
  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.wM.setColor(this.wG);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.wH = ((int)(3.0F * f + 0.5F));
    this.wI = ((int)(6.0F * f + 0.5F));
    this.wJ = ((int)(64.0F * f));
    this.wL = ((int)(16.0F * f + 0.5F));
    this.wQ = ((int)(1.0F * f + 0.5F));
    this.wK = ((int)(f * 32.0F + 0.5F));
    this.hQ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    U(this.xb);
    setWillNotDraw(false);
    this.wW.setFocusable(true);
    this.wW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        PagerTabStrip.this.wV.Y(PagerTabStrip.this.wV.xI - 1);
      }
    });
    this.wY.setFocusable(true);
    this.wY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        PagerTabStrip.this.wV.Y(PagerTabStrip.this.wV.xI + 1);
      }
    });
    if (getBackground() == null) {
      this.wO = true;
    }
  }
  
  public final void U(int paramInt)
  {
    int i = paramInt;
    if (paramInt < this.wJ) {
      i = this.wJ;
    }
    super.U(i);
  }
  
  final void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = this.dF;
    int i = getHeight();
    int j = this.wX.getLeft();
    int k = this.wL;
    int m = this.wX.getRight();
    int n = this.wL;
    int i1 = i - this.wH;
    localRect.set(j - k, i1, m + n, i);
    super.a(paramInt, paramFloat, paramBoolean);
    this.wN = ((int)(Math.abs(paramFloat - 0.5F) * 2.0F * 255.0F));
    localRect.union(this.wX.getLeft() - this.wL, i1, this.wX.getRight() + this.wL, i);
    invalidate(localRect);
  }
  
  final int getMinHeight()
  {
    return Math.max(super.getMinHeight(), this.wK);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = this.wX.getLeft();
    int k = this.wL;
    int m = this.wX.getRight();
    int n = this.wL;
    int i1 = this.wH;
    this.wM.setColor(this.wN << 24 | this.wG & 0xFFFFFF);
    paramCanvas.drawRect(j - k, i - i1, m + n, i, this.wM);
    if (this.wO)
    {
      this.wM.setColor(0xFF000000 | this.wG & 0xFFFFFF);
      paramCanvas.drawRect(getPaddingLeft(), i - this.wQ, getWidth() - getPaddingRight(), i, this.wM);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i != 0) && (this.wR)) {
      return false;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    }
    for (;;)
    {
      return true;
      this.wS = f1;
      this.wT = f2;
      this.wR = false;
      continue;
      if ((Math.abs(f1 - this.wS) > this.hQ) || (Math.abs(f2 - this.wT) > this.hQ))
      {
        this.wR = true;
        continue;
        if (f1 < this.wX.getLeft() - this.wL) {
          this.wV.Y(this.wV.xI - 1);
        } else if (f1 > this.wX.getRight() + this.wL) {
          this.wV.Y(this.wV.xI + 1);
        }
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (!this.wP) {
      if ((0xFF000000 & paramInt) != 0) {
        break label27;
      }
    }
    label27:
    for (boolean bool = true;; bool = false)
    {
      this.wO = bool;
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (!this.wP) {
      if (paramDrawable != null) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.wO = bool;
      return;
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (!this.wP) {
      if (paramInt != 0) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.wO = bool;
      return;
    }
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt4;
    if (paramInt4 < this.wI) {
      i = this.wI;
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\PagerTabStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */