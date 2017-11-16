package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.v;

public class LaunchAAByPersonNameAmountRow
  extends LinearLayout
{
  TextView hqk;
  TextView hrh;
  View hrj;
  
  public LaunchAAByPersonNameAmountRow(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5617146134528L, 41851);
    init(paramContext);
    GMTrace.o(5617146134528L, 41851);
  }
  
  public LaunchAAByPersonNameAmountRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5617280352256L, 41852);
    init(paramContext);
    GMTrace.o(5617280352256L, 41852);
  }
  
  public LaunchAAByPersonNameAmountRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5617414569984L, 41853);
    init(paramContext);
    GMTrace.o(5617414569984L, 41853);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5617548787712L, 41854);
    v.fb(paramContext).inflate(a.g.sMC, this, true);
    this.hrh = ((TextView)findViewById(a.f.cjM));
    this.hqk = ((TextView)findViewById(a.f.mFu));
    this.hrj = findViewById(a.f.divider);
    GMTrace.o(5617548787712L, 41854);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\LaunchAAByPersonNameAmountRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */