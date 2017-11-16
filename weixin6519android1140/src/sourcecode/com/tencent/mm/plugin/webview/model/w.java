package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.ams;
import com.tencent.mm.protocal.c.amt;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  String appId;
  String eHy;
  final b fUa;
  private com.tencent.mm.ad.e fXo;
  
  public w(String paramString1, String paramString2, amn paramamn)
  {
    GMTrace.i(11994098827264L, 89363);
    this.appId = paramString1;
    this.eHy = paramString2;
    paramString2 = new b.a();
    paramString2.gtF = new ams();
    paramString2.gtG = new amt();
    paramString2.uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_uploadcdninfo";
    paramString2.gtE = 1034;
    paramString2.gtH = 0;
    paramString2.gtI = 0;
    this.fUa = paramString2.DA();
    paramString2 = (ams)this.fUa.gtC.gtK;
    paramString2.eSd = paramString1;
    paramString2.uBF = paramamn;
    GMTrace.o(11994098827264L, 89363);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11994501480448L, 89366);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11994501480448L, 89366);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11994233044992L, 89364);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneUploadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11994233044992L, 89364);
  }
  
  public final int getType()
  {
    GMTrace.i(11994367262720L, 89365);
    GMTrace.o(11994367262720L, 89365);
    return 1034;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */