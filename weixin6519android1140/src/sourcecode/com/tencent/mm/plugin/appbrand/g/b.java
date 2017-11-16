package com.tencent.mm.plugin.appbrand.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajs;
import com.tencent.mm.protocal.c.ajt;
import com.tencent.mm.protocal.c.bvc;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  private a<b> isF;
  
  private b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(15528588476416L, 115697);
    w.i("MicroMsg.webview.NetSceneJSOperateWxData", "NetSceneJSLogin doScene appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject).gtF = new ajs();
    ((com.tencent.mm.ad.b.a)localObject).gtG = new ajt();
    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-operatewxdata";
    ((com.tencent.mm.ad.b.a)localObject).gtE = 1133;
    ((com.tencent.mm.ad.b.a)localObject).gtH = 0;
    ((com.tencent.mm.ad.b.a)localObject).gtI = 0;
    this.fUa = ((com.tencent.mm.ad.b.a)localObject).DA();
    localObject = (ajs)this.fUa.gtC.gtK;
    ((ajs)localObject).lQa = paramString1;
    if (paramString2.getBytes() == null) {}
    for (paramString1 = new byte[0];; paramString1 = paramString2.getBytes())
    {
      ((ajs)localObject).jgP = new com.tencent.mm.bm.b(paramString1);
      ((ajs)localObject).uyB = paramString3;
      ((ajs)localObject).uyt = paramInt1;
      ((ajs)localObject).uys = paramInt2;
      if (paramInt3 > 0)
      {
        ((ajs)localObject).uyu = new bvc();
        ((ajs)localObject).uyu.scene = paramInt3;
      }
      GMTrace.o(15528588476416L, 115697);
      return;
    }
  }
  
  public b(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, a<b> parama)
  {
    this(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3);
    GMTrace.i(15528454258688L, 115696);
    this.isF = parama;
    GMTrace.o(15528454258688L, 115696);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10559579750400L, 78675);
    w.i("MicroMsg.webview.NetSceneJSOperateWxData", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10559579750400L, 78675);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10559311314944L, 78673);
    w.i("MicroMsg.webview.NetSceneJSOperateWxData", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.isF != null) {
      this.isF.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10559311314944L, 78673);
  }
  
  public final int getType()
  {
    GMTrace.i(10559445532672L, 78674);
    GMTrace.o(10559445532672L, 78674);
    return 1133;
  }
  
  public static abstract interface a<T extends com.tencent.mm.ad.k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */