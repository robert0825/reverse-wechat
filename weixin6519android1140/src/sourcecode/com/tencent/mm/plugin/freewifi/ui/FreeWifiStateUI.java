package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;

@Deprecated
public abstract class FreeWifiStateUI
  extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected int cfz;
  protected String eCE;
  private int eFl;
  protected String eIH;
  protected String eSd;
  protected int eqV;
  private final com.tencent.mm.ao.a.a.c gKp;
  protected String lqZ;
  protected String lrb;
  private TextView lsV;
  protected String lsr;
  protected FreeWifiNetworkReceiver lss;
  protected boolean lst;
  private aj lsv;
  private aj lsw;
  private j.a lsx;
  private ImageView ltj;
  private TextView ltk;
  private TextView ltl;
  private Button ltm;
  private Button ltn;
  protected String ltq;
  protected String ltr;
  protected String lts;
  protected String ltt;
  private r luk;
  protected int lup;
  protected String luq;
  protected String lur;
  protected String signature;
  protected String ssid;
  
  public FreeWifiStateUI()
  {
    GMTrace.i(7227087781888L, 53846);
    this.eFl = 1;
    this.lst = false;
    this.luk = null;
    this.lsv = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7177158787072L, 53474);
        if (!bg.nm(FreeWifiStateUI.this.ssid))
        {
          FreeWifiStateUI.a(FreeWifiStateUI.this, FreeWifiStateUI.this.aBJ());
          w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { FreeWifiStateUI.this.ssid, Integer.valueOf(FreeWifiStateUI.a(FreeWifiStateUI.this)) });
          FreeWifiStateUI.b(FreeWifiStateUI.this).stopTimer();
          k.a locala = k.aAB();
          locala.ssid = FreeWifiStateUI.this.ssid;
          locala.eCE = FreeWifiStateUI.this.eCE;
          locala.lov = com.tencent.mm.plugin.freewifi.m.C(FreeWifiStateUI.this.getIntent());
          locala.low = com.tencent.mm.plugin.freewifi.m.E(FreeWifiStateUI.this.getIntent());
          locala.lox = k.b.loI.lpi;
          locala.loy = k.b.loI.name;
          locala.result = -16;
          locala.ePH = com.tencent.mm.plugin.freewifi.m.F(FreeWifiStateUI.this.getIntent());
          locala.lou = FreeWifiStateUI.this.eSd;
          locala.loz = FreeWifiStateUI.this.eIH;
          locala.aAD().aAC();
          if (FreeWifiStateUI.a(FreeWifiStateUI.this) != 2)
          {
            FreeWifiStateUI.this.aBN();
            FreeWifiStateUI.this.aBL();
            com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiStateUI.this.ssid, 3, FreeWifiStateUI.this.getIntent());
          }
        }
        GMTrace.o(7177158787072L, 53474);
        return false;
      }
    }, false);
    this.lsw = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7173132255232L, 53444);
        if (com.tencent.mm.plugin.freewifi.model.d.yy(FreeWifiStateUI.this.ssid))
        {
          FreeWifiStateUI.this.a(NetworkInfo.State.CONNECTED);
          FreeWifiStateUI.b(FreeWifiStateUI.this).stopTimer();
          GMTrace.o(7173132255232L, 53444);
          return false;
        }
        GMTrace.o(7173132255232L, 53444);
        return true;
      }
    }, true);
    c.a locala = new c.a();
    locala.gKA = true;
    locala.gKB = true;
    locala.gKR = R.g.aWz;
    locala.gKZ = true;
    locala.gLa = 0.0F;
    this.gKp = locala.Jn();
    this.lsx = new j.a()
    {
      private int lut;
      
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(7221853290496L, 53807);
        FreeWifiStateUI.a(FreeWifiStateUI.this, FreeWifiStateUI.this.aBJ());
        if (this.lut != FreeWifiStateUI.a(FreeWifiStateUI.this))
        {
          this.lut = FreeWifiStateUI.a(FreeWifiStateUI.this);
          FreeWifiStateUI.this.ne(FreeWifiStateUI.a(FreeWifiStateUI.this));
        }
        GMTrace.o(7221853290496L, 53807);
      }
    };
    GMTrace.o(7227087781888L, 53846);
  }
  
  private void aBO()
  {
    GMTrace.i(7228027305984L, 53853);
    this.lss = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.lss, localIntentFilter);
    GMTrace.o(7228027305984L, 53853);
  }
  
  private void goBack()
  {
    GMTrace.i(7228966830080L, 53860);
    com.tencent.mm.plugin.freewifi.l.r(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.hnH.i(localIntent, this);
    finish();
    GMTrace.o(7228966830080L, 53860);
  }
  
  protected void MP()
  {
    GMTrace.i(7227490435072L, 53849);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7185614503936L, 53537);
        FreeWifiStateUI.c(FreeWifiStateUI.this);
        GMTrace.o(7185614503936L, 53537);
        return true;
      }
    });
    if (getIntent().getIntExtra("free_wifi_protocol_type", 0) == 1) {
      findViewById(R.h.cjJ).setVisibility(0);
    }
    this.ltj = ((ImageView)findViewById(R.h.bBh));
    this.ltk = ((TextView)findViewById(R.h.bBT));
    this.ltl = ((TextView)findViewById(R.h.bBG));
    this.lsV = ((TextView)findViewById(R.h.bBo));
    this.ltm = ((Button)findViewById(R.h.bqf));
    this.ltm.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7232993361920L, 53890);
        com.tencent.mm.plugin.freewifi.l.q(com.tencent.mm.plugin.freewifi.model.d.aAX(), FreeWifiStateUI.this.getIntent().getStringExtra("free_wifi_ap_key"), FreeWifiStateUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        if (FreeWifiStateUI.this.aBJ() == 2)
        {
          FreeWifiStateUI.this.finish();
          GMTrace.o(7232993361920L, 53890);
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiStateUI.this.ssid, 1, FreeWifiStateUI.this.getIntent());
        FreeWifiStateUI.this.lst = false;
        FreeWifiStateUI.this.aBP();
        GMTrace.o(7232993361920L, 53890);
      }
    });
    this.ltn = ((Button)findViewById(R.h.cjK));
    this.ltn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7162931707904L, 53368);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", FreeWifiStateUI.this.ltt);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(FreeWifiStateUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7162931707904L, 53368);
      }
    });
    if (bg.nm(this.ssid))
    {
      this.ltl.setText(getString(R.l.dxZ));
      this.ltm.setVisibility(4);
    }
    GMTrace.o(7227490435072L, 53849);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7227356217344L, 53848);
    GMTrace.o(7227356217344L, 53848);
    return 1;
  }
  
  protected abstract void Wg();
  
  public abstract void a(NetworkInfo.State paramState);
  
  protected abstract void aBI();
  
  protected abstract int aBJ();
  
  protected final void aBL()
  {
    GMTrace.i(7227624652800L, 53850);
    if (this.lss != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister wifi state change receiver");
      this.lss.lqq = null;
    }
    GMTrace.o(7227624652800L, 53850);
  }
  
  protected final void aBM()
  {
    GMTrace.i(7227758870528L, 53851);
    if (this.lss == null) {
      aBO();
    }
    this.lss.lqr = this;
    GMTrace.o(7227758870528L, 53851);
  }
  
  protected final void aBN()
  {
    GMTrace.i(7227893088256L, 53852);
    if (this.lss != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister network changed receiver");
      this.lss.lqr = null;
    }
    GMTrace.o(7227893088256L, 53852);
  }
  
  protected final void aBP()
  {
    GMTrace.i(7228161523712L, 53854);
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.lsv.z(60000L, 60000L);
      this.lsw.z(1000L, 1000L);
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "wifi is not enable, enable it");
      j.aBh().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7196754575360L, 53620);
          FreeWifiStateUI.d(FreeWifiStateUI.this);
          GMTrace.o(7196754575360L, 53620);
        }
      });
      GMTrace.o(7228161523712L, 53854);
      return;
    }
    this.eFl = aBJ();
    w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.eFl) });
    if (this.eFl != 2)
    {
      if (com.tencent.mm.plugin.freewifi.m.E(getIntent()) == 4) {
        this.lsv.z(30000L, 30000L);
      }
      for (;;)
      {
        this.lsw.z(1000L, 1000L);
        if (!com.tencent.mm.plugin.freewifi.model.d.yy(this.ssid)) {
          break label274;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.lst) });
        if (!this.lst) {
          break;
        }
        w.d("MicroMsg.FreeWifi.FreeWifiStateUI", "now it is authing");
        GMTrace.o(7228161523712L, 53854);
        return;
        this.lsv.z(60000L, 60000L);
      }
      this.lsv.z(60000L, 60000L);
      this.lsw.z(1000L, 1000L);
      Wg();
      this.lst = true;
      GMTrace.o(7228161523712L, 53854);
      return;
      label274:
      j.aBh().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7176890351616L, 53472);
          w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now network ssid is not wechat freewifi :%s", new Object[] { FreeWifiStateUI.this.ssid });
          FreeWifiStateUI.this.aBI();
          GMTrace.o(7176890351616L, 53472);
        }
      });
      GMTrace.o(7228161523712L, 53854);
      return;
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, this.eFl, getIntent());
    GMTrace.o(7228161523712L, 53854);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7228429959168L, 53856);
    int i = R.i.cxs;
    GMTrace.o(7228429959168L, 53856);
    return i;
  }
  
  public final void nT(int paramInt)
  {
    GMTrace.i(7228698394624L, 53858);
    w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7228698394624L, 53858);
      return;
      GMTrace.o(7228698394624L, 53858);
      return;
      GMTrace.o(7228698394624L, 53858);
      return;
      aBL();
      aBP();
    }
  }
  
  protected final void ne(int paramInt)
  {
    GMTrace.i(7228295741440L, 53855);
    w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.lsV.setVisibility(4);
      this.ltm.setText(R.l.diH);
      if (this.cfz == 3) {
        this.ltl.setText(getString(R.l.dIG, new Object[] { this.ssid }));
      }
      break;
    }
    for (;;)
    {
      if (!bg.nm(this.eSd))
      {
        if (!bg.nm(this.ltr)) {
          this.ltk.setText(this.ltr);
        }
        if (!bg.nm(this.ltq)) {
          n.Jd().a(this.ltq, this.ltj, this.gKp);
        }
      }
      label488:
      for (;;)
      {
        GMTrace.o(7228295741440L, 53855);
        return;
        if (this.luk != null) {
          this.luk.dismiss();
        }
        this.lsv.stopTimer();
        this.lsw.stopTimer();
        this.lst = false;
        this.lsV.setVisibility(4);
        this.ltm.setText(R.l.diH);
        if ((com.tencent.mm.plugin.freewifi.m.F(getIntent()) == 10) && (!com.tencent.mm.plugin.freewifi.m.yp(com.tencent.mm.compatible.d.p.fQH.fRb)) && (!com.tencent.mm.plugin.freewifi.m.yp(com.tencent.mm.compatible.d.p.aD(this.vKB.vKW)))) {
          this.ltm.setText(String.format(getString(R.l.dxx), new Object[] { com.tencent.mm.compatible.d.p.aD(this.vKB.vKW) }));
        }
        if (this.cfz == 3) {
          this.ltl.setText(getString(R.l.dIG, new Object[] { this.ssid }));
        }
        for (;;)
        {
          if (bg.nm(this.eSd)) {
            break label488;
          }
          if (!bg.nm(this.ltr)) {
            this.ltk.setText(this.ltr);
          }
          if (bg.nm(this.ltq)) {
            break;
          }
          n.Jd().a(this.ltq, this.ltj, this.gKp);
          GMTrace.o(7228295741440L, 53855);
          return;
          if (bg.nm(this.lts)) {
            this.ltl.setText(getString(R.l.diD));
          } else {
            this.ltl.setText(this.lts);
          }
        }
      }
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.lsv.stopTimer();
      this.lsw.stopTimer();
      this.lsV.setVisibility(0);
      this.ltm.setText(R.l.dxX);
      GMTrace.o(7228295741440L, 53855);
      return;
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.lsv.stopTimer();
      this.lsw.stopTimer();
      this.ltm.setText(R.l.diB);
      this.ltm.setClickable(false);
      Intent localIntent = getIntent();
      localIntent.putExtra("free_wifi_appid", this.eSd);
      localIntent.putExtra("free_wifi_app_nickname", this.lrb);
      localIntent.putExtra("free_wifi_app_username", this.eIH);
      localIntent.putExtra("free_wifi_signature", this.signature);
      localIntent.putExtra("free_wifi_finish_actioncode", this.lup);
      localIntent.putExtra("free_wifi_finish_url", this.luq);
      if (bg.nm(this.lur)) {
        localIntent.setClass(this, FreeWifiSuccUI.class);
      }
      for (;;)
      {
        finish();
        startActivity(localIntent);
        d.rw();
        GMTrace.o(7228295741440L, 53855);
        return;
        localIntent.putExtra("free_wifi_qinghuai_url", this.lur);
        localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
      }
      this.lsV.setVisibility(4);
      this.ltm.setText(R.l.diE);
      this.luk = h.a(this.vKB.vKW, getString(R.l.diE), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7161857966080L, 53360);
          com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiStateUI.this.ssid, 4, FreeWifiStateUI.this.getIntent());
          GMTrace.o(7161857966080L, 53360);
        }
      });
      GMTrace.o(7228295741440L, 53855);
      return;
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.lsv.stopTimer();
      this.lsw.stopTimer();
      this.lsV.setVisibility(0);
      this.ltm.setText(R.l.dxX);
      GMTrace.o(7228295741440L, 53855);
      return;
      GMTrace.o(7228295741440L, 53855);
      return;
      if (bg.nm(this.lts)) {
        this.ltl.setText(getString(R.l.diD));
      } else {
        this.ltl.setText(this.lts);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7227221999616L, 53847);
    super.onCreate(paramBundle);
    this.eCE = getIntent().getStringExtra("free_wifi_ap_key");
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.lsr = getIntent().getStringExtra("free_wifi_mid");
    this.lqZ = getIntent().getStringExtra("free_wifi_url");
    this.cfz = getIntent().getIntExtra("free_wifi_source", 1);
    this.eqV = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.eSd = getIntent().getStringExtra("free_wifi_appid");
    this.ltq = getIntent().getStringExtra("free_wifi_head_img_url");
    this.ltr = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.lts = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.ltt = getIntent().getStringExtra("free_wifi_privacy_url");
    this.lrb = getIntent().getStringExtra("free_wifi_app_nickname");
    switch (this.cfz)
    {
    default: 
      if (bg.nm(this.ssid)) {
        w.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      break;
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      for (;;)
      {
        label243:
        MP();
        j.aBe().c(this.lsx);
        com.tencent.mm.plugin.freewifi.l.p(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
        GMTrace.o(7227221999616L, 53847);
        return;
        paramBundle = j.aBe().aBG();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.lsr = paramBundle.field_mid;
          this.lqZ = paramBundle.field_url;
          w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.lsr, this.lqZ });
          break;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bg.nm(this.ssid)) {
          break label398;
        }
        w.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      label398:
      paramBundle = j.aBe().yH(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = aa.RP(this.ssid);
        paramBundle.field_ssid = this.ssid;
      }
      break;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.lqZ;
      paramBundle.field_mid = this.lsr;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      paramBundle.field_connectState = 1;
      if (i != 0)
      {
        j.aBe().b(paramBundle);
        break;
      }
      j.aBe().c(paramBundle, new String[0]);
      break;
      w.i("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.lsr, Integer.valueOf(this.cfz) });
      break label243;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7228564176896L, 53857);
    super.onDestroy();
    j.aBe().j(this.lsx);
    aBL();
    aBN();
    if (this.lss != null) {
      unregisterReceiver(this.lss);
    }
    this.lsv.stopTimer();
    this.lsw.stopTimer();
    j.aBh().release();
    GMTrace.o(7228564176896L, 53857);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7228832612352L, 53859);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7228832612352L, 53859);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7228832612352L, 53859);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */