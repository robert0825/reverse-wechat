package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  public String rdJ;
  public String rdK;
  public String rdL;
  public String rdM;
  public String rdN;
  
  public f(String paramString)
  {
    GMTrace.i(19316212760576L, 143917);
    HashMap localHashMap = new HashMap();
    localHashMap.put("channel", "1");
    x(localHashMap);
    this.rdN = paramString;
    GMTrace.o(19316212760576L, 143917);
  }
  
  public final int Bb()
  {
    GMTrace.i(6839466983424L, 50958);
    GMTrace.o(6839466983424L, 50958);
    return 1630;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6839735418880L, 50960);
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.rdJ = paramJSONObject.optString("guide_flag");
      this.rdK = paramJSONObject.optString("guide_wording");
      this.rdL = paramJSONObject.optString("left_button_wording");
      this.rdM = paramJSONObject.optString("right_button_wording");
    }
    GMTrace.o(6839735418880L, 50960);
  }
  
  public final int aoD()
  {
    GMTrace.i(6839332765696L, 50957);
    GMTrace.o(6839332765696L, 50957);
    return 1630;
  }
  
  public final String getUri()
  {
    GMTrace.i(6839601201152L, 50959);
    GMTrace.o(6839601201152L, 50959);
    return "/cgi-bin/mmpay-bin/tenpay/realnameguidequery";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */