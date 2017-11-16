package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.te;
import com.tencent.mm.g.a.te.a;
import com.tencent.mm.plugin.exdevice.b.k.f;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.service.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;

public final class af
  implements e
{
  com.tencent.mm.sdk.b.c fJv;
  
  public af()
  {
    GMTrace.i(10982768246784L, 81828);
    this.fJv = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(final te paramAnonymouste)
      {
        GMTrace.i(10972567699456L, 81752);
        if ((paramAnonymouste instanceof te)) {
          switch (paramAnonymouste.eYK.eCx)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(10972567699456L, 81752);
          return false;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WearHardDeviceLogic", "receive register deviceId=%s", new Object[] { paramAnonymouste.eYK.esG });
          i.kzF.a(ab.getContext(), new i.a()
          {
            public final void eb(boolean paramAnonymous2Boolean)
            {
              GMTrace.i(10967198990336L, 81712);
              if (!paramAnonymous2Boolean)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WearHardDeviceLogic", "GetBoundDeviceLogic Fail, deviceId=%s|deviceType=%s", new Object[] { paramAnonymouste.eYK.esG, paramAnonymouste.eYK.eEl });
                af.W(paramAnonymouste.eYK.esG, false);
                GMTrace.o(10967198990336L, 81712);
                return;
              }
              af.W(paramAnonymouste.eYK.esG, true);
              GMTrace.o(10967198990336L, 81712);
            }
          });
          continue;
          b localb = ad.atR().wT(paramAnonymouste.eYK.esG);
          paramAnonymouste = paramAnonymouste.eYK;
          if (localb != null) {}
          for (boolean bool = true;; bool = false)
          {
            paramAnonymouste.eFN = bool;
            break;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WearHardDeviceLogic", "receive send deviceId=%s", new Object[] { paramAnonymouste.eYK.esG });
          at.wS().a(538, af.this);
          paramAnonymouste = new w(0L, paramAnonymouste.eYK.eEl, paramAnonymouste.eYK.esG, k.f.atv(), bg.Pv(), paramAnonymouste.eYK.data, 1);
          at.wS().a(paramAnonymouste, 0);
          continue;
          at.wS().a(541, af.this);
          paramAnonymouste = new r("AndroidWear", paramAnonymouste.eYK.eEl, paramAnonymouste.eYK.esG, 1, new byte[0]);
          at.wS().a(paramAnonymouste, 0);
          continue;
          if (!bg.bc(ab.getContext(), ab.getPackageName() + ":exdevice")) {
            d.cl(ab.getContext());
          }
        }
      }
    };
    a.vgX.b(this.fJv);
    GMTrace.o(10982768246784L, 81828);
  }
  
  public static void W(String paramString, boolean paramBoolean)
  {
    GMTrace.i(16061969727488L, 119671);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WearHardDeviceLogic", "publish register response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    te localte = new te();
    localte.eYK.eCx = 2;
    localte.eYK.eFN = paramBoolean;
    localte.eYK.esG = paramString;
    a.vgX.m(localte);
    GMTrace.o(16061969727488L, 119671);
  }
  
  private static void X(String paramString, boolean paramBoolean)
  {
    GMTrace.i(10983036682240L, 81830);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WearHardDeviceLogic", "publish auth response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    te localte = new te();
    localte.eYK.eCx = 8;
    localte.eYK.eFN = paramBoolean;
    localte.eYK.esG = paramString;
    a.vgX.m(localte);
    GMTrace.o(10983036682240L, 81830);
  }
  
  private static void Y(String paramString, boolean paramBoolean)
  {
    GMTrace.i(10983170899968L, 81831);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WearHardDeviceLogic", "publish send response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    te localte = new te();
    localte.eYK.eCx = 5;
    localte.eYK.eFN = paramBoolean;
    localte.eYK.esG = paramString;
    a.vgX.m(localte);
    GMTrace.o(10983170899968L, 81831);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10982902464512L, 81829);
    if ((paramk instanceof r))
    {
      at.wS().b(541, this);
      paramString = (r)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        X(paramString.kzW, true);
        GMTrace.o(10982902464512L, 81829);
        return;
      }
      X(paramString.kzW, false);
      GMTrace.o(10982902464512L, 81829);
      return;
    }
    if ((paramk instanceof w))
    {
      at.wS().b(538, this);
      paramString = (w)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Y(paramString.kzY, true);
        GMTrace.o(10982902464512L, 81829);
        return;
      }
      Y(paramString.kzY, false);
    }
    GMTrace.o(10982902464512L, 81829);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */