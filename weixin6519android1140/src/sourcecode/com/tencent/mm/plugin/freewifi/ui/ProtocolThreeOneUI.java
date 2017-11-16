package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
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
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.g;
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
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import java.net.HttpURLConnection;

@Deprecated
public class ProtocolThreeOneUI
  extends MMActivity
{
  protected int cfz;
  private String eCE;
  private String eEU;
  private int eFl;
  protected String eIH;
  protected String eSd;
  protected int eqV;
  private boolean euX;
  private final com.tencent.mm.ao.a.a.c gKp;
  private Intent intent;
  protected String lqZ;
  protected String lrb;
  private String lrk;
  private int lrl;
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
  protected String signature;
  protected String ssid;
  
  public ProtocolThreeOneUI()
  {
    GMTrace.i(7223329685504L, 53818);
    this.eFl = 1;
    this.lrl = 0;
    this.euX = false;
    this.luM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7222121725952L, 53809);
        if (!bg.nm(ProtocolThreeOneUI.this.ssid))
        {
          ProtocolThreeOneUI.a(ProtocolThreeOneUI.this, ProtocolThreeOneUI.this.aBJ());
          if (ProtocolThreeOneUI.a(ProtocolThreeOneUI.this) != 2)
          {
            ProtocolThreeOneUI.b(ProtocolThreeOneUI.this);
            w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connectTimeoutHandler, desc=wifi connecttimeout. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(ProtocolThreeOneUI.a(ProtocolThreeOneUI.this)) });
            com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeOneUI.this.ssid, 3, ProtocolThreeOneUI.this.getIntent());
            ProtocolThreeOneUI.a(ProtocolThreeOneUI.this, 31, "AUTH_TIMEOUT");
          }
        }
        GMTrace.o(7222121725952L, 53809);
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
    GMTrace.o(7223329685504L, 53818);
  }
  
  private void V(int paramInt, String paramString)
  {
    GMTrace.i(7224671862784L, 53828);
    k.a locala = com.tencent.mm.plugin.freewifi.k.aAB();
    locala.ssid = this.ssid;
    locala.bssid = com.tencent.mm.plugin.freewifi.m.yt("MicroMsg.FreeWifi.Protocol31UI");
    locala.eCF = com.tencent.mm.plugin.freewifi.m.yu("MicroMsg.FreeWifi.Protocol31UI");
    locala.eCE = this.eCE;
    locala.lou = this.eSd;
    locala.lov = com.tencent.mm.plugin.freewifi.m.C(this.intent);
    locala.low = com.tencent.mm.plugin.freewifi.m.E(this.intent);
    locala.lox = k.b.loY.lpi;
    locala.loy = k.b.loY.name;
    locala.result = paramInt;
    locala.jNb = paramString;
    locala.ePH = com.tencent.mm.plugin.freewifi.m.F(this.intent);
    locala.loz = this.eIH;
    locala.aAD().aAC();
    GMTrace.o(7224671862784L, 53828);
  }
  
  private void goBack()
  {
    GMTrace.i(7224269209600L, 53825);
    com.tencent.mm.plugin.freewifi.l.r(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.hnH.i(localIntent, this);
    finish();
    GMTrace.o(7224269209600L, 53825);
  }
  
  public final void MP()
  {
    GMTrace.i(7223598120960L, 53820);
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
    w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initView, desc=Initializing the view. ssid=%s, mid=%s, fullUrl=%s, source=%d, channel=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.ssid, this.lsr, this.lqZ, Integer.valueOf(this.cfz), Integer.valueOf(this.eqV), this.eSd, this.ltq, this.ltr, this.ltt });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7192996478976L, 53592);
        ProtocolThreeOneUI.c(ProtocolThreeOneUI.this);
        GMTrace.o(7192996478976L, 53592);
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
        GMTrace.i(7197559881728L, 53626);
        com.tencent.mm.plugin.freewifi.l.q(com.tencent.mm.plugin.freewifi.model.d.aAX(), ProtocolThreeOneUI.this.getIntent().getStringExtra("free_wifi_ap_key"), ProtocolThreeOneUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        int i = ProtocolThreeOneUI.this.aBJ();
        w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(i) });
        if (i == 2)
        {
          ProtocolThreeOneUI.this.finish();
          GMTrace.o(7197559881728L, 53626);
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeOneUI.this.ssid, 1, ProtocolThreeOneUI.this.getIntent());
        ProtocolThreeOneUI.this.connect();
        GMTrace.o(7197559881728L, 53626);
      }
    });
    this.ltn = ((Button)findViewById(R.h.cjK));
    this.ltn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7223195467776L, 53817);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", ProtocolThreeOneUI.this.ltt);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(ProtocolThreeOneUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7223195467776L, 53817);
      }
    });
    if (bg.nm(this.ssid))
    {
      this.ltl.setText(getString(R.l.dxZ));
      this.ltm.setVisibility(4);
    }
    sq(getString(R.l.dyb));
    GMTrace.o(7223598120960L, 53820);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7224537645056L, 53827);
    GMTrace.o(7224537645056L, 53827);
    return 1;
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7224403427328L, 53826);
    if (bg.nm(this.ssid))
    {
      w.d("MicroMsg.FreeWifi.Protocol31UI", "Illegal SSID");
      GMTrace.o(7224403427328L, 53826);
      return 0;
    }
    com.tencent.mm.plugin.freewifi.g.c localc = j.aBe().yH(this.ssid);
    if ((localc != null) && (localc.field_ssid.equalsIgnoreCase(this.ssid)))
    {
      int i = localc.field_connectState;
      GMTrace.o(7224403427328L, 53826);
      return i;
    }
    GMTrace.o(7224403427328L, 53826);
    return 0;
  }
  
  protected final void connect()
  {
    GMTrace.i(7223732338688L, 53821);
    this.eFl = aBJ();
    w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(this.eFl) });
    if (this.eFl != 2)
    {
      this.luM.z(15000L, 15000L);
      w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), Integer.valueOf(60) });
      final String str = this.lrk;
      j.aBh().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7192191172608L, 53586);
          w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())), str });
          com.tencent.mm.plugin.freewifi.a.a.aAK();
          com.tencent.mm.plugin.freewifi.a.a.a(str, new a.a()
          {
            public final void d(HttpURLConnection paramAnonymous2HttpURLConnection)
            {
              GMTrace.i(7188298858496L, 53557);
              int i = paramAnonymous2HttpURLConnection.getResponseCode();
              w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())), Integer.valueOf(i) });
              if (ProtocolThreeOneUI.d(ProtocolThreeOneUI.this))
              {
                GMTrace.o(7188298858496L, 53557);
                return;
              }
              if (i == 200)
              {
                ProtocolThreeOneUI.e(ProtocolThreeOneUI.this);
                GMTrace.o(7188298858496L, 53557);
                return;
              }
              if (i == 302)
              {
                paramAnonymous2HttpURLConnection = paramAnonymous2HttpURLConnection.getHeaderField("Location");
                ProtocolThreeOneUI.a(ProtocolThreeOneUI.this, paramAnonymous2HttpURLConnection);
                GMTrace.o(7188298858496L, 53557);
                return;
              }
              w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())) });
              com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeOneUI.this.ssid, 3, ProtocolThreeOneUI.this.getIntent());
              ProtocolThreeOneUI.a(ProtocolThreeOneUI.this, 32, "INVALID_HTTP_RESP_CODE");
              GMTrace.o(7188298858496L, 53557);
            }
            
            public final void g(Exception paramAnonymous2Exception)
            {
              GMTrace.i(7188433076224L, 53558);
              w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())), paramAnonymous2Exception.getMessage() });
              com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeOneUI.this.ssid, 3, ProtocolThreeOneUI.this.getIntent());
              ProtocolThreeOneUI.a(ProtocolThreeOneUI.this, 101, com.tencent.mm.plugin.freewifi.m.d(paramAnonymous2Exception));
              GMTrace.o(7188433076224L, 53558);
            }
          });
          GMTrace.o(7192191172608L, 53586);
        }
      });
      GMTrace.o(7223732338688L, 53821);
      return;
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
    GMTrace.o(7223732338688L, 53821);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7224000774144L, 53823);
    int i = R.i.cxs;
    GMTrace.o(7224000774144L, 53823);
    return i;
  }
  
  protected final void nV(int paramInt)
  {
    GMTrace.i(7223866556416L, 53822);
    w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(7223866556416L, 53822);
      return;
    case 4: 
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.luM.stopTimer();
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
        if (!bg.nm(this.eSd))
        {
          if (!bg.nm(this.lrb)) {
            this.ltk.setText(this.lrb);
          }
          if (!bg.nm(this.ltq)) {
            n.Jd().a(this.ltq, this.ltj, this.gKp);
          }
        }
        w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        GMTrace.o(7223866556416L, 53822);
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
      this.luk = h.a(this.vKB.vKW, getString(R.l.diE), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7201317978112L, 53654);
          com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeOneUI.this.ssid, 4, ProtocolThreeOneUI.this.getIntent());
          w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnecting.ProgressDlg.onCancel, desc=it changes the connect state of the model to CONNECT_STATE_WAIT_START because the user cancles the connect process in progress. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeOneUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeOneUI.this.getIntent())), Integer.valueOf(4) });
          GMTrace.o(7201317978112L, 53654);
        }
      });
      w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7223866556416L, 53822);
      return;
    case 3: 
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.luM.stopTimer();
      this.lsV.setVisibility(0);
      this.ltm.setText(R.l.dxX);
      w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7223866556416L, 53822);
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
      w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      break;
      localIntent.putExtra("free_wifi_qinghuai_url", this.lur);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7223463903232L, 53819);
    super.onCreate(paramBundle);
    this.intent = getIntent();
    this.eCE = getIntent().getStringExtra("free_wifi_ap_key");
    this.eEU = getIntent().getStringExtra("free_wifi_schema_ticket");
    this.lrk = getIntent().getStringExtra("free_wifi_portal_ap_info_authurl_with_params");
    w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.onCreate, desc=it goes into Protocol31 connect frontpage. apKey=%s, ticket=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.eCE, this.eEU });
    MP();
    if (bg.nm(this.ssid))
    {
      w.e("MicroMsg.FreeWifi.Protocol31UI", "ssid is null");
      com.tencent.mm.plugin.freewifi.l.p(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      GMTrace.o(7223463903232L, 53819);
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
      paramBundle.field_wifiType = 3;
      paramBundle.field_connectState = 1;
      if (i != 0) {
        j.aBe().b(paramBundle);
      }
      for (;;)
      {
        w.i("MicroMsg.FreeWifi.Protocol31UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.lsr, Integer.valueOf(this.cfz) });
        this.lsx = new j.a()
        {
          private int lut;
          
          public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
          {
            GMTrace.i(7218363629568L, 53781);
            ProtocolThreeOneUI.a(ProtocolThreeOneUI.this, ProtocolThreeOneUI.this.aBJ());
            if (this.lut != ProtocolThreeOneUI.a(ProtocolThreeOneUI.this))
            {
              this.lut = ProtocolThreeOneUI.a(ProtocolThreeOneUI.this);
              ProtocolThreeOneUI.this.nV(ProtocolThreeOneUI.a(ProtocolThreeOneUI.this));
            }
            GMTrace.o(7218363629568L, 53781);
          }
        };
        j.aBe().c(this.lsx);
        w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        w.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initModel, desc=it initializes the front page. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
        break;
        j.aBe().c(paramBundle, new String[0]);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7224806080512L, 53829);
    super.onDestroy();
    if (this.lsx != null) {
      j.aBe().j(this.lsx);
    }
    this.luM.stopTimer();
    j.aBh().release();
    GMTrace.o(7224806080512L, 53829);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7224134991872L, 53824);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7224134991872L, 53824);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7224134991872L, 53824);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\ProtocolThreeOneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */