package com.tencent.mm.plugin.freewifi.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.ConnectSsidPasswordHelper.2;
import com.tencent.mm.plugin.freewifi.c.1;
import com.tencent.mm.plugin.freewifi.c.a;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class f
  extends e
  implements a
{
  private String lnX;
  
  public f(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    super(paramFreeWifiFrontPageUI);
    GMTrace.i(7236751458304L, 53918);
    this.lnX = this.intent.getStringExtra("free_wifi_passowrd");
    w.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=Data retrieved. password=%s", new Object[] { m.C(this.intent), Integer.valueOf(m.D(this.intent)), this.lnX });
    GMTrace.o(7236751458304L, 53918);
  }
  
  public final void connect()
  {
    GMTrace.i(7236885676032L, 53919);
    final com.tencent.mm.plugin.freewifi.c localc = new com.tencent.mm.plugin.freewifi.c(this.ssid, this.lqY, this.lnX);
    j.aBc();
    j.aBh().aAR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7244267651072L, 53974);
        com.tencent.mm.plugin.freewifi.c localc = localc;
        c.1 local1 = new c.1(localc, new c.a()
        {
          public final void nM(int paramAnonymous2Int)
          {
            GMTrace.i(7240375336960L, 53945);
            w.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, method=connect, desc=An attempt to connect to ssid failed. ssid=%s, errCode=%d", new Object[] { m.C(f.this.intent), Integer.valueOf(m.D(f.this.intent)), f.this.ssid, Integer.valueOf(paramAnonymous2Int) });
            Object localObject = k.aAB();
            ((k.a)localObject).ssid = f.this.ssid;
            ((k.a)localObject).bssid = m.yt("MicroMsg.FreeWifi.ProtocolFour");
            ((k.a)localObject).eCF = m.yu("MicroMsg.FreeWifi.ProtocolFour");
            ((k.a)localObject).eCE = f.this.eCE;
            ((k.a)localObject).lou = f.this.appId;
            ((k.a)localObject).lov = m.C(f.this.intent);
            ((k.a)localObject).low = m.E(f.this.intent);
            ((k.a)localObject).lox = k.b.loI.lpi;
            ((k.a)localObject).loy = k.b.loI.name;
            ((k.a)localObject).result = paramAnonymous2Int;
            ((k.a)localObject).ePH = m.F(f.this.intent);
            ((k.a)localObject).aAD().aAC();
            if (paramAnonymous2Int == -16)
            {
              f.this.intent.setClass(f.this.lqY.vKB.vKW, FreeWifiCopyPwdUI.class);
              f.this.lqY.finish();
              f.this.lqY.startActivity(f.this.intent);
              GMTrace.o(7240375336960L, 53945);
              return;
            }
            if ((paramAnonymous2Int == -14) || (paramAnonymous2Int == -18))
            {
              localObject = f.this.lqY;
              locald = FreeWifiFrontPageUI.d.ltD;
              locala = new FreeWifiFrontPageUI.a();
              locala.ltb = R.l.dxA;
              locala.ltc = m.a(f.this.lra, k.b.loI, paramAnonymous2Int);
              ((FreeWifiFrontPageUI)localObject).a(locald, locala);
              GMTrace.o(7240375336960L, 53945);
              return;
            }
            localObject = f.this.lqY;
            FreeWifiFrontPageUI.d locald = FreeWifiFrontPageUI.d.ltD;
            FreeWifiFrontPageUI.a locala = new FreeWifiFrontPageUI.a();
            locala.ltb = R.l.dxz;
            locala.ltc = m.a(f.this.lra, k.b.loI, paramAnonymous2Int);
            ((FreeWifiFrontPageUI)localObject).a(locald, locala);
            GMTrace.o(7240375336960L, 53945);
          }
          
          public final void onSuccess()
          {
            GMTrace.i(7240241119232L, 53944);
            w.i("MicroMsg.FreeWifi.ProtocolFour", "sessionKey=%s, step=%d, desc=connect ssid succeeded. ", new Object[] { m.C(f.this.intent), Integer.valueOf(m.D(f.this.intent)) });
            k.a locala = k.aAB();
            locala.ssid = f.this.ssid;
            locala.bssid = m.yt("MicroMsg.FreeWifi.ProtocolFour");
            locala.eCF = m.yu("MicroMsg.FreeWifi.ProtocolFour");
            locala.eCE = f.this.eCE;
            locala.lou = f.this.appId;
            locala.lov = m.C(f.this.intent);
            locala.low = m.E(f.this.intent);
            locala.lox = k.b.loI.lpi;
            locala.loy = k.b.loI.name;
            locala.result = 0;
            locala.ePH = m.F(f.this.intent);
            locala.aAD().aAC();
            m.a(f.this.intent, f.this.eCE, f.this.lra, f.this.eqV, f.this.lqY, "MicroMsg.FreeWifi.ProtocolFour");
            GMTrace.o(7240241119232L, 53944);
          }
        });
        if ((((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected()) && (localc.ssid.equals(d.aAY())))
        {
          local1.onSuccess();
          GMTrace.o(7244267651072L, 53974);
          return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          throw new RuntimeException("ConnectNetworkHelper组件不能在主线程中运行。");
        }
        localc.lnS = new ConnectSsidPasswordHelper.2(localc);
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
        localIntentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        for (;;)
        {
          try
          {
            localc.lnP.lock();
            localc.activity.registerReceiver(localc.lnS, localIntentFilter);
            if (!localc.aKk.isWifiEnabled())
            {
              i = new com.tencent.mm.plugin.freewifi.e(localc.activity).aAt();
              w.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "enable ret = " + i);
              if (i != 0)
              {
                local1.nM(i);
                localc.aAr();
                localc.lnP.unlock();
                GMTrace.o(7244267651072L, 53974);
                return;
              }
            }
            int i = d.d(localc.ssid, localc.lnX, 3, false);
            if (i != 0)
            {
              localc.aAr();
              local1.nM(i);
              localc.aAr();
              localc.lnP.unlock();
              GMTrace.o(7244267651072L, 53974);
              return;
            }
            try
            {
              if ((localc.connected) || (localc.lnW)) {
                break label494;
              }
              bool = localc.epJ.await(localc.guG, TimeUnit.MILLISECONDS);
              if (!bool)
              {
                local1.nM(-16);
                localc.aAr();
                localc.lnP.unlock();
                GMTrace.o(7244267651072L, 53974);
                return;
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              w.i("MicroMsg.FreeWifi.ConnectSsidPasswordHelper", "sessionKey=%s, step=%d, desc=ConnectNetworkHelper encounter interrupted exception. msg=%s", new Object[] { m.C(localc.activity.getIntent()), Integer.valueOf(m.D(localc.activity.getIntent())), localInterruptedException.getMessage() });
              local1.nM(-17);
              localc.aAr();
              localc.lnP.unlock();
              GMTrace.o(7244267651072L, 53974);
              return;
            }
            if (localc.connected)
            {
              local1.onSuccess();
              continue;
            }
            if (!localc.lnW) {
              continue;
            }
          }
          finally
          {
            localc.aAr();
            localc.lnP.unlock();
          }
          ((c.a)localObject).nM(-18);
          continue;
          label494:
          boolean bool = false;
        }
      }
    });
    GMTrace.o(7236885676032L, 53919);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */