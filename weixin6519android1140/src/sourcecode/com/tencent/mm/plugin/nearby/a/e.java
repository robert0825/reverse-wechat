package com.tencent.mm.plugin.nearby.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alo;
import com.tencent.mm.protocal.c.alp;
import com.tencent.mm.protocal.c.alq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public e(String paramString)
  {
    GMTrace.i(6676795097088L, 49746);
    b.a locala = new b.a();
    locala.gtF = new alp();
    locala.gtG = new alq();
    locala.uri = "/cgi-bin/micromsg-bin/getroommember";
    locala.gtE = 377;
    locala.gtH = 184;
    locala.gtI = 1000000184;
    this.fUa = locala.DA();
    ((alp)this.fUa.gtC.gtK).gOY = paramString;
    w.d("MicroMsg.NetSceneLbsRoomGetMember", "Req: roomName:" + paramString);
    GMTrace.o(6676795097088L, 49746);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6676929314816L, 49747);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6676929314816L, 49747);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6677197750272L, 49749);
    w.d("MicroMsg.NetSceneLbsRoomGetMember", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (alq)this.fUa.gtD.gtK;
    if (paramInt2 != 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6677197750272L, 49749);
      return;
    }
    paramArrayOfByte = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < paramq.tPE.size())
    {
      h localh = new h();
      localh.username = ((alo)paramq.tPE.get(paramInt1)).jhi;
      localh.gsU = ((alo)paramq.tPE.get(paramInt1)).ubV;
      localh.gsT = ((alo)paramq.tPE.get(paramInt1)).ubW;
      localh.bi(true);
      paramArrayOfByte.add(localh);
      paramInt1 += 1;
    }
    n.Di().A(paramArrayOfByte);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6677197750272L, 49749);
  }
  
  public final int getType()
  {
    GMTrace.i(6677063532544L, 49748);
    GMTrace.o(6677063532544L, 49748);
    return 377;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */