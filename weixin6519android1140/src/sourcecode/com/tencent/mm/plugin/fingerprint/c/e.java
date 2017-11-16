package com.tencent.mm.plugin.fingerprint.c;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends h
  implements k
{
  public String eJS;
  public String llH;
  public String lll;
  
  public e(String paramString)
  {
    GMTrace.i(10751913754624L, 80108);
    this.lll = "";
    this.eJS = "";
    this.llH = "";
    HashMap localHashMap = new HashMap();
    if (TextUtils.isEmpty(paramString)) {
      w.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is empty");
    }
    for (;;)
    {
      localHashMap.put("encrypted_cert_info", URLEncoder.encode(paramString));
      localHashMap.put("ver", "0x1.0");
      x(localHashMap);
      GMTrace.o(10751913754624L, 80108);
      return;
      w.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is not empty");
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(10752450625536L, 80112);
    GMTrace.o(10752450625536L, 80112);
    return 1598;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10752182190080L, 80110);
    if (paramJSONObject != null)
    {
      this.lll = paramJSONObject.optString("encrypted_device_info");
      this.eJS = paramJSONObject.optString("encrypted_rsa_sign");
      this.llH = paramJSONObject.optString("cert");
      if (TextUtils.isEmpty(this.lll))
      {
        w.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is empty");
        if (!TextUtils.isEmpty(this.eJS)) {
          break label112;
        }
        w.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is empty");
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(this.llH)) {
          break label122;
        }
        w.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is empty");
        GMTrace.o(10752182190080L, 80110);
        return;
        w.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is not empty");
        break;
        label112:
        w.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is not empty");
      }
      label122:
      w.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is not empty");
    }
    GMTrace.o(10752182190080L, 80110);
  }
  
  public final int aoD()
  {
    GMTrace.i(10752047972352L, 80109);
    GMTrace.o(10752047972352L, 80109);
    return 118;
  }
  
  public final String getUri()
  {
    GMTrace.i(10752316407808L, 80111);
    GMTrace.o(10752316407808L, 80111);
    return "/cgi-bin/mmpay-bin/tenpay/getopentouchcert";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */