package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.List;

public final class a
  extends t
{
  private final a tmx;
  private final Intent tmy;
  private final x tmz;
  
  public a(Bundle paramBundle)
  {
    GMTrace.i(765712138240L, 5705);
    this.tmz = new x();
    if ((paramBundle == null) || (paramBundle.getParcelable("key_target_intent") == null)) {
      this.tmx = a.tmB;
    }
    while (this.tmx == a.tmB)
    {
      this.tmy = null;
      GMTrace.o(765712138240L, 5705);
      return;
      a locala = a.yJ(paramBundle.getInt("key_map_app", a.tmB.code));
      if (a(ab.getContext(), locala, null) == null) {
        this.tmx = a.tmB;
      } else {
        this.tmx = locala;
      }
    }
    this.tmy = ((Intent)paramBundle.getParcelable("key_target_intent"));
    GMTrace.o(765712138240L, 5705);
  }
  
  private static ResolveInfo a(Context paramContext, a parama, Intent paramIntent)
  {
    GMTrace.i(765846355968L, 5706);
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[] { Float.valueOf(0.0F), Float.valueOf(0.0F) })));
    }
    paramContext = paramContext.getPackageManager().queryIntentActivities(localIntent, 0);
    if (bg.cc(paramContext))
    {
      GMTrace.o(765846355968L, 5706);
      return null;
    }
    paramContext = paramContext.iterator();
    while (paramContext.hasNext())
    {
      paramIntent = (ResolveInfo)paramContext.next();
      if ((paramIntent != null) && (paramIntent.activityInfo != null) && (parama.getPackage().equals(paramIntent.activityInfo.packageName)))
      {
        GMTrace.o(765846355968L, 5706);
        return paramIntent;
      }
    }
    GMTrace.o(765846355968L, 5706);
    return null;
  }
  
  public final boolean Og(String paramString)
  {
    GMTrace.i(766114791424L, 5708);
    boolean bool = this.tmx.getPackage().equals(paramString);
    GMTrace.o(766114791424L, 5708);
    return bool;
  }
  
  public final String Pn()
  {
    GMTrace.i(766249009152L, 5709);
    if (this.tmx == a.tmB)
    {
      GMTrace.o(766249009152L, 5709);
      return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
    }
    GMTrace.o(766249009152L, 5709);
    return null;
  }
  
  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    GMTrace.i(766651662336L, 5712);
    paramContext = this.tmz.a(paramContext, paramResolveInfo);
    GMTrace.o(766651662336L, 5712);
    return paramContext;
  }
  
  public final String bJc()
  {
    GMTrace.i(766383226880L, 5710);
    if (this.tmx == a.tmB)
    {
      GMTrace.o(766383226880L, 5710);
      return "TencentMap.apk";
    }
    GMTrace.o(766383226880L, 5710);
    return null;
  }
  
  public final u.a bJd()
  {
    GMTrace.i(766517444608L, 5711);
    if (this.tmx == a.tmB)
    {
      locala = this.tmz.bJd();
      GMTrace.o(766517444608L, 5711);
      return locala;
    }
    u.a locala = new u.a();
    locala.tnu = -1;
    locala.tnr = -1;
    ResolveInfo localResolveInfo = a(ab.getContext(), this.tmx, this.tmy);
    if (localResolveInfo != null) {
      locala.tnv = a(ab.getContext(), localResolveInfo);
    }
    GMTrace.o(766517444608L, 5711);
    return locala;
  }
  
  public final boolean dI(Context paramContext)
  {
    GMTrace.i(765980573696L, 5707);
    if (this.tmx == a.tmB)
    {
      boolean bool = this.tmz.dI(paramContext);
      GMTrace.o(765980573696L, 5707);
      return bool;
    }
    if (a(paramContext, this.tmx, this.tmy) != null)
    {
      GMTrace.o(765980573696L, 5707);
      return true;
    }
    GMTrace.o(765980573696L, 5707);
    return false;
  }
  
  public static enum a
  {
    public final int code;
    
    static
    {
      GMTrace.i(773765201920L, 5765);
      tmB = new a("TencentMap", 0, 0);
      tmC = new a("GoogleMap", 1, 1);
      tmD = new a("SogouMap", 2, 2);
      tmE = new a("BaiduMap", 3, 3);
      tmF = new a("AutonaviMap", 4, 4);
      tmG = new a[] { tmB, tmC, tmD, tmE, tmF };
      GMTrace.o(773765201920L, 5765);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(773362548736L, 5762);
      this.code = paramInt;
      GMTrace.o(773362548736L, 5762);
    }
    
    public static a yJ(int paramInt)
    {
      GMTrace.i(773630984192L, 5764);
      switch (paramInt)
      {
      default: 
        locala = tmB;
        GMTrace.o(773630984192L, 5764);
        return locala;
      case 0: 
        locala = tmB;
        GMTrace.o(773630984192L, 5764);
        return locala;
      case 1: 
        locala = tmC;
        GMTrace.o(773630984192L, 5764);
        return locala;
      case 2: 
        locala = tmD;
        GMTrace.o(773630984192L, 5764);
        return locala;
      case 3: 
        locala = tmE;
        GMTrace.o(773630984192L, 5764);
        return locala;
      }
      a locala = tmF;
      GMTrace.o(773630984192L, 5764);
      return locala;
    }
    
    public final String getPackage()
    {
      GMTrace.i(773496766464L, 5763);
      switch (a.1.tmA[ordinal()])
      {
      default: 
        GMTrace.o(773496766464L, 5763);
        return "com.tencent.map";
      case 1: 
        GMTrace.o(773496766464L, 5763);
        return "com.tencent.map";
      case 2: 
        GMTrace.o(773496766464L, 5763);
        return "com.google.android.apps.maps";
      case 3: 
        GMTrace.o(773496766464L, 5763);
        return "com.sogou.map.android.maps";
      case 4: 
        GMTrace.o(773496766464L, 5763);
        return "com.baidu.BaiduMap";
      }
      GMTrace.o(773496766464L, 5763);
      return "com.autonavi.minimap";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */