package com.tencent.mm.plugin.sport.ui.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ad.e, com.tencent.mm.pluginsdk.d.a
{
  public Context context;
  private com.tencent.mm.ui.base.preference.f htU;
  public com.tencent.mm.storage.x iBi;
  private r iBj;
  private CheckBoxPreference qqZ;
  private CheckBoxPreference qra;
  
  public a(Context paramContext)
  {
    GMTrace.i(12540633415680L, 93435);
    this.context = paramContext;
    GMTrace.o(12540633415680L, 93435);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12541438722048L, 93441);
    if ((paramk instanceof com.tencent.mm.pluginsdk.model.n))
    {
      at.wS().b(30, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.Sport.ContactWidgetSport", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString))) {
          Toast.makeText(ab.getContext(), paramString, 1).show();
        }
        if (this.iBj != null) {
          this.iBj.dismiss();
        }
        ahK();
      }
    }
    else
    {
      GMTrace.o(12541438722048L, 93441);
      return;
    }
    Object localObject = ((com.tencent.mm.pluginsdk.model.n)paramk).bJk();
    w.i("MicroMsg.Sport.ContactWidgetSport", "bind fitness contact %s success", new Object[] { localObject });
    at.AR();
    paramk = com.tencent.mm.y.c.yK().TE("gh_43f2581f6fd6");
    if ((paramk == null) || (bg.nm((String)localObject))) {
      w.e("MicroMsg.Sport.ContactWidgetSport", "respUsername == " + (String)localObject + ", contact = " + paramk);
    }
    for (;;)
    {
      paramString = com.tencent.mm.af.x.FG().iC(paramk.field_username);
      com.tencent.mm.af.x.FG().e(paramString);
      at.AR();
      com.tencent.mm.y.c.xh().set(327825, Boolean.valueOf(true));
      break;
      paramString = null;
      if (s.fB(paramk.field_username))
      {
        String str = bg.nl(paramk.field_username);
        paramString = com.tencent.mm.af.f.iK(str);
        if (paramString != null) {
          paramString.field_username = ((String)localObject);
        }
        com.tencent.mm.af.x.FG().iD(str);
        paramk.cr(str);
      }
      paramk.setUsername((String)localObject);
      if ((int)paramk.fTq == 0)
      {
        at.AR();
        com.tencent.mm.y.c.yK().S(paramk);
      }
      if ((int)paramk.fTq <= 0)
      {
        w.e("MicroMsg.Sport.ContactWidgetSport", "addContact : insert contact failed");
      }
      else
      {
        s.p(paramk);
        at.AR();
        localObject = com.tencent.mm.y.c.yK().TE(paramk.field_username);
        if (paramString != null)
        {
          com.tencent.mm.af.x.FG().d(paramString);
        }
        else
        {
          paramString = com.tencent.mm.af.f.iK(((af)localObject).field_username);
          if ((paramString == null) || (paramString.Ez()))
          {
            w.d("MicroMsg.Sport.ContactWidgetSport", "shouldUpdate");
            ak.a.gmX.K(((af)localObject).field_username, "");
            b.hR(((af)localObject).field_username);
          }
          else if (((com.tencent.mm.storage.x)localObject).needUpdate())
          {
            w.d("MicroMsg.Sport.ContactWidgetSport", "update contact, last check time=%d", new Object[] { Integer.valueOf(((af)localObject).fjr) });
            ak.a.gmX.K(((af)localObject).field_username, "");
            b.hR(((af)localObject).field_username);
          }
        }
      }
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, com.tencent.mm.storage.x paramx, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(12540767633408L, 93436);
    this.htU = paramf;
    this.iBi = paramx;
    paramf.addPreferencesFromResource(R.o.eoK);
    this.qqZ = ((CheckBoxPreference)paramf.VG("contact_info_top_sport"));
    this.qra = ((CheckBoxPreference)paramf.VG("contact_info_not_disturb"));
    ahK();
    GMTrace.o(12540767633408L, 93436);
    return true;
  }
  
  public final void ahK()
  {
    GMTrace.i(12541304504320L, 93440);
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.htU.VG("contact_info_header_helper");
    localHelperHeaderPreference.af(this.iBi.field_username, this.iBi.vk(), this.context.getString(R.l.dls));
    if (com.tencent.mm.l.a.eE(this.iBi.field_type))
    {
      localHelperHeaderPreference.lu(1);
      this.htU.bc("contact_info_sport_install", true);
      this.htU.bc("contact_info_sport_uninstall", false);
      this.htU.bc("contact_info_go_to_sport", false);
      this.htU.bc("contact_info_go_to_my_profile", false);
      this.htU.bc("contact_info_invite_friend", false);
      this.htU.bc("contact_info_common_problem", false);
      this.htU.bc("contact_info_record_data", false);
      this.htU.bc("contact_info_privacy_and_notification", false);
      this.htU.bc("contact_info_top_sport", false);
      this.htU.bc("contact_info_not_disturb", false);
      at.AR();
      if (com.tencent.mm.y.c.yP().TV(this.iBi.field_username)) {}
      for (this.qqZ.sdM = true; this.iBi.vc(); this.qqZ.sdM = false)
      {
        this.qra.sdM = true;
        GMTrace.o(12541304504320L, 93440);
        return;
      }
      this.qra.sdM = false;
      GMTrace.o(12541304504320L, 93440);
      return;
    }
    localHelperHeaderPreference.lu(0);
    this.htU.bc("contact_info_sport_install", false);
    this.htU.bc("contact_info_sport_uninstall", true);
    this.htU.bc("contact_info_go_to_sport", true);
    this.htU.bc("contact_info_go_to_my_profile", true);
    this.htU.bc("contact_info_invite_friend", true);
    this.htU.bc("contact_info_common_problem", true);
    this.htU.bc("contact_info_record_data", true);
    this.htU.bc("contact_info_privacy_and_notification", true);
    this.htU.bc("contact_info_top_sport", true);
    this.htU.bc("contact_info_not_disturb", true);
    GMTrace.o(12541304504320L, 93440);
  }
  
  public final boolean ahL()
  {
    GMTrace.i(12540901851136L, 93437);
    GMTrace.o(12540901851136L, 93437);
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12541170286592L, 93439);
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(12541170286592L, 93439);
      return;
      if (paramIntent != null)
      {
        Object localObject = bg.g(paramIntent.getStringExtra("received_card_name").split(","));
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          com.tencent.mm.plugin.messenger.a.d.aOe().l("gh_43f2581f6fd6", str, s.eb(str));
          if (!bg.nm(paramIntent))
          {
            ol localol = new ol();
            localol.eTx.eTy = str;
            localol.eTx.content = paramIntent;
            localol.eTx.type = s.go(str);
            localol.eTx.flags = 0;
            com.tencent.mm.sdk.b.a.vgX.m(localol);
          }
        }
      }
    }
  }
  
  public final boolean tF(String paramString)
  {
    GMTrace.i(12541036068864L, 93438);
    if ("contact_info_record_data".equals(paramString))
    {
      paramString = new Intent(this.context, ExdeviceRankDataSourceUI.class);
      this.context.startActivity(paramString);
    }
    for (;;)
    {
      GMTrace.o(12541036068864L, 93438);
      return false;
      if ("contact_info_top_sport".equals(paramString))
      {
        if (this.qqZ.isChecked())
        {
          com.tencent.mm.plugin.sport.b.d.nU(20);
          s.n(this.iBi.field_username, true);
        }
        else
        {
          com.tencent.mm.plugin.sport.b.d.nU(21);
          s.o(this.iBi.field_username, true);
        }
      }
      else if ("contact_info_not_disturb".equals(paramString))
      {
        if (this.qra.isChecked())
        {
          com.tencent.mm.plugin.sport.b.d.nU(22);
          s.n(this.iBi);
        }
        else
        {
          com.tencent.mm.plugin.sport.b.d.nU(23);
          s.o(this.iBi);
        }
      }
      else if ("contact_info_go_to_sport".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("Chat_User", this.iBi.field_username);
        paramString.putExtra("finish_direct", true);
        com.tencent.mm.bj.d.a(this.context, ".ui.chatting.En_5b8fbb1e", paramString);
        com.tencent.mm.plugin.sport.b.d.nU(19);
      }
      else
      {
        Object localObject;
        if ("contact_info_go_to_my_profile".equals(paramString))
        {
          paramString = q.zE();
          if (bg.nm(paramString))
          {
            w.e("MicroMsg.Sport.ContactWidgetSport", "Get username from UserInfo return null or nil.");
            GMTrace.o(12541036068864L, 93438);
            return false;
          }
          localObject = new Intent();
          ((Intent)localObject).putExtra("username", paramString);
          com.tencent.mm.bj.d.b(this.context, "exdevice", ".ui.ExdeviceProfileUI", (Intent)localObject);
          com.tencent.mm.plugin.sport.b.d.nU(3);
        }
        else if ("contact_info_invite_friend".equals(paramString))
        {
          paramString = new Intent();
          paramString.putExtra("Select_Talker_Name", this.iBi.field_username);
          paramString.putExtra("Select_block_List", this.iBi.field_username);
          paramString.putExtra("Select_Conv_Type", 3);
          paramString.putExtra("Select_Send_Card", true);
          paramString.putExtra("mutil_select_is_ret", true);
          com.tencent.mm.bj.d.a(this.context, ".ui.transmit.SelectConversationUI", paramString, 1);
          com.tencent.mm.plugin.sport.b.d.nU(4);
        }
        else if ("contact_info_common_problem".equals(paramString))
        {
          paramString = new Intent();
          paramString.putExtra("KPublisherId", "custom_menu");
          paramString.putExtra("pre_username", this.iBi.field_username);
          paramString.putExtra("prePublishId", "custom_menu");
          paramString.putExtra("preUsername", this.iBi.field_username);
          paramString.putExtra("preChatName", this.iBi.field_username);
          paramString.putExtra("preChatTYPE", com.tencent.mm.y.t.H(this.iBi.field_username, this.iBi.field_username));
          paramString.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
          paramString.putExtra("geta8key_username", this.iBi.field_username);
          paramString.putExtra("from_scence", 1);
          com.tencent.mm.bj.d.b(this.context, "webview", ".ui.tools.WebViewUI", paramString);
          com.tencent.mm.plugin.sport.b.d.nU(5);
        }
        else if ("contact_info_privacy_and_notification".equals(paramString))
        {
          com.tencent.mm.bj.d.x(this.context, "exdevice", ".ui.ExdeviceSettingUI");
        }
        else if ("contact_info_sport_install".equals(paramString))
        {
          com.tencent.mm.plugin.sport.b.d.nU(13);
          paramString = this.context;
          this.context.getString(R.l.cUG);
          this.iBj = com.tencent.mm.ui.base.h.a(paramString, this.context.getString(R.l.dZZ), true, null);
          this.iBj.show();
          at.wS().a(30, this);
          paramString = new LinkedList();
          paramString.add("gh_43f2581f6fd6");
          localObject = new LinkedList();
          ((LinkedList)localObject).add(Integer.valueOf(1));
          paramString = new com.tencent.mm.pluginsdk.model.n(1, paramString, (List)localObject, "", "");
          at.wS().a(paramString, 0);
        }
        else if ("contact_info_sport_uninstall".equals(paramString))
        {
          com.tencent.mm.plugin.sport.b.d.nU(14);
          com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.eac), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(12540230762496L, 93432);
              paramAnonymousDialogInterface = com.tencent.mm.af.f.iK(a.this.iBi.field_username);
              ((g)com.tencent.mm.kernel.h.h(g.class)).a(paramAnonymousDialogInterface, (Activity)a.this.context, a.this.iBi);
              a.this.ahK();
              GMTrace.o(12540230762496L, 93432);
            }
          }, null);
        }
        else if ("contact_info_clear_data".equals(paramString))
        {
          com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.diY), "", this.context.getString(R.l.cSl), this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(12540499197952L, 93434);
              com.tencent.mm.plugin.sport.b.d.nU(25);
              at.AR();
              com.tencent.mm.y.c.yM().Cg("gh_43f2581f6fd6");
              GMTrace.o(12540499197952L, 93434);
            }
          }, null);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */