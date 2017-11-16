package com.tencent.mm.plugin.scanner;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.k;
import com.tencent.mm.k.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class a
{
  public static boolean an(int paramInt, String paramString)
  {
    GMTrace.i(17510850101248L, 130466);
    if (paramInt != 22)
    {
      GMTrace.o(17510850101248L, 130466);
      return false;
    }
    if (bg.nm(paramString))
    {
      GMTrace.o(17510850101248L, 130466);
      return false;
    }
    if ((ab.bPY()) || ((Looper.myLooper() == Looper.getMainLooper()) && (!f.ep("com.tencent.mm")))) {}
    HashSet localHashSet;
    for (Object localObject = bcl();; localObject = localHashSet)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (paramString.startsWith((String)((Iterator)localObject).next()))
        {
          GMTrace.o(17510850101248L, 130466);
          return true;
          localHashSet = new HashSet();
          Bundle localBundle = e.a("com.tencent.mm", null, a.class);
          localObject = "";
          if (localBundle != null) {
            localObject = localBundle.getString("wxCodePrefix", "");
          }
          localObject = ((String)localObject).split("|");
          paramInt = 0;
          while (paramInt < localObject.length)
          {
            if (!bg.nm(localObject[paramInt])) {
              localHashSet.add(localObject[paramInt]);
            }
            paramInt += 1;
          }
        }
      }
      GMTrace.o(17510850101248L, 130466);
      return false;
    }
  }
  
  public static Set<String> bcl()
  {
    GMTrace.i(17510984318976L, 130467);
    HashSet localHashSet = new HashSet();
    localHashSet.add("k");
    localHashSet.add("l");
    if (ab.bPY())
    {
      localObject = ((com.tencent.mm.plugin.zero.b.a)h.h(com.tencent.mm.plugin.zero.b.a.class)).uu();
      if (localObject == null) {
        break label140;
      }
    }
    label140:
    for (Object localObject = ((c)localObject).z("ScanCode", "weAppCodePrefix");; localObject = "")
    {
      w.v("MicroMsg.QRCodeLogic", "getWxCodePrefix(%s)", new Object[] { localObject });
      if (!bg.nm((String)localObject))
      {
        localObject = ((String)localObject).split("|");
        int i = 0;
        while (i < localObject.length)
        {
          if (!bg.nm(localObject[i])) {
            localHashSet.add(localObject[i]);
          }
          i += 1;
        }
      }
      GMTrace.o(17510984318976L, 130467);
      return localHashSet;
    }
  }
  
  private static class a
    implements k
  {
    private a()
    {
      GMTrace.i(17511118536704L, 130468);
      GMTrace.o(17511118536704L, 130468);
    }
    
    public final Bundle l(Bundle paramBundle)
    {
      GMTrace.i(17774453719040L, 132430);
      paramBundle = new Bundle();
      Object localObject = a.bcl();
      StringBuilder localStringBuilder = new StringBuilder();
      if (!((Set)localObject).isEmpty())
      {
        localObject = ((Set)localObject).iterator();
        localStringBuilder.append((String)((Iterator)localObject).next());
        while (((Iterator)localObject).hasNext())
        {
          localStringBuilder.append("|");
          localStringBuilder.append((String)((Iterator)localObject).next());
        }
        paramBundle.putString("wxCodePrefix", localStringBuilder.toString());
      }
      GMTrace.o(17774453719040L, 132430);
      return paramBundle;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\scanner\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */