package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.jsapi.b.b.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public c(int paramInt)
  {
    super("getSystemInfo", paramInt);
    GMTrace.i(19927171858432L, 148469);
    GMTrace.o(19927171858432L, 148469);
  }
  
  protected final void a(com.tencent.mm.jsapi.core.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    GMTrace.i(20775696334848L, 154791);
    paramJSONObject = parama.getContext();
    parama = parama.wr();
    DisplayMetrics localDisplayMetrics = paramJSONObject.getResources().getDisplayMetrics();
    float f = localDisplayMetrics.density;
    HashMap localHashMap = new HashMap();
    localHashMap.put("model", p.te());
    localHashMap.put("pixelRatio", Float.valueOf(f));
    localHashMap.put("windowWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jL(parama.getInt("__page_view_width", 0))));
    localHashMap.put("windowHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jL(parama.getInt("__page_view_height", 0))));
    localHashMap.put("screenWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jL(localDisplayMetrics.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jL(localDisplayMetrics.heightPixels)));
    localHashMap.put("language", v.eq(paramJSONObject));
    localHashMap.put("version", f.ab(null, d.tJC));
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    parama1.ap(a(true, "", localHashMap));
    GMTrace.o(20775696334848L, 154791);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */