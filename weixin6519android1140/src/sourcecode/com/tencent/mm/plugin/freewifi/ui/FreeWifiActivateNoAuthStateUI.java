package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public abstract class FreeWifiActivateNoAuthStateUI
  extends FreeWifiActivateStateUI
{
  private String lnX;
  private int lsk;
  private boolean lsl;
  
  public FreeWifiActivateNoAuthStateUI()
  {
    GMTrace.i(7212726484992L, 53739);
    GMTrace.o(7212726484992L, 53739);
  }
  
  protected final void MP()
  {
    GMTrace.i(7212994920448L, 53741);
    super.MP();
    this.lsq.setVisibility(0);
    sq(aBK());
    GMTrace.o(7212994920448L, 53741);
  }
  
  protected final void Wg()
  {
    GMTrace.i(7213397573632L, 53744);
    aBI();
    GMTrace.o(7213397573632L, 53744);
  }
  
  public void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7213263355904L, 53743);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.yy(this.ssid)))
    {
      aBN();
      this.lst = false;
      d.a(this.ssid, 2, getIntent());
    }
    GMTrace.o(7213263355904L, 53743);
  }
  
  protected final void aBI()
  {
    GMTrace.i(7213531791360L, 53745);
    if (this.lst)
    {
      w.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "it is authing now");
      GMTrace.o(7213531791360L, 53745);
      return;
    }
    this.lst = true;
    aBM();
    d.d(this.ssid, this.lnX, this.lsk, this.lsl);
    GMTrace.o(7213531791360L, 53745);
  }
  
  protected int aBJ()
  {
    GMTrace.i(7213666009088L, 53746);
    if (d.yy(this.ssid))
    {
      d.a(this.ssid, 2, getIntent());
      GMTrace.o(7213666009088L, 53746);
      return 2;
    }
    GMTrace.o(7213666009088L, 53746);
    return 1;
  }
  
  protected abstract String aBK();
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7212860702720L, 53740);
    this.lsk = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.lnX = getIntent().getStringExtra("free_wifi_passowrd");
    this.lsl = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    d.a(this.ssid, 1, getIntent());
    w.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "Comes from webview, do auth");
    GMTrace.o(7212860702720L, 53740);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7213129138176L, 53742);
    super.onDestroy();
    GMTrace.o(7213129138176L, 53742);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiActivateNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */