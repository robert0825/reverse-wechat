package com.tencent.mm.plugin.auto.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class MMAutoMessageHeardReceiver
  extends BroadcastReceiver
{
  public MMAutoMessageHeardReceiver()
  {
    GMTrace.i(5211808595968L, 38831);
    GMTrace.o(5211808595968L, 38831);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(5211942813696L, 38832);
    paramContext = s.i(paramIntent, "key_username");
    if (paramContext == null)
    {
      GMTrace.o(5211942813696L, 38832);
      return;
    }
    w.i("MicroMsg.auto.MMAutoMessageHeardReceiver", "username %s heard", new Object[] { paramContext });
    at.getNotification().cancelNotification(paramContext);
    at.AR();
    c.yP().TQ(paramContext);
    GMTrace.o(5211942813696L, 38832);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\auto\service\MMAutoMessageHeardReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */