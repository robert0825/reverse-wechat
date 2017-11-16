package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.c.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;

public class ExdeviceConnectedRouterActivateStateUI
  extends MMActivity
{
  private String appId;
  private String eEl;
  private String esG;
  private final int kGS;
  private ExdeviceConnectedRouterStateView kGT;
  private TextView kGU;
  private TextView kGV;
  private b<a> kGW;
  private String kxk;
  private String ssid;
  
  public ExdeviceConnectedRouterActivateStateUI()
  {
    GMTrace.i(11065177931776L, 82442);
    this.kGS = 90000;
    this.kGW = new b() {};
    GMTrace.o(11065177931776L, 82442);
  }
  
  private void auD()
  {
    GMTrace.i(11066251673600L, 82450);
    finish();
    Intent localIntent = new Intent();
    localIntent.putExtra("From_fail_notify", true);
    w.d("MicroMsg.ConnectedRouterActivateStateUi", "startMainUI");
    d.a(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    GMTrace.o(11066251673600L, 82450);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11065446367232L, 82444);
    GMTrace.o(11065446367232L, 82444);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11065849020416L, 82447);
    int i = R.i.cvG;
    GMTrace.o(11065849020416L, 82447);
    return i;
  }
  
  protected final void ne(int paramInt)
  {
    GMTrace.i(11065714802688L, 82446);
    this.kGT.setOnClickListener(null);
    w.d("MicroMsg.ConnectedRouterActivateStateUi", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11065714802688L, 82446);
      return;
      this.kGT.setImageResource(R.k.cLH);
      this.kGT.setState(3);
      this.kGT.kGZ = 2;
      this.kGU.setText(R.l.dre);
      this.kGV.setText(getString(R.l.drf, new Object[] { this.ssid }));
      GMTrace.o(11065714802688L, 82446);
      return;
      this.kGT.setImageResource(R.k.cLH);
      this.kGT.setState(3);
      this.kGT.kGZ = 2;
      this.kGU.setText(R.l.dre);
      this.kGV.setText(getString(R.l.drg));
      GMTrace.o(11065714802688L, 82446);
      return;
      this.kGT.setImageResource(R.k.cLH);
      this.kGT.setState(3);
      this.kGT.kGZ = 2;
      this.kGU.setText(R.l.dre);
      this.kGV.setText(getString(R.l.dri));
      GMTrace.o(11065714802688L, 82446);
      return;
      this.kGT.setImageResource(R.k.cLJ);
      this.kGT.setState(2);
      this.kGU.setText(getString(R.l.drh, new Object[] { this.ssid }));
      a(0, getString(R.l.drc), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(10999008591872L, 81949);
          ExdeviceConnectedRouterActivateStateUI.a(ExdeviceConnectedRouterActivateStateUI.this);
          GMTrace.o(10999008591872L, 81949);
          return true;
        }
      });
      GMTrace.o(11065714802688L, 82446);
      return;
      this.kGT.setImageResource(R.k.cLI);
      this.kGT.setState(1);
      this.kGU.setText(R.l.drd);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11065312149504L, 82443);
    super.onCreate(paramBundle);
    w.d("MicroMsg.ConnectedRouterActivateStateUi", "create activity");
    oM(R.l.drj);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11093497872384L, 82653);
        ExdeviceConnectedRouterActivateStateUI.a(ExdeviceConnectedRouterActivateStateUI.this);
        GMTrace.o(11093497872384L, 82653);
        return true;
      }
    });
    this.kGT = ((ExdeviceConnectedRouterStateView)findViewById(R.h.bxp));
    this.kGU = ((TextView)findViewById(R.h.bxo));
    this.kGV = ((TextView)findViewById(R.h.bxq));
    try
    {
      paramBundle = Uri.parse(getIntent().getStringExtra("key_connected_router"));
      this.esG = paramBundle.getQueryParameter("deviceid");
      this.eEl = paramBundle.getQueryParameter("devicetype");
      this.kxk = paramBundle.getQueryParameter("clientinfo");
      this.appId = paramBundle.getQueryParameter("appid");
      if ((bg.nm(this.esG)) || (bg.nm(this.eEl)) || (bg.nm(this.kxk)) || (bg.nm(this.appId)))
      {
        w.e("MicroMsg.ConnectedRouterActivateStateUi", "loss param %s", new Object[] { paramBundle.toString() });
        finish();
      }
      this.ssid = paramBundle.getQueryParameter("ssid");
      w.d("MicroMsg.ConnectedRouterActivateStateUi", "uri: %s, deviceid: %s, devicetype: %s, clientinfo: %s. ssid: %s", new Object[] { paramBundle.toString(), this.esG, this.eEl, this.kxk, this.ssid });
      if (this.ssid == null) {
        this.ssid = "";
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        w.d("MicroMsg.ConnectedRouterActivateStateUi", paramBundle.toString());
      }
    }
    ne(1);
    at.wS().a(new a(this.esG, this.eEl, this.kxk, this.appId, this.kGW), 0);
    GMTrace.o(11065312149504L, 82443);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11065983238144L, 82448);
    super.onDestroy();
    GMTrace.o(11065983238144L, 82448);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11066117455872L, 82449);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      auD();
      GMTrace.o(11066117455872L, 82449);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11066117455872L, 82449);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(11065580584960L, 82445);
    super.onResume();
    GMTrace.o(11065580584960L, 82445);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceConnectedRouterActivateStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */