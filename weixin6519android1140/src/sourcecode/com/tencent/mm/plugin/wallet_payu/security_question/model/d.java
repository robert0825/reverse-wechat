package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public ArrayList<PayUSecurityQuestion> rvt;
  
  public d()
  {
    GMTrace.i(7924214661120L, 59040);
    x(new HashMap());
    GMTrace.o(7924214661120L, 59040);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7924483096576L, 59042);
    if (paramJSONObject != null)
    {
      this.rvt = new ArrayList();
      paramString = paramJSONObject.optJSONArray("security_question_list");
      if (paramString != null)
      {
        paramInt = 0;
        while (paramInt < paramString.length())
        {
          paramJSONObject = paramString.optJSONObject(paramInt);
          if (paramJSONObject != null)
          {
            paramJSONObject = new PayUSecurityQuestion(paramJSONObject.optString("id"), paramJSONObject.optString("description"));
            this.rvt.add(paramJSONObject);
          }
          paramInt += 1;
        }
      }
    }
    GMTrace.o(7924483096576L, 59042);
  }
  
  public final int bxZ()
  {
    GMTrace.i(7924348878848L, 59041);
    GMTrace.o(7924348878848L, 59041);
    return 11;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_payu\security_question\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */