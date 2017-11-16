package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends h
{
  public j(String paramString1, String paramString2)
  {
    GMTrace.i(10795400298496L, 80432);
    HashMap localHashMap = new HashMap();
    localHashMap.put("receiver_user_name", paramString1);
    localHashMap.put("transfer_qrcode_id", paramString2);
    x(localHashMap);
    GMTrace.o(10795400298496L, 80432);
  }
  
  public j(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(19338895556608L, 144086);
    HashMap localHashMap = new HashMap();
    localHashMap.put("receiver_user_name", paramString1);
    localHashMap.put("transfer_qrcode_id", paramString2);
    localHashMap.put("rcvr_ticket", paramString3);
    localHashMap.put("receiver_openid", paramString4);
    x(localHashMap);
    GMTrace.o(19338895556608L, 144086);
  }
  
  public final int Bb()
  {
    GMTrace.i(10795668733952L, 80434);
    GMTrace.o(10795668733952L, 80434);
    return 1535;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10795937169408L, 80436);
    w.d("MicroMsg.NetSenceTenPayBase", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(10795937169408L, 80436);
      return;
    }
    GMTrace.o(10795937169408L, 80436);
  }
  
  public final int aoD()
  {
    GMTrace.i(10795534516224L, 80433);
    GMTrace.o(10795534516224L, 80433);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(10795802951680L, 80435);
    GMTrace.o(10795802951680L, 80435);
    return "/cgi-bin/mmpay-bin/transfersendcancelf2f";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */