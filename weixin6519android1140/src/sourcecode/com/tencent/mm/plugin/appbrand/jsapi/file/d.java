package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 117;
  private static final String NAME = "removeSavedFile";
  
  public d()
  {
    GMTrace.i(10388317929472L, 77399);
    GMTrace.o(10388317929472L, 77399);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10388452147200L, 77400);
    String str = paramj.hyD;
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bg.nm(paramJSONObject)) {
      paramJSONObject = "fail:invalid data";
    }
    for (;;)
    {
      paramj.v(paramInt, d(paramJSONObject, null));
      GMTrace.o(10388452147200L, 77400);
      return;
      paramJSONObject = c.aJ(str, paramJSONObject);
      if ((paramJSONObject != null) && (!bg.nm(paramJSONObject.gpy)))
      {
        b.deleteFile(paramJSONObject.gpy);
        paramJSONObject = "ok";
      }
      else
      {
        paramJSONObject = "fail:file doesn't exist";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\file\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */