package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.d.b.e.e.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends d
  implements com.tencent.d.b.e.e, k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.d.b.e.b<e.b> llF;
  private String llG;
  
  public g(String paramString)
  {
    GMTrace.i(20266474274816L, 150997);
    this.llF = null;
    this.llG = null;
    this.llG = paramString;
    GMTrace.o(20266474274816L, 150997);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20266742710272L, 150999);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20266742710272L, 150999);
    return i;
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    GMTrace.i(20267413798912L, 151004);
    this.llF = paramb;
    GMTrace.o(20267413798912L, 151004);
  }
  
  public final void aAc()
  {
    GMTrace.i(20267011145728L, 151001);
    w.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: authkey required");
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    if (this.llF != null)
    {
      w.e("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo pay auth key expired when upload pay auth key");
      this.llF.cg(new e.b(false));
    }
    GMTrace.o(20267011145728L, 151001);
  }
  
  public final void ce(int paramInt1, int paramInt2)
  {
    GMTrace.i(20267145363456L, 151002);
    w.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt2) });
    if (this.fUd != null) {
      this.fUd.a(4, -1, "", this);
    }
    GMTrace.o(20267145363456L, 151002);
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(20266876928000L, 151000);
    w.d("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    if (this.llF != null)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.llF.cg(new e.b(true));
        GMTrace.o(20266876928000L, 151000);
        return;
      }
      this.llF.cg(new e.b(false));
    }
    GMTrace.o(20266876928000L, 151000);
  }
  
  public final void execute()
  {
    GMTrace.i(20267279581184L, 151003);
    h.wS().a(this, 0);
    GMTrace.o(20267279581184L, 151003);
  }
  
  public final int getType()
  {
    GMTrace.i(20266608492544L, 150998);
    GMTrace.o(20266608492544L, 150998);
    return 1665;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */