package com.tencent.mm.plugin.soter.b;

import com.tencent.d.b.e.b;
import com.tencent.d.b.e.e.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.d.b.e.e, com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private q guL;
  private b<e.b> llF;
  
  public f()
  {
    GMTrace.i(18497484619776L, 137817);
    this.llF = null;
    GMTrace.o(18497484619776L, 137817);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18498021490688L, 137821);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(18498021490688L, 137821);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(18497753055232L, 137819);
    int i = k.b.gum;
    GMTrace.o(18497753055232L, 137819);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18498155708416L, 137822);
    w.i("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      w.i("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa successfully");
      if (this.llF != null)
      {
        this.llF.cg(new e.b(true));
        GMTrace.o(18498155708416L, 137822);
      }
    }
    else
    {
      w.e("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa failed");
      if (this.llF != null) {
        this.llF.cg(new e.b(false));
      }
    }
    GMTrace.o(18498155708416L, 137822);
  }
  
  public final void a(b<e.b> paramb)
  {
    GMTrace.i(18498424143872L, 137824);
    this.llF = paramb;
    GMTrace.o(18498424143872L, 137824);
  }
  
  public final void execute()
  {
    GMTrace.i(18498289926144L, 137823);
    w.v("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo NetSceneUploadSoterASKRsa doScene");
    h.wS().a(this, 0);
    GMTrace.o(18498289926144L, 137823);
  }
  
  public final int getType()
  {
    GMTrace.i(18497887272960L, 137820);
    GMTrace.o(18497887272960L, 137820);
    return 627;
  }
  
  protected final int vB()
  {
    GMTrace.i(18497618837504L, 137818);
    GMTrace.o(18497618837504L, 137818);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */