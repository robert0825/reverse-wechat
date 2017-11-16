package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q
  extends a
{
  public static final int CTRL_BYTE = 25;
  public static final String NAME = "getInstallState";
  
  public q()
  {
    GMTrace.i(17045785673728L, 127001);
    GMTrace.o(17045785673728L, 127001);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17045919891456L, 127002);
    w.i("MicroMsg.GameJsApiGetNetworkType", "invoke");
    Object localObject1 = paramd.getContext();
    if (localObject1 == null)
    {
      w.i("MicroMsg.GameJsApiGetNetworkType", "context is null");
      GMTrace.o(17045919891456L, 127002);
      return;
    }
    if (paramJSONObject == null)
    {
      w.i("MicroMsg.GameJsApiGetNetworkType", "data is null");
      paramd.v(paramInt, a.d("get_install_state:no_null_data", null));
      GMTrace.o(17045919891456L, 127002);
      return;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("packageName");
    Object localObject2;
    JSONObject localJSONObject;
    int m;
    int i;
    int j;
    int k;
    if (localJSONArray != null)
    {
      localObject2 = new JSONObject();
      localJSONObject = new JSONObject();
      m = 0;
      i = 0;
      j = i;
      k = i;
    }
    for (;;)
    {
      try
      {
        if (m >= localJSONArray.length()) {
          continue;
        }
        j = i;
        String str = localJSONArray.optString(m);
        j = i;
        paramJSONObject = p.getPackageInfo((Context)localObject1, str);
        if (paramJSONObject == null)
        {
          n = 0;
          break label584;
          j = i;
          w.i("MicroMsg.GameJsApiGetNetworkType", "getInstallState, packageName = " + str + ", version = " + n + ", versionName = " + paramJSONObject);
          k = i;
          if (i == 0)
          {
            k = i;
            if (n > 0) {
              k = 1;
            }
          }
          j = k;
          ((JSONObject)localObject2).put(str, n);
          j = k;
          localJSONObject.put(str, paramJSONObject);
          m += 1;
          i = k;
          break;
        }
        j = i;
        int n = paramJSONObject.versionCode;
      }
      catch (Exception paramJSONObject)
      {
        k = j;
        paramJSONObject = new HashMap();
        paramJSONObject.put("result", ((JSONObject)localObject2).toString());
        paramJSONObject.put("versionName", localJSONObject.toString());
        if (k == 0) {
          continue;
        }
        paramd.v(paramInt, d("get_install_state:yes", paramJSONObject));
        GMTrace.o(17045919891456L, 127002);
        return;
        paramd.v(paramInt, a.d("get_install_state:no", null));
        GMTrace.o(17045919891456L, 127002);
        return;
      }
      j = i;
      paramJSONObject = paramJSONObject.versionName;
      continue;
      localObject2 = paramJSONObject.optString("packageName");
      if (bg.nm((String)localObject2))
      {
        w.i("MicroMsg.GameJsApiGetNetworkType", "packageName is null or nil");
        paramd.v(paramInt, a.d("get_install_state:no_null_packageName", null));
        GMTrace.o(17045919891456L, 127002);
        return;
      }
      localObject1 = p.getPackageInfo((Context)localObject1, (String)localObject2);
      if (localObject1 == null)
      {
        i = 0;
        if (localObject1 != null) {
          break label520;
        }
      }
      label520:
      for (paramJSONObject = "null";; paramJSONObject = ((PackageInfo)localObject1).versionName)
      {
        w.i("MicroMsg.GameJsApiGetNetworkType", "doGetInstallState, packageName = " + (String)localObject2 + ", version = " + i + ", versionName = " + paramJSONObject);
        if (localObject1 != null) {
          break label529;
        }
        paramd.v(paramInt, a.d("get_install_state:no", null));
        GMTrace.o(17045919891456L, 127002);
        return;
        i = ((PackageInfo)localObject1).versionCode;
        break;
      }
      label529:
      localObject1 = new HashMap();
      ((Map)localObject1).put("versionName", paramJSONObject);
      paramd.v(paramInt, d("get_install_state:yes_" + paramJSONObject, (Map)localObject1));
      GMTrace.o(17045919891456L, 127002);
      return;
      label584:
      if (paramJSONObject == null) {
        paramJSONObject = "null";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */