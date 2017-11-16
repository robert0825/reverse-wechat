package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.MMPullDownView;

public class CollectPullDownView
  extends MMPullDownView
{
  public CollectPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5417027502080L, 40360);
    GMTrace.o(5417027502080L, 40360);
  }
  
  public CollectPullDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5417161719808L, 40361);
    GMTrace.o(5417161719808L, 40361);
  }
  
  protected final void app()
  {
    GMTrace.i(5417295937536L, 40362);
    View localView1 = inflate(this.context, a.g.sLX, null);
    View localView2 = inflate(this.context, a.g.sLX, null);
    addView(localView1, 0, new FrameLayout.LayoutParams(-1, a.fromDPToPix(this.context, 48)));
    addView(localView2, new FrameLayout.LayoutParams(-1, a.fromDPToPix(this.context, 48)));
    GMTrace.o(5417295937536L, 40362);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectPullDownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */