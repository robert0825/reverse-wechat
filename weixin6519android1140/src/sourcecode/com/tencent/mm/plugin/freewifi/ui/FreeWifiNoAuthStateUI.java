package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public abstract class FreeWifiNoAuthStateUI
  extends FreeWifiStateUI
{
  private String lnX;
  private int lsk;
  private boolean lsl;
  
  public FreeWifiNoAuthStateUI()
  {
    GMTrace.i(7181587972096L, 53507);
    GMTrace.o(7181587972096L, 53507);
  }
  
  protected final void MP()
  {
    GMTrace.i(7181856407552L, 53509);
    super.MP();
    sq(aBK());
    GMTrace.o(7181856407552L, 53509);
  }
  
  protected final void Wg()
  {
    GMTrace.i(7182259060736L, 53512);
    aBI();
    GMTrace.o(7182259060736L, 53512);
  }
  
  public void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7182124843008L, 53511);
    w.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.yy(this.ssid)))
    {
      aBN();
      this.lst = false;
      d.a(this.ssid, 2, getIntent());
    }
    GMTrace.o(7182124843008L, 53511);
  }
  
  protected final void aBI()
  {
    GMTrace.i(7182393278464L, 53513);
    if (this.lst)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "it is authing now");
      GMTrace.o(7182393278464L, 53513);
      return;
    }
    this.lst = true;
    aBM();
    int i = d.d(this.ssid, this.lnX, this.lsk, this.lsl);
    k.a locala = k.aAB();
    locala.ssid = this.ssid;
    locala.eCE = this.eCE;
    locala.lov = m.C(getIntent());
    locala.low = m.E(getIntent());
    locala.lox = k.b.loI.lpi;
    locala.loy = k.b.loI.name;
    locala.result = i;
    locala.ePH = m.F(getIntent());
    locala.lou = this.eSd;
    locala.loz = this.eIH;
    locala.aAD().aAC();
    GMTrace.o(7182393278464L, 53513);
  }
  
  protected int aBJ()
  {
    GMTrace.i(7182527496192L, 53514);
    if (d.yy(this.ssid))
    {
      d.a(this.ssid, 2, getIntent());
      GMTrace.o(7182527496192L, 53514);
      return 2;
    }
    GMTrace.o(7182527496192L, 53514);
    return 1;
  }
  
  protected abstract String aBK();
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7181722189824L, 53508);
    this.lsk = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.lnX = getIntent().getStringExtra("free_wifi_passowrd");
    this.lsl = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    d.a(this.ssid, 4, getIntent());
    w.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "Comes from webview, do auth");
    GMTrace.o(7181722189824L, 53508);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7181990625280L, 53510);
    super.onDestroy();
    GMTrace.o(7181990625280L, 53510);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */