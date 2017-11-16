package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.aiw;
import com.tencent.mm.protocal.c.aix;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, c.b
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  public c.a rEi;
  public String rEj;
  private final int rEk;
  public String url;
  
  public l(c.a parama, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, byte[] paramArrayOfByte, int paramInt1, String paramString8, int paramInt2)
  {
    GMTrace.i(12001212366848L, 89416);
    w.i("MicroMsg.webview.NetSceneJSAPIAuth", "NetSceneJSAPIAuth doScene appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s], [%s]", new Object[] { paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, Integer.valueOf(paramInt1), paramString8 });
    this.rEi = parama;
    this.rEj = paramString3;
    this.url = paramString1;
    this.rEk = paramInt2;
    parama = new b.a();
    parama.gtF = new aiw();
    parama.gtG = new aix();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-auth";
    parama.gtE = 1095;
    parama.gtH = 0;
    parama.gtI = 0;
    this.fUa = parama.DA();
    parama = (aiw)this.fUa.gtC.gtK;
    parama.url = paramString1;
    parama.lPg = paramString2;
    parama.uxW = paramString3;
    parama.eDJ = paramString4;
    parama.uxY = paramString5;
    parama.signature = paramString6;
    parama.uxZ = paramString7;
    parama.uya = com.tencent.mm.bm.b.aX(paramArrayOfByte);
    parama.uyb = paramInt1;
    parama.scope = paramString8;
    GMTrace.o(12001212366848L, 89416);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12001883455488L, 89421);
    w.i("MicroMsg.webview.NetSceneJSAPIAuth", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12001883455488L, 89421);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12001346584576L, 89417);
    w.i("MicroMsg.webview.NetSceneJSAPIAuth", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12001346584576L, 89417);
  }
  
  public final aiw bCe()
  {
    GMTrace.i(12001615020032L, 89419);
    if (this.fUa == null)
    {
      GMTrace.o(12001615020032L, 89419);
      return null;
    }
    aiw localaiw = (aiw)this.fUa.gtC.gtK;
    GMTrace.o(12001615020032L, 89419);
    return localaiw;
  }
  
  public final aix bCf()
  {
    GMTrace.i(12001749237760L, 89420);
    if (this.fUa == null)
    {
      GMTrace.o(12001749237760L, 89420);
      return null;
    }
    aix localaix = (aix)this.fUa.gtD.gtK;
    GMTrace.o(12001749237760L, 89420);
    return localaix;
  }
  
  public final int bCg()
  {
    GMTrace.i(12002017673216L, 89422);
    int i = this.rEk;
    GMTrace.o(12002017673216L, 89422);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(12001480802304L, 89418);
    GMTrace.o(12001480802304L, 89418);
    return 1095;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */