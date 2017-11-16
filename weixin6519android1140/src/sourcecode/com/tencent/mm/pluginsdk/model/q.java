package com.tencent.mm.pluginsdk.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q
  extends t
{
  public static final String[] tnj;
  public static final int[] tnk;
  public static final int[] tnl;
  
  static
  {
    GMTrace.i(759538122752L, 5659);
    tnj = new String[] { "application/msword", "application/vnd.ms-powerpoint", "application/vnd.ms-excel", "application/pdf", "application/epub+zip", "text/plain", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/zip", "application/rar" };
    tnk = new int[] { R.k.cJs, R.k.cJh, R.k.cIZ, R.k.cJf, R.k.cIY, R.k.cJk, R.k.cJs, R.k.cIZ, R.k.cJh, R.k.cJj, R.k.cJj };
    tnl = new int[] { R.k.cJs, R.k.cJh, R.k.cIZ, R.k.cJf, R.k.cIY, R.k.cJk, R.k.cJs, R.k.cIZ, R.k.cJh, R.k.cJj, R.k.cJj };
    GMTrace.o(759538122752L, 5659);
  }
  
  public q()
  {
    GMTrace.i(757659074560L, 5645);
    GMTrace.o(757659074560L, 5645);
  }
  
  public static boolean On(String paramString)
  {
    GMTrace.i(757927510016L, 5647);
    String[] arrayOfString = tnj;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfString[i].equals(paramString))
      {
        GMTrace.o(757927510016L, 5647);
        return true;
      }
      i += 1;
    }
    GMTrace.o(757927510016L, 5647);
    return false;
  }
  
  public static int Oo(String paramString)
  {
    GMTrace.i(759403905024L, 5658);
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null)
    {
      localObject1 = localObject2;
      if (paramString.length() > 0) {
        localObject1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      }
    }
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((String)localObject1).length() != 0) {}
    }
    else
    {
      localObject2 = "*/" + paramString;
    }
    int i = 0;
    int j = -1;
    while (i < tnj.length)
    {
      if (tnj[i].equals(localObject2)) {
        j = i;
      }
      i += 1;
    }
    if (j != -1)
    {
      i = tnk[j];
      GMTrace.o(759403905024L, 5658);
      return i;
    }
    i = R.k.cJl;
    GMTrace.o(759403905024L, 5658);
    return i;
  }
  
  public static int aO(Context paramContext, String paramString)
  {
    GMTrace.i(758867034112L, 5654);
    if (paramContext == null)
    {
      GMTrace.o(758867034112L, 5654);
      return 3;
    }
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0)) {
      bool = false;
    }
    Object localObject1;
    Object localObject3;
    for (;;)
    {
      localObject2 = paramString;
      if (!bool) {
        localObject2 = "http://" + paramString;
      }
      try
      {
        paramString = Uri.parse((String)localObject2);
        int i;
        if (paramString == null)
        {
          GMTrace.o(758867034112L, 5654);
          return 2;
          localObject1 = paramString.trim();
          i = ((String)localObject1).toLowerCase().indexOf("://");
          int j = ((String)localObject1).toLowerCase().indexOf('.');
          if ((i > 0) && (j > 0) && (i > j)) {
            bool = false;
          } else {
            bool = ((String)localObject1).toLowerCase().contains("://");
          }
        }
        else
        {
          localObject1 = paramString;
          if (paramString.getScheme().toLowerCase().equals("qb"))
          {
            localObject1 = dK(paramContext);
            if (((a)localObject1).tnm != -1) {
              break label242;
            }
            i = 0;
          }
          for (;;)
          {
            localObject1 = paramString;
            if (i == 0) {
              localObject1 = Uri.parse("http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10375" + URLEncoder.encode((String)localObject2, "UTF-8"));
            }
            localObject3 = dK(paramContext);
            if (((a)localObject3).tnm != -1) {
              break;
            }
            GMTrace.o(758867034112L, 5654);
            return 4;
            label242:
            if (((a)localObject1).tnm == 2)
            {
              i = ((a)localObject1).ver;
              if (i < 42)
              {
                i = 0;
                continue;
              }
            }
            i = 1;
          }
          if (((a)localObject3).tnm != 2) {
            break label315;
          }
        }
      }
      catch (Exception paramContext)
      {
        GMTrace.o(758867034112L, 5654);
        return 2;
      }
    }
    if (((a)localObject3).ver < 33)
    {
      GMTrace.o(758867034112L, 5654);
      return 5;
    }
    label315:
    Object localObject2 = new Intent("android.intent.action.VIEW");
    if (((a)localObject3).tnm == 2) {
      if ((((a)localObject3).ver >= 33) && (((a)localObject3).ver <= 39))
      {
        ((Intent)localObject2).setClassName("com.tencent.mtt", "com.tencent.mtt.PhotoEditUI");
        paramString = (String)localObject2;
      }
    }
    for (;;)
    {
      paramString.setData((Uri)localObject1);
      try
      {
        paramString.putExtra("loginType", 24);
        paramString.putExtra("ChannelID", "com.tencent.mm");
        paramString.putExtra("PosID", 0);
        paramContext.startActivity(paramString);
        GMTrace.o(758867034112L, 5654);
        return 0;
      }
      catch (ActivityNotFoundException paramContext)
      {
        GMTrace.o(758867034112L, 5654);
      }
      if ((((a)localObject3).ver >= 40) && (((a)localObject3).ver <= 45))
      {
        ((Intent)localObject2).setClassName("com.tencent.mtt", "com.tencent.mtt.SplashActivity");
        paramString = (String)localObject2;
      }
      else
      {
        paramString = (String)localObject2;
        if (((a)localObject3).ver >= 46)
        {
          localObject2 = new Intent("com.tencent.QQBrowser.action.VIEW");
          localObject3 = c(paramContext, (Uri)localObject1);
          paramString = (String)localObject2;
          if (localObject3 != null)
          {
            paramString = (String)localObject2;
            if (!TextUtils.isEmpty(((b)localObject3).classname))
            {
              ((Intent)localObject2).setClassName(((b)localObject3).tno, ((b)localObject3).classname);
              paramString = (String)localObject2;
              continue;
              if (((a)localObject3).tnm == 1)
              {
                if (((a)localObject3).ver == 1)
                {
                  ((Intent)localObject2).setClassName("com.tencent.qbx5", "com.tencent.qbx5.PhotoEditUI");
                  paramString = (String)localObject2;
                }
                else
                {
                  paramString = (String)localObject2;
                  if (((a)localObject3).ver == 2)
                  {
                    ((Intent)localObject2).setClassName("com.tencent.qbx5", "com.tencent.qbx5.SplashActivity");
                    paramString = (String)localObject2;
                  }
                }
              }
              else if (((a)localObject3).tnm == 0)
              {
                if ((((a)localObject3).ver >= 4) && (((a)localObject3).ver <= 6))
                {
                  ((Intent)localObject2).setClassName("com.tencent.qbx", "com.tencent.qbx.SplashActivity");
                  paramString = (String)localObject2;
                }
                else
                {
                  paramString = (String)localObject2;
                  if (((a)localObject3).ver > 6)
                  {
                    localObject2 = new Intent("com.tencent.QQBrowser.action.VIEW");
                    localObject3 = c(paramContext, (Uri)localObject1);
                    paramString = (String)localObject2;
                    if (localObject3 != null)
                    {
                      paramString = (String)localObject2;
                      if (!TextUtils.isEmpty(((b)localObject3).classname))
                      {
                        ((Intent)localObject2).setClassName(((b)localObject3).tno, ((b)localObject3).classname);
                        paramString = (String)localObject2;
                      }
                    }
                  }
                }
              }
              else
              {
                localObject2 = new Intent("com.tencent.QQBrowser.action.VIEW");
                localObject3 = c(paramContext, (Uri)localObject1);
                paramString = (String)localObject2;
                if (localObject3 != null)
                {
                  paramString = (String)localObject2;
                  if (!TextUtils.isEmpty(((b)localObject3).classname))
                  {
                    ((Intent)localObject2).setClassName(((b)localObject3).tno, ((b)localObject3).classname);
                    paramString = (String)localObject2;
                  }
                }
              }
            }
          }
        }
      }
    }
    return 4;
  }
  
  private static b c(Context paramContext, Uri paramUri)
  {
    GMTrace.i(759135469568L, 5656);
    Object localObject = new Intent("com.tencent.QQBrowser.action.VIEW");
    ((Intent)localObject).setData(paramUri);
    paramUri = paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0);
    if (paramUri.size() <= 0)
    {
      GMTrace.o(759135469568L, 5656);
      return null;
    }
    paramContext = new b();
    paramUri = paramUri.iterator();
    while (paramUri.hasNext())
    {
      localObject = (ResolveInfo)paramUri.next();
      String str = ((ResolveInfo)localObject).activityInfo.packageName;
      if (str.contains("com.tencent.mtt"))
      {
        paramContext.classname = ((ResolveInfo)localObject).activityInfo.name;
        paramContext.tno = ((ResolveInfo)localObject).activityInfo.packageName;
        GMTrace.o(759135469568L, 5656);
        return paramContext;
      }
      if (str.contains("com.tencent.qbx"))
      {
        paramContext.classname = ((ResolveInfo)localObject).activityInfo.name;
        paramContext.tno = ((ResolveInfo)localObject).activityInfo.packageName;
      }
    }
    GMTrace.o(759135469568L, 5656);
    return paramContext;
  }
  
  public static boolean dJ(Context paramContext)
  {
    GMTrace.i(758061727744L, 5648);
    if (dK(paramContext).tnm == -1)
    {
      GMTrace.o(758061727744L, 5648);
      return false;
    }
    GMTrace.o(758061727744L, 5648);
    return true;
  }
  
  private static a dK(Context paramContext)
  {
    GMTrace.i(759001251840L, 5655);
    locala = new a();
    for (;;)
    {
      try
      {
        localPackageManager = paramContext.getPackageManager();
        localObject1 = null;
        try
        {
          localObject6 = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
          localObject1 = localObject6;
          locala.tnm = 2;
          localObject1 = localObject6;
          locala.tnn = "ADRQB_";
          Object localObject3 = localObject6;
          if (localObject6 != null)
          {
            localObject1 = localObject6;
            localObject3 = localObject6;
            if (((PackageInfo)localObject6).versionCode > 420000)
            {
              localObject1 = localObject6;
              locala.ver = ((PackageInfo)localObject6).versionCode;
              localObject1 = localObject6;
              locala.tnn += ((PackageInfo)localObject6).versionName.replaceAll("\\.", "");
              GMTrace.o(759001251840L, 5655);
              return locala;
            }
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException3)
        {
          localObject4 = localObject1;
        }
      }
      catch (Exception paramContext)
      {
        PackageManager localPackageManager;
        Object localObject1;
        Object localObject6;
        Object localObject4;
        PackageInfo localPackageInfo1;
        Object localObject2;
        continue;
      }
      try
      {
        localObject1 = localPackageManager.getPackageInfo("com.tencent.qbx", 0);
        localObject4 = localObject1;
        locala.tnm = 0;
        localObject4 = localObject1;
        locala.tnn = "ADRQBX_";
        paramContext = (Context)localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        try
        {
          localPackageInfo1 = localPackageManager.getPackageInfo("com.tencent.qbx5", 0);
          localObject4 = localPackageInfo1;
          locala.tnm = 1;
          localObject4 = localPackageInfo1;
          locala.tnn = "ADRQBX5_";
          paramContext = localPackageInfo1;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          localObject2 = localObject4;
          try
          {
            localObject4 = localPackageManager.getPackageInfo("com.tencent.mtt", 0);
            localObject2 = localObject4;
            locala.tnm = 2;
            localObject2 = localObject4;
            locala.tnn = "ADRQB_";
            paramContext = (Context)localObject4;
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException4)
          {
            try
            {
              PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo("com.tencent.mtt.x86", 0);
              localObject2 = localPackageInfo2;
              locala.tnm = 2;
              localObject2 = localPackageInfo2;
              locala.tnn = "ADRQB_";
              paramContext = localPackageInfo2;
            }
            catch (Exception localException)
            {
              Object localObject5 = localObject2;
              try
              {
                localObject6 = c(paramContext, Uri.parse("http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10375"));
                paramContext = (Context)localObject2;
                if (localObject6 == null) {
                  continue;
                }
                paramContext = (Context)localObject2;
                localObject5 = localObject2;
                if (TextUtils.isEmpty(((b)localObject6).tno)) {
                  continue;
                }
                localObject5 = localObject2;
                paramContext = localPackageManager.getPackageInfo(((b)localObject6).tno, 0);
                localObject5 = paramContext;
                locala.tnm = 2;
                localObject5 = paramContext;
                locala.tnn = "ADRQB_";
              }
              catch (Exception paramContext)
              {
                paramContext = (Context)localObject5;
              }
            }
          }
        }
      }
    }
    if (paramContext != null)
    {
      locala.ver = paramContext.versionCode;
      locala.tnn += paramContext.versionName.replaceAll("\\.", "");
    }
    GMTrace.o(759001251840L, 5655);
    return locala;
  }
  
  public final boolean Og(String paramString)
  {
    GMTrace.i(758195945472L, 5649);
    if (("com.tencent.mtt".equals(paramString)) || ("com.tencent.qbx".equals(paramString)) || ("com.tencent.mtt.x86".equals(paramString)) || ("com.tencent.qbx5".equals(paramString)))
    {
      GMTrace.o(758195945472L, 5649);
      return true;
    }
    GMTrace.o(758195945472L, 5649);
    return false;
  }
  
  public final String Pn()
  {
    GMTrace.i(758330163200L, 5650);
    GMTrace.o(758330163200L, 5650);
    return "http://mdc.html5.qq.com/d/directdown.jsp?channel_id=10318";
  }
  
  public final String a(Context paramContext, ResolveInfo paramResolveInfo)
  {
    GMTrace.i(758732816384L, 5653);
    if ((paramContext == null) || (paramResolveInfo == null) || (paramResolveInfo.activityInfo == null) || (paramResolveInfo.activityInfo.packageName == null))
    {
      GMTrace.o(758732816384L, 5653);
      return null;
    }
    Object localObject = paramResolveInfo.activityInfo.packageName;
    if ("com.qihoo.browser".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "360浏览器";
    }
    if ("com.mx.browser".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "傲游云浏览器";
    }
    if ("com.dolphin.browser.xf".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "海豚浏览器";
    }
    if ("com.UCMobile".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "UC浏览器";
    }
    if ("com.baidu.browser.apps".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "百度浏览器";
    }
    if ("sogou.mobile.explorer".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "搜狗浏览器";
    }
    if ("com.ijinshan.browser".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "猎豹浏览器";
    }
    if ("com.mediawoz.xbrowser".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "GO浏览器";
    }
    if ("com.oupeng.browser".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "欧朋浏览器";
    }
    if ("com.tiantianmini.android.browser".equals(localObject))
    {
      GMTrace.o(758732816384L, 5653);
      return "天天浏览器";
    }
    localObject = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager());
    if (localObject != null)
    {
      localObject = ((CharSequence)localObject).toString();
      localObject = Pattern.compile("\\(.*推荐.*\\)", 2).matcher((CharSequence)localObject);
      if (((Matcher)localObject).find())
      {
        paramContext = ((Matcher)localObject).replaceAll("");
        GMTrace.o(758732816384L, 5653);
        return paramContext;
      }
    }
    paramContext = paramResolveInfo.activityInfo.loadLabel(paramContext.getPackageManager()).toString();
    GMTrace.o(758732816384L, 5653);
    return paramContext;
  }
  
  public final String bJc()
  {
    GMTrace.i(758464380928L, 5651);
    GMTrace.o(758464380928L, 5651);
    return "qq_browser.apk";
  }
  
  public final u.a bJd()
  {
    GMTrace.i(758598598656L, 5652);
    u.a locala = new u.a();
    locala.tns = R.l.dON;
    locala.tnu = R.l.dOO;
    locala.tnr = R.g.aXl;
    GMTrace.o(758598598656L, 5652);
    return locala;
  }
  
  public final boolean dI(Context paramContext)
  {
    GMTrace.i(757793292288L, 5646);
    paramContext = dK(paramContext);
    if (paramContext.tnm == -1)
    {
      GMTrace.o(757793292288L, 5646);
      return false;
    }
    if ((paramContext.tnm == 2) && (paramContext.ver < 33))
    {
      GMTrace.o(757793292288L, 5646);
      return false;
    }
    GMTrace.o(757793292288L, 5646);
    return true;
  }
  
  public final boolean w(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(759269687296L, 5657);
    paramContext = paramContext.getPackageManager().queryIntentActivities(paramIntent, 0);
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        paramIntent = ((ResolveInfo)paramContext.next()).activityInfo.packageName;
        if (paramIntent.contains("com.tencent.mtt"))
        {
          GMTrace.o(759269687296L, 5657);
          return true;
        }
        if (paramIntent.contains("com.tencent.qbx"))
        {
          GMTrace.o(759269687296L, 5657);
          return true;
        }
      }
    }
    GMTrace.o(759269687296L, 5657);
    return false;
  }
  
  public static final class a
  {
    public int tnm;
    public String tnn;
    public int ver;
    
    public a()
    {
      GMTrace.i(771886153728L, 5751);
      this.tnm = -1;
      this.ver = -1;
      this.tnn = "";
      GMTrace.o(771886153728L, 5751);
    }
  }
  
  private static final class b
  {
    public String classname;
    public String tno;
    
    public b()
    {
      GMTrace.i(770543976448L, 5741);
      this.classname = "";
      this.tno = "";
      GMTrace.o(770543976448L, 5741);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */