package com.tencent.mm.ui.base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;

public final class d
  implements LineBackgroundSpan
{
  int end;
  private TextView nJt;
  private Rect rect;
  private final int rz;
  int start;
  
  public d(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(20297747005440L, 151230);
    this.rz = paramInt1;
    this.start = paramInt2;
    this.end = paramInt3;
    this.rect = new Rect();
    this.nJt = paramTextView;
    GMTrace.o(20297747005440L, 151230);
  }
  
  public final void drawBackground(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, int paramInt8)
  {
    GMTrace.i(20297881223168L, 151231);
    if (this.end < paramInt6)
    {
      GMTrace.o(20297881223168L, 151231);
      return;
    }
    if (this.start > paramInt7)
    {
      GMTrace.o(20297881223168L, 151231);
      return;
    }
    int i = paramPaint.getColor();
    paramCharSequence = this.nJt.getLayout();
    int k = paramCharSequence.getLineForOffset(this.start);
    int j = paramCharSequence.getLineForOffset(this.end);
    Math.min(paramInt7, this.end);
    paramInt7 = paramInt1;
    paramInt5 = paramInt2;
    if (k <= paramInt8)
    {
      paramInt7 = paramInt1;
      paramInt5 = paramInt2;
      if (paramInt8 <= j)
      {
        if (k == paramInt8) {
          paramInt1 = (int)paramCharSequence.getPrimaryHorizontal(this.start);
        }
        if (j != paramInt8) {
          break label290;
        }
        paramInt5 = (int)paramCharSequence.getPrimaryHorizontal(this.end);
      }
    }
    for (paramInt7 = paramInt1;; paramInt7 = paramInt1)
    {
      paramInt1 = (int)(paramInt4 + paramPaint.descent());
      this.rect.left = paramInt7;
      if (this.start == paramInt6)
      {
        paramCharSequence = this.rect;
        paramCharSequence.left -= 4;
      }
      this.rect.right = paramInt5;
      if (this.end == paramInt5)
      {
        paramCharSequence = this.rect;
        paramCharSequence.right += 4;
      }
      this.rect.top = paramInt3;
      this.rect.bottom = paramInt1;
      paramPaint.setColor(this.rz);
      paramCanvas.drawRect(this.rect, paramPaint);
      paramPaint.setColor(i);
      GMTrace.o(20297881223168L, 151231);
      return;
      label290:
      paramInt5 = (int)paramCharSequence.getLineWidth(paramInt8);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */