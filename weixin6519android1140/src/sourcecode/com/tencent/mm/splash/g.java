package com.tencent.mm.splash;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.c;
import com.tencent.mm.compatible.util.d;
import java.lang.reflect.Field;
import java.util.ArrayList;

final class g
  implements Handler.Callback
{
  public static int voL;
  public static int voM;
  public static int voN;
  public static int voO;
  public static int voP;
  public static int voQ;
  public static int voR;
  public static int voS;
  public static int voT;
  private static boolean voU;
  private static Runnable voV;
  private static boolean voY;
  private Context mContext;
  Handler.Callback voW;
  private boolean voX;
  
  static
  {
    GMTrace.i(19016773009408L, 141686);
    voL = 100;
    voM = 113;
    voN = 114;
    voO = 115;
    voP = 116;
    voQ = 121;
    voR = 122;
    voS = 126;
    voT = 145;
    voU = false;
    voY = false;
    GMTrace.o(19016773009408L, 141686);
  }
  
  public g(Context paramContext, Handler.Callback paramCallback)
  {
    GMTrace.i(19016370356224L, 141683);
    this.voX = false;
    this.mContext = paramContext;
    this.voW = paramCallback;
    GMTrace.o(19016370356224L, 141683);
  }
  
  public static void T(Runnable paramRunnable)
  {
    GMTrace.i(19016504573952L, 141684);
    voU = true;
    voV = paramRunnable;
    GMTrace.o(19016504573952L, 141684);
  }
  
  public static boolean bSc()
  {
    GMTrace.i(19124684062720L, 142490);
    boolean bool = voY;
    GMTrace.o(19124684062720L, 142490);
    return bool;
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    GMTrace.i(19016638791680L, 141685);
    if (this.voX)
    {
      e.a("WxSplash.SplashHackHandlerCallback", "found a infinite call loop", new Object[0]);
      GMTrace.o(19016638791680L, 141685);
      return true;
    }
    voY = false;
    e.a("WxSplash.SplashHackHandlerCallback", "before handleMessage %s, splash %s, pending early %s", new Object[] { Integer.valueOf(paramMessage.what), Boolean.valueOf(e.bRQ()), Boolean.valueOf(e.bRR()) });
    if ((voU) && (paramMessage.what == 987654321))
    {
      if (voV != null)
      {
        e.a("WxSplash.SplashHackHandlerCallback", "verify hack received.", new Object[0]);
        voV.run();
      }
      GMTrace.o(19016638791680L, 141685);
      return true;
    }
    Object localObject;
    if ((e.bRQ()) && (!e.bRR()))
    {
      e.a("WxSplash.SplashHackHandlerCallback", "handleMessage %s, splash %s", new Object[] { Integer.valueOf(paramMessage.what), Boolean.valueOf(e.bRQ()) });
      if ((paramMessage.what == voM) || (paramMessage.what == voN) || (paramMessage.what == voO) || (paramMessage.what == voP) || (paramMessage.what == voQ) || (paramMessage.what == voR) || (paramMessage.what == voT))
      {
        localObject = Message.obtain();
        ((Message)localObject).copyFrom(paramMessage);
        e.vor.add(localObject);
        c.oU();
        GMTrace.o(19016638791680L, 141685);
        return true;
      }
    }
    if (paramMessage.what == voS)
    {
      voY = true;
      e.a("WxSplash.SplashHackHandlerCallback", "received a RELAUNCH_ACTIVITY message", new Object[0]);
      localObject = paramMessage.obj;
      if (!d.ev(25)) {}
    }
    try
    {
      if (i.vpi == null)
      {
        Field localField = Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
        localField.setAccessible(true);
        i.vpi = localField;
      }
      e.a("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", new Object[] { Boolean.valueOf(((Boolean)i.vpi.get(localObject)).booleanValue()) });
      i.vpi.set(localObject, Boolean.valueOf(false));
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool;
        e.a(localException, "");
      }
      GMTrace.o(19016638791680L, 141685);
    }
    if (this.voW != null)
    {
      this.voX = true;
      bool = this.voW.handleMessage(paramMessage);
      this.voX = false;
      GMTrace.o(19016638791680L, 141685);
      return bool;
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */