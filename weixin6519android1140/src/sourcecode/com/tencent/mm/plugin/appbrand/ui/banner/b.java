package com.tencent.mm.plugin.appbrand.ui.banner;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import org.json.JSONArray;
import org.json.JSONException;

final class b
{
  b()
  {
    GMTrace.i(17312342081536L, 128987);
    GMTrace.o(17312342081536L, 128987);
  }
  
  static void a(Intent paramIntent, String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(17312744734720L, 128990);
    if (paramIntent == null)
    {
      GMTrace.o(17312744734720L, 128990);
      return;
    }
    paramIntent.putExtra(a.iDq.CX(), paramString1);
    paramIntent.putExtra(a.iDr.CX(), paramInt);
    paramIntent.putExtra(a.iDs.CX(), paramString2);
    paramIntent.putExtra(a.iDt.CX(), paramString3);
    paramIntent.putExtra(a.iDu.CX(), paramString4);
    GMTrace.o(17312744734720L, 128990);
  }
  
  private static void a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(17312878952448L, 128991);
    if (!h.xw().wL())
    {
      GMTrace.o(17312878952448L, 128991);
      return;
    }
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(paramString1);
    localJSONArray.put(String.valueOf(paramInt));
    localJSONArray.put(paramString2);
    localJSONArray.put(paramString3);
    localJSONArray.put(bg.nl(paramString4));
    paramString1 = localJSONArray.toString();
    try
    {
      h.xy().xh().a(w.a.vuT, paramString1);
      GMTrace.o(17312878952448L, 128991);
      return;
    }
    finally {}
  }
  
  static boolean a(AppBrandStickyBannerLogic.OperateTask paramOperateTask)
  {
    GMTrace.i(17312610516992L, 128989);
    if ((paramOperateTask == null) || (!h.xw().wL()))
    {
      GMTrace.o(17312610516992L, 128989);
      return false;
    }
    BannerModel localBannerModel = BannerModel.abh();
    if (localBannerModel == null)
    {
      GMTrace.o(17312610516992L, 128989);
      return false;
    }
    if ((localBannerModel.appId.equals(paramOperateTask.iix)) && (localBannerModel.hZb == paramOperateTask.iDO))
    {
      a(localBannerModel.appId, localBannerModel.hZb, localBannerModel.appName, localBannerModel.izx, paramOperateTask.iDP);
      GMTrace.o(17312610516992L, 128989);
      return true;
    }
    GMTrace.o(17312610516992L, 128989);
    return false;
  }
  
  static void aba()
  {
    GMTrace.i(17313013170176L, 128992);
    try
    {
      h.xy().xh().a(w.a.vuT, "");
      GMTrace.o(17313013170176L, 128992);
      return;
    }
    finally {}
  }
  
  private static Object[] abb()
  {
    GMTrace.i(17313147387904L, 128993);
    if (!h.xw().wL())
    {
      GMTrace.o(17313147387904L, 128993);
      return null;
    }
    try
    {
      String str1 = (String)h.xy().xh().get(w.a.vuT, "");
      if (bg.nm(str1))
      {
        GMTrace.o(17313147387904L, 128993);
        return null;
      }
    }
    finally {}
    try
    {
      JSONArray localJSONArray = new JSONArray(str2);
      int i = localJSONArray.length();
      int j = a.iDv;
      if (i != j)
      {
        GMTrace.o(17313147387904L, 128993);
        return null;
      }
      Object[] arrayOfObject = new Object[a.iDv];
      i = 0;
      while (i < a.iDv)
      {
        arrayOfObject[i] = localJSONArray.optString(i, "");
        i += 1;
      }
      arrayOfObject[a.iDr.ordinal()] = Integer.valueOf(bg.getInt((String)arrayOfObject[a.iDr.ordinal()], 0));
      GMTrace.o(17313147387904L, 128993);
      return arrayOfObject;
    }
    catch (JSONException localJSONException)
    {
      GMTrace.o(17313147387904L, 128993);
    }
    return null;
  }
  
  static BannerModel abc()
  {
    GMTrace.i(17313281605632L, 128994);
    Object[] arrayOfObject = abb();
    if (arrayOfObject == null)
    {
      GMTrace.o(17313281605632L, 128994);
      return null;
    }
    BannerModel localBannerModel = new BannerModel();
    localBannerModel.appId = ((String)arrayOfObject[a.iDq.ordinal()]);
    localBannerModel.hZb = ((Integer)arrayOfObject[a.iDr.ordinal()]).intValue();
    localBannerModel.appName = ((String)arrayOfObject[a.iDs.ordinal()]);
    localBannerModel.izx = ((String)arrayOfObject[a.iDt.ordinal()]);
    localBannerModel.iDV = ((String)arrayOfObject[a.iDu.ordinal()]);
    GMTrace.o(17313281605632L, 128994);
    return localBannerModel;
  }
  
  static boolean w(Intent paramIntent)
  {
    GMTrace.i(17312476299264L, 128988);
    if (paramIntent == null)
    {
      GMTrace.o(17312476299264L, 128988);
      return false;
    }
    String str1 = paramIntent.getStringExtra(a.iDq.CX());
    int j = paramIntent.getIntExtra(a.iDr.CX(), 0);
    String str2 = paramIntent.getStringExtra(a.iDs.CX());
    String str3 = paramIntent.getStringExtra(a.iDt.CX());
    String str4 = paramIntent.getStringExtra(a.iDu.CX());
    a[] arrayOfa = a.values();
    int k = arrayOfa.length;
    int i = 0;
    while (i < k)
    {
      paramIntent.removeExtra(arrayOfa[i].CX());
      i += 1;
    }
    if ((bg.nm(str1)) || (bg.nm(str2)))
    {
      GMTrace.o(17312476299264L, 128988);
      return false;
    }
    a(str1, j, str2, str3, str4);
    GMTrace.o(17312476299264L, 128988);
    return true;
  }
  
  private static enum a
  {
    static final int iDv;
    
    static
    {
      GMTrace.i(17317576572928L, 129026);
      iDq = new a("appId", 0);
      iDr = new a("versionType", 1);
      iDs = new a("appName", 2);
      iDt = new a("iconURL", 3);
      iDu = new a("customText", 4);
      iDw = new a[] { iDq, iDr, iDs, iDt, iDu };
      iDv = values().length;
      GMTrace.o(17317576572928L, 129026);
    }
    
    private a()
    {
      GMTrace.i(17317308137472L, 129024);
      GMTrace.o(17317308137472L, 129024);
    }
    
    public final String CX()
    {
      GMTrace.i(17317442355200L, 129025);
      String str = "appbrand_top_banner_in_chatting_extra_key_" + name();
      GMTrace.o(17317442355200L, 129025);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\banner\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */