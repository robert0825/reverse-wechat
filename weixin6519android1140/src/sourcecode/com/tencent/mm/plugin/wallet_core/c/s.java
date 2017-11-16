package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import org.json.JSONObject;

public final class s
  extends h
{
  public double omp;
  public String ony;
  public String rcD;
  public double rcE;
  
  public final int Bb()
  {
    GMTrace.i(7024955883520L, 52340);
    GMTrace.o(7024955883520L, 52340);
    return 1689;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7025224318976L, 52342);
    w.i("Micromsg.NetSceneTransferChargeQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      w.i("Micromsg.NetSceneTransferChargeQuery", "NetSceneTransferChargeQuery request error");
      GMTrace.o(7025224318976L, 52342);
      return;
    }
    this.rcD = paramJSONObject.optString("short_desc");
    this.ony = paramJSONObject.optString("charge_desc");
    this.rcE = paramJSONObject.optDouble("acc_fee");
    this.omp = (paramJSONObject.optDouble("remain_fee") / 100.0D);
    GMTrace.o(7025224318976L, 52342);
  }
  
  public final int aoD()
  {
    GMTrace.i(7024821665792L, 52339);
    GMTrace.o(7024821665792L, 52339);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(7025090101248L, 52341);
    GMTrace.o(7025090101248L, 52341);
    return "/cgi-bin/mmpay-bin/transfergetchargefee";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */