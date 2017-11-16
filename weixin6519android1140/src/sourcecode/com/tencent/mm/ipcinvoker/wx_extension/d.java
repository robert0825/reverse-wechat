package com.tencent.mm.ipcinvoker.wx_extension;

import android.app.Application;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.f.1;
import com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.mm.ipcinvoker.wx_extension.service.SupportProcessIPCService;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class d
  implements com.tencent.mm.kernel.b.b
{
  public d()
  {
    GMTrace.i(18683644608512L, 139204);
    Application localApplication = ((com.tencent.mm.kernel.b.f)h.xv().wZ()).gap;
    com.tencent.mm.ipcinvoker.a.a local1 = new com.tencent.mm.ipcinvoker.a.a()
    {
      public final void a(com.tencent.mm.ipcinvoker.a.c paramAnonymousc)
      {
        GMTrace.i(18684718350336L, 139212);
        paramAnonymousc.b("com.tencent.mm", MainProcessIPCService.class);
        paramAnonymousc.b("com.tencent.mm:tools", ToolsProcessIPCService.class);
        paramAnonymousc.b("com.tencent.mm:support", SupportProcessIPCService.class);
        GMTrace.o(18684718350336L, 139212);
      }
      
      public final void a(com.tencent.mm.ipcinvoker.a.d paramAnonymousd)
      {
        GMTrace.i(18684584132608L, 139211);
        super.a(paramAnonymousd);
        paramAnonymousd.a(new c());
        paramAnonymousd.a(new a());
        GMTrace.o(18684584132608L, 139211);
      }
    };
    Assert.assertNotNull(localApplication);
    com.tencent.mm.ipcinvoker.d.fVo = localApplication;
    local1.a(new f.1());
    local1.a(com.tencent.mm.ipcinvoker.b.vN());
    w.i("IPC.IPCInvokerBoot", "setup IPCInvoker(process : %s, application : %s)", new Object[] { com.tencent.mm.ipcinvoker.d.vP(), Integer.valueOf(localApplication.hashCode()) });
    if (ab.bQa()) {
      com.tencent.mm.ipcinvoker.f.en("com.tencent.mm:tools");
    }
    GMTrace.o(18683644608512L, 139204);
  }
  
  private static final class a
  {
    public static final d fVX;
    
    static
    {
      GMTrace.i(18683778826240L, 139205);
      fVX = new d();
      GMTrace.o(18683778826240L, 139205);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\wx_extension\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */