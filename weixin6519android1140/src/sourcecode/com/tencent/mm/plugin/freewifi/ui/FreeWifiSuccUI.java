package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.d.t;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;

public class FreeWifiSuccUI
  extends MMActivity
  implements e
{
  private String eIH;
  private String eSd;
  private CheckBox jJH;
  private Button jeS;
  private String lrb;
  private int luA;
  private boolean luB;
  private boolean luC;
  private TextView lui;
  private int lup;
  private String luq;
  private View luv;
  private TextView luw;
  private View lux;
  private TextView luy;
  private View luz;
  private String signature;
  
  public FreeWifiSuccUI()
  {
    GMTrace.i(7203733897216L, 53672);
    this.luB = false;
    this.luC = false;
    GMTrace.o(7203733897216L, 53672);
  }
  
  private void aCa()
  {
    GMTrace.i(7204941856768L, 53681);
    if (this.luC)
    {
      GMTrace.o(7204941856768L, 53681);
      return;
    }
    this.luC = true;
    if ((this.luB) && (!bg.nm(this.eSd)) && ((!s.fD(this.eIH)) || (!s.fC(this.eIH))))
    {
      at.wS().a(1703, this);
      i locali = new i(this.eSd, getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_channel_id", 0), m.C(getIntent()));
      at.wS().a(locali, 0);
    }
    l.c(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), this.luB);
    GMTrace.o(7204941856768L, 53681);
  }
  
  protected final void MP()
  {
    GMTrace.i(7204807639040L, 53680);
    oM(R.l.dyb);
    lh(false);
    this.luv = findViewById(R.h.bBM);
    this.luw = ((TextView)findViewById(R.h.bBN));
    this.jJH = ((CheckBox)findViewById(R.h.bBK));
    this.lux = findViewById(R.h.bBH);
    this.luy = ((TextView)findViewById(R.h.bBI));
    this.luz = findViewById(R.h.bBO);
    this.lui = ((TextView)findViewById(R.h.bBJ));
    this.jeS = ((Button)findViewById(R.h.bqg));
    this.jeS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7179037835264L, 53488);
        FreeWifiSuccUI.this.finish();
        FreeWifiSuccUI.a(FreeWifiSuccUI.this);
        GMTrace.o(7179037835264L, 53488);
      }
    });
    if ((bg.nm(this.eSd)) || (bg.nm(this.eIH)) || (bg.nm(this.lrb)))
    {
      this.luv.setVisibility(8);
      this.lux.setVisibility(8);
      this.luz.setVisibility(8);
    }
    for (;;)
    {
      if (m.F(getIntent()) == 10)
      {
        final String str = com.tencent.mm.compatible.d.p.fQH.fRb;
        if ((!m.yp(str)) && (!m.yp(com.tencent.mm.compatible.d.p.aD(this.vKB.vKW))))
        {
          Button localButton = (Button)findViewById(R.h.bBP);
          localButton.setText(String.format(getString(R.l.dya), new Object[] { com.tencent.mm.compatible.d.p.aD(this.vKB.vKW) }));
          localButton.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7184809197568L, 53531);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", str);
              com.tencent.mm.bj.d.b(FreeWifiSuccUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
              GMTrace.o(7184809197568L, 53531);
            }
          });
          localButton.setVisibility(0);
        }
      }
      GMTrace.o(7204807639040L, 53680);
      return;
      if ((!s.fD(this.eIH)) || (!s.fC(this.eIH))) {
        break;
      }
      l.b(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), true);
      this.luv.setVisibility(8);
      this.lux.setVisibility(8);
      this.luz.setVisibility(0);
      this.lui.setText(this.lrb);
      this.luz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7195815051264L, 53613);
          if (!bg.nm(FreeWifiSuccUI.b(FreeWifiSuccUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("Contact_User", FreeWifiSuccUI.b(FreeWifiSuccUI.this));
            com.tencent.mm.bj.d.b(FreeWifiSuccUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
          }
          GMTrace.o(7195815051264L, 53613);
        }
      });
    }
    l.b(com.tencent.mm.plugin.freewifi.model.d.aAX(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0), false);
    this.luz.setVisibility(8);
    this.luv.setVisibility(0);
    if (bg.nm(this.signature))
    {
      this.lux.setVisibility(8);
      findViewById(R.h.bBL).setBackgroundColor(getResources().getColor(R.e.white));
      label495:
      this.luw.setText(getString(R.l.dxN, new Object[] { this.lrb }));
      if (this.luA != 1) {
        break label581;
      }
      this.jJH.setChecked(true);
    }
    for (this.luB = true;; this.luB = false)
    {
      this.jJH.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          GMTrace.i(7160918441984L, 53353);
          if (paramAnonymousBoolean)
          {
            FreeWifiSuccUI.a(FreeWifiSuccUI.this, true);
            GMTrace.o(7160918441984L, 53353);
            return;
          }
          FreeWifiSuccUI.a(FreeWifiSuccUI.this, false);
          GMTrace.o(7160918441984L, 53353);
        }
      });
      break;
      this.lux.setVisibility(0);
      this.luy.setText(this.signature);
      break label495;
      label581:
      this.jJH.setChecked(false);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7204539203584L, 53678);
    GMTrace.o(7204539203584L, 53678);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7204404985856L, 53677);
    w.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    at.wS().b(1703, this);
    GMTrace.o(7204404985856L, 53677);
  }
  
  public void finish()
  {
    GMTrace.i(7204136550400L, 53675);
    super.finish();
    aCa();
    GMTrace.o(7204136550400L, 53675);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7204673421312L, 53679);
    int i = R.i.cxA;
    GMTrace.o(7204673421312L, 53679);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7203868114944L, 53673);
    super.onCreate(paramBundle);
    this.eSd = getIntent().getStringExtra("free_wifi_appid");
    this.lrb = getIntent().getStringExtra("free_wifi_app_nickname");
    this.eIH = getIntent().getStringExtra("free_wifi_app_username");
    this.lup = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.luq = getIntent().getStringExtra("free_wifi_finish_url");
    this.luA = getIntent().getIntExtra(e.b.vGF, 0);
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    w.i("MicroMsg.FreeWifi.FreeWifiSuccUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.eSd, this.lrb, this.eIH, Integer.valueOf(this.lup), this.luq, this.signature });
    WifiInfo localWifiInfo = com.tencent.mm.plugin.freewifi.model.d.aAW();
    k.a locala = com.tencent.mm.plugin.freewifi.k.aAB();
    String str = localWifiInfo.getMacAddress();
    paramBundle = str;
    if (Build.VERSION.SDK_INT > 22) {
      if (str != null)
      {
        paramBundle = str;
        if (!str.equals("02:00:00:00:00:00")) {}
      }
      else
      {
        paramBundle = m.aAG();
      }
    }
    if (localWifiInfo != null)
    {
      locala.ssid = m.yq(localWifiInfo.getSSID());
      locala.bssid = localWifiInfo.getBSSID();
      locala.eCF = paramBundle;
    }
    locala.eCE = getIntent().getStringExtra("free_wifi_ap_key");
    locala.lou = this.eSd;
    locala.lov = m.C(getIntent());
    locala.low = m.E(getIntent());
    locala.lox = k.b.loJ.lpi;
    locala.loy = k.b.loJ.name;
    locala.ePH = m.F(getIntent());
    locala.loz = this.eIH;
    locala.aAD().aAC();
    GMTrace.o(7203868114944L, 53673);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7204270768128L, 53676);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      GMTrace.o(7204270768128L, 53676);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7204270768128L, 53676);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(7204002332672L, 53674);
    super.onResume();
    MP();
    GMTrace.o(7204002332672L, 53674);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiSuccUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */