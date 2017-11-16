package com.tencent.mm.y.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.plugin.messenger.foundation.a.l;
import java.util.Map;

public final class a
  implements l
{
  public a()
  {
    GMTrace.i(14592017170432L, 108719);
    GMTrace.o(14592017170432L, 108719);
  }
  
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    Object localObject = null;
    GMTrace.i(14592151388160L, 108720);
    paramMap = (Map<String, String>)localObject;
    if (paramString != null)
    {
      paramMap = (Map<String, String>)localObject;
      if (paramString.equals("abtest"))
      {
        paramString = d.c.aF(Integer.valueOf(-1879048184));
        if (paramString != null) {
          break label56;
        }
      }
    }
    label56:
    for (paramMap = (Map<String, String>)localObject;; paramMap = paramString.b(parama))
    {
      GMTrace.o(14592151388160L, 108720);
      return paramMap;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\y\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */