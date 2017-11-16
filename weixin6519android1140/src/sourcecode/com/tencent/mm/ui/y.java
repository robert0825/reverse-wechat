package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.a.d.b;
import com.tencent.mm.ao.n;
import com.tencent.mm.bc.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.c;
import com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference;
import com.tencent.mm.s.a.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.preference.i;
import com.tencent.mm.ui.contact.AddressUI;
import com.tencent.mm.ui.tools.s;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.UUID;

public class y
  extends a
  implements m.b
{
  public f htU;
  private a.a oKw;
  
  public y()
  {
    GMTrace.i(1593432866816L, 11872);
    this.oKw = new a.a()
    {
      public final void a(w.a paramAnonymousa)
      {
        GMTrace.i(1854217912320L, 13815);
        if (paramAnonymousa == w.a.vqU) {
          y.this.bYb();
        }
        for (;;)
        {
          y.this.htU.notifyDataSetChanged();
          GMTrace.o(1854217912320L, 13815);
          return;
          if (paramAnonymousa == w.a.vqV) {
            y.this.bYb();
          } else if (paramAnonymousa == w.a.vyO) {
            y.this.bYf();
          }
        }
      }
      
      public final void eJ(int paramAnonymousInt)
      {
        GMTrace.i(1853949476864L, 13813);
        if ((paramAnonymousInt == 262145) || (paramAnonymousInt == 266260) || (paramAnonymousInt == 262157) || (paramAnonymousInt == 266267) || (paramAnonymousInt == 262158))
        {
          y.this.bYc();
          y.this.bem();
        }
        for (;;)
        {
          y.this.htU.notifyDataSetChanged();
          GMTrace.o(1853949476864L, 13813);
          return;
          if (paramAnonymousInt == 262147) {
            y.this.bYd();
          } else if (paramAnonymousInt == 262156) {
            y.this.bYf();
          } else if (paramAnonymousInt == 262152) {
            y.this.bYb();
          }
        }
      }
      
      public final void eK(int paramAnonymousInt)
      {
        GMTrace.i(1854083694592L, 13814);
        GMTrace.o(1854083694592L, 13814);
      }
    };
    GMTrace.o(1593432866816L, 11872);
  }
  
  private void bYe()
  {
    GMTrace.i(1595043479552L, 11884);
    boolean bool = q.zN();
    w.d("MicroMsg.MoreTabUI", "wallet status: is open" + bool);
    f localf = this.htU;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      localf.bc("settings_mm_wallet", bool);
      this.wky.notifyDataSetChanged();
      GMTrace.o(1595043479552L, 11884);
      return;
    }
  }
  
  public final int QI()
  {
    GMTrace.i(1593701302272L, 11874);
    int i = R.o.eoY;
    GMTrace.o(1593701302272L, 11874);
    return i;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(1595311915008L, 11886);
    int i = com.tencent.mm.platformtools.t.aG(paramObject);
    w.d("MicroMsg.MoreTabUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    at.AR();
    if ((paramm != com.tencent.mm.y.c.xh()) || (i <= 0))
    {
      w.e("MicroMsg.MoreTabUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      GMTrace.o(1595311915008L, 11886);
      return;
    }
    if ((204817 == i) || (204820 == i))
    {
      bYf();
      GMTrace.o(1595311915008L, 11886);
      return;
    }
    if (40 == i)
    {
      bYe();
      GMTrace.o(1595311915008L, 11886);
      return;
    }
    if ("208899".equals(Integer.valueOf(paramInt))) {
      bYd();
    }
    GMTrace.o(1595311915008L, 11886);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(1594372390912L, 11879);
    if (paramPreference.hiu.equals("more_tab_setting_personal_info"))
    {
      paramf = new Intent();
      d.b(this.vKB.vKW, "setting", ".ui.setting.SettingsPersonalInfoUI", paramf);
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("settings_my_address"))
    {
      paramf = new Intent(this.vKB.vKW, AddressUI.class);
      paramf.putExtra("Contact_GroupFilter_Type", "@biz.contact");
      startActivity(paramf);
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("settings_my_add_contact"))
    {
      d.b(this.vKB.vKW, "subapp", ".ui.pluginapp.AddMoreFriendsUI", new Intent());
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    boolean bool1;
    int i;
    if (paramPreference.hiu.equals("settings_mm_wallet"))
    {
      bool1 = com.tencent.mm.s.c.vK().aD(262156, 266248);
      boolean bool2 = com.tencent.mm.s.c.vK().aE(262156, 266248);
      com.tencent.mm.plugin.report.service.g.ork.A(10958, "9");
      paramf = com.tencent.mm.plugin.report.service.g.ork;
      if ((bool1) || (bool2)) {}
      for (i = 1;; i = 0)
      {
        paramf.i(13341, new Object[] { Integer.valueOf(i) });
        paramf = UUID.randomUUID().toString();
        com.tencent.mm.plugin.report.service.g.ork.i(14419, new Object[] { paramf, Integer.valueOf(0) });
        paramPreference = new ne();
        paramPreference.eSl.context = this.vKB.vKW;
        Intent localIntent = new Intent();
        localIntent.putExtra("key_wallet_has_red", bool2);
        localIntent.putExtra("key_uuid", paramf);
        paramPreference.eSl.intent = localIntent;
        com.tencent.mm.sdk.b.a.vgX.m(paramPreference);
        com.tencent.mm.s.c.vK().aF(262156, 266248);
        com.tencent.mm.s.c.vK().c(w.a.vyO, w.a.vyQ);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vyA, "");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vyB, Integer.valueOf(-1));
        GMTrace.o(1594372390912L, 11879);
        return true;
      }
    }
    if (paramPreference.hiu.equals("settings_mm_cardpackage"))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vra, "");
      paramf = new Intent();
      paramf.putExtra("key_from_scene", 22);
      d.b(this.vKB.vKW, "card", ".ui.CardHomePageUI", paramf);
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("settings_my_album"))
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.u.fo(this.vKB.vKW);
        GMTrace.o(1594372390912L, 11879);
        return true;
      }
      at.AR();
      paramf = (String)com.tencent.mm.y.c.xh().get(2, null);
      paramPreference = new Intent();
      paramPreference.putExtra("sns_userName", paramf);
      paramPreference.setFlags(536870912);
      paramPreference.addFlags(67108864);
      at.AR();
      i = com.tencent.mm.platformtools.t.f((Integer)com.tencent.mm.y.c.xh().get(68389, null));
      at.AR();
      com.tencent.mm.y.c.xh().set(68389, Integer.valueOf(i + 1));
      d.b(this.vKB.vKW, "sns", ".ui.SnsUserUI", paramPreference);
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("settings_mm_favorite"))
    {
      com.tencent.mm.plugin.report.service.g.ork.A(10958, "8");
      com.tencent.mm.plugin.report.service.g.ork.i(14103, new Object[] { Integer.valueOf(0) });
      d.x(this.vKB.vKW, "favorite", ".ui.FavoriteIndexUI");
      paramf = new Intent();
      paramf.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      paramf.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
      sendBroadcast(paramf);
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("settings_emoji_store"))
    {
      com.tencent.mm.plugin.report.service.g.ork.A(10958, "7");
      com.tencent.mm.s.c.vK().aF(262147, 266244);
      com.tencent.mm.s.c.vK().aF(262149, 266244);
      paramf = new Intent();
      paramf.putExtra("preceding_scence", 2);
      d.b(this.vKB.vKW, "emoji", ".ui.v2.EmojiStoreV2UI", paramf);
      com.tencent.mm.plugin.report.service.g.ork.i(12065, new Object[] { Integer.valueOf(1) });
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("more_setting"))
    {
      bool1 = com.tencent.mm.s.c.vK().aD(262145, 266242);
      com.tencent.mm.s.c.vK().aF(262145, 266242);
      com.tencent.mm.s.c.vK().aF(262157, 266261);
      com.tencent.mm.s.c.vK().aF(262158, 266264);
      paramPreference = new Intent();
      d.b(this.vKB.vKW, "setting", ".ui.setting.SettingsUI", paramPreference);
      at.AR();
      i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwW, Integer.valueOf(0))).intValue();
      at.AR();
      int j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwX, Integer.valueOf(0))).intValue();
      if ((!bool1) && (i > j))
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vwX, Integer.valueOf(i));
        paramf = (IconPreference)paramf.VG("more_setting");
        if (paramf != null) {
          paramf.Cm(8);
        }
        com.tencent.mm.s.c.vK().aF(266260, 266241);
      }
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    if (paramPreference.hiu.equals("more_uishow"))
    {
      com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.ah.a.a.a.class);
      paramf = this.vKB.vKW;
      new Intent();
      GMTrace.o(1594372390912L, 11879);
      return true;
    }
    GMTrace.o(1594372390912L, 11879);
    return false;
  }
  
  public final boolean aaS()
  {
    GMTrace.i(1593969737728L, 11876);
    GMTrace.o(1593969737728L, 11876);
    return true;
  }
  
  protected final void bVJ()
  {
    GMTrace.i(1595446132736L, 11887);
    this.htU = this.wky;
    GMTrace.o(1595446132736L, 11887);
  }
  
  protected final void bVK()
  {
    GMTrace.i(1595580350464L, 11888);
    this.htU = this.wky;
    at.AR();
    com.tencent.mm.y.c.xh().a(this);
    com.tencent.mm.s.c.vK().a(this.oKw);
    this.htU.bc("more_tab_setting_personal_info", false);
    AccountInfoPreference localAccountInfoPreference = (AccountInfoPreference)this.wky.VG("more_tab_setting_personal_info");
    final Object localObject = q.zF();
    if (com.tencent.mm.platformtools.t.nm((String)localObject))
    {
      localObject = q.zE();
      if (x.Ts((String)localObject))
      {
        localAccountInfoPreference.tCr = null;
        localAccountInfoPreference.userName = q.zE();
        String str = q.zG();
        localObject = str;
        if (com.tencent.mm.platformtools.t.nm(str)) {
          localObject = q.zE();
        }
        localAccountInfoPreference.tCq = com.tencent.mm.pluginsdk.ui.d.h.a(this.vKB.vKW, (CharSequence)localObject);
        ((AccountInfoPreference)this.htU.VG("more_tab_setting_personal_info")).tCt = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16804999069696L, 125207);
            com.tencent.mm.plugin.report.service.g.ork.i(11264, new Object[] { Integer.valueOf(1) });
            y.this.startActivity(new Intent(y.this.vKB.vKW, SelfQRCodeUI.class));
            GMTrace.o(16804999069696L, 125207);
          }
        };
        localObject = (IconPreference)this.htU.VG("settings_my_address");
        if (localObject != null)
        {
          int i = l.ML().Mz();
          if (i <= 0) {
            break label358;
          }
          ((IconPreference)localObject).Ck(0);
          ((IconPreference)localObject).cS(String.valueOf(i), R.g.aYs);
        }
        label206:
        bem();
        bYd();
        bYc();
        if (d.LL("favorite")) {
          break label375;
        }
        this.htU.bc("settings_mm_favorite", true);
        label240:
        bYf();
        bYe();
        bYb();
        if (!com.tencent.mm.kernel.h.xu().g(com.tencent.mm.plugin.ah.a.a.class)) {
          break label391;
        }
        this.htU.bc("more_uishow", false);
      }
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      localObject = findViewById(R.h.bKK);
      if ((localObject != null) && (((View)localObject).getVisibility() != 8)) {
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16855464935424L, 125583);
            localObject.setVisibility(8);
            localObject.startAnimation(AnimationUtils.loadAnimation(y.this.vKB.vKW, R.a.aLt));
            GMTrace.o(16855464935424L, 125583);
          }
        });
      }
      GMTrace.o(1595580350464L, 11888);
      return;
      localAccountInfoPreference.tCr = ((String)localObject);
      break;
      localAccountInfoPreference.tCr = ((String)localObject);
      break;
      label358:
      ((IconPreference)localObject).Ck(8);
      ((IconPreference)localObject).cS("", -1);
      break label206;
      label375:
      this.htU.bc("settings_mm_favorite", false);
      break label240;
      label391:
      this.htU.bc("more_uishow", true);
    }
  }
  
  protected final void bVL()
  {
    GMTrace.i(1595714568192L, 11889);
    GMTrace.o(1595714568192L, 11889);
  }
  
  protected final void bVM()
  {
    GMTrace.i(1595848785920L, 11890);
    com.tencent.mm.s.c.vK().b(this.oKw);
    at.AR();
    com.tencent.mm.y.c.xh().b(this);
    GMTrace.o(1595848785920L, 11890);
  }
  
  protected final void bVN()
  {
    GMTrace.i(1595983003648L, 11891);
    GMTrace.o(1595983003648L, 11891);
  }
  
  protected final void bVO()
  {
    GMTrace.i(1596117221376L, 11892);
    GMTrace.o(1596117221376L, 11892);
  }
  
  public final void bVQ()
  {
    GMTrace.i(1596251439104L, 11893);
    if (this.htU != null) {
      this.htU.removeAll();
    }
    this.mqO.setAdapter(null);
    GMTrace.o(1596251439104L, 11893);
  }
  
  public final void bVR()
  {
    GMTrace.i(1596385656832L, 11894);
    if (this.htU != null)
    {
      this.htU.removeAll();
      this.htU.addPreferencesFromResource(R.o.eoY);
    }
    this.mqO.setAdapter(this.wky);
    GMTrace.o(1596385656832L, 11894);
  }
  
  public final void bVT()
  {
    GMTrace.i(1596519874560L, 11895);
    GMTrace.o(1596519874560L, 11895);
  }
  
  public final void bWN()
  {
    GMTrace.i(1596654092288L, 11896);
    GMTrace.o(1596654092288L, 11896);
  }
  
  public final void bYb()
  {
    GMTrace.i(1594640826368L, 11881);
    Object localObject1 = p.a.tlZ;
    if ((localObject1 == null) || ((!((p.c)localObject1).ajW()) && (!((p.c)localObject1).ajX())) || (!d.LL("card")))
    {
      this.htU.bc("settings_mm_cardpackage", true);
      GMTrace.o(1594640826368L, 11881);
      return;
    }
    if (localObject1 != null) {}
    for (localObject1 = ((p.c)localObject1).ajY();; localObject1 = "")
    {
      boolean bool1 = com.tencent.mm.s.c.vK().aE(262152, 266256);
      boolean bool2 = com.tencent.mm.s.c.vK().aD(262152, 266256);
      boolean bool3 = com.tencent.mm.s.c.vK().a(w.a.vqU, w.a.vqW);
      boolean bool4 = com.tencent.mm.s.c.vK().a(w.a.vqV, w.a.vqX);
      this.htU.bc("settings_mm_cardpackage", false);
      final IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_mm_cardpackage");
      if (localIconPreference == null)
      {
        GMTrace.o(1594640826368L, 11881);
        return;
      }
      localIconPreference.setTitle(R.l.dZk);
      if (bool2)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
        localIconPreference.Cm(8);
        localIconPreference.setSummary(null);
        localIconPreference.T(null);
        localIconPreference.Co(8);
        localIconPreference.cT("", -1);
        localIconPreference.Cl(8);
        GMTrace.o(1594640826368L, 11881);
        return;
      }
      at.AR();
      String str = (String)com.tencent.mm.y.c.xh().get(w.a.vrd, "");
      if ((bool4) && (!TextUtils.isEmpty(str)))
      {
        int i = getResources().getDimensionPixelOffset(R.f.aRh);
        Object localObject2 = new c.a();
        ((c.a)localObject2).gKF = com.tencent.mm.compatible.util.e.ghz;
        n.Je();
        ((c.a)localObject2).gKX = null;
        ((c.a)localObject2).gKE = com.tencent.mm.plugin.card.model.m.tZ(str);
        ((c.a)localObject2).gKC = true;
        ((c.a)localObject2).gKZ = true;
        ((c.a)localObject2).gKA = true;
        ((c.a)localObject2).gKJ = i;
        ((c.a)localObject2).gKI = i;
        localObject2 = ((c.a)localObject2).Jn();
        n.Jd().a(str, localIconPreference.mRV, (com.tencent.mm.ao.a.a.c)localObject2, new com.tencent.mm.ao.a.c.g()
        {
          public final void a(String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
          {
            GMTrace.i(2078898388992L, 15489);
            if (paramAnonymousb.bitmap != null)
            {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(2906484899840L, 21655);
                  y.2.this.vNo.T(this.jLt);
                  y.2.this.vNo.Co(0);
                  GMTrace.o(2906484899840L, 21655);
                }
              });
              GMTrace.o(2078898388992L, 15489);
              return;
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(1703894056960L, 12695);
                y.2.this.vNo.T(null);
                y.2.this.vNo.Co(8);
                GMTrace.o(1703894056960L, 12695);
              }
            });
            GMTrace.o(2078898388992L, 15489);
          }
          
          public final void ku(String paramAnonymousString)
          {
            GMTrace.i(2078764171264L, 15488);
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2077287776256L, 15477);
                y.2.this.vNo.Co(0);
                y.2.this.vNo.Cn(R.g.aYg);
                GMTrace.o(2077287776256L, 15477);
              }
            });
            GMTrace.o(2078764171264L, 15488);
          }
        });
        if (!bool1) {
          break label513;
        }
        localIconPreference.Cm(0);
      }
      for (;;)
      {
        if (bool3)
        {
          localIconPreference.cS("", -1);
          localIconPreference.Ck(8);
          if (bool4)
          {
            localIconPreference.setSummary(null);
            if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
            {
              localIconPreference.X((String)localObject1, -1, getResources().getColor(R.e.aOa));
              localIconPreference.Cl(0);
              GMTrace.o(1594640826368L, 11881);
              return;
              localIconPreference.T(null);
              localIconPreference.Co(8);
              break;
              label513:
              localIconPreference.Cm(8);
              continue;
            }
            localIconPreference.cT("", -1);
            localIconPreference.Cl(8);
            GMTrace.o(1594640826368L, 11881);
            return;
          }
          localIconPreference.cT("", -1);
          localIconPreference.Cl(8);
          if (!com.tencent.mm.platformtools.t.nm((String)localObject1))
          {
            localIconPreference.setSummary((CharSequence)localObject1);
            GMTrace.o(1594640826368L, 11881);
            return;
          }
          localIconPreference.setSummary(null);
          GMTrace.o(1594640826368L, 11881);
          return;
        }
      }
      localIconPreference.Cl(8);
      localIconPreference.Ck(8);
      localIconPreference.setSummary(null);
      GMTrace.o(1594640826368L, 11881);
      return;
    }
  }
  
  public final void bYc()
  {
    GMTrace.i(1594775044096L, 11882);
    this.htU.bc("more_setting", false);
    IconPreference localIconPreference = (IconPreference)this.htU.VG("more_setting");
    if (localIconPreference != null)
    {
      localIconPreference.Cp(8);
      boolean bool = com.tencent.mm.s.c.vK().aD(262145, 266242);
      if (bool)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
        at.AR();
        if (((Integer)com.tencent.mm.y.c.xh().get(9, Integer.valueOf(0))).intValue() != 0)
        {
          if (q.zM()) {
            break label168;
          }
          localIconPreference.setSummary(R.l.dUj);
        }
      }
      for (;;)
      {
        localIconPreference.Cm(8);
        if (!bool) {
          break label179;
        }
        GMTrace.o(1594775044096L, 11882);
        return;
        localIconPreference.Ck(8);
        localIconPreference.cS("", -1);
        break;
        label168:
        localIconPreference.setSummary("");
      }
      label179:
      at.AR();
      int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwW, Integer.valueOf(0))).intValue();
      at.AR();
      int j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwX, Integer.valueOf(0))).intValue();
      if (((((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.welab.a.a.c.class)).bGy()) || (((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.welab.a.a.c.class)).bGz()) || (i > j)) && (!bool))
      {
        localIconPreference.Cm(0);
        localIconPreference.Ck(8);
        localIconPreference.cS("", -1);
        GMTrace.o(1594775044096L, 11882);
        return;
      }
      localIconPreference.Cm(8);
      if (com.tencent.mm.s.c.vK().aE(262157, 266261))
      {
        localIconPreference.Cm(0);
        localIconPreference.Ck(8);
        localIconPreference.cS("", -1);
        GMTrace.o(1594775044096L, 11882);
        return;
      }
      if (com.tencent.mm.s.c.vK().aE(262158, 266264))
      {
        localIconPreference.Cm(0);
        localIconPreference.Ck(8);
        localIconPreference.cS("", -1);
        GMTrace.o(1594775044096L, 11882);
        return;
      }
    }
    GMTrace.o(1594775044096L, 11882);
  }
  
  public final void bYd()
  {
    GMTrace.i(1594909261824L, 11883);
    boolean bool1;
    boolean bool2;
    final IconPreference localIconPreference;
    if (d.LL("emoji"))
    {
      d.bNA();
      this.htU.bc("settings_emoji_store", false);
      bool1 = com.tencent.mm.s.c.vK().aD(262147, 266244);
      bool2 = com.tencent.mm.s.c.vK().aD(262149, 266244);
      localIconPreference = (IconPreference)this.htU.VG("settings_emoji_store");
      if (localIconPreference == null) {
        GMTrace.o(1594909261824L, 11883);
      }
    }
    else
    {
      this.htU.bc("settings_emoji_store", false);
      GMTrace.o(1594909261824L, 11883);
      return;
    }
    if (bool1)
    {
      localIconPreference.Ck(0);
      localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
    }
    while ((bool2) || (bool1))
    {
      at.AR();
      String str = (String)com.tencent.mm.y.c.xh().get(229633, null);
      n.Jd().a(str, localIconPreference.mRV, new com.tencent.mm.ao.a.c.g()
      {
        public final void a(String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
        {
          GMTrace.i(16855196499968L, 125581);
          if ((paramAnonymousb.status == 0) && (paramAnonymousb.bitmap != null))
          {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16854525411328L, 125576);
                y.4.this.vNq.T(this.jLt);
                y.4.this.vNq.Co(0);
                GMTrace.o(16854525411328L, 125576);
              }
            });
            GMTrace.o(16855196499968L, 125581);
            return;
          }
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16851706839040L, 125555);
              y.4.this.vNq.Co(8);
              GMTrace.o(16851706839040L, 125555);
            }
          });
          GMTrace.o(16855196499968L, 125581);
        }
        
        public final void ku(String paramAnonymousString)
        {
          GMTrace.i(16855062282240L, 125580);
          GMTrace.o(16855062282240L, 125580);
        }
      });
      GMTrace.o(1594909261824L, 11883);
      return;
      if (bool2)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(getString(R.l.cTi), R.g.aYs);
      }
      else
      {
        localIconPreference.Ck(8);
        localIconPreference.cS("", -1);
      }
    }
    localIconPreference.Co(8);
    GMTrace.o(1594909261824L, 11883);
  }
  
  public final void bYf()
  {
    GMTrace.i(1595177697280L, 11885);
    at.AR();
    int i = com.tencent.mm.platformtools.t.f((Integer)com.tencent.mm.y.c.xh().get(204820, null));
    at.AR();
    i += com.tencent.mm.platformtools.t.f((Integer)com.tencent.mm.y.c.xh().get(204817, null));
    boolean bool2 = com.tencent.mm.s.c.vK().aD(262156, 266248);
    boolean bool1 = com.tencent.mm.s.c.vK().aE(262156, 266248);
    boolean bool3 = com.tencent.mm.s.c.vK().b(w.a.vyO, w.a.vyQ);
    at.AR();
    String str1 = (String)com.tencent.mm.y.c.xh().get(w.a.vyR, "");
    IconPreference localIconPreference = (IconPreference)this.htU.VG("settings_mm_wallet");
    if (localIconPreference == null)
    {
      GMTrace.o(1595177697280L, 11885);
      return;
    }
    w.d("MicroMsg.MoreTabUI", "isShowNew : " + bool2);
    w.d("MicroMsg.MoreTabUI", "isShowDot : " + bool1);
    at.AR();
    String str2 = (String)com.tencent.mm.y.c.xh().get(w.a.vyA, "");
    at.AR();
    int j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vyB, Integer.valueOf(-1))).intValue();
    if ((bool2) || (bool1))
    {
      at.AR();
      long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vyy, Long.valueOf(-1L))).longValue();
      long l2 = com.tencent.mm.platformtools.t.nn(com.tencent.mm.k.g.ut().getValue("PayWalletRedDotExpire"));
      long l3 = System.currentTimeMillis();
      double d = (l3 - l1) / 8.64E7D;
      w.i("MicroMsg.MoreTabUI", "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(86400000L * l2), Long.valueOf(l3), Double.valueOf(d) });
      if ((l1 > 0L) && (l2 > 0L) && (d >= l2))
      {
        bool2 = false;
        bool1 = false;
        com.tencent.mm.s.c.vK().k(262156, false);
      }
    }
    for (;;)
    {
      w.i("MicroMsg.MoreTabUI", "after check, isShowNew: %s, isShowDot: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      w.d("MicroMsg.MoreTabUI", "bankcardDot : " + bool3);
      if (bool3)
      {
        if (!bg.nm(str1))
        {
          localIconPreference.Cl(0);
          localIconPreference.X(str1, -1, -7566196);
          localIconPreference.lO(true);
          localIconPreference.Cm(8);
          GMTrace.o(1595177697280L, 11885);
          return;
        }
        localIconPreference.cT("", -1);
        localIconPreference.Cl(8);
        localIconPreference.Cm(0);
        GMTrace.o(1595177697280L, 11885);
        return;
      }
      if (bool2)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(getString(R.l.cTH), R.g.aYs);
        localIconPreference.Cm(8);
        GMTrace.o(1595177697280L, 11885);
        return;
      }
      if (i > 99)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(getString(R.l.edI), s.fH(this.vKB.vKW));
        localIconPreference.Cm(8);
        GMTrace.o(1595177697280L, 11885);
        return;
      }
      if (i > 0)
      {
        localIconPreference.Ck(0);
        localIconPreference.cS(String.valueOf(i), s.fH(this.vKB.vKW));
        localIconPreference.Cm(8);
        GMTrace.o(1595177697280L, 11885);
        return;
      }
      if (bool1)
      {
        localIconPreference.cS("", -1);
        localIconPreference.Ck(8);
        localIconPreference.Cm(0);
        GMTrace.o(1595177697280L, 11885);
        return;
      }
      if (j == 1)
      {
        localIconPreference.cS("", -1);
        localIconPreference.Ck(8);
        localIconPreference.Cl(0);
        localIconPreference.lO(true);
        if (!com.tencent.mm.platformtools.t.nm(str2)) {
          localIconPreference.X(str2, -1, Color.parseColor("#888888"));
        }
        localIconPreference.Cp(8);
        GMTrace.o(1595177697280L, 11885);
        return;
      }
      localIconPreference.cS("", -1);
      localIconPreference.Ck(8);
      localIconPreference.Cm(8);
      localIconPreference.Cl(8);
      localIconPreference.cT("", -1);
      GMTrace.o(1595177697280L, 11885);
      return;
    }
  }
  
  public final void bem()
  {
    GMTrace.i(1594506608640L, 11880);
    if (!d.LL("sns"))
    {
      this.htU.bc("settings_my_album", true);
      GMTrace.o(1594506608640L, 11880);
      return;
    }
    this.htU.bc("settings_my_album", false);
    GMTrace.o(1594506608640L, 11880);
  }
  
  public final boolean bmX()
  {
    GMTrace.i(1593835520000L, 11875);
    GMTrace.o(1593835520000L, 11875);
    return false;
  }
  
  public final void onActivityCreated(Bundle paramBundle)
  {
    GMTrace.i(1594238173184L, 11878);
    w.i("MicroMsg.MoreTabUI", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.htU = this.wky;
    this.htU.bc("more_setting", true);
    this.htU.bc("settings_emoji_store", true);
    this.htU.bc("settings_mm_wallet", true);
    this.htU.bc("settings_mm_cardpackage", true);
    this.htU.bc("settings_mm_favorite", true);
    this.htU.bc("settings_my_album", true);
    this.htU.bc("settings_my_address", true);
    this.htU.bc("more_tab_setting_personal_info", true);
    this.htU.bc("more_uishow", true);
    GMTrace.o(1594238173184L, 11878);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1593567084544L, 11873);
    super.onCreate(paramBundle);
    if ((!at.AU()) || (at.wF()))
    {
      w.e("MicroMsg.MoreTabUI", "Create MoreTabUI when accready:%b ishold:%b", new Object[] { Boolean.valueOf(at.AU()), Boolean.valueOf(at.wF()) });
      GMTrace.o(1593567084544L, 11873);
      return;
    }
    GMTrace.o(1593567084544L, 11873);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(1594103955456L, 11877);
    super.onDestroy();
    GMTrace.o(1594103955456L, 11877);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */