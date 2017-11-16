package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface i
  extends IInterface
{
  public abstract int OC();
  
  public abstract void OD();
  
  public abstract long OE();
  
  public abstract boolean c(n paramn);
  
  public abstract boolean d(n paramn);
  
  public static abstract class a
    extends Binder
    implements i
  {
    public a()
    {
      GMTrace.i(13692758392832L, 102019);
      attachInterface(this, "com.tencent.mm.network.INetworkEvent_AIDL");
      GMTrace.o(13692758392832L, 102019);
    }
    
    public static i C(IBinder paramIBinder)
    {
      GMTrace.i(13692892610560L, 102020);
      if (paramIBinder == null)
      {
        GMTrace.o(13692892610560L, 102020);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.INetworkEvent_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof i)))
      {
        paramIBinder = (i)localIInterface;
        GMTrace.o(13692892610560L, 102020);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(13692892610560L, 102020);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13693026828288L, 102021);
      GMTrace.o(13693026828288L, 102021);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int j = 0;
      int i = 0;
      GMTrace.i(13693161046016L, 102022);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13693161046016L, 102022);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.INetworkEvent_AIDL");
        GMTrace.o(13693161046016L, 102022);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        paramInt1 = OC();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13693161046016L, 102022);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        bool = c(n.a.E(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13693161046016L, 102022);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        bool = d(n.a.E(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13693161046016L, 102022);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
        OD();
        paramParcel2.writeNoException();
        GMTrace.o(13693161046016L, 102022);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.INetworkEvent_AIDL");
      long l = OE();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      GMTrace.o(13693161046016L, 102022);
      return true;
    }
    
    private static final class a
      implements i
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13643366268928L, 101651);
        this.mRemote = paramIBinder;
        GMTrace.o(13643366268928L, 101651);
      }
      
      public final int OC()
      {
        GMTrace.i(13643634704384L, 101653);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13643634704384L, 101653);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void OD()
      {
        GMTrace.i(13644037357568L, 101656);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13644037357568L, 101656);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final long OE()
      {
        GMTrace.i(13644171575296L, 101657);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long l = localParcel2.readLong();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13644171575296L, 101657);
          return l;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13643500486656L, 101652);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13643500486656L, 101652);
        return localIBinder;
      }
      
      /* Error */
      public final boolean c(n paramn)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 83
        //   5: ldc 85
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 44
        //   24: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload_1
        //   28: ifnull +69 -> 97
        //   31: aload_1
        //   32: invokeinterface 89 1 0
        //   37: astore_1
        //   38: aload 4
        //   40: aload_1
        //   41: invokevirtual 92	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/network/i$a$a:mRemote	Landroid/os/IBinder;
        //   48: iconst_2
        //   49: aload 4
        //   51: aload 5
        //   53: iconst_0
        //   54: invokeinterface 54 5 0
        //   59: pop
        //   60: aload 5
        //   62: invokevirtual 57	android/os/Parcel:readException	()V
        //   65: aload 5
        //   67: invokevirtual 60	android/os/Parcel:readInt	()I
        //   70: istore_2
        //   71: iload_2
        //   72: ifeq +5 -> 77
        //   75: iconst_1
        //   76: istore_3
        //   77: aload 5
        //   79: invokevirtual 63	android/os/Parcel:recycle	()V
        //   82: aload 4
        //   84: invokevirtual 63	android/os/Parcel:recycle	()V
        //   87: ldc2_w 83
        //   90: ldc 85
        //   92: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   95: iload_3
        //   96: ireturn
        //   97: aconst_null
        //   98: astore_1
        //   99: goto -61 -> 38
        //   102: astore_1
        //   103: aload 5
        //   105: invokevirtual 63	android/os/Parcel:recycle	()V
        //   108: aload 4
        //   110: invokevirtual 63	android/os/Parcel:recycle	()V
        //   113: aload_1
        //   114: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	115	0	this	a
        //   0	115	1	paramn	n
        //   70	2	2	i	int
        //   1	95	3	bool	boolean
        //   13	96	4	localParcel1	Parcel
        //   18	86	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	27	102	finally
        //   31	38	102	finally
        //   38	71	102	finally
      }
      
      /* Error */
      public final boolean d(n paramn)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 94
        //   5: ldc 96
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 44
        //   24: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload_1
        //   28: ifnull +69 -> 97
        //   31: aload_1
        //   32: invokeinterface 89 1 0
        //   37: astore_1
        //   38: aload 4
        //   40: aload_1
        //   41: invokevirtual 92	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/network/i$a$a:mRemote	Landroid/os/IBinder;
        //   48: iconst_3
        //   49: aload 4
        //   51: aload 5
        //   53: iconst_0
        //   54: invokeinterface 54 5 0
        //   59: pop
        //   60: aload 5
        //   62: invokevirtual 57	android/os/Parcel:readException	()V
        //   65: aload 5
        //   67: invokevirtual 60	android/os/Parcel:readInt	()I
        //   70: istore_2
        //   71: iload_2
        //   72: ifeq +5 -> 77
        //   75: iconst_1
        //   76: istore_3
        //   77: aload 5
        //   79: invokevirtual 63	android/os/Parcel:recycle	()V
        //   82: aload 4
        //   84: invokevirtual 63	android/os/Parcel:recycle	()V
        //   87: ldc2_w 94
        //   90: ldc 96
        //   92: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   95: iload_3
        //   96: ireturn
        //   97: aconst_null
        //   98: astore_1
        //   99: goto -61 -> 38
        //   102: astore_1
        //   103: aload 5
        //   105: invokevirtual 63	android/os/Parcel:recycle	()V
        //   108: aload 4
        //   110: invokevirtual 63	android/os/Parcel:recycle	()V
        //   113: aload_1
        //   114: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	115	0	this	a
        //   0	115	1	paramn	n
        //   70	2	2	i	int
        //   1	95	3	bool	boolean
        //   13	96	4	localParcel1	Parcel
        //   18	86	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	27	102	finally
        //   31	38	102	finally
        //   38	71	102	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */