package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface n
  extends IInterface
{
  public abstract Bundle h(int paramInt, Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements n
  {
    public a()
    {
      GMTrace.i(11162351566848L, 83166);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
      GMTrace.o(11162351566848L, 83166);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11162485784576L, 83167);
      GMTrace.o(11162485784576L, 83167);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11162620002304L, 83168);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11162620002304L, 83168);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
        GMTrace.o(11162620002304L, 83168);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = h(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label146;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        GMTrace.o(11162620002304L, 83168);
        return true;
        paramParcel1 = null;
        break;
        label146:
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements n
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11160069865472L, 83149);
        this.mRemote = paramIBinder;
        GMTrace.o(11160069865472L, 83149);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11160204083200L, 83150);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11160204083200L, 83150);
        return localIBinder;
      }
      
      public final Bundle h(int paramInt, Bundle paramBundle)
      {
        GMTrace.i(11160338300928L, 83151);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(11160338300928L, 83151);
                return paramBundle;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramBundle = null;
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
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */