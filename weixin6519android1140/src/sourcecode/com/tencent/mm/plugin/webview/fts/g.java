package com.tencent.mm.plugin.webview.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.all;
import com.tencent.mm.protocal.c.brb;
import com.tencent.mm.protocal.c.brc;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eQd;
  b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public g()
  {
    GMTrace.i(19468415664128L, 145051);
    this.eQd = -1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new brb();
    ((b.a)localObject).gtG = new brc();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/wxaapp/weappsearchguide";
    ((b.a)localObject).gtE = 1866;
    this.fUa = ((b.a)localObject).DA();
    localObject = com.tencent.mm.az.e.CO();
    brb localbrb = (brb)this.fUa.gtC.gtK;
    localbrb.vaQ = ((all)localObject).tYz;
    localbrb.vaR = ((all)localObject).tYy;
    localbrb.vaS = com.tencent.mm.az.e.Ku();
    GMTrace.o(19468415664128L, 145051);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19468684099584L, 145053);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19468684099584L, 145053);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19468818317312L, 145054);
    w.i("MicroMsg.NetSceneWeAppSearchGuide", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19468818317312L, 145054);
  }
  
  public final int getType()
  {
    GMTrace.i(19468549881856L, 145052);
    int i = this.fUa.gtE;
    GMTrace.o(19468549881856L, 145052);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */