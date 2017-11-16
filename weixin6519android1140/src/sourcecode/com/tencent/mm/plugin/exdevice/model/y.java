package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkp;
import com.tencent.mm.protocal.c.bkq;

public final class y
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eEl;
  private String esG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String fsF;
  private int kAa;
  
  public y(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10944918847488L, 81546);
    this.fsF = paramString3;
    this.esG = paramString1;
    this.eEl = paramString2;
    this.kAa = 0;
    GMTrace.o(10944918847488L, 81546);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10945187282944L, 81548);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new bkp();
    parame1.gtG = new bkq();
    parame1.uri = "/cgi-bin/mmoc-bin/hardware/updatemydeviceattr";
    parame1.gtE = 1263;
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (bkp)this.fUa.gtC.gtK;
    parame1.fsF = this.fsF;
    parame1.nAQ = this.esG;
    parame1.devicetype = this.eEl;
    parame1.uVi = this.kAa;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10945187282944L, 81548);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10945321500672L, 81549);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10945321500672L, 81549);
  }
  
  public final int getType()
  {
    GMTrace.i(10945053065216L, 81547);
    GMTrace.o(10945053065216L, 81547);
    return 1263;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */