package com.tencent.mm.plugin.radar.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awx;
import com.tencent.mm.protocal.c.awy;
import com.tencent.mm.protocal.c.awz;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  int eHz;
  private float eMl;
  private float eNR;
  private int eNS;
  private int eNT;
  private String eNU;
  private String eNV;
  com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b()
  {
    this(2, 0.0F, 0.0F, 0, 0, "", "");
    GMTrace.i(8891521826816L, 66247);
    GMTrace.o(8891521826816L, 66247);
  }
  
  public b(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    GMTrace.i(8891387609088L, 66246);
    if (paramInt1 == 0)
    {
      w.e("MicroMsg.NetSceneRadarSearch", "opcode is wrong!");
      GMTrace.o(8891387609088L, 66246);
      return;
    }
    this.eHz = paramInt1;
    this.eNV = paramString2;
    this.eNT = paramInt3;
    this.eMl = paramFloat1;
    this.eNR = paramFloat2;
    this.eNU = paramString1;
    this.eNS = paramInt2;
    GMTrace.o(8891387609088L, 66246);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8891924480000L, 66250);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new awy();
    parame1.gtG = new awz();
    parame1.uri = "/cgi-bin/micromsg-bin/mmradarsearch";
    parame1.gtE = 425;
    parame1.gtH = 209;
    parame1.gtI = 1000000209;
    this.fUa = parame1.DA();
    parame1 = (awy)this.fUa.gtC.gtK;
    parame1.tMX = this.eHz;
    parame1.ujd = this.eNV;
    parame1.uje = this.eNT;
    parame1.tYz = this.eMl;
    parame1.tYy = this.eNR;
    parame1.ujc = this.eNU;
    parame1.ujb = this.eNS;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8891924480000L, 66250);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8891656044544L, 66248);
    w.d("MicroMsg.NetSceneRadarSearch", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((this.eHz == 1) && (paramInt2 == 0))
    {
      paramq = new ArrayList();
      paramArrayOfByte = (awz)this.fUa.gtD.gtK;
      paramInt1 = 0;
      if (paramInt1 < paramArrayOfByte.tPE.size())
      {
        awx localawx = (awx)paramArrayOfByte.tPE.get(paramInt1);
        h localh = new h();
        if (localawx.jhi != null) {}
        for (localh.username = localawx.jhi;; localh.username = localawx.ujf)
        {
          localh.gsT = ((awx)paramArrayOfByte.tPE.get(paramInt1)).uhb;
          localh.bi(true);
          paramq.add(localh);
          paramInt1 += 1;
          break;
        }
      }
      n.Di().A(paramq);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8891656044544L, 66248);
  }
  
  public final int aZF()
  {
    GMTrace.i(8892058697728L, 66251);
    int i = ((awz)this.fUa.gtD.gtK).jNj;
    GMTrace.o(8892058697728L, 66251);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(8891790262272L, 66249);
    GMTrace.o(8891790262272L, 66249);
    return 425;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */