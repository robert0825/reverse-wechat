package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  public String jNb;
  public String rcl;
  public String rcm;
  public BindCardOrder rcn;
  
  public f(BindCardOrder paramBindCardOrder, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, String paramString6, int paramInt1, int paramInt2)
  {
    GMTrace.i(20876359630848L, 155541);
    this.rcn = paramBindCardOrder;
    paramBindCardOrder = new HashMap();
    paramBindCardOrder.put("activity_id", paramString1);
    paramBindCardOrder.put("award_id", paramString2);
    paramBindCardOrder.put("send_record_id", paramString3);
    paramBindCardOrder.put("user_record_id", paramString4);
    paramBindCardOrder.put("activity_mch_id", String.valueOf(paramLong1));
    paramBindCardOrder.put("activity_type", String.valueOf(paramLong2));
    paramBindCardOrder.put("bank_type", paramString5);
    paramBindCardOrder.put("bank_serial", paramString6);
    paramBindCardOrder.put("bindbankscene", String.valueOf(paramInt1));
    paramBindCardOrder.put("realname_scene", String.valueOf(paramInt2));
    x(paramBindCardOrder);
    GMTrace.o(20876359630848L, 155541);
  }
  
  public final int Bb()
  {
    GMTrace.i(20876762284032L, 155544);
    GMTrace.o(20876762284032L, 155544);
    return 1786;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(20876628066304L, 155543);
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.rcl = paramJSONObject.optString("result_code");
      this.jNb = paramJSONObject.optString("result_msg");
      this.rcm = paramJSONObject.optString("alert_wording");
    }
    GMTrace.o(20876628066304L, 155543);
  }
  
  public final int aoD()
  {
    GMTrace.i(20876493848576L, 155542);
    GMTrace.o(20876493848576L, 155542);
    return 1786;
  }
  
  public final String getUri()
  {
    GMTrace.i(20876896501760L, 155545);
    GMTrace.o(20876896501760L, 155545);
    return "/cgi-bin/mmpay-bin/tenpay/sendbindcardaward";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */