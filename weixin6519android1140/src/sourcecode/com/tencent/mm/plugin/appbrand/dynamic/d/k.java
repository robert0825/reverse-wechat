package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.plugin.appbrand.dynamic.widget.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public k(int paramInt)
  {
    super("setWidgetSize", paramInt);
    GMTrace.i(19931332608000L, 148500);
    GMTrace.o(19931332608000L, 148500);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, final b.a<JSONObject> parama1)
  {
    GMTrace.i(20776770076672L, 154799);
    parama = parama.wr();
    a.a locala = new a.a();
    locala.id = parama.getString("__page_view_id", "");
    locala.width = paramJSONObject.optInt("width", parama.getInt("__page_view_width", 0));
    locala.height = paramJSONObject.optInt("height", parama.getInt("__page_view_height", 0));
    XIPCInvoker.a(parama.getString("__process_name", ab.vM()), locala, a.class, new h() {});
    GMTrace.o(20776770076672L, 154799);
  }
  
  private static class a
    implements g<a.a, Bundle>
  {
    private a()
    {
      GMTrace.i(18942147952640L, 141130);
      GMTrace.o(18942147952640L, 141130);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */