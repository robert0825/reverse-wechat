package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_index.b.a.a.a;
import com.tencent.mm.plugin.wallet_index.b.a.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.aun;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.j;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletIapUI
  extends MMActivity
  implements e
{
  private int count;
  private Dialog iBR;
  private boolean rsB;
  private List<String> rsC;
  private ArrayList<String> rsD;
  private ArrayList<String> rsE;
  private b rsF;
  private long rsG;
  private c rsH;
  private c rsI;
  
  public WalletIapUI()
  {
    GMTrace.i(7571356254208L, 56411);
    this.rsB = false;
    this.rsC = new ArrayList();
    this.count = 1;
    this.rsD = new ArrayList();
    this.rsE = new ArrayList();
    this.rsG = 0L;
    this.rsH = new c()
    {
      public final void a(com.tencent.mm.plugin.wallet_index.b.a.b paramAnonymousb, d paramAnonymousd)
      {
        GMTrace.i(7579006664704L, 56468);
        w.i("MicroMsg.WalletIapUI", "Pay Purchase finished: " + paramAnonymousb + ", purchase: " + paramAnonymousd);
        if ((WalletIapUI.a(WalletIapUI.this) instanceof WalletIapUI.a))
        {
          if (paramAnonymousd == null) {
            break label201;
          }
          p.b(paramAnonymousd.rrW, paramAnonymousd.klt, paramAnonymousd.rsc, paramAnonymousb.mgK, paramAnonymousb.mMessage);
        }
        while (paramAnonymousb.isFailure())
        {
          w.i("MicroMsg.WalletIapUI", "back to preview UI, reason: purchase finish , errCode: " + paramAnonymousb.mgK + " , errMsg: " + paramAnonymousb.mMessage);
          paramAnonymousd = new Intent();
          paramAnonymousd.putExtra("key_err_code", paramAnonymousb.mgK);
          paramAnonymousd.putExtra("key_err_msg", paramAnonymousb.mMessage);
          paramAnonymousd.putExtra("key_launch_ts", WalletIapUI.b(WalletIapUI.this));
          paramAnonymousd.putExtra("key_gw_error_code", paramAnonymousb.rrT);
          WalletIapUI.this.setResult(-1, paramAnonymousd);
          WalletIapUI.this.finish();
          GMTrace.o(7579006664704L, 56468);
          return;
          label201:
          WalletIapUI.a locala = (WalletIapUI.a)WalletIapUI.a(WalletIapUI.this);
          p.b(locala.rsO, locala.klt, locala.rsc, paramAnonymousb.mgK, paramAnonymousb.mMessage);
        }
        if (!paramAnonymousb.bAf())
        {
          w.i("MicroMsg.WalletIapUI", "verify purchase! productId:" + paramAnonymousd.klt + ",billNo:" + paramAnonymousd.rrZ);
          h.xz();
          h.xx().fYr.a(new com.tencent.mm.wallet_core.c.k(paramAnonymousd.klt, WalletIapUI.a(WalletIapUI.this).bAi(), WalletIapUI.c(WalletIapUI.this), paramAnonymousd.rrZ, paramAnonymousd.rsa, paramAnonymousd.qiS, paramAnonymousd.rsb, paramAnonymousd.rsc), 0);
          GMTrace.o(7579006664704L, 56468);
          return;
        }
        w.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
        WalletIapUI.a(WalletIapUI.this).jd(false);
        GMTrace.o(7579006664704L, 56468);
      }
    };
    this.rsI = new c()
    {
      public final void a(com.tencent.mm.plugin.wallet_index.b.a.b paramAnonymousb, d paramAnonymousd)
      {
        GMTrace.i(7575651221504L, 56443);
        w.d("MicroMsg.WalletIapUI", "Consume finished: " + paramAnonymousb + ", purchase: " + paramAnonymousd);
        if (paramAnonymousb.isFailure()) {
          w.d("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Fail ! ");
        }
        for (;;)
        {
          paramAnonymousd = new Intent();
          paramAnonymousd.putExtra("key_err_code", paramAnonymousb.mgK);
          paramAnonymousd.putExtra("key_err_msg", paramAnonymousb.mMessage);
          paramAnonymousd.putStringArrayListExtra("key_response_product_ids", WalletIapUI.d(WalletIapUI.this));
          paramAnonymousd.putStringArrayListExtra("key_response_series_ids", WalletIapUI.e(WalletIapUI.this));
          paramAnonymousd.putExtra("key_launch_ts", WalletIapUI.b(WalletIapUI.this));
          WalletIapUI.this.setResult(-1, paramAnonymousd);
          WalletIapUI.this.finish();
          GMTrace.o(7575651221504L, 56443);
          return;
          w.d("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Success ! ");
        }
      }
    };
    GMTrace.o(7571356254208L, 56411);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7572295778304L, 56418);
    w.i("MicroMsg.WalletIapUI", "onSceneEnd ErrType:" + paramInt1 + ", errCode:" + paramInt2 + ",errMsg:" + paramString);
    paramString = com.tencent.mm.plugin.wallet_index.b.a.b.az(paramInt2, paramString);
    paramInt1 = paramString.mgK;
    paramString = paramString.mMessage;
    w.i("MicroMsg.WalletIapUI", "onSceneEnd getWeiXinResult errCode:" + paramInt1 + ",errMsg:" + paramString);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(7572295778304L, 56418);
      return;
      if (paramInt1 == 0)
      {
        w.i("MicroMsg.WalletIapUI", "Prepare OK, LaunchPay...");
        paramString = (j)paramk;
        this.rsF.a(this, paramString, this.rsH);
        GMTrace.o(7572295778304L, 56418);
        return;
      }
      w.i("MicroMsg.WalletIapUI", "back to preview UI, reason: PreparePurchase fail , errCode: " + paramInt1 + " , errMsg: " + paramString);
      paramk = new Intent();
      paramk.putExtra("key_err_code", paramInt1);
      paramk.putExtra("key_err_msg", paramString);
      paramk.putExtra("key_response_position", 1);
      setResult(-1, paramk);
      finish();
      GMTrace.o(7572295778304L, 56418);
      return;
      boolean bool = false;
      paramk = (com.tencent.mm.wallet_core.c.k)paramk;
      String str = paramk.klt;
      this.rsC.remove(str);
      if (paramInt1 == 0)
      {
        w.i("MicroMsg.WalletIapUI", "Verify " + str + " OK");
        this.rsD.add(str);
        this.rsE.add(paramk.clJ());
      }
      while (this.rsC.isEmpty())
      {
        w.d("MicroMsg.WalletIapUI", "Verify All End... ");
        if (this.rsD.isEmpty()) {
          break label572;
        }
        w.i("MicroMsg.WalletIapUI", "mResultProductIds size: " + this.rsD.size() + ", Consume ...");
        this.rsF.a(this.rsD, this.rsI, bool);
        GMTrace.o(7572295778304L, 56418);
        return;
        if (str.startsWith("com.tencent.xin.wco"))
        {
          if (paramk.xDs > 0)
          {
            this.rsD.add(str);
            this.rsE.add(paramk.clJ());
            w.i("MicroMsg.WalletIapUI", "Verify " + str + " fail and cosume");
            bool = true;
          }
          else
          {
            w.i("MicroMsg.WalletIapUI", "Verify " + str + " fail");
          }
        }
        else {
          w.i("MicroMsg.WalletIapUI", "Verify " + str + " fail");
        }
      }
      continue;
      label572:
      w.i("MicroMsg.WalletIapUI", "back to preview UI, reason: VerifyPurchase fail , errCode: " + paramInt1 + " , errMsg: " + paramString);
      paramk = new Intent();
      paramk.putExtra("key_err_code", paramInt1);
      paramk.putExtra("key_err_msg", paramString);
      paramk.putExtra("key_response_position", 3);
      paramk.putExtra("key_launch_ts", this.rsG);
      setResult(-1, paramk);
      finish();
    }
  }
  
  public void finish()
  {
    GMTrace.i(7572429996032L, 56419);
    w.i("MicroMsg.WalletIapUI", "finish");
    if ((this.iBR != null) && (this.iBR.isShowing()))
    {
      this.iBR.dismiss();
      this.iBR = null;
    }
    if (this.rsF != null) {
      this.rsF.onDestroy();
    }
    h.xz();
    h.xx().fYr.b(422, this);
    h.xz();
    h.xx().fYr.b(414, this);
    super.finish();
    GMTrace.o(7572429996032L, 56419);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7571624689664L, 56413);
    GMTrace.o(7571624689664L, 56413);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7572161560576L, 56417);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.rsF != null)
    {
      this.rsF.c(paramInt1, paramInt2, paramIntent);
      w.d("MicroMsg.WalletIapUI", "onActivityResult handled by mWalletPay.");
      GMTrace.o(7572161560576L, 56417);
      return;
    }
    w.i("MicroMsg.WalletIapUI", "havn't handle user action");
    paramIntent = new Intent();
    com.tencent.mm.plugin.wallet_index.b.a.b localb = com.tencent.mm.plugin.wallet_index.b.a.b.az(-1, "");
    paramIntent.putExtra("key_err_code", localb.mgK);
    paramIntent.putExtra("key_err_msg", localb.mMessage);
    paramIntent.putExtra("key_launch_ts", this.rsG);
    setResult(-1, paramIntent);
    finish();
    GMTrace.o(7572161560576L, 56417);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7571490471936L, 56412);
    super.onCreate(paramBundle);
    w.v("MicroMsg.WalletIapUI", "onCreate");
    this.rsG = 0L;
    h.xz();
    h.xx().fYr.a(422, this);
    h.xz();
    h.xx().fYr.a(414, this);
    if (getIntent().getIntExtra("key_action_type", 200001) == 200001) {
      this.iBR = com.tencent.mm.wallet_core.ui.g.a(this, getString(a.i.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7575114350592L, 56439);
          WalletIapUI.this.setResult(0);
          WalletIapUI.this.finish();
          GMTrace.o(7575114350592L, 56439);
        }
      });
    }
    if ((getIntent().getBooleanExtra("key_force_google", false)) || (q.zQ()))
    {
      w.d("MicroMsg.WalletIapUI", "Pay use Google Wallet!");
      this.rsF = new a();
      GMTrace.o(7571490471936L, 56412);
      return;
    }
    w.d("MicroMsg.WalletIapUI", "Pay use WeiXin Wallet!");
    this.rsF = new d();
    GMTrace.o(7571490471936L, 56412);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7572027342848L, 56416);
    w.d("MicroMsg.WalletIapUI", "onDestroy");
    super.onDestroy();
    GMTrace.o(7572027342848L, 56416);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(7571893125120L, 56415);
    w.d("MicroMsg.WalletIapUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    GMTrace.o(7571893125120L, 56415);
  }
  
  public void onResume()
  {
    GMTrace.i(7571758907392L, 56414);
    w.d("MicroMsg.WalletIapUI", "onResume");
    super.onResume();
    w.d("MicroMsg.WalletIapUI", "Handler jump");
    if (!this.rsB)
    {
      this.rsB = true;
      Intent localIntent = getIntent();
      if (localIntent.getIntExtra("key_action_type", 200001) == 200002)
      {
        w.d("MicroMsg.WalletIapUI", "start to restore the purchase!");
        this.rsF.jd(true);
        GMTrace.o(7571758907392L, 56414);
        return;
      }
      String str1 = localIntent.getStringExtra("key_product_id");
      this.rsC.add(str1);
      w.d("MicroMsg.WalletIapUI", "prepare pay product: " + str1);
      String str2 = localIntent.getStringExtra("key_price");
      String str3 = localIntent.getStringExtra("key_currency_type");
      String str4 = localIntent.getStringExtra("key_ext_info");
      this.count = localIntent.getIntExtra("key_count", 1);
      h.xz();
      h.xx().fYr.a(new j(str1, str2, str3, this.count, this.rsF.bAi(), str4), 0);
    }
    GMTrace.o(7571758907392L, 56414);
  }
  
  final class a
    implements WalletIapUI.b
  {
    BroadcastReceiver idj;
    public String klt;
    public WalletIapUI.c rsK;
    private WalletIapUI.c rsL;
    public com.tencent.mm.plugin.wallet_index.b.a.a rsM;
    public com.tencent.mm.plugin.wallet_index.b.a.c rsN;
    String rsO;
    public String rsb;
    public String rsc;
    
    public a()
    {
      GMTrace.i(7583033196544L, 56498);
      this.rsK = null;
      this.rsL = null;
      this.idj = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          GMTrace.i(7584241156096L, 56507);
          paramAnonymousContext = paramAnonymousIntent.getAction();
          if ("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE".equals(paramAnonymousContext))
          {
            WalletIapUI.a.this.rsN = com.tencent.mm.plugin.wallet_index.b.a.a.a(paramAnonymousIntent, WalletIapUI.a.this.rsK);
            GMTrace.o(7584241156096L, 56507);
            return;
          }
          if ("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE".equals(paramAnonymousContext))
          {
            final boolean bool = paramAnonymousIntent.getBooleanExtra("is_direct", true);
            WalletIapUI.a.this.rsM.a(paramAnonymousIntent, new a.a()
            {
              public final void a(com.tencent.mm.plugin.wallet_index.b.a.b paramAnonymous2b, com.tencent.mm.plugin.wallet_index.b.a.c paramAnonymous2c)
              {
                GMTrace.i(7579275100160L, 56470);
                w.d("MicroMsg.WalletIapUI", "Query inventory finished.");
                if ((paramAnonymous2b.isFailure()) || (paramAnonymous2c == null))
                {
                  w.w("MicroMsg.WalletIapUI", "Failed to query inventory: " + paramAnonymous2b);
                  GMTrace.o(7579275100160L, 56470);
                  return;
                }
                w.d("MicroMsg.WalletIapUI", "Query inventory was successful.");
                WalletIapUI.a.this.rsN = paramAnonymous2c;
                WalletIapUI.a(WalletIapUI.this, new ArrayList(paramAnonymous2c.rrU.keySet()));
                paramAnonymous2b = new ArrayList(paramAnonymous2c.rrU.values());
                if (paramAnonymous2b.size() > 0)
                {
                  paramAnonymous2b = paramAnonymous2b.iterator();
                  while (paramAnonymous2b.hasNext())
                  {
                    paramAnonymous2c = (d)paramAnonymous2b.next();
                    w.i("MicroMsg.WalletIapUI", "do NetSceneVerifyPurchase. productId:" + paramAnonymous2c.klt + ",billNo:" + paramAnonymous2c.rrZ);
                    if (paramAnonymous2c.klt.equals(WalletIapUI.a.this.klt))
                    {
                      h.xz();
                      h.xx().fYr.a(new com.tencent.mm.wallet_core.c.k(paramAnonymous2c.klt, 3, WalletIapUI.c(WalletIapUI.this), paramAnonymous2c.rrZ, paramAnonymous2c.rsa, paramAnonymous2c.qiS, WalletIapUI.a.this.rsb, WalletIapUI.a.this.rsc), 0);
                      w.v("MicroMsg.WalletIapUI", "after price:%s , currencyType:%s", new Object[] { WalletIapUI.a.this.rsc, WalletIapUI.a.this.rsb });
                    }
                    else
                    {
                      h.xz();
                      h.xx().fYr.a(new com.tencent.mm.wallet_core.c.k(paramAnonymous2c.klt, 3, WalletIapUI.c(WalletIapUI.this), paramAnonymous2c.rrZ, paramAnonymous2c.rsa, paramAnonymous2c.qiS, paramAnonymous2c.rsb, paramAnonymous2c.rsc), 0);
                    }
                  }
                  GMTrace.o(7579275100160L, 56470);
                  return;
                }
                w.d("MicroMsg.WalletIapUI", "purchases is null. consume null ");
                if (!bool) {
                  w.d("MicroMsg.WalletIapUI", "unknown_purchase");
                }
                for (paramAnonymous2b = com.tencent.mm.plugin.wallet_index.b.a.b.xa(63534);; paramAnonymous2b = com.tencent.mm.plugin.wallet_index.b.a.b.xa(0))
                {
                  if (WalletIapUI.f(WalletIapUI.this) != null) {
                    WalletIapUI.f(WalletIapUI.this).a(paramAnonymous2b, null);
                  }
                  GMTrace.o(7579275100160L, 56470);
                  return;
                  w.d("MicroMsg.WalletIapUI", "result ok");
                }
              }
            });
          }
          GMTrace.o(7584241156096L, 56507);
        }
      };
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
      localIntentFilter.addAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
      WalletIapUI.this.registerReceiver(this.idj, localIntentFilter);
      this.rsM = new com.tencent.mm.plugin.wallet_index.b.a.a();
      GMTrace.o(7583033196544L, 56498);
    }
    
    private void xb(int paramInt)
    {
      GMTrace.i(7583570067456L, 56502);
      com.tencent.mm.plugin.wallet_index.b.a.b localb = com.tencent.mm.plugin.wallet_index.b.a.b.xa(paramInt);
      Intent localIntent = new Intent();
      localIntent.putExtra("key_err_code", localb.mgK);
      localIntent.putExtra("key_err_msg", localb.mMessage);
      localIntent.putExtra("key_launch_ts", WalletIapUI.b(WalletIapUI.this));
      WalletIapUI.this.setResult(-1, localIntent);
      WalletIapUI.this.finish();
      GMTrace.o(7583570067456L, 56502);
    }
    
    public final void a(Activity paramActivity, j paramj, WalletIapUI.c paramc)
    {
      GMTrace.i(7583301632000L, 56500);
      this.rsK = paramc;
      this.klt = paramj.klt;
      this.rsc = paramj.rsc;
      this.rsb = paramj.rsb;
      Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_PAY_REQUEST");
      localIntent.setPackage("com.tencent.mm");
      localIntent.putExtra("product_id", this.klt);
      this.rsO = paramj.clI();
      paramc = this.rsO;
      Object localObject = this.rsc;
      String str = this.rsb;
      paramj = paramc;
      if (bg.nm(paramc)) {
        paramj = "";
      }
      paramc = (WalletIapUI.c)localObject;
      if (bg.nm((String)localObject)) {
        paramc = "";
      }
      localObject = str;
      if (bg.nm(str)) {
        localObject = "";
      }
      localIntent.putExtra("developer_pay_load", paramj + "[#]" + paramc + "[#]" + (String)localObject);
      if (!paramActivity.getPackageManager().queryIntentActivities(localIntent, 65536).isEmpty())
      {
        WalletIapUI.a(WalletIapUI.this, bg.Pv());
        w.i("MicroMsg.WalletIapUI", "GWallet Found!");
        paramActivity.startActivityForResult(localIntent, 10001);
        GMTrace.o(7583301632000L, 56500);
        return;
      }
      w.i("MicroMsg.WalletIapUI", "Try to downloading GWallet Moudle!");
      paramActivity = com.tencent.mm.plugin.wallet_index.b.a.b.xa(63536);
      if (this.rsK != null) {
        this.rsK.a(paramActivity, null);
      }
      GMTrace.o(7583301632000L, 56500);
    }
    
    public final void a(ArrayList<String> paramArrayList, WalletIapUI.c paramc, boolean paramBoolean)
    {
      GMTrace.i(7583972720640L, 56505);
      this.rsL = paramc;
      w.d("MicroMsg.WalletIapUI", "consumePurchase. consume...");
      com.tencent.mm.plugin.wallet_index.b.a.c localc = this.rsN;
      paramc = new ArrayList();
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        Object localObject = (String)paramArrayList.next();
        localObject = (d)localc.rrU.get(localObject);
        if (localObject != null) {
          paramc.add(((d)localObject).mToken);
        }
      }
      if (paramc.size() > 0)
      {
        paramArrayList = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        paramArrayList.setPackage("com.tencent.mm");
        paramArrayList.putStringArrayListExtra("tokens", paramc);
        paramArrayList.putExtra("IS_FAILED_CONSUME", paramBoolean);
        WalletIapUI.this.sendBroadcast(paramArrayList);
        GMTrace.o(7583972720640L, 56505);
        return;
      }
      paramArrayList = com.tencent.mm.plugin.wallet_index.b.a.b.xa(0);
      if (this.rsL != null) {
        this.rsL.a(paramArrayList, null);
      }
      GMTrace.o(7583972720640L, 56505);
    }
    
    public final int bAi()
    {
      GMTrace.i(7583167414272L, 56499);
      GMTrace.o(7583167414272L, 56499);
      return 3;
    }
    
    public final boolean c(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(7583704285184L, 56503);
      if (paramInt1 == 10001)
      {
        w.i("MicroMsg.WalletIapUI", "purchase flow!result_code: %d", new Object[] { Integer.valueOf(paramInt2) });
        if (paramIntent != null)
        {
          paramInt1 = paramIntent.getIntExtra("RESPONSE_CODE", 0);
          if ((paramInt1 == 63535) || (paramInt1 == 3))
          {
            p.b(this.rsO, this.klt, this.rsc, paramInt1, "");
            xb(paramInt1);
            GMTrace.o(7583704285184L, 56503);
            return true;
          }
          if (paramInt1 == 62536)
          {
            xb(paramInt1);
            GMTrace.o(7583704285184L, 56503);
            return true;
          }
        }
        else
        {
          xb(1);
          GMTrace.o(7583704285184L, 56503);
          return true;
        }
      }
      WalletIapUI.c localc = this.rsL;
      String str1 = this.rsO;
      String str2 = this.klt;
      String str3 = this.rsc;
      paramInt1 = com.tencent.mm.plugin.wallet_index.b.a.a.Z(paramIntent);
      w.d("MicroMsg.IabResolver", "Owned items response: " + String.valueOf(paramInt1));
      paramIntent = com.tencent.mm.plugin.wallet_index.b.a.b.xa(paramInt1);
      p.b(str1, str2, str3, paramInt1, paramIntent.mMessage);
      if (localc != null) {
        localc.a(paramIntent, null);
      }
      GMTrace.o(7583704285184L, 56503);
      return true;
    }
    
    public final void jd(boolean paramBoolean)
    {
      GMTrace.i(7583838502912L, 56504);
      w.d("MicroMsg.WalletIapUI", "restorePurchase. Querying inventory.");
      w.d("MicroMsg.WalletIapUI", "is direct? " + paramBoolean);
      Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST");
      localIntent.setPackage("com.tencent.mm");
      localIntent.putExtra("is_direct", paramBoolean);
      WalletIapUI.this.startActivityForResult(localIntent, 10001);
      GMTrace.o(7583838502912L, 56504);
    }
    
    public final void onDestroy()
    {
      GMTrace.i(7583435849728L, 56501);
      try
      {
        WalletIapUI.this.unregisterReceiver(this.idj);
        if (!bg.bx(WalletIapUI.this))
        {
          w.d("MicroMsg.WalletIapUI", "close front UI.");
          Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
          localIntent.setPackage("com.tencent.mm");
          WalletIapUI.this.sendBroadcast(localIntent);
        }
        w.d("MicroMsg.WalletIapUI", "Destroying helper.");
        GMTrace.o(7583435849728L, 56501);
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          w.e("MicroMsg.WalletIapUI", localIllegalArgumentException.toString());
        }
      }
    }
  }
  
  static abstract interface b
  {
    public abstract void a(Activity paramActivity, j paramj, WalletIapUI.c paramc);
    
    public abstract void a(ArrayList<String> paramArrayList, WalletIapUI.c paramc, boolean paramBoolean);
    
    public abstract int bAi();
    
    public abstract boolean c(int paramInt1, int paramInt2, Intent paramIntent);
    
    public abstract void jd(boolean paramBoolean);
    
    public abstract void onDestroy();
  }
  
  public static abstract interface c
  {
    public abstract void a(com.tencent.mm.plugin.wallet_index.b.a.b paramb, d paramd);
  }
  
  final class d
    implements WalletIapUI.b
  {
    private String klt;
    private com.tencent.mm.sdk.b.c nJD;
    private String rsO;
    private WalletIapUI.c rsR;
    private String rsb;
    private String rsc;
    
    public d()
    {
      GMTrace.i(7577932922880L, 56460);
      this.rsR = null;
      this.rsO = null;
      this.klt = null;
      this.rsc = null;
      this.rsb = null;
      this.nJD = new com.tencent.mm.sdk.b.c() {};
      com.tencent.mm.sdk.b.a.vgX.b(this.nJD);
      GMTrace.o(7577932922880L, 56460);
    }
    
    public final void a(Activity paramActivity, j paramj, WalletIapUI.c paramc)
    {
      GMTrace.i(7578201358336L, 56462);
      p.clQ();
      this.rsR = paramc;
      this.klt = paramj.klt;
      this.rsO = paramj.clI();
      this.rsc = paramj.rsc;
      this.rsb = paramj.rsb;
      PayInfo localPayInfo = new PayInfo();
      paramc = (aun)paramj.fUa.gtD.gtK;
      if (paramc != null)
      {
        w.d("MicroMsg.NetScenePreparePurchase", "get TradeToken4TenPay is " + paramc.uJP);
        paramc = paramc.uJP;
        localPayInfo.eHG = paramc;
        paramc = (aun)paramj.fUa.gtD.gtK;
        if (paramc == null) {
          break label252;
        }
        w.d("MicroMsg.NetScenePreparePurchase", "get Partner4TenPay is " + paramc.uJQ);
        paramc = paramc.uJQ;
        label157:
        localPayInfo.partnerId = paramc;
        paramj = (aun)paramj.fUa.gtD.gtK;
        if (paramj == null) {
          break label265;
        }
        w.d("MicroMsg.NetScenePreparePurchase", "get Sign4TenPay is " + paramj.uJR);
      }
      for (paramj = paramj.uJR;; paramj = "")
      {
        localPayInfo.eXm = paramj;
        localPayInfo.ePL = 5;
        com.tencent.mm.pluginsdk.wallet.g.a(paramActivity, localPayInfo, 1);
        GMTrace.o(7578201358336L, 56462);
        return;
        w.e("MicroMsg.NetScenePreparePurchase", "get TradeToken4TenPay field.");
        paramc = "";
        break;
        label252:
        w.e("MicroMsg.NetScenePreparePurchase", "get Partner4TenPay field.");
        paramc = "";
        break label157;
        label265:
        w.e("MicroMsg.NetScenePreparePurchase", "get Sign4TenPay field.");
      }
    }
    
    public final void a(ArrayList<String> paramArrayList, WalletIapUI.c paramc, boolean paramBoolean)
    {
      GMTrace.i(7578738229248L, 56466);
      if (paramc != null) {
        paramc.a(com.tencent.mm.plugin.wallet_index.b.a.b.az(0, ""), new d(this.klt, this.rsO, this.rsb, this.rsc));
      }
      GMTrace.o(7578738229248L, 56466);
    }
    
    public final int bAi()
    {
      GMTrace.i(7578067140608L, 56461);
      GMTrace.o(7578067140608L, 56461);
      return 2;
    }
    
    public final boolean c(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(7578335576064L, 56463);
      w.d("MicroMsg.WalletIapUI", "onPayEnd payResult : " + paramInt2);
      if (this.rsR != null) {
        if (paramInt2 != -1) {
          break label100;
        }
      }
      label100:
      for (paramIntent = com.tencent.mm.plugin.wallet_index.b.a.b.az(0, "");; paramIntent = com.tencent.mm.plugin.wallet_index.b.a.b.az(100000000, ""))
      {
        d locald = new d(this.klt, this.rsO, this.rsb, this.rsc);
        this.rsR.a(paramIntent, locald);
        this.rsR = null;
        GMTrace.o(7578335576064L, 56463);
        return true;
      }
    }
    
    public final void jd(boolean paramBoolean)
    {
      GMTrace.i(7578604011520L, 56465);
      Intent localIntent = new Intent();
      localIntent.putExtra("key_err_code", 0);
      localIntent.putExtra("key_err_msg", "");
      WalletIapUI.this.setResult(-1, localIntent);
      WalletIapUI.this.finish();
      GMTrace.o(7578604011520L, 56465);
    }
    
    public final void onDestroy()
    {
      GMTrace.i(7578469793792L, 56464);
      com.tencent.mm.sdk.b.a.vgX.c(this.nJD);
      GMTrace.o(7578469793792L, 56464);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\ui\WalletIapUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */