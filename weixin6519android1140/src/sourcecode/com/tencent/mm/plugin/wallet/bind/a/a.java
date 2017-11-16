package com.tencent.mm.plugin.wallet.bind.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends h
{
  public int qVW;
  public String qVX;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(7675509211136L, 57187);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bankcard_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    x(localHashMap);
    GMTrace.o(7675509211136L, 57187);
  }
  
  public final int Bb()
  {
    GMTrace.i(7675777646592L, 57189);
    GMTrace.o(7675777646592L, 57189);
    return 1540;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7676046082048L, 57191);
    if (paramInt == 0)
    {
      if (paramJSONObject != null)
      {
        this.qVW = paramJSONObject.optInt("unbindbannerlevel", 0);
        this.qVX = paramJSONObject.optString("unbindbannerwording");
        GMTrace.o(7676046082048L, 57191);
        return;
      }
      w.e("MicroMsg.NetSceneGetUnbindInfo", "json is null");
    }
    GMTrace.o(7676046082048L, 57191);
  }
  
  public final int aoD()
  {
    GMTrace.i(7675643428864L, 57188);
    GMTrace.o(7675643428864L, 57188);
    return 1540;
  }
  
  public final String getUri()
  {
    GMTrace.i(7675911864320L, 57190);
    GMTrace.o(7675911864320L, 57190);
    return "/cgi-bin/mmpay-bin/tenpay/unbindbanner";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */