package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.aje;
import com.tencent.mm.protocal.c.ajf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, c.b
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  public String lHJ;
  public c.a rEi;
  private final int rEk;
  
  public m(c.a parama, String paramString1, String paramString2, LinkedList<String> paramLinkedList, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, int paramInt2)
  {
    GMTrace.i(19478884646912L, 145129);
    w.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "NetSceneJSAPIPreVerify doScene url[%s], appid[%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
    this.rEi = parama;
    this.lHJ = paramString1;
    this.rEk = paramInt2;
    parama = new b.a();
    parama.gtF = new aje();
    parama.gtG = new ajf();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-preverify";
    parama.gtE = 1093;
    parama.gtH = 0;
    parama.gtI = 0;
    this.fUa = parama.DA();
    parama = (aje)this.fUa.gtC.gtK;
    parama.url = paramString1;
    parama.eSd = paramString2;
    parama.uym = paramLinkedList;
    parama.eDJ = paramString3;
    parama.uxY = paramString4;
    parama.signature = paramString5;
    parama.uxZ = paramString6;
    parama.scene = paramInt1;
    parama.uyn = paramString7;
    GMTrace.o(19478884646912L, 145129);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12009802301440L, 89480);
    w.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12009802301440L, 89480);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12009399648256L, 89477);
    w.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12009399648256L, 89477);
  }
  
  public final int bCg()
  {
    GMTrace.i(12009936519168L, 89481);
    int i = this.rEk;
    GMTrace.o(12009936519168L, 89481);
    return i;
  }
  
  public final ajf bCh()
  {
    GMTrace.i(12009668083712L, 89479);
    if (this.fUa == null)
    {
      GMTrace.o(12009668083712L, 89479);
      return null;
    }
    ajf localajf = (ajf)this.fUa.gtD.gtK;
    GMTrace.o(12009668083712L, 89479);
    return localajf;
  }
  
  public final int getType()
  {
    GMTrace.i(12009533865984L, 89478);
    GMTrace.o(12009533865984L, 89478);
    return 1093;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */