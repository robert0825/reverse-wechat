package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

@Deprecated
public class FreewifiActivateWeChatNoAuthStateUI
  extends FreeWifiActivateNoAuthStateUI
{
  private int eGw;
  private String luI;
  private String luJ;
  
  public FreewifiActivateWeChatNoAuthStateUI()
  {
    GMTrace.i(7174608650240L, 53455);
    GMTrace.o(7174608650240L, 53455);
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7174877085696L, 53457);
    w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.yy(this.ssid)) && (this.lst))
    {
      aBN();
      this.lst = false;
      this.luI = d.aAT();
      this.luJ = d.aAV();
      this.eGw = d.aAU();
      w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "now has connect the ap, check from server rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(this.eGw), this.luI, this.luJ });
      new a(this.lqZ, this.luI, this.luJ, this.eGw, this.eqV, m.C(getIntent())).b(new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7176085045248L, 53466);
          at.wS().b(640, this);
          w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "check ap ok");
            d.a(FreewifiActivateWeChatNoAuthStateUI.this.ssid, 2, FreewifiActivateWeChatNoAuthStateUI.this.getIntent());
            GMTrace.o(7176085045248L, 53466);
            return;
          }
          w.e("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "check ap failed ： rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(FreewifiActivateWeChatNoAuthStateUI.a(FreewifiActivateWeChatNoAuthStateUI.this)), FreewifiActivateWeChatNoAuthStateUI.b(FreewifiActivateWeChatNoAuthStateUI.this), FreewifiActivateWeChatNoAuthStateUI.c(FreewifiActivateWeChatNoAuthStateUI.this) });
          FreewifiActivateWeChatNoAuthStateUI.this.ne(63522);
          d.yA(FreewifiActivateWeChatNoAuthStateUI.c(FreewifiActivateWeChatNoAuthStateUI.this));
          GMTrace.o(7176085045248L, 53466);
        }
      });
    }
    GMTrace.o(7174877085696L, 53457);
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7175145521152L, 53459);
    j.aBd();
    int i = d.yx(this.ssid);
    w.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "get connect state = %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      GMTrace.o(7175145521152L, 53459);
      return 63522;
    }
    GMTrace.o(7175145521152L, 53459);
    return i;
  }
  
  protected final String aBK()
  {
    GMTrace.i(7174742867968L, 53456);
    String str = getString(R.l.dyb);
    GMTrace.o(7174742867968L, 53456);
    return str;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7175011303424L, 53458);
    super.onDestroy();
    GMTrace.o(7175011303424L, 53458);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreewifiActivateWeChatNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */