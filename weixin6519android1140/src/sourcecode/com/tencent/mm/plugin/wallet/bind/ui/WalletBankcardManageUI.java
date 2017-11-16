package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.f;
import com.tencent.mm.plugin.wallet_core.model.j;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WalletBankcardManageUI
  extends WalletBaseUI
{
  private ListView Ev;
  private AdapterView.OnItemClickListener RZ;
  private View.OnClickListener hwh;
  public ArrayList<Bankcard> qWC;
  private ArrayList<Bankcard> qWD;
  protected af qWE;
  private ListView qWF;
  private a qWG;
  private a qWH;
  private TextView qWI;
  private View qWJ;
  private View qWK;
  private View qWL;
  private CdnImageView qWM;
  private TextView qWN;
  private j qWO;
  
  public WalletBankcardManageUI()
  {
    GMTrace.i(7678864654336L, 57212);
    this.qWC = new ArrayList();
    this.qWD = new ArrayList();
    this.qWE = null;
    this.Ev = null;
    this.qWF = null;
    this.qWG = null;
    this.qWH = null;
    this.hwh = new View.OnClickListener()
    {
      final int qWR;
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18425409699840L, 137280);
        if (paramAnonymousView.getId() == a.f.sJu)
        {
          com.tencent.mm.wallet_core.ui.e.EQ(19);
          WalletBankcardManageUI.this.bwW();
          g.ork.i(14422, new Object[] { Integer.valueOf(2) });
          GMTrace.o(18425409699840L, 137280);
          return;
        }
        if (paramAnonymousView.getId() == a.f.sJy)
        {
          Object localObject = paramAnonymousView.getTag();
          long l = new Date().getTime();
          paramAnonymousView.setTag(Long.valueOf(l));
          if ((localObject != null) && (l - ((Long)localObject).longValue() < 1000L))
          {
            GMTrace.o(18425409699840L, 137280);
            return;
          }
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", WalletBankcardManageUI.a(WalletBankcardManageUI.this).field_loan_jump_url);
          d.b(WalletBankcardManageUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          h.xz();
          h.xy().xh().a(w.a.vsM, Integer.valueOf(WalletBankcardManageUI.a(WalletBankcardManageUI.this).field_red_dot_index));
          com.tencent.mm.wallet_core.ui.e.EQ(6);
          GMTrace.o(18425409699840L, 137280);
          return;
        }
        if (paramAnonymousView.getId() == a.f.sqi)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://kf.qq.com/touch/product/weixinpay_app.html?platform=15&ADTAG=veda.weixinpay.wenti");
          d.b(WalletBankcardManageUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView);
          g.ork.i(14422, new Object[] { Integer.valueOf(3) });
        }
        GMTrace.o(18425409699840L, 137280);
      }
    };
    this.RZ = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(final AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(18425946570752L, 137284);
        paramAnonymousAdapterView = (Bankcard)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
        com.tencent.mm.wallet_core.ui.e.EQ(18);
        if (paramAnonymousAdapterView != null)
        {
          paramAnonymousView = WalletBankcardManageUI.b(WalletBankcardManageUI.this);
          label58:
          Object localObject;
          if ((paramAnonymousView.qWg == null) || (paramAnonymousView.qWg.isEmpty()))
          {
            break label257;
            if (!paramAnonymousAdapterView.byc()) {
              break label389;
            }
            if (paramAnonymousAdapterView.field_wxcreditState != 0) {
              break label360;
            }
            if ((b.a(paramAnonymousAdapterView)) && (paramAnonymousAdapterView != null))
            {
              h.xz();
              paramAnonymousView = (String)h.xy().xh().get(196659, null);
              localObject = new StringBuilder();
              if (TextUtils.isEmpty(paramAnonymousView)) {
                break label347;
              }
              ((StringBuilder)localObject).append(paramAnonymousView);
              ((StringBuilder)localObject).append("&");
              ((StringBuilder)localObject).append(paramAnonymousAdapterView.field_bankcardType);
              label144:
              h.xz();
              h.xy().xh().set(196659, ((StringBuilder)localObject).toString());
            }
            paramAnonymousView = new Bundle();
            paramAnonymousView.putParcelable("key_bankcard", paramAnonymousAdapterView);
            paramAnonymousView.putString("key_bank_username", paramAnonymousAdapterView.field_bizUsername);
            paramAnonymousView.putString("key_bank_type", paramAnonymousAdapterView.field_bankcardType);
            com.tencent.mm.wallet_core.a.a(WalletBankcardManageUI.this, "WXCreditOpenProcess", paramAnonymousView, null);
          }
          for (;;)
          {
            g.ork.i(14422, new Object[] { Integer.valueOf(1), paramAnonymousAdapterView.field_bankcardType });
            GMTrace.o(18425946570752L, 137284);
            return;
            localObject = paramAnonymousView.qWg.iterator();
            label257:
            if (!((Iterator)localObject).hasNext()) {
              break label58;
            }
            String str = (String)((Iterator)localObject).next();
            if (!str.equals(paramAnonymousAdapterView.field_bindSerial)) {
              break;
            }
            w.d("MicroMsg.BankcardListAdapter", "remove new: %s", new Object[] { str });
            paramAnonymousView.qWg.remove(str);
            h.xz();
            h.xy().xh().a(w.a.vyS, bg.c(paramAnonymousView.qWg, ","));
            break label58;
            label347:
            ((StringBuilder)localObject).append(paramAnonymousAdapterView.field_bankcardType);
            break label144;
            label360:
            paramAnonymousView = new Bundle();
            paramAnonymousView.putParcelable("key_bankcard", paramAnonymousAdapterView);
            com.tencent.mm.wallet_core.a.a(WalletBankcardManageUI.this, "WXCreditManagerProcess", paramAnonymousView, null);
            continue;
            label389:
            paramAnonymousView = n.byx().byW();
            if ((paramAnonymousView.rjq & 0x1000) > 0) {}
            for (boolean bool = true;; bool = false)
            {
              w.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramAnonymousView.rjq) });
              if (!bool) {
                break label586;
              }
              w.i("MicroMsg.WalletBankcardManageUI", "jump to H5 bankcard detail page");
              h.xz();
              paramAnonymousView = (String)h.xy().xh().get(w.a.vuc, "");
              h.xz();
              paramAnonymousLong = ((Long)h.xy().xh().get(w.a.vud, Long.valueOf(0L))).longValue();
              long l = System.currentTimeMillis() / 1000L;
              if ((bg.nm(paramAnonymousView)) || (l - paramAnonymousLong >= 7200L)) {
                break label558;
              }
              w.i("MicroMsg.WalletBankcardManageUI", "bank's url is not null");
              WalletBankcardManageUI.this.b(paramAnonymousAdapterView);
              break;
            }
            label558:
            w.i("MicroMsg.WalletBankcardManageUI", "listen BankcardLogoReadyEvent for newest url");
            com.tencent.mm.sdk.b.a.vgX.b(new c() {});
            continue;
            label586:
            WalletBankcardManageUI.this.c(paramAnonymousAdapterView);
          }
        }
        WalletBankcardManageUI.this.bwW();
        g.ork.i(14422, new Object[] { Integer.valueOf(2) });
        GMTrace.o(18425946570752L, 137284);
      }
    };
    GMTrace.o(7678864654336L, 57212);
  }
  
  private void ar()
  {
    GMTrace.i(7680206831616L, 57222);
    label51:
    label76:
    Object localObject1;
    Object localObject2;
    int i;
    label174:
    label190:
    TextView localTextView;
    if (this.qWE.byR())
    {
      this.qWI.setEnabled(false);
      if ((this.qWC == null) || (this.qWC.size() <= 0)) {
        break label326;
      }
      this.Ev.setVisibility(0);
      if ((this.qWD == null) || (this.qWD.size() <= 0)) {
        break label338;
      }
      this.qWF.setVisibility(0);
      if ((this.qWO == null) || (this.qWO.field_is_show_entry != 1)) {
        break label474;
      }
      ((TextView)this.qWK.findViewById(a.f.sJA)).setText(this.qWO.field_title);
      localObject1 = this.qWO;
      localObject2 = (TextView)findViewById(a.f.sJH);
      i = ((j)localObject1).field_red_dot_index;
      h.xz();
      if ((((Integer)h.xy().xh().get(w.a.vsM, Integer.valueOf(-1))).intValue() >= i) || (i <= 0)) {
        break label350;
      }
      i = 1;
      if (i == 0) {
        break label355;
      }
      w.i("MicroMsg.WalletBankcardManageUI", "red point update");
      ((TextView)localObject2).setVisibility(0);
      localTextView = (TextView)findViewById(a.f.sJz);
      if (((j)localObject1).field_is_overdue != 1) {
        break label364;
      }
      w.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.is_overdue = true");
      localTextView.setText(a.i.sZU);
      localTextView.setTextColor(getResources().getColor(a.c.aOL));
      label240:
      localTextView.setVisibility(0);
      label246:
      this.qWK.setVisibility(0);
    }
    for (;;)
    {
      this.qWG.T(this.qWC);
      this.qWG.notifyDataSetChanged();
      this.qWH.T(this.qWD);
      this.qWH.notifyDataSetChanged();
      this.qWI.setEnabled(true);
      GMTrace.o(7680206831616L, 57222);
      return;
      this.qWE.byP();
      this.qWI.setEnabled(true);
      break;
      label326:
      this.Ev.setVisibility(8);
      break label51;
      label338:
      this.qWF.setVisibility(8);
      break label76;
      label350:
      i = 0;
      break label174;
      label355:
      ((TextView)localObject2).setVisibility(8);
      break label190;
      label364:
      if (!bg.nm(((j)localObject1).field_tips))
      {
        w.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.tips not null");
        localTextView.setText(((j)localObject1).field_tips);
        break label240;
      }
      if (!bg.nm(((j)localObject1).field_available_otb))
      {
        w.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.available_otb not null");
        i = ((j)localObject1).field_available_otb.indexOf(".");
        localObject2 = ((j)localObject1).field_available_otb;
        localObject1 = localObject2;
        if (i > 0) {
          localObject1 = ((String)localObject2).substring(0, i);
        }
        localTextView.setText(getString(a.i.sZT, new Object[] { localObject1 }));
        break label240;
      }
      localTextView.setVisibility(8);
      break label246;
      label474:
      this.qWK.setVisibility(8);
    }
  }
  
  private void bwU()
  {
    GMTrace.i(18425141264384L, 137278);
    h.xz();
    final f localf = f.Kc((String)h.xy().xh().get(w.a.vzf, ""));
    if ((localf != null) && (!bg.nm(localf.rfe)))
    {
      if (!bg.nm(localf.rff)) {
        this.qWM.setUrl(localf.rff);
      }
      this.qWN.setText(localf.rfe);
      if (localf.rfa == 1)
      {
        this.qWL.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7691212685312L, 57304);
            if (!bg.nm(localf.rfb)) {
              com.tencent.mm.wallet_core.ui.e.m(WalletBankcardManageUI.this.vKB.vKW, localf.rfb, false);
            }
            GMTrace.o(7691212685312L, 57304);
          }
        });
        this.qWL.setVisibility(0);
        GMTrace.o(18425141264384L, 137278);
        return;
      }
      if (localf.rfa == 2)
      {
        this.qWL.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18425678135296L, 137282);
            paramAnonymousView = new qi();
            paramAnonymousView.eUY.userName = localf.rfc;
            paramAnonymousView.eUY.eVa = bg.aq(localf.rfd, "");
            paramAnonymousView.eUY.scene = 1071;
            paramAnonymousView.eUY.eVb = 0;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
            GMTrace.o(18425678135296L, 137282);
          }
        });
        this.qWL.setVisibility(0);
        GMTrace.o(18425141264384L, 137278);
        return;
      }
      w.w("MicroMsg.WalletBankcardManageUI", "unknown type: %d", new Object[] { Integer.valueOf(localf.rfa) });
    }
    this.qWL.setVisibility(8);
    GMTrace.o(18425141264384L, 137278);
  }
  
  protected final void MP()
  {
    GMTrace.i(7679669960704L, 57218);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7692017991680L, 57310);
        WalletBankcardManageUI.this.finish();
        g.ork.i(14422, new Object[] { Integer.valueOf(4) });
        GMTrace.o(7692017991680L, 57310);
        return true;
      }
    });
    this.qWI = ((TextView)findViewById(a.f.sIe));
    this.qWI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7691749556224L, 57308);
        WalletBankcardManageUI.this.bwW();
        com.tencent.mm.wallet_core.ui.e.EQ(19);
        g.ork.i(14422, new Object[] { Integer.valueOf(2) });
        GMTrace.o(7691749556224L, 57308);
      }
    });
    this.Ev = ((ListView)findViewById(a.f.sqz));
    this.qWG = bwV();
    this.Ev.setAdapter(this.qWG);
    this.Ev.setOnItemClickListener(this.RZ);
    this.qWF = ((ListView)findViewById(a.f.sId));
    this.qWH = new a(this, this.qWD);
    this.qWF.setAdapter(this.qWH);
    this.qWF.setOnItemClickListener(this.RZ);
    this.qWJ = findViewById(a.f.sJu);
    this.qWJ.setOnClickListener(this.hwh);
    this.qWK = findViewById(a.f.sJy);
    this.qWK.setOnClickListener(this.hwh);
    this.qWL = findViewById(a.f.sJw);
    this.qWM = ((CdnImageView)findViewById(a.f.sJx));
    this.qWN = ((TextView)findViewById(a.f.sJv));
    bwU();
    findViewById(a.f.sqi).setOnClickListener(this.hwh);
    final sm localsm = new sm();
    localsm.eXp.eXr = "4";
    localsm.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7685172887552L, 57259);
        if (!bg.nm(localsm.eXq.eXs))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)WalletBankcardManageUI.this.findViewById(a.f.sqJ), localsm.eXq.eXs, localsm.eXq.content, localsm.eXq.url);
          GMTrace.o(7685172887552L, 57259);
          return;
        }
        w.i("MicroMsg.WalletBankcardManageUI", "no bulletin data");
        GMTrace.o(7685172887552L, 57259);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(localsm);
    GMTrace.o(7679669960704L, 57218);
  }
  
  public final boolean aNk()
  {
    GMTrace.i(7680743702528L, 57226);
    GMTrace.o(7680743702528L, 57226);
    return false;
  }
  
  public final void b(Bankcard paramBankcard)
  {
    GMTrace.i(7679938396160L, 57220);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vuc, "");
    if (!bg.nm(str))
    {
      w.i("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is not null");
      Intent localIntent = new Intent();
      paramBankcard = String.format("bank_type=%s&card_tail=%s&bind_serial=%s", new Object[] { paramBankcard.field_bankcardType, paramBankcard.field_bankcardTail, paramBankcard.field_bindSerial });
      if (str.contains("?")) {}
      for (paramBankcard = str + "&" + paramBankcard;; paramBankcard = str + "?" + paramBankcard)
      {
        localIntent.putExtra("rawUrl", paramBankcard);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("disable_bounce_scroll", true);
        d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(7679938396160L, 57220);
        return;
      }
    }
    w.e("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is null");
    GMTrace.o(7679938396160L, 57220);
  }
  
  public a bwV()
  {
    GMTrace.i(7679804178432L, 57219);
    a locala = new a(this, this.qWC);
    GMTrace.o(7679804178432L, 57219);
    return locala;
  }
  
  public void bwW()
  {
    GMTrace.i(7680341049344L, 57223);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_bind_scene", 15);
    localBundle.putBoolean("key_bind_show_change_card", true);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_core.b.b.class, localBundle, null);
    GMTrace.o(7680341049344L, 57223);
  }
  
  public final void bwX()
  {
    GMTrace.i(7680475267072L, 57224);
    sv(0);
    this.qWE.d(this.qWC, this.qWD);
    ar();
    bwU();
    GMTrace.o(7680475267072L, 57224);
  }
  
  public void c(Bankcard paramBankcard)
  {
    GMTrace.i(7680072613888L, 57221);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_bankcard", paramBankcard);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.bind.a.class, localBundle, null);
    GMTrace.o(7680072613888L, 57221);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7680609484800L, 57225);
    w.i("MicroMsg.WalletBankcardManageUI", "onSceneEnd");
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof o)))
    {
      this.qWO = n.byx().rjv;
      bwX();
      GMTrace.o(7680609484800L, 57225);
      return true;
    }
    GMTrace.o(7680609484800L, 57225);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(7680877920256L, 57227);
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    d.b(this, "mall", ".ui.MallIndexUI", localIntent);
    super.finish();
    GMTrace.o(7680877920256L, 57227);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7678998872064L, 57213);
    int i = a.g.sOV;
    GMTrace.o(7678998872064L, 57213);
    return i;
  }
  
  public void iK(boolean paramBoolean)
  {
    GMTrace.i(7679401525248L, 57216);
    if (paramBoolean)
    {
      r(new o(null, 0));
      GMTrace.o(7679401525248L, 57216);
      return;
    }
    b(new o(null, 0), false);
    GMTrace.o(7679401525248L, 57216);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7679133089792L, 57214);
    super.onCreate(paramBundle);
    sv(4);
    w.i("MicroMsg.WalletBankcardManageUI", "index Oncreate");
    com.tencent.mm.plugin.wallet.a.p.bxd();
    this.qWE = com.tencent.mm.plugin.wallet.a.p.bxe();
    oM(a.i.tcc);
    MP();
    com.tencent.mm.wallet_core.c.p.eP(5, 0);
    com.tencent.mm.wallet_core.ui.e.EQ(27);
    this.qWO = n.byx().rjv;
    GMTrace.o(7679133089792L, 57214);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7679535742976L, 57217);
    super.onDestroy();
    this.qWG.qWf.destory();
    this.qWH.qWf.destory();
    GMTrace.o(7679535742976L, 57217);
  }
  
  public void onResume()
  {
    GMTrace.i(7679267307520L, 57215);
    if (!this.qWE.byR())
    {
      this.qWE.d(this.qWC, this.qWD);
      if (this.qWE.qUy != null) {
        sv(0);
      }
      iK(false);
    }
    for (;;)
    {
      ar();
      super.onResume();
      GMTrace.o(7679267307520L, 57215);
      return;
      iK(true);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\WalletBankcardManageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */