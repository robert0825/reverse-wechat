package com.tencent.mm.plugin.sport.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface a
  extends IInterface
{
  public abstract void H(int paramInt, long paramLong);
  
  public abstract void Jt(String paramString);
  
  public abstract long bqO();
  
  public abstract void bqP();
  
  public abstract void clearConfig();
  
  public abstract long getLong(int paramInt, long paramLong);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      GMTrace.i(16738427076608L, 124711);
      attachInterface(this, "com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
      GMTrace.o(16738427076608L, 124711);
    }
    
    public static a S(IBinder paramIBinder)
    {
      GMTrace.i(16738561294336L, 124712);
      if (paramIBinder == null)
      {
        GMTrace.o(16738561294336L, 124712);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
      {
        paramIBinder = (a)localIInterface;
        GMTrace.o(16738561294336L, 124712);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(16738561294336L, 124712);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(16738695512064L, 124713);
      GMTrace.o(16738695512064L, 124713);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(16738829729792L, 124714);
      long l;
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(16738829729792L, 124714);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
        GMTrace.o(16738829729792L, 124714);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
        l = bqO();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        GMTrace.o(16738829729792L, 124714);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
        Jt(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(16738829729792L, 124714);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
        bqP();
        paramParcel2.writeNoException();
        GMTrace.o(16738829729792L, 124714);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
        H(paramParcel1.readInt(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        GMTrace.o(16738829729792L, 124714);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
        l = getLong(paramParcel1.readInt(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        GMTrace.o(16738829729792L, 124714);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
      clearConfig();
      paramParcel2.writeNoException();
      GMTrace.o(16738829729792L, 124714);
      return true;
    }
    
    private static final class a
      implements a
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(16737353334784L, 124703);
        this.mRemote = paramIBinder;
        GMTrace.o(16737353334784L, 124703);
      }
      
      public final void H(int paramInt, long paramLong)
      {
        GMTrace.i(16738024423424L, 124708);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16738024423424L, 124708);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void Jt(String paramString)
      {
        GMTrace.i(16737755987968L, 124706);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16737755987968L, 124706);
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
        GMTrace.i(16737487552512L, 124704);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(16737487552512L, 124704);
        return localIBinder;
      }
      
      public final long bqO()
      {
        GMTrace.i(16737621770240L, 124705);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long l = localParcel2.readLong();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16737621770240L, 124705);
          return l;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bqP()
      {
        GMTrace.i(16737890205696L, 124707);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16737890205696L, 124707);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void clearConfig()
      {
        GMTrace.i(16738292858880L, 124710);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16738292858880L, 124710);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final long getLong(int paramInt, long paramLong)
      {
        GMTrace.i(16738158641152L, 124709);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.sport.aidl.ISport_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramLong = localParcel2.readLong();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16738158641152L, 124709);
          return paramLong;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */