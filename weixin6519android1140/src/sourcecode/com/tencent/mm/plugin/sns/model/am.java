package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class am
{
  private static final Map<String, String> pvE;
  
  static
  {
    GMTrace.i(8147687178240L, 60705);
    pvE = new HashMap();
    GMTrace.o(8147687178240L, 60705);
  }
  
  public static String dE(String paramString1, String paramString2)
  {
    GMTrace.i(8147418742784L, 60703);
    if (paramString2 == null)
    {
      GMTrace.o(8147418742784L, 60703);
      return "";
    }
    boolean bool = Looper.getMainLooper().equals(Looper.myLooper());
    if ((bool) && (pvE.containsKey(paramString1 + paramString2)))
    {
      str = (String)pvE.get(paramString1 + paramString2);
      if (!bg.nm(str))
      {
        GMTrace.o(8147418742784L, 60703);
        return str;
      }
    }
    String str = g.n(paramString2.getBytes());
    StringBuffer localStringBuffer = new StringBuffer(paramString1);
    if (str.length() > 0)
    {
      localStringBuffer.append(str.charAt(0));
      localStringBuffer.append("/");
    }
    if (str.length() >= 2)
    {
      localStringBuffer.append(str.charAt(1));
      localStringBuffer.append("/");
    }
    if (bool) {
      pvE.put(paramString1 + paramString2, localStringBuffer.toString());
    }
    paramString1 = localStringBuffer.toString();
    GMTrace.o(8147418742784L, 60703);
    return paramString1;
  }
  
  public static void release()
  {
    try
    {
      GMTrace.i(8147552960512L, 60704);
      pvE.clear();
      GMTrace.o(8147552960512L, 60704);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */