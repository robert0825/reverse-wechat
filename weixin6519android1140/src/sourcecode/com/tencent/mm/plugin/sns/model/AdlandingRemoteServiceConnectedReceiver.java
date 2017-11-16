package com.tencent.mm.plugin.sns.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.d;
import com.tencent.gmtrace.GMTrace;

public class AdlandingRemoteServiceConnectedReceiver
  extends BroadcastReceiver
{
  private Runnable hdZ;
  
  public static void a(d paramd)
  {
    GMTrace.i(15247536553984L, 113603);
    paramd.a(new Intent("com.tencnet.mm.action.adlanding.connected"));
    GMTrace.o(15247536553984L, 113603);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(15247402336256L, 113602);
    if ((paramIntent != null) && ("com.tencnet.mm.action.adlanding.connected".equals(paramIntent.getAction())) && (this.hdZ != null)) {
      this.hdZ.run();
    }
    GMTrace.o(15247402336256L, 113602);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\AdlandingRemoteServiceConnectedReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */