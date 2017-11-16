package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static String TAG;
  
  static
  {
    GMTrace.i(12615258472448L, 93991);
    TAG = "MicroMsg.GameABTestStrategy";
    GMTrace.o(12615258472448L, 93991);
  }
  
  private static void a(com.tencent.mm.storage.c paramc, int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(20408342413312L, 152054);
    if (paramc == null)
    {
      w.i(TAG, "ABTestItem is null");
      GMTrace.o(20408342413312L, 152054);
      return;
    }
    str = "";
    try
    {
      JSONObject localJSONObject = new JSONObject();
      if (!bg.nm(paramString)) {
        localJSONObject.put("url", paramString);
      }
      localJSONObject.put("jumpType", paramInt2);
      paramString = p.encode(localJSONObject.toString(), "UTF-8");
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString = str;
      }
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString = str;
      }
    }
    w.i(TAG, "reportABTest : " + paramc.field_layerId + " , " + paramc.field_business + " , " + paramc.field_expId + " , " + paramc.field_sequence + " , " + paramc.field_prioritylevel + " , " + paramc.field_startTime + " , " + paramc.field_endTime + " , " + paramInt1 + " , " + paramString);
    g.ork.i(14841, new Object[] { paramc.field_layerId, paramc.field_business, paramc.field_expId, Long.valueOf(paramc.field_sequence), Integer.valueOf(paramc.field_prioritylevel), Long.valueOf(paramc.field_startTime), Long.valueOf(paramc.field_endTime), Integer.valueOf(paramInt1), paramString });
    GMTrace.o(20408342413312L, 152054);
  }
  
  public static a aEY()
  {
    GMTrace.i(20408073977856L, 152052);
    a locala = new a();
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100003");
    if (!localc.isValid())
    {
      w.e(TAG, "getLibraryABTestInfo is timeout,startTime: %d, endTime: %d", new Object[] { Long.valueOf(localc.field_startTime), Long.valueOf(localc.field_endTime) });
      GMTrace.o(20408073977856L, 152052);
      return locala;
    }
    w.i(TAG, "getLibraryABTestInfo success, layerId = %s", new Object[] { localc.field_layerId });
    Object localObject = localc.bSg();
    locala.eQl = bg.getInt((String)((Map)localObject).get("game_library_jump"), 0);
    String str = (String)((Map)localObject).get("game_library_url");
    localObject = str;
    if (str == null) {
      localObject = "";
    }
    locala.url = ((String)localObject);
    a(localc, 1005, locala.url, locala.eQl);
    GMTrace.o(20408073977856L, 152052);
    return locala;
  }
  
  public static a aEZ()
  {
    GMTrace.i(20408208195584L, 152053);
    a locala = new a();
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100022");
    if (!localc.isValid())
    {
      GMTrace.o(20408208195584L, 152053);
      return locala;
    }
    Object localObject = localc.bSg();
    locala.eQl = bg.getInt((String)((Map)localObject).get("game_message_jump"), 0);
    String str = (String)((Map)localObject).get("game_message_url");
    localObject = str;
    if (str == null) {
      localObject = "";
    }
    locala.url = ((String)localObject);
    a(localc, 1001, locala.url, locala.eQl);
    GMTrace.o(20408208195584L, 152053);
    return locala;
  }
  
  public static a be(String paramString, int paramInt)
  {
    GMTrace.i(20407939760128L, 152051);
    a locala = new a();
    if (bg.nm(paramString))
    {
      w.e(TAG, "appid is null");
      GMTrace.o(20407939760128L, 152051);
      return locala;
    }
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100002");
    if (!localc.isValid())
    {
      w.e(TAG, "getDetailABTestInfo is timeout,startTime: %d, endTime: %d", new Object[] { Long.valueOf(localc.field_startTime), Long.valueOf(localc.field_endTime) });
      GMTrace.o(20407939760128L, 152051);
      return locala;
    }
    w.i(TAG, "getDetailABTestInfo success, layerId = %s", new Object[] { localc.field_layerId });
    Object localObject = localc.bSg();
    locala.eQl = bg.getInt((String)((Map)localObject).get("game_detail_jump"), 0);
    localObject = (String)((Map)localObject).get("game_detail_url");
    if (localObject == null) {}
    for (paramString = "";; paramString = (String)localObject + paramString)
    {
      locala.url = paramString;
      a(localc, paramInt, locala.url, locala.eQl);
      GMTrace.o(20407939760128L, 152051);
      return locala;
    }
  }
  
  public static a oH(int paramInt)
  {
    GMTrace.i(20407805542400L, 152050);
    a locala = new a();
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100001");
    if (!localc.isValid())
    {
      w.e(TAG, "getIndexABTestInfo is timeout,startTime: %d, endTime: %d", new Object[] { Long.valueOf(localc.field_startTime), Long.valueOf(localc.field_endTime) });
      GMTrace.o(20407805542400L, 152050);
      return locala;
    }
    Object localObject = localc.bSg();
    locala.eQl = bg.getInt((String)((Map)localObject).get("game_homepage_jump"), 0);
    String str = (String)((Map)localObject).get("game_homepage_url");
    localObject = str;
    if (str == null) {
      localObject = "";
    }
    locala.url = ((String)localObject);
    a(localc, paramInt, locala.url, locala.eQl);
    w.i(TAG, "getIndexABTestInfo success, layerId = %s, expId = %s, flag = %d, url = %s", new Object[] { localc.field_layerId, localc.field_expId, Integer.valueOf(locala.eQl), locala.url });
    GMTrace.o(20407805542400L, 152050);
    return locala;
  }
  
  public static final class a
  {
    public int eQl;
    public String url;
    
    public a()
    {
      GMTrace.i(12613647859712L, 93979);
      this.eQl = 0;
      this.url = "";
      GMTrace.o(12613647859712L, 93979);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */