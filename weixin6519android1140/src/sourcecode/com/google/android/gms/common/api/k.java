package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.w;
import java.util.concurrent.atomic.AtomicReference;

public final class k
{
  public static abstract class a<R extends g, A extends a.b>
    extends i<R>
    implements k.b<R>, o.e<A>
  {
    final a.c<A> agO;
    private AtomicReference<o.d> ahC = new AtomicReference();
    
    public a(a.c<A> paramc, c paramc1)
    {
      super();
      this.agO = ((a.c)w.aa(paramc));
    }
    
    private void a(RemoteException paramRemoteException)
    {
      c(new Status(paramRemoteException.getLocalizedMessage()));
    }
    
    public final void a(A paramA)
    {
      try
      {
        b(paramA);
        return;
      }
      catch (DeadObjectException paramA)
      {
        a(paramA);
        throw paramA;
      }
      catch (RemoteException paramA)
      {
        a(paramA);
      }
    }
    
    public final void a(o.d paramd)
    {
      this.ahC.set(paramd);
    }
    
    public abstract void b(A paramA);
    
    public final void c(Status paramStatus)
    {
      if (!paramStatus.isSuccess()) {}
      for (boolean bool = true;; bool = false)
      {
        w.c(bool, "Failed result must not be success");
        a(b(paramStatus));
        return;
      }
    }
    
    public final a.c<A> jG()
    {
      return this.agO;
    }
    
    protected final void jV()
    {
      o.d locald = (o.d)this.ahC.getAndSet(null);
      if (locald != null) {
        locald.c(this);
      }
    }
  }
  
  public static abstract interface b<R>
  {
    public abstract void W(R paramR);
    
    public abstract void c(Status paramStatus);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */