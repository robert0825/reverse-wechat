package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.soter.c.b;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.wallet_core.g.a.h
  implements com.tencent.mm.network.k
{
  public d()
  {
    GMTrace.i(10750303141888L, 80096);
    HashMap localHashMap = new HashMap();
    Object localObject = b.bqB();
    String str = ((c)localObject).qpg;
    localObject = ((c)localObject).qph;
    localHashMap.put("cpu_id", str);
    localHashMap.put("uid", localObject);
    x(localHashMap);
    GMTrace.o(10750303141888L, 80096);
  }
  
  public final int Bb()
  {
    GMTrace.i(10750840012800L, 80100);
    GMTrace.o(10750840012800L, 80100);
    return 1597;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10750705795072L, 80099);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    g.ork.i(13686, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      e.eE(false);
      w.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi success!");
      GMTrace.o(10750705795072L, 80099);
      return;
    }
    w.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi failed!");
    GMTrace.o(10750705795072L, 80099);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(10750571577344L, 80098);
    if (paramInt == 0) {
      if (paramJSONObject == null) {
        break label70;
      }
    }
    label70:
    for (paramInt = paramJSONObject.optInt("clear_rsa_key_level", 0);; paramInt = 0)
    {
      a.azq();
      a.azr();
      ((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).azI();
      GMTrace.o(10750571577344L, 80098);
      return;
      w.e("MicroMsg.NetSceneTenpayCloseTouchPay", "do close fingerprint cgi failed!");
      GMTrace.o(10750571577344L, 80098);
      return;
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(10750437359616L, 80097);
    GMTrace.o(10750437359616L, 80097);
    return 116;
  }
  
  public final String getUri()
  {
    GMTrace.i(10750974230528L, 80101);
    GMTrace.o(10750974230528L, 80101);
    return "/cgi-bin/mmpay-bin/tenpay/closetouchpay";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */