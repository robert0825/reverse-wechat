package com.tencent.mm.kiss.widget.textview.a;

import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  public TextPaint gbA;
  public int gbS;
  public Typeface gbT;
  public int gbU;
  public float gbV;
  public Layout.Alignment gbp;
  public TextUtils.TruncateAt gbq;
  public TextDirectionHeuristic gbs;
  public float gbt;
  public float gbu;
  public boolean gbv;
  public int gravity;
  public int linkColor;
  public int maxLength;
  public int maxLines;
  public int minLines;
  public int textColor;
  
  public a()
  {
    GMTrace.i(432717955072L, 3224);
    this.maxLines = -1;
    this.minLines = -1;
    this.maxLength = -1;
    this.gbA = null;
    this.gbp = Layout.Alignment.ALIGN_NORMAL;
    this.gbq = null;
    this.gravity = 51;
    this.gbS = -1;
    this.gbs = null;
    this.gbt = 0.0F;
    this.gbu = 1.0F;
    this.gbv = false;
    this.gbT = null;
    this.gbU = -1;
    this.gbV = -1.0F;
    this.textColor = -1;
    this.linkColor = -1;
    GMTrace.o(432717955072L, 3224);
  }
  
  public final int hashCode()
  {
    GMTrace.i(432986390528L, 3226);
    int j = this.maxLines * 31 + 0 + this.maxLength * 31;
    int i = j;
    if (this.gbA != null) {
      i = j + this.gbA.hashCode() * 31;
    }
    j = i + this.gbp.hashCode() * 31;
    i = j;
    if (this.gbq != null) {
      i = j + this.gbq.hashCode() * 31;
    }
    j = i + this.gravity * 31 + this.gbS * 31;
    i = j;
    if (this.gbs != null) {
      i = j + this.gbs.hashCode() * 31;
    }
    j = (int)((int)(i + this.gbt * 31.0F) + this.gbu * 31.0F);
    if (this.gbv) {}
    for (i = 1;; i = 0)
    {
      j = i * 31 + j;
      i = j;
      if (this.gbT != null) {
        i = j + this.gbT.hashCode() * 31;
      }
      i = (int)(i + this.gbU * 31 + this.gbV * 31.0F);
      j = this.textColor;
      int k = this.linkColor;
      GMTrace.o(432986390528L, 3226);
      return i + j * 31 + k * 31;
    }
  }
  
  public final String toString()
  {
    GMTrace.i(432852172800L, 3225);
    Object localObject = new StringBuilder("");
    ((StringBuilder)localObject).append(String.format("maxLines: %d ", new Object[] { Integer.valueOf(this.maxLines) }));
    ((StringBuilder)localObject).append(String.format("maxLength: %d ", new Object[] { Integer.valueOf(this.maxLength) }));
    ((StringBuilder)localObject).append(String.format("textPaint: %s ", new Object[] { this.gbA }));
    ((StringBuilder)localObject).append(String.format("alignment: %s ", new Object[] { this.gbp }));
    ((StringBuilder)localObject).append(String.format("ellipsize: %s ", new Object[] { this.gbq }));
    ((StringBuilder)localObject).append(String.format("gravity: %s ", new Object[] { Integer.valueOf(this.gravity) }));
    ((StringBuilder)localObject).append(String.format("ellipsizeWidth: %s ", new Object[] { Integer.valueOf(this.gbS) }));
    ((StringBuilder)localObject).append(String.format("textDirection: %s ", new Object[] { this.gbs }));
    ((StringBuilder)localObject).append(String.format("spacingAdd: %s spacingMult: %s ", new Object[] { Float.valueOf(this.gbt), Float.valueOf(this.gbu) }));
    ((StringBuilder)localObject).append(String.format("includedPad: %b ", new Object[] { Boolean.valueOf(this.gbv) }));
    ((StringBuilder)localObject).append(String.format("typeface: %s ", new Object[] { this.gbT }));
    ((StringBuilder)localObject).append(String.format("fontStyle: %d ", new Object[] { Integer.valueOf(this.gbU) }));
    ((StringBuilder)localObject).append(String.format("textSize: %s ", new Object[] { Float.valueOf(this.gbV) }));
    ((StringBuilder)localObject).append(String.format("textColor: %d", new Object[] { Integer.valueOf(this.textColor) }));
    ((StringBuilder)localObject).append(String.format("linkColor: %d", new Object[] { Integer.valueOf(this.linkColor) }));
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(432852172800L, 3225);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */