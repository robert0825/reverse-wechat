package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface k
  extends IInterface
{
  public abstract void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);
  
  public static abstract class a
    extends Binder
    implements k
  {
    public a()
    {
      GMTrace.i(11164364832768L, 83181);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
      GMTrace.o(11164364832768L, 83181);
    }
    
    public static k M(IBinder paramIBinder)
    {
      GMTrace.i(11164499050496L, 83182);
      if (paramIBinder == null)
      {
        GMTrace.o(11164499050496L, 83182);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof k)))
      {
        paramIBinder = (k)localIInterface;
        GMTrace.o(11164499050496L, 83182);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11164499050496L, 83182);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11164633268224L, 83183);
      GMTrace.o(11164633268224L, 83183);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11164767485952L, 83184);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11164767485952L, 83184);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
        GMTrace.o(11164767485952L, 83184);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
      a(paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      GMTrace.o(11164767485952L, 83184);
      return true;
    }
    
    private static final class a
      implements k
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11174968033280L, 83260);
        this.mRemote = paramIBinder;
        GMTrace.o(11174968033280L, 83260);
      }
      
      public final void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
      {
        GMTrace.i(11175236468736L, 83262);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
          localParcel1.writeLong(paramLong1);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeLong(paramLong2);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11175236468736L, 83262);
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
        GMTrace.i(11175102251008L, 83261);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11175102251008L, 83261);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */