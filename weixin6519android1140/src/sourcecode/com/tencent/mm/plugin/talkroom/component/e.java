package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface e
  extends IInterface
{
  public abstract void blb();
  
  public abstract int bsc();
  
  public abstract void bsd();
  
  public abstract void release();
  
  public abstract void start();
  
  public static abstract class a
    extends Binder
    implements e
  {
    public a()
    {
      GMTrace.i(5200265871360L, 38745);
      attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
      GMTrace.o(5200265871360L, 38745);
    }
    
    public static e V(IBinder paramIBinder)
    {
      GMTrace.i(5200400089088L, 38746);
      if (paramIBinder == null)
      {
        GMTrace.o(5200400089088L, 38746);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof e)))
      {
        paramIBinder = (e)localIInterface;
        GMTrace.o(5200400089088L, 38746);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(5200400089088L, 38746);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(5200534306816L, 38747);
      GMTrace.o(5200534306816L, 38747);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(5200668524544L, 38748);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(5200668524544L, 38748);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        GMTrace.o(5200668524544L, 38748);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        blb();
        paramParcel2.writeNoException();
        GMTrace.o(5200668524544L, 38748);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        bsd();
        paramParcel2.writeNoException();
        GMTrace.o(5200668524544L, 38748);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        release();
        paramParcel2.writeNoException();
        GMTrace.o(5200668524544L, 38748);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        paramInt1 = bsc();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(5200668524544L, 38748);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
      start();
      paramParcel2.writeNoException();
      GMTrace.o(5200668524544L, 38748);
      return true;
    }
    
    private static final class a
      implements e
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(5185636139008L, 38636);
        this.mRemote = paramIBinder;
        GMTrace.o(5185636139008L, 38636);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(5185770356736L, 38637);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(5185770356736L, 38637);
        return localIBinder;
      }
      
      public final void blb()
      {
        GMTrace.i(5185904574464L, 38638);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5185904574464L, 38638);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int bsc()
      {
        GMTrace.i(5186307227648L, 38641);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5186307227648L, 38641);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bsd()
      {
        GMTrace.i(5186038792192L, 38639);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5186038792192L, 38639);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void release()
      {
        GMTrace.i(5186173009920L, 38640);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5186173009920L, 38640);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void start()
      {
        GMTrace.i(5186441445376L, 38642);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5186441445376L, 38642);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */