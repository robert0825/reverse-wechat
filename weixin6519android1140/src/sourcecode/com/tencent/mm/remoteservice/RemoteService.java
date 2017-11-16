package com.tencent.mm.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Constructor;

public class RemoteService
  extends Service
{
  private c.a vdX;
  
  public RemoteService()
  {
    GMTrace.i(12955231977472L, 96524);
    this.vdX = new c.a()
    {
      public final void a(String paramAnonymousString1, String paramAnonymousString2, Bundle paramAnonymousBundle, b paramAnonymousb)
      {
        GMTrace.i(12956976807936L, 96537);
        try
        {
          Object localObject = RemoteService.this.getClassLoader().loadClass(paramAnonymousString1);
          paramAnonymousString1 = ((Class)localObject).getConstructors();
          if (paramAnonymousString1.length > 0)
          {
            localObject = new Object[paramAnonymousString1[0].getParameterTypes().length];
            localObject[0] = null;
          }
          for (paramAnonymousString1 = (a)paramAnonymousString1[0].newInstance((Object[])localObject);; paramAnonymousString1 = (a)((Class)localObject).newInstance())
          {
            paramAnonymousString1.vdU = paramAnonymousb;
            paramAnonymousString1.vdT = RemoteService.this;
            paramAnonymousString1.onCallback(paramAnonymousString2, paramAnonymousBundle, false);
            GMTrace.o(12956976807936L, 96537);
            return;
          }
          return;
        }
        catch (Exception paramAnonymousString1)
        {
          w.e("MicroMsg.RemoveService", "exception:%s", new Object[] { bg.f(paramAnonymousString1) });
          GMTrace.o(12956976807936L, 96537);
        }
      }
    };
    GMTrace.o(12955231977472L, 96524);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(12955366195200L, 96525);
    new StringBuilder("onBind, threadId:").append(Thread.currentThread().getId());
    paramIntent = this.vdX;
    GMTrace.o(12955366195200L, 96525);
    return paramIntent;
  }
  
  public void onDestroy()
  {
    GMTrace.i(12955768848384L, 96528);
    new StringBuilder("onDestroy, threadId:").append(Thread.currentThread().getId());
    super.onDestroy();
    GMTrace.o(12955768848384L, 96528);
  }
  
  public void onRebind(Intent paramIntent)
  {
    GMTrace.i(12955500412928L, 96526);
    new StringBuilder("onRebind, threadId:").append(Thread.currentThread().getId());
    super.onRebind(paramIntent);
    GMTrace.o(12955500412928L, 96526);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    GMTrace.i(12955634630656L, 96527);
    new StringBuilder("onUnbind, threadId:").append(Thread.currentThread().getId());
    boolean bool = super.onUnbind(paramIntent);
    GMTrace.o(12955634630656L, 96527);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\remoteservice\RemoteService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */