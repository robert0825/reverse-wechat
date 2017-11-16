package com.tencent.mm.plugin.appbrand.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public abstract class e
{
  final WeakReference<Activity> hLe;
  public final BroadcastReceiver hLi;
  
  public e(Activity paramActivity)
  {
    GMTrace.i(18876112830464L, 140638);
    this.hLi = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(18875039088640L, 140630);
        if (paramAnonymousIntent == null)
        {
          GMTrace.o(18875039088640L, 140630);
          return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(paramAnonymousIntent.getAction())) {
          d.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18877991878656L, 140652);
              e locale = e.this;
              Object localObject2 = (Activity)locale.hLe.get();
              if (localObject2 != null)
              {
                Object localObject3 = ((Activity)localObject2).getPackageManager();
                Object localObject1 = (ActivityManager)((Activity)localObject2).getSystemService("activity");
                localObject2 = bg.ac((Context)localObject2, ((Activity)localObject2).getTaskId());
                if (localObject2 != null) {}
                try
                {
                  localObject2 = ((ActivityManager.RunningTaskInfo)localObject2).topActivity;
                  if ((localObject2 != null) && (localObject1 != null) && (localObject3 != null))
                  {
                    localObject3 = ((PackageManager)localObject3).getActivityInfo((ComponentName)localObject2, 128);
                    if (localObject3 != null)
                    {
                      localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses().iterator();
                      while (((Iterator)localObject1).hasNext())
                      {
                        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject1).next();
                        if (((localRunningAppProcessInfo.importance == 100) || (localRunningAppProcessInfo.importance == 150)) && ((((ComponentName)localObject2).equals(localRunningAppProcessInfo.importanceReasonComponent)) || (localRunningAppProcessInfo.importanceReasonCode == 0)) && (localRunningAppProcessInfo.processName.equals(((ActivityInfo)localObject3).processName)))
                        {
                          locale.Th();
                          GMTrace.o(18877991878656L, 140652);
                          return;
                        }
                      }
                    }
                  }
                  GMTrace.o(18877991878656L, 140652);
                  return;
                }
                catch (Exception localException)
                {
                  w.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "ScreenOff try confirm task top ui status, e = " + localException);
                }
              }
              GMTrace.o(18877991878656L, 140652);
            }
          });
        }
        GMTrace.o(18875039088640L, 140630);
      }
    };
    this.hLe = new WeakReference(paramActivity);
    GMTrace.o(18876112830464L, 140638);
  }
  
  public abstract void Th();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */