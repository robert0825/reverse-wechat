package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends h
{
  public String eMW;
  public boolean eXw;
  private Map<String, String> qYz;
  public boolean skq;
  public String token;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(8987890155520L, 66965);
    this.eXw = true;
    this.skq = false;
    this.qYz = new HashMap();
    this.qYz.put("session_key", paramString3);
    this.qYz.put("bank_type", paramString4);
    this.qYz.put("name", paramString1);
    this.qYz.put("cre_id", paramString2);
    x(this.qYz);
    GMTrace.o(8987890155520L, 66965);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8988292808704L, 66968);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(8988292808704L, 66968);
      return;
    }
    try
    {
      this.token = paramJSONObject.optString("session_key");
      this.eXw = "1".equals(paramJSONObject.getString("need_bind"));
      this.skq = "1".equals(paramJSONObject.getString("bank_user"));
      this.eMW = paramJSONObject.optString("mobile_no");
      GMTrace.o(8988292808704L, 66968);
      return;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
      GMTrace.o(8988292808704L, 66968);
    }
  }
  
  public final boolean aVn()
  {
    GMTrace.i(8988024373248L, 66966);
    super.aVn();
    this.qYz.put("retry", "1");
    x(this.qYz);
    GMTrace.o(8988024373248L, 66966);
    return true;
  }
  
  public final int aoD()
  {
    GMTrace.i(8988158590976L, 66967);
    GMTrace.o(8988158590976L, 66967);
    return 64;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */