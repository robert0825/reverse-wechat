package com.tencent.mm.plugin.webview.stub;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface c
  extends IInterface
{
  public abstract String En();
  
  public abstract int bDe();
  
  public abstract int bDf();
  
  public abstract Bundle getData();
  
  public abstract int getType();
  
  public static abstract class a
    extends Binder
    implements c
  {
    public a()
    {
      GMTrace.i(12463860875264L, 92863);
      attachInterface(this, "com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      GMTrace.o(12463860875264L, 92863);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(12463995092992L, 92864);
      GMTrace.o(12463995092992L, 92864);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(12464129310720L, 92865);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(12464129310720L, 92865);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        GMTrace.o(12464129310720L, 92865);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        paramInt1 = getType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12464129310720L, 92865);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        paramInt1 = bDe();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12464129310720L, 92865);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        paramInt1 = bDf();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12464129310720L, 92865);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        paramParcel1 = En();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12464129310720L, 92865);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
      paramParcel1 = getData();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        GMTrace.o(12464129310720L, 92865);
        return true;
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements c
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(12429366919168L, 92606);
        this.mRemote = paramIBinder;
        GMTrace.o(12429366919168L, 92606);
      }
      
      public final String En()
      {
        GMTrace.i(12430038007808L, 92611);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12430038007808L, 92611);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12429501136896L, 92607);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(12429501136896L, 92607);
        return localIBinder;
      }
      
      public final int bDe()
      {
        GMTrace.i(12429769572352L, 92609);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12429769572352L, 92609);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int bDf()
      {
        GMTrace.i(12429903790080L, 92610);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12429903790080L, 92610);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final Bundle getData()
      {
        // Byte code:
        //   0: ldc2_w 83
        //   3: ldc 85
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_0
        //   23: getfield 27	com/tencent/mm/plugin/webview/stub/c$a$a:mRemote	Landroid/os/IBinder;
        //   26: iconst_5
        //   27: aload_2
        //   28: aload_3
        //   29: iconst_0
        //   30: invokeinterface 54 5 0
        //   35: pop
        //   36: aload_3
        //   37: invokevirtual 57	android/os/Parcel:readException	()V
        //   40: aload_3
        //   41: invokevirtual 76	android/os/Parcel:readInt	()I
        //   44: ifeq +34 -> 78
        //   47: getstatic 91	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
        //   50: aload_3
        //   51: invokeinterface 97 2 0
        //   56: checkcast 87	android/os/Bundle
        //   59: astore_1
        //   60: aload_3
        //   61: invokevirtual 63	android/os/Parcel:recycle	()V
        //   64: aload_2
        //   65: invokevirtual 63	android/os/Parcel:recycle	()V
        //   68: ldc2_w 83
        //   71: ldc 85
        //   73: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   76: aload_1
        //   77: areturn
        //   78: aconst_null
        //   79: astore_1
        //   80: goto -20 -> 60
        //   83: astore_1
        //   84: aload_3
        //   85: invokevirtual 63	android/os/Parcel:recycle	()V
        //   88: aload_2
        //   89: invokevirtual 63	android/os/Parcel:recycle	()V
        //   92: aload_1
        //   93: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	94	0	this	a
        //   59	21	1	localBundle	Bundle
        //   83	10	1	localObject	Object
        //   11	78	2	localParcel1	Parcel
        //   15	70	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	60	83	finally
      }
      
      public final int getType()
      {
        GMTrace.i(12429635354624L, 92608);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12429635354624L, 92608);
          return i;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */