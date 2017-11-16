package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.aiv;
import com.tencent.mm.protocal.c.aji;
import com.tencent.mm.protocal.c.ajj;
import com.tencent.mm.protocal.c.ajw;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, c.b
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  private final int rEk;
  public aiv rEl;
  
  public o(aiv paramaiv, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, com.tencent.mm.bm.b paramb, int paramInt1, LinkedList<ajw> paramLinkedList, int paramInt2)
  {
    GMTrace.i(12003091415040L, 89430);
    w.i("MicroMsg.webview.NetSceneJSAPISetAuth", "NetSceneJSAPISetAuth doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, Integer.valueOf(paramInt1) });
    this.rEl = paramaiv;
    this.rEk = paramInt2;
    paramaiv = new b.a();
    paramaiv.gtF = new aji();
    paramaiv.gtG = new ajj();
    paramaiv.uri = "/cgi-bin/mmbiz-bin/jsapi-setauth";
    paramaiv.gtE = 1096;
    paramaiv.gtH = 0;
    paramaiv.gtI = 0;
    this.fUa = paramaiv.DA();
    paramaiv = (aji)this.fUa.gtC.gtK;
    paramaiv.url = paramString1;
    paramaiv.eSd = paramString2;
    paramaiv.uxW = paramString3;
    paramaiv.eDJ = paramString4;
    paramaiv.uxY = paramString5;
    paramaiv.signature = paramString6;
    paramaiv.uxZ = paramString7;
    paramaiv.uyb = paramInt1;
    paramaiv.uya = paramb;
    paramaiv.uyf = paramLinkedList;
    GMTrace.o(12003091415040L, 89430);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12003494068224L, 89433);
    w.i("MicroMsg.webview.NetSceneJSAPISetAuth", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12003494068224L, 89433);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12003225632768L, 89431);
    w.i("MicroMsg.webview.NetSceneJSAPISetAuth", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12003225632768L, 89431);
  }
  
  public final int bCg()
  {
    GMTrace.i(12003628285952L, 89434);
    int i = this.rEk;
    GMTrace.o(12003628285952L, 89434);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(12003359850496L, 89432);
    GMTrace.o(12003359850496L, 89432);
    return 1096;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */