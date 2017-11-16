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
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

@Deprecated
public class FreewifiWeChatNoAuthStateUI
  extends FreeWifiNoAuthStateUI
{
  private int eGw;
  private String luI;
  private String luJ;
  
  public FreewifiWeChatNoAuthStateUI()
  {
    GMTrace.i(7180245794816L, 53497);
    GMTrace.o(7180245794816L, 53497);
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7180514230272L, 53499);
    w.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.yy(this.ssid)) && (this.lst))
    {
      aBN();
      this.lst = false;
      this.luI = d.aAT();
      this.luJ = d.aAV();
      this.eGw = d.aAU();
      w.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "now has connect the ap, check from server rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(this.eGw), this.luI, this.luJ });
      new a(this.lqZ, this.luI, this.luJ, this.eGw, this.eqV, m.C(getIntent())).b(new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(7212592267264L, 53738);
          at.wS().b(640, this);
          w.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            w.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "check ap ok");
            paramAnonymousString = ((a)paramAnonymousk).aBs();
            if (paramAnonymousString != null)
            {
              w.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramAnonymousString.lTf, paramAnonymousString.jio, paramAnonymousString.jhi, Integer.valueOf(paramAnonymousString.tSG), paramAnonymousString.tSH, paramAnonymousString.gCA });
              FreewifiWeChatNoAuthStateUI.this.eSd = paramAnonymousString.lTf;
              FreewifiWeChatNoAuthStateUI.this.lrb = paramAnonymousString.jio;
              FreewifiWeChatNoAuthStateUI.this.eIH = paramAnonymousString.jhi;
              FreewifiWeChatNoAuthStateUI.this.lup = paramAnonymousString.tSG;
              FreewifiWeChatNoAuthStateUI.this.luq = paramAnonymousString.tSH;
              FreewifiWeChatNoAuthStateUI.this.signature = paramAnonymousString.gCA;
              FreewifiWeChatNoAuthStateUI.this.lur = paramAnonymousString.tSI;
            }
            d.a(FreewifiWeChatNoAuthStateUI.this.ssid, 2, FreewifiWeChatNoAuthStateUI.this.getIntent());
            GMTrace.o(7212592267264L, 53738);
            return;
          }
          w.e("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "check ap failed ： rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(FreewifiWeChatNoAuthStateUI.a(FreewifiWeChatNoAuthStateUI.this)), FreewifiWeChatNoAuthStateUI.b(FreewifiWeChatNoAuthStateUI.this), FreewifiWeChatNoAuthStateUI.c(FreewifiWeChatNoAuthStateUI.this) });
          d.a(FreewifiWeChatNoAuthStateUI.this.ssid, 63522, FreewifiWeChatNoAuthStateUI.this.getIntent());
          d.yA(FreewifiWeChatNoAuthStateUI.c(FreewifiWeChatNoAuthStateUI.this));
          GMTrace.o(7212592267264L, 53738);
        }
      });
    }
    GMTrace.o(7180514230272L, 53499);
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7180782665728L, 53501);
    j.aBd();
    int i = d.yx(this.ssid);
    w.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "get connect state = %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      GMTrace.o(7180782665728L, 53501);
      return 63522;
    }
    GMTrace.o(7180782665728L, 53501);
    return i;
  }
  
  protected final String aBK()
  {
    GMTrace.i(7180380012544L, 53498);
    String str = getString(R.l.dyb);
    GMTrace.o(7180380012544L, 53498);
    return str;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7180648448000L, 53500);
    super.onDestroy();
    GMTrace.o(7180648448000L, 53500);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreewifiWeChatNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */