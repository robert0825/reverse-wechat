package com.tencent.mm.plugin.luckymoney.sns.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends h
{
  public int mMf;
  
  public a(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(9886209409024L, 73658);
    this.mMf = 0;
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", String.valueOf(paramInt));
    localHashMap.put("passwd", paramString1);
    localHashMap.put("req_key", paramString2);
    this.mMf = paramInt;
    x(localHashMap);
    GMTrace.o(9886209409024L, 73658);
  }
  
  public final int Bb()
  {
    GMTrace.i(9886477844480L, 73660);
    GMTrace.o(9886477844480L, 73660);
    return 1697;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(9886746279936L, 73662);
    w.i("MicroMsg.NetSceneSnsPayManage", " errCode: " + paramInt + " errMsg :" + paramString);
    if (paramInt == 0)
    {
      if (this.mMf == 1)
      {
        com.tencent.mm.plugin.luckymoney.sns.b.a.pX(1);
        w.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 1");
        GMTrace.o(9886746279936L, 73662);
        return;
      }
      com.tencent.mm.plugin.luckymoney.sns.b.a.pX(0);
      w.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 0");
      GMTrace.o(9886746279936L, 73662);
      return;
    }
    w.e("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() NetSceneSnsPayManage is false!");
    GMTrace.o(9886746279936L, 73662);
  }
  
  public final int aoD()
  {
    GMTrace.i(9886612062208L, 73661);
    GMTrace.o(9886612062208L, 73661);
    return 1697;
  }
  
  public final String getUri()
  {
    GMTrace.i(9886343626752L, 73659);
    GMTrace.o(9886343626752L, 73659);
    return "/cgi-bin/mmpay-bin/tenpay/snspaymanage";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\sns\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */