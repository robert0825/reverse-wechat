package com.tencent.mm.plugin.soter.b;

import com.tencent.d.b.e.e.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.d.b.e.e, com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.d.b.e.b<e.b> llF;
  
  public e()
  {
    GMTrace.i(18495739789312L, 137804);
    this.llF = null;
    GMTrace.o(18495739789312L, 137804);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18496008224768L, 137806);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18496008224768L, 137806);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18496142442496L, 137807);
    w.i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
      if (this.llF != null)
      {
        this.llF.cg(new e.b(true));
        GMTrace.o(18496142442496L, 137807);
      }
    }
    else
    {
      w.e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
      if (this.llF != null) {
        this.llF.cg(new e.b(false));
      }
    }
    GMTrace.o(18496142442496L, 137807);
  }
  
  public final void a(com.tencent.d.b.e.b<e.b> paramb)
  {
    GMTrace.i(18496276660224L, 137808);
    this.llF = paramb;
    GMTrace.o(18496276660224L, 137808);
  }
  
  public final void execute()
  {
    GMTrace.i(18496410877952L, 137809);
    w.v("MicroMsg.NetSceneUploadSoterASK", "alvinluo NetSceneUploadSoterASK execute doScene");
    h.wS().a(this, 0);
    GMTrace.o(18496410877952L, 137809);
  }
  
  public final int getType()
  {
    GMTrace.i(18495874007040L, 137805);
    GMTrace.o(18495874007040L, 137805);
    return 619;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */