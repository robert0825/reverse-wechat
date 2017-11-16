package com.tencent.a.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface b
  extends IInterface
{
  public abstract void onActionResult(byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements b
  {
    private static final String DESCRIPTOR = "com.tencent.assistant.sdk.remote.SDKActionCallback";
    static final int TRANSACTION_onActionResult = 1;
    
    public a()
    {
      attachInterface(this, "com.tencent.assistant.sdk.remote.SDKActionCallback");
    }
    
    public static b asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.assistant.sdk.remote.SDKActionCallback");
      if ((localIInterface != null) && ((localIInterface instanceof b))) {
        return (b)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.tencent.assistant.sdk.remote.SDKActionCallback");
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.assistant.sdk.remote.SDKActionCallback");
      onActionResult(paramParcel1.createByteArray());
      return true;
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public final IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public final void onActionResult(byte[] paramArrayOfByte)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.tencent.assistant.sdk.remote.SDKActionCallback");
          localParcel.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(1, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */