package com.tencent.mm.plugin.game.gamewebview.model;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;

public final class b
{
  private static HashMap<String, String> lIn;
  
  static
  {
    GMTrace.i(17076789968896L, 127232);
    lIn = new HashMap();
    GMTrace.o(17076789968896L, 127232);
  }
  
  public static void co(String paramString1, String paramString2)
  {
    GMTrace.i(17076387315712L, 127229);
    lIn.put(paramString1, paramString2);
    GMTrace.o(17076387315712L, 127229);
  }
  
  public static String zr(String paramString)
  {
    GMTrace.i(17076521533440L, 127230);
    paramString = (String)lIn.get(paramString);
    GMTrace.o(17076521533440L, 127230);
    return paramString;
  }
  
  public static void zs(String paramString)
  {
    GMTrace.i(17076655751168L, 127231);
    lIn.remove(paramString);
    GMTrace.o(17076655751168L, 127231);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */