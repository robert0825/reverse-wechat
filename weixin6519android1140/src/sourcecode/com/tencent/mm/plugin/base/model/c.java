package com.tencent.mm.plugin.base.model;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static String bu(String paramString1, String paramString2)
  {
    GMTrace.i(20286338498560L, 151145);
    paramString1 = g.n((g.n(paramString1.getBytes()) + b.bt(paramString2, paramString1)).getBytes());
    GMTrace.o(20286338498560L, 151145);
    return paramString1;
  }
  
  public static String tv(String paramString)
  {
    GMTrace.i(20286204280832L, 151144);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(20286204280832L, 151144);
      return null;
    }
    w.i("MicroMsg.ShortcutUtil", "process name: %s", new Object[] { bg.r(ab.getContext(), Process.myPid()) });
    if ((paramString.startsWith("shortcut_")) && (paramString.length() > 9))
    {
      String str = paramString.substring(9);
      if ((str != null) && (str.length() > 0))
      {
        paramString = b.bt(new String(b.tu(str)), p.sZ());
        GMTrace.o(20286204280832L, 151144);
        return paramString;
      }
    }
    GMTrace.o(20286204280832L, 151144);
    return paramString;
  }
  
  public static String tw(String paramString)
  {
    GMTrace.i(20286472716288L, 151146);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(20286472716288L, 151146);
      return null;
    }
    w.i("MicroMsg.ShortcutUtil", "process name: %s", new Object[] { bg.r(ab.getContext(), Process.myPid()) });
    paramString = b.bt(paramString, p.sZ());
    if (bg.nm(paramString))
    {
      GMTrace.o(20286472716288L, 151146);
      return null;
    }
    paramString = "shortcut_" + b.W(paramString.getBytes());
    GMTrace.o(20286472716288L, 151146);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */