package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface t
  extends IInterface
{
  public abstract void b(long paramLong, int paramInt1, int paramInt2, String paramString);
  
  public static abstract class a
    extends Binder
    implements t
  {
    public a()
    {
      GMTrace.i(11126246998016L, 82897);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
      GMTrace.o(11126246998016L, 82897);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11126381215744L, 82898);
      GMTrace.o(11126381215744L, 82898);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11126515433472L, 82899);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11126515433472L, 82899);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
        GMTrace.o(11126515433472L, 82899);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
      b(paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      GMTrace.o(11126515433472L, 82899);
      return true;
    }
    
    private static final class a
      implements t
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11161143607296L, 83157);
        this.mRemote = paramIBinder;
        GMTrace.o(11161143607296L, 83157);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11161277825024L, 83158);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11161277825024L, 83158);
        return localIBinder;
      }
      
      public final void b(long paramLong, int paramInt1, int paramInt2, String paramString)
      {
        GMTrace.i(11161412042752L, 83159);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
          localParcel1.writeLong(paramLong);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11161412042752L, 83159);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */