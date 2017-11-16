package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface s
  extends IInterface
{
  public abstract boolean pb();
  
  public static abstract class a
    extends Binder
    implements s
  {
    public a()
    {
      GMTrace.i(13702556286976L, 102092);
      attachInterface(this, "com.tencent.mm.network.IWorkerCallback_AIDL");
      GMTrace.o(13702556286976L, 102092);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13702690504704L, 102093);
      GMTrace.o(13702690504704L, 102093);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13702824722432L, 102094);
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13702824722432L, 102094);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IWorkerCallback_AIDL");
        GMTrace.o(13702824722432L, 102094);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
      boolean bool = pb();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13702824722432L, 102094);
        return true;
      }
    }
    
    private static final class a
      implements s
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13711817310208L, 102161);
        this.mRemote = paramIBinder;
        GMTrace.o(13711817310208L, 102161);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13711951527936L, 102162);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13711951527936L, 102162);
        return localIBinder;
      }
      
      /* Error */
      public final boolean pb()
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_2
        //   2: ldc2_w 39
        //   5: ldc 41
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore_3
        //   14: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   17: astore 4
        //   19: aload_3
        //   20: ldc 49
        //   22: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_0
        //   26: getfield 27	com/tencent/mm/network/s$a$a:mRemote	Landroid/os/IBinder;
        //   29: iconst_1
        //   30: aload_3
        //   31: aload 4
        //   33: iconst_0
        //   34: invokeinterface 59 5 0
        //   39: pop
        //   40: aload 4
        //   42: invokevirtual 62	android/os/Parcel:readException	()V
        //   45: aload 4
        //   47: invokevirtual 66	android/os/Parcel:readInt	()I
        //   50: istore_1
        //   51: iload_1
        //   52: ifeq +22 -> 74
        //   55: aload 4
        //   57: invokevirtual 69	android/os/Parcel:recycle	()V
        //   60: aload_3
        //   61: invokevirtual 69	android/os/Parcel:recycle	()V
        //   64: ldc2_w 39
        //   67: ldc 41
        //   69: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: iload_2
        //   73: ireturn
        //   74: iconst_0
        //   75: istore_2
        //   76: goto -21 -> 55
        //   79: astore 5
        //   81: aload 4
        //   83: invokevirtual 69	android/os/Parcel:recycle	()V
        //   86: aload_3
        //   87: invokevirtual 69	android/os/Parcel:recycle	()V
        //   90: aload 5
        //   92: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	93	0	this	a
        //   50	2	1	i	int
        //   1	75	2	bool	boolean
        //   13	74	3	localParcel1	Parcel
        //   17	65	4	localParcel2	Parcel
        //   79	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   19	51	79	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */