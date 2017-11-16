package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public class LineLinearLayout
  extends LinearLayout
{
  private Rect eI;
  private int jMv;
  private Paint mPaint;
  
  public LineLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(4889417613312L, 36429);
    GMTrace.o(4889417613312L, 36429);
  }
  
  public LineLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4889551831040L, 36430);
    setWillNotDraw(false);
    this.eI = new Rect();
    this.mPaint = new Paint();
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setColor(-571543826);
    this.mPaint.setStrokeWidth(Math.round(a.getDensity(getContext()) * 0.5F));
    this.jMv = a.fromDPToPix(paramContext, 44);
    GMTrace.o(4889551831040L, 36430);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4889686048768L, 36431);
    int j = getMeasuredHeight();
    Paint localPaint = this.mPaint;
    int i = 1;
    while (this.jMv * i < j)
    {
      paramCanvas.drawLine(0.0F, this.jMv * i, getMeasuredWidth(), this.jMv * i, localPaint);
      i += 1;
    }
    super.onDraw(paramCanvas);
    GMTrace.o(4889686048768L, 36431);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\widget\LineLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */