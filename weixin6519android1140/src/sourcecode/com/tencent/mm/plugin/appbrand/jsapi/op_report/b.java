package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 245;
  private static final String NAME = "reportPageData";
  
  public b()
  {
    GMTrace.i(17383074824192L, 129514);
    GMTrace.o(17383074824192L, 129514);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17383209041920L, 129515);
    Object localObject = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.nL(paramj.hyD);
    AppBrandOpReportLogic.ReportTask localReportTask = new AppBrandOpReportLogic.ReportTask();
    if (localObject != null)
    {
      localReportTask.appId = ((AppBrandSysConfig)localObject).appId;
      localReportTask.username = ((AppBrandSysConfig)localObject).eAr;
      localReportTask.hZb = ((AppBrandSysConfig)localObject).hRg.hKB;
      localReportTask.eVc = ((AppBrandSysConfig)localObject).hRg.hKC;
      localReportTask.icO = l.SC().hKC;
    }
    if (localAppBrandStatObject != null)
    {
      localReportTask.scene = localAppBrandStatObject.scene;
      localReportTask.eVi = localAppBrandStatObject.eVi;
    }
    localObject = b(paramj);
    if (localObject != null) {
      localReportTask.eAw = ((AppBrandPageView)localObject).ivj.hZo;
    }
    localReportTask.ijm = paramJSONObject.toString();
    AppBrandMainProcessService.a(localReportTask);
    paramj.v(paramInt, d("ok", null));
    GMTrace.o(17383209041920L, 129515);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\op_report\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */