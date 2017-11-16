package com.tencent.mm.plugin.wallet.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;

public class CheckBoxWithTipIconPreference
  extends CheckBoxPreference
{
  private TextView rcd;
  private int rce;
  private String rcf;
  private int rcg;
  
  public CheckBoxWithTipIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7736309841920L, 57640);
    GMTrace.o(7736309841920L, 57640);
  }
  
  public CheckBoxWithTipIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7736444059648L, 57641);
    this.rce = -1;
    this.rcf = "";
    this.rcg = 8;
    setLayoutResource(a.g.sNE);
    GMTrace.o(7736444059648L, 57641);
  }
  
  public final void cc(String paramString, int paramInt)
  {
    GMTrace.i(7736712495104L, 57643);
    this.rce = paramInt;
    this.rcf = paramString;
    if (this.rcd != null)
    {
      if (this.rce > 0) {
        this.rcd.setBackgroundResource(this.rce);
      }
      if (!TextUtils.isEmpty(this.rcf)) {
        this.rcd.setText(this.rcf);
      }
    }
    GMTrace.o(7736712495104L, 57643);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(7736578277376L, 57642);
    super.onBindView(paramView);
    this.rcd = ((TextView)paramView.findViewById(a.f.gen));
    cc(this.rcf, this.rce);
    wO(this.rcg);
    GMTrace.o(7736578277376L, 57642);
  }
  
  public final void wO(int paramInt)
  {
    GMTrace.i(7736846712832L, 57644);
    this.rcg = paramInt;
    if (this.rcd != null) {
      this.rcd.setVisibility(paramInt);
    }
    GMTrace.o(7736846712832L, 57644);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\ui\CheckBoxWithTipIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */