package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.pay.a.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.j;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.plugin.wallet_core.ui.l.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletLoanRepaymentUI
  extends WalletBaseUI
{
  private String desc;
  private String llm;
  private String nEr;
  private double omw;
  protected l qTS;
  private String qZc;
  private String qZd;
  private String qZe;
  private String qZf;
  private String qZg;
  private String qZh;
  private String qZi;
  private String qZj;
  private String token;
  
  public WalletLoanRepaymentUI()
  {
    GMTrace.i(7814290341888L, 58221);
    this.nEr = "CNY";
    GMTrace.o(7814290341888L, 58221);
  }
  
  private void JZ(String paramString)
  {
    GMTrace.i(7814827212800L, 58225);
    b(new b(paramString), true);
    GMTrace.o(7814827212800L, 58225);
  }
  
  private void a(Bankcard paramBankcard, double paramDouble, String paramString)
  {
    GMTrace.i(7815095648256L, 58227);
    l.c local1 = new l.c()
    {
      public final void a(String paramAnonymousString, FavorPayInfo paramAnonymousFavorPayInfo, boolean paramAnonymousBoolean)
      {
        GMTrace.i(7790399586304L, 58043);
        WalletLoanRepaymentUI.a(WalletLoanRepaymentUI.this, paramAnonymousString);
        WalletLoanRepaymentUI.this.l(new com.tencent.mm.plugin.wallet_core.c.k(WalletLoanRepaymentUI.a(WalletLoanRepaymentUI.this), WalletLoanRepaymentUI.b(WalletLoanRepaymentUI.this)));
        GMTrace.o(7790399586304L, 58043);
      }
    };
    View.OnClickListener local2 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7817914220544L, 58248);
        WalletLoanRepaymentUI.c(WalletLoanRepaymentUI.this);
        if (WalletLoanRepaymentUI.this.qTS != null) {
          WalletLoanRepaymentUI.this.qTS.dismiss();
        }
        GMTrace.o(7817914220544L, 58248);
      }
    };
    DialogInterface.OnCancelListener local3 = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(7791204892672L, 58049);
        if (WalletLoanRepaymentUI.this.qTS != null)
        {
          WalletLoanRepaymentUI.this.qTS.cancel();
          WalletLoanRepaymentUI.this.setResult(0);
          WalletLoanRepaymentUI.this.finish();
        }
        GMTrace.o(7791204892672L, 58049);
      }
    };
    this.qZj = paramBankcard.field_bindSerial;
    this.qTS = l.a(this, this.desc, paramDouble, paramString, paramBankcard, local1, local2, local3);
    GMTrace.o(7815095648256L, 58227);
  }
  
  private void bxs()
  {
    GMTrace.i(7815229865984L, 58228);
    w.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard");
    startActivityForResult(new Intent(this, WalletChangeLoanRepayBankcardUI.class), 1);
    GMTrace.o(7815229865984L, 58228);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7815766736896L, 58232);
    GMTrace.o(7815766736896L, 58232);
    return 1;
  }
  
  protected final void bxt()
  {
    GMTrace.i(7815364083712L, 58229);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_bind_scene", 8);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putString("kreq_token", this.token);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.loan.a.class, localBundle, new b.a()
    {
      public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(7793083940864L, 58063);
        if (paramAnonymousInt == -1) {
          WalletLoanRepaymentUI.b(WalletLoanRepaymentUI.this, WalletLoanRepaymentUI.b(WalletLoanRepaymentUI.this));
        }
        for (;;)
        {
          GMTrace.o(7793083940864L, 58063);
          return null;
          paramAnonymousBundle = n.byy();
          if (paramAnonymousBundle.byI())
          {
            paramAnonymousBundle = paramAnonymousBundle.byJ();
            WalletLoanRepaymentUI.a(WalletLoanRepaymentUI.this, paramAnonymousBundle, WalletLoanRepaymentUI.d(WalletLoanRepaymentUI.this), WalletLoanRepaymentUI.e(WalletLoanRepaymentUI.this));
          }
          else
          {
            WalletLoanRepaymentUI.this.setResult(0, null);
          }
        }
      }
    });
    GMTrace.o(7815364083712L, 58229);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7814961430528L, 58226);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        this.token = ((com.tencent.mm.plugin.wallet_core.c.a)paramk).aWg();
        JZ(this.token);
        GMTrace.o(7814961430528L, 58226);
        return true;
      }
      if ((paramk instanceof b))
      {
        paramString = (b)paramk;
        this.nEr = paramString.nEr;
        this.omw = paramString.omw;
        this.desc = paramString.desc;
        paramString = n.byy();
        if (paramString.byI())
        {
          paramString = paramString.byJ();
          if ((paramString != null) && (bg.nm(paramString.field_forbidWord))) {
            a(paramString, this.omw, this.nEr);
          }
        }
        for (;;)
        {
          GMTrace.o(7814961430528L, 58226);
          return true;
          bxs();
          continue;
          h.a(this, getResources().getString(a.i.tco), "", getString(a.i.tee), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7801673875456L, 58127);
              w.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new bankcard");
              WalletLoanRepaymentUI.this.bxt();
              GMTrace.o(7801673875456L, 58127);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(7818451091456L, 58252);
              if (WalletLoanRepaymentUI.this.aNg()) {
                WalletLoanRepaymentUI.this.finish();
              }
              GMTrace.o(7818451091456L, 58252);
            }
          });
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.k))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.k)paramk;
        if (paramString.bxW())
        {
          w.i("MicroMsg.WalletLoanRepaymentUI", "need free sms");
          paramk = new Bundle();
          paramk.putString("key_pwd1", this.llm);
          paramk.putString("key_jsapi_token", this.token);
          paramk.putString("key_relation_key", paramString.rct);
          paramk.putInt("key_verify_scene", 8);
          paramk.putString("key_mobile", paramString.rcs);
          com.tencent.mm.wallet_core.a.a(this, j.class, paramk);
        }
        for (;;)
        {
          GMTrace.o(7814961430528L, 58226);
          return true;
          paramk = new Intent();
          paramk.putExtra("token", paramString.rcq);
          paramk.putExtra("bind_serial", this.qZj);
          setResult(-1, paramk);
          finish();
        }
      }
    }
    GMTrace.o(7814961430528L, 58226);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7814692995072L, 58224);
    GMTrace.o(7814692995072L, 58224);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7815632519168L, 58231);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        paramInt1 = paramIntent.getIntExtra("ret", 64536);
        if (paramInt1 == 64533)
        {
          w.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new card");
          bxt();
          GMTrace.o(7815632519168L, 58231);
          return;
        }
        if (paramInt1 == 0)
        {
          w.i("MicroMsg.WalletLoanRepaymentUI", "change card ok");
          paramIntent = n.byy().Ki(paramIntent.getStringExtra("bindSerial"));
          if (paramIntent == null)
          {
            w.e("MicroMsg.WalletLoanRepaymentUI", "bankcard is null by getBankcardBySerialNo");
            finish();
            GMTrace.o(7815632519168L, 58231);
            return;
          }
          a(paramIntent, this.omw, this.nEr);
          GMTrace.o(7815632519168L, 58231);
          return;
        }
        w.e("MicroMsg.WalletLoanRepaymentUI", "activity return unknow error");
        GMTrace.o(7815632519168L, 58231);
        return;
      }
      paramIntent = n.byy();
      if (paramIntent.byI())
      {
        paramIntent = paramIntent.byJ();
        if ((paramIntent != null) && (bg.nm(paramIntent.field_forbidWord)))
        {
          a(paramIntent, this.omw, this.nEr);
          GMTrace.o(7815632519168L, 58231);
          return;
        }
        finish();
        GMTrace.o(7815632519168L, 58231);
        return;
      }
      w.e("MicroMsg.WalletLoanRepaymentUI", "onActivityResult hasRepaymentBankcard is false");
      GMTrace.o(7815632519168L, 58231);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7815632519168L, 58231);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7814424559616L, 58222);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.qZh = paramBundle.getStringExtra("appId");
    this.qZc = paramBundle.getStringExtra("timeStamp");
    this.qZd = paramBundle.getStringExtra("nonceStr");
    this.qZe = paramBundle.getStringExtra("packageExt");
    this.qZf = paramBundle.getStringExtra("signtype");
    this.qZg = paramBundle.getStringExtra("paySignature");
    this.qZi = paramBundle.getStringExtra("url");
    hN(580);
    r(new com.tencent.mm.plugin.wallet_core.c.a(this.qZh, this.qZc, this.qZd, this.qZe, this.qZf, this.qZg, this.qZi));
    GMTrace.o(7814424559616L, 58222);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7815498301440L, 58230);
    Object localObject = paramIntent.getExtras();
    w.i("MicroMsg.WalletLoanRepaymentUI", "onNewIntent");
    if (((Bundle)localObject).containsKey("intent_bind_end"))
    {
      w.i("MicroMsg.WalletLoanRepaymentUI", "back from bind card");
      JZ(this.token);
      GMTrace.o(7815498301440L, 58230);
      return;
    }
    if (((Bundle)localObject).containsKey("jsapi_verifycode_process_end"))
    {
      w.i("MicroMsg.WalletLoanRepaymentUI", "back from verify code");
      localObject = new Intent();
      ((Intent)localObject).putExtra("token", paramIntent.getStringExtra("token"));
      ((Intent)localObject).putExtra("bind_serial", this.qZj);
      setResult(-1, (Intent)localObject);
      finish();
      GMTrace.o(7815498301440L, 58230);
      return;
    }
    w.i("MicroMsg.WalletLoanRepaymentUI", "need to deal with,finish");
    finish();
    GMTrace.o(7815498301440L, 58230);
  }
  
  public void onResume()
  {
    GMTrace.i(7814558777344L, 58223);
    super.onResume();
    GMTrace.o(7814558777344L, 58223);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\ui\WalletLoanRepaymentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */