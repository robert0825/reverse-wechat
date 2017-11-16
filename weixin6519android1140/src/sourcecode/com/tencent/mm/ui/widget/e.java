package com.tencent.mm.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.tencent.gmtrace.GMTrace;

public final class e
  extends ImageSpan
{
  public int xpz;
  
  public e(Drawable paramDrawable)
  {
    super(paramDrawable, 1);
    GMTrace.i(1611686477824L, 12008);
    this.xpz = 0;
    GMTrace.o(1611686477824L, 12008);
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    GMTrace.i(1611954913280L, 12010);
    paramCharSequence = getDrawable();
    paramCanvas.save();
    paramPaint = paramPaint.getFontMetricsInt();
    paramInt1 = paramPaint.descent;
    paramInt2 = paramPaint.ascent;
    paramCanvas.translate(paramFloat, paramPaint.descent + paramInt4 - (paramInt1 - paramInt2) / 2 - (paramCharSequence.getBounds().bottom - paramCharSequence.getBounds().top) / 2);
    paramCharSequence.draw(paramCanvas);
    paramCanvas.restore();
    GMTrace.o(1611954913280L, 12010);
  }
  
  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    GMTrace.i(1611820695552L, 12009);
    paramCharSequence = getDrawable().getBounds();
    if (paramFontMetricsInt != null)
    {
      paramPaint = paramPaint.getFontMetricsInt();
      paramInt2 = paramPaint.descent;
      int i = paramPaint.ascent;
      paramInt1 = paramCharSequence.bottom - paramCharSequence.top;
      paramInt2 = paramPaint.ascent + (paramInt2 - i) / 2;
      paramFontMetricsInt.ascent = (paramInt2 - paramInt1 / 2);
      paramFontMetricsInt.top = paramFontMetricsInt.ascent;
      paramFontMetricsInt.bottom = (paramInt2 + paramInt1 / 2);
      paramFontMetricsInt.descent = paramFontMetricsInt.bottom;
    }
    paramInt1 = paramCharSequence.right;
    GMTrace.o(1611820695552L, 12009);
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */