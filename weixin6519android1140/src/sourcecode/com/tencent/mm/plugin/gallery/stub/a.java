package com.tencent.mm.plugin.gallery.stub;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface a
  extends IInterface
{
  public abstract void Z(int paramInt, String paramString);
  
  public abstract void a(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2);
  
  public abstract void aDr();
  
  public abstract int aDs();
  
  public abstract boolean eK(boolean paramBoolean);
  
  public abstract int ua();
  
  public abstract int ub();
  
  public abstract int zh(String paramString);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      GMTrace.i(11973563514880L, 89210);
      attachInterface(this, "com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      GMTrace.o(11973563514880L, 89210);
    }
    
    public static a Q(IBinder paramIBinder)
    {
      GMTrace.i(11973697732608L, 89211);
      if (paramIBinder == null)
      {
        GMTrace.o(11973697732608L, 89211);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
      {
        paramIBinder = (a)localIInterface;
        GMTrace.o(11973697732608L, 89211);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11973697732608L, 89211);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11973831950336L, 89212);
      GMTrace.o(11973831950336L, 89212);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int i = 0;
      GMTrace.i(11973966168064L, 89213);
      boolean bool1;
      switch (paramInt1)
      {
      default: 
        bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11973966168064L, 89213);
        return bool1;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        GMTrace.o(11973966168064L, 89213);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        Z(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(11973966168064L, 89213);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        aDr();
        paramParcel2.writeNoException();
        GMTrace.o(11973966168064L, 89213);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        paramInt1 = aDs();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(11973966168064L, 89213);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        String str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          paramInt1 = paramParcel1.readInt();
          if (paramParcel1.readInt() == 0) {
            break label296;
          }
        }
        for (boolean bool2 = true;; bool2 = false)
        {
          a(str1, str2, bool1, paramInt1, bool2);
          paramParcel2.writeNoException();
          GMTrace.o(11973966168064L, 89213);
          return true;
          bool1 = false;
          break;
        }
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        paramInt1 = ub();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(11973966168064L, 89213);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        paramInt1 = ua();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(11973966168064L, 89213);
        return true;
      case 7: 
        label296:
        paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          bool1 = eK(bool1);
          paramParcel2.writeNoException();
          paramInt1 = i;
          if (bool1) {
            paramInt1 = 1;
          }
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11973966168064L, 89213);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
      paramInt1 = zh(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      GMTrace.o(11973966168064L, 89213);
      return true;
    }
    
    private static final class a
      implements a
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11972355555328L, 89201);
        this.mRemote = paramIBinder;
        GMTrace.o(11972355555328L, 89201);
      }
      
      public final void Z(int paramInt, String paramString)
      {
        GMTrace.i(11972623990784L, 89203);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11972623990784L, 89203);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void a(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 7
        //   3: ldc2_w 69
        //   6: ldc 71
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 8
        //   16: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 9
        //   21: aload 8
        //   23: ldc 44
        //   25: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 8
        //   30: aload_1
        //   31: invokevirtual 55	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   34: aload 8
        //   36: aload_2
        //   37: invokevirtual 55	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: iload_3
        //   41: ifeq +76 -> 117
        //   44: iconst_1
        //   45: istore 6
        //   47: aload 8
        //   49: iload 6
        //   51: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   54: aload 8
        //   56: iload 4
        //   58: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   61: iload 5
        //   63: ifeq +60 -> 123
        //   66: iload 7
        //   68: istore 4
        //   70: aload 8
        //   72: iload 4
        //   74: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   77: aload_0
        //   78: getfield 27	com/tencent/mm/plugin/gallery/stub/a$a$a:mRemote	Landroid/os/IBinder;
        //   81: iconst_4
        //   82: aload 8
        //   84: aload 9
        //   86: iconst_0
        //   87: invokeinterface 61 5 0
        //   92: pop
        //   93: aload 9
        //   95: invokevirtual 64	android/os/Parcel:readException	()V
        //   98: aload 9
        //   100: invokevirtual 67	android/os/Parcel:recycle	()V
        //   103: aload 8
        //   105: invokevirtual 67	android/os/Parcel:recycle	()V
        //   108: ldc2_w 69
        //   111: ldc 71
        //   113: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   116: return
        //   117: iconst_0
        //   118: istore 6
        //   120: goto -73 -> 47
        //   123: iconst_0
        //   124: istore 4
        //   126: goto -56 -> 70
        //   129: astore_1
        //   130: aload 9
        //   132: invokevirtual 67	android/os/Parcel:recycle	()V
        //   135: aload 8
        //   137: invokevirtual 67	android/os/Parcel:recycle	()V
        //   140: aload_1
        //   141: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	142	0	this	a
        //   0	142	1	paramString1	String
        //   0	142	2	paramString2	String
        //   0	142	3	paramBoolean1	boolean
        //   0	142	4	paramInt	int
        //   0	142	5	paramBoolean2	boolean
        //   45	74	6	i	int
        //   1	66	7	j	int
        //   14	122	8	localParcel1	Parcel
        //   19	112	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	40	129	finally
        //   47	61	129	finally
        //   70	98	129	finally
      }
      
      public final void aDr()
      {
        GMTrace.i(11972758208512L, 89204);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11972758208512L, 89204);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int aDs()
      {
        GMTrace.i(11972892426240L, 89205);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11972892426240L, 89205);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11972489773056L, 89202);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11972489773056L, 89202);
        return localIBinder;
      }
      
      /* Error */
      public final boolean eK(boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_3
        //   2: ldc2_w 91
        //   5: ldc 93
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 44
        //   24: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: iload_1
        //   28: ifeq +65 -> 93
        //   31: iconst_1
        //   32: istore_2
        //   33: aload 4
        //   35: iload_2
        //   36: invokevirtual 52	android/os/Parcel:writeInt	(I)V
        //   39: aload_0
        //   40: getfield 27	com/tencent/mm/plugin/gallery/stub/a$a$a:mRemote	Landroid/os/IBinder;
        //   43: bipush 7
        //   45: aload 4
        //   47: aload 5
        //   49: iconst_0
        //   50: invokeinterface 61 5 0
        //   55: pop
        //   56: aload 5
        //   58: invokevirtual 64	android/os/Parcel:readException	()V
        //   61: aload 5
        //   63: invokevirtual 83	android/os/Parcel:readInt	()I
        //   66: istore_2
        //   67: iload_2
        //   68: ifeq +30 -> 98
        //   71: iload_3
        //   72: istore_1
        //   73: aload 5
        //   75: invokevirtual 67	android/os/Parcel:recycle	()V
        //   78: aload 4
        //   80: invokevirtual 67	android/os/Parcel:recycle	()V
        //   83: ldc2_w 91
        //   86: ldc 93
        //   88: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   91: iload_1
        //   92: ireturn
        //   93: iconst_0
        //   94: istore_2
        //   95: goto -62 -> 33
        //   98: iconst_0
        //   99: istore_1
        //   100: goto -27 -> 73
        //   103: astore 6
        //   105: aload 5
        //   107: invokevirtual 67	android/os/Parcel:recycle	()V
        //   110: aload 4
        //   112: invokevirtual 67	android/os/Parcel:recycle	()V
        //   115: aload 6
        //   117: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	118	0	this	a
        //   0	118	1	paramBoolean	boolean
        //   32	63	2	i	int
        //   1	71	3	bool	boolean
        //   13	98	4	localParcel1	Parcel
        //   18	88	5	localParcel2	Parcel
        //   103	13	6	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   20	27	103	finally
        //   33	67	103	finally
      }
      
      public final int ua()
      {
        GMTrace.i(11973295079424L, 89208);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11973295079424L, 89208);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int ub()
      {
        GMTrace.i(11973160861696L, 89207);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11973160861696L, 89207);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int zh(String paramString)
      {
        GMTrace.i(15104594673664L, 112538);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(15104594673664L, 112538);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\stub\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */