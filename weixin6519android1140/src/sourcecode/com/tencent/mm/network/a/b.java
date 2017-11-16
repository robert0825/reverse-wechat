package com.tencent.mm.network.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface b
  extends IInterface
{
  public abstract void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean);
  
  public abstract void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(13661888315392L, 101789);
      attachInterface(this, "com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
      GMTrace.o(13661888315392L, 101789);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13662022533120L, 101790);
      GMTrace.o(13662022533120L, 101790);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13662156750848L, 101791);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13662156750848L, 101791);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        GMTrace.o(13662156750848L, 101791);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        String str1 = paramParcel1.readString();
        int i = paramParcel1.readInt();
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          a(paramInt1, paramInt2, str1, i, str2, bool);
          paramParcel2.writeNoException();
          GMTrace.o(13662156750848L, 101791);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
      h(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      GMTrace.o(13662156750848L, 101791);
      return true;
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      public a(IBinder paramIBinder)
      {
        GMTrace.i(13661351444480L, 101785);
        this.mRemote = paramIBinder;
        GMTrace.o(13661351444480L, 101785);
      }
      
      /* Error */
      public final void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 7
        //   3: ldc2_w 33
        //   6: ldc 35
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 8
        //   16: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 9
        //   21: aload 8
        //   23: ldc 43
        //   25: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 8
        //   30: iload_1
        //   31: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   34: aload 8
        //   36: iload_2
        //   37: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   40: aload 8
        //   42: aload_3
        //   43: invokevirtual 54	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload 8
        //   48: iload 4
        //   50: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   53: aload 8
        //   55: aload 5
        //   57: invokevirtual 54	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   60: iload 6
        //   62: ifeq +52 -> 114
        //   65: iload 7
        //   67: istore_1
        //   68: aload 8
        //   70: iload_1
        //   71: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   74: aload_0
        //   75: getfield 27	com/tencent/mm/network/a/b$a$a:mRemote	Landroid/os/IBinder;
        //   78: iconst_1
        //   79: aload 8
        //   81: aload 9
        //   83: iconst_0
        //   84: invokeinterface 60 5 0
        //   89: pop
        //   90: aload 9
        //   92: invokevirtual 63	android/os/Parcel:readException	()V
        //   95: aload 9
        //   97: invokevirtual 66	android/os/Parcel:recycle	()V
        //   100: aload 8
        //   102: invokevirtual 66	android/os/Parcel:recycle	()V
        //   105: ldc2_w 33
        //   108: ldc 35
        //   110: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   113: return
        //   114: iconst_0
        //   115: istore_1
        //   116: goto -48 -> 68
        //   119: astore_3
        //   120: aload 9
        //   122: invokevirtual 66	android/os/Parcel:recycle	()V
        //   125: aload 8
        //   127: invokevirtual 66	android/os/Parcel:recycle	()V
        //   130: aload_3
        //   131: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	132	0	this	a
        //   0	132	1	paramInt1	int
        //   0	132	2	paramInt2	int
        //   0	132	3	paramString1	String
        //   0	132	4	paramInt3	int
        //   0	132	5	paramString2	String
        //   0	132	6	paramBoolean	boolean
        //   1	65	7	i	int
        //   14	112	8	localParcel1	Parcel
        //   19	102	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	60	119	finally
        //   68	95	119	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13661485662208L, 101786);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13661485662208L, 101786);
        return localIBinder;
      }
      
      public final void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        GMTrace.i(13661754097664L, 101788);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeInt(paramInt4);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13661754097664L, 101788);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */