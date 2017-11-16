package com.tencent.mm.plugin.fingerprint.c;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
  implements k
{
  public f(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(10751108448256L, 80102);
    HashMap localHashMap = new HashMap();
    localHashMap.put("encrypted_open_info", URLEncoder.encode(paramString1));
    localHashMap.put("encrypted_rsa_sign", URLEncoder.encode(paramString2));
    localHashMap.put("passwd", paramString3);
    x(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("device_type", Build.MODEL);
    paramString1.put("open_scene", String.valueOf(paramInt));
    ap(paramString1);
    GMTrace.o(10751108448256L, 80102);
  }
  
  public final int Bb()
  {
    GMTrace.i(10751645319168L, 80106);
    GMTrace.o(10751645319168L, 80106);
    return 1599;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10751511101440L, 80105);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay success");
      e.eE(true);
      GMTrace.o(10751511101440L, 80105);
      return;
    }
    w.e("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay failed");
    GMTrace.o(10751511101440L, 80105);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10751376883712L, 80104);
    GMTrace.o(10751376883712L, 80104);
  }
  
  public final int aoD()
  {
    GMTrace.i(10751242665984L, 80103);
    GMTrace.o(10751242665984L, 80103);
    return 119;
  }
  
  public final String getUri()
  {
    GMTrace.i(10751779536896L, 80107);
    GMTrace.o(10751779536896L, 80107);
    return "/cgi-bin/mmpay-bin/tenpay/androidopentouch";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */