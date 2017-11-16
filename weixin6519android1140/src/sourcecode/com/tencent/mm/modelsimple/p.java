package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqb;
import com.tencent.mm.protocal.c.aqc;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public p(int paramInt)
  {
    GMTrace.i(1350901432320L, 10065);
    b.a locala = new b.a();
    locala.gtF = new aqb();
    locala.gtG = new aqc();
    locala.uri = "/cgi-bin/micromsg-bin/newgetinvitefriend";
    locala.gtE = 135;
    locala.gtH = 23;
    locala.gtI = 1000000023;
    this.fUa = locala.DA();
    ((aqb)this.fUa.gtC.gtK).uxU = paramInt;
    GMTrace.o(1350901432320L, 10065);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1351035650048L, 10066);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1351035650048L, 10066);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1351304085504L, 10068);
    paramq = (aqc)this.fUa.gtD.gtK;
    w.d("MicroMsg.NetSceneGetInviteFriend", "friend:" + paramq.lPH.size() + " group:" + paramq.tQs.size());
    paramArrayOfByte = new HashSet();
    LinkedList localLinkedList = new LinkedList();
    paramInt1 = 0;
    while (paramInt1 < paramq.uFX)
    {
      if (!paramArrayOfByte.contains(((aqf)paramq.lPH.get(paramInt1)).jhi))
      {
        localLinkedList.add(paramq.lPH.get(paramInt1));
        paramArrayOfByte.add(((aqf)paramq.lPH.get(paramInt1)).jhi);
      }
      paramInt1 += 1;
    }
    paramq.lPH = localLinkedList;
    paramq.uFX = localLinkedList.size();
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1351304085504L, 10068);
  }
  
  public final int getType()
  {
    GMTrace.i(1351169867776L, 10067);
    GMTrace.o(1351169867776L, 10067);
    return 135;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */