package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.axg;
import com.tencent.mm.protocal.c.axn;
import com.tencent.mm.protocal.c.axo;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public h(com.tencent.mm.plugin.address.d.b paramb)
  {
    GMTrace.i(12793365397504L, 95318);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axn();
    ((b.a)localObject).gtG = new axo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoupdate";
    ((b.a)localObject).gtE = 418;
    ((b.a)localObject).gtH = 203;
    ((b.a)localObject).gtI = 1000000203;
    this.fUa = ((b.a)localObject).DA();
    localObject = (axn)this.fUa.gtC.gtK;
    ((axn)localObject).uLV = new axg();
    ((axn)localObject).uLV.id = paramb.id;
    ((axn)localObject).uLV.uMc = new azq().Rq(bg.aq(paramb.huE, ""));
    ((axn)localObject).uLV.uMa = new azq().Rq(bg.aq(paramb.huC, ""));
    ((axn)localObject).uLV.uMf = new azq().Rq(bg.aq(paramb.huH, ""));
    ((axn)localObject).uLV.uMd = new azq().Rq(bg.aq(paramb.huF, ""));
    ((axn)localObject).uLV.uMg = new azq().Rq(bg.aq(paramb.huI, ""));
    ((axn)localObject).uLV.uMh = new azq().Rq(bg.aq(paramb.huJ, ""));
    ((axn)localObject).uLV.uMb = new azq().Rq(bg.aq(paramb.huD, ""));
    ((axn)localObject).uLV.uMe = new azq().Rq(bg.aq(paramb.huG, ""));
    ((axn)localObject).uLV.uMi = new azq().Rq(bg.aq(paramb.huK, ""));
    GMTrace.o(12793365397504L, 95318);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12793768050688L, 95321);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12793768050688L, 95321);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12793499615232L, 95319);
    w.d("MicroMsg.NetSceneRcptInfoUpdate", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (axo)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      if (paramq.uLW.uLZ != null)
      {
        w.d("MicroMsg.NetSceneRcptInfoUpdate", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.uLW.uLZ.size());
        a.QM();
        a.QO().q(paramq.uLW.uLZ);
        a.QM();
        a.QO().QQ();
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12793499615232L, 95319);
  }
  
  public final int getType()
  {
    GMTrace.i(12793633832960L, 95320);
    GMTrace.o(12793633832960L, 95320);
    return 418;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */