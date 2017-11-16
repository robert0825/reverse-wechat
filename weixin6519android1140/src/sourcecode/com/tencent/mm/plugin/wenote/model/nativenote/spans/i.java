package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;

public final class i
  extends ArrowKeyMovementMethod
{
  private static i sgW;
  
  public i()
  {
    GMTrace.i(20624432955392L, 153664);
    GMTrace.o(20624432955392L, 153664);
  }
  
  public static i bIu()
  {
    GMTrace.i(20624567173120L, 153665);
    if (sgW == null) {
      sgW = new i();
    }
    i locali = sgW;
    GMTrace.o(20624567173120L, 153665);
    return locali;
  }
  
  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    GMTrace.i(20624701390848L, 153666);
    int i = paramMotionEvent.getAction();
    if ((i == 1) || (i == 0))
    {
      int m = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int n = paramTextView.getTotalPaddingLeft();
      int k = paramTextView.getTotalPaddingTop();
      m = paramTextView.getScrollX() + (m - n);
      n = paramTextView.getScrollY();
      Object localObject = paramTextView.getLayout();
      j = ((Layout)localObject).getOffsetForHorizontal(((Layout)localObject).getLineForVertical(n + (j - k)), m);
      localObject = (k[])paramSpannable.getSpans(j, j + 1, k.class);
      if ((m < b.bHn()) && (localObject.length != 0))
      {
        if (i == 0) {
          localObject[0].a(paramTextView, paramSpannable, paramMotionEvent, localObject[0]);
        }
        GMTrace.o(20624701390848L, 153666);
        return false;
      }
    }
    GMTrace.o(20624701390848L, 153666);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */