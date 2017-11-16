package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet.pwd.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletResetPwdAdapterUI
  extends WalletBaseUI
{
  protected String fKP;
  protected boolean onc;
  protected com.tencent.mm.plugin.wallet.a ond;
  protected String rbx;
  
  public WalletResetPwdAdapterUI()
  {
    GMTrace.i(18429436231680L, 137310);
    this.fKP = null;
    this.onc = false;
    this.ond = null;
    this.rbx = "";
    GMTrace.o(18429436231680L, 137310);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(18430107320320L, 137315);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        paramString = new Bundle();
        paramString.putString("kreq_token", this.rbx);
        com.tencent.mm.wallet_core.a.a(this, c.class, paramString, null);
        GMTrace.o(18430107320320L, 137315);
        return true;
      }
    }
    else
    {
      setResult(64536);
      h.bm(this, paramString);
      finish();
      GMTrace.o(18430107320320L, 137315);
      return true;
    }
    GMTrace.o(18430107320320L, 137315);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18430241538048L, 137316);
    GMTrace.o(18430241538048L, 137316);
    return -1;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(18429973102592L, 137314);
    if (!this.onc)
    {
      w.d("MicroMsg.WalletResetPwdAdapterUI", "back press not lock");
      finish();
      GMTrace.o(18429973102592L, 137314);
      return;
    }
    w.d("MicroMsg.WalletResetPwdAdapterUI", "back press but lock");
    GMTrace.o(18429973102592L, 137314);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18429570449408L, 137311);
    super.onCreate(paramBundle);
    sv(8);
    this.rbx = getIntent().getStringExtra("reset_pwd_token");
    w.i("MicroMsg.WalletResetPwdAdapterUI", "token_by_resetPwd %s", new Object[] { this.rbx });
    hN(580);
    if (getIntent() == null)
    {
      w.d("MicroMsg.WalletResetPwdAdapterUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      GMTrace.o(18429570449408L, 137311);
      return;
    }
    paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3);
    paramBundle.fXf = "RemittanceProcess";
    r(paramBundle);
    GMTrace.o(18429570449408L, 137311);
  }
  
  public void onDestroy()
  {
    GMTrace.i(18429838884864L, 137313);
    hO(580);
    super.onDestroy();
    GMTrace.o(18429838884864L, 137313);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(18429704667136L, 137312);
    w.v("MicroMsg.WalletResetPwdAdapterUI", "onNewIntent");
    int i = paramIntent.getIntExtra("RESET_PWD_USER_ACTION", 0);
    if (i == 1)
    {
      setResult(-1);
      finish();
      GMTrace.o(18429704667136L, 137312);
      return;
    }
    if (i == 2)
    {
      setResult(64536);
      finish();
      GMTrace.o(18429704667136L, 137312);
      return;
    }
    setResult(0);
    finish();
    GMTrace.o(18429704667136L, 137312);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletResetPwdAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */