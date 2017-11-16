package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.preference.Preference;

public class DividerPreference
  extends Preference
{
  private boolean iSM;
  private View mView;
  private boolean nGV;
  private boolean nGW;
  
  public DividerPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6995830636544L, 52123);
    GMTrace.o(6995830636544L, 52123);
  }
  
  public DividerPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6995696418816L, 52122);
    this.mView = null;
    this.nGV = false;
    this.nGW = false;
    this.iSM = true;
    setLayoutResource(a.g.sMi);
    GMTrace.o(6995696418816L, 52122);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6995964854272L, 52124);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6995964854272L, 52124);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6996099072000L, 52125);
    super.onBindView(paramView);
    paramView = paramView.findViewById(a.f.svc);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    int i = BackwardSupportUtil.b.a(this.mContext, 10.0F);
    if (this.nGV) {}
    for (int j = i;; j = 0)
    {
      if (this.nGW) {}
      for (;;)
      {
        localLayoutParams.setMargins(0, j, 0, i);
        paramView.setLayoutParams(localLayoutParams);
        if (!this.iSM)
        {
          paramView.setVisibility(4);
          GMTrace.o(6996099072000L, 52125);
          return;
        }
        paramView.setVisibility(0);
        GMTrace.o(6996099072000L, 52125);
        return;
        i = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\DividerPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */