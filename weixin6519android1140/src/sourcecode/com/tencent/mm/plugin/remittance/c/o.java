package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class o
  extends h
{
  public o(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(10799829483520L, 80465);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString1);
    localHashMap.put("receiver_name", paramString2);
    localHashMap.put("from", String.valueOf(paramInt2));
    localHashMap.put("invalid_time", String.valueOf(paramInt1));
    x(localHashMap);
    GMTrace.o(10799829483520L, 80465);
  }
  
  public final int Bb()
  {
    GMTrace.i(10800097918976L, 80467);
    GMTrace.o(10800097918976L, 80467);
    return 1545;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10800366354432L, 80469);
    w.d("Micromsg.NetSceneTenpayRemittanceResendMsg", "errCode " + paramInt + " errMsg: " + paramString);
    GMTrace.o(10800366354432L, 80469);
  }
  
  public final int aoD()
  {
    GMTrace.i(10799963701248L, 80466);
    GMTrace.o(10799963701248L, 80466);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(10800232136704L, 80468);
    GMTrace.o(10800232136704L, 80468);
    return "/cgi-bin/mmpay-bin/transferresendmsg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */