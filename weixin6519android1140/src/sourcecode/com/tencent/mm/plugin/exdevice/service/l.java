package com.tencent.mm.plugin.exdevice.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface l
  extends IInterface
{
  public abstract void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp);
  
  public static abstract class a
    extends Binder
    implements l
  {
    public a()
    {
      GMTrace.i(11159130341376L, 83142);
      attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
      GMTrace.o(11159130341376L, 83142);
    }
    
    public static l N(IBinder paramIBinder)
    {
      GMTrace.i(11159264559104L, 83143);
      if (paramIBinder == null)
      {
        GMTrace.o(11159264559104L, 83143);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof l)))
      {
        paramIBinder = (l)localIInterface;
        GMTrace.o(11159264559104L, 83143);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(11159264559104L, 83143);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(11159398776832L, 83144);
      GMTrace.o(11159398776832L, 83144);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(11159532994560L, 83145);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(11159532994560L, 83145);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
        GMTrace.o(11159532994560L, 83145);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
      a(paramParcel1.readLong(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), p.a.P(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      GMTrace.o(11159532994560L, 83145);
      return true;
    }
    
    private static final class a
      implements l
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(11148661358592L, 83064);
        this.mRemote = paramIBinder;
        GMTrace.o(11148661358592L, 83064);
      }
      
      /* Error */
      public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
      {
        // Byte code:
        //   0: ldc2_w 33
        //   3: ldc 35
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 8
        //   18: aload 7
        //   20: ldc 43
        //   22: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload 7
        //   27: lload_1
        //   28: invokevirtual 51	android/os/Parcel:writeLong	(J)V
        //   31: aload 7
        //   33: iload_3
        //   34: invokevirtual 55	android/os/Parcel:writeInt	(I)V
        //   37: aload 7
        //   39: iload 4
        //   41: invokevirtual 55	android/os/Parcel:writeInt	(I)V
        //   44: aload 7
        //   46: aload 5
        //   48: invokevirtual 58	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   51: aload 6
        //   53: ifnull +59 -> 112
        //   56: aload 6
        //   58: invokeinterface 64 1 0
        //   63: astore 5
        //   65: aload 7
        //   67: aload 5
        //   69: invokevirtual 67	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   72: aload_0
        //   73: getfield 27	com/tencent/mm/plugin/exdevice/service/l$a$a:mRemote	Landroid/os/IBinder;
        //   76: iconst_1
        //   77: aload 7
        //   79: aload 8
        //   81: iconst_0
        //   82: invokeinterface 73 5 0
        //   87: pop
        //   88: aload 8
        //   90: invokevirtual 76	android/os/Parcel:readException	()V
        //   93: aload 8
        //   95: invokevirtual 79	android/os/Parcel:recycle	()V
        //   98: aload 7
        //   100: invokevirtual 79	android/os/Parcel:recycle	()V
        //   103: ldc2_w 33
        //   106: ldc 35
        //   108: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   111: return
        //   112: aconst_null
        //   113: astore 5
        //   115: goto -50 -> 65
        //   118: astore 5
        //   120: aload 8
        //   122: invokevirtual 79	android/os/Parcel:recycle	()V
        //   125: aload 7
        //   127: invokevirtual 79	android/os/Parcel:recycle	()V
        //   130: aload 5
        //   132: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	133	0	this	a
        //   0	133	1	paramLong	long
        //   0	133	3	paramInt1	int
        //   0	133	4	paramInt2	int
        //   0	133	5	paramString	String
        //   0	133	6	paramp	p
        //   11	115	7	localParcel1	Parcel
        //   16	105	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	51	118	finally
        //   56	65	118	finally
        //   65	93	118	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(11148795576320L, 83065);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(11148795576320L, 83065);
        return localIBinder;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */