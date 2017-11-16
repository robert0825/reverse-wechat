package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.wepkg.model.g;
import com.tencent.mm.plugin.webview.wepkg.model.g.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends a
{
  public static final int CTRL_BYTE = -2;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "getLocalWePkgInfo";
  
  public r()
  {
    GMTrace.i(17061891801088L, 127121);
    GMTrace.o(17061891801088L, 127121);
  }
  
  public final void a(Context paramContext, String paramString, final GameJsApiMMTask.a parama)
  {
    GMTrace.i(17062026018816L, 127122);
    w.i("MicroMsg.GameJsApiGetLocalWePkgInfo", "invoke");
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17042564448256L, 126977);
        g.a(new g.a()
        {
          public final void A(JSONObject paramAnonymous2JSONObject)
          {
            GMTrace.i(17069542211584L, 127178);
            HashMap localHashMap = new HashMap();
            localHashMap.put("wepkg_info", paramAnonymous2JSONObject);
            r.1.this.lGS.qp(r.d("getLocalWePkgInfo:ok", localHashMap));
            GMTrace.o(17069542211584L, 127178);
          }
        });
        GMTrace.o(17042564448256L, 126977);
      }
    });
    GMTrace.o(17062026018816L, 127122);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */