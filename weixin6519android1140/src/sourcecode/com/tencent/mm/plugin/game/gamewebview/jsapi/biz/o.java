package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o
  extends a
{
  public static final int CTRL_BYTE = 28;
  public static final String NAME = "getBrandWCPayRequest";
  
  public o()
  {
    GMTrace.i(17041893359616L, 126972);
    GMTrace.o(17041893359616L, 126972);
  }
  
  public final void a(final d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17042027577344L, 126973);
    w.i("MicroMsg.GameJsApiGetBrandWCPayRequest", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.aEo();
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiGetBrandWCPayRequest", "data is null");
      paramd.v(paramInt, a.d("get_brand_wcpay_request:fail_invalid_data", null));
      GMTrace.o(17042027577344L, 126973);
      return;
    }
    paramJSONObject = new f(paramJSONObject);
    paramd = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(17065784115200L, 127150);
        if (paramAnonymousInt1 != (o.this.hashCode() & 0xFFFF))
        {
          GMTrace.o(17065784115200L, 127150);
          return;
        }
        if (paramAnonymousInt2 == -1)
        {
          paramAnonymousIntent = paramd;
          paramAnonymousInt1 = paramInt;
          localObject = o.this;
          paramAnonymousIntent.v(paramAnonymousInt1, a.d("ok", null));
          GMTrace.o(17065784115200L, 127150);
          return;
        }
        if (paramAnonymousInt2 == 5)
        {
          localObject = new HashMap();
          paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("key_jsapi_pay_err_code", 0);
          paramAnonymousIntent = bg.nl(paramAnonymousIntent.getStringExtra("key_jsapi_pay_err_msg"));
          ((Map)localObject).put("err_code", Integer.valueOf(paramAnonymousInt1));
          ((Map)localObject).put("err_desc", paramAnonymousIntent);
          w.e("MicroMsg.GameJsApiGetBrandWCPayRequest", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousIntent });
          paramd.v(paramInt, o.d("get_brand_wcpay_request:fail", (Map)localObject));
          GMTrace.o(17065784115200L, 127150);
          return;
        }
        paramAnonymousIntent = paramd;
        paramAnonymousInt1 = paramInt;
        Object localObject = o.this;
        paramAnonymousIntent.v(paramAnonymousInt1, a.d("get_brand_wcpay_request:cancel", null));
        GMTrace.o(17065784115200L, 127150);
      }
    };
    g.a(localGameWebViewUI, paramJSONObject, hashCode() & 0xFFFF, paramd);
    GMTrace.o(17042027577344L, 126973);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */