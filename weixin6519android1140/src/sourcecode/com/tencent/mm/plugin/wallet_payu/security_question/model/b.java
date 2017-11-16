package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String eMJ;
  public String id;
  public boolean kRT;
  public String mIY;
  public String rvr;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(7925691056128L, 59051);
    this.id = paramString2;
    this.mIY = paramString3;
    this.eMJ = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", paramString2);
    localHashMap.put("answer", paramString3);
    localHashMap.put("payu_reference", paramString1);
    x(localHashMap);
    GMTrace.o(7925691056128L, 59051);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7925959491584L, 59053);
    this.kRT = paramJSONObject.optBoolean("verified");
    this.rvr = paramJSONObject.optString("payu_reference");
    GMTrace.o(7925959491584L, 59053);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7925825273856L, 59052);
    GMTrace.o(7925825273856L, 59052);
    return 18;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */