package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aaj;
import com.tencent.mm.protocal.c.aak;
import com.tencent.mm.sdk.platformtools.w;

public final class ag
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ag()
  {
    GMTrace.i(6266223067136L, 46687);
    this.fUd = null;
    b.a locala = new b.a();
    locala.gtF = new aaj();
    locala.gtG = new aak();
    locala.uri = "/cgi-bin/micromsg-bin/getfavinfo";
    locala.gtE = 438;
    locala.gtH = 217;
    locala.gtI = 1000000217;
    this.fUa = locala.DA();
    GMTrace.o(6266223067136L, 46687);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6266357284864L, 46688);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6266357284864L, 46688);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6266491502592L, 46689);
    w.d("MicroMsg.NetSceneGetFavInfo", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aak)((b)paramq).gtD.gtK;
      w.v("MicroMsg.NetSceneGetFavInfo", "used:%d  total:%d  mxDown:%d  mxUp:%d  mxFile:%d", new Object[] { Long.valueOf(paramq.tPT), Long.valueOf(paramq.jhz), Integer.valueOf(paramq.urc), Integer.valueOf(paramq.urb), Integer.valueOf(paramq.ura) });
      x.cn(paramq.tPT);
      x.co(paramq.jhz);
      x.cp(paramq.urc);
      x.cq(paramq.urb);
      x.cr(paramq.ura);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6266491502592L, 46689);
  }
  
  public final int getType()
  {
    GMTrace.i(6266625720320L, 46690);
    GMTrace.o(6266625720320L, 46690);
    return 438;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */