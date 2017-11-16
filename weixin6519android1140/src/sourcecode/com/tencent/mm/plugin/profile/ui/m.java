package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.n;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.d.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.net.URI;
import java.net.URL;

public final class m
  implements a, m.b
{
  public Context context;
  private boolean eDU;
  private com.tencent.mm.ui.base.preference.f htU;
  private x iBi;
  
  public m(Context paramContext)
  {
    GMTrace.i(6803630850048L, 50691);
    this.context = paramContext;
    GMTrace.o(6803630850048L, 50691);
  }
  
  private void ahK()
  {
    boolean bool2 = true;
    GMTrace.i(6804570374144L, 50698);
    this.eDU = q.zZ();
    Object localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dkp));
    int i;
    if (this.eDU)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).lu(i);
      localObject = this.htU;
      if (this.eDU) {
        break label181;
      }
      bool1 = true;
      label92:
      ((com.tencent.mm.ui.base.preference.f)localObject).bc("contact_info_go_to_sync", bool1);
      localObject = this.htU;
      if (this.eDU) {
        break label186;
      }
      bool1 = true;
      label117:
      ((com.tencent.mm.ui.base.preference.f)localObject).bc("contact_info_remind_me_syncing_tip", bool1);
      this.htU.bc("contact_info_qqsync_install", this.eDU);
      localObject = this.htU;
      if (this.eDU) {
        break label191;
      }
    }
    label181:
    label186:
    label191:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((com.tencent.mm.ui.base.preference.f)localObject).bc("contact_info_qqsync_uninstall", bool1);
      GMTrace.o(6804570374144L, 50698);
      return;
      i = 0;
      break;
      bool1 = false;
      break label92;
      bool1 = false;
      break label117;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6804436156416L, 50697);
    if (this.eDU != q.zZ()) {
      ahK();
    }
    GMTrace.o(6804436156416L, 50697);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6804033503232L, 50694);
    at.AR();
    c.xh().a(this);
    this.htU = paramf;
    this.iBi = paramx;
    paramf.addPreferencesFromResource(R.o.eoH);
    ahK();
    GMTrace.o(6804033503232L, 50694);
    return true;
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6804167720960L, 50695);
    at.AR();
    c.xh().b(this);
    GMTrace.o(6804167720960L, 50695);
    return true;
  }
  
  public final void i(final Context paramContext, final boolean paramBoolean)
  {
    GMTrace.i(6803899285504L, 50693);
    if (paramBoolean) {}
    for (String str = paramContext.getString(R.l.dZZ);; str = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, str, true, null);
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6802422890496L, 50682);
          boolean bool = paramBoolean;
          String str;
          int i;
          if (bool)
          {
            str = "3";
            bq.m(6, str);
            i = q.zP();
            if (!bool) {
              break label149;
            }
            i &= 0xFF7F;
          }
          for (;;)
          {
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            at.AR();
            c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!paramBoolean)
            {
              bc.gS("qqsync");
              at.AR();
              c.yP().TN("qqsync");
            }
            com.tencent.mm.sdk.platformtools.af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6735314026496L, 50182);
                m.3.this.kcQ.dismiss();
                GMTrace.o(6735314026496L, 50182);
              }
            });
            GMTrace.o(6802422890496L, 50682);
            return;
            str = "4";
            break;
            label149:
            i |= 0x80;
          }
        }
      });
      GMTrace.o(6803899285504L, 50693);
      return;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6804301938688L, 50696);
    GMTrace.o(6804301938688L, 50696);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6803765067776L, 50692);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6803765067776L, 50692);
      return false;
    }
    if ("contact_info_go_to_sync".equals(paramString))
    {
      if (p.n(this.context, "com.tencent.qqpim"))
      {
        paramString = this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.qqpim");
        paramString.addFlags(268435456);
        this.context.startActivity(paramString);
      }
      for (;;)
      {
        GMTrace.o(6803765067776L, 50692);
        return true;
        h.a(this.context, R.l.dko, R.l.cUG, R.l.cSw, R.l.cSk, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6755580903424L, 50333);
            paramAnonymousDialogInterface = "http://tools.3g.qq.com/j/wechatandriodpim";
            if (com.tencent.mm.sdk.platformtools.f.eqV == 1)
            {
              paramAnonymousDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tencent.qqpim")).addFlags(268435456);
              if (bg.j(m.this.context, paramAnonymousDialogInterface))
              {
                m.this.context.startActivity(paramAnonymousDialogInterface);
                GMTrace.o(6755580903424L, 50333);
                return;
              }
              paramAnonymousDialogInterface = "https://play.google.com/store/apps/details?id=com.tencent.qqpim";
            }
            try
            {
              paramAnonymousDialogInterface = new URL(paramAnonymousDialogInterface);
              paramAnonymousDialogInterface = new URI(paramAnonymousDialogInterface.getProtocol(), paramAnonymousDialogInterface.getUserInfo(), paramAnonymousDialogInterface.getHost(), paramAnonymousDialogInterface.getPort(), paramAnonymousDialogInterface.getPath(), paramAnonymousDialogInterface.getQuery(), paramAnonymousDialogInterface.getRef()).toURL();
              g.a locala = new g.a();
              locala.vA("qqpim.apk");
              locala.vy(paramAnonymousDialogInterface.toString());
              locala.dJ(true);
              locala.mt(1);
              com.tencent.mm.plugin.downloader.model.f.apJ().a(locala.kfx);
              GMTrace.o(6755580903424L, 50333);
              return;
            }
            catch (Exception paramAnonymousDialogInterface)
            {
              w.e("MicroMsg.ContactWidgetQQSync", "dz[download qq mail error:%s]", new Object[] { paramAnonymousDialogInterface.toString() });
              GMTrace.o(6755580903424L, 50333);
            }
          }
        }, null);
      }
    }
    if ("contact_info_remind_me_syncing".equals(paramString))
    {
      paramString = (CheckBoxPreference)this.htU.VG("contact_info_remind_me_syncing");
      at.AR();
      c.xh().set(65792, Boolean.valueOf(paramString.isChecked()));
      if (paramString.isChecked()) {}
      for (paramString = "1";; paramString = "2")
      {
        bq.m(6, paramString);
        GMTrace.o(6803765067776L, 50692);
        return true;
      }
    }
    if (paramString.equals("contact_info_qqsync_install"))
    {
      i(this.context, true);
      GMTrace.o(6803765067776L, 50692);
      return true;
    }
    if (paramString.equals("contact_info_qqsync_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6737058856960L, 50195);
          m.this.i(m.this.context, false);
          GMTrace.o(6737058856960L, 50195);
        }
      }, null);
      GMTrace.o(6803765067776L, 50692);
      return true;
    }
    GMTrace.o(6803765067776L, 50692);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */