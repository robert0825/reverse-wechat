package com.c.a;

import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ServiceManager;

public final class a
{
  public c aCX;
  public b aCY;
  public a aCZ;
  private int aDa;
  public b aDb;
  public int aDc = -1;
  public IBinder.DeathRecipient aDd = new IBinder.DeathRecipient()
  {
    public final void binderDied()
    {
      if (a.this.aDb != null) {
        a.this.aDb.av(2101, -1);
      }
    }
  };
  
  private a(c paramc, Looper paramLooper, int paramInt)
  {
    this.aCX = paramc;
    paramLooper = new a(paramLooper);
    this.aDa = 1;
    this.aCY = new b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, byte[] paramAnonymousArrayOfByte)
      {
        a.this.aCZ.sendMessage(a.this.aCZ.obtainMessage(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousArrayOfByte));
      }
    };
    if (!this.aCX.a(this.aCY, 1)) {
      throw new RuntimeException();
    }
    this.aCZ = paramLooper;
    paramc.asBinder().linkToDeath(this.aDd, 0);
  }
  
  private static c nA()
  {
    return c.a.x(ServiceManager.getService("authentication_service"));
  }
  
  public static a nx()
  {
    Object localObject = nA();
    if (localObject == null) {
      return null;
    }
    Looper localLooper = Looper.getMainLooper();
    try
    {
      localObject = new a((c)localObject, localLooper, 1);
      return (a)localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static int[] nz()
  {
    Object localObject = nA();
    if (localObject == null) {
      return new int[0];
    }
    try
    {
      localObject = ((c)localObject).nB();
      return (int[])localObject;
    }
    catch (RemoteException localRemoteException) {}
    return new int[0];
  }
  
  public final int a(b paramb, int paramInt, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramb == null)) {
      return -1;
    }
    if (paramInt > 0)
    {
      new StringBuilder("startIdentify send message timeout after ").append(paramInt).append(" ms");
      Message localMessage = this.aCZ.obtainMessage(8);
      this.aCZ.sendMessageDelayed(localMessage, paramInt);
    }
    this.aDb = paramb;
    this.aDc = 0;
    try
    {
      paramInt = this.aCX.a(this.aCY, paramArrayOfInt, null);
      return paramInt;
    }
    catch (RemoteException paramb) {}
    return -1;
  }
  
  public final void abort()
  {
    if (this.aCZ != null) {
      this.aCZ.removeMessages(8);
    }
    try
    {
      this.aCX.a(this.aCY);
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public final int[] ny()
  {
    try
    {
      int[] arrayOfInt = this.aCX.c(this.aCY);
      return arrayOfInt;
    }
    catch (RemoteException localRemoteException) {}
    return new int[0];
  }
  
  private final class a
    extends Handler
  {
    private final int aDf = 2001;
    private final int aDg = 2002;
    private final int aDh = 2003;
    private final int aDi = 2004;
    private final int aDj = 2005;
    private final int aDk = 2006;
    
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      int i = 2005;
      new StringBuilder("what = ").append(paramMessage.what);
      switch (paramMessage.what)
      {
      case 4: 
      case 5: 
      default: 
      case 1: 
      case 2: 
      case 3: 
        do
        {
          do
          {
            do
            {
              return;
            } while (a.this.aDb == null);
            return;
          } while (a.this.aDb == null);
          return;
        } while (a.this.aDb == null);
        return;
      case 6: 
        if (a.this.aDb != null) {
          a.this.aDb.av(0, paramMessage.arg1);
        }
        removeMessages(8);
        return;
      case 7: 
        if (a.this.aDb != null) {
          switch (paramMessage.arg1)
          {
          default: 
            i = 2020;
          }
        }
        for (;;)
        {
          a.this.aDb.av(i, -1);
          removeMessages(8);
          return;
          i = 2002;
          continue;
          i = 2003;
          continue;
          i = 2000;
          continue;
          i = 2006;
        }
      }
      if (a.this.aDb != null) {
        a.this.aDb.av(2001, -1);
      }
      removeMessages(8);
      a.this.abort();
    }
  }
  
  public static abstract interface b
  {
    public abstract void av(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */