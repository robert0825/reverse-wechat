package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.qn;
import com.tencent.mm.plugin.wallet.pwd.a.i;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

public class WalletLockCheckPwdUI
  extends WalletBaseUI
{
  private TextView qDi;
  private j qVT;
  private EditHintPasswdView rbi;
  private int rbj;
  private String uC;
  
  public WalletLockCheckPwdUI()
  {
    GMTrace.i(19541966979072L, 145599);
    this.rbj = -1;
    GMTrace.o(19541966979072L, 145599);
  }
  
  private void dv(int paramInt1, int paramInt2)
  {
    GMTrace.i(19542772285440L, 145605);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    setResult(-1, localIntent);
    finish();
    GMTrace.o(19542772285440L, 145605);
  }
  
  private void s(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(19542906503168L, 145606);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt);
    localIntent.putExtra("key_token", paramString1);
    localIntent.putExtra("key_type", paramString2);
    setResult(-1, localIntent);
    finish();
    GMTrace.o(19542906503168L, 145606);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19543040720896L, 145607);
    w.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof j))
    {
      paramk = (j)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ("next_action.switch_on_pattern".equals(getIntent().getStringExtra("next_action")))
        {
          w.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo start to open wallet lock after check pwd");
          paramString = new Intent();
          paramString.putExtra("action", "action.switch_on_pattern");
          paramString.putExtra("next_action", "next_action.switch_on_pattern");
          paramString.putExtra("token", paramk.token);
          paramString.putExtra("type", paramk.rcp);
          paramString.putExtra("key_wallet_lock_type", this.rbj);
          paramString.setPackage(ab.getPackageName());
          if (this.rbj == 2) {
            paramString.putExtra("key_pay_passwd", this.rbi.getText());
          }
          paramk = new qn();
          paramk.eVs.eVu = paramString;
          paramk.eVs.eNu = this;
          paramk.eVs.eLN = 1;
          com.tencent.mm.sdk.b.a.vgX.m(paramk);
        }
        for (;;)
        {
          GMTrace.o(19543040720896L, 145607);
          return true;
          s(0, paramk.token, paramk.rcp);
        }
      }
      if ((paramInt1 == 1000) && (paramInt2 == 3))
      {
        s(-1, null, null);
        GMTrace.o(19543040720896L, 145607);
        return true;
      }
    }
    else
    {
      if ((paramk instanceof i))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          dv(-1, 0);
        }
        for (;;)
        {
          GMTrace.o(19543040720896L, 145607);
          return true;
          dv(-1, -1);
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet.pwd.a.a))
      {
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label350;
        }
        dv(-1, 0);
      }
    }
    for (;;)
    {
      GMTrace.o(19543040720896L, 145607);
      return false;
      label350:
      dv(-1, -1);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19542503849984L, 145603);
    int i = a.g.sPi;
    GMTrace.o(19542503849984L, 145603);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    GMTrace.i(19543174938624L, 145608);
    if (paramIntent == null) {}
    for (;;)
    {
      w.v("MicroMsg.WalletLockCheckPwdUI", "alvinluo WalletLockCheckPwdUI onActivityResult requestCode: %d, resultCode: %d, data == null: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      setResult(paramInt2, paramIntent);
      finish();
      GMTrace.o(19543174938624L, 145608);
      return;
      bool = false;
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(19542369632256L, 145602);
    w.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo onBackPressed");
    dv(-1, 4);
    GMTrace.o(19542369632256L, 145602);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19542101196800L, 145600);
    super.onCreate(paramBundle);
    oM(a.i.tbb);
    this.rbj = getIntent().getIntExtra("key_wallet_lock_type", -1);
    this.uC = getIntent().getStringExtra("action");
    w.v("MicroMsg.WalletLockCheckPwdUI", "alvinluo wallet lock type: %d, action: %s", new Object[] { Integer.valueOf(this.rbj), this.uC });
    this.rbi = ((EditHintPasswdView)findViewById(a.f.swd));
    this.qDi = ((TextView)findViewById(a.f.swf));
    this.qDi.setText(a.i.tba);
    paramBundle = getIntent().getStringExtra("key_wallet_lock_input_new_fp_tips");
    if (this.rbj == 2)
    {
      oM(a.i.thB);
      if ((this.uC.equals("action.touchlock_need_verify_paypwd")) && (!bg.nm(paramBundle))) {
        this.qDi.setText(paramBundle);
      }
    }
    for (;;)
    {
      this.rbi.xFp = new EditHintPasswdView.a()
      {
        public final void gR(boolean paramAnonymousBoolean)
        {
          int i = 8;
          GMTrace.i(19538074664960L, 145570);
          if (paramAnonymousBoolean)
          {
            if (WalletLockCheckPwdUI.b(WalletLockCheckPwdUI.this) == null)
            {
              GMTrace.o(19538074664960L, 145570);
              return;
            }
            if (WalletLockCheckPwdUI.b(WalletLockCheckPwdUI.this).equals("action.close_wallet_lock"))
            {
              WalletLockCheckPwdUI.c(WalletLockCheckPwdUI.this);
              GMTrace.o(19538074664960L, 145570);
              return;
            }
            if (WalletLockCheckPwdUI.b(WalletLockCheckPwdUI.this).equals("action.verify_paypwd"))
            {
              if (WalletLockCheckPwdUI.d(WalletLockCheckPwdUI.this) == 1) {
                i = 6;
              }
              for (;;)
              {
                WalletLockCheckPwdUI.a(WalletLockCheckPwdUI.this, new j(WalletLockCheckPwdUI.e(WalletLockCheckPwdUI.this).getText(), i, WalletLockCheckPwdUI.this.bxg()));
                WalletLockCheckPwdUI.this.r(WalletLockCheckPwdUI.f(WalletLockCheckPwdUI.this));
                GMTrace.o(19538074664960L, 145570);
                return;
                if (WalletLockCheckPwdUI.d(WalletLockCheckPwdUI.this) != 2) {
                  i = -1;
                }
              }
            }
            if (WalletLockCheckPwdUI.b(WalletLockCheckPwdUI.this).equals("action.touchlock_verify_by_paypwd"))
            {
              i locali = new i(WalletLockCheckPwdUI.e(WalletLockCheckPwdUI.this).getText());
              WalletLockCheckPwdUI.this.r(locali);
              GMTrace.o(19538074664960L, 145570);
              return;
            }
            if (WalletLockCheckPwdUI.b(WalletLockCheckPwdUI.this).equals("action.touchlock_need_verify_paypwd")) {
              if (WalletLockCheckPwdUI.d(WalletLockCheckPwdUI.this) != 2) {
                break label298;
              }
            }
          }
          for (;;)
          {
            WalletLockCheckPwdUI.a(WalletLockCheckPwdUI.this, new j(WalletLockCheckPwdUI.e(WalletLockCheckPwdUI.this).getText(), i, WalletLockCheckPwdUI.this.bxg()));
            WalletLockCheckPwdUI.this.r(WalletLockCheckPwdUI.f(WalletLockCheckPwdUI.this));
            GMTrace.o(19538074664960L, 145570);
            return;
            label298:
            i = -1;
          }
        }
      };
      e(this.rbi, 0, false);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19539819495424L, 145583);
          w.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo cancel by BackBtn");
          WalletLockCheckPwdUI.a(WalletLockCheckPwdUI.this);
          GMTrace.o(19539819495424L, 145583);
          return true;
        }
      });
      GMTrace.o(19542101196800L, 145600);
      return;
      if (this.rbj == 1) {
        oM(a.i.thC);
      }
    }
  }
  
  public void onResume()
  {
    GMTrace.i(19542235414528L, 145601);
    super.onResume();
    if (this.rbi != null) {
      this.rbi.baC();
    }
    GMTrace.o(19542235414528L, 145601);
  }
  
  public final void so(int paramInt)
  {
    GMTrace.i(19542638067712L, 145604);
    super.so(paramInt);
    this.rbi.baC();
    GMTrace.o(19542638067712L, 145604);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletLockCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */