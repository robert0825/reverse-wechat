package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.wi;
import com.tencent.mm.protocal.c.wj;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b kzP;
  
  public g(String paramString1, String paramString2)
  {
    GMTrace.i(12018929106944L, 89548);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wi();
    ((b.a)localObject).gtG = new wj();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/getappticket";
    ((b.a)localObject).gtE = 1097;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (wi)this.kzP.gtC.gtK;
    ((wi)localObject).eSd = paramString1;
    ((wi)localObject).signature = paramString2;
    GMTrace.o(12018929106944L, 89548);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12019197542400L, 89550);
    this.fUd = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(12019197542400L, 89550);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12019331760128L, 89551);
    w.i("MicroMsg.NetSceneGetAppTicket", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12019331760128L, 89551);
  }
  
  public final int getType()
  {
    GMTrace.i(12019063324672L, 89549);
    GMTrace.o(12019063324672L, 89549);
    return 1097;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */