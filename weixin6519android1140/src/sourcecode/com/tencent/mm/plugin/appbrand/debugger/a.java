package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.v.c;
import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public final class a
  implements v.c, DebuggerShell.a
{
  public a()
  {
    GMTrace.i(19695914713088L, 146746);
    GMTrace.o(19695914713088L, 146746);
  }
  
  public final String name()
  {
    GMTrace.i(19696183148544L, 146748);
    GMTrace.o(19696183148544L, 146748);
    return "ForceKillAppNotify";
  }
  
  public final void q(Map<String, String> paramMap)
  {
    GMTrace.i(19696048930816L, 146747);
    if (DebuggerShell.UK())
    {
      String str = (String)paramMap.get(".sysmsg.AppBrandForceKill.AppId");
      int i = bg.getInt((String)paramMap.get(".sysmsg.AppBrandForceKill.VersionType"), 0);
      if (bg.nm(str))
      {
        GMTrace.o(19696048930816L, 146747);
        return;
      }
      d.as(str, i);
    }
    GMTrace.o(19696048930816L, 146747);
  }
  
  public final void t(Intent paramIntent)
  {
    GMTrace.i(19696317366272L, 146749);
    d.as(paramIntent.getStringExtra("appId"), paramIntent.getIntExtra("versionType", 0));
    GMTrace.o(19696317366272L, 146749);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\debugger\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */