package com.tencent.mm.modelmulti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Method;

public final class n
{
  public Boolean gNl;
  
  public n(Context paramContext, final a parama)
  {
    GMTrace.i(412048424960L, 3070);
    this.gNl = null;
    this.gNl = bg(paramContext);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.registerReceiver(new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(410437812224L, 3058);
        if (paramAnonymousIntent == null)
        {
          paramAnonymousIntent = "";
          w.i("MicroMsg.ScreenState", "ScreenReceiver action [%s] ", new Object[] { paramAnonymousIntent });
          if (!"android.intent.action.SCREEN_OFF".equals(paramAnonymousIntent)) {
            break label107;
          }
        }
        label107:
        for (n.this.gNl = Boolean.valueOf(false);; n.this.gNl = Boolean.valueOf(true))
        {
          if (parama != null) {
            parama.bx(n.this.gNl.booleanValue());
          }
          if (this.gNn) {
            paramAnonymousContext.unregisterReceiver(this);
          }
          GMTrace.o(410437812224L, 3058);
          return;
          paramAnonymousIntent = paramAnonymousIntent.getAction();
          break;
        }
      }
    }, localIntentFilter);
    GMTrace.o(412048424960L, 3070);
  }
  
  private Boolean bg(Context paramContext)
  {
    GMTrace.i(412182642688L, 3071);
    try
    {
      paramContext = (Boolean)PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager)paramContext.getSystemService("power"), new Object[0]);
      w.i("MicroMsg.ScreenState", "reflectScreenOn: byReflect:%s isScreenOn:%s", new Object[] { paramContext, this.gNl });
      GMTrace.o(412182642688L, 3071);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      g.ork.a(99L, 154L, 1L, false);
      w.e("MicroMsg.ScreenState", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", new Object[] { this.gNl, bg.f(paramContext) });
      GMTrace.o(412182642688L, 3071);
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void bx(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelmulti\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */