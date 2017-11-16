package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.w.a;
import java.util.List;

public abstract class WearableListenerService
  extends Service
  implements a.a, b.a, c.b, k.a, n.b, n.c
{
  private volatile int aAC = -1;
  private String aAD;
  private Handler aAE;
  private Object aAF = new Object();
  private boolean acO;
  private IBinder ajT;
  
  public void a(Channel paramChannel) {}
  
  public void a(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void a(e parame) {}
  
  public void a(l paraml) {}
  
  public void a(m paramm) {}
  
  public void b(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public void b(m paramm) {}
  
  public void c(Channel paramChannel, int paramInt1, int paramInt2) {}
  
  public final IBinder onBind(Intent paramIntent)
  {
    if ("com.google.android.gms.wearable.BIND_LISTENER".equals(paramIntent.getAction())) {
      return this.ajT;
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (Log.isLoggable("WearableLS", 3)) {
      new StringBuilder("onCreate: ").append(getPackageName());
    }
    this.aAD = getPackageName();
    HandlerThread localHandlerThread = new HandlerThread("WearableListenerService");
    localHandlerThread.start();
    this.aAE = new Handler(localHandlerThread.getLooper());
    this.ajT = new a();
  }
  
  public void onDestroy()
  {
    synchronized (this.aAF)
    {
      this.acO = true;
      if (this.aAE == null) {
        throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
      }
    }
    this.aAE.getLooper().quit();
    super.onDestroy();
  }
  
  private final class a
    extends w.a
  {
    boolean aAG = false;
    
    a() {}
    
    public final void a(final DataHolder paramDataHolder)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onDataItemChanged: ").append(WearableListenerService.a(WearableListenerService.this)).append(": ").append(paramDataHolder);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this))
        {
          paramDataHolder.close();
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run()
          {
            e locale = new e(paramDataHolder);
            try
            {
              WearableListenerService.this.a(locale);
              return;
            }
            finally
            {
              locale.release();
            }
          }
        });
        return;
      }
    }
    
    public final void a(final AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onEntityUpdate: ").append(paramAmsEntityUpdateParcelable);
      }
      if (!this.aAG) {
        return;
      }
      WearableListenerService.b(WearableListenerService.this);
      final zzj localzzj = (zzj)WearableListenerService.this;
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
      }
      WearableListenerService.e(WearableListenerService.this).post(new Runnable()
      {
        public final void run() {}
      });
    }
    
    public final void a(final AncsNotificationParcelable paramAncsNotificationParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onNotificationReceived: ").append(paramAncsNotificationParcelable);
      }
      if (!this.aAG) {
        return;
      }
      WearableListenerService.b(WearableListenerService.this);
      final zzj localzzj = (zzj)WearableListenerService.this;
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
      }
      WearableListenerService.e(WearableListenerService.this).post(new Runnable()
      {
        public final void run() {}
      });
    }
    
    public final void a(final CapabilityInfoParcelable paramCapabilityInfoParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onConnectedCapabilityChanged: ").append(paramCapabilityInfoParcelable);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run() {}
        });
        return;
      }
    }
    
    public final void a(final ChannelEventParcelable paramChannelEventParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onChannelEvent: ").append(paramChannelEventParcelable);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run()
          {
            paramChannelEventParcelable.a(WearableListenerService.this);
          }
        });
        return;
      }
    }
    
    public final void a(final MessageEventParcelable paramMessageEventParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onMessageReceived: ").append(paramMessageEventParcelable);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run()
          {
            WearableListenerService.this.a(paramMessageEventParcelable);
          }
        });
        return;
      }
    }
    
    public final void a(final NodeParcelable paramNodeParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onPeerConnected: ").append(WearableListenerService.a(WearableListenerService.this)).append(": ").append(paramNodeParcelable);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run()
          {
            WearableListenerService.this.a(paramNodeParcelable);
          }
        });
        return;
      }
    }
    
    public final void b(final NodeParcelable paramNodeParcelable)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onPeerDisconnected: ").append(WearableListenerService.a(WearableListenerService.this)).append(": ").append(paramNodeParcelable);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run()
          {
            WearableListenerService.this.b(paramNodeParcelable);
          }
        });
        return;
      }
    }
    
    public final void n(final List<NodeParcelable> paramList)
    {
      if (Log.isLoggable("WearableLS", 3)) {
        new StringBuilder("onConnectedNodes: ").append(WearableListenerService.a(WearableListenerService.this)).append(": ").append(paramList);
      }
      WearableListenerService.b(WearableListenerService.this);
      synchronized (WearableListenerService.c(WearableListenerService.this))
      {
        if (WearableListenerService.d(WearableListenerService.this)) {
          return;
        }
        WearableListenerService.e(WearableListenerService.this).post(new Runnable()
        {
          public final void run() {}
        });
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\WearableListenerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */