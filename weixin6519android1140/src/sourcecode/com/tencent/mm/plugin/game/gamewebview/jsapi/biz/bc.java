package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.21;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class bc
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 238;
  public static final String NAME = "showSmileyPanel";
  
  public bc()
  {
    GMTrace.i(17068200034304L, 127168);
    GMTrace.o(17068200034304L, 127168);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    GMTrace.i(17068334252032L, 127169);
    w.i("MicroMsg.GameJsApiShowSmileyPanel", "invoke");
    if (paramd.lJs != null) {
      if (Thread.currentThread().getId() != paramd.mHandler.getLooper().getThread().getId()) {
        break label111;
      }
    }
    label111:
    for (i = paramd.lJs.bFW(); i > 0; i = ((Integer)new d.21(paramd, Integer.valueOf(0)).b(paramd.mHandler)).intValue())
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("height", Integer.valueOf(com.tencent.mm.br.a.Y(paramd.getContext(), i)));
      paramd.v(paramInt, d("showSmileyPanel:ok", paramJSONObject));
      GMTrace.o(17068334252032L, 127169);
      return;
    }
    paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("showSmileyPanel:fail", null));
    GMTrace.o(17068334252032L, 127169);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */