package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.asw;
import com.tencent.mm.protocal.c.mj;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.wallet_core.c.t;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

@com.tencent.mm.ui.base.a(3)
public class WalletCheckPwdUI
  extends WalletBaseUI
{
  private String llm;
  public EditHintPasswdView qVS;
  private boolean rmu;
  private boolean rmv;
  private boolean rmw;
  private String rmx;
  
  public WalletCheckPwdUI()
  {
    GMTrace.i(6988717096960L, 52070);
    this.rmu = false;
    this.rmv = false;
    this.rmw = false;
    GMTrace.o(6988717096960L, 52070);
  }
  
  protected final void MP()
  {
    GMTrace.i(6989656621056L, 52077);
    TextView localTextView = (TextView)findViewById(a.f.swf);
    CharSequence localCharSequence = se(0);
    if (!bg.L(localCharSequence))
    {
      localTextView.setText(localCharSequence);
      if ((localCharSequence instanceof SpannableString)) {
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
      }
    }
    for (;;)
    {
      this.qVS = ((EditHintPasswdView)findViewById(a.f.swd));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.qVS);
      this.qVS.xFp = new EditHintPasswdView.a()
      {
        public final void gR(boolean paramAnonymousBoolean)
        {
          GMTrace.i(20877836025856L, 155552);
          if (paramAnonymousBoolean)
          {
            WalletCheckPwdUI.a(WalletCheckPwdUI.this, WalletCheckPwdUI.this.qVS.getText());
            com.tencent.mm.wallet_core.b localb = com.tencent.mm.wallet_core.a.ad(WalletCheckPwdUI.this);
            String str = null;
            if (localb != null) {
              str = localb.aAd();
            }
            if ((WalletCheckPwdUI.b(WalletCheckPwdUI.this)) && (!"UnbindProcess".equals(str)))
            {
              WalletCheckPwdUI.this.l(new com.tencent.mm.plugin.wallet_core.c.k(WalletCheckPwdUI.c(WalletCheckPwdUI.this), WalletCheckPwdUI.d(WalletCheckPwdUI.this)));
              GMTrace.o(20877836025856L, 155552);
              return;
            }
            if (!WalletCheckPwdUI.this.cmq().j(new Object[] { WalletCheckPwdUI.c(WalletCheckPwdUI.this), WalletCheckPwdUI.this.bxg() })) {
              WalletCheckPwdUI.this.l(new com.tencent.mm.plugin.wallet_core.c.j(WalletCheckPwdUI.c(WalletCheckPwdUI.this), 1, WalletCheckPwdUI.this.bxg()));
            }
          }
          GMTrace.o(20877836025856L, 155552);
        }
      };
      e(this.qVS, 0, false);
      GMTrace.o(6989656621056L, 52077);
      return;
      localTextView.setText(a.i.tba);
    }
  }
  
  public int Qf()
  {
    GMTrace.i(6990461927424L, 52083);
    GMTrace.o(6990461927424L, 52083);
    return 1;
  }
  
  protected final void aMc()
  {
    GMTrace.i(6989119750144L, 52073);
    w.d("Micromsg.WalletCheckPwdUI", "check pwd ");
    this.xEL.aMc();
    GMTrace.o(6989119750144L, 52073);
  }
  
  public final boolean aNg()
  {
    GMTrace.i(6990327709696L, 52082);
    boolean bool = this.rmu;
    GMTrace.o(6990327709696L, 52082);
    return bool;
  }
  
  public boolean bxq()
  {
    GMTrace.i(6990059274240L, 52080);
    if (this.ui.getInt("key_pay_flag", 0) != 0)
    {
      GMTrace.o(6990059274240L, 52080);
      return true;
    }
    GMTrace.o(6990059274240L, 52080);
    return false;
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(6989790838784L, 52078);
    w.d("Micromsg.WalletCheckPwdUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.j))
      {
        paramString = this.ui;
        paramString.putString("key_pwd1", this.qVS.getText());
        com.tencent.mm.wallet_core.a.i(this, paramString);
        if (this.qVS != null) {
          this.qVS.baC();
        }
        finish();
      }
      for (;;)
      {
        GMTrace.o(6989790838784L, 52078);
        return true;
        if ((paramk instanceof o))
        {
          h.bm(this, getString(a.i.tbe));
          paramString = com.tencent.mm.wallet_core.a.ad(this);
          if (paramString != null) {
            paramString.ler.putInt("key_process_result_code", -1);
          }
          com.tencent.mm.wallet_core.a.i(this, paramString.ler);
          if (this.qVS != null) {
            this.qVS.baC();
          }
          finish();
        }
        else
        {
          if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
          {
            this.rmx = ((com.tencent.mm.plugin.wallet_core.c.a)paramk).aWg();
            setResult(-1);
            paramString = ((mj)((com.tencent.mm.plugin.wallet_core.c.a)paramk).fUa.gtD.gtK).udl;
            if (((com.tencent.mm.plugin.wallet_core.c.a)paramk).yvp == 5)
            {
              findViewById(a.f.sKG).setVisibility(0);
              findViewById(a.f.swf).setVisibility(8);
              if ((paramString != null) && (!bg.nm(paramString.title)))
              {
                ((TextView)findViewById(a.f.sKH)).setText(paramString.title);
                label290:
                if ((paramString == null) || (bg.nm(paramString.uIN))) {
                  break label409;
                }
                ((TextView)findViewById(a.f.sKF)).setText(paramString.uIN);
                label321:
                if ((this.qVS.getLayoutParams() instanceof LinearLayout.LayoutParams))
                {
                  paramString = (LinearLayout.LayoutParams)this.qVS.getLayoutParams();
                  paramString.leftMargin = BackwardSupportUtil.b.a(this, 47.0F);
                  paramString.rightMargin = BackwardSupportUtil.b.a(this, 47.0F);
                  this.qVS.setLayoutParams(paramString);
                }
                this.vKB.bXF();
              }
            }
            for (;;)
            {
              sv(0);
              break;
              ((TextView)findViewById(a.f.sKH)).setText(a.i.yvB);
              break label290;
              label409:
              ((TextView)findViewById(a.f.sKF)).setText(a.i.yvA);
              break label321;
              bXu();
              findViewById(a.f.sKG).setVisibility(8);
            }
          }
          if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.k))
          {
            paramString = (com.tencent.mm.plugin.wallet_core.c.k)paramk;
            if (paramString.bxW())
            {
              w.i("Micromsg.WalletCheckPwdUI", "need free sms");
              paramk = new Bundle();
              paramk.putString("key_pwd1", this.llm);
              paramk.putString("key_jsapi_token", this.rmx);
              paramk.putString("key_relation_key", paramString.rct);
              paramk.putString("key_mobile", paramString.rcs);
              com.tencent.mm.wallet_core.a.a(this, j.class, paramk, new b.a()
              {
                public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
                {
                  GMTrace.i(20878641332224L, 155558);
                  Intent localIntent = new Intent();
                  localIntent.putExtra("token", paramAnonymousBundle.getString("key_jsapi_token"));
                  localIntent.putExtra("key_process_result_code", paramAnonymousInt);
                  localIntent.setClass(WalletCheckPwdUI.this.vKB.vKW, WalletCheckPwdUI.class);
                  localIntent.addFlags(536870912);
                  localIntent.putExtra("key_process_is_stay", false);
                  GMTrace.o(20878641332224L, 155558);
                  return localIntent;
                }
              });
            }
            else
            {
              paramString = new Intent();
              paramString.putExtra("token", ((com.tencent.mm.plugin.wallet_core.c.k)paramk).rcq);
              setResult(-1, paramString);
              finish();
            }
          }
        }
      }
    }
    if (this.qVS != null) {
      this.qVS.baC();
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      w.i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
      paramString = com.tencent.mm.wallet_core.a.ad(this);
      if ((paramString != null) && (paramString.aAd().equals("UnbindProcess")))
      {
        setResult(1);
        paramString.ler.putInt("key_process_result_code", 1);
        com.tencent.mm.wallet_core.a.i(this, paramString.ler);
      }
      for (;;)
      {
        GMTrace.o(6989790838784L, 52078);
        return true;
        setResult(0);
        finish();
      }
    }
    GMTrace.o(6989790838784L, 52078);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6988851314688L, 52071);
    int i = a.g.sPi;
    GMTrace.o(6988851314688L, 52071);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = -1;
    GMTrace.i(6988985532416L, 52072);
    super.onCreate(paramBundle);
    paramBundle = se(1);
    label70:
    Object localObject;
    if (!bg.L(paramBundle))
    {
      sq(paramBundle.toString());
      paramBundle = getIntent();
      if ((paramBundle == null) || (!getIntent().hasExtra("scene"))) {
        break label200;
      }
      i = paramBundle.getIntExtra("scene", -1);
      if (i != 1) {
        break label447;
      }
      this.rmv = true;
      w.d("Micromsg.WalletCheckPwdUI", "check pwd jsapi");
      this.vKB.bXF();
      paramBundle = null;
      if (!this.rmw) {
        break label254;
      }
      localObject = com.tencent.mm.wallet_core.a.ad(this);
      if (localObject != null) {
        paramBundle = ((com.tencent.mm.wallet_core.b)localObject).ler;
      }
      localObject = paramBundle;
      if (paramBundle != null) {
        break label290;
      }
      w.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] process.getContextData null");
      setResult(1);
      finish();
      label145:
      MP();
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7020795133952L, 52309);
          WalletCheckPwdUI.a(WalletCheckPwdUI.this);
          GMTrace.o(7020795133952L, 52309);
          return false;
        }
      });
      findViewById(a.f.sti).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20878775549952L, 155559);
          WalletCheckPwdUI.a(WalletCheckPwdUI.this);
          GMTrace.o(20878775549952L, 155559);
        }
      });
      GMTrace.o(6988985532416L, 52072);
      return;
      sq(t.fK(this));
      break;
      label200:
      paramBundle = com.tencent.mm.wallet_core.a.ad(this);
      if (paramBundle == null) {
        break label70;
      }
      i = paramBundle.ler.getInt("scene", -1);
      if ((i == 1) && ("UnbindProcess".equals(paramBundle.aAd()))) {}
      for (boolean bool = true;; bool = false)
      {
        this.rmw = bool;
        break;
      }
      label254:
      if (getIntent() == null)
      {
        w.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] intent null");
        setResult(0);
        finish();
        break label145;
      }
      localObject = getIntent().getExtras();
      label290:
      paramBundle = ((Bundle)localObject).getString("appId");
      String str1 = ((Bundle)localObject).getString("timeStamp");
      String str2 = ((Bundle)localObject).getString("nonceStr");
      String str3 = ((Bundle)localObject).getString("packageExt");
      String str4 = ((Bundle)localObject).getString("signtype");
      String str5 = ((Bundle)localObject).getString("paySignature");
      localObject = ((Bundle)localObject).getString("url");
      if (this.rmw) {
        w.i("Micromsg.WalletCheckPwdUI", "appId is null? " + bg.nm(paramBundle));
      }
      for (paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(paramBundle, str1, str2, str3, str4, str5, (String)localObject, 10);; paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(paramBundle, str1, str2, str3, str4, str5, (String)localObject, 5))
      {
        r(paramBundle);
        break;
      }
      label447:
      sv(0);
      bXu();
      if (!this.ui.getBoolean("key_is_expired_bankcard", false)) {
        MP();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6989522403328L, 52076);
    super.onDestroy();
    GMTrace.o(6989522403328L, 52076);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6989925056512L, 52079);
    if ((this.mLL != null) && (this.mLL.isShown()))
    {
      this.mLL.setVisibility(8);
      GMTrace.o(6989925056512L, 52079);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6989925056512L, 52079);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(6989388185600L, 52075);
    super.onPause();
    hO(580);
    GMTrace.o(6989388185600L, 52075);
  }
  
  public void onResume()
  {
    GMTrace.i(6989253967872L, 52074);
    if (this.qVS != null) {
      this.qVS.baC();
    }
    hN(580);
    super.onResume();
    GMTrace.o(6989253967872L, 52074);
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(6990193491968L, 52081);
    if (this.rmu)
    {
      finish();
      GMTrace.o(6990193491968L, 52081);
      return;
    }
    if (this.qVS != null) {
      this.qVS.baC();
    }
    GMTrace.o(6990193491968L, 52081);
  }
  
  public final void sv(int paramInt)
  {
    GMTrace.i(20878238679040L, 155555);
    this.vKB.hqF.setVisibility(paramInt);
    GMTrace.o(20878238679040L, 155555);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */