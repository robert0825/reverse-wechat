package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.g;
import com.tencent.mm.av.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class e
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public final Context context;
  private boolean eDU;
  private f htU;
  private x iBi;
  private final Map<String, Preference> jqJ;
  private int status;
  
  public e(Context paramContext)
  {
    GMTrace.i(7626519740416L, 56822);
    this.jqJ = new HashMap();
    this.context = paramContext;
    GMTrace.o(7626519740416L, 56822);
  }
  
  private void ahK()
  {
    int i = 1;
    GMTrace.i(7626922393600L, 56825);
    this.status = q.zI();
    boolean bool;
    HelperHeaderPreference localHelperHeaderPreference;
    if ((q.zP() & 0x40) == 0)
    {
      bool = true;
      this.eDU = bool;
      this.htU.removeAll();
      if (this.jqJ.containsKey("contact_info_header_helper"))
      {
        localHelperHeaderPreference = (HelperHeaderPreference)this.jqJ.get("contact_info_header_helper");
        this.htU.a(localHelperHeaderPreference);
        localHelperHeaderPreference = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
        localHelperHeaderPreference.af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.djw));
        if (!this.eDU) {
          break label345;
        }
      }
    }
    for (;;)
    {
      localHelperHeaderPreference.lu(i);
      if (this.jqJ.containsKey("contact_info_floatbottle_hide_cat")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_floatbottle_hide_cat"));
      }
      if (!this.eDU) {
        break label350;
      }
      if (this.jqJ.containsKey("contact_info_goto_floatbottle")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_goto_floatbottle"));
      }
      if (this.jqJ.containsKey("contact_info_floatbottle_clear_data")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_floatbottle_clear_data"));
      }
      if (this.jqJ.containsKey("contact_info_floatbottle_hide_cat2")) {
        this.htU.a((Preference)this.jqJ.get("contact_info_floatbottle_hide_cat2"));
      }
      if (!this.jqJ.containsKey("contact_info_floatbottle_uninstall")) {
        break label387;
      }
      this.htU.a((Preference)this.jqJ.get("contact_info_floatbottle_uninstall"));
      GMTrace.o(7626922393600L, 56825);
      return;
      bool = false;
      break;
      label345:
      i = 0;
    }
    label350:
    if (this.jqJ.containsKey("contact_info_floatbottle_install")) {
      this.htU.a((Preference)this.jqJ.get("contact_info_floatbottle_install"));
    }
    label387:
    GMTrace.o(7626922393600L, 56825);
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(7627056611328L, 56826);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(7602360549376L, 56642);
          boolean bool = this.jqL;
          int i = q.zI();
          int j = q.zP();
          if (bool)
          {
            i |= 0x1000;
            j &= 0xFFFFFFBF;
            at.AR();
            c.yJ().b(new g(11, 1));
          }
          for (;;)
          {
            at.AR();
            c.xh().set(7, Integer.valueOf(i));
            at.AR();
            c.xh().set(34, Integer.valueOf(j));
            at.AR();
            c.yJ().b(new n("", "", "", "", "", "", "", "", j, "", ""));
            if (!this.jqL) {
              i.ahA();
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(7602360549376L, 56642);
            return;
            i &= 0xEFFF;
            j |= 0x40;
            at.AR();
            c.yJ().b(new g(11, 2));
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(7620882595840L, 56780);
          if (this.jqN != null)
          {
            this.jqN.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(7620882595840L, 56780);
        }
      }, 1500L);
      GMTrace.o(7627056611328L, 56826);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(7627325046784L, 56828);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetFloatBottle", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetFloatBottle", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(7627325046784L, 56828);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(7627325046784L, 56828);
      return;
    }
    ahK();
    GMTrace.o(7627325046784L, 56828);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(7626788175872L, 56824);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fJ(paramx.field_username));
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eox);
      paramx = paramf.VG("contact_info_header_helper");
      if (paramx != null) {
        this.jqJ.put("contact_info_header_helper", paramx);
      }
      paramx = paramf.VG("contact_info_goto_floatbottle");
      if (paramx != null) {
        this.jqJ.put("contact_info_goto_floatbottle", paramx);
      }
      paramx = (PreferenceCategory)paramf.VG("contact_info_floatbottle_hide_cat");
      if (paramx != null) {
        this.jqJ.put("contact_info_floatbottle_hide_cat", paramx);
      }
      paramx = paramf.VG("contact_info_floatbottle_clear_data");
      if (paramx != null) {
        this.jqJ.put("contact_info_floatbottle_clear_data", paramx);
      }
      paramx = (PreferenceCategory)paramf.VG("contact_info_floatbottle_hide_cat2");
      if (paramx != null) {
        this.jqJ.put("contact_info_floatbottle_hide_cat2", paramx);
      }
      paramx = (PreferenceCategory)paramf.VG("contact_info_floatbottle_hide_cat3");
      if (paramx != null) {
        this.jqJ.put("contact_info_floatbottle_hide_cat3", paramx);
      }
      paramx = paramf.VG("contact_info_floatbottle_install");
      if (paramx != null) {
        this.jqJ.put("contact_info_floatbottle_install", paramx);
      }
      paramf = paramf.VG("contact_info_floatbottle_uninstall");
      if (paramf != null) {
        this.jqJ.put("contact_info_floatbottle_uninstall", paramf);
      }
      ahK();
      GMTrace.o(7626788175872L, 56824);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(7627190829056L, 56827);
    at.AR();
    c.xh().b(this);
    com.tencent.mm.plugin.bottle.a.hnI.pr();
    GMTrace.o(7627190829056L, 56827);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7627459264512L, 56829);
    GMTrace.o(7627459264512L, 56829);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(7626653958144L, 56823);
    w.d("MicroMsg.ContactWidgetFloatBottle", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(7626653958144L, 56823);
      return false;
    }
    if (paramString.equals("contact_info_goto_floatbottle"))
    {
      paramString = bk.BE();
      if ((bg.a(Integer.valueOf(paramString.fja), 0) <= 0) || (bg.nm(paramString.getProvince()))) {
        this.context.startActivity(new Intent(this.context, BottleWizardStep1.class));
      }
      for (;;)
      {
        GMTrace.o(7626653958144L, 56823);
        return true;
        this.context.startActivity(new Intent(this.context, BottleBeachUI.class));
      }
    }
    if (paramString.equals("contact_info_floatbottle_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7614037491712L, 56729);
          i.ahA();
          GMTrace.o(7614037491712L, 56729);
        }
      }, null);
      GMTrace.o(7626653958144L, 56823);
      return true;
    }
    if (paramString.equals("contact_info_floatbottle_install"))
    {
      f(this.context, true);
      GMTrace.o(7626653958144L, 56823);
      return true;
    }
    if (paramString.equals("contact_info_floatbottle_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7604910686208L, 56661);
          e.f(e.this.context, false);
          GMTrace.o(7604910686208L, 56661);
        }
      }, null);
      GMTrace.o(7626653958144L, 56823);
      return true;
    }
    w.e("MicroMsg.ContactWidgetFloatBottle", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(7626653958144L, 56823);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */