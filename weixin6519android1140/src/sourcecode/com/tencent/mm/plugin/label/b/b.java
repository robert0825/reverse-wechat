package com.tencent.mm.plugin.label.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ov;
import com.tencent.mm.protocal.c.ow;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String muO;
  
  public b(String paramString)
  {
    GMTrace.i(7276077252608L, 54211);
    this.muO = null;
    b.a locala = new b.a();
    locala.gtF = new ov();
    locala.gtG = new ow();
    locala.uri = "/cgi-bin/micromsg-bin/delcontactlabel";
    locala.gtE = 636;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.muO = paramString;
    GMTrace.o(7276077252608L, 54211);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7276479905792L, 54214);
    this.fUd = parame1;
    ov localov = (ov)this.fUa.gtC.gtK;
    localov.ufB = this.muO;
    if ((this.muO != null) && (!bg.nm(this.muO)))
    {
      localov.ufB = this.muO;
      localov.ufB = this.muO;
      int i = a(parame, this.fUa, this);
      GMTrace.o(7276479905792L, 54214);
      return i;
    }
    w.e("MicroMsg.Label.NetSceneDelContactLabel", "cpan[doScene] label id list is null.");
    parame1.a(3, -1, "[doScene]empty label is list.", this);
    GMTrace.o(7276479905792L, 54214);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7276211470336L, 54212);
    w.d("MicroMsg.Label.NetSceneDelContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7276211470336L, 54212);
  }
  
  public final int getType()
  {
    GMTrace.i(7276345688064L, 54213);
    GMTrace.o(7276345688064L, 54213);
    return 636;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */