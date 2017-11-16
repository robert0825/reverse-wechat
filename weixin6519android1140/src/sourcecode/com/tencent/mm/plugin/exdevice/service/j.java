package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface j
  extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements j
  {
    public a()
    {
      GMTrace.i(11157251293184L, 83128);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
      GMTrace.o(11157251293184L, 83128);
    }
    
    public static j L(IBinder paramIBinder)
    {
      GMTrace.i(11157385510912L, 83129);
      if (paramIBinder == null)
      {
        GMTrace.o(11157385510912L, 83129);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof j)))
      {
        paramIBinder = (j)localIInterface;
        GMTrace.o(11157385510912L, 83129);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11157385510912L, 83129);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11157519728640L, 83130);
      GMTrace.o(11157519728640L, 83130);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11157653946368L, 83131);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11157653946368L, 83131);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
        GMTrace.o(11157653946368L, 83131);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
      a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      GMTrace.o(11157653946368L, 83131);
      return true;
    }
    
    private static final class a
      implements j
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11159667212288L, 83146);
        this.mRemote = paramIBinder;
        GMTrace.o(11159667212288L, 83146);
      }
      
      public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, byte[] paramArrayOfByte)
      {
        GMTrace.i(11159935647744L, 83148);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11159935647744L, 83148);
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
        GMTrace.i(11159801430016L, 83147);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11159801430016L, 83147);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */