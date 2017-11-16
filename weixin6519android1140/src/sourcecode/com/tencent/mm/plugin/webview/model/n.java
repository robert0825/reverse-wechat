package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.ajg;
import com.tencent.mm.protocal.c.ajh;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, c.b
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  public c.a rEi;
  private final int rEk;
  
  public n(c.a parama, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(12006581075968L, 89456);
    w.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "NetSceneJSAPIRealtimeVerify doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7 });
    this.rEi = parama;
    this.rEk = paramInt;
    parama = new b.a();
    parama.gtF = new ajg();
    parama.gtG = new ajh();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-realtimeverify";
    parama.gtE = 1094;
    parama.gtH = 0;
    parama.gtI = 0;
    this.fUa = parama.DA();
    parama = (ajg)this.fUa.gtC.gtK;
    parama.url = paramString1;
    parama.eSd = paramString2;
    parama.uxW = paramString3;
    parama.eDJ = paramString4;
    parama.uxY = paramString5;
    parama.signature = paramString6;
    parama.uxZ = paramString7;
    parama.uya = com.tencent.mm.bm.b.aX(paramArrayOfByte);
    GMTrace.o(12006581075968L, 89456);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12007117946880L, 89460);
    w.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12007117946880L, 89460);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12006715293696L, 89457);
    w.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12006715293696L, 89457);
  }
  
  public final int bCg()
  {
    GMTrace.i(12007252164608L, 89461);
    int i = this.rEk;
    GMTrace.o(12007252164608L, 89461);
    return i;
  }
  
  public final ajh bCi()
  {
    GMTrace.i(12006983729152L, 89459);
    if (this.fUa == null)
    {
      GMTrace.o(12006983729152L, 89459);
      return null;
    }
    ajh localajh = (ajh)this.fUa.gtD.gtK;
    GMTrace.o(12006983729152L, 89459);
    return localajh;
  }
  
  public final int getType()
  {
    GMTrace.i(12006849511424L, 89458);
    GMTrace.o(12006849511424L, 89458);
    return 1094;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */