package com.tencent.mm.pluginsdk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.e.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class s
{
  private static final AtomicInteger tmn;
  
  static
  {
    GMTrace.i(886642311168L, 6606);
    tmn = new AtomicInteger(0);
    GMTrace.o(886642311168L, 6606);
  }
  
  public static void bIY()
  {
    GMTrace.i(14301704224768L, 106556);
    if (!ab.bQa())
    {
      GMTrace.o(14301704224768L, 106556);
      return;
    }
    tmn.getAndSet(0);
    GMTrace.o(14301704224768L, 106556);
  }
  
  public static boolean isLocked()
  {
    GMTrace.i(886239657984L, 6603);
    if (tmn.get() > 0)
    {
      GMTrace.o(886239657984L, 6603);
      return true;
    }
    GMTrace.o(886239657984L, 6603);
    return false;
  }
  
  public static void lock()
  {
    GMTrace.i(886373875712L, 6604);
    if (ab.bQa())
    {
      tmn.incrementAndGet();
      GMTrace.o(886373875712L, 6604);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_LOCK_TOOLS_PROCESS");
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(886373875712L, 6604);
  }
  
  public static void unlock()
  {
    GMTrace.i(886508093440L, 6605);
    if (ab.getContext() == null)
    {
      GMTrace.o(886508093440L, 6605);
      return;
    }
    Object localObject = (ActivityManager)ab.getContext().getSystemService("activity");
    if (localObject == null)
    {
      GMTrace.o(886508093440L, 6605);
      return;
    }
    localObject = ((ActivityManager)localObject).getRunningAppProcesses();
    if (bg.cc((List)localObject))
    {
      GMTrace.o(886508093440L, 6605);
      return;
    }
    localObject = ((List)localObject).iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while (!"com.tencent.mm:tools".equals(((ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next()).processName));
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        if (ab.bQa())
        {
          tmn.decrementAndGet();
          GMTrace.o(886508093440L, 6605);
          return;
        }
        localObject = new Intent();
        ((Intent)localObject).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_UNLOCK_TOOLS_PROCESS");
        ab.getContext().sendBroadcast((Intent)localObject);
      }
      GMTrace.o(886508093440L, 6605);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */