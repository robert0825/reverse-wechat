package com.tencent.mm.plugin.readerapp.ui;

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
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.readerapp.b.g.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.protocal.c.atw;
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
  
  public b(Context paramContext)
  {
    GMTrace.i(11769418350592L, 87689);
    this.context = paramContext;
    GMTrace.o(11769418350592L, 87689);
  }
  
  private void ahK()
  {
    int j = 1;
    GMTrace.i(11769955221504L, 87693);
    int i;
    Object localObject;
    if ((q.zP() & 0x80000) == 0)
    {
      i = 1;
      this.htU.removeAll();
      this.htU.addPreferencesFromResource(R.o.eoI);
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dkt));
      if (i == 0) {
        break label177;
      }
    }
    for (;;)
    {
      ((HelperHeaderPreference)localObject).lu(j);
      localObject = (CheckBoxPreference)this.htU.VG("contact_info_readerappnews_recv_remind");
      boolean bool = com.tencent.mm.plugin.readerapp.b.c.baf();
      w.d("MicroMsg.ContactWidgetReaderAppNews", "wantToReceiveNews = " + bool);
      ((CheckBoxPreference)localObject).sdM = bool;
      if (i == 0) {
        break label182;
      }
      this.htU.VH("contact_info_readerappnews_install");
      GMTrace.o(11769955221504L, 87693);
      return;
      i = 0;
      break;
      label177:
      j = 0;
    }
    label182:
    this.htU.VH("contact_info_readerappnews_subscribe");
    this.htU.VH("contact_info_readerappnews_view");
    this.htU.VH("contact_info_readerappnews_clear_data");
    this.htU.VH("contact_info_readerappnews_uninstall");
    this.htU.VH("contact_info_readerappnews_recv_remind");
    GMTrace.o(11769955221504L, 87693);
  }
  
  public static void f(final Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(11770089439232L, 87694);
    if (paramBoolean) {}
    for (Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      localObject = h.a(paramContext, (String)localObject, true, null);
      paramContext = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(11756801884160L, 87595);
          if (this.jqL) {
            b.gQ(true);
          }
          int i = q.zP();
          if (this.jqL)
          {
            i &= 0xFFF7FFFF;
            at.AR();
            com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
            paramAnonymousMessage = new atw();
            paramAnonymousMessage.tOv = 524288;
            if (!this.jqL) {
              break label175;
            }
          }
          label175:
          for (i = 0;; i = 1)
          {
            paramAnonymousMessage.uJr = i;
            at.AR();
            com.tencent.mm.y.c.yJ().b(new e.a(39, paramAnonymousMessage));
            if (!this.jqL)
            {
              com.tencent.mm.plugin.readerapp.b.g.a(new g.a()
              {
                public final void bae()
                {
                  GMTrace.i(11751164739584L, 87553);
                  if (this.kcQ != null) {
                    this.kcQ.dismiss();
                  }
                  GMTrace.o(11751164739584L, 87553);
                }
              });
              b.gQ(false);
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(11756801884160L, 87595);
            return;
            i |= 0x80000;
            break;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(11763915423744L, 87648);
          if (this.kcQ != null)
          {
            this.kcQ.dismiss();
            paramContext.sendEmptyMessage(0);
          }
          GMTrace.o(11763915423744L, 87648);
        }
      }, 5000L);
      GMTrace.o(11770089439232L, 87694);
      return;
    }
  }
  
  static void gQ(boolean paramBoolean)
  {
    GMTrace.i(11769552568320L, 87690);
    int i = q.zK();
    if (paramBoolean)
    {
      i &= 0xFBFF;
      at.AR();
      com.tencent.mm.y.c.xh().set(40, Integer.valueOf(i));
      if (!paramBoolean) {
        break label84;
      }
    }
    label84:
    for (i = 2;; i = 1)
    {
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.g(26, i));
      GMTrace.o(11769552568320L, 87690);
      return;
      i |= 0x400;
      break;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(11770357874688L, 87696);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != com.tencent.mm.y.c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(11770357874688L, 87696);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(11770357874688L, 87696);
      return;
    }
    ahK();
    GMTrace.o(11770357874688L, 87696);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(11769821003776L, 87692);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fT(paramx.field_username));
      at.AR();
      com.tencent.mm.y.c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      ahK();
      GMTrace.o(11769821003776L, 87692);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(11770223656960L, 87695);
    at.AR();
    com.tencent.mm.y.c.xh().b(this);
    com.tencent.mm.plugin.readerapp.a.a.hnI.pr();
    GMTrace.o(11770223656960L, 87695);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11770492092416L, 87697);
    GMTrace.o(11770492092416L, 87697);
  }
  
  public final boolean tF(String paramString)
  {
    boolean bool2 = false;
    GMTrace.i(11769686786048L, 87691);
    w.d("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(11769686786048L, 87691);
      return false;
    }
    if (paramString.equals("contact_info_readerappnews_view"))
    {
      paramString = new Intent(this.context, ReaderAppUI.class);
      paramString.addFlags(67108864);
      paramString.putExtra("type", 20);
      this.context.startActivity(paramString);
      ((Activity)this.context).finish();
      com.tencent.mm.plugin.readerapp.a.a.hnI.pr();
      GMTrace.o(11769686786048L, 87691);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_subscribe"))
    {
      paramString = new Intent(this.context, ReaderAppSubscribeUI.class);
      this.context.startActivity(paramString);
      GMTrace.o(11769686786048L, 87691);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.diZ), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11757741408256L, 87602);
          com.tencent.mm.plugin.readerapp.b.g.a(new g.a()
          {
            public final void bae()
            {
              GMTrace.i(11769284132864L, 87688);
              this.fTe.dismiss();
              GMTrace.o(11769284132864L, 87688);
            }
          });
          GMTrace.o(11757741408256L, 87602);
        }
      }, null);
      GMTrace.o(11769686786048L, 87691);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_recv_remind"))
    {
      paramString = (CheckBoxPreference)this.htU.VG(paramString);
      boolean bool3 = com.tencent.mm.plugin.readerapp.b.c.baf();
      if (!bool3) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        paramString.sdM = bool1;
        bool1 = bool2;
        if (!bool3) {
          bool1 = true;
        }
        gQ(bool1);
        GMTrace.o(11769686786048L, 87691);
        return true;
      }
    }
    if (paramString.equals("contact_info_readerappnews_install"))
    {
      f(this.context, true);
      GMTrace.o(11769686786048L, 87691);
      return true;
    }
    if (paramString.equals("contact_info_readerappnews_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11751433175040L, 87555);
          b.f(b.this.context, false);
          GMTrace.o(11751433175040L, 87555);
        }
      }, null);
      GMTrace.o(11769686786048L, 87691);
      return true;
    }
    w.e("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(11769686786048L, 87691);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */