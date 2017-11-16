package com.tencent.mm.console.a;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  implements com.tencent.mm.pluginsdk.b.a
{
  static
  {
    GMTrace.i(14625840037888L, 108971);
    com.tencent.mm.pluginsdk.b.b.a(new f(), new String[] { "//sport" });
    GMTrace.o(14625840037888L, 108971);
  }
  
  public f()
  {
    GMTrace.i(14625437384704L, 108968);
    GMTrace.o(14625437384704L, 108968);
  }
  
  public static void init()
  {
    GMTrace.i(14625571602432L, 108969);
    GMTrace.o(14625571602432L, 108969);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = 0;
    GMTrace.i(14625705820160L, 108970);
    if (w.getLogLevel() > 1)
    {
      GMTrace.o(14625705820160L, 108970);
      return false;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(14625705820160L, 108970);
      return true;
    }
    paramContext = paramArrayOfString[1];
    switch (paramContext.hashCode())
    {
    default: 
      i = -1;
      label86:
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(14625705820160L, 108970);
      return true;
      if (!paramContext.equals("setdevicestep")) {
        break;
      }
      break label86;
      if (!paramContext.equals("clear")) {
        break;
      }
      i = 1;
      break label86;
      if (!paramContext.equals("setextapistep")) {
        break;
      }
      i = 2;
      break label86;
      i = Integer.valueOf(paramArrayOfString[2]).intValue();
      long l = bg.bQR() / 10000L;
      ((com.tencent.mm.plugin.sport.b.b)h.h(com.tencent.mm.plugin.sport.b.b.class)).I(202, l);
      ((com.tencent.mm.plugin.sport.b.b)h.h(com.tencent.mm.plugin.sport.b.b.class)).I(201, i);
      continue;
      ((com.tencent.mm.plugin.sport.b.b)h.h(com.tencent.mm.plugin.sport.b.b.class)).bqS();
      Process.killProcess(Process.myPid());
      continue;
      paramContext = new fe();
      paramContext.eHo.action = 2;
      paramContext.eHo.eHr = Integer.valueOf(paramArrayOfString[2]).intValue();
      paramContext.eHo.eHs = 1L;
      com.tencent.mm.sdk.b.a.vgX.a(paramContext, Looper.getMainLooper());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */