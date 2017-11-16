package com.tencent.mm.plugin.appbrand.dynamic.g;

import android.os.Bundle;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.BaseIPCService;
import com.tencent.mm.ipcinvoker.d;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.j;
import com.tencent.mm.ipcinvoker.wx_extension.b.b.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  private static final aj hUT;
  
  static
  {
    GMTrace.i(17730296086528L, 132101);
    hUT = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(17730564521984L, 132103);
        BaseIPCService localBaseIPCService = j.vQ().eq("com.tencent.mm:support");
        if (localBaseIPCService != null) {
          localBaseIPCService.aZ(false);
        }
        GMTrace.o(17730564521984L, 132103);
        return false;
      }
    }, true);
    GMTrace.o(17730296086528L, 132101);
  }
  
  public static void Vm()
  {
    GMTrace.i(17730161868800L, 132100);
    if (!d.em("com.tencent.mm:support"))
    {
      w.i("MicroMsg.DynamicProcessPerformance", "try to kill process failed, current process is not the support process.");
      GMTrace.o(17730161868800L, 132100);
      return;
    }
    int i = b.a.fWb.size();
    if (i != 0)
    {
      w.i("MicroMsg.DynamicProcessPerformance", "try to exit process, but has many tasks(%d) running. Abort it.", new Object[] { Integer.valueOf(i) });
      GMTrace.o(17730161868800L, 132100);
      return;
    }
    w.i("MicroMsg.DynamicProcessPerformance", "post delayed(60s) to kill the support process.");
    hUT.z(60000L, 60000L);
    GMTrace.o(17730161868800L, 132100);
  }
  
  public static void Vn()
  {
    GMTrace.i(18309311365120L, 136415);
    if (!d.em("com.tencent.mm:support"))
    {
      w.i("MicroMsg.DynamicProcessPerformance", "try to kill process failed, current process is not the support process.");
      GMTrace.o(18309311365120L, 136415);
      return;
    }
    w.i("MicroMsg.DynamicProcessPerformance", "kill support process");
    hUT.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18309177147392L, 136414);
        Process.killProcess(Process.myPid());
        GMTrace.o(18309177147392L, 136414);
      }
    }, 500L);
    GMTrace.o(18309311365120L, 136415);
  }
  
  public static void Vo()
  {
    GMTrace.i(18309445582848L, 136416);
    w.i("MicroMsg.DynamicProcessPerformance", "killAllProcess");
    if (f.ep("com.tencent.mm:tools")) {
      e.a("com.tencent.mm:tools", null, c.class, new com.tencent.mm.ipcinvoker.c()
      {
        public final void k(Bundle paramAnonymousBundle)
        {
          GMTrace.i(18309714018304L, 136418);
          w.i("MicroMsg.DynamicProcessPerformance", "on kill process tools callback");
          f.eo("com.tencent.mm:tools");
          GMTrace.o(18309714018304L, 136418);
        }
      });
    }
    if (f.ep("com.tencent.mm:support")) {
      e.a("com.tencent.mm:support", null, c.class, new com.tencent.mm.ipcinvoker.c()
      {
        public final void k(Bundle paramAnonymousBundle)
        {
          GMTrace.i(18308908711936L, 136412);
          w.i("MicroMsg.DynamicProcessPerformance", "on kill process support callback");
          f.eo("com.tencent.mm:support");
          GMTrace.o(18308908711936L, 136412);
        }
      });
    }
    GMTrace.o(18309445582848L, 136416);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */