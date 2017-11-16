package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.v.c;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class b
  implements v.c, DebuggerShell.a
{
  public b()
  {
    GMTrace.i(19696451584000L, 146750);
    GMTrace.o(19696451584000L, 146750);
  }
  
  public final String name()
  {
    GMTrace.i(19696720019456L, 146752);
    GMTrace.o(19696720019456L, 146752);
    return "ForceOpenAppNotify";
  }
  
  public final void q(Map<String, String> paramMap)
  {
    GMTrace.i(19696585801728L, 146751);
    if (DebuggerShell.UK())
    {
      String str1 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
      String str2 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.UserName");
      int i = bg.getInt((String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), -1);
      int j = bg.getInt((String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppVersion"), -1);
      String str3 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.Path");
      String str4 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.URL");
      paramMap = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.MD5");
      if (i < 0)
      {
        GMTrace.o(19696585801728L, 146751);
        return;
      }
      if (i != 0)
      {
        if (e.Sl() == null)
        {
          GMTrace.o(19696585801728L, 146751);
          return;
        }
        if ((bg.nm(str4)) || (bg.nm(paramMap)))
        {
          GMTrace.o(19696585801728L, 146751);
          return;
        }
        if (e.Sl().a(str1, i, str4, paramMap, bg.Pu(), bg.Pu() + 432000L)) {
          d.as(str1, i);
        }
      }
      w.i("MicroMsg.AppBrand.ForceOpenAppNotify", "before start weapp");
      qi localqi = new qi();
      localqi.eUY.appId = str1;
      localqi.eUY.userName = str2;
      localqi.eUY.eVb = i;
      localqi.eUY.eVa = str3;
      localqi.eUY.eVc = j;
      localqi.eUY.eIP = str4;
      localqi.eUY.eVd = paramMap;
      localqi.eUY.eVe = false;
      localqi.eUY.scene = 1030;
      a.vgX.m(localqi);
    }
    GMTrace.o(19696585801728L, 146751);
  }
  
  public final void t(Intent paramIntent)
  {
    GMTrace.i(19696854237184L, 146753);
    String str = paramIntent.getStringExtra("appId");
    int i = paramIntent.getIntExtra("versionType", 0);
    paramIntent = new AppBrandStatObject();
    paramIntent.scene = 1030;
    ((c)h.h(c.class)).a(null, null, str, i, 0, null, paramIntent);
    GMTrace.o(19696854237184L, 146753);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\debugger\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */