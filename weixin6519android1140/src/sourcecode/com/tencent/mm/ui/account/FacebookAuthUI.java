package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.platformtools.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.g.a.b;
import com.tencent.mm.ui.g.a.c.a;
import com.tencent.mm.ui.g.a.d;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Map;

public class FacebookAuthUI
  extends MMPreference
  implements e
{
  public static final String[] vPD;
  private f htU;
  private DialogInterface.OnCancelListener iKE;
  private final Map<String, Preference> jqJ;
  private boolean vPE;
  private boolean vPF;
  private com.tencent.mm.sdk.b.c vPG;
  private com.tencent.mm.ui.g.a.c vPk;
  private ProgressDialog vPl;
  private com.tencent.mm.modelsimple.g vPm;
  
  static
  {
    GMTrace.i(2748510633984L, 20478);
    vPD = new String[] { "publish_actions", "email" };
    GMTrace.o(2748510633984L, 20478);
  }
  
  public FacebookAuthUI()
  {
    GMTrace.i(2745960497152L, 20459);
    this.vPE = false;
    this.vPF = false;
    this.jqJ = new HashMap();
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(2745960497152L, 20459);
  }
  
  private void bYr()
  {
    GMTrace.i(2746900021248L, 20466);
    this.htU.removeAll();
    boolean bool;
    Preference localPreference;
    if (this.vPE)
    {
      bool = false;
      if (this.jqJ.containsKey("facebook_auth_tip"))
      {
        localPreference = (Preference)this.jqJ.get("facebook_auth_tip");
        if (!bool) {
          break label178;
        }
      }
    }
    label178:
    for (int i = R.l.dsu;; i = R.l.dso)
    {
      localPreference.setTitle(i);
      this.htU.a(localPreference);
      if (this.jqJ.containsKey("facebook_auth_cat"))
      {
        localPreference = (Preference)this.jqJ.get("facebook_auth_cat");
        this.htU.a(localPreference);
      }
      if (bool) {
        break label185;
      }
      if (!this.jqJ.containsKey("facebook_auth_bind_btn")) {
        break label346;
      }
      localPreference = (Preference)this.jqJ.get("facebook_auth_bind_btn");
      this.htU.a(localPreference);
      GMTrace.o(2746900021248L, 20466);
      return;
      bool = q.Af();
      break;
    }
    label185:
    if (this.jqJ.containsKey("facebook_auth_account"))
    {
      localPreference = (Preference)this.jqJ.get("facebook_auth_account");
      StringBuilder localStringBuilder = new StringBuilder().append(getString(R.l.dsq));
      at.AR();
      localPreference.setTitle(com.tencent.mm.y.c.xh().get(65826, null));
      this.htU.a(localPreference);
    }
    if (this.jqJ.containsKey("facebook_auth_cat2"))
    {
      localPreference = (Preference)this.jqJ.get("facebook_auth_cat2");
      this.htU.a(localPreference);
    }
    if (this.jqJ.containsKey("facebook_auth_unbind_btn"))
    {
      localPreference = (Preference)this.jqJ.get("facebook_auth_unbind_btn");
      this.htU.a(localPreference);
    }
    label346:
    GMTrace.o(2746900021248L, 20466);
  }
  
  protected final void MP()
  {
    GMTrace.i(2746631585792L, 20464);
    this.vPE = getIntent().getBooleanExtra("is_force_unbind", false);
    this.vPk = new com.tencent.mm.ui.g.a.c("290293790992170");
    this.iKE = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2566914048000L, 19125);
        if (FacebookAuthUI.a(FacebookAuthUI.this) != null) {
          at.wS().c(FacebookAuthUI.a(FacebookAuthUI.this));
        }
        GMTrace.o(2566914048000L, 19125);
      }
    };
    this.htU.addPreferencesFromResource(R.o.eoQ);
    Preference localPreference = this.htU.VG("facebook_auth_tip");
    if (localPreference != null) {
      this.jqJ.put("facebook_auth_tip", localPreference);
    }
    localPreference = this.htU.VG("facebook_auth_cat");
    if (localPreference != null) {
      this.jqJ.put("facebook_auth_cat", localPreference);
    }
    localPreference = this.htU.VG("facebook_auth_bind_btn");
    if (localPreference != null) {
      this.jqJ.put("facebook_auth_bind_btn", localPreference);
    }
    localPreference = this.htU.VG("facebook_auth_account");
    if (localPreference != null) {
      this.jqJ.put("facebook_auth_account", localPreference);
    }
    localPreference = this.htU.VG("facebook_auth_cat2");
    if (localPreference != null) {
      this.jqJ.put("facebook_auth_cat2", localPreference);
    }
    localPreference = this.htU.VG("facebook_auth_unbind_btn");
    if (localPreference != null) {
      this.jqJ.put("facebook_auth_unbind_btn", localPreference);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2653618700288L, 19771);
        paramAnonymousMenuItem = FacebookAuthUI.this.getIntent();
        paramAnonymousMenuItem.putExtra("bind_facebook_succ", FacebookAuthUI.b(FacebookAuthUI.this));
        FacebookAuthUI.this.setResult(-1, paramAnonymousMenuItem);
        FacebookAuthUI.this.finish();
        GMTrace.o(2653618700288L, 19771);
        return true;
      }
    });
    GMTrace.o(2746631585792L, 20464);
  }
  
  public final int QI()
  {
    GMTrace.i(2746497368064L, 20463);
    int i = R.o.eoQ;
    GMTrace.o(2746497368064L, 20463);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2747168456704L, 20468);
    if (paramk.getType() == 254)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.vPm = new com.tencent.mm.modelsimple.g(0, "");
        at.wS().a(this.vPm, 0);
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (this.vPl != null) {
        this.vPl.dismiss();
      }
      if (paramInt2 == -82)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYd, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2753342472192L, 20514);
            GMTrace.o(2753342472192L, 20514);
          }
        });
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (paramInt2 == -83)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYa, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2685830955008L, 20011);
            GMTrace.o(2685830955008L, 20011);
          }
        });
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (paramInt2 == -84)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYb, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2675227754496L, 19932);
            GMTrace.o(2675227754496L, 19932);
          }
        });
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (paramInt2 == -85)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dXZ, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2553358057472L, 19024);
            GMTrace.o(2553358057472L, 19024);
          }
        });
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (paramInt2 == -86)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYe, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2785286291456L, 20752);
            GMTrace.o(2785286291456L, 20752);
          }
        });
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (paramInt2 == -106)
      {
        m.b(this, paramString, 0);
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (paramInt2 == 65319)
      {
        m.a(this, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      paramString = com.tencent.mm.h.a.dH(paramString);
      if (paramString != null)
      {
        paramString.a(this, null, null);
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      GMTrace.o(2747168456704L, 20468);
      return;
    }
    if (paramk.getType() == 183)
    {
      if (this.vPl != null) {
        this.vPl.dismiss();
      }
      int i = ((com.tencent.mm.modelsimple.g)paramk).opType;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (i == 0) {}
        for (paramInt1 = R.l.djo;; paramInt1 = R.l.djl)
        {
          Toast.makeText(this, paramInt1, 1).show();
          this.vPE = false;
          bYr();
          if (i == 1)
          {
            at.AR();
            com.tencent.mm.y.c.yP().TN("facebookapp");
            at.AR();
            com.tencent.mm.y.c.yM().Cg("facebookapp");
            this.vPF = true;
          }
          GMTrace.o(2747168456704L, 20468);
          return;
        }
      }
      if ((paramInt1 == 4) && (paramInt2 == -67))
      {
        Toast.makeText(this, R.l.dsr, 1).show();
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if ((paramInt1 == 4) && (paramInt2 == -5))
      {
        if (i == 1) {}
        for (paramInt1 = R.l.dsn;; paramInt1 = R.l.dss)
        {
          Toast.makeText(this, paramInt1, 1).show();
          GMTrace.o(2747168456704L, 20468);
          return;
        }
      }
      if (paramInt2 == -106)
      {
        m.b(this, paramString, 0);
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      paramString = com.tencent.mm.h.a.dH(paramString);
      if (paramString != null)
      {
        paramString.a(this, null, null);
        GMTrace.o(2747168456704L, 20468);
        return;
      }
      if (i != 0) {
        break label628;
      }
    }
    label628:
    for (paramInt1 = R.l.djn;; paramInt1 = R.l.djk)
    {
      Toast.makeText(this, paramInt1, 1).show();
      GMTrace.o(2747168456704L, 20468);
      return;
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(2746765803520L, 20465);
    paramf = paramPreference.hiu;
    if (paramf == null)
    {
      w.e("MicroMsg.FacebookAuthUI", "onPreferenceTreeClick, key is null");
      GMTrace.o(2746765803520L, 20465);
      return true;
    }
    if (paramf.equals("facebook_auth_bind_btn")) {
      try
      {
        this.vPk.fC(this);
        this.vPk = new com.tencent.mm.ui.g.a.c("290293790992170");
        this.vPk.a(this, vPD, new a());
        GMTrace.o(2746765803520L, 20465);
        return true;
      }
      catch (Exception paramf)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FacebookAuthUI", paramf, "", new Object[0]);
        }
      }
    }
    if (paramf.equals("facebook_auth_unbind_btn"))
    {
      com.tencent.mm.ui.base.h.a(this, R.l.dst, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2773475131392L, 20664);
          paramAnonymousDialogInterface = FacebookAuthUI.this.getString(R.l.cUG);
          String str = FacebookAuthUI.this.getString(R.l.dsv);
          FacebookAuthUI.a(FacebookAuthUI.this, ProgressDialog.show(FacebookAuthUI.this, paramAnonymousDialogInterface, str, true));
          FacebookAuthUI.d(FacebookAuthUI.this).setOnCancelListener(FacebookAuthUI.c(FacebookAuthUI.this));
          paramAnonymousDialogInterface = new com.tencent.mm.modelsimple.h(com.tencent.mm.modelsimple.h.gTL);
          at.wS().a(paramAnonymousDialogInterface, 0);
          GMTrace.o(2773475131392L, 20664);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2743007707136L, 20437);
          GMTrace.o(2743007707136L, 20437);
        }
      });
      GMTrace.o(2746765803520L, 20465);
      return true;
    }
    GMTrace.o(2746765803520L, 20465);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2747034238976L, 20467);
    boolean bool;
    if (paramIntent == null) {
      bool = true;
    }
    for (;;)
    {
      w.i("MicroMsg.FacebookAuthUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 == -1) && (paramInt1 == 1024) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        int j = paramIntent.getIntExtra("KVoiceHelpCode", 0);
        bool = bg.nm(str);
        int i;
        if (bg.nm(str))
        {
          i = 0;
          w.i("MicroMsg.FacebookAuthUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
          if (j != 65319) {}
        }
        else
        {
          try
          {
            this.vPk.fC(this);
            this.vPk = new com.tencent.mm.ui.g.a.c("290293790992170");
            this.vPk.a(this, vPD, new a());
            GMTrace.o(2747034238976L, 20467);
            return;
            bool = false;
            continue;
            i = str.length();
          }
          catch (Exception paramIntent)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.FacebookAuthUI", paramIntent, "", new Object[0]);
            }
          }
        }
      }
    }
    this.vPk.e(paramInt1, paramInt2, paramIntent);
    GMTrace.o(2747034238976L, 20467);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2746094714880L, 20460);
    super.onCreate(paramBundle);
    this.htU = this.wky;
    MP();
    GMTrace.o(2746094714880L, 20460);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2747302674432L, 20469);
    if (paramInt == 4)
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("bind_facebook_succ", this.vPF);
      setResult(-1, localIntent);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2747302674432L, 20469);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(2746363150336L, 20462);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    at.wS().b(183, this);
    at.wS().b(254, this);
    GMTrace.o(2746363150336L, 20462);
  }
  
  protected void onResume()
  {
    GMTrace.i(2746228932608L, 20461);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    at.wS().a(183, this);
    at.wS().a(254, this);
    bYr();
    GMTrace.o(2746228932608L, 20461);
  }
  
  private final class a
    implements c.a
  {
    public a()
    {
      GMTrace.i(2758442745856L, 20552);
      GMTrace.o(2758442745856L, 20552);
    }
    
    public final void a(b paramb)
    {
      GMTrace.i(2758845399040L, 20555);
      w.d("MicroMsg.FacebookAuthUI", "onError:" + paramb.getMessage());
      com.tencent.mm.ui.base.h.b(FacebookAuthUI.this, paramb.getMessage(), FacebookAuthUI.this.getString(R.l.djk), true);
      FacebookAuthUI.lr(false);
      com.tencent.mm.plugin.report.service.g.ork.a(582L, 3L, 1L, false);
      GMTrace.o(2758845399040L, 20555);
    }
    
    public final void a(d paramd)
    {
      GMTrace.i(2758711181312L, 20554);
      w.d("MicroMsg.FacebookAuthUI", "onFacebookError:" + paramd.xbb);
      com.tencent.mm.ui.base.h.b(FacebookAuthUI.this, paramd.getMessage(), FacebookAuthUI.this.getString(R.l.djk), true);
      FacebookAuthUI.lr(false);
      com.tencent.mm.plugin.report.service.g.ork.a(582L, 2L, 1L, false);
      GMTrace.o(2758711181312L, 20554);
    }
    
    public final void m(Bundle paramBundle)
    {
      GMTrace.i(2758576963584L, 20553);
      w.d("MicroMsg.FacebookAuthUI", "token:" + FacebookAuthUI.e(FacebookAuthUI.this).wlZ);
      at.AR();
      com.tencent.mm.y.c.xh().set(65830, FacebookAuthUI.e(FacebookAuthUI.this).wlZ);
      if (FacebookAuthUI.e(FacebookAuthUI.this).xaU != 0L)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(65832, Long.valueOf(FacebookAuthUI.e(FacebookAuthUI.this).xaU));
      }
      paramBundle = FacebookAuthUI.this.getString(R.l.cUG);
      String str = FacebookAuthUI.this.getString(R.l.dsp);
      FacebookAuthUI.a(FacebookAuthUI.this, ProgressDialog.show(FacebookAuthUI.this, paramBundle, str, true));
      FacebookAuthUI.d(FacebookAuthUI.this).setOnCancelListener(FacebookAuthUI.c(FacebookAuthUI.this));
      FacebookAuthUI.a(FacebookAuthUI.this, new com.tencent.mm.modelsimple.g(1, FacebookAuthUI.e(FacebookAuthUI.this).wlZ));
      at.wS().a(FacebookAuthUI.a(FacebookAuthUI.this), 0);
      FacebookAuthUI.lr(true);
      com.tencent.mm.plugin.report.service.g.ork.a(582L, 1L, 1L, false);
      GMTrace.o(2758576963584L, 20553);
    }
    
    public final void onCancel()
    {
      GMTrace.i(2758979616768L, 20556);
      w.d("MicroMsg.FacebookAuthUI", "onCancel");
      FacebookAuthUI.lr(false);
      com.tencent.mm.plugin.report.service.g.ork.a(582L, 4L, 1L, false);
      GMTrace.o(2758979616768L, 20556);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\FacebookAuthUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */