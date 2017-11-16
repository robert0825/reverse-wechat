package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 251;
  public static final String NAME = "navigateToMiniProgram";
  
  public c()
  {
    GMTrace.i(19829058699264L, 147738);
    GMTrace.o(19829058699264L, 147738);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    int j = 0;
    GMTrace.i(19829192916992L, 147739);
    String str1 = paramJSONObject.optString("appId", null);
    if (bg.nm(str1))
    {
      paramj.v(paramInt, d("fail:invalid data", null));
      GMTrace.o(19829192916992L, 147739);
      return;
    }
    if (str1.equals(paramj.hyD))
    {
      paramj.v(paramInt, d("fail:target appId is the same as the caller appId", null));
      GMTrace.o(19829192916992L, 147739);
      return;
    }
    String str2 = paramJSONObject.optString("path", null);
    Object localObject2 = paramJSONObject.optJSONObject("extraData");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new JSONObject();
    }
    localObject2 = paramJSONObject.optString("envVersion");
    int k = paramj.hzM.hyG.hRg.hKB;
    paramJSONObject = (JSONObject)localObject2;
    if (localObject2 == null) {
      paramJSONObject = "";
    }
    int i;
    switch (paramJSONObject.hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label191:
        i = 0;
        label219:
        if ((k != 1) && (k != 2)) {
          i = j;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      d.a(paramj, str1, i, str2, (JSONObject)localObject1, new d.a()
      {
        public final void ch(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19831474618368L, 147756);
          j localj = paramj;
          int i = paramInt;
          c localc = c.this;
          if (paramAnonymousBoolean) {}
          for (String str = "ok";; str = "fail")
          {
            localj.v(i, localc.d(str, null));
            GMTrace.o(19831474618368L, 147756);
            return;
          }
        }
      });
      GMTrace.o(19829192916992L, 147739);
      return;
      if (!paramJSONObject.equals("develop")) {
        break;
      }
      i = 0;
      break label191;
      if (!paramJSONObject.equals("trial")) {
        break;
      }
      i = 1;
      break label191;
      if (!paramJSONObject.equals("release")) {
        break;
      }
      i = 2;
      break label191;
      i = 1;
      break label219;
      i = 2;
      break label219;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\miniprogram_navigator\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */