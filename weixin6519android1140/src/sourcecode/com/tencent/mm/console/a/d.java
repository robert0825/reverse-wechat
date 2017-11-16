package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements com.tencent.mm.pluginsdk.b.a
{
  static
  {
    GMTrace.i(418222440448L, 3116);
    b.a(new d(), new String[] { "//recovery" });
    GMTrace.o(418222440448L, 3116);
  }
  
  public d()
  {
    GMTrace.i(417819787264L, 3113);
    GMTrace.o(417819787264L, 3113);
  }
  
  public static void init()
  {
    GMTrace.i(417954004992L, 3114);
    GMTrace.o(417954004992L, 3114);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = 0;
    GMTrace.i(418088222720L, 3115);
    if (w.getLogLevel() > 1)
    {
      GMTrace.o(418088222720L, 3115);
      return false;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(418088222720L, 3115);
      return true;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default: 
      i = -1;
      label98:
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(418088222720L, 3115);
      return true;
      if (!paramContext.equals("testpush")) {
        break;
      }
      break label98;
      if (!paramContext.equals("testmm")) {
        break;
      }
      i = 1;
      break label98;
      if (!paramContext.equals("testmmonline")) {
        break;
      }
      i = 2;
      break label98;
      if (!paramContext.equals("log")) {
        break;
      }
      i = 3;
      break label98;
      WatchDogPushReceiver.Mw();
      continue;
      paramContext = new mp();
      paramContext.eRJ.action = 1;
      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      continue;
      paramContext = new mp();
      paramContext.eRJ.action = 3;
      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      continue;
      paramContext = new mp();
      paramContext.eRJ.action = 2;
      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */