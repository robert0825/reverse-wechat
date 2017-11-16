package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bg.a.c;

public class SelectColorBar
  extends View
{
  public static final int[] xBe;
  private Paint fWp;
  private final float xAP;
  public a xBF;
  private int xBG;
  private Rect[] xBa;
  private boolean xBh;
  private Paint xzu;
  
  static
  {
    GMTrace.i(19635114082304L, 146293);
    xBe = new int[] { -1, -16777216, -707825, 47944, -16535286, -15172610, -7054596, -449092 };
    GMTrace.o(19635114082304L, 146293);
  }
  
  public SelectColorBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19634442993664L, 146288);
    this.xAP = getResources().getDimension(a.c.tkQ);
    this.xBG = -1;
    this.xBh = true;
    this.xzu = new Paint(1);
    this.xzu.setColor(-16711936);
    this.xBa = new Rect[xBe.length];
    this.fWp = new Paint(1);
    this.fWp.setStyle(Paint.Style.FILL);
    this.fWp.setStrokeCap(Paint.Cap.ROUND);
    GMTrace.o(19634442993664L, 146288);
  }
  
  private int ckZ()
  {
    GMTrace.i(19634979864576L, 146292);
    int i = (int)getResources().getDimension(a.c.tkH);
    GMTrace.o(19634979864576L, 146292);
    return i;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(19634711429120L, 146290);
    int k = (int)paramMotionEvent.getX();
    int m = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(19634711429120L, 146290);
      return true;
      do
      {
        i += 1;
        if (i >= this.xBa.length) {
          break;
        }
      } while (!this.xBa[i].contains(k, m));
      this.xBG = i;
      continue;
      do
      {
        j += 1;
        if ((this.xBa == null) || (j >= this.xBa.length)) {
          break;
        }
      } while ((!this.xBa[j].contains(k, m)) || (j != this.xBG) || (this.xBF == null));
      this.xBF.EB(xBe[j]);
      requestLayout();
      postInvalidate();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19634845646848L, 146291);
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0);
    float f4 = getResources().getDimension(a.c.tkM);
    float f5 = (getMeasuredWidth() - (int)(this.xAP * 2.0F) - 2.0F * f4 * xBe.length) / (xBe.length - 1);
    float f1 = (int)(this.xAP * 2.0F) / 2;
    float f6 = 1.0F * ckZ() / 2.0F;
    float f2 = f1 + f4 + 5.0F;
    int i = 0;
    if (i < xBe.length)
    {
      float f3 = 0.0F;
      if (this.xBG == i)
      {
        this.xBh = false;
        f1 = 6.0F;
      }
      for (;;)
      {
        this.fWp.setColor(-1);
        paramCanvas.drawCircle(f2, f6, f4 + 5.0F + f1, this.fWp);
        this.fWp.setColor(xBe[i]);
        paramCanvas.drawCircle(f2, f6, f1 + f4, this.fWp);
        f2 += 2.0F * f4 + f5;
        i += 1;
        break;
        f1 = f3;
        if (this.xBh)
        {
          f1 = f3;
          if (i == 2) {
            f1 = 6.0F;
          }
        }
      }
    }
    GMTrace.o(19634845646848L, 146291);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(19634577211392L, 146289);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = getPaddingLeft();
    int i = getPaddingRight();
    int j = View.MeasureSpec.makeMeasureSpec((int)getResources().getDimension(a.c.tkH), 1073741824);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1 - paramInt2 - i, 1073741824), j);
    if (this.xBa == null) {
      this.xBa = new Rect[xBe.length];
    }
    float f1 = getResources().getDimension(a.c.tkM);
    float f2 = (getMeasuredWidth() - (int)(2.0F * this.xAP) - 2.0F * f1 * xBe.length) / (xBe.length - 1);
    i = (int)(2.0F * f1);
    paramInt2 = (int)((int)(2.0F * this.xAP) / 2 + f1 + 5.0F);
    j = ckZ() / 2;
    paramInt1 = 0;
    while (paramInt1 < xBe.length)
    {
      this.xBa[paramInt1] = new Rect(paramInt2 - i, j - i, paramInt2 + i, j + i);
      paramInt2 = (int)(paramInt2 + (2.0F * f1 + f2));
      paramInt1 += 1;
    }
    GMTrace.o(19634577211392L, 146289);
  }
  
  public static abstract interface a
  {
    public abstract void EB(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\footer\SelectColorBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */