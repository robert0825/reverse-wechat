package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  String appId;
  final b fUa;
  private com.tencent.mm.ad.e fXo;
  String hOp;
  
  public f(String paramString1, String paramString2)
  {
    GMTrace.i(12005641551872L, 89449);
    this.appId = paramString1;
    this.hOp = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new amo();
    ((b.a)localObject).gtG = new amp();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_downloadcdninfo";
    ((b.a)localObject).gtE = 1035;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (amo)this.fUa.gtC.gtK;
    ((amo)localObject).eSd = paramString1;
    ((amo)localObject).uBE = paramString2;
    w.i("MicroMsg.NetSceneDownloadCdnInfo", "download cdn info, appid : %s, mediaId : %s", new Object[] { paramString1, paramString2 });
    GMTrace.o(12005641551872L, 89449);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12006044205056L, 89452);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12006044205056L, 89452);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12005775769600L, 89450);
    w.i("MicroMsg.NetSceneDownloadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12005775769600L, 89450);
  }
  
  public final int getType()
  {
    GMTrace.i(12005909987328L, 89451);
    GMTrace.o(12005909987328L, 89451);
    return 1035;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */