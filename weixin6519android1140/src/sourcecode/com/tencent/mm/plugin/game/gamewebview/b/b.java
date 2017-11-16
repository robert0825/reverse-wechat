package com.tencent.mm.plugin.game.gamewebview.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Map;

public final class b
{
  public static Map<String, a> lIj;
  
  public static void a(a parama)
  {
    GMTrace.i(16963912859648L, 126391);
    if (bg.nm(parama.getName()))
    {
      GMTrace.o(16963912859648L, 126391);
      return;
    }
    lIj.put(parama.getName(), parama);
    GMTrace.o(16963912859648L, 126391);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */