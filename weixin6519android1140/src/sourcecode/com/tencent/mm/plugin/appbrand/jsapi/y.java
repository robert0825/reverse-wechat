package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import org.json.JSONObject;

final class y
  extends a
{
  static final int CTRL_INDEX = 191;
  static final String NAME = "exitMiniProgram";
  
  y()
  {
    GMTrace.i(10375969898496L, 77307);
    GMTrace.o(10375969898496L, 77307);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10376104116224L, 77308);
    paramJSONObject = paramj.mContext;
    if ((paramJSONObject != null) && ((paramJSONObject instanceof Activity)))
    {
      ((Activity)paramJSONObject).finish();
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(10376104116224L, 77308);
      return;
    }
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(10376104116224L, 77308);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */