package com.tencent.mm.modelvoice;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RemoteController
{
  private static Method hdw;
  private static Method hdx;
  private AudioManager hdu;
  private ComponentName hdv;
  
  static
  {
    GMTrace.i(535797170176L, 3992);
    try
    {
      if (hdw == null) {
        hdw = AudioManager.class.getMethod("registerMediaButtonEventReceiver", new Class[] { ComponentName.class });
      }
      if (hdx == null) {
        hdx = AudioManager.class.getMethod("unregisterMediaButtonEventReceiver", new Class[] { ComponentName.class });
      }
      GMTrace.o(535797170176L, 3992);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      GMTrace.o(535797170176L, 3992);
    }
  }
  
  protected final void finalize()
  {
    GMTrace.i(535662952448L, 3991);
    for (;;)
    {
      try
      {
        Method localMethod = hdx;
        if (localMethod == null)
        {
          super.finalize();
          GMTrace.o(535662952448L, 3991);
          return;
        }
        hdx.invoke(this.hdu, new Object[] { this.hdv });
        RemoteControlReceiver.NH();
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Throwable localThrowable = localInvocationTargetException.getCause();
        if (!(localThrowable instanceof RuntimeException)) {
          continue;
        }
        throw ((RuntimeException)localThrowable);
        if (!(localThrowable instanceof Error)) {
          continue;
        }
        throw ((Error)localThrowable);
        throw new RuntimeException(localInvocationTargetException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        w.e("MicroMsg.RemoteControlReceiver", "unexpected " + localIllegalAccessException);
      }
    }
  }
  
  public static class RemoteControlReceiver
    extends BroadcastReceiver
  {
    private static aj euU;
    private static RemoteController.a hdy;
    
    public RemoteControlReceiver()
    {
      GMTrace.i(537676218368L, 4006);
      GMTrace.o(537676218368L, 4006);
    }
    
    public static void NH()
    {
      GMTrace.i(537944653824L, 4008);
      hdy = null;
      if (euU != null)
      {
        euU.stopTimer();
        euU = null;
      }
      GMTrace.o(537944653824L, 4008);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(537810436096L, 4007);
      if (paramIntent == null)
      {
        GMTrace.o(537810436096L, 4007);
        return;
      }
      if (!"android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction()))
      {
        w.d("MicroMsg.RemoteControlReceiver", "unknown action, ignore" + paramIntent.getAction());
        GMTrace.o(537810436096L, 4007);
        return;
      }
      if ((euU == null) && (hdy != null))
      {
        w.d("MicroMsg.RemoteControlReceiver", "got remote key event down");
        euU = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(546534588416L, 4072);
            w.d("MicroMsg.RemoteControlReceiver", "got remote key event up");
            RemoteController.RemoteControlReceiver.NI();
            GMTrace.o(546534588416L, 4072);
            return false;
          }
        }, true);
      }
      if (euU != null) {
        euU.z(1000L, 1000L);
      }
      GMTrace.o(537810436096L, 4007);
    }
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelvoice\RemoteController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */