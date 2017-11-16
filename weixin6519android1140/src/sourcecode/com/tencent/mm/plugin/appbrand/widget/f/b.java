package com.tencent.mm.plugin.appbrand.widget.f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.tencent.gmtrace.GMTrace;

public final class b
  extends ReplacementSpan
{
  private final int backgroundColor;
  private final float gbV;
  private final int paddingLeft;
  private final int paddingRight;
  private final int radius;
  private final String text;
  private final int textColor;
  
  public b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(14323313278976L, 106717);
    this.gbV = paramInt3;
    this.text = paramString;
    this.textColor = -1;
    this.backgroundColor = paramInt4;
    this.radius = paramInt5;
    this.paddingLeft = paramInt1;
    this.paddingRight = paramInt2;
    GMTrace.o(14323313278976L, 106717);
  }
  
  public final int a(Paint paramPaint)
  {
    GMTrace.i(14323447496704L, 106718);
    Paint localPaint = paramPaint;
    if (paramPaint == null) {
      localPaint = new Paint();
    }
    localPaint.setTextSize(this.gbV);
    int i = (int)localPaint.measureText(this.text);
    int j = this.paddingLeft;
    int k = this.paddingRight;
    int m = this.radius;
    GMTrace.o(14323447496704L, 106718);
    return i + j + k + m * 2;
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    GMTrace.i(14323715932160L, 106720);
    paramPaint.setTextSize(this.gbV);
    paramPaint.setAntiAlias(true);
    paramCharSequence = new RectF();
    paramCharSequence.left = ((int)paramFloat + this.paddingLeft);
    Paint.FontMetricsInt localFontMetricsInt = paramPaint.getFontMetricsInt();
    paramInt1 = Math.max(0, (paramInt5 - paramInt3 - localFontMetricsInt.descent + localFontMetricsInt.top) / 2 - this.radius);
    paramCharSequence.top = (paramInt3 + paramInt1);
    paramCharSequence.bottom = (paramInt5 - paramInt1);
    paramCharSequence.right = (paramCharSequence.left + (int)paramPaint.measureText(this.text) + this.radius * 2);
    paramPaint.setColor(this.backgroundColor);
    paramCanvas.drawRoundRect(paramCharSequence, this.radius, this.radius, paramPaint);
    paramPaint.setColor(this.textColor);
    paramCanvas.drawText(this.text, paramCharSequence.left + this.radius, paramCharSequence.top + this.radius - localFontMetricsInt.top, paramPaint);
    GMTrace.o(14323715932160L, 106720);
  }
  
  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    GMTrace.i(14323581714432L, 106719);
    paramInt1 = a(paramPaint);
    GMTrace.o(14323581714432L, 106719);
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */