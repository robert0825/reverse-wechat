package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.g;
import com.tencent.mm.protocal.g.a;
import com.tencent.mm.protocal.h;
import com.tencent.mm.protocal.h.a;

public abstract interface r
  extends IInterface
{
  public abstract boolean DD();
  
  public abstract int DI();
  
  public abstract int Dz();
  
  public abstract g Ej();
  
  public abstract h Ek();
  
  public abstract int El();
  
  public abstract void a(d paramd, j paramj, int paramInt1, int paramInt2);
  
  public abstract void a(j paramj, int paramInt1, int paramInt2);
  
  public abstract void a(j paramj, int paramInt1, int paramInt2, String paramString);
  
  public abstract int getType();
  
  public abstract String getUri();
  
  public abstract void in(String paramString);
  
  public static abstract class a
    extends Binder
    implements r
  {
    public a()
    {
      GMTrace.i(13677189136384L, 101903);
      attachInterface(this, "com.tencent.mm.network.IReqResp_AIDL");
      GMTrace.o(13677189136384L, 101903);
    }
    
    public static r F(IBinder paramIBinder)
    {
      GMTrace.i(13677323354112L, 101904);
      if (paramIBinder == null)
      {
        GMTrace.o(13677323354112L, 101904);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IReqResp_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof r)))
      {
        paramIBinder = (r)localIInterface;
        GMTrace.o(13677323354112L, 101904);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(13677323354112L, 101904);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13677457571840L, 101905);
      GMTrace.o(13677457571840L, 101905);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      h localh = null;
      g localg = null;
      GMTrace.i(13677591789568L, 101906);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13677591789568L, 101906);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IReqResp_AIDL");
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = getType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramParcel1 = getUri();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        localh = Ek();
        paramParcel2.writeNoException();
        paramParcel1 = localg;
        if (localh != null) {
          paramParcel1 = localh.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        localg = Ej();
        paramParcel2.writeNoException();
        paramParcel1 = localh;
        if (localg != null) {
          paramParcel1 = localg.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        a(j.a.D(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = DI();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        bool = DD();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(13677591789568L, 101906);
          return true;
        }
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        paramInt1 = Dz();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        in(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        a(j.a.D(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13677591789568L, 101906);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
        a(d.a.A(paramParcel1.readStrongBinder()), j.a.D(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13677591789568L, 101906);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IReqResp_AIDL");
      paramInt1 = El();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      GMTrace.o(13677591789568L, 101906);
      return true;
    }
    
    private static final class a
      implements r
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13678531313664L, 101913);
        this.mRemote = paramIBinder;
        GMTrace.o(13678531313664L, 101913);
      }
      
      public final boolean DD()
      {
        boolean bool = false;
        GMTrace.i(13679605055488L, 101921);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13679605055488L, 101921);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int DI()
      {
        GMTrace.i(13679470837760L, 101920);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13679470837760L, 101920);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Dz()
      {
        GMTrace.i(13679739273216L, 101922);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13679739273216L, 101922);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final g Ej()
      {
        GMTrace.i(13679202402304L, 101918);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          g localg = g.a.aa(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13679202402304L, 101918);
          return localg;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final h Ek()
      {
        GMTrace.i(13679068184576L, 101917);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          h localh = h.a.ab(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13679068184576L, 101917);
          return localh;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int El()
      {
        GMTrace.i(13680276144128L, 101926);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13680276144128L, 101926);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void a(d paramd, j paramj, int paramInt1, int paramInt2)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 5
        //   3: ldc2_w 104
        //   6: ldc 106
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 6
        //   16: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 7
        //   21: aload 6
        //   23: ldc 44
        //   25: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload_1
        //   29: ifnull +90 -> 119
        //   32: aload_1
        //   33: invokeinterface 111 1 0
        //   38: astore_1
        //   39: aload 6
        //   41: aload_1
        //   42: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   45: aload 5
        //   47: astore_1
        //   48: aload_2
        //   49: ifnull +10 -> 59
        //   52: aload_2
        //   53: invokeinterface 117 1 0
        //   58: astore_1
        //   59: aload 6
        //   61: aload_1
        //   62: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   65: aload 6
        //   67: iload_3
        //   68: invokevirtual 121	android/os/Parcel:writeInt	(I)V
        //   71: aload 6
        //   73: iload 4
        //   75: invokevirtual 121	android/os/Parcel:writeInt	(I)V
        //   78: aload_0
        //   79: getfield 27	com/tencent/mm/network/r$a$a:mRemote	Landroid/os/IBinder;
        //   82: bipush 11
        //   84: aload 6
        //   86: aload 7
        //   88: iconst_0
        //   89: invokeinterface 54 5 0
        //   94: pop
        //   95: aload 7
        //   97: invokevirtual 57	android/os/Parcel:readException	()V
        //   100: aload 7
        //   102: invokevirtual 64	android/os/Parcel:recycle	()V
        //   105: aload 6
        //   107: invokevirtual 64	android/os/Parcel:recycle	()V
        //   110: ldc2_w 104
        //   113: ldc 106
        //   115: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   118: return
        //   119: aconst_null
        //   120: astore_1
        //   121: goto -82 -> 39
        //   124: astore_1
        //   125: aload 7
        //   127: invokevirtual 64	android/os/Parcel:recycle	()V
        //   130: aload 6
        //   132: invokevirtual 64	android/os/Parcel:recycle	()V
        //   135: aload_1
        //   136: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	137	0	this	a
        //   0	137	1	paramd	d
        //   0	137	2	paramj	j
        //   0	137	3	paramInt1	int
        //   0	137	4	paramInt2	int
        //   1	45	5	localObject	Object
        //   14	117	6	localParcel1	Parcel
        //   19	107	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	28	124	finally
        //   32	39	124	finally
        //   39	45	124	finally
        //   52	59	124	finally
        //   59	100	124	finally
      }
      
      /* Error */
      public final void a(j paramj, int paramInt1, int paramInt2)
      {
        // Byte code:
        //   0: ldc2_w 123
        //   3: ldc 125
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 4
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 5
        //   18: aload 4
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_1
        //   26: ifnull +68 -> 94
        //   29: aload_1
        //   30: invokeinterface 117 1 0
        //   35: astore_1
        //   36: aload 4
        //   38: aload_1
        //   39: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   42: aload 4
        //   44: iload_2
        //   45: invokevirtual 121	android/os/Parcel:writeInt	(I)V
        //   48: aload 4
        //   50: iload_3
        //   51: invokevirtual 121	android/os/Parcel:writeInt	(I)V
        //   54: aload_0
        //   55: getfield 27	com/tencent/mm/network/r$a$a:mRemote	Landroid/os/IBinder;
        //   58: iconst_5
        //   59: aload 4
        //   61: aload 5
        //   63: iconst_0
        //   64: invokeinterface 54 5 0
        //   69: pop
        //   70: aload 5
        //   72: invokevirtual 57	android/os/Parcel:readException	()V
        //   75: aload 5
        //   77: invokevirtual 64	android/os/Parcel:recycle	()V
        //   80: aload 4
        //   82: invokevirtual 64	android/os/Parcel:recycle	()V
        //   85: ldc2_w 123
        //   88: ldc 125
        //   90: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   93: return
        //   94: aconst_null
        //   95: astore_1
        //   96: goto -60 -> 36
        //   99: astore_1
        //   100: aload 5
        //   102: invokevirtual 64	android/os/Parcel:recycle	()V
        //   105: aload 4
        //   107: invokevirtual 64	android/os/Parcel:recycle	()V
        //   110: aload_1
        //   111: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	112	0	this	a
        //   0	112	1	paramj	j
        //   0	112	2	paramInt1	int
        //   0	112	3	paramInt2	int
        //   11	95	4	localParcel1	Parcel
        //   16	85	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	25	99	finally
        //   29	36	99	finally
        //   36	75	99	finally
      }
      
      /* Error */
      public final void a(j paramj, int paramInt1, int paramInt2, String paramString)
      {
        // Byte code:
        //   0: ldc2_w 127
        //   3: ldc -127
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 5
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 6
        //   18: aload 5
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_1
        //   26: ifnull +76 -> 102
        //   29: aload_1
        //   30: invokeinterface 117 1 0
        //   35: astore_1
        //   36: aload 5
        //   38: aload_1
        //   39: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   42: aload 5
        //   44: iload_2
        //   45: invokevirtual 121	android/os/Parcel:writeInt	(I)V
        //   48: aload 5
        //   50: iload_3
        //   51: invokevirtual 121	android/os/Parcel:writeInt	(I)V
        //   54: aload 5
        //   56: aload 4
        //   58: invokevirtual 132	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   61: aload_0
        //   62: getfield 27	com/tencent/mm/network/r$a$a:mRemote	Landroid/os/IBinder;
        //   65: bipush 10
        //   67: aload 5
        //   69: aload 6
        //   71: iconst_0
        //   72: invokeinterface 54 5 0
        //   77: pop
        //   78: aload 6
        //   80: invokevirtual 57	android/os/Parcel:readException	()V
        //   83: aload 6
        //   85: invokevirtual 64	android/os/Parcel:recycle	()V
        //   88: aload 5
        //   90: invokevirtual 64	android/os/Parcel:recycle	()V
        //   93: ldc2_w 127
        //   96: ldc -127
        //   98: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   101: return
        //   102: aconst_null
        //   103: astore_1
        //   104: goto -68 -> 36
        //   107: astore_1
        //   108: aload 6
        //   110: invokevirtual 64	android/os/Parcel:recycle	()V
        //   113: aload 5
        //   115: invokevirtual 64	android/os/Parcel:recycle	()V
        //   118: aload_1
        //   119: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	120	0	this	a
        //   0	120	1	paramj	j
        //   0	120	2	paramInt1	int
        //   0	120	3	paramInt2	int
        //   0	120	4	paramString	String
        //   11	103	5	localParcel1	Parcel
        //   16	93	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	25	107	finally
        //   29	36	107	finally
        //   36	83	107	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13678665531392L, 101914);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13678665531392L, 101914);
        return localIBinder;
      }
      
      public final int getType()
      {
        GMTrace.i(13678799749120L, 101915);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13678799749120L, 101915);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getUri()
      {
        GMTrace.i(13678933966848L, 101916);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13678933966848L, 101916);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void in(String paramString)
      {
        GMTrace.i(13679873490944L, 101923);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IReqResp_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13679873490944L, 101923);
          return;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */