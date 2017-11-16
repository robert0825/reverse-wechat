package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class h
  implements ServiceConnection
{
  boolean ane = false;
  private final BlockingQueue<IBinder> anf = new LinkedBlockingQueue();
  
  public final IBinder kW()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
    }
    if (this.ane) {
      throw new IllegalStateException();
    }
    this.ane = true;
    return (IBinder)this.anf.take();
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.anf.add(paramIBinder);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */