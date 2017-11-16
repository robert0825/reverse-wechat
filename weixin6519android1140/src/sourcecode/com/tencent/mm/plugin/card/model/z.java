package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ye;
import com.tencent.mm.protocal.c.yf;
import com.tencent.mm.sdk.platformtools.w;

public final class z
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public CardGiftInfo jzJ;
  
  public z(int paramInt, String paramString)
  {
    GMTrace.i(4913308368896L, 36607);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ye();
    ((b.a)localObject).gtG = new yf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardgiftinfo";
    ((b.a)localObject).gtE = 1165;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ye)this.fUa.gtC.gtK;
    ((ye)localObject).tNN = paramInt;
    ((ye)localObject).tNO = paramString;
    GMTrace.o(4913308368896L, 36607);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4913711022080L, 36610);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4913711022080L, 36610);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4913442586624L, 36608);
    w.i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jzJ = CardGiftInfo.a((yf)this.fUa.gtD.gtK);
      w.d("MicroMsg.NetSceneGetCardGiftInfo", "%s", new Object[] { this.jzJ.toString() });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4913442586624L, 36608);
  }
  
  public final int getType()
  {
    GMTrace.i(4913576804352L, 36609);
    GMTrace.o(4913576804352L, 36609);
    return 1165;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */