package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class p
{
  public static String OB(String paramString)
  {
    GMTrace.i(778060169216L, 5797);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
      GMTrace.o(778060169216L, 5797);
      return null;
    }
    paramString = OC(paramString);
    GMTrace.o(778060169216L, 5797);
    return paramString;
  }
  
  public static String OC(String paramString)
  {
    GMTrace.i(778865475584L, 5803);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.toLowerCase());
    localStringBuffer.append("mMHc ItnStR");
    paramString = g.n(localStringBuffer.toString().getBytes());
    GMTrace.o(778865475584L, 5803);
    return paramString;
  }
  
  public static void OD(String paramString)
  {
    GMTrace.i(779402346496L, 5807);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.AppUtil", "appid is null");
      GMTrace.o(779402346496L, 5807);
      return;
    }
    SharedPreferences localSharedPreferences = ab.bPV();
    if (localSharedPreferences != null)
    {
      String str = localSharedPreferences.getString("key_app_ids_registion_while_not_login", "");
      if (str.contains(paramString))
      {
        w.i("MicroMsg.AppUtil", "this app has been saved : %s in %s", new Object[] { paramString, str });
        GMTrace.o(779402346496L, 5807);
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("|");
      localStringBuilder.append(str);
      paramString = localStringBuilder.toString();
      localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", paramString).commit();
    }
    GMTrace.o(779402346496L, 5807);
  }
  
  public static String aP(Context paramContext, String paramString)
  {
    GMTrace.i(777925951488L, 5796);
    paramContext = aQ(paramContext, paramString);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      w.e("MicroMsg.AppUtil", "signs is null");
      GMTrace.o(777925951488L, 5796);
      return null;
    }
    paramContext = OC(g.n(paramContext[0].toByteArray()));
    GMTrace.o(777925951488L, 5796);
    return paramContext;
  }
  
  public static Signature[] aQ(Context paramContext, String paramString)
  {
    GMTrace.i(778731257856L, 5802);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "getSignature, packageName is null");
      GMTrace.o(778731257856L, 5802);
      return null;
    }
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo(paramString, 64);
      if (paramContext == null)
      {
        w.e("MicroMsg.AppUtil", "info is null, packageName = " + paramString);
        GMTrace.o(778731257856L, 5802);
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      w.e("MicroMsg.AppUtil", "NameNotFoundException");
      GMTrace.o(778731257856L, 5802);
      return null;
    }
    paramContext = paramContext.signatures;
    GMTrace.o(778731257856L, 5802);
    return paramContext;
  }
  
  public static void ag(Bundle paramBundle)
  {
    GMTrace.i(778328604672L, 5799);
    paramBundle.putString("wx_token_key", "com.tencent.mm.openapi.token");
    GMTrace.o(778328604672L, 5799);
  }
  
  public static void ah(Bundle paramBundle)
  {
    GMTrace.i(778462822400L, 5800);
    paramBundle.putString("platformId", "wechat");
    GMTrace.o(778462822400L, 5800);
  }
  
  public static boolean b(Context paramContext, f paramf)
  {
    GMTrace.i(779268128768L, 5806);
    w.i("MicroMsg.AppUtil", "check the signature of the Application.");
    if (paramContext == null)
    {
      w.e("MicroMsg.AppUtil", "context is null.");
      GMTrace.o(779268128768L, 5806);
      return true;
    }
    if (paramf == null)
    {
      w.e("MicroMsg.AppUtil", "appInfo is null.");
      GMTrace.o(779268128768L, 5806);
      return true;
    }
    if (bg.nm(paramf.field_packageName))
    {
      w.e("MicroMsg.AppUtil", "packageName is null.");
      GMTrace.o(779268128768L, 5806);
      return true;
    }
    if (bg.nm(paramf.field_signature))
    {
      w.e("MicroMsg.AppUtil", "app.field_signature is null. app.field_packageName is %s", new Object[] { paramf.field_packageName });
      GMTrace.o(779268128768L, 5806);
      return true;
    }
    paramContext = aQ(paramContext, paramf.field_packageName);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      w.e("MicroMsg.AppUtil", "apk signatures is null");
      GMTrace.o(779268128768L, 5806);
      return false;
    }
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      String str = OC(g.n(paramContext[i].toByteArray()));
      if (paramf.field_signature.equals(str))
      {
        w.i("MicroMsg.AppUtil", "app_name : %s ,signature : %s", new Object[] { paramf.field_appName, paramf.field_signature });
        GMTrace.o(779268128768L, 5806);
        return true;
      }
      i += 1;
    }
    w.w("MicroMsg.AppUtil", "signature is diff.(app_name:%s)", new Object[] { paramf.field_appName });
    GMTrace.o(779268128768L, 5806);
    return false;
  }
  
  public static boolean b(Context paramContext, f paramf, String paramString)
  {
    GMTrace.i(778194386944L, 5798);
    a locala = a.a.aWD();
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "isAppValid, packageName is null");
      locala.c(paramf);
      GMTrace.o(778194386944L, 5798);
      return false;
    }
    if (paramf == null)
    {
      w.i("MicroMsg.AppUtil", "app does not exist");
      GMTrace.o(778194386944L, 5798);
      return true;
    }
    if ((paramf.field_packageName == null) || (paramf.field_packageName.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "isAppValid fail, local packageName is null");
      locala.c(paramf);
      GMTrace.o(778194386944L, 5798);
      return false;
    }
    if ((paramf.field_signature == null) || (paramf.field_signature.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "isAppValid fail, local signature is null");
      locala.c(paramf);
      GMTrace.o(778194386944L, 5798);
      return false;
    }
    paramContext = aQ(paramContext, paramString);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      w.e("MicroMsg.AppUtil", "isAppValid, apk signatures is null");
      locala.c(paramf);
      GMTrace.o(778194386944L, 5798);
      return false;
    }
    if (!paramf.field_packageName.equals(paramString))
    {
      w.e("MicroMsg.AppUtil", "isAppValid, packageName is diff, src:%s,local:%s", new Object[] { paramf.field_packageName, paramString });
      locala.c(paramf);
      GMTrace.o(778194386944L, 5798);
      return false;
    }
    w.i("MicroMsg.AppUtil", "server signatures:%s", new Object[] { paramf.field_signature });
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      paramString = OC(g.n(paramContext[i].toByteArray()));
      w.i("MicroMsg.AppUtil", "local signatures:%s", new Object[] { paramString });
      if ((paramf.field_signature != null) && (paramf.field_signature.equals(paramString)))
      {
        locala.d(paramf);
        GMTrace.o(778194386944L, 5798);
        return true;
      }
      i += 1;
    }
    w.w("MicroMsg.AppUtil", "isAppValid, signature is diff");
    locala.c(paramf);
    GMTrace.o(778194386944L, 5798);
    return false;
  }
  
  public static void bJC()
  {
    GMTrace.i(779536564224L, 5808);
    ap.tpg = null;
    ap.tph = -1L;
    GMTrace.o(779536564224L, 5808);
  }
  
  public static String f(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(777254862848L, 5791);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "buildSourceUrl fail, invalid arguments");
      GMTrace.o(777254862848L, 5791);
      return null;
    }
    String str2 = v.d(paramContext.getSharedPreferences(ab.bPU(), 0));
    String str1;
    if ((str2 == null) || (str2.length() == 0)) {
      str1 = "zh_CN";
    }
    for (;;)
    {
      paramContext = paramContext.getString(a.h.kcM, new Object[] { paramString1, Integer.valueOf(d.tJC), str1, d.DEVICE_TYPE, paramString2 });
      GMTrace.o(777254862848L, 5791);
      return paramContext;
      str1 = str2;
      if (str2.equals("en")) {
        str1 = "en_US";
      }
    }
  }
  
  public static void g(Bundle paramBundle, String paramString)
  {
    GMTrace.i(778597040128L, 5801);
    paramBundle.putString("platformId", "wechat");
    if (!bg.nm(paramString)) {
      paramBundle.putString("launchParam", paramString);
    }
    GMTrace.o(778597040128L, 5801);
  }
  
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    GMTrace.i(777791733760L, 5795);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "getPackageInfo, packageName is null");
      GMTrace.o(777791733760L, 5795);
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      GMTrace.o(777791733760L, 5795);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        w.w("MicroMsg.AppUtil", "app not installed, packageName = " + paramString);
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static boolean n(Context paramContext, String paramString)
  {
    GMTrace.i(777657516032L, 5794);
    if (getPackageInfo(paramContext, paramString) != null)
    {
      GMTrace.o(777657516032L, 5794);
      return true;
    }
    GMTrace.o(777657516032L, 5794);
    return false;
  }
  
  public static String s(String paramString1, String paramString2)
  {
    GMTrace.i(777523298304L, 5793);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "buildRedirectUrl fail, invalid arguments");
      GMTrace.o(777523298304L, 5793);
      return null;
    }
    int i = paramString1.indexOf("#");
    String str1;
    if (i >= 0)
    {
      str1 = paramString1.substring(i);
      paramString1 = paramString1.substring(0, i);
    }
    for (;;)
    {
      i = paramString1.indexOf("?");
      String str3 = "";
      String str2 = paramString1;
      if (i >= 0)
      {
        str3 = paramString1.substring(i + 1);
        str2 = paramString1.substring(0, i);
      }
      w.v("MicroMsg.AppUtil", "buildRedirectUrl, sharpStr = %s, paramStr = %s, srcUrl = %s", new Object[] { str1, str3, str2 });
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      if (!bg.nm(str3))
      {
        String[] arrayOfString = str3.split("&");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          int j = arrayOfString.length;
          i = 0;
          if (i < j)
          {
            String str4 = arrayOfString[i];
            if (!bg.nm(str4))
            {
              int k = str4.indexOf("=");
              w.v("MicroMsg.AppUtil", "buildRedirectUrl, equalIdx = %d", new Object[] { Integer.valueOf(k) });
              if (k < 0) {
                break label266;
              }
              paramString1 = str4.substring(0, k + 1);
              str3 = str4.substring(k + 1);
            }
            for (;;)
            {
              localLinkedHashMap.put(paramString1, str3);
              i += 1;
              break;
              label266:
              str3 = "";
              paramString1 = str4;
            }
          }
        }
      }
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = "";
      }
      localLinkedHashMap.put("from=", paramString1);
      w.v("MicroMsg.AppUtil", "buildRedirectUrl, pMap size = %d", new Object[] { Integer.valueOf(localLinkedHashMap.size()) });
      paramString1 = new StringBuilder();
      paramString2 = localLinkedHashMap.keySet().iterator();
      while (paramString2.hasNext())
      {
        str3 = (String)paramString2.next();
        if (paramString1.length() > 0) {
          paramString1.append("&");
        }
        paramString1.append(str3);
        paramString1.append((String)localLinkedHashMap.get(str3));
      }
      paramString1 = paramString1.toString();
      paramString2 = str2 + "?" + paramString1;
      paramString1 = paramString2;
      if (!bg.nm(str1)) {
        paramString1 = paramString2 + str1;
      }
      w.v("MicroMsg.AppUtil", "buildRedirectUrl, ret url = %s", new Object[] { paramString1 });
      GMTrace.o(777523298304L, 5793);
      return paramString1;
      str1 = "";
    }
  }
  
  public static String v(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(777389080576L, 5792);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      w.e("MicroMsg.AppUtil", "buildUnistallUrl fail, invalid arguments");
      GMTrace.o(777389080576L, 5792);
      return null;
    }
    String str2 = v.d(paramContext.getSharedPreferences(ab.bPU(), 0));
    String str1;
    if ((str2 == null) || (str2.length() == 0)) {
      str1 = "zh_CN";
    }
    for (;;)
    {
      paramContext = paramContext.getString(a.h.kcN, new Object[] { paramString1, Integer.valueOf(d.tJC), str1, d.DEVICE_TYPE, paramString2, Integer.valueOf(0) });
      GMTrace.o(777389080576L, 5792);
      return paramContext;
      str1 = str2;
      if (str2.equals("en")) {
        str1 = "en_US";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */