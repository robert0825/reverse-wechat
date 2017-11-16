package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface u
  extends IInterface
{
  public abstract void ao(int paramInt1, int paramInt2);
  
  public static abstract class a
    extends Binder
    implements u
  {
    public static u q(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof u))) {
        return (u)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
      ao(paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
    
    private static final class a
      implements u
    {
      private IBinder ace;
      
      a(IBinder paramIBinder)
      {
        this.ace = paramIBinder;
      }
      
      public final void ao(int paramInt1, int paramInt2)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          this.ace.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
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
        return this.ace;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */