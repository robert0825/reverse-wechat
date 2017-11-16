package com.tencent.mm.plugin.appbrand.b;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public abstract class d
{
  private final WeakReference<Activity> hLe;
  public final BroadcastReceiver sU;
  
  public d(Activity paramActivity)
  {
    GMTrace.i(18871146774528L, 140601);
    this.sU = new BroadcastReceiver()
    {
      final String hLf;
      final String hLg;
      
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(18878260314112L, 140654);
        if (paramAnonymousIntent == null)
        {
          GMTrace.o(18878260314112L, 140654);
          return;
        }
        if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(paramAnonymousIntent.getAction()))
        {
          paramAnonymousContext = paramAnonymousIntent.getStringExtra("reason");
          if (paramAnonymousContext != null)
          {
            w.i("MicroMsg.BaseAppBrandUIHomePressReceiver", "[home_pressed] action: %s, reason: %s", new Object[] { paramAnonymousIntent.getAction(), paramAnonymousContext });
            if (paramAnonymousContext.equals("homekey")) {
              d.this.Tg();
            }
          }
        }
        GMTrace.o(18878260314112L, 140654);
      }
    };
    this.hLe = new WeakReference(paramActivity);
    GMTrace.o(18871146774528L, 140601);
  }
  
  public abstract void Tg();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */