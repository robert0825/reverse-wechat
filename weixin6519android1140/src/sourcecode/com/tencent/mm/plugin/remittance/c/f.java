package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends a
{
  public f(String paramString1, String paramString2, int paramInt1, long paramLong, int paramInt2)
  {
    GMTrace.i(17411797417984L, 129728);
    HashMap localHashMap = new HashMap();
    localHashMap.put("recv_username", paramString1);
    localHashMap.put("qrcodeid", paramString2);
    localHashMap.put("currency", String.valueOf(paramInt1));
    localHashMap.put("amount", String.valueOf(paramLong));
    localHashMap.put("set_amount", String.valueOf(paramInt2));
    x(localHashMap);
    w.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "qrcodeId: %s, currency: %s", new Object[] { paramString2, Integer.valueOf(paramInt1) });
    GMTrace.o(17411797417984L, 129728);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(17411931635712L, 129729);
    w.d("MicroMsg.NetSceneH5F2fTransferCancelPay", "json: %s", new Object[] { paramJSONObject.toString() });
    w.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(17411931635712L, 129729);
  }
  
  public final String aoA()
  {
    GMTrace.i(17412065853440L, 129730);
    GMTrace.o(17412065853440L, 129730);
    return "/cgi-bin/mmpay-bin/h5f2ftransfercancelpay";
  }
  
  public final int aoB()
  {
    GMTrace.i(17412334288896L, 129732);
    GMTrace.o(17412334288896L, 129732);
    return 1257;
  }
  
  public final int getType()
  {
    GMTrace.i(17412200071168L, 129731);
    GMTrace.o(17412200071168L, 129731);
    return 1257;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */