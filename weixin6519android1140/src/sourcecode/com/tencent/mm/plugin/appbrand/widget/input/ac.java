package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.NoCopySpan;
import android.text.Spannable;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;

final class ac
{
  static a[] e(TextView paramTextView)
  {
    int i = 0;
    GMTrace.i(19867847622656L, 148027);
    Spannable localSpannable = null;
    Object localObject = localSpannable;
    if (paramTextView != null)
    {
      localObject = localSpannable;
      if ((paramTextView.getText() instanceof Spannable))
      {
        localSpannable = (Spannable)paramTextView.getText();
        paramTextView = (a[])localSpannable.getSpans(0, localSpannable.length(), a.class);
        int j = paramTextView.length;
        for (;;)
        {
          localObject = paramTextView;
          if (i >= j) {
            break;
          }
          localSpannable.removeSpan(paramTextView[i]);
          i += 1;
        }
      }
    }
    GMTrace.o(19867847622656L, 148027);
    return (a[])localObject;
  }
  
  private static class a
    implements NoCopySpan
  {
    public float aao;
    public float aap;
    public int iOg;
    public int iOh;
    public boolean iOi;
    public boolean iOj;
    public boolean iOk;
    @Deprecated
    public boolean iOl;
    
    public a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
    {
      GMTrace.i(19869860888576L, 148042);
      this.aao = paramFloat1;
      this.aap = paramFloat2;
      this.iOg = paramInt1;
      this.iOh = paramInt2;
      GMTrace.o(19869860888576L, 148042);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */