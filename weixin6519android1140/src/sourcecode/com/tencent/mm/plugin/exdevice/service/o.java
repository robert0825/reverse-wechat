package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface o
  extends IInterface
{
  public abstract long auk();
  
  public abstract byte[] aul();
  
  public abstract int aum();
  
  public abstract int aun();
  
  public abstract int auo();
  
  public static abstract class a
    extends Binder
    implements o
  {
    public a()
    {
      GMTrace.i(11176310210560L, 83270);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      GMTrace.o(11176310210560L, 83270);
    }
    
    public static o O(IBinder paramIBinder)
    {
      GMTrace.i(11176444428288L, 83271);
      if (paramIBinder == null)
      {
        GMTrace.o(11176444428288L, 83271);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof o)))
      {
        paramIBinder = (o)localIInterface;
        GMTrace.o(11176444428288L, 83271);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11176444428288L, 83271);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11176578646016L, 83272);
      GMTrace.o(11176578646016L, 83272);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11176712863744L, 83273);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11176712863744L, 83273);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        GMTrace.o(11176712863744L, 83273);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        long l = auk();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        GMTrace.o(11176712863744L, 83273);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        paramParcel1 = aul();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(11176712863744L, 83273);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        paramInt1 = aum();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(11176712863744L, 83273);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        paramInt1 = aun();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(11176712863744L, 83273);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
      paramInt1 = auo();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      GMTrace.o(11176712863744L, 83273);
      return true;
    }
    
    private static final class a
      implements o
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11145037479936L, 83037);
        this.mRemote = paramIBinder;
        GMTrace.o(11145037479936L, 83037);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11145171697664L, 83038);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11145171697664L, 83038);
        return localIBinder;
      }
      
      public final long auk()
      {
        GMTrace.i(11145305915392L, 83039);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long l = localParcel2.readLong();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11145305915392L, 83039);
          return l;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] aul()
      {
        GMTrace.i(11145440133120L, 83040);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11145440133120L, 83040);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int aum()
      {
        GMTrace.i(11145574350848L, 83041);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11145574350848L, 83041);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int aun()
      {
        GMTrace.i(11145708568576L, 83042);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11145708568576L, 83042);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int auo()
      {
        GMTrace.i(11145842786304L, 83043);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11145842786304L, 83043);
          return i;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */