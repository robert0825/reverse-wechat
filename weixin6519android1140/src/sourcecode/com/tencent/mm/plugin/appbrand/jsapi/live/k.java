package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.ITXLiveBaseListener;
import com.tencent.rtmp.TXLiveBase;

public final class k
{
  private static boolean ifL;
  
  public static void WV()
  {
    GMTrace.i(20720935501824L, 154383);
    if (ifL)
    {
      GMTrace.o(20720935501824L, 154383);
      return;
    }
    TXLiveBase.setLogLevel(1);
    TXLiveBase.setConsoleEnabled(false);
    TXLiveBase.setListener(new ITXLiveBaseListener()
    {
      public final void OnLog(int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(20725096251392L, 154414);
        switch (paramAnonymousInt)
        {
        default: 
          w.d(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20725096251392L, 154414);
          return;
        case 0: 
          w.v(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20725096251392L, 154414);
          return;
        case 1: 
          w.d(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20725096251392L, 154414);
          return;
        case 2: 
          w.i(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20725096251392L, 154414);
          return;
        case 3: 
          w.w(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20725096251392L, 154414);
          return;
        case 4: 
          w.e(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20725096251392L, 154414);
          return;
        }
        w.f(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(20725096251392L, 154414);
      }
    });
    ifL = true;
    GMTrace.o(20720935501824L, 154383);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */