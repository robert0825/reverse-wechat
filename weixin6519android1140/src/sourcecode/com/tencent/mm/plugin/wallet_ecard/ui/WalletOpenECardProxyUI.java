package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class WalletOpenECardProxyUI
  extends WalletECardBaseUI
{
  public WalletOpenECardProxyUI()
  {
    GMTrace.i(19579279507456L, 145877);
    GMTrace.o(19579279507456L, 145877);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19579547942912L, 145879);
    GMTrace.o(19579547942912L, 145879);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19579682160640L, 145880);
    GMTrace.o(19579682160640L, 145880);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19579816378368L, 145881);
    w.i("MicroMsg.WalletOpenECardProxyUI", "activity result, request:%s, result: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        setResult(0);
        paramIntent = cmp();
        if (paramIntent != null)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("key_process_result_code", 0);
          paramIntent.k(this, localBundle);
          GMTrace.o(19579816378368L, 145881);
          return;
        }
        finish();
        GMTrace.o(19579816378368L, 145881);
      }
    }
    else {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(19579816378368L, 145881);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19579413725184L, 145878);
    super.onCreate(paramBundle);
    sv(4);
    paramBundle = cmp();
    if (paramBundle != null) {
      paramBundle.a(this.vKB.vKW, WalletCheckPwdUI.class, this.ui, 1);
    }
    GMTrace.o(19579413725184L, 145878);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(19579950596096L, 145882);
    super.onNewIntent(paramIntent);
    int i = paramIntent.getIntExtra("key_process_result_code", -1);
    boolean bool = paramIntent.getBooleanExtra("key_process_is_end", false);
    w.i("MicroMsg.WalletOpenECardProxyUI", "new intent, resultCode: %d, isEnd: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
    if (i == -1) {
      setResult(-1);
    }
    for (;;)
    {
      paramIntent = cmp();
      if (!bool) {
        break;
      }
      finish();
      GMTrace.o(19579950596096L, 145882);
      return;
      setResult(0);
    }
    if (paramIntent != null) {
      paramIntent.ae(this.vKB.vKW);
    }
    GMTrace.o(19579950596096L, 145882);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\ui\WalletOpenECardProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */