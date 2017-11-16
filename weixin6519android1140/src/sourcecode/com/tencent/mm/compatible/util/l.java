package com.tencent.mm.compatible.util;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class l
{
  public static boolean rG()
  {
    GMTrace.i(13789663592448L, 102741);
    if (bg.aq(Build.MANUFACTURER, "").toLowerCase().indexOf("samsung".toLowerCase()) >= 0)
    {
      GMTrace.o(13789663592448L, 102741);
      return true;
    }
    GMTrace.o(13789663592448L, 102741);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */