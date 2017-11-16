package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.i;
import com.tencent.mm.protocal.c.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private com.tencent.mm.protocal.c.h hpl;
  public i hpm;
  
  public g(String paramString1, long paramLong1, List<j> paramList, int paramInt, String paramString2, long paramLong2)
  {
    GMTrace.i(5596745039872L, 41699);
    b.a locala = new b.a();
    locala.gtF = new com.tencent.mm.protocal.c.h();
    locala.gtG = new i();
    locala.gtE = 1655;
    locala.uri = "/cgi-bin/mmpay-bin/newaalaunchbyperson";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.hpl = ((com.tencent.mm.protocal.c.h)this.gUL.gtC.gtK);
    this.gUL.gtT = true;
    try
    {
      this.hpl.title = p.encode(paramString1, "UTF-8");
      this.hpl.tMi = paramLong1;
      this.hpl.tMe = new LinkedList();
      this.hpl.tMe.addAll(paramList);
      this.hpl.scene = paramInt;
      this.hpl.tMa = paramString2;
      this.hpl.tMf = com.tencent.mm.plugin.wallet_core.model.h.byp();
      this.hpl.tMg = paramLong2;
      w.d("MicroMsg.NetSceneAALaunchByPerson", "location %s", new Object[] { this.hpl.tMf });
      this.chatroomName = paramString2;
      w.i("MicroMsg.NetSceneAALaunchByPerson", "NetSceneAALaunchByPerson, title: %s, total_pay_amount: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s", new Object[] { this.hpl.title, Long.valueOf(this.hpl.tMi), this.hpl.tMe, Integer.valueOf(this.hpl.scene), this.hpl.tMa, Long.valueOf(this.hpl.tMg) });
      GMTrace.o(5596745039872L, 41699);
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneAALaunchByPerson", "build NetSceneAALaunchByPerson request error: %s", new Object[] { paramString1.getMessage() });
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5597013475328L, 41701);
    w.d("MicroMsg.NetSceneAALaunchByPerson", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5597013475328L, 41701);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5597147693056L, 41702);
    w.i("MicroMsg.NetSceneAALaunchByPerson", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.hpm = ((i)((b)paramq).gtD.gtK);
    paramInt1 = this.hpm.jWs;
    paramq = this.hpm.jWt;
    paramArrayOfByte = this.hpm.tLZ;
    if (this.hpm.tMb == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NetSceneAALaunchByPerson", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", new Object[] { Integer.valueOf(paramInt1), paramq, paramArrayOfByte, Boolean.valueOf(bool) });
      w.d("MicroMsg.NetSceneAALaunchByPerson", "msgxml: %s", new Object[] { this.hpm.tMb });
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5597147693056L, 41702);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(5596879257600L, 41700);
    GMTrace.o(5596879257600L, 41700);
    return 1655;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */