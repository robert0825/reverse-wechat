package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface l
  extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements l
  {
    public a()
    {
      GMTrace.i(13660411920384L, 101778);
      attachInterface(this, "com.tencent.mm.network.IOnGYNetEnd_AIDL");
      GMTrace.o(13660411920384L, 101778);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13660546138112L, 101779);
      GMTrace.o(13660546138112L, 101779);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13660680355840L, 101780);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13660680355840L, 101780);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IOnGYNetEnd_AIDL");
        GMTrace.o(13660680355840L, 101780);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
      a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), r.a.F(paramParcel1.readStrongBinder()), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      GMTrace.o(13660680355840L, 101780);
      return true;
    }
    
    private static final class a
      implements l
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13691818868736L, 102012);
        this.mRemote = paramIBinder;
        GMTrace.o(13691818868736L, 102012);
      }
      
      /* Error */
      public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte)
      {
        // Byte code:
        //   0: ldc2_w 33
        //   3: ldc 35
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 8
        //   18: aload 7
        //   20: ldc 43
        //   22: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload 7
        //   27: iload_1
        //   28: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   31: aload 7
        //   33: iload_2
        //   34: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   37: aload 7
        //   39: iload_3
        //   40: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   43: aload 7
        //   45: aload 4
        //   47: invokevirtual 54	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   50: aload 5
        //   52: ifnull +66 -> 118
        //   55: aload 5
        //   57: invokeinterface 60 1 0
        //   62: astore 4
        //   64: aload 7
        //   66: aload 4
        //   68: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   71: aload 7
        //   73: aload 6
        //   75: invokevirtual 67	android/os/Parcel:writeByteArray	([B)V
        //   78: aload_0
        //   79: getfield 27	com/tencent/mm/network/l$a$a:mRemote	Landroid/os/IBinder;
        //   82: iconst_1
        //   83: aload 7
        //   85: aload 8
        //   87: iconst_0
        //   88: invokeinterface 73 5 0
        //   93: pop
        //   94: aload 8
        //   96: invokevirtual 76	android/os/Parcel:readException	()V
        //   99: aload 8
        //   101: invokevirtual 79	android/os/Parcel:recycle	()V
        //   104: aload 7
        //   106: invokevirtual 79	android/os/Parcel:recycle	()V
        //   109: ldc2_w 33
        //   112: ldc 35
        //   114: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   117: return
        //   118: aconst_null
        //   119: astore 4
        //   121: goto -57 -> 64
        //   124: astore 4
        //   126: aload 8
        //   128: invokevirtual 79	android/os/Parcel:recycle	()V
        //   131: aload 7
        //   133: invokevirtual 79	android/os/Parcel:recycle	()V
        //   136: aload 4
        //   138: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	139	0	this	a
        //   0	139	1	paramInt1	int
        //   0	139	2	paramInt2	int
        //   0	139	3	paramInt3	int
        //   0	139	4	paramString	String
        //   0	139	5	paramr	r
        //   0	139	6	paramArrayOfByte	byte[]
        //   11	121	7	localParcel1	Parcel
        //   16	111	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	50	124	finally
        //   55	64	124	finally
        //   64	99	124	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13691953086464L, 102013);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13691953086464L, 102013);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */