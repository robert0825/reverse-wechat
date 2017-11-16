package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.g.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@Deprecated
public class FreeWifiAuthStateUI
  extends FreeWifiStateUI
{
  public FreeWifiAuthStateUI()
  {
    GMTrace.i(7190983213056L, 53577);
    GMTrace.o(7190983213056L, 53577);
  }
  
  protected final void MP()
  {
    GMTrace.i(7191251648512L, 53579);
    super.MP();
    oM(R.l.dyb);
    GMTrace.o(7191251648512L, 53579);
  }
  
  protected final void Wg()
  {
    GMTrace.i(7191654301696L, 53582);
    j.aBj().a(this.ssid, new g.b()
    {
      public final void ba(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(7187225116672L, 53549);
        String str = d.aAT();
        w.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "get ap auth data : %s, url : %s, mac : %s", new Object[] { paramAnonymousString, FreeWifiAuthStateUI.this.lqZ, str });
        if (!bg.nm(paramAnonymousString)) {
          new com.tencent.mm.plugin.freewifi.d.a(FreeWifiAuthStateUI.this.lqZ, FreeWifiAuthStateUI.this.ssid, str, FreeWifiAuthStateUI.this.lsr, paramAnonymousString, "", paramAnonymousInt, m.C(FreeWifiAuthStateUI.this.getIntent())).b(new e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
            {
              GMTrace.i(7169776812032L, 53419);
              w.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
              FreeWifiAuthStateUI.this.lst = false;
              if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
              {
                paramAnonymous2k = (com.tencent.mm.plugin.freewifi.d.a)paramAnonymous2k;
                paramAnonymous2String = paramAnonymous2k.aBm();
                w.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "authUrl : %s", new Object[] { paramAnonymous2String });
                paramAnonymous2k = paramAnonymous2k.aBs();
                if (paramAnonymous2k != null)
                {
                  w.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s", new Object[] { paramAnonymous2k.lTf, paramAnonymous2k.jio, paramAnonymous2k.jhi, Integer.valueOf(paramAnonymous2k.tSG), paramAnonymous2k.tSH, paramAnonymous2k.gCA });
                  FreeWifiAuthStateUI.this.eSd = paramAnonymous2k.lTf;
                  FreeWifiAuthStateUI.this.lrb = paramAnonymous2k.jio;
                  FreeWifiAuthStateUI.this.eIH = paramAnonymous2k.jhi;
                  FreeWifiAuthStateUI.this.lup = paramAnonymous2k.tSG;
                  FreeWifiAuthStateUI.this.luq = paramAnonymous2k.tSH;
                  FreeWifiAuthStateUI.this.signature = paramAnonymous2k.gCA;
                  FreeWifiAuthStateUI.this.lur = paramAnonymous2k.tSI;
                }
                j.aBj().a(FreeWifiAuthStateUI.this.ssid, paramAnonymous2String, FreeWifiAuthStateUI.this.getIntent());
                GMTrace.o(7169776812032L, 53419);
                return;
              }
              if (paramAnonymous2Int2 == 63522)
              {
                d.a(FreeWifiAuthStateUI.this.ssid, 63522, FreeWifiAuthStateUI.this.getIntent());
                GMTrace.o(7169776812032L, 53419);
                return;
              }
              d.a(FreeWifiAuthStateUI.this.ssid, 3, FreeWifiAuthStateUI.this.getIntent());
              GMTrace.o(7169776812032L, 53419);
            }
          });
        }
        GMTrace.o(7187225116672L, 53549);
      }
    }, this.eqV, getIntent());
    GMTrace.o(7191654301696L, 53582);
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    GMTrace.i(7191520083968L, 53581);
    w.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.yy(this.ssid)))
    {
      aBN();
      aBP();
    }
    GMTrace.o(7191520083968L, 53581);
  }
  
  protected final void aBI()
  {
    GMTrace.i(7191788519424L, 53583);
    aBM();
    d.yz(this.ssid);
    GMTrace.o(7191788519424L, 53583);
  }
  
  protected final int aBJ()
  {
    GMTrace.i(7191922737152L, 53584);
    j.aBd();
    int i = d.yx(this.ssid);
    GMTrace.o(7191922737152L, 53584);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7191117430784L, 53578);
    super.onCreate(paramBundle);
    d.a(this.ssid, 4, getIntent());
    w.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now it is from qrcode, try to auth");
    GMTrace.o(7191117430784L, 53578);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7191385866240L, 53580);
    super.onDestroy();
    GMTrace.o(7191385866240L, 53580);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */