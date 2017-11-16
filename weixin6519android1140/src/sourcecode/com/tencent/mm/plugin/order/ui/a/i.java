package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public final class i
  extends Preference
{
  private View mView;
  private int nGX;
  String nGY;
  
  public i(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6640958963712L, 49479);
    this.mView = null;
    this.nGX = Integer.MAX_VALUE;
    setLayoutResource(a.g.sNx);
    GMTrace.o(6640958963712L, 49479);
  }
  
  public final void EC(String paramString)
  {
    GMTrace.i(6641361616896L, 49482);
    try
    {
      this.nGX = Color.parseColor(paramString);
      GMTrace.o(6641361616896L, 49482);
      return;
    }
    catch (Exception paramString)
    {
      this.nGX = -1;
      GMTrace.o(6641361616896L, 49482);
    }
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6641093181440L, 49480);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6641093181440L, 49480);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6641227399168L, 49481);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(a.f.sBo);
    paramView = (TextView)paramView.findViewById(a.f.sBn);
    localTextView.setText(getTitle());
    paramView.setText(this.nGY);
    if (this.nGX != Integer.MAX_VALUE) {
      paramView.setTextColor(this.nGX);
    }
    GMTrace.o(6641227399168L, 49481);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */