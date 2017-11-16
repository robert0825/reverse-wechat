package com.tencent.pb.common.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.e.a.a;
import com.tencent.e.f;
import com.tencent.pb.common.b.g;
import com.tencent.pb.common.b.h;
import com.tencent.pb.common.c.c;

public class ConnectReceiver
  extends BroadcastReceiver
{
  private static g xOm = null;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent != null)
    {
      try
      {
        if (paramIntent.getAction() == null) {
          return;
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction())) {
          return;
        }
        if (xOm == null) {
          xOm = new g();
        }
        boolean bool1 = h.isNetworkConnected();
        boolean bool2 = xOm.rl();
        paramContext = (a)f.YN("EventCenter");
        if ((!bool2) || (paramContext == null)) {
          return;
        }
        if (bool1)
        {
          paramContext.b("GLOBAL_TOPIC_NETWORK_CHANGE", 21, null);
          return;
        }
      }
      catch (Throwable paramContext)
      {
        c.k("ConnectReceiver", new Object[] { "onReceive", paramContext });
        return;
      }
      paramContext.b("GLOBAL_TOPIC_NETWORK_CHANGE", 33, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\system\ConnectReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */