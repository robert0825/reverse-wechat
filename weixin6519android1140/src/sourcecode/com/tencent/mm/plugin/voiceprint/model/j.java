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
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bno;
import com.tencent.mm.protocal.c.bnp;
import com.tencent.mm.protocal.c.bnw;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private String filename;
  public boolean qBP;
  private boolean qBQ;
  private Handler qBR;
  private int qBS;
  int qBV;
  private String qBY;
  private int vq;
  
  public j(String paramString, int paramInt)
  {
    GMTrace.i(12499965444096L, 93132);
    this.vq = 0;
    this.qBP = false;
    this.qBQ = false;
    this.qBR = null;
    this.qBS = 0;
    this.qBV = 0;
    this.qBY = "";
    w.d("MicroMsg.NetSceneVerifyVoicePrint", "resid %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bno();
    ((b.a)localObject).gtG = new bnp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyvoiceprint";
    ((b.a)localObject).gtE = 613;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bno)this.fUa.gtC.gtK;
    this.filename = paramString;
    this.vq = 0;
    ((bno)localObject).uMG = paramInt;
    this.qBS = 0;
    ((bno)localObject).uME = 0;
    w.i("MicroMsg.NetSceneVerifyVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) });
    this.qBP = true;
    btb();
    GMTrace.o(12499965444096L, 93132);
  }
  
  private int btb()
  {
    GMTrace.i(12500502315008L, 93136);
    bno localbno = (bno)this.fUa.gtC.gtK;
    bnw localbnw = new bnw();
    new g();
    localbno.uXz = localbnw;
    Object localObject = new l(m.aA(this.filename, false));
    int i = com.tencent.mm.a.e.aY(m.aA(this.filename, false));
    if (i - this.vq >= 6000) {}
    for (localObject = ((l)localObject).bd(this.vq, 6000);; localObject = ((l)localObject).bd(this.vq, i - this.vq))
    {
      w.d("MicroMsg.NetSceneVerifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.vq), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).eyw), Integer.valueOf(i), Boolean.valueOf(this.qBP) });
      if (((g)localObject).eyw != 0) {
        break;
      }
      GMTrace.o(12500502315008L, 93136);
      return -2;
    }
    if (((g)localObject).ret < 0)
    {
      w.w("MicroMsg.NetSceneVerifyVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
      GMTrace.o(12500502315008L, 93136);
      return -1;
    }
    if (this.vq >= 469000)
    {
      w.i("MicroMsg.NetSceneVerifyVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.vq) });
      GMTrace.o(12500502315008L, 93136);
      return -1;
    }
    localbnw.uXI = new azp().be(((g)localObject).buf);
    localbnw.tRD = this.vq;
    localbnw.uXG = ((g)localObject).eyw;
    localbnw.uXH = 0;
    localbno.uME = this.qBS;
    if (this.qBP)
    {
      int j = com.tencent.mm.a.e.aY(m.aA(this.filename, false));
      if (((g)localObject).hcV >= j)
      {
        localbnw.uXH = 1;
        this.qBQ = true;
        w.i("MicroMsg.NetSceneVerifyVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
      }
    }
    this.vq = ((g)localObject).hcV;
    localbno.uXz = localbnw;
    GMTrace.o(12500502315008L, 93136);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12500368097280L, 93135);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12500368097280L, 93135);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(12500099661824L, 93133);
    int i = k.b.gum;
    GMTrace.o(12500099661824L, 93133);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12500770750464L, 93138);
    w.d("MicroMsg.NetSceneVerifyVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (bnp)((b)paramq).gtD.gtK;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12500770750464L, 93138);
      return;
    }
    this.qBS = paramq.uME;
    this.qBV = paramq.ucS;
    w.i("MicroMsg.NetSceneVerifyVoicePrint", "voice VoiceTicket %d mResult %d", new Object[] { Integer.valueOf(paramq.uME), Integer.valueOf(this.qBV) });
    if (this.qBQ)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12500770750464L, 93138);
      return;
    }
    w.i("MicroMsg.NetSceneVerifyVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(btb()) });
    a(this.gtW, this.fUd);
    w.i("MicroMsg.NetSceneVerifyVoicePrint", "loop doscene");
    GMTrace.o(12500770750464L, 93138);
  }
  
  public final int getType()
  {
    GMTrace.i(12500636532736L, 93137);
    GMTrace.o(12500636532736L, 93137);
    return 613;
  }
  
  protected final int vB()
  {
    GMTrace.i(12500233879552L, 93134);
    GMTrace.o(12500233879552L, 93134);
    return 240;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */