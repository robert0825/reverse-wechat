package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.m;

public class MMVerticalTextView
  extends View
{
  private int direction;
  private TextPaint fB;
  private String iJz;
  Rect wfM;
  
  public MMVerticalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3366046400512L, 25079);
    this.wfM = new Rect();
    this.fB = new TextPaint();
    this.fB.setAntiAlias(true);
    this.fB.setTextSize(15.0F);
    this.fB.setColor(-16777216);
    this.fB.setTextAlign(Paint.Align.CENTER);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.eoj);
    int i = paramAttributeSet.getResourceId(a.m.ghq, 0);
    if (i != 0) {
      this.iJz = paramContext.getString(i);
    }
    i = paramAttributeSet.getDimensionPixelOffset(a.m.ght, 15);
    if (i > 0) {
      this.fB.setTextSize(i);
    }
    this.fB.setColor(paramAttributeSet.getColor(a.m.ghs, -16777216));
    this.direction = paramAttributeSet.getInt(a.m.ghp, 0);
    boolean bool = paramAttributeSet.getBoolean(a.m.ghr, false);
    this.fB.setFakeBoldText(bool);
    paramAttributeSet.recycle();
    requestLayout();
    invalidate();
    GMTrace.o(3366046400512L, 25079);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3366449053696L, 25082);
    super.onDraw(paramCanvas);
    int i = getHeight();
    Path localPath = new Path();
    int j;
    if (this.direction == 0)
    {
      j = (getWidth() >> 1) - (this.wfM.height() >> 1);
      localPath.moveTo(j, 0.0F);
      localPath.lineTo(j, i);
    }
    for (;;)
    {
      paramCanvas.drawTextOnPath(this.iJz, localPath, 0.0F, 0.0F, this.fB);
      GMTrace.o(3366449053696L, 25082);
      return;
      j = (getWidth() >> 1) + (this.wfM.height() >> 1);
      localPath.moveTo(j, i);
      localPath.lineTo(j, 0.0F);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3366314835968L, 25081);
    this.fB.getTextBounds(this.iJz, 0, this.iJz.length(), this.wfM);
    int j = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (j == 1073741824) {}
    for (;;)
    {
      j = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (j == 1073741824) {}
      int i;
      for (;;)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        GMTrace.o(3366314835968L, 25081);
        return;
        i = this.wfM.height();
        if (j != Integer.MIN_VALUE) {
          break label137;
        }
        paramInt1 = Math.min(i, paramInt1);
        break;
        i = this.wfM.width();
        if (j == Integer.MIN_VALUE) {
          paramInt2 = Math.min(i, paramInt2);
        } else {
          paramInt2 = i;
        }
      }
      label137:
      paramInt1 = i;
    }
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(3366180618240L, 25080);
    this.iJz = paramString;
    requestLayout();
    invalidate();
    GMTrace.o(3366180618240L, 25080);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\MMVerticalTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */