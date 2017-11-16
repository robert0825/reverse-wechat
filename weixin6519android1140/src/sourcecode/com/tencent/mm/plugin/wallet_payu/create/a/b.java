package com.tencent.mm.plugin.wallet_payu.create.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public String eMJ;
  public String eVq;
  public String pin;
  public String rtF;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(7943810449408L, 59186);
    this.rtF = paramString1;
    this.eVq = paramString2;
    this.pin = paramString3;
    this.eMJ = paramString4;
    HashMap localHashMap = new HashMap();
    localHashMap.put("dial_code", paramString1);
    localHashMap.put("number", paramString2);
    localHashMap.put("pin", paramString3);
    localHashMap.put("payu_reference", paramString4);
    x(localHashMap);
    GMTrace.o(7943810449408L, 59186);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7943944667136L, 59187);
    GMTrace.o(7943944667136L, 59187);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7943676231680L, 59185);
    GMTrace.o(7943676231680L, 59185);
    return 17;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\create\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */