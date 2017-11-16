package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ajb;
import com.tencent.mm.protocal.c.ajc;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fXo;
  
  public k(String paramString1, String paramString2)
  {
    GMTrace.i(12010070736896L, 89482);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ajb();
    ((b.a)localObject).gtG = new ajc();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibggetuseropenid";
    ((b.a)localObject).gtE = 1566;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ajb)this.fUa.gtC.gtK;
    ((ajb)localObject).jhi = paramString2;
    ((ajb)localObject).lQa = paramString1;
    GMTrace.o(12010070736896L, 89482);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12010473390080L, 89485);
    w.i("MicroMsg.NetSceneGetUserOpenId", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12010473390080L, 89485);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12010204954624L, 89483);
    w.i("MicroMsg.NetSceneGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12010204954624L, 89483);
  }
  
  public final int getType()
  {
    GMTrace.i(12010339172352L, 89484);
    GMTrace.o(12010339172352L, 89484);
    return 1566;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */