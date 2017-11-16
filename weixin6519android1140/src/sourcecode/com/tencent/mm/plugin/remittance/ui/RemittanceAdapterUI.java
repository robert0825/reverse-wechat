package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.c.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;

@com.tencent.mm.ui.base.a(7)
public class RemittanceAdapterUI
  extends WalletBaseUI
{
  public String fKP;
  public int gRb;
  protected int mChannel;
  public boolean onc;
  protected com.tencent.mm.plugin.wallet.a ond;
  
  public RemittanceAdapterUI()
  {
    GMTrace.i(10816875134976L, 80592);
    this.fKP = null;
    this.onc = false;
    this.ond = null;
    GMTrace.o(10816875134976L, 80592);
  }
  
  public void b(String paramString, int paramInt, Intent paramIntent)
  {
    GMTrace.i(10817814659072L, 80599);
    w.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.gRb + ", name=" + paramString);
    if (paramIntent != null)
    {
      paramIntent = new Intent(paramIntent);
      com.tencent.mm.plugin.wallet.a.a(this.ond, paramIntent);
      if (paramIntent.getIntExtra("busi_type", 0) != 1) {
        break label154;
      }
      paramIntent.setClass(this, RemittanceBusiUI.class);
    }
    for (;;)
    {
      paramIntent.putExtra("receiver_name", paramString);
      paramIntent.putExtra("scene", this.gRb);
      paramIntent.putExtra("pay_scene", paramInt);
      paramIntent.putExtra("pay_channel", this.mChannel);
      startActivity(paramIntent);
      setResult(-1);
      finish();
      GMTrace.o(10817814659072L, 80599);
      return;
      paramIntent = new Intent();
      break;
      label154:
      paramIntent.setClass(this, RemittanceUI.class);
    }
  }
  
  public void bbv()
  {
    GMTrace.i(10817143570432L, 80594);
    m localm = new m(this.fKP, this.mChannel);
    localm.fXf = "RemittanceProcess";
    b(localm, false);
    GMTrace.o(10817143570432L, 80594);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(10817546223616L, 80597);
    if ((paramk instanceof m)) {
      this.onc = false;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof m))
      {
        paramString = (m)paramk;
        this.fKP = paramString.username;
        if (bg.nm(this.fKP))
        {
          w.d("MicroMsg.RemittanceAdapterUI", "Username empty & fishsh. scene=" + this.gRb);
          finish();
          GMTrace.o(10817546223616L, 80597);
          return true;
        }
        if (this.gRb == 1)
        {
          if (paramString.scene == 33)
          {
            this.ond = com.tencent.mm.plugin.wallet.a.cb(this.fKP, 2);
            this.ond.ay(20, getIntent().getStringExtra("receiver_name"));
          }
        }
        else
        {
          paramk = new Intent();
          paramk.putExtra("fee", paramString.jWS);
          paramk.putExtra("desc", paramString.desc);
          paramk.putExtra("scan_remittance_id", paramString.omB);
          paramk.putExtra("receiver_true_name", e.Xx(paramString.omA));
          paramk.putExtra("receiver_tips", paramString.omC);
          paramk.putExtra("rcvr_new_desc", paramString.omD);
          paramk.putExtra("payer_desc", paramString.omE);
          if (paramString.omG == 1)
          {
            paramk.putExtra("busi_type", paramString.omG);
            paramk.putExtra("rcvr_ticket", paramString.omF);
            paramk.putExtra("mch_name", paramString.omH);
            paramk.putExtra("mch_photo", paramString.omI);
            paramk.putExtra("mch_type", paramString.omL);
            paramk.putExtra("mch_time", paramString.omJ);
            paramk.putExtra("rcvr_open_id", paramString.omK);
            paramk.putExtra("get_pay_wifi", paramString.omM);
          }
          com.tencent.mm.kernel.h.xz();
          x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(this.fKP);
          com.tencent.mm.ac.b.y(this.fKP, 3);
          if (localx == null) {
            break label448;
          }
          b(this.fKP, paramString.scene, paramk);
        }
        for (;;)
        {
          GMTrace.o(10817546223616L, 80597);
          return true;
          this.ond = com.tencent.mm.plugin.wallet.a.cb(this.fKP, 3);
          this.ond.ay(10, getIntent().getStringExtra("receiver_name"));
          break;
          label448:
          w.d("MicroMsg.RemittanceAdapterUI", "Receiver in contactStg and try to get contact");
          final long l = bg.Pv();
          ak.a.gmX.a(this.fKP, "", new ak.b.a()
          {
            public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              GMTrace.i(10824928198656L, 80652);
              if (paramAnonymousBoolean)
              {
                w.v("MicroMsg.RemittanceAdapterUI", "getContact suc; cost=" + (bg.Pv() - l) + " ms");
                com.tencent.mm.ac.b.y(paramAnonymousString, 3);
                n.Dv().hS(paramAnonymousString);
              }
              for (;;)
              {
                RemittanceAdapterUI.this.b(RemittanceAdapterUI.this.fKP, paramk.scene, this.onf);
                GMTrace.o(10824928198656L, 80652);
                return;
                w.w("MicroMsg.RemittanceAdapterUI", "getContact failed");
              }
            }
          });
        }
      }
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        b(null, 31, null);
        GMTrace.o(10817546223616L, 80597);
        return true;
      }
    }
    else
    {
      setResult(0);
      com.tencent.mm.ui.base.h.bm(this, paramString);
      finish();
      GMTrace.o(10817546223616L, 80597);
      return true;
    }
    GMTrace.o(10817546223616L, 80597);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10817680441344L, 80598);
    GMTrace.o(10817680441344L, 80598);
    return -1;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(10817412005888L, 80596);
    if (!this.onc)
    {
      w.d("MicroMsg.RemittanceAdapterUI", "back press not lock");
      finish();
      GMTrace.o(10817412005888L, 80596);
      return;
    }
    w.d("MicroMsg.RemittanceAdapterUI", "back press but lock");
    GMTrace.o(10817412005888L, 80596);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10817009352704L, 80593);
    super.onCreate(paramBundle);
    sv(8);
    this.gRb = getIntent().getIntExtra("scene", 0);
    this.fKP = getIntent().getStringExtra("receiver_name");
    this.mChannel = getIntent().getIntExtra("pay_channel", -1);
    this.ond = com.tencent.mm.plugin.wallet.a.X(getIntent());
    if (this.mChannel == -1)
    {
      paramBundle = cmp();
      if (paramBundle != null) {
        this.mChannel = paramBundle.ler.getInt("pay_channel", -1);
      }
    }
    if (this.gRb == 1)
    {
      this.onc = true;
      bbv();
      GMTrace.o(10817009352704L, 80593);
      return;
    }
    if (this.gRb == 3)
    {
      hN(580);
      if (getIntent() == null)
      {
        w.d("MicroMsg.RemittanceAdapterUI", "func[doCheckPayNetscene] intent null");
        setResult(0);
        finish();
        GMTrace.o(10817009352704L, 80593);
        return;
      }
      paramBundle = new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3);
      paramBundle.fXf = "RemittanceProcess";
      r(paramBundle);
      GMTrace.o(10817009352704L, 80593);
      return;
    }
    if (this.gRb == 2)
    {
      if (bg.nm(this.fKP))
      {
        w.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.gRb);
        finish();
        GMTrace.o(10817009352704L, 80593);
        return;
      }
      b(this.fKP, 31, null);
      GMTrace.o(10817009352704L, 80593);
      return;
    }
    if ((this.gRb == 5) || (this.gRb == 6))
    {
      if (bg.nm(this.fKP))
      {
        w.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.gRb);
        finish();
        GMTrace.o(10817009352704L, 80593);
        return;
      }
      paramBundle = this.fKP;
      w.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.gRb + ", name=" + paramBundle);
      Intent localIntent = new Intent();
      com.tencent.mm.plugin.wallet.a.a(this.ond, localIntent);
      localIntent.setClass(this, RemittanceOSRedirect.class);
      localIntent.putExtra("receiver_name", paramBundle);
      localIntent.putExtra("scene", this.gRb);
      localIntent.putExtra("pay_scene", 31);
      localIntent.putExtra("pay_channel", this.mChannel);
      startActivity(localIntent);
      setResult(-1);
      finish();
      GMTrace.o(10817009352704L, 80593);
      return;
    }
    b(null, 31, null);
    GMTrace.o(10817009352704L, 80593);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10817277788160L, 80595);
    if (this.gRb == 3) {
      hO(580);
    }
    super.onDestroy();
    GMTrace.o(10817277788160L, 80595);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */