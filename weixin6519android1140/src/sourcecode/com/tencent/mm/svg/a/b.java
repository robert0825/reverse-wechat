package com.tencent.mm.svg.a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Gravity;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.b.c;

public abstract class b
  extends Drawable
{
  protected View kZL;
  public long mDuration;
  protected final Rect to;
  protected boolean vEA;
  protected Paint vEB;
  protected int vEC;
  protected int vED;
  protected int vEE;
  protected int vEF;
  protected float vEG;
  protected int vEz;
  
  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(3482547388416L, 25947);
    this.mDuration = 0L;
    this.vEz = 0;
    this.to = new Rect();
    this.vEA = false;
    this.vEB = new Paint();
    this.vEC = 0;
    this.vED = 0;
    this.vEE = 0;
    this.vEF = 0;
    this.vEE = paramInt1;
    this.vEF = paramInt2;
    this.vEG = 1.0F;
    this.vEC = this.vEE;
    this.vED = this.vEF;
    setLevel(10000);
    this.vEz = paramInt3;
    GMTrace.o(3482547388416L, 25947);
  }
  
  private void bVt()
  {
    GMTrace.i(3483218477056L, 25952);
    this.kZL = a.u(this);
    if (this.kZL != null) {
      a.b(this.kZL, this.vEB);
    }
    GMTrace.o(3483218477056L, 25952);
  }
  
  protected final void bVr()
  {
    GMTrace.i(3482681606144L, 25948);
    this.to.set(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
    GMTrace.o(3482681606144L, 25948);
  }
  
  protected final void bVs()
  {
    GMTrace.i(3483084259328L, 25951);
    if (this.vEA)
    {
      Rect localRect = getBounds();
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), localRect, this.to);
    }
    this.vEA = false;
    GMTrace.o(3483084259328L, 25951);
  }
  
  public int getIntrinsicHeight()
  {
    GMTrace.i(3484158001152L, 25959);
    int i = this.vED;
    GMTrace.o(3484158001152L, 25959);
    return i;
  }
  
  public int getIntrinsicWidth()
  {
    GMTrace.i(3484023783424L, 25958);
    int i = this.vEC;
    GMTrace.o(3484023783424L, 25958);
    return i;
  }
  
  public int getOpacity()
  {
    GMTrace.i(3483755347968L, 25956);
    if ((this.kZL != null) && (this.kZL.getAlpha() < 1.0F))
    {
      GMTrace.o(3483755347968L, 25956);
      return -3;
    }
    if ((this.vEB != null) && (this.vEB.getAlpha() < 255))
    {
      GMTrace.o(3483755347968L, 25956);
      return -3;
    }
    GMTrace.o(3483755347968L, 25956);
    return 0;
  }
  
  protected final void i(Canvas paramCanvas)
  {
    GMTrace.i(3483889565696L, 25957);
    if (com.tencent.mm.svg.b.b.bVw())
    {
      int i = this.to.height() / 3;
      paramCanvas.save();
      Paint localPaint = new Paint();
      localPaint.setStyle(Paint.Style.FILL);
      localPaint.setColor(-12303292);
      localPaint.setAlpha(127);
      localPaint.setTextSize(i);
      localPaint.setStrokeWidth(1.0F);
      float f = localPaint.measureText("SVG");
      paramCanvas.translate(this.to.width() - f, this.to.height() * 2 / 3);
      paramCanvas.drawText("SVG", 0.0F, i, localPaint);
      paramCanvas.restore();
    }
    GMTrace.o(3483889565696L, 25957);
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    GMTrace.i(3482815823872L, 25949);
    super.onBoundsChange(paramRect);
    this.vEA = true;
    GMTrace.o(3482815823872L, 25949);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    GMTrace.i(3482950041600L, 25950);
    bVt();
    boolean bool = super.onLevelChange(paramInt);
    GMTrace.o(3482950041600L, 25950);
    return bool;
  }
  
  @TargetApi(17)
  public void setAlpha(int paramInt)
  {
    GMTrace.i(3483486912512L, 25954);
    this.vEB.setAlpha(paramInt);
    if ((this.kZL != null) && (Build.VERSION.SDK_INT >= 17)) {
      try
      {
        this.kZL.setLayerPaint(this.vEB);
        GMTrace.o(3483486912512L, 25954);
        return;
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        c.printErrStackTrace("MicroMsg.SVGDrawable", localNoSuchMethodError, "fucking samsung", new Object[0]);
      }
    }
    GMTrace.o(3483486912512L, 25954);
  }
  
  @TargetApi(17)
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(3483621130240L, 25955);
    this.vEB.setColorFilter(paramColorFilter);
    if ((this.kZL != null) && (Build.VERSION.SDK_INT >= 17)) {
      try
      {
        this.kZL.setLayerPaint(this.vEB);
        GMTrace.o(3483621130240L, 25955);
        return;
      }
      catch (NoSuchMethodError paramColorFilter)
      {
        c.printErrStackTrace("MicroMsg.SVGDrawable", paramColorFilter, "fucking samsung", new Object[0]);
      }
    }
    GMTrace.o(3483621130240L, 25955);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(3483352694784L, 25953);
    bVt();
    paramBoolean1 = super.setVisible(paramBoolean1, paramBoolean2);
    GMTrace.o(3483352694784L, 25953);
    return paramBoolean1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */