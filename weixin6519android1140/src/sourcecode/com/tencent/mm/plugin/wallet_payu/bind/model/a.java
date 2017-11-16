package com.tencent.mm.plugin.wallet_payu.bind.model;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.e.a.a
{
  public String description;
  public String eXA;
  public String pin;
  public String rkh;
  public String rsW;
  public String rtg;
  public String rth;
  public String rti;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(7917235339264L, 58988);
    this.rtg = paramString1;
    this.rkh = paramString2;
    this.eXA = paramString3;
    this.rth = paramString4;
    this.rti = paramString5;
    this.description = paramString6;
    this.rsW = paramString7;
    this.pin = paramString8;
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("information", paramString2);
    localHashMap.put("name_on_card", paramString3);
    localHashMap.put("card_number", paramString4);
    localHashMap.put("card_expiry", paramString5);
    localHashMap.put("description", paramString6);
    localHashMap.put("cvv", paramString7);
    localHashMap.put("pin", paramString8);
    x(localHashMap);
    GMTrace.o(7917235339264L, 58988);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7917369556992L, 58989);
    GMTrace.o(7917369556992L, 58989);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7917101121536L, 58987);
    GMTrace.o(7917101121536L, 58987);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\bind\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */