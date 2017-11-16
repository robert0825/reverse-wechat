package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import java.util.Locale;

public final class v
{
  public static Locale vhV;
  
  static
  {
    GMTrace.i(13921599619072L, 103724);
    vhV = Locale.getDefault();
    GMTrace.o(13921599619072L, 103724);
  }
  
  public static boolean RM(String paramString)
  {
    GMTrace.i(13919586353152L, 103709);
    if (bg.nm(paramString))
    {
      GMTrace.o(13919586353152L, 103709);
      return false;
    }
    if ((paramString.equalsIgnoreCase("zh_TW")) || (paramString.equalsIgnoreCase("zh_HK")) || (paramString.equalsIgnoreCase("zh_CN")) || (paramString.equalsIgnoreCase("en")) || (paramString.equalsIgnoreCase("th")) || (paramString.equals("id")) || (paramString.equals("vi")) || (paramString.equalsIgnoreCase("pt")) || (paramString.equalsIgnoreCase("es")) || (paramString.equalsIgnoreCase("ru")) || (paramString.equalsIgnoreCase("ar")) || (paramString.equalsIgnoreCase("he")) || (paramString.equalsIgnoreCase("pl")) || (paramString.equalsIgnoreCase("hi")) || (paramString.equalsIgnoreCase("ja")) || (paramString.equalsIgnoreCase("it")) || (paramString.equalsIgnoreCase("ko")) || (paramString.equalsIgnoreCase("ms")) || (paramString.equalsIgnoreCase("tr")) || (paramString.equalsIgnoreCase("de")) || (paramString.equalsIgnoreCase("fr")) || (paramString.equalsIgnoreCase("my")) || (paramString.equalsIgnoreCase("lo")))
    {
      GMTrace.o(13919586353152L, 103709);
      return true;
    }
    GMTrace.o(13919586353152L, 103709);
    return false;
  }
  
  public static Locale RN(String paramString)
  {
    GMTrace.i(13920257441792L, 103714);
    if (paramString.equals("zh_TW"))
    {
      paramString = Locale.TAIWAN;
      GMTrace.o(13920257441792L, 103714);
      return paramString;
    }
    if (paramString.equals("zh_HK"))
    {
      paramString = new Locale("zh", "HK");
      GMTrace.o(13920257441792L, 103714);
      return paramString;
    }
    if (paramString.equals("en"))
    {
      paramString = Locale.ENGLISH;
      GMTrace.o(13920257441792L, 103714);
      return paramString;
    }
    if (paramString.equals("zh_CN"))
    {
      paramString = Locale.CHINA;
      GMTrace.o(13920257441792L, 103714);
      return paramString;
    }
    if ((paramString.equalsIgnoreCase("th")) || (paramString.equalsIgnoreCase("id")) || (paramString.equalsIgnoreCase("vi")) || (paramString.equalsIgnoreCase("pt")) || (paramString.equalsIgnoreCase("es")) || (paramString.equalsIgnoreCase("ru")) || (paramString.equalsIgnoreCase("ar")) || (paramString.equalsIgnoreCase("he")) || (paramString.equalsIgnoreCase("pl")) || (paramString.equalsIgnoreCase("hi")) || (paramString.equalsIgnoreCase("ja")) || (paramString.equalsIgnoreCase("it")) || (paramString.equalsIgnoreCase("ko")) || (paramString.equalsIgnoreCase("ms")) || (paramString.equalsIgnoreCase("tr")) || (paramString.equalsIgnoreCase("de")) || (paramString.equalsIgnoreCase("fr")) || (paramString.equalsIgnoreCase("my")) || (paramString.equalsIgnoreCase("lo")))
    {
      paramString = new Locale(paramString);
      GMTrace.o(13920257441792L, 103714);
      return paramString;
    }
    if (paramString.equalsIgnoreCase("in_ID"))
    {
      paramString = new Locale("id");
      GMTrace.o(13920257441792L, 103714);
      return paramString;
    }
    w.e("MicroMsg.LocaleUtil", "transLanguageToLocale country = " + paramString);
    paramString = Locale.ENGLISH;
    GMTrace.o(13920257441792L, 103714);
    return paramString;
  }
  
  private static String RO(String paramString)
  {
    GMTrace.i(13920660094976L, 103717);
    String str1 = Locale.getDefault().getLanguage().trim();
    String str2 = str1 + "_" + Locale.getDefault().getCountry().trim();
    if (str1.equals("en"))
    {
      GMTrace.o(13920660094976L, 103717);
      return str1;
    }
    if (str2.equals("zh_TW"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "zh_TW";
    }
    if (str2.equals("zh_HK"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "zh_HK";
    }
    if (str2.equals("zh_CN"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "zh_CN";
    }
    if (str1.equals("th"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "th";
    }
    if (str1.equals("id"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "id";
    }
    if (str2.equals("in_ID"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "id";
    }
    if (str1.equals("vi"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "vi";
    }
    if (str1.equals("pt"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "pt";
    }
    if (str1.equals("es"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "es";
    }
    if (str1.equals("ru"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "ru";
    }
    if (str1.equals("ar"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "ar";
    }
    if (str1.equals("he"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "he";
    }
    if (str1.equals("pl"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "pl";
    }
    if (str1.equals("hi"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "hi";
    }
    if (str1.equals("ja"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "ja";
    }
    if (str1.equals("it"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "it";
    }
    if (str1.equals("ko"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "ko";
    }
    if (str1.equals("ms"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "ms";
    }
    if (str1.equals("tr"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "tr";
    }
    if (str1.equals("de"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "de";
    }
    if (str1.equals("fr"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "fr";
    }
    if (str1.equals("my"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "my";
    }
    if (str1.equals("lo"))
    {
      GMTrace.o(13920660094976L, 103717);
      return "lo";
    }
    GMTrace.o(13920660094976L, 103717);
    return paramString;
  }
  
  public static void a(Context paramContext, Locale paramLocale)
  {
    GMTrace.i(13920123224064L, 103713);
    paramContext = paramContext.getResources();
    Configuration localConfiguration = paramContext.getConfiguration();
    if (localConfiguration.locale.equals(paramLocale))
    {
      GMTrace.o(13920123224064L, 103713);
      return;
    }
    DisplayMetrics localDisplayMetrics = paramContext.getDisplayMetrics();
    localConfiguration.locale = paramLocale;
    paramContext.updateConfiguration(localConfiguration, localDisplayMetrics);
    Resources.getSystem().updateConfiguration(localConfiguration, localDisplayMetrics);
    GMTrace.o(13920123224064L, 103713);
  }
  
  public static void a(SharedPreferences paramSharedPreferences, String paramString)
  {
    GMTrace.i(13921196965888L, 103721);
    if (paramSharedPreferences.edit().putString("language_key", paramString).commit())
    {
      bc.setProperty("language_key", paramString);
      w.w("MicroMsg.LocaleUtil", "save application lang as:" + paramString);
      GMTrace.o(13921196965888L, 103721);
      return;
    }
    w.e("MicroMsg.LocaleUtil", "saving application lang failed");
    GMTrace.o(13921196965888L, 103721);
  }
  
  public static void b(Configuration paramConfiguration)
  {
    GMTrace.i(13920391659520L, 103715);
    if (Build.VERSION.SDK_INT < 24)
    {
      GMTrace.o(13920391659520L, 103715);
      return;
    }
    if (paramConfiguration != null)
    {
      Locale.setDefault(paramConfiguration.locale);
      vhV = Locale.getDefault();
      w.i("MicroMsg.LocaleUtil", "current locale:%s", new Object[] { vhV });
    }
    GMTrace.o(13920391659520L, 103715);
  }
  
  public static boolean bPG()
  {
    GMTrace.i(13919720570880L, 103710);
    String str = bPK();
    if ((str.equals("zh_CN")) || (str.equals("zh_TW")) || (str.equals("zh_HK")))
    {
      GMTrace.o(13919720570880L, 103710);
      return true;
    }
    GMTrace.o(13919720570880L, 103710);
    return false;
  }
  
  public static boolean bPH()
  {
    GMTrace.i(13919854788608L, 103711);
    if (bPK().equals("zh_CN"))
    {
      GMTrace.o(13919854788608L, 103711);
      return true;
    }
    GMTrace.o(13919854788608L, 103711);
    return false;
  }
  
  public static boolean bPI()
  {
    GMTrace.i(13919989006336L, 103712);
    if ((bPK().equals("zh_TW")) || (bPK().equals("zh_HK")))
    {
      GMTrace.o(13919989006336L, 103712);
      return true;
    }
    GMTrace.o(13919989006336L, 103712);
    return false;
  }
  
  public static String bPJ()
  {
    GMTrace.i(13920525877248L, 103716);
    String str = Locale.getDefault().getCountry().trim();
    GMTrace.o(13920525877248L, 103716);
    return str;
  }
  
  public static String bPK()
  {
    GMTrace.i(13920794312704L, 103718);
    String str = bg.nl(bc.getProperty("language_key"));
    if ((str.length() > 0) && (!str.equals("language_default")))
    {
      GMTrace.o(13920794312704L, 103718);
      return str;
    }
    str = RO("en");
    GMTrace.o(13920794312704L, 103718);
    return str;
  }
  
  public static String d(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(13920928530432L, 103719);
    paramSharedPreferences = bg.nl(paramSharedPreferences.getString("language_key", null));
    if ((paramSharedPreferences.length() > 0) && (!paramSharedPreferences.equals("language_default")))
    {
      bc.setProperty("language_key", paramSharedPreferences);
      GMTrace.o(13920928530432L, 103719);
      return paramSharedPreferences;
    }
    paramSharedPreferences = RO("en");
    bc.setProperty("language_key", paramSharedPreferences);
    GMTrace.o(13920928530432L, 103719);
    return paramSharedPreferences;
  }
  
  public static String e(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(13921062748160L, 103720);
    paramSharedPreferences = bg.nl(paramSharedPreferences.getString("language_key", null));
    if (!bg.nm(paramSharedPreferences))
    {
      GMTrace.o(13921062748160L, 103720);
      return paramSharedPreferences;
    }
    GMTrace.o(13921062748160L, 103720);
    return "language_default";
  }
  
  public static String eq(Context paramContext)
  {
    GMTrace.i(13921331183616L, 103722);
    paramContext = e(paramContext.getSharedPreferences(ab.bPU(), 0));
    String str = bPK();
    if (paramContext.equalsIgnoreCase("language_default")) {
      paramContext = str;
    }
    for (;;)
    {
      GMTrace.o(13921331183616L, 103722);
      return paramContext;
    }
  }
  
  public static String g(Context paramContext, int paramInt1, int paramInt2)
  {
    int j = 0;
    GMTrace.i(13921465401344L, 103723);
    String[] arrayOfString1 = paramContext.getResources().getStringArray(paramInt1);
    String str = e(paramContext.getSharedPreferences(ab.bPU(), 0));
    if (str == null)
    {
      paramContext = paramContext.getString(paramInt2);
      GMTrace.o(13921465401344L, 103723);
      return paramContext;
    }
    String[] arrayOfString2 = u.oJi;
    int k = arrayOfString2.length;
    int i = 0;
    paramInt1 = j;
    while (paramInt1 < k)
    {
      if (arrayOfString2[paramInt1].equals(str))
      {
        paramContext = arrayOfString1[i];
        GMTrace.o(13921465401344L, 103723);
        return paramContext;
      }
      i += 1;
      paramInt1 += 1;
    }
    paramContext = paramContext.getString(paramInt2);
    GMTrace.o(13921465401344L, 103723);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */