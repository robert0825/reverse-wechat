package com.tencent.mm.plugin.webview.wepkg.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.k.c;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.webview.wepkg.downloader.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

public final class a
{
  public static int lLV;
  private static a rWZ;
  
  static
  {
    GMTrace.i(12377961529344L, 92223);
    lLV = -1;
    GMTrace.o(12377961529344L, 92223);
  }
  
  public static void aFc()
  {
    GMTrace.i(12376887787520L, 92215);
    if (rWZ == null) {
      rWZ = new a((byte)0);
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    try
    {
      ab.getContext().registerReceiver(rWZ, localIntentFilter);
      w.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader startListen");
      GMTrace.o(12376887787520L, 92215);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static void aFd()
  {
    GMTrace.i(12377022005248L, 92216);
    if (rWZ != null) {}
    try
    {
      ab.getContext().unregisterReceiver(rWZ);
      rWZ = null;
      w.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader stopListen");
      GMTrace.o(12377022005248L, 92216);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static final class a
    extends BroadcastReceiver
  {
    private a()
    {
      GMTrace.i(12378095747072L, 92224);
      GMTrace.o(12378095747072L, 92224);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(12378229964800L, 92225);
      if ((!at.AU()) || (at.wF()))
      {
        w.e("MicroMsg.Wepkg.WepkgAutoDownloader", "acc has not ready");
        GMTrace.o(12378229964800L, 92225);
        return;
      }
      int i = am.getNetType(ab.getContext());
      if (i == a.lLV)
      {
        GMTrace.o(12378229964800L, 92225);
        return;
      }
      a.lLV = i;
      w.i("MicroMsg.Wepkg.WepkgAutoDownloader", "onNetStateChange, netState = " + i);
      boolean bool;
      if (i == 0)
      {
        bool = g.uu().uf();
        if (bg.aG(Long.valueOf(bg.c((Long)h.xy().xh().get(w.a.vyE, Long.valueOf(0L)))).longValue()) <= 1800L) {
          break label236;
        }
      }
      label236:
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          w.i("MicroMsg.Wepkg.WepkgAutoDownloader", "dont auto download in wifi, because from the last time is not enough for %s s", new Object[] { Long.valueOf(1800L) });
        }
        if ((!bool) && (i != 0))
        {
          h.xy().xh().a(w.a.vyE, Long.valueOf(bg.Pu()));
          paramContext = new tn();
          paramContext.eZp.eCx = 0;
          com.tencent.mm.sdk.b.a.vgX.m(paramContext);
        }
        GMTrace.o(12378229964800L, 92225);
        return;
        d.bGh().bGi();
        GMTrace.o(12378229964800L, 92225);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */