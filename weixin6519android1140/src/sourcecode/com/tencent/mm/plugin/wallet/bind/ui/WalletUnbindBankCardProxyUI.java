package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class WalletUnbindBankCardProxyUI
  extends WalletBaseUI
{
  private String qXj;
  private Bankcard qXk;
  private Map<String, String> qXl;
  
  public WalletUnbindBankCardProxyUI()
  {
    GMTrace.i(7685978193920L, 57265);
    GMTrace.o(7685978193920L, 57265);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7686246629376L, 57267);
    GMTrace.o(7686246629376L, 57267);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7686380847104L, 57268);
    GMTrace.o(7686380847104L, 57268);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7686112411648L, 57266);
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    setResult(0);
    if (localIntent != null)
    {
      this.qXj = localIntent.getStringExtra("packageExt");
      if (!bg.nm(this.qXj))
      {
        paramBundle = this.qXj;
        Object localObject;
        if (!bg.nm(paramBundle))
        {
          String[] arrayOfString = paramBundle.split("&");
          localObject = new HashMap();
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            int j = arrayOfString.length;
            int i = 0;
            for (;;)
            {
              paramBundle = (Bundle)localObject;
              if (i >= j) {
                break;
              }
              String str = arrayOfString[i];
              if (!bg.nm(str))
              {
                int k = str.indexOf("=");
                paramBundle = str.substring(0, k);
                str = str.substring(k + 1, str.length());
                if ((!bg.nm(paramBundle)) && (!bg.nm(str))) {
                  ((Map)localObject).put(paramBundle, str);
                }
              }
              i += 1;
            }
          }
        }
        paramBundle = null;
        this.qXl = paramBundle;
        if ((this.qXl.containsKey("bank_type")) && (this.qXl.containsKey("bind_serial")))
        {
          paramBundle = n.byv();
          localObject = (String)this.qXl.get("bind_serial");
          localObject = "select * from WalletBankcard where bindSerial = '" + (String)localObject + "'";
          localObject = paramBundle.fTZ.a((String)localObject, null, 2);
          paramBundle = null;
          if (((Cursor)localObject).moveToNext())
          {
            paramBundle = new Bankcard();
            paramBundle.b((Cursor)localObject);
          }
          ((Cursor)localObject).close();
          this.qXk = paramBundle;
          if (this.qXk == null)
          {
            w.e("MicorMsg.WalletUnbindBankCardProxyUI", "can not found bankcard");
            setResult(0);
            finish();
            GMTrace.o(7686112411648L, 57266);
            return;
          }
          localIntent.putExtra("key_is_show_detail", false);
          localIntent.putExtra("key_bankcard", this.qXk);
          localIntent.putExtra("scene", 1);
          com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.bind.a.class, localIntent.getExtras(), new b.a()
          {
            public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
            {
              GMTrace.i(7686783500288L, 57271);
              switch (paramAnonymousInt)
              {
              }
              for (;;)
              {
                GMTrace.o(7686783500288L, 57271);
                return null;
                WalletUnbindBankCardProxyUI.this.setResult(0);
                continue;
                WalletUnbindBankCardProxyUI.this.setResult(-1);
                continue;
                WalletUnbindBankCardProxyUI.this.setResult(1);
              }
            }
          });
          GMTrace.o(7686112411648L, 57266);
          return;
        }
        w.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.qXj);
        setResult(1);
        finish();
        GMTrace.o(7686112411648L, 57266);
        return;
      }
      w.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param error");
      setResult(1);
      finish();
      GMTrace.o(7686112411648L, 57266);
      return;
    }
    w.e("MicorMsg.WalletUnbindBankCardProxyUI", "intent is null");
    finish();
    GMTrace.o(7686112411648L, 57266);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7686515064832L, 57269);
    finish();
    GMTrace.o(7686515064832L, 57269);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\WalletUnbindBankCardProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */