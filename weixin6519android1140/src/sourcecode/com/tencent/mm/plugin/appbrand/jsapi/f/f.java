package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 218;
  public static final String NAME = "sendBizRedPacket";
  
  public f()
  {
    GMTrace.i(15487786287104L, 115393);
    GMTrace.o(15487786287104L, 115393);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(15487920504832L, 115394);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(15487920504832L, 115394);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramj.hyD);
      a locala = a.ijo;
      Object localObject = new b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, Map<String, Object> paramAnonymousMap)
        {
          GMTrace.i(20740128636928L, 154526);
          switch (paramAnonymousInt1)
          {
          default: 
            paramj.v(paramInt, f.this.d("fail", null));
            GMTrace.o(20740128636928L, 154526);
            return;
          }
          paramj.v(paramInt, f.this.d("ok", null));
          GMTrace.o(20740128636928L, 154526);
        }
      };
      paramj = new com.tencent.mm.pluginsdk.wallet.f(paramJSONObject);
      paramj.ePN = 16;
      paramJSONObject = new a.4(locala, (b.a)localObject);
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_way", 3);
      ((Intent)localObject).putExtra("appId", paramj.appId);
      ((Intent)localObject).putExtra("timeStamp", paramj.timeStamp);
      ((Intent)localObject).putExtra("nonceStr", paramj.nonceStr);
      ((Intent)localObject).putExtra("packageExt", paramj.packageExt);
      ((Intent)localObject).putExtra("signtype", paramj.signType);
      ((Intent)localObject).putExtra("paySignature", paramj.ePJ);
      ((Intent)localObject).putExtra("key_static_from_scene", 100004);
      ((Intent)localObject).putExtra("url", paramj.url);
      localMMActivity.vKC = paramJSONObject;
      com.tencent.mm.bj.d.a(localMMActivity, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", (Intent)localObject, locala.hashCode() & 0xFFFF, false);
      GMTrace.o(15487920504832L, 115394);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiSendBizRedPacket", paramJSONObject.getMessage());
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(15487920504832L, 115394);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */