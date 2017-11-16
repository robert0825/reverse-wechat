package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(11591714078720L, 86365);
    GMTrace.o(11591714078720L, 86365);
  }
  
  public final int Fd()
  {
    GMTrace.i(11591982514176L, 86367);
    GMTrace.o(11591982514176L, 86367);
    return 1;
  }
  
  public final int[] aIA()
  {
    GMTrace.i(11591848296448L, 86366);
    GMTrace.o(11591848296448L, 86366);
    return new int[] { 991 };
  }
  
  public final void aIB()
  {
    GMTrace.i(11592116731904L, 86368);
    GMTrace.o(11592116731904L, 86368);
  }
  
  public final void b(c paramc)
  {
    GMTrace.i(11592385167360L, 86370);
    if (paramc != null)
    {
      if (paramc.mjI == 0) {
        paramc.mjI = ((int)System.currentTimeMillis());
      }
      i locali = new i(paramc.eTy, paramc.mkh, paramc.mjI, paramc.mjJ, paramc.mjK);
      at.wS().a(locali, 0);
      w.d("MicroMsg.IPCallInviteService", "start invite, toUsername: %s, toPhoneNumber: %s, inviteid: %d", new Object[] { paramc.eTy, paramc.mkh, Integer.valueOf(paramc.mjI) });
    }
    GMTrace.o(11592385167360L, 86370);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11592250949632L, 86369);
    GMTrace.o(11592250949632L, 86369);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */