package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface b
  extends IInterface
{
  public abstract void keep_OnError(int paramInt);
  
  public abstract void keep_OnOpenSuccess();
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(5199863218176L, 38742);
      attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
      GMTrace.o(5199863218176L, 38742);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(5199997435904L, 38743);
      GMTrace.o(5199997435904L, 38743);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(5200131653632L, 38744);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(5200131653632L, 38744);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
        GMTrace.o(5200131653632L, 38744);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
        keep_OnOpenSuccess();
        paramParcel2.writeNoException();
        GMTrace.o(5200131653632L, 38744);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
      keep_OnError(paramParcel1.readInt());
      paramParcel2.writeNoException();
      GMTrace.o(5200131653632L, 38744);
      return true;
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(5184428179456L, 38627);
        this.mRemote = paramIBinder;
        GMTrace.o(5184428179456L, 38627);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(5184562397184L, 38628);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(5184562397184L, 38628);
        return localIBinder;
      }
      
      public final void keep_OnError(int paramInt)
      {
        GMTrace.i(5184830832640L, 38630);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5184830832640L, 38630);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void keep_OnOpenSuccess()
      {
        GMTrace.i(5184696614912L, 38629);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5184696614912L, 38629);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */