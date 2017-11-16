package com.tencent.mm.plugin.exdevice.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class ExdeviceSettingUI
  extends MMPreference
  implements e
{
  int eQl;
  private final String kKg;
  private final String kKh;
  private final String kKi;
  boolean kKj;
  private ProgressDialog kKk;
  private CheckBoxPreference kKl;
  private CheckBoxPreference kKm;
  private CheckBoxPreference kKn;
  private boolean kKo;
  
  public ExdeviceSettingUI()
  {
    GMTrace.i(11102356242432L, 82719);
    this.kKg = "notify_rank";
    this.kKh = "notify_like";
    this.kKi = "join_rank";
    this.eQl = -1;
    GMTrace.o(11102356242432L, 82719);
  }
  
  private void auZ()
  {
    boolean bool2 = true;
    GMTrace.i(11103027331072L, 82724);
    CheckBoxPreference localCheckBoxPreference = this.kKl;
    if ((this.eQl & 0x1) == 1)
    {
      bool1 = true;
      localCheckBoxPreference.sdM = bool1;
      localCheckBoxPreference = this.kKm;
      if ((this.eQl & 0x2) != 2) {
        break label101;
      }
      bool1 = true;
      label49:
      localCheckBoxPreference.sdM = bool1;
      localCheckBoxPreference = this.kKn;
      if ((this.eQl & 0x8) != 8) {
        break label106;
      }
    }
    label101:
    label106:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localCheckBoxPreference.sdM = bool1;
      this.wky.notifyDataSetChanged();
      GMTrace.o(11103027331072L, 82724);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label49;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(11102893113344L, 82723);
    int i = R.o.eoP;
    GMTrace.o(11102893113344L, 82723);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11103161548800L, 82725);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.d("MicroMsg.ExdeviceSettingUI", "hy: scene end ok");
      paramString = (com.tencent.mm.plugin.exdevice.f.a.n)paramk;
      if (paramString.opType != 2)
      {
        w.i("MicroMsg.ExdeviceSettingUI", "It isn't a GET_FLAG opType(%d).", new Object[] { Integer.valueOf(paramString.opType) });
        GMTrace.o(11103161548800L, 82725);
        return;
      }
      if ((this.kKk != null) && (this.kKk.isShowing())) {
        runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16663265148928L, 124151);
            ExdeviceSettingUI.a(ExdeviceSettingUI.this).dismiss();
            GMTrace.o(16663265148928L, 124151);
          }
        });
      }
      this.kKj = true;
      if (this.eQl == paramString.kCu)
      {
        w.i("MicroMsg.ExdeviceSettingUI", "flag has not changed.(%s)", new Object[] { Integer.valueOf(this.eQl) });
        GMTrace.o(11103161548800L, 82725);
        return;
      }
      this.eQl = paramString.kCu;
      w.d("MicroMsg.ExdeviceSettingUI", "hy: onSceneEnd setting flag to %d", new Object[] { Integer.valueOf(this.eQl) });
      at.AR();
      c.xh().set(397310, Integer.valueOf(this.eQl));
      if (!this.kKo) {
        auZ();
      }
      GMTrace.o(11103161548800L, 82725);
      return;
    }
    if ((this.kKk != null) && (this.kKk.isShowing())) {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10997666414592L, 81939);
          ExdeviceSettingUI.a(ExdeviceSettingUI.this).dismiss();
          GMTrace.o(10997666414592L, 81939);
        }
      });
    }
    Toast.makeText(this, "scene error", 0).show();
    finish();
    GMTrace.o(11103161548800L, 82725);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(11103429984256L, 82727);
    w.d("MicroMsg.ExdeviceSettingUI", "onPreferenceTreeClick, key is %s.", new Object[] { paramPreference.hiu });
    if (paramPreference.hiu.equals("black_contact_list")) {
      com.tencent.mm.bj.d.x(this, "sport", ".ui.SportBlackListUI");
    }
    for (;;)
    {
      GMTrace.o(11103429984256L, 82727);
      return false;
      this.kKo = true;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11102490460160L, 82720);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.sport.b.d.nU(38);
    at.wS().a(1044, this);
    this.kKl = ((CheckBoxPreference)this.wky.VG("notify_rank"));
    this.kKm = ((CheckBoxPreference)this.wky.VG("notify_like"));
    this.kKn = ((CheckBoxPreference)this.wky.VG("join_rank"));
    at.AR();
    paramBundle = (Integer)c.xh().get(397310, Integer.valueOf(0));
    w.d("MicroMsg.ExdeviceSettingUI", "hy: setting flag: %d", new Object[] { paramBundle });
    if ((paramBundle == null) || (paramBundle.intValue() == 0))
    {
      this.kKj = false;
      this.kKl.sdM = true;
      this.kKm.sdM = true;
      this.kKn.sdM = true;
      this.wky.notifyDataSetChanged();
      this.kKk = r.show(this, "", "", true, false);
    }
    for (;;)
    {
      at.wS().a(new com.tencent.mm.plugin.exdevice.f.a.n(2, 0), 0);
      oM(R.l.dRl);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(16656688480256L, 124102);
          ExdeviceSettingUI.this.finish();
          GMTrace.o(16656688480256L, 124102);
          return false;
        }
      });
      GMTrace.o(11102490460160L, 82720);
      return;
      this.kKj = true;
      this.eQl = paramBundle.intValue();
      auZ();
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11102758895616L, 82722);
    super.onDestroy();
    at.wS().b(1044, this);
    if ((this.kKk != null) && (this.kKk.isShowing())) {
      this.kKk.dismiss();
    }
    if (this.kKj)
    {
      if (!this.kKl.isChecked()) {
        break label186;
      }
      this.eQl |= 0x1;
      if (!this.kKm.isChecked()) {
        break label200;
      }
      this.eQl |= 0x2;
      label94:
      if (!this.kKn.isChecked()) {
        break label214;
      }
    }
    label186:
    label200:
    label214:
    for (this.eQl |= 0x8;; this.eQl &= 0xFFFFFFF7)
    {
      at.AR();
      c.xh().set(397310, Integer.valueOf(this.eQl));
      w.d("MicroMsg.ExdeviceSettingUI", "hy: doscene setting flag to %d", new Object[] { Integer.valueOf(this.eQl) });
      at.wS().a(new com.tencent.mm.plugin.exdevice.f.a.n(1, this.eQl), 0);
      GMTrace.o(11102758895616L, 82722);
      return;
      this.eQl &= 0xFFFFFFFE;
      break;
      this.eQl &= 0xFFFFFFFD;
      break label94;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */