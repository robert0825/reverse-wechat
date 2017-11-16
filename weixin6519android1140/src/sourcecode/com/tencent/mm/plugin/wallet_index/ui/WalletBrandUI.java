package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.g.a.ss;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(7)
public class WalletBrandUI
  extends MMActivity
  implements e
{
  private String appId;
  private String ePK;
  private Dialog hul;
  private int nEc;
  private boolean rsu;
  private b rsv;
  private c rsw;
  private c rsx;
  
  public WalletBrandUI()
  {
    GMTrace.i(7586254422016L, 56522);
    this.rsu = false;
    this.hul = null;
    this.rsw = new c() {};
    this.rsx = new c() {};
    GMTrace.o(7586254422016L, 56522);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7587462381568L, 56531);
    GMTrace.o(7587462381568L, 56531);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7587193946112L, 56529);
    w.i("MicroMsg.WalletBrandUI", "hy: brandui on scene end. errType: %d, errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk.getType() != this.rsv.bAg())
    {
      GMTrace.o(7587193946112L, 56529);
      return;
    }
    this.rsv.a(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(7587193946112L, 56529);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7587596599296L, 56532);
    GMTrace.o(7587596599296L, 56532);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7587328163840L, 56530);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletBrandUI", "onActivityResultresultCode : " + paramInt2 + " requestCode: " + paramInt1);
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      finish();
      GMTrace.o(7587328163840L, 56530);
      return;
      w.i("MicroMsg.WalletBrandUI", "get result to callback? " + paramIntent.getStringExtra("test"));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7586388639744L, 56523);
    super.onCreate(paramBundle);
    if ((Build.VERSION.SDK_INT >= 21) && (getWindow() != null))
    {
      getWindow().addFlags(Integer.MIN_VALUE);
      getWindow().setStatusBarColor(0);
    }
    this.nEc = getIntent().getIntExtra("pay_scene", 3);
    p.clQ();
    w.i("MicroMsg.WalletBrandUI", "onCreate");
    int i = getIntent().getIntExtra("pay_for_wallet_type", 1);
    w.i("MicroMsg.WalletBrandUI", "onCreate payForWalletType is " + i);
    if (q.zR())
    {
      w.i("MicroMsg.WalletBrandUI", "hy: do pay with payu");
      this.rsv = new c();
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.b(this.rsw);
      com.tencent.mm.sdk.b.a.vgX.b(this.rsx);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(this.rsv.bAg(), this);
      GMTrace.o(7586388639744L, 56523);
      return;
      if (i == 2)
      {
        w.i("MicroMsg.WalletBrandUI", "hy: do pay with h5");
        this.rsv = new a();
      }
      else
      {
        w.i("MicroMsg.WalletBrandUI", "hy: do pay with tenpay");
        this.rsv = new d();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7586522857472L, 56524);
    super.onDestroy();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(this.rsv.bAg(), this);
    com.tencent.mm.sdk.b.a.vgX.c(this.rsw);
    com.tencent.mm.sdk.b.a.vgX.c(this.rsx);
    GMTrace.o(7586522857472L, 56524);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7586791292928L, 56526);
    if (paramInt == 4)
    {
      finish();
      GMTrace.o(7586791292928L, 56526);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7586791292928L, 56526);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(7586657075200L, 56525);
    w.d("MicroMsg.WalletBrandUI", "onResume");
    super.onResume();
    w.i("MicroMsg.WalletBrandUI", "Handler jump");
    if (!this.rsu)
    {
      this.rsu = true;
      final k localk = this.rsv.bAh();
      if (this.hul != null)
      {
        this.hul.dismiss();
        this.hul = null;
      }
      this.hul = com.tencent.mm.wallet_core.ui.g.e(this, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7581959454720L, 56490);
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.c(localk);
          WalletBrandUI.this.finish();
          GMTrace.o(7581959454720L, 56490);
        }
      });
    }
    GMTrace.o(7586657075200L, 56525);
  }
  
  public void onStart()
  {
    GMTrace.i(7586925510656L, 56527);
    super.onStart();
    GMTrace.o(7586925510656L, 56527);
  }
  
  protected void onStop()
  {
    GMTrace.i(7587059728384L, 56528);
    super.onStop();
    if (this.hul != null)
    {
      this.hul.dismiss();
      this.hul = null;
    }
    GMTrace.o(7587059728384L, 56528);
  }
  
  public final class a
    implements WalletBrandUI.b
  {
    private int rsz;
    
    public a()
    {
      GMTrace.i(7584778027008L, 56511);
      this.rsz = 0;
      GMTrace.o(7584778027008L, 56511);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7585180680192L, 56514);
      if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.wallet_index.c.a.a)))
      {
        paramString = ((com.tencent.mm.plugin.wallet_index.c.a.a)paramk).jumpUrl;
        w.i("MicroMsg.WalletBrandUI", "hy: gen prepay success! url is: %s", new Object[] { paramString });
        paramk = ((com.tencent.mm.plugin.wallet_index.c.a.a)paramk).rsn;
        Intent localIntent;
        if (this.rsz == 1)
        {
          localIntent = new Intent();
          localIntent.putExtra("url", paramString);
          localIntent.putExtra("jsInjectCode", paramk);
          WalletBrandUI.this.setResult(-1, localIntent);
        }
        for (;;)
        {
          WalletBrandUI.this.finish();
          GMTrace.o(7585180680192L, 56514);
          return;
          localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramString);
          localIntent.putExtra("showShare", false);
          if (!bg.nm(paramk))
          {
            localIntent.putExtra("shouldForceViewPort", true);
            localIntent.putExtra("view_port_code", paramk);
          }
          d.b(WalletBrandUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          WalletBrandUI.this.setResult(-1);
        }
      }
      w.i("MicroMsg.WalletBrandUI", "hy: gen prepay failed! errType: %d, errCode: %d, errmsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      com.tencent.mm.ui.base.h.a(WalletBrandUI.this, paramString, "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7584643809280L, 56510);
          WalletBrandUI.this.setResult(0);
          WalletBrandUI.this.finish();
          GMTrace.o(7584643809280L, 56510);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7574040608768L, 56431);
          WalletBrandUI.this.setResult(0);
          WalletBrandUI.this.finish();
          GMTrace.o(7574040608768L, 56431);
        }
      });
      GMTrace.o(7585180680192L, 56514);
    }
    
    public final int bAg()
    {
      GMTrace.i(7584912244736L, 56512);
      GMTrace.o(7584912244736L, 56512);
      return 1563;
    }
    
    public final k bAh()
    {
      GMTrace.i(7585046462464L, 56513);
      WalletBrandUI.a(WalletBrandUI.this, WalletBrandUI.this.getIntent().getStringExtra("appId"));
      Object localObject = WalletBrandUI.this.getIntent().getStringExtra("signtype");
      String str1 = WalletBrandUI.this.getIntent().getStringExtra("nonceStr");
      String str2 = WalletBrandUI.this.getIntent().getStringExtra("timeStamp");
      String str3 = WalletBrandUI.this.getIntent().getStringExtra("packageExt");
      String str4 = WalletBrandUI.this.getIntent().getStringExtra("paySignature");
      String str5 = WalletBrandUI.this.getIntent().getStringExtra("url");
      this.rsz = WalletBrandUI.this.getIntent().getIntExtra("result_jump_mode", 0);
      WalletBrandUI.b(WalletBrandUI.this, WalletBrandUI.this.getIntent().getStringExtra("bizUsername"));
      int i = WalletBrandUI.this.getIntent().getIntExtra("pay_channel", 0);
      localObject = new com.tencent.mm.plugin.wallet_index.c.a.a(WalletBrandUI.c(WalletBrandUI.this), str1, str2, str3, str4, (String)localObject, str5, WalletBrandUI.d(WalletBrandUI.this), i);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
      GMTrace.o(7585046462464L, 56513);
      return (k)localObject;
    }
  }
  
  static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, k paramk);
    
    public abstract int bAg();
    
    public abstract k bAh();
  }
  
  final class c
    implements WalletBrandUI.b
  {
    c()
    {
      GMTrace.i(7577396051968L, 56456);
      GMTrace.o(7577396051968L, 56456);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7577664487424L, 56458);
      paramk = (com.tencent.mm.plugin.wallet_index.c.b.a)paramk;
      String str = paramk.rsd;
      w.d("MicroMsg.WalletBrandUI", "req_key = " + str);
      PayInfo localPayInfo = new PayInfo();
      localPayInfo.eHG = str;
      localPayInfo.appId = WalletBrandUI.c(WalletBrandUI.this);
      localPayInfo.rse = paramk.rse;
      localPayInfo.ePL = WalletBrandUI.e(WalletBrandUI.this);
      localPayInfo.eAR = paramString;
      localPayInfo.ePH = WalletBrandUI.this.getIntent().getIntExtra("pay_channel", 0);
      com.tencent.mm.pluginsdk.wallet.g.a(WalletBrandUI.this, localPayInfo, 1);
      GMTrace.o(7577664487424L, 56458);
    }
    
    public final int bAg()
    {
      GMTrace.i(7577798705152L, 56459);
      GMTrace.o(7577798705152L, 56459);
      return 1521;
    }
    
    public final k bAh()
    {
      GMTrace.i(7577530269696L, 56457);
      WalletBrandUI.a(WalletBrandUI.this, WalletBrandUI.this.getIntent().getStringExtra("appId"));
      Object localObject = WalletBrandUI.this.getIntent().getStringExtra("signtype");
      String str1 = WalletBrandUI.this.getIntent().getStringExtra("nonceStr");
      String str2 = WalletBrandUI.this.getIntent().getStringExtra("timeStamp");
      String str3 = WalletBrandUI.this.getIntent().getStringExtra("packageExt");
      String str4 = WalletBrandUI.this.getIntent().getStringExtra("paySignature");
      String str5 = WalletBrandUI.this.getIntent().getStringExtra("url");
      WalletBrandUI.b(WalletBrandUI.this, WalletBrandUI.this.getIntent().getStringExtra("bizUsername"));
      int i = WalletBrandUI.this.getIntent().getIntExtra("pay_channel", 0);
      localObject = new com.tencent.mm.plugin.wallet_index.c.b.a(WalletBrandUI.c(WalletBrandUI.this), (String)localObject, str1, str3, str4, str2, str5, WalletBrandUI.d(WalletBrandUI.this), i);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
      GMTrace.o(7577530269696L, 56457);
      return (k)localObject;
    }
  }
  
  final class d
    implements WalletBrandUI.b
  {
    d()
    {
      GMTrace.i(7574443261952L, 56434);
      GMTrace.o(7574443261952L, 56434);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7574711697408L, 56436);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (com.tencent.mm.plugin.wallet_index.c.a)paramk;
        localObject = paramk.rsd;
        w.d("MicroMsg.WalletBrandUI", "req_key = " + (String)localObject);
        PayInfo localPayInfo = new PayInfo();
        localPayInfo.eHG = ((String)localObject);
        localPayInfo.appId = WalletBrandUI.c(WalletBrandUI.this);
        localPayInfo.rse = paramk.rse;
        localPayInfo.ePL = WalletBrandUI.e(WalletBrandUI.this);
        localPayInfo.eAR = paramString;
        localPayInfo.ePH = WalletBrandUI.this.getIntent().getIntExtra("pay_channel", 0);
        localPayInfo.tIG = paramk.sessionId;
        com.tencent.mm.pluginsdk.wallet.g.a(WalletBrandUI.this, localPayInfo, 1);
        GMTrace.o(7574711697408L, 56436);
        return;
      }
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("key_jsapi_pay_err_code", paramInt2);
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = WalletBrandUI.this.getString(a.i.tcN);
      }
      ((Intent)localObject).putExtra("key_jsapi_pay_err_msg", paramk);
      WalletBrandUI.this.setResult(5, (Intent)localObject);
      WalletBrandUI.this.finish();
      GMTrace.o(7574711697408L, 56436);
    }
    
    public final int bAg()
    {
      GMTrace.i(7574845915136L, 56437);
      GMTrace.o(7574845915136L, 56437);
      return 398;
    }
    
    public final k bAh()
    {
      GMTrace.i(7574577479680L, 56435);
      WalletBrandUI.a(WalletBrandUI.this, WalletBrandUI.this.getIntent().getStringExtra("appId"));
      Object localObject = WalletBrandUI.this.getIntent().getStringExtra("signtype");
      String str1 = WalletBrandUI.this.getIntent().getStringExtra("nonceStr");
      String str2 = WalletBrandUI.this.getIntent().getStringExtra("timeStamp");
      String str3 = WalletBrandUI.this.getIntent().getStringExtra("packageExt");
      String str4 = WalletBrandUI.this.getIntent().getStringExtra("paySignature");
      String str5 = WalletBrandUI.this.getIntent().getStringExtra("url");
      WalletBrandUI.b(WalletBrandUI.this, WalletBrandUI.this.getIntent().getStringExtra("bizUsername"));
      int i = WalletBrandUI.this.getIntent().getIntExtra("pay_channel", 0);
      localObject = new com.tencent.mm.plugin.wallet_index.c.a(WalletBrandUI.c(WalletBrandUI.this), (String)localObject, str1, str3, str4, str2, str5, WalletBrandUI.d(WalletBrandUI.this), i, WalletBrandUI.e(WalletBrandUI.this));
      ((l)localObject).sessionId = System.currentTimeMillis();
      ((l)localObject).fXf = "PayProcess";
      ((l)localObject).gRb = WalletBrandUI.e(WalletBrandUI.this);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a((k)localObject, 0);
      GMTrace.o(7574577479680L, 56435);
      return (k)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\ui\WalletBrandUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */