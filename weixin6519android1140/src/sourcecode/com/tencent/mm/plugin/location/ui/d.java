package com.tencent.mm.plugin.location.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public final class d
{
  public Context context;
  public int gPO;
  private ActivityManager kYh;
  public int myQ;
  public int myR;
  public boolean myS;
  
  public d(Context paramContext)
  {
    GMTrace.i(9656562876416L, 71947);
    this.myQ = 0;
    this.myR = 0;
    this.gPO = -1;
    this.myS = false;
    this.context = paramContext;
    this.kYh = ((ActivityManager)paramContext.getSystemService("activity"));
    GMTrace.o(9656562876416L, 71947);
  }
  
  private static Intent a(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    GMTrace.i(9656965529600L, 71950);
    if ((paramBoolean) || (!paramLocationInfo2.aKd()))
    {
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.mwH + "," + paramLocationInfo1.mwI + "?z=" + paramLocationInfo1.zoom));
      paramContext.setPackage("com.tencent.map");
      GMTrace.o(9656965529600L, 71950);
      return paramContext;
    }
    String str2 = String.format("sosomap://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.mwI), Double.valueOf(paramLocationInfo2.mwH), Double.valueOf(paramLocationInfo1.mwI), Double.valueOf(paramLocationInfo1.mwH) });
    String str1 = str2;
    if (!bg.nm(paramLocationInfo2.mwJ))
    {
      paramLocationInfo2 = URLEncoder.encode(paramLocationInfo2.mwJ);
      str1 = str2 + String.format("&from=%s", new Object[] { paramLocationInfo2 });
    }
    paramLocationInfo2 = str1;
    if (!bg.nm(paramLocationInfo1.mwJ))
    {
      paramLocationInfo2 = URLEncoder.encode(paramLocationInfo1.mwJ);
      paramLocationInfo2 = str1 + String.format("&to=%s", new Object[] { paramLocationInfo2 });
    }
    paramLocationInfo2 = paramLocationInfo2 + "&referer=wx_client";
    w.d("MicroMsg.MapHelper", "tencentluxian, url=%s", new Object[] { paramLocationInfo2 });
    paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse(paramLocationInfo2));
    paramLocationInfo2.setPackage("com.tencent.map");
    if (bg.j(paramContext, paramLocationInfo2))
    {
      GMTrace.o(9656965529600L, 71950);
      return paramLocationInfo2;
    }
    paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.mwH + "," + paramLocationInfo1.mwI));
    paramContext.setPackage("com.tencent.map");
    GMTrace.o(9656965529600L, 71950);
    return paramContext;
  }
  
  private static Intent a(Context paramContext, LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean, String paramString)
  {
    GMTrace.i(9657099747328L, 71951);
    if ((paramBoolean) || (!paramLocationInfo2.aKd()))
    {
      paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.mwH + "," + paramLocationInfo1.mwI + "?z=" + paramLocationInfo1.zoom));
      paramContext.setPackage(paramString);
      GMTrace.o(9657099747328L, 71951);
      return paramContext;
    }
    String str2 = String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[] { Double.valueOf(paramLocationInfo2.mwH), Double.valueOf(paramLocationInfo2.mwI), Double.valueOf(paramLocationInfo1.mwH), Double.valueOf(paramLocationInfo1.mwI) });
    String str1 = str2;
    if (!bg.nm(paramLocationInfo2.mwJ))
    {
      str1 = str2;
      if (!bg.nm(paramLocationInfo1.mwJ)) {
        str1 = str2 + String.format("&from=%s&to=%s", new Object[] { paramLocationInfo2.mwJ, paramLocationInfo1.mwJ });
      }
    }
    paramLocationInfo2 = new Intent("android.intent.action.VIEW", Uri.parse(str1));
    paramLocationInfo2.setPackage(paramString);
    if (bg.j(paramContext, paramLocationInfo2))
    {
      GMTrace.o(9657099747328L, 71951);
      return paramLocationInfo2;
    }
    paramContext = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.mwH + "," + paramLocationInfo1.mwI));
    paramContext.setPackage(paramString);
    GMTrace.o(9657099747328L, 71951);
    return paramContext;
  }
  
  private static Intent a(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    GMTrace.i(9656697094144L, 71948);
    if ((paramBoolean) || (!paramLocationInfo2.aKd()))
    {
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.mwH + "," + paramLocationInfo1.mwI + "?z=" + paramLocationInfo1.zoom));
      paramLocationInfo1.setPackage("com.baidu.BaiduMap");
      GMTrace.o(9656697094144L, 71948);
      return paramLocationInfo1;
    }
    paramLocationInfo1 = String.format("intent://map/direction?origin=%f,%f&destination=%f,%f&mode=driving&coord_type=gcj02", new Object[] { Double.valueOf(paramLocationInfo2.mwH), Double.valueOf(paramLocationInfo2.mwI), Double.valueOf(paramLocationInfo1.mwH), Double.valueOf(paramLocationInfo1.mwI) });
    w.d("MicroMsg.MapHelper", "url " + paramLocationInfo1);
    try
    {
      paramLocationInfo1 = paramLocationInfo1 + "&referer=tencent|weixin#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end";
      w.d("MicroMsg.MapHelper", "all: " + paramLocationInfo1);
      paramLocationInfo1 = Intent.getIntent(paramLocationInfo1);
      GMTrace.o(9656697094144L, 71948);
      return paramLocationInfo1;
    }
    catch (URISyntaxException paramLocationInfo1)
    {
      w.printErrStackTrace("MicroMsg.MapHelper", paramLocationInfo1, "", new Object[0]);
      GMTrace.o(9656697094144L, 71948);
    }
    return null;
  }
  
  private static Intent b(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, boolean paramBoolean)
  {
    GMTrace.i(9656831311872L, 71949);
    if ((paramBoolean) || (!paramLocationInfo2.aKd()))
    {
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + paramLocationInfo1.mwH + "," + paramLocationInfo1.mwI + "?z=" + paramLocationInfo1.zoom));
      paramLocationInfo1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      GMTrace.o(9656831311872L, 71949);
      return paramLocationInfo1;
    }
    if (bg.nm(paramLocationInfo1.mwK)) {}
    for (String str = "zh-cn";; str = paramLocationInfo1.mwK)
    {
      paramLocationInfo1 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + str, new Object[] { Double.valueOf(paramLocationInfo2.mwH), Double.valueOf(paramLocationInfo2.mwI), Double.valueOf(paramLocationInfo1.mwH), Double.valueOf(paramLocationInfo1.mwI) })));
      paramLocationInfo1.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
      GMTrace.o(9656831311872L, 71949);
      return paramLocationInfo1;
    }
  }
  
  public static int fE(boolean paramBoolean)
  {
    GMTrace.i(9656428658688L, 71946);
    w.d("MicroMsg.MapHelper", "getDefaultZoom isGoogle : false");
    GMTrace.o(9656428658688L, 71946);
    return 16;
  }
  
  public final void a(LocationInfo paramLocationInfo1, LocationInfo paramLocationInfo2, String paramString, boolean paramBoolean)
  {
    GMTrace.i(14561549746176L, 108492);
    if ("com.tencent.map".equals(paramString)) {
      if (paramBoolean) {
        g.ork.i(11091, new Object[] { Integer.valueOf(4), Integer.valueOf(2) });
      }
    }
    PackageManager localPackageManager;
    Object localObject;
    for (;;)
    {
      localPackageManager = this.context.getPackageManager();
      if (!"com.google.android.apps.maps".equals(paramString)) {
        break;
      }
      localObject = b(paramLocationInfo1, paramLocationInfo2, false);
      paramString = (String)localObject;
      if (!bg.j(this.context, (Intent)localObject)) {
        paramString = b(paramLocationInfo1, paramLocationInfo2, true);
      }
      g.ork.i(10997, new Object[] { "4", "", Integer.valueOf(0), Integer.valueOf(0) });
      this.context.startActivity(paramString);
      GMTrace.o(14561549746176L, 108492);
      return;
      g.ork.i(11091, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
      continue;
      if (paramBoolean) {
        g.ork.i(11091, new Object[] { Integer.valueOf(5), Integer.valueOf(2) });
      } else {
        g.ork.i(11091, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
      }
    }
    if ("com.baidu.BaiduMap".equals(paramString))
    {
      localObject = a(paramLocationInfo1, paramLocationInfo2, false);
      paramString = (String)localObject;
      if (!bg.j(this.context, (Intent)localObject)) {
        paramString = a(paramLocationInfo1, paramLocationInfo2, true);
      }
      paramLocationInfo1 = e.an(this.context, "com.baidu.BaiduMap").applicationInfo.loadLabel(localPackageManager).toString();
      g.ork.i(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
      this.context.startActivity(paramString);
      GMTrace.o(14561549746176L, 108492);
      return;
    }
    if ("com.tencent.map".equals(paramString))
    {
      localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, false);
      paramString = (String)localObject;
      if (!bg.j(this.context, (Intent)localObject)) {
        paramString = a(this.context, paramLocationInfo1, paramLocationInfo2, true);
      }
      g.ork.i(10997, new Object[] { "2", "", Integer.valueOf(0), Integer.valueOf(0) });
      this.context.startActivity(paramString);
      GMTrace.o(14561549746176L, 108492);
      return;
    }
    PackageInfo localPackageInfo;
    Intent localIntent;
    if ("com.autonavi.minimap".equals(paramString))
    {
      localPackageInfo = e.an(this.context, paramString);
      if (localPackageInfo != null)
      {
        localIntent = a(this.context, paramLocationInfo1, paramLocationInfo2, false, paramString);
        localObject = localIntent;
        if (!bg.j(this.context, localIntent)) {
          localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, true, paramString);
        }
        paramLocationInfo1 = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
        g.ork.i(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity((Intent)localObject);
      }
      GMTrace.o(14561549746176L, 108492);
      return;
    }
    if ("com.sogou.map.android.maps".equals(paramString))
    {
      localPackageInfo = e.an(this.context, paramString);
      if (localPackageInfo != null)
      {
        localIntent = a(this.context, paramLocationInfo1, paramLocationInfo2, false, paramString);
        localObject = localIntent;
        if (!bg.j(this.context, localIntent)) {
          localObject = a(this.context, paramLocationInfo1, paramLocationInfo2, true, paramString);
        }
        paramLocationInfo1 = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
        g.ork.i(10997, new Object[] { "5", paramLocationInfo1, Integer.valueOf(0), Integer.valueOf(0) });
        this.context.startActivity((Intent)localObject);
      }
    }
    GMTrace.o(14561549746176L, 108492);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\location\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */