package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.remittance.c.r;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceResultOldUI
  extends RemittanceResultUI
{
  private int onk;
  private Orders opK;
  private String opL;
  private boolean opM;
  
  public RemittanceResultOldUI()
  {
    GMTrace.i(10829088948224L, 80683);
    GMTrace.o(10829088948224L, 80683);
  }
  
  private void bbK()
  {
    GMTrace.i(10829894254592L, 80689);
    if (this.ui.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.ui.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
        localBundle.putString("realname_verify_process_jump_plugin", "remittance");
        localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(10816472481792L, 80589);
            RemittanceResultOldUI.b(RemittanceResultOldUI.this);
            GMTrace.o(10816472481792L, 80589);
          }
        });
        this.ui.remove("key_realname_guide_helper");
      }
      GMTrace.o(10829894254592L, 80689);
      return;
    }
    bbL();
    GMTrace.o(10829894254592L, 80689);
  }
  
  private void bbL()
  {
    GMTrace.i(10830028472320L, 80690);
    cmp().b(this, this.ui);
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10828954730496L, 80682);
        if ((RemittanceResultOldUI.c(RemittanceResultOldUI.this) == 33) || (RemittanceResultOldUI.c(RemittanceResultOldUI.this) == 32))
        {
          RemittanceResultOldUI.this.finish();
          GMTrace.o(10828954730496L, 80682);
          return;
        }
        if ((!bg.nm(RemittanceResultOldUI.d(RemittanceResultOldUI.this))) && (!RemittanceResultOldUI.e(RemittanceResultOldUI.this)))
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Chat_User", RemittanceResultOldUI.d(RemittanceResultOldUI.this));
          localIntent.putExtra("finish_direct", false);
          d.a(RemittanceResultOldUI.this, ".ui.chatting.En_5b8fbb1e", localIntent);
          GMTrace.o(10828954730496L, 80682);
          return;
        }
        RemittanceResultOldUI.this.finish();
        GMTrace.o(10828954730496L, 80682);
      }
    }, 100L);
    GMTrace.o(10830028472320L, 80690);
  }
  
  protected final void MP()
  {
    int k = 1;
    boolean bool = false;
    GMTrace.i(10829760036864L, 80688);
    sq(getString(a.i.sYv));
    a(null);
    ld(false);
    le(false);
    Object localObject1 = (TextView)findViewById(a.f.sGQ);
    if (this.opK != null) {
      ((TextView)localObject1).setText(com.tencent.mm.wallet_core.ui.e.d(this.opK.rhd, this.opK.nEr));
    }
    Object localObject3 = (PayInfo)this.ui.getParcelable("key_pay_info");
    if (localObject3 == null)
    {
      w.e("MicroMsg.RemittanceResultOldUI", "payInfo is null!!!");
      finish();
      GMTrace.o(10829760036864L, 80688);
      return;
    }
    localObject1 = "";
    if (((PayInfo)localObject3).tIC != null)
    {
      this.opM = ((PayInfo)localObject3).tIC.getBoolean("extinfo_key_4");
      localObject1 = ((PayInfo)localObject3).tIC.getString("extinfo_key_1");
    }
    int i = ((PayInfo)localObject3).ePL;
    this.onk = i;
    this.opL = ((String)localObject1);
    Object localObject2 = com.tencent.mm.wallet_core.ui.e.fs((String)localObject1);
    if (i == 31)
    {
      localObject1 = (TextView)findViewById(a.f.sGS);
      localObject2 = getString(a.i.sGS, new Object[] { localObject2 });
      if (!bg.nm((String)localObject2))
      {
        ((TextView)localObject1).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject2, ((TextView)localObject1).getTextSize()));
        ((TextView)localObject1).setVisibility(0);
      }
      for (;;)
      {
        findViewById(a.f.sGJ).setVisibility(8);
        if (this.opK.oml > 0.0D)
        {
          localObject1 = getResources().getString(a.i.sYt, new Object[] { com.tencent.mm.wallet_core.ui.e.d(this.opK.oml, this.opK.nEr) });
          ((TextView)findViewById(a.f.ssW)).setText((CharSequence)localObject1);
          findViewById(a.f.ssX).setVisibility(0);
        }
        ((Button)findViewById(a.f.sGR)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(10821706973184L, 80628);
            RemittanceResultOldUI.a(RemittanceResultOldUI.this);
            GMTrace.o(10821706973184L, 80628);
          }
        });
        com.tencent.mm.kernel.h.xz();
        localObject1 = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrC, Boolean.valueOf(false));
        if (localObject1 != null) {
          bool = ((Boolean)localObject1).booleanValue();
        }
        if (!bool) {
          break;
        }
        w.i("MicroMsg.RemittanceResultOldUI", "has show the finger print auth guide!");
        GMTrace.o(10829760036864L, 80688);
        return;
        ((TextView)localObject1).setVisibility(8);
      }
    }
    localObject1 = "";
    if (((PayInfo)localObject3).tIC != null) {
      localObject1 = ((PayInfo)localObject3).tIC.getString("extinfo_key_2");
    }
    if ((i != 32) && (i != 33)) {
      if (!bg.nm((String)localObject1))
      {
        localObject1 = com.tencent.mm.wallet_core.ui.e.Xx((String)localObject1);
        localObject1 = (String)localObject2 + "（" + (String)localObject1 + "）";
      }
    }
    for (;;)
    {
      label509:
      localObject2 = (TextView)findViewById(a.f.sGS);
      label565:
      TextView localTextView;
      String str1;
      if (!bg.nm((String)localObject1))
      {
        ((TextView)localObject2).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, getString(a.i.sYu, new Object[] { localObject1 }), ((TextView)localObject2).getTextSize()));
        ((TextView)localObject2).setVisibility(0);
        if ((i != 33) && (i != 32)) {
          break label887;
        }
        localObject1 = findViewById(a.f.sGO);
        localObject2 = (TextView)findViewById(a.f.sGP);
        localTextView = (TextView)findViewById(a.f.sGN);
        str1 = ((PayInfo)localObject3).tIC.getString("extinfo_key_3");
        String str2 = ((PayInfo)localObject3).tIC.getString("extinfo_key_8");
        if (bg.nm(str1)) {
          break label863;
        }
        localTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, str1, localTextView.getTextSize()));
        ((View)localObject1).setVisibility(0);
        if (bg.nm(str2)) {
          break label1056;
        }
        ((TextView)localObject2).setText(str2);
        i = 1;
      }
      for (;;)
      {
        label683:
        localObject1 = findViewById(a.f.sGL);
        localObject2 = (TextView)findViewById(a.f.sGM);
        localTextView = (TextView)findViewById(a.f.sGK);
        str1 = ((PayInfo)localObject3).tIC.getString("extinfo_key_6");
        localObject3 = ((PayInfo)localObject3).tIC.getString("extinfo_key_7");
        if (!bg.nm((String)localObject3))
        {
          localTextView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject3, localTextView.getTextSize()));
          localTextView.setVisibility(0);
          j = k;
          if (!bg.nm(str1)) {
            ((TextView)localObject2).setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, str1, ((TextView)localObject2).getTextSize()));
          }
        }
        for (int j = k;; j = 0)
        {
          if ((i != 0) || (j != 0)) {
            break label885;
          }
          findViewById(a.f.sGJ).setVisibility(8);
          break;
          localObject1 = (String)localObject2 + getString(a.i.sYz);
          break label509;
          ((TextView)localObject2).setVisibility(8);
          break label565;
          label863:
          ((View)localObject1).setVisibility(8);
          i = 0;
          break label683;
          ((View)localObject1).setVisibility(8);
        }
        label885:
        break;
        label887:
        if ((i != 5) || (this.opK.rhv == null) || (this.opK.rhv.get(0) == null) || (TextUtils.isEmpty(((Orders.Commodity)this.opK.rhv.get(0)).nEg))) {
          break;
        }
        ((TextView)localObject2).setText(((Orders.Commodity)this.opK.rhv.get(0)).nEg);
        break;
        localObject2 = com.tencent.mm.wallet_core.a.ad(this);
        localObject1 = new Bundle();
        if (localObject2 != null) {
          localObject1 = ((com.tencent.mm.wallet_core.b)localObject2).ler;
        }
        if (TextUtils.isEmpty(((Bundle)localObject1).getString("key_pwd1")))
        {
          w.i("MicroMsg.RemittanceResultOldUI", "pwd is empty, not show the finger print auth guide!");
          GMTrace.o(10829760036864L, 80688);
          return;
        }
        if (localObject2 != null) {
          ((com.tencent.mm.wallet_core.b)localObject2).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Bundle)localObject1);
        }
        GMTrace.o(10829760036864L, 80688);
        return;
        label1056:
        i = 1;
      }
      localObject1 = localObject2;
    }
  }
  
  protected final boolean bbM()
  {
    GMTrace.i(10830162690048L, 80691);
    GMTrace.o(10830162690048L, 80691);
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10829223165952L, 80684);
    GMTrace.o(10829223165952L, 80684);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10829357383680L, 80685);
    int i = a.g.sOB;
    GMTrace.o(10829357383680L, 80685);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10829491601408L, 80686);
    super.onCreate(paramBundle);
    this.opK = ((Orders)this.ui.getParcelable("key_orders"));
    MP();
    if (this.onk == 31)
    {
      paramBundle = "";
      if (this.opK.rhv.size() > 0) {
        paramBundle = ((Orders.Commodity)this.opK.rhv.get(0)).eRP;
      }
      w.i("MicroMsg.RemittanceResultOldUI", "transId: %s", new Object[] { paramBundle });
      com.tencent.mm.plugin.remittance.a.b.bbf().bbi().ds(paramBundle, this.opL);
    }
    GMTrace.o(10829491601408L, 80686);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(10829625819136L, 80687);
    if (paramInt == 4) {
      bbK();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(10829625819136L, 80687);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceResultOldUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */