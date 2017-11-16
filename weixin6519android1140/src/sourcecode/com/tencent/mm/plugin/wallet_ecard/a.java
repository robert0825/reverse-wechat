package com.tencent.mm.plugin.wallet_ecard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.la;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.y.aq;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class a
  implements aq
{
  private c<cl> rqS;
  private c<la> rqT;
  
  public a()
  {
    GMTrace.i(19588406312960L, 145945);
    this.rqS = new c()
    {
      private boolean a(final cl paramAnonymouscl)
      {
        GMTrace.i(19588137877504L, 145943);
        final cl.a locala = paramAnonymouscl.eDH;
        com.tencent.mm.plugin.wallet_core.c.a locala1 = new com.tencent.mm.plugin.wallet_core.c.a(locala.appId, locala.eDJ, locala.nonceStr, locala.packageExt, locala.signType, locala.signature, locala.eDK, 15);
        h.xz();
        h.xx().fYr.a(580, new e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
          {
            GMTrace.i(19593238151168L, 145981);
            h.xz();
            h.xx().fYr.b(580, this);
            if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
            {
              w.i("MicroMsg.SubCoreECard", "jsapi check success");
              paramAnonymous2String = (Context)locala.eDN.get();
              if ((paramAnonymous2String != null) && ((paramAnonymous2String instanceof Activity)))
              {
                com.tencent.mm.plugin.wallet_ecard.a.b.a(bg.getInt(paramAnonymouscl.eDH.eDM, 0), paramAnonymous2String, new b.a()
                {
                  public final Intent k(int paramAnonymous3Int, Bundle paramAnonymous3Bundle)
                  {
                    GMTrace.i(19593506586624L, 145983);
                    w.i("MicroMsg.SubCoreECard", "open process end: %s", new Object[] { Integer.valueOf(paramAnonymous3Int) });
                    if (paramAnonymous3Int == -1) {}
                    for (a.1.1.this.rqW.eDI.retCode = 0;; a.1.1.this.rqW.eDI.retCode = -1)
                    {
                      a.1.1.this.rqW.eDH.eDO.run();
                      GMTrace.o(19593506586624L, 145983);
                      return null;
                    }
                  }
                });
                GMTrace.o(19593238151168L, 145981);
                return;
              }
              paramAnonymouscl.eDI.retCode = -1;
              paramAnonymouscl.eDH.eDO.run();
              GMTrace.o(19593238151168L, 145981);
              return;
            }
            w.e("MicroMsg.SubCoreECard", "jsapi check fail");
            paramAnonymouscl.eDI.retCode = -1;
            paramAnonymouscl.eDH.eDO.run();
            GMTrace.o(19593238151168L, 145981);
          }
        });
        h.xz();
        h.xx().fYr.a(locala1, 0);
        GMTrace.o(19588137877504L, 145943);
        return false;
      }
    };
    this.rqT = new c() {};
    GMTrace.o(19588406312960L, 145945);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(19588808966144L, 145948);
    this.rqS.bPu();
    this.rqT.bPu();
    GMTrace.o(19588808966144L, 145948);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(19588943183872L, 145949);
    GMTrace.o(19588943183872L, 145949);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(19588674748416L, 145947);
    GMTrace.o(19588674748416L, 145947);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(19589077401600L, 145950);
    this.rqS.dead();
    this.rqT.dead();
    GMTrace.o(19589077401600L, 145950);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(19588540530688L, 145946);
    GMTrace.o(19588540530688L, 145946);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */