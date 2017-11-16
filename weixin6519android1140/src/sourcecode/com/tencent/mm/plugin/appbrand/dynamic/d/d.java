package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.jsapi.core.a;
import com.tencent.mm.plugin.appbrand.dynamic.d.a.b;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import org.json.JSONObject;

public final class d
  extends b
{
  public d(int paramInt)
  {
    super("getSystemInfoSync", paramInt);
    GMTrace.i(19930393083904L, 148493);
    GMTrace.o(19930393083904L, 148493);
  }
  
  protected final JSONObject a(a parama)
  {
    GMTrace.i(19930527301632L, 148494);
    Context localContext = parama.getContext();
    parama = parama.wr();
    DisplayMetrics localDisplayMetrics = localContext.getResources().getDisplayMetrics();
    float f = localDisplayMetrics.density;
    HashMap localHashMap = new HashMap();
    localHashMap.put("model", p.te());
    localHashMap.put("pixelRatio", Float.valueOf(f));
    localHashMap.put("windowWidth", Integer.valueOf(c.jL(parama.getInt("__page_view_width", 0))));
    localHashMap.put("windowHeight", Integer.valueOf(c.jL(parama.getInt("__page_view_height", 0))));
    localHashMap.put("screenWidth", Integer.valueOf(c.jL(localDisplayMetrics.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(c.jL(localDisplayMetrics.heightPixels)));
    localHashMap.put("language", v.eq(localContext));
    localHashMap.put("version", f.ab(null, com.tencent.mm.protocal.d.tJC));
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    parama = new JSONObject(localHashMap);
    GMTrace.o(19930527301632L, 148494);
    return parama;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */