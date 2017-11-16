package com.tencent.mm.plugin.webview.stub;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static final boolean aI(Context paramContext, String paramString)
  {
    GMTrace.i(12447352094720L, 92740);
    if (bg.nm(paramString))
    {
      GMTrace.o(12447352094720L, 92740);
      return false;
    }
    try
    {
      paramContext = s.getPackageInfo(paramContext, "com.tencent.weread");
      if (paramContext != null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.ConstantsWebViewStub", "isWeReadSupportShare(%s).", new Object[] { Boolean.valueOf(bool) });
        if (paramContext != null) {
          break;
        }
        GMTrace.o(12447352094720L, 92740);
        return false;
      }
      bool = Uri.parse(paramString).getHost().startsWith("mp.weixin.qq.com");
      if (!bool)
      {
        GMTrace.o(12447352094720L, 92740);
        return false;
      }
      int i = paramContext.versionCode;
      if (i > 2000812)
      {
        GMTrace.o(12447352094720L, 92740);
        return true;
      }
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQzoneSupportShare(), e : %s.", new Object[] { paramContext.getMessage() });
      GMTrace.o(12447352094720L, 92740);
    }
    return false;
  }
  
  public static final boolean dt(Context paramContext)
  {
    GMTrace.i(12447217876992L, 92739);
    try
    {
      paramContext = s.getPackageInfo(paramContext, "com.tencent.mobileqq");
      if (paramContext != null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.ConstantsWebViewStub", "isQQSupportShare(%s).", new Object[] { Boolean.valueOf(bool) });
        if (paramContext == null) {
          break;
        }
        GMTrace.o(12447217876992L, 92739);
        return true;
      }
      return false;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.ConstantsWebViewStub", "exception has occurred in isQQSupportShare(), e : %s.", new Object[] { paramContext.getMessage() });
      GMTrace.o(12447217876992L, 92739);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */