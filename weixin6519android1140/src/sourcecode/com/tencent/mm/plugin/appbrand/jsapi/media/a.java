package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

abstract class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  a()
  {
    GMTrace.i(15475572473856L, 115302);
    GMTrace.o(15475572473856L, 115302);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(15475706691584L, 115303);
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bg.nm(paramJSONObject))
    {
      paramj.v(paramInt, d("fail filePath invalid", null));
      GMTrace.o(15475706691584L, 115303);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15475438256128L, 115301);
        Object localObject1 = c.aJ(paramj.hyD, paramJSONObject);
        j localj;
        int i;
        Object localObject2;
        if ((localObject1 == null) || (bg.nm(((AppBrandLocalMediaObject)localObject1).gpy)))
        {
          localj = paramj;
          i = paramInt;
          localObject2 = a.this;
          localObject1 = "fail file not exists";
        }
        for (;;)
        {
          localj.v(i, ((com.tencent.mm.plugin.appbrand.jsapi.d)localObject2).d((String)localObject1, null));
          GMTrace.o(15475438256128L, 115301);
          return;
          if (!a.this.qx(((AppBrandLocalMediaObject)localObject1).mimeType))
          {
            paramj.v(paramInt, a.this.d("fail invalid file type", null));
            GMTrace.o(15475438256128L, 115301);
            return;
          }
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (paramj.mRunning)
          {
            localObject2 = a.this.a(paramj);
            bool1 = bool2;
            if (localObject2 != null) {
              bool1 = a.this.l((Context)localObject2, ((AppBrandLocalMediaObject)localObject1).gpy, ((AppBrandLocalMediaObject)localObject1).mimeType);
            }
          }
          localj = paramj;
          i = paramInt;
          localObject2 = a.this;
          if (bool1) {
            localObject1 = "ok";
          } else {
            localObject1 = "fail";
          }
        }
      }
    });
    GMTrace.o(15475706691584L, 115303);
  }
  
  abstract boolean l(Context paramContext, String paramString1, String paramString2);
  
  abstract boolean qx(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */