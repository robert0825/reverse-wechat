package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.notification.c;
import com.tencent.mm.booter.notification.e;
import com.tencent.mm.booter.notification.f.a;
import com.tencent.mm.plugin.zero.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  implements b
{
  public g()
  {
    GMTrace.i(8030783537152L, 59834);
    GMTrace.o(8030783537152L, 59834);
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(8030917754880L, 59835);
    int i;
    if (bg.nm(paramString2))
    {
      paramString2 = ab.getContext();
      if (com.tencent.mm.k.f.eb(paramString1))
      {
        i = R.l.dhh;
        paramString2 = paramString2.getString(i);
      }
    }
    for (;;)
    {
      e locale = f.a.fKW.fKV;
      if (!com.tencent.mm.k.f.tM()) {
        e.cancel();
      }
      try
      {
        locale.fKN.a(paramLong, paramString1, paramString2, paramString3, paramString4, false, paramInt);
        GMTrace.o(8030917754880L, 59835);
        return;
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.Notification.Handle", "push:notify, error");
        w.printErrStackTrace("MicroMsg.Notification.Handle", paramString1, "", new Object[0]);
        GMTrace.o(8030917754880L, 59835);
        return;
      }
      i = R.l.dDi;
      break;
    }
  }
  
  public final void agT()
  {
    GMTrace.i(8031051972608L, 59836);
    f.a.fKW.i(-1, null);
    GMTrace.o(8031051972608L, 59836);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */