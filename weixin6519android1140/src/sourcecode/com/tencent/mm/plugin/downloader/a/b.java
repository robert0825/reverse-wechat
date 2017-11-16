package com.tencent.mm.plugin.downloader.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface b
  extends IInterface
{
  public abstract void d(String paramString1, int paramInt1, int paramInt2, String paramString2);
  
  public abstract void g(String paramString, long paramLong1, long paramLong2);
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(20089709527040L, 149680);
      attachInterface(this, "com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
      GMTrace.o(20089709527040L, 149680);
    }
    
    public static b I(IBinder paramIBinder)
    {
      GMTrace.i(20089843744768L, 149681);
      if (paramIBinder == null)
      {
        GMTrace.o(20089843744768L, 149681);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
      if ((localIInterface != null) && ((localIInterface instanceof b)))
      {
        paramIBinder = (b)localIInterface;
        GMTrace.o(20089843744768L, 149681);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(20089843744768L, 149681);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(20089977962496L, 149682);
      GMTrace.o(20089977962496L, 149682);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(20090112180224L, 149683);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(20090112180224L, 149683);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
        GMTrace.o(20090112180224L, 149683);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
        d(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(20090112180224L, 149683);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
      g(paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      GMTrace.o(20090112180224L, 149683);
      return true;
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(20089172656128L, 149676);
        this.mRemote = paramIBinder;
        GMTrace.o(20089172656128L, 149676);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(20089306873856L, 149677);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(20089306873856L, 149677);
        return localIBinder;
      }
      
      public final void d(String paramString1, int paramInt1, int paramInt2, String paramString2)
      {
        GMTrace.i(20089441091584L, 149678);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
          localParcel1.writeString(paramString1);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20089441091584L, 149678);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void g(String paramString, long paramLong1, long paramLong2)
      {
        GMTrace.i(20089575309312L, 149679);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadServiceCallback");
          localParcel1.writeString(paramString);
          localParcel1.writeLong(paramLong1);
          localParcel1.writeLong(paramLong2);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20089575309312L, 149679);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */