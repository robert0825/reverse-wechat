package com.tencent.mm.ipcinvoker;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class m
{
  private static volatile m fVC;
  ExecutorService fVD;
  private int fVE;
  private ae mHandler;
  
  private m()
  {
    GMTrace.i(18695992639488L, 139296);
    this.fVE = 3;
    final HandlerThread localHandlerThread = e.SV("IPCThreadPool#WorkerThread-" + hashCode());
    localHandlerThread.start();
    this.mHandler = new ae(localHandlerThread.getLooper());
    this.fVD = Executors.newScheduledThreadPool(this.fVE, new ThreadFactory()
    {
      int index;
      
      public final Thread newThread(final Runnable paramAnonymousRunnable)
      {
        GMTrace.i(18694516244480L, 139285);
        Object localObject = new StringBuilder("IPCThreadPool#Thread-");
        int i = this.index;
        this.index = (i + 1);
        localObject = i;
        paramAnonymousRunnable = new Thread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18701495566336L, 139337);
            ThreadLocal localThreadLocal = (ThreadLocal)new a(Looper.class, "sThreadLocal").vV();
            if ((localThreadLocal != null) && (localThreadLocal.get() == null))
            {
              w.d("IPC.IPCThreadPool", "create a new Looper ThreadLocal variable.");
              localThreadLocal.set(m.1.this.fVF.getLooper());
            }
            for (;;)
            {
              paramAnonymousRunnable.run();
              GMTrace.o(18701495566336L, 139337);
              return;
              w.d("IPC.IPCThreadPool", "ThreadLocal Looper variable is null or has set.(%s)", new Object[] { localThreadLocal });
            }
          }
        }, (String)localObject);
        w.i("IPC.IPCThreadPool", "newThread(thread : %s)", new Object[] { localObject });
        GMTrace.o(18694516244480L, 139285);
        return paramAnonymousRunnable;
      }
    });
    w.i("IPC.IPCThreadPool", "initialize IPCInvoker IPCThreadPool(hashCode : %s)", new Object[] { Integer.valueOf(hashCode()) });
    GMTrace.o(18695992639488L, 139296);
  }
  
  public static boolean e(Runnable paramRunnable)
  {
    GMTrace.i(18696261074944L, 139298);
    boolean bool = vS().mHandler.postDelayed(paramRunnable, 2000L);
    GMTrace.o(18696261074944L, 139298);
    return bool;
  }
  
  public static boolean post(Runnable paramRunnable)
  {
    GMTrace.i(18696126857216L, 139297);
    vS().fVD.execute(paramRunnable);
    GMTrace.o(18696126857216L, 139297);
    return true;
  }
  
  private static m vS()
  {
    GMTrace.i(18695724204032L, 139294);
    if (fVC == null) {}
    try
    {
      if (fVC == null) {
        fVC = new m();
      }
      m localm = fVC;
      GMTrace.o(18695724204032L, 139294);
      return localm;
    }
    finally {}
  }
  
  static m vT()
  {
    GMTrace.i(18695858421760L, 139295);
    m localm = new m();
    GMTrace.o(18695858421760L, 139295);
    return localm;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */