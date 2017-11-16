package com.tencent.mm.plugin.nearby.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alr;
import com.tencent.mm.protocal.c.als;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String ntt;
  public String ntu;
  
  public d(float paramFloat1, float paramFloat2, int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6677600403456L, 49752);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new alr();
    ((b.a)localObject).gtG = new als();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/joinlbsroom";
    ((b.a)localObject).gtE = 376;
    ((b.a)localObject).gtH = 183;
    ((b.a)localObject).gtI = 1000000183;
    this.fUa = ((b.a)localObject).DA();
    localObject = (alr)this.fUa.gtC.gtK;
    ((alr)localObject).tMX = 1;
    ((alr)localObject).tYy = paramFloat1;
    ((alr)localObject).tYz = paramFloat2;
    ((alr)localObject).ujb = paramInt;
    ((alr)localObject).ujc = paramString1;
    ((alr)localObject).ujd = paramString2;
    ((alr)localObject).uje = 0;
    w.d("MicroMsg.NetSceneLbsRoom", "Req: opcode:1" + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt + " gpsSource:0 mac" + paramString1 + " cell:" + paramString2);
    GMTrace.o(6677600403456L, 49752);
  }
  
  public d(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(6677734621184L, 49753);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new alr();
    ((b.a)localObject).gtG = new als();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/joinlbsroom";
    ((b.a)localObject).gtE = 376;
    ((b.a)localObject).gtH = 183;
    ((b.a)localObject).gtI = 1000000183;
    this.fUa = ((b.a)localObject).DA();
    localObject = (alr)this.fUa.gtC.gtK;
    ((alr)localObject).tYy = 0.0F;
    ((alr)localObject).tYz = 0.0F;
    ((alr)localObject).ujb = 0;
    ((alr)localObject).uje = 0;
    ((alr)localObject).ujc = "";
    ((alr)localObject).ujd = "";
    ((alr)localObject).tMX = 2;
    ((alr)localObject).gOY = paramString;
    ((alr)localObject).uAN = paramInt1;
    ((alr)localObject).uAM = paramInt2;
    GMTrace.o(6677734621184L, 49753);
  }
  
  public final int CD()
  {
    GMTrace.i(6678137274368L, 49756);
    int i = ((alr)this.fUa.gtC.gtK).tMX;
    GMTrace.o(6678137274368L, 49756);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6677868838912L, 49754);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6677868838912L, 49754);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6678271492096L, 49757);
    w.d("MicroMsg.NetSceneLbsRoom", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " opCode:" + CD());
    paramArrayOfByte = (als)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramInt2 != 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6678271492096L, 49757);
      return;
    }
    if (CD() == 1)
    {
      this.ntt = paramArrayOfByte.gOY;
      this.ntu = paramArrayOfByte.uAO;
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6678271492096L, 49757);
      return;
    }
    if (CD() == 2)
    {
      b.DQ(((alr)((com.tencent.mm.ad.b)paramq).gtC.gtK).gOY);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(6678271492096L, 49757);
  }
  
  public final int getType()
  {
    GMTrace.i(6678003056640L, 49755);
    GMTrace.o(6678003056640L, 49755);
    return 376;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */