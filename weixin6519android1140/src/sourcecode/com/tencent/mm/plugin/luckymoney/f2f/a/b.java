package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.axp;
import com.tencent.mm.protocal.c.so;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eDB;
  public int eYn;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gUL;
  public int mFA;
  private so mFp;
  private sp mFq;
  public String mFr;
  public int mFs;
  public String mFt;
  public int mFu;
  public axp mFv;
  public int mFw;
  public String mFx;
  public String mFy;
  public String mFz;
  
  public b(String paramString)
  {
    GMTrace.i(9747830931456L, 72627);
    b.a locala = new b.a();
    locala.gtF = new so();
    locala.gtG = new sp();
    locala.gtE = 1997;
    locala.gtH = 0;
    locala.gtI = 0;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/ffopenwxhb";
    this.gUL = locala.DA();
    this.mFp = ((so)this.gUL.gtC.gtK);
    this.mFp.kBQ = paramString;
    paramString = h.byp();
    if (paramString != null)
    {
      this.mFp.fjl = paramString.fjl;
      this.mFp.fjk = paramString.fjk;
      this.mFp.uiE = paramString.tOR;
      this.mFp.uiF = paramString.tOS;
      this.mFp.uiG = paramString.tOQ;
      this.mFp.uiH = paramString.latitude;
      this.mFp.uiI = paramString.longitude;
    }
    GMTrace.o(9747830931456L, 72627);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9748233584640L, 72630);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(9748233584640L, 72630);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9747965149184L, 72628);
    this.mFq = ((sp)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("NetSceneF2FLuckyMoneyOpen", "errType %d, retCode %d, retMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.mFq.jWs), this.mFq.jWt });
    this.mFr = this.mFq.mFr;
    this.eYn = this.mFq.eYn;
    this.mFs = this.mFq.eYo;
    this.eDB = this.mFq.eDB;
    this.mFt = this.mFq.mIB;
    this.mFu = this.mFq.mFu;
    this.mFv = this.mFq.uiJ;
    this.mFw = this.mFq.mFw;
    this.mFx = this.mFq.mFx;
    this.mFy = this.mFq.mFy;
    this.mFz = this.mFq.mFz;
    this.mFA = this.mFq.mFA;
    if (this.fUd != null) {
      this.fUd.a(paramInt2, this.mFq.jWs, this.mFq.jWt, this);
    }
    GMTrace.o(9747965149184L, 72628);
  }
  
  public final int getType()
  {
    GMTrace.i(15406047690752L, 114784);
    GMTrace.o(15406047690752L, 114784);
    return 1997;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */