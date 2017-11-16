package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public String eMJ;
  public String id;
  public String rvs;
  
  public c()
  {
    this("");
    GMTrace.i(7924617314304L, 59043);
    GMTrace.o(7924617314304L, 59043);
  }
  
  public c(String paramString)
  {
    GMTrace.i(7924751532032L, 59044);
    this.eMJ = paramString;
    HashMap localHashMap = new HashMap();
    localHashMap.put("payu_reference", bg.aq(paramString, ""));
    x(localHashMap);
    GMTrace.o(7924751532032L, 59044);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7925019967488L, 59046);
    this.id = paramJSONObject.optString("id");
    this.rvs = paramJSONObject.optString("description");
    GMTrace.o(7925019967488L, 59046);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7924885749760L, 59045);
    GMTrace.o(7924885749760L, 59045);
    return 23;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */