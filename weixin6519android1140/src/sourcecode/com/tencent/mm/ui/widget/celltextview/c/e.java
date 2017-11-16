package com.tencent.mm.ui.widget.celltextview.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.celltextview.g.a;

public class e
{
  protected static Paint xtH;
  protected int iCQ;
  protected String iJz;
  protected Paint mPaint;
  protected int mType;
  protected int rz;
  protected float xtF;
  protected boolean xtG;
  
  static
  {
    GMTrace.i(18753169391616L, 139722);
    xtH = new Paint(1);
    GMTrace.o(18753169391616L, 139722);
  }
  
  public e(Paint paramPaint)
  {
    GMTrace.i(18951408975872L, 141199);
    this.mType = 0;
    this.mPaint = paramPaint;
    GMTrace.o(18951408975872L, 141199);
  }
  
  private e(Paint paramPaint, int paramInt1, int paramInt2, float paramFloat, String paramString, boolean paramBoolean)
  {
    GMTrace.i(18951543193600L, 141200);
    this.mType = 0;
    this.rz = paramInt1;
    this.iCQ = paramInt2;
    this.xtF = paramFloat;
    this.iJz = paramString;
    this.xtG = paramBoolean;
    this.mPaint = paramPaint;
    GMTrace.o(18951543193600L, 141200);
  }
  
  public e(Paint paramPaint, int paramInt, String paramString, float paramFloat)
  {
    GMTrace.i(18951677411328L, 141201);
    this.mType = 0;
    this.mType = paramInt;
    this.xtF = paramFloat;
    this.iJz = paramString;
    this.mPaint = paramPaint;
    GMTrace.o(18951677411328L, 141201);
  }
  
  public float Eq(int paramInt)
  {
    GMTrace.i(18752364085248L, 139716);
    cjE();
    Paint.FontMetrics localFontMetrics = xtH.getFontMetrics();
    float f1 = localFontMetrics.bottom;
    float f2 = localFontMetrics.top;
    float f3 = paramInt;
    GMTrace.o(18752364085248L, 139716);
    return f1 - f2 + f3;
  }
  
  public final void Eu(int paramInt)
  {
    GMTrace.i(19011270082560L, 141645);
    this.iCQ = paramInt;
    GMTrace.o(19011270082560L, 141645);
  }
  
  public final int a(int paramInt1, int paramInt2, float[] paramArrayOfFloat)
  {
    GMTrace.i(18752498302976L, 139717);
    if (TextUtils.isEmpty(this.iJz))
    {
      GMTrace.o(18752498302976L, 139717);
      return 0;
    }
    cjE();
    int i = paramInt1 + paramInt2;
    paramInt2 = i;
    if (i > this.iJz.length()) {
      paramInt2 = this.iJz.length();
    }
    if (paramInt1 >= paramInt2)
    {
      GMTrace.o(18752498302976L, 139717);
      return 0;
    }
    paramInt1 = xtH.getTextWidths(this.iJz, paramInt1, paramInt2, paramArrayOfFloat);
    GMTrace.o(18752498302976L, 139717);
    return paramInt1;
  }
  
  public void a(Canvas paramCanvas, RectF paramRectF, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(18917183455232L, 140944);
    cjE();
    float f2 = paramRectF.top + (int)((paramRectF.height() - xtH.descent() - xtH.ascent()) / 2.0F);
    paramFloat2 = paramRectF.left;
    String str = this.iJz;
    Paint localPaint = xtH;
    paramCanvas.save();
    char c = str.charAt(0);
    if (a.o(c)) {
      paramCanvas.translate(-a.b(c, localPaint), 0.0F);
    }
    boolean bool = localPaint.isUnderlineText();
    localPaint.setUnderlineText(false);
    char[] arrayOfChar = new char[str.length()];
    str.getChars(0, str.length(), arrayOfChar, 0);
    if (this.iCQ != 0)
    {
      localPaint.setColor(this.iCQ);
      localPaint.setStyle(Paint.Style.FILL);
      paramCanvas.drawRect(paramRectF, localPaint);
      localPaint.setStyle(Paint.Style.STROKE);
      localPaint.setColor(this.rz);
    }
    int j = -1;
    int i = 0;
    if (i < str.length())
    {
      c = arrayOfChar[i];
      int k;
      if (Character.isHighSurrogate(c))
      {
        k = j;
        if (-1 == j) {
          k = i;
        }
        i += 1;
      }
      for (j = k;; j = k)
      {
        i += 1;
        break;
        f1 = paramFloat2;
        k = j;
        if (-1 != j)
        {
          paramRectF = str.substring(j, i);
          k = -1;
          paramCanvas.drawText(paramRectF, paramFloat2, f2, localPaint);
          f1 = paramFloat2 + (localPaint.measureText(paramRectF) + paramFloat1);
        }
        paramRectF = Character.toString(c);
        paramCanvas.drawText(paramRectF, f1, f2, localPaint);
        paramFloat2 = f1 + (localPaint.measureText(paramRectF) + paramFloat1);
      }
    }
    float f1 = paramFloat2;
    if (-1 != j)
    {
      paramRectF = str.substring(j, str.length());
      paramCanvas.drawText(paramRectF, paramFloat2, f2, localPaint);
      f1 = paramFloat2 + (localPaint.measureText(paramRectF) + paramFloat1);
    }
    if (bool)
    {
      paramFloat1 = localPaint.getStrokeWidth();
      paramRectF = localPaint.getStyle();
      localPaint.setStrokeWidth(localPaint.getTextSize() / 15.0F);
      localPaint.setStyle(Paint.Style.FILL);
      paramFloat2 = localPaint.getFontMetrics().leading;
      paramFloat2 = localPaint.getStrokeWidth() * 1.5F + (paramFloat2 + f2);
      paramCanvas.drawLine(f1, paramFloat2, f1, paramFloat2, localPaint);
      localPaint.setStrokeWidth(paramFloat1);
      localPaint.setStyle(paramRectF);
    }
    localPaint.setUnderlineText(bool);
    paramCanvas.restore();
    GMTrace.o(18917183455232L, 140944);
  }
  
  public final void aB(float paramFloat)
  {
    GMTrace.i(19011404300288L, 141646);
    this.xtF = paramFloat;
    GMTrace.o(19011404300288L, 141646);
  }
  
  public boolean cjB()
  {
    GMTrace.i(18751827214336L, 139712);
    GMTrace.o(18751827214336L, 139712);
    return true;
  }
  
  public e cjC()
  {
    GMTrace.i(18752766738432L, 139719);
    e locale = new e(this.mPaint, this.rz, this.iCQ, this.xtF, this.iJz, this.xtG);
    GMTrace.o(18752766738432L, 139719);
    return locale;
  }
  
  public final int cjD()
  {
    int i = 1;
    GMTrace.i(18810883014656L, 140152);
    int j = this.iJz.hashCode();
    w.d("NewTextCell", "[getHashcode] mSize:%s ,mBgColor:%s,mColor:%s,mType:%s,hashCode:%s", new Object[] { Float.valueOf(this.xtF), Integer.valueOf(this.iCQ), Integer.valueOf(this.rz), Integer.valueOf(this.mType), Integer.valueOf(j) });
    float f1 = this.xtF;
    float f2 = this.iCQ;
    float f3 = this.rz;
    float f4 = this.mType;
    if (this.xtG) {}
    for (;;)
    {
      i = (int)(i + (f1 + f2 + f3 + f4));
      GMTrace.o(18810883014656L, 140152);
      return i * j;
      i = 2;
    }
  }
  
  public final void cjE()
  {
    GMTrace.i(18753035173888L, 139721);
    xtH.set(this.mPaint);
    xtH.setColor(this.rz);
    xtH.setTextSize(this.xtF);
    xtH.setUnderlineText(this.xtG);
    GMTrace.o(18753035173888L, 139721);
  }
  
  public int getLength()
  {
    GMTrace.i(18751961432064L, 139713);
    if (this.iJz != null)
    {
      int i = this.iJz.length();
      GMTrace.o(18751961432064L, 139713);
      return i;
    }
    GMTrace.o(18751961432064L, 139713);
    return 0;
  }
  
  public final String getText()
  {
    GMTrace.i(18750887690240L, 139705);
    String str = this.iJz;
    GMTrace.o(18750887690240L, 139705);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(18751021907968L, 139706);
    int i = this.mType;
    GMTrace.o(18751021907968L, 139706);
    return i;
  }
  
  public float getWidth()
  {
    float f1 = 0.0F;
    GMTrace.i(19011806953472L, 141649);
    cjE();
    if (TextUtils.isEmpty(this.iJz))
    {
      GMTrace.o(19011806953472L, 141649);
      return 0.0F;
    }
    float f2 = xtH.measureText(this.iJz);
    if (f2 > 0.0F)
    {
      GMTrace.o(19011806953472L, 141649);
      return f2;
    }
    Paint localPaint = xtH;
    int j = this.iJz.length();
    int i = 0;
    while (i < j)
    {
      int k = Character.charCount(this.iJz.codePointAt(i));
      f2 = localPaint.measureText(this.iJz, i, i + k);
      i += k;
      f1 = f2 + f1;
    }
    GMTrace.o(19011806953472L, 141649);
    return f1;
  }
  
  public final float m(int paramInt, float paramFloat)
  {
    GMTrace.i(18752632520704L, 139718);
    if (TextUtils.isEmpty(this.iJz))
    {
      GMTrace.o(18752632520704L, 139718);
      return 0.0F;
    }
    cjE();
    int j = paramInt + 0;
    int i = j;
    if (j > this.iJz.length()) {
      i = this.iJz.length();
    }
    if (i <= 0)
    {
      GMTrace.o(18752632520704L, 139718);
      return 0.0F;
    }
    float[] arrayOfFloat = new float[paramInt];
    i = xtH.getTextWidths(this.iJz, 0, i, arrayOfFloat);
    float f1 = 0.0F;
    paramInt = 0;
    while (paramInt < i)
    {
      f1 += arrayOfFloat[paramInt];
      paramInt += 1;
    }
    float f2 = i;
    GMTrace.o(18752632520704L, 139718);
    return f2 * paramFloat + f1;
  }
  
  public final void setColor(int paramInt)
  {
    GMTrace.i(19011135864832L, 141644);
    this.rz = paramInt;
    GMTrace.o(19011135864832L, 141644);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(19011538518016L, 141647);
    this.iJz = paramString;
    GMTrace.o(19011538518016L, 141647);
  }
  
  public final void setUnderlineText(boolean paramBoolean)
  {
    GMTrace.i(19011672735744L, 141648);
    this.xtG = paramBoolean;
    GMTrace.o(19011672735744L, 141648);
  }
  
  public String toString()
  {
    GMTrace.i(18750753472512L, 139704);
    StringBuilder localStringBuilder = new StringBuilder("type:").append(this.mType).append(", Text:");
    if (this.iJz == null) {}
    for (String str = "";; str = this.iJz)
    {
      str = str + ", Size:" + this.xtF + ", Color:" + this.rz;
      GMTrace.o(18750753472512L, 139704);
      return str;
    }
  }
  
  public final void x(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(18752095649792L, 139714);
    int i = paramInt1;
    if (paramInt1 < 0) {
      i = 0;
    }
    if (paramInt2 <= this.iJz.length())
    {
      paramInt1 = paramInt2;
      if (paramInt2 >= 0) {}
    }
    else
    {
      paramInt1 = this.iJz.length();
    }
    this.iJz = this.iJz.substring(i, paramInt1);
    if (!TextUtils.isEmpty(paramString)) {
      this.iJz += paramString;
    }
    GMTrace.o(18752095649792L, 139714);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */