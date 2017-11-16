package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface o
  extends IInterface
{
  public abstract void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2);
  
  public static abstract class a
    extends Binder
    implements o
  {
    public a()
    {
      GMTrace.i(13712219963392L, 102164);
      attachInterface(this, "com.tencent.mm.network.IOnReportKV_AIDL");
      GMTrace.o(13712219963392L, 102164);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13712354181120L, 102165);
      GMTrace.o(13712354181120L, 102165);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13712488398848L, 102166);
      boolean bool1;
      switch (paramInt1)
      {
      default: 
        bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13712488398848L, 102166);
        return bool1;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IOnReportKV_AIDL");
        GMTrace.o(13712488398848L, 102166);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IOnReportKV_AIDL");
      long l = paramParcel1.readLong();
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel1.readInt() == 0) {
          break label144;
        }
      }
      label144:
      for (boolean bool2 = true;; bool2 = false)
      {
        reportKV(l, str, bool1, bool2);
        paramParcel2.writeNoException();
        GMTrace.o(13712488398848L, 102166);
        return true;
        bool1 = false;
        break;
      }
    }
    
    private static final class a
      implements o
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13677726007296L, 101907);
        this.mRemote = paramIBinder;
        GMTrace.o(13677726007296L, 101907);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13677860225024L, 101908);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13677860225024L, 101908);
        return localIBinder;
      }
      
      /* Error */
      public final void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 7
        //   3: ldc2_w 39
        //   6: ldc 41
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 8
        //   16: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 9
        //   21: aload 8
        //   23: ldc 49
        //   25: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 8
        //   30: lload_1
        //   31: invokevirtual 57	android/os/Parcel:writeLong	(J)V
        //   34: aload 8
        //   36: aload_3
        //   37: invokevirtual 60	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: iload 4
        //   42: ifeq +69 -> 111
        //   45: iconst_1
        //   46: istore 6
        //   48: aload 8
        //   50: iload 6
        //   52: invokevirtual 64	android/os/Parcel:writeInt	(I)V
        //   55: iload 5
        //   57: ifeq +60 -> 117
        //   60: iload 7
        //   62: istore 6
        //   64: aload 8
        //   66: iload 6
        //   68: invokevirtual 64	android/os/Parcel:writeInt	(I)V
        //   71: aload_0
        //   72: getfield 27	com/tencent/mm/network/o$a$a:mRemote	Landroid/os/IBinder;
        //   75: iconst_1
        //   76: aload 8
        //   78: aload 9
        //   80: iconst_0
        //   81: invokeinterface 70 5 0
        //   86: pop
        //   87: aload 9
        //   89: invokevirtual 73	android/os/Parcel:readException	()V
        //   92: aload 9
        //   94: invokevirtual 76	android/os/Parcel:recycle	()V
        //   97: aload 8
        //   99: invokevirtual 76	android/os/Parcel:recycle	()V
        //   102: ldc2_w 39
        //   105: ldc 41
        //   107: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   110: return
        //   111: iconst_0
        //   112: istore 6
        //   114: goto -66 -> 48
        //   117: iconst_0
        //   118: istore 6
        //   120: goto -56 -> 64
        //   123: astore_3
        //   124: aload 9
        //   126: invokevirtual 76	android/os/Parcel:recycle	()V
        //   129: aload 8
        //   131: invokevirtual 76	android/os/Parcel:recycle	()V
        //   134: aload_3
        //   135: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	136	0	this	a
        //   0	136	1	paramLong	long
        //   0	136	3	paramString	String
        //   0	136	4	paramBoolean1	boolean
        //   0	136	5	paramBoolean2	boolean
        //   46	73	6	i	int
        //   1	60	7	j	int
        //   14	116	8	localParcel1	Parcel
        //   19	106	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	40	123	finally
        //   48	55	123	finally
        //   64	92	123	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */