package com.tinkerboots.sdk.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.tinker.lib.e.a;
import java.util.HashSet;

public final class c
{
  private static String yqQ;
  private static HashSet<String> yqR = new HashSet();
  
  public static String csO()
  {
    if (yqQ == null) {
      return "";
    }
    return yqQ;
  }
  
  public static boolean csP()
  {
    if (yqQ == null) {
      return false;
    }
    return yqR.contains(yqQ);
  }
  
  public static abstract interface a
  {
    public abstract void Th();
  }
  
  public static final class b
  {
    public b(Context paramContext, final c.a parama)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      paramContext.registerReceiver(new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          if (paramAnonymousIntent == null) {}
          for (paramAnonymousIntent = "";; paramAnonymousIntent = paramAnonymousIntent.getAction())
          {
            a.i("Tinker.TinkerUtils", "ScreenReceiver action [%s] ", new Object[] { paramAnonymousIntent });
            if ("android.intent.action.SCREEN_OFF".equals(paramAnonymousIntent))
            {
              paramAnonymousContext.unregisterReceiver(this);
              if (parama != null) {
                parama.Th();
              }
            }
            return;
          }
        }
      }, localIntentFilter);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */