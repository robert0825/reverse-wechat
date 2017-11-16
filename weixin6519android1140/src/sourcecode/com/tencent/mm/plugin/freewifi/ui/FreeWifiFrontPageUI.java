package com.tencent.mm.plugin.freewifi.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
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
import com.tencent.mm.R.m;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.e.f;
import com.tencent.mm.plugin.freewifi.e.i;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.b;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FreeWifiFrontPageUI
  extends MMActivity
{
  protected int cfz;
  protected String className;
  protected String eCE;
  protected String eSd;
  protected int eqV;
  private final com.tencent.mm.ao.a.a.c gKp;
  private ae ghS;
  protected Intent intent;
  protected String lqZ;
  protected int lra;
  protected String lrb;
  protected TextView lsV;
  protected TextView lsW;
  protected TextView lsX;
  protected ImageView ltj;
  protected TextView ltk;
  protected TextView ltl;
  protected Button ltm;
  protected Button ltn;
  protected Dialog lto;
  protected View ltp;
  protected String ltq;
  protected String ltr;
  protected String lts;
  protected String ltt;
  protected com.tencent.mm.plugin.freewifi.e.a ltu;
  private Lock ltv;
  private d ltw;
  protected String ssid;
  
  public FreeWifiFrontPageUI()
  {
    GMTrace.i(7214471315456L, 53752);
    this.ghS = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7176621916160L, 53470);
        paramAnonymousMessage = (FreeWifiFrontPageUI.c)paramAnonymousMessage.obj;
        switch (FreeWifiFrontPageUI.8.lty[paramAnonymousMessage.ltw.ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aBS();
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aBT();
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aY(paramAnonymousMessage.data);
          GMTrace.o(7176621916160L, 53470);
          return;
          FreeWifiFrontPageUI.this.aZ(paramAnonymousMessage.data);
        }
      }
    };
    c.a locala = new c.a();
    locala.gKA = true;
    locala.gKB = true;
    locala.gKR = R.g.aWz;
    locala.gKZ = true;
    locala.gLa = 0.0F;
    this.gKp = locala.Jn();
    GMTrace.o(7214471315456L, 53752);
  }
  
  private d aBQ()
  {
    GMTrace.i(7214605533184L, 53753);
    try
    {
      this.ltv.lock();
      d locald = this.ltw;
      this.ltv.unlock();
      GMTrace.o(7214605533184L, 53753);
      return locald;
    }
    finally
    {
      this.ltv.unlock();
    }
  }
  
  private void aBR()
  {
    GMTrace.i(7215142404096L, 53757);
    l.q(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    d locald = aBQ();
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, class=%s, desc=User click the connect button and starts the connect wifi process. uiState=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.className, locald.name() });
    if ((aBQ() == d.ltB) || (aBQ() == d.ltD))
    {
      boolean bool = this.intent.getBooleanExtra("ConstantsFreeWifi.FREE_WIFI_SHOULD_BIND_PHONE", false);
      int i = com.tencent.mm.plugin.freewifi.m.aAH();
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, class=%s, desc=It makes a decision whether to bind phone number. shoudBindPhone=%b, userPhoneState=%d(0 means no phone number. 1 means having a china phone number. 2 means having a foreign number.)", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.className, Boolean.valueOf(bool), Integer.valueOf(i) });
      if ((bool) && (i == 1) && (this.lra != 33))
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dxv, R.l.dxw, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7179574706176L, 53492);
            com.tencent.mm.plugin.freewifi.m.cw(FreeWifiFrontPageUI.this);
            GMTrace.o(7179574706176L, 53492);
          }
        }, null);
        GMTrace.o(7215142404096L, 53757);
        return;
      }
      this.ltw = d.ltC;
      aBT();
      this.ltu.connect();
    }
    GMTrace.o(7215142404096L, 53757);
  }
  
  private void goBack()
  {
    GMTrace.i(7216216145920L, 53765);
    l.r(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Object localObject = com.tencent.mm.plugin.freewifi.k.aAB();
    ((k.a)localObject).eCE = this.eCE;
    ((k.a)localObject).lov = com.tencent.mm.plugin.freewifi.m.C(this.intent);
    ((k.a)localObject).lox = k.b.loV.lpi;
    ((k.a)localObject).loy = k.b.loV.name;
    ((k.a)localObject).ePH = com.tencent.mm.plugin.freewifi.m.F(this.intent);
    ((k.a)localObject).low = com.tencent.mm.plugin.freewifi.m.E(this.intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).jNb = "";
    ((k.a)localObject).aAD().b(this.intent, true).aAC();
    localObject = new Intent();
    com.tencent.mm.plugin.freewifi.g.hnH.i((Intent)localObject, this);
    finish();
    GMTrace.o(7216216145920L, 53765);
  }
  
  public final void MP()
  {
    GMTrace.i(7215008186368L, 53756);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7193801785344L, 53598);
        FreeWifiFrontPageUI.a(FreeWifiFrontPageUI.this);
        GMTrace.o(7193801785344L, 53598);
        return true;
      }
    });
    if (this.lto != null) {
      this.lto.dismiss();
    }
    this.ltv = new ReentrantLock();
    this.className = getClass().getSimpleName();
    this.intent = getIntent();
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.lqZ = getIntent().getStringExtra("free_wifi_url");
    this.eCE = getIntent().getStringExtra("free_wifi_ap_key");
    this.cfz = getIntent().getIntExtra("free_wifi_source", 1);
    this.eqV = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.lra = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    this.eSd = getIntent().getStringExtra("free_wifi_appid");
    this.ltq = getIntent().getStringExtra("free_wifi_head_img_url");
    this.ltr = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.lts = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.ltt = getIntent().getStringExtra("free_wifi_privacy_url");
    this.lrb = getIntent().getStringExtra("free_wifi_app_nickname");
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=%s.initView, desc=Initializing the view. ssid=%s, fullUrl=%s, apKey=%s, source=%d, channel=%d, protocolNumber=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.className, this.ssid, this.lqZ, this.eCE, Integer.valueOf(this.cfz), Integer.valueOf(this.eqV), Integer.valueOf(this.lra), this.eSd, this.ltq, this.ltr, this.ltt });
    this.ltp = findViewById(R.h.cjJ);
    this.ltj = ((ImageView)findViewById(R.h.bBh));
    this.ltk = ((TextView)findViewById(R.h.bBT));
    this.ltl = ((TextView)findViewById(R.h.bBG));
    this.lsV = ((TextView)findViewById(R.h.bBo));
    this.lsW = ((TextView)findViewById(R.h.bBm));
    this.lsX = ((TextView)findViewById(R.h.bBn));
    this.ltm = ((Button)findViewById(R.h.bqf));
    this.ltm.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7176353480704L, 53468);
        FreeWifiFrontPageUI.b(FreeWifiFrontPageUI.this);
        GMTrace.o(7176353480704L, 53468);
      }
    });
    this.ltn = ((Button)findViewById(R.h.cjK));
    this.ltn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7205881380864L, 53688);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("rawUrl", FreeWifiFrontPageUI.this.ltt);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(FreeWifiFrontPageUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(7205881380864L, 53688);
      }
    });
    if (bg.nm(this.ssid))
    {
      this.ltl.setText(getString(R.l.dxZ));
      this.ltm.setVisibility(4);
    }
    sq(getString(R.l.dyb));
    a(d.ltB, null);
    GMTrace.o(7215008186368L, 53756);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7216350363648L, 53766);
    GMTrace.o(7216350363648L, 53766);
    return 1;
  }
  
  public final void a(d paramd, Object paramObject)
  {
    GMTrace.i(7214739750912L, 53754);
    try
    {
      this.ltv.lock();
      this.ltw = paramd;
      Message localMessage = Message.obtain();
      localMessage.obj = new c(paramd, paramObject);
      this.ghS.sendMessage(localMessage);
      this.ltv.unlock();
      GMTrace.o(7214739750912L, 53754);
      return;
    }
    finally
    {
      this.ltv.unlock();
    }
  }
  
  protected final void aBS()
  {
    GMTrace.i(7215276621824L, 53758);
    this.lsV.setVisibility(4);
    if (this.lra == 31)
    {
      this.ltm.setVisibility(8);
      if ((com.tencent.mm.plugin.freewifi.m.F(getIntent()) == 10) && (!com.tencent.mm.plugin.freewifi.m.yp(com.tencent.mm.compatible.d.p.fQH.fRb)) && (!com.tencent.mm.plugin.freewifi.m.yp(com.tencent.mm.compatible.d.p.aD(this.vKB.vKW)))) {
        this.ltm.setText(String.format(getString(R.l.dxx), new Object[] { com.tencent.mm.compatible.d.p.aD(this.vKB.vKW) }));
      }
      if (!bg.nm(this.lts)) {
        break label310;
      }
      if (this.lra != 33) {
        break label293;
      }
      this.ltl.setText(getString(R.l.diD) + ": " + this.ssid);
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
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7215276621824L, 53758);
      return;
      this.ltm.setVisibility(0);
      this.ltm.setText(R.l.diH);
      break;
      label293:
      this.ltl.setText(getString(R.l.diD));
      continue;
      label310:
      this.ltl.setText(this.lts);
    }
  }
  
  protected final void aBT()
  {
    GMTrace.i(7215410839552L, 53759);
    this.lsV.setVisibility(4);
    this.lsW.setVisibility(4);
    this.lsX.setVisibility(4);
    this.ltm.setText(R.l.diE);
    Object localObject = this.vKB.vKW;
    DialogInterface.OnCancelListener local6 = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(7194607091712L, 53604);
        com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiFrontPageUI.this.ssid, 4, FreeWifiFrontPageUI.this.getIntent());
        w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnecting.ProgressDlg.onCancel, desc=it changes the connect state of the model to CONNECT_STATE_WAIT_START because the user cancles the connect process in progress. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.C(FreeWifiFrontPageUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(FreeWifiFrontPageUI.this.getIntent())), Integer.valueOf(4) });
        GMTrace.o(7194607091712L, 53604);
      }
    };
    View localView = View.inflate((Context)localObject, R.i.cxy, null);
    localObject = new com.tencent.mm.ui.base.k((Context)localObject, R.m.elU);
    ((Dialog)localObject).setCancelable(true);
    ((Dialog)localObject).setContentView(localView);
    ((Dialog)localObject).setOnCancelListener(local6);
    this.lto = ((Dialog)localObject);
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
    this.lto.show();
    GMTrace.o(7215410839552L, 53759);
  }
  
  protected final void aY(final Object paramObject)
  {
    GMTrace.i(7215545057280L, 53760);
    if (!(paramObject instanceof a))
    {
      GMTrace.o(7215545057280L, 53760);
      return;
    }
    a locala = (a)paramObject;
    w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, desc=Connect failed. errcode=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(this.intent), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(this.intent)), locala.ltc });
    if (this.lto != null) {
      this.lto.dismiss();
    }
    this.lsV.setVisibility(0);
    if (!com.tencent.mm.plugin.freewifi.m.yp(locala.text)) {}
    for (paramObject = locala.text;; paramObject = getString(locala.ltb))
    {
      this.lsV.setText((CharSequence)paramObject);
      this.lsV.setVisibility(0);
      this.lsW.setVisibility(0);
      this.lsX.setVisibility(0);
      paramObject = getString(R.l.dxK) + ": " + locala.ltc;
      this.lsX.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7185346068480L, 53535);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("free_wifi_show_detail_error", 1);
          paramAnonymousView.putExtra("free_wifi_error_ui_error_msg", FreeWifiFrontPageUI.this.getString(R.l.dxy));
          paramAnonymousView.putExtra("free_wifi_error_ui_error_msg_detail1", paramObject);
          paramAnonymousView.setClass(FreeWifiFrontPageUI.this, FreeWifiErrorUI.class);
          FreeWifiFrontPageUI.this.startActivity(paramAnonymousView);
          GMTrace.o(7185346068480L, 53535);
        }
      });
      this.ltm.setVisibility(0);
      this.ltm.setText(R.l.dxX);
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=Protocol.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7215545057280L, 53760);
      return;
      if (locala.ltb == 0) {
        locala.ltb = R.l.dxz;
      }
    }
  }
  
  protected final void aZ(Object paramObject)
  {
    GMTrace.i(7215679275008L, 53761);
    if (!(paramObject instanceof b))
    {
      GMTrace.o(7215679275008L, 53761);
      return;
    }
    Object localObject = ((b)paramObject).ltA;
    if ((this.lra != 31) && (this.lto != null)) {
      this.lto.dismiss();
    }
    this.ltm.setText(R.l.diB);
    this.ltm.setClickable(false);
    paramObject = getIntent();
    ((Intent)paramObject).putExtra("free_wifi_appid", ((eb)localObject).lTf);
    ((Intent)paramObject).putExtra("free_wifi_app_nickname", ((eb)localObject).jio);
    ((Intent)paramObject).putExtra("free_wifi_app_username", ((eb)localObject).jhi);
    ((Intent)paramObject).putExtra("free_wifi_signature", ((eb)localObject).gCA);
    ((Intent)paramObject).putExtra("free_wifi_finish_actioncode", ((eb)localObject).tSG);
    ((Intent)paramObject).putExtra("free_wifi_finish_url", ((eb)localObject).tSH);
    ((Intent)paramObject).putExtra(e.b.vGF, ((eb)localObject).luA);
    if (((eb)localObject).tSG == 2)
    {
      if (!bg.nm(((eb)localObject).jhi))
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", ((eb)localObject).jhi);
        com.tencent.mm.bj.d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
        d.rw();
        w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
        localObject = com.tencent.mm.plugin.freewifi.k.aAB();
        ((k.a)localObject).eCE = this.eCE;
        ((k.a)localObject).lov = com.tencent.mm.plugin.freewifi.m.C((Intent)paramObject);
        ((k.a)localObject).lox = k.b.loX.lpi;
        ((k.a)localObject).loy = k.b.loX.name;
        ((k.a)localObject).ePH = com.tencent.mm.plugin.freewifi.m.F((Intent)paramObject);
        ((k.a)localObject).low = com.tencent.mm.plugin.freewifi.m.E((Intent)paramObject);
        ((k.a)localObject).result = 0;
        ((k.a)localObject).jNb = "";
        ((k.a)localObject).aAD().b((Intent)paramObject, true).aAC();
        GMTrace.o(7215679275008L, 53761);
        return;
      }
      ((Intent)paramObject).setClass(this, FreeWifiSuccUI.class);
    }
    for (;;)
    {
      localObject = com.tencent.mm.plugin.freewifi.k.aAB();
      ((k.a)localObject).eCE = this.eCE;
      ((k.a)localObject).lov = com.tencent.mm.plugin.freewifi.m.C((Intent)paramObject);
      ((k.a)localObject).lox = k.b.loW.lpi;
      ((k.a)localObject).loy = k.b.loW.name;
      ((k.a)localObject).ePH = com.tencent.mm.plugin.freewifi.m.F((Intent)paramObject);
      ((k.a)localObject).low = com.tencent.mm.plugin.freewifi.m.E((Intent)paramObject);
      ((k.a)localObject).result = 0;
      ((k.a)localObject).jNb = "";
      ((k.a)localObject).aAD().b((Intent)paramObject, true).aAC();
      finish();
      startActivity((Intent)paramObject);
      d.rw();
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())) });
      GMTrace.o(7215679275008L, 53761);
      return;
      if (com.tencent.mm.plugin.freewifi.m.yp(((eb)localObject).tSI))
      {
        ((Intent)paramObject).setClass(this, FreeWifiSuccUI.class);
      }
      else
      {
        ((Intent)paramObject).putExtra("free_wifi_qinghuai_url", ((eb)localObject).tSI);
        ((Intent)paramObject).setClass(this, FreeWifiSuccWebViewUI.class);
      }
    }
  }
  
  public void finish()
  {
    GMTrace.i(7215813492736L, 53762);
    super.finish();
    k.a locala = com.tencent.mm.plugin.freewifi.k.aAB();
    locala.eCE = this.eCE;
    locala.lov = com.tencent.mm.plugin.freewifi.m.C(this.intent);
    locala.lox = k.b.loU.lpi;
    locala.loy = k.b.loU.name;
    locala.ePH = com.tencent.mm.plugin.freewifi.m.F(this.intent);
    locala.low = com.tencent.mm.plugin.freewifi.m.E(this.intent);
    locala.result = 0;
    locala.jNb = "";
    locala.aAD().b(this.intent, true).aAC();
    GMTrace.o(7215813492736L, 53762);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7215947710464L, 53763);
    int i = R.i.cxs;
    GMTrace.o(7215947710464L, 53763);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7214873968640L, 53755);
    super.onCreate(paramBundle);
    MP();
    switch (this.lra)
    {
    }
    for (;;)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiFrontPageUI", "sessionKey=%s, step=%d, method=%s.onCreate, desc=it goes into connect frontpage. apKey=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.C(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.D(getIntent())), this.className, this.eCE });
      l.p(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      GMTrace.o(7214873968640L, 53755);
      return;
      this.ltu = new f(this);
      continue;
      this.ltu = new com.tencent.mm.plugin.freewifi.e.g(this);
      continue;
      this.ltu = new com.tencent.mm.plugin.freewifi.e.h(this);
      this.ltp.setVisibility(0);
      aBR();
      continue;
      this.ltu = new com.tencent.mm.plugin.freewifi.e.j(this);
      this.ltp.setVisibility(0);
      continue;
      this.ltu = new i(this);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7216484581376L, 53767);
    super.onDestroy();
    com.tencent.mm.plugin.freewifi.model.j.aBh().release();
    GMTrace.o(7216484581376L, 53767);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7216081928192L, 53764);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7216081928192L, 53764);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7216081928192L, 53764);
    return bool;
  }
  
  public static final class a
  {
    public static a ltz;
    public int ltb;
    public String ltc;
    public String text;
    
    static
    {
      GMTrace.i(7171387424768L, 53431);
      ltz = new a();
      GMTrace.o(7171387424768L, 53431);
    }
    
    public a()
    {
      GMTrace.i(7170716336128L, 53426);
      GMTrace.o(7170716336128L, 53426);
    }
  }
  
  public static final class b
  {
    public eb ltA;
    
    public b()
    {
      GMTrace.i(7207760429056L, 53702);
      GMTrace.o(7207760429056L, 53702);
    }
  }
  
  public static final class c
  {
    Object data;
    FreeWifiFrontPageUI.d ltw;
    
    public c(FreeWifiFrontPageUI.d paramd, Object paramObject)
    {
      GMTrace.i(7183064367104L, 53518);
      this.ltw = paramd;
      this.data = paramObject;
      GMTrace.o(7183064367104L, 53518);
    }
  }
  
  public static enum d
  {
    static
    {
      GMTrace.i(7184003891200L, 53525);
      ltB = new d("START", 0);
      ltC = new d("CONNECTING", 1);
      ltD = new d("FAIL", 2);
      ltE = new d("SUCCESS", 3);
      ltF = new d[] { ltB, ltC, ltD, ltE };
      GMTrace.o(7184003891200L, 53525);
    }
    
    private d()
    {
      GMTrace.i(7183869673472L, 53524);
      GMTrace.o(7183869673472L, 53524);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiFrontPageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */