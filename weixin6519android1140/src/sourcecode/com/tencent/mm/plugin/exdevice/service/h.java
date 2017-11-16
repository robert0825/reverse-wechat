package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface h
  extends IInterface
{
  public abstract long a(p paramp);
  
  public abstract void a(n paramn);
  
  public abstract boolean a(long paramLong, int paramInt, k paramk);
  
  public abstract boolean a(i parami);
  
  public abstract boolean a(s params);
  
  public abstract boolean a(String paramString, boolean paramBoolean, q paramq);
  
  public abstract long[] aug();
  
  public abstract boolean b(int paramInt, j paramj);
  
  public abstract boolean b(long paramLong, int paramInt, k paramk);
  
  public abstract boolean b(long paramLong, byte[] paramArrayOfByte, t paramt);
  
  public abstract boolean b(i parami);
  
  public abstract boolean bN(long paramLong);
  
  public abstract boolean bO(long paramLong);
  
  public abstract boolean bP(long paramLong);
  
  public abstract boolean bQ(long paramLong);
  
  public abstract boolean c(int paramInt, j paramj);
  
  public abstract boolean d(int paramInt, j paramj);
  
  public abstract boolean e(int paramInt, j paramj);
  
  public abstract void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte);
  
  public static abstract class a
    extends Binder
    implements h
  {
    public a()
    {
      GMTrace.i(11165304356864L, 83188);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      GMTrace.o(11165304356864L, 83188);
    }
    
    public static h J(IBinder paramIBinder)
    {
      GMTrace.i(11165438574592L, 83189);
      if (paramIBinder == null)
      {
        GMTrace.o(11165438574592L, 83189);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof h)))
      {
        paramIBinder = (h)localIInterface;
        GMTrace.o(11165438574592L, 83189);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11165438574592L, 83189);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11165572792320L, 83190);
      GMTrace.o(11165572792320L, 83190);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11165707010048L, 83191);
      boolean bool;
      label839:
      label882:
      IInterface localIInterface;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11165707010048L, 83191);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        GMTrace.o(11165707010048L, 83191);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = b(paramParcel1.readInt(), j.a.L(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = c(paramParcel1.readInt(), j.a.L(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        paramParcel1 = aug();
        paramParcel2.writeNoException();
        paramParcel2.writeLongArray(paramParcel1);
        GMTrace.o(11165707010048L, 83191);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = a(paramParcel1.readLong(), paramParcel1.readInt(), k.a.M(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = bN(paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = bO(paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        l = a(p.a.P(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        GMTrace.o(11165707010048L, 83191);
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = bP(paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = a(i.a.K(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = b(i.a.K(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(11165707010048L, 83191);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
          if ((localObject != null) && ((localObject instanceof n))) {
            paramParcel1 = (n)localObject;
          } else {
            paramParcel1 = new n.a.a(paramParcel1);
          }
        }
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        setChannelSessionKey(paramParcel1.readLong(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        GMTrace.o(11165707010048L, 83191);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        localObject = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          bool = true;
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 != null) {
            break label882;
          }
          paramParcel1 = null;
          bool = a((String)localObject, bool, paramParcel1);
          paramParcel2.writeNoException();
          if (!bool) {
            break label926;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
          bool = false;
          break;
          localIInterface = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IIBeaconCallback_AIDL");
          if ((localIInterface != null) && ((localIInterface instanceof q)))
          {
            paramParcel1 = (q)localIInterface;
            break label839;
          }
          paramParcel1 = new q.a.a(paramParcel1);
          break label839;
        }
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = d(paramParcel1.readInt(), j.a.L(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = e(paramParcel1.readInt(), j.a.L(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 16: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = b(paramParcel1.readLong(), paramParcel1.readInt(), k.a.M(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 17: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        bool = bQ(paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
        }
      case 18: 
        label926:
        paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null)
        {
          paramParcel1 = null;
          bool = a(paramParcel1);
          paramParcel2.writeNoException();
          if (!bool) {
            break label1238;
          }
        }
        label1238:
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(11165707010048L, 83191);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
          if ((localObject != null) && ((localObject instanceof s)))
          {
            paramParcel1 = (s)localObject;
            break;
          }
          paramParcel1 = new s.a.a(paramParcel1);
          break;
        }
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
      long l = paramParcel1.readLong();
      Object localObject = paramParcel1.createByteArray();
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null)
      {
        paramParcel1 = null;
        bool = b(l, (byte[])localObject, paramParcel1);
        paramParcel2.writeNoException();
        if (!bool) {
          break label1353;
        }
      }
      label1353:
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(11165707010048L, 83191);
        return true;
        localIInterface = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof t)))
        {
          paramParcel1 = (t)localIInterface;
          break;
        }
        paramParcel1 = new t.a.a(paramParcel1);
        break;
      }
    }
    
    private static final class a
      implements h
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11171075719168L, 83231);
        this.mRemote = paramIBinder;
        GMTrace.o(11171075719168L, 83231);
      }
      
      /* Error */
      public final long a(p paramp)
      {
        // Byte code:
        //   0: ldc2_w 33
        //   3: ldc 35
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 4
        //   13: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 5
        //   18: aload 4
        //   20: ldc 43
        //   22: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_1
        //   26: ifnull +64 -> 90
        //   29: aload_1
        //   30: invokeinterface 53 1 0
        //   35: astore_1
        //   36: aload 4
        //   38: aload_1
        //   39: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   42: aload_0
        //   43: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   46: bipush 7
        //   48: aload 4
        //   50: aload 5
        //   52: iconst_0
        //   53: invokeinterface 62 5 0
        //   58: pop
        //   59: aload 5
        //   61: invokevirtual 65	android/os/Parcel:readException	()V
        //   64: aload 5
        //   66: invokevirtual 69	android/os/Parcel:readLong	()J
        //   69: lstore_2
        //   70: aload 5
        //   72: invokevirtual 72	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: invokevirtual 72	android/os/Parcel:recycle	()V
        //   80: ldc2_w 33
        //   83: ldc 35
        //   85: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   88: lload_2
        //   89: lreturn
        //   90: aconst_null
        //   91: astore_1
        //   92: goto -56 -> 36
        //   95: astore_1
        //   96: aload 5
        //   98: invokevirtual 72	android/os/Parcel:recycle	()V
        //   101: aload 4
        //   103: invokevirtual 72	android/os/Parcel:recycle	()V
        //   106: aload_1
        //   107: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	108	0	this	a
        //   0	108	1	paramp	p
        //   69	20	2	l	long
        //   11	91	4	localParcel1	Parcel
        //   16	81	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	25	95	finally
        //   29	36	95	finally
        //   36	70	95	finally
      }
      
      /* Error */
      public final void a(n paramn)
      {
        // Byte code:
        //   0: ldc2_w 74
        //   3: ldc 76
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 43
        //   19: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +51 -> 74
        //   26: aload_1
        //   27: invokeinterface 79 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 11
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 62 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 65	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 72	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 72	android/os/Parcel:recycle	()V
        //   65: ldc2_w 74
        //   68: ldc 76
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 72	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 72	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramn	n
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      /* Error */
      public final boolean a(long paramLong, int paramInt, k paramk)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 5
        //   3: ldc2_w 81
        //   6: ldc 83
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 6
        //   16: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 7
        //   21: aload 6
        //   23: ldc 43
        //   25: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 6
        //   30: lload_1
        //   31: invokevirtual 87	android/os/Parcel:writeLong	(J)V
        //   34: aload 6
        //   36: iload_3
        //   37: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   40: aload 4
        //   42: ifnull +74 -> 116
        //   45: aload 4
        //   47: invokeinterface 94 1 0
        //   52: astore 4
        //   54: aload 6
        //   56: aload 4
        //   58: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   61: aload_0
        //   62: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   65: iconst_4
        //   66: aload 6
        //   68: aload 7
        //   70: iconst_0
        //   71: invokeinterface 62 5 0
        //   76: pop
        //   77: aload 7
        //   79: invokevirtual 65	android/os/Parcel:readException	()V
        //   82: aload 7
        //   84: invokevirtual 98	android/os/Parcel:readInt	()I
        //   87: istore_3
        //   88: iload_3
        //   89: ifeq +6 -> 95
        //   92: iconst_1
        //   93: istore 5
        //   95: aload 7
        //   97: invokevirtual 72	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 72	android/os/Parcel:recycle	()V
        //   105: ldc2_w 81
        //   108: ldc 83
        //   110: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   113: iload 5
        //   115: ireturn
        //   116: aconst_null
        //   117: astore 4
        //   119: goto -65 -> 54
        //   122: astore 4
        //   124: aload 7
        //   126: invokevirtual 72	android/os/Parcel:recycle	()V
        //   129: aload 6
        //   131: invokevirtual 72	android/os/Parcel:recycle	()V
        //   134: aload 4
        //   136: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	137	0	this	a
        //   0	137	1	paramLong	long
        //   0	137	3	paramInt	int
        //   0	137	4	paramk	k
        //   1	113	5	bool	boolean
        //   14	116	6	localParcel1	Parcel
        //   19	106	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	40	122	finally
        //   45	54	122	finally
        //   54	88	122	finally
      }
      
      /* Error */
      public final boolean a(i parami)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 100
        //   5: ldc 102
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload_1
        //   28: ifnull +70 -> 98
        //   31: aload_1
        //   32: invokeinterface 105 1 0
        //   37: astore_1
        //   38: aload 4
        //   40: aload_1
        //   41: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   48: bipush 9
        //   50: aload 4
        //   52: aload 5
        //   54: iconst_0
        //   55: invokeinterface 62 5 0
        //   60: pop
        //   61: aload 5
        //   63: invokevirtual 65	android/os/Parcel:readException	()V
        //   66: aload 5
        //   68: invokevirtual 98	android/os/Parcel:readInt	()I
        //   71: istore_2
        //   72: iload_2
        //   73: ifeq +5 -> 78
        //   76: iconst_1
        //   77: istore_3
        //   78: aload 5
        //   80: invokevirtual 72	android/os/Parcel:recycle	()V
        //   83: aload 4
        //   85: invokevirtual 72	android/os/Parcel:recycle	()V
        //   88: ldc2_w 100
        //   91: ldc 102
        //   93: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   96: iload_3
        //   97: ireturn
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -62 -> 38
        //   103: astore_1
        //   104: aload 5
        //   106: invokevirtual 72	android/os/Parcel:recycle	()V
        //   109: aload 4
        //   111: invokevirtual 72	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	parami	i
        //   71	2	2	i	int
        //   1	96	3	bool	boolean
        //   13	97	4	localParcel1	Parcel
        //   18	87	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	27	103	finally
        //   31	38	103	finally
        //   38	72	103	finally
      }
      
      /* Error */
      public final boolean a(s params)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 107
        //   5: ldc 109
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload_1
        //   28: ifnull +70 -> 98
        //   31: aload_1
        //   32: invokeinterface 112 1 0
        //   37: astore_1
        //   38: aload 4
        //   40: aload_1
        //   41: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   48: bipush 18
        //   50: aload 4
        //   52: aload 5
        //   54: iconst_0
        //   55: invokeinterface 62 5 0
        //   60: pop
        //   61: aload 5
        //   63: invokevirtual 65	android/os/Parcel:readException	()V
        //   66: aload 5
        //   68: invokevirtual 98	android/os/Parcel:readInt	()I
        //   71: istore_2
        //   72: iload_2
        //   73: ifeq +5 -> 78
        //   76: iconst_1
        //   77: istore_3
        //   78: aload 5
        //   80: invokevirtual 72	android/os/Parcel:recycle	()V
        //   83: aload 4
        //   85: invokevirtual 72	android/os/Parcel:recycle	()V
        //   88: ldc2_w 107
        //   91: ldc 109
        //   93: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   96: iload_3
        //   97: ireturn
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -62 -> 38
        //   103: astore_1
        //   104: aload 5
        //   106: invokevirtual 72	android/os/Parcel:recycle	()V
        //   109: aload 4
        //   111: invokevirtual 72	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	params	s
        //   71	2	2	i	int
        //   1	96	3	bool	boolean
        //   13	97	4	localParcel1	Parcel
        //   18	87	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	27	103	finally
        //   31	38	103	finally
        //   38	72	103	finally
      }
      
      /* Error */
      public final boolean a(String paramString, boolean paramBoolean, q paramq)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: ldc2_w 114
        //   6: ldc 116
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 6
        //   16: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 7
        //   21: aload 6
        //   23: ldc 43
        //   25: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 6
        //   30: aload_1
        //   31: invokevirtual 119	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   34: iload_2
        //   35: ifeq +87 -> 122
        //   38: iconst_1
        //   39: istore 4
        //   41: aload 6
        //   43: iload 4
        //   45: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   48: aload_3
        //   49: ifnull +79 -> 128
        //   52: aload_3
        //   53: invokeinterface 122 1 0
        //   58: astore_1
        //   59: aload 6
        //   61: aload_1
        //   62: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   65: aload_0
        //   66: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   69: bipush 13
        //   71: aload 6
        //   73: aload 7
        //   75: iconst_0
        //   76: invokeinterface 62 5 0
        //   81: pop
        //   82: aload 7
        //   84: invokevirtual 65	android/os/Parcel:readException	()V
        //   87: aload 7
        //   89: invokevirtual 98	android/os/Parcel:readInt	()I
        //   92: istore 4
        //   94: iload 4
        //   96: ifeq +37 -> 133
        //   99: iload 5
        //   101: istore_2
        //   102: aload 7
        //   104: invokevirtual 72	android/os/Parcel:recycle	()V
        //   107: aload 6
        //   109: invokevirtual 72	android/os/Parcel:recycle	()V
        //   112: ldc2_w 114
        //   115: ldc 116
        //   117: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   120: iload_2
        //   121: ireturn
        //   122: iconst_0
        //   123: istore 4
        //   125: goto -84 -> 41
        //   128: aconst_null
        //   129: astore_1
        //   130: goto -71 -> 59
        //   133: iconst_0
        //   134: istore_2
        //   135: goto -33 -> 102
        //   138: astore_1
        //   139: aload 7
        //   141: invokevirtual 72	android/os/Parcel:recycle	()V
        //   144: aload 6
        //   146: invokevirtual 72	android/os/Parcel:recycle	()V
        //   149: aload_1
        //   150: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	151	0	this	a
        //   0	151	1	paramString	String
        //   0	151	2	paramBoolean	boolean
        //   0	151	3	paramq	q
        //   39	85	4	i	int
        //   1	99	5	bool	boolean
        //   14	131	6	localParcel1	Parcel
        //   19	121	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	34	138	finally
        //   41	48	138	finally
        //   52	59	138	finally
        //   59	94	138	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11171209936896L, 83232);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11171209936896L, 83232);
        return localIBinder;
      }
      
      public final long[] aug()
      {
        GMTrace.i(11171612590080L, 83235);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          long[] arrayOfLong = localParcel2.createLongArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11171612590080L, 83235);
          return arrayOfLong;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean b(int paramInt, j paramj)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_3
        //   2: ldc2_w 136
        //   5: ldc -118
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload 4
        //   29: iload_1
        //   30: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   33: aload_2
        //   34: ifnull +67 -> 101
        //   37: aload_2
        //   38: invokeinterface 141 1 0
        //   43: astore_2
        //   44: aload 4
        //   46: aload_2
        //   47: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   50: aload_0
        //   51: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   54: iconst_1
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 62 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 65	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 98	android/os/Parcel:readInt	()I
        //   76: istore_1
        //   77: iload_1
        //   78: ifeq +28 -> 106
        //   81: aload 5
        //   83: invokevirtual 72	android/os/Parcel:recycle	()V
        //   86: aload 4
        //   88: invokevirtual 72	android/os/Parcel:recycle	()V
        //   91: ldc2_w 136
        //   94: ldc -118
        //   96: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   99: iload_3
        //   100: ireturn
        //   101: aconst_null
        //   102: astore_2
        //   103: goto -59 -> 44
        //   106: iconst_0
        //   107: istore_3
        //   108: goto -27 -> 81
        //   111: astore_2
        //   112: aload 5
        //   114: invokevirtual 72	android/os/Parcel:recycle	()V
        //   117: aload 4
        //   119: invokevirtual 72	android/os/Parcel:recycle	()V
        //   122: aload_2
        //   123: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	124	0	this	a
        //   0	124	1	paramInt	int
        //   0	124	2	paramj	j
        //   1	107	3	bool	boolean
        //   13	105	4	localParcel1	Parcel
        //   18	95	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	33	111	finally
        //   37	44	111	finally
        //   44	77	111	finally
      }
      
      /* Error */
      public final boolean b(long paramLong, int paramInt, k paramk)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 5
        //   3: ldc2_w 142
        //   6: ldc -112
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 6
        //   16: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 7
        //   21: aload 6
        //   23: ldc 43
        //   25: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 6
        //   30: lload_1
        //   31: invokevirtual 87	android/os/Parcel:writeLong	(J)V
        //   34: aload 6
        //   36: iload_3
        //   37: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   40: aload 4
        //   42: ifnull +75 -> 117
        //   45: aload 4
        //   47: invokeinterface 94 1 0
        //   52: astore 4
        //   54: aload 6
        //   56: aload 4
        //   58: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   61: aload_0
        //   62: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   65: bipush 16
        //   67: aload 6
        //   69: aload 7
        //   71: iconst_0
        //   72: invokeinterface 62 5 0
        //   77: pop
        //   78: aload 7
        //   80: invokevirtual 65	android/os/Parcel:readException	()V
        //   83: aload 7
        //   85: invokevirtual 98	android/os/Parcel:readInt	()I
        //   88: istore_3
        //   89: iload_3
        //   90: ifeq +6 -> 96
        //   93: iconst_1
        //   94: istore 5
        //   96: aload 7
        //   98: invokevirtual 72	android/os/Parcel:recycle	()V
        //   101: aload 6
        //   103: invokevirtual 72	android/os/Parcel:recycle	()V
        //   106: ldc2_w 142
        //   109: ldc -112
        //   111: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   114: iload 5
        //   116: ireturn
        //   117: aconst_null
        //   118: astore 4
        //   120: goto -66 -> 54
        //   123: astore 4
        //   125: aload 7
        //   127: invokevirtual 72	android/os/Parcel:recycle	()V
        //   130: aload 6
        //   132: invokevirtual 72	android/os/Parcel:recycle	()V
        //   135: aload 4
        //   137: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	138	0	this	a
        //   0	138	1	paramLong	long
        //   0	138	3	paramInt	int
        //   0	138	4	paramk	k
        //   1	114	5	bool	boolean
        //   14	117	6	localParcel1	Parcel
        //   19	107	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	40	123	finally
        //   45	54	123	finally
        //   54	89	123	finally
      }
      
      /* Error */
      public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 6
        //   3: ldc2_w 146
        //   6: ldc -108
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 7
        //   16: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 8
        //   21: aload 7
        //   23: ldc 43
        //   25: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 7
        //   30: lload_1
        //   31: invokevirtual 87	android/os/Parcel:writeLong	(J)V
        //   34: aload 7
        //   36: aload_3
        //   37: invokevirtual 152	android/os/Parcel:writeByteArray	([B)V
        //   40: aload 4
        //   42: ifnull +75 -> 117
        //   45: aload 4
        //   47: invokeinterface 155 1 0
        //   52: astore_3
        //   53: aload 7
        //   55: aload_3
        //   56: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   59: aload_0
        //   60: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   63: bipush 19
        //   65: aload 7
        //   67: aload 8
        //   69: iconst_0
        //   70: invokeinterface 62 5 0
        //   75: pop
        //   76: aload 8
        //   78: invokevirtual 65	android/os/Parcel:readException	()V
        //   81: aload 8
        //   83: invokevirtual 98	android/os/Parcel:readInt	()I
        //   86: istore 5
        //   88: iload 5
        //   90: ifeq +6 -> 96
        //   93: iconst_1
        //   94: istore 6
        //   96: aload 8
        //   98: invokevirtual 72	android/os/Parcel:recycle	()V
        //   101: aload 7
        //   103: invokevirtual 72	android/os/Parcel:recycle	()V
        //   106: ldc2_w 146
        //   109: ldc -108
        //   111: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   114: iload 6
        //   116: ireturn
        //   117: aconst_null
        //   118: astore_3
        //   119: goto -66 -> 53
        //   122: astore_3
        //   123: aload 8
        //   125: invokevirtual 72	android/os/Parcel:recycle	()V
        //   128: aload 7
        //   130: invokevirtual 72	android/os/Parcel:recycle	()V
        //   133: aload_3
        //   134: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	135	0	this	a
        //   0	135	1	paramLong	long
        //   0	135	3	paramArrayOfByte	byte[]
        //   0	135	4	paramt	t
        //   86	3	5	i	int
        //   1	114	6	bool	boolean
        //   14	115	7	localParcel1	Parcel
        //   19	105	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	40	122	finally
        //   45	53	122	finally
        //   53	88	122	finally
      }
      
      /* Error */
      public final boolean b(i parami)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 156
        //   5: ldc -98
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload_1
        //   28: ifnull +70 -> 98
        //   31: aload_1
        //   32: invokeinterface 105 1 0
        //   37: astore_1
        //   38: aload 4
        //   40: aload_1
        //   41: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   48: bipush 10
        //   50: aload 4
        //   52: aload 5
        //   54: iconst_0
        //   55: invokeinterface 62 5 0
        //   60: pop
        //   61: aload 5
        //   63: invokevirtual 65	android/os/Parcel:readException	()V
        //   66: aload 5
        //   68: invokevirtual 98	android/os/Parcel:readInt	()I
        //   71: istore_2
        //   72: iload_2
        //   73: ifeq +5 -> 78
        //   76: iconst_1
        //   77: istore_3
        //   78: aload 5
        //   80: invokevirtual 72	android/os/Parcel:recycle	()V
        //   83: aload 4
        //   85: invokevirtual 72	android/os/Parcel:recycle	()V
        //   88: ldc2_w 156
        //   91: ldc -98
        //   93: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   96: iload_3
        //   97: ireturn
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -62 -> 38
        //   103: astore_1
        //   104: aload 5
        //   106: invokevirtual 72	android/os/Parcel:recycle	()V
        //   109: aload 4
        //   111: invokevirtual 72	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	parami	i
        //   71	2	2	i	int
        //   1	96	3	bool	boolean
        //   13	97	4	localParcel1	Parcel
        //   18	87	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	27	103	finally
        //   31	38	103	finally
        //   38	72	103	finally
      }
      
      public final boolean bN(long paramLong)
      {
        boolean bool = false;
        GMTrace.i(11171881025536L, 83237);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11171881025536L, 83237);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bO(long paramLong)
      {
        boolean bool = false;
        GMTrace.i(11172015243264L, 83238);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11172015243264L, 83238);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bP(long paramLong)
      {
        boolean bool = false;
        GMTrace.i(11172283678720L, 83240);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11172283678720L, 83240);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bQ(long paramLong)
      {
        boolean bool = false;
        GMTrace.i(11173625856000L, 83250);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
          localParcel1.writeLong(paramLong);
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11173625856000L, 83250);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean c(int paramInt, j paramj)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 177
        //   5: ldc -77
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload 4
        //   29: iload_1
        //   30: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   33: aload_2
        //   34: ifnull +69 -> 103
        //   37: aload_2
        //   38: invokeinterface 141 1 0
        //   43: astore_2
        //   44: aload 4
        //   46: aload_2
        //   47: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   50: aload_0
        //   51: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   54: iconst_2
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 62 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 65	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 98	android/os/Parcel:readInt	()I
        //   76: istore_1
        //   77: iload_1
        //   78: ifeq +5 -> 83
        //   81: iconst_1
        //   82: istore_3
        //   83: aload 5
        //   85: invokevirtual 72	android/os/Parcel:recycle	()V
        //   88: aload 4
        //   90: invokevirtual 72	android/os/Parcel:recycle	()V
        //   93: ldc2_w 177
        //   96: ldc -77
        //   98: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   101: iload_3
        //   102: ireturn
        //   103: aconst_null
        //   104: astore_2
        //   105: goto -61 -> 44
        //   108: astore_2
        //   109: aload 5
        //   111: invokevirtual 72	android/os/Parcel:recycle	()V
        //   114: aload 4
        //   116: invokevirtual 72	android/os/Parcel:recycle	()V
        //   119: aload_2
        //   120: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	121	0	this	a
        //   0	121	1	paramInt	int
        //   0	121	2	paramj	j
        //   1	101	3	bool	boolean
        //   13	102	4	localParcel1	Parcel
        //   18	92	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	33	108	finally
        //   37	44	108	finally
        //   44	77	108	finally
      }
      
      /* Error */
      public final boolean d(int paramInt, j paramj)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 181
        //   5: ldc -73
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload 4
        //   29: iload_1
        //   30: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   33: aload_2
        //   34: ifnull +70 -> 104
        //   37: aload_2
        //   38: invokeinterface 141 1 0
        //   43: astore_2
        //   44: aload 4
        //   46: aload_2
        //   47: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   50: aload_0
        //   51: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   54: bipush 14
        //   56: aload 4
        //   58: aload 5
        //   60: iconst_0
        //   61: invokeinterface 62 5 0
        //   66: pop
        //   67: aload 5
        //   69: invokevirtual 65	android/os/Parcel:readException	()V
        //   72: aload 5
        //   74: invokevirtual 98	android/os/Parcel:readInt	()I
        //   77: istore_1
        //   78: iload_1
        //   79: ifeq +5 -> 84
        //   82: iconst_1
        //   83: istore_3
        //   84: aload 5
        //   86: invokevirtual 72	android/os/Parcel:recycle	()V
        //   89: aload 4
        //   91: invokevirtual 72	android/os/Parcel:recycle	()V
        //   94: ldc2_w 181
        //   97: ldc -73
        //   99: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   102: iload_3
        //   103: ireturn
        //   104: aconst_null
        //   105: astore_2
        //   106: goto -62 -> 44
        //   109: astore_2
        //   110: aload 5
        //   112: invokevirtual 72	android/os/Parcel:recycle	()V
        //   115: aload 4
        //   117: invokevirtual 72	android/os/Parcel:recycle	()V
        //   120: aload_2
        //   121: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	122	0	this	a
        //   0	122	1	paramInt	int
        //   0	122	2	paramj	j
        //   1	102	3	bool	boolean
        //   13	103	4	localParcel1	Parcel
        //   18	93	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	33	109	finally
        //   37	44	109	finally
        //   44	78	109	finally
      }
      
      /* Error */
      public final boolean e(int paramInt, j paramj)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 185
        //   5: ldc -69
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 43
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload 4
        //   29: iload_1
        //   30: invokevirtual 91	android/os/Parcel:writeInt	(I)V
        //   33: aload_2
        //   34: ifnull +70 -> 104
        //   37: aload_2
        //   38: invokeinterface 141 1 0
        //   43: astore_2
        //   44: aload 4
        //   46: aload_2
        //   47: invokevirtual 56	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   50: aload_0
        //   51: getfield 27	com/tencent/mm/plugin/exdevice/service/h$a$a:mRemote	Landroid/os/IBinder;
        //   54: bipush 15
        //   56: aload 4
        //   58: aload 5
        //   60: iconst_0
        //   61: invokeinterface 62 5 0
        //   66: pop
        //   67: aload 5
        //   69: invokevirtual 65	android/os/Parcel:readException	()V
        //   72: aload 5
        //   74: invokevirtual 98	android/os/Parcel:readInt	()I
        //   77: istore_1
        //   78: iload_1
        //   79: ifeq +5 -> 84
        //   82: iconst_1
        //   83: istore_3
        //   84: aload 5
        //   86: invokevirtual 72	android/os/Parcel:recycle	()V
        //   89: aload 4
        //   91: invokevirtual 72	android/os/Parcel:recycle	()V
        //   94: ldc2_w 185
        //   97: ldc -69
        //   99: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   102: iload_3
        //   103: ireturn
        //   104: aconst_null
        //   105: astore_2
        //   106: goto -62 -> 44
        //   109: astore_2
        //   110: aload 5
        //   112: invokevirtual 72	android/os/Parcel:recycle	()V
        //   115: aload 4
        //   117: invokevirtual 72	android/os/Parcel:recycle	()V
        //   120: aload_2
        //   121: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	122	0	this	a
        //   0	122	1	paramInt	int
        //   0	122	2	paramj	j
        //   1	102	3	bool	boolean
        //   13	103	4	localParcel1	Parcel
        //   18	93	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	33	109	finally
        //   37	44	109	finally
        //   44	78	109	finally
      }
      
      public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
      {
        GMTrace.i(11172820549632L, 83244);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
          localParcel1.writeLong(paramLong);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(11172820549632L, 83244);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */