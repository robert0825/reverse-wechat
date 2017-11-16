package com.tencent.mm.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.ui.base.s;

public final class g
  extends s
{
  private View Hw;
  private ProgressBar iIN;
  private Context mContext;
  private TextView vKl;
  
  private g(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    GMTrace.i(1479079362560L, 11020);
    this.mContext = paramContext;
    this.Hw = null;
    if (this.Hw == null)
    {
      paramInt = a.g.sPZ;
      this.Hw = View.inflate(this.mContext, paramInt, null);
      this.vKl = ((TextView)this.Hw.findViewById(a.f.bNv));
      this.iIN = ((ProgressBar)this.Hw.findViewById(a.f.bNu));
      setCanceledOnTouchOutside(true);
    }
    GMTrace.o(1479079362560L, 11020);
  }
  
  public static Dialog a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(1479616233472L, 11024);
    paramContext = new g(paramContext, a.j.eme);
    paramContext.setMessage(paramCharSequence);
    paramContext.setCancelable(paramBoolean);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.show();
    GMTrace.o(1479616233472L, 11024);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(1479750451200L, 11025);
    View localView = View.inflate(paramContext, a.g.sQa, null);
    paramContext = new k(paramContext, a.j.tin);
    paramContext.setCancelable(paramBoolean);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    GMTrace.o(1479750451200L, 11025);
    return paramContext;
  }
  
  public static Dialog b(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(19126294675456L, 142502);
    View localView = View.inflate(paramContext, a.g.sQa, null);
    ((TextView)localView.findViewById(a.f.suT)).setText(paramString);
    paramContext = new k(paramContext, a.j.tin);
    paramContext.setCancelable(false);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    GMTrace.o(19126294675456L, 142502);
    return paramContext;
  }
  
  public static Dialog e(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(1479884668928L, 11026);
    View localView = View.inflate(paramContext, a.g.sQa, null);
    paramContext = new k(paramContext, a.j.tin);
    paramContext.setCancelable(true);
    paramContext.setContentView(localView);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    GMTrace.o(1479884668928L, 11026);
    return paramContext;
  }
  
  public final void dismiss()
  {
    GMTrace.i(1480018886656L, 11027);
    try
    {
      super.dismiss();
      GMTrace.o(1480018886656L, 11027);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WalletProgressDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(1480018886656L, 11027);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1479213580288L, 11021);
    super.onCreate(paramBundle);
    setContentView(this.Hw, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -2;
    paramBundle.height = -2;
    getWindow().addFlags(2);
    paramBundle.dimAmount = 0.65F;
    onWindowAttributesChanged(paramBundle);
    GMTrace.o(1479213580288L, 11021);
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(1479347798016L, 11022);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    GMTrace.o(1479347798016L, 11022);
  }
  
  public final void setMessage(CharSequence paramCharSequence)
  {
    GMTrace.i(1479482015744L, 11023);
    this.vKl.setText(paramCharSequence);
    GMTrace.o(1479482015744L, 11023);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */