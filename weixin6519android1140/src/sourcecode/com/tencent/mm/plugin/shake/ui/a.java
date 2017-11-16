package com.tencent.mm.plugin.shake.ui;

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
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.pluginsdk.d.a, m.b, ap
{
  public Context context;
  private f htU;
  private x iBi;
  
  public a(Context paramContext)
  {
    GMTrace.i(6560696762368L, 48881);
    this.context = paramContext;
    GMTrace.o(6560696762368L, 48881);
  }
  
  private void ahK()
  {
    boolean bool3 = true;
    GMTrace.i(6561099415552L, 48884);
    Object localObject;
    int i;
    label82:
    boolean bool2;
    if ((q.zP() & 0x100) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      if (localObject != null)
      {
        ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dkN));
        if (!bool1) {
          break label159;
        }
        i = 1;
        ((HelperHeaderPreference)localObject).lu(i);
      }
      this.htU.bc("contact_info_shake_install", bool1);
      localObject = this.htU;
      if (bool1) {
        break label164;
      }
      bool2 = true;
      label112:
      ((f)localObject).bc("contact_info_shake_go_shake", bool2);
      localObject = this.htU;
      if (bool1) {
        break label169;
      }
    }
    label159:
    label164:
    label169:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      ((f)localObject).bc("contact_info_shake_uninstall", bool1);
      GMTrace.o(6561099415552L, 48884);
      return;
      bool1 = false;
      break;
      i = 0;
      break label82;
      bool2 = false;
      break label112;
    }
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(6561233633280L, 48885);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6570092003328L, 48951);
          int j = q.zP();
          if (this.jqL) {}
          for (int i = j & 0xFEFF;; i = j | 0x100)
          {
            w.i("MicroMsg.ContactWidgetShake", "setInstall pluginFlag install:%b  pluginFlag : %d -> %d", new Object[] { Boolean.valueOf(this.jqL), Integer.valueOf(j), Integer.valueOf(i) });
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            at.AR();
            c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
            if (!this.jqL) {
              com.tencent.mm.plugin.shake.b.m.bfn();
            }
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(6570092003328L, 48951);
            return;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(6542308933632L, 48744);
          if (this.kcQ != null)
          {
            this.kcQ.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(6542308933632L, 48744);
        }
      }, 1500L);
      GMTrace.o(6561233633280L, 48885);
      return;
    }
  }
  
  public final void AI()
  {
    GMTrace.i(6561636286464L, 48888);
    ahK();
    GMTrace.o(6561636286464L, 48888);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6561770504192L, 48889);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetShake", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetShake", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6561770504192L, 48889);
      return;
    }
    if ((i != 7) && (i != 34))
    {
      GMTrace.o(6561770504192L, 48889);
      return;
    }
    ahK();
    GMTrace.o(6561770504192L, 48889);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6560965197824L, 48883);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fR(paramx.field_username));
      at.AR();
      c.xh().a(this);
      at.AR();
      c.a(this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eoJ);
      ahK();
      GMTrace.o(6560965197824L, 48883);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6561367851008L, 48886);
    at.AR();
    c.xh().b(this);
    at.AR();
    c.b(this);
    com.tencent.mm.plugin.shake.a.hnI.pr();
    GMTrace.o(6561367851008L, 48886);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6561502068736L, 48887);
    GMTrace.o(6561502068736L, 48887);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6560830980096L, 48882);
    w.d("MicroMsg.ContactWidgetShake", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6560830980096L, 48882);
      return false;
    }
    if (paramString.equals("contact_info_shake_go_shake"))
    {
      paramString = new Intent();
      paramString.setClass(this.context, ShakeReportUI.class);
      this.context.startActivity(paramString);
      ((Activity)this.context).finish();
      GMTrace.o(6560830980096L, 48882);
      return true;
    }
    if (paramString.equals("contact_info_shake_install"))
    {
      f(this.context, true);
      GMTrace.o(6560830980096L, 48882);
      return true;
    }
    if (paramString.equals("contact_info_shake_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6576266018816L, 48997);
          a.f(a.this.context, false);
          GMTrace.o(6576266018816L, 48997);
        }
      }, null);
      GMTrace.o(6560830980096L, 48882);
      return true;
    }
    w.e("MicroMsg.ContactWidgetShake", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6560830980096L, 48882);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */