package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.page.m;
import org.json.JSONObject;

public final class bb
  extends a
{
  public static final int CTRL_INDEX = 13;
  public static final String NAME = "redirectTo";
  
  public bb()
  {
    GMTrace.i(10440125972480L, 77785);
    GMTrace.o(10440125972480L, 77785);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10440260190208L, 77786);
    paramJSONObject = paramJSONObject.optString("url");
    if (paramj.hzM.hyH.hPA.pf(paramJSONObject))
    {
      paramj.v(paramInt, d("fail:can not redirect to a tab bar page", null));
      GMTrace.o(10440260190208L, 77786);
      return;
    }
    paramj.hzM.hyJ.rI(paramJSONObject);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(10440260190208L, 77786);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */