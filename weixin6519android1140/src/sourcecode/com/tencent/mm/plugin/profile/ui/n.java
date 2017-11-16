package com.tencent.mm.plugin.profile.ui;

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
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Timer;
import java.util.TimerTask;
import junit.framework.Assert;

public final class n
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public Context context;
  private f htU;
  private x iBi;
  
  public n(Context paramContext)
  {
    GMTrace.i(6726187220992L, 50114);
    this.context = paramContext;
    GMTrace.o(6726187220992L, 50114);
  }
  
  private void ahK()
  {
    boolean bool2 = true;
    GMTrace.i(6726589874176L, 50117);
    Object localObject;
    int i;
    if ((q.zP() & 0x2000000) == 0)
    {
      bool1 = true;
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dlz));
      if (!bool1) {
        break label126;
      }
      i = 1;
      label72:
      ((HelperHeaderPreference)localObject).lu(i);
      this.htU.bc("contact_info_voiceinput_install", bool1);
      localObject = this.htU;
      if (bool1) {
        break label131;
      }
    }
    label126:
    label131:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((f)localObject).bc("contact_info_voiceinput_uninstall", bool1);
      GMTrace.o(6726589874176L, 50117);
      return;
      bool1 = false;
      break;
      i = 0;
      break label72;
    }
  }
  
  public static void f(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(6726724091904L, 50118);
    if (paramBoolean) {}
    for (final Object localObject = paramContext.getString(R.l.dZZ);; localObject = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      paramContext = h.a(paramContext, (String)localObject, true, null);
      localObject = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6753433419776L, 50317);
          int i = q.zP();
          if (this.jqL)
          {
            i &= 0xFDFFFFFF;
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            paramAnonymousMessage = new atw();
            paramAnonymousMessage.tOv = 33554432;
            if (!this.jqL) {
              break label123;
            }
          }
          label123:
          for (i = 0;; i = 1)
          {
            paramAnonymousMessage.uJr = i;
            at.AR();
            c.yJ().b(new e.a(39, paramAnonymousMessage));
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(6753433419776L, 50317);
            return;
            i |= 0x2000000;
            break;
          }
        }
      };
      new Timer().schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(6738937905152L, 50209);
          if (this.kcQ != null)
          {
            this.kcQ.dismiss();
            localObject.sendEmptyMessage(0);
          }
          GMTrace.o(6738937905152L, 50209);
        }
      }, 1500L);
      GMTrace.o(6726724091904L, 50118);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(6726992527360L, 50120);
    int i = bg.m(paramObject, 0);
    w.d("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(6726992527360L, 50120);
      return;
    }
    if ((i != 40) && (i != 34) && (i != 7))
    {
      GMTrace.o(6726992527360L, 50120);
      return;
    }
    ahK();
    GMTrace.o(6726992527360L, 50120);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6726455656448L, 50116);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fW(paramx.field_username));
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eoL);
      ahK();
      GMTrace.o(6726455656448L, 50116);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6726858309632L, 50119);
    at.AR();
    c.xh().b(this);
    com.tencent.mm.plugin.profile.a.hnI.pr();
    GMTrace.o(6726858309632L, 50119);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6727126745088L, 50121);
    GMTrace.o(6727126745088L, 50121);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6726321438720L, 50115);
    w.d("MicroMsg.ContactWidgetVoiceInput", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6726321438720L, 50115);
      return false;
    }
    if (paramString.equals("contact_info_voiceinput_install"))
    {
      f(this.context, true);
      GMTrace.o(6726321438720L, 50115);
      return true;
    }
    if (paramString.equals("contact_info_voiceinput_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6733569196032L, 50169);
          n.f(n.this.context, false);
          GMTrace.o(6733569196032L, 50169);
        }
      }, null);
      GMTrace.o(6726321438720L, 50115);
      return true;
    }
    w.e("MicroMsg.ContactWidgetVoiceInput", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6726321438720L, 50115);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */