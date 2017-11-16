package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 85;
  public static final String NAME = "verifyPaymentPassword";
  
  public g()
  {
    GMTrace.i(14427734671360L, 107495);
    GMTrace.o(14427734671360L, 107495);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14427868889088L, 107496);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427868889088L, 107496);
      return;
    }
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427868889088L, 107496);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramj.hyD);
      a locala = a.ijo;
      paramj = new a.5(locala, new b.b()
      {
        public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
        {
          GMTrace.i(19807181209600L, 147575);
          if (paramAnonymousBoolean)
          {
            HashMap localHashMap = new HashMap(1);
            localHashMap.put("token", paramAnonymousString);
            paramj.v(paramInt, g.this.d("ok", localHashMap));
            GMTrace.o(19807181209600L, 147575);
            return;
          }
          paramj.v(paramInt, g.this.d("fail", null));
          GMTrace.o(19807181209600L, 147575);
        }
      });
      paramJSONObject = new f(paramJSONObject);
      Intent localIntent = new Intent();
      localIntent.putExtra("appId", paramJSONObject.appId);
      localIntent.putExtra("timeStamp", paramJSONObject.timeStamp);
      localIntent.putExtra("nonceStr", paramJSONObject.nonceStr);
      localIntent.putExtra("packageExt", paramJSONObject.packageExt);
      localIntent.putExtra("signtype", paramJSONObject.signType);
      localIntent.putExtra("paySignature", paramJSONObject.ePJ);
      localIntent.putExtra("url", paramJSONObject.url);
      localIntent.putExtra("scene", 1);
      localMMActivity.vKC = paramj;
      com.tencent.mm.bj.d.a(localMMActivity, "wallet_core", ".ui.WalletCheckPwdUI", localIntent, locala.hashCode() & 0xFFFF, false);
      GMTrace.o(14427868889088L, 107496);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiVerifyPaymentPassword", paramJSONObject.getMessage());
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14427868889088L, 107496);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */