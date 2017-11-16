package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class LaunchAAByPersonRow
  extends LinearLayout
{
  private ImageView hrI;
  private TextView hrJ;
  private TextView hrK;
  private WalletFormView hrL;
  private TextView hrM;
  
  public LaunchAAByPersonRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5618085658624L, 41858);
    init();
    GMTrace.o(5618085658624L, 41858);
  }
  
  public LaunchAAByPersonRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5618219876352L, 41859);
    init();
    GMTrace.o(5618219876352L, 41859);
  }
  
  private void init()
  {
    GMTrace.i(5618354094080L, 41860);
    inflate(getContext(), a.g.sMD, this);
    this.hrI = ((ImageView)findViewById(a.f.spl));
    this.hrJ = ((TextView)findViewById(a.f.spw));
    this.hrL = ((WalletFormView)findViewById(a.f.swE));
    this.hrK = ((TextView)findViewById(a.f.swF));
    this.hrM = ((TextView)findViewById(a.f.sCE));
    GMTrace.o(5618354094080L, 41860);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\LaunchAAByPersonRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */