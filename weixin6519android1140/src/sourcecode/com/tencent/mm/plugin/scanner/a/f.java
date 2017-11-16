package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hl;
import com.tencent.mm.protocal.c.hm;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eDg;
  public int eDh;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public boolean otk;
  
  public f(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    GMTrace.i(6051877355520L, 45090);
    this.otk = false;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new hl();
    ((b.a)localObject).gtG = new hm();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
    ((b.a)localObject).gtE = 1061;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (hl)this.fUa.gtC.gtK;
    ((hl)localObject).jib = paramInt1;
    ((hl)localObject).tWq = paramString;
    ((hl)localObject).tOG = 1;
    this.eDg = paramInt2;
    this.eDh = paramInt3;
    w.d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, type: %s, barcode: %s, scene: %s, codetype: %s, codeVersion: %s", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(6051877355520L, 45090);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6052011573248L, 45091);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6052011573248L, 45091);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6052145790976L, 45092);
    paramq = (hl)((b)paramq).gtC.gtK;
    if ((paramq.jib < 0) || (paramq.tWq == null) || (paramq.tWq.length() <= 0))
    {
      w.e("MicroMsg.scanner.NetSceneScanBarcode", "securityVerificationChecked failed, Type = " + paramq.jib + ", Barcode = %s" + paramq.tWq);
      i = k.b.gun;
      GMTrace.o(6052145790976L, 45092);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(6052145790976L, 45092);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6052414226432L, 45094);
    w.d("MicroMsg.scanner.NetSceneScanBarcode", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6052414226432L, 45094);
  }
  
  public final hm bcp()
  {
    GMTrace.i(6052280008704L, 45093);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      hm localhm = (hm)this.fUa.gtD.gtK;
      GMTrace.o(6052280008704L, 45093);
      return localhm;
    }
    GMTrace.o(6052280008704L, 45093);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(6052548444160L, 45095);
    GMTrace.o(6052548444160L, 45095);
    return 1061;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */