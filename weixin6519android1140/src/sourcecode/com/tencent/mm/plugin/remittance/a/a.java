package com.tencent.mm.plugin.remittance.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b;

public class a
  extends b
{
  public a()
  {
    GMTrace.i(10838349971456L, 80752);
    GMTrace.o(10838349971456L, 80752);
  }
  
  public b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(10838484189184L, 80753);
    w.d("MicroMsg.RemittanceProcess", "start Process : RemittanceProcess");
    c(paramActivity, RemittanceAdapterUI.class, paramBundle);
    GMTrace.o(10838484189184L, 80753);
    return this;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(10838618406912L, 80754);
    GMTrace.o(10838618406912L, 80754);
  }
  
  public final String aAd()
  {
    GMTrace.i(10839155277824L, 80758);
    GMTrace.o(10839155277824L, 80758);
    return "RemittanceProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(10838752624640L, 80755);
    super.ae(paramActivity);
    GMTrace.o(10838752624640L, 80755);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(10838886842368L, 80756);
    B(paramActivity);
    GMTrace.o(10838886842368L, 80756);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(10839021060096L, 80757);
    GMTrace.o(10839021060096L, 80757);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */