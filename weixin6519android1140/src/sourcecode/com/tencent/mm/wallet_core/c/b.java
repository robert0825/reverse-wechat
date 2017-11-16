package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class b
{
  public String eJI;
  public String title;
  public String xDa;
  public String xDb;
  public String xDc;
  
  public b()
  {
    GMTrace.i(1441632616448L, 10741);
    this.title = "";
    this.xDa = "";
    this.xDb = "";
    this.xDc = "";
    this.eJI = "";
    GMTrace.o(1441632616448L, 10741);
  }
  
  public b(String paramString)
  {
    GMTrace.i(1441498398720L, 10740);
    this.title = "";
    this.xDa = "";
    this.xDb = "";
    this.xDc = "";
    this.eJI = "";
    if (bg.nm(paramString))
    {
      GMTrace.o(1441498398720L, 10740);
      return;
    }
    try
    {
      paramString = new JSONObject(paramString);
      this.title = paramString.optString("title");
      this.xDa = paramString.optString("body1");
      this.xDb = paramString.optString("body2");
      this.xDc = paramString.optString("button");
      GMTrace.o(1441498398720L, 10740);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.CrtRtnWoding", "crtwoding error %s", new Object[] { paramString.getMessage() });
      GMTrace.o(1441498398720L, 10740);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */