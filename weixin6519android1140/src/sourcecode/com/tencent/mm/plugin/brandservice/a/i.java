package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bav;
import com.tencent.mm.protocal.c.baw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eBj;
  private com.tencent.mm.ad.e fUd;
  private b jtc;
  private long jte;
  public baw jtf;
  private int scene;
  
  public i(String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(10843450245120L, 80790);
    this.eBj = paramString;
    this.jte = paramLong;
    this.scene = paramInt;
    w.i("MicroMsg.NetSceneSearchHomePageNew", "Constructors: keyword (%s) , businessType (%d), scene (%d)", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    GMTrace.o(10843450245120L, 80790);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10843852898304L, 80793);
    w.i("MicroMsg.NetSceneSearchHomePageNew", "doScene");
    this.fUd = parame1;
    if (!bg.nm(this.eBj))
    {
      parame1 = new b.a();
      parame1.gtE = 1070;
      parame1.uri = "/cgi-bin/mmbiz-bin/bizsearch/homepage";
      parame1.gtF = new bav();
      parame1.gtG = new baw();
      parame1.gtH = 0;
      parame1.gtI = 0;
      this.jtc = parame1.DA();
      parame1 = (bav)this.jtc.gtC.gtK;
      parame1.uqq = this.eBj;
      parame1.uBS = c.CO();
      parame1.tXu = this.jte;
      parame1.uOj = this.scene;
      w.i("MicroMsg.NetSceneSearchHomePageNew", "businessTypeList is %d", new Object[] { Long.valueOf(this.jte) });
      int i = a(parame, this.jtc, this);
      GMTrace.o(10843852898304L, 80793);
      return i;
    }
    w.e("MicroMsg.NetSceneSearchHomePageNew", "keyword is unavailable");
    GMTrace.o(10843852898304L, 80793);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10843584462848L, 80791);
    w.i("MicroMsg.NetSceneSearchHomePageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (this.jtc != null)) {
      this.jtf = ((baw)this.jtc.gtD.gtK);
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10843584462848L, 80791);
  }
  
  public final int getType()
  {
    GMTrace.i(10843718680576L, 80792);
    GMTrace.o(10843718680576L, 80792);
    return 1070;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */