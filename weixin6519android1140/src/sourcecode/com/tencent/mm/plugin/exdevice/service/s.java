package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface s
  extends IInterface
{
  public abstract void c(long paramLong, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements s
  {
    public a()
    {
      GMTrace.i(11177115516928L, 83276);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
      GMTrace.o(11177115516928L, 83276);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11177249734656L, 83277);
      GMTrace.o(11177249734656L, 83277);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11177383952384L, 83278);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11177383952384L, 83278);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
        GMTrace.o(11177383952384L, 83278);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
      c(paramParcel1.readLong(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      GMTrace.o(11177383952384L, 83278);
      return true;
    }
    
    private static final class a
      implements s
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11161546260480L, 83160);
        this.mRemote = paramIBinder;
        GMTrace.o(11161546260480L, 83160);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11161680478208L, 83161);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11161680478208L, 83161);
        return localIBinder;
      }
      
      public final void c(long paramLong, byte[] paramArrayOfByte)
      {
        GMTrace.i(11161814695936L, 83162);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
          localParcel1.writeLong(paramLong);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11161814695936L, 83162);
          return;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */