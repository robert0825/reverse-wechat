package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface h
  extends IInterface
{
  public abstract byte[] DT();
  
  public abstract byte[] DV();
  
  public abstract int Em();
  
  public abstract String En();
  
  public abstract int Eo();
  
  public abstract byte[] Ep();
  
  public abstract String Eq();
  
  public abstract String Er();
  
  public abstract int Es();
  
  public abstract String Et();
  
  public abstract boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract void fM(int paramInt);
  
  public abstract int getCmdId();
  
  public abstract void io(String paramString);
  
  public abstract byte[] wR();
  
  public abstract int ww();
  
  public static abstract class a
    extends Binder
    implements h
  {
    public a()
    {
      GMTrace.i(13602429861888L, 101346);
      attachInterface(this, "com.tencent.mm.protocal.IMMBaseResp_AIDL");
      GMTrace.o(13602429861888L, 101346);
    }
    
    public static h ab(IBinder paramIBinder)
    {
      GMTrace.i(13602564079616L, 101347);
      if (paramIBinder == null)
      {
        GMTrace.o(13602564079616L, 101347);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof h)))
      {
        paramIBinder = (h)localIInterface;
        GMTrace.o(13602564079616L, 101347);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(13602564079616L, 101347);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13602698297344L, 101348);
      GMTrace.o(13602698297344L, 101348);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13602832515072L, 101349);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13602832515072L, 101349);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        bool = a(paramParcel1.readInt(), paramParcel1.createByteArray(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(13602832515072L, 101349);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = DT();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        fM(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = Eo();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = Em();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = En();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        io(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = wR();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = Ep();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = DV();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = ww();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = Et();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramInt1 = getCmdId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = Eq();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
        paramParcel1 = Er();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13602832515072L, 101349);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseResp_AIDL");
      paramInt1 = Es();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      GMTrace.o(13602832515072L, 101349);
      return true;
    }
    
    private static final class a
      implements h
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13569278083072L, 101099);
        this.mRemote = paramIBinder;
        GMTrace.o(13569278083072L, 101099);
      }
      
      public final byte[] DT()
      {
        GMTrace.i(13569680736256L, 101102);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13569680736256L, 101102);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] DV()
      {
        GMTrace.i(13570620260352L, 101109);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570620260352L, 101109);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Em()
      {
        GMTrace.i(20311302995968L, 151331);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20311302995968L, 151331);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String En()
      {
        GMTrace.i(13570083389440L, 101105);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570083389440L, 101105);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Eo()
      {
        GMTrace.i(13569949171712L, 101104);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13569949171712L, 101104);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] Ep()
      {
        GMTrace.i(13570486042624L, 101108);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570486042624L, 101108);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Eq()
      {
        GMTrace.i(13571157131264L, 101113);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13571157131264L, 101113);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Er()
      {
        GMTrace.i(13571291348992L, 101114);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13571291348992L, 101114);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Es()
      {
        GMTrace.i(13571425566720L, 101115);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13571425566720L, 101115);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Et()
      {
        GMTrace.i(13570888695808L, 101111);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570888695808L, 101111);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 4
        //   3: ldc2_w 109
        //   6: ldc 111
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 5
        //   16: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 6
        //   21: aload 5
        //   23: ldc 44
        //   25: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 5
        //   30: iload_1
        //   31: invokevirtual 115	android/os/Parcel:writeInt	(I)V
        //   34: aload 5
        //   36: aload_2
        //   37: invokevirtual 119	android/os/Parcel:writeByteArray	([B)V
        //   40: aload 5
        //   42: aload_3
        //   43: invokevirtual 119	android/os/Parcel:writeByteArray	([B)V
        //   46: aload_0
        //   47: getfield 27	com/tencent/mm/protocal/h$a$a:mRemote	Landroid/os/IBinder;
        //   50: iconst_1
        //   51: aload 5
        //   53: aload 6
        //   55: iconst_0
        //   56: invokeinterface 54 5 0
        //   61: pop
        //   62: aload 6
        //   64: invokevirtual 57	android/os/Parcel:readException	()V
        //   67: aload 6
        //   69: invokevirtual 75	android/os/Parcel:readInt	()I
        //   72: istore_1
        //   73: iload_1
        //   74: ifeq +24 -> 98
        //   77: aload 6
        //   79: invokevirtual 63	android/os/Parcel:recycle	()V
        //   82: aload 5
        //   84: invokevirtual 63	android/os/Parcel:recycle	()V
        //   87: ldc2_w 109
        //   90: ldc 111
        //   92: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   95: iload 4
        //   97: ireturn
        //   98: iconst_0
        //   99: istore 4
        //   101: goto -24 -> 77
        //   104: astore_2
        //   105: aload 6
        //   107: invokevirtual 63	android/os/Parcel:recycle	()V
        //   110: aload 5
        //   112: invokevirtual 63	android/os/Parcel:recycle	()V
        //   115: aload_2
        //   116: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	117	0	this	a
        //   0	117	1	paramInt	int
        //   0	117	2	paramArrayOfByte1	byte[]
        //   0	117	3	paramArrayOfByte2	byte[]
        //   1	99	4	bool	boolean
        //   14	97	5	localParcel1	Parcel
        //   19	87	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	73	104	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13569412300800L, 101100);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13569412300800L, 101100);
        return localIBinder;
      }
      
      public final void fM(int paramInt)
      {
        GMTrace.i(13569814953984L, 101103);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13569814953984L, 101103);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getCmdId()
      {
        GMTrace.i(13571022913536L, 101112);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13571022913536L, 101112);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void io(String paramString)
      {
        GMTrace.i(13570217607168L, 101106);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570217607168L, 101106);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] wR()
      {
        GMTrace.i(13570351824896L, 101107);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570351824896L, 101107);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int ww()
      {
        GMTrace.i(13570754478080L, 101110);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseResp_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13570754478080L, 101110);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */