package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;

public class MMTruncTextView
  extends TextView
{
  private boolean xif;
  private boolean xig;
  
  public MMTruncTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2000917889024L, 14908);
    this.xif = false;
    this.xig = false;
    GMTrace.o(2000917889024L, 14908);
  }
  
  public MMTruncTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2000783671296L, 14907);
    this.xif = false;
    this.xig = false;
    GMTrace.o(2000783671296L, 14907);
  }
  
  public int getBaseline()
  {
    GMTrace.i(2001588977664L, 14913);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(2001588977664L, 14913);
      return i;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(2001588977664L, 14913);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2001454759936L, 14912);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(2001454759936L, 14912);
      return;
    }
    catch (Throwable paramCanvas)
    {
      GMTrace.o(2001454759936L, 14912);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2001052106752L, 14909);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.xif)
    {
      GMTrace.o(2001052106752L, 14909);
      return;
    }
    CharSequence localCharSequence = getText();
    if (!(localCharSequence instanceof Spanned))
    {
      GMTrace.o(2001052106752L, 14909);
      return;
    }
    this.xig = true;
    setText(TextUtils.ellipsize(localCharSequence, getPaint(), getWidth() - getCompoundPaddingRight() - getCompoundPaddingLeft(), TextUtils.TruncateAt.END));
    this.xig = false;
    GMTrace.o(2001052106752L, 14909);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(2001320542208L, 14911);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(2001320542208L, 14911);
      return;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(2001320542208L, 14911);
    }
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(2001723195392L, 14914);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(2001723195392L, 14914);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(2001723195392L, 14914);
    }
    return true;
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(2001186324480L, 14910);
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (!this.xig) {}
    for (boolean bool = true;; bool = false)
    {
      this.xif = bool;
      GMTrace.o(2001186324480L, 14910);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\tools\MMTruncTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */