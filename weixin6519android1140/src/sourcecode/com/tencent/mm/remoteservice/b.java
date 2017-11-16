package com.tencent.mm.remoteservice;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface b
  extends IInterface
{
  public abstract void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean);
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(12958453202944L, 96548);
      attachInterface(this, "com.tencent.mm.remoteservice.ICommClientCallback");
      GMTrace.o(12958453202944L, 96548);
    }
    
    public static b asInterface(IBinder paramIBinder)
    {
      GMTrace.i(12958587420672L, 96549);
      if (paramIBinder == null)
      {
        GMTrace.o(12958587420672L, 96549);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommClientCallback");
      if ((localIInterface != null) && ((localIInterface instanceof b)))
      {
        paramIBinder = (b)localIInterface;
        GMTrace.o(12958587420672L, 96549);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(12958587420672L, 96549);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(12958721638400L, 96550);
      GMTrace.o(12958721638400L, 96550);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(12958855856128L, 96551);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(12958855856128L, 96551);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.remoteservice.ICommClientCallback");
        GMTrace.o(12958855856128L, 96551);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.remoteservice.ICommClientCallback");
      String str = paramParcel1.readString();
      Bundle localBundle;
      if (paramParcel1.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label164;
        }
        bool = true;
        label117:
        onCallback(str, localBundle, bool);
        paramParcel2.writeNoException();
        if (localBundle == null) {
          break label170;
        }
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        GMTrace.o(12958855856128L, 96551);
        return true;
        localBundle = null;
        break;
        label164:
        bool = false;
        break label117;
        label170:
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(12955903066112L, 96529);
        this.mRemote = paramIBinder;
        GMTrace.o(12955903066112L, 96529);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12956037283840L, 96530);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(12956037283840L, 96530);
        return localIBinder;
      }
      
      public final void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
      {
        int i = 1;
        GMTrace.i(12956171501568L, 96531);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.remoteservice.ICommClientCallback");
            localParcel1.writeString(paramString);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              break label143;
              localParcel1.writeInt(i);
              this.mRemote.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0) {
                paramBundle.readFromParcel(localParcel2);
              }
              localParcel2.recycle();
              localParcel1.recycle();
              GMTrace.o(12956171501568L, 96531);
            }
            else
            {
              localParcel1.writeInt(0);
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          label143:
          do
          {
            i = 0;
            break;
          } while (!paramBoolean);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\remoteservice\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */