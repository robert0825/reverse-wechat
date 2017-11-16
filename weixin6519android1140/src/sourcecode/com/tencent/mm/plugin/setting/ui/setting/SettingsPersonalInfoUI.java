package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.g.a.rc;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.pluginsdk.ui.preference.HeadImgNewPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.io.File;

public class SettingsPersonalInfoUI
  extends MMPreference
  implements e, m.b
{
  private f htU;
  private boolean iZm;
  private com.tencent.mm.plugin.setting.a.d oJC;
  
  public SettingsPersonalInfoUI()
  {
    GMTrace.i(4607291949056L, 34327);
    GMTrace.o(4607291949056L, 34327);
  }
  
  private void ahI()
  {
    GMTrace.i(4608499908608L, 34336);
    HeadImgNewPreference localHeadImgNewPreference = (HeadImgNewPreference)this.htU.VG("settings_change_avatar");
    String str = q.zE();
    localHeadImgNewPreference.tCL = null;
    if (localHeadImgNewPreference.iCr != null)
    {
      a.b.a(localHeadImgNewPreference.iCr, str);
      if (str != null) {
        break label85;
      }
    }
    label85:
    for (localHeadImgNewPreference.tCM = false;; localHeadImgNewPreference.tCM = true)
    {
      localHeadImgNewPreference.slu = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16575755190272L, 123499);
          paramAnonymousView = new Intent(SettingsPersonalInfoUI.this, PreviewHdHeadImg.class);
          SettingsPersonalInfoUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(16575755190272L, 123499);
        }
      };
      GMTrace.o(4608499908608L, 34336);
      return;
      localHeadImgNewPreference.tCL = str;
      break;
    }
  }
  
  private void ber()
  {
    GMTrace.i(4608365690880L, 34335);
    Preference localPreference = this.htU.VG("settings_username");
    String str = q.zF();
    if (bg.nm(str))
    {
      str = q.zE();
      if (x.Ts(str))
      {
        localPreference.setSummary(getString(R.l.dZG));
        GMTrace.o(4608365690880L, 34335);
        return;
      }
      localPreference.setSummary(str);
      GMTrace.o(4608365690880L, 34335);
      return;
    }
    localPreference.setSummary(str);
    GMTrace.o(4608365690880L, 34335);
  }
  
  protected final void MP()
  {
    GMTrace.i(4607828819968L, 34331);
    oM(R.l.dZI);
    at.AR();
    c.xh().a(this);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16575084101632L, 123494);
        SettingsPersonalInfoUI.this.aLo();
        SettingsPersonalInfoUI.this.finish();
        GMTrace.o(16575084101632L, 123494);
        return true;
      }
    });
    GMTrace.o(4607828819968L, 34331);
  }
  
  public final int QI()
  {
    GMTrace.i(4607426166784L, 34328);
    int i = R.o.epw;
    GMTrace.o(4607426166784L, 34328);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(15006749949952L, 111809);
    at.AR();
    if (!bg.b(Boolean.valueOf(c.xh().getBoolean(w.a.vxd, false))))
    {
      this.htU.bc("settings_invoice", true);
      GMTrace.o(15006749949952L, 111809);
      return;
    }
    this.htU.bc("settings_invoice", false);
    GMTrace.o(15006749949952L, 111809);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(4609036779520L, 34340);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(4609036779520L, 34340);
      return;
    }
    ber();
    GMTrace.o(4609036779520L, 34340);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4608231473152L, 34334);
    paramf = paramPreference.hiu;
    w.d("MicroMsg.SettingsPersonalInfoUI", "key = " + paramf);
    if (paramf.equals("settings_change_avatar"))
    {
      boolean bool = com.tencent.mm.plugin.c.a.hnI.d(this);
      GMTrace.o(4608231473152L, 34334);
      return bool;
    }
    if (paramf.equals("settings_username"))
    {
      if ((bg.nm(q.zF())) && (x.Ts(q.zE()))) {
        z(SettingsAliasUI.class);
      }
      GMTrace.o(4608231473152L, 34334);
      return true;
    }
    if (paramf.equals("settings_name"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsModifyNameUI.class);
      startActivity(paramf);
      GMTrace.o(4608231473152L, 34334);
      return true;
    }
    if (paramf.equals("settings_qrcode"))
    {
      g.ork.i(11264, new Object[] { Integer.valueOf(2) });
      this.vKB.vKW.startActivity(new Intent(this, SelfQRCodeUI.class));
    }
    do
    {
      for (;;)
      {
        GMTrace.o(4608231473152L, 34334);
        return false;
        if (!paramf.equals("settings_more_info")) {
          break;
        }
        startActivity(new Intent(this, SettingsPersonalMoreUI.class));
      }
      if (paramf.equals("settings_address"))
      {
        paramf = new Intent();
        paramf.putExtra("launch_from_webview", false);
        com.tencent.mm.bj.d.a(this.vKB.vKW, "address", ".ui.WalletSelectAddrUI", paramf, true);
        GMTrace.o(4608231473152L, 34334);
        return true;
      }
    } while (!paramf.equals("settings_invoice"));
    g.ork.i(14199, new Object[] { Integer.valueOf(1) });
    paramf = new Intent();
    paramf.putExtra("launch_from_webview", false);
    com.tencent.mm.bj.d.a(this.vKB.vKW, "address", ".ui.InvoiceListUI", paramf, true);
    GMTrace.o(4608231473152L, 34334);
    return true;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4608902561792L, 34339);
    w.i("MicroMsg.SettingsPersonalInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 3) || (paramInt1 == 2) || (paramInt1 == 4)) {
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16579513286656L, 123527);
            rc localrc = new rc();
            localrc.eVX.eVZ = true;
            com.tencent.mm.sdk.b.a.vgX.m(localrc);
            GMTrace.o(16579513286656L, 123527);
          }
        });
      }
      GMTrace.o(4608902561792L, 34339);
      return;
    }
    Object localObject;
    switch (paramInt1)
    {
    default: 
      GMTrace.o(4608902561792L, 34339);
      return;
    case 3: 
      localObject = getApplicationContext();
      at.AR();
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.k.b((Context)localObject, paramIntent, c.yU());
      if (paramIntent == null)
      {
        GMTrace.o(4608902561792L, 34339);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("CropImageMode", 1);
      ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
      ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
      com.tencent.mm.plugin.setting.a.hnH.a(this, (Intent)localObject, 4);
      GMTrace.o(4608902561792L, 34339);
      return;
    case 2: 
      if (paramIntent == null)
      {
        GMTrace.o(4608902561792L, 34339);
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("CropImageMode", 1);
      ((Intent)localObject).putExtra("CropImage_Filter", true);
      com.tencent.mm.ac.n.Dh();
      ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.ac.d.t(q.zE() + ".crop", true));
      ((Intent)localObject).putExtra("CropImage_ImgPath", null);
      com.tencent.mm.pluginsdk.m localm = com.tencent.mm.plugin.setting.a.hnH;
      at.AR();
      localm.a(this, paramIntent, (Intent)localObject, c.yU(), 4, null);
      GMTrace.o(4608902561792L, 34339);
      return;
    }
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4687822585856L, 34927);
        rc localrc = new rc();
        localrc.eVX.eVZ = true;
        com.tencent.mm.sdk.b.a.vgX.m(localrc);
        GMTrace.o(4687822585856L, 34927);
      }
    });
    if (paramIntent == null)
    {
      GMTrace.o(4608902561792L, 34339);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      w.e("MicroMsg.SettingsPersonalInfoUI", "crop picture failed");
      GMTrace.o(4608902561792L, 34339);
      return;
    }
    w.i("MicroMsg.SettingsPersonalInfoUI", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", new Object[] { paramIntent, Long.valueOf(new File(paramIntent).length()) });
    new o(this.vKB.vKW, paramIntent).b(1, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4631451140096L, 34507);
        w.d("MicroMsg.SettingsPersonalInfoUI", "updateHeadImg hasUin:%b user:%s", new Object[] { Boolean.valueOf(at.AU()), q.zE() });
        if (at.AU())
        {
          String str = b.hQ(q.zE());
          as.gnb.gM(str);
        }
        SettingsPersonalInfoUI.a(SettingsPersonalInfoUI.this);
        if (SettingsPersonalInfoUI.b(SettingsPersonalInfoUI.this)) {
          g.ork.i(11002, new Object[] { Integer.valueOf(4), Integer.valueOf(4) });
        }
        GMTrace.o(4631451140096L, 34507);
      }
    });
    GMTrace.o(4608902561792L, 34339);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4607560384512L, 34329);
    super.onCreate(paramBundle);
    MP();
    if (getIntent().getBooleanExtra("intent_set_avatar", false))
    {
      this.iZm = getIntent().getBooleanExtra("KEnterFromBanner", false);
      com.tencent.mm.plugin.c.a.hnI.d(this);
    }
    at.wS().a(1191, this);
    GMTrace.o(4607560384512L, 34329);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4607694602240L, 34330);
    w.d("MicroMsg.SettingsPersonalInfoUI", "SettingsPersonalInfoUI.onDestroy()");
    if (at.AU())
    {
      at.AR();
      c.xh().b(this);
    }
    if (this.oJC != null) {
      at.wS().c(this.oJC);
    }
    at.wS().b(1191, this);
    super.onDestroy();
    GMTrace.o(4607694602240L, 34330);
  }
  
  public void onResume()
  {
    GMTrace.i(4607963037696L, 34332);
    ber();
    ahI();
    at.AR();
    String str = (String)c.xh().get(4, null);
    if ((str != null) && (str.length() > 0)) {
      this.htU.VG("settings_name").setSummary(h.a(this, str));
    }
    boolean bool = bg.Jw();
    this.htU.bc("settings_address", bool);
    at.AR();
    if (!bg.b(Boolean.valueOf(c.xh().getBoolean(w.a.vxd, false))))
    {
      this.htU.bc("settings_invoice", true);
      this.oJC = new com.tencent.mm.plugin.setting.a.d();
      at.wS().a(this.oJC, 0);
    }
    for (;;)
    {
      super.onResume();
      GMTrace.o(4607963037696L, 34332);
      return;
      this.htU.bc("settings_invoice", false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsPersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */