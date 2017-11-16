package com.tencent.mm.plugin.appbrand.launching.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.dynamic.i.a.e;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.b;
import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

abstract class a
{
  a()
  {
    GMTrace.i(17333548482560L, 129145);
    GMTrace.o(17333548482560L, 129145);
  }
  
  private static void a(String paramString, int paramInt, AppBrandStatObject paramAppBrandStatObject, Bundle paramBundle)
  {
    GMTrace.i(17333951135744L, 129148);
    paramAppBrandStatObject.scene = paramInt;
    paramAppBrandStatObject.eAv = p.encode(paramString);
    paramAppBrandStatObject.eVi = b.e(paramInt, paramBundle);
    paramAppBrandStatObject.eVj = b.f(paramInt, paramBundle);
    if ((paramInt != 1037) && (paramInt != 1018))
    {
      paramAppBrandStatObject.eVh = paramInt;
      GMTrace.o(17333951135744L, 129148);
      return;
    }
    paramAppBrandStatObject.eVh = 0;
    GMTrace.o(17333951135744L, 129148);
  }
  
  final int a(Context paramContext, String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(17668958584832L, 131644);
    w.i("MicroMsg.AppBrand.AbsLinkOpener", "handle url = %s", new Object[] { paramString });
    Uri localUri = null;
    if (bg.nm(paramString))
    {
      paramInt = a.iqM;
      paramContext = localUri;
    }
    for (;;)
    {
      a(paramContext, paramInt);
      GMTrace.o(17668958584832L, 131644);
      return paramInt;
      localUri = Uri.parse(paramString);
      if (bg.getInt(localUri.getQueryParameter("debug"), 0) > 0) {
        i = 1;
      }
      Object localObject1;
      for (;;)
      {
        if (i != 0)
        {
          i = bg.getInt(localUri.getQueryParameter("ret"), 0);
          if (i == 1)
          {
            paramInt = a.iqN;
            paramContext = localUri;
            break;
            i = 0;
            continue;
          }
          if (i == 2)
          {
            paramInt = a.iqO;
            paramContext = localUri;
            break;
          }
          localObject1 = localUri.getQueryParameter("appid");
          str1 = localUri.getQueryParameter("username");
          str2 = bg.nl(localUri.getQueryParameter("path"));
          Object localObject2 = localUri.getQueryParameter("codeurl");
          String str3 = localUri.getQueryParameter("md5");
          String str4 = localUri.getQueryParameter("pageurl");
          String str5 = localUri.getQueryParameter("pagemd5");
          long l = bg.getLong(localUri.getQueryParameter("test_lifespan"), 7200L);
          if ((bg.nm((String)localObject1)) || (bg.nm(str1)) || (bg.nm((String)localObject2)))
          {
            w.i("MicroMsg.AppBrand.AbsLinkOpener", "appId = %s, username = %s, codeURL = %s, invalid, return", new Object[] { localObject1, str1, localObject2 });
            paramInt = a.iqM;
            paramContext = localUri;
            break;
          }
          boolean bool = com.tencent.mm.plugin.appbrand.app.e.Sl().a((String)localObject1, 1, (String)localObject2, str3, 0L, bg.Pu() + l);
          if ((!bg.nm(str4)) && (!bg.nm(str5)))
          {
            com.tencent.mm.plugin.appbrand.app.e.Sl().a((String)localObject1, 10000, str4, str5, 0L, bg.Pu() + l);
            i = com.tencent.mm.plugin.appbrand.dynamic.j.a.bp(0, 1);
            if (i == 10000)
            {
              localObject2 = new Bundle();
              ((Bundle)localObject2).putString("appId", (String)localObject1);
              ((Bundle)localObject2).putInt("debugType", i);
              com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", (Parcelable)localObject2, a.e.class, null);
            }
          }
          if (bool) {
            d.as((String)localObject1, 1);
          }
          localObject1 = new AppBrandStatObject();
          a(paramString, paramInt, (AppBrandStatObject)localObject1, paramBundle);
          AppBrandLaunchProxyUI.a(paramContext, str1, str2, 1, -1, (AppBrandStatObject)localObject1, null);
          paramInt = a.iqL;
          paramContext = localUri;
          break;
        }
      }
      String str1 = localUri.getQueryParameter("username");
      String str2 = bg.nl(localUri.getQueryParameter("path"));
      int i = bg.getInt(localUri.getQueryParameter("version"), 0);
      int j = bg.getInt(localUri.getQueryParameter("type"), 0);
      if (bg.nm(str1))
      {
        w.i("MicroMsg.AppBrand.AbsLinkOpener", "username = %s, invalid, return", new Object[] { str1 });
        paramInt = a.iqM;
        paramContext = localUri;
      }
      else
      {
        localObject1 = new AppBrandStatObject();
        a(paramString, paramInt, (AppBrandStatObject)localObject1, paramBundle);
        AppBrandLaunchProxyUI.a(paramContext, str1, str2, j, i, (AppBrandStatObject)localObject1, null);
        paramInt = a.iqL;
        paramContext = localUri;
      }
    }
  }
  
  abstract void a(Uri paramUri, int paramInt);
  
  static enum a
  {
    static
    {
      GMTrace.i(17333414264832L, 129144);
      iqL = 1;
      iqM = 2;
      iqN = 3;
      iqO = 4;
      iqP = new int[] { iqL, iqM, iqN, iqO };
      GMTrace.o(17333414264832L, 129144);
    }
    
    public static int[] Yx()
    {
      GMTrace.i(17333280047104L, 129143);
      int[] arrayOfInt = (int[])iqP.clone();
      GMTrace.o(17333280047104L, 129143);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */