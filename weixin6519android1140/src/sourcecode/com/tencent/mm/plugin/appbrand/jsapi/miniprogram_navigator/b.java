package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.2;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 252;
  public static final String NAME = "navigateBackMiniProgram";
  
  public b()
  {
    GMTrace.i(19830400876544L, 147748);
    GMTrace.o(19830400876544L, 147748);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19830535094272L, 147749);
    paramJSONObject = paramJSONObject.optJSONObject("extraData");
    paramj = paramj.hzM;
    paramj.hyB.runOnUiThread(new e.2(paramj, paramJSONObject));
    GMTrace.o(19830535094272L, 147749);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\miniprogram_navigator\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */