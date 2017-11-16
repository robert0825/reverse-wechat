package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.tencent.gmtrace.GMTrace;

public final class m
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  public static float she;
  private float mej;
  private final int sgT;
  public boolean sgU;
  private final int shc;
  private float shd;
  
  static
  {
    GMTrace.i(20633828196352L, 153734);
    she = 0.0F;
    GMTrace.o(20633828196352L, 153734);
  }
  
  private m(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(20633157107712L, 153729);
    this.mej = 10.0F;
    this.shc = paramInt1;
    this.sgT = paramInt2;
    this.sgU = paramBoolean;
    GMTrace.o(20633157107712L, 153729);
  }
  
  public m(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(20633022889984L, 153728);
    this.mej = 10.0F;
    this.shc = paramInt1;
    this.sgT = paramInt2;
    if ((paramBoolean1) && (paramBoolean3) && (!paramBoolean2)) {}
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      this.sgU = paramBoolean1;
      GMTrace.o(20633022889984L, 153728);
      return;
    }
  }
  
  public final void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    GMTrace.i(20633425543168L, 153731);
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.sgU) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramCharSequence = paramPaint.getStyle();
      float f = paramPaint.getTextSize();
      paramPaint.setStyle(Paint.Style.FILL);
      this.mej = (paramInt4 - paramInt3);
      this.shd = paramPaint.measureText(this.shc + ".");
      paramCanvas.drawText(this.shc + ".", paramInt1, paramInt4, paramPaint);
      paramPaint.setStyle(paramCharSequence);
      paramPaint.setTextSize(f);
    }
    GMTrace.o(20633425543168L, 153731);
  }
  
  public final int getLeadingMargin(boolean paramBoolean)
  {
    GMTrace.i(20633291325440L, 153730);
    if (this.shd + 2.0F > she) {}
    for (float f = this.shd + 2.0F;; f = she)
    {
      she = Math.max(Math.round(f), this.sgT);
      if (!this.sgU) {
        break;
      }
      GMTrace.o(20633291325440L, 153730);
      return 0;
    }
    int i = (int)she;
    GMTrace.o(20633291325440L, 153730);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */