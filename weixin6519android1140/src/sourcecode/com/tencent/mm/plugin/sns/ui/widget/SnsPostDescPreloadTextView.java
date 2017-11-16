package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.PLTextView;
import com.tencent.mm.kiss.widget.textview.a.a;
import com.tencent.mm.kiss.widget.textview.f;

public class SnsPostDescPreloadTextView
  extends PLTextView
{
  private static int hitCount;
  private static int missCount;
  private boolean qoG;
  public int qoH;
  
  static
  {
    GMTrace.i(8331968118784L, 62078);
    missCount = 0;
    hitCount = 0;
    GMTrace.o(8331968118784L, 62078);
  }
  
  public SnsPostDescPreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8331028594688L, 62071);
    this.qoG = false;
    this.qoH = 0;
    GMTrace.o(8331028594688L, 62071);
  }
  
  public SnsPostDescPreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8331162812416L, 62072);
    this.qoG = false;
    this.qoH = 0;
    GMTrace.o(8331162812416L, 62072);
  }
  
  protected final void o(CharSequence paramCharSequence)
  {
    GMTrace.i(8331699683328L, 62076);
    if (paramCharSequence != null) {
      setText(d.a(getContext(), paramCharSequence.toString(), xQ().gbV), true);
    }
    missCount += 1;
    GMTrace.o(8331699683328L, 62076);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8331833901056L, 62077);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8331833901056L, 62077);
  }
  
  protected final void p(CharSequence paramCharSequence)
  {
    GMTrace.i(8331565465600L, 62075);
    super.p(paramCharSequence);
    hitCount += 1;
    GMTrace.o(8331565465600L, 62075);
  }
  
  public final void setMaxLines(int paramInt)
  {
    int i = 1;
    GMTrace.i(8331431247872L, 62074);
    if (getText() == null) {
      super.setMaxLines(paramInt);
    }
    if (paramInt <= 6)
    {
      if (!this.qoG) {
        break label170;
      }
      b(c.bqr().bqs());
      this.qoG = false;
      paramInt = i;
    }
    for (;;)
    {
      f localf2;
      f localf1;
      if (paramInt != 0)
      {
        localf2 = com.tencent.mm.kiss.widget.textview.c.gaW.a(xQ(), getText());
        localf1 = localf2;
        if (localf2 == null) {
          if (this.qoH <= 0) {
            break label160;
          }
        }
      }
      label160:
      for (paramInt = this.qoH;; paramInt = c.bqr().bqt())
      {
        localf1 = localf2;
        if (paramInt > 0) {
          localf1 = com.tencent.mm.kiss.widget.textview.d.a(getText(), paramInt, xQ()).xO();
        }
        if (localf1 != null) {
          b(localf1);
        }
        GMTrace.o(8331431247872L, 62074);
        return;
        if (this.qoG) {
          break label170;
        }
        b(c.bqr().bqq());
        this.qoG = true;
        paramInt = i;
        break;
      }
      label170:
      paramInt = 0;
    }
  }
  
  protected final a xR()
  {
    GMTrace.i(8331297030144L, 62073);
    this.qoG = true;
    a locala = c.bqr().bqq();
    GMTrace.o(8331297030144L, 62073);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\widget\SnsPostDescPreloadTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */