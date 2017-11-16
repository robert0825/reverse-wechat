package com.tencent.mm.ipcinvoker.b;

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
  public abstract void k(Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(18698408558592L, 139314);
      attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
      GMTrace.o(18698408558592L, 139314);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(18698542776320L, 139315);
      GMTrace.o(18698542776320L, 139315);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(18698676994048L, 139316);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(18698676994048L, 139316);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
        GMTrace.o(18698676994048L, 139316);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        k(paramParcel1);
        paramParcel2.writeNoException();
        GMTrace.o(18698676994048L, 139316);
        return true;
      }
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(18700153389056L, 139327);
        this.mRemote = paramIBinder;
        GMTrace.o(18700153389056L, 139327);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(18700287606784L, 139328);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(18700287606784L, 139328);
        return localIBinder;
      }
      
      /* Error */
      public final void k(Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 39
        //   3: ldc 41
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 49
        //   19: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +49 -> 72
        //   26: aload_2
        //   27: iconst_1
        //   28: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   31: aload_1
        //   32: aload_2
        //   33: iconst_0
        //   34: invokevirtual 63	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/ipcinvoker/b/b$a$a:mRemote	Landroid/os/IBinder;
        //   41: iconst_1
        //   42: aload_2
        //   43: aload_3
        //   44: iconst_0
        //   45: invokeinterface 69 5 0
        //   50: pop
        //   51: aload_3
        //   52: invokevirtual 72	android/os/Parcel:readException	()V
        //   55: aload_3
        //   56: invokevirtual 75	android/os/Parcel:recycle	()V
        //   59: aload_2
        //   60: invokevirtual 75	android/os/Parcel:recycle	()V
        //   63: ldc2_w 39
        //   66: ldc 41
        //   68: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   71: return
        //   72: aload_2
        //   73: iconst_0
        //   74: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   77: goto -40 -> 37
        //   80: astore_1
        //   81: aload_3
        //   82: invokevirtual 75	android/os/Parcel:recycle	()V
        //   85: aload_2
        //   86: invokevirtual 75	android/os/Parcel:recycle	()V
        //   89: aload_1
        //   90: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	91	0	this	a
        //   0	91	1	paramBundle	Bundle
        //   11	75	2	localParcel1	Parcel
        //   15	67	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	80	finally
        //   26	37	80	finally
        //   37	55	80	finally
        //   72	77	80	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */