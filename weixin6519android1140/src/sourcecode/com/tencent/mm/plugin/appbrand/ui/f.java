package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c;

final class f
  extends com.tencent.mm.plugin.appbrand.b.e
{
  private com.tencent.mm.plugin.appbrand.f iCE;
  
  f(Activity paramActivity, com.tencent.mm.plugin.appbrand.f paramf)
  {
    super(paramActivity);
    GMTrace.i(17307241807872L, 128949);
    this.iCE = paramf;
    GMTrace.o(17307241807872L, 128949);
  }
  
  protected final void Th()
  {
    GMTrace.i(18835847512064L, 140338);
    com.tencent.mm.plugin.appbrand.e locale = this.iCE.RO();
    if (locale != null) {
      locale.hyU.hKO.ib(10);
    }
    GMTrace.o(18835847512064L, 140338);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */