package com.tencent.mm.bh;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
{
  public static boolean bIM()
  {
    GMTrace.i(299708186624L, 2233);
    String str2 = g.ut().getValue("EnableStrangerChat");
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = "0";
    }
    boolean bool = "1".equals(str1);
    GMTrace.o(299708186624L, 2233);
    return bool;
  }
  
  public static void dA(Context paramContext)
  {
    GMTrace.i(299842404352L, 2234);
    if ((!bIM()) && (l.MM().ME() > 0))
    {
      d.x(paramContext, "nearby", ".ui.NearbyFriendShowSayHiUI");
      GMTrace.o(299842404352L, 2234);
      return;
    }
    d.x(paramContext, "nearby", ".ui.NearbyFriendsUI");
    GMTrace.o(299842404352L, 2234);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bh\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */