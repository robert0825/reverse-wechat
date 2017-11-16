package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import junit.framework.Assert;

public final class a
  implements e, com.tencent.mm.pluginsdk.d.a, m.b
{
  private static boolean nVQ;
  public Context context;
  private boolean eDU;
  public ProgressDialog htG;
  private f htU;
  private x iBi;
  private ProgressDialog jIU;
  private boolean nLx;
  private boolean nVP;
  
  static
  {
    GMTrace.i(5491518341120L, 40915);
    nVQ = false;
    GMTrace.o(5491518341120L, 40915);
  }
  
  public a(Context paramContext)
  {
    GMTrace.i(5489773510656L, 40902);
    if (paramContext != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.context = paramContext;
      GMTrace.o(5489773510656L, 40902);
      return;
    }
  }
  
  private void ahK()
  {
    boolean bool2 = true;
    GMTrace.i(5490176163840L, 40905);
    label50:
    Object localObject;
    int i;
    if ((q.zP() & 0x1) == 0)
    {
      bool1 = true;
      this.eDU = bool1;
      at.AR();
      if (bg.e((Integer)c.xh().get(17, null)) != 1) {
        break label344;
      }
      bool1 = true;
      this.nVP = bool1;
      localObject = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
      ((HelperHeaderPreference)localObject).af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dkn));
      if (!this.eDU) {
        break label349;
      }
      i = 1;
      label112:
      ((HelperHeaderPreference)localObject).lu(i);
      this.htU.bc("contact_info_qqmailhelper_install", this.eDU);
      localObject = this.htU;
      if (this.eDU) {
        break label354;
      }
      bool1 = true;
      label148:
      ((f)localObject).bc("contact_info_qqmailhelper_view", bool1);
      localObject = this.htU;
      if (this.eDU) {
        break label359;
      }
      bool1 = true;
      label173:
      ((f)localObject).bc("contact_info_qqmailhelper_compose", bool1);
      localObject = (CheckBoxPreference)this.htU.VG("contact_info_qqmailhelper_recv_remind");
      if (localObject != null) {
        ((CheckBoxPreference)localObject).sdM = this.nVP;
      }
      localObject = this.htU;
      if (this.eDU) {
        break label364;
      }
      bool1 = true;
      label228:
      ((f)localObject).bc("contact_info_qqmailhelper_recv_remind", bool1);
      localObject = this.htU;
      if ((this.eDU & this.nVP)) {
        break label369;
      }
      bool1 = true;
      label258:
      ((f)localObject).bc("contact_info_qqmailhelper_set_files_view", bool1);
      this.htU.bc("contact_info_qqmailhelper_download_mgr_view", true);
      localObject = this.htU;
      if (this.eDU) {
        break label374;
      }
      bool1 = true;
      label295:
      ((f)localObject).bc("contact_info_qqmailhelper_clear_data", bool1);
      localObject = this.htU;
      if (this.eDU) {
        break label379;
      }
    }
    label344:
    label349:
    label354:
    label359:
    label364:
    label369:
    label374:
    label379:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ((f)localObject).bc("contact_info_qqmailhelper_uninstall", bool1);
      GMTrace.o(5490176163840L, 40905);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label50;
      i = 0;
      break label112;
      bool1 = false;
      break label148;
      bool1 = false;
      break label173;
      bool1 = false;
      break label228;
      bool1 = false;
      break label258;
      bool1 = false;
      break label295;
    }
  }
  
  private boolean gJ(boolean paramBoolean)
  {
    GMTrace.i(5490847252480L, 40910);
    final com.tencent.mm.plugin.qqmail.b.n localn = new com.tencent.mm.plugin.qqmail.b.n(paramBoolean, "");
    if (!nVQ) {
      this.htG = h.a(this.context, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(5487223373824L, 40883);
          at.wS().c(localn);
          GMTrace.o(5487223373824L, 40883);
        }
      });
    }
    at.wS().a(localn, 0);
    GMTrace.o(5490847252480L, 40910);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(5490981470208L, 40911);
    if (paramk.getType() != 24)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetQQMail", "onSceneEnd : unExpected type = " + paramk.getType());
      GMTrace.o(5490981470208L, 40911);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (this.jIU != null)
    {
      this.jIU.dismiss();
      this.jIU = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bool = ((com.tencent.mm.plugin.qqmail.b.n)paramk).eWB;
      at.AR();
      paramString = c.xh();
      if (bool)
      {
        paramInt1 = 1;
        paramString.set(17, Integer.valueOf(paramInt1));
        if ((nVQ) && (bg.bx(this.context)))
        {
          if (bool)
          {
            at.AR();
            c.xh().set(17, Integer.valueOf(1));
          }
          paramInt1 = q.zP();
          if (!bool) {
            break label274;
          }
          paramInt1 &= 0xFFFFFFFE;
        }
      }
      for (;;)
      {
        at.AR();
        c.xh().set(34, Integer.valueOf(paramInt1));
        at.AR();
        c.yJ().b(new com.tencent.mm.av.n("", "", "", "", "", "", "", "", paramInt1, "", ""));
        com.tencent.mm.plugin.qqmail.a.a.hnI.pr();
        if (!bool) {
          com.tencent.mm.plugin.qqmail.b.w.aYG();
        }
        nVQ = false;
        GMTrace.o(5490981470208L, 40911);
        return;
        paramInt1 = 2;
        break;
        label274:
        paramInt1 |= 0x1;
      }
    }
    final boolean bool = ((com.tencent.mm.plugin.qqmail.b.n)paramk).eWB;
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetQQMail", "NetSceneSwitchPushMail fail : errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramInt1 == 4)
    {
      switch (paramInt2)
      {
      default: 
        GMTrace.o(5490981470208L, 40911);
        return;
      case -31: 
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ContactWidgetQQMail", "need second pass");
        paramString = View.inflate(this.context, R.i.cFy, null);
        paramk = (EditText)paramString.findViewById(R.h.cbb);
        h.a(this.context, this.context.getString(R.l.dkl), paramString, new DialogInterface.OnClickListener()
        {
          public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(5488297115648L, 40891);
            paramAnonymousDialogInterface = new com.tencent.mm.plugin.qqmail.b.n(bool, g.n(paramk.getText().toString().trim().getBytes()));
            at.wS().a(paramAnonymousDialogInterface, 0);
            a locala = a.this;
            Context localContext = a.this.context;
            a.this.context.getString(R.l.dkk);
            locala.htG = h.a(localContext, a.this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(5507758686208L, 41036);
                at.wS().c(paramAnonymousDialogInterface);
                GMTrace.o(5507758686208L, 41036);
              }
            });
            GMTrace.o(5488297115648L, 40891);
          }
        });
        GMTrace.o(5490981470208L, 40911);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ContactWidgetQQMail", "onSceneEnd, sys err");
    }
    if (nVQ)
    {
      paramString = this.context;
      if (bool) {
        paramInt1 = R.l.dZW;
      }
    }
    for (paramString = paramString.getString(paramInt1);; paramString = this.context.getString(R.l.cSL))
    {
      Toast.makeText(this.context, paramString, 1).show();
      nVQ = false;
      GMTrace.o(5490981470208L, 40911);
      return;
      paramInt1 = R.l.eab;
      break;
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(5490578817024L, 40908);
    int i = bg.m(paramObject, 0);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetQQMail", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != c.xh()) || (i <= 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetQQMail", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(5490578817024L, 40908);
      return;
    }
    if ((i != 17) && (i != 34) && (i != 7))
    {
      GMTrace.o(5490578817024L, 40908);
      return;
    }
    ahK();
    GMTrace.o(5490578817024L, 40908);
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(5490041946112L, 40904);
    if (paramf != null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      bool1 = bool2;
      if (paramx != null) {
        bool1 = true;
      }
      Assert.assertTrue(bool1);
      Assert.assertTrue(s.fG(paramx.field_username));
      at.AR();
      c.xh().a(this);
      at.wS().a(24, this);
      this.nLx = paramBoolean;
      this.iBi = paramx;
      this.htU = paramf;
      paramf.addPreferencesFromResource(R.o.eoG);
      ahK();
      GMTrace.o(5490041946112L, 40904);
      return true;
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(5490444599296L, 40907);
    at.AR();
    c.xh().b(this);
    at.wS().b(24, this);
    if (this.jIU != null)
    {
      this.jIU.dismiss();
      this.jIU = null;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    GMTrace.o(5490444599296L, 40907);
    return true;
  }
  
  public final void gI(boolean paramBoolean)
  {
    GMTrace.i(5490310381568L, 40906);
    if (paramBoolean) {}
    for (String str = this.context.getString(R.l.dZZ);; str = this.context.getString(R.l.eag))
    {
      Context localContext = this.context;
      this.context.getString(R.l.cUG);
      this.jIU = h.a(localContext, str, true, null);
      nVQ = true;
      gJ(paramBoolean);
      GMTrace.o(5490310381568L, 40906);
      return;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5490713034752L, 40909);
    GMTrace.o(5490713034752L, 40909);
  }
  
  public final boolean tF(String paramString)
  {
    boolean bool1 = false;
    GMTrace.i(5489907728384L, 40903);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ContactWidgetQQMail", "handleEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(5489907728384L, 40903);
      return false;
    }
    if (paramString.equals("contact_info_qqmailhelper_view"))
    {
      paramString = new Intent();
      if (this.nLx)
      {
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        ((Activity)this.context).setResult(-1, paramString);
      }
      for (;;)
      {
        ((Activity)this.context).finish();
        GMTrace.o(5489907728384L, 40903);
        return true;
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        com.tencent.mm.plugin.qqmail.a.a.hnH.e(paramString, this.context);
      }
    }
    if (paramString.equals("contact_info_qqmailhelper_compose"))
    {
      paramString = new Intent(this.context, ComposeUI.class);
      if (this.nLx)
      {
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.addFlags(67108864);
        ((Activity)this.context).setResult(-1, paramString);
      }
      for (;;)
      {
        ((Activity)this.context).finish();
        GMTrace.o(5489907728384L, 40903);
        return true;
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.addFlags(67108864);
        this.context.startActivity(paramString);
      }
    }
    if (paramString.equals("contact_info_qqmailhelper_set_files_view"))
    {
      at.AR();
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(bg.nl((String)c.xh().get(29, null))));
      paramString.putExtra("title", this.context.getString(R.l.dkm));
      paramString.putExtra("zoom", false);
      paramString.putExtra("show_bottom", false);
      paramString.putExtra("showShare", false);
      paramString.putExtra("vertical_scroll", false);
      com.tencent.mm.plugin.qqmail.a.a.hnH.j(paramString, this.context);
      GMTrace.o(5489907728384L, 40903);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_recv_remind"))
    {
      paramString = (CheckBoxPreference)this.htU.VG(paramString);
      boolean bool2 = paramString.isChecked();
      gJ(bool2);
      if (!bool2) {
        bool1 = true;
      }
      paramString.sdM = bool1;
      GMTrace.o(5489907728384L, 40903);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.dja), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5568559316992L, 41489);
          com.tencent.mm.plugin.qqmail.b.w.aYG();
          GMTrace.o(5568559316992L, 41489);
        }
      }, null);
      GMTrace.o(5489907728384L, 40903);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_install"))
    {
      at.AR();
      if (bg.e((Integer)c.xh().get(9, null)) == 0)
      {
        h.b(this.context, R.l.ebn, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(5479170310144L, 40823);
            com.tencent.mm.plugin.qqmail.a.a.hnH.h(null, a.this.context);
            GMTrace.o(5479170310144L, 40823);
          }
        }, null);
        GMTrace.o(5489907728384L, 40903);
        return true;
      }
      gI(true);
      GMTrace.o(5489907728384L, 40903);
      return true;
    }
    if (paramString.equals("contact_info_qqmailhelper_uninstall"))
    {
      h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5489639292928L, 40901);
          a.this.gI(false);
          GMTrace.o(5489639292928L, 40901);
        }
      }, null);
      GMTrace.o(5489907728384L, 40903);
      return true;
    }
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ContactWidgetQQMail", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(5489907728384L, 40903);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */