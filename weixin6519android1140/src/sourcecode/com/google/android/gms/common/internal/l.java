package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class l
  implements Handler.Callback
{
  public final Object akS = new Object();
  public final a alk;
  public final ArrayList<c.b> all = new ArrayList();
  public final ArrayList<c.b> alm = new ArrayList();
  public final ArrayList<c.c> aln = new ArrayList();
  public volatile boolean alo = false;
  public final AtomicInteger alp = new AtomicInteger(0);
  public boolean alq = false;
  public final Handler mHandler;
  
  public l(Looper paramLooper, a parama)
  {
    this.alk = parama;
    this.mHandler = new Handler(paramLooper, this);
  }
  
  public final void a(c.b paramb)
  {
    w.aa(paramb);
    synchronized (this.akS)
    {
      if (this.all.contains(paramb))
      {
        new StringBuilder("registerConnectionCallbacks(): listener ").append(paramb).append(" is already registered");
        if (this.alk.isConnected()) {
          this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramb));
        }
        return;
      }
      this.all.add(paramb);
    }
  }
  
  public final void a(c.c paramc)
  {
    w.aa(paramc);
    synchronized (this.akS)
    {
      if (this.aln.contains(paramc))
      {
        new StringBuilder("registerConnectionFailedListener(): listener ").append(paramc).append(" is already registered");
        return;
      }
      this.aln.add(paramc);
    }
  }
  
  public final void cb(int paramInt)
  {
    boolean bool = false;
    if (Looper.myLooper() == this.mHandler.getLooper()) {
      bool = true;
    }
    w.b(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
    this.mHandler.removeMessages(1);
    synchronized (this.akS)
    {
      this.alq = true;
      Object localObject2 = new ArrayList(this.all);
      int i = this.alp.get();
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        c.b localb = (c.b)((Iterator)localObject2).next();
        if ((this.alo) && (this.alp.get() == i)) {
          if (this.all.contains(localb)) {
            localb.bU(paramInt);
          }
        }
      }
    }
    this.alm.clear();
    this.alq = false;
  }
  
  public final boolean handleMessage(Message arg1)
  {
    if (???.what == 1)
    {
      c.b localb = (c.b)???.obj;
      synchronized (this.akS)
      {
        if ((this.alo) && (this.alk.isConnected()) && (this.all.contains(localb))) {
          localb.g(null);
        }
        return true;
      }
    }
    Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    return false;
  }
  
  public final void kA()
  {
    this.alo = false;
    this.alp.incrementAndGet();
  }
  
  public static abstract interface a
  {
    public abstract boolean isConnected();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */