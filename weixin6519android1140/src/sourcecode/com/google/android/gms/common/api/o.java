package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.h.a;
import com.google.android.gms.common.internal.l.a;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.e;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class o
  implements c
{
  public final int agY;
  private final int agZ;
  public final Lock ahF = new ReentrantLock();
  final h ahU;
  final Map<a<?>, Integer> ahV;
  final Looper ahb;
  final b ahc;
  final a.a<? extends d, e> ahd;
  private final d aiA = new d()
  {
    public final void c(o.e<?> paramAnonymouse)
    {
      o.this.aiz.remove(paramAnonymouse);
    }
  };
  private final c.b aiB = new c.b()
  {
    public final void bU(int paramAnonymousInt)
    {
      o.this.ahF.lock();
      try
      {
        o.this.aiw.bU(paramAnonymousInt);
        return;
      }
      finally
      {
        o.this.ahF.unlock();
      }
    }
    
    public final void g(Bundle paramAnonymousBundle)
    {
      o.this.ahF.lock();
      try
      {
        o.this.aiw.g(paramAnonymousBundle);
        return;
      }
      finally
      {
        o.this.ahF.unlock();
      }
    }
  };
  private final l.a aiC = new l.a()
  {
    public final boolean isConnected()
    {
      return o.this.aiw instanceof l;
    }
  };
  final Condition ail;
  final com.google.android.gms.common.internal.l aim;
  final Queue<e<?>> ain = new LinkedList();
  volatile boolean aio;
  long aip = 120000L;
  long aiq = 5000L;
  final a air;
  BroadcastReceiver ais;
  final Map<a.c<?>, a.b> ait = new HashMap();
  final Map<a.c<?>, ConnectionResult> aiu = new HashMap();
  Set<Scope> aiv = new HashSet();
  public volatile p aiw;
  private ConnectionResult aix = null;
  private final Set<r<?>> aiy = Collections.newSetFromMap(new WeakHashMap());
  final Set<e<?>> aiz = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
  final Context mContext;
  
  public o(Context paramContext, Looper paramLooper, h paramh, b paramb, a.a<? extends d, e> parama, Map<a<?>, Object> paramMap, ArrayList<c.b> paramArrayList, ArrayList<c.c> paramArrayList1, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.aim = new com.google.android.gms.common.internal.l(paramLooper, this.aiC);
    this.ahb = paramLooper;
    this.air = new a(paramLooper);
    this.ahc = paramb;
    this.agY = paramInt1;
    this.agZ = paramInt2;
    this.ahV = new HashMap();
    this.ail = this.ahF.newCondition();
    this.aiw = new n(this);
    paramb = paramArrayList.iterator();
    while (paramb.hasNext())
    {
      paramArrayList = (c.b)paramb.next();
      this.aim.a(paramArrayList);
    }
    paramb = paramArrayList1.iterator();
    while (paramb.hasNext())
    {
      paramArrayList = (c.c)paramb.next();
      this.aim.a(paramArrayList);
    }
    paramArrayList = paramh.akL;
    paramArrayList1 = paramMap.keySet().iterator();
    a locala;
    if (paramArrayList1.hasNext())
    {
      locala = (a)paramArrayList1.next();
      paramb = paramMap.get(locala);
      if (paramArrayList.get(locala) == null) {
        break label593;
      }
      if (((h.a)paramArrayList.get(locala)).akO) {
        paramInt1 = 1;
      }
    }
    for (;;)
    {
      label408:
      this.ahV.put(locala, Integer.valueOf(paramInt1));
      label436:
      boolean bool;
      label452:
      c.b localb;
      c.c localc;
      if (locala.agP != null)
      {
        paramInt2 = 1;
        if (paramInt2 == 0) {
          break label551;
        }
        if (locala.agN == null) {
          break label545;
        }
        bool = true;
        w.b(bool, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        paramb = locala.agN;
        localb = this.aiB;
        localc = a(locala, paramInt1);
      }
      label545:
      label551:
      for (paramb = new com.google.android.gms.common.internal.c(paramContext, paramLooper, paramb.jO(), localb, localc, paramh, paramb.jN());; paramb = locala.jF().a(paramContext, paramLooper, paramh, paramb, this.aiB, a(locala, paramInt1)))
      {
        this.ait.put(locala.jG(), paramb);
        break;
        paramInt1 = 2;
        break label408;
        paramInt2 = 0;
        break label436;
        bool = false;
        break label452;
      }
      this.ahU = paramh;
      this.ahd = parama;
      return;
      label593:
      paramInt1 = 0;
    }
  }
  
  private final c.c a(final a<?> parama, final int paramInt)
  {
    new c.c()
    {
      public final void a(ConnectionResult paramAnonymousConnectionResult)
      {
        o.this.ahF.lock();
        try
        {
          o.this.aiw.a(paramAnonymousConnectionResult, parama, paramInt);
          return;
        }
        finally
        {
          o.this.ahF.unlock();
        }
      }
    };
  }
  
  public final ConnectionResult a(TimeUnit paramTimeUnit)
  {
    boolean bool;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool = true;
    }
    for (;;)
    {
      w.b(bool, "blockingConnect must not be called on the UI thread");
      this.ahF.lock();
      try
      {
        connect();
        long l1 = paramTimeUnit.toNanos(30L);
        for (;;)
        {
          bool = this.aiw instanceof m;
          if (!bool) {
            break;
          }
          try
          {
            long l2 = this.ail.awaitNanos(l1);
            l1 = l2;
            if (l2 <= 0L)
            {
              paramTimeUnit = new ConnectionResult(14, null);
              return paramTimeUnit;
            }
          }
          catch (InterruptedException paramTimeUnit)
          {
            Thread.currentThread().interrupt();
            paramTimeUnit = new ConnectionResult(15, null);
            return paramTimeUnit;
          }
        }
        bool = false;
        continue;
        if ((this.aiw instanceof l))
        {
          paramTimeUnit = ConnectionResult.agy;
          return paramTimeUnit;
        }
        if (this.aix != null)
        {
          paramTimeUnit = this.aix;
          return paramTimeUnit;
        }
        paramTimeUnit = new ConnectionResult(13, null);
        return paramTimeUnit;
      }
      finally
      {
        this.ahF.unlock();
      }
    }
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    if (paramT.agO != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.c(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      w.c(this.ait.containsKey(paramT.agO), "GoogleApiClient is not configured to use the API required for this call.");
      this.ahF.lock();
      try
      {
        paramT = this.aiw.a(paramT);
        return paramT;
      }
      finally
      {
        this.ahF.unlock();
      }
    }
  }
  
  public final void a(c.b paramb)
  {
    this.aim.a(paramb);
  }
  
  public final void a(c.c paramc)
  {
    this.aim.a(paramc);
  }
  
  final void a(b paramb)
  {
    paramb = this.air.obtainMessage(3, paramb);
    this.air.sendMessage(paramb);
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.append(paramString).append("mState=").append(this.aiw.getName());
    paramPrintWriter.append(" mResuming=").print(this.aio);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.ain.size());
    paramPrintWriter.append(" mUnconsumedRunners.size()=").println(this.aiz.size());
    String str = paramString + "  ";
    Iterator localIterator = this.ahV.keySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      paramPrintWriter.append(paramString).append(locala.mName).println(":");
      ((a.b)this.ait.get(locala.jG())).a(str, paramPrintWriter);
    }
  }
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    boolean bool;
    if (paramT.agO != null) {
      bool = true;
    }
    for (;;)
    {
      w.c(bool, "This task can not be executed (it's probably a Batch or malformed)");
      this.ahF.lock();
      try
      {
        if (!this.aio) {
          break label113;
        }
        this.ain.add(paramT);
        while (!this.ain.isEmpty())
        {
          e locale = (e)this.ain.remove();
          b(locale);
          locale.c(Status.aho);
        }
        bool = false;
      }
      finally
      {
        this.ahF.unlock();
      }
    }
    this.ahF.unlock();
    return paramT;
    label113:
    paramT = this.aiw.b(paramT);
    this.ahF.unlock();
    return paramT;
  }
  
  public final void b(c.b paramb)
  {
    com.google.android.gms.common.internal.l locall = this.aim;
    w.aa(paramb);
    synchronized (locall.akS)
    {
      if (!locall.all.remove(paramb)) {
        new StringBuilder("unregisterConnectionCallbacks(): listener ").append(paramb).append(" not found");
      }
      while (!locall.alq) {
        return;
      }
      locall.alm.add(paramb);
    }
  }
  
  public final void b(c.c paramc)
  {
    com.google.android.gms.common.internal.l locall = this.aim;
    w.aa(paramc);
    synchronized (locall.akS)
    {
      if (!locall.aln.remove(paramc)) {
        new StringBuilder("unregisterConnectionFailedListener(): listener ").append(paramc).append(" not found");
      }
      return;
    }
  }
  
  final <A extends a.b> void b(e<A> parame)
  {
    this.aiz.add(parame);
    parame.a(this.aiA);
  }
  
  public final void connect()
  {
    this.ahF.lock();
    try
    {
      this.aiw.connect();
      return;
    }
    finally
    {
      this.ahF.unlock();
    }
  }
  
  public final void disconnect()
  {
    this.ahF.lock();
    try
    {
      kh();
      this.aiw.disconnect();
      return;
    }
    finally
    {
      this.ahF.unlock();
    }
  }
  
  final void f(ConnectionResult paramConnectionResult)
  {
    this.ahF.lock();
    try
    {
      this.aix = paramConnectionResult;
      this.aiw = new n(this);
      this.aiw.begin();
      this.ail.signalAll();
      return;
    }
    finally
    {
      this.ahF.unlock();
    }
  }
  
  public final Looper getLooper()
  {
    return this.ahb;
  }
  
  public final boolean isConnected()
  {
    return this.aiw instanceof l;
  }
  
  public final boolean isConnecting()
  {
    return this.aiw instanceof m;
  }
  
  final void kg()
  {
    Iterator localIterator = this.aiz.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      locale.a(null);
      locale.cancel();
    }
    this.aiz.clear();
    localIterator = this.aiy.iterator();
    while (localIterator.hasNext()) {
      ((r)localIterator.next()).aiJ = null;
    }
    this.aiy.clear();
  }
  
  final boolean kh()
  {
    if (!this.aio) {
      return false;
    }
    this.aio = false;
    this.air.removeMessages(2);
    this.air.removeMessages(1);
    if (this.ais != null)
    {
      this.mContext.getApplicationContext().unregisterReceiver(this.ais);
      this.ais = null;
    }
    return true;
  }
  
  public final void resume()
  {
    this.ahF.lock();
    try
    {
      if (this.aio) {
        connect();
      }
      return;
    }
    finally
    {
      this.ahF.unlock();
    }
  }
  
  final class a
    extends Handler
  {
    a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        new StringBuilder("Unknown message id: ").append(paramMessage.what);
        return;
      case 1: 
        paramMessage = o.this;
        paramMessage.ahF.lock();
        try
        {
          if (paramMessage.kh()) {
            paramMessage.connect();
          }
          return;
        }
        finally
        {
          paramMessage.ahF.unlock();
        }
      case 2: 
        o.this.resume();
        return;
      case 3: 
        ((o.b)paramMessage.obj).a(o.this);
        return;
      }
      throw ((RuntimeException)paramMessage.obj);
    }
  }
  
  static abstract class b
  {
    private final p aiG;
    
    protected b(p paramp)
    {
      this.aiG = paramp;
    }
    
    public final void a(o paramo)
    {
      paramo.ahF.lock();
      try
      {
        p localp1 = paramo.aiw;
        p localp2 = this.aiG;
        if (localp1 != localp2) {
          return;
        }
        jX();
        return;
      }
      finally
      {
        paramo.ahF.unlock();
      }
    }
    
    protected abstract void jX();
  }
  
  private static final class c
    extends BroadcastReceiver
  {
    private WeakReference<o> aiH;
    
    c(o paramo)
    {
      this.aiH = new WeakReference(paramo);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      paramIntent = paramIntent.getData();
      paramContext = null;
      if (paramIntent != null) {
        paramContext = paramIntent.getSchemeSpecificPart();
      }
      if ((paramContext == null) || (!paramContext.equals("com.google.android.gms"))) {}
      do
      {
        return;
        paramContext = (o)this.aiH.get();
      } while (paramContext == null);
      paramContext.resume();
    }
  }
  
  static abstract interface d
  {
    public abstract void c(o.e<?> parame);
  }
  
  static abstract interface e<A extends a.b>
  {
    public abstract void a(Status paramStatus);
    
    public abstract void a(A paramA);
    
    public abstract void a(o.d paramd);
    
    public abstract void c(Status paramStatus);
    
    public abstract void cancel();
    
    public abstract a.c<A> jG();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */