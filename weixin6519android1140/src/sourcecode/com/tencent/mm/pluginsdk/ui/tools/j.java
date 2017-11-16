package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;

public final class j
{
  private static String tHf;
  private static final String[] tHg;
  
  static
  {
    GMTrace.i(1106088296448L, 8241);
    tHf = null;
    tHg = new String[] { "", "dynamic_config_recv", "trigger_download", "start_download", "stop_download", "download_finish", "install_finish", "use" };
    GMTrace.o(1106088296448L, 8241);
  }
  
  private static String dW(Context paramContext)
  {
    GMTrace.i(1105954078720L, 8240);
    if (tHf != null)
    {
      paramContext = tHf;
      GMTrace.o(1105954078720L, 8240);
      return paramContext;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(ab.getPackageName(), 128);
      if ((paramContext != null) && (paramContext.metaData != null))
      {
        paramContext = paramContext.metaData.getString("com.tencent.mtt.TBS_CODE");
        if (!bg.nm(paramContext))
        {
          tHf = paramContext;
          GMTrace.o(1105954078720L, 8240);
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.TBSReporter", "getMetaTbsCode, ex = %s", new Object[] { paramContext.getMessage() });
      GMTrace.o(1105954078720L, 8240);
    }
    return null;
  }
  
  public static void dX(int paramInt1, int paramInt2)
  {
    GMTrace.i(1105819860992L, 8239);
    if ((paramInt1 <= 0) || (paramInt1 > 7))
    {
      w.e("MicroMsg.TBSReporter", "report invalid scene = %d", new Object[] { Integer.valueOf(paramInt1) });
      GMTrace.o(1105819860992L, 8239);
      return;
    }
    w.i("MicroMsg.TBSReporter", "logSceneDetail, scene = %d_%s, errcode = %d", new Object[] { Integer.valueOf(paramInt1), tHg[paramInt1], Integer.valueOf(paramInt2) });
    Object localObject = ab.getContext();
    int i = WebView.getTbsCoreVersion((Context)localObject);
    int j = WebView.getTbsSDKVersion((Context)localObject);
    localObject = dW((Context)localObject);
    g.ork.a(11633, false, true, new Object[] { Integer.valueOf(paramInt1), Long.valueOf(System.currentTimeMillis() / 1000L), Integer.valueOf(i), Integer.valueOf(j), localObject, Integer.valueOf(paramInt2) });
    GMTrace.o(1105819860992L, 8239);
  }
  
  public static void nU(int paramInt)
  {
    GMTrace.i(1105685643264L, 8238);
    dX(paramInt, 0);
    GMTrace.o(1105685643264L, 8238);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */