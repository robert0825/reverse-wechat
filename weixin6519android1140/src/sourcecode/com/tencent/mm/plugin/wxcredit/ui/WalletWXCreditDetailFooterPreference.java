package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletWXCreditDetailFooterPreference
  extends Preference
  implements View.OnClickListener
{
  private LayoutInflater CJ;
  private TextView sls;
  private TextView slt;
  View.OnClickListener slu;
  
  public WalletWXCreditDetailFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(9010707169280L, 67135);
    GMTrace.o(9010707169280L, 67135);
  }
  
  public WalletWXCreditDetailFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9010841387008L, 67136);
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(a.g.cBA);
    GMTrace.o(9010841387008L, 67136);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(9011109822464L, 67138);
    super.onBindView(paramView);
    this.sls = ((TextView)paramView.findViewById(a.f.sLh));
    this.slt = ((TextView)paramView.findViewById(a.f.sLf));
    this.sls.setOnClickListener(this);
    this.slt.setOnClickListener(this);
    GMTrace.o(9011109822464L, 67138);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(9011244040192L, 67139);
    if (this.slu != null) {
      this.slu.onClick(paramView);
    }
    GMTrace.o(9011244040192L, 67139);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(9010975604736L, 67137);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    this.CJ.inflate(a.g.sQs, localViewGroup);
    GMTrace.o(9010975604736L, 67137);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\ui\WalletWXCreditDetailFooterPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */