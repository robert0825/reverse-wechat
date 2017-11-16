package c.t.m.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class cx
  extends BroadcastReceiver
{
  private final cj a;
  private boolean b;
  
  public cx(cj paramcj)
  {
    this.a = paramcj;
  }
  
  public final void a()
  {
    if (!this.b) {
      return;
    }
    this.b = false;
    try
    {
      this.a.a.unregisterReceiver(this);
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(Handler paramHandler)
  {
    if (this.b) {
      return;
    }
    this.b = true;
    try
    {
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      this.a.a.registerReceiver(this, localIntentFilter, null, paramHandler);
      return;
    }
    catch (Exception paramHandler) {}
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      if (paramIntent.getBooleanExtra("noConnectivity", false))
      {
        this.a.c(Integer.valueOf(-1));
        return;
      }
      if (b.a.b(paramContext))
      {
        this.a.c(Integer.valueOf(1));
        return;
      }
      this.a.c(Integer.valueOf(0));
      return;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */