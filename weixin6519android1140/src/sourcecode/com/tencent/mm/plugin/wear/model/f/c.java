package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.te;
import com.tencent.mm.sdk.platformtools.w;

public abstract class c
  extends d
{
  public c()
  {
    GMTrace.i(9190827360256L, 68477);
    GMTrace.o(9190827360256L, 68477);
  }
  
  protected final void execute()
  {
    GMTrace.i(9190961577984L, 68478);
    if (com.tencent.mm.plugin.wear.model.a.bBm().rzt.bBr())
    {
      te localte = new te();
      localte.eYK.eCx = 11;
      com.tencent.mm.sdk.b.a.vgX.m(localte);
      send();
      GMTrace.o(9190961577984L, 68478);
      return;
    }
    w.i("MicroMsg.WearBaseSendTask", "can not send message to wear");
    GMTrace.o(9190961577984L, 68478);
  }
  
  public abstract void send();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */