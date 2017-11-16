package com.tencent.mm.wallet_core.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends k
{
  protected JSONObject xDU;
  public boolean xDV;
  public int xDW;
  public boolean xDX;
  
  public e(Map<String, String> paramMap)
  {
    GMTrace.i(1518807810048L, 11316);
    this.xDV = false;
    this.xDW = 0;
    this.xDX = false;
    w.i("MicroMsg.NetSceneDelayQueryOrder", "NetSceneDelayQueryOrder call");
    x(paramMap);
    GMTrace.o(1518807810048L, 11316);
  }
  
  public int Bb()
  {
    GMTrace.i(1519210463232L, 11319);
    GMTrace.o(1519210463232L, 11319);
    return 1525;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1519344680960L, 11320);
    super.a(paramInt, paramString, paramJSONObject);
    JSONObject localJSONObject1 = paramJSONObject;
    if (r.hlg) {}
    try
    {
      localJSONObject1 = new JSONObject("{\"retcode\":268447844,\"retmsg\":\"系统麻烦请稍后再试\",\"can_pay_retry\":1,\"show_retmsg_type\":1}");
      w.i("MicroMsg.NetSceneDelayQueryOrder", "errCode = " + paramInt + "errMsg=" + paramString);
      this.xDU = localJSONObject1;
      if (localJSONObject1 != null)
      {
        w.d("MicroMsg.NetSceneDelayQueryOrder", "ret json: %s", new Object[] { localJSONObject1.toString() });
        if (localJSONObject1.optInt("can_pay_retry") != 1) {
          break label137;
        }
      }
      label137:
      for (boolean bool = true;; bool = false)
      {
        this.xDV = bool;
        this.xDW = localJSONObject1.optInt("show_retmsg_type");
        GMTrace.o(1519344680960L, 11320);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        JSONObject localJSONObject2 = paramJSONObject;
      }
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(1518942027776L, 11317);
    GMTrace.o(1518942027776L, 11317);
    return 1525;
  }
  
  public final JSONObject cmd()
  {
    GMTrace.i(1519478898688L, 11321);
    JSONObject localJSONObject = this.xDU;
    GMTrace.o(1519478898688L, 11321);
    return localJSONObject;
  }
  
  public String getUri()
  {
    GMTrace.i(1519076245504L, 11318);
    GMTrace.o(1519076245504L, 11318);
    return "/cgi-bin/mmpay-bin/tenpay/payorderquery";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\g\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */