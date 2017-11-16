package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.remittance.c.r;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceResultNewUI
  extends RemittanceResultUI
{
  private PayInfo oek;
  private int onk;
  private Orders opK;
  private String opL;
  private boolean opM;
  private TextView opN;
  private ViewGroup opO;
  private TextView opP;
  private WalletTextView opQ;
  private ViewGroup opR;
  private ViewGroup opS;
  private ViewGroup opT;
  private TextView opU;
  private TextView opV;
  private WalletTextView opW;
  private Button opX;
  
  public RemittanceResultNewUI()
  {
    GMTrace.i(10826807246848L, 80666);
    GMTrace.o(10826807246848L, 80666);
  }
  
  private void bbJ()
  {
    boolean bool = true;
    GMTrace.i(10827478335488L, 80671);
    if (this.opK != null) {
      if (this.opK.oml <= 0.0D) {
        break label181;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.RemittanceResultNewUI", "need set charge fee: %s", new Object[] { Boolean.valueOf(bool) });
      if (this.opK.oml > 0.0D)
      {
        String str1 = getString(a.i.sYs);
        String str2 = com.tencent.mm.wallet_core.ui.e.d(this.opK.oml, this.opK.nEr);
        ViewGroup localViewGroup = (ViewGroup)getLayoutInflater().inflate(a.g.sMr, this.opS, false);
        TextView localTextView1 = (TextView)localViewGroup.findViewById(a.f.chT);
        ImageView localImageView = (ImageView)localViewGroup.findViewById(a.f.bfq);
        TextView localTextView2 = (TextView)localViewGroup.findViewById(a.f.bti);
        localTextView1.setText(str1);
        localImageView.setVisibility(8);
        localTextView2.setText(str2);
        this.opS.addView(localViewGroup);
      }
      GMTrace.o(10827478335488L, 80671);
      return;
      label181:
      bool = false;
    }
  }
  
  private void bbK()
  {
    GMTrace.i(10827612553216L, 80672);
    w.i("MicroMsg.RemittanceResultNewUI", "endRemittance");
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
            GMTrace.i(10824122892288L, 80646);
            RemittanceResultNewUI.b(RemittanceResultNewUI.this);
            GMTrace.o(10824122892288L, 80646);
          }
        });
        localRealnameGuideHelper.a(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19336882290688L, 144071);
            RemittanceResultNewUI.b(RemittanceResultNewUI.this);
            GMTrace.o(19336882290688L, 144071);
          }
        });
        this.ui.remove("key_realname_guide_helper");
      }
      GMTrace.o(10827612553216L, 80672);
      return;
    }
    bbL();
    GMTrace.o(10827612553216L, 80672);
  }
  
  private void bbL()
  {
    GMTrace.i(10827746770944L, 80673);
    w.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
    cmp().b(this, this.ui);
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19336479637504L, 144068);
        if ((RemittanceResultNewUI.c(RemittanceResultNewUI.this) == 33) || (RemittanceResultNewUI.c(RemittanceResultNewUI.this) == 32) || (RemittanceResultNewUI.c(RemittanceResultNewUI.this) == 48))
        {
          RemittanceResultNewUI.this.finish();
          GMTrace.o(19336479637504L, 144068);
          return;
        }
        if ((!bg.nm(RemittanceResultNewUI.d(RemittanceResultNewUI.this))) && (!RemittanceResultNewUI.e(RemittanceResultNewUI.this)))
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Chat_User", RemittanceResultNewUI.d(RemittanceResultNewUI.this));
          localIntent.putExtra("finish_direct", false);
          com.tencent.mm.bj.d.a(RemittanceResultNewUI.this, ".ui.chatting.En_5b8fbb1e", localIntent);
          GMTrace.o(19336479637504L, 144068);
          return;
        }
        RemittanceResultNewUI.this.finish();
        GMTrace.o(19336479637504L, 144068);
      }
    }, 100L);
    GMTrace.o(10827746770944L, 80673);
  }
  
  protected final void MP()
  {
    boolean bool2 = false;
    GMTrace.i(10827344117760L, 80670);
    a(null);
    ld(false);
    le(false);
    this.opN = ((TextView)findViewById(a.f.sDL));
    this.opO = ((ViewGroup)findViewById(a.f.svx));
    this.opP = ((TextView)findViewById(a.f.svr));
    this.opQ = ((WalletTextView)findViewById(a.f.svq));
    this.opR = ((ViewGroup)findViewById(a.f.svv));
    this.opS = ((ViewGroup)findViewById(a.f.svw));
    this.opT = ((ViewGroup)findViewById(a.f.sCO));
    this.opU = ((TextView)findViewById(a.f.sCN));
    this.opV = ((TextView)findViewById(a.f.sCM));
    this.opW = ((WalletTextView)findViewById(a.f.sCL));
    this.opX = ((Button)findViewById(a.f.sHX));
    this.opX.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10823586021376L, 80642);
        RemittanceResultNewUI.a(RemittanceResultNewUI.this);
        GMTrace.o(10823586021376L, 80642);
      }
    });
    Object localObject3 = com.tencent.mm.wallet_core.ui.e.fs(this.opL);
    Object localObject1;
    if ((this.onk == 31) || (this.onk == 5))
    {
      this.opV.setText(com.tencent.mm.wallet_core.ui.e.Xu(this.opK.nEr));
      this.opW.setText(com.tencent.mm.wallet_core.ui.e.r(this.opK.rhd));
      if (this.onk == 31)
      {
        localObject1 = getString(a.i.sGS, new Object[] { localObject3 });
        if (!bg.nm((String)localObject1)) {
          this.opU.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, (CharSequence)localObject1, this.opU.getTextSize()));
        }
        for (;;)
        {
          this.opT.setVisibility(0);
          if (this.opK.oml > 0.0D)
          {
            bbJ();
            ((ViewGroup.MarginLayoutParams)this.opR.getLayoutParams()).topMargin = com.tencent.mm.br.a.fromDPToPix(this, 20);
            this.opR.setVisibility(0);
            this.opS.setVisibility(0);
          }
          com.tencent.mm.kernel.h.xz();
          localObject1 = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrC, Boolean.valueOf(false));
          bool1 = bool2;
          if (localObject1 != null) {
            bool1 = ((Boolean)localObject1).booleanValue();
          }
          if (!bool1) {
            break;
          }
          w.i("MicroMsg.RemittanceResultNewUI", "has show the finger print auth guide!");
          GMTrace.o(10827344117760L, 80670);
          return;
          this.opU.setVisibility(8);
        }
      }
      if ((this.oek.tIC == null) || (!this.oek.tIC.getBoolean("extinfo_key_10"))) {
        break label1272;
      }
    }
    label989:
    label1170:
    label1269:
    label1272:
    for (boolean bool1 = true;; bool1 = false)
    {
      w.i("MicroMsg.RemittanceResultNewUI", "isEmojiReward: %s", new Object[] { Boolean.valueOf(bool1) });
      if (bool1)
      {
        this.opU.setText(getString(a.i.sYb));
        break;
      }
      if ((this.opK.rhv == null) || (this.opK.rhv.get(0) == null) || (TextUtils.isEmpty(((Orders.Commodity)this.opK.rhv.get(0)).nEg))) {
        break;
      }
      this.opU.setText(((Orders.Commodity)this.opK.rhv.get(0)).nEg);
      break;
      this.opP.setText(com.tencent.mm.wallet_core.ui.e.Xu(this.opK.nEr));
      this.opQ.setText(com.tencent.mm.wallet_core.ui.e.r(this.opK.rhd));
      this.opS.removeAllViews();
      Object localObject2;
      if ((this.onk == 32) || (this.onk == 33) || (this.onk == 48))
      {
        localObject2 = "";
        if (this.oek.tIC != null) {
          localObject2 = this.oek.tIC.getString("extinfo_key_2");
        }
        localObject1 = localObject3;
        if (localObject3 != null)
        {
          localObject1 = localObject3;
          if (((String)localObject3).length() > 10) {
            localObject1 = ((String)localObject3).substring(0, 10) + "...";
          }
        }
        if (bg.nm((String)localObject2)) {
          break label1269;
        }
        localObject2 = com.tencent.mm.wallet_core.ui.e.Xx((String)localObject2);
        localObject1 = (String)localObject1 + "(" + (String)localObject2 + ")";
      }
      for (;;)
      {
        w.i("MicroMsg.RemittanceResultNewUI", "setF2FNameView");
        localObject2 = (ViewGroup)getLayoutInflater().inflate(a.g.sMr, this.opS, false);
        localObject3 = (TextView)((ViewGroup)localObject2).findViewById(a.f.chT);
        Object localObject4 = (ImageView)((ViewGroup)localObject2).findViewById(a.f.bfq);
        TextView localTextView = (TextView)((ViewGroup)localObject2).findViewById(a.f.bti);
        ((TextView)localObject3).setText(getString(a.i.sYl));
        a.b.a((ImageView)localObject4, this.opL, 0.5F, false);
        localTextView.setText((CharSequence)localObject1);
        this.opS.addView((View)localObject2);
        w.i("MicroMsg.RemittanceResultNewUI", "setF2FReceiverRemarkView");
        localObject1 = this.oek.tIC.getString("extinfo_key_3");
        localObject2 = this.oek.tIC.getString("extinfo_key_8");
        if (!bg.nm((String)localObject1))
        {
          localObject3 = (ViewGroup)getLayoutInflater().inflate(a.g.yvR, this.opS, false);
          localObject4 = (TextView)((ViewGroup)localObject3).findViewById(a.f.chT);
          localTextView = (TextView)((ViewGroup)localObject3).findViewById(a.f.bti);
          if (!bg.nm((String)localObject2))
          {
            ((TextView)localObject4).setText((CharSequence)localObject2);
            localTextView.setText((CharSequence)localObject1);
            this.opS.addView((View)localObject3);
          }
        }
        else
        {
          w.i("MicroMsg.RemittanceResultNewUI", "setF2FPayerRemarkView");
          localObject1 = this.oek.tIC.getString("extinfo_key_6");
          localObject2 = this.oek.tIC.getString("extinfo_key_7");
          if (!bg.nm((String)localObject2))
          {
            localObject3 = (ViewGroup)getLayoutInflater().inflate(a.g.yvR, this.opS, false);
            localObject4 = (TextView)((ViewGroup)localObject3).findViewById(a.f.chT);
            localTextView = (TextView)((ViewGroup)localObject3).findViewById(a.f.bti);
            if (bg.nm((String)localObject1)) {
              break label1170;
            }
            ((TextView)localObject4).setText((CharSequence)localObject1);
          }
        }
        for (;;)
        {
          localTextView.setText((CharSequence)localObject2);
          this.opS.addView((View)localObject3);
          bbJ();
          this.opR.setVisibility(0);
          this.opS.setVisibility(0);
          this.opO.setVisibility(0);
          break;
          ((TextView)localObject4).setText(getString(a.i.sSD));
          break label989;
          ((TextView)localObject4).setText(getString(a.i.sSC));
        }
        localObject2 = com.tencent.mm.wallet_core.a.ad(this);
        localObject1 = new Bundle();
        if (localObject2 != null) {
          localObject1 = ((com.tencent.mm.wallet_core.b)localObject2).ler;
        }
        if (TextUtils.isEmpty(((Bundle)localObject1).getString("key_pwd1")))
        {
          w.i("MicroMsg.RemittanceResultNewUI", "pwd is empty, not show the finger print auth guide!");
          GMTrace.o(10827344117760L, 80670);
          return;
        }
        if (localObject2 != null) {
          ((com.tencent.mm.wallet_core.b)localObject2).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Bundle)localObject1);
        }
        GMTrace.o(10827344117760L, 80670);
        return;
      }
    }
  }
  
  protected final boolean bbM()
  {
    GMTrace.i(10828015206400L, 80675);
    GMTrace.o(10828015206400L, 80675);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10827075682304L, 80668);
    int i = a.g.sOA;
    GMTrace.o(10827075682304L, 80668);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10826941464576L, 80667);
    super.onCreate(paramBundle);
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (!com.tencent.mm.compatible.util.d.et(23)) {
        break label134;
      }
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      if (cN().cO() != null) {
        cN().cO().hide();
      }
      this.opK = ((Orders)this.ui.getParcelable("key_orders"));
      this.oek = ((PayInfo)this.ui.getParcelable("key_pay_info"));
      if (this.oek != null) {
        break;
      }
      w.e("MicroMsg.RemittanceResultNewUI", "payInfo is null!!!");
      finish();
      GMTrace.o(10826941464576L, 80667);
      return;
      label134:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
    paramBundle = "";
    if (this.oek.tIC != null)
    {
      this.opM = this.oek.tIC.getBoolean("extinfo_key_4");
      paramBundle = this.oek.tIC.getString("extinfo_key_1");
    }
    int i = this.oek.ePL;
    this.onk = i;
    this.opL = paramBundle;
    w.i("MicroMsg.RemittanceResultNewUI", "payScene: %s", new Object[] { Integer.valueOf(i) });
    MP();
    if (this.onk == 31)
    {
      paramBundle = "";
      if (this.opK.rhv.size() > 0) {
        paramBundle = ((Orders.Commodity)this.opK.rhv.get(0)).eRP;
      }
      w.i("MicroMsg.RemittanceResultNewUI", "transId: %s", new Object[] { paramBundle });
      com.tencent.mm.plugin.remittance.a.b.bbf().bbi().ds(paramBundle, this.opL);
    }
    GMTrace.o(10826941464576L, 80667);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(10827209900032L, 80669);
    if (paramInt == 4) {
      bbK();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(10827209900032L, 80669);
    return bool;
  }
  
  public final void sv(int paramInt)
  {
    GMTrace.i(10827880988672L, 80674);
    this.vKB.hqF.setVisibility(paramInt);
    GMTrace.o(10827880988672L, 80674);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceResultNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */