package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.pluginsdk.ui.d.i;
import com.tencent.mm.pluginsdk.ui.d.m;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;

public final class b
{
  public static CharSequence a(Context paramContext, bew parambew, av paramav, int paramInt, String paramString)
  {
    GMTrace.i(8328210022400L, 62050);
    String str1 = a(parambew);
    Object localObject3 = null;
    int k = 0;
    int j = 0;
    int i;
    String str2;
    Object localObject2;
    Object localObject1;
    if (paramInt == 21)
    {
      i = 3;
      str2 = parambew.nIp;
      localObject2 = null;
      if (!bg.nm(paramString))
      {
        com.tencent.mm.kernel.h.xz();
        localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(paramString);
      }
      if (parambew.uQr != 1) {
        break label394;
      }
      if (localObject2 == null) {
        break label364;
      }
      localObject1 = paramString;
      if (localObject2 != null)
      {
        if (!TextUtils.isEmpty(((x)localObject2).vk())) {
          break label354;
        }
        localObject1 = paramString;
      }
      label112:
      paramString = str1 + paramContext.getString(i.j.piE);
      j = paramString.length();
      paramString = paramString + (String)localObject1;
      localObject2 = localObject3;
    }
    for (;;)
    {
      label172:
      paramString = "" + paramString + ": ";
      paramContext = com.tencent.mm.pluginsdk.ui.d.h.a(paramContext, paramString + str2, com.tencent.mm.br.a.fromDPToPix(paramContext, (int)(14.0F * com.tencent.mm.br.a.dZ(paramContext))), 2);
      if (paramInt == 21)
      {
        paramInt = 3;
        label245:
        com.tencent.mm.kernel.h.xz();
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC(parambew.tRz);
        paramContext = new i(paramContext);
        paramContext.a(new m(parambew.tRz, paramav.pYR, paramInt), str1, 0, 33);
        if (localObject1 == null) {
          break label518;
        }
        paramContext.a(new m(parambew.uQG, paramav.pYR, i), (CharSequence)localObject1, j, 33);
      }
      for (;;)
      {
        GMTrace.o(8328210022400L, 62050);
        return paramContext;
        i = 2;
        break;
        label354:
        localObject1 = ((x)localObject2).vk();
        break label112;
        label364:
        w.w("SnsCommentUtil", "feedContact null by feedOwnUserName %s", new Object[] { paramString });
        localObject1 = null;
        paramString = str1;
        localObject2 = localObject3;
        break label172;
        label394:
        if (bg.nm(parambew.uQG)) {
          break label553;
        }
        paramString = ae.biR().TD(parambew.uQG);
        if (paramString == null) {}
        for (paramString = parambew.uQG;; paramString = paramString.vk())
        {
          localObject1 = str1 + paramContext.getString(i.j.pku);
          k = ((String)localObject1).length();
          localObject1 = (String)localObject1 + paramString;
          localObject3 = null;
          localObject2 = paramString;
          paramString = (String)localObject1;
          localObject1 = localObject3;
          break;
        }
        paramInt = 2;
        break label245;
        label518:
        if (localObject2 != null) {
          paramContext.a(new m(parambew.uQG, paramav.pYR, i), (CharSequence)localObject2, k, 33);
        }
      }
      label553:
      localObject1 = null;
      paramString = str1;
      localObject2 = localObject3;
    }
  }
  
  public static String a(bew parambew)
  {
    GMTrace.i(8328344240128L, 62051);
    x localx = ae.biR().TD(parambew.tRz);
    if (localx != null)
    {
      parambew = localx.vk();
      GMTrace.o(8328344240128L, 62051);
      return parambew;
    }
    if (parambew.uBf != null)
    {
      parambew = parambew.uBf;
      GMTrace.o(8328344240128L, 62051);
      return parambew;
    }
    parambew = parambew.tRz;
    GMTrace.o(8328344240128L, 62051);
    return parambew;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */