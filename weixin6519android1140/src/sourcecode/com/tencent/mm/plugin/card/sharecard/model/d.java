package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adl;
import com.tencent.mm.protocal.c.adm;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  public int jzH;
  public String jzI;
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(5060008345600L, 37700);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new adl();
    ((b.a)localObject).gtG = new adm();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
    ((b.a)localObject).gtE = 910;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (adl)this.fUa.gtC.gtK;
    ((adl)localObject).eTJ = paramString1;
    ((adl)localObject).scene = 20;
    ((adl)localObject).jxF = paramString2;
    ((adl)localObject).code = paramString3;
    GMTrace.o(5060008345600L, 37700);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5060410998784L, 37703);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5060410998784L, 37703);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5060142563328L, 37701);
    w.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(910), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (adm)this.fUa.gtD.gtK;
      w.v("MicroMsg.NetSceneGetShareCardConsumedInfo", "json:" + paramq.jzG);
      this.jzG = paramq.jzG;
      this.jzI = paramq.jzI;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5060142563328L, 37701);
  }
  
  public final int getType()
  {
    GMTrace.i(15360950534144L, 114448);
    GMTrace.o(15360950534144L, 114448);
    return 910;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */