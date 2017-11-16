package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface j
  extends IInterface
{
  public abstract void a(r paramr, int paramInt1, int paramInt2, String paramString);
  
  public static abstract class a
    extends Binder
    implements j
  {
    public a()
    {
      GMTrace.i(13663096274944L, 101798);
      attachInterface(this, "com.tencent.mm.network.IOnAutoAuth_AIDL");
      GMTrace.o(13663096274944L, 101798);
    }
    
    public static j D(IBinder paramIBinder)
    {
      GMTrace.i(13663230492672L, 101799);
      if (paramIBinder == null)
      {
        GMTrace.o(13663230492672L, 101799);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IOnAutoAuth_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof j)))
      {
        paramIBinder = (j)localIInterface;
        GMTrace.o(13663230492672L, 101799);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(13663230492672L, 101799);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13663364710400L, 101800);
      GMTrace.o(13663364710400L, 101800);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13663498928128L, 101801);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13663498928128L, 101801);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IOnAutoAuth_AIDL");
        GMTrace.o(13663498928128L, 101801);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IOnAutoAuth_AIDL");
      a(r.a.F(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      GMTrace.o(13663498928128L, 101801);
      return true;
    }
    
    private static final class a
      implements j
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13663901581312L, 101804);
        this.mRemote = paramIBinder;
        GMTrace.o(13663901581312L, 101804);
      }
      
      /* Error */
      public final void a(r paramr, int paramInt1, int paramInt2, String paramString)
      {
        // Byte code:
        //   0: ldc2_w 33
        //   3: ldc 35
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 5
        //   13: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 6
        //   18: aload 5
        //   20: ldc 43
        //   22: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_1
        //   26: ifnull +75 -> 101
        //   29: aload_1
        //   30: invokeinterface 53 1 0
        //   35: astore_1
        //   36: aload 5
        //   38: aload_1
        //   39: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   42: aload 5
        //   44: iload_2
        //   45: invokevirtual 60	android/os/Parcel:writeInt	(I)V
        //   48: aload 5
        //   50: iload_3
        //   51: invokevirtual 60	android/os/Parcel:writeInt	(I)V
        //   54: aload 5
        //   56: aload 4
        //   58: invokevirtual 63	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   61: aload_0
        //   62: getfield 27	com/tencent/mm/network/j$a$a:mRemote	Landroid/os/IBinder;
        //   65: iconst_1
        //   66: aload 5
        //   68: aload 6
        //   70: iconst_0
        //   71: invokeinterface 69 5 0
        //   76: pop
        //   77: aload 6
        //   79: invokevirtual 72	android/os/Parcel:readException	()V
        //   82: aload 6
        //   84: invokevirtual 75	android/os/Parcel:recycle	()V
        //   87: aload 5
        //   89: invokevirtual 75	android/os/Parcel:recycle	()V
        //   92: ldc2_w 33
        //   95: ldc 35
        //   97: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   100: return
        //   101: aconst_null
        //   102: astore_1
        //   103: goto -67 -> 36
        //   106: astore_1
        //   107: aload 6
        //   109: invokevirtual 75	android/os/Parcel:recycle	()V
        //   112: aload 5
        //   114: invokevirtual 75	android/os/Parcel:recycle	()V
        //   117: aload_1
        //   118: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	119	0	this	a
        //   0	119	1	paramr	r
        //   0	119	2	paramInt1	int
        //   0	119	3	paramInt2	int
        //   0	119	4	paramString	String
        //   11	102	5	localParcel1	Parcel
        //   16	92	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	25	106	finally
        //   29	36	106	finally
        //   36	82	106	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13664035799040L, 101805);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13664035799040L, 101805);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */