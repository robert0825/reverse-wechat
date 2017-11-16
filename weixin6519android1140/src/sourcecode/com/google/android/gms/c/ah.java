package com.google.android.gms.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ah
{
  private static volatile ah avk;
  private volatile aj adC;
  public final List<Object> avl;
  private final ad avm;
  public final a avn;
  public Thread.UncaughtExceptionHandler avo;
  public final Context mContext;
  
  private ah(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    w.aa(paramContext);
    this.mContext = paramContext;
    this.avn = new a();
    this.avl = new CopyOnWriteArrayList();
    this.avm = new ad();
  }
  
  public static ah N(Context paramContext)
  {
    w.aa(paramContext);
    if (avk == null) {}
    try
    {
      if (avk == null) {
        avk = new ah(paramContext);
      }
      return avk;
    }
    finally {}
  }
  
  public static void b(ae paramae)
  {
    w.ah("deliver should be called from worker thread");
    w.c(paramae.auX, "Measurement must be submitted");
    Object localObject = paramae.avf;
    if (((List)localObject).isEmpty()) {}
    for (;;)
    {
      return;
      HashSet localHashSet = new HashSet();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ai localai = (ai)((Iterator)localObject).next();
        Uri localUri = localai.jy();
        if (!localHashSet.contains(localUri))
        {
          localHashSet.add(localUri);
          localai.b(paramae);
        }
      }
    }
  }
  
  public static void iK()
  {
    if (!(Thread.currentThread() instanceof c)) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
  
  public final <V> Future<V> a(Callable<V> paramCallable)
  {
    w.aa(paramCallable);
    if ((Thread.currentThread() instanceof c))
    {
      paramCallable = new FutureTask(paramCallable);
      paramCallable.run();
      return paramCallable;
    }
    return this.avn.submit(paramCallable);
  }
  
  public final void c(Runnable paramRunnable)
  {
    w.aa(paramRunnable);
    this.avn.submit(paramRunnable);
  }
  
  public final aj lD()
  {
    if (this.adC == null) {}
    for (;;)
    {
      aj localaj;
      PackageManager localPackageManager;
      String str2;
      Object localObject5;
      Object localObject3;
      PackageInfo localPackageInfo;
      Object localObject4;
      String str1;
      try
      {
        if (this.adC == null)
        {
          localaj = new aj();
          localPackageManager = this.mContext.getPackageManager();
          str2 = this.mContext.getPackageName();
          localaj.avt = str2;
          localaj.avu = localPackageManager.getInstallerPackageName(str2);
          localObject5 = null;
          localObject3 = str2;
        }
      }
      finally {}
      try
      {
        localPackageInfo = localPackageManager.getPackageInfo(this.mContext.getPackageName(), 0);
        localObject4 = localObject5;
        str1 = str2;
        if (localPackageInfo != null)
        {
          localObject3 = str2;
          localObject4 = localPackageManager.getApplicationLabel(localPackageInfo.applicationInfo);
          str1 = str2;
          localObject3 = str2;
          if (!TextUtils.isEmpty((CharSequence)localObject4))
          {
            localObject3 = str2;
            str1 = ((CharSequence)localObject4).toString();
          }
          localObject3 = str1;
          localObject4 = localPackageInfo.versionName;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject4 = localObject5;
        Object localObject2 = localObject3;
      }
    }
    localaj.abS = str1;
    localaj.abT = ((String)localObject4);
    this.adC = localaj;
    return this.adC;
  }
  
  private final class a
    extends ThreadPoolExecutor
  {
    public a()
    {
      super(1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
      setThreadFactory(new ah.b());
    }
    
    protected final <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
    {
      new FutureTask(paramRunnable, paramT)
      {
        protected final void setException(Throwable paramAnonymousThrowable)
        {
          Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = ah.this.avo;
          if (localUncaughtExceptionHandler != null) {
            localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), paramAnonymousThrowable);
          }
          for (;;)
          {
            super.setException(paramAnonymousThrowable);
            return;
            if (Log.isLoggable("GAv4", 6)) {
              new StringBuilder("MeasurementExecutor: job failed with ").append(paramAnonymousThrowable);
            }
          }
        }
      };
    }
  }
  
  private static final class b
    implements ThreadFactory
  {
    private static final AtomicInteger avs = new AtomicInteger();
    
    public final Thread newThread(Runnable paramRunnable)
    {
      return new ah.c(paramRunnable, "measurement-" + avs.incrementAndGet());
    }
  }
  
  private static final class c
    extends Thread
  {
    c(Runnable paramRunnable, String paramString)
    {
      super(paramString);
    }
    
    public final void run()
    {
      Process.setThreadPriority(10);
      super.run();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */