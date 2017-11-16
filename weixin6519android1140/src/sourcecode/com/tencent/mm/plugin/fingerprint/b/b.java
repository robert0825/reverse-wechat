package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.bp.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fingerprint.c.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends c<bp>
  implements e
{
  private bp lkU;
  private boolean lkV;
  
  public b()
  {
    GMTrace.i(10790836895744L, 80398);
    this.lkV = false;
    this.vhf = bp.class.getName().hashCode();
    GMTrace.o(10790836895744L, 80398);
  }
  
  private boolean a(bp parambp)
  {
    GMTrace.i(10790971113472L, 80399);
    if (!h.xw().wL())
    {
      w.e("MicroMsg.CloseFingerPrintEventListener", "CloseFingerPrintEvent account is not ready");
      GMTrace.o(10790971113472L, 80399);
      return false;
    }
    this.lkV = false;
    if ((parambp instanceof bp))
    {
      this.lkU = parambp;
      w.i("MicroMsg.CloseFingerPrintEventListener", "handle CloseFingerPrintEvent");
      h.xz();
      h.xx().fYr.a(385, this);
      parambp = new d();
      h.xz();
      h.xx().fYr.a(parambp, 0);
      GMTrace.o(10790971113472L, 80399);
      return true;
    }
    GMTrace.o(10790971113472L, 80399);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10791105331200L, 80400);
    if ((paramk instanceof d))
    {
      paramk = new bp.a();
      w.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label150;
      }
      w.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is success");
    }
    for (paramk.retCode = 0;; paramk.retCode = paramInt2)
    {
      h.xz();
      h.xx().fYr.b(385, this);
      this.lkU.eCN = paramk;
      this.lkV = true;
      if (this.lkU.eDO != null) {
        this.lkU.eDO.run();
      }
      if (this.lkV) {
        this.lkU = null;
      }
      GMTrace.o(10791105331200L, 80400);
      return;
      label150:
      w.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is fail");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */