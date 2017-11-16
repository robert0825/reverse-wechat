package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface g
  extends IInterface
{
  public abstract void cY(int paramInt);
  
  public static abstract class a
    extends Binder
    implements g
  {
    public a()
    {
      GMTrace.i(13700408803328L, 102076);
      attachInterface(this, "com.tencent.mm.network.IIpxxCallback_AIDL");
      GMTrace.o(13700408803328L, 102076);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13700543021056L, 102077);
      GMTrace.o(13700543021056L, 102077);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13700677238784L, 102078);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13700677238784L, 102078);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IIpxxCallback_AIDL");
        GMTrace.o(13700677238784L, 102078);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
      cY(paramParcel1.readInt());
      paramParcel2.writeNoException();
      GMTrace.o(13700677238784L, 102078);
      return true;
    }
    
    private static final class a
      implements g
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13668599201792L, 101839);
        this.mRemote = paramIBinder;
        GMTrace.o(13668599201792L, 101839);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13668733419520L, 101840);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13668733419520L, 101840);
        return localIBinder;
      }
      
      public final void cY(int paramInt)
      {
        GMTrace.i(13668867637248L, 101841);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IIpxxCallback_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13668867637248L, 101841);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */