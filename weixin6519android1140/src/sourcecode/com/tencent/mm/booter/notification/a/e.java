package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.media.AudioManager;
import android.text.format.Time;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.k.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.HashSet;
import java.util.Set;

public final class e
{
  private static final Set<String> fLh;
  public boolean fLi;
  
  static
  {
    GMTrace.i(531904856064L, 3963);
    HashSet localHashSet = new HashSet();
    fLh = localHashSet;
    localHashSet.add("readerapp");
    fLh.add("blogapp");
    fLh.add("newsapp");
    GMTrace.o(531904856064L, 3963);
  }
  
  public e()
  {
    GMTrace.i(530025807872L, 3949);
    GMTrace.o(530025807872L, 3949);
  }
  
  public static boolean a(String paramString, au paramau)
  {
    boolean bool2 = true;
    GMTrace.i(531099549696L, 3957);
    boolean bool1;
    if ((f.ec(paramString)) && (!f.e(paramau)))
    {
      bool1 = true;
      if (bool1) {
        break label65;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.Notification.Silent.Handle", "check is NOT Must Mute: %B", new Object[] { Boolean.valueOf(bool2) });
      GMTrace.o(531099549696L, 3957);
      return bool1;
      bool1 = false;
      break;
      label65:
      bool2 = false;
    }
  }
  
  public static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    GMTrace.i(530428461056L, 3952);
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      paramArrayOfBoolean[0] &= paramBoolean;
      paramArrayOfBoolean[1] &= paramBoolean;
      GMTrace.o(530428461056L, 3952);
      return bool;
    }
  }
  
  public static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(530294243328L, 3951);
    if ((!paramBoolean1) && (!paramBoolean2)) {}
    for (boolean bool = true;; bool = false)
    {
      paramArrayOfBoolean[0] &= paramBoolean1;
      paramArrayOfBoolean[1] &= paramBoolean2;
      GMTrace.o(530294243328L, 3951);
      return bool;
    }
  }
  
  public static boolean dA(String paramString)
  {
    GMTrace.i(530160025600L, 3950);
    if (ad.RU("keep_chatting_silent" + paramString))
    {
      w.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: FALSE");
      GMTrace.o(530160025600L, 3950);
      return true;
    }
    w.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: TRUE");
    GMTrace.o(530160025600L, 3950);
    return false;
  }
  
  public static boolean dB(String paramString)
  {
    boolean bool1 = true;
    GMTrace.i(530562678784L, 3953);
    boolean bool2 = fLh.contains(paramString);
    if (!bool2) {}
    for (;;)
    {
      w.i("MicroMsg.Notification.Silent.Handle", "check is NOT Siler User: %B", new Object[] { Boolean.valueOf(bool1) });
      GMTrace.o(530562678784L, 3953);
      return bool2;
      bool1 = false;
    }
  }
  
  public static boolean eb(int paramInt)
  {
    GMTrace.i(530965331968L, 3956);
    if ((paramInt & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Sound: %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(530965331968L, 3956);
      return bool;
    }
  }
  
  public static boolean ec(int paramInt)
  {
    GMTrace.i(531770638336L, 3962);
    if ((paramInt & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Shake: %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(531770638336L, 3962);
      return bool;
    }
  }
  
  public static boolean j(int paramInt, String paramString)
  {
    GMTrace.i(531367985152L, 3959);
    boolean bool;
    if (f.ez(paramInt)) {
      if (f.dX(paramString)) {
        bool = f.ur();
      }
    }
    for (;;)
    {
      w.i("MicroMsg.Notification.Silent.Handle", "check is Voip Need Sound: %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(531367985152L, 3959);
      return bool;
      if (f.dY(paramString)) {
        bool = f.us();
      } else {
        bool = true;
      }
    }
  }
  
  public static boolean rL()
  {
    GMTrace.i(530696896512L, 3954);
    Time localTime = new Time();
    localTime.setToNow();
    if (!com.tencent.mm.k.a.aA(localTime.hour, localTime.minute))
    {
      w.w("MicroMsg.Notification.Silent.Handle", "no shake & sound notification during background deactive time");
      GMTrace.o(530696896512L, 3954);
      return true;
    }
    GMTrace.o(530696896512L, 3954);
    return false;
  }
  
  public static boolean rM()
  {
    GMTrace.i(530831114240L, 3955);
    boolean bool = f.tN();
    w.i("MicroMsg.Notification.Silent.Handle", "check is Sound Mode: %B", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(530831114240L, 3955);
    return bool;
  }
  
  public static boolean rN()
  {
    boolean bool2 = true;
    GMTrace.i(531233767424L, 3958);
    try
    {
      si localsi = new si();
      localsi.eXf.eHJ = 2;
      com.tencent.mm.sdk.b.a.vgX.m(localsi);
      bool1 = localsi.eXg.eXh;
      if (!bool1)
      {
        w.d("MicroMsg.Notification.Silent.Handle", "check is Voip NOT Calling: %B", new Object[] { Boolean.valueOf(bool2) });
        GMTrace.o(531233767424L, 3958);
        return bool1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.Notification.Silent.Handle", localException, "", new Object[0]);
        boolean bool1 = false;
        continue;
        bool2 = false;
      }
    }
  }
  
  public static boolean rO()
  {
    GMTrace.i(531502202880L, 3960);
    boolean bool = f.tP();
    int i = rP();
    if (i == 0) {
      bool = false;
    }
    w.i("MicroMsg.Notification.Silent.Handle", "check is Shake Mode: %B, System AudioManager Mode: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
    GMTrace.o(531502202880L, 3960);
    return bool;
  }
  
  public static int rP()
  {
    GMTrace.i(531636420608L, 3961);
    int i = ((AudioManager)ab.getContext().getSystemService("audio")).getRingerMode();
    GMTrace.o(531636420608L, 3961);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */