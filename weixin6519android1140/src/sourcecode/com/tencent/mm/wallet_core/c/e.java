package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends h
{
  public String xDe;
  
  public e(String paramString)
  {
    GMTrace.i(1442840576000L, 10750);
    this.xDe = paramString;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("crt_no", com.tencent.mm.compatible.util.p.encode(paramString));
    localHashMap1.put("deviceid", com.tencent.mm.compatible.d.p.getDeviceID(ab.getContext()));
    x(localHashMap1);
    ap(localHashMap2);
    GMTrace.o(1442840576000L, 10750);
  }
  
  public final int Bb()
  {
    GMTrace.i(1443109011456L, 10752);
    GMTrace.o(1443109011456L, 10752);
    return 1568;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1443377446912L, 10754);
    w.i("MicroMsg.NetSceneDeletedigitalcert", "onGYNetEnd %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(1443377446912L, 10754);
  }
  
  public final int aoD()
  {
    GMTrace.i(1442974793728L, 10751);
    GMTrace.o(1442974793728L, 10751);
    return 1568;
  }
  
  public final String getUri()
  {
    GMTrace.i(1443243229184L, 10753);
    GMTrace.o(1443243229184L, 10753);
    return "/cgi-bin/mmpay-bin/tenpay/deletedigitalcert";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */