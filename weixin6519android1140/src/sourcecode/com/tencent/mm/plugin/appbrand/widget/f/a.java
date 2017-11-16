package com.tencent.mm.plugin.appbrand.widget.f;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;
import com.tencent.gmtrace.GMTrace;

public final class a
  implements LineHeightSpan
{
  private final int gravity;
  public int height;
  
  public a(float paramFloat)
  {
    GMTrace.i(17274224246784L, 128703);
    this.height = Math.round(paramFloat);
    this.gravity = 16;
    GMTrace.o(17274224246784L, 128703);
  }
  
  public final boolean X(float paramFloat)
  {
    GMTrace.i(17631646056448L, 131366);
    if (this.height != Math.round(paramFloat))
    {
      GMTrace.o(17631646056448L, 131366);
      return true;
    }
    GMTrace.o(17631646056448L, 131366);
    return false;
  }
  
  public final void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt)
  {
    GMTrace.i(17274358464512L, 128704);
    if (-paramFontMetricsInt.ascent > this.height)
    {
      paramInt1 = -this.height;
      paramFontMetricsInt.ascent = paramInt1;
      paramFontMetricsInt.top = paramInt1;
      paramFontMetricsInt.descent = 0;
      paramFontMetricsInt.bottom = 0;
      GMTrace.o(17274358464512L, 128704);
      return;
    }
    if (-paramFontMetricsInt.ascent + paramFontMetricsInt.descent > this.height)
    {
      paramFontMetricsInt.descent = paramFontMetricsInt.bottom;
      paramInt1 = paramFontMetricsInt.descent - this.height;
      paramFontMetricsInt.ascent = paramInt1;
      paramFontMetricsInt.top = paramInt1;
      GMTrace.o(17274358464512L, 128704);
      return;
    }
    if (-paramFontMetricsInt.ascent + paramFontMetricsInt.bottom > this.height)
    {
      paramFontMetricsInt.top = paramFontMetricsInt.ascent;
      paramFontMetricsInt.bottom = (paramFontMetricsInt.ascent + this.height);
      GMTrace.o(17274358464512L, 128704);
      return;
    }
    if (-paramFontMetricsInt.top + paramFontMetricsInt.bottom > this.height)
    {
      paramFontMetricsInt.top = (paramFontMetricsInt.bottom - this.height);
      GMTrace.o(17274358464512L, 128704);
      return;
    }
    paramInt1 = this.height - (-paramFontMetricsInt.ascent + paramFontMetricsInt.descent);
    if (this.gravity == 48)
    {
      paramFontMetricsInt.descent += paramInt1;
      paramFontMetricsInt.bottom = (paramInt1 + paramFontMetricsInt.bottom);
      GMTrace.o(17274358464512L, 128704);
      return;
    }
    if (this.gravity == 80)
    {
      paramFontMetricsInt.top -= paramInt1;
      paramFontMetricsInt.ascent -= paramInt1;
      GMTrace.o(17274358464512L, 128704);
      return;
    }
    if (this.gravity == 16)
    {
      paramInt1 = Math.round(paramInt1 / 2.0F);
      paramFontMetricsInt.top -= paramInt1;
      paramFontMetricsInt.ascent -= paramInt1;
      paramFontMetricsInt.bottom += paramInt1;
      paramFontMetricsInt.descent = (paramInt1 + paramFontMetricsInt.descent);
    }
    GMTrace.o(17274358464512L, 128704);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */