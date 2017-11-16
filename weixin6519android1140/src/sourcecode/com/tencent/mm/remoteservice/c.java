package com.tencent.mm.remoteservice;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface c
  extends IInterface
{
  public abstract void a(String paramString1, String paramString2, Bundle paramBundle, b paramb);
  
  public static abstract class a
    extends Binder
    implements c
  {
    public a()
    {
      GMTrace.i(12957647896576L, 96542);
      attachInterface(this, "com.tencent.mm.remoteservice.ICommRemoteServer");
      GMTrace.o(12957647896576L, 96542);
    }
    
    public static c ac(IBinder paramIBinder)
    {
      GMTrace.i(12957782114304L, 96543);
      if (paramIBinder == null)
      {
        GMTrace.o(12957782114304L, 96543);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
      if ((localIInterface != null) && ((localIInterface instanceof c)))
      {
        paramIBinder = (c)localIInterface;
        GMTrace.o(12957782114304L, 96543);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(12957782114304L, 96543);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(12957916332032L, 96544);
      GMTrace.o(12957916332032L, 96544);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(12958050549760L, 96545);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(12958050549760L, 96545);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.remoteservice.ICommRemoteServer");
        GMTrace.o(12958050549760L, 96545);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      Bundle localBundle;
      if (paramParcel1.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        a(str1, str2, localBundle, b.a.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (localBundle == null) {
          break label167;
        }
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        GMTrace.o(12958050549760L, 96545);
        return true;
        localBundle = null;
        break;
        label167:
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements c
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(12957245243392L, 96539);
        this.mRemote = paramIBinder;
        GMTrace.o(12957245243392L, 96539);
      }
      
      public final void a(String paramString1, String paramString2, Bundle paramBundle, b paramb)
      {
        GMTrace.i(12957513678848L, 96541);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.remoteservice.ICommRemoteServer");
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              if (paramb != null)
              {
                paramString1 = paramb.asBinder();
                localParcel1.writeStrongBinder(paramString1);
                this.mRemote.transact(1, localParcel1, localParcel2, 0);
                localParcel2.readException();
                if (localParcel2.readInt() != 0) {
                  paramBundle.readFromParcel(localParcel2);
                }
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12957513678848L, 96541);
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramString1 = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12957379461120L, 96540);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(12957379461120L, 96540);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\remoteservice\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */