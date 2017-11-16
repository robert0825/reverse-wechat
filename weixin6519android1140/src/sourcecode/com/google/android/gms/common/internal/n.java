package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class n
  extends m
  implements Handler.Callback
{
  public final Context adf;
  public final HashMap<a, b> alt = new HashMap();
  public final b alu;
  private final long alv;
  private final Handler mHandler;
  
  n(Context paramContext)
  {
    this.adf = paramContext.getApplicationContext();
    this.mHandler = new Handler(paramContext.getMainLooper(), this);
    this.alu = b.kU();
    this.alv = 5000L;
  }
  
  private void a(a parama, ServiceConnection paramServiceConnection)
  {
    w.j(paramServiceConnection, "ServiceConnection must not be null");
    b localb;
    synchronized (this.alt)
    {
      localb = (b)this.alt.get(parama);
      if (localb == null) {
        throw new IllegalStateException("Nonexistent connection status for service config: " + parama);
      }
    }
    if (!localb.a(paramServiceConnection)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + parama);
    }
    localb.alD.alu.a(localb.alD.adf, paramServiceConnection, null, null, 4);
    localb.alA.remove(paramServiceConnection);
    if (localb.kC())
    {
      parama = this.mHandler.obtainMessage(0, localb);
      this.mHandler.sendMessageDelayed(parama, this.alv);
    }
  }
  
  private boolean a(a parama, ServiceConnection paramServiceConnection, String paramString)
  {
    w.j(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      b localb;
      synchronized (this.alt)
      {
        localb = (b)this.alt.get(parama);
        if (localb == null)
        {
          localb = new b(parama);
          localb.a(paramServiceConnection, paramString);
          localb.ac(paramString);
          this.alt.put(parama, localb);
          parama = localb;
          boolean bool = parama.alB;
          return bool;
        }
        this.mHandler.removeMessages(0, localb);
        if (localb.a(paramServiceConnection)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + parama);
        }
      }
      localb.a(paramServiceConnection, paramString);
      switch (localb.mState)
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localb.aly, localb.ajT);
        parama = localb;
        break;
      case 2: 
        localb.ac(paramString);
        parama = localb;
        break;
      default: 
        parama = localb;
      }
    }
  }
  
  public final boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return a(new a(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    return a(new a(paramString1, paramString2), paramServiceConnection, paramString3);
  }
  
  public final void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    a(new a(paramComponentName), paramServiceConnection);
  }
  
  public final void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    a(new a(paramString1, paramString2), paramServiceConnection);
  }
  
  public final boolean handleMessage(Message arg1)
  {
    switch (???.what)
    {
    default: 
      return false;
    }
    b localb = (b)???.obj;
    synchronized (this.alt)
    {
      if (localb.kC())
      {
        if (localb.alB)
        {
          localb.alD.alu.a(localb.alD.adf, localb.alz);
          localb.alB = false;
          localb.mState = 2;
        }
        this.alt.remove(localb.alC);
      }
      return true;
    }
  }
  
  private static final class a
  {
    private final String alw;
    private final String alx;
    private final ComponentName aly;
    
    public a(ComponentName paramComponentName)
    {
      this.alw = null;
      this.alx = null;
      this.aly = ((ComponentName)w.aa(paramComponentName));
    }
    
    public a(String paramString1, String paramString2)
    {
      this.alw = w.af(paramString1);
      this.alx = w.af(paramString2);
      this.aly = null;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (!(paramObject instanceof a)) {
          return false;
        }
        paramObject = (a)paramObject;
      } while ((v.d(this.alw, ((a)paramObject).alw)) && (v.d(this.aly, ((a)paramObject).aly)));
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { this.alw, this.aly });
    }
    
    public final Intent kB()
    {
      if (this.alw != null) {
        return new Intent(this.alw).setPackage(this.alx);
      }
      return new Intent().setComponent(this.aly);
    }
    
    public final String toString()
    {
      if (this.alw == null) {
        return this.aly.flattenToString();
      }
      return this.alw;
    }
  }
  
  private final class b
  {
    public IBinder ajT;
    public final Set<ServiceConnection> alA;
    boolean alB;
    public final n.a alC;
    public ComponentName aly;
    final a alz;
    public int mState;
    
    public b(n.a parama)
    {
      this.alC = parama;
      this.alz = new a();
      this.alA = new HashSet();
      this.mState = 2;
    }
    
    public final void a(ServiceConnection paramServiceConnection, String paramString)
    {
      n.this.alu.a(n.this.adf, paramServiceConnection, paramString, this.alC.kB(), 3);
      this.alA.add(paramServiceConnection);
    }
    
    public final boolean a(ServiceConnection paramServiceConnection)
    {
      return this.alA.contains(paramServiceConnection);
    }
    
    public final void ac(String paramString)
    {
      this.alB = n.this.alu.a(n.this.adf, paramString, this.alC.kB(), this.alz, 129);
      if (this.alB)
      {
        this.mState = 3;
        return;
      }
      try
      {
        n.this.alu.a(n.this.adf, this.alz);
        return;
      }
      catch (IllegalArgumentException paramString) {}
    }
    
    public final boolean kC()
    {
      return this.alA.isEmpty();
    }
    
    public final class a
      implements ServiceConnection
    {
      public a() {}
      
      public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
      {
        synchronized (n.this.alt)
        {
          n.b.this.ajT = paramIBinder;
          n.b.this.aly = paramComponentName;
          Iterator localIterator = n.b.this.alA.iterator();
          if (localIterator.hasNext()) {
            ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
          }
        }
        n.b.this.mState = 1;
      }
      
      public final void onServiceDisconnected(ComponentName paramComponentName)
      {
        synchronized (n.this.alt)
        {
          n.b.this.ajT = null;
          n.b.this.aly = paramComponentName;
          Iterator localIterator = n.b.this.alA.iterator();
          if (localIterator.hasNext()) {
            ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
          }
        }
        n.b.this.mState = 2;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */