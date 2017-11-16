package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bh.a;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.w;
import com.tencent.mm.y.a.e;
import com.tencent.mm.y.a.f;
import com.tencent.mm.y.at;
import com.tencent.mm.y.ba;
import com.tencent.mm.y.bb;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;

public final class k
  extends b
{
  protected ba wZT;
  
  public k(Context paramContext, ba paramba)
  {
    super(paramContext);
    GMTrace.i(14498467414016L, 108022);
    this.wZT = null;
    this.wZT = paramba;
    final int i;
    final int j;
    if (this.view != null)
    {
      paramContext = (MMImageView)this.view.findViewById(R.h.bLW);
      paramba = (TextView)this.view.findViewById(R.h.bLX);
      switch (this.wZT.type)
      {
      case 5: 
      default: 
        paramba = this.view;
        i = this.wZT.type;
        j = this.wZT.showType;
        switch (i)
        {
        case 5: 
        default: 
          paramContext = null;
        }
        break;
      }
    }
    for (;;)
    {
      paramba.setOnClickListener(paramContext);
      GMTrace.o(14498467414016L, 108022);
      return;
      paramContext.setImageResource(R.k.cPo);
      paramba.setText(R.l.cYL);
      break;
      paramContext.setImageResource(R.k.cPp);
      paramba.setText(R.l.dvK);
      break;
      paramContext.setImageResource(R.k.cPn);
      paramba.setText(R.l.cYT);
      break;
      paramContext.setImageResource(R.k.cPu);
      paramba.setText(R.l.cYN);
      break;
      paramContext.setImageResource(R.k.cPq);
      paramba.setText(R.l.cYR);
      break;
      paramContext.setImageResource(R.k.cPr);
      paramba.setText(R.l.cYQ);
      break;
      paramContext.setImageResource(R.k.cPs);
      paramba.setText(R.l.cYS);
      break;
      paramContext.setImageResource(R.k.cPt);
      paramba.setText(R.l.cYO);
      break;
      paramContext.setImageResource(R.k.cPm);
      paramba.setText(R.l.cYK);
      break;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14498064760832L, 108019);
          bb.Bc().aK(i, j);
          paramAnonymousView = (Context)k.this.tyb.get();
          if (paramAnonymousView != null)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
            at.AR();
            boolean bool = bg.b((Boolean)com.tencent.mm.y.c.xh().get(4103, null));
            new Intent().putExtra("KEnterFromBanner", true);
            if (!bool)
            {
              com.tencent.mm.bj.d.x(paramAnonymousView, "nearby", ".ui.NearbyFriendsIntroUI");
              GMTrace.o(14498064760832L, 108019);
              return;
            }
            Object localObject = bk.BF();
            if (localObject == null)
            {
              com.tencent.mm.bj.d.x(paramAnonymousView, "nearby", ".ui.NearbyPersonalInfoUI");
              GMTrace.o(14498064760832L, 108019);
              return;
            }
            String str = bg.nl(((bk)localObject).getProvince());
            int i = bg.a(Integer.valueOf(((bk)localObject).fja), 0);
            if ((bg.nm(str)) || (i == 0))
            {
              com.tencent.mm.bj.d.x(paramAnonymousView, "nearby", ".ui.NearbyPersonalInfoUI");
              GMTrace.o(14498064760832L, 108019);
              return;
            }
            localObject = LauncherUI.bXe();
            if (localObject != null) {
              ((LauncherUI)localObject).vJi.vIy.Vi("tab_find_friend");
            }
            a.dA(paramAnonymousView);
          }
          GMTrace.o(14498064760832L, 108019);
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14502493945856L, 108052);
          bb.Bc().aK(i, j);
          paramAnonymousView = (Context)k.this.tyb.get();
          if (paramAnonymousView != null)
          {
            at.AR();
            if (!com.tencent.mm.y.c.isSDCardAvailable())
            {
              u.fo(paramAnonymousView);
              GMTrace.o(14502493945856L, 108052);
              return;
            }
            Intent localIntent = new Intent();
            localIntent.putExtra("intent_set_avatar", true);
            localIntent.putExtra("KEnterFromBanner", true);
            com.tencent.mm.bj.d.b(paramAnonymousView, "setting", ".ui.setting.SettingsPersonalInfoUI", localIntent);
            com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
          }
          GMTrace.o(14502493945856L, 108052);
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14499675373568L, 108031);
          bb.Bc().aK(i, j);
          k.n((Context)k.this.tyb.get(), false);
          GMTrace.o(14499675373568L, 108031);
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14494172446720L, 107990);
          bb.Bc().aK(i, j);
          k.n((Context)k.this.tyb.get(), true);
          GMTrace.o(14494172446720L, 107990);
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14496454148096L, 108007);
          bb.Bc().aK(i, j);
          paramAnonymousView = (Context)k.this.tyb.get();
          Intent localIntent = new Intent();
          localIntent.putExtra("preceding_scence", 17);
          com.tencent.mm.bj.d.b(paramAnonymousView, "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
          com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(10), Integer.valueOf(1) });
          com.tencent.mm.plugin.report.service.g.ork.i(12065, new Object[] { Integer.valueOf(2) });
          GMTrace.o(14496454148096L, 108007);
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14504372994048L, 108066);
          bb.Bc().aK(i, j);
          com.tencent.mm.bj.d.x((Context)k.this.tyb.get(), "game", ".ui.GameCenterUI");
          com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(9), Integer.valueOf(1) });
          GMTrace.o(14504372994048L, 108066);
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14507594219520L, 108090);
          bb.Bc().aK(i, j);
          paramAnonymousView = (Context)k.this.tyb.get();
          int i;
          if ((q.zP() & 0x10000) == 0)
          {
            i = 1;
            if (i == 0) {
              break label101;
            }
            com.tencent.mm.bj.d.x(paramAnonymousView, "masssend", ".ui.MassSendHistoryUI");
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(11), Integer.valueOf(1) });
            GMTrace.o(14507594219520L, 108090);
            return;
            i = 0;
            break;
            label101:
            com.tencent.mm.bj.d.b(paramAnonymousView, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", "masssendapp"));
          }
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14509875920896L, 108107);
          bb.Bc().aK(i, j);
          paramAnonymousView = (Context)k.this.tyb.get();
          at.AR();
          String str = (String)com.tencent.mm.y.c.xh().get(68377, null);
          at.AR();
          com.tencent.mm.y.c.xh().set(68377, "");
          Intent localIntent = new Intent();
          localIntent.putExtra("sns_timeline_NeedFirstLoadint", true);
          if (!bg.nm(str)) {}
          for (boolean bool1 = false;; bool1 = true)
          {
            boolean bool2 = bool1;
            if (n.poQ != null)
            {
              bool2 = bool1;
              if (n.poQ.ME() > 0) {
                bool2 = false;
              }
            }
            localIntent.putExtra("sns_resume_state", bool2);
            com.tencent.mm.bj.d.b(paramAnonymousView, "sns", ".ui.En_424b8e16", localIntent);
            com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(8), Integer.valueOf(1) });
            GMTrace.o(14509875920896L, 108107);
            return;
          }
        }
      };
      continue;
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14498333196288L, 108021);
          bb.Bc().aK(i, j);
          com.tencent.mm.bj.d.b((Context)k.this.tyb.get(), "subapp", ".ui.autoadd.AutoAddFriendUI", new Intent());
          GMTrace.o(14498333196288L, 108021);
        }
      };
    }
  }
  
  public static void n(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(16020630667264L, 119363);
    if (paramContext == null)
    {
      GMTrace.o(16020630667264L, 119363);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, BindMContactIntroUI.class);
    localIntent.putExtra("key_upload_scene", 8);
    localIntent.putExtra("is_bind_for_contact_sync", paramBoolean);
    localIntent.putExtra("KEnterFromBanner", true);
    MMWizardActivity.A(paramContext, localIntent);
    paramContext = com.tencent.mm.y.a.g.BY().hb("4");
    if ((paramContext != null) && (!bg.nm(paramContext.value)) && ((paramContext.value.equals("1")) || (paramContext.value.equals("2"))))
    {
      com.tencent.mm.y.a.g.BY().hb("4").result = "1";
      f.hg("4");
      if (paramContext.value.equals("1"))
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(328195, Boolean.valueOf(true));
        GMTrace.o(16020630667264L, 119363);
        return;
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(328196, Boolean.valueOf(true));
      GMTrace.o(16020630667264L, 119363);
      return;
    }
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
      GMTrace.o(16020630667264L, 119363);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.i(11002, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    GMTrace.o(16020630667264L, 119363);
  }
  
  public final void destroy()
  {
    GMTrace.i(14498735849472L, 108024);
    GMTrace.o(14498735849472L, 108024);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14498601631744L, 108023);
    int i = R.i.cBf;
    GMTrace.o(14498601631744L, 108023);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */