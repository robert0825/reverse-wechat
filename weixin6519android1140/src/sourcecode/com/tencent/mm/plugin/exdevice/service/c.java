package com.tencent.mm.plugin.exdevice.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements ServiceConnection
{
  public a kCW;
  public volatile boolean kCX;
  private List<Runnable> kCY;
  
  public c()
  {
    GMTrace.i(11147453399040L, 83055);
    this.kCY = new LinkedList();
    GMTrace.o(11147453399040L, 83055);
  }
  
  public final void ck(Context paramContext)
  {
    GMTrace.i(11147856052224L, 83058);
    if (!d.cl(paramContext))
    {
      w.i("MicroMsg.exdevice.ExDeviceServiceConnection", "ensureServiceInstance return false");
      GMTrace.o(11147856052224L, 83058);
      return;
    }
    if (paramContext.bindService(new Intent(paramContext, ExDeviceService.class), this, 1))
    {
      w.i("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice success");
      GMTrace.o(11147856052224L, 83058);
      return;
    }
    w.e("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice failed");
    GMTrace.o(11147856052224L, 83058);
  }
  
  public final void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    GMTrace.i(11147587616768L, 83056);
    w.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceConnected");
    ??? = new x(h.a.J(paramIBinder));
    u.a(???);
    ab.bQb();
    ???.a(com.tencent.mm.plugin.exdevice.b.a.atl());
    ???.b(com.tencent.mm.plugin.exdevice.model.a.atw());
    if (!???.a(ad.aud())) {
      w.e("MicroMsg.exdevice.ExDeviceServiceConnection", "simpleBluetoothRegistOnRecv error");
    }
    if (this.kCW != null) {
      this.kCW.onServiceConnected();
    }
    this.kCX = true;
    synchronized (this.kCY)
    {
      paramIBinder = new ArrayList(this.kCY);
      this.kCY.clear();
      int i = 0;
      if (i < paramIBinder.size())
      {
        ??? = (Runnable)paramIBinder.get(i);
        if (??? != null) {
          ???.run();
        }
        i += 1;
      }
    }
    paramIBinder.clear();
    GMTrace.o(11147587616768L, 83056);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    GMTrace.i(11147721834496L, 83057);
    w.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceDisconnected");
    this.kCX = false;
    u.a(null);
    ab.bQb();
    if ((at.AT()) && (!at.wF()))
    {
      ck(ab.getContext());
      GMTrace.o(11147721834496L, 83057);
      return;
    }
    w.i("MicroMsg.exdevice.ExDeviceServiceConnection", "no user login, ignore this disconnection");
    GMTrace.o(11147721834496L, 83057);
  }
  
  public final boolean q(Runnable paramRunnable)
  {
    GMTrace.i(11147990269952L, 83059);
    if (this.kCX) {
      paramRunnable.run();
    }
    for (;;)
    {
      GMTrace.o(11147990269952L, 83059);
      return true;
      synchronized (this.kCY)
      {
        this.kCY.add(paramRunnable);
      }
    }
  }
  
  public static abstract class a
  {
    public int eFC;
    
    public a(int paramInt)
    {
      GMTrace.i(11135373803520L, 82965);
      this.eFC = paramInt;
      GMTrace.o(11135373803520L, 82965);
    }
    
    public abstract void onServiceConnected();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */