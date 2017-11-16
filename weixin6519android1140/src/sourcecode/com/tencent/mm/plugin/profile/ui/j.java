package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class j
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public static boolean jqh;
  public Context context;
  private f htU;
  private x iBi;
  
  static
  {
    GMTrace.i(6821481807872L, 50824);
    jqh = false;
    GMTrace.o(6821481807872L, 50824);
  }
  
  public j(Context paramContext)
  {
    GMTrace.i(6819736977408L, 50811);
    this.context = paramContext;
    GMTrace.o(6819736977408L, 50811);
  }
  
  private void ahK()
  {
    boolean bool4 = true;
    GMTrace.i(6820139630592L, 50814);
    boolean bool1;
    int i;
    boolean bool2;
    label62:
    Object localObject;
    label113:
    boolean bool3;
    if ((q.zP() & 0x10) == 0)
    {
      bool1 = true;
      i = q.zI();
      if (q.Al()) {
        break label295;
      }
      if ((i & 0x4000) != 0)
      {
        at.AR();
        c.xh().set(7, Integer.valueOf(i & 0xBFFF));
      }
      bool2 = false;
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.djV));
      if (!bool1) {
        break label313;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).lu(i);
      this.htU.bc("contact_info_medianote_install", bool1);
      localObject = this.htU;
      if (bool1) {
        break label318;
      }
      bool3 = true;
      label144:
      ((f)localObject).bc("contact_info_medianote_view", bool3);
      if ((!bool1) || (q.Al())) {
        break label347;
      }
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("BindQQSwitch"), 1) != 1) {
        break label324;
      }
      bool3 = true;
      label184:
      w.i("MicroMsg.ContactWidgetMediaNote", "summerqq BindQQSwitch off");
    }
    for (;;)
    {
      localObject = this.htU;
      if (!bool3)
      {
        bool3 = true;
        label205:
        ((f)localObject).bc("contact_info_medianote_sync_to_qqmail", bool3);
        localObject = this.htU;
        if (bool1) {
          break label336;
        }
        bool3 = true;
        label229:
        ((f)localObject).bc("contact_info_medianote_clear_data", bool3);
        localObject = this.htU;
        if (bool1) {
          break label342;
        }
      }
      label295:
      label313:
      label318:
      label324:
      label336:
      label342:
      for (bool1 = bool4;; bool1 = false)
      {
        ((f)localObject).bc("contact_info_medianote_uninstall", bool1);
        ((CheckBoxPreference)this.htU.VG("contact_info_medianote_sync_to_qqmail")).sdM = bool2;
        GMTrace.o(6820139630592L, 50814);
        return;
        bool1 = false;
        break;
        if ((i & 0x4000) != 0)
        {
          bool2 = true;
          break label62;
        }
        bool2 = false;
        break label62;
        i = 0;
        break label113;
        bool3 = false;
        break label144;
        bool3 = false;
        break label184;
        bool3 = false;
        break label205;
        bool3 = false;
        break label229;
      }
      label347:
      bool3 = bool1;
    }
  }
  
  public static void cY(Context paramContext)
  {
    GMTrace.i(16033918222336L, 119462);
    jqh = false;
    paramContext.getString(R.l.cUG);
    bc.a("medianote", new bc.a()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(6800275406848L, 50666);
        j.jqh = true;
        GMTrace.o(6800275406848L, 50666);
      }
    }
    {
      public final void Bk()
      {
        GMTrace.i(6757594169344L, 50348);
        if (this.jrr != null) {
          this.jrr.dismiss();
        }
        GMTrace.o(6757594169344L, 50348);
      }
      
      public final boolean Bl()
      {
        GMTrace.i(6757459951616L, 50347);
        boolean bool = j.jqh;
        GMTrace.o(6757459951616L, 50347);
        return bool;
      }
    });
    at.AR();
    c.yP().TN("medianote");
    GMTrace.o(16033918222336L, 119462);
  }
  
  public static void f(final Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(6820273848320L, 50815);
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      localObject = h.a(paramContext, (String)localObject, true, null);
      paramContext = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6806046769152L, 50709);
          if (this.jqL) {
            j.gC(true);
          }
          int i = q.zP();
          if (this.jqL) {
            i &= 0xFFFFFFEF;
          }
          for (;;)
          {
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            at.AR();
            c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL) {
              j.cY(paramContext);
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(6806046769152L, 50709);
            return;
            i |= 0x10;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(6739877429248L, 50216);
          if (this.jqN != null)
          {
            this.jqN.dismiss();
            paramContext.sendEmptyMessage(0);
          }
          GMTrace.o(6739877429248L, 50216);
        }
      }, 1500L);
      GMTrace.o(6820273848320L, 50815);
      return;
    }
  }
  
  static void gC(boolean paramBoolean)
  {
    GMTrace.i(6820810719232L, 50819);
    int i = q.zI();
    if (paramBoolean)
    {
      i |= 0x4000;
      at.AR();
      c.xh().set(7, Integer.valueOf(i));
      if (!paramBoolean) {
        break label86;
      }
    }
    label86:
    for (i = 1;; i = 2)
    {
      at.AR();
      c.yJ().b(new com.tencent.mm.av.g(13, i));
      GMTrace.o(6820810719232L, 50819);
      return;
      i &= 0xBFFF;
      break;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6820542283776L, 50817);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetMediaNote", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetMediaNote", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6820542283776L, 50817);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(6820542283776L, 50817);
      return;
    }
    ahK();
    GMTrace.o(6820542283776L, 50817);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6820005412864L, 50813);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fS(paramx.field_username));
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eoC);
      ahK();
      GMTrace.o(6820005412864L, 50813);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6820408066048L, 50816);
    at.AR();
    c.xh().b(this);
    com.tencent.mm.plugin.profile.a.hnI.pr();
    GMTrace.o(6820408066048L, 50816);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6820676501504L, 50818);
    GMTrace.o(6820676501504L, 50818);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6819871195136L, 50812);
    w.d("MicroMsg.ContactWidgetMediaNote", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6819871195136L, 50812);
      return false;
    }
    if (paramString.equals("contact_info_medianote_view"))
    {
      paramString = new Intent();
      paramString.putExtra("Chat_User", "medianote");
      com.tencent.mm.plugin.profile.a.hnH.e(paramString, this.context);
      com.tencent.mm.plugin.profile.a.hnI.pr();
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    if (paramString.equals("contact_info_medianote_sync_to_qqmail"))
    {
      if (!q.Al())
      {
        h.a(this.context, R.l.djU, R.l.djT, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6773968732160L, 50470);
            com.tencent.mm.plugin.profile.a.hnH.h(new Intent(), j.this.context);
            GMTrace.o(6773968732160L, 50470);
          }
        }, null);
        ahK();
      }
      for (;;)
      {
        GMTrace.o(6819871195136L, 50812);
        return true;
        gC(((CheckBoxPreference)this.htU.VG(paramString)).isChecked());
      }
    }
    if (paramString.equals("contact_info_medianote_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6799738535936L, 50662);
          j.cY(j.this.context);
          GMTrace.o(6799738535936L, 50662);
        }
      }, null);
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    if (paramString.equals("contact_info_medianote_install"))
    {
      f(this.context, true);
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    if (paramString.equals("contact_info_medianote_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6805509898240L, 50705);
          j.f(j.this.context, false);
          GMTrace.o(6805509898240L, 50705);
        }
      }, null);
      GMTrace.o(6819871195136L, 50812);
      return true;
    }
    w.e("MicroMsg.ContactWidgetMediaNote", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6819871195136L, 50812);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */