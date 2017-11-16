package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface ab
  extends IInterface
{
  public abstract int w(byte[] paramArrayOfByte);
  
  public abstract byte[] wU();
  
  public abstract byte[] wV();
  
  public static abstract class a
    extends Binder
    implements ab
  {
    public a()
    {
      GMTrace.i(13591424008192L, 101264);
      attachInterface(this, "com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
      GMTrace.o(13591424008192L, 101264);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13591558225920L, 101265);
      GMTrace.o(13591558225920L, 101265);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13591692443648L, 101266);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13591692443648L, 101266);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        GMTrace.o(13591692443648L, 101266);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        paramParcel1 = wU();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13591692443648L, 101266);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
        paramParcel1 = wV();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13591692443648L, 101266);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
      paramInt1 = w(paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      GMTrace.o(13591692443648L, 101266);
      return true;
    }
    
    private static final class a
      implements ab
    {
      private IBinder mRemote;
      
      public a(IBinder paramIBinder)
      {
        GMTrace.i(13600685031424L, 101333);
        this.mRemote = paramIBinder;
        GMTrace.o(13600685031424L, 101333);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13600819249152L, 101334);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13600819249152L, 101334);
        return localIBinder;
      }
      
      public final int w(byte[] paramArrayOfByte)
      {
        GMTrace.i(13601221902336L, 101337);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13601221902336L, 101337);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] wU()
      {
        GMTrace.i(13600953466880L, 101335);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13600953466880L, 101335);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] wV()
      {
        GMTrace.i(13601087684608L, 101336);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13601087684608L, 101336);
          return arrayOfByte;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */