package com.tencent.mm.plugin.sport.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.a.qh.a;
import com.tencent.mm.plugin.sport.a.a.a;
import com.tencent.mm.plugin.sport.service.SportService;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import java.util.Calendar;

public final class a
{
  public c<qh> qqt;
  public e qqu;
  private long qqv;
  long qqw;
  public com.tencent.mm.plugin.sport.a.a qqx;
  private ServiceConnection qqy;
  
  public a()
  {
    GMTrace.i(16732118843392L, 124664);
    this.qqt = new c()
    {
      private boolean a(qh paramAnonymousqh)
      {
        GMTrace.i(16734534762496L, 124682);
        long l;
        boolean bool1;
        switch (paramAnonymousqh.eUX.action)
        {
        default: 
        case 1: 
        case 2: 
        case 3: 
          do
          {
            GMTrace.o(16734534762496L, 124682);
            return false;
            f.bqZ();
          } while (!a.bqT());
          a.this.bqW();
          l = a.this.bqV();
          if (paramAnonymousqh.eUX.action == 1) {
            bool1 = a.this.ee(l);
          }
          break;
        }
        for (;;)
        {
          w.i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d %b", new Object[] { Integer.valueOf(paramAnonymousqh.eUX.action), Long.valueOf(l), Boolean.valueOf(bool1) });
          break;
          if (k.w(a.this.bqU(), l))
          {
            bool1 = a.this.ee(l);
            continue;
            f.bqZ();
            if (!a.bqT()) {
              break;
            }
            a.this.bqW();
            l = a.this.bqV();
            a locala = a.this;
            if (locala.qqw == 0L) {
              locala.qqw = h.J(3, 0L);
            }
            boolean bool2 = k.v(locala.qqw, System.currentTimeMillis());
            boolean bool3 = k.w(a.this.bqU(), l);
            if ((bool3) || (bool2)) {}
            for (bool1 = a.this.ee(l);; bool1 = false)
            {
              w.i("MicroMsg.Sport.DeviceStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", new Object[] { Integer.valueOf(paramAnonymousqh.eUX.action), Long.valueOf(l), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
              break;
            }
          }
          bool1 = false;
        }
      }
    };
    this.qqy = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(16734937415680L, 124685);
        w.i("MicroMsg.Sport.DeviceStepManager", "onServiceConnected %s", new Object[] { paramAnonymousComponentName.toShortString() });
        a.this.qqx = a.a.S(paramAnonymousIBinder);
        GMTrace.o(16734937415680L, 124685);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(16735071633408L, 124686);
        w.i("MicroMsg.Sport.DeviceStepManager", "onServiceDisconnected %s", new Object[] { paramAnonymousComponentName.toShortString() });
        a.this.qqx = null;
        GMTrace.o(16735071633408L, 124686);
      }
    };
    this.qqt.bPu();
    GMTrace.o(16732118843392L, 124664);
  }
  
  public static boolean bqT()
  {
    GMTrace.i(16732253061120L, 124665);
    if ((k.dh(ab.getContext())) && (k.bqR()))
    {
      GMTrace.o(16732253061120L, 124665);
      return true;
    }
    GMTrace.o(16732253061120L, 124665);
    return false;
  }
  
  public final long bqU()
  {
    GMTrace.i(16732521496576L, 124667);
    if (this.qqv == 0L) {
      this.qqv = h.J(4, 0L);
    }
    long l = this.qqv;
    GMTrace.o(16732521496576L, 124667);
    return l;
  }
  
  public final long bqV()
  {
    GMTrace.i(16732655714304L, 124668);
    long l3 = System.currentTimeMillis();
    String str = "";
    if (this.qqx != null) {}
    for (;;)
    {
      try
      {
        l1 = this.qqx.bqO();
        str = "exdevice";
      }
      catch (RemoteException localRemoteException)
      {
        long l2;
        long l4;
        l1 = -1L;
        continue;
      }
      l2 = l1;
      if (l1 == -1L)
      {
        l1 = bg.bQR() / 10000L;
        l4 = h.vO(202);
        l2 = h.vO(201);
        if (l4 == l1) {
          str = "mm";
        }
      }
      else
      {
        w.i("MicroMsg.Sport.DeviceStepManager", "get today step from %s process %d use time %d", new Object[] { str, Long.valueOf(l2), Long.valueOf(System.currentTimeMillis() - l3) });
        GMTrace.o(16732655714304L, 124668);
        return l2;
      }
      str = "unknow";
      l2 = 0L;
      continue;
      long l1 = -1L;
    }
  }
  
  public final void bqW()
  {
    GMTrace.i(17482798596096L, 130257);
    if (k.dh(ab.getContext()))
    {
      if (this.qqx != null)
      {
        w.i("MicroMsg.Sport.DeviceStepManager", "Not need bind");
        GMTrace.o(17482798596096L, 130257);
        return;
      }
      w.i("MicroMsg.Sport.DeviceStepManager", "start to bind sport aidl");
      try
      {
        Intent localIntent1 = new Intent(ab.getContext(), SportService.class);
        localIntent1.setFlags(268435456);
        ab.getContext().bindService(localIntent1, this.qqy, 1);
        GMTrace.o(17482798596096L, 130257);
        return;
      }
      catch (Exception localException1)
      {
        GMTrace.o(17482798596096L, 130257);
        return;
      }
    }
    try
    {
      if (this.qqx != null) {
        ab.getContext().unbindService(this.qqy);
      }
      Intent localIntent2 = new Intent(ab.getContext(), SportService.class);
      ab.getContext().stopService(localIntent2);
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
    this.qqx = null;
    GMTrace.o(17482798596096L, 130257);
  }
  
  public final boolean ee(long paramLong)
  {
    GMTrace.i(16732387278848L, 124666);
    if (this.qqu != null) {
      com.tencent.mm.kernel.h.wS().c(this.qqu);
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    long l1 = localCalendar.getTimeInMillis();
    long l2 = System.currentTimeMillis();
    w.i("MicroMsg.Sport.DeviceStepManager", "update device Step time: %s stepCount: %s", new Object[] { k.ax(l2), Long.valueOf(paramLong) });
    this.qqu = new e("", "gh_43f2581f6fd6", (int)(l1 / 1000L), (int)(l2 / 1000L), (int)paramLong, ba.bUs(), 1);
    com.tencent.mm.kernel.h.wS().a(this.qqu, 0);
    l1 = System.currentTimeMillis();
    this.qqw = l1;
    h.K(3, l1);
    this.qqv = paramLong;
    h.K(4, this.qqv);
    GMTrace.o(16732387278848L, 124666);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */