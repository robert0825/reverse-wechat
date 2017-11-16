package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.ae.a.a;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.e.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.f.a;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.g.a.l;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(19)
public class WalletVerifyCodeUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private com.tencent.mm.plugin.ae.a ica;
  private Orders opK;
  private Button qXb;
  private Authen qXg;
  private PayInfo qYU;
  public int rpO;
  public WalletFormView rpP;
  private Button rpQ;
  private String rpR;
  private String rpS;
  private boolean rpT;
  private a rpU;
  private TextView rpV;
  private boolean rpW;
  private com.tencent.mm.plugin.wallet_core.model.g rpX;
  private f.a rpY;
  
  public WalletVerifyCodeUI()
  {
    GMTrace.i(6970866139136L, 51937);
    this.rpO = 60000;
    this.rpP = null;
    this.ica = null;
    this.rpT = false;
    this.rpU = null;
    this.rpW = false;
    this.rpX = new com.tencent.mm.plugin.wallet_core.model.g();
    this.rpY = new f.a()
    {
      public final void bzY()
      {
        GMTrace.i(6981066686464L, 52013);
        WalletVerifyCodeUI.this.bzX();
        GMTrace.o(6981066686464L, 52013);
      }
    };
    GMTrace.o(6970866139136L, 51937);
  }
  
  private String bzU()
  {
    GMTrace.i(6971134574592L, 51939);
    String str = bg.aq(this.ui.getString("key_mobile"), "");
    if (bg.nm(str))
    {
      Bankcard localBankcard = (Bankcard)this.ui.getParcelable("key_bankcard");
      if (localBankcard != null) {
        str = localBankcard.field_mobile;
      }
    }
    for (;;)
    {
      GMTrace.o(6971134574592L, 51939);
      return str;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(6971537227776L, 51942);
    com.tencent.mm.wallet_core.b localb = com.tencent.mm.wallet_core.a.ad(this);
    this.rpV = ((TextView)findViewById(a.f.sqV));
    final Object localObject1 = bzU();
    Object localObject2;
    if (bg.nm((String)localObject1))
    {
      localObject2 = (Bankcard)this.ui.getParcelable("key_bankcard");
      if (localObject2 != null)
      {
        localObject1 = ((Bankcard)localObject2).field_mobile;
        this.ui.putString("key_mobile", (String)localObject1);
      }
    }
    for (;;)
    {
      localObject2 = se(0);
      boolean bool2;
      label318:
      Object localObject3;
      if (!bg.L((CharSequence)localObject2))
      {
        this.rpV.setText((CharSequence)localObject2);
        this.rpV.setGravity(3);
        this.rpP = ((WalletFormView)findViewById(a.f.bhc));
        this.rpP.xFu = this;
        this.rpQ = ((Button)findViewById(a.f.svU));
        this.rpQ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7017976561664L, 52288);
            WalletVerifyCodeUI.this.bzW();
            GMTrace.o(7017976561664L, 52288);
          }
        });
        this.rpQ.setClickable(false);
        this.rpQ.setEnabled(false);
        if (this.rpU != null)
        {
          this.rpU.cancel();
          this.rpU = null;
        }
        localObject1 = new a(this.rpO);
        this.rpU = ((a)localObject1);
        ((a)localObject1).start();
        this.qXb = ((Button)findViewById(a.f.bgZ));
        this.qXb.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6953686269952L, 51809);
            if (WalletVerifyCodeUI.a(WalletVerifyCodeUI.this, WalletVerifyCodeUI.a(WalletVerifyCodeUI.this)))
            {
              GMTrace.o(6953686269952L, 51809);
              return;
            }
            WalletVerifyCodeUI.this.bzX();
            GMTrace.o(6953686269952L, 51809);
          }
        });
        localObject2 = (TextView)findViewById(a.f.sqU);
        localObject1 = (Bankcard)this.ui.getParcelable("key_bankcard");
        boolean bool1 = this.ui.getBoolean("key_is_changing_balance_phone_num");
        bool2 = this.ui.getBoolean("key_need_show_switch_phone", false);
        if ((!bool1) || (bool2)) {
          break label480;
        }
        ((TextView)localObject2).setVisibility(8);
        localObject3 = (PayInfo)this.ui.getParcelable("key_pay_info");
        if (localObject3 == null) {
          break label624;
        }
      }
      label480:
      label574:
      label624:
      for (int i = ((PayInfo)localObject3).ePL;; i = 0)
      {
        if (bool2)
        {
          ((TextView)localObject2).setText(a.i.tgU);
          ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              boolean bool2 = true;
              GMTrace.i(6997843902464L, 52138);
              w.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
              w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess and finish!");
              paramAnonymousView = WalletVerifyCodeUI.this.ui;
              paramAnonymousView.putInt("key_err_code", 417);
              paramAnonymousView.putBoolean("key_need_show_switch_phone", true);
              boolean bool1 = bool2;
              if (localObject1 != null) {
                if (!localObject1.byd()) {
                  break label100;
                }
              }
              label100:
              for (bool1 = bool2;; bool1 = false)
              {
                paramAnonymousView.putBoolean("key_isbalance", bool1);
                com.tencent.mm.wallet_core.a.i(WalletVerifyCodeUI.this, paramAnonymousView);
                WalletVerifyCodeUI.this.finish();
                GMTrace.o(6997843902464L, 52138);
                return;
              }
            }
          });
        }
        for (;;)
        {
          this.rpP.requestFocus();
          a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(6978382331904L, 51993);
              paramAnonymousMenuItem = WalletVerifyCodeUI.this.ui.getString("key_QADNA_URL");
              if (bg.nm(paramAnonymousMenuItem)) {
                e.m(WalletVerifyCodeUI.this.vKB.vKW, "https://kf.qq.com/touch/sappfaq/160830qY7NJJ1608307ZJzqy.html", false);
              }
              for (;;)
              {
                GMTrace.o(6978382331904L, 51993);
                return true;
                e.m(WalletVerifyCodeUI.this.vKB.vKW, paramAnonymousMenuItem, false);
              }
            }
          });
          a(new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(6927379595264L, 51613);
              WalletVerifyCodeUI.this.aLo();
              if (WalletVerifyCodeUI.this.bxq()) {
                WalletVerifyCodeUI.this.showDialog(1000);
              }
              for (;;)
              {
                GMTrace.o(6927379595264L, 51613);
                return false;
                WalletVerifyCodeUI.this.finish();
              }
            }
          });
          GMTrace.o(6971537227776L, 51942);
          return;
          localObject3 = this.rpV;
          if (q.zR()) {}
          for (localObject2 = getString(a.i.tgN);; localObject2 = getString(a.i.tgM))
          {
            ((TextView)localObject3).setText(String.format((String)localObject2, new Object[] { localObject1 }));
            this.rpV.setGravity(3);
            break;
          }
          ((TextView)localObject2).setVisibility(0);
          break label318;
          if ((localb == null) || (!localb.clD()) || (i == 11) || (i == 21)) {
            break label574;
          }
          if ((!((Bankcard)localObject1).byd()) && (!((Bankcard)localObject1).bye()))
          {
            ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(6996367507456L, 52127);
                com.tencent.mm.ui.base.h.a(WalletVerifyCodeUI.this, WalletVerifyCodeUI.this.getString(a.i.teK, new Object[] { localObject1.field_desc, localObject1.field_mobile }), "", WalletVerifyCodeUI.this.getString(a.i.teJ), WalletVerifyCodeUI.this.getString(a.i.cSk), new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(6961202462720L, 51865);
                    w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess2 and finish to reset mobile num!");
                    paramAnonymous2DialogInterface = WalletVerifyCodeUI.this.ui;
                    paramAnonymous2DialogInterface.putInt("key_err_code", 408);
                    com.tencent.mm.wallet_core.a.i(WalletVerifyCodeUI.this, paramAnonymous2DialogInterface);
                    WalletVerifyCodeUI.this.finish();
                    GMTrace.o(6961202462720L, 51865);
                  }
                }, null);
                GMTrace.o(6996367507456L, 52127);
              }
            });
          }
          else
          {
            ((TextView)localObject2).setText(a.i.tgU);
            ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                boolean bool = false;
                GMTrace.i(6927111159808L, 51611);
                w.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
                w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess3 and finish!");
                if ((WalletVerifyCodeUI.b(WalletVerifyCodeUI.this) != null) && (WalletVerifyCodeUI.b(WalletVerifyCodeUI.this).byk())) {
                  com.tencent.mm.plugin.report.service.g.ork.i(13731, new Object[] { Integer.valueOf(9) });
                }
                paramAnonymousView = WalletVerifyCodeUI.this.ui;
                paramAnonymousView.putInt("key_err_code", 417);
                paramAnonymousView.putBoolean("key_need_show_switch_phone", true);
                if ((localObject1 == null) || (localObject1.byd())) {
                  bool = true;
                }
                paramAnonymousView.putBoolean("key_isbalance", bool);
                com.tencent.mm.wallet_core.a.i(WalletVerifyCodeUI.this, paramAnonymousView);
                WalletVerifyCodeUI.this.finish();
                GMTrace.o(6927111159808L, 51611);
              }
            });
          }
        }
        if (q.zR()) {}
        for (localObject1 = getString(a.i.tgP);; localObject1 = getString(a.i.tgO))
        {
          ((TextView)localObject2).setText((CharSequence)localObject1);
          ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6982811516928L, 52026);
              WalletVerifyCodeUI.c(WalletVerifyCodeUI.this);
              GMTrace.o(6982811516928L, 52026);
            }
          });
          break;
        }
      }
    }
  }
  
  public boolean bxq()
  {
    GMTrace.i(6972476751872L, 51949);
    boolean bool = getIntent().getBooleanExtra("key_need_confirm_finish", false);
    if (((this.qYU != null) && (this.qYU.lNA)) || (bool))
    {
      GMTrace.o(6972476751872L, 51949);
      return true;
    }
    bool = super.bxq();
    GMTrace.o(6972476751872L, 51949);
    return bool;
  }
  
  public void bzV()
  {
    GMTrace.i(6971268792320L, 51940);
    GMTrace.o(6971268792320L, 51940);
  }
  
  public void bzW()
  {
    int j = 2;
    GMTrace.i(6971403010048L, 51941);
    w.i("MicroMsg.WalletVertifyCodeUI", "get verify code!");
    Object localObject = com.tencent.mm.plugin.report.service.g.ork;
    int i;
    if ((this.qYU != null) && (this.qYU.ePL != 0))
    {
      i = 1;
      if (!this.rpT) {
        break label188;
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(10706, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      this.rpT = true;
      this.rpQ.setClickable(false);
      this.rpQ.setEnabled(false);
      if (this.rpU != null)
      {
        this.rpU.cancel();
        this.rpU = null;
      }
      localObject = new a(this.rpO);
      this.rpU = ((a)localObject);
      ((a)localObject).start();
      if (this.ica != null) {
        this.ica.start();
      }
      if (!cmq().q(new Object[] { this.rpR })) {
        break label193;
      }
      GMTrace.o(6971403010048L, 51941);
      return;
      i = 2;
      break;
      label188:
      j = 1;
    }
    label193:
    if (mR(false))
    {
      GMTrace.o(6971403010048L, 51941);
      return;
    }
    this.qXg = ((Authen)this.ui.getParcelable("key_authen"));
    if (this.qXg == null)
    {
      w.w("MicroMsg.WalletVertifyCodeUI", "error authen is null");
      GMTrace.o(6971403010048L, 51941);
      return;
    }
    c.bAa();
    GMTrace.o(6971403010048L, 51941);
  }
  
  public void bzX()
  {
    GMTrace.i(6971671445504L, 51943);
    Bundle localBundle = this.ui;
    Object localObject = this.ui.getString("key_pwd1");
    this.rpR = this.rpP.getText();
    com.tencent.mm.plugin.wallet_core.model.o localo = new com.tencent.mm.plugin.wallet_core.model.o();
    localo.riF = ((String)localObject);
    localo.oek = this.qYU;
    localo.riG = this.rpR;
    localo.token = bg.aq(this.ui.getString("kreq_token"), "");
    localObject = (Bankcard)localBundle.getParcelable("key_bankcard");
    if (localObject != null)
    {
      localo.nDt = ((Bankcard)localObject).field_bankcardType;
      localo.nDu = ((Bankcard)localObject).field_bindSerial;
      localo.rel = bg.aq(((Bankcard)localObject).field_arrive_type, "");
    }
    for (;;)
    {
      w.d("MicroMsg.WalletVertifyCodeUI", "payInfo " + localo.oek + " mVerifyCode: " + this.rpR);
      localBundle.putString("key_verify_code", this.rpR);
      com.tencent.mm.wallet_core.a.ad(this);
      boolean bool = cmq().j(new Object[] { this.rpR, localo });
      w.i("MicroMsg.WalletVertifyCodeUI", "do verify result : " + bool);
      GMTrace.o(6971671445504L, 51943);
      return;
      localo.nDt = this.ui.getString("key_bank_type");
      if (bg.nm(localo.nDt)) {
        localo.nDt = this.ui.getString("key_bind_card_type", "");
      }
    }
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6971805663232L, 51944);
    w.d("MicroMsg.WalletVertifyCodeUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramk instanceof com.tencent.mm.wallet_core.c.f))
    {
      if ((paramInt2 != 0) && (((com.tencent.mm.wallet_core.c.f)paramk).eUj)) {
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramString, null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7020124045312L, 52304);
            GMTrace.o(7020124045312L, 52304);
          }
        });
      }
      GMTrace.o(6971805663232L, 51944);
      return true;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.wallet_core.a.ad(this);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.o))
      {
        this.ui.putBoolean("intent_bind_end", true);
        com.tencent.mm.ui.base.h.bm(this, getString(a.i.sZL));
        w.i("MicroMsg.WalletVertifyCodeUI", "query bound bank card resp!");
        paramInt1 = 1;
      }
    }
    for (;;)
    {
      if ((paramk instanceof i)) {
        com.tencent.mm.plugin.report.service.g.ork.i(10707, new Object[] { Integer.valueOf(2), Integer.valueOf(c.bAb()) });
      }
      if ((this.qXg != null) && ((paramk instanceof com.tencent.mm.wallet_core.g.a.h)))
      {
        paramString = ((com.tencent.mm.wallet_core.g.a.h)paramk).aWg();
        if (!bg.nm(paramString)) {
          this.ui.putString("kreq_token", paramString);
        }
      }
      if (paramInt1 != 0)
      {
        w.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess1 and finish!");
        com.tencent.mm.wallet_core.a.i(this, this.ui);
        finish();
        GMTrace.o(6971805663232L, 51944);
        return true;
        if (!(paramk instanceof l))
        {
          if (paramString.c(this, null))
          {
            r(new com.tencent.mm.plugin.wallet_core.c.o(bxg()));
            w.i("MicroMsg.WalletVertifyCodeUI", "to query bound bank card!");
          }
        }
        else {
          paramInt1 = 0;
        }
      }
      else
      {
        GMTrace.o(6971805663232L, 51944);
        return false;
      }
      paramInt1 = 1;
    }
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(6972208316416L, 51947);
    if (this.rpP.dJ(null))
    {
      this.qXb.setEnabled(true);
      this.qXb.setClickable(true);
      GMTrace.o(6972208316416L, 51947);
      return;
    }
    this.qXb.setEnabled(false);
    this.qXb.setClickable(false);
    GMTrace.o(6972208316416L, 51947);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6971939880960L, 51945);
    int i = a.g.sQo;
    GMTrace.o(6971939880960L, 51945);
    return i;
  }
  
  public final boolean i(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6972745187328L, 51951);
    w.i("MicroMsg.WalletVertifyCodeUI", "onPreSceneEnd %s %s", new Object[] { Integer.valueOf(paramInt2), paramk });
    if (((paramk instanceof com.tencent.mm.wallet_core.c.f)) && (paramInt2 == 0))
    {
      this.rpW = true;
      u.makeText(this, a.i.tdQ, 0).show();
      w.i("MicroMsg.WalletVertifyCodeUI", "tag it isCertInstalled ok");
    }
    GMTrace.o(6972745187328L, 51951);
    return true;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int j = 2;
    GMTrace.i(6971000356864L, 51938);
    super.onCreate(paramBundle);
    oM(a.i.tgZ);
    this.qYU = ((PayInfo)this.ui.getParcelable("key_pay_info"));
    this.opK = ((Orders)this.ui.getParcelable("key_orders"));
    this.rpS = this.ui.getString("key_bank_phone");
    this.ica = new com.tencent.mm.plugin.ae.a(this);
    this.ica.oWG = getResources().getStringArray(a.b.slQ);
    this.ica.oWE = new a.a()
    {
      public final void qo(String paramAnonymousString)
      {
        GMTrace.i(6964021035008L, 51886);
        WalletVerifyCodeUI.this.rpP.setText(paramAnonymousString);
        GMTrace.o(6964021035008L, 51886);
      }
    };
    this.ica.start();
    this.rpX = new com.tencent.mm.plugin.wallet_core.model.g(this.ui);
    this.rpT = false;
    bzV();
    MP();
    paramBundle = com.tencent.mm.plugin.report.service.g.ork;
    int i;
    if ((this.qYU != null) && (this.qYU.ePL != 0))
    {
      i = 1;
      if (!this.rpT) {
        break label436;
      }
      label180:
      paramBundle.i(10706, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      c.bAa();
      c.b(this, this.ui, 4);
      if (!this.rpX.byk()) {
        break label441;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(13731, new Object[] { Integer.valueOf(5) });
      this.ui.putBoolean("key_block_bind_new_card", true);
      if (!bg.nm(this.rpX.rfy.title)) {
        sq(this.rpX.rfy.title);
      }
      findViewById(a.f.ssT).setVisibility(8);
      ((TextView)findViewById(a.f.ssU)).setText(this.rpX.rfy.xDa);
      if (this.rpV != null)
      {
        paramBundle = bzU();
        this.rpV.setText(bg.i(this.rpX.rfy.xDb, new Object[] { paramBundle }));
        this.rpV.setGravity(1);
      }
      if ((this.qXb != null) && (!bg.nm(this.rpX.rfy.xDc))) {
        this.qXb.setText(this.rpX.rfy.xDc);
      }
    }
    for (;;)
    {
      this.xEL.hN(1580);
      GMTrace.o(6971000356864L, 51938);
      return;
      i = 2;
      break;
      label436:
      j = 1;
      break label180;
      label441:
      findViewById(a.f.ssT).setVisibility(8);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6972342534144L, 51948);
    if (this.ica != null) {
      this.ica.stop();
    }
    this.xEL.hO(1580);
    super.onDestroy();
    GMTrace.o(6972342534144L, 51948);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6972074098688L, 51946);
    if (this.ica != null) {
      this.ica.stop();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6972074098688L, 51946);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(6972610969600L, 51950);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.WalletVertifyCodeUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(6972610969600L, 51950);
        return;
      }
    }
    w.i("MicroMsg.WalletVertifyCodeUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6972610969600L, 51950);
      return;
      if ((paramArrayOfInt[0] == 0) && (this.ica != null)) {
        this.ica.start();
      }
    }
  }
  
  final class a
    extends CountDownTimer
  {
    public a(long paramLong)
    {
      super(1000L);
      GMTrace.i(6946035859456L, 51752);
      GMTrace.o(6946035859456L, 51752);
    }
    
    public final void onFinish()
    {
      GMTrace.i(6946304294912L, 51754);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setClickable(true);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setEnabled(true);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setText(WalletVerifyCodeUI.this.getString(a.i.tgY));
      GMTrace.o(6946304294912L, 51754);
    }
    
    public final void onTick(long paramLong)
    {
      GMTrace.i(6946170077184L, 51753);
      WalletVerifyCodeUI.d(WalletVerifyCodeUI.this).setText(WalletVerifyCodeUI.this.getString(a.i.tgY) + "(" + paramLong / 1000L + ")");
      GMTrace.o(6946170077184L, 51753);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletVerifyCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */