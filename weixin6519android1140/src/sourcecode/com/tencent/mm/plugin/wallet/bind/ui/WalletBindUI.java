package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(7)
public class WalletBindUI
  extends WalletBaseUI
{
  private PayInfo oek;
  private boolean qWU;
  private String qWV;
  private int qWW;
  private com.tencent.mm.plugin.wallet_core.c.a qWX;
  private boolean qWY;
  com.tencent.mm.sdk.b.c qWZ;
  private String token;
  
  public WalletBindUI()
  {
    GMTrace.i(7686917718016L, 57272);
    this.oek = new PayInfo();
    this.qWU = false;
    this.qWW = -1;
    this.token = null;
    this.qWX = null;
    this.qWY = false;
    this.qWZ = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7686917718016L, 57272);
  }
  
  private void bwY()
  {
    GMTrace.i(7687186153472L, 57274);
    this.qWV = getIntent().getStringExtra("key_import_key");
    this.qWW = getIntent().getIntExtra("key_bind_scene", -1);
    this.oek.ePM = this.qWW;
    this.ui.putParcelable("key_pay_info", this.oek);
    if (this.qWW == 2)
    {
      if (!bg.nm(this.qWV))
      {
        w.d("MicroMsg.WalletBindUI", "importKey " + this.qWV);
        r(new com.tencent.mm.plugin.wallet.bind.a.c(this.qWV, this.oek));
        GMTrace.o(7687186153472L, 57274);
        return;
      }
      wr("");
      GMTrace.o(7687186153472L, 57274);
      return;
    }
    if (this.qWW == 4)
    {
      com.tencent.mm.wallet_core.c.o.EL(4);
      if (getIntent() == null)
      {
        wr("");
        GMTrace.o(7687186153472L, 57274);
        return;
      }
      this.qWX = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"));
      r(this.qWX);
      GMTrace.o(7687186153472L, 57274);
      return;
    }
    if (this.qWW == 6)
    {
      bxa();
      GMTrace.o(7687186153472L, 57274);
      return;
    }
    bwZ();
    GMTrace.o(7687186153472L, 57274);
  }
  
  private void bwZ()
  {
    GMTrace.i(7687320371200L, 57275);
    w.i("MicroMsg.WalletBindUI", "doBindCardForOtherScene " + bg.bQW().toString());
    Bundle localBundle = this.ui;
    localBundle.putParcelable("key_pay_info", this.oek);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putString("key_custom_bind_tips", getIntent().getStringExtra("key_custom_bind_tips"));
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (com.tencent.mm.plugin.wallet.a.p.bxe().byR())
    {
      w.i("MicroMsg.WalletBindUI", "user status invalid");
      r(new com.tencent.mm.plugin.wallet_core.c.o(null));
      GMTrace.o(7687320371200L, 57275);
      return;
    }
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (com.tencent.mm.plugin.wallet.a.p.bxe().byS())
    {
      w.i("MicroMsg.WalletBindUI", "user status reg");
      this.qWU = true;
      this.oek.ePM = this.qWW;
      localBundle.putInt("key_bind_scene", this.oek.ePM);
      if (!bg.nm(this.token)) {
        localBundle.putString("kreq_token", this.token);
      }
      com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, null);
      GMTrace.o(7687320371200L, 57275);
      return;
    }
    w.i("MicroMsg.WalletBindUI", "user status unreg");
    this.qWU = true;
    if (this.qWW >= 0) {}
    for (this.oek.ePM = this.qWW;; this.oek.ePM = 1)
    {
      localBundle.putInt("key_bind_scene", this.oek.ePM);
      com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, null);
      GMTrace.o(7687320371200L, 57275);
      return;
    }
  }
  
  private void bxa()
  {
    GMTrace.i(7687454588928L, 57276);
    com.tencent.mm.plugin.wallet.a.p.bxd();
    if (com.tencent.mm.plugin.wallet.a.p.bxe().byR())
    {
      r(new com.tencent.mm.plugin.wallet_core.c.o(null));
      GMTrace.o(7687454588928L, 57276);
      return;
    }
    Object localObject1 = getIntent().getStringExtra("packageExt");
    Object localObject3 = ((String)localObject1).split("&");
    if ((!bg.nm((String)localObject1)) && (localObject3.length >= 2))
    {
      int j = localObject3.length;
      int i = 0;
      localObject1 = null;
      String str = null;
      Object localObject2;
      if (i < j)
      {
        Object localObject4 = localObject3[i];
        if (((String)localObject4).startsWith("bankType=")) {
          localObject2 = ((String)localObject4).replace("bankType=", "");
        }
        for (;;)
        {
          i += 1;
          localObject1 = localObject2;
          break;
          localObject2 = localObject1;
          if (((String)localObject4).startsWith("bankName="))
          {
            str = ((String)localObject4).replace("bankName=", "");
            localObject2 = localObject1;
          }
        }
      }
      if ((!bg.nm(str)) && (!bg.nm((String)localObject1)))
      {
        com.tencent.mm.plugin.wallet.a.p.bxd();
        if (com.tencent.mm.plugin.wallet.a.p.bxe().Kj((String)localObject1))
        {
          localObject2 = new Bundle();
          localObject3 = new Bankcard();
          ((Bankcard)localObject3).field_bankName = str;
          ((Bankcard)localObject3).field_bankcardType = ((String)localObject1);
          ((Bundle)localObject2).putParcelable("key_bankcard", (Parcelable)localObject3);
          ((Bundle)localObject2).putString("key_bank_type", ((Bankcard)localObject3).field_bankcardType);
          com.tencent.mm.wallet_core.a.a(this, "WXCreditOpenProcess", (Bundle)localObject2, null);
          GMTrace.o(7687454588928L, 57276);
          return;
        }
      }
    }
    finish();
    GMTrace.o(7687454588928L, 57276);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(7688662548480L, 57285);
    String str = paramString;
    if (bg.nm(paramString)) {
      str = getString(a.i.tgK);
    }
    h.a(this, str, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7690944249856L, 57302);
        WalletBindUI.this.finish();
        GMTrace.o(7690944249856L, 57302);
      }
    });
    GMTrace.o(7688662548480L, 57285);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7688796766208L, 57286);
    GMTrace.o(7688796766208L, 57286);
    return 1;
  }
  
  public final boolean aNk()
  {
    GMTrace.i(7688394113024L, 57283);
    GMTrace.o(7688394113024L, 57283);
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7687857242112L, 57279);
    if ((paramk instanceof com.tencent.mm.plugin.wallet.bind.a.c)) {
      this.qWU = true;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.o))
      {
        if (this.qWW == 6) {
          bxa();
        }
        for (;;)
        {
          GMTrace.o(7687857242112L, 57279);
          return true;
          bwY();
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet.bind.a.c))
      {
        paramk = (com.tencent.mm.plugin.wallet.bind.a.c)paramk;
        Bundle localBundle = this.ui;
        localBundle.putBoolean("key_is_import_bind", true);
        if ((paramk.qTU != null) && (paramk.qTU.size() > 0))
        {
          paramString = (Bankcard)paramk.qTU.get(0);
          if (!paramString.reR)
          {
            localBundle.putBoolean("key_need_bind_response", true);
            localBundle.putString("kreq_token", paramk.token);
            localBundle.putString("key_bank_username", paramk.qWa);
            localBundle.putString("key_recommand_desc", paramk.qWb);
            localBundle.putParcelable("key_import_bankcard", paramString);
            this.qWU = true;
            localBundle.putInt("key_bind_scene", 2);
            com.tencent.mm.wallet_core.a.a(this, b.class, localBundle, new b.a()
            {
              public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
              {
                GMTrace.i(7685441323008L, 57261);
                paramAnonymousBundle = new Intent(WalletBindUI.this.vKB.vKW, WalletBankcardManageUI.class);
                GMTrace.o(7685441323008L, 57261);
                return paramAnonymousBundle;
              }
            });
          }
        }
        for (;;)
        {
          GMTrace.o(7687857242112L, 57279);
          return true;
          h.a(this, a.i.taA, 0, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7692286427136L, 57312);
              WalletBindUI.this.finish();
              GMTrace.o(7692286427136L, 57312);
            }
          });
          continue;
          paramk = paramString;
          if (bg.nm(paramString)) {
            paramk = getString(a.i.sZY);
          }
          h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7684904452096L, 57257);
              WalletBindUI.this.finish();
              GMTrace.o(7684904452096L, 57257);
            }
          });
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        if ((this.qWX != null) && (this.qWX.equals(paramk)))
        {
          this.token = ((com.tencent.mm.plugin.wallet_core.c.a)paramk).aWg();
          bwZ();
          GMTrace.o(7687857242112L, 57279);
          return true;
        }
        com.tencent.mm.wallet_core.c.o.clP();
      }
      GMTrace.o(7687857242112L, 57279);
      return false;
    }
    wr(paramString);
    GMTrace.o(7687857242112L, 57279);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7688259895296L, 57282);
    GMTrace.o(7688259895296L, 57282);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7687051935744L, 57273);
    super.onCreate(paramBundle);
    hN(580);
    paramBundle = new sn();
    paramBundle.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7684636016640L, 57255);
        if (!WalletBindUI.a(WalletBindUI.this)) {
          WalletBindUI.b(WalletBindUI.this);
        }
        WalletBindUI.c(WalletBindUI.this);
        GMTrace.o(7684636016640L, 57255);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(paramBundle);
    com.tencent.mm.sdk.b.a.vgX.b(this.qWZ);
    com.tencent.mm.wallet_core.c.p.eP(6, 0);
    GMTrace.o(7687051935744L, 57273);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7687723024384L, 57278);
    hO(580);
    com.tencent.mm.sdk.b.a.vgX.c(this.qWZ);
    super.onDestroy();
    GMTrace.o(7687723024384L, 57278);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7688528330752L, 57284);
    if (paramIntent == null)
    {
      w.e("MicroMsg.WalletBindUI", "onNewIntent intent null");
      setResult(0);
      finish();
      GMTrace.o(7688528330752L, 57284);
      return;
    }
    super.onNewIntent(paramIntent);
    w.v("MicroMsg.WalletBindUI", "onNewIntent");
    setIntent(paramIntent);
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("intent_bind_end", false)))
    {
      w.d("MicroMsg.WalletBindUI", "pay done... errCode:" + paramIntent.getBooleanExtra("intent_bind_end", false));
      setResult(-1, getIntent());
    }
    for (;;)
    {
      finish();
      GMTrace.o(7688528330752L, 57284);
      return;
      w.i("MicroMsg.WalletBindUI", "pay cancel");
      setResult(0);
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    GMTrace.i(7688125677568L, 57281);
    super.onRestoreInstanceState(paramBundle);
    this.qWU = paramBundle.getBoolean("key_is_jump", false);
    GMTrace.o(7688125677568L, 57281);
  }
  
  public void onResume()
  {
    GMTrace.i(7687588806656L, 57277);
    if (this.qWU) {
      finish();
    }
    super.onResume();
    GMTrace.o(7687588806656L, 57277);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    GMTrace.i(7687991459840L, 57280);
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("key_is_jump", this.qWU);
    GMTrace.o(7687991459840L, 57280);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\WalletBindUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */