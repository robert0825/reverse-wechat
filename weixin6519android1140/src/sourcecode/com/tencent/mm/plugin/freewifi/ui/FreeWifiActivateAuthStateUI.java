package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.g.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public class FreeWifiActivateAuthStateUI
  extends FreeWifiActivateStateUI
{
  public FreeWifiActivateAuthStateUI()
  {
    GMTrace.i(7207894646784L, 53703);
    GMTrace.o(7207894646784L, 53703);
  }
  
  protected final void MP()
  {
    GMTrace.i(7208163082240L, 53705);
    super.MP();
    this.lsq = ((Button)findViewById(R.h.bGd));
    this.lsq.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7203599679488L, 53671);
        paramAnonymousView = FreeWifiActivateAuthStateUI.this.getString(R.l.dxL);
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramAnonymousView);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("show_bottom", false);
        com.tencent.mm.bj.d.b(FreeWifiActivateAuthStateUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(7203599679488L, 53671);
      }
    });
    oM(R.l.dyb);
    GMTrace.o(7208163082240L, 53705);
  }
  
  protected final void Wg()
  {
    GMTrace.i(7208565735424L, 53708);
    j.aBj().a(this.ssid, new g.b()
    {
      public final void ba(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(7188701511680L, 53560);
        String str = com.tencent.mm.plugin.freewifi.model.d.aAT();
        w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "get ap auth data : %s, url : %s, mac : %s", new Object[] { paramAnonymousString, FreeWifiActivateAuthStateUI.this.lqZ, str });
        if (!bg.nm(paramAnonymousString)) {
          new com.tencent.mm.plugin.freewifi.d.a(FreeWifiActivateAuthStateUI.this.lqZ, FreeWifiActivateAuthStateUI.this.ssid, str, FreeWifiActivateAuthStateUI.this.lsr, paramAnonymousString, "", paramAnonymousInt, m.C(FreeWifiActivateAuthStateUI.this.getIntent())).b(new e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
            {
              GMTrace.i(7162663272448L, 53366);
              w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
              FreeWifiActivateAuthStateUI.this.lst = false;
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
              {
                paramAnonymous2String = ((com.tencent.mm.plugin.freewifi.d.a)paramAnonymous2k).aBm();
                w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "authUrl : %s", new Object[] { paramAnonymous2String });
                j.aBj().a(FreeWifiActivateAuthStateUI.this.ssid, paramAnonymous2String, FreeWifiActivateAuthStateUI.this.getIntent());
                GMTrace.o(7162663272448L, 53366);
                return;
              }
              if (paramAnonymous2Int2 == 63522)
              {
                com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateAuthStateUI.this.ssid, 63522, FreeWifiActivateAuthStateUI.this.getIntent());
                GMTrace.o(7162663272448L, 53366);
                return;
              }
              com.tencent.mm.plugin.freewifi.model.d.a(FreeWifiActivateAuthStateUI.this.ssid, 3, FreeWifiActivateAuthStateUI.this.getIntent());
              GMTrace.o(7162663272448L, 53366);
            }
          });
        }
        GMTrace.o(7188701511680L, 53560);
      }
    }, this.eqV, getIntent());
    GMTrace.o(7208565735424L, 53708);
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7208431517696L, 53707);
    w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (com.tencent.mm.plugin.freewifi.model.d.yy(this.ssid)))
    {
      aBN();
      aBP();
    }
    GMTrace.o(7208431517696L, 53707);
  }
  
  protected final void aBI()
  {
    GMTrace.i(7208699953152L, 53709);
    aBM();
    com.tencent.mm.plugin.freewifi.model.d.yz(this.ssid);
    GMTrace.o(7208699953152L, 53709);
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7208834170880L, 53710);
    j.aBd();
    int i = com.tencent.mm.plugin.freewifi.model.d.yx(this.ssid);
    GMTrace.o(7208834170880L, 53710);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7208028864512L, 53704);
    super.onCreate(paramBundle);
    if (this.cfz != 2) {
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 1, getIntent());
    }
    w.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "now it is from qrcode, try to auth");
    GMTrace.o(7208028864512L, 53704);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7208297299968L, 53706);
    super.onDestroy();
    GMTrace.o(7208297299968L, 53706);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiActivateAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */