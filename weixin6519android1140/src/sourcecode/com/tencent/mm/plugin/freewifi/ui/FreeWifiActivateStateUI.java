package com.tencent.mm.plugin.freewifi.ui;

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
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

@Deprecated
public abstract class FreeWifiActivateStateUI
  extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected int cfz;
  private int eFl;
  protected int eqV;
  protected String lqZ;
  private FreeWifiStateView lsm;
  private TextView lsn;
  private TextView lso;
  private Button lsp;
  protected Button lsq;
  protected String lsr;
  protected FreeWifiNetworkReceiver lss;
  protected boolean lst;
  private boolean lsu;
  private aj lsv;
  private aj lsw;
  private j.a lsx;
  protected String ssid;
  
  public FreeWifiActivateStateUI()
  {
    GMTrace.i(7218497847296L, 53782);
    this.eFl = 1;
    this.lst = false;
    this.lsu = false;
    this.lsv = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7163468578816L, 53372);
        if (!bg.nm(FreeWifiActivateStateUI.this.ssid))
        {
          FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this, FreeWifiActivateStateUI.this.aBJ());
          w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now auth time out, ssid is %s, the connect state is %d", new Object[] { FreeWifiActivateStateUI.this.ssid, Integer.valueOf(FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this)) });
          FreeWifiActivateStateUI.b(FreeWifiActivateStateUI.this).stopTimer();
          if (FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this) != 2)
          {
            FreeWifiActivateStateUI.this.aBN();
            FreeWifiActivateStateUI.this.aBL();
            com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateStateUI.this.ssid, 3, FreeWifiActivateStateUI.this.getIntent());
          }
        }
        GMTrace.o(7163468578816L, 53372);
        return false;
      }
    }, false);
    this.lsw = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7194338656256L, 53602);
        if (com.tencent.mm.plugin.freewifi.model.d.yy(FreeWifiActivateStateUI.this.ssid))
        {
          FreeWifiActivateStateUI.this.a(NetworkInfo.State.CONNECTED);
          FreeWifiActivateStateUI.b(FreeWifiActivateStateUI.this).stopTimer();
          GMTrace.o(7194338656256L, 53602);
          return false;
        }
        GMTrace.o(7194338656256L, 53602);
        return true;
      }
    }, true);
    this.lsx = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(7202794373120L, 53665);
        FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this, FreeWifiActivateStateUI.this.aBJ());
        FreeWifiActivateStateUI.this.ne(FreeWifiActivateStateUI.a(FreeWifiActivateStateUI.this));
        GMTrace.o(7202794373120L, 53665);
      }
    };
    GMTrace.o(7218497847296L, 53782);
  }
  
  private void aBO()
  {
    GMTrace.i(7219571589120L, 53790);
    this.lss = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.lss, localIntentFilter);
    GMTrace.o(7219571589120L, 53790);
  }
  
  private void goBack()
  {
    GMTrace.i(7220511113216L, 53797);
    finish();
    if (getIntent().getBooleanExtra("free_wifi_jump_to_main_ui", false))
    {
      Intent localIntent = new Intent();
      g.hnH.i(localIntent, this);
    }
    GMTrace.o(7220511113216L, 53797);
  }
  
  protected void MP()
  {
    GMTrace.i(7219034718208L, 53786);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7179843141632L, 53494);
        FreeWifiActivateStateUI.c(FreeWifiActivateStateUI.this);
        GMTrace.o(7179843141632L, 53494);
        return true;
      }
    });
    this.lsm = ((FreeWifiStateView)findViewById(R.h.bBj));
    this.lsn = ((TextView)findViewById(R.h.bBk));
    this.lso = ((TextView)findViewById(R.h.bBl));
    if (this.cfz == 3) {
      this.lso.setText(getString(R.l.dIG, new Object[] { this.ssid }));
    }
    for (;;)
    {
      this.lsp = ((Button)findViewById(R.h.bWo));
      this.lsp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7178769399808L, 53486);
          if (FreeWifiActivateStateUI.this.aBJ() == 2)
          {
            FreeWifiActivateStateUI.this.finish();
            GMTrace.o(7178769399808L, 53486);
            return;
          }
          com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateStateUI.this.ssid, 1, FreeWifiActivateStateUI.this.getIntent());
          FreeWifiActivateStateUI.this.lst = false;
          FreeWifiActivateStateUI.this.aBP();
          GMTrace.o(7178769399808L, 53486);
        }
      });
      this.lsq = ((Button)findViewById(R.h.bGd));
      this.lsq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7162394836992L, 53364);
          paramAnonymousView = FreeWifiActivateStateUI.this.getString(R.l.dxL);
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("show_bottom", false);
          com.tencent.mm.bj.d.b(FreeWifiActivateStateUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(7162394836992L, 53364);
        }
      });
      GMTrace.o(7219034718208L, 53786);
      return;
      this.lso.setText(getString(R.l.diF, new Object[] { this.ssid }));
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7218766282752L, 53784);
    GMTrace.o(7218766282752L, 53784);
    return 1;
  }
  
  protected abstract void Wg();
  
  protected abstract void aBI();
  
  protected abstract int aBJ();
  
  protected final void aBL()
  {
    GMTrace.i(7219168935936L, 53787);
    if (this.lss != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister wifi state change receiver");
      this.lss.lqq = null;
    }
    GMTrace.o(7219168935936L, 53787);
  }
  
  protected final void aBM()
  {
    GMTrace.i(7219303153664L, 53788);
    if (this.lss == null) {
      aBO();
    }
    this.lss.lqr = this;
    GMTrace.o(7219303153664L, 53788);
  }
  
  protected final void aBN()
  {
    GMTrace.i(7219437371392L, 53789);
    if (this.lss != null)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister network changed receiver");
      this.lss.lqr = null;
    }
    GMTrace.o(7219437371392L, 53789);
  }
  
  protected final void aBP()
  {
    GMTrace.i(7219705806848L, 53791);
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.lsv.z(60000L, 60000L);
      this.lsw.z(1000L, 1000L);
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "wifi is not enable, enable it");
      j.aBh().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7188030423040L, 53555);
          FreeWifiActivateStateUI.d(FreeWifiActivateStateUI.this);
          GMTrace.o(7188030423040L, 53555);
        }
      });
      GMTrace.o(7219705806848L, 53791);
      return;
    }
    this.eFl = aBJ();
    w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.eFl) });
    if (this.eFl != 2)
    {
      this.lsv.z(60000L, 60000L);
      this.lsw.z(1000L, 1000L);
      if (com.tencent.mm.plugin.freewifi.model.d.yy(this.ssid))
      {
        w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.lst) });
        if (this.lst)
        {
          w.d("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now it is authing");
          GMTrace.o(7219705806848L, 53791);
          return;
        }
        this.lsv.z(60000L, 60000L);
        this.lsw.z(1000L, 1000L);
        Wg();
        this.lst = true;
        GMTrace.o(7219705806848L, 53791);
        return;
      }
      j.aBh().aAR().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7233798668288L, 53896);
          w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now network ssid is not wechat freewifi :%s", new Object[] { FreeWifiActivateStateUI.this.ssid });
          FreeWifiActivateStateUI.this.aBI();
          GMTrace.o(7233798668288L, 53896);
        }
      });
      GMTrace.o(7219705806848L, 53791);
      return;
    }
    ne(this.eFl);
    GMTrace.o(7219705806848L, 53791);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7219974242304L, 53793);
    int i = R.i.cxz;
    GMTrace.o(7219974242304L, 53793);
    return i;
  }
  
  public final void nT(int paramInt)
  {
    GMTrace.i(7220242677760L, 53795);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7220242677760L, 53795);
      return;
      GMTrace.o(7220242677760L, 53795);
      return;
      GMTrace.o(7220242677760L, 53795);
      return;
      aBL();
      aBP();
    }
  }
  
  protected final void ne(int paramInt)
  {
    GMTrace.i(7219840024576L, 53792);
    this.lsm.setOnClickListener(null);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      this.lsm.setImageResource(R.g.aWH);
      this.lsn.setText(R.l.diC);
      if (this.cfz == 3) {
        this.lso.setText(getString(R.l.dIG, new Object[] { this.ssid }));
      }
      break;
    }
    for (;;)
    {
      this.lsp.setVisibility(8);
      GMTrace.o(7219840024576L, 53792);
      return;
      this.lsm.setImageResource(R.g.aWH);
      this.lsm.setState(3);
      this.lsm.kGZ = 2;
      this.lsn.setText(R.l.diG);
      this.lsp.setVisibility(0);
      this.lsp.setText(R.l.dxX);
      this.lsv.stopTimer();
      this.lsw.stopTimer();
      GMTrace.o(7219840024576L, 53792);
      return;
      this.lsm.setImageResource(R.g.aWF);
      this.lsm.setState(2);
      this.lsn.setText(R.l.diB);
      this.lsp.setVisibility(0);
      this.lsp.setText(R.l.dxu);
      this.lsv.stopTimer();
      this.lsw.stopTimer();
      if ((this.cfz == 1) || (this.cfz == 5) || (this.cfz == 4))
      {
        this.lsp.setVisibility(4);
        final com.tencent.mm.plugin.freewifi.g.c localc = j.aBe().yH(this.ssid);
        if ((localc != null) && (!bg.nm(localc.field_showUrl)) && (!this.lsu))
        {
          this.lsu = true;
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7193264914432L, 53594);
              Intent localIntent = new Intent();
              String str = v.d(FreeWifiActivateStateUI.this.getSharedPreferences(ab.bPU(), 0));
              localIntent.putExtra("rawUrl", localc.field_showUrl + "&lang=" + str);
              localIntent.putExtra("show_bottom", false);
              localIntent.putExtra("stastic_scene", 7);
              com.tencent.mm.bj.d.b(FreeWifiActivateStateUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
              w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "jump to ad page after auth success, url is : %s", new Object[] { localIntent.getStringExtra("rawUrl") });
              FreeWifiActivateStateUI.this.finish();
              GMTrace.o(7193264914432L, 53594);
            }
          }, 1000L);
        }
      }
      d.rw();
      GMTrace.o(7219840024576L, 53792);
      return;
      this.lsm.setImageResource(R.g.aWH);
      this.lsm.setState(1);
      this.lsn.setText(R.l.diC);
      continue;
      this.lsv.stopTimer();
      this.lsw.stopTimer();
      this.lsm.setImageResource(R.g.aWG);
      this.lsm.setState(3);
      this.lsn.setText(R.l.dxO);
      this.lsn.setVisibility(0);
      this.lso.setText(R.l.dxP);
      this.lso.setVisibility(0);
      continue;
      this.lso.setText(getString(R.l.diF, new Object[] { this.ssid }));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7218632065024L, 53783);
    super.onCreate(paramBundle);
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.lsr = getIntent().getStringExtra("free_wifi_mid");
    this.lqZ = getIntent().getStringExtra("free_wifi_url");
    this.cfz = getIntent().getIntExtra("free_wifi_source", 1);
    this.eqV = getIntent().getIntExtra("free_wifi_channel_id", 0);
    switch (this.cfz)
    {
    default: 
      if (bg.nm(this.ssid)) {
        w.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      break;
    case 2: 
    case 1: 
    case 3: 
    case 4: 
    case 5: 
      for (;;)
      {
        label143:
        MP();
        j.aBe().c(this.lsx);
        GMTrace.o(7218632065024L, 53783);
        return;
        paramBundle = j.aBe().aBG();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.lsr = paramBundle.field_mid;
          this.lqZ = paramBundle.field_url;
          w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.lsr, this.lqZ });
          break;
        }
        w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bg.nm(this.ssid)) {
          break label273;
        }
        w.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      label273:
      paramBundle = j.aBe().yH(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = aa.RP(this.ssid);
        paramBundle.field_ssid = this.ssid;
        paramBundle.field_connectState = 1;
      }
      break;
    }
    for (int i = 1;; i = 0)
    {
      paramBundle.field_url = this.lqZ;
      paramBundle.field_mid = this.lsr;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      if (i != 0)
      {
        j.aBe().b(paramBundle);
        break;
      }
      j.aBe().c(paramBundle, new String[0]);
      break;
      w.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.lsr, Integer.valueOf(this.cfz) });
      break label143;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7220108460032L, 53794);
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
    GMTrace.o(7220108460032L, 53794);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7220376895488L, 53796);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(7220376895488L, 53796);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7220376895488L, 53796);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(7218900500480L, 53785);
    super.onResume();
    if (!bg.nm(this.ssid)) {
      aBP();
    }
    GMTrace.o(7218900500480L, 53785);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiActivateStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */