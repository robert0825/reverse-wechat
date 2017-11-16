package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;

public class MMAutoSizeTextView
  extends TextView
{
  private Paint mE;
  private float mem;
  private float waV;
  private float waW;
  
  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3158814228480L, 23535);
    init();
    GMTrace.o(3158814228480L, 23535);
  }
  
  public MMAutoSizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3158680010752L, 23534);
    init();
    GMTrace.o(3158680010752L, 23534);
  }
  
  private void bZD()
  {
    GMTrace.i(3159216881664L, 23538);
    this.mem = getTextSize();
    if (this.mem <= this.waV) {
      this.mem = this.waW;
    }
    GMTrace.o(3159216881664L, 23538);
  }
  
  private void cR(String paramString, int paramInt)
  {
    GMTrace.i(3159082663936L, 23537);
    w.i("MicroMsg.MMAutoSizeTextView", "autoAdjustTextSize[text=%s, viewWidth=%d]", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      GMTrace.o(3159082663936L, 23537);
      return;
    }
    paramInt = paramInt - getPaddingLeft() - getPaddingRight();
    bZD();
    float f1 = this.mem;
    this.mE.setTextSize(f1);
    for (;;)
    {
      float f2 = f1;
      if (f1 > this.waV)
      {
        f2 = f1;
        if (this.mE.measureText(paramString) > paramInt)
        {
          f1 -= 1.0F;
          if (f1 > this.waV) {
            break label189;
          }
          f2 = this.waV;
        }
      }
      w.i("MicroMsg.MMAutoSizeTextView", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", new Object[] { Float.valueOf(f2), Float.valueOf(this.mem), Float.valueOf(this.mE.measureText(paramString)), Integer.valueOf(paramInt) });
      setTextSize(0, f2);
      GMTrace.o(3159082663936L, 23537);
      return;
      label189:
      this.mE.setTextSize(f1);
    }
  }
  
  private void init()
  {
    GMTrace.i(3158948446208L, 23536);
    setSingleLine();
    setEllipsize(TextUtils.TruncateAt.END);
    this.waV = a.fromDPToPix(getContext(), 8);
    this.waW = a.fromDPToPix(getContext(), 22);
    this.mE = new Paint();
    this.mE.set(getPaint());
    bZD();
    GMTrace.o(3158948446208L, 23536);
  }
  
  public int getBaseline()
  {
    GMTrace.i(3159887970304L, 23543);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(3159887970304L, 23543);
      return i;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.MMAutoSizeTextView", localThrowable, "", new Object[0]);
      GMTrace.o(3159887970304L, 23543);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3159753752576L, 23542);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(3159753752576L, 23542);
      return;
    }
    catch (Throwable paramCanvas)
    {
      w.printErrStackTrace("MicroMsg.MMAutoSizeTextView", paramCanvas, "", new Object[0]);
      GMTrace.o(3159753752576L, 23542);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3159619534848L, 23541);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(3159619534848L, 23541);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.MMAutoSizeTextView", localThrowable, "", new Object[0]);
      GMTrace.o(3159619534848L, 23541);
    }
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(3160022188032L, 23544);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(3160022188032L, 23544);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(3160022188032L, 23544);
    }
    return true;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3159485317120L, 23540);
    w.w("MicroMsg.MMAutoSizeTextView", "on size changed");
    if (paramInt1 != paramInt3) {
      cR(getText().toString(), paramInt1);
    }
    GMTrace.o(3159485317120L, 23540);
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(3159351099392L, 23539);
    w.w("MicroMsg.MMAutoSizeTextView", "on text changed");
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    cR(paramCharSequence.toString(), getWidth());
    GMTrace.o(3159351099392L, 23539);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMAutoSizeTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */