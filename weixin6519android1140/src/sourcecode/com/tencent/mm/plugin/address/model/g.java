package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.axl;
import com.tencent.mm.protocal.c.axm;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public g(int paramInt)
  {
    GMTrace.i(12789473083392L, 95289);
    b.a locala = new b.a();
    locala.gtF = new axl();
    locala.gtG = new axm();
    locala.uri = "/cgi-bin/micromsg-bin/rcptinfotouch";
    locala.gtE = 419;
    locala.gtH = 204;
    locala.gtI = 1000000204;
    this.fUa = locala.DA();
    ((axl)this.fUa.gtC.gtK).id = paramInt;
    GMTrace.o(12789473083392L, 95289);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12789875736576L, 95292);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12789875736576L, 95292);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12789607301120L, 95290);
    w.d("MicroMsg.NetSceneRcptInfoTouch", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (axm)((b)paramq).gtD.gtK;
      if (paramq.uLW.uLZ != null)
      {
        w.d("MicroMsg.NetSceneRcptInfoTouch", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.uLW.uLZ.size());
        a.QM();
        a.QO().q(paramq.uLW.uLZ);
        a.QM();
        a.QO().QQ();
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12789607301120L, 95290);
  }
  
  public final int getType()
  {
    GMTrace.i(12789741518848L, 95291);
    GMTrace.o(12789741518848L, 95291);
    return 419;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */