package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface f
  extends IInterface
{
  public abstract void a(String paramString, Bitmap paramBitmap);
  
  public abstract MCacheItem dt(String paramString);
  
  public abstract void du(String paramString);
  
  public abstract Bitmap getBitmap(String paramString);
  
  public static abstract class a
    extends Binder
    implements f
  {
    public a()
    {
      GMTrace.i(13636386947072L, 101599);
      attachInterface(this, "com.tencent.mm.cache.IMMCache_AIDL");
      GMTrace.o(13636386947072L, 101599);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13636521164800L, 101600);
      GMTrace.o(13636521164800L, 101600);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13636655382528L, 101601);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13636655382528L, 101601);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.cache.IMMCache_AIDL");
        GMTrace.o(13636655382528L, 101601);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
        dt(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(0);
        GMTrace.o(13636655382528L, 101601);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
        str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          MCacheItem.CREATOR.createFromParcel(paramParcel1);
        }
        du(str);
        paramParcel2.writeNoException();
        GMTrace.o(13636655382528L, 101601);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
        paramParcel1 = getBitmap(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(13636655382528L, 101601);
          return true;
          paramParcel2.writeInt(0);
        }
      }
      paramParcel1.enforceInterface("com.tencent.mm.cache.IMMCache_AIDL");
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(str, paramParcel1);
        paramParcel2.writeNoException();
        GMTrace.o(13636655382528L, 101601);
        return true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\cache\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */