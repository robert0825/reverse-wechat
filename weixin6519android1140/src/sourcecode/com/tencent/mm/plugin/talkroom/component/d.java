package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface d
  extends IInterface
{
  public abstract void bsa();
  
  public abstract void bsb();
  
  public abstract int bsc();
  
  public abstract void release();
  
  public abstract void start();
  
  public static abstract class a
    extends Binder
    implements d
  {
    public a()
    {
      GMTrace.i(5188454711296L, 38657);
      attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      GMTrace.o(5188454711296L, 38657);
    }
    
    public static d U(IBinder paramIBinder)
    {
      GMTrace.i(5188588929024L, 38658);
      if (paramIBinder == null)
      {
        GMTrace.o(5188588929024L, 38658);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof d)))
      {
        paramIBinder = (d)localIInterface;
        GMTrace.o(5188588929024L, 38658);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(5188588929024L, 38658);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(5188723146752L, 38659);
      GMTrace.o(5188723146752L, 38659);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(5188857364480L, 38660);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(5188857364480L, 38660);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        GMTrace.o(5188857364480L, 38660);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        bsa();
        paramParcel2.writeNoException();
        GMTrace.o(5188857364480L, 38660);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        bsb();
        paramParcel2.writeNoException();
        GMTrace.o(5188857364480L, 38660);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        release();
        paramParcel2.writeNoException();
        GMTrace.o(5188857364480L, 38660);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        paramInt1 = bsc();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(5188857364480L, 38660);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
      start();
      paramParcel2.writeNoException();
      GMTrace.o(5188857364480L, 38660);
      return true;
    }
    
    private static final class a
      implements d
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(5193152331776L, 38692);
        this.mRemote = paramIBinder;
        GMTrace.o(5193152331776L, 38692);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(5193286549504L, 38693);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(5193286549504L, 38693);
        return localIBinder;
      }
      
      public final void bsa()
      {
        GMTrace.i(5193420767232L, 38694);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5193420767232L, 38694);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bsb()
      {
        GMTrace.i(5193554984960L, 38695);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5193554984960L, 38695);
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
        GMTrace.i(5193823420416L, 38697);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5193823420416L, 38697);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void release()
      {
        GMTrace.i(5193689202688L, 38696);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5193689202688L, 38696);
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
        GMTrace.i(5193957638144L, 38698);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5193957638144L, 38698);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */