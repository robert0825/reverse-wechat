package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;

public final class i
  extends com.tencent.mm.sdk.e.i<h>
{
  public static final String[] hIQ;
  
  static
  {
    GMTrace.i(19690680221696L, 146707);
    hIQ = new String[] { com.tencent.mm.sdk.e.i.a(h.hIP, "PkgUpdateStats") };
    GMTrace.o(19690680221696L, 146707);
  }
  
  public i(e parame)
  {
    super(parame, h.hIP, "PkgUpdateStats", h.eZt);
    GMTrace.i(19690411786240L, 146705);
    GMTrace.o(19690411786240L, 146705);
  }
  
  final boolean T(String paramString, int paramInt)
  {
    GMTrace.i(19690546003968L, 146706);
    h localh = new h();
    localh.field_key = paramString;
    localh.field_version = paramInt;
    boolean bool = super.a(localh, h.hIO);
    GMTrace.o(19690546003968L, 146706);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */