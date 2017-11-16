package com.tencent.mm.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  public String desc;
  public int eBr;
  public int eBs;
  public String eBt;
  public String fLY;
  public String fLZ;
  public int fMa;
  public int showType;
  public String url;
  
  public c()
  {
    GMTrace.i(13156290134016L, 98022);
    GMTrace.o(13156290134016L, 98022);
  }
  
  public static c dJ(String paramString)
  {
    GMTrace.i(13156424351744L, 98023);
    if (bg.nm(paramString))
    {
      GMTrace.o(13156424351744L, 98023);
      return null;
    }
    c localc = new c();
    paramString = bh.q(paramString, "e");
    if (paramString == null)
    {
      w.d("MicroMsg.BroadcastEntity", "this is not errmsg");
      GMTrace.o(13156424351744L, 98023);
      return null;
    }
    localc.desc = ((String)paramString.get(".e.Content"));
    localc.url = ((String)paramString.get(".e.Url"));
    localc.eBt = ((String)paramString.get(".e.Title"));
    localc.eBs = bg.getInt((String)paramString.get(".e.Action"), 0);
    localc.showType = bg.getInt((String)paramString.get(".e.ShowType"), 0);
    localc.eBr = bg.getInt((String)paramString.get(".e.DispSec"), 30);
    localc.fLY = ((String)paramString.get(".e.Ok"));
    localc.fLZ = ((String)paramString.get(".e.Cancel"));
    localc.fMa = bg.getInt((String)paramString.get("e.Countdown"), 0);
    if (ef(localc.showType))
    {
      GMTrace.o(13156424351744L, 98023);
      return localc;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject((String)paramString.get(".e"));
      localc.desc = localJSONObject.getString("Content");
      localc.url = localJSONObject.getString("Url");
      localc.eBt = localJSONObject.getString("Title");
      localc.eBs = bg.getInt(localJSONObject.getString("Action"), 0);
      localc.showType = bg.getInt(localJSONObject.getString("ShowType"), 0);
      localc.eBr = bg.getInt(localJSONObject.getString("DispSec"), 30);
      localc.fLY = ((String)paramString.get(".e.Ok"));
      localc.fLZ = ((String)paramString.get(".e.Cancel"));
      localc.fMa = bg.getInt((String)paramString.get("e.Countdown"), 0);
      boolean bool = ef(localc.showType);
      if (bool)
      {
        GMTrace.o(13156424351744L, 98023);
        return localc;
      }
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.BroadcastEntity", paramString, "", new Object[0]);
      GMTrace.o(13156424351744L, 98023);
    }
    return null;
  }
  
  private static boolean ef(int paramInt)
  {
    GMTrace.i(13156558569472L, 98024);
    if (paramInt == 4)
    {
      GMTrace.o(13156558569472L, 98024);
      return true;
    }
    if (paramInt == 1)
    {
      GMTrace.o(13156558569472L, 98024);
      return true;
    }
    if (paramInt == 5)
    {
      GMTrace.o(13156558569472L, 98024);
      return true;
    }
    if (paramInt == 3)
    {
      GMTrace.o(13156558569472L, 98024);
      return true;
    }
    if (paramInt == 8)
    {
      GMTrace.o(13156558569472L, 98024);
      return true;
    }
    GMTrace.o(13156558569472L, 98024);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */