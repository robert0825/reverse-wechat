package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletSecuritySettingHeaderPref
  extends Preference
{
  private MMActivity ezR;
  TextView iZs;
  String kXe;
  TextView rbA;
  String rbB;
  String rbC;
  View.OnClickListener rbD;
  View.OnClickListener rbE;
  private TextView rby;
  private TextView rbz;
  
  public WalletSecuritySettingHeaderPref(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(19538477318144L, 145573);
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(19538477318144L, 145573);
  }
  
  public WalletSecuritySettingHeaderPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(19538611535872L, 145574);
    this.rbD = null;
    this.rbE = null;
    this.ezR = ((MMActivity)paramContext);
    setLayoutResource(a.g.sQe);
    GMTrace.o(19538611535872L, 145574);
  }
  
  final void ar()
  {
    GMTrace.i(19538879971328L, 145576);
    if ((!bg.nm(this.kXe)) && (this.rby != null))
    {
      this.rby.setText(this.kXe);
      this.rby.setVisibility(0);
    }
    if ((!bg.nm(this.rbB)) && (this.rbz != null))
    {
      this.rbz.setText(this.rbB);
      this.rbz.setVisibility(0);
    }
    if ((!bg.nm(this.rbC)) && (this.rbA != null))
    {
      this.rbA.setText(this.rbC);
      this.rbA.setVisibility(0);
    }
    if ((bg.nm(this.rbC)) && (this.rbA != null)) {
      this.rbA.setVisibility(8);
    }
    GMTrace.o(19538879971328L, 145576);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(19538745753600L, 145575);
    super.onBindView(paramView);
    w.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo onBindView");
    this.rby = ((TextView)paramView.findViewById(a.f.bLQ));
    this.rbz = ((TextView)paramView.findViewById(a.f.btg));
    this.rbA = ((TextView)paramView.findViewById(a.f.suS));
    this.iZs = ((TextView)paramView.findViewById(a.f.sKN));
    ar();
    if ((this.rbA != null) && (this.rbD != null)) {
      this.rbA.setOnClickListener(this.rbD);
    }
    if ((this.iZs != null) && (this.rbE != null)) {
      this.iZs.setOnClickListener(this.rbE);
    }
    GMTrace.o(19538745753600L, 145575);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletSecuritySettingHeaderPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */