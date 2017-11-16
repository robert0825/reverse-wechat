package com.tencent.mm.modelappbrand;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static String gqW;
  public static String gqX;
  
  public static String CE()
  {
    GMTrace.i(14451222773760L, 107670);
    Object localObject = new StringBuilder("sid_");
    h.xw();
    gqW = a.ww() + "_" + bg.Pv();
    w.v("MicroMsg.AppBrandReporter", "refreshWeAppSearchSessionId : %s", new Object[] { gqW });
    localObject = gqW;
    GMTrace.o(14451222773760L, 107670);
    return (String)localObject;
  }
  
  public static void hp(String paramString)
  {
    GMTrace.i(12933622923264L, 96363);
    Object localObject = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4);
    paramString = paramString + ":start_time";
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).remove(paramString);
    ((SharedPreferences.Editor)localObject).commit();
    d.oqe.a(365L, 5L, 1L, false);
    w.v("MicroMsg.AppBrandReporter", "onProcessExit");
    GMTrace.o(12933622923264L, 96363);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */