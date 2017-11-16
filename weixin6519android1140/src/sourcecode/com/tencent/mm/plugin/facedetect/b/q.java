package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.protocal.c.bib;
import com.tencent.mm.protocal.c.bic;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public boolean kSc;
  public boolean kSd;
  
  public q(int paramInt)
  {
    GMTrace.i(5933765754880L, 44210);
    this.kSc = false;
    this.kSd = false;
    b.a locala = new b.a();
    locala.gtF = new bib();
    locala.gtG = new bic();
    locala.uri = "/cgi-bin/micromsg-bin/switchopface";
    locala.gtE = 938;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((bib)this.fUa.gtC.gtK).tMX = paramInt;
    GMTrace.o(5933765754880L, 44210);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5934034190336L, 44212);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5934034190336L, 44212);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5934168408064L, 44213);
    paramq = (bic)((b)paramq).gtD.gtK;
    this.kSc = paramq.uTH;
    this.kSd = paramq.uTI;
    w.i("MicroMsg.NetSceneFaceSwitchOpFace", "hy: NetSceneFaceSwitchOpFace errType: %d, errCode: %d, errMsg: %s, hasBio: %b, isOpen: %b", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Boolean.valueOf(this.kSc), Boolean.valueOf(this.kSd) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5934168408064L, 44213);
  }
  
  public final int getType()
  {
    GMTrace.i(15372224823296L, 114532);
    GMTrace.o(15372224823296L, 114532);
    return 938;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */