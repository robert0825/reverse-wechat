package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.axj;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int hun;
  
  public f(int paramInt)
  {
    GMTrace.i(12788399341568L, 95281);
    this.hun = 0;
    b.a locala = new b.a();
    locala.gtF = new axj();
    locala.gtG = new axk();
    locala.uri = "/cgi-bin/micromsg-bin/rcptinforemove";
    locala.gtE = 416;
    locala.gtH = 201;
    locala.gtI = 1000000201;
    this.fUa = locala.DA();
    this.hun = paramInt;
    w.d("MicroMsg.NetSceneRcptInfoRemove", "remove Id " + paramInt);
    ((axj)this.fUa.gtC.gtK).id = paramInt;
    GMTrace.o(12788399341568L, 95281);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12788801994752L, 95284);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12788801994752L, 95284);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12788533559296L, 95282);
    w.d("MicroMsg.NetSceneRcptInfoRemove", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (axk)((b)paramq).gtD.gtK;
      if (paramq.uLW.uLZ != null)
      {
        w.d("MicroMsg.NetSceneRcptInfoRemove", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.uLW.uLZ.size());
        a.QM();
        a.QO().q(paramq.uLW.uLZ);
        a.QM();
        a.QO().QQ();
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12788533559296L, 95282);
  }
  
  public final int getType()
  {
    GMTrace.i(12788667777024L, 95283);
    GMTrace.o(12788667777024L, 95283);
    return 416;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */