package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import org.json.JSONObject;

public final class l
  extends h
{
  public String nzY;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6199919509504L, 46193);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    GMTrace.o(6199919509504L, 46193);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6199785291776L, 46192);
    this.nzY = paramJSONObject.optString("barcode");
    GMTrace.o(6199785291776L, 46192);
  }
  
  public final int aoD()
  {
    GMTrace.i(6199651074048L, 46191);
    GMTrace.o(6199651074048L, 46191);
    return 78;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */