package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.lb;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.a.sm.b;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.g.a.sn.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.plugin.wallet_core.model.v.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.q;
import java.util.List;

public class MallIndexUI
  extends MallIndexBaseUI
{
  private boolean mSE;
  sn.b mSF;
  private String mSO;
  private ECardInfo mSP;
  private boolean mSQ;
  private com.tencent.mm.sdk.b.c<lb> mSR;
  private boolean mSS;
  private f mST;
  
  public MallIndexUI()
  {
    GMTrace.i(7992665702400L, 59550);
    this.mSE = false;
    this.mSQ = true;
    this.mSR = new com.tencent.mm.sdk.b.c() {};
    this.mSS = false;
    GMTrace.o(7992665702400L, 59550);
  }
  
  protected final void aNd()
  {
    GMTrace.i(7992934137856L, 59552);
    oM(a.i.sVv);
    GMTrace.o(7992934137856L, 59552);
  }
  
  protected final void aNe()
  {
    GMTrace.i(7994276315136L, 59562);
    com.tencent.mm.plugin.mall.b.a.aNs();
    GMTrace.o(7994276315136L, 59562);
  }
  
  protected final void aNf()
  {
    GMTrace.i(7994410532864L, 59563);
    com.tencent.mm.plugin.wallet_core.model.n.byt().bzr();
    if (((com.tencent.mm.plugin.wallet_core.model.n.byt().bzr().byQ()) || (com.tencent.mm.plugin.wallet_core.model.n.byt().bzr().byP())) && (q.zR()))
    {
      w.e("MicorMsg.MallIndexUI", "hy: user not open wallet or status unknown. try query");
      r(new com.tencent.mm.plugin.wallet_core.c.b.a("", false));
    }
    GMTrace.o(7994410532864L, 59563);
  }
  
  protected final boolean aNh()
  {
    GMTrace.i(7993336791040L, 59555);
    w.i("MicorMsg.MallIndexUI", "init BankcardList");
    final sn localsn = new sn();
    localsn.eXu.eXo = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19563307597824L, 145758);
        w.d("MicorMsg.MallIndexUI", "mUserInfo needBind : " + MallIndexUI.e(MallIndexUI.this).eXw + " hasNewTips : " + MallIndexUI.e(MallIndexUI.this).eXx + " swipeOn : " + MallIndexUI.e(MallIndexUI.this).eXy);
        if ((MallIndexUI.f(MallIndexUI.this)) || (MallIndexUI.this.vKB.vKW.isFinishing()))
        {
          w.e("MicorMsg.MallIndexUI", "error for callback ac finish");
          GMTrace.o(19563307597824L, 145758);
          return;
        }
        MallIndexUI.a(MallIndexUI.this, localsn.eXu);
        MallIndexUI localMallIndexUI;
        boolean bool2;
        Object localObject;
        if (MallIndexUI.e(MallIndexUI.this).errCode == 0)
        {
          MallIndexUI.this.aNq();
          MallIndexUI.this.aNn();
          localMallIndexUI = MallIndexUI.this;
          w.i("MicorMsg.MallIndexUI", "showGetNewWalletTip call");
          if ((localMallIndexUI.mSF == null) || ((!localMallIndexUI.mSF.eXv) && (!localMallIndexUI.mSF.eXB))) {
            break label347;
          }
          bool2 = com.tencent.mm.plugin.wallet_core.model.n.byx().byW().byN();
          com.tencent.mm.kernel.h.xz();
          localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vtq, Boolean.valueOf(false));
          if (localObject == null) {
            break label357;
          }
        }
        label347:
        label357:
        for (boolean bool1 = ((Boolean)localObject).booleanValue();; bool1 = false)
        {
          w.i("MicorMsg.MallIndexUI", "showGetNewWalletTip hadShow=" + bool1 + ";isswc=" + bool2);
          if ((!bool1) && (bool2))
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vtq, Boolean.valueOf(true));
            com.tencent.mm.ui.base.h.a(localMallIndexUI, localMallIndexUI.getString(a.i.sVx), null, true, null);
          }
          for (;;)
          {
            MallIndexUI.b(MallIndexUI.this, MallIndexUI.e(MallIndexUI.this));
            MallIndexUI.this.aNp();
            GMTrace.o(19563307597824L, 145758);
            return;
            w.e("MicorMsg.MallIndexUI", "user is not reg or simplereg，should not show this dialog");
          }
        }
      }
    };
    com.tencent.mm.sdk.b.a.vgX.a(localsn, Looper.myLooper());
    GMTrace.o(7993336791040L, 59555);
    return false;
  }
  
  protected final void aNm()
  {
    GMTrace.i(7993202573312L, 59554);
    final sm localsm = new sm();
    localsm.eXp.eXr = "1";
    localsm.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8002463596544L, 59623);
        if (!bg.nm(localsm.eXq.eXs)) {
          com.tencent.mm.wallet_core.ui.e.a(MallIndexUI.this.mSm, localsm.eXq.eXs, localsm.eXq.content, localsm.eXq.url);
        }
        GMTrace.o(8002463596544L, 59623);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(localsm);
    GMTrace.o(7993202573312L, 59554);
  }
  
  protected final void aNn()
  {
    GMTrace.i(7993605226496L, 59557);
    Object localObject = new ad();
    if ((((ad)localObject).rjq & 0x4000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WalletSwitchConfig", "isHideBalanceNum, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(((ad)localObject).rjq) });
      if (!bool) {
        break;
      }
      com.tencent.mm.kernel.h.xz();
      localObject = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vun, getString(a.i.sXe));
      this.mSl.setTextColor(getResources().getColor(a.c.smv));
      this.mSl.setText((CharSequence)localObject);
      GMTrace.o(7993605226496L, 59557);
      return;
    }
    this.mSl.setTextColor(getResources().getColor(a.c.smu));
    localObject = com.tencent.mm.plugin.wallet_core.model.n.byx().qUy;
    if ((localObject != null) && (((Bankcard)localObject).reK >= 0.0D))
    {
      this.mSl.setText(com.tencent.mm.wallet_core.ui.e.s(((Bankcard)localObject).reK));
      GMTrace.o(7993605226496L, 59557);
      return;
    }
    this.mSl.setText(getString(a.i.tbV));
    GMTrace.o(7993605226496L, 59557);
  }
  
  protected final void aNp()
  {
    GMTrace.i(7993739444224L, 59558);
    this.vKB.bXE();
    if ((this.mSF != null) && (this.mSF.eXR))
    {
      com.tencent.mm.kernel.h.xz();
      final boolean bool = ((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vzY, Boolean.valueOf(false))).booleanValue();
      w.i("MicorMsg.MallIndexUI", "addIconOptionMenuByMode, hasRedDot: %s", new Object[] { Boolean.valueOf(bool) });
      if (bool) {}
      for (int i = a.e.sov;; i = a.e.sou)
      {
        a(0, i, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            int i = 0;
            GMTrace.i(19561428549632L, 145744);
            paramAnonymousMenuItem = g.ork;
            if (bool) {
              i = 1;
            }
            paramAnonymousMenuItem.i(14872, new Object[] { Integer.valueOf(0), Integer.valueOf(i), "", "" });
            MallIndexUI.this.fR(MallIndexUI.e(MallIndexUI.this).eXC);
            GMTrace.o(19561428549632L, 145744);
            return true;
          }
        });
        GMTrace.o(7993739444224L, 59558);
        return;
      }
    }
    a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20963466936320L, 156190);
        MallIndexUI.h(MallIndexUI.this);
        g.ork.i(14419, new Object[] { MallIndexUI.this.lOv, Integer.valueOf(5) });
        GMTrace.o(20963466936320L, 156190);
        return true;
      }
    });
    GMTrace.o(7993739444224L, 59558);
  }
  
  protected final void aNq()
  {
    GMTrace.i(7993471008768L, 59556);
    if (this.mSk == null)
    {
      GMTrace.o(7993471008768L, 59556);
      return;
    }
    if ((!com.tencent.mm.s.c.vK().b(w.a.vyP, w.a.vyQ)) && (!this.mSF.eXx))
    {
      com.tencent.mm.plugin.wallet_core.model.j localj = com.tencent.mm.plugin.wallet_core.model.n.byx().rjv;
      if (localj == null) {
        break label141;
      }
      i = localj.field_red_dot_index;
      com.tencent.mm.kernel.h.xz();
      if ((((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vsM, Integer.valueOf(-1))).intValue() >= i) || (i <= 0)) {
        break label133;
      }
      w.i("MicorMsg.MallIndexUI", "bankcard need red point");
    }
    label133:
    label141:
    for (int i = 1; i != 0; i = 0)
    {
      this.mSk.setVisibility(0);
      GMTrace.o(7993471008768L, 59556);
      return;
      w.i("MicorMsg.MallIndexUI", "bankcard do not need red point");
    }
    this.mSk.setVisibility(8);
    GMTrace.o(7993471008768L, 59556);
  }
  
  protected final void cm(final View paramView)
  {
    GMTrace.i(7993068355584L, 59553);
    RelativeLayout localRelativeLayout1 = (RelativeLayout)paramView.findViewById(a.f.sqn);
    RelativeLayout localRelativeLayout2 = (RelativeLayout)paramView.findViewById(a.f.spU);
    RelativeLayout localRelativeLayout3 = (RelativeLayout)paramView.findViewById(a.f.sCR);
    this.mSl = ((TextView)paramView.findViewById(a.f.sqc));
    localRelativeLayout1.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7991457742848L, 59541);
        paramAnonymousView = MallIndexUI.this;
        if (q.zR()) {
          d.x(paramAnonymousView, "wallet_payu", ".bind.ui.WalletPayUBankcardManageUI");
        }
        for (;;)
        {
          com.tencent.mm.wallet_core.ui.e.EQ(5);
          g.ork.i(14419, new Object[] { MallIndexUI.this.lOv, Integer.valueOf(3) });
          com.tencent.mm.s.c.vK().c(w.a.vyP, w.a.vyQ);
          GMTrace.o(7991457742848L, 59541);
          return;
          d.x(paramAnonymousView, "wallet", ".bind.ui.WalletBankcardManageUI");
        }
      }
    });
    localRelativeLayout2.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7992263049216L, 59547);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vyC, Integer.valueOf(-1));
        paramView.findViewById(a.f.sqe).setVisibility(8);
        if (q.zR())
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("key_scene_balance_manager", 2);
          d.b(MallIndexUI.this, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", paramAnonymousView);
        }
        for (;;)
        {
          com.tencent.mm.wallet_core.ui.e.EQ(11);
          g.ork.i(14419, new Object[] { MallIndexUI.this.lOv, Integer.valueOf(2) });
          GMTrace.o(7992263049216L, 59547);
          return;
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("key_scene_balance_manager", 2);
          if (("3".equals(MallIndexUI.b(MallIndexUI.this))) && (MallIndexUI.c(MallIndexUI.this)))
          {
            w.i("MicorMsg.MallIndexUI", "set quota info");
            paramAnonymousView.putExtra("key_inc_bal_amt_flag", MallIndexUI.b(MallIndexUI.this));
            paramAnonymousView.putExtra("key_ecard_info", MallIndexUI.d(MallIndexUI.this));
          }
          d.b(MallIndexUI.this, "wallet", ".balance.ui.WalletBalanceManagerUI", paramAnonymousView);
        }
      }
    });
    localRelativeLayout3.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19563039162368L, 145756);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("key_from_scene", 1);
        d.b(MallIndexUI.this.vKB.vKW, "offline", ".ui.WalletOfflineEntranceUI", paramAnonymousView);
        com.tencent.mm.wallet_core.c.p.eP(9, 0);
        g.ork.i(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
        g.ork.i(14419, new Object[] { MallIndexUI.this.lOv, Integer.valueOf(1) });
        GMTrace.o(19563039162368L, 145756);
      }
    });
    this.mSj = ((ImageView)findViewById(a.f.sqE));
    this.mSk = ((ImageView)paramView.findViewById(a.f.spE));
    paramView = paramView.findViewById(a.f.sqe);
    com.tencent.mm.kernel.h.xz();
    if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vyC, Integer.valueOf(-1))).intValue() == 1) {
      paramView.setVisibility(0);
    }
    for (;;)
    {
      aNq();
      GMTrace.o(7993068355584L, 59553);
      return;
      paramView.setVisibility(8);
    }
  }
  
  public void finish()
  {
    GMTrace.i(18950872104960L, 141195);
    this.mSE = true;
    super.finish();
    GMTrace.o(18950872104960L, 141195);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7992799920128L, 59551);
    ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    com.tencent.mm.plugin.wallet_core.model.h.g(this, 2);
    this.mSF = new sn.b();
    this.mSF.eXv = false;
    this.mSF.eXw = true;
    this.mSF.eXx = false;
    this.mSR.bPu();
    super.onCreate(paramBundle);
    GMTrace.o(7992799920128L, 59551);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7994142097408L, 59561);
    super.onDestroy();
    this.mSR.dead();
    GMTrace.o(7994142097408L, 59561);
  }
  
  public void onPause()
  {
    GMTrace.i(7994007879680L, 59560);
    super.onPause();
    GMTrace.o(7994007879680L, 59560);
  }
  
  public void onResume()
  {
    GMTrace.i(7993873661952L, 59559);
    w.v("MicorMsg.MallIndexUI", "alvinluo MallIndexUI onResume");
    com.tencent.mm.plugin.walletlock.a.b localb = (com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class);
    localb.a(this, localb.bAq(), null);
    super.onResume();
    GMTrace.o(7993873661952L, 59559);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\ui\MallIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */