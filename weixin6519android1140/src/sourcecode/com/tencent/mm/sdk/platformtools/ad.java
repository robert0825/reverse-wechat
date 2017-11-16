package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;
import java.util.Set;

public final class ad
{
  private static Set<String> viq;
  
  static
  {
    GMTrace.i(13904553967616L, 103597);
    viq = new HashSet();
    GMTrace.o(13904553967616L, 103597);
  }
  
  public static boolean RS(String paramString)
  {
    GMTrace.i(13904151314432L, 103594);
    if (RU(paramString))
    {
      w.d("MicroMsg.MMEntryLock", "locked-" + paramString);
      GMTrace.o(13904151314432L, 103594);
      return false;
    }
    w.d("MicroMsg.MMEntryLock", "lock-" + paramString);
    boolean bool = viq.add(paramString);
    GMTrace.o(13904151314432L, 103594);
    return bool;
  }
  
  public static void RT(String paramString)
  {
    GMTrace.i(13904285532160L, 103595);
    viq.remove(paramString);
    w.d("MicroMsg.MMEntryLock", "unlock-" + paramString);
    GMTrace.o(13904285532160L, 103595);
  }
  
  public static boolean RU(String paramString)
  {
    GMTrace.i(13904419749888L, 103596);
    boolean bool = viq.contains(paramString);
    GMTrace.o(13904419749888L, 103596);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */