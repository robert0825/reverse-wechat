package com.tencent.mm.plugin.soter_mp.b;

import com.tencent.d.b.e.e.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends d
  implements com.tencent.d.b.e.e, k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.d.b.e.b<e.b> llF;
  
  public c()
  {
    GMTrace.i(18045305094144L, 134448);
    this.llF = null;
    GMTrace.o(18045305094144L, 134448);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7072603176960L, 52695);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7072603176960L, 52695);
    return i;
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    GMTrace.i(18045707747328L, 134451);
    this.llF = paramb;
    GMTrace.o(18045707747328L, 134451);
  }
  
  public final void aAc()
  {
    GMTrace.i(7072871612416L, 52697);
    w.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy:NetSceneSoterMPUpdateAuthKey authkey required");
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    if (this.llF != null) {
      this.llF.cg(new e.b(false));
    }
    GMTrace.o(7072871612416L, 52697);
  }
  
  public final void ce(int paramInt1, int paramInt2)
  {
    GMTrace.i(18045439311872L, 134449);
    w.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt2) });
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(18045439311872L, 134449);
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7072737394688L, 52696);
    w.d("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    if (this.llF != null)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.llF.cg(new e.b(true));
        GMTrace.o(7072737394688L, 52696);
        return;
      }
      this.llF.cg(new e.b(false));
    }
    GMTrace.o(7072737394688L, 52696);
  }
  
  public final void execute()
  {
    GMTrace.i(18045573529600L, 134450);
    h.wS().a(this, 0);
    GMTrace.o(18045573529600L, 134450);
  }
  
  public final int getType()
  {
    GMTrace.i(7072468959232L, 52694);
    GMTrace.o(7072468959232L, 52694);
    return 1185;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */