package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class j
  extends h
{
  public j(String paramString)
  {
    GMTrace.i(6191866445824L, 46133);
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    localHashMap.put("device_id", p.ta());
    x(localHashMap);
    GMTrace.o(6191866445824L, 46133);
  }
  
  public final int Bb()
  {
    GMTrace.i(6192403316736L, 46137);
    GMTrace.o(6192403316736L, 46137);
    return 566;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6192269099008L, 46136);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    GMTrace.o(6192269099008L, 46136);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6192134881280L, 46135);
    GMTrace.o(6192134881280L, 46135);
  }
  
  public final int aoD()
  {
    GMTrace.i(6192000663552L, 46134);
    GMTrace.o(6192000663552L, 46134);
    return 47;
  }
  
  public final String getUri()
  {
    GMTrace.i(6192537534464L, 46138);
    GMTrace.o(6192537534464L, 46138);
    return "/cgi-bin/mmpay-bin/tenpay/offlineclose";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */