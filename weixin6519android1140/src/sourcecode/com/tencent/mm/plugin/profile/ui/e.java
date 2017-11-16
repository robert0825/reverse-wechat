package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ap.b;
import com.tencent.mm.av.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import junit.framework.Assert;

public final class e
  implements com.tencent.mm.pluginsdk.d.a
{
  Context context;
  public r hsU;
  private f htU;
  private x iBi;
  public boolean jqh;
  private boolean nLx;
  private HelperHeaderPreference.a nMW;
  private int status;
  
  public e(Context paramContext)
  {
    GMTrace.i(6734240284672L, 50174);
    this.hsU = null;
    this.jqh = false;
    this.context = paramContext;
    this.nMW = new o(paramContext);
    this.status = -1;
    GMTrace.o(6734240284672L, 50174);
  }
  
  private void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(6734508720128L, 50176);
    w.d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      at.AR();
      c.xh().set(7, Integer.valueOf(this.status));
      if (!paramBoolean) {
        break label131;
      }
    }
    label131:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      at.AR();
      c.yJ().b(new g(paramInt2, paramInt1));
      GMTrace.o(6734508720128L, 50176);
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }
  
  private boolean sJ(int paramInt)
  {
    GMTrace.i(6734777155584L, 50178);
    if ((this.status & paramInt) != 0)
    {
      GMTrace.o(6734777155584L, 50178);
      return true;
    }
    GMTrace.o(6734777155584L, 50178);
    return false;
  }
  
  public final boolean a(f paramf, x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6734642937856L, 50177);
    boolean bool;
    label27:
    CheckBoxPreference localCheckBoxPreference1;
    CheckBoxPreference localCheckBoxPreference2;
    CheckBoxPreference localCheckBoxPreference3;
    if (paramf != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramx == null) {
        break label364;
      }
      bool = true;
      Assert.assertTrue(bool);
      Assert.assertTrue(s.fH(paramx.field_username));
      this.htU = paramf;
      this.nLx = paramBoolean;
      this.iBi = paramx;
      if (this.status == -1) {
        this.status = q.zI();
      }
      paramf.addPreferencesFromResource(R.o.eoy);
      localCheckBoxPreference1 = (CheckBoxPreference)paramf.VG("contact_info_recommend_qqfriends_to_me");
      localCheckBoxPreference2 = (CheckBoxPreference)paramf.VG("contact_info_recommend_mobilefriends_to_me");
      localCheckBoxPreference3 = (CheckBoxPreference)paramf.VG("contact_info_recommend_fbfriends_to_me");
      if (sJ(256)) {
        break label370;
      }
      paramBoolean = true;
      label132:
      localCheckBoxPreference2.sdM = paramBoolean;
      if (sJ(128)) {
        break label375;
      }
      paramBoolean = true;
      label150:
      localCheckBoxPreference1.sdM = paramBoolean;
      if ((q.zK() & 0x4) == 0) {
        break label380;
      }
      paramBoolean = true;
      label166:
      localCheckBoxPreference3.sdM = paramBoolean;
      ((HelperHeaderPreference)paramf.VG("contact_info_header_helper")).a(paramx, this.nMW);
      at.AR();
      if (bg.e((Integer)c.xh().get(9, null)) == 0) {
        break label385;
      }
      paramInt = 1;
      label216:
      if (paramInt == 0) {
        break label391;
      }
      paramf.c(paramf.VG("contact_info_bind_qq_entry"));
      paramf.c(paramf.VG("contact_info_bind_qq_entry_tip"));
      label251:
      if (com.tencent.mm.modelfriend.m.Ho() != m.a.gDm) {
        break label439;
      }
      paramInt = 1;
      label263:
      if (paramInt == 0) {
        break label445;
      }
      paramf.c(paramf.VG("contact_info_bind_mobile_entry"));
      paramf.c(paramf.VG("contact_info_bind_mobile_entry_tip"));
      label298:
      if ((q.zP() & 0x2000) != 0) {
        break label471;
      }
      paramInt = 1;
      label311:
      if (paramInt == 0) {
        break label495;
      }
      paramBoolean = q.Af();
      paramf.c(localCheckBoxPreference3);
      if (paramBoolean) {
        break label477;
      }
      paramf.VG("contact_info_bind_fb_entry").setSummary(R.l.dYA);
    }
    for (;;)
    {
      GMTrace.o(6734642937856L, 50177);
      return true;
      bool = false;
      break;
      label364:
      bool = false;
      break label27;
      label370:
      paramBoolean = false;
      break label132;
      label375:
      paramBoolean = false;
      break label150;
      label380:
      paramBoolean = false;
      break label166;
      label385:
      paramInt = 0;
      break label216;
      label391:
      paramf.c(localCheckBoxPreference1);
      if (b.Ju()) {
        break label251;
      }
      paramf.c(paramf.VG("contact_info_bind_qq_entry"));
      paramf.c(paramf.VG("contact_info_bind_qq_entry_tip"));
      break label251;
      label439:
      paramInt = 0;
      break label263;
      label445:
      paramf.c(localCheckBoxPreference2);
      paramf.VG("contact_info_bind_mobile_entry").setSummary(R.l.dYA);
      break label298;
      label471:
      paramInt = 0;
      break label311;
      label477:
      paramf.VG("contact_info_bind_fb_entry").setSummary(R.l.djl);
      continue;
      label495:
      paramf.c(paramf.VG("contact_info_bind_fb_entry"));
      paramf.c(paramf.VG("contact_info_bind_fb_entry_tip"));
      paramf.c(localCheckBoxPreference3);
    }
  }
  
  public final boolean ahL()
  {
    GMTrace.i(6734911373312L, 50179);
    com.tencent.mm.plugin.profile.a.hnI.pr();
    this.htU.VG("contact_info_header_helper");
    GMTrace.o(6734911373312L, 50179);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6735045591040L, 50180);
    GMTrace.o(6735045591040L, 50180);
  }
  
  public final boolean tF(String paramString)
  {
    boolean bool = false;
    GMTrace.i(6734374502400L, 50175);
    w.d("MicroMsg.ContactWidgetFMessage", "handlerEvent : key = " + paramString);
    if (bg.nl(paramString).length() <= 0)
    {
      GMTrace.o(6734374502400L, 50175);
      return false;
    }
    if (paramString.equals("contact_info_recommend_qqfriends_to_me"))
    {
      if (!((CheckBoxPreference)this.htU.VG("contact_info_recommend_qqfriends_to_me")).isChecked()) {}
      for (bool = true;; bool = false)
      {
        a(bool, 128, 6);
        GMTrace.o(6734374502400L, 50175);
        return true;
      }
    }
    if (paramString.equals("contact_info_recommend_mobilefriends_to_me"))
    {
      if (!((CheckBoxPreference)this.htU.VG("contact_info_recommend_mobilefriends_to_me")).isChecked()) {
        bool = true;
      }
      a(bool, 256, 7);
      GMTrace.o(6734374502400L, 50175);
      return true;
    }
    if (paramString.equals("contact_info_recommend_fbfriends_to_me"))
    {
      bool = ((CheckBoxPreference)this.htU.VG("contact_info_recommend_fbfriends_to_me")).isChecked();
      w.d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + bool + " item value = 4 functionId = 18");
      int i = q.zK();
      if (bool)
      {
        i |= 0x4;
        at.AR();
        c.xh().set(40, Integer.valueOf(i));
        if (!bool) {
          break label292;
        }
      }
      label292:
      for (i = 1;; i = 2)
      {
        at.AR();
        c.yJ().b(new g(18, i));
        GMTrace.o(6734374502400L, 50175);
        return true;
        i &= 0xFFFFFFFB;
        break;
      }
    }
    if (paramString.equals("contact_info_view_message"))
    {
      paramString = new Intent();
      if (this.nLx)
      {
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        ((Activity)this.context).setResult(-1, paramString);
        ((Activity)this.context).finish();
      }
      for (;;)
      {
        GMTrace.o(6734374502400L, 50175);
        return true;
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.putExtra("Chat_Mode", 1);
        paramString.addFlags(67108864);
        com.tencent.mm.plugin.profile.a.hnH.e(paramString, this.context);
        ((Activity)this.context).finish();
      }
    }
    if (paramString.equals("contact_info_bind_mobile_entry"))
    {
      com.tencent.mm.plugin.profile.a.hnH.g(new Intent(), this.context);
      GMTrace.o(6734374502400L, 50175);
      return true;
    }
    if (paramString.equals("contact_info_bind_qq_entry"))
    {
      com.tencent.mm.plugin.profile.a.hnH.h(new Intent(), this.context);
      GMTrace.o(6734374502400L, 50175);
      return true;
    }
    if (paramString.equals("contact_info_bind_fb_entry"))
    {
      com.tencent.mm.bj.d.a(this.context, ".ui.account.FacebookAuthUI", new Intent());
      GMTrace.o(6734374502400L, 50175);
      return true;
    }
    if (paramString.equals("contact_info_fmessage_clear_data"))
    {
      h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6801886019584L, 50678);
          paramAnonymousDialogInterface = e.this;
          paramAnonymousDialogInterface.jqh = false;
          Context localContext = paramAnonymousDialogInterface.context;
          paramAnonymousDialogInterface.context.getString(R.l.cUG);
          paramAnonymousDialogInterface.hsU = h.a(localContext, paramAnonymousDialogInterface.context.getString(R.l.cUV), true, new e.2(paramAnonymousDialogInterface));
          bc.a("fmessage", new e.3(paramAnonymousDialogInterface));
          at.AR();
          c.yP().TN("fmessage");
          GMTrace.o(6801886019584L, 50678);
        }
      }, null);
      GMTrace.o(6734374502400L, 50175);
      return true;
    }
    w.e("MicroMsg.ContactWidgetFMessage", "handleEvent : unExpected key = " + paramString);
    GMTrace.o(6734374502400L, 50175);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */