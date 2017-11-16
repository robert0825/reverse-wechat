package com.tencent.mm.plugin.bottle.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.xu;
import com.tencent.mm.protocal.c.xv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public d()
  {
    GMTrace.i(7601018372096L, 56632);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xu();
    ((b.a)localObject).gtG = new xv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbottlecount";
    ((b.a)localObject).gtE = 152;
    ((b.a)localObject).gtH = 49;
    ((b.a)localObject).gtI = 1000000049;
    ((b.a)localObject).gtJ = false;
    this.fUa = ((b.a)localObject).DA();
    localObject = (xu)this.fUa.gtC.gtK;
    ((xu)localObject).jhi = com.tencent.mm.y.q.zE();
    ((xu)localObject).upk = ((int)bg.Pu());
    GMTrace.o(7601018372096L, 56632);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7601152589824L, 56633);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7601152589824L, 56633);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7601421025280L, 56635);
    paramq = (xv)this.fUa.gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      c.ld(paramq.upm);
      c.lc(paramq.upl);
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneGetBottleCount", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3 + " ret:" + paramq.tST + " pickCnt:" + paramq.upm + " throwCnt:" + paramq.upl);
      this.fUd.a(0, paramq.tST, paramString, this);
      GMTrace.o(7601421025280L, 56635);
      return;
      if ((paramq.tST == 63534) || (paramq.tST == -56))
      {
        c.ld(0);
        c.lc(0);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(7601286807552L, 56634);
    GMTrace.o(7601286807552L, 56634);
    return 152;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */