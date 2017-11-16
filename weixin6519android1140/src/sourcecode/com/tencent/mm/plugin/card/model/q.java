package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.al;
import com.tencent.mm.protocal.c.am;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public CardGiftInfo jzJ;
  
  public q(int paramInt, String paramString1, String paramString2, Boolean paramBoolean)
  {
    GMTrace.i(19559415283712L, 145729);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new al();
    ((b.a)localObject).gtG = new am();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptgiftcard";
    ((b.a)localObject).gtE = 1136;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (al)this.fUa.gtC.gtK;
    ((al)localObject).tNN = paramInt;
    ((al)localObject).tNO = paramString1;
    ((al)localObject).tNP = paramString2;
    ((al)localObject).tNQ = paramBoolean.booleanValue();
    GMTrace.o(19559415283712L, 145729);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4901094555648L, 36516);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4901094555648L, 36516);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4900826120192L, 36514);
    w.i("MicroMsg.NetSceneAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jzJ = CardGiftInfo.a((am)this.fUa.gtD.gtK);
      w.d("MicroMsg.NetSceneAcceptGiftCard", "%s", new Object[] { this.jzJ.toString() });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4900826120192L, 36514);
  }
  
  public final int getType()
  {
    GMTrace.i(4900960337920L, 36515);
    GMTrace.o(4900960337920L, 36515);
    return 1136;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */