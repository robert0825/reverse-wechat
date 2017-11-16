package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.PLTextView;

public class SnsCommentPreloadTextView
  extends PLTextView
{
  private static com.tencent.mm.kiss.widget.textview.a.a qoD;
  private static int qoE;
  
  static
  {
    GMTrace.i(8329417981952L, 62059);
    qoD = null;
    qoE = 0;
    GMTrace.o(8329417981952L, 62059);
  }
  
  public SnsCommentPreloadTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8328478457856L, 62052);
    GMTrace.o(8328478457856L, 62052);
  }
  
  public SnsCommentPreloadTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8328612675584L, 62053);
    GMTrace.o(8328612675584L, 62053);
  }
  
  public SnsCommentPreloadTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8328746893312L, 62054);
    GMTrace.o(8328746893312L, 62054);
  }
  
  protected final void o(CharSequence paramCharSequence)
  {
    GMTrace.i(8329149546496L, 62057);
    super.o(paramCharSequence);
    GMTrace.o(8329149546496L, 62057);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8329283764224L, 62058);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8329283764224L, 62058);
  }
  
  protected final void p(CharSequence paramCharSequence)
  {
    GMTrace.i(8329015328768L, 62056);
    super.p(paramCharSequence);
    GMTrace.o(8329015328768L, 62056);
  }
  
  protected final com.tencent.mm.kiss.widget.textview.a.a xR()
  {
    GMTrace.i(8328881111040L, 62055);
    if (qoD == null) {
      qoD = a.bqp().bqq();
    }
    com.tencent.mm.kiss.widget.textview.a.a locala = qoD;
    GMTrace.o(8328881111040L, 62055);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\widget\SnsCommentPreloadTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */