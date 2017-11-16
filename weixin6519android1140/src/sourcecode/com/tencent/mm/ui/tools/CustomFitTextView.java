package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.e;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomFitTextView
  extends TextView
{
  private boolean hxz;
  public int maxLines;
  private Paint xgG;
  private String xgH;
  private Rect xgI;
  private LinkedList<String> xgJ;
  public int xgK;
  private Drawable xgL;
  public boolean xgM;
  private int xgN;
  
  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2047491440640L, 15255);
    this.xgI = new Rect();
    this.xgJ = new LinkedList();
    this.hxz = true;
    this.xgN = 0;
    GMTrace.o(2047491440640L, 15255);
  }
  
  public CustomFitTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2047625658368L, 15256);
    this.xgI = new Rect();
    this.xgJ = new LinkedList();
    this.hxz = true;
    this.xgN = 0;
    GMTrace.o(2047625658368L, 15256);
  }
  
  private void WV(String paramString)
  {
    GMTrace.i(2048296747008L, 15261);
    if (this.xgJ != null)
    {
      if ((paramString == null) || ("".equals(paramString)))
      {
        GMTrace.o(2048296747008L, 15261);
        return;
      }
      this.xgJ.add(paramString);
    }
    GMTrace.o(2048296747008L, 15261);
  }
  
  private int c(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2048430964736L, 15262);
    if (paramInt2 <= paramInt1)
    {
      GMTrace.o(2048430964736L, 15262);
      return paramInt1 + 1;
    }
    if (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 < paramInt4)
    {
      GMTrace.o(2048430964736L, 15262);
      return paramInt2;
    }
    int j = paramString.length();
    int i;
    for (;;)
    {
      i = paramInt2;
      if (getPaint().measureText(paramString, paramInt1, paramInt2) + paramInt3 <= paramInt4) {
        break;
      }
      paramInt2 = paramInt2 + paramInt1 >> 1;
    }
    while ((i <= j) && (getPaint().measureText(paramString, paramInt1, i) + paramInt3 < paramInt4)) {
      i += 1;
    }
    paramInt2 = Math.min(j, i) - 1;
    paramInt1 = paramInt2;
    while ((paramInt1 >= 0) && (bg.k(paramString.charAt(paramInt1)))) {
      paramInt1 -= 1;
    }
    if ((paramInt1 < 0) || (paramInt1 == paramInt2))
    {
      GMTrace.o(2048430964736L, 15262);
      return i - 1;
    }
    GMTrace.o(2048430964736L, 15262);
    return paramInt1 + 1;
  }
  
  private int cik()
  {
    GMTrace.i(2048028311552L, 15259);
    Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
    float f1 = this.xgJ.size();
    float f2 = localFontMetrics.bottom;
    float f3 = localFontMetrics.top;
    int i = (int)((localFontMetrics.leading + (f2 - f3)) * f1 + getPaddingTop() + getPaddingBottom());
    int j = Math.max(0, this.xgJ.size() - 1);
    int k = this.xgN;
    GMTrace.o(2048028311552L, 15259);
    return i + j * k;
  }
  
  private boolean dc(String paramString, int paramInt)
  {
    GMTrace.i(2048162529280L, 15260);
    int k;
    int n;
    int i1;
    int i;
    if ((this.hxz) && (paramInt > 0) && (paramString != null) && (!"".equals(paramString)))
    {
      this.xgJ.clear();
      k = 0;
      n = paramString.length();
      i1 = paramInt - getPaddingLeft() - getPaddingRight();
      if (this.xgM)
      {
        paramInt = this.xgL.getIntrinsicWidth();
        float f = getPaint().measureText(paramString, 0, n);
        f = paramInt + f;
        i = this.maxLines;
        if (Float.compare(f, this.maxLines * i1) >= 0) {
          break label257;
        }
        i = (int)Math.ceil(f / i1);
      }
    }
    label130:
    label257:
    for (;;)
    {
      int j = 0;
      if (j < i) {
        if (j == i - 1) {
          WV(paramString.substring(k, c(paramString, k, n, paramInt, i1)).trim());
        }
      }
      for (;;)
      {
        j += 1;
        break label130;
        paramInt = 0;
        break;
        int m = c(paramString, k, n, 0, i1);
        WV(paramString.substring(k, m).trim());
        if (m >= n)
        {
          w.w("MicroMsg.CustomFitTextView", "not match last line, but match text length end");
          GMTrace.o(2048162529280L, 15260);
          return true;
          GMTrace.o(2048162529280L, 15260);
          return false;
        }
        k = m;
      }
    }
  }
  
  public final void a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    GMTrace.i(2047894093824L, 15258);
    this.maxLines = paramInt1;
    this.xgH = paramString;
    if (this.xgH == null)
    {
      w.w("MicroMsg.CustomFitTextView", "ori text is null");
      this.xgH = "";
    }
    if (this.maxLines <= 0)
    {
      w.w("MicroMsg.CustomFitTextView", "maxLines is invalid");
      this.maxLines = 2;
    }
    this.xgN = getResources().getDimensionPixelSize(a.e.aPv);
    this.xgM = paramBoolean;
    this.xgK = paramInt2;
    if (this.xgM) {
      this.xgL = getResources().getDrawable(this.xgK);
    }
    this.xgG = new Paint();
    this.xgG.set(getPaint());
    this.xgG.setAntiAlias(true);
    this.xgG.setColor(paramInt3);
    dc(this.xgH, getWidth());
    setHeight(Math.max(cik(), a.fromDPToPix(getContext(), 32)));
    GMTrace.o(2047894093824L, 15258);
  }
  
  public final void b(String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(2047759876096L, 15257);
    a(paramString, paramInt1, paramBoolean, paramInt2, getCurrentTextColor());
    GMTrace.o(2047759876096L, 15257);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2048565182464L, 15263);
    if (!this.hxz)
    {
      GMTrace.o(2048565182464L, 15263);
      return;
    }
    if ((this.xgH == null) || ("".equals(this.xgH)) || (this.xgJ.size() == 0))
    {
      GMTrace.o(2048565182464L, 15263);
      return;
    }
    Paint.FontMetrics localFontMetrics = getPaint().getFontMetrics();
    float f2 = localFontMetrics.descent - localFontMetrics.ascent;
    float f3 = getPaddingLeft();
    float f1 = getPaddingTop();
    Iterator localIterator = this.xgJ.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      f1 = localFontMetrics.leading + f2 + f1;
      paramCanvas.drawText(str, f3, f1, this.xgG);
    }
    if (this.xgM)
    {
      getPaint().getTextBounds((String)this.xgJ.getLast(), 0, ((String)this.xgJ.getLast()).length(), this.xgI);
      int i = getPaddingLeft() + this.xgI.right;
      int j = this.xgL.getIntrinsicWidth();
      int k = (int)(f1 - f2 - localFontMetrics.leading);
      int m = this.xgL.getIntrinsicHeight();
      this.xgL.setBounds(i, k, j + i, m + k);
      this.xgL.draw(paramCanvas);
    }
    GMTrace.o(2048565182464L, 15263);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(2048833617920L, 15265);
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = a.fromDPToPix(getContext(), 32);
    paramInt1 = paramInt2;
    if (dc(this.xgH, i)) {
      paramInt1 = Math.max(cik(), paramInt2);
    }
    setMeasuredDimension(i, paramInt1);
    GMTrace.o(2048833617920L, 15265);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2048699400192L, 15264);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {}
    for (boolean bool = true;; bool = false)
    {
      this.hxz = bool;
      if (this.hxz) {
        dc(this.xgH, paramInt1);
      }
      GMTrace.o(2048699400192L, 15264);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\CustomFitTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */