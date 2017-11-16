package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.z;
import com.tencent.mm.plugin.wallet_core.ui.i.10;
import com.tencent.mm.plugin.wallet_core.ui.i.2;
import com.tencent.mm.plugin.wallet_core.ui.i.6;
import com.tencent.mm.plugin.wallet_core.ui.i.7;
import com.tencent.mm.plugin.wallet_core.ui.i.8;
import com.tencent.mm.plugin.wallet_core.ui.i.9;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;

public class WalletBalanceManagerUI
  extends WalletBaseUI
  implements i
{
  protected int gRb;
  protected TextView qUa;
  protected TextView qUt;
  protected Button qUu;
  protected View qUv;
  protected View qUw;
  protected TextView qUx;
  protected Bankcard qUy;
  
  public WalletBalanceManagerUI()
  {
    GMTrace.i(7705037111296L, 57407);
    GMTrace.o(7705037111296L, 57407);
  }
  
  private void bwN()
  {
    GMTrace.i(7706245070848L, 57416);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    com.tencent.mm.plugin.wallet.a.p.bxe();
    String str = this.qUy.field_bindSerial;
    if (!bg.nm(this.qUy.reN)) {
      a(0, getString(a.i.sZu), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(18394002751488L, 137046);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("rawUrl", WalletBalanceManagerUI.this.qUy.reN);
          paramAnonymousMenuItem.putExtra("showShare", false);
          paramAnonymousMenuItem.putExtra("geta8key_username", q.zE());
          paramAnonymousMenuItem.putExtra("KPublisherId", "pay_blance_list");
          paramAnonymousMenuItem.putExtra("geta8key_scene", 33);
          d.b(WalletBalanceManagerUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
          com.tencent.mm.wallet_core.ui.e.EQ(16);
          GMTrace.o(18394002751488L, 137046);
          return true;
        }
      });
    }
    GMTrace.o(7706245070848L, 57416);
  }
  
  protected final void MP()
  {
    GMTrace.i(7705842417664L, 57413);
    oM(a.i.sZw);
    this.qUt = ((TextView)findViewById(a.f.sIr));
    this.qUa = ((TextView)findViewById(a.f.sIf));
    ((Button)findViewById(a.f.bQR)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7709868949504L, 57443);
        WalletBalanceManagerUI.this.bwM();
        com.tencent.mm.wallet_core.ui.e.EQ(14);
        GMTrace.o(7709868949504L, 57443);
      }
    });
    this.qUu = ((Button)findViewById(a.f.sIg));
    this.qUu.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7725035552768L, 57556);
        com.tencent.mm.plugin.wallet.a.p.bxd();
        paramAnonymousView = com.tencent.mm.plugin.wallet.a.p.bxe().bze();
        if ((paramAnonymousView == null) || (paramAnonymousView.size() == 0))
        {
          w.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is empty, do bind card to fetch");
          WalletBalanceManagerUI.a(WalletBalanceManagerUI.this);
          GMTrace.o(7725035552768L, 57556);
          return;
        }
        w.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is valid, to do fetch");
        com.tencent.mm.wallet_core.a.a(WalletBalanceManagerUI.this, com.tencent.mm.plugin.wallet.balance.b.class, null, null);
        com.tencent.mm.wallet_core.ui.e.EQ(15);
        GMTrace.o(7725035552768L, 57556);
      }
    });
    final Object localObject = (TextView)findViewById(a.f.sIh);
    boolean bool;
    if (!v.bPK().equals("zh_CN"))
    {
      bool = true;
      if (bool) {
        break label245;
      }
      ((TextView)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7719935279104L, 57518);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", "https://kf.qq.com/touch/scene_product.html?scene_id=kf4");
          paramAnonymousView.putExtra("showShare", false);
          paramAnonymousView.putExtra("geta8key_username", q.zE());
          d.b(WalletBalanceManagerUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
          com.tencent.mm.wallet_core.ui.e.EQ(17);
          GMTrace.o(7719935279104L, 57518);
        }
      });
      ((TextView)localObject).setVisibility(0);
    }
    for (;;)
    {
      ((TextView)findViewById(a.f.sKQ)).setText(com.tencent.mm.wallet_core.c.t.clW());
      this.qUv = findViewById(a.f.swT);
      this.qUx = ((TextView)findViewById(a.f.swU));
      this.qUw = findViewById(a.f.swS);
      localObject = new sm();
      ((sm)localObject).eXp.eXr = "2";
      ((sm)localObject).eDO = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7724767117312L, 57554);
          if (!bg.nm(localObject.eXq.eXs)) {
            com.tencent.mm.wallet_core.ui.e.a(WalletBalanceManagerUI.this.qUa, localObject.eXq.eXs, localObject.eXq.content, localObject.eXq.url);
          }
          GMTrace.o(7724767117312L, 57554);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(7705842417664L, 57413);
      return;
      bool = bg.Jw();
      break;
      label245:
      ((TextView)localObject).setVisibility(8);
    }
  }
  
  public final void ar()
  {
    GMTrace.i(7706110853120L, 57415);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    this.qUy = com.tencent.mm.plugin.wallet.a.p.bxe().qUy;
    if (this.qUy != null)
    {
      if (this.qUy.reK >= 0.0D)
      {
        this.qUt.setText(com.tencent.mm.wallet_core.ui.e.s(this.qUy.reK));
        com.tencent.mm.plugin.wallet.a.p.bxd();
        localObject = com.tencent.mm.plugin.wallet.a.p.bxe().byW();
        if ((((ad)localObject).rjq & 0x4) <= 0) {
          break label354;
        }
        bool = true;
        label81:
        w.i("MicroMsg.WalletSwitchConfig", "isBalanceFetchOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ad)localObject).rjq) });
        if ((!bool) || (this.qUy.reK <= 0.0D)) {
          break label359;
        }
        i = 1;
        label129:
        if (i == 0) {
          break label364;
        }
        this.qUu.setVisibility(0);
        label141:
        bwN();
      }
    }
    else
    {
      localObject = findViewById(a.f.sxq);
      h.xz();
      if (((Integer)h.xy().xh().get(w.a.vyD, Integer.valueOf(-1))).intValue() != 1) {
        break label376;
      }
      ((View)localObject).setVisibility(0);
      label188:
      localObject = new ad();
      if ((((ad)localObject).rjq & 0x8000) <= 0) {
        break label385;
      }
    }
    label354:
    label359:
    label364:
    label376:
    label385:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ad)localObject).rjq) });
      if (!bool) {
        break label390;
      }
      h.xz();
      localObject = (String)h.xy().xh().get(w.a.vum, getString(a.i.sXf));
      this.qUv.setVisibility(0);
      this.qUx.setTextColor(getResources().getColor(a.c.smN));
      this.qUx.setText((CharSequence)localObject);
      this.qUw.setVisibility(8);
      this.qUv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7717385142272L, 57499);
          h.xz();
          h.xy().xh().a(w.a.vyD, Integer.valueOf(-1));
          paramAnonymousView = new Bundle();
          paramAnonymousView.putInt("real_name_verify_mode", 0);
          paramAnonymousView.putString("realname_verify_process_jump_plugin", "wallet");
          paramAnonymousView.putString("realname_verify_process_jump_activity", "com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI");
          paramAnonymousView.putInt("entry_scene", 1009);
          com.tencent.mm.wallet_core.a.a(WalletBalanceManagerUI.this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramAnonymousView);
          GMTrace.o(7717385142272L, 57499);
        }
      });
      GMTrace.o(7706110853120L, 57415);
      return;
      this.qUt.setText(getString(a.i.tbV));
      break;
      bool = false;
      break label81;
      i = 0;
      break label129;
      this.qUu.setVisibility(8);
      break label141;
      ((View)localObject).setVisibility(8);
      break label188;
    }
    label390:
    com.tencent.mm.plugin.wallet.a.p.bxd();
    final Object localObject = com.tencent.mm.plugin.wallet.a.p.bxe();
    h.xz();
    int i = ((Integer)h.xy().xh().get(w.a.vzi, Integer.valueOf(-1))).intValue();
    if (i != -1) {
      if (i == 1) {
        i = 1;
      }
    }
    while (i != 0)
    {
      this.qUv.setVisibility(0);
      this.qUv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7709063643136L, 57437);
          h.xz();
          h.xy().xh().a(w.a.vyD, Integer.valueOf(-1));
          paramAnonymousView = new Intent(WalletBalanceManagerUI.this, WalletLqtDetailUI.class);
          WalletBalanceManagerUI.this.startActivity(paramAnonymousView);
          GMTrace.o(7709063643136L, 57437);
        }
      });
      localObject = this.qUx;
      com.tencent.mm.plugin.wallet.a.p.bxd();
      ((TextView)localObject).setText(com.tencent.mm.plugin.wallet.a.p.bxe().byZ());
      this.qUw.setVisibility(0);
      GMTrace.o(7706110853120L, 57415);
      return;
      i = 0;
      continue;
      if (((af)localObject).rjs != null)
      {
        if (((af)localObject).rjs.field_lqt_state == 1) {
          i = 1;
        } else {
          i = 0;
        }
      }
      else {
        i = 0;
      }
    }
    com.tencent.mm.plugin.wallet.a.p.bxd();
    localObject = com.tencent.mm.plugin.wallet.a.p.bxe();
    if (localObject != null)
    {
      ad localad = ((af)localObject).byW();
      if ((localad.rjq & 0x400) > 0) {}
      for (bool = true;; bool = false)
      {
        w.i("MicroMsg.WalletSwitchConfig", "isSupportLCT, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(localad.rjq) });
        if ((!bool) || (TextUtils.isEmpty(((af)localObject).byZ())) || (TextUtils.isEmpty(((af)localObject).bza()))) {
          break;
        }
        this.qUv.setVisibility(0);
        this.qUx.setText(((af)localObject).byZ());
        this.qUw.setVisibility(0);
        this.qUv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18390647308288L, 137021);
            h.xz();
            h.xy().xh().a(w.a.vyD, Integer.valueOf(-1));
            com.tencent.mm.wallet_core.ui.e.m(WalletBalanceManagerUI.this, localObject.bza(), true);
            GMTrace.o(18390647308288L, 137021);
          }
        });
        GMTrace.o(7706110853120L, 57415);
        return;
      }
    }
    this.qUv.setVisibility(8);
    GMTrace.o(7706110853120L, 57415);
  }
  
  public void bwL()
  {
    GMTrace.i(7705439764480L, 57410);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (com.tencent.mm.plugin.wallet.a.p.bxe().qUy == null) {}
    for (boolean bool = true;; bool = false)
    {
      b(new o(null, 0), bool);
      GMTrace.o(7705439764480L, 57410);
      return;
    }
  }
  
  public void bwM()
  {
    GMTrace.i(7705708199936L, 57412);
    z(WalletBalanceSaveUI.class);
    GMTrace.o(7705708199936L, 57412);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7706379288576L, 57417);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (!(paramk instanceof com.tencent.mm.plugin.wallet.bind.a.b)) && ((paramk instanceof o))) {
      ar();
    }
    GMTrace.o(7706379288576L, 57417);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7705171329024L, 57408);
    int i = a.g.sOL;
    GMTrace.o(7705171329024L, 57408);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7705305546752L, 57409);
    super.onCreate(paramBundle);
    ((com.tencent.mm.plugin.walletlock.a.b)h.h(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    this.gRb = getIntent().getIntExtra("key_scene_balance_manager", 0);
    paramBundle = getIntent();
    Object localObject1 = paramBundle.getStringExtra("key_inc_bal_amt_flag");
    paramBundle = (ECardInfo)paramBundle.getParcelableExtra("key_ecard_info");
    Button localButton;
    CheckBox localCheckBox;
    if ("3".equals(localObject1))
    {
      if (paramBundle == null) {
        break label732;
      }
      Object localObject2 = LayoutInflater.from(this).inflate(a.g.sPv, null);
      ImageView localImageView = (ImageView)((View)localObject2).findViewById(a.f.bps);
      int i = BackwardSupportUtil.b.a(this, 15.0F);
      bg.j(localImageView, i, i, i, i);
      Object localObject5 = (TextView)((View)localObject2).findViewById(a.f.dIf);
      Object localObject4 = (LinearLayout)((View)localObject2).findViewById(a.f.sAK);
      localButton = (Button)((View)localObject2).findViewById(a.f.sHZ);
      Object localObject3 = (TextView)((View)localObject2).findViewById(a.f.sAI);
      localCheckBox = (CheckBox)((View)localObject2).findViewById(a.f.checkbox);
      localObject1 = (TextView)((View)localObject2).findViewById(a.f.stg);
      ((TextView)localObject5).setText(paramBundle.title);
      ((LinearLayout)localObject4).removeAllViews();
      localObject5 = paramBundle.rfG.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        String str = (String)((Iterator)localObject5).next();
        View localView = LayoutInflater.from(this).inflate(a.g.sPu, null);
        ((TextView)localView.findViewById(a.f.sLp)).setText(str);
        ((LinearLayout)localObject4).addView(localView);
      }
      i = paramBundle.rfJ.length();
      int j = (paramBundle.rfJ + paramBundle.rfK).length();
      localObject4 = new SpannableString(paramBundle.rfJ + paramBundle.rfK);
      ((SpannableString)localObject4).setSpan(new ForegroundColorSpan(getResources().getColor(a.c.smW)), i, j, 33);
      ((TextView)localObject3).setText((CharSequence)localObject4);
      ((TextView)localObject3).setOnClickListener(new i.6(paramBundle, this));
      localObject3 = new Dialog(this, a.j.eme);
      ((Dialog)localObject3).setContentView((View)localObject2);
      ((Dialog)localObject3).setTitle(null);
      ((Dialog)localObject3).setOnCancelListener(new i.7((Dialog)localObject3));
      localImageView.setOnClickListener(new i.8((Dialog)localObject3));
      localButton.setOnClickListener(new i.9(paramBundle, this, (Dialog)localObject3));
      if (paramBundle.rfA != 1) {
        break label722;
      }
      localCheckBox.setOnCheckedChangeListener(new i.10(localButton));
      if (paramBundle.rfB != 1) {
        break label701;
      }
      localCheckBox.setChecked(true);
      i = paramBundle.rfC.length();
      j = (paramBundle.rfC + paramBundle.rfD).length();
      localObject2 = new SpannableString(paramBundle.rfC + paramBundle.rfD);
      ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(getResources().getColor(a.c.smW)), i, j, 33);
      ((TextView)localObject1).setText((CharSequence)localObject2);
      ((TextView)localObject1).setOnClickListener(new i.2(paramBundle, this));
      ((Dialog)localObject3).show();
    }
    for (;;)
    {
      hN(621);
      n.byE();
      z.a(this);
      MP();
      com.tencent.mm.wallet_core.c.p.eP(2, 0);
      g.ork.i(11850, new Object[] { Integer.valueOf(6), Integer.valueOf(0) });
      com.tencent.mm.wallet_core.ui.e.EQ(10);
      GMTrace.o(7705305546752L, 57409);
      return;
      label701:
      localCheckBox.setChecked(false);
      localButton.setEnabled(false);
      localButton.setClickable(false);
      break;
      label722:
      localCheckBox.setVisibility(8);
      break;
      label732:
      w.w("MicroMsg.WalletBalanceManagerUI", "ecard info is null");
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7705573982208L, 57411);
    hO(621);
    n.byE();
    z.b(this);
    super.onDestroy();
    GMTrace.o(7705573982208L, 57411);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7706647724032L, 57419);
    w.i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from bind ui flag:" + paramIntent.getIntExtra("from_bind_ui", 0));
    if (paramIntent.getIntExtra("from_bind_ui", 0) == com.tencent.mm.plugin.wallet.balance.a.qTf)
    {
      com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.balance.b.class, null, null);
      com.tencent.mm.wallet_core.ui.e.EQ(15);
    }
    GMTrace.o(7706647724032L, 57419);
  }
  
  public void onResume()
  {
    GMTrace.i(7705976635392L, 57414);
    ar();
    bwL();
    super.onResume();
    com.tencent.mm.plugin.walletlock.a.b localb = (com.tencent.mm.plugin.walletlock.a.b)h.h(com.tencent.mm.plugin.walletlock.a.b.class);
    localb.a(this, localb.bAq(), null);
    GMTrace.o(7705976635392L, 57414);
  }
  
  public final void ql(int paramInt)
  {
    GMTrace.i(7706513506304L, 57418);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    this.qUy = com.tencent.mm.plugin.wallet.a.p.bxe().qUy;
    if (this.qUy != null)
    {
      if (this.qUy.reK < 0.0D) {
        break label73;
      }
      this.qUt.setText(com.tencent.mm.wallet_core.ui.e.s(this.qUy.reK));
    }
    for (;;)
    {
      bwN();
      GMTrace.o(7706513506304L, 57418);
      return;
      label73:
      this.qUt.setText(getString(a.i.tbV));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\WalletBalanceManagerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */