package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.tencent.gmtrace.GMTrace;

public final class d
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  private static Path sgS;
  private final int sgT;
  public boolean sgU;
  
  static
  {
    GMTrace.i(20625640914944L, 153673);
    sgS = null;
    GMTrace.o(20625640914944L, 153673);
  }
  
  private d(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20624969826304L, 153668);
    this.sgT = paramInt;
    this.sgU = paramBoolean;
    GMTrace.o(20624969826304L, 153668);
  }
  
  public d(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(20624835608576L, 153667);
    this.sgT = paramInt;
    if ((paramBoolean1) && (paramBoolean3) && (!paramBoolean2)) {}
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      this.sgU = paramBoolean1;
      if (sgS == null) {
        sgS = new Path();
      }
      GMTrace.o(20624835608576L, 153667);
      return;
    }
  }
  
  public final void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    GMTrace.i(20625238261760L, 153670);
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.sgU) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramCharSequence = paramPaint.getStyle();
      paramPaint.setStyle(Paint.Style.FILL);
      sgS.reset();
      sgS.addCircle(0.0F, 0.0F, 6.0F, Path.Direction.CW);
      paramLayout = paramPaint.getFontMetricsInt();
      paramInt3 = paramLayout.descent;
      paramInt3 = (paramLayout.ascent + (paramInt3 + paramInt4 + paramInt4)) / 2;
      paramCanvas.save();
      paramCanvas.translate(paramInt2 * 6 + paramInt1, paramInt3);
      paramCanvas.drawPath(sgS, paramPaint);
      paramCanvas.restore();
      paramPaint.setStyle(paramCharSequence);
    }
    GMTrace.o(20625238261760L, 153670);
  }
  
  public final int getLeadingMargin(boolean paramBoolean)
  {
    GMTrace.i(20625104044032L, 153669);
    if (this.sgU)
    {
      GMTrace.o(20625104044032L, 153669);
      return 0;
    }
    int i = this.sgT;
    GMTrace.o(20625104044032L, 153669);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */