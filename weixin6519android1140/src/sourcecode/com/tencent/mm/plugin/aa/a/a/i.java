package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.n;
import com.tencent.mm.protocal.c.o;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private n hpp;
  public o hpq;
  
  public i(String paramString1, long paramLong, int paramInt, String paramString2)
  {
    GMTrace.i(5598624088064L, 41713);
    b.a locala = new b.a();
    locala.gtF = new n();
    locala.gtG = new o();
    locala.gtE = 1629;
    locala.uri = "/cgi-bin/mmpay-bin/newaapay";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.hpp = ((n)this.gUL.gtC.gtK);
    this.hpp.tLZ = paramString1;
    this.hpp.tMs = paramLong;
    this.hpp.scene = paramInt;
    this.hpp.tMa = paramString2;
    w.i("MicroMsg.NetSceneAAPay", "NetSceneAAPay, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s", new Object[] { this.hpp.tLZ, Long.valueOf(this.hpp.tMs), Integer.valueOf(this.hpp.scene), this.hpp.tMa });
    GMTrace.o(5598624088064L, 41713);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5598892523520L, 41715);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5598892523520L, 41715);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5599026741248L, 41716);
    w.i("MicroMsg.NetSceneAAPay", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.hpq = ((o)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneAAPay", "retcode: %s, retmsg: %s, paymsgid:%s", new Object[] { Integer.valueOf(this.hpq.jWs), this.hpq.jWt, this.hpq.eRf });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5599026741248L, 41716);
  }
  
  public final int getType()
  {
    GMTrace.i(5598758305792L, 41714);
    GMTrace.o(5598758305792L, 41714);
    return 1629;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */