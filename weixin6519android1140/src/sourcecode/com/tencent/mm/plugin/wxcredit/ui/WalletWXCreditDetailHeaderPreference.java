package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletWXCreditDetailHeaderPreference
  extends Preference
{
  private LayoutInflater CJ;
  TextView hqk;
  TextView slv;
  
  public WalletWXCreditDetailHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9011378257920L, 67140);
    GMTrace.o(9011378257920L, 67140);
  }
  
  public WalletWXCreditDetailHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9011512475648L, 67141);
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(a.g.cBA);
    GMTrace.o(9011512475648L, 67141);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(9011780911104L, 67143);
    super.onBindView(paramView);
    this.hqk = ((TextView)paramView.findViewById(a.f.sLg));
    this.slv = ((TextView)paramView.findViewById(a.f.sLn));
    GMTrace.o(9011780911104L, 67143);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(9011646693376L, 67142);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    this.CJ.inflate(a.g.sQt, localViewGroup);
    GMTrace.o(9011646693376L, 67142);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditDetailHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */