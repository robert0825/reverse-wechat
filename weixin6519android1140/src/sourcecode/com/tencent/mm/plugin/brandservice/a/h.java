package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bal;
import com.tencent.mm.protocal.c.bam;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eBj;
  private com.tencent.mm.ad.e fUd;
  private String hSv;
  private b jtc;
  private bam jtd;
  private long jte;
  private int offset;
  private int scene;
  
  public h(String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(10843987116032L, 80794);
    this.eBj = paramString1;
    this.jte = paramLong;
    this.offset = paramInt1;
    this.scene = paramInt2;
    this.hSv = paramString2;
    w.i("MicroMsg.NetSceneSearchDetailPageNew", "Constructors: keyword = (%s) , LSB exist () , businessType is (%d) , offset is (%d) , scene is (%d), searchId(%s).", new Object[] { paramString1, Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    GMTrace.o(10843987116032L, 80794);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10844389769216L, 80797);
    this.fUd = parame1;
    if (!bg.nm(this.eBj))
    {
      parame1 = new b.a();
      parame1.gtE = 1071;
      parame1.uri = "/cgi-bin/mmbiz-bin/bizsearch/detailpage";
      parame1.gtF = new bal();
      parame1.gtG = new bam();
      parame1.gtH = 0;
      parame1.gtI = 0;
      this.jtc = parame1.DA();
      parame1 = (bal)this.jtc.gtC.gtK;
      parame1.uBS = c.CO();
      parame1.uqq = this.eBj;
      parame1.tXu = this.jte;
      parame1.tWu = this.offset;
      parame1.uOj = this.scene;
      parame1.tXx = this.hSv;
      int i = a(parame, this.jtc, this);
      GMTrace.o(10844389769216L, 80797);
      return i;
    }
    w.e("MicroMsg.NetSceneSearchDetailPageNew", "keyword is unavailable.");
    GMTrace.o(10844389769216L, 80797);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10844121333760L, 80795);
    w.i("MicroMsg.NetSceneSearchDetailPageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (this.jtc != null)) {
      this.jtd = ((bam)this.jtc.gtD.gtK);
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10844121333760L, 80795);
  }
  
  public final in aif()
  {
    GMTrace.i(10844523986944L, 80798);
    if (this.jtd == null)
    {
      GMTrace.o(10844523986944L, 80798);
      return null;
    }
    in localin = this.jtd.uOl;
    GMTrace.o(10844523986944L, 80798);
    return localin;
  }
  
  public final int getType()
  {
    GMTrace.i(10844255551488L, 80796);
    GMTrace.o(10844255551488L, 80796);
    return 1071;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */