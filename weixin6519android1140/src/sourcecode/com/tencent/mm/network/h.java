package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface h
  extends IInterface
{
  public abstract void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString);
  
  public static abstract class a
    extends Binder
    implements h
  {
    public a()
    {
      GMTrace.i(21015677632512L, 156579);
      attachInterface(this, "com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
      GMTrace.o(21015677632512L, 156579);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(21015811850240L, 156580);
      GMTrace.o(21015811850240L, 156580);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(21015946067968L, 156581);
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(21015946067968L, 156581);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
        GMTrace.o(21015946067968L, 156581);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        networkAnalysisCallBack(paramInt1, paramInt2, bool, paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(21015946067968L, 156581);
        return true;
      }
    }
    
    private static final class a
      implements h
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(21016080285696L, 156582);
        this.mRemote = paramIBinder;
        GMTrace.o(21016080285696L, 156582);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(21016214503424L, 156583);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(21016214503424L, 156583);
        return localIBinder;
      }
      
      /* Error */
      public final void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: ldc2_w 39
        //   6: ldc 41
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 6
        //   16: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 7
        //   21: aload 6
        //   23: ldc 49
        //   25: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 6
        //   30: iload_1
        //   31: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   34: aload 6
        //   36: iload_2
        //   37: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   40: iload_3
        //   41: ifeq +59 -> 100
        //   44: iload 5
        //   46: istore_1
        //   47: aload 6
        //   49: iload_1
        //   50: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   53: aload 6
        //   55: aload 4
        //   57: invokevirtual 60	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   60: aload_0
        //   61: getfield 27	com/tencent/mm/network/h$a$a:mRemote	Landroid/os/IBinder;
        //   64: iconst_1
        //   65: aload 6
        //   67: aload 7
        //   69: iconst_0
        //   70: invokeinterface 66 5 0
        //   75: pop
        //   76: aload 7
        //   78: invokevirtual 69	android/os/Parcel:readException	()V
        //   81: aload 7
        //   83: invokevirtual 72	android/os/Parcel:recycle	()V
        //   86: aload 6
        //   88: invokevirtual 72	android/os/Parcel:recycle	()V
        //   91: ldc2_w 39
        //   94: ldc 41
        //   96: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   99: return
        //   100: iconst_0
        //   101: istore_1
        //   102: goto -55 -> 47
        //   105: astore 4
        //   107: aload 7
        //   109: invokevirtual 72	android/os/Parcel:recycle	()V
        //   112: aload 6
        //   114: invokevirtual 72	android/os/Parcel:recycle	()V
        //   117: aload 4
        //   119: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	120	0	this	a
        //   0	120	1	paramInt1	int
        //   0	120	2	paramInt2	int
        //   0	120	3	paramBoolean	boolean
        //   0	120	4	paramString	String
        //   1	44	5	i	int
        //   14	99	6	localParcel1	Parcel
        //   19	89	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	40	105	finally
        //   47	81	105	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */