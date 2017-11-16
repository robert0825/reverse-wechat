package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
  extends a
{
  private static final int CTRL_INDEX = 115;
  private static final String NAME = "getSavedFileList";
  
  public c()
  {
    GMTrace.i(10389257453568L, 77406);
    GMTrace.o(10389257453568L, 77406);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10389391671296L, 77407);
    Object localObject = com.tencent.mm.plugin.appbrand.appstorage.c.oy(paramj.hyD);
    paramJSONObject = new JSONArray();
    if (!bg.cc((List)localObject))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        AppBrandLocalMediaObject localAppBrandLocalMediaObject = (AppBrandLocalMediaObject)((Iterator)localObject).next();
        try
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("filePath", localAppBrandLocalMediaObject.eHy);
          localJSONObject.put("size", localAppBrandLocalMediaObject.hmS);
          localJSONObject.put("createTime", TimeUnit.MILLISECONDS.toSeconds(localAppBrandLocalMediaObject.hLA));
          paramJSONObject.put(localJSONObject);
        }
        catch (Exception localException) {}
      }
    }
    localObject = new HashMap(1);
    ((Map)localObject).put("fileList", paramJSONObject);
    paramj.v(paramInt, d("ok", (Map)localObject));
    GMTrace.o(10389391671296L, 77407);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\file\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */