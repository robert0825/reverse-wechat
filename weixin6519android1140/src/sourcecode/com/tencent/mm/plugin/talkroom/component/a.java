package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface a
  extends IInterface
{
  public abstract int Close();
  
  public abstract int SetCurrentMicId(int paramInt);
  
  public abstract int a(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt4);
  
  public abstract e a(c paramc);
  
  public abstract int brY();
  
  public abstract d brZ();
  
  public abstract byte[] d(int[] paramArrayOfInt, String paramString);
  
  public abstract int uninitLive();
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      GMTrace.i(5199326347264L, 38738);
      attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      GMTrace.o(5199326347264L, 38738);
    }
    
    public static a T(IBinder paramIBinder)
    {
      GMTrace.i(5199460564992L, 38739);
      if (paramIBinder == null)
      {
        GMTrace.o(5199460564992L, 38739);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
      {
        paramIBinder = (a)localIInterface;
        GMTrace.o(5199460564992L, 38739);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(5199460564992L, 38739);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(5199594782720L, 38740);
      GMTrace.o(5199594782720L, 38740);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(5199729000448L, 38741);
      Object localObject;
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(5199729000448L, 38741);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        GMTrace.o(5199729000448L, 38741);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = brY();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(5199729000448L, 38741);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = uninitLive();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(5199729000448L, 38741);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        localObject = paramParcel1.readStrongBinder();
        if (localObject == null) {
          localObject = null;
        }
        for (;;)
        {
          paramInt1 = a((b)localObject, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readLong(), paramParcel1.createIntArray(), paramParcel1.createIntArray(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(5199729000448L, 38741);
          return true;
          IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
          if ((localIInterface != null) && ((localIInterface instanceof b))) {
            localObject = (b)localIInterface;
          } else {
            localObject = new b.a.a((IBinder)localObject);
          }
        }
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = SetCurrentMicId(paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(5199729000448L, 38741);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = Close();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(5199729000448L, 38741);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramInt1 < 0) {}
        for (localObject = null;; localObject = new int[paramInt1])
        {
          paramParcel1 = d((int[])localObject, paramParcel1.readString());
          paramParcel2.writeNoException();
          paramParcel2.writeByteArray(paramParcel1);
          paramParcel2.writeIntArray((int[])localObject);
          GMTrace.o(5199729000448L, 38741);
          return true;
        }
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null)
        {
          paramParcel1 = null;
          paramParcel1 = a(paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label535;
          }
        }
        label535:
        for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
        {
          paramParcel2.writeStrongBinder(paramParcel1);
          GMTrace.o(5199729000448L, 38741);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
          if ((localObject != null) && ((localObject instanceof c)))
          {
            paramParcel1 = (c)localObject;
            break;
          }
          paramParcel1 = new c.a.a(paramParcel1);
          break;
        }
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
      paramParcel1 = brZ();
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        GMTrace.o(5199729000448L, 38741);
        return true;
      }
    }
    
    private static final class a
      implements a
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(5200802742272L, 38749);
        this.mRemote = paramIBinder;
        GMTrace.o(5200802742272L, 38749);
      }
      
      public final int Close()
      {
        GMTrace.i(5201608048640L, 38755);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5201608048640L, 38755);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int SetCurrentMicId(int paramInt)
      {
        GMTrace.i(5201473830912L, 38754);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5201473830912L, 38754);
          return paramInt;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final int a(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt4)
      {
        // Byte code:
        //   0: ldc2_w 74
        //   3: ldc 76
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 10
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 11
        //   18: aload 10
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_1
        //   26: ifnull +110 -> 136
        //   29: aload_1
        //   30: invokeinterface 82 1 0
        //   35: astore_1
        //   36: aload 10
        //   38: aload_1
        //   39: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   42: aload 10
        //   44: iload_2
        //   45: invokevirtual 72	android/os/Parcel:writeInt	(I)V
        //   48: aload 10
        //   50: iload_3
        //   51: invokevirtual 72	android/os/Parcel:writeInt	(I)V
        //   54: aload 10
        //   56: iload 4
        //   58: invokevirtual 72	android/os/Parcel:writeInt	(I)V
        //   61: aload 10
        //   63: lload 5
        //   65: invokevirtual 89	android/os/Parcel:writeLong	(J)V
        //   68: aload 10
        //   70: aload 7
        //   72: invokevirtual 93	android/os/Parcel:writeIntArray	([I)V
        //   75: aload 10
        //   77: aload 8
        //   79: invokevirtual 93	android/os/Parcel:writeIntArray	([I)V
        //   82: aload 10
        //   84: iload 9
        //   86: invokevirtual 72	android/os/Parcel:writeInt	(I)V
        //   89: aload_0
        //   90: getfield 27	com/tencent/mm/plugin/talkroom/component/a$a$a:mRemote	Landroid/os/IBinder;
        //   93: iconst_3
        //   94: aload 10
        //   96: aload 11
        //   98: iconst_0
        //   99: invokeinterface 54 5 0
        //   104: pop
        //   105: aload 11
        //   107: invokevirtual 57	android/os/Parcel:readException	()V
        //   110: aload 11
        //   112: invokevirtual 60	android/os/Parcel:readInt	()I
        //   115: istore_2
        //   116: aload 11
        //   118: invokevirtual 63	android/os/Parcel:recycle	()V
        //   121: aload 10
        //   123: invokevirtual 63	android/os/Parcel:recycle	()V
        //   126: ldc2_w 74
        //   129: ldc 76
        //   131: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   134: iload_2
        //   135: ireturn
        //   136: aconst_null
        //   137: astore_1
        //   138: goto -102 -> 36
        //   141: astore_1
        //   142: aload 11
        //   144: invokevirtual 63	android/os/Parcel:recycle	()V
        //   147: aload 10
        //   149: invokevirtual 63	android/os/Parcel:recycle	()V
        //   152: aload_1
        //   153: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	154	0	this	a
        //   0	154	1	paramb	b
        //   0	154	2	paramInt1	int
        //   0	154	3	paramInt2	int
        //   0	154	4	paramInt3	int
        //   0	154	5	paramLong	long
        //   0	154	7	paramArrayOfInt1	int[]
        //   0	154	8	paramArrayOfInt2	int[]
        //   0	154	9	paramInt4	int
        //   11	137	10	localParcel1	Parcel
        //   16	127	11	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	25	141	finally
        //   29	36	141	finally
        //   36	116	141	finally
      }
      
      /* Error */
      public final e a(c paramc)
      {
        // Byte code:
        //   0: ldc2_w 95
        //   3: ldc 97
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +60 -> 83
        //   26: aload_1
        //   27: invokeinterface 100 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 85	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/plugin/talkroom/component/a$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 7
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 57	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 103	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   61: invokestatic 109	com/tencent/mm/plugin/talkroom/component/e$a:V	(Landroid/os/IBinder;)Lcom/tencent/mm/plugin/talkroom/component/e;
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 63	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 63	android/os/Parcel:recycle	()V
        //   73: ldc2_w 95
        //   76: ldc 97
        //   78: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   81: aload_1
        //   82: areturn
        //   83: aconst_null
        //   84: astore_1
        //   85: goto -52 -> 33
        //   88: astore_1
        //   89: aload_3
        //   90: invokevirtual 63	android/os/Parcel:recycle	()V
        //   93: aload_2
        //   94: invokevirtual 63	android/os/Parcel:recycle	()V
        //   97: aload_1
        //   98: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	99	0	this	a
        //   0	99	1	paramc	c
        //   11	83	2	localParcel1	Parcel
        //   15	75	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	88	finally
        //   26	33	88	finally
        //   33	65	88	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(5200936960000L, 38750);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(5200936960000L, 38750);
        return localIBinder;
      }
      
      public final int brY()
      {
        GMTrace.i(5201071177728L, 38751);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
          this.mRemote.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5201071177728L, 38751);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final d brZ()
      {
        GMTrace.i(5202010701824L, 38758);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.U(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5202010701824L, 38758);
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final byte[] d(int[] paramArrayOfInt, String paramString)
      {
        // Byte code:
        //   0: ldc2_w 130
        //   3: ldc -124
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_3
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore 4
        //   17: aload_3
        //   18: ldc 44
        //   20: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   23: aload_1
        //   24: ifnonnull +65 -> 89
        //   27: aload_3
        //   28: iconst_m1
        //   29: invokevirtual 72	android/os/Parcel:writeInt	(I)V
        //   32: aload_3
        //   33: aload_2
        //   34: invokevirtual 135	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/plugin/talkroom/component/a$a$a:mRemote	Landroid/os/IBinder;
        //   41: bipush 6
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 57	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 139	android/os/Parcel:createByteArray	()[B
        //   63: astore_2
        //   64: aload 4
        //   66: aload_1
        //   67: invokevirtual 142	android/os/Parcel:readIntArray	([I)V
        //   70: aload 4
        //   72: invokevirtual 63	android/os/Parcel:recycle	()V
        //   75: aload_3
        //   76: invokevirtual 63	android/os/Parcel:recycle	()V
        //   79: ldc2_w 130
        //   82: ldc -124
        //   84: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   87: aload_2
        //   88: areturn
        //   89: aload_3
        //   90: aload_1
        //   91: arraylength
        //   92: invokevirtual 72	android/os/Parcel:writeInt	(I)V
        //   95: goto -63 -> 32
        //   98: astore_1
        //   99: aload 4
        //   101: invokevirtual 63	android/os/Parcel:recycle	()V
        //   104: aload_3
        //   105: invokevirtual 63	android/os/Parcel:recycle	()V
        //   108: aload_1
        //   109: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	110	0	this	a
        //   0	110	1	paramArrayOfInt	int[]
        //   0	110	2	paramString	String
        //   11	94	3	localParcel1	Parcel
        //   15	85	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   17	23	98	finally
        //   27	32	98	finally
        //   32	70	98	finally
        //   89	95	98	finally
      }
      
      public final int uninitLive()
      {
        GMTrace.i(5201205395456L, 38752);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(5201205395456L, 38752);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */