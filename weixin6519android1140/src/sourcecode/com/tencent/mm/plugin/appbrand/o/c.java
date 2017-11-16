package com.tencent.mm.plugin.appbrand.o;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public String appId;
  public au.a iGr;
  
  public c()
  {
    GMTrace.i(17320260927488L, 129046);
    this.iGr = new au.a()
    {
      public final void abx()
      {
        GMTrace.i(17320126709760L, 129045);
        w.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onScreenShot callback");
        j.qg(c.this.appId);
        GMTrace.o(17320126709760L, 129045);
      }
    };
    GMTrace.o(17320260927488L, 129046);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */