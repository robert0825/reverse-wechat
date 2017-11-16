package c.t.m.g;

import android.content.Context;
import android.content.IntentFilter;

final class t
  implements Runnable
{
  public final void run()
  {
    try
    {
      o.e();
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      l.a().registerReceiver(o.i, localIntentFilter);
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */