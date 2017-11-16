package com.tencent.mm.remoteservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private Context context;
  private ServiceConnection keh;
  public List<Runnable> vdZ;
  public c vea;
  
  public d(Context paramContext)
  {
    GMTrace.i(12958990073856L, 96552);
    this.vdZ = new LinkedList();
    this.keh = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(12956708372480L, 96535);
        d.this.vea = c.a.ac(paramAnonymousIBinder);
        paramAnonymousComponentName = (Runnable[])d.this.vdZ.toArray(new Runnable[d.this.vdZ.size()]);
        int j = paramAnonymousComponentName.length;
        int i = 0;
        while (i < j)
        {
          paramAnonymousComponentName[i].run();
          i += 1;
        }
        d.this.vdZ.clear();
        GMTrace.o(12956708372480L, 96535);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(12956574154752L, 96534);
        d.this.vea = null;
        GMTrace.o(12956574154752L, 96534);
      }
    };
    this.context = paramContext;
    GMTrace.o(12958990073856L, 96552);
  }
  
  public final void C(Runnable paramRunnable)
  {
    GMTrace.i(12959124291584L, 96553);
    new StringBuilder("RemoteServiceProxy construct, thread id:").append(Thread.currentThread().getId());
    if (isConnected())
    {
      paramRunnable.run();
      GMTrace.o(12959124291584L, 96553);
      return;
    }
    this.vdZ.add(paramRunnable);
    paramRunnable = new Intent(this.context, RemoteService.class);
    this.context.bindService(paramRunnable, this.keh, 1);
    GMTrace.o(12959124291584L, 96553);
  }
  
  final void a(b paramb, String paramString, Bundle paramBundle)
  {
    GMTrace.i(12959526944768L, 96556);
    if (isConnected()) {
      try
      {
        this.vea.a(paramb.getClass().getName(), paramString, paramBundle, paramb);
        GMTrace.o(12959526944768L, 96556);
        return;
      }
      catch (RemoteException paramb)
      {
        w.e("MicroMsg.RemoteServiceProxy", "exception:%s", new Object[] { bg.f(paramb) });
      }
    }
    GMTrace.o(12959526944768L, 96556);
  }
  
  public final boolean isConnected()
  {
    GMTrace.i(12959258509312L, 96554);
    if ((this.vea != null) && (this.vea.asBinder().isBinderAlive()))
    {
      GMTrace.o(12959258509312L, 96554);
      return true;
    }
    GMTrace.o(12959258509312L, 96554);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(12959392727040L, 96555);
    if ((this.vea != null) && (this.keh != null))
    {
      this.context.unbindService(this.keh);
      this.vea = null;
    }
    GMTrace.o(12959392727040L, 96555);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\remoteservice\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */