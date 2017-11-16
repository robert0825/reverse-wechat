package com.tencent.mm.plugin.fingerprint.c;

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
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.d.b.e.b<e.b> llF;
  private String llG;
  
  public c(String paramString)
  {
    GMTrace.i(18484868153344L, 137723);
    this.llF = null;
    this.llG = null;
    this.llG = paramString;
    GMTrace.o(18484868153344L, 137723);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10753658585088L, 80121);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10753658585088L, 80121);
    return i;
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    GMTrace.i(18485270806528L, 137726);
    this.llF = paramb;
    GMTrace.o(18485270806528L, 137726);
  }
  
  public final void aAc()
  {
    GMTrace.i(10753927020544L, 80123);
    w.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: authkey required");
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    if (this.llF != null)
    {
      w.e("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "alvinluo pay auth key expired when upload pay auth key");
      this.llF.cg(new e.b(false));
    }
    GMTrace.o(10753927020544L, 80123);
  }
  
  public final void ce(int paramInt1, int paramInt2)
  {
    GMTrace.i(18485002371072L, 137724);
    w.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt2) });
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(18485002371072L, 137724);
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(10753792802816L, 80122);
    w.d("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    if (this.llF != null)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.llF.cg(new e.b(true));
        GMTrace.o(10753792802816L, 80122);
        return;
      }
      this.llF.cg(new e.b(false));
    }
    GMTrace.o(10753792802816L, 80122);
  }
  
  public final void execute()
  {
    GMTrace.i(18485136588800L, 137725);
    h.wS().a(this, 0);
    GMTrace.o(18485136588800L, 137725);
  }
  
  public final int getType()
  {
    GMTrace.i(10753524367360L, 80120);
    GMTrace.o(10753524367360L, 80120);
    return 1665;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */