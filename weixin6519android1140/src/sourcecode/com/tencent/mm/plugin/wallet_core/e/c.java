package com.tencent.mm.plugin.wallet_core.e;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.b;

public final class c
{
  public static long rqO;
  public static int rqP;
  public static int rqQ;
  public static int rqR;
  
  static
  {
    GMTrace.i(6835843104768L, 50931);
    rqO = 0L;
    rqP = 2;
    rqQ = 1;
    rqR = 2;
    GMTrace.o(6835843104768L, 50931);
  }
  
  public static void a(PayInfo paramPayInfo, Orders paramOrders)
  {
    GMTrace.i(6835708887040L, 50930);
    if ((!n.byx().byS()) && (paramPayInfo != null) && (paramOrders != null)) {
      g.ork.i(10725, new Object[] { Integer.valueOf(1), Integer.valueOf(paramPayInfo.ePL), Integer.valueOf((int)(paramOrders.rhd * 100.0D)), paramOrders.nEr });
    }
    GMTrace.o(6835708887040L, 50930);
  }
  
  public static void b(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    GMTrace.i(6835440451584L, 50928);
    paramActivity = a.ad(paramActivity);
    if ((!n.byx().byS()) && (paramActivity != null) && (paramActivity.clC()))
    {
      paramActivity = (PayInfo)paramBundle.getParcelable("key_pay_info");
      paramBundle = (Orders)paramBundle.getParcelable("key_orders");
      if ((paramActivity != null) && (paramBundle != null)) {
        g.ork.i(10725, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramActivity.ePL), Integer.valueOf((int)(paramBundle.rhd * 100.0D)), paramBundle.nEr });
      }
      GMTrace.o(6835440451584L, 50928);
      return;
    }
    if ((!n.byx().byS()) && (paramBundle != null) && (paramBundle.getBoolean("key_is_bind_reg_process", false))) {
      g.ork.i(10932, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramBundle.getInt("key_bind_scene", 0)) });
    }
    GMTrace.o(6835440451584L, 50928);
  }
  
  public static void bAa()
  {
    GMTrace.i(6835172016128L, 50926);
    rqO = System.currentTimeMillis();
    GMTrace.o(6835172016128L, 50926);
  }
  
  public static int bAb()
  {
    GMTrace.i(6835306233856L, 50927);
    int i = (int)((System.currentTimeMillis() - rqO) / 1000L);
    GMTrace.o(6835306233856L, 50927);
    return i;
  }
  
  public static void dy(int paramInt1, int paramInt2)
  {
    GMTrace.i(6835574669312L, 50929);
    g.ork.i(10932, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    GMTrace.o(6835574669312L, 50929);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */