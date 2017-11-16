package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.atw;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
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
import junit.framework.Assert;

public final class i
  implements com.tencent.mm.pluginsdk.d.a, m.b
{
  public Context context;
  private f htU;
  private x iBi;
  private HelperHeaderPreference.a nNe;
  
  public i(Context paramContext)
  {
    GMTrace.i(6774102949888L, 50471);
    this.context = paramContext;
    this.nNe = new r(paramContext);
    GMTrace.o(6774102949888L, 50471);
  }
  
  private void ahK()
  {
    GMTrace.i(6774505603072L, 50474);
    if ((q.zP() & 0x1000000) == 0) {}
    for (int i = 1;; i = 0)
    {
      this.htU.removeAll();
      this.htU.addPreferencesFromResource(R.o.eoA);
      ((HelperHeaderPreference)this.htU.VG("contact_info_header_helper")).a(this.iBi, this.nNe);
      if (i == 0) {
        break;
      }
      this.htU.bc("contact_info_linkedin_account", false);
      this.htU.VH("contact_info_linkedin_install");
      GMTrace.o(6774505603072L, 50474);
      return;
    }
    this.htU.bc("contact_info_linkedin_account", true);
    this.htU.VH("contact_info_linkedin_uninstall");
    GMTrace.o(6774505603072L, 50474);
  }
  
  public static void f(Context paramContext, final boolean paramBoolean)
  {
    GMTrace.i(6774639820800L, 50475);
    if (paramBoolean) {}
    for (String str = paramContext.getString(R.l.dZZ);; str = paramContext.getString(R.l.eag))
    {
      paramContext.getString(R.l.cUG);
      new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(6815307792384L, 50778);
          if (this.kcQ != null) {
            this.kcQ.dismiss();
          }
          int i = q.zP();
          atw localatw;
          if (paramBoolean)
          {
            i &= 0xFEFFFFFF;
            at.AR();
            c.xh().set(34, Integer.valueOf(i));
            localatw = new atw();
            localatw.tOv = 16777216;
            if (!paramBoolean) {
              break label180;
            }
          }
          label180:
          for (i = 0;; i = 1)
          {
            localatw.uJr = i;
            at.AR();
            c.yJ().b(new e.a(39, localatw));
            if (this.jqM != null) {
              this.jqM.a(null, null);
            }
            GMTrace.o(6815307792384L, 50778);
            return false;
            i |= 0x1000000;
            at.AR();
            c.xh().set(286722, "");
            at.AR();
            c.xh().set(286721, "");
            at.AR();
            c.xh().set(286723, "");
            break;
          }
        }
      }, false).z(1500L, 1500L);
      GMTrace.o(6774639820800L, 50475);
      return;
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(6775042473984L, 50478);
    if ((paramObject instanceof Integer))
    {
      paramInt = ((Integer)paramObject).intValue();
      if ((paramInt == 40) || (paramInt == 34)) {
        ahK();
      }
    }
    GMTrace.o(6775042473984L, 50478);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(6774371385344L, 50473);
    if (paramf != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      paramBoolean = bool;
      if (paramx != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      Assert.assertTrue(s.fX(paramx.field_username));
      at.AR();
      c.xh().a(this);
      this.iBi = paramx;
      this.htU = paramf;
      ahK();
      GMTrace.o(6774371385344L, 50473);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6774774038528L, 50476);
    at.AR();
    c.xh().b(this);
    this.htU.VG("contact_info_header_helper");
    com.tencent.mm.plugin.profile.a.hnI.pr();
    GMTrace.o(6774774038528L, 50476);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6774908256256L, 50477);
    if ((paramInt1 == 1) && (paramInt2 == -1)) {
      ahK();
    }
    GMTrace.o(6774908256256L, 50477);
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(6774237167616L, 50472);
    w.d("MicroMsg.ContactWidgetLinkedIn", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6774237167616L, 50472);
      return false;
    }
    if (paramString.equals("contact_info_linkedin_install"))
    {
      f(this.context, true);
      GMTrace.o(6774237167616L, 50472);
      return true;
    }
    if (paramString.equals("contact_info_linkedin_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6769136893952L, 50434);
          i.f(i.this.context, false);
          GMTrace.o(6769136893952L, 50434);
        }
      }, null);
      GMTrace.o(6774237167616L, 50472);
      return true;
    }
    if (paramString.equals("contact_info_linkedin_account")) {
      com.tencent.mm.bj.d.b(this.context, "accountsync", "com.tencent.mm.ui.bindlinkedin.BindLinkedInUI", 1);
    }
    w.e("MicroMsg.ContactWidgetLinkedIn", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6774237167616L, 50472);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */