package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.protocal.c.bgr;
import com.tencent.mm.protocal.c.bgs;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends d
  implements k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String llD;
  public boolean llE;
  
  public a()
  {
    GMTrace.i(10752584843264L, 80113);
    this.llD = "";
    this.llE = false;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bgr();
    ((b.a)localObject1).gtG = new bgs();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/sotergetchallenge";
    ((b.a)localObject1).gtE = 1586;
    ((b.a)localObject1).gtH = 0;
    ((b.a)localObject1).gtI = 0;
    this.fUa = ((b.a)localObject1).DA();
    localObject1 = (bgr)this.fUa.gtC.gtK;
    Object localObject2 = com.tencent.mm.plugin.soter.c.b.bqB();
    String str = ((c)localObject2).qpg;
    localObject2 = ((c)localObject2).qph;
    w.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: cpu_id: %s, uid: %s", new Object[] { str, localObject2 });
    ((bgr)localObject1).qpg = str;
    ((bgr)localObject1).qph = ((String)localObject2);
    ((bgr)localObject1).scene = 0;
    GMTrace.o(10752584843264L, 80113);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10752853278720L, 80115);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10752853278720L, 80115);
    return i;
  }
  
  public final void aAc()
  {
    GMTrace.i(10753121714176L, 80117);
    w.e("MicroMsg.NetSceneSoterGetPayChallenge", "hy: auth key expired");
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(10753121714176L, 80117);
  }
  
  public final void ce(int paramInt1, int paramInt2)
  {
    GMTrace.i(18484599717888L, 137721);
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(18484599717888L, 137721);
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(10752987496448L, 80116);
    w.d("MicroMsg.NetSceneSoterGetPayChallenge", "hy: onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramq = (bgs)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      this.llD = paramq.llD;
      r.riJ.llD = this.llD;
      if (1 != paramq.uSn) {
        break label185;
      }
      bool = true;
      this.llE = bool;
      if (1 != paramq.uSn) {
        break label191;
      }
    }
    label185:
    label191:
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.NetSceneSoterGetPayChallenge", "get pay challenge needChangeAuthKey: %b", new Object[] { Boolean.valueOf(bool) });
      r.riJ.llE = this.llE;
      w.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: challenge: %s, need auth key: %b", new Object[] { this.llD, Boolean.valueOf(this.llE) });
      this.fUd.a(paramInt1, paramInt2, paramString, this);
      GMTrace.o(10752987496448L, 80116);
      return;
      bool = false;
      break;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(10752719060992L, 80114);
    GMTrace.o(10752719060992L, 80114);
    return 1586;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */