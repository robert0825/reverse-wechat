package com.tencent.mm.plugin.wallet.pwd.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.protocal.c.ape;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;

public class WalletDelayTransferSettingUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private f htU;
  private long jZy;
  private String mTitle;
  private String onC;
  private Preference raE;
  private Preference raF;
  private Preference raG;
  private Preference raH;
  private String raI;
  private int raJ;
  
  public WalletDelayTransferSettingUI()
  {
    GMTrace.i(7755905630208L, 57786);
    this.raJ = 0;
    GMTrace.o(7755905630208L, 57786);
  }
  
  private void bxL()
  {
    GMTrace.i(7756174065664L, 57788);
    if ((this.raJ == 1) && (!bg.nm(this.onC)))
    {
      a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7753489711104L, 57768);
          com.tencent.mm.wallet_core.ui.e.m(WalletDelayTransferSettingUI.this.vKB.vKW, WalletDelayTransferSettingUI.a(WalletDelayTransferSettingUI.this), false);
          GMTrace.o(7753489711104L, 57768);
          return false;
        }
      });
      GMTrace.o(7756174065664L, 57788);
      return;
    }
    this.vKB.bXE();
    GMTrace.o(7756174065664L, 57788);
  }
  
  private void bxM()
  {
    GMTrace.i(7757113589760L, 57795);
    if (sJ(16))
    {
      this.raE.setWidgetLayoutResource(a.g.cCg);
      this.raF.setWidgetLayoutResource(a.g.cCf);
      this.raG.setWidgetLayoutResource(a.g.cCg);
      GMTrace.o(7757113589760L, 57795);
      return;
    }
    if (sJ(32))
    {
      this.raE.setWidgetLayoutResource(a.g.cCg);
      this.raF.setWidgetLayoutResource(a.g.cCg);
      this.raG.setWidgetLayoutResource(a.g.cCf);
      GMTrace.o(7757113589760L, 57795);
      return;
    }
    this.raE.setWidgetLayoutResource(a.g.cCf);
    this.raF.setWidgetLayoutResource(a.g.cCg);
    this.raG.setWidgetLayoutResource(a.g.cCg);
    GMTrace.o(7757113589760L, 57795);
  }
  
  private boolean sJ(int paramInt)
  {
    GMTrace.i(7756979372032L, 57794);
    if ((this.jZy & paramInt) != 0L)
    {
      GMTrace.o(7756979372032L, 57794);
      return true;
    }
    GMTrace.o(7756979372032L, 57794);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(7756308283392L, 57789);
    this.raE = this.htU.VG("wallet_transfer_realtime");
    this.raF = this.htU.VG("wallet_transfer_2h");
    this.raG = this.htU.VG("wallet_transfer_24h");
    this.raH = this.htU.VG("wallet_transfer_title_tips");
    bxM();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7766643048448L, 57866);
        WalletDelayTransferSettingUI.this.finish();
        GMTrace.o(7766643048448L, 57866);
        return false;
      }
    });
    GMTrace.o(7756308283392L, 57789);
  }
  
  public final int QI()
  {
    GMTrace.i(7756576718848L, 57791);
    GMTrace.o(7756576718848L, 57791);
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7756845154304L, 57793);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.t))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.raI = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcH;
        this.mTitle = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcG;
        this.onC = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcJ;
        this.raJ = ((com.tencent.mm.plugin.wallet_core.c.t)paramk).rcK;
        if (!bg.nm(this.raI))
        {
          this.raH.setTitle(this.raI);
          if (bg.nm(this.mTitle)) {
            break label153;
          }
          sq(this.mTitle);
          label111:
          bxL();
        }
      }
      for (;;)
      {
        this.htU.notifyDataSetChanged();
        GMTrace.o(7756845154304L, 57793);
        return;
        w.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode wording");
        this.raH.setTitle(a.i.tbu);
        break;
        label153:
        w.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode title wording");
        oM(a.i.tdJ);
        break label111;
        w.i("MicroMsg.WalletDelayTransferSettingUI", "net error, use hardcode wording");
        this.raH.setTitle(a.i.tbu);
        oM(a.i.tdJ);
      }
    }
    w.i("MicroMsg.WalletDelayTransferSettingUI", "other scene");
    GMTrace.o(7756845154304L, 57793);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(7756710936576L, 57792);
    paramf = paramPreference.hiu;
    if ("wallet_transfer_realtime".equals(paramf))
    {
      this.jZy &= 0xFFFFFFFFFFFFFFEF;
      this.jZy &= 0xFFFFFFFFFFFFFFDF;
    }
    for (;;)
    {
      bxM();
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(147457, Long.valueOf(this.jZy));
      finish();
      GMTrace.o(7756710936576L, 57792);
      return true;
      if ("wallet_transfer_2h".equals(paramf))
      {
        this.jZy &= 0xFFFFFFFFFFFFFFDF;
        this.jZy |= 0x10;
      }
      else if ("wallet_transfer_24h".equals(paramf))
      {
        this.jZy &= 0xFFFFFFFFFFFFFFEF;
        this.jZy |= 0x20;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7756039847936L, 57787);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    this.htU.addPreferencesFromResource(a.l.tka);
    com.tencent.mm.kernel.h.xz();
    this.jZy = ((Long)com.tencent.mm.kernel.h.xy().xh().get(147457, Long.valueOf(0L))).longValue();
    MP();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(385, this);
    com.tencent.mm.kernel.h.xz();
    this.raI = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwc, ""));
    com.tencent.mm.kernel.h.xz();
    this.mTitle = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwb, ""));
    com.tencent.mm.kernel.h.xz();
    this.onC = ((String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwe, ""));
    com.tencent.mm.kernel.h.xz();
    this.raJ = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vwf, Integer.valueOf(0))).intValue();
    if ((bg.nm(this.raI)) || (bg.nm(this.mTitle)) || (bg.nm(this.onC))) {}
    for (boolean bool = com.tencent.mm.plugin.wallet_core.c.t.a(true, null);; bool = com.tencent.mm.plugin.wallet_core.c.t.a(false, null))
    {
      com.tencent.mm.wallet_core.ui.e.cms();
      if (!bool)
      {
        w.i("MicroMsg.WalletDelayTransferSettingUI", "no need do scene, remove listener");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(385, this);
      }
      GMTrace.o(7756039847936L, 57787);
      return;
      this.raH.setTitle(this.raI);
      sq(this.mTitle);
      bxL();
    }
  }
  
  protected void onDestroy()
  {
    int i = 1;
    GMTrace.i(7756442501120L, 57790);
    super.onDestroy();
    w.i("MicroMsg.WalletDelayTransferSettingUI", "do oplog, %s", new Object[] { Long.valueOf(this.jZy) });
    if (sJ(16)) {}
    for (;;)
    {
      ape localape = new ape();
      localape.oqH = i;
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(205, localape));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(385, this);
      GMTrace.o(7756442501120L, 57790);
      return;
      if (sJ(32)) {
        i = 2;
      } else {
        i = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletDelayTransferSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */