package com.tencent.mm.bk;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.agl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class b
{
  public static void run()
  {
    GMTrace.i(13047171121152L, 97209);
    if ((!at.AU()) || (at.wF()))
    {
      GMTrace.o(13047171121152L, 97209);
      return;
    }
    long l3 = bg.Pu();
    at.AR();
    long l2 = bg.a((Long)c.xh().get(331797, null), 0L);
    long l1 = l2;
    if (10013 == r.hkj)
    {
      l1 = l2;
      if (r.hkk != 0) {
        l1 = 0L;
      }
    }
    if (l1 < l3)
    {
      at.AR();
      c.xh().set(331797, Long.valueOf(l3 + 432000L));
      try
      {
        agl localagl = new agl();
        localagl.uwc = "";
        Account[] arrayOfAccount = AccountManager.get(ab.getContext()).getAccountsByType("com.google");
        int j = arrayOfAccount.length;
        int i = 0;
        while (i < j)
        {
          Account localAccount = arrayOfAccount[i];
          if (!bg.nm(localagl.uwc)) {
            break;
          }
          w.i("MicroMsg.PostTaskGoogleAcc", "google account[%s]", new Object[] { localAccount.name });
          localagl.uwc = localAccount.name;
          i += 1;
        }
        if ((10013 == r.hkj) && (r.hkk != 0)) {
          localagl.uwc = "rssjbbk@gmail.com";
        }
        if (!bg.nm(localagl.uwc))
        {
          at.AR();
          c.yJ().b(new e.a(57, localagl));
          GMTrace.o(13047171121152L, 97209);
          return;
        }
        w.w("MicroMsg.PostTaskGoogleAcc", "Get Accounts failed , Not any info?");
        GMTrace.o(13047171121152L, 97209);
        return;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.PostTaskGoogleAcc", "Get Accounts failed :%s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(13047171121152L, 97209);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */