package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.menu.MenuDelegate_EnableDebug;
import org.json.JSONObject;

public final class bm
  extends a
{
  public static final int CTRL_INDEX = 249;
  public static final String NAME = "setEnableDebug";
  
  public bm()
  {
    GMTrace.i(17381329993728L, 129501);
    GMTrace.o(17381329993728L, 129501);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17381464211456L, 129502);
    boolean bool = paramJSONObject.optBoolean("enableDebug", false);
    if (paramj.hzM.hyG.hQL == bool)
    {
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(17381464211456L, 129502);
      return;
    }
    MenuDelegate_EnableDebug.e(paramj.mContext, paramj.hyD, bool);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(17381464211456L, 129502);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */