package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 149;
  public static final String NAME = "requestPaymentToBank";
  
  public e()
  {
    GMTrace.i(14427197800448L, 107491);
    GMTrace.o(14427197800448L, 107491);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14427332018176L, 107492);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427332018176L, 107492);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramj.hyD);
      a locala = a.ijo;
      Object localObject = paramj.hzM.hyO;
      b.a local1 = new b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, Map<String, Object> paramAnonymousMap)
        {
          GMTrace.i(20740531290112L, 154529);
          switch (paramAnonymousInt1)
          {
          default: 
            paramj.v(paramInt, e.this.d("fail", null));
            GMTrace.o(20740531290112L, 154529);
            return;
          }
          paramj.v(paramInt, e.this.d("ok", paramAnonymousMap));
          GMTrace.o(20740531290112L, 154529);
        }
      };
      paramj = new f(paramJSONObject);
      if (localObject != null) {
        paramj.ePN = f.dY(((AppBrandStatObject)localObject).scene, ((AppBrandStatObject)localObject).eVh);
      }
      paramj.ePL = 46;
      paramJSONObject = new a.2(locala, local1);
      localObject = new Intent();
      ((Intent)localObject).putExtra("appId", paramj.appId);
      ((Intent)localObject).putExtra("timeStamp", paramj.timeStamp);
      ((Intent)localObject).putExtra("nonceStr", paramj.nonceStr);
      ((Intent)localObject).putExtra("packageExt", paramj.packageExt);
      ((Intent)localObject).putExtra("signtype", paramj.signType);
      ((Intent)localObject).putExtra("paySignature", paramj.ePJ);
      ((Intent)localObject).putExtra("url", paramj.url);
      ((Intent)localObject).putExtra("pay_scene", paramj.ePM);
      localMMActivity.vKC = paramJSONObject;
      com.tencent.mm.bj.d.a(localMMActivity, "wallet", ".pay.ui.WalletLoanRepaymentUI", (Intent)localObject, locala.hashCode() & 0xFFFF, false);
      GMTrace.o(14427332018176L, 107492);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiRequestPaymentToBank", paramJSONObject.getMessage());
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427332018176L, 107492);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */