package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ah;
import com.tencent.mm.protocal.c.ai;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  public int jzH;
  public String jzI;
  
  public o(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3, bhb parambhb)
  {
    GMTrace.i(4913845239808L, 36611);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ah();
    ((b.a)localObject).gtG = new ai();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcarditem";
    ((b.a)localObject).gtE = 651;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ah)this.fUa.gtC.gtK;
    ((ah)localObject).eTJ = paramString1;
    ((ah)localObject).jyR = paramString2;
    ((ah)localObject).eTL = paramInt1;
    ((ah)localObject).eTK = paramString3;
    ((ah)localObject).tNI = paramString4;
    ((ah)localObject).tNH = paramString5;
    ((ah)localObject).tNJ = paramInt2;
    ((ah)localObject).tNK = paramInt3;
    ((ah)localObject).tNL = parambhb;
    GMTrace.o(4913845239808L, 36611);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4914113675264L, 36613);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4914113675264L, 36613);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4914247892992L, 36614);
    w.i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ai)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.jzG = paramq.jzG;
        this.jzH = paramq.jzH;
        this.jzI = paramq.jzI;
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4914247892992L, 36614);
      return;
      paramq = (ai)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.jzG = paramq.jzG;
        this.jzH = paramq.jzH;
        this.jzI = paramq.jzI;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4913979457536L, 36612);
    GMTrace.o(4913979457536L, 36612);
    return 651;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */