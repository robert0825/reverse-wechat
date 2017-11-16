package com.tencent.mm.plugin.wear.model.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bsz;
import com.tencent.mm.protocal.c.bta;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bc;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gMj;
  
  public b(String paramString)
  {
    GMTrace.i(9182103207936L, 68412);
    Object localObject = new b.a();
    ((b.a)localObject).gtE = 976;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendyo";
    ((b.a)localObject).gtF = new bsz();
    ((b.a)localObject).gtG = new bta();
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gMj = ((b.a)localObject).DA();
    localObject = (bsz)this.gMj.gtC.gtK;
    ((bsz)localObject).lSX = paramString;
    ((bsz)localObject).uEe = ((bsz)localObject).nFd;
    ((bsz)localObject).nFd = ((int)bc.gR(paramString));
    ((bsz)localObject).jib = 63;
    ((bsz)localObject).vbR = 1;
    ((bsz)localObject).jhc = 1;
    GMTrace.o(9182103207936L, 68412);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9182505861120L, 68415);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(9182505861120L, 68415);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9182237425664L, 68413);
    w.i("MicroMsg.Wear.NetSceneSendYo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9182237425664L, 68413);
  }
  
  public final int getType()
  {
    GMTrace.i(9182371643392L, 68414);
    GMTrace.o(9182371643392L, 68414);
    return 976;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */