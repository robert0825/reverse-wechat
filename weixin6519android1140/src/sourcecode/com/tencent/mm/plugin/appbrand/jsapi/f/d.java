package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 57;
  public static final String NAME = "requestPayment";
  
  public d()
  {
    GMTrace.i(14425855623168L, 107481);
    GMTrace.o(14425855623168L, 107481);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14425989840896L, 107482);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14425989840896L, 107482);
      return;
    }
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14425989840896L, 107482);
      return;
    }
    try
    {
      paramJSONObject.put("appId", paramj.hyD);
      Object localObject1 = new PString();
      a locala = a.ijo;
      Object localObject2 = paramj.hzM.hyO;
      b.a local1 = new b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, Map<String, Object> paramAnonymousMap)
        {
          GMTrace.i(20740665507840L, 154530);
          switch (paramAnonymousInt1)
          {
          }
          for (;;)
          {
            GMTrace.o(20740665507840L, 154530);
            return;
            paramj.v(paramInt, d.this.d("ok", null));
            GMTrace.o(20740665507840L, 154530);
            return;
            paramAnonymousMap = new HashMap();
            paramAnonymousMap.put("err_code", Integer.valueOf(paramAnonymousInt2));
            paramAnonymousMap.put("err_desc", paramAnonymousString);
            paramj.v(paramInt, d.this.d("fail", paramAnonymousMap));
            GMTrace.o(20740665507840L, 154530);
            return;
            paramj.v(paramInt, d.this.d("cancel", null));
          }
        }
      };
      paramJSONObject = new f(paramJSONObject);
      if (localObject2 != null) {
        paramJSONObject.ePN = f.dY(((AppBrandStatObject)localObject2).scene, ((AppBrandStatObject)localObject2).eVh);
      }
      paramJSONObject.ePL = 46;
      ((PString)localObject1).value = paramJSONObject.packageExt;
      localObject2 = new a.1(locala, local1);
      g.a(localMMActivity, paramJSONObject, locala.hashCode() & 0xFFFF, (MMActivity.a)localObject2);
      paramj = b(paramj);
      paramJSONObject = ((PString)localObject1).value;
      if (paramj != null)
      {
        localObject1 = new ReportSubmitFormTask(paramj.hyD);
        ((ReportSubmitFormTask)localObject1).type = 0;
        ((ReportSubmitFormTask)localObject1).icJ = paramJSONObject.replace("prepay_id=", "");
        ((ReportSubmitFormTask)localObject1).ePf = paramj.ivj.hZo;
        AppBrandMainProcessService.a((MainProcessTask)localObject1);
      }
      GMTrace.o(14425989840896L, 107482);
      return;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiRequestPayment", paramJSONObject.getMessage());
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(14425989840896L, 107482);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */