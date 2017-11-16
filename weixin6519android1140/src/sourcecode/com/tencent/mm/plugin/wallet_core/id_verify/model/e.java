package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.wallet_core.g.a.h
{
  public String rdD;
  public String rdE;
  public String rdF;
  public String rdG;
  public int rdH;
  public long rdI;
  public String title;
  
  public e(int paramInt1, int paramInt2)
  {
    GMTrace.i(6843359297536L, 50987);
    this.rdD = null;
    this.title = null;
    this.rdE = null;
    this.rdF = null;
    this.rdG = null;
    this.rdH = 0;
    this.rdI = 0L;
    this.rdH = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    x(localHashMap);
    GMTrace.o(6843359297536L, 50987);
  }
  
  public final int Bb()
  {
    GMTrace.i(6843896168448L, 50991);
    GMTrace.o(6843896168448L, 50991);
    return 1614;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6843627732992L, 50989);
    w.i("MicroMsg.NetSceneRealnameGetDuty", "errCode=" + paramInt + ";errMsg=" + paramString);
    if ((paramInt == 0) && (paramJSONObject != null))
    {
      this.rdD = paramJSONObject.optString("agreed_flag", "0");
      this.title = paramJSONObject.optString("title", "");
      this.rdE = paramJSONObject.optString("service_protocol_wording", "");
      this.rdF = paramJSONObject.optString("service_protocol_url", "");
      this.rdG = paramJSONObject.optString("button_wording", "");
      this.rdI = paramJSONObject.optLong("delay_expired_time", 0L);
      if (this.rdI > 0L)
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vuf, Long.valueOf(System.currentTimeMillis() + this.rdI * 1000L));
      }
    }
    GMTrace.o(6843627732992L, 50989);
  }
  
  public final int aoD()
  {
    GMTrace.i(6843493515264L, 50988);
    GMTrace.o(6843493515264L, 50988);
    return 1614;
  }
  
  public final String getUri()
  {
    GMTrace.i(6843761950720L, 50990);
    GMTrace.o(6843761950720L, 50990);
    return "/cgi-bin/mmpay-bin/tenpay/realnamegetduty";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */