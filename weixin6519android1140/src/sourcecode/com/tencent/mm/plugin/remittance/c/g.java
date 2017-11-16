package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends a
{
  public String omc;
  
  public g(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2)
  {
    GMTrace.i(17409918369792L, 129714);
    HashMap localHashMap = new HashMap();
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("recv_username", paramString1);
    localHashMap.put("recv_nickname", paramString2);
    localHashMap.put("qrcodeid", paramString5);
    try
    {
      if (!bg.nm(paramString3)) {
        localHashMap.put("desc", URLEncoder.encode(paramString3, "UTF-8"));
      }
      if (!bg.nm(paramString4)) {
        localHashMap.put("message", URLEncoder.encode(paramString4, "UTF-8"));
      }
    }
    catch (UnsupportedEncodingException paramString5)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferPay", paramString5, "", new Object[0]);
      }
    }
    localHashMap.put("currency", String.valueOf(paramInt1));
    localHashMap.put("set_amount", String.valueOf(paramInt2));
    x(localHashMap);
    w.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong), paramString3, paramString4, Integer.valueOf(paramInt1) });
    GMTrace.o(17409918369792L, 129714);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(17410052587520L, 129715);
    this.omc = paramJSONObject.optString("payurl", "");
    w.i("MicroMsg.NetSceneH5F2fTransferPay", "payurl: %s", new Object[] { this.omc });
    GMTrace.o(17410052587520L, 129715);
  }
  
  public final String aoA()
  {
    GMTrace.i(17410186805248L, 129716);
    GMTrace.o(17410186805248L, 129716);
    return "/cgi-bin/mmpay-bin/h5f2ftransferpay";
  }
  
  public final int aoB()
  {
    GMTrace.i(17410455240704L, 129718);
    GMTrace.o(17410455240704L, 129718);
    return 1529;
  }
  
  public final int getType()
  {
    GMTrace.i(17410321022976L, 129717);
    GMTrace.o(17410321022976L, 129717);
    return 1529;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */