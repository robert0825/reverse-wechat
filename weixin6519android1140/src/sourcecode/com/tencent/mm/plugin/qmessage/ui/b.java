package com.tencent.mm.plugin.qmessage.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.n;
import com.tencent.mm.g.b.af;
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
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class b
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public Context context;
  private f htU;
  private x iBi;
  private boolean nLx;
  
  public b(Context paramContext)
  {
    GMTrace.i(8952456675328L, 66701);
    this.context = paramContext;
    GMTrace.o(8952456675328L, 66701);
  }
  
  public static void c(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    GMTrace.i(8953261981696L, 66707);
    int i = q.zI();
    if (paramBoolean)
    {
      paramInt1 = i | paramInt1;
      at.AR();
      c.xh().set(7, Integer.valueOf(paramInt1));
      if (!paramBoolean) {
        break label81;
      }
    }
    label81:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      at.AR();
      c.yJ().b(new com.tencent.mm.av.g(paramInt2, paramInt1));
      GMTrace.o(8953261981696L, 66707);
      return;
      paramInt1 = i & (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(8952725110784L, 66703);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(8950577627136L, 66687);
          b.c(64, this.jqL, 5);
          b.c(8192, this.jqL, 12);
          int i = q.zP();
          if (this.jqL) {
            i &= 0xFFFFFFDF;
          }
          for (;;)
          {
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            at.AR();
            c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL) {
              com.tencent.mm.plugin.qmessage.a.g.aYm();
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(8950577627136L, 66687);
            return;
            i |= 0x20;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(8957288513536L, 66737);
          if (this.kcQ != null)
          {
            this.kcQ.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(8957288513536L, 66737);
        }
      }, 5000L);
      GMTrace.o(8952725110784L, 66703);
      return;
    }
  }
  
  private static boolean sP(int paramInt)
  {
    GMTrace.i(8952859328512L, 66704);
    if ((q.zI() & paramInt) != 0)
    {
      GMTrace.o(8952859328512L, 66704);
      return true;
    }
    GMTrace.o(8952859328512L, 66704);
    return false;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(8953530417152L, 66709);
    at.AR();
    if (paramm != c.xh())
    {
      GMTrace.o(8953530417152L, 66709);
      return;
    }
    ahK();
    GMTrace.o(8953530417152L, 66709);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(8952993546240L, 66705);
    if (paramx != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      Assert.assertTrue(s.fK(paramx.field_username));
      bool1 = bool2;
      if (paramf != null) {
        bool1 = true;
      }
      Assert.assertTrue(bool1);
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.nLx = paramBoolean;
      this.htU = paramf;
      ahK();
      GMTrace.o(8952993546240L, 66705);
      return true;
    }
  }
  
  public final void ahK()
  {
    int j = 1;
    GMTrace.i(8953127763968L, 66706);
    int i;
    boolean bool;
    HelperHeaderPreference localHelperHeaderPreference;
    if ((q.zP() & 0x20) == 0)
    {
      i = 1;
      bool = sP(64);
      sP(8192);
      this.htU.removeAll();
      this.htU.addPreferencesFromResource(R.o.eoF);
      localHelperHeaderPreference = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      localHelperHeaderPreference.af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dki));
      if (i == 0) {
        break label179;
      }
    }
    for (;;)
    {
      localHelperHeaderPreference.lu(j);
      if (i != 0) {
        break label184;
      }
      this.htU.VH("contact_info_view_message");
      this.htU.VH("contact_info_qmessage_recv_offline_msg");
      this.htU.VH("contact_info_qmessage_uninstall");
      this.htU.VH("contact_info_qmessage_clear_data");
      GMTrace.o(8953127763968L, 66706);
      return;
      i = 0;
      break;
      label179:
      j = 0;
    }
    label184:
    this.htU.VH("contact_info_qmessage_install");
    ((CheckBoxPreference)this.htU.VG("contact_info_qmessage_recv_offline_msg")).sdM = bool;
    GMTrace.o(8953127763968L, 66706);
  }
  
  public final boolean ahL()
  {
    GMTrace.i(8953396199424L, 66708);
    at.AR();
    c.xh().b(this);
    com.tencent.mm.plugin.qmessage.a.nRj.pr();
    GMTrace.o(8953396199424L, 66708);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8953664634880L, 66710);
    GMTrace.o(8953664634880L, 66710);
  }
  
  public final boolean tF(final String paramString)
  {
    GMTrace.i(8952590893056L, 66702);
    w.d("MicroMsg.ContactWidgetQMessage", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(8952590893056L, 66702);
      return false;
    }
    if (paramString.equals("contact_info_view_message"))
    {
      paramString = new Intent(this.context, QConversationUI.class);
      if (this.nLx) {
        ((Activity)this.context).setResult(-1, paramString);
      }
      for (;;)
      {
        ((Activity)this.context).finish();
        GMTrace.o(8952590893056L, 66702);
        return true;
        this.context.startActivity(paramString);
      }
    }
    if (paramString.equals("contact_info_qmessage_recv_offline_msg"))
    {
      paramString = (CheckBoxPreference)this.htU.VG(paramString);
      if (paramString.isChecked()) {
        c(64, true, 5);
      }
      for (;;)
      {
        GMTrace.o(8952590893056L, 66702);
        return true;
        if (!sP(8192))
        {
          c(64, false, 5);
          GMTrace.o(8952590893056L, 66702);
          return true;
        }
        h.a(this.context, R.l.dkh, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8949503885312L, 66679);
            b.c(8192, false, 12);
            b.c(64, false, 5);
            GMTrace.o(8949503885312L, 66679);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8956348989440L, 66730);
            paramString.sdM = true;
            b.this.ahK();
            GMTrace.o(8956348989440L, 66730);
          }
        });
      }
    }
    if (paramString.equals("contact_info_qmessage_display_weixin_online"))
    {
      c(8192, ((CheckBoxPreference)this.htU.VG(paramString)).isChecked(), 12);
      GMTrace.o(8952590893056L, 66702);
      return true;
    }
    if (paramString.equals("contact_info_qmessage_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8950040756224L, 66683);
          com.tencent.mm.plugin.qmessage.a.g.aYm();
          GMTrace.o(8950040756224L, 66683);
        }
      }, null);
      GMTrace.o(8952590893056L, 66702);
      return true;
    }
    if (paramString.equals("contact_info_qmessage_install"))
    {
      at.AR();
      if (bg.e((Integer)c.xh().get(9, null)) == 0)
      {
        h.b(this.context, R.l.ebn, R.l.cUG, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8943195652096L, 66632);
            com.tencent.mm.bj.d.a(b.this.context, "accountsync", "com.tencent.mm.ui.bindqq.BindQQUI", null);
            GMTrace.o(8943195652096L, 66632);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8955543683072L, 66724);
            GMTrace.o(8955543683072L, 66724);
          }
        });
        GMTrace.o(8952590893056L, 66702);
        return true;
      }
      f(this.context, true);
      GMTrace.o(8952590893056L, 66702);
      return true;
    }
    if (paramString.equals("contact_info_qmessage_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8955812118528L, 66726);
          b.f(b.this.context, false);
          GMTrace.o(8955812118528L, 66726);
        }
      }, null);
      GMTrace.o(8952590893056L, 66702);
      return true;
    }
    w.e("MicroMsg.ContactWidgetQMessage", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(8952590893056L, 66702);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qmessage\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */