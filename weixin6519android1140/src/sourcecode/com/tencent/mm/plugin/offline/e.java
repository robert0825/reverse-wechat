package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.offline.a.o;
import com.tencent.mm.plugin.offline.c.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends a<b>
{
  public String nzv;
  private i.a nzw;
  
  public e()
  {
    GMTrace.i(6254411907072L, 46599);
    this.nzv = "";
    this.nzw = new i.a()
    {
      public final void aVc()
      {
        GMTrace.i(6187705696256L, 46102);
        e.this.aic();
        GMTrace.o(6187705696256L, 46102);
      }
    };
    k.aVi();
    if (k.aVl() != null)
    {
      k.aVi();
      k.aVl().nzZ = this.nzw;
    }
    GMTrace.o(6254411907072L, 46599);
  }
  
  private static void aVa()
  {
    GMTrace.i(6254546124800L, 46600);
    k.aVi();
    k.aVl().cI(1, 1);
    GMTrace.o(6254546124800L, 46600);
  }
  
  public static int aVb()
  {
    GMTrace.i(6254814560256L, 46602);
    k.aVi();
    k.aVl();
    int i = i.aVh();
    GMTrace.o(6254814560256L, 46602);
    return i;
  }
  
  public final void aic()
  {
    GMTrace.i(6254277689344L, 46598);
    if (this.nzs == null)
    {
      GMTrace.o(6254277689344L, 46598);
      return;
    }
    int i = 0;
    while (i < this.nzs.size())
    {
      Object localObject = (WeakReference)this.nzs.get(i);
      if (localObject != null)
      {
        localObject = (b)((WeakReference)localObject).get();
        if (localObject != null) {
          ((b)localObject).ajN();
        }
      }
      i += 1;
    }
    GMTrace.o(6254277689344L, 46598);
  }
  
  public final String m(int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    GMTrace.i(17970143166464L, 133888);
    int j = aVb();
    Object localObject;
    if (j > 0)
    {
      if (j < k.nAo)
      {
        w.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount < %s", new Object[] { Integer.valueOf(k.nAo) });
        k.aVi();
        k.aVl().cH(2, 2);
      }
      k.aVi();
      localObject = k.sf(196617);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        w.e("MicroMsg.OfflineCodesMgr", "generateKey_V3 cn is null, the csr is not exist! cn:" + (String)localObject);
        GMTrace.o(17970143166464L, 133888);
        return "";
      }
      com.tencent.mm.wallet_core.c.a.clF();
      localObject = com.tencent.mm.wallet_core.c.a.getToken((String)localObject);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        aVa();
        w.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null");
        GMTrace.o(17970143166464L, 133888);
        return "";
      }
    }
    else
    {
      paramString = g.ork;
      if (com.tencent.mm.plugin.offline.c.a.cR(ab.getContext()))
      {
        paramInt1 = 0;
        paramInt2 = i;
        if (am.isNetworkConnected(ab.getContext())) {
          paramInt2 = 1;
        }
        paramString.i(14163, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        g.ork.a(135L, 29L, 1L, true);
        if (!am.isNetworkConnected(ab.getContext())) {
          break label277;
        }
        g.ork.a(135L, 31L, 1L, true);
      }
      for (;;)
      {
        aVa();
        w.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount is 0");
        GMTrace.o(17970143166464L, 133888);
        return "";
        paramInt1 = 1;
        break;
        label277:
        g.ork.a(135L, 30L, 1L, true);
      }
    }
    if (localObject != null) {
      w.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code length : %s ext_business_attach %s", new Object[] { Integer.valueOf(((String)localObject).length()), paramString });
    }
    paramString = new o(j - 1, paramInt1, paramInt2, paramString);
    h.xz();
    h.xx().fYr.a(paramString, 0);
    w.i("MicroMsg.OfflineCodesMgr", "doNetSceneShowCode count " + (j - 1));
    paramString = com.tencent.mm.plugin.offline.c.a.Ek(com.tencent.mm.plugin.offline.c.a.aWi());
    if ((paramString == null) || (paramString.size() == 0))
    {
      w.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 cardList is null");
      aVa();
      GMTrace.o(17970143166464L, 133888);
      return "";
    }
    long l2;
    long l1;
    if ((localObject != null) && (com.tencent.mm.plugin.offline.c.a.uE((String)localObject)))
    {
      l2 = Long.valueOf((String)localObject, 10).longValue();
      l1 = 0L;
      paramInt1 = 0;
      if (paramInt1 >= paramString.size()) {
        break label530;
      }
      localObject = (a.a)paramString.get(paramInt1);
      if ((localObject == null) || (((a.a)localObject).nDu == null) || (!((a.a)localObject).nDu.equals(this.nzv))) {
        break label732;
      }
      l1 = ((a.a)localObject).nDs;
    }
    label530:
    label711:
    label732:
    for (;;)
    {
      paramInt1 += 1;
      break;
      w.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null or is not isNumeric");
      GMTrace.o(17970143166464L, 133888);
      return "";
      localObject = String.valueOf(l1 << 48 | l2);
      if (((String)localObject).length() == 15)
      {
        paramString = "0" + (String)localObject;
        if (TextUtils.isEmpty(com.tencent.mm.plugin.offline.c.a.aWk())) {
          break label711;
        }
      }
      for (paramString = com.tencent.mm.plugin.offline.c.a.aWk() + paramString;; paramString = "12" + paramString)
      {
        GMTrace.o(17970143166464L, 133888);
        return paramString;
        if (((String)localObject).length() == 14)
        {
          paramString = "00" + (String)localObject;
          break;
        }
        if (((String)localObject).length() == 13)
        {
          paramString = "000" + (String)localObject;
          break;
        }
        paramString = (String)localObject;
        if (((String)localObject).length() != 12) {
          break;
        }
        paramString = "0000" + (String)localObject;
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */