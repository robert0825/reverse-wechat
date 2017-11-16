package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ay.a;

public final class x
{
  public static aq J(String paramString1, String paramString2)
  {
    GMTrace.i(616193589248L, 4591);
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      GMTrace.o(616193589248L, 4591);
      return null;
    }
    at.AR();
    ay localay = c.yS().CB(paramString1);
    if (localay != null) {
      if (localay.vCf != 1) {
        break label77;
      }
    }
    label77:
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(616193589248L, 4591);
      return null;
    }
    String str2 = localay.name;
    String str1 = localay.vCe.Ux("");
    paramString1 = "";
    if (str1 != null) {
      paramString1 = "" + str1.replace("@", "");
    }
    str1 = paramString1;
    if (paramString2 != null) {
      str1 = paramString1 + paramString2;
    }
    paramString1 = new aq("@domain.android", str2, str1, localay.vCe.Ux(""), localay.isEnable(), true);
    GMTrace.o(616193589248L, 4591);
    return paramString1;
  }
  
  public static aq gA(String paramString)
  {
    GMTrace.i(615925153792L, 4589);
    paramString = new aq("@black.android", null, paramString, null, true, true);
    GMTrace.o(615925153792L, 4589);
    return paramString;
  }
  
  public static aq gB(String paramString)
  {
    GMTrace.i(616059371520L, 4590);
    at.AR();
    ay localay = c.yS().CB("@t.qq.com");
    if (localay == null)
    {
      GMTrace.o(616059371520L, 4590);
      return null;
    }
    paramString = new aq("@t.qq.com", null, paramString, null, localay.isEnable(), localay.bUo());
    GMTrace.o(616059371520L, 4590);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */