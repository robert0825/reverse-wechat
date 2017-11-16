package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class ai
{
  private static String lOv;
  private static String lOw;
  
  static
  {
    GMTrace.i(12605863231488L, 93921);
    lOv = null;
    lOw = "";
    GMTrace.o(12605863231488L, 93921);
  }
  
  public static String K(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12604789489664L, 93913);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString2, paramString3);
      paramString2 = localJSONObject;
    }
    catch (Exception paramString2)
    {
      for (;;)
      {
        w.e("MicroMsg.GameReportUtil", paramString2.getMessage());
        paramString2 = null;
      }
    }
    paramString3 = paramString1;
    if (paramString2 != null) {
      paramString3 = cu(paramString1, paramString2.toString());
    }
    GMTrace.o(12604789489664L, 93913);
    return paramString3;
  }
  
  public static void L(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12605192142848L, 93916);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.GameReportUtil", "null open or null username");
      GMTrace.o(12605192142848L, 93916);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(10738, new Object[] { paramString1, paramString2, paramString1, paramString3 });
    GMTrace.o(12605192142848L, 93916);
  }
  
  private static int Y(Context paramContext, String paramString)
  {
    GMTrace.i(12605326360576L, 93917);
    paramContext = com.tencent.mm.pluginsdk.model.app.p.getPackageInfo(paramContext, paramString);
    if (paramContext == null)
    {
      GMTrace.o(12605326360576L, 93917);
      return 0;
    }
    int i = paramContext.versionCode;
    GMTrace.o(12605326360576L, 93917);
    return i;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, long paramLong1, String paramString1, String paramString2, String paramString3, long paramLong2, long paramLong3, String paramString4)
  {
    GMTrace.i(19312588881920L, 143890);
    paramString1 = ah.a.h(14683, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong1), paramString1, null, paramString3, Long.valueOf(paramLong2), Long.valueOf(paramLong3), null });
    SubCoreGameCenter.aGh().a(paramString1);
    GMTrace.o(19312588881920L, 143890);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    GMTrace.i(12603715747840L, 93905);
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, null, paramInt5, 0, null, null, paramString);
    GMTrace.o(12603715747840L, 93905);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString1, int paramInt6, int paramInt7, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(15699581861888L, 116971);
    paramContext = ah.a.h(12909, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), paramString1, Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), paramString2, Integer.valueOf(bg.getInt(paramString3, 0)), Integer.valueOf(getNetworkType(paramContext)), paramString4 });
    SubCoreGameCenter.aGh().a(paramContext);
    GMTrace.o(15699581861888L, 116971);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2)
  {
    GMTrace.i(12603849965568L, 93906);
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramString1, paramInt5, 0, null, null, paramString2);
    GMTrace.o(12603849965568L, 93906);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int paramInt5, String paramString2, String paramString3)
  {
    GMTrace.i(12603984183296L, 93907);
    a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramString1, paramInt5, 0, null, paramString2, paramString3);
    GMTrace.o(12603984183296L, 93907);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2)
  {
    GMTrace.i(12602776223744L, 93898);
    w.i("MicroMsg.GameReportUtil", "reportExposureInfo : 10" + " , " + paramInt1 + " , " + paramInt2 + " , 1" + " , 0 , " + bg.nl(paramString1) + " , " + paramInt3 + " , 0 , " + bg.nl(null) + " , " + bg.nl(null) + " , " + bg.nl(paramString2));
    com.tencent.mm.plugin.report.service.g.ork.i(13384, new Object[] { Integer.valueOf(10), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(1), Integer.valueOf(0), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(0), null, Integer.valueOf(bg.getInt(null, 0)), Integer.valueOf(getNetworkType(paramContext)), paramString2 });
    GMTrace.o(12602776223744L, 93898);
  }
  
  public static void a(Context paramContext, String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(18028259442688L, 134321);
    com.tencent.mm.plugin.report.service.g.ork.i(14416, new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(getNetworkType(paramContext)), Integer.valueOf(paramInt) });
    GMTrace.o(18028259442688L, 134321);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, long paramLong, String paramString5)
  {
    GMTrace.i(12603178876928L, 93901);
    w.d("MicroMsg.GameReportUtil", "reportMsgClick 10531, appId = %s, pkgName = %s, msgSvrId:%d, snsOgjId:%s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong), paramString5 });
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.GameReportUtil", "reportMsgClick fail, appId is null");
      GMTrace.o(12603178876928L, 93901);
      return;
    }
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = com.tencent.mm.pluginsdk.model.app.g.aP(paramString1, false);
    if (paramContext == null)
    {
      w.e("MicroMsg.GameReportUtil", "reportMsgClick fail, appinfo is null");
      GMTrace.o(12603178876928L, 93901);
      return;
    }
    SubCoreGameCenter.aGh().a(ah.a.h(10531, new Object[] { paramString1, Integer.valueOf(Y(localContext, paramString2)), aFY(), paramString3, Integer.valueOf(paramInt1), paramString4, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(getNetworkType(localContext)), bg.nl(paramContext.field_packageName), bg.nl(paramContext.field_signature), Long.toString(paramLong), "", paramString5 }));
    GMTrace.o(12603178876928L, 93901);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    GMTrace.i(12603581530112L, 93904);
    w.d("MicroMsg.GameReportUtil", "reportMsgClick, appId = " + paramString1 + ", pkgName = " + paramString2);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.GameReportUtil", "reportDelGameMsg fail, appId is null");
      GMTrace.o(12603581530112L, 93904);
      return;
    }
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = ah.a.h(10583, new Object[] { paramString1, Integer.valueOf(Y(localContext, paramString2)), aFY(), paramString3, Integer.valueOf(paramInt1), paramString4, Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(getNetworkType(localContext)) });
    SubCoreGameCenter.aGh().a(paramContext);
    GMTrace.o(12603581530112L, 93904);
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString2, int paramInt3, int paramInt4, String paramString3, long paramLong3, int paramInt5)
  {
    GMTrace.i(18028527878144L, 134323);
    w.i("MicroMsg.GameReportUtil", "reportGameDownloadState, appId = %s, scene = %d, opId = %d, downloadedSize = %d, totalSize = %d, downloadUrl = %s, errCode = %d, downloaderType = %d, chanelId = %s, costTime = %d, startState = %d", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2), paramString2, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong3), Integer.valueOf(paramInt5) });
    paramString1 = ah.a.h(14567, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2), zJ(paramString2), Integer.valueOf(getNetworkType(ab.getContext())), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong3), Integer.valueOf(paramInt5) });
    SubCoreGameCenter.aGh().a(paramString1);
    GMTrace.o(18028527878144L, 134323);
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(18028393660416L, 134322);
    long l = System.currentTimeMillis();
    paramString1 = ah.a.h(10737, new Object[] { Long.valueOf(l), Long.valueOf(l), Integer.valueOf(1), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(0), paramString2, "", paramString3, Integer.valueOf(getNetworkType(ab.getContext())), Integer.valueOf(0), Integer.valueOf(1), paramString4, paramString5 });
    SubCoreGameCenter.aGh().a(paramString1);
    GMTrace.o(18028393660416L, 134322);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    GMTrace.i(12603447312384L, 93903);
    w.d("MicroMsg.GameReportUtil", "rejectGameMsg, fromUserName = " + paramString1 + ", appId = " + paramString2 + ", msgType = " + paramInt1 + ", scene = " + paramInt2 + ", actionName = " + paramString3);
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.GameReportUtil", "rejectGameMsg fail, appId is null");
      GMTrace.o(12603447312384L, 93903);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(10546, new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), aFY(), Integer.valueOf(paramInt2), paramString3, Integer.valueOf(paramInt3) });
    GMTrace.o(12603447312384L, 93903);
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, long paramLong)
  {
    GMTrace.i(12603044659200L, 93900);
    w.d("MicroMsg.GameReportUtil", "reportReadMsg, appId = " + paramString1);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.GameReportUtil", "reportReadMsg fail, appId is null");
      GMTrace.o(12603044659200L, 93900);
      return;
    }
    String str = new BigInteger("00FFFFFFFFFFFFFFFF", 16).and(BigInteger.valueOf(paramLong)).toString();
    w.d("MicroMsg.GameReportUtil", "reportReadMsg, unsignedlonglong = " + str);
    com.tencent.mm.plugin.report.service.g.ork.i(10532, new Object[] { paramString1, str, paramString2, Integer.valueOf(paramInt1), paramString3, Integer.valueOf(paramInt2) });
    GMTrace.o(12603044659200L, 93900);
  }
  
  private static String aFY()
  {
    GMTrace.i(12605460578304L, 93918);
    if (lOv == null)
    {
      str = com.tencent.mm.compatible.d.p.ta();
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < str.length() - 1)
      {
        localStringBuilder.append(Integer.toHexString(str.charAt(i)));
        i += 1;
      }
      localStringBuilder.append("00");
      lOv = localStringBuilder.toString();
    }
    String str = lOv;
    GMTrace.o(12605460578304L, 93918);
    return str;
  }
  
  public static void ab(int paramInt, String paramString)
  {
    GMTrace.i(19312723099648L, 143891);
    ah.a locala = new ah.a();
    locala.gXq = paramInt;
    locala.lOu = paramString;
    SubCoreGameCenter.aGh().a(locala);
    GMTrace.o(19312723099648L, 143891);
  }
  
  public static String ct(String paramString1, String paramString2)
  {
    GMTrace.i(12604655271936L, 93912);
    if (paramString2 == null)
    {
      GMTrace.o(12604655271936L, 93912);
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("function_type", paramString1);
      localJSONObject.put("function_value", paramString2);
      paramString1 = zJ(localJSONObject.toString());
      GMTrace.o(12604655271936L, 93912);
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GameReportUtil", paramString1, "", new Object[0]);
      }
    }
  }
  
  private static String cu(String paramString1, String paramString2)
  {
    GMTrace.i(12604923707392L, 93914);
    if (bg.nm(paramString1))
    {
      GMTrace.o(12604923707392L, 93914);
      return paramString2;
    }
    String str = zK(paramString1);
    Object localObject = zK(paramString2);
    paramString1 = null;
    for (;;)
    {
      try
      {
        paramString2 = new JSONObject(str);
        paramString1 = paramString2;
      }
      catch (Exception paramString2)
      {
        continue;
      }
      try
      {
        paramString2 = new JSONObject((String)localObject);
        if (paramString1 != null)
        {
          localObject = paramString1.keys();
          if (((Iterator)localObject).hasNext()) {
            try
            {
              str = (String)((Iterator)localObject).next();
              paramString2.put(str, paramString1.opt(str));
            }
            catch (Exception paramString1)
            {
              GMTrace.o(12604923707392L, 93914);
              return "";
            }
          }
        }
        paramString1 = zJ(paramString2.toString());
      }
      catch (JSONException paramString1)
      {
        GMTrace.o(12604923707392L, 93914);
        return "";
      }
    }
    GMTrace.o(12604923707392L, 93914);
    return paramString1;
  }
  
  public static void g(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(12603313094656L, 93902);
    w.d("MicroMsg.GameReportUtil", "reportGameDetail, appId = " + paramString + ", scene = " + paramInt2);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.GameReportUtil", "reportGameDetail fail, appId is null");
      GMTrace.o(12603313094656L, 93902);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(10700, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(12603313094656L, 93902);
  }
  
  public static int getNetworkType(Context paramContext)
  {
    GMTrace.i(12605594796032L, 93919);
    if (am.is3G(paramContext))
    {
      GMTrace.o(12605594796032L, 93919);
      return 4;
    }
    if (am.is4G(paramContext))
    {
      GMTrace.o(12605594796032L, 93919);
      return 5;
    }
    switch (am.getNetType(paramContext))
    {
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    default: 
      GMTrace.o(12605594796032L, 93919);
      return 6;
    case -1: 
      GMTrace.o(12605594796032L, 93919);
      return 255;
    case 0: 
      GMTrace.o(12605594796032L, 93919);
      return 1;
    case 5: 
      GMTrace.o(12605594796032L, 93919);
      return 2;
    }
    GMTrace.o(12605594796032L, 93919);
    return 3;
  }
  
  public static void o(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(12602910441472L, 93899);
    w.d("MicroMsg.GameReportUtil", "reportRegToWx, appId = " + paramString1 + ", pkgName = " + paramString2);
    if (bg.nm(paramString1))
    {
      w.e("MicroMsg.GameReportUtil", "reportRegToWx fail, appId is null");
      GMTrace.o(12602910441472L, 93899);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(10534, new Object[] { paramString1, Integer.valueOf(Y(paramContext, paramString2)), aFY(), Long.valueOf(System.currentTimeMillis() / 1000L) });
    GMTrace.o(12602910441472L, 93899);
  }
  
  public static String u(Map<String, String> paramMap)
  {
    GMTrace.i(12604521054208L, 93911);
    if (paramMap.size() == 0)
    {
      GMTrace.o(12604521054208L, 93911);
      return "";
    }
    JSONObject localJSONObject = new JSONObject();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      try
      {
        localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
      }
      catch (Exception paramMap)
      {
        w.e("MicroMsg.GameReportUtil", paramMap.getMessage());
        GMTrace.o(12604521054208L, 93911);
        return "";
      }
    }
    try
    {
      paramMap = URLEncoder.encode(localJSONObject.toString(), "UTF-8");
      GMTrace.o(12604521054208L, 93911);
      return paramMap;
    }
    catch (Exception paramMap)
    {
      w.e("MicroMsg.GameReportUtil", paramMap.getMessage());
      GMTrace.o(12604521054208L, 93911);
    }
    return "";
  }
  
  public static String zJ(String paramString)
  {
    GMTrace.i(12604252618752L, 93909);
    if (bg.nm(paramString))
    {
      GMTrace.o(12604252618752L, 93909);
      return "";
    }
    try
    {
      paramString = URLEncoder.encode(paramString, "UTF-8");
      GMTrace.o(12604252618752L, 93909);
      return paramString;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        paramString = "";
        w.e("MicroMsg.GameReportUtil", localException.getMessage());
      }
    }
  }
  
  private static String zK(String paramString)
  {
    GMTrace.i(12604386836480L, 93910);
    try
    {
      String str = URLDecoder.decode(paramString, "UTF-8");
      GMTrace.o(12604386836480L, 93910);
      return str;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.GameReportUtil", localException, "", new Object[0]);
      GMTrace.o(12604386836480L, 93910);
    }
    return paramString;
  }
  
  public static void zL(String paramString)
  {
    GMTrace.i(12605729013760L, 93920);
    lOw = paramString;
    GMTrace.o(12605729013760L, 93920);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */