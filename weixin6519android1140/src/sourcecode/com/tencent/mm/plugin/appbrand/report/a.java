package com.tencent.mm.plugin.appbrand.report;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c.f;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static Pattern iyh;
  
  static
  {
    GMTrace.i(10628299227136L, 79187);
    iyh = Pattern.compile(".*\"errMsg\":\"[^:]+:([^\"]+)\".*");
    GMTrace.o(10628299227136L, 79187);
  }
  
  public static void a(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    GMTrace.i(19891872595968L, 148206);
    w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, appid %s, appversion %d, appidlist %snearbyAppIdCount %s, nearbyAppIdList %s", new Object[] { Integer.valueOf(13533), Integer.valueOf(paramInt1), bg.nl(paramString1), Integer.valueOf(0), paramString2, Integer.valueOf(paramInt2), paramString3 });
    g.ork.i(13533, new Object[] { Integer.valueOf(paramInt1), bg.nl(paramString1), Integer.valueOf(0), paramString2, Integer.valueOf(paramInt2), paramString3, Integer.valueOf(0), paramString4 });
    GMTrace.o(19891872595968L, 148206);
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2)
  {
    GMTrace.i(10626151743488L, 79171);
    w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), appId %s, appVersion %s, appState : %d, eventId %d, scene %d, sceneId %s", new Object[] { Integer.valueOf(13801), paramString1, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2 });
    g.ork.i(13801, new Object[] { paramString1, Integer.valueOf(0), Integer.valueOf(paramInt1), Long.valueOf(bg.Pu()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString2 });
    GMTrace.o(10626151743488L, 79171);
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(19892006813696L, 148207);
    String str2 = bP(ab.getContext());
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = "unknown";
    }
    long l = bg.Pu();
    w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote %s, sessionId %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, networkType %s, eventId %d,eventRusult %d, eventPercent %d, installCostTime %s, eventTime %s", new Object[] { Integer.valueOf(13537), Integer.valueOf(1000), "", "", paramString, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", str1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Long.valueOf(paramLong), Long.valueOf(l) });
    g.ork.i(13537, new Object[] { Integer.valueOf(1000), "", "", paramString, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", str1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Long.valueOf(paramLong), Long.valueOf(l) });
    GMTrace.o(19892006813696L, 148207);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, int paramInt3, String paramString5, long paramLong, int paramInt4, int paramInt5)
  {
    GMTrace.i(18352663691264L, 136738);
    i = 3;
    if (bg.nm(paramString1))
    {
      GMTrace.o(18352663691264L, 136738);
      return;
    }
    String str2 = "";
    String str1 = str2;
    if (!bg.nm(paramString4))
    {
      str1 = str2;
      if (paramString4.contains(".html")) {
        str1 = paramString4.substring(0, paramString4.lastIndexOf(".html") + 5);
      }
    }
    paramString4 = "";
    try
    {
      str2 = p.encode(bg.nl(str1), "UTF-8");
      paramString4 = str2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        boolean bool;
        w.e("MicroMsg.AppBrandReporterManager", "encode page path error!");
        w.printErrStackTrace("MicroMsg.AppBrandReporterManager", localUnsupportedEncodingException, "", new Object[0]);
        continue;
        if (bool) {
          i = 2;
        } else {
          i = 3;
        }
      }
    }
    paramString3 = bg.nl(paramString3);
    paramString5 = bg.nl(paramString5);
    paramString2 = bg.nl(paramString2);
    if (paramInt1 > 0)
    {
      i = paramInt1 - 1;
      bool = e.Sj().ab(paramString1, i);
      if (e.Sk().aa(paramString1, i)) {
        i = 1;
      }
    }
    else
    {
      w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, action %d, actionNote %s,actionTime %s, actionResult %d, actionErrorcode %d", new Object[] { Integer.valueOf(13540), Integer.valueOf(paramInt2), paramString3, paramString2, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(i), str1, Integer.valueOf(paramInt3), paramString5, Long.valueOf(paramLong), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      g.ork.i(13540, new Object[] { Integer.valueOf(paramInt2), paramString3, paramString2, Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(i), paramString4, Integer.valueOf(paramInt3), paramString5, Long.valueOf(paramLong), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      GMTrace.o(18352663691264L, 136738);
      return;
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(10626554396672L, 79174);
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.nL(paramString1);
    if (localAppBrandStatObject == null)
    {
      w.e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
      GMTrace.o(10626554396672L, 79174);
      return;
    }
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (!bg.nm(paramString2))
    {
      localObject1 = localObject2;
      if (paramString2.contains(".html")) {
        localObject1 = paramString2.substring(0, paramString2.lastIndexOf(".html") + 5);
      }
    }
    paramString2 = "";
    try
    {
      localObject2 = p.encode(bg.nl((String)localObject1), "UTF-8");
      paramString2 = (String)localObject2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        int k;
        String str2;
        w.e("MicroMsg.AppBrandReporterManager", "encode page path error!");
        w.printErrStackTrace("MicroMsg.AppBrandReporterManager", localUnsupportedEncodingException, "", new Object[0]);
        continue;
        int i = localUnsupportedEncodingException.hRg.hKC;
        continue;
        int j = localUnsupportedEncodingException.hRg.hKB + 1;
      }
    }
    localObject2 = com.tencent.mm.plugin.appbrand.a.nK(paramString1);
    if (localObject2 == null)
    {
      i = 0;
      if (localObject2 != null) {
        break label485;
      }
      j = 0;
      paramString3 = bg.nl(paramString3);
      localObject2 = bg.nl(localAppBrandStatObject.eAv);
      str1 = bg.nl(h.nZ(paramString1).hzG);
      if (localAppBrandStatObject.scene == 0) {
        localAppBrandStatObject.scene = 1000;
      }
      k = localAppBrandStatObject.eVi;
      str2 = localAppBrandStatObject.eVj;
      w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %d, sceneNote : %s, sessionId : %s, appid : %s, appversion : %d, appState : %d, usedState : %d, pagePath : %s, action : %d, actionNote : %s,actionTime : %s, actionResult : %d, actionErrorcode : %d, preScene : %d, preSceneNote : %s", new Object[] { Integer.valueOf(13539), Integer.valueOf(localAppBrandStatObject.scene), localObject2, str1, paramString1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localAppBrandStatObject.iym), localObject1, Integer.valueOf(paramInt1), paramString3, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(k), str2 });
      g.ork.i(13539, new Object[] { Integer.valueOf(localAppBrandStatObject.scene), localObject2, str1, paramString1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localAppBrandStatObject.iym), paramString2, Integer.valueOf(paramInt1), paramString3, Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(k), str2 });
      GMTrace.o(10626554396672L, 79174);
    }
  }
  
  public static void a(String paramString1, final String paramString2, final String paramString3, final String paramString4, final int paramInt, final long paramLong, String paramString5)
  {
    GMTrace.i(17302409969664L, 128913);
    com.tencent.mm.bv.a.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10624809566208L, 79161);
        a.b(this.eud, paramString2, paramString3, paramString4, paramInt, paramLong, this.iyk);
        GMTrace.o(10624809566208L, 79161);
      }
    });
    GMTrace.o(17302409969664L, 128913);
  }
  
  public static void aaa()
  {
    GMTrace.i(10627628138496L, 79182);
    int i = bg.bRc();
    w.i("MicroMsg.AppBrandReporterManager", "report now process mem : %d", new Object[] { Integer.valueOf(bg.bRc()) });
    if (i <= 90) {
      i = 2;
    }
    for (;;)
    {
      g.ork.a(386L, 1L, 1L, false);
      g.ork.a(386L, i, 1L, false);
      GMTrace.o(10627628138496L, 79182);
      return;
      if (i <= 130) {
        i = 3;
      } else if (i <= 170) {
        i = 4;
      } else if (i <= 210) {
        i = 5;
      } else {
        i = 6;
      }
    }
  }
  
  public static void aq(String paramString, int paramInt)
  {
    GMTrace.i(10627225485312L, 79179);
    x(paramString, paramInt, 0);
    GMTrace.o(10627225485312L, 79179);
  }
  
  public static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(17659429126144L, 131573);
    g.ork.i(14369, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2 + 1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(1) });
    GMTrace.o(17659429126144L, 131573);
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, long paramLong, String paramString5)
  {
    GMTrace.i(17302544187392L, 128914);
    if (bg.nm(paramString1))
    {
      GMTrace.o(17302544187392L, 128914);
      return;
    }
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.nL(paramString1);
    if (localAppBrandStatObject == null)
    {
      w.e("MicroMsg.AppBrandReporterManager", "statObject is Null!");
      GMTrace.o(17302544187392L, 128914);
      return;
    }
    int i = 0;
    while (i < 9)
    {
      if (paramString3.equals(new String[] { "updateMap", "addMapMarkers", "addMapLines", "addMapCircles", "addMapControls", "moveToMapLocation", "getMapCenterLocation", "drawCanvas", "updateCanvas" }[i]))
      {
        GMTrace.o(17302544187392L, 128914);
        return;
      }
      i += 1;
    }
    String str1 = "";
    Object localObject1 = str1;
    Object localObject2;
    if (!bg.nm(paramString4))
    {
      localObject1 = str1;
      if (!bg.nm(paramString3)) {
        localObject2 = str1;
      }
    }
    String str2;
    AppBrandSysConfig localAppBrandSysConfig;
    for (;;)
    {
      try
      {
        paramString4 = new JSONObject(paramString4);
        localObject2 = str1;
        if (!paramString4.has("url")) {
          continue;
        }
        localObject2 = str1;
        if (!paramString3.equals("openLink"))
        {
          localObject2 = str1;
          if (!paramString3.equals("redirectTo"))
          {
            localObject2 = str1;
            if (!paramString3.equals("navigateTo"))
            {
              localObject2 = str1;
              if (!paramString3.equals("request"))
              {
                localObject2 = str1;
                if (!paramString3.equals("connectSocket"))
                {
                  localObject2 = str1;
                  if (!paramString3.equals("uploadFile"))
                  {
                    localObject2 = str1;
                    if (!paramString3.equals("downloadFile")) {
                      continue;
                    }
                  }
                }
              }
            }
          }
        }
        localObject2 = str1;
        localObject1 = paramString4.optString("url");
      }
      catch (JSONException paramString4)
      {
        w.e("MicroMsg.AppBrandReporterManager", "get keyParam error!");
        w.printErrStackTrace("MicroMsg.AppBrandReporterManager", paramString4, "", new Object[0]);
        localObject1 = localObject2;
        continue;
        localObject2 = str1;
        if (!paramString3.equals("requestPayment")) {
          continue;
        }
        localObject2 = str1;
        localObject1 = paramString4.optString("package");
        continue;
        localObject2 = str1;
        if (!paramString3.equals("reportSubmitForm")) {
          continue;
        }
        localObject2 = str1;
        localObject1 = i.od(paramString1).hzI;
        continue;
        localObject2 = str1;
        if (!paramString3.equals("makePhoneCall")) {
          continue;
        }
        localObject2 = str1;
        localObject1 = paramString4.optString("phoneNumber");
        continue;
        localObject2 = str1;
        if (!paramString3.equals("chooseVideo")) {
          continue;
        }
        localObject2 = str1;
        localObject1 = paramString4.optString("maxDuration");
        continue;
        localObject1 = str1;
        localObject2 = str1;
        if (!paramString3.equals("updateHTMLWebView")) {
          continue;
        }
        localObject2 = str1;
        localObject1 = paramString4.optString("src");
        localObject2 = localObject1;
        try
        {
          paramString4 = p.encode(paramString4.optString("src"), "UTF-8");
          localObject1 = paramString4;
        }
        catch (Exception paramString4)
        {
          localObject2 = localObject1;
          w.e("MicroMsg.AppBrandReporterManager", paramString4.toString());
        }
        continue;
      }
      localObject2 = "";
      paramString4 = (String)localObject2;
      if (!bg.nm(paramString2))
      {
        paramString4 = (String)localObject2;
        if (paramString2.contains(".html")) {
          paramString4 = paramString2.substring(0, paramString2.lastIndexOf(".html") + 5);
        }
      }
      paramString2 = "";
      try
      {
        localObject2 = p.encode(bg.nl(paramString4), "UTF-8");
        paramString2 = (String)localObject2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        w.e("MicroMsg.AppBrandReporterManager", "encode page path error!");
        w.printErrStackTrace("MicroMsg.AppBrandReporterManager", localUnsupportedEncodingException1, "", new Object[0]);
        continue;
      }
      localObject2 = "";
      try
      {
        str1 = p.encode(bg.nl((String)localObject1), "UTF-8");
        localObject2 = str1;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        boolean bool;
        w.e("MicroMsg.AppBrandReporterManager", "encode keyParam path error!");
        w.printErrStackTrace("MicroMsg.AppBrandReporterManager", localUnsupportedEncodingException2, "", new Object[0]);
        continue;
        paramString3 = "";
        continue;
        i = 1;
        continue;
      }
      str1 = bg.nl(paramString3);
      if (bg.nm(paramString5)) {
        break label992;
      }
      paramString3 = iyh.matcher(paramString5);
      if (!paramString3.matches()) {
        break label992;
      }
      paramString3 = bg.nl(paramString3.group(1));
      if ((bg.nm(paramString3)) || (paramString3.startsWith("ok")) || (!paramString3.startsWith("fail"))) {
        break label998;
      }
      i = 2;
      paramString5 = bg.nl(localAppBrandStatObject.eAv);
      str2 = bP(ab.getContext());
      if (localAppBrandStatObject.scene == 0) {
        localAppBrandStatObject.scene = 1000;
      }
      localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramString1);
      if (localAppBrandSysConfig != null) {
        break label1004;
      }
      GMTrace.o(17302544187392L, 128914);
      return;
      localObject2 = str1;
      bool = paramString3.equals("authorize");
      if (bool)
      {
        localObject2 = str1;
        try
        {
          paramString4 = new JSONArray(paramString4.optString("scope"));
          localObject2 = str1;
          localObject1 = new LinkedList();
          i = 0;
          localObject2 = str1;
          if (i < paramString4.length())
          {
            localObject2 = str1;
            ((LinkedList)localObject1).add(paramString4.optString(i));
            i += 1;
            continue;
          }
          localObject2 = str1;
        }
        catch (Exception paramString4)
        {
          localObject2 = str1;
          w.e("MicroMsg.AppBrandReporterManager", "Exception %s", new Object[] { paramString4.getMessage() });
          GMTrace.o(17302544187392L, 128914);
          return;
        }
        localObject1 = ((LinkedList)localObject1).toString();
      }
      else
      {
        localObject2 = str1;
        bool = paramString3.equals("shareAppMessage");
        if (!bool) {
          continue;
        }
        localObject2 = str1;
        try
        {
          localObject1 = p.encode(bg.nl(paramString4.toString()), "UTF-8");
        }
        catch (UnsupportedEncodingException paramString4)
        {
          localObject2 = str1;
          w.printErrStackTrace("MicroMsg.AppBrandReporterManager", paramString4, "", new Object[0]);
          localObject1 = str1;
        }
      }
    }
    label992:
    label998:
    label1004:
    int j;
    if (localAppBrandSysConfig == null)
    {
      j = 0;
      if (localAppBrandSysConfig != null) {
        break label1337;
      }
    }
    label1337:
    for (int k = 0;; k = localAppBrandSysConfig.hRg.hKB + 1)
    {
      w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %s, sceneNote %s, appId %s, appVersion %d, appState %d, pagePath %s, networkType %s, functionName %s, keyParam %s, result %d, permissionValue %d, errorCode %d, costTime %s, errCode %d, errMsg %s, usedState %d", new Object[] { Integer.valueOf(13542), Integer.valueOf(localAppBrandStatObject.scene), paramString5, paramString1, Integer.valueOf(j), Integer.valueOf(k), paramString4, str2, localUnsupportedEncodingException2, localObject1, Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(0), Long.valueOf(paramLong), Integer.valueOf(0), paramString3, Integer.valueOf(localAppBrandStatObject.iym) });
      g.ork.i(13542, new Object[] { Integer.valueOf(localAppBrandStatObject.scene), paramString5, paramString1, Integer.valueOf(j), Integer.valueOf(k), paramString2, str2, localUnsupportedEncodingException2, localUnsupportedEncodingException1, Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(0), Long.valueOf(paramLong), Integer.valueOf(0), paramString3, Integer.valueOf(localAppBrandStatObject.iym), Integer.valueOf(localAppBrandStatObject.eVi), localAppBrandStatObject.eVj });
      GMTrace.o(17302544187392L, 128914);
      return;
      j = localAppBrandSysConfig.hRg.hKC;
      break;
    }
  }
  
  public static String bP(Context paramContext)
  {
    GMTrace.i(10625883308032L, 79169);
    if (am.isConnected(paramContext)) {
      if (am.isWifi(paramContext)) {
        paramContext = "wifi";
      }
    }
    for (;;)
    {
      w.i("MicroMsg.AppBrandReporterManager", "get networkType %s", new Object[] { paramContext });
      GMTrace.o(10625883308032L, 79169);
      return paramContext;
      if (am.is4G(paramContext))
      {
        paramContext = "4g";
      }
      else if (am.is3G(paramContext))
      {
        paramContext = "3g";
      }
      else if (am.is2G(paramContext))
      {
        paramContext = "2g";
      }
      else
      {
        paramContext = "unknown";
        continue;
        paramContext = "offline";
      }
    }
  }
  
  public static void c(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(10627493920768L, 79181);
    int i;
    if (paramLong <= 2000L) {
      if (paramBoolean)
      {
        i = 8;
        g.ork.a(367L, i, 1L, false);
        if (!paramBoolean) {
          break label204;
        }
        g.ork.a(367L, 7L, 1L, false);
      }
    }
    for (;;)
    {
      w.v("MicroMsg.AppBrandReporterManager", "startApp cost %s msec(hasDownload : %b).", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(paramBoolean) });
      GMTrace.o(10627493920768L, 79181);
      return;
      i = 1;
      break;
      if (paramLong <= 3000L)
      {
        if (paramBoolean)
        {
          i = 9;
          break;
        }
        i = 2;
        break;
      }
      if (paramLong <= 4000L)
      {
        if (paramBoolean)
        {
          i = 10;
          break;
        }
        i = 3;
        break;
      }
      if (paramLong <= 5000L)
      {
        if (paramBoolean)
        {
          i = 11;
          break;
        }
        i = 4;
        break;
      }
      if (paramLong <= 6000L)
      {
        if (paramBoolean)
        {
          i = 12;
          break;
        }
        i = 5;
        break;
      }
      if (paramBoolean)
      {
        i = 13;
        break;
      }
      i = 6;
      break;
      label204:
      g.ork.a(367L, 0L, 1L, false);
    }
  }
  
  public static void cu(boolean paramBoolean)
  {
    GMTrace.i(10628165009408L, 79186);
    g localg = g.ork;
    if (paramBoolean) {}
    for (int i = 2;; i = 3)
    {
      localg.a(482, 482, 1, i, 1, 1, false);
      GMTrace.o(10628165009408L, 79186);
      return;
    }
  }
  
  public static void x(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(18352797908992L, 136739);
    if ("@LibraryAppId".equals(paramString))
    {
      GMTrace.o(18352797908992L, 136739);
      return;
    }
    int j = 1000;
    Object localObject1 = "";
    int i1 = 0;
    int i2 = 0;
    int m = 0;
    int i = 0;
    Object localObject2 = localObject1;
    int n = j;
    int k;
    if (!bg.nm(paramString))
    {
      localObject2 = com.tencent.mm.plugin.appbrand.a.nL(paramString);
      if (localObject2 != null)
      {
        if (((AppBrandStatObject)localObject2).scene == 0)
        {
          i = 1000;
          localObject1 = bg.nl(((AppBrandStatObject)localObject2).eAv);
          k = ((AppBrandStatObject)localObject2).iym;
          j = i;
          i = k;
        }
      }
      else
      {
        AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(paramString);
        k = i2;
        if (localAppBrandSysConfig != null)
        {
          k = i2;
          if (localAppBrandSysConfig.hRg != null) {
            k = localAppBrandSysConfig.hRg.hKC;
          }
        }
        m = i;
        localObject2 = localObject1;
        n = j;
        i1 = k;
        if (paramInt2 != 0) {
          break label404;
        }
        m = i;
        localObject2 = localObject1;
        n = j;
        i1 = k;
        if (localAppBrandSysConfig == null) {
          break label404;
        }
        m = i;
        localObject2 = localObject1;
        n = j;
        i1 = k;
        if (localAppBrandSysConfig.hRg == null) {
          break label404;
        }
        paramInt2 = localAppBrandSysConfig.hRg.hKB + 1;
        m = k;
        k = j;
        j = m;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.AppBrandReporterManager", "stev report(%s), scene : %s, sceneNote %s, appId %s, appVersion %s, appState %s, usedState %s, pagetype %s, targetAction %s", new Object[] { Integer.valueOf(13541), Integer.valueOf(k), localObject1, paramString, Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(3) });
      g.ork.i(13541, new Object[] { Integer.valueOf(k), localObject1, paramString, Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(3), "" });
      GMTrace.o(18352797908992L, 136739);
      return;
      i = ((AppBrandStatObject)localObject2).scene;
      break;
      label404:
      k = n;
      localObject1 = localObject2;
      j = i1;
      i = m;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */