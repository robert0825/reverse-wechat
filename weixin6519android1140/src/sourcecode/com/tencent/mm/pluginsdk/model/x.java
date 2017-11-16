package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class x
  extends t
{
  public x()
  {
    GMTrace.i(752021929984L, 5603);
    GMTrace.o(752021929984L, 5603);
  }
  
  public final boolean Og(String paramString)
  {
    GMTrace.i(752290365440L, 5605);
    if ((paramString != null) && ("com.tencent.map".equals(paramString)))
    {
      GMTrace.o(752290365440L, 5605);
      return true;
    }
    GMTrace.o(752290365440L, 5605);
    return false;
  }
  
  public final String Pn()
  {
    GMTrace.i(752424583168L, 5606);
    GMTrace.o(752424583168L, 5606);
    return "http://softroute.map.qq.com/downloadfile?cid=00008&referer=wx_client";
  }
  
  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    GMTrace.i(752827236352L, 5609);
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null))
    {
      GMTrace.o(752827236352L, 5609);
      return null;
    }
    paramContext = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
    if (paramContext != null)
    {
      paramResolveInfo = paramContext.toString();
      paramResolveInfo = Pattern.compile("\\(.*推荐.*\\)", 2).matcher(paramResolveInfo);
      if (paramResolveInfo.find())
      {
        paramContext = paramResolveInfo.replaceAll("");
        GMTrace.o(752827236352L, 5609);
        return paramContext;
      }
      paramContext = paramContext.toString();
      GMTrace.o(752827236352L, 5609);
      return paramContext;
    }
    GMTrace.o(752827236352L, 5609);
    return null;
  }
  
  public final String bJc()
  {
    GMTrace.i(752558800896L, 5607);
    GMTrace.o(752558800896L, 5607);
    return "TencentMap.apk";
  }
  
  public final u.a bJd()
  {
    GMTrace.i(752693018624L, 5608);
    u.a locala = new u.a();
    locala.tns = R.l.eet;
    String str = g.ut().getValue("QQMapDownloadTips");
    if (!bg.nm(str)) {
      locala.tnt = str;
    }
    locala.tnu = R.l.eeu;
    locala.tnr = R.g.aXm;
    GMTrace.o(752693018624L, 5608);
    return locala;
  }
  
  public final boolean dI(Context paramContext)
  {
    GMTrace.i(752156147712L, 5604);
    Object localObject = new Intent("android.intent.action.VIEW", Uri.parse("sosomap://type=nav"));
    paramContext = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0);
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      int j = paramContext.size();
      int i = 0;
      while (i < j)
      {
        localObject = (ResolveInfo)paramContext.get(i);
        if ((localObject != null) && (((ResolveInfo)localObject).activityInfo != null) && ("com.tencent.map".equals(((ResolveInfo)localObject).activityInfo.packageName)))
        {
          GMTrace.o(752156147712L, 5604);
          return true;
        }
        i += 1;
      }
    }
    GMTrace.o(752156147712L, 5604);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */