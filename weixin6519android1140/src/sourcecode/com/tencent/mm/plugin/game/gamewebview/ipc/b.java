package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface b
  extends IInterface
{
  public abstract void u(Bundle paramBundle);
  
  public abstract void v(Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(16942035369984L, 126228);
      attachInterface(this, "com.tencent.mm.plugin.game.gamewebview.ipc.IGWProcessService");
      GMTrace.o(16942035369984L, 126228);
    }
    
    public static b R(IBinder paramIBinder)
    {
      GMTrace.i(16942169587712L, 126229);
      if (paramIBinder == null)
      {
        GMTrace.o(16942169587712L, 126229);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.game.gamewebview.ipc.IGWProcessService");
      if ((localIInterface != null) && ((localIInterface instanceof b)))
      {
        paramIBinder = (b)localIInterface;
        GMTrace.o(16942169587712L, 126229);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(16942169587712L, 126229);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(16942303805440L, 126230);
      GMTrace.o(16942303805440L, 126230);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject2 = null;
      Object localObject1 = null;
      GMTrace.i(16942438023168L, 126231);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(16942438023168L, 126231);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.game.gamewebview.ipc.IGWProcessService");
        GMTrace.o(16942438023168L, 126231);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.game.gamewebview.ipc.IGWProcessService");
        paramParcel2 = (Parcel)localObject1;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        u(paramParcel2);
        GMTrace.o(16942438023168L, 126231);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.game.gamewebview.ipc.IGWProcessService");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      v((Bundle)localObject1);
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(1);
        ((Bundle)localObject1).writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        GMTrace.o(16942438023168L, 126231);
        return true;
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(16945659248640L, 126255);
        this.mRemote = paramIBinder;
        GMTrace.o(16945659248640L, 126255);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(16945793466368L, 126256);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(16945793466368L, 126256);
        return localIBinder;
      }
      
      /* Error */
      public final void u(Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 39
        //   3: ldc 41
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: aload_2
        //   13: ldc 49
        //   15: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   18: aload_1
        //   19: ifnull +41 -> 60
        //   22: aload_2
        //   23: iconst_1
        //   24: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   27: aload_1
        //   28: aload_2
        //   29: iconst_0
        //   30: invokevirtual 63	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   33: aload_0
        //   34: getfield 27	com/tencent/mm/plugin/game/gamewebview/ipc/b$a$a:mRemote	Landroid/os/IBinder;
        //   37: iconst_1
        //   38: aload_2
        //   39: aconst_null
        //   40: iconst_1
        //   41: invokeinterface 69 5 0
        //   46: pop
        //   47: aload_2
        //   48: invokevirtual 72	android/os/Parcel:recycle	()V
        //   51: ldc2_w 39
        //   54: ldc 41
        //   56: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   59: return
        //   60: aload_2
        //   61: iconst_0
        //   62: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   65: goto -32 -> 33
        //   68: astore_1
        //   69: aload_2
        //   70: invokevirtual 72	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	paramBundle	Bundle
        //   11	59	2	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   12	18	68	finally
        //   22	33	68	finally
        //   33	47	68	finally
        //   60	65	68	finally
      }
      
      /* Error */
      public final void v(Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 74
        //   3: ldc 76
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 49
        //   19: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +61 -> 84
        //   26: aload_2
        //   27: iconst_1
        //   28: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   31: aload_1
        //   32: aload_2
        //   33: iconst_0
        //   34: invokevirtual 63	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/plugin/game/gamewebview/ipc/b$a$a:mRemote	Landroid/os/IBinder;
        //   41: iconst_2
        //   42: aload_2
        //   43: aload_3
        //   44: iconst_0
        //   45: invokeinterface 69 5 0
        //   50: pop
        //   51: aload_3
        //   52: invokevirtual 79	android/os/Parcel:readException	()V
        //   55: aload_3
        //   56: invokevirtual 83	android/os/Parcel:readInt	()I
        //   59: ifeq +8 -> 67
        //   62: aload_1
        //   63: aload_3
        //   64: invokevirtual 87	android/os/Bundle:readFromParcel	(Landroid/os/Parcel;)V
        //   67: aload_3
        //   68: invokevirtual 72	android/os/Parcel:recycle	()V
        //   71: aload_2
        //   72: invokevirtual 72	android/os/Parcel:recycle	()V
        //   75: ldc2_w 74
        //   78: ldc 76
        //   80: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   83: return
        //   84: aload_2
        //   85: iconst_0
        //   86: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   89: goto -52 -> 37
        //   92: astore_1
        //   93: aload_3
        //   94: invokevirtual 72	android/os/Parcel:recycle	()V
        //   97: aload_2
        //   98: invokevirtual 72	android/os/Parcel:recycle	()V
        //   101: aload_1
        //   102: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	103	0	this	a
        //   0	103	1	paramBundle	Bundle
        //   11	87	2	localParcel1	Parcel
        //   15	79	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	92	finally
        //   26	37	92	finally
        //   37	67	92	finally
        //   84	89	92	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */