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
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.d.f;
import com.tencent.mm.plugin.freewifi.g;
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
import com.tencent.mm.ui.p;
import java.net.HttpURLConnection;

@Deprecated
public class ProtocolThreeThreeUI
  extends MMActivity
{
  protected String appId;
  protected String bssid;
  protected int cfz;
  protected String eDJ;
  private int eFl;
  protected String eIH;
  protected int eqV;
  protected String lrb;
  private int lrl;
  protected String lro;
  protected String lrp;
  protected String lrq;
  private Uri lrr;
  private String lrs;
  private TextView lsV;
  private j.a lsx;
  private ImageView ltj;
  private TextView ltk;
  private TextView ltl;
  private Button ltm;
  private Button ltn;
  private aj luM;
  private r luk;
  protected int lup;
  protected String luq;
  protected String lur;
  protected String sign;
  protected String signature;
  protected String ssid;
  
  public ProtocolThreeThreeUI()
  {
    GMTrace.i(7210042130432L, 53719);
    this.eFl = 1;
    this.lrl = 0;
    this.luM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7192459608064L, 53588);
        if (!bg.nm(ProtocolThreeThreeUI.this.ssid))
        {
          ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this, ProtocolThreeThreeUI.this.aBJ());
          if (ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this) != 2)
          {
            w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connectTimeoutHandler, desc=wifi connecttimeout. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this)) });
            com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeThreeUI.this.ssid, 3, ProtocolThreeThreeUI.this.getIntent());
          }
        }
        GMTrace.o(7192459608064L, 53588);
        return false;
      }
    }, false);
    GMTrace.o(7210042130432L, 53719);
  }
  
  private void goBack()
  {
    GMTrace.i(7210981654528L, 53726);
    com.tencent.mm.plugin.freewifi.l.r(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.hnH.i(localIntent, this);
    finish();
    GMTrace.o(7210981654528L, 53726);
  }
  
  public final void MP()
  {
    GMTrace.i(7210310565888L, 53721);
    this.ssid = com.tencent.mm.plugin.freewifi.m.ys("MicroMsg.FreeWifi.Protocol33UI");
    this.bssid = com.tencent.mm.plugin.freewifi.m.yt("MicroMsg.FreeWifi.Protocol33UI");
    this.cfz = getIntent().getIntExtra("free_wifi_source", 1);
    this.eqV = getIntent().getIntExtra("free_wifi_channel_id", 0);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7214068662272L, 53749);
        ProtocolThreeThreeUI.b(ProtocolThreeThreeUI.this);
        GMTrace.o(7214068662272L, 53749);
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
        GMTrace.i(7164005449728L, 53376);
        com.tencent.mm.plugin.freewifi.l.q(com.tencent.mm.plugin.freewifi.model.d.aAX(), ProtocolThreeThreeUI.this.getIntent().getStringExtra("free_wifi_ap_key"), ProtocolThreeThreeUI.this.getIntent().getIntExtra("free_wifi_protocol_type", 0));
        int i = ProtocolThreeThreeUI.this.aBJ();
        w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connectWifiBtn.setOnClickListener, desc=User click the connect button and starts the connect wifi process. state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(i) });
        if (i == 2)
        {
          ProtocolThreeThreeUI.this.finish();
          GMTrace.o(7164005449728L, 53376);
          return;
        }
        com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeThreeUI.this.ssid, 1, ProtocolThreeThreeUI.this.getIntent());
        ProtocolThreeThreeUI.this.connect();
        GMTrace.o(7164005449728L, 53376);
      }
    });
    this.ltn = ((Button)findViewById(R.h.cjK));
    this.ltn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7178232528896L, 53482);
        GMTrace.o(7178232528896L, 53482);
      }
    });
    if (bg.nm(this.ssid))
    {
      this.ltl.setText(getString(R.l.dxZ));
      this.ltm.setVisibility(4);
    }
    sq(getString(R.l.dyb));
    GMTrace.o(7210310565888L, 53721);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7211250089984L, 53728);
    GMTrace.o(7211250089984L, 53728);
    return 1;
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7211115872256L, 53727);
    if (bg.nm(this.ssid))
    {
      w.d("MicroMsg.FreeWifi.Protocol33UI", "Illegal SSID");
      GMTrace.o(7211115872256L, 53727);
      return 0;
    }
    com.tencent.mm.plugin.freewifi.g.c localc = j.aBe().yH(this.ssid);
    if ((localc != null) && (localc.field_ssid.equalsIgnoreCase(this.ssid)))
    {
      int i = localc.field_connectState;
      GMTrace.o(7211115872256L, 53727);
      return i;
    }
    GMTrace.o(7211115872256L, 53727);
    return 0;
  }
  
  protected final void connect()
  {
    GMTrace.i(7210444783616L, 53722);
    if (com.tencent.mm.plugin.freewifi.m.yp(this.ssid))
    {
      w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=it cannot get ssid, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 3, getIntent());
      GMTrace.o(7210444783616L, 53722);
      return;
    }
    if (com.tencent.mm.plugin.freewifi.m.yp(this.lrp))
    {
      w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=authurl is empty, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 3, getIntent());
      GMTrace.o(7210444783616L, 53722);
      return;
    }
    this.eFl = aBJ();
    w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), com.tencent.mm.plugin.freewifi.model.d.nS(this.eFl) });
    if (this.eFl != 2)
    {
      this.luM.z(30000L, 30000L);
      w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), Integer.valueOf(60) });
      com.tencent.mm.plugin.freewifi.m.yp(this.lrp);
      final Object localObject = new StringBuilder(this.lrp);
      if (this.lrp.indexOf("?") == -1) {
        ((StringBuilder)localObject).append("?extend=").append(this.lrq);
      }
      for (;;)
      {
        localObject = ((StringBuilder)localObject).toString();
        j.aBh().aAR().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7187493552128L, 53551);
            w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())), localObject });
            a.aAK();
            a.a(localObject, new a.a()
            {
              public final void d(HttpURLConnection paramAnonymous2HttpURLConnection)
              {
                GMTrace.i(7232322273280L, 53885);
                int i = paramAnonymous2HttpURLConnection.getResponseCode();
                w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.HttpAuthentication.onSuccess, desc=it receives http response for authentication. http response status code=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())), Integer.valueOf(i) });
                if (i == 200)
                {
                  ProtocolThreeThreeUI.c(ProtocolThreeThreeUI.this);
                  GMTrace.o(7232322273280L, 53885);
                  return;
                }
                if (i == 302)
                {
                  paramAnonymous2HttpURLConnection = paramAnonymous2HttpURLConnection.getHeaderField("Location");
                  ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this, paramAnonymous2HttpURLConnection);
                  GMTrace.o(7232322273280L, 53885);
                  return;
                }
                w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.httpAuthentication, desc=http response status code is neither 200 nor 302, so it fails to connect wifi. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())) });
                com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeThreeUI.this.ssid, 3, ProtocolThreeThreeUI.this.getIntent());
                GMTrace.o(7232322273280L, 53885);
              }
              
              public final void g(Exception paramAnonymous2Exception)
              {
                GMTrace.i(7232456491008L, 53886);
                w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.httpAuthentication, desc=exception happens during http, so it fails to connect wifi. e.getMessage()=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())), paramAnonymous2Exception.getMessage() });
                com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeThreeUI.this.ssid, 3, ProtocolThreeThreeUI.this.getIntent());
                GMTrace.o(7232456491008L, 53886);
              }
            });
            GMTrace.o(7187493552128L, 53551);
          }
        });
        GMTrace.o(7210444783616L, 53722);
        return;
        ((StringBuilder)localObject).append("&extend=").append(this.lrq);
      }
    }
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
    GMTrace.o(7210444783616L, 53722);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7210713219072L, 53724);
    int i = R.i.cxs;
    GMTrace.o(7210713219072L, 53724);
    return i;
  }
  
  protected final void nV(int paramInt)
  {
    GMTrace.i(7210579001344L, 53723);
    w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(7210579001344L, 53723);
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
        w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        GMTrace.o(7210579001344L, 53723);
        return;
        this.ltl.setText(getString(R.l.diF, new Object[] { this.ssid }));
      }
    case 1: 
      this.lsV.setVisibility(4);
      this.ltm.setText(R.l.diE);
      this.luk = h.a(this.vKB.vKW, getString(R.l.diE), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7232724926464L, 53888);
          com.tencent.mm.plugin.freewifi.model.d.a(ProtocolThreeThreeUI.this.ssid, 4, ProtocolThreeThreeUI.this.getIntent());
          w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnecting.ProgressDlg.onCancel, desc=it changes the connect state of the model to CONNECT_STATE_WAIT_START because the user cancles the connect process in progress. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(ProtocolThreeThreeUI.this.getIntent())), Integer.valueOf(4) });
          GMTrace.o(7232724926464L, 53888);
        }
      });
      w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7210579001344L, 53723);
      return;
    case 3: 
      if (this.luk != null) {
        this.luk.dismiss();
      }
      this.luM.stopTimer();
      this.lsV.setVisibility(0);
      this.ltm.setText(R.l.dxX);
      w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7210579001344L, 53723);
      return;
    }
    if (this.luk != null) {
      this.luk.dismiss();
    }
    this.luM.stopTimer();
    this.ltm.setText(R.l.diB);
    this.ltm.setClickable(false);
    Intent localIntent = getIntent();
    localIntent.putExtra("free_wifi_appid", this.appId);
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
      w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      break;
      localIntent.putExtra("free_wifi_qinghuai_url", this.lur);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7210176348160L, 53720);
    super.onCreate(paramBundle);
    this.lrs = getIntent().getStringExtra("free_wifi_schema_uri");
    this.lrr = Uri.parse(this.lrs);
    this.appId = this.lrr.getQueryParameter("appId");
    this.lro = this.lrr.getQueryParameter("shopId");
    this.lrp = this.lrr.getQueryParameter("authUrl");
    this.lrq = this.lrr.getQueryParameter("extend");
    this.eDJ = this.lrr.getQueryParameter("timestamp");
    this.sign = this.lrr.getQueryParameter("sign");
    w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.onCreate, desc=it goes into Protocol33 connect frontpage. uri = %s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.lrs });
    MP();
    if (bg.nm(this.ssid))
    {
      w.e("MicroMsg.FreeWifi.Protocol33UI", "ssid is null");
      com.tencent.mm.plugin.freewifi.l.p(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      GMTrace.o(7210176348160L, 53720);
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
      paramBundle.field_url = "";
      paramBundle.field_mid = "";
      paramBundle.field_wifiType = 33;
      paramBundle.field_connectState = 1;
      if (i != 0) {
        j.aBe().b(paramBundle);
      }
      for (;;)
      {
        w.i("MicroMsg.FreeWifi.Protocol33UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, "", Integer.valueOf(this.cfz) });
        this.lsx = new j.a()
        {
          private int lut;
          
          public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
          {
            GMTrace.i(7163200143360L, 53370);
            ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this, ProtocolThreeThreeUI.this.aBJ());
            if (this.lut != ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this))
            {
              this.lut = ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this);
              ProtocolThreeThreeUI.this.nV(ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this));
            }
            GMTrace.o(7163200143360L, 53370);
          }
        };
        j.aBe().c(this.lsx);
        w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        w.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=it initializes the front page. ", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
        break;
        j.aBe().c(paramBundle, new String[0]);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7211384307712L, 53729);
    super.onDestroy();
    if (this.lsx != null) {
      j.aBe().j(this.lsx);
    }
    this.luM.stopTimer();
    j.aBh().release();
    GMTrace.o(7211384307712L, 53729);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7210847436800L, 53725);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7210847436800L, 53725);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7210847436800L, 53725);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\ProtocolThreeThreeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */