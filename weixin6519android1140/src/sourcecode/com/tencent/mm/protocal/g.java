package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface g
  extends IInterface
{
  public abstract void B(byte[] paramArrayOfByte);
  
  public abstract byte[] Ec();
  
  public abstract String Ed();
  
  public abstract String Ee();
  
  public abstract int Ef();
  
  public abstract byte[] Eg();
  
  public abstract String Eh();
  
  public abstract boolean Ei();
  
  public abstract boolean a(int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt2, boolean paramBoolean);
  
  public abstract void dp(int paramInt);
  
  public abstract void fK(int paramInt);
  
  public abstract void fL(int paramInt);
  
  public abstract int getClientVersion();
  
  public abstract int getCmdId();
  
  public abstract String getPassword();
  
  public abstract String getUserName();
  
  public abstract void il(String paramString);
  
  public abstract void im(String paramString);
  
  public abstract byte[] wR();
  
  public abstract int ww();
  
  public static abstract class a
    extends Binder
    implements g
  {
    public a()
    {
      GMTrace.i(13600148160512L, 101329);
      attachInterface(this, "com.tencent.mm.protocal.IMMBaseReq_AIDL");
      GMTrace.o(13600148160512L, 101329);
    }
    
    public static g aa(IBinder paramIBinder)
    {
      GMTrace.i(13600282378240L, 101330);
      if (paramIBinder == null)
      {
        GMTrace.o(13600282378240L, 101330);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof g)))
      {
        paramIBinder = (g)localIInterface;
        GMTrace.o(13600282378240L, 101330);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(13600282378240L, 101330);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13600416595968L, 101331);
      GMTrace.o(13600416595968L, 101331);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13600550813696L, 101332);
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13600550813696L, 101332);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = paramParcel1.readInt();
        byte[] arrayOfByte1 = paramParcel1.createByteArray();
        byte[] arrayOfByte2 = paramParcel1.createByteArray();
        byte[] arrayOfByte3 = paramParcel1.createByteArray();
        paramInt2 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool = true;
          bool = a(paramInt1, arrayOfByte1, arrayOfByte2, arrayOfByte3, paramInt2, bool);
          paramParcel2.writeNoException();
          if (!bool) {
            break label320;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(13600550813696L, 101332);
          return true;
          bool = false;
          break;
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Ec();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        B(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = wR();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        dp(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = ww();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        fK(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = getClientVersion();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        il(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Ed();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Ee();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        im(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        fL(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = Ef();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Eg();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 16: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = getUserName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 17: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = getPassword();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 18: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Eh();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      case 19: 
        label320:
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = getCmdId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
      boolean bool = Ei();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13600550813696L, 101332);
        return true;
      }
    }
    
    private static final class a
      implements g
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13596658499584L, 101303);
        this.mRemote = paramIBinder;
        GMTrace.o(13596658499584L, 101303);
      }
      
      public final void B(byte[] paramArrayOfByte)
      {
        GMTrace.i(13597195370496L, 101307);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597195370496L, 101307);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] Ec()
      {
        GMTrace.i(13597061152768L, 101306);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597061152768L, 101306);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Ed()
      {
        GMTrace.i(13598134894592L, 101314);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598134894592L, 101314);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Ee()
      {
        GMTrace.i(13598269112320L, 101315);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598269112320L, 101315);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Ef()
      {
        GMTrace.i(13598671765504L, 101318);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598671765504L, 101318);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] Eg()
      {
        GMTrace.i(13598805983232L, 101319);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598805983232L, 101319);
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Eh()
      {
        GMTrace.i(13599208636416L, 101322);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13599208636416L, 101322);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean Ei()
      {
        boolean bool = false;
        GMTrace.i(13599477071872L, 101324);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13599477071872L, 101324);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean a(int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt2, boolean paramBoolean)
      {
        // Byte code:
        //   0: ldc2_w 106
        //   3: ldc 108
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 8
        //   18: aload 7
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload 7
        //   27: iload_1
        //   28: invokevirtual 112	android/os/Parcel:writeInt	(I)V
        //   31: aload 7
        //   33: aload_2
        //   34: invokevirtual 51	android/os/Parcel:writeByteArray	([B)V
        //   37: aload 7
        //   39: aload_3
        //   40: invokevirtual 51	android/os/Parcel:writeByteArray	([B)V
        //   43: aload 7
        //   45: aload 4
        //   47: invokevirtual 51	android/os/Parcel:writeByteArray	([B)V
        //   50: aload 7
        //   52: iload 5
        //   54: invokevirtual 112	android/os/Parcel:writeInt	(I)V
        //   57: iload 6
        //   59: ifeq +66 -> 125
        //   62: iconst_1
        //   63: istore_1
        //   64: aload 7
        //   66: iload_1
        //   67: invokevirtual 112	android/os/Parcel:writeInt	(I)V
        //   70: aload_0
        //   71: getfield 27	com/tencent/mm/protocal/g$a$a:mRemote	Landroid/os/IBinder;
        //   74: iconst_1
        //   75: aload 7
        //   77: aload 8
        //   79: iconst_0
        //   80: invokeinterface 57 5 0
        //   85: pop
        //   86: aload 8
        //   88: invokevirtual 60	android/os/Parcel:readException	()V
        //   91: aload 8
        //   93: invokevirtual 91	android/os/Parcel:readInt	()I
        //   96: istore_1
        //   97: iload_1
        //   98: ifeq +32 -> 130
        //   101: iconst_1
        //   102: istore 6
        //   104: aload 8
        //   106: invokevirtual 63	android/os/Parcel:recycle	()V
        //   109: aload 7
        //   111: invokevirtual 63	android/os/Parcel:recycle	()V
        //   114: ldc2_w 106
        //   117: ldc 108
        //   119: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   122: iload 6
        //   124: ireturn
        //   125: iconst_0
        //   126: istore_1
        //   127: goto -63 -> 64
        //   130: iconst_0
        //   131: istore 6
        //   133: goto -29 -> 104
        //   136: astore_2
        //   137: aload 8
        //   139: invokevirtual 63	android/os/Parcel:recycle	()V
        //   142: aload 7
        //   144: invokevirtual 63	android/os/Parcel:recycle	()V
        //   147: aload_2
        //   148: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	149	0	this	a
        //   0	149	1	paramInt1	int
        //   0	149	2	paramArrayOfByte1	byte[]
        //   0	149	3	paramArrayOfByte2	byte[]
        //   0	149	4	paramArrayOfByte3	byte[]
        //   0	149	5	paramInt2	int
        //   0	149	6	paramBoolean	boolean
        //   11	132	7	localParcel1	Parcel
        //   16	122	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	57	136	finally
        //   64	97	136	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13596792717312L, 101304);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13596792717312L, 101304);
        return localIBinder;
      }
      
      public final void dp(int paramInt)
      {
        GMTrace.i(13597463805952L, 101309);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597463805952L, 101309);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void fK(int paramInt)
      {
        GMTrace.i(13597732241408L, 101311);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597732241408L, 101311);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void fL(int paramInt)
      {
        GMTrace.i(13598537547776L, 101317);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598537547776L, 101317);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getClientVersion()
      {
        GMTrace.i(13597866459136L, 101312);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597866459136L, 101312);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getCmdId()
      {
        GMTrace.i(13599342854144L, 101323);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13599342854144L, 101323);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getPassword()
      {
        GMTrace.i(13599074418688L, 101321);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13599074418688L, 101321);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getUserName()
      {
        GMTrace.i(13598940200960L, 101320);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598940200960L, 101320);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void il(String paramString)
      {
        GMTrace.i(13598000676864L, 101313);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598000676864L, 101313);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void im(String paramString)
      {
        GMTrace.i(13598403330048L, 101316);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13598403330048L, 101316);
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
        GMTrace.i(13597329588224L, 101308);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597329588224L, 101308);
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
        GMTrace.i(13597598023680L, 101310);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13597598023680L, 101310);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */