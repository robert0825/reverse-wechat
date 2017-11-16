package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletRealNameProcessProxyUI
  extends WalletBaseUI
{
  public WalletRealNameProcessProxyUI()
  {
    GMTrace.i(6859465424896L, 51107);
    GMTrace.o(6859465424896L, 51107);
  }
  
  private void L(Bundle paramBundle)
  {
    GMTrace.i(6859868078080L, 51110);
    w.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI");
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
    {
      w.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI, param is null");
      localBundle = new Bundle();
    }
    localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
    localBundle.putString("realname_verify_process_jump_activity", ".id_verify.WalletRealNameProcessProxyUI");
    localBundle.putBoolean("process_finish_stay_orgpage", false);
    com.tencent.mm.wallet_core.a.a(this, a.class, localBundle);
    GMTrace.o(6859868078080L, 51110);
  }
  
  public final boolean aNg()
  {
    GMTrace.i(6860404948992L, 51114);
    GMTrace.o(6860404948992L, 51114);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6860136513536L, 51112);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      w.e("MicroMsg.WalletRealNameProcessProxyUI", "NetSceneCheckPayJsapi resp,errType = " + paramInt1 + ",errCode=" + paramInt2);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        L(this.ui);
        GMTrace.o(6860136513536L, 51112);
        return true;
      }
    }
    GMTrace.o(6860136513536L, 51112);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6860002295808L, 51111);
    GMTrace.o(6860002295808L, 51111);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6859599642624L, 51108);
    super.onCreate(paramBundle);
    hN(580);
    paramBundle = this.ui;
    if (paramBundle != null) {}
    for (int i = paramBundle.getInt("realname_scene", 0);; i = 0)
    {
      int j = i;
      if (i == 0) {
        j = getIntent().getIntExtra("realname_scene", 0);
      }
      if (j == 1)
      {
        w.i("MicroMsg.WalletRealNameProcessProxyUI", "from jsapi, do NetSceneCheckPayJsapi");
        if (getIntent() == null)
        {
          paramBundle = "";
          if (bg.nm("")) {
            paramBundle = getString(a.i.tgK);
          }
          h.a(this, paramBundle, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6855841546240L, 51080);
              WalletRealNameProcessProxyUI.this.setResult(1);
              WalletRealNameProcessProxyUI.this.finish();
              GMTrace.o(6855841546240L, 51080);
            }
          });
          GMTrace.o(6859599642624L, 51108);
          return;
        }
        paramBundle = getIntent().getStringExtra("appId");
        String str1 = getIntent().getStringExtra("timeStamp");
        String str2 = getIntent().getStringExtra("nonceStr");
        String str3 = getIntent().getStringExtra("packageExt");
        String str4 = getIntent().getStringExtra("signtype");
        String str5 = getIntent().getStringExtra("paySignature");
        String str6 = getIntent().getStringExtra("url");
        i = 8;
        if (this.ui.getInt("realname_scene") == 2) {
          i = 12;
        }
        r(new com.tencent.mm.plugin.wallet_core.c.a(paramBundle, str1, str2, str3, str4, str5, str6, i));
        GMTrace.o(6859599642624L, 51108);
        return;
      }
      L(paramBundle);
      GMTrace.o(6859599642624L, 51108);
      return;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6860539166720L, 51115);
    super.onDestroy();
    hO(580);
    GMTrace.o(6860539166720L, 51115);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(6860270731264L, 51113);
    w.i("MicroMsg.WalletRealNameProcessProxyUI", "onNewIntent");
    paramIntent = getIntent().getExtras();
    if ((paramIntent != null) && (paramIntent.getBoolean("key_is_realname_verify_process"))) {
      switch (paramIntent.getInt("realname_verify_process_ret", 0))
      {
      default: 
        setResult(0);
      }
    }
    for (;;)
    {
      finish();
      GMTrace.o(6860270731264L, 51113);
      return;
      setResult(-1);
      break;
      setResult(0);
    }
  }
  
  public void onResume()
  {
    GMTrace.i(6859733860352L, 51109);
    super.onResume();
    GMTrace.o(6859733860352L, 51109);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\WalletRealNameProcessProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */