package com.tencent.mm.ipcinvoker;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.b.a.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class BaseIPCService
  extends Service
{
  private volatile boolean fUU;
  private volatile boolean fUV;
  private a.a fUW;
  
  public BaseIPCService()
  {
    GMTrace.i(18690623930368L, 139256);
    this.fUW = new a.a()
    {
      public final void a(final Bundle paramAnonymousBundle, String paramAnonymousString, final com.tencent.mm.ipcinvoker.b.b paramAnonymousb)
      {
        GMTrace.i(18692100325376L, 139267);
        if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
        {
          w.e("IPC.BaseIPCService", "invokeAsync failed, class is null or nil.");
          GMTrace.o(18692100325376L, 139267);
          return;
        }
        final a locala = (a)n.c(paramAnonymousString, a.class);
        if (locala == null)
        {
          w.e("IPC.BaseIPCService", "invokeAsync failed, can not newInstance by class %s.", new Object[] { paramAnonymousString });
          GMTrace.o(18692100325376L, 139267);
          return;
        }
        if (paramAnonymousBundle != null) {
          paramAnonymousBundle.setClassLoader(BaseIPCService.class.getClassLoader());
        }
        m.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18695589986304L, 139293);
            locala.a(paramAnonymousBundle, new c()
            {
              public final void k(Bundle paramAnonymous3Bundle)
              {
                GMTrace.i(18690087059456L, 139252);
                if (BaseIPCService.1.1.this.fUZ != null)
                {
                  if (paramAnonymous3Bundle != null) {}
                  try
                  {
                    paramAnonymous3Bundle.setClassLoader(BaseIPCService.class.getClassLoader());
                    BaseIPCService.1.1.this.fUZ.k(paramAnonymous3Bundle);
                    GMTrace.o(18690087059456L, 139252);
                    return;
                  }
                  catch (RemoteException paramAnonymous3Bundle)
                  {
                    w.e("IPC.BaseIPCService", "%s", new Object[] { paramAnonymous3Bundle });
                  }
                }
                GMTrace.o(18690087059456L, 139252);
              }
            });
            GMTrace.o(18695589986304L, 139293);
          }
        });
        GMTrace.o(18692100325376L, 139267);
      }
      
      public final Bundle d(Bundle paramAnonymousBundle, String paramAnonymousString)
      {
        GMTrace.i(18692234543104L, 139268);
        if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
        {
          w.e("IPC.BaseIPCService", "invokeAsync failed, class is null or nil.");
          GMTrace.o(18692234543104L, 139268);
          return null;
        }
        k localk = (k)n.c(paramAnonymousString, k.class);
        if (localk == null)
        {
          w.e("IPC.BaseIPCService", "invokeSync failed, can not newInstance by class %s.", new Object[] { paramAnonymousString });
          GMTrace.o(18692234543104L, 139268);
          return null;
        }
        if (paramAnonymousBundle != null) {
          paramAnonymousBundle.setClassLoader(BaseIPCService.class.getClassLoader());
        }
        paramAnonymousBundle = localk.l(paramAnonymousBundle);
        GMTrace.o(18692234543104L, 139268);
        return paramAnonymousBundle;
      }
    };
    GMTrace.o(18690623930368L, 139256);
  }
  
  public final void aZ(boolean paramBoolean)
  {
    GMTrace.i(18691160801280L, 139260);
    if ((this.fUV) && (!paramBoolean))
    {
      w.i("IPC.BaseIPCService", "abort kill self(%s), the service was connected by other process.", new Object[] { vM() });
      GMTrace.o(18691160801280L, 139260);
      return;
    }
    w.i("IPC.BaseIPCService", "kill self(%s)", new Object[] { vM() });
    this.fUU = true;
    b.vN().vO();
    Object localObject1 = b.vN();
    w.i("IPC.IPCBridgeManager", "releaseAllIPCBridge");
    if (!((b)localObject1).fVe.isEmpty()) {}
    synchronized (((b)localObject1).fVe)
    {
      if (((b)localObject1).fVe.isEmpty()) {}
      do
      {
        HashSet localHashSet;
        do
        {
          stopSelf();
          localObject1 = j.vQ();
          ??? = vM();
          ((j)localObject1).fVy.remove(???);
          m.e(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18694247809024L, 139283);
              Process.killProcess(Process.myPid());
              GMTrace.o(18694247809024L, 139283);
            }
          });
          GMTrace.o(18691160801280L, 139260);
          return;
          localHashSet = new HashSet(((b)localObject1).fVe.keySet());
        } while (localHashSet.isEmpty());
        ??? = localHashSet.iterator();
      } while (!((Iterator)???).hasNext());
      ((b)localObject1).el((String)((Iterator)???).next());
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(18690758148096L, 139257);
    w.i("IPC.BaseIPCService", "onBind(%s), killSelf(%s)", new Object[] { paramIntent, Boolean.valueOf(this.fUU) });
    if (this.fUU)
    {
      w.i("IPC.BaseIPCService", "need to kill self, return null Binder object.");
      GMTrace.o(18690758148096L, 139257);
      return null;
    }
    paramIntent = j.vQ();
    String str = d.vP();
    if ((str == null) || (str.length() == 0) || (this == null)) {}
    for (;;)
    {
      this.fUV = true;
      paramIntent = this.fUW;
      GMTrace.o(18690758148096L, 139257);
      return paramIntent;
      paramIntent.fVy.put(str, this);
    }
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    GMTrace.i(18690892365824L, 139258);
    w.i("IPC.BaseIPCService", "onUnbind(%s)", new Object[] { paramIntent });
    boolean bool = super.onUnbind(paramIntent);
    this.fUV = false;
    GMTrace.o(18690892365824L, 139258);
    return bool;
  }
  
  public abstract String vM();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\BaseIPCService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */