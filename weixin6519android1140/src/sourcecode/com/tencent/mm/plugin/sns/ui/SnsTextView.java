package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class SnsTextView
  extends TextView
{
  public String mAz;
  private char qgy;
  
  public SnsTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8748714164224L, 65183);
    this.qgy = '\000';
    this.mAz = "";
    GMTrace.o(8748714164224L, 65183);
  }
  
  public int getBaseline()
  {
    GMTrace.i(8749385252864L, 65188);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(8749385252864L, 65188);
      return i;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.SnsTextView", localThrowable, "", new Object[0]);
      GMTrace.o(8749385252864L, 65188);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8749251035136L, 65187);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(8749251035136L, 65187);
      return;
    }
    catch (Throwable paramCanvas)
    {
      w.printErrStackTrace("MicroMsg.SnsTextView", paramCanvas, "", new Object[0]);
      GMTrace.o(8749251035136L, 65187);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8748982599680L, 65185);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8748982599680L, 65185);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8749116817408L, 65186);
    if ((p.fQL.fPK == 1) || (p.fQL.fPK == -1)) {
      try
      {
        super.onMeasure(paramInt1, paramInt2);
        this.qgy = '\000';
        GMTrace.o(8749116817408L, 65186);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
      {
        if (this.qgy < '\003') {
          try
          {
            SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(getText());
            MetricAffectingSpan[] arrayOfMetricAffectingSpan = (MetricAffectingSpan[])localSpannableStringBuilder.getSpans(0, localSpannableStringBuilder.length(), MetricAffectingSpan.class);
            if ((arrayOfMetricAffectingSpan != null) && (arrayOfMetricAffectingSpan.length > 0)) {
              localSpannableStringBuilder.insert(localSpannableStringBuilder.getSpanStart(arrayOfMetricAffectingSpan[0]) - 1, " ");
            }
            for (this.qgy = ((char)(this.qgy + '\001'));; this.qgy = 'd')
            {
              setText(localSpannableStringBuilder);
              onMeasure(paramInt1, paramInt2);
              GMTrace.o(8749116817408L, 65186);
              return;
            }
            if (this.qgy != '\003') {
              break label284;
            }
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            w.i("MicroMsg.SnsTextView", "tryToFix error set origintext " + bg.nm(this.mAz));
            setText(this.mAz);
            onMeasure(paramInt1, paramInt2);
            this.qgy = ((char)(this.qgy + '\001'));
            GMTrace.o(8749116817408L, 65186);
            return;
          }
        }
        w.i("MicroMsg.SnsTextView", "fix error set origintext " + bg.nm(this.mAz));
        setText(this.mAz);
        onMeasure(paramInt1, paramInt2);
        this.qgy = ((char)(this.qgy + '\001'));
        GMTrace.o(8749116817408L, 65186);
        return;
        label284:
        throw localIndexOutOfBoundsException2;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8749116817408L, 65186);
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(8749519470592L, 65189);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(8749519470592L, 65189);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(8749519470592L, 65189);
    }
    return true;
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    GMTrace.i(8748848381952L, 65184);
    boolean bool = super.onTextContextMenuItem(paramInt);
    GMTrace.o(8748848381952L, 65184);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */