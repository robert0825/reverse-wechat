package com.tencent.mm.plugin.game.gamewebview.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aiv;
import java.util.HashMap;

public final class a
{
  private static final HashMap<String, aiv> lLb;
  
  static
  {
    GMTrace.i(16966462996480L, 126410);
    lLb = new HashMap();
    GMTrace.o(16966462996480L, 126410);
  }
  
  public static boolean bi(String paramString1, String paramString2)
  {
    GMTrace.i(16966328778752L, 126409);
    paramString1 = (aiv)lLb.get(paramString1 + "#" + paramString2);
    if ((paramString1 != null) && (paramString1.tSt == 1))
    {
      GMTrace.o(16966328778752L, 126409);
      return true;
    }
    GMTrace.o(16966328778752L, 126409);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */