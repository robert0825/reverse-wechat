package com.tencent.mm.compatible.util;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.bg;

public final class n
{
  public static String dT(String paramString)
  {
    GMTrace.i(13779731480576L, 102667);
    if (paramString == null)
    {
      GMTrace.o(13779731480576L, 102667);
      return paramString;
    }
    if (p.fQL.fPz == 2)
    {
      GMTrace.o(13779731480576L, 102667);
      return paramString;
    }
    if (p.fQL.fPK == 1)
    {
      GMTrace.o(13779731480576L, 102667);
      return paramString;
    }
    if (p.fQL.fPz == 1)
    {
      if (paramString.toString().contains("\n"))
      {
        paramString = paramString.toString().replace("\n", " ");
        GMTrace.o(13779731480576L, 102667);
        return paramString;
      }
      GMTrace.o(13779731480576L, 102667);
      return paramString;
    }
    if (Build.VERSION.SDK_INT == 16)
    {
      if (paramString.toString().contains("\n"))
      {
        if (bg.aq(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) >= 0)
        {
          GMTrace.o(13779731480576L, 102667);
          return paramString;
        }
        paramString = paramString.toString().replace("\n", " ");
        GMTrace.o(13779731480576L, 102667);
        return paramString;
      }
      GMTrace.o(13779731480576L, 102667);
      return paramString;
    }
    GMTrace.o(13779731480576L, 102667);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */