package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class PLSysTextView
  extends SysTextView
{
  public PLSysTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(429228294144L, 3198);
    GMTrace.o(429228294144L, 3198);
  }
  
  public PLSysTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(429362511872L, 3199);
    GMTrace.o(429362511872L, 3199);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(429899382784L, 3203);
    super.onConfigurationChanged(paramConfiguration);
    if (xU() != null) {
      xU().gby = false;
    }
    GMTrace.o(429899382784L, 3203);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(429765165056L, 3202);
    super.onDraw(paramCanvas);
    GMTrace.o(429765165056L, 3202);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(429630947328L, 3201);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(429630947328L, 3201);
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(430033600512L, 3204);
    GMTrace.o(430033600512L, 3204);
    return true;
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    GMTrace.i(429496729600L, 3200);
    if (bg.L(paramCharSequence))
    {
      if (h.DEBUG) {
        w.d("MicroMsg.PLSysTextView", "set null text");
      }
      GMTrace.o(429496729600L, 3200);
      return;
    }
    long l = 0L;
    if (h.DEBUG) {
      l = System.currentTimeMillis();
    }
    if ((xU() != null) && (xU().gby)) {
      c.gaW.a(xQ(), xU());
    }
    paramBufferType = c.gaW.a(xQ(), paramCharSequence);
    boolean bool1;
    if (paramBufferType != null)
    {
      boolean bool2 = true;
      bool1 = bool2;
      if (this.gbC != null)
      {
        this.gbC.b(paramBufferType);
        bool1 = bool2;
      }
    }
    for (;;)
    {
      if (h.DEBUG) {
        w.d("MicroMsg.PLSysTextView", "setText used %fms, hitCache: %b, hashCode: %d, text: %s", new Object[] { Double.valueOf((System.currentTimeMillis() - l) / 1000000.0D), Boolean.valueOf(bool1), Integer.valueOf(hashCode()), paramCharSequence });
      }
      GMTrace.o(429496729600L, 3200);
      return;
      bool1 = false;
      super.q(paramCharSequence);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\PLSysTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */