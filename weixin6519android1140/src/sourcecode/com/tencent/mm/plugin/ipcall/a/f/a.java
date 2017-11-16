package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class a
  extends com.tencent.mm.plugin.ipcall.a.a.a
{
  public a()
  {
    GMTrace.i(11597888094208L, 86411);
    GMTrace.o(11597888094208L, 86411);
  }
  
  public final int Fd()
  {
    GMTrace.i(11598156529664L, 86413);
    GMTrace.o(11598156529664L, 86413);
    return 3;
  }
  
  public final int[] aIA()
  {
    GMTrace.i(11598022311936L, 86412);
    GMTrace.o(11598022311936L, 86412);
    return new int[] { 843 };
  }
  
  public final void aIB()
  {
    GMTrace.i(11598290747392L, 86414);
    GMTrace.o(11598290747392L, 86414);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(11598559182848L, 86416);
    if (paramc != null)
    {
      w.d("MicroMsg.IPCallCancelService", "call cancel scene, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(paramc.mjF), Integer.valueOf(paramc.mjI) });
      paramc = new com.tencent.mm.plugin.ipcall.a.d.a(paramc.mjF, paramc.mjG, paramc.eTy, paramc.mkh, paramc.mjI, paramc.mjH);
      at.wS().a(paramc, 0);
    }
    GMTrace.o(11598559182848L, 86416);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11598424965120L, 86415);
    GMTrace.o(11598424965120L, 86415);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */