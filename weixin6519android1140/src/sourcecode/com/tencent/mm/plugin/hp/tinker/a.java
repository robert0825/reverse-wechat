package com.tencent.mm.plugin.hp.tinker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Method;

public final class a
{
  public Handler handler;
  
  public a(Context paramContext, final a parama)
  {
    GMTrace.i(16028415295488L, 119421);
    this.handler = new Handler(Looper.getMainLooper());
    Boolean localBoolean = bg(paramContext);
    com.tencent.tinker.lib.e.a.i("Tinker.ScreenOffRetryPatch", "try post ScreenOffRetryPatch delay time: %d, screen: %b", new Object[] { Long.valueOf(6000L), localBoolean });
    IntentFilter localIntentFilter = new IntentFilter();
    parama = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16029623255040L, 119430);
        if (parama != null)
        {
          com.tencent.tinker.lib.e.a.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch runnable try to start", new Object[0]);
          parama.aHr();
        }
        GMTrace.o(16029623255040L, 119430);
      }
    };
    if ((localBoolean != null) && (!localBoolean.booleanValue()))
    {
      com.tencent.tinker.lib.e.a.i("Tinker.ScreenOffRetryPatch", "screen is just off now, we can send message directly", new Object[0]);
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      this.handler.postDelayed(parama, 6000L);
    }
    for (;;)
    {
      paramContext.registerReceiver(new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(16028952166400L, 119425);
          if (paramAnonymousIntent == null) {}
          for (paramAnonymousIntent = ""; "android.intent.action.SCREEN_OFF".equals(paramAnonymousIntent); paramAnonymousIntent = paramAnonymousIntent.getAction())
          {
            com.tencent.tinker.lib.e.a.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen off now, send message now", new Object[0]);
            a.this.handler.postDelayed(parama, this.mhz);
            GMTrace.o(16028952166400L, 119425);
            return;
          }
          com.tencent.tinker.lib.e.a.i("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen on, remove pending runnable and receive", new Object[0]);
          a.this.handler.removeCallbacks(parama);
          paramAnonymousContext.unregisterReceiver(this);
          GMTrace.o(16028952166400L, 119425);
        }
      }, localIntentFilter);
      GMTrace.o(16028415295488L, 119421);
      return;
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    }
  }
  
  private static Boolean bg(Context paramContext)
  {
    GMTrace.i(16028549513216L, 119422);
    try
    {
      paramContext = (Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)paramContext.getSystemService("power"), new Object[0]);
      GMTrace.o(16028549513216L, 119422);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      GMTrace.o(16028549513216L, 119422);
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void aHr();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */