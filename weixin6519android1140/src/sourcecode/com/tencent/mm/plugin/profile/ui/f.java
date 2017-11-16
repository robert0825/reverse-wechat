package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.n;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class f
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public Context context;
  private com.tencent.mm.ui.base.preference.f htU;
  private x iBi;
  private Map<String, Preference> jqJ;
  private HelperHeaderPreference.a nMY;
  
  public f(Context paramContext)
  {
    GMTrace.i(6755983556608L, 50336);
    this.jqJ = new HashMap();
    this.context = paramContext;
    this.nMY = new p(paramContext);
    at.AR();
    com.tencent.mm.y.c.yP().TQ("facebookapp");
    GMTrace.o(6755983556608L, 50336);
  }
  
  private void ahK()
  {
    GMTrace.i(6756386209792L, 50339);
    this.htU.removeAll();
    Object localObject;
    if (this.jqJ.containsKey("contact_info_header_helper"))
    {
      localObject = (HelperHeaderPreference)this.jqJ.get("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).a(this.iBi, this.nMY);
      this.htU.a((Preference)localObject);
    }
    if (this.jqJ.containsKey("contact_info_facebookapp_cat")) {
      this.htU.a((Preference)this.jqJ.get("contact_info_facebookapp_cat"));
    }
    if ((q.zP() & 0x2000) == 0) {}
    for (int i = 1; i == 0; i = 0)
    {
      if (this.jqJ.containsKey("contact_info_facebookapp_install")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_facebookapp_install"));
      }
      GMTrace.o(6756386209792L, 50339);
      return;
    }
    if (!q.Af()) {
      if (this.jqJ.containsKey("contact_info_facebookapp_connect")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_facebookapp_connect"));
      }
    }
    for (;;)
    {
      if (this.jqJ.containsKey("contact_info_facebookapp_cat2")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_facebookapp_cat2"));
      }
      if (this.jqJ.containsKey("contact_info_facebookapp_uninstall")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_facebookapp_uninstall"));
      }
      GMTrace.o(6756386209792L, 50339);
      return;
      if (this.jqJ.containsKey("contact_info_facebookapp_addr"))
      {
        this.htU.a((Preference)this.jqJ.get("contact_info_facebookapp_addr"));
        localObject = (Preference)this.jqJ.get("contact_info_facebookapp_addr");
        at.AR();
        ((Preference)localObject).setSummary((String)com.tencent.mm.y.c.xh().get(65826, null));
      }
    }
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(6756520427520L, 50340);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6805241462784L, 50703);
          int i = q.zP();
          if (this.jqL) {
            i &= 0xDFFF;
          }
          for (;;)
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
            at.AR();
            com.tencent.mm.y.c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL)
            {
              com.tencent.mm.modelfriend.af.Ig().Hh();
              at.AR();
              com.tencent.mm.y.c.xh().set(65828, "");
              at.AR();
              com.tencent.mm.y.c.yP().TN("facebookapp");
              at.AR();
              com.tencent.mm.y.c.yM().Cg("facebookapp");
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(6805241462784L, 50703);
            return;
            i |= 0x2000;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(6805778333696L, 50707);
          if (this.jqN != null)
          {
            this.jqN.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(6805778333696L, 50707);
        }
      }, 1500L);
      GMTrace.o(6756520427520L, 50340);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(6756788862976L, 50342);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != com.tencent.mm.y.c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetFacebookapp", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6756788862976L, 50342);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 65825))
    {
      GMTrace.o(6756788862976L, 50342);
      return;
    }
    ahK();
    GMTrace.o(6756788862976L, 50342);
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6756251992064L, 50338);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fL(paramx.field_username));
      at.AR();
      com.tencent.mm.y.c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eov);
      paramx = paramf.VG("contact_info_header_helper");
      if (paramx != null) {
        this.jqJ.put("contact_info_header_helper", paramx);
      }
      paramx = paramf.VG("contact_info_facebookapp_listfriend");
      if (paramx != null) {
        this.jqJ.put("contact_info_facebookapp_listfriend", paramx);
      }
      paramx = paramf.VG("contact_info_facebookapp_connect");
      if (paramx != null) {
        this.jqJ.put("contact_info_facebookapp_connect", paramx);
      }
      paramx = (PreferenceCategory)paramf.VG("contact_info_facebookapp_cat");
      if (paramx != null) {
        this.jqJ.put("contact_info_facebookapp_cat", paramx);
      }
      paramx = paramf.VG("contact_info_facebookapp_addr");
      if (paramx != null) {
        this.jqJ.put("contact_info_facebookapp_addr", paramx);
      }
      paramx = (PreferenceCategory)paramf.VG("contact_info_facebookapp_cat2");
      if (paramx != null) {
        this.jqJ.put("contact_info_facebookapp_cat2", paramx);
      }
      paramx = paramf.VG("contact_info_facebookapp_install");
      if (paramx != null) {
        this.jqJ.put("contact_info_facebookapp_install", paramx);
      }
      paramf = paramf.VG("contact_info_facebookapp_uninstall");
      if (paramf != null) {
        this.jqJ.put("contact_info_facebookapp_uninstall", paramf);
      }
      ahK();
      GMTrace.o(6756251992064L, 50338);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6756654645248L, 50341);
    at.AR();
    com.tencent.mm.y.c.xh().b(this);
    this.jqJ.get("contact_info_header_helper");
    com.tencent.mm.plugin.profile.a.hnI.pr();
    GMTrace.o(6756654645248L, 50341);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6756923080704L, 50343);
    GMTrace.o(6756923080704L, 50343);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6756117774336L, 50337);
    w.d("MicroMsg.ContactWidgetFacebookapp", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6756117774336L, 50337);
      return false;
    }
    if (paramString.equals("contact_info_facebookapp_install"))
    {
      f(this.context, true);
      GMTrace.o(6756117774336L, 50337);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6773163425792L, 50464);
          f.f(f.this.context, false);
          GMTrace.o(6773163425792L, 50464);
        }
      }, null);
      GMTrace.o(6756117774336L, 50337);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_listfriend"))
    {
      com.tencent.mm.bj.d.b(this.context, "", "com.tencent.mm.ui.account.FacebookFriendUI", new Intent());
      GMTrace.o(6756117774336L, 50337);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_connect"))
    {
      com.tencent.mm.bj.d.a(this.context, ".ui.account.FacebookAuthUI", new Intent());
      GMTrace.o(6756117774336L, 50337);
      return true;
    }
    if (paramString.equals("contact_info_facebookapp_addr"))
    {
      com.tencent.mm.bj.d.a(this.context, ".ui.account.FacebookAuthUI", new Intent());
      GMTrace.o(6756117774336L, 50337);
      return true;
    }
    w.e("MicroMsg.ContactWidgetFacebookapp", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6756117774336L, 50337);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */