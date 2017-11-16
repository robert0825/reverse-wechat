package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.wallet_core.ui.e;

public final class a
  extends k
  implements View.OnClickListener
{
  private int gRb;
  protected View jBw;
  private View.OnClickListener ooQ;
  
  private a(Context paramContext)
  {
    this(paramContext, (byte)0);
    GMTrace.i(10820499013632L, 80619);
    GMTrace.o(10820499013632L, 80619);
  }
  
  private a(Context paramContext, byte paramByte)
  {
    super(paramContext, a.j.tio);
    GMTrace.i(10820633231360L, 80620);
    this.gRb = 0;
    paramByte = a.g.sOy;
    if (paramByte > 0) {
      this.jBw = View.inflate(paramContext, paramByte, null);
    }
    setContentView(this.jBw);
    ((Button)this.jBw.findViewById(a.f.biN)).setOnClickListener(this);
    ((Button)this.jBw.findViewById(a.f.svY)).setOnClickListener(this);
    GMTrace.o(10820633231360L, 80620);
  }
  
  public static a a(Context paramContext, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(10821035884544L, 80623);
    w.i("RemittanceChargeDialog", "showCostDetail");
    a locala = new a(paramContext);
    locala.gRb = paramInt;
    if (paramDouble1 == 0.0D) {
      w.i("RemittanceChargeDialog", "showCostDetail ::: remian_fee = 0");
    }
    ((TextView)locala.findViewById(a.f.sGU)).setText(e.s(paramDouble1));
    ((TextView)locala.findViewById(a.f.svl)).setText(e.s(paramDouble2));
    if (paramDouble3 == 0.0D) {
      w.e("RemittanceChargeDialog", "showCostDetail ::: transaction_costs = 0");
    }
    ((TextView)locala.findViewById(a.f.sHW)).setText(e.s(paramDouble3));
    locala.findViewById(a.f.sGp).setVisibility(0);
    if (!bg.nm(paramString))
    {
      TextView localTextView = (TextView)locala.findViewById(a.f.sGA);
      localTextView.setText(paramString);
      localTextView.setVisibility(0);
    }
    locala.findViewById(a.f.sHP).setVisibility(0);
    locala.ooQ = paramOnClickListener;
    locala.findViewById(a.f.bSm).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10822243844096L, 80632);
        if (a.a(a.this) != null)
        {
          a.a(a.this).onClick(paramAnonymousView);
          a.this.dismiss();
        }
        GMTrace.o(10822243844096L, 80632);
      }
    });
    locala.show();
    h.a(paramContext, locala);
    if (paramInt == 1) {
      g.ork.i(12689, new Object[] { Integer.valueOf(10), Integer.valueOf(1) });
    }
    for (;;)
    {
      GMTrace.o(10821035884544L, 80623);
      return locala;
      g.ork.i(12689, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString, double paramDouble)
  {
    GMTrace.i(10820901666816L, 80622);
    w.i("RemittanceChargeDialog", "showAlert");
    a locala = new a(paramContext);
    locala.gRb = paramInt;
    w.i("RemittanceChargeDialog", "showTips");
    TextView localTextView = (TextView)locala.findViewById(a.f.sGA);
    if (bg.nm(paramString)) {
      w.e("RemittanceChargeDialog", "desc is null");
    }
    for (;;)
    {
      ((TextView)locala.findViewById(a.f.swa)).setText(paramContext.getResources().getString(a.i.sYf, new Object[] { e.s(paramDouble) }));
      locala.findViewById(a.f.sHN).setVisibility(0);
      locala.findViewById(a.f.swb).setVisibility(0);
      locala.show();
      h.a(paramContext, locala);
      GMTrace.o(10820901666816L, 80622);
      return;
      localTextView.setText(paramString);
      localTextView.setVisibility(0);
    }
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(10820767449088L, 80621);
    if (paramView.getId() != a.f.bSm)
    {
      w.i("RemittanceChargeDialog", "click cancel");
      dismiss();
    }
    if (paramView.getId() == a.f.biN)
    {
      if (this.gRb == 1)
      {
        g.ork.i(12689, new Object[] { Integer.valueOf(11), Integer.valueOf(1) });
        GMTrace.o(10820767449088L, 80621);
        return;
      }
      g.ork.i(12689, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
    }
    GMTrace.o(10820767449088L, 80621);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */