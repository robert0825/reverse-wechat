package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k
  extends h
{
  public String mJM;
  public String omh;
  
  public k(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2)
  {
    GMTrace.i(10796071387136L, 80437);
    this.omh = null;
    this.mJM = "";
    this.omh = paramString3;
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString2);
    localHashMap.put("transaction_id", paramString1);
    localHashMap.put("op", paramString3);
    localHashMap.put("username", paramString4);
    localHashMap.put("invalid_time", String.valueOf(paramInt2));
    localHashMap.put("total_fee", String.valueOf(paramInt1));
    w.i("Micromsg.NetSceneTenpayRemittanceQuery", "trans_id=" + paramString2 + ";transaction_id=" + paramString1 + ";total_fee=" + paramInt1);
    x(localHashMap);
    GMTrace.o(10796071387136L, 80437);
  }
  
  public final int Bb()
  {
    GMTrace.i(10796339822592L, 80439);
    GMTrace.o(10796339822592L, 80439);
    return 1691;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10796608258048L, 80441);
    w.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(10796608258048L, 80441);
      return;
    }
    paramString = paramJSONObject.optJSONObject("real_name_info");
    if (paramString != null) {
      this.mJM = paramString.optString("guide_flag", "0");
    }
    GMTrace.o(10796608258048L, 80441);
  }
  
  public final int aoD()
  {
    GMTrace.i(10796205604864L, 80438);
    GMTrace.o(10796205604864L, 80438);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(10796474040320L, 80440);
    GMTrace.o(10796474040320L, 80440);
    return "/cgi-bin/mmpay-bin/transferoperation";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */