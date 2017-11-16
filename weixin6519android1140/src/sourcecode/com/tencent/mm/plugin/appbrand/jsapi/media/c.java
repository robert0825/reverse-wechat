package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 30;
  public static final String NAME = "previewImage";
  
  public c()
  {
    GMTrace.i(19799128145920L, 147515);
    GMTrace.o(19799128145920L, 147515);
  }
  
  private String a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19799530799104L, 147518);
    Object localObject1 = paramJSONObject.optString("current");
    ArrayList localArrayList = new ArrayList();
    paramJSONObject = paramJSONObject.optJSONArray("urls");
    if (paramJSONObject != null)
    {
      i = 0;
      while (i < paramJSONObject.length())
      {
        localObject2 = paramJSONObject.optString(i);
        if (!bg.nm((String)localObject2)) {
          localArrayList.add(localObject2);
        }
        i += 1;
      }
    }
    if (localArrayList.isEmpty())
    {
      paramContext = d("fail", null);
      GMTrace.o(19799530799104L, 147518);
      return paramContext;
    }
    Object localObject2 = new String[localArrayList.size()];
    localArrayList.toArray((Object[])localObject2);
    paramJSONObject = (JSONObject)localObject1;
    int i = 0;
    if (i < localObject2.length)
    {
      localObject1 = paramJSONObject;
      boolean bool;
      if (bg.nl(localObject2[i]).startsWith("wxfile://"))
      {
        localObject1 = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(paramString, localObject2[i]);
        bool = bg.nl(paramJSONObject).equals(localObject2[i]);
        if (localObject1 == null) {
          break label244;
        }
        localObject2[i] = ((AppBrandLocalMediaObject)localObject1).gpy;
      }
      for (;;)
      {
        localObject1 = paramJSONObject;
        if (bool) {
          localObject1 = localObject2[i];
        }
        i += 1;
        paramJSONObject = (JSONObject)localObject1;
        break;
        label244:
        localObject2[i] = "";
      }
    }
    localObject1 = paramJSONObject;
    if (bg.nm(paramJSONObject)) {
      localObject1 = localObject2[0];
    }
    if ((paramContext == null) || (!(paramContext instanceof Activity)))
    {
      paramContext = d("fail", null);
      GMTrace.o(19799530799104L, 147518);
      return paramContext;
    }
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("nowUrl", (String)localObject1);
    paramJSONObject.putExtra("urlList", (String[])localObject2);
    paramJSONObject.putExtra("type", 65281);
    paramJSONObject.putExtra("isFromWebView", true);
    paramJSONObject.putExtra("shouldShowScanQrCodeMenu", true);
    paramJSONObject.putExtra("scanQrCodeGetA8KeyScene", 44);
    paramJSONObject.putExtra("scanCodeTypes", new int[] { 5 });
    paramJSONObject.putExtra("scanResultCodeTypes", new int[] { 22 });
    localObject1 = new Bundle();
    ((Bundle)localObject1).putInt("stat_scene", 6);
    ((Bundle)localObject1).putString("stat_app_id", paramString);
    ((Bundle)localObject1).putString("stat_url", paramAppBrandPageView.ivj.hZo);
    paramJSONObject.putExtra("_stat_obj", (Bundle)localObject1);
    paramJSONObject.setClassName(paramContext, paramContext.getPackageName() + ".plugin.subapp.ui.gallery.GestureGalleryUI");
    com.tencent.mm.bj.d.b(paramContext, "subapp", ".ui.gallery.GestureGalleryUI", paramJSONObject);
    paramContext = d("ok", null);
    GMTrace.o(19799530799104L, 147518);
    return paramContext;
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19799262363648L, 147516);
    paramj.v(paramInt, a(a(paramj), b(paramj), paramj.hyD, paramJSONObject));
    GMTrace.o(19799262363648L, 147516);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19799396581376L, 147517);
    paramAppBrandPageView.v(paramInt, a(paramAppBrandPageView.mContext, paramAppBrandPageView, paramAppBrandPageView.hyD, paramJSONObject));
    GMTrace.o(19799396581376L, 147517);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */