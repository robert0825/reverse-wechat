package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ayp;
import com.tencent.mm.protocal.c.ayq;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public u(float paramFloat1, float paramFloat2, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4903242039296L, 36532);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayp();
    ((b.a)localObject).gtG = new ayq();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/reportlocation";
    ((b.a)localObject).gtE = 1253;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ayp)this.fUa.gtC.gtK;
    ((ayp)localObject).latitude = paramFloat1;
    ((ayp)localObject).longitude = paramFloat2;
    ((ayp)localObject).eTJ = paramString1;
    ((ayp)localObject).jxF = paramString2;
    ((ayp)localObject).uMS = paramInt;
    GMTrace.o(4903242039296L, 36532);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4903510474752L, 36534);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4903510474752L, 36534);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4903644692480L, 36535);
    w.i("MicroMsg.NetSceneCardReportLocation", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4903644692480L, 36535);
  }
  
  public final int getType()
  {
    GMTrace.i(4903376257024L, 36533);
    GMTrace.o(4903376257024L, 36533);
    return 1253;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */