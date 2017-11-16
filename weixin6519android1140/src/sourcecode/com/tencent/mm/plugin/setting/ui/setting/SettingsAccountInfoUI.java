package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.az;
import com.tencent.mm.g.a.az.a;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.nh;
import com.tencent.mm.g.a.nh.b;
import com.tencent.mm.g.a.z;
import com.tencent.mm.modelsimple.aj;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import junit.framework.Assert;

public class SettingsAccountInfoUI
  extends MMPreference
  implements com.tencent.mm.ad.e, m.b
{
  private ProgressDialog htG;
  private f htU;
  private final String oId;
  private final String oIe;
  private final String oIf;
  private final int oIg;
  private final int oIh;
  private final int oIi;
  private final int oIj;
  private int oIk;
  private View oIl;
  private TextView oIm;
  private EditText oIn;
  private i oIo;
  private boolean oIp;
  private String oIq;
  private SparseIntArray oIr;
  
  public SettingsAccountInfoUI()
  {
    GMTrace.i(4603533852672L, 34299);
    this.oId = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe";
    this.oIe = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1";
    this.oIf = "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0";
    this.oIg = 0;
    this.oIh = 1;
    this.oIi = 2;
    this.oIj = 1;
    this.oIk = 0;
    this.oIq = null;
    this.oIr = new SparseIntArray();
    this.oIr.put(0, R.l.dYH);
    this.oIr.put(-82, R.l.dYd);
    this.oIr.put(-83, R.l.dYa);
    this.oIr.put(-84, R.l.dYb);
    this.oIr.put(-85, R.l.dXW);
    this.oIr.put(-86, R.l.dYe);
    GMTrace.o(4603533852672L, 34299);
  }
  
  private void beq()
  {
    GMTrace.i(4604741812224L, 34308);
    Preference localPreference = this.htU.VG("settings_email_addr");
    Assert.assertNotNull(localPreference);
    at.AR();
    String str = (String)c.xh().get(5, null);
    at.AR();
    Integer localInteger = (Integer)c.xh().get(7, null);
    if ((localInteger != null) && ((localInteger.intValue() & 0x2) != 0))
    {
      localPreference.setSummary(R.l.dYN);
      GMTrace.o(4604741812224L, 34308);
      return;
    }
    if (str != null)
    {
      localPreference.setSummary(R.l.dYM);
      GMTrace.o(4604741812224L, 34308);
      return;
    }
    localPreference.setSummary(R.l.dXV);
    GMTrace.o(4604741812224L, 34308);
  }
  
  private void ber()
  {
    GMTrace.i(4605010247680L, 34310);
    Preference localPreference = this.htU.VG("settings_username");
    String str = q.zF();
    if (bg.nm(str))
    {
      str = q.zE();
      if (x.Ts(str))
      {
        localPreference.setSummary(getString(R.l.dZG));
        GMTrace.o(4605010247680L, 34310);
        return;
      }
      localPreference.setSummary(str);
      GMTrace.o(4605010247680L, 34310);
      return;
    }
    localPreference.setSummary(str);
    GMTrace.o(4605010247680L, 34310);
  }
  
  private void bes()
  {
    GMTrace.i(4605144465408L, 34311);
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.htU.VG("settings_safe_device");
    if (localIconSwitchKeyValuePreference == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "safedevicesate preference is null");
      GMTrace.o(4605144465408L, 34311);
      return;
    }
    at.AR();
    if (((Integer)c.xh().get(9, Integer.valueOf(0))).intValue() == 0)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAccountInfoUI", "not bind uin");
      this.htU.bc("settings_safe_device", true);
      GMTrace.o(4605144465408L, 34311);
      return;
    }
    this.htU.bc("settings_safe_device", false);
    if (q.zM())
    {
      localIconSwitchKeyValuePreference.setSummary(R.l.dUh);
      localIconSwitchKeyValuePreference.Cs(1);
      GMTrace.o(4605144465408L, 34311);
      return;
    }
    localIconSwitchKeyValuePreference.setSummary(R.l.dUi);
    localIconSwitchKeyValuePreference.Cs(2);
    GMTrace.o(4605144465408L, 34311);
  }
  
  private void bet()
  {
    GMTrace.i(4605278683136L, 34312);
    Preference localPreference = this.htU.VG("settings_facebook");
    if (localPreference == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "updateFacebook Preference null");
      GMTrace.o(4605278683136L, 34312);
      return;
    }
    if (!q.Ad())
    {
      this.htU.c(localPreference);
      GMTrace.o(4605278683136L, 34312);
      return;
    }
    if (!q.Af())
    {
      localPreference.setSummary(getString(R.l.dYA));
      GMTrace.o(4605278683136L, 34312);
      return;
    }
    at.AR();
    localPreference.setSummary((String)c.xh().get(65826, null));
    GMTrace.o(4605278683136L, 34312);
  }
  
  private void beu()
  {
    GMTrace.i(4605412900864L, 34313);
    Preference localPreference = this.htU.VG("settings_mobile");
    if (localPreference == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "updateMobile Preference null");
      GMTrace.o(4605412900864L, 34313);
      return;
    }
    at.AR();
    String str = (String)c.xh().get(6, null);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAccountInfoUI", "mobile :" + str);
    if ((str == null) || (str.length() <= 0))
    {
      localPreference.setSummary(getString(R.l.dYA));
      GMTrace.o(4605412900864L, 34313);
      return;
    }
    localPreference.setSummary(str);
    GMTrace.o(4605412900864L, 34313);
  }
  
  private void bev()
  {
    GMTrace.i(4605547118592L, 34314);
    Preference localPreference = this.htU.VG("settings_uin");
    if (localPreference == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "updateUin Preference null");
      GMTrace.o(4605547118592L, 34314);
      return;
    }
    at.AR();
    int i = ((Integer)c.xh().get(9, Integer.valueOf(0))).intValue();
    if (i == 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "updateUin 0 Preference");
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("BindQQSwitch"), 1) != 1)
      {
        this.htU.bc("settings_uin", true);
        GMTrace.o(4605547118592L, 34314);
        return;
      }
      localPreference.setSummary(R.l.dYA);
      GMTrace.o(4605547118592L, 34314);
      return;
    }
    localPreference.setSummary(new o(i));
    GMTrace.o(4605547118592L, 34314);
  }
  
  private void bew()
  {
    GMTrace.i(4605681336320L, 34315);
    this.htU.bc("settings_room_right", true);
    GMTrace.o(4605681336320L, 34315);
  }
  
  private void bex()
  {
    boolean bool = true;
    GMTrace.i(4605815554048L, 34316);
    Object localObject = new az();
    com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
    if ((((az)localObject).eCj.eCk) && (((az)localObject).eCj.eCl) && (((az)localObject).eCj.eCm)) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "check is support soter, isSupportSoter: %b, isSupportFP: %b, isSystemHasFPEnrolled: %b", new Object[] { Boolean.valueOf(((az)localObject).eCj.eCk), Boolean.valueOf(((az)localObject).eCj.eCl), Boolean.valueOf(((az)localObject).eCj.eCm) });
      localObject = this.htU;
      if (i == 0) {}
      for (;;)
      {
        ((f)localObject).bc("settings_fingerprint_title", bool);
        GMTrace.o(4605815554048L, 34316);
        return;
        bool = false;
      }
    }
  }
  
  private void hg(boolean paramBoolean)
  {
    GMTrace.i(4605949771776L, 34317);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAccountInfoUI", "handlePassword " + paramBoolean);
    if (paramBoolean)
    {
      if (this.oIo != null)
      {
        this.oIo.show();
        GMTrace.o(4605949771776L, 34317);
        return;
      }
      this.oIo = h.a(this, null, this.oIl, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4676682514432L, 34844);
          paramAnonymousDialogInterface = SettingsAccountInfoUI.a(SettingsAccountInfoUI.this).getText().toString();
          SettingsAccountInfoUI.a(SettingsAccountInfoUI.this).setText("");
          SettingsAccountInfoUI.a(SettingsAccountInfoUI.this).clearFocus();
          SettingsAccountInfoUI.this.db(SettingsAccountInfoUI.a(SettingsAccountInfoUI.this));
          if ((paramAnonymousDialogInterface == null) || (paramAnonymousDialogInterface.equals("")))
          {
            h.a(SettingsAccountInfoUI.this, R.l.egb, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(4598299361280L, 34260);
                GMTrace.o(4598299361280L, 34260);
              }
            });
            GMTrace.o(4676682514432L, 34844);
            return;
          }
          paramAnonymousDialogInterface = new aj(paramAnonymousDialogInterface, "", "", "");
          at.wS().a(paramAnonymousDialogInterface, 0);
          SettingsAccountInfoUI localSettingsAccountInfoUI1 = SettingsAccountInfoUI.this;
          SettingsAccountInfoUI localSettingsAccountInfoUI2 = SettingsAccountInfoUI.this;
          SettingsAccountInfoUI.this.getString(R.l.cUG);
          SettingsAccountInfoUI.a(localSettingsAccountInfoUI1, h.a(localSettingsAccountInfoUI2, SettingsAccountInfoUI.this.getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4658026250240L, 34705);
              at.wS().c(paramAnonymousDialogInterface);
              GMTrace.o(4658026250240L, 34705);
            }
          }));
          GMTrace.o(4676682514432L, 34844);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4681917005824L, 34883);
          SettingsAccountInfoUI.a(SettingsAccountInfoUI.this).setText("");
          SettingsAccountInfoUI.b(SettingsAccountInfoUI.this).dismiss();
          GMTrace.o(4681917005824L, 34883);
        }
      });
      GMTrace.o(4605949771776L, 34317);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kintent_hint", getString(R.l.dZu));
    com.tencent.mm.bj.d.b(this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
    GMTrace.o(4605949771776L, 34317);
  }
  
  protected final void MP()
  {
    GMTrace.i(4604204941312L, 34304);
    oM(R.l.dYt);
    this.htU = this.wky;
    this.oIl = View.inflate(this, R.i.cFS, null);
    this.oIm = ((TextView)this.oIl.findViewById(R.h.ccl));
    this.oIm.setText(getString(R.l.dYY));
    this.oIn = ((EditText)this.oIl.findViewById(R.h.cck));
    this.oIn.setInputType(129);
    at.AR();
    if (((Integer)c.xh().get(9, Integer.valueOf(0))).intValue() == 0)
    {
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("BindQQSwitch"), 1) != 1)
      {
        this.htU.bc("settings_uin", true);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "summerqq BindQQSwitch off");
      }
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("VoiceprintEntry"), 0) == 1) {
        break label233;
      }
      this.htU.bc("settings_voiceprint_title", true);
    }
    for (;;)
    {
      this.oIq = com.tencent.mm.k.g.ut().getValue("CloseAcctUrl");
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4655744548864L, 34688);
          SettingsAccountInfoUI.this.aLo();
          SettingsAccountInfoUI.this.finish();
          GMTrace.o(4655744548864L, 34688);
          return true;
        }
      });
      GMTrace.o(4604204941312L, 34304);
      return;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "summerqq BindQQSwitch bindqq");
      break;
      label233:
      if (!at.AU())
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "update voiceprint dot, account not ready!");
        GMTrace.o(4604204941312L, 34304);
        return;
      }
      IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_voiceprint_title");
      at.AR();
      if (((Boolean)c.xh().get(w.a.vqA, Boolean.valueOf(true))).booleanValue())
      {
        at.AR();
        if ((c.xh().getInt(40, 0) & 0x20000) == 0)
        {
          localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
          localIconPreference.Ck(0);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "show voiceprint dot");
          this.htU.notifyDataSetChanged();
        }
      }
    }
  }
  
  public final boolean QH()
  {
    GMTrace.i(4603802288128L, 34301);
    GMTrace.o(4603802288128L, 34301);
    return true;
  }
  
  public final int QI()
  {
    GMTrace.i(4603668070400L, 34300);
    int i = R.o.epp;
    GMTrace.o(4603668070400L, 34300);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4606083989504L, 34318);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAccountInfoUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramk.getType());
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() == 255)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        hg(true);
        GMTrace.o(4606083989504L, 34318);
        return;
      }
      if (com.tencent.mm.plugin.setting.a.hnI.a(this, paramInt1, paramInt2, paramString))
      {
        GMTrace.o(4606083989504L, 34318);
        return;
      }
      hg(false);
      GMTrace.o(4606083989504L, 34318);
      return;
    }
    if (paramk.getType() == 384)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        at.AR();
        c.xh().set(77830, ((aj)paramk).Hx());
        paramString = new Intent();
        paramString.putExtra("kintent_hint", getString(R.l.dZu));
        com.tencent.mm.bj.d.b(this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramString);
        GMTrace.o(4606083989504L, 34318);
        return;
      }
      this.oIp = true;
      h.a(this, R.l.dZH, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4654939242496L, 34682);
          GMTrace.o(4654939242496L, 34682);
        }
      });
      GMTrace.o(4606083989504L, 34318);
      return;
    }
    int i;
    if (paramk.getType() == 256)
    {
      if (((paramInt1 != 0) || (paramInt2 != 0)) && (com.tencent.mm.plugin.setting.a.hnI.a(this, paramInt1, paramInt2, paramString)))
      {
        GMTrace.o(4606083989504L, 34318);
        return;
      }
      i = this.oIr.get(paramInt2);
      paramk = getString(R.l.dYG, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = paramk;
      if (i == 0) {}
    }
    try
    {
      paramString = getString(i);
      h.bm(this.vKB.vKW, paramString);
      GMTrace.o(4606083989504L, 34318);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "try get string by id %d, fail:%s", new Object[] { Integer.valueOf(i), paramString.getMessage() });
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SettingsAccountInfoUI", paramString, "", new Object[0]);
        paramString = paramk;
      }
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(4604876029952L, 34309);
    ber();
    beq();
    beu();
    bev();
    bet();
    bes();
    bew();
    bex();
    int i = bg.m(paramObject, 0);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAccountInfoUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(4604876029952L, 34309);
      return;
    }
    if ((i != 135175) && (i != 135176))
    {
      GMTrace.o(4604876029952L, 34309);
      return;
    }
    bew();
    GMTrace.o(4604876029952L, 34309);
  }
  
  public final boolean a(final f paramf, Preference paramPreference)
  {
    GMTrace.i(4604607594496L, 34307);
    paramf = paramPreference.hiu;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", paramf + " item has been clicked!");
    paramPreference = q.zE();
    if (bg.nm(paramf))
    {
      GMTrace.o(4604607594496L, 34307);
      return false;
    }
    if ((paramf.equals("settings_username")) && (bg.nm(q.zF())) && (x.Ts(paramPreference))) {
      z(SettingsAliasUI.class);
    }
    for (;;)
    {
      GMTrace.o(4604607594496L, 34307);
      return false;
      if (paramf.equals("settings_facebook"))
      {
        z(FacebookAuthUI.class);
      }
      else
      {
        if (paramf.equals("settings_email_addr"))
        {
          at.AR();
          paramf = (Integer)c.xh().get(7, null);
          int i;
          if ((paramf != null) && ((paramf.intValue() & 0x2) != 0))
          {
            i = 1;
            at.AR();
            paramf = (String)c.xh().get(5, null);
            if ((i == 0) && (bg.nm(paramf))) {
              break label229;
            }
            startActivity(new Intent(this.vKB.vKW, SettingsModifyEmailAddrUI.class));
          }
          for (;;)
          {
            GMTrace.o(4604607594496L, 34307);
            return true;
            i = 0;
            break;
            label229:
            if (this.htG != null)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.SettingsAccountInfoUI", "do get email input, but tips dialog has not dismissed");
              this.htG.dismiss();
              this.htG = null;
            }
            paramf = bg.aq(com.tencent.mm.modelsimple.d.br(this.vKB.vKW), "");
            h.a(this.vKB.vKW, getString(R.l.cGe), paramf, getString(R.l.dZp), 50, new h.b()
            {
              public final boolean v(final CharSequence paramAnonymousCharSequence)
              {
                GMTrace.i(4656684072960L, 34695);
                if (!bg.Sj(paramAnonymousCharSequence.toString()))
                {
                  h.bm(SettingsAccountInfoUI.this.vKB.vKW, SettingsAccountInfoUI.this.getString(R.l.efY));
                  GMTrace.o(4656684072960L, 34695);
                  return false;
                }
                com.tencent.mm.plugin.setting.a.hnI.pr();
                paramAnonymousCharSequence = new com.tencent.mm.aa.a(com.tencent.mm.aa.a.gqU, paramAnonymousCharSequence.toString());
                at.wS().a(paramAnonymousCharSequence, 0);
                SettingsAccountInfoUI localSettingsAccountInfoUI = SettingsAccountInfoUI.this;
                ActionBarActivity localActionBarActivity = SettingsAccountInfoUI.this.vKB.vKW;
                SettingsAccountInfoUI.this.getString(R.l.cUG);
                SettingsAccountInfoUI.a(localSettingsAccountInfoUI, h.a(localActionBarActivity, SettingsAccountInfoUI.this.getString(R.l.dYB), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(4720437493760L, 35170);
                    at.wS().c(paramAnonymousCharSequence);
                    GMTrace.o(4720437493760L, 35170);
                  }
                }));
                GMTrace.o(4656684072960L, 34695);
                return true;
              }
            });
          }
        }
        if (paramf.equals("settings_mobile"))
        {
          paramf = new Intent(this, BindMContactIntroUI.class);
          paramf.putExtra("key_upload_scene", 4);
          MMWizardActivity.A(this, paramf);
          GMTrace.o(4604607594496L, 34307);
          return true;
        }
        if (paramf.equals("settings_uin"))
        {
          com.tencent.mm.plugin.setting.a.hnH.h(new Intent(), this);
          GMTrace.o(4604607594496L, 34307);
          return true;
        }
        if (paramf.equals("settings_about_vuser_about"))
        {
          paramf = String.format("https://weixin.qq.com/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s", new Object[] { v.bPK() });
          bg.E(this.vKB.vKW, paramf);
        }
        else if (paramf.equals("settings_independent_password"))
        {
          if (this.oIp)
          {
            hg(true);
          }
          else
          {
            paramf = new com.tencent.mm.modelsimple.w(1);
            at.wS().a(paramf, 0);
            getString(R.l.cUG);
            this.htG = h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(4633330188288L, 34521);
                at.wS().c(paramf);
                GMTrace.o(4633330188288L, 34521);
              }
            });
          }
        }
        else if (paramf.equals("settings_safe_device"))
        {
          at.AR();
          paramf = (String)c.xh().get(6, "");
          at.AR();
          paramPreference = (String)c.xh().get(4097, "");
          if (!bg.nm(paramf))
          {
            com.tencent.mm.bj.d.x(this, "safedevice", ".ui.MySafeDeviceListUI");
          }
          else if (!bg.nm(paramPreference))
          {
            paramf = new Intent(this, BindMContactIntroUI.class);
            paramf.putExtra("is_bind_for_safe_device", true);
            MMWizardActivity.A(this, paramf);
          }
          else
          {
            com.tencent.mm.bj.d.a(this, "safedevice", ".ui.BindSafeDeviceUI", new Intent());
          }
        }
        else
        {
          if (paramf.equals("settings_room_right"))
          {
            com.tencent.mm.bj.d.x(this, "chatroom", ".ui.RoomRightUI");
            GMTrace.o(4604607594496L, 34307);
            return true;
          }
          if (paramf.equals("settings_delete_account"))
          {
            paramf = new Intent();
            if (!bg.nm(this.oIq))
            {
              paramf.putExtra("rawUrl", this.oIq + "&lang=" + v.eq(this.vKB.vKW));
              paramf.putExtra("showShare", true);
              paramf.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
              com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramf, 1);
            }
          }
          else
          {
            if (paramf.equals("settings_phone_security"))
            {
              paramf = new Intent();
              if (this.oIk == 0) {
                paramf.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe");
              }
              for (;;)
              {
                com.tencent.mm.plugin.report.service.g.ork.i(10939, new Object[] { Integer.valueOf(this.oIk) });
                paramf.putExtra("show_bottom", false);
                paramf.putExtra("showShare", false);
                com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramf);
                break;
                if (this.oIk == 1) {
                  paramf.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=0");
                } else if (this.oIk == 2) {
                  paramf.putExtra("rawUrl", "http://weixin.qq.com/cgi-bin/readtemplate?&t=w_safe&qqpimsecurestatus=1");
                }
              }
            }
            if (paramf.equals("settings_security_center"))
            {
              paramf = getString(R.l.ekM);
              if (v.bPK().equals("zh_CN")) {}
              for (paramf = paramf + "zh_CN";; paramf = "https://help.wechat.com/cgi-bin/newreadtemplate?t=help_center/w_index&Channel=Client&lang=")
              {
                paramPreference = this.vKB.vKW;
                Intent localIntent = new Intent();
                localIntent.putExtra("rawUrl", paramf);
                localIntent.putExtra("showShare", false);
                localIntent.putExtra("show_bottom", false);
                localIntent.putExtra("needRedirect", false);
                localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
                localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
                com.tencent.mm.bj.d.b(paramPreference, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
                break;
              }
            }
            if (paramf.equals("settings_voiceprint_title"))
            {
              if (bg.getInt(com.tencent.mm.k.g.ut().getValue("VoiceprintEntry"), 0) == 1)
              {
                at.AR();
                if ((c.xh().getInt(40, 0) & 0x20000) == 0)
                {
                  at.AR();
                  c.xh().a(w.a.vqA, Boolean.valueOf(false));
                  ((IconPreference)this.htU.VG("settings_voiceprint_title")).Ck(8);
                  this.htU.notifyDataSetChanged();
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "unset setting account info new show");
                }
              }
              com.tencent.mm.bj.d.x(this.vKB.vKW, "voiceprint", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI");
            }
            else if (paramf.equals("settings_facedect_title"))
            {
              paramf = new nh();
              paramf.eSv.context = this;
              com.tencent.mm.sdk.b.a.vgX.m(paramf);
              boolean bool = paramf.eSw.eSu;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SettingsAccountInfoUI", "hy: is start to face settings succ: %b", new Object[] { Boolean.valueOf(bool) });
              if (!bool) {
                u.makeText(this.vKB.vKW, getString(R.l.dsm), 0).show();
              }
            }
            else if (paramf.equals("settings_trust_friend"))
            {
              z(SettingsTrustFriendUI.class);
            }
          }
        }
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4606218207232L, 34319);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1) {
      switch (paramInt2)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(4606218207232L, 34319);
      return;
      if ((at.wS() != null) && (at.wS().gus != null)) {
        at.wS().gus.bn(false);
      }
      com.tencent.mm.plugin.setting.a.hnI.px();
      at.AR();
      c.xh().b(this);
      paramIntent = new iv();
      paramIntent.eMv.status = 0;
      paramIntent.eMv.eMw = 3;
      com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
      paramIntent = new z();
      paramIntent.eAW.eAX = true;
      com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
      ad.RT("show_whatsnew");
      com.tencent.mm.kernel.k.d(this, true);
      paramIntent = new Intent();
      paramIntent.addFlags(67108864);
      paramIntent.putExtra("Intro_Switch", true);
      com.tencent.mm.plugin.setting.a.hnH.s(paramIntent, this.vKB.vKW);
      com.tencent.mm.modelsimple.d.A(this, null);
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4603936505856L, 34302);
    super.onCreate(paramBundle);
    MP();
    at.AR();
    c.xh().a(this);
    at.wS().a(256, this);
    GMTrace.o(4603936505856L, 34302);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4604070723584L, 34303);
    super.onDestroy();
    at.AR();
    c.xh().b(this);
    at.wS().b(256, this);
    GMTrace.o(4604070723584L, 34303);
  }
  
  protected void onPause()
  {
    GMTrace.i(4604473376768L, 34306);
    super.onPause();
    at.wS().b(255, this);
    at.wS().b(384, this);
    GMTrace.o(4604473376768L, 34306);
  }
  
  protected void onResume()
  {
    GMTrace.i(4604339159040L, 34305);
    at.wS().a(255, this);
    at.wS().a(384, this);
    ber();
    beu();
    bev();
    beq();
    bet();
    bes();
    this.oIp = false;
    bew();
    Object localObject1 = (IconSwitchKeyValuePreference)this.htU.VG("settings_phone_security");
    Object localObject2;
    Preference localPreference2;
    int i;
    if (localObject1 == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "phone_security preference is null");
      bex();
      this.htU.bc("settings_facedect_title", true);
      localObject1 = (PluginTextPreference)this.htU.VG("settings_about_vusertitle");
      localObject2 = (SelfVuserPreference)this.htU.VG("settings_about_vuserinfo");
      localPreference2 = this.htU.VG("settings_about_vuser_about");
      at.AR();
      i = bg.e((Integer)c.xh().get(66049, null));
      if (i == 0) {
        break label532;
      }
      ((PluginTextPreference)localObject1).visibility = 8;
      ((PluginTextPreference)localObject1).Cu(R.l.dly);
      if (ak.a.gmZ == null) {
        break label527;
      }
      localObject1 = BackwardSupportUtil.b.c(ak.a.gmZ.fr(i), 2.0F);
      label211:
      ((SelfVuserPreference)localObject2).drawable = new BitmapDrawable(getResources(), (Bitmap)localObject1);
      at.AR();
      ((SelfVuserPreference)localObject2).text = ((String)c.xh().get(66050, null));
    }
    for (;;)
    {
      localObject1 = this.htU.VG("settings_about_domainmail");
      this.htU.c((Preference)localObject1);
      if (bg.nm(this.oIq))
      {
        localObject1 = this.htU.VG("settings_delete_account");
        this.htU.c((Preference)localObject1);
      }
      super.onResume();
      GMTrace.o(4604339159040L, 34305);
      return;
      try
      {
        localObject2 = com.tencent.mm.k.g.ut().getValue("ShowSecurityEntry");
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAccountInfoUI", "cfgShowSecurityEntry %s, return", new Object[] { localObject2 });
        if ((!bg.nm((String)localObject2)) && (Integer.valueOf((String)localObject2).intValue() == 1)) {
          break label416;
        }
        this.htU.bc("settings_phone_security", true);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SettingsAccountInfoUI", "exception in updatePhoneSecurityState, %s", new Object[] { localException.getMessage() });
        this.htU.bc("settings_phone_security", true);
      }
      break;
      label416:
      i = this.oIk;
      this.htU.bc("settings_phone_security", false);
      localException.Cs(-1);
      if (com.tencent.mm.pluginsdk.model.app.p.n(this.vKB.vKW, "com.tencent.qqpimsecure")) {
        if (bg.bb(this, "com.tencent.server.back.BackEngine"))
        {
          localException.setSummary(R.l.dNv);
          this.oIk = 2;
        }
      }
      for (;;)
      {
        if (i == this.oIk) {
          break label525;
        }
        this.htU.notifyDataSetChanged();
        break;
        localException.setSummary(R.l.dNw);
        this.oIk = 1;
        continue;
        localException.setSummary(R.l.dNx);
        this.oIk = 0;
      }
      label525:
      break;
      label527:
      Preference localPreference1 = null;
      break label211;
      label532:
      this.htU.c(localPreference1);
      this.htU.c((Preference)localObject2);
      this.htU.c(localPreference2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAccountInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */