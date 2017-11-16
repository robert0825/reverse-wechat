package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.amr;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  public String rEm;
  public String rEn;
  public String rEo;
  public int rEp;
  public String sign;
  
  public q(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12008728559616L, 89472);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new amq();
    ((b.a)localObject).gtG = new amr();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_getuseropenid";
    ((b.a)localObject).gtE = 1177;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (amq)this.fUa.gtC.gtK;
    ((amq)localObject).jxL = paramString1;
    ((amq)localObject).uBG = paramString2;
    ((amq)localObject).jBs = paramString3;
    GMTrace.o(12008728559616L, 89472);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12009131212800L, 89475);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12009131212800L, 89475);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12008862777344L, 89473);
    w.i("MicroMsg.NetSceneMMBizGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (amr)this.fUa.gtD.gtK;
      this.rEm = paramq.rEm;
      this.sign = paramq.sign;
      this.rEn = paramq.rEn;
      this.rEo = paramq.rEo;
      this.rEp = paramq.rEp;
      w.d("MicroMsg.NetSceneMMBizGetUserOpenId", "openid:%s, sign:%s, head_img_url:%s, nick_name:%s, friend_relation:%d", new Object[] { this.rEm, this.sign, this.rEn, this.rEo, Integer.valueOf(this.rEp) });
    }
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12008862777344L, 89473);
  }
  
  public final int getType()
  {
    GMTrace.i(12008996995072L, 89474);
    GMTrace.o(12008996995072L, 89474);
    return 1177;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */