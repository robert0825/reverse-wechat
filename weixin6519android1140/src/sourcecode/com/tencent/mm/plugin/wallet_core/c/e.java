package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
  extends h
{
  public e()
  {
    GMTrace.i(7025358536704L, 52343);
    x(new HashMap());
    GMTrace.o(7025358536704L, 52343);
  }
  
  public final int Bb()
  {
    GMTrace.i(7025895407616L, 52347);
    GMTrace.o(7025895407616L, 52347);
    return 1631;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7025626972160L, 52345);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneQueryUserWallet", "errCode is : " + paramInt);
    if (paramInt == 0)
    {
      n.byA().fTZ.eZ("WalletKindInfo", "delete from WalletKindInfo");
      if (paramJSONObject != null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneQueryUserWallet", "resp json " + paramJSONObject.toString());
        paramString = paramJSONObject.optJSONArray("UserWalletInfoList");
        if (paramString != null)
        {
          int i = paramString.length();
          paramInt = 0;
          while (paramInt < i)
          {
            paramJSONObject = com.tencent.mm.plugin.wallet_core.model.w.T(paramString.optJSONObject(paramInt));
            if (paramJSONObject != null) {
              n.byA().b(paramJSONObject);
            }
            paramInt += 1;
          }
          GMTrace.o(7025626972160L, 52345);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneQueryUserWallet", "wallet array is null");
        GMTrace.o(7025626972160L, 52345);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneQueryUserWallet", "response json is null");
    }
    GMTrace.o(7025626972160L, 52345);
  }
  
  public final int aoD()
  {
    GMTrace.i(7025492754432L, 52344);
    GMTrace.o(7025492754432L, 52344);
    return 1631;
  }
  
  public final String getUri()
  {
    GMTrace.i(7025761189888L, 52346);
    GMTrace.o(7025761189888L, 52346);
    return "/cgi-bin/mmpay-bin/tenpay/queryuserwallet";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */