package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class LaunchAAByPersonAmountSelectRow
  extends LinearLayout
{
  private ImageView hqg;
  private TextView hrh;
  private WalletFormView hri;
  private View hrj;
  private TextWatcher hrk;
  
  public LaunchAAByPersonAmountSelectRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5627749335040L, 41930);
    this.hrk = null;
    init(paramContext);
    GMTrace.o(5627749335040L, 41930);
  }
  
  public LaunchAAByPersonAmountSelectRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5627883552768L, 41931);
    this.hrk = null;
    init(paramContext);
    GMTrace.o(5627883552768L, 41931);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5628017770496L, 41932);
    v.fb(paramContext).inflate(a.g.sMA, this, true);
    this.hqg = ((ImageView)findViewById(a.f.bfk));
    this.hrh = ((TextView)findViewById(a.f.cjM));
    this.hri = ((WalletFormView)findViewById(a.f.sCy));
    this.hrj = findViewById(a.f.divider);
    GMTrace.o(5628017770496L, 41932);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\LaunchAAByPersonAmountSelectRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */