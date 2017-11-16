package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import java.util.HashMap;
import org.json.JSONObject;

public final class bl
  extends a
{
  public static final int CTRL_INDEX = 66;
  public static final String NAME = "reportSubmitForm";
  
  public bl()
  {
    GMTrace.i(10297586745344L, 76723);
    GMTrace.o(10297586745344L, 76723);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10297720963072L, 76724);
    paramJSONObject = new ReportSubmitFormTask(paramAppBrandPageView.hyD);
    paramJSONObject.type = 1;
    paramJSONObject.icJ = System.currentTimeMillis();
    paramJSONObject.ePf = paramAppBrandPageView.ivj.iwc;
    AppBrandMainProcessService.a(paramJSONObject);
    HashMap localHashMap = new HashMap();
    localHashMap.put("formId", paramJSONObject.icJ);
    i locali = i.oe(paramAppBrandPageView.hyD);
    if (locali != null) {
      locali.hzI = paramJSONObject.icJ;
    }
    paramAppBrandPageView.v(paramInt, d("ok", localHashMap));
    GMTrace.o(10297720963072L, 76724);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */