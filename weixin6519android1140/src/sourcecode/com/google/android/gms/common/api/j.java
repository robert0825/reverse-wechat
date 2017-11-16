package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class j<R extends g>
  implements e<R>
{
  private boolean ahA;
  private q ahB;
  private final Object ahs = new Object();
  protected final a<R> aht;
  private final CountDownLatch ahu = new CountDownLatch(1);
  private final ArrayList<Object> ahv = new ArrayList();
  private h<R> ahw;
  private volatile R ahx;
  private volatile boolean ahy;
  private boolean ahz;
  
  protected j(Looper paramLooper)
  {
    this.aht = new a(paramLooper);
  }
  
  private void b(R paramR)
  {
    this.ahx = paramR;
    this.ahB = null;
    this.ahu.countDown();
    paramR = this.ahx;
    if (this.ahw != null)
    {
      this.aht.removeMessages(2);
      if (!this.ahz)
      {
        paramR = this.aht;
        paramR.sendMessage(paramR.obtainMessage(1, new Pair(this.ahw, jW())));
      }
    }
    paramR = this.ahv.iterator();
    while (paramR.hasNext()) {
      paramR.next();
    }
    this.ahv.clear();
  }
  
  private static void c(g paramg)
  {
    if ((paramg instanceof f)) {}
    try
    {
      ((f)paramg).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      new StringBuilder("Unable to release ").append(paramg);
    }
  }
  
  private boolean jU()
  {
    return this.ahu.getCount() == 0L;
  }
  
  private R jW()
  {
    boolean bool = true;
    synchronized (this.ahs)
    {
      if (!this.ahy)
      {
        w.b(bool, "Result has already been consumed.");
        w.b(jU(), "Result is not ready.");
        g localg = this.ahx;
        this.ahx = null;
        this.ahw = null;
        this.ahy = true;
        jV();
        return localg;
      }
      bool = false;
    }
  }
  
  public final void a(Status paramStatus)
  {
    synchronized (this.ahs)
    {
      if (!jU())
      {
        a(b(paramStatus));
        this.ahA = true;
      }
      return;
    }
  }
  
  public final void a(R paramR)
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (this.ahs)
      {
        if ((this.ahA) || (this.ahz))
        {
          c(paramR);
          return;
        }
        if (!jU())
        {
          bool1 = true;
          w.b(bool1, "Results have already been set");
          if (this.ahy) {
            break label83;
          }
          bool1 = bool2;
          w.b(bool1, "Result has already been consumed");
          b(paramR);
          return;
        }
      }
      boolean bool1 = false;
      continue;
      label83:
      bool1 = false;
    }
  }
  
  public abstract R b(Status paramStatus);
  
  public final R b(TimeUnit paramTimeUnit)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((2L <= 0L) || (Looper.myLooper() != Looper.getMainLooper())) {
      bool1 = true;
    }
    for (;;)
    {
      w.b(bool1, "await must not be called on the UI thread when time is greater than zero.");
      if (!this.ahy)
      {
        bool1 = bool2;
        w.b(bool1, "Result has already been consumed.");
      }
      try
      {
        if (!this.ahu.await(2L, paramTimeUnit)) {
          a(Status.ahp);
        }
        w.b(jU(), "Result is not ready.");
        return jW();
        bool1 = false;
        continue;
        bool1 = false;
      }
      catch (InterruptedException paramTimeUnit)
      {
        for (;;)
        {
          a(Status.ahn);
        }
      }
    }
  }
  
  public final void cancel()
  {
    synchronized (this.ahs)
    {
      if ((this.ahz) || (this.ahy)) {
        return;
      }
      c(this.ahx);
      this.ahw = null;
      this.ahz = true;
      b(b(Status.ahq));
      return;
    }
  }
  
  public final R jS()
  {
    boolean bool2 = true;
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper()) {
      bool1 = true;
    }
    for (;;)
    {
      w.b(bool1, "await must not be called on the UI thread");
      if (!this.ahy)
      {
        bool1 = bool2;
        w.b(bool1, "Result has already been consumed");
      }
      try
      {
        this.ahu.await();
        w.b(jU(), "Result is not ready.");
        return jW();
        bool1 = false;
        continue;
        bool1 = false;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          a(Status.ahn);
        }
      }
    }
  }
  
  protected void jV() {}
  
  public static final class a<R extends g>
    extends Handler
  {
    public a()
    {
      this(Looper.getMainLooper());
    }
    
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
        return;
      case 1: 
        paramMessage = (Pair)paramMessage.obj;
        Object localObject = paramMessage.first;
        paramMessage = paramMessage.second;
        return;
      }
      ((j)paramMessage.obj).a(Status.ahp);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */