package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.u;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.appcache.x.a;
import com.tencent.mm.plugin.appbrand.c.k;
import com.tencent.mm.plugin.appbrand.c.k.a;
import com.tencent.mm.plugin.appbrand.compat.a.g;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.j.c;
import com.tencent.mm.plugin.appbrand.j.c.a;
import com.tencent.mm.plugin.appbrand.k.f;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.io.File;

public final class b
  implements a
{
  public b()
  {
    GMTrace.i(16168135950336L, 120462);
    GMTrace.o(16168135950336L, 120462);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    int i = 2;
    boolean bool = false;
    GMTrace.i(16168270168064L, 120463);
    if (!com.tencent.mm.sdk.a.b.bPq())
    {
      GMTrace.o(16168270168064L, 120463);
      return true;
    }
    if ("//wxafts".equals(paramArrayOfString[0]))
    {
      if (paramArrayOfString[1].contains("delete"))
      {
        paramContext = c.a.izs;
        com.tencent.mm.a.e.f(new File(((g)h.h(g.class)).Ko()));
        w.i("MicroMsg.WxaFTSSearchCore", "forceUnzipBasicTemplate");
        paramContext.prepare();
      }
      GMTrace.o(16168270168064L, 120463);
      return true;
    }
    if ("//localwxalibrary".equals(paramArrayOfString[0]))
    {
      paramContext = ab.bPV();
      paramArrayOfString = paramArrayOfString[1];
      switch (paramArrayOfString.hashCode())
      {
      default: 
        i = -1;
        label158:
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        GMTrace.o(16168270168064L, 120463);
        return true;
        if (!paramArrayOfString.equals("clear")) {
          break;
        }
        i = 0;
        break label158;
        if (!paramArrayOfString.equals("true")) {
          break;
        }
        i = 1;
        break label158;
        if (!paramArrayOfString.equals("false")) {
          break;
        }
        break label158;
        paramContext.edit().remove("localwxalibrary").commit();
        continue;
        paramContext.edit().putBoolean("localwxalibrary", true).commit();
        continue;
        paramContext.edit().putBoolean("localwxalibrary", false).commit();
      }
    }
    if ("//getsearchshowoutwxaapp".equals(paramArrayOfString[0]))
    {
      if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].contains("daily"))) {
        k.ih(k.a.hNh);
      }
      for (;;)
      {
        GMTrace.o(16168270168064L, 120463);
        return true;
        k.ih(k.a.hNi);
      }
    }
    if ("//callsearchshowoutwxaapp".equals(paramArrayOfString[0]))
    {
      ((f)h.h(f.class)).TL();
      GMTrace.o(16168270168064L, 120463);
      return true;
    }
    paramContext = paramArrayOfString[1].toLowerCase();
    i = -1;
    switch (paramContext.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(16168270168064L, 120463);
      return true;
      if (!paramContext.equals("deletebetalib")) {
        break;
      }
      i = 0;
      break;
      if (!paramContext.equals("deletelib")) {
        break;
      }
      i = 1;
      break;
      if (!paramContext.equals("prunepkg")) {
        break;
      }
      i = 2;
      break;
      if (!paramContext.equals("deletecontact")) {
        break;
      }
      i = 3;
      break;
      if (!paramContext.equals("historycount")) {
        break;
      }
      i = 4;
      break;
      if (!paramContext.equals("resetsyncversion")) {
        break;
      }
      i = 5;
      break;
      if (!paramContext.equals("sync")) {
        break;
      }
      i = 6;
      break;
      if (!paramContext.equals("starmax")) {
        break;
      }
      i = 7;
      break;
      if (!paramContext.equals("guide")) {
        break;
      }
      i = 8;
      break;
      if (!paramContext.equals("clearguide")) {
        break;
      }
      i = 9;
      break;
      if (!paramContext.equals("releasepkghighversion")) {
        break;
      }
      i = 10;
      break;
      if (!paramContext.equals("incremental_insert_24")) {
        break;
      }
      i = 11;
      break;
      if (!paramContext.equals("incremental_insert_28")) {
        break;
      }
      i = 12;
      break;
      if (!paramContext.equals("incremental_delete_28")) {
        break;
      }
      i = 13;
      break;
      if (!paramContext.equals("incremental_delete_latest")) {
        break;
      }
      i = 14;
      break;
      paramContext = com.tencent.mm.plugin.appbrand.app.e.Sl();
      paramArrayOfString = new com.tencent.mm.plugin.appbrand.appcache.t();
      paramArrayOfString.field_appId = "@LibraryAppId";
      paramArrayOfString.field_debugType = 999;
      paramArrayOfString.field_version = 1;
      paramContext.hKo.a(paramArrayOfString, com.tencent.mm.plugin.appbrand.appcache.t.hJV);
      com.tencent.mm.plugin.appbrand.task.d.jy(2);
      continue;
      com.tencent.mm.plugin.appbrand.app.e.Sl().X("@LibraryAppId", 0);
      com.tencent.mm.plugin.appbrand.task.d.jy(2);
      continue;
      u.SV();
      continue;
      q.py(paramArrayOfString[2]);
      continue;
      if (bg.getInt(paramArrayOfString[2].trim(), 0) > 0) {
        bool = true;
      }
      h.xy().xh().a(w.a.vuC, Boolean.valueOf(bool));
      continue;
      q.px(paramArrayOfString[2]);
      continue;
      r.pC(paramArrayOfString[2]);
      continue;
      com.tencent.mm.plugin.appbrand.c.g.hMX = Integer.valueOf(Math.max(0, bg.getInt(paramArrayOfString[2], 10)));
      continue;
      com.tencent.mm.bj.d.x(ab.getContext(), "appbrand", ".ui.AppBrandGuideUI");
      continue;
      h.xy().xh().a(w.a.vuB, Boolean.valueOf(false));
      continue;
      paramContext = paramArrayOfString[2];
      try
      {
        paramArrayOfString = new WxaAttributes.d();
        paramArrayOfString.eVc = 1000;
        paramArrayOfString.hIw = "fake";
        com.tencent.mm.plugin.appbrand.app.e.Sl().a(paramContext, paramArrayOfString);
      }
      catch (Exception paramContext) {}
      continue;
      paramContext = new com.tencent.mm.plugin.appbrand.appcache.t();
      paramContext.field_appId = "wx4ffb369b6881ee5e";
      paramContext.field_version = 24;
      paramContext.field_versionMd5 = "a47b978d23679075cbbed1030f71b7bb";
      paramContext.field_versionState = 0;
      paramContext.field_debugType = 0;
      paramContext.field_pkgPath = "/sdcard/_276854502_24.wxapkg";
      com.tencent.mm.plugin.appbrand.app.e.Sl().d(paramContext);
      continue;
      paramContext = new com.tencent.mm.plugin.appbrand.appcache.t();
      paramContext.field_appId = "wx4ffb369b6881ee5e";
      paramContext.field_version = 28;
      paramContext.field_versionMd5 = "5713e70880cc2d356905d6189ba37a72";
      paramContext.field_versionState = 0;
      paramContext.field_debugType = 0;
      paramContext.field_pkgPath = "/sdcard/_276854502_28.wxapkg";
      com.tencent.mm.plugin.appbrand.app.e.Sl().d(paramContext);
      continue;
      paramContext = new com.tencent.mm.plugin.appbrand.appcache.t();
      paramContext.field_appId = "wx4ffb369b6881ee5e";
      paramContext.field_version = 28;
      paramContext.field_debugType = 0;
      com.tencent.mm.plugin.appbrand.app.e.Sl().a(paramContext);
      continue;
      paramContext = com.tencent.mm.plugin.appbrand.app.e.Sl();
      paramArrayOfString = paramContext.a("wx4ffb369b6881ee5e", 0, new String[] { "version" });
      if (paramArrayOfString != null) {
        paramContext.a(paramArrayOfString);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */