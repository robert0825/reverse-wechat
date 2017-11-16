package com.tencent.mm.plugin.appbrand.dynamic.g;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.BaseIPCService;
import com.tencent.mm.ipcinvoker.a;
import com.tencent.mm.ipcinvoker.d;
import com.tencent.mm.ipcinvoker.j;
import com.tencent.mm.sdk.platformtools.w;

public class c
  implements a
{
  public c()
  {
    GMTrace.i(18309848236032L, 136419);
    GMTrace.o(18309848236032L, 136419);
  }
  
  public final void a(Bundle paramBundle, com.tencent.mm.ipcinvoker.c paramc)
  {
    GMTrace.i(18309982453760L, 136420);
    paramBundle = d.vP();
    paramc = j.vQ().eq(paramBundle);
    if (paramc != null)
    {
      w.i("MicroMsg.IPCInvokeTask_KillAllProcess", "killSelf process(%s)", new Object[] { paramBundle });
      paramc.aZ(true);
    }
    GMTrace.o(18309982453760L, 136420);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */