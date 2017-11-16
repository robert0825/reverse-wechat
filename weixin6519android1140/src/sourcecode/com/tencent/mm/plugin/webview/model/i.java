package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xq;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public i(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    GMTrace.i(12007923253248L, 89466);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xq();
    ((b.a)localObject).gtG = new xr();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizjsapiredirecturl";
    ((b.a)localObject).gtE = 1393;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (xq)this.fUa.gtC.gtK;
    ((xq)localObject).ufb = paramString1;
    ((xq)localObject).upi = paramString2;
    ((xq)localObject).uph = ((String)paramMap.get("groupId"));
    ((xq)localObject).rfM = ((String)paramMap.get("timestamp"));
    ((xq)localObject).jHR = ((String)paramMap.get("nonceStr"));
    ((xq)localObject).signature = ((String)paramMap.get("signature"));
    ((xq)localObject).upj = paramMap.get("params").toString();
    GMTrace.o(12007923253248L, 89466);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12008325906432L, 89469);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(12008325906432L, 89469);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12008057470976L, 89467);
    w.d("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(12008057470976L, 89467);
  }
  
  public final xr bCd()
  {
    GMTrace.i(16932237475840L, 126155);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      xr localxr = (xr)this.fUa.gtD.gtK;
      GMTrace.o(16932237475840L, 126155);
      return localxr;
    }
    GMTrace.o(16932237475840L, 126155);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(12008191688704L, 89468);
    GMTrace.o(12008191688704L, 89468);
    return 1393;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */