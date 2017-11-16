package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends a
{
  public static final int CTRL_INDEX = 58;
  public static final String NAME = "addCard";
  public int hXU;
  
  public m()
  {
    GMTrace.i(10417443176448L, 77616);
    GMTrace.o(10417443176448L, 77616);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10417577394176L, 77617);
    Intent localIntent = new Intent();
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiAddCard", "mmActivity is null, invoke fail!");
      GMTrace.o(10417577394176L, 77617);
      return;
    }
    paramJSONObject = paramJSONObject.optString("cardList");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiAddCard", "cardList is null, invoke fail!");
      GMTrace.o(10417577394176L, 77617);
      return;
    }
    this.hXU = paramInt;
    localMMActivity.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(10297452527616L, 76722);
        if (paramAnonymousInt1 == 1)
        {
          if (paramAnonymousInt2 == -1)
          {
            if (paramAnonymousIntent == null)
            {
              paramj.v(m.this.hXU, m.this.d("fail", null));
              w.e("MicroMsg.JsApiAddCard", "location result is empty!");
              GMTrace.o(10297452527616L, 76722);
              return;
            }
            HashMap localHashMap = new HashMap();
            paramAnonymousIntent = paramAnonymousIntent.getStringExtra("card_list");
            w.d("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback cardList:%s", new Object[] { paramAnonymousIntent });
            try
            {
              paramAnonymousIntent = new JSONArray(paramAnonymousIntent);
              if (paramAnonymousIntent != null)
              {
                localHashMap.put("cardList", paramAnonymousIntent);
                paramj.v(m.this.hXU, m.this.d("ok", localHashMap));
                GMTrace.o(10297452527616L, 76722);
                return;
              }
            }
            catch (JSONException paramAnonymousIntent)
            {
              for (;;)
              {
                w.e("MicroMsg.JsApiAddCard", "parse fail result:%s", new Object[] { bg.f(paramAnonymousIntent) });
                paramAnonymousIntent = null;
              }
              paramj.v(m.this.hXU, m.this.d("fail: cardList is empty", localHashMap));
              w.e("MicroMsg.JsApiAddCard", "add card result is fail! cardList is empty");
              GMTrace.o(10297452527616L, 76722);
              return;
            }
          }
          if (paramAnonymousInt2 == 0)
          {
            paramj.v(m.this.hXU, m.this.d("cancel", null));
            w.e("MicroMsg.JsApiAddCard", "add card result is cancel!");
            GMTrace.o(10297452527616L, 76722);
            return;
          }
          paramAnonymousInt1 = 2;
          if (paramAnonymousIntent != null) {
            paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("result_code", 2);
          }
          w.i("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback ret_code:%d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          if (paramAnonymousInt1 == 2)
          {
            paramj.v(m.this.hXU, m.this.d("fail", null));
            GMTrace.o(10297452527616L, 76722);
            return;
          }
          paramj.v(m.this.hXU, m.this.d("cancel", null));
        }
        GMTrace.o(10297452527616L, 76722);
      }
    };
    localIntent.putExtra("key_in_card_list", paramJSONObject);
    localIntent.putExtra("key_from_scene", 26);
    paramj = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    if ((paramj != null) && (paramj.hRg != null)) {
      localIntent.putExtra("key_from_appbrand_type", paramj.hRg.hKB);
    }
    com.tencent.mm.bj.d.b(localMMActivity, "card", ".ui.CardAddEntranceUI", localIntent, 1);
    GMTrace.o(10417577394176L, 77617);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */