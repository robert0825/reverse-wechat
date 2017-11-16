package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.d.r;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.bp.a;
import com.tencent.mm.g.a.lc;
import com.tencent.mm.g.a.lc.a;
import com.tencent.mm.g.a.lc.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;

public abstract class a
  implements k
{
  public a()
  {
    GMTrace.i(10776072945664L, 80288);
    GMTrace.o(10776072945664L, 80288);
  }
  
  public final void a(lc paramlc, int paramInt, String paramString)
  {
    GMTrace.i(10776878252032L, 80294);
    w.i("MicroMsg.BaseFingerprintImp", "hy: onOpenFingerprintAuthFailed");
    if ((paramlc != null) && (paramlc.ePm.ePq != null))
    {
      paramlc.ePn = new lc.b();
      paramlc.ePn.errCode = paramInt;
      paramlc.ePn.eJR = "";
      paramlc.ePn.eJS = "";
      paramlc.ePn.eAR = paramString;
      paramlc.ePn.ePs = type();
      paramlc.ePm.ePq.run();
    }
    GMTrace.o(10776878252032L, 80294);
  }
  
  public final boolean azt()
  {
    GMTrace.i(10776475598848L, 80291);
    boolean bool = e.azR();
    GMTrace.o(10776475598848L, 80291);
    return bool;
  }
  
  public final boolean azu()
  {
    GMTrace.i(10776609816576L, 80292);
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    boolean bool = c.azy();
    GMTrace.o(10776609816576L, 80292);
    return bool;
  }
  
  public boolean azv()
  {
    GMTrace.i(10776744034304L, 80293);
    GMTrace.o(10776744034304L, 80293);
    return false;
  }
  
  public final void cp(Context paramContext)
  {
    GMTrace.i(10776207163392L, 80289);
    w.i("MicroMsg.BaseFingerprintImp", "showFingerPrintEntrance");
    if ((e.azR()) && (!azu()))
    {
      w.e("MicroMsg.BaseFingerprintImp", "the fingerprint is open ready, but system has none Finger print ids!");
      w.i("MicroMsg.BaseFingerprintImp", "closeFP");
      final bp localbp = new bp();
      localbp.eDO = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10784126009344L, 80348);
          if (localbp.eCN != null)
          {
            if (localbp.eCN.retCode == 0)
            {
              w.i("MicroMsg.BaseFingerprintImp", "close finger print success!");
              if (!q.zR())
              {
                w.i("MicroMsg.BaseFingerprintImp", "do bound query, update data");
                h.xz();
                h.xx().fYr.a(new o(null, 1), 0);
                GMTrace.o(10784126009344L, 80348);
                return;
              }
              w.i("MicroMsg.BaseFingerprintImp", "now context is isPayUPay!");
              GMTrace.o(10784126009344L, 80348);
              return;
            }
            w.i("MicroMsg.BaseFingerprintImp", "close finger print failed!");
          }
          GMTrace.o(10784126009344L, 80348);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.a(localbp, paramContext.getMainLooper());
      GMTrace.o(10776207163392L, 80289);
      return;
    }
    if (p.fQG.fQO != 1)
    {
      w.e("MicroMsg.BaseFingerprintImp", "hy: device info not support");
      GMTrace.o(10776207163392L, 80289);
      return;
    }
    if ((e.azR()) || ((!e.azU()) && (!e.azV()))) {
      w.e("MicroMsg.BaseFingerprintImp", "mgr == null or not support FP or has show guide or show HWManager!");
    }
    GMTrace.o(10776207163392L, 80289);
  }
  
  public final void eD(boolean paramBoolean)
  {
    GMTrace.i(16567299473408L, 123436);
    w.i("MicroMsg.BaseFingerprintImp", "hy: set isOpenFp: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    e.eE(paramBoolean);
    GMTrace.o(16567299473408L, 123436);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */