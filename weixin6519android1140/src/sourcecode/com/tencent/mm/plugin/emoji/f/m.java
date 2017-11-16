package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.aaa;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.zz;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public byte[] klL;
  private String klM;
  
  public m(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(11292811198464L, 84138);
    this.klL = null;
    b.a locala = new b.a();
    locala.gtF = new zz();
    locala.gtG = new aaa();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetemotiondonorlist";
    locala.gtE = 299;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klL = paramArrayOfByte;
    this.klM = paramString;
    GMTrace.o(11292811198464L, 84138);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11293213851648L, 84141);
    this.fUd = parame1;
    parame1 = (zz)this.fUa.gtC.gtK;
    if (this.klL != null) {}
    for (parame1.tQz = n.H(this.klL);; parame1.tQz = new azp())
    {
      parame1.tRS = this.klM;
      int i = a(parame, this.fUa, this);
      GMTrace.o(11293213851648L, 84141);
      return i;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11292945416192L, 84139);
    w.d("MicroMsg.emoji.NetSceneGetEmotionDonorList", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    paramq = (aaa)((b)paramq).gtD.gtK;
    if (paramq.tQA != null) {
      this.klL = n.a(paramq.tQA);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11292945416192L, 84139);
  }
  
  public final aaa arA()
  {
    GMTrace.i(11293348069376L, 84142);
    aaa localaaa = (aaa)this.fUa.gtD.gtK;
    GMTrace.o(11293348069376L, 84142);
    return localaaa;
  }
  
  public final int getType()
  {
    GMTrace.i(11293079633920L, 84140);
    GMTrace.o(11293079633920L, 84140);
    return 299;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */