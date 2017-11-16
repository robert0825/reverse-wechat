package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjn;
import com.tencent.mm.protocal.c.bjo;
import com.tencent.mm.sdk.platformtools.w;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  
  public v(String paramString1, String paramString2)
  {
    GMTrace.i(11996783181824L, 89383);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bjn();
    ((b.a)localObject).gtG = new bjo();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/transid";
    ((b.a)localObject).gtE = 1142;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bjn)this.fUa.gtC.gtK;
    ((bjn)localObject).eSd = paramString1;
    ((bjn)localObject).uUB = paramString2;
    GMTrace.o(11996783181824L, 89383);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11997185835008L, 89386);
    w.i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11997185835008L, 89386);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11996917399552L, 89384);
    w.i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11996917399552L, 89384);
  }
  
  public final int getType()
  {
    GMTrace.i(11997051617280L, 89385);
    GMTrace.o(11997051617280L, 89385);
    return 1142;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */