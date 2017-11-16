package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.c.f;
import com.tencent.mm.protocal.c.cx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class q
  extends j
{
  private static volatile q hRy;
  
  private q()
  {
    GMTrace.i(15532480790528L, 115726);
    GMTrace.o(15532480790528L, 115726);
  }
  
  public static q UC()
  {
    GMTrace.i(15532212355072L, 115724);
    if (hRy == null) {}
    try
    {
      if (hRy == null) {
        hRy = new q();
      }
      q localq = hRy;
      GMTrace.o(15532212355072L, 115724);
      return localq;
    }
    finally {}
  }
  
  public static com.tencent.mm.plugin.appbrand.c.e a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    GMTrace.i(15533017661440L, 115730);
    Object localObject = com.tencent.mm.plugin.appbrand.app.e.Se().d(paramString2, new String[] { "appId", "nickname", "brandIconURL" });
    String str2 = String.valueOf(paramString1);
    String str1;
    if (localObject == null)
    {
      paramString1 = "";
      if (localObject != null) {
        break label120;
      }
      str1 = "";
      label59:
      if (localObject != null) {
        break label130;
      }
    }
    label120:
    label130:
    for (localObject = "";; localObject = ((WxaAttributes)localObject).field_brandIconURL)
    {
      paramString1 = new com.tencent.mm.plugin.appbrand.c.e(str2, paramString2, paramString1, str1, (String)localObject, paramInt, com.tencent.mm.plugin.appbrand.app.e.Se().pp(paramString2), com.tencent.mm.plugin.appbrand.app.e.Sk().aa(paramString2, paramInt), paramLong);
      GMTrace.o(15533017661440L, 115730);
      return paramString1;
      paramString1 = ((WxaAttributes)localObject).field_appId;
      break;
      str1 = ((WxaAttributes)localObject).field_nickname;
      break label59;
    }
  }
  
  public static boolean i(String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(15532749225984L, 115728);
    Object localObject1 = com.tencent.mm.plugin.appbrand.app.e.Se();
    if (bg.nm(paramString))
    {
      GMTrace.o(15532749225984L, 115728);
      return false;
    }
    Object localObject2 = ((p)localObject1).d(paramString, new String[] { "appOpt" });
    if (localObject2 == null)
    {
      GMTrace.o(15532749225984L, 115728);
      return false;
    }
    int i = ((WxaAttributes)localObject2).field_appOpt;
    if (!paramBoolean) {}
    for (paramInt = i & (paramInt ^ 0xFFFFFFFF);; paramInt = i | paramInt)
    {
      localObject2 = new ContentValues(1);
      ((ContentValues)localObject2).put("appOpt", Integer.valueOf(paramInt));
      paramBoolean = bool;
      if (((p)localObject1).goN.update("WxaAttributesTable", (ContentValues)localObject2, String.format("%s=?", new Object[] { "username" }), new String[] { paramString }) > 0) {
        paramBoolean = true;
      }
      if (paramBoolean)
      {
        localObject1 = new kv();
        ((kv)localObject1).eOX.eAr = paramString;
        ((kv)localObject1).eOX.eOY = paramInt;
        a.vgX.m((b)localObject1);
      }
      GMTrace.o(15532749225984L, 115728);
      return paramBoolean;
    }
  }
  
  public static long pp(String paramString)
  {
    GMTrace.i(15533420314624L, 115733);
    long l = com.tencent.mm.plugin.appbrand.app.e.Se().pp(paramString);
    GMTrace.o(15533420314624L, 115733);
    return l;
  }
  
  public static t pq(String paramString)
  {
    GMTrace.i(15532883443712L, 115729);
    if (bg.nm(paramString))
    {
      GMTrace.o(15532883443712L, 115729);
      return null;
    }
    WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.e.Se().d(paramString, new String[] { "appId", "nickname", "signature", "brandIconURL", "dynamicInfo", "versionInfo", "registerSource", "bindWxaInfo" });
    if (localWxaAttributes != null)
    {
      t localt = new t();
      localt.username = paramString;
      localt.appId = localWxaAttributes.field_appId;
      localt.eCQ = localWxaAttributes.field_nickname;
      localt.signature = localWxaAttributes.field_signature;
      localt.hSb = localWxaAttributes.field_brandIconURL;
      localt.hRS = localWxaAttributes.UE().hRS;
      int i;
      if (localWxaAttributes.UF() == null)
      {
        i = -1;
        localt.hRY = i;
        localt.hRF = localWxaAttributes.UG();
      }
      for (;;)
      {
        try
        {
          if (!bg.nm(localWxaAttributes.field_registerSource)) {
            continue;
          }
          paramString = "";
          localt.gwN = paramString;
        }
        catch (Exception paramString)
        {
          continue;
        }
        GMTrace.o(15532883443712L, 115729);
        return localt;
        i = localWxaAttributes.UF().hRY;
        break;
        paramString = new JSONObject(localWxaAttributes.field_registerSource).optString("RegisterBody", "");
      }
    }
    GMTrace.o(15532883443712L, 115729);
    return null;
  }
  
  public static AppBrandSysConfig pr(String paramString)
  {
    boolean bool2 = false;
    GMTrace.i(15533151879168L, 115731);
    Object localObject = com.tencent.mm.plugin.appbrand.app.e.Se().e(paramString, new String[0]);
    if (localObject != null)
    {
      if (localObject == null) {
        break label599;
      }
      paramString = new AppBrandSysConfig();
      paramString.eAr = ((WxaAttributes)localObject).field_username;
      paramString.eEs = ((WxaAttributes)localObject).field_nickname;
      paramString.hQJ = ((WxaAttributes)localObject).field_brandIconURL;
      paramString.appId = ((WxaAttributes)localObject).field_appId;
      paramString.hQK = ((WxaAttributes)localObject).UD().hRN;
      paramString.hQP = ((WxaAttributes)localObject).UE().hRR.hQP;
      paramString.hQQ = ((WxaAttributes)localObject).UE().hRR.hQQ;
      paramString.hQT = ((WxaAttributes)localObject).UE().hRR.hQT;
      paramString.hQU = ((WxaAttributes)localObject).UE().hRR.hQU;
      paramString.hQS = ((WxaAttributes)localObject).UE().hRR.hQS;
      paramString.hQR = ((WxaAttributes)localObject).UE().hRR.hQR;
      paramString.hQV = ((WxaAttributes)localObject).UE().hRR.hRV;
      paramString.hQW = ((WxaAttributes)localObject).UE().hRR.hRW;
      paramString.hQZ = ((ArrayList)SysConfigUtil.e(new ArrayList(), ((WxaAttributes)localObject).UD().hRJ));
      paramString.hRa = ((ArrayList)SysConfigUtil.e(new ArrayList(), ((WxaAttributes)localObject).UD().hRK));
      paramString.hRc = ((ArrayList)SysConfigUtil.e(new ArrayList(), ((WxaAttributes)localObject).UD().hRM));
      paramString.hRb = ((ArrayList)SysConfigUtil.e(new ArrayList(), ((WxaAttributes)localObject).UD().hRL));
      paramString.hRi = new cx();
      paramString.hRi.tQW = ((WxaAttributes)localObject).UD().hML;
      paramString.hRi.tRd = ((WxaAttributes)localObject).UD().hRH;
      paramString.hRd = ((WxaAttributes)localObject).UE().hRR.hRd;
      paramString.hRe = ((WxaAttributes)localObject).UE().hRR.hRe;
      paramString.hRf = ((WxaAttributes)localObject).UE().hRR.hRf;
    }
    for (;;)
    {
      if (paramString != null)
      {
        localObject = paramString.appId;
        if ((!bg.nm((String)localObject)) && (com.tencent.mm.plugin.appbrand.app.e.Si() != null)) {
          break label552;
        }
      }
      label552:
      for (boolean bool1 = false;; bool1 = Boolean.parseBoolean(com.tencent.mm.plugin.appbrand.app.e.Si().get((String)localObject + "_AppDebugEnabled", "false")))
      {
        paramString.hQL = bool1;
        localObject = com.tencent.mm.plugin.appbrand.app.e.Sl().a(paramString.appId, 0, new String[] { "version", "downloadURL", "versionState" });
        if (localObject != null) {
          paramString.hRg.hKC = ((com.tencent.mm.plugin.appbrand.appcache.t)localObject).field_version;
        }
        localObject = com.tencent.mm.y.c.c.Ct().er("100216");
        bool1 = bool2;
        if (((com.tencent.mm.storage.c)localObject).isValid())
        {
          bool1 = bool2;
          if ("1".equals(((com.tencent.mm.storage.c)localObject).bSg().get("isOpenJSCore"))) {
            bool1 = true;
          }
        }
        paramString.hQX = bool1;
        paramString.hQM = "1".equals(com.tencent.mm.plugin.appbrand.app.e.Si().get(paramString.appId + "_PerformancePanelEnabled", "0"));
        GMTrace.o(15533151879168L, 115731);
        return paramString;
      }
      GMTrace.o(15533151879168L, 115731);
      return null;
      label599:
      paramString = null;
    }
  }
  
  public static String[] pt(String paramString)
  {
    GMTrace.i(15533554532352L, 115734);
    if (bg.nm(paramString))
    {
      GMTrace.o(15533554532352L, 115734);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.appbrand.app.e.Se().d(paramString, new String[] { "roundedSquareIconURL", "bigHeadURL" });
    if (localObject == null)
    {
      GMTrace.o(15533554532352L, 115734);
      return null;
    }
    paramString = ((WxaAttributes)localObject).field_roundedSquareIconURL;
    localObject = ((WxaAttributes)localObject).field_bigHeadURL;
    GMTrace.o(15533554532352L, 115734);
    return new String[] { paramString, localObject };
  }
  
  public static String pu(String paramString)
  {
    GMTrace.i(15533688750080L, 115735);
    if (bg.nm(paramString))
    {
      GMTrace.o(15533688750080L, 115735);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.e.Se().d(paramString, new String[] { "appId" });
    if (paramString == null)
    {
      GMTrace.o(15533688750080L, 115735);
      return null;
    }
    paramString = paramString.field_appId;
    GMTrace.o(15533688750080L, 115735);
    return paramString;
  }
  
  public static String pv(String paramString)
  {
    GMTrace.i(15533822967808L, 115736);
    if (bg.nm(paramString))
    {
      GMTrace.o(15533822967808L, 115736);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.e.Se().e(paramString, new String[] { "nickname" });
    if (paramString == null)
    {
      GMTrace.o(15533822967808L, 115736);
      return null;
    }
    paramString = paramString.field_nickname;
    GMTrace.o(15533822967808L, 115736);
    return paramString;
  }
  
  public static String pw(String paramString)
  {
    GMTrace.i(15533957185536L, 115737);
    if (bg.nm(paramString))
    {
      GMTrace.o(15533957185536L, 115737);
      return null;
    }
    paramString = com.tencent.mm.plugin.appbrand.app.e.Se().e(paramString, new String[] { "username" });
    if (paramString == null)
    {
      GMTrace.o(15533957185536L, 115737);
      return null;
    }
    paramString = paramString.field_username;
    GMTrace.o(15533957185536L, 115737);
    return paramString;
  }
  
  public static void px(String paramString)
  {
    GMTrace.i(15534225620992L, 115739);
    if (bg.nm(paramString))
    {
      GMTrace.o(15534225620992L, 115739);
      return;
    }
    p localp = com.tencent.mm.plugin.appbrand.app.e.Se();
    if (!bg.nm(paramString))
    {
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("syncVersion", "");
      localContentValues.put("syncTimeSecond", Long.valueOf(0L));
      localp.goN.update("WxaAttributesTable", localContentValues, String.format(Locale.US, "%s=?", new Object[] { "username" }), new String[] { paramString });
    }
    GMTrace.o(15534225620992L, 115739);
  }
  
  public static void py(String paramString)
  {
    GMTrace.i(15534359838720L, 115740);
    if (bg.nm(paramString))
    {
      GMTrace.o(15534359838720L, 115740);
      return;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    com.tencent.mm.plugin.appbrand.app.e.Se().a(localWxaAttributes, new String[] { "username" });
    GMTrace.o(15534359838720L, 115740);
  }
  
  public static void release()
  {
    GMTrace.i(15532346572800L, 115725);
    try
    {
      hRy = null;
      GMTrace.o(15532346572800L, 115725);
      return;
    }
    finally {}
  }
  
  public final void c(j.a parama)
  {
    GMTrace.i(15532615008256L, 115727);
    super.a(parama, com.tencent.mm.plugin.appbrand.o.d.xB().ngv.getLooper());
    GMTrace.o(15532615008256L, 115727);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */