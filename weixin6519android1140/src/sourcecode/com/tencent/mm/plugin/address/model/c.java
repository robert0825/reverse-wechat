package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.axb;
import com.tencent.mm.protocal.c.axc;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.axg;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(com.tencent.mm.plugin.address.d.b paramb)
  {
    GMTrace.i(12788936212480L, 95285);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axb();
    ((b.a)localObject).gtG = new axc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoadd";
    ((b.a)localObject).gtE = 415;
    ((b.a)localObject).gtH = 200;
    ((b.a)localObject).gtI = 1000000200;
    this.fUa = ((b.a)localObject).DA();
    localObject = (axb)this.fUa.gtC.gtK;
    ((axb)localObject).uLV = new axg();
    ((axb)localObject).uLV.uMc = new azq().Rq(bg.aq(paramb.huE, ""));
    ((axb)localObject).uLV.uMa = new azq().Rq(bg.aq(paramb.huC, ""));
    ((axb)localObject).uLV.uMf = new azq().Rq(bg.aq(paramb.huH, ""));
    ((axb)localObject).uLV.uMd = new azq().Rq(bg.aq(paramb.huF, ""));
    ((axb)localObject).uLV.uMg = new azq().Rq(bg.aq(paramb.huI, ""));
    ((axb)localObject).uLV.uMh = new azq().Rq(bg.aq(paramb.huJ, ""));
    ((axb)localObject).uLV.uMb = new azq().Rq(bg.aq(paramb.huD, ""));
    ((axb)localObject).uLV.uMe = new azq().Rq(bg.aq(paramb.huG, ""));
    ((axb)localObject).uLV.uMi = new azq().Rq(bg.aq(paramb.huK, ""));
    GMTrace.o(12788936212480L, 95285);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12789338865664L, 95288);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12789338865664L, 95288);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12789070430208L, 95286);
    w.d("MicroMsg.NetSceneRcptInfoAdd", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (axc)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      if (paramq.uLW.uLZ != null)
      {
        w.d("MicroMsg.NetSceneRcptInfoAdd", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.uLW.uLZ.size());
        a.QM();
        a.QO().q(paramq.uLW.uLZ);
        a.QM();
        a.QO().QQ();
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12789070430208L, 95286);
  }
  
  public final int getType()
  {
    GMTrace.i(12789204647936L, 95287);
    GMTrace.o(12789204647936L, 95287);
    return 415;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */