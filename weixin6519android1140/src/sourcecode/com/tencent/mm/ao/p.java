package com.tencent.mm.ao;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.b;

public final class p
{
  private static String[] gJR;
  
  static
  {
    GMTrace.i(3508317192192L, 26139);
    gJR = null;
    GMTrace.o(3508317192192L, 26139);
  }
  
  public static boolean Jh()
  {
    GMTrace.i(3507109232640L, 26130);
    if (gJR == null) {
      Ji();
    }
    if ((Build.VERSION.SDK_INT >= 14) && (gJR != null) && (gJR.length > 0) && (com.tencent.mm.compatible.d.p.fQL.fQh == 1)) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.WebpUtil", "isSupportWebp: %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(3507109232640L, 26130);
      return bool;
    }
  }
  
  private static void Ji()
  {
    GMTrace.i(3507243450368L, 26131);
    try
    {
      String str = ((a)h.h(a.class)).ut().getValue("BizEnableWebpUrl");
      w.d("MicroMsg.WebpUtil", "initCdnUrlList, urllist: %s", new Object[] { str });
      if (!bg.nm(str))
      {
        gJR = str.split(";");
        w.d("MicroMsg.WebpUtil", "initCdnUrlList, CDN_URL_LIST.length: %d", new Object[] { Integer.valueOf(gJR.length) });
      }
      GMTrace.o(3507243450368L, 26131);
      return;
    }
    catch (b localb)
    {
      w.w("MicroMsg.WebpUtil", "initCdnUrlList fail, AccountNotReady");
      GMTrace.o(3507243450368L, 26131);
      return;
    }
    catch (Exception localException)
    {
      w.d("MicroMsg.WebpUtil", "initCdnUrlList error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(3507243450368L, 26131);
    }
  }
  
  private static int Jj()
  {
    GMTrace.i(3507780321280L, 26135);
    Context localContext = ab.getContext();
    if (am.isWifi(localContext))
    {
      GMTrace.o(3507780321280L, 26135);
      return 1;
    }
    if (am.is4G(localContext))
    {
      GMTrace.o(3507780321280L, 26135);
      return 4;
    }
    if (am.is3G(localContext))
    {
      GMTrace.o(3507780321280L, 26135);
      return 3;
    }
    if (am.is2G(localContext))
    {
      GMTrace.o(3507780321280L, 26135);
      return 2;
    }
    GMTrace.o(3507780321280L, 26135);
    return 0;
  }
  
  public static String gA(int paramInt)
  {
    GMTrace.i(3508048756736L, 26137);
    String str = String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(paramInt), Integer.valueOf(Jj()), Integer.valueOf(1) });
    GMTrace.o(3508048756736L, 26137);
    return str;
  }
  
  public static String gz(int paramInt)
  {
    GMTrace.i(3507914539008L, 26136);
    String str = String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(paramInt), Integer.valueOf(Jj()), Integer.valueOf(2) });
    GMTrace.o(3507914539008L, 26136);
    return str;
  }
  
  private static boolean kn(String paramString)
  {
    GMTrace.i(3507377668096L, 26132);
    if ((gJR != null) && (gJR.length > 0) && (!bg.nm(paramString)))
    {
      String[] arrayOfString = gJR;
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        if (paramString.startsWith(arrayOfString[i]))
        {
          GMTrace.o(3507377668096L, 26132);
          return true;
        }
        i += 1;
      }
    }
    GMTrace.o(3507377668096L, 26132);
    return false;
  }
  
  public static String ko(String paramString)
  {
    GMTrace.i(3507511885824L, 26133);
    if ((gJR == null) || (gJR.length == 0))
    {
      w.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, cdn url is null");
      Ji();
    }
    if (!kn(paramString))
    {
      w.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, is not cdn url");
      GMTrace.o(3507511885824L, 26133);
      return paramString;
    }
    try
    {
      Object localObject = Uri.parse(paramString);
      String str1 = ((Uri)localObject).getQueryParameter("wxtype");
      boolean bool = bg.nm(str1);
      if (bool)
      {
        GMTrace.o(3507511885824L, 26133);
        return paramString;
      }
      str1 = str1.toLowerCase();
      w.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, wxtype:%s", new Object[] { str1 });
      if (!str1.equals("gif"))
      {
        bool = str1.contains("gif");
        if (!bool) {}
      }
      else
      {
        GMTrace.o(3507511885824L, 26133);
        return paramString;
      }
      String str2 = ((Uri)localObject).getQueryParameter("tp");
      if (!bg.nm(str2))
      {
        bool = str2.equals("webp");
        if (bool)
        {
          GMTrace.o(3507511885824L, 26133);
          return paramString;
        }
      }
      if (!bg.nm(str1))
      {
        localObject = ((Uri)localObject).buildUpon().appendQueryParameter("tp", "webp").build().toString();
        w.d("MicroMsg.WebpUtil", "webpURL: %s", new Object[] { localObject });
        GMTrace.o(3507511885824L, 26133);
        return (String)localObject;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(3507511885824L, 26133);
      return paramString;
    }
    GMTrace.o(3507511885824L, 26133);
    return paramString;
  }
  
  public static boolean kp(String paramString)
  {
    GMTrace.i(3507646103552L, 26134);
    try
    {
      boolean bool = bg.nm(paramString);
      if (bool)
      {
        GMTrace.o(3507646103552L, 26134);
        return false;
      }
      bool = kn(paramString);
      if (!bool)
      {
        GMTrace.o(3507646103552L, 26134);
        return false;
      }
      paramString = Uri.parse(paramString).getQueryParameter("tp");
      if (!bg.nm(paramString))
      {
        bool = paramString.equals("webp");
        if (bool)
        {
          GMTrace.o(3507646103552L, 26134);
          return true;
        }
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(3507646103552L, 26134);
      return false;
    }
    GMTrace.o(3507646103552L, 26134);
    return false;
  }
  
  public static String kq(String paramString)
  {
    GMTrace.i(3508182974464L, 26138);
    try
    {
      boolean bool = kn(paramString);
      if (!bool)
      {
        GMTrace.o(3508182974464L, 26138);
        return null;
      }
      paramString = Uri.parse(paramString).getQueryParameter("wxtype").toLowerCase();
      bool = bg.nm(paramString);
      if (bool)
      {
        GMTrace.o(3508182974464L, 26138);
        return null;
      }
      paramString = paramString.toLowerCase();
      GMTrace.o(3508182974464L, 26138);
      return paramString;
    }
    catch (Exception paramString)
    {
      GMTrace.o(3508182974464L, 26138);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */