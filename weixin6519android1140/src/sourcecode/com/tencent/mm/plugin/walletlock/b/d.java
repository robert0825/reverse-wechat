package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class d
  implements b.b
{
  private static d ryT;
  
  static
  {
    GMTrace.i(20246878486528L, 150851);
    ryT = null;
    GMTrace.o(20246878486528L, 150851);
  }
  
  private d()
  {
    GMTrace.i(20246744268800L, 150850);
    GMTrace.o(20246744268800L, 150850);
  }
  
  public static d bAY()
  {
    GMTrace.i(20246610051072L, 150849);
    if (ryT == null) {
      ryT = new d();
    }
    d locald = ryT;
    GMTrace.o(20246610051072L, 150849);
    return locald;
  }
  
  public final boolean M(Activity paramActivity)
  {
    GMTrace.i(20246475833344L, 150848);
    Object localObject = ((ActivityManager.RunningTaskInfo)((ActivityManager)ab.getContext().getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
    if (localObject != null) {}
    for (localObject = ((ComponentName)localObject).getClassName();; localObject = "")
    {
      w.d("MicroMsg.WalletGuardFilter", "coveredPage: " + (String)localObject);
      if ((localObject == null) || (((String)localObject).equals(paramActivity.getClass().getName())) || (!((String)localObject).contains(ab.bPT())) || ((!((String)localObject).contains("plugin.mall")) && (!((String)localObject).contains("plugin.card")) && (!((String)localObject).contains("plugin.wallet")) && (!((String)localObject).contains("plugin.wallet_index")) && (!((String)localObject).contains("plugin.webview")) && (!((String)localObject).contains("plugin.offline")) && (!((String)localObject).contains("plugin.recharge")))) {
        break;
      }
      GMTrace.o(20246475833344L, 150848);
      return false;
    }
    GMTrace.o(20246475833344L, 150848);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\walletlock\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */