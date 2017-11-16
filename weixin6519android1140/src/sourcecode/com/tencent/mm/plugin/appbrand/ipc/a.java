package com.tencent.mm.plugin.appbrand.ipc;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final Map<String, Class<? extends AppBrandTaskProxyUI>> hWw;
  
  static
  {
    GMTrace.i(10277185650688L, 76571);
    HashMap localHashMap = new HashMap();
    localHashMap.put(":appbrand0", AppBrandTaskProxyUI.class);
    localHashMap.put(":appbrand1", AppBrandTaskProxyUI1.class);
    localHashMap.put(":appbrand2", AppBrandTaskProxyUI2.class);
    localHashMap.put(":appbrand3", AppBrandTaskProxyUI3.class);
    localHashMap.put(":appbrand4", AppBrandTaskProxyUI4.class);
    localHashMap.put(":tools", AppBrandTaskInToolsProxyUI.class);
    hWw = Collections.unmodifiableMap(localHashMap);
    GMTrace.o(10277185650688L, 76571);
  }
  
  public static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void a(Context paramContext, _Req param_Req, AppBrandProxyUIProcessTask.b<_Result> paramb)
  {
    GMTrace.i(10276782997504L, 76568);
    AppBrandProcessProxyUI.a(paramContext, AppBrandProcessProxyUI.class, param_Req, paramb);
    GMTrace.o(10276782997504L, 76568);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(10276514562048L, 76566);
    AppBrandProcessProxyUI.a(paramContext, AppBrandProcessProxyUI.class, paramString1, paramString2, paramString3, paramString4, null, null, null);
    GMTrace.o(10276514562048L, 76566);
  }
  
  public static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void b(Context paramContext, _Req param_Req, AppBrandProxyUIProcessTask.b<_Result> paramb)
  {
    GMTrace.i(10276917215232L, 76569);
    Object localObject1 = ab.vM();
    Object localObject2 = ab.getPackageName();
    localObject2 = (Class)hWw.get(((String)localObject1).replaceFirst((String)localObject2, ""));
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = AppBrandProcessProxyUI.class;
    }
    AppBrandProcessProxyUI.a(paramContext, (Class)localObject1, param_Req, paramb);
    GMTrace.o(10276917215232L, 76569);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */