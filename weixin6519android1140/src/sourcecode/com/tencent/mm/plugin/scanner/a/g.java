package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.hn;
import com.tencent.mm.protocal.c.ho;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  private int gsL;
  private int offset;
  private byte[] otf;
  private int otg;
  private int otj;
  
  public g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(6050803613696L, 45082);
    this.otg = 1;
    this.otf = paramArrayOfByte;
    this.otg = 1;
    this.gsL = paramInt1;
    this.offset = 0;
    this.otj = paramInt2;
    GMTrace.o(6050803613696L, 45082);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6050937831424L, 45083);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new hn();
    parame1.gtG = new ho();
    parame1.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanimg";
    parame1.gtE = 1062;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (hn)this.fUa.gtC.gtK;
    parame1.tWr = ((int)bg.Pv() & 0x7FFFFFFF);
    parame1.tWs = new azp().be(this.otf);
    parame1.tWt = this.gsL;
    parame1.tWu = this.offset;
    if (this.offset + this.otf.length < this.gsL) {}
    for (parame1.tTL = 0;; parame1.tTL = 1)
    {
      parame1.tWv = this.otg;
      parame1.tWw = this.otj;
      int i = a(parame, this.fUa, this);
      GMTrace.o(6050937831424L, 45083);
      return i;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6051072049152L, 45084);
    paramq = (hn)((b)paramq).gtC.gtK;
    if ((paramq.tWr <= 0) || (paramq.tWv < 0) || (paramq.tWs == null) || (paramq.tWs.uNN <= 0) || (paramq.tWt <= 0) || (paramq.tWu < 0) || (paramq.tWu + paramq.tWs.uNN > paramq.tWt))
    {
      w.e("MicroMsg.scanner.NetSceneScanImage", "ERR: Security Check Failed, imageType = %s, totalLen = %s, offset = %s", new Object[] { Integer.valueOf(paramq.tWv), Integer.valueOf(paramq.tWt), Integer.valueOf(paramq.tWu) });
      if (paramq.tWs != null) {
        w.e("MicroMsg.scanner.NetSceneScanImage", "buffer length = %s", new Object[] { Integer.valueOf(paramq.tWs.uNN) });
      }
      i = k.b.gun;
      GMTrace.o(6051072049152L, 45084);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(6051072049152L, 45084);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6051206266880L, 45085);
    w.d("MicroMsg.scanner.NetSceneScanImage", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6051206266880L, 45085);
  }
  
  public final int getType()
  {
    GMTrace.i(6051340484608L, 45086);
    GMTrace.o(6051340484608L, 45086);
    return 1062;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */