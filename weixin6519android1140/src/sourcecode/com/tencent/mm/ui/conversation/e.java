package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.bizchat.BizChatConversationUI;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import junit.framework.Assert;

public final class e
  implements AdapterView.OnItemClickListener
{
  private Activity activity;
  private ListView wVF;
  private g wWm;
  
  public e(g paramg, ListView paramListView, Activity paramActivity)
  {
    GMTrace.i(14482092851200L, 107900);
    this.wWm = paramg;
    this.wVF = paramListView;
    this.activity = paramActivity;
    GMTrace.o(14482092851200L, 107900);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(14482227068928L, 107901);
    if (paramInt < this.wVF.getHeaderViewsCount())
    {
      GMTrace.o(14482227068928L, 107901);
      return;
    }
    paramInt -= this.wVF.getHeaderViewsCount();
    paramAdapterView = (ae)this.wWm.AH(paramInt);
    if (paramAdapterView == null)
    {
      w.e("MicroMsg.ConversationClickListener", "null user at position = " + paramInt);
      GMTrace.o(14482227068928L, 107901);
      return;
    }
    if (paramAdapterView.eH(16777216))
    {
      paramAdapterView.vo();
      at.AR();
      c.yP().a(paramAdapterView, paramAdapterView.field_username);
    }
    if (s.fI(paramAdapterView.field_username)) {
      if (q.zW())
      {
        d.x(this.activity, "tmessage", ".ui.TConversationUI");
        paramInt = 0;
        if (paramInt != 0)
        {
          com.tencent.mm.plugin.report.service.f.tp(9);
          paramView = (LauncherUI)this.activity;
          if (paramView == null) {
            break label1094;
          }
        }
      }
    }
    label1089:
    label1094:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("Launcher should not be empty.", bool);
      paramView.a(paramAdapterView.field_username, null, true);
      GMTrace.o(14482227068928L, 107901);
      return;
      d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
      paramInt = 0;
      break;
      if (s.fJ(paramAdapterView.field_username))
      {
        if (q.zV())
        {
          d.x(this.activity, "bottle", ".ui.BottleConversationUI");
          paramInt = 0;
          break;
        }
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        break;
      }
      if (s.fO(paramAdapterView.field_username))
      {
        MMAppMgr.cancelNotification(paramAdapterView.field_username);
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        break;
      }
      if (s.fG(paramAdapterView.field_username))
      {
        com.tencent.mm.kernel.h.xz();
        if (bg.e((Integer)com.tencent.mm.kernel.h.xy().xh().get(17, null)) == 1) {}
        for (paramInt = 1;; paramInt = 0)
        {
          if (paramInt != 0) {
            break label1089;
          }
          d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          paramInt = 0;
          break;
        }
      }
      if (s.fT(paramAdapterView.field_username))
      {
        if (q.Ab())
        {
          paramView = new Intent();
          paramView.addFlags(67108864);
          paramView.putExtra("type", 20);
          d.b(this.activity, "readerapp", ".ui.ReaderAppUI", paramView);
          paramInt = 0;
          break;
        }
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        break;
      }
      if (s.gb(paramAdapterView.field_username))
      {
        if (q.Ac())
        {
          paramView = new Intent();
          paramView.addFlags(67108864);
          paramView.putExtra("type", 11);
          d.b(this.activity, "readerapp", ".ui.ReaderAppUI", paramView);
          paramInt = 0;
          break;
        }
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        break;
      }
      if (s.fL(paramAdapterView.field_username))
      {
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        break;
      }
      if (s.fM(paramAdapterView.field_username))
      {
        if (q.Ae())
        {
          paramView = new Intent().addFlags(67108864);
          d.b(this.activity, "masssend", ".ui.MassSendHistoryUI", paramView);
          paramInt = 0;
          break;
        }
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        paramInt = 0;
        break;
      }
      if (s.ga(paramAdapterView.field_username))
      {
        if (ak.a.gna != null) {
          ak.a.gna.gK(paramAdapterView.field_username);
        }
        paramInt = 1;
        break;
      }
      if (s.gc(paramAdapterView.field_username))
      {
        this.activity.startActivity(new Intent(this.activity, BizConversationUI.class));
        paramInt = 0;
        break;
      }
      if ((s.fD(paramAdapterView.field_username)) && (com.tencent.mm.af.f.iP(paramAdapterView.field_username)))
      {
        if (!s.fC(paramAdapterView.field_username))
        {
          com.tencent.mm.ui.base.h.bm(this.activity, this.activity.getString(R.l.dqh));
          GMTrace.o(14482227068928L, 107901);
          return;
        }
        paramView = new Intent(this.activity, EnterpriseConversationUI.class);
        paramView.putExtra("enterprise_biz_name", paramAdapterView.field_username);
        paramView.putExtra("enterprise_biz_display_name", r.fs(paramAdapterView.field_username));
        paramView.putExtra("enterprise_from_scene", 1);
        this.activity.startActivity(paramView);
        paramInt = 0;
        break;
      }
      if ((s.fD(paramAdapterView.field_username)) && (com.tencent.mm.af.f.dL(paramAdapterView.field_username)))
      {
        if (!s.fC(paramAdapterView.field_username))
        {
          com.tencent.mm.ui.base.h.bm(this.activity, this.activity.getString(R.l.dqh));
          GMTrace.o(14482227068928L, 107901);
          return;
        }
        paramView = new Intent(this.activity, BizChatConversationUI.class);
        paramView.putExtra("Contact_User", paramAdapterView.field_username);
        paramView.putExtra("biz_chat_from_scene", 1);
        paramView.addFlags(67108864);
        this.activity.startActivity(paramView);
        paramInt = 0;
        break;
      }
      if (s.gl(paramAdapterView.field_username))
      {
        paramView = new Intent();
        paramView.setClassName(this.activity, "com.tencent.mm.ui.conversation.AppBrandServiceConversationUI");
        paramView.putExtra("Contact_User", paramAdapterView.field_username);
        paramView.putExtra("app_brand_conversation_from_scene", 1);
        paramView.addFlags(67108864);
        this.activity.startActivity(paramView);
        paramInt = 0;
        break;
      }
      paramInt = 1;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */