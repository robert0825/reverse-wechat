package com.tencent.mm.ipcinvoker.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface a
  extends IInterface
{
  public abstract void a(Bundle paramBundle, String paramString, b paramb);
  
  public abstract Bundle d(Bundle paramBundle, String paramString);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      GMTrace.i(18698811211776L, 139317);
      attachInterface(this, "com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
      GMTrace.o(18698811211776L, 139317);
    }
    
    public static a z(IBinder paramIBinder)
    {
      GMTrace.i(18698945429504L, 139318);
      if (paramIBinder == null)
      {
        GMTrace.o(18698945429504L, 139318);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
      {
        paramIBinder = (a)localIInterface;
        GMTrace.o(18698945429504L, 139318);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(18698945429504L, 139318);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(18699079647232L, 139319);
      GMTrace.o(18699079647232L, 139319);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = null;
      GMTrace.i(18699213864960L, 139320);
      switch (paramInt1)
      {
      default: 
        boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(18699213864960L, 139320);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
        GMTrace.o(18699213864960L, 139320);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
        String str;
        if (paramParcel1.readInt() != 0)
        {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          str = paramParcel1.readString();
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 != null) {
            break label153;
          }
          paramParcel1 = (Parcel)localObject;
        }
        for (;;)
        {
          a(paramParcel2, str, paramParcel1);
          GMTrace.o(18699213864960L, 139320);
          return true;
          paramParcel2 = null;
          break;
          label153:
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeCallback");
          if ((localObject != null) && ((localObject instanceof b))) {
            paramParcel1 = (b)localObject;
          } else {
            paramParcel1 = new b.a.a(paramParcel1);
          }
        }
      }
      paramParcel1.enforceInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
      if (paramParcel1.readInt() != 0)
      {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        paramParcel1 = d((Bundle)localObject, paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label270;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        GMTrace.o(18699213864960L, 139320);
        return true;
        localObject = null;
        break;
        label270:
        paramParcel2.writeInt(0);
      }
    }
    
    private static final class a
      implements a
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(18699348082688L, 139321);
        this.mRemote = paramIBinder;
        GMTrace.o(18699348082688L, 139321);
      }
      
      /* Error */
      public final void a(Bundle paramBundle, String paramString, b paramb)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 4
        //   3: ldc2_w 33
        //   6: ldc 35
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 41	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 5
        //   16: aload 5
        //   18: ldc 43
        //   20: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   23: aload_1
        //   24: ifnull +71 -> 95
        //   27: aload 5
        //   29: iconst_1
        //   30: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   33: aload_1
        //   34: aload 5
        //   36: iconst_0
        //   37: invokevirtual 57	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   40: aload 5
        //   42: aload_2
        //   43: invokevirtual 60	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload 4
        //   48: astore_1
        //   49: aload_3
        //   50: ifnull +10 -> 60
        //   53: aload_3
        //   54: invokeinterface 66 1 0
        //   59: astore_1
        //   60: aload 5
        //   62: aload_1
        //   63: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   66: aload_0
        //   67: getfield 27	com/tencent/mm/ipcinvoker/b/a$a$a:mRemote	Landroid/os/IBinder;
        //   70: iconst_1
        //   71: aload 5
        //   73: aconst_null
        //   74: iconst_1
        //   75: invokeinterface 75 5 0
        //   80: pop
        //   81: aload 5
        //   83: invokevirtual 78	android/os/Parcel:recycle	()V
        //   86: ldc2_w 33
        //   89: ldc 35
        //   91: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   94: return
        //   95: aload 5
        //   97: iconst_0
        //   98: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   101: goto -61 -> 40
        //   104: astore_1
        //   105: aload 5
        //   107: invokevirtual 78	android/os/Parcel:recycle	()V
        //   110: aload_1
        //   111: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	112	0	this	a
        //   0	112	1	paramBundle	Bundle
        //   0	112	2	paramString	String
        //   0	112	3	paramb	b
        //   1	46	4	localObject	Object
        //   14	92	5	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	23	104	finally
        //   27	40	104	finally
        //   40	46	104	finally
        //   53	60	104	finally
        //   60	81	104	finally
        //   95	101	104	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(18699482300416L, 139322);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(18699482300416L, 139322);
        return localIBinder;
      }
      
      public final Bundle d(Bundle paramBundle, String paramString)
      {
        GMTrace.i(18699750735872L, 139324);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              localParcel1.writeString(paramString);
              this.mRemote.transact(2, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(18699750735872L, 139324);
                return paramBundle;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramBundle = null;
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
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */