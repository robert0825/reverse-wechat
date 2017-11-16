package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface i
  extends IInterface
{
  public abstract void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements i
  {
    public a()
    {
      GMTrace.i(11163156873216L, 83172);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
      GMTrace.o(11163156873216L, 83172);
    }
    
    public static i K(IBinder paramIBinder)
    {
      GMTrace.i(11163291090944L, 83173);
      if (paramIBinder == null)
      {
        GMTrace.o(11163291090944L, 83173);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof i)))
      {
        paramIBinder = (i)localIInterface;
        GMTrace.o(11163291090944L, 83173);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11163291090944L, 83173);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11163425308672L, 83174);
      GMTrace.o(11163425308672L, 83174);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11163559526400L, 83175);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11163559526400L, 83175);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
        GMTrace.o(11163559526400L, 83175);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
      a(paramParcel1.readInt(), paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      GMTrace.o(11163559526400L, 83175);
      return true;
    }
    
    private static final class a
      implements i
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11158727688192L, 83139);
        this.mRemote = paramIBinder;
        GMTrace.o(11158727688192L, 83139);
      }
      
      public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
      {
        GMTrace.i(11158996123648L, 83141);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnDeviceRequest_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeLong(paramLong);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11158996123648L, 83141);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11158861905920L, 83140);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11158861905920L, 83140);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */