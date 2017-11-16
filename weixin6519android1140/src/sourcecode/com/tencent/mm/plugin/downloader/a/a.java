package com.tencent.mm.plugin.downloader.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.downloader.ipc.CDNTaskState;

public abstract interface a
  extends IInterface
{
  public abstract int a(CDNTaskInfo paramCDNTaskInfo);
  
  public abstract void a(b paramb);
  
  public abstract void apv();
  
  public abstract void apw();
  
  public abstract void apx();
  
  public abstract int b(CDNTaskInfo paramCDNTaskInfo);
  
  public abstract void b(b paramb);
  
  public abstract void ms(int paramInt);
  
  public abstract boolean vn(String paramString);
  
  public abstract boolean vo(String paramString);
  
  public abstract CDNTaskState vp(String paramString);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      GMTrace.i(20087293607936L, 149662);
      attachInterface(this, "com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
      GMTrace.o(20087293607936L, 149662);
    }
    
    public static a H(IBinder paramIBinder)
    {
      GMTrace.i(20087427825664L, 149663);
      if (paramIBinder == null)
      {
        GMTrace.o(20087427825664L, 149663);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
      {
        paramIBinder = (a)localIInterface;
        GMTrace.o(20087427825664L, 149663);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(20087427825664L, 149663);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(20087562043392L, 149664);
      GMTrace.o(20087562043392L, 149664);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject2 = null;
      Object localObject1 = null;
      int i = 0;
      GMTrace.i(20087696261120L, 149665);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(20087696261120L, 149665);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        if (paramParcel1.readInt() != 0) {
          localObject1 = (CDNTaskInfo)CDNTaskInfo.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = a((CDNTaskInfo)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        localObject1 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (CDNTaskInfo)CDNTaskInfo.CREATOR.createFromParcel(paramParcel1);
        }
        paramInt1 = b((CDNTaskInfo)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        bool = vn(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(20087696261120L, 149665);
          return true;
        }
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        bool = vo(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        paramParcel1 = vp(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(20087696261120L, 149665);
          return true;
          paramParcel2.writeInt(0);
        }
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        a(b.a.I(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        b(b.a.I(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        ms(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        apv();
        paramParcel2.writeNoException();
        GMTrace.o(20087696261120L, 149665);
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
        apw();
        paramParcel2.writeNoException();
        GMTrace.o(20087696261120L, 149665);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
      apx();
      paramParcel2.writeNoException();
      GMTrace.o(20087696261120L, 149665);
      return true;
    }
    
    private static final class a
      implements a
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(20090514833408L, 149686);
        this.mRemote = paramIBinder;
        GMTrace.o(20090514833408L, 149686);
      }
      
      /* Error */
      public final int a(CDNTaskInfo paramCDNTaskInfo)
      {
        // Byte code:
        //   0: ldc2_w 33
        //   3: ldc 35
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_3
        //   12: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore 4
        //   17: aload_3
        //   18: ldc 43
        //   20: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   23: aload_1
        //   24: ifnull +59 -> 83
        //   27: aload_3
        //   28: iconst_1
        //   29: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   32: aload_1
        //   33: aload_3
        //   34: iconst_0
        //   35: invokevirtual 57	com/tencent/mm/plugin/downloader/ipc/CDNTaskInfo:writeToParcel	(Landroid/os/Parcel;I)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/plugin/downloader/a/a$a$a:mRemote	Landroid/os/IBinder;
        //   42: iconst_1
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 63 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 66	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 70	android/os/Parcel:readInt	()I
        //   63: istore_2
        //   64: aload 4
        //   66: invokevirtual 73	android/os/Parcel:recycle	()V
        //   69: aload_3
        //   70: invokevirtual 73	android/os/Parcel:recycle	()V
        //   73: ldc2_w 33
        //   76: ldc 35
        //   78: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   81: iload_2
        //   82: ireturn
        //   83: aload_3
        //   84: iconst_0
        //   85: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   88: goto -50 -> 38
        //   91: astore_1
        //   92: aload 4
        //   94: invokevirtual 73	android/os/Parcel:recycle	()V
        //   97: aload_3
        //   98: invokevirtual 73	android/os/Parcel:recycle	()V
        //   101: aload_1
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	paramCDNTaskInfo	CDNTaskInfo
        //   63	19	2	i	int
        //   11	87	3	localParcel1	Parcel
        //   15	78	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   17	23	91	finally
        //   27	38	91	finally
        //   38	64	91	finally
        //   83	88	91	finally
      }
      
      /* Error */
      public final void a(b paramb)
      {
        // Byte code:
        //   0: ldc2_w 75
        //   3: ldc 77
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
        //   27: invokeinterface 83 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 86	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/plugin/downloader/a/a$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 6
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 63 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 66	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 73	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 73	android/os/Parcel:recycle	()V
        //   65: ldc2_w 75
        //   68: ldc 77
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 73	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 73	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramb	b
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      public final void apv()
      {
        GMTrace.i(20091857010688L, 149696);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20091857010688L, 149696);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void apw()
      {
        GMTrace.i(20091991228416L, 149697);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20091991228416L, 149697);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void apx()
      {
        GMTrace.i(20376667029504L, 151818);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20376667029504L, 151818);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(20090649051136L, 149687);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(20090649051136L, 149687);
        return localIBinder;
      }
      
      /* Error */
      public final int b(CDNTaskInfo paramCDNTaskInfo)
      {
        // Byte code:
        //   0: ldc2_w 103
        //   3: ldc 105
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_3
        //   12: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore 4
        //   17: aload_3
        //   18: ldc 43
        //   20: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   23: aload_1
        //   24: ifnull +59 -> 83
        //   27: aload_3
        //   28: iconst_1
        //   29: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   32: aload_1
        //   33: aload_3
        //   34: iconst_0
        //   35: invokevirtual 57	com/tencent/mm/plugin/downloader/ipc/CDNTaskInfo:writeToParcel	(Landroid/os/Parcel;I)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/plugin/downloader/a/a$a$a:mRemote	Landroid/os/IBinder;
        //   42: iconst_2
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 63 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 66	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 70	android/os/Parcel:readInt	()I
        //   63: istore_2
        //   64: aload 4
        //   66: invokevirtual 73	android/os/Parcel:recycle	()V
        //   69: aload_3
        //   70: invokevirtual 73	android/os/Parcel:recycle	()V
        //   73: ldc2_w 103
        //   76: ldc 105
        //   78: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   81: iload_2
        //   82: ireturn
        //   83: aload_3
        //   84: iconst_0
        //   85: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   88: goto -50 -> 38
        //   91: astore_1
        //   92: aload 4
        //   94: invokevirtual 73	android/os/Parcel:recycle	()V
        //   97: aload_3
        //   98: invokevirtual 73	android/os/Parcel:recycle	()V
        //   101: aload_1
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	paramCDNTaskInfo	CDNTaskInfo
        //   63	19	2	i	int
        //   11	87	3	localParcel1	Parcel
        //   15	78	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   17	23	91	finally
        //   27	38	91	finally
        //   38	64	91	finally
        //   83	88	91	finally
      }
      
      /* Error */
      public final void b(b paramb)
      {
        // Byte code:
        //   0: ldc2_w 106
        //   3: ldc 108
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
        //   27: invokeinterface 83 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 86	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/plugin/downloader/a/a$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 7
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 63 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 66	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 73	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 73	android/os/Parcel:recycle	()V
        //   65: ldc2_w 106
        //   68: ldc 108
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 73	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 73	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramb	b
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      public final void ms(int paramInt)
      {
        GMTrace.i(20091722792960L, 149695);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20091722792960L, 149695);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean vn(String paramString)
      {
        boolean bool = false;
        GMTrace.i(20091051704320L, 149690);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
          localParcel1.writeString(paramString);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20091051704320L, 149690);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean vo(String paramString)
      {
        boolean bool = false;
        GMTrace.i(20091185922048L, 149691);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.downloader.aidl.ICDNDownloadService");
          localParcel1.writeString(paramString);
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(20091185922048L, 149691);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final CDNTaskState vp(String paramString)
      {
        // Byte code:
        //   0: ldc2_w 127
        //   3: ldc -127
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 43
        //   19: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_2
        //   23: aload_1
        //   24: invokevirtual 120	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   27: aload_0
        //   28: getfield 27	com/tencent/mm/plugin/downloader/a/a$a$a:mRemote	Landroid/os/IBinder;
        //   31: iconst_5
        //   32: aload_2
        //   33: aload_3
        //   34: iconst_0
        //   35: invokeinterface 63 5 0
        //   40: pop
        //   41: aload_3
        //   42: invokevirtual 66	android/os/Parcel:readException	()V
        //   45: aload_3
        //   46: invokevirtual 70	android/os/Parcel:readInt	()I
        //   49: ifeq +34 -> 83
        //   52: getstatic 135	com/tencent/mm/plugin/downloader/ipc/CDNTaskState:CREATOR	Landroid/os/Parcelable$Creator;
        //   55: aload_3
        //   56: invokeinterface 141 2 0
        //   61: checkcast 131	com/tencent/mm/plugin/downloader/ipc/CDNTaskState
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 73	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 73	android/os/Parcel:recycle	()V
        //   73: ldc2_w 127
        //   76: ldc -127
        //   78: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   81: aload_1
        //   82: areturn
        //   83: aconst_null
        //   84: astore_1
        //   85: goto -20 -> 65
        //   88: astore_1
        //   89: aload_3
        //   90: invokevirtual 73	android/os/Parcel:recycle	()V
        //   93: aload_2
        //   94: invokevirtual 73	android/os/Parcel:recycle	()V
        //   97: aload_1
        //   98: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	99	0	this	a
        //   0	99	1	paramString	String
        //   11	83	2	localParcel1	Parcel
        //   15	75	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	65	88	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */