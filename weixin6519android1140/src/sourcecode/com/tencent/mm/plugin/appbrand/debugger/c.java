package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;

final class c
  implements DebuggerShell.a
{
  c()
  {
    GMTrace.i(19698330632192L, 146764);
    GMTrace.o(19698330632192L, 146764);
  }
  
  public final String name()
  {
    GMTrace.i(19698464849920L, 146765);
    GMTrace.o(19698464849920L, 146765);
    return "LaunchApp";
  }
  
  public final void t(Intent paramIntent)
  {
    GMTrace.i(19698599067648L, 146766);
    String str1 = paramIntent.getStringExtra("username");
    String str2 = paramIntent.getStringExtra("appId");
    String str3 = paramIntent.getStringExtra("path");
    int i = paramIntent.getIntExtra("versionType", 0);
    int j = paramIntent.getIntExtra("scene", 1030);
    paramIntent = paramIntent.getStringExtra("sceneNote");
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = j;
    localAppBrandStatObject.eAv = paramIntent;
    ((com.tencent.mm.plugin.appbrand.k.c)h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(ab.getContext(), str1, str2, i, 0, str3, localAppBrandStatObject);
    GMTrace.o(19698599067648L, 146766);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\debugger\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */