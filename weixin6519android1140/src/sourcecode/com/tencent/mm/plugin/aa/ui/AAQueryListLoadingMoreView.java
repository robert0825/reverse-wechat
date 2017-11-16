package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.v;

public class AAQueryListLoadingMoreView
  extends LinearLayout
{
  public AAQueryListLoadingMoreView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5618488311808L, 41861);
    init(paramContext);
    GMTrace.o(5618488311808L, 41861);
  }
  
  public AAQueryListLoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5618622529536L, 41862);
    init(paramContext);
    GMTrace.o(5618622529536L, 41862);
  }
  
  public AAQueryListLoadingMoreView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5618756747264L, 41863);
    init(paramContext);
    GMTrace.o(5618756747264L, 41863);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5618890964992L, 41864);
    v.fb(paramContext).inflate(a.g.sLy, this, true);
    GMTrace.o(5618890964992L, 41864);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\AAQueryListLoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */