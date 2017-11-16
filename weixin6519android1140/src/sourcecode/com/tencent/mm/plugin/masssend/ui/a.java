package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.av.n;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public Context context;
  private f htU;
  private x iBi;
  private Map<String, Preference> jqJ;
  
  public a(Context paramContext)
  {
    GMTrace.i(11235097575424L, 83708);
    this.jqJ = new HashMap();
    this.context = paramContext;
    GMTrace.o(11235097575424L, 83708);
  }
  
  public static void Ty()
  {
    GMTrace.i(11235768664064L, 83713);
    b localb = com.tencent.mm.plugin.masssend.a.h.aNB();
    if (localb.goN.eZ("massendinfo", "delete from massendinfo")) {
      localb.doNotify();
    }
    at.AR();
    c.yP().TN("masssendapp");
    GMTrace.o(11235768664064L, 83713);
  }
  
  private void ahK()
  {
    boolean bool3 = true;
    GMTrace.i(11235500228608L, 83711);
    Object localObject;
    int i;
    label73:
    boolean bool2;
    if ((q.zP() & 0x10000) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_masssend_header_helper");
      ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.djS));
      if (!bool1) {
        break label172;
      }
      i = 1;
      ((HelperHeaderPreference)localObject).lu(i);
      this.htU.bc("contact_info_masssend_install", bool1);
      localObject = this.htU;
      if (bool1) {
        break label177;
      }
      bool2 = true;
      label103:
      ((f)localObject).bc("contact_info_masssend_view", bool2);
      localObject = this.htU;
      if (bool1) {
        break label182;
      }
      bool2 = true;
      label125:
      ((f)localObject).bc("contact_info_masssend_clear_data", bool2);
      localObject = this.htU;
      if (bool1) {
        break label187;
      }
    }
    label172:
    label177:
    label182:
    label187:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      ((f)localObject).bc("contact_info_masssend_uninstall", bool1);
      GMTrace.o(11235500228608L, 83711);
      return;
      bool1 = false;
      break;
      i = 0;
      break label73;
      bool2 = false;
      break label103;
      bool2 = false;
      break label125;
    }
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(11235634446336L, 83712);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(11241271590912L, 83754);
          int i = q.zP();
          if (this.jqL) {
            i &= 0xFFFEFFFF;
          }
          for (;;)
          {
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            at.AR();
            c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL) {
              a.Ty();
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(11241271590912L, 83754);
            return;
            i |= 0x10000;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(11241808461824L, 83758);
          if (this.jqN != null)
          {
            this.jqN.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(11241808461824L, 83758);
        }
      }, 1500L);
      GMTrace.o(11235634446336L, 83712);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(11236037099520L, 83715);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetMassSend", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetMassSend", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(11236037099520L, 83715);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(11236037099520L, 83715);
      return;
    }
    ahK();
    GMTrace.o(11236037099520L, 83715);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(11235366010880L, 83710);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fM(paramx.field_username));
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eoB);
      ahK();
      GMTrace.o(11235366010880L, 83710);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(11235902881792L, 83714);
    at.AR();
    c.xh().b(this);
    com.tencent.mm.plugin.masssend.a.hnI.pr();
    GMTrace.o(11235902881792L, 83714);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11236171317248L, 83716);
    GMTrace.o(11236171317248L, 83716);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(11235231793152L, 83709);
    w.d("MicroMsg.ContactWidgetMassSend", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(11235231793152L, 83709);
      return false;
    }
    if (paramString.equals("contact_info_masssend_view"))
    {
      paramString = new Intent(this.context, MassSendHistoryUI.class);
      this.context.startActivity(paramString);
      GMTrace.o(11235231793152L, 83709);
      return true;
    }
    if (paramString.equals("contact_info_masssend_clear_data"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11219662536704L, 83593);
          a.Ty();
          GMTrace.o(11219662536704L, 83593);
        }
      }, null);
      GMTrace.o(11235231793152L, 83709);
      return true;
    }
    if (paramString.equals("contact_info_masssend_install"))
    {
      f(this.context, true);
      GMTrace.o(11235231793152L, 83709);
      return true;
    }
    if (paramString.equals("contact_info_masssend_uninstall"))
    {
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11239124107264L, 83738);
          a.f(a.this.context, false);
          GMTrace.o(11239124107264L, 83738);
        }
      }, null);
      GMTrace.o(11235231793152L, 83709);
      return true;
    }
    w.e("MicroMsg.ContactWidgetMassSend", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(11235231793152L, 83709);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\masssend\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */