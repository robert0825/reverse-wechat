package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
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
import com.tencent.mm.ad.e;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.h.b;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;

@Deprecated
public class ProtocolThreeTwoUI
  extends MMActivity
{
  protected int cfz;
  private String eCE;
  private String eDJ;
  private int eFl;
  protected String eIH;
  protected String eSd;
  protected int eqV;
  private final com.tencent.mm.ao.a.a.c gKp;
  private Intent intent;
  protected String lqZ;
  protected String lrb;
  private com.tencent.mm.plugin.freewifi.a lrf;
  private int lrl;
  private String lrw;
  private TextView lsV;
  protected String lsr;
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
  private aj luM;
  private r luk;
  protected int lup;
  protected String luq;
  protected String lur;
  private String openId;
  private String sign;
  protected String signature;
  protected String ssid;
  
  public ProtocolThreeTwoUI()
  {
    GMTrace.i(7164810756096L, 53382);
    this.eFl = 1;
    this.lrl = 0;
    this.luM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7218095194112L, 53779);
        if (!bg.nm(ProtocolThreeTwoUI.this.ssid))
        {
          ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this, ProtocolThreeTwoUI.this.aBJ());
          if (ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this) != 2)
          {
            w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.connectTimeoutHandler, desc=wifi connecttimeout. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeTwoUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeTwoUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this)) });
            com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeTwoUI.this.ssid, 3, ProtocolThreeTwoUI.this.getIntent());
            ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this, 33, "AUTH_302_TIMES_EXCESS");
          }
        }
        GMTrace.o(7218095194112L, 53779);
        return false;
      }
    }, false);
    c.a locala = new c.a();
    locala.gKA = true;
    locala.gKB = true;
    locala.gKR = R.g.aWz;
    locala.gKZ = true;
    locala.gLa = 0.0F;
    this.gKp = locala.Jn();
    GMTrace.o(7164810756096L, 53382);
  }
  
  private void V(int paramInt, String paramString)
  {
    GMTrace.i(7166018715648L, 53391);
    k.a locala = com.tencent.mm.plugin.freewifi.k.aAB();
    locala.ssid = this.ssid;
    locala.bssid = com.tencent.mm.plugin.freewifi.m.yt("MicroMsg.FreeWifi.Protocol32UI");
    locala.eCF = com.tencent.mm.plugin.freewifi.m.yu("MicroMsg.FreeWifi.Protocol32UI");
    locala.eCE = this.eCE;
    locala.lou = this.eSd;
    locala.lov = com.tencent.mm.plugin.freewifi.m.C(this.intent);
    locala.low = com.tencent.mm.plugin.freewifi.m.E(this.intent);
    locala.lox = k.b.loZ.lpi;
    locala.loy = k.b.loZ.name;
    locala.result = paramInt;
    locala.jNb = paramString;
    locala.ePH = com.tencent.mm.plugin.freewifi.m.F(this.intent);
    locala.loz = this.eIH;
    locala.aAD().aAC();
    GMTrace.o(7166018715648L, 53391);
  }
  
  private void goBack()
  {
    GMTrace.i(7165750280192L, 53389);
    com.tencent.mm.plugin.freewifi.l.r(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.hnH.i(localIntent, this);
    finish();
    GMTrace.o(7165750280192L, 53389);
  }
  
  public final void MP()
  {
    GMTrace.i(7165079191552L, 53384);
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
    w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.initView, desc=Initializing the view. ssid=%s, mid=%s, fullUrl=%s, source=%d, channel=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.ssid, this.lsr, this.lqZ, Integer.valueOf(this.cfz), Integer.valueOf(this.eqV), this.eSd, this.ltq, this.ltr, this.ltt });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7209639477248L, 53716);
        ProtocolThreeTwoUI.b(ProtocolThreeTwoUI.this);
        GMTrace.o(7209639477248L, 53716);
        return true;
      }
    });
    findViewById(R.h.cjJ).setVisibility(0);
    this.ltj = ((ImageView)findViewById(R.h.bBh));
    this.ltk = ((TextView)findViewById(R.h.bBT));
    this.ltl = ((TextView)findViewById(R.h.bBG));
    this.lsV = ((TextView)findViewById(R.h.bBo));
    this.ltm = ((Button)findViewById(R.h.bqf));
    this.ltm.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7185077633024L, 53533);
        com.tencent.mm.plugin.freewifi.l.q(com.tencent.mm.plugin.freewifi.model.d.aAX(), ProtocolThreeTwoUI.this.getIntent().getStringExtra("free_wifi_ap_key"), ProtocolThreeTwoUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        int i = ProtocolThreeTwoUI.this.aBJ();
        w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeTwoUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeTwoUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(i) });
        if (i == 2)
        {
          ProtocolThreeTwoUI.this.finish();
          GMTrace.o(7185077633024L, 53533);
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeTwoUI.this.ssid, 1, ProtocolThreeTwoUI.this.getIntent());
        ProtocolThreeTwoUI.this.connect();
        GMTrace.o(7185077633024L, 53533);
      }
    });
    this.ltn = ((Button)findViewById(R.h.cjK));
    this.ltn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7197023010816L, 53622);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", ProtocolThreeTwoUI.this.ltt);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(ProtocolThreeTwoUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7197023010816L, 53622);
      }
    });
    if (bg.nm(this.ssid))
    {
      this.ltl.setText(getString(R.l.dxZ));
      this.ltm.setVisibility(4);
    }
    sq(getString(R.l.dyb));
    GMTrace.o(7165079191552L, 53384);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7166152933376L, 53392);
    GMTrace.o(7166152933376L, 53392);
    return 1;
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7165884497920L, 53390);
    if (bg.nm(this.ssid))
    {
      w.d("MicroMsg.FreeWifi.Protocol32UI", "Illegal SSID");
      GMTrace.o(7165884497920L, 53390);
      return 0;
    }
    com.tencent.mm.plugin.freewifi.g.c localc = j.aBe().yH(this.ssid);
    if ((localc != null) && (localc.field_ssid.equalsIgnoreCase(this.ssid)))
    {
      int i = localc.field_connectState;
      GMTrace.o(7165884497920L, 53390);
      return i;
    }
    GMTrace.o(7165884497920L, 53390);
    return 0;
  }
  
  protected final void connect()
  {
    GMTrace.i(7165213409280L, 53385);
    this.eFl = aBJ();
    w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(this.eFl) });
    if (this.eFl != 2)
    {
      this.luM.z(45000L, 45000L);
      w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), Integer.valueOf(60) });
      this.lrf = new com.tencent.mm.plugin.freewifi.a(this.ssid, this);
      j.aBh().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7196083486720L, 53615);
          ProtocolThreeTwoUI.c(ProtocolThreeTwoUI.this);
          GMTrace.o(7196083486720L, 53615);
        }
      });
      GMTrace.o(7165213409280L, 53385);
      return;
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
    GMTrace.o(7165213409280L, 53385);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7165481844736L, 53387);
    int i = R.i.cxs;
    GMTrace.o(7165481844736L, 53387);
    return i;
  }
  
  protected final void nV(int paramInt)
  {
    GMTrace.i(7165347627008L, 53386);
    w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(7165347627008L, 53386);
      return;
    case 4: 
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.luM.stopTimer();
      this.lsV.setVisibility(4);
      this.ltm.setText(R.l.diH);
      if (this.cfz == 3) {
        this.ltl.setText(getString(R.l.dIG, new Object[] { this.ssid }));
      }
      for (;;)
      {
        if (!bg.nm(this.eSd))
        {
          if (!bg.nm(this.lrb)) {
            this.ltk.setText(this.lrb);
          }
          if (!bg.nm(this.ltq)) {
            n.Jd().a(this.ltq, this.ltj, this.gKp);
          }
        }
        w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        GMTrace.o(7165347627008L, 53386);
        return;
        if (bg.nm(this.lts)) {
          this.ltl.setText(getString(R.l.diD));
        } else {
          this.ltl.setText(this.lts);
        }
      }
    case 1: 
      this.lsV.setVisibility(4);
      this.ltm.setText(R.l.diE);
      this.luk = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.diE), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7170313682944L, 53423);
          com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeTwoUI.this.ssid, 4, ProtocolThreeTwoUI.this.getIntent());
          w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.toConnecting.ProgressDlg.onCancel, desc=it changes the connect state of the model to CONNECT_STATE_WAIT_START because the user cancles the connect process in progress. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeTwoUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeTwoUI.this.getIntent())), Integer.valueOf(4) });
          GMTrace.o(7170313682944L, 53423);
        }
      });
      w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7165347627008L, 53386);
      return;
    case 3: 
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.luM.stopTimer();
      this.lsV.setVisibility(0);
      this.ltm.setText(R.l.dxX);
      w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7165347627008L, 53386);
      return;
    }
    if (this.luk != null) {
      this.luk.dismiss();
    }
    this.luM.stopTimer();
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
      w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      break;
      localIntent.putExtra("free_wifi_qinghuai_url", this.lur);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7164944973824L, 53383);
    super.onCreate(paramBundle);
    this.intent = getIntent();
    this.eCE = getIntent().getStringExtra("free_wifi_ap_key");
    this.openId = getIntent().getStringExtra("free_wifi_openid");
    this.lrw = getIntent().getStringExtra("free_wifi_tid");
    this.eDJ = getIntent().getStringExtra("ConstantsFreeWifi.FREE_WIFI_TIMESTAMP");
    this.sign = getIntent().getStringExtra("ConstantsFreeWifi.FREE_WIFI_SIGN");
    w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.onCreate, desc=it goes into Protocol32 connect frontpage. apKey=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.eCE });
    MP();
    if (bg.nm(this.ssid))
    {
      w.e("MicroMsg.FreeWifi.Protocol32UI", "ssid is null");
      com.tencent.mm.plugin.freewifi.l.p(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      GMTrace.o(7164944973824L, 53383);
      return;
    }
    paramBundle = j.aBe().yH(this.ssid);
    if (paramBundle == null)
    {
      paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
      paramBundle.field_ssidmd5 = aa.RP(this.ssid);
      paramBundle.field_ssid = this.ssid;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.lqZ;
      paramBundle.field_mid = this.lsr;
      paramBundle.field_wifiType = 32;
      paramBundle.field_connectState = 1;
      if (i != 0) {
        j.aBe().b(paramBundle);
      }
      for (;;)
      {
        w.i("MicroMsg.FreeWifi.Protocol32UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.lsr, Integer.valueOf(this.cfz) });
        this.lsx = new j.a()
        {
          private int lut;
          
          public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
          {
            GMTrace.i(7178500964352L, 53484);
            ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this, ProtocolThreeTwoUI.this.aBJ());
            if (this.lut != ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this))
            {
              this.lut = ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this);
              ProtocolThreeTwoUI.this.nV(ProtocolThreeTwoUI.a(ProtocolThreeTwoUI.this));
            }
            GMTrace.o(7178500964352L, 53484);
          }
        };
        j.aBe().c(this.lsx);
        w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        w.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.initModel, desc=it initializes the front page. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
        break;
        j.aBe().c(paramBundle, new String[0]);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7166287151104L, 53393);
    super.onDestroy();
    if (this.lsx != null) {
      j.aBe().j(this.lsx);
    }
    this.luM.stopTimer();
    j.aBh().release();
    GMTrace.o(7166287151104L, 53393);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7165616062464L, 53388);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7165616062464L, 53388);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7165616062464L, 53388);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\ProtocolThreeTwoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */