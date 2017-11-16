package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface p
  extends IInterface
{
  public abstract o aup();
  
  public abstract l auq();
  
  public static abstract class a
    extends Binder
    implements p
  {
    public a()
    {
      GMTrace.i(11126918086656L, 82902);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      GMTrace.o(11126918086656L, 82902);
    }
    
    public static p P(IBinder paramIBinder)
    {
      GMTrace.i(11127052304384L, 82903);
      if (paramIBinder == null)
      {
        GMTrace.o(11127052304384L, 82903);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof p)))
      {
        paramIBinder = (p)localIInterface;
        GMTrace.o(11127052304384L, 82903);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11127052304384L, 82903);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11127186522112L, 82904);
      GMTrace.o(11127186522112L, 82904);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      o localo = null;
      l locall = null;
      GMTrace.i(11127320739840L, 82905);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11127320739840L, 82905);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
        GMTrace.o(11127320739840L, 82905);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
        localo = aup();
        paramParcel2.writeNoException();
        paramParcel1 = locall;
        if (localo != null) {
          paramParcel1 = localo.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        GMTrace.o(11127320739840L, 82905);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
      locall = auq();
      paramParcel2.writeNoException();
      paramParcel1 = localo;
      if (locall != null) {
        paramParcel1 = locall.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      GMTrace.o(11127320739840L, 82905);
      return true;
    }
    
    private static final class a
      implements p
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11153090543616L, 83097);
        this.mRemote = paramIBinder;
        GMTrace.o(11153090543616L, 83097);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11153224761344L, 83098);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11153224761344L, 83098);
        return localIBinder;
      }
      
      public final o aup()
      {
        GMTrace.i(11153358979072L, 83099);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          o localo = o.a.O(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11153358979072L, 83099);
          return localo;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final l auq()
      {
        GMTrace.i(11153493196800L, 83100);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          l locall = l.a.N(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11153493196800L, 83100);
          return locall;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */