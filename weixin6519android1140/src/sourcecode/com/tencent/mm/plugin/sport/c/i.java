package com.tencent.mm.plugin.sport.c;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.MMReceivers.a;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  implements MMReceivers.a
{
  public i()
  {
    GMTrace.i(16729434488832L, 124644);
    GMTrace.o(16729434488832L, 124644);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(16729568706560L, 124645);
    long l = System.currentTimeMillis();
    w.i("MicroMsg.Sport.SportRebootReceiverImpl", "onReceive, save rebootTime = %d %s", new Object[] { Long.valueOf(l), k.ax(l) });
    h.L(205, l);
    GMTrace.o(16729568706560L, 124645);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */