package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;

public final class bc
{
  private static final HashMap<String, String> vlc;
  
  static
  {
    GMTrace.i(13906969886720L, 103615);
    vlc = new HashMap();
    GMTrace.o(13906969886720L, 103615);
  }
  
  public static String getProperty(String paramString)
  {
    GMTrace.i(13906701451264L, 103613);
    paramString = (String)vlc.get(paramString);
    GMTrace.o(13906701451264L, 103613);
    return paramString;
  }
  
  public static void setProperty(String paramString1, String paramString2)
  {
    GMTrace.i(13906835668992L, 103614);
    vlc.put(paramString1, paramString2);
    GMTrace.o(13906835668992L, 103614);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */