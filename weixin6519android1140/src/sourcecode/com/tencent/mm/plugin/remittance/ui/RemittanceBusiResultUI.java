package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.bm.b;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.ib;
import com.tencent.mm.protocal.c.if;
import com.tencent.mm.protocal.c.iw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@com.tencent.mm.ui.base.a(19)
public class RemittanceBusiResultUI
  extends WalletBaseUI
{
  private TextView izE;
  private String nAz;
  private TextView okC;
  private Button okK;
  private TextView onR;
  private TextView onS;
  private TextView onT;
  private CdnImageView onU;
  private TextView onV;
  private TextView onW;
  private Button onX;
  private ViewGroup onY;
  private ViewGroup onZ;
  private ViewGroup ooa;
  private String oob;
  private String ooc;
  private String ood;
  private String ooe;
  private double oof;
  private String oog;
  private String ooh;
  private String ooi;
  private b ooj;
  private boolean ook;
  private String ool;
  
  public RemittanceBusiResultUI()
  {
    GMTrace.i(19326950178816L, 143997);
    this.ook = false;
    GMTrace.o(19326950178816L, 143997);
  }
  
  private void a(final iw paramiw, boolean paramBoolean)
  {
    GMTrace.i(19328023920640L, 144005);
    if (paramiw != null)
    {
      this.onU.setUrl(paramiw.eQA);
      this.onV.setText(paramiw.title);
      this.onW.setText(paramiw.rgU);
      this.onX.setText(paramiw.rnz);
      this.onX.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19329097662464L, 144013);
          w.i("MicroMsg.RemittanceBusiResultUI", "app type: %s", new Object[] { Integer.valueOf(paramiw.type) });
          if (paramiw.type == 1)
          {
            RemittanceBusiResultUI.a(RemittanceBusiResultUI.this);
            paramAnonymousView = new qi();
            paramAnonymousView.eUY.userName = paramiw.tXV;
            paramAnonymousView.eUY.eVa = bg.aq(paramiw.tXW, "");
            paramAnonymousView.eUY.scene = 1034;
            paramAnonymousView.eUY.eVb = 0;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
            GMTrace.o(19329097662464L, 144013);
            return;
          }
          if (paramiw.type == 2)
          {
            RemittanceBusiResultUI.a(RemittanceBusiResultUI.this);
            e.m(RemittanceBusiResultUI.this.vKB.vKW, paramiw.url, true);
            GMTrace.o(19329097662464L, 144013);
            return;
          }
          int i = paramiw.type;
          GMTrace.o(19329097662464L, 144013);
        }
      });
      if (paramBoolean)
      {
        this.onX.setBackgroundResource(a.e.soS);
        this.onX.setTextColor(getResources().getColor(a.c.aPr));
      }
      this.ooa.setVisibility(0);
      GMTrace.o(19328023920640L, 144005);
      return;
    }
    w.i("MicroMsg.RemittanceBusiResultUI", "app info is null");
    this.ooa.setVisibility(8);
    GMTrace.o(19328023920640L, 144005);
  }
  
  protected final void MP()
  {
    GMTrace.i(19327218614272L, 143999);
    this.izE = ((TextView)findViewById(a.f.sFE));
    this.okC = ((TextView)findViewById(a.f.sFy));
    this.onR = ((TextView)findViewById(a.f.sFD));
    this.onS = ((TextView)findViewById(a.f.sFC));
    this.onT = ((TextView)findViewById(a.f.sFA));
    this.onY = ((LinearLayout)findViewById(a.f.sFB));
    this.onZ = ((LinearLayout)findViewById(a.f.sFz));
    this.onU = ((CdnImageView)findViewById(a.f.sFu));
    this.onV = ((TextView)findViewById(a.f.sFw));
    this.onW = ((TextView)findViewById(a.f.sFv));
    this.onX = ((Button)findViewById(a.f.sFs));
    this.ooa = ((ViewGroup)findViewById(a.f.sFt));
    this.okK = ((Button)findViewById(a.f.sFx));
    this.izE.setText(this.oob);
    this.okC.setText(e.r(this.oof));
    String str2 = e.dl(e.fs(this.ooe), 10);
    String str1 = str2;
    if (!bg.nm(this.ool)) {
      str1 = getString(a.i.sXo, new Object[] { str2, this.ool });
    }
    this.onR.setText(h.a(this, str1));
    if (!bg.nm(this.ooc))
    {
      this.onS.setText(this.ooc);
      this.onY.setVisibility(0);
      if (bg.nm(this.ood)) {
        break label369;
      }
      this.onT.setText(this.ood);
      this.onZ.setVisibility(0);
    }
    for (;;)
    {
      this.okK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19337956032512L, 144079);
          RemittanceBusiResultUI.this.finish();
          GMTrace.o(19337956032512L, 144079);
        }
      });
      GMTrace.o(19327218614272L, 143999);
      return;
      this.onY.setVisibility(8);
      break;
      label369:
      this.onZ.setVisibility(8);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19327352832000L, 144000);
    if ((paramk instanceof com.tencent.mm.plugin.remittance.c.d))
    {
      paramString = (com.tencent.mm.plugin.remittance.c.d)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        if (paramString.oma.jzH == 0)
        {
          this.ooj = paramString.oma.tXf;
          a(paramString.oma.tXh, false);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(19327352832000L, 144000);
      return false;
      w.e("MicroMsg.RemittanceBusiResultUI", "result response: %s, %s", new Object[] { Integer.valueOf(paramString.oma.jzH), paramString.oma.jzI });
      Toast.makeText(this, paramString.oma.jzI, 1).show();
      continue;
      w.e("MicroMsg.RemittanceBusiResultUI", "net error: %s", new Object[] { paramString });
      continue;
      if ((paramk instanceof com.tencent.mm.plugin.remittance.c.a))
      {
        paramString = (com.tencent.mm.plugin.remittance.c.a)paramk;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramString.olX.jzH == 0)
          {
            a(paramString.olX.tXh, true);
          }
          else
          {
            w.e("MicroMsg.RemittanceBusiResultUI", "qry response: %s, %s", new Object[] { Integer.valueOf(paramString.olX.jzH), paramString.olX.jzI });
            Toast.makeText(this, paramString.olX.jzI, 1).show();
          }
        }
        else {
          w.e("MicroMsg.RemittanceBusiResultUI", "net error: %s", new Object[] { paramString });
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19327755485184L, 144003);
    int i = a.g.sOv;
    GMTrace.o(19327755485184L, 144003);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19327084396544L, 143998);
    super.onCreate(paramBundle);
    hN(1537);
    hN(1680);
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (!com.tencent.mm.compatible.util.d.et(23)) {
        break label309;
      }
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      if (cN().cO() != null) {
        cN().cO().hide();
      }
      a(null);
      ld(false);
      le(false);
      this.oob = getIntent().getStringExtra("key_mch_name");
      this.oof = getIntent().getDoubleExtra("key_money", 0.0D);
      this.ooe = getIntent().getStringExtra("key_rcver_name");
      this.ool = getIntent().getStringExtra("key_rcver_true_name");
      this.ooc = getIntent().getStringExtra("key_rcv_desc");
      this.ood = getIntent().getStringExtra("key_pay_desc");
      this.oog = getIntent().getStringExtra("key_f2f_id");
      this.nAz = getIntent().getStringExtra("key_trans_id");
      this.ooh = getIntent().getStringExtra("key_rcvr_open_id");
      this.ooi = getIntent().getStringExtra("key_check_sign");
      this.ook = false;
      w.i("MicroMsg.RemittanceBusiResultUI", "fetch data");
      int i = (int)Math.round(this.oof * 100.0D);
      l(new com.tencent.mm.plugin.remittance.c.d(this.oog, this.nAz, this.ooh, this.ooi, i));
      MP();
      GMTrace.o(19327084396544L, 143998);
      return;
      label309:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(19327621267456L, 144002);
    super.onDestroy();
    hO(1537);
    hO(1680);
    GMTrace.o(19327621267456L, 144002);
  }
  
  public void onResume()
  {
    GMTrace.i(19327487049728L, 144001);
    super.onResume();
    if (this.ook)
    {
      w.i("MicroMsg.RemittanceBusiResultUI", "do act qry");
      int i = (int)Math.round(this.oof * 100.0D);
      b(new com.tencent.mm.plugin.remittance.c.a(this.oog, this.nAz, this.ooh, i, this.ooj, this.ooi), false);
      this.ook = false;
    }
    GMTrace.o(19327487049728L, 144001);
  }
  
  public final void sv(int paramInt)
  {
    GMTrace.i(19327889702912L, 144004);
    this.vKB.hqF.setVisibility(paramInt);
    GMTrace.o(19327889702912L, 144004);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\RemittanceBusiResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */