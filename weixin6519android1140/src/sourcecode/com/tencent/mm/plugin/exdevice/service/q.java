package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface q
  extends IInterface
{
  public abstract void a(double paramDouble1, int paramInt1, int paramInt2, byte[] paramArrayOfByte, double paramDouble2, int paramInt3, String paramString);
  
  public static abstract class a
    extends Binder
    implements q
  {
    public a()
    {
      GMTrace.i(11166378098688L, 83196);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
      GMTrace.o(11166378098688L, 83196);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11166512316416L, 83197);
      GMTrace.o(11166512316416L, 83197);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11166646534144L, 83198);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11166646534144L, 83198);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
        GMTrace.o(11166646534144L, 83198);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
      a(paramParcel1.readDouble(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.readDouble(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      GMTrace.o(11166646534144L, 83198);
      return true;
    }
    
    private static final class a
      implements q
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11175639121920L, 83265);
        this.mRemote = paramIBinder;
        GMTrace.o(11175639121920L, 83265);
      }
      
      public final void a(double paramDouble1, int paramInt1, int paramInt2, byte[] paramArrayOfByte, double paramDouble2, int paramInt3, String paramString)
      {
        GMTrace.i(11175907557376L, 83267);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
          localParcel1.writeDouble(paramDouble1);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeByteArray(paramArrayOfByte);
          localParcel1.writeDouble(paramDouble2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeString(paramString);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11175907557376L, 83267);
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
        GMTrace.i(11175773339648L, 83266);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11175773339648L, 83266);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */