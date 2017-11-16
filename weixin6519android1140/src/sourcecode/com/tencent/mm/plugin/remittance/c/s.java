package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class s
{
  public static void FE(String paramString)
  {
    GMTrace.i(10797413564416L, 80447);
    if (bg.nm(paramString))
    {
      GMTrace.o(10797413564416L, 80447);
      return;
    }
    Object localObject = bbu();
    w.d("Micromsg.RemittanceLogic", "cur friendsListStr=" + (String)localObject);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!bg.nm((String)localObject))
    {
      localObject = ((String)localObject).split(",");
      if (localObject != null)
      {
        int i = 0;
        int k;
        for (int j = 0; i < localObject.length; j = k)
        {
          k = j;
          if (!paramString.equals(localObject[i]))
          {
            localStringBuilder.append(localObject[i]);
            localStringBuilder.append(",");
            k = j + 1;
            if (k >= 4) {
              break;
            }
          }
          i += 1;
        }
      }
    }
    localStringBuilder.insert(0, ",");
    localStringBuilder.insert(0, paramString);
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    w.d("Micromsg.RemittanceLogic", "new friendsListStr=" + localStringBuilder.toString());
    h.xz();
    h.xy().xh().set(327733, localStringBuilder.toString());
    h.xz();
    h.xy().xh().kL(true);
    GMTrace.o(10797413564416L, 80447);
  }
  
  public static String bbu()
  {
    GMTrace.i(10797547782144L, 80448);
    h.xz();
    String str = bg.nl((String)h.xy().xh().get(327733, null));
    GMTrace.o(10797547782144L, 80448);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */