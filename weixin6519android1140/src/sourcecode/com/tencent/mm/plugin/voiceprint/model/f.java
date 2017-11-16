package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ayf;
import com.tencent.mm.protocal.c.ayg;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnw;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private String filename;
  public boolean qBP;
  private boolean qBQ;
  private Handler qBR;
  int qBS;
  private int qBT;
  int qBU;
  int qBV;
  private int vq;
  
  public f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(12491107074048L, 93066);
    this.vq = 0;
    this.qBP = false;
    this.qBQ = false;
    this.qBR = null;
    this.qBS = 0;
    this.qBT = 0;
    this.qBU = 0;
    this.qBV = 0;
    w.d("MicroMsg.NetSceneRegisterVoicePrint", "step %d resid %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.qBU = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayf();
    ((b.a)localObject).gtG = new ayg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registervoiceprint";
    ((b.a)localObject).gtE = 612;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ayf)this.fUa.gtC.gtK;
    this.filename = paramString;
    this.vq = 0;
    ((ayf)localObject).uMG = paramInt2;
    ((ayf)localObject).jhZ = paramInt1;
    this.qBS = paramInt3;
    ((ayf)localObject).uME = paramInt3;
    w.i("MicroMsg.NetSceneRegisterVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.qBP = true;
    btb();
    GMTrace.o(12491107074048L, 93066);
  }
  
  private int btb()
  {
    GMTrace.i(12491643944960L, 93070);
    ayf localayf = (ayf)this.fUa.gtC.gtK;
    bnw localbnw = new bnw();
    new g();
    localayf.uMF = localbnw;
    Object localObject = new l(m.aA(this.filename, false));
    int i = com.tencent.mm.a.e.aY(m.aA(this.filename, false));
    if (i - this.vq >= 6000) {}
    for (localObject = ((l)localObject).bd(this.vq, 6000);; localObject = ((l)localObject).bd(this.vq, i - this.vq))
    {
      w.d("MicroMsg.NetSceneRegisterVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.vq), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).eyw), Integer.valueOf(i), Boolean.valueOf(this.qBP) });
      if (((g)localObject).eyw != 0) {
        break;
      }
      GMTrace.o(12491643944960L, 93070);
      return -2;
    }
    if (((g)localObject).ret < 0)
    {
      w.w("MicroMsg.NetSceneRegisterVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
      GMTrace.o(12491643944960L, 93070);
      return -1;
    }
    if (this.vq >= 469000)
    {
      w.i("MicroMsg.NetSceneRegisterVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.vq) });
      GMTrace.o(12491643944960L, 93070);
      return -1;
    }
    localbnw.uXI = new azp().be(((g)localObject).buf);
    localbnw.tRD = this.vq;
    localbnw.uXG = ((g)localObject).eyw;
    localbnw.uXH = 0;
    localayf.uME = this.qBS;
    if (this.qBP)
    {
      int j = com.tencent.mm.a.e.aY(m.aA(this.filename, false));
      if (((g)localObject).hcV >= j)
      {
        localbnw.uXH = 1;
        this.qBQ = true;
        w.i("MicroMsg.NetSceneRegisterVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
      }
    }
    this.vq = ((g)localObject).hcV;
    localayf.uMF = localbnw;
    GMTrace.o(12491643944960L, 93070);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12491509727232L, 93069);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12491509727232L, 93069);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(12491241291776L, 93067);
    int i = k.b.gum;
    GMTrace.o(12491241291776L, 93067);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12491912380416L, 93072);
    w.d("MicroMsg.NetSceneRegisterVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (ayg)((b)paramq).gtD.gtK;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12491912380416L, 93072);
      return;
    }
    w.i("MicroMsg.NetSceneRegisterVoicePrint", "voice ticket %d ret %d nextstep %d %d ", new Object[] { Integer.valueOf(paramq.uME), Integer.valueOf(paramq.uMH), Integer.valueOf(paramq.uMI), Integer.valueOf(paramq.uMH) });
    this.qBS = paramq.uME;
    this.qBT = paramq.uMI;
    this.qBV = paramq.uMH;
    if (this.qBQ)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12491912380416L, 93072);
      return;
    }
    w.i("MicroMsg.NetSceneRegisterVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(btb()) });
    a(this.gtW, this.fUd);
    w.i("MicroMsg.NetSceneRegisterVoicePrint", "loop doscene");
    GMTrace.o(12491912380416L, 93072);
  }
  
  public final int getType()
  {
    GMTrace.i(12491778162688L, 93071);
    GMTrace.o(12491778162688L, 93071);
    return 612;
  }
  
  protected final int vB()
  {
    GMTrace.i(12491375509504L, 93068);
    GMTrace.o(12491375509504L, 93068);
    return 240;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */