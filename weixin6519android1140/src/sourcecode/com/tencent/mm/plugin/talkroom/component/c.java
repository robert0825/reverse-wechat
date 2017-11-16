package com.tencent.mm.plugin.talkroom.component;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface c
  extends IInterface
{
  public abstract void j(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public static abstract class a
    extends Binder
    implements c
  {
    public a()
    {
      GMTrace.i(5184965050368L, 38631);
      attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
      GMTrace.o(5184965050368L, 38631);
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(5185099268096L, 38632);
      GMTrace.o(5185099268096L, 38632);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(5185233485824L, 38633);
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(5185233485824L, 38633);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
        GMTrace.o(5185233485824L, 38633);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        j(paramInt1, paramInt2, bool);
        paramParcel2.writeNoException();
        GMTrace.o(5185233485824L, 38633);
        return true;
      }
    }
    
    private static final class a
      implements c
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(5191810154496L, 38682);
        this.mRemote = paramIBinder;
        GMTrace.o(5191810154496L, 38682);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(5191944372224L, 38683);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(5191944372224L, 38683);
        return localIBinder;
      }
      
      /* Error */
      public final void j(int paramInt1, int paramInt2, boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 4
        //   3: ldc2_w 39
        //   6: ldc 41
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 5
        //   16: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 6
        //   21: aload 5
        //   23: ldc 49
        //   25: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload 5
        //   30: iload_1
        //   31: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   34: aload 5
        //   36: iload_2
        //   37: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   40: iload_3
        //   41: ifeq +52 -> 93
        //   44: iload 4
        //   46: istore_1
        //   47: aload 5
        //   49: iload_1
        //   50: invokevirtual 57	android/os/Parcel:writeInt	(I)V
        //   53: aload_0
        //   54: getfield 27	com/tencent/mm/plugin/talkroom/component/c$a$a:mRemote	Landroid/os/IBinder;
        //   57: iconst_1
        //   58: aload 5
        //   60: aload 6
        //   62: iconst_0
        //   63: invokeinterface 63 5 0
        //   68: pop
        //   69: aload 6
        //   71: invokevirtual 66	android/os/Parcel:readException	()V
        //   74: aload 6
        //   76: invokevirtual 69	android/os/Parcel:recycle	()V
        //   79: aload 5
        //   81: invokevirtual 69	android/os/Parcel:recycle	()V
        //   84: ldc2_w 39
        //   87: ldc 41
        //   89: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   92: return
        //   93: iconst_0
        //   94: istore_1
        //   95: goto -48 -> 47
        //   98: astore 7
        //   100: aload 6
        //   102: invokevirtual 69	android/os/Parcel:recycle	()V
        //   105: aload 5
        //   107: invokevirtual 69	android/os/Parcel:recycle	()V
        //   110: aload 7
        //   112: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	113	0	this	a
        //   0	113	1	paramInt1	int
        //   0	113	2	paramInt2	int
        //   0	113	3	paramBoolean	boolean
        //   1	44	4	i	int
        //   14	92	5	localParcel1	Parcel
        //   19	82	6	localParcel2	Parcel
        //   98	13	7	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   21	40	98	finally
        //   47	74	98	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\component\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */