package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gv;
import com.tencent.mm.protocal.c.gw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String fKP;
  com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private a<p> gxx;
  
  private p(String paramString1, String paramString2)
  {
    GMTrace.i(4523137433600L, 33700);
    this.fKP = paramString1;
    w.i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] NetSceneBizAttrSync (%s)", new Object[] { paramString1 });
    paramString1 = new b.a();
    paramString1.gtE = 1075;
    paramString1.uri = "/cgi-bin/mmbiz-bin/bizattr/bizattrsync";
    paramString1.gtF = new gv();
    paramString1.gtG = new gw();
    paramString1.gtH = 0;
    paramString1.gtI = 0;
    this.fUa = paramString1.DA();
    paramString1 = (gv)this.fUa.gtC.gtK;
    paramString1.tVK = this.fKP;
    paramString1.tVL = new com.tencent.mm.bm.b(bg.St(bg.nl(paramString2)));
    GMTrace.o(4523137433600L, 33700);
  }
  
  public p(String paramString1, String paramString2, a<p> parama)
  {
    this(paramString1, paramString2);
    GMTrace.i(4523003215872L, 33699);
    this.gxx = parama;
    GMTrace.o(4523003215872L, 33699);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4523540086784L, 33703);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4523540086784L, 33703);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4523271651328L, 33701);
    w.i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.gxx != null) {
      this.gxx.b(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4523271651328L, 33701);
  }
  
  public final int getType()
  {
    GMTrace.i(4523405869056L, 33702);
    GMTrace.o(4523405869056L, 33702);
    return 1075;
  }
  
  public static abstract interface a<T extends com.tencent.mm.ad.k>
  {
    public abstract void b(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */