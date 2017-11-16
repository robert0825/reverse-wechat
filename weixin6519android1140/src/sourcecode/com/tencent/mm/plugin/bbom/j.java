package com.tencent.mm.plugin.bbom;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;

public final class j
  implements e
{
  static j jjR;
  
  public j()
  {
    GMTrace.i(8027025440768L, 59806);
    GMTrace.o(8027025440768L, 59806);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8027159658496L, 59807);
    if ((paramInt1 == 4) && (!at.wS().foreground)) {}
    switch (paramInt2)
    {
    default: 
      GMTrace.o(8027159658496L, 59807);
      return;
    case -311: 
    case -310: 
    case -205: 
    case -72: 
    case -9: 
    case -6: 
    case -4: 
    case -3: 
      at.getNotification().dw(ab.getContext().getString(R.l.dHZ));
      at.hold();
      GMTrace.o(8027159658496L, 59807);
      return;
    case -140: 
      w.e("MicroMsg.NewSyncErrorProcessor", "alpha need whitelist : [%s]", new Object[] { paramString });
      if (!bg.nm(paramString)) {
        at.getNotification().dw(paramString);
      }
      for (;;)
      {
        at.hold();
        GMTrace.o(8027159658496L, 59807);
        return;
        at.getNotification().dw(ab.getContext().getString(R.l.dHZ));
      }
    case -100: 
      at.getNotification().dw(ab.getContext().getString(R.l.dHY));
      d.bl(ab.getContext());
      at.hold();
      GMTrace.o(8027159658496L, 59807);
      return;
    case -999999: 
      new ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8029844013056L, 59827);
          at.hold();
          MMAppMgr.lj(true);
          GMTrace.o(8029844013056L, 59827);
        }
      });
      GMTrace.o(8027159658496L, 59807);
      return;
    }
    paramString = ab.getContext().getSharedPreferences("system_config_prefs", 0);
    long l = paramString.getLong("recomended_update_ignore", -1L);
    if ((l != -1L) && (bg.aG(l) < 86400L))
    {
      w.d("MicroMsg.NewSyncErrorProcessor", "skip update notification, last check=" + l);
      GMTrace.o(8027159658496L, 59807);
      return;
    }
    paramk = at.getNotification();
    if (paramInt2 == -17) {}
    for (paramInt1 = 2;; paramInt1 = 1)
    {
      paramk.dT(paramInt1);
      paramString.edit().putLong("recomended_update_ignore", bg.Pu()).commit();
      g.ork.a(405L, 27L, 1L, true);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */