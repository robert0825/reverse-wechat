package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.a;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Set;

final class b
  implements d
{
  com.tencent.mm.modelappbrand.c hSX;
  Runnable hSY;
  Runnable hSZ;
  Runnable hTa;
  
  b(com.tencent.mm.modelappbrand.c paramc)
  {
    GMTrace.i(17737006972928L, 132151);
    this.hSY = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17736604319744L, 132148);
        f.en("com.tencent.mm:support");
        GMTrace.o(17736604319744L, 132148);
      }
    };
    this.hSZ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17736335884288L, 132146);
        if (!f.ep("com.tencent.mm:support"))
        {
          GMTrace.o(17736335884288L, 132146);
          return;
        }
        e.a("com.tencent.mm:support", null, b.a.class, new com.tencent.mm.ipcinvoker.c()
        {
          public final void k(Bundle paramAnonymous2Bundle)
          {
            GMTrace.i(17736872755200L, 132150);
            w.i("MicroMsg.DynamicPagePerformance", "exitTask onCallback");
            f.eo("com.tencent.mm:support");
            GMTrace.o(17736872755200L, 132150);
          }
        });
        GMTrace.o(17736335884288L, 132146);
      }
    };
    this.hTa = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18312801026048L, 136441);
        if (!f.ep("com.tencent.mm:support"))
        {
          GMTrace.o(18312801026048L, 136441);
          return;
        }
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("forceKillProcess", true);
        e.a("com.tencent.mm:support", localBundle, b.a.class, new com.tencent.mm.ipcinvoker.c()
        {
          public final void k(Bundle paramAnonymous2Bundle)
          {
            GMTrace.i(18312532590592L, 136439);
            w.i("MicroMsg.DynamicPagePerformance", "killProcessTask onCallback");
            f.eo("com.tencent.mm:support");
            GMTrace.o(18312532590592L, 136439);
          }
        });
        GMTrace.o(18312801026048L, 136441);
      }
    };
    this.hSX = paramc;
    GMTrace.o(17737006972928L, 132151);
  }
  
  public final void exit()
  {
    GMTrace.i(17737275408384L, 132153);
    com.tencent.mm.plugin.appbrand.dynamic.b.j(this.hSZ);
    GMTrace.o(17737275408384L, 132153);
  }
  
  public final void hq(String paramString)
  {
    GMTrace.i(17737409626112L, 132154);
    paramString = this.hSX.aC(paramString);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      GMTrace.o(17737409626112L, 132154);
      return;
    }
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      View localView = (View)paramString.next();
      if ((localView != null) && ((localView instanceof IPCDynamicPageView)))
      {
        w.v("MicroMsg.DynamicPagePerformance", "pauseAllView, do pause view(%s)", new Object[] { Integer.valueOf(localView.hashCode()) });
        ((IPCDynamicPageView)localView).onPause();
      }
    }
    GMTrace.o(17737409626112L, 132154);
  }
  
  public final void hr(String paramString)
  {
    GMTrace.i(17737543843840L, 132155);
    paramString = this.hSX.aC(paramString);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      GMTrace.o(17737543843840L, 132155);
      return;
    }
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      View localView = (View)paramString.next();
      if ((localView != null) && ((localView instanceof IPCDynamicPageView)))
      {
        w.v("MicroMsg.DynamicPagePerformance", "pauseAllView, do resume view(%s)", new Object[] { Integer.valueOf(localView.hashCode()) });
        ((IPCDynamicPageView)localView).onResume();
      }
    }
    GMTrace.o(17737543843840L, 132155);
  }
  
  public final void restart()
  {
    GMTrace.i(18312935243776L, 136442);
    com.tencent.mm.plugin.appbrand.dynamic.b.j(this.hTa);
    com.tencent.mm.plugin.appbrand.dynamic.b.e(this.hSY, 2000L);
    GMTrace.o(18312935243776L, 136442);
  }
  
  private static class a
    implements a
  {
    private a()
    {
      GMTrace.i(17737678061568L, 132156);
      GMTrace.o(17737678061568L, 132156);
    }
    
    public final void a(Bundle paramBundle, com.tencent.mm.ipcinvoker.c paramc)
    {
      int j = 0;
      GMTrace.i(18313069461504L, 136443);
      int i = j;
      if (paramBundle != null)
      {
        i = j;
        if (paramBundle.getBoolean("forceKillProcess", false)) {
          i = 1;
        }
      }
      if (i != 0) {
        com.tencent.mm.plugin.appbrand.dynamic.g.b.Vn();
      }
      for (;;)
      {
        paramc.k(null);
        GMTrace.o(18313069461504L, 136443);
        return;
        com.tencent.mm.plugin.appbrand.dynamic.g.b.Vm();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */