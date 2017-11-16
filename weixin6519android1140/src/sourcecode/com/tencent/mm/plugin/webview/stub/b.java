package com.tencent.mm.plugin.webview.stub;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;

public abstract interface b
  extends IInterface
{
  public abstract boolean bDd();
  
  public abstract boolean getResult();
  
  public abstract int getRet();
  
  public abstract int getType();
  
  public static abstract class a
    extends Binder
    implements b
  {
    public a()
    {
      GMTrace.i(12424937734144L, 92573);
      attachInterface(this, "com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
      GMTrace.o(12424937734144L, 92573);
    }
    
    public static b W(IBinder paramIBinder)
    {
      GMTrace.i(12425071951872L, 92574);
      if (paramIBinder == null)
      {
        GMTrace.o(12425071951872L, 92574);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof b)))
      {
        paramIBinder = (b)localIInterface;
        GMTrace.o(12425071951872L, 92574);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(12425071951872L, 92574);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(12425206169600L, 92575);
      GMTrace.o(12425206169600L, 92575);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int j = 0;
      int i = 0;
      GMTrace.i(12425340387328L, 92576);
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(12425340387328L, 92576);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        GMTrace.o(12425340387328L, 92576);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        bool = bDd();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12425340387328L, 92576);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        bool = getResult();
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12425340387328L, 92576);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        paramInt1 = getRet();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12425340387328L, 92576);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
      paramInt1 = getType();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      GMTrace.o(12425340387328L, 92576);
      return true;
    }
    
    private static final class a
      implements b
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(12449096925184L, 92753);
        this.mRemote = paramIBinder;
        GMTrace.o(12449096925184L, 92753);
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12449231142912L, 92754);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(12449231142912L, 92754);
        return localIBinder;
      }
      
      /* Error */
      public final boolean bDd()
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_2
        //   2: ldc2_w 39
        //   5: ldc 41
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore_3
        //   14: invokestatic 47	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   17: astore 4
        //   19: aload_3
        //   20: ldc 49
        //   22: invokevirtual 53	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_0
        //   26: getfield 27	com/tencent/mm/plugin/webview/stub/b$a$a:mRemote	Landroid/os/IBinder;
        //   29: iconst_1
        //   30: aload_3
        //   31: aload 4
        //   33: iconst_0
        //   34: invokeinterface 59 5 0
        //   39: pop
        //   40: aload 4
        //   42: invokevirtual 62	android/os/Parcel:readException	()V
        //   45: aload 4
        //   47: invokevirtual 66	android/os/Parcel:readInt	()I
        //   50: istore_1
        //   51: iload_1
        //   52: ifeq +22 -> 74
        //   55: aload 4
        //   57: invokevirtual 69	android/os/Parcel:recycle	()V
        //   60: aload_3
        //   61: invokevirtual 69	android/os/Parcel:recycle	()V
        //   64: ldc2_w 39
        //   67: ldc 41
        //   69: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: iload_2
        //   73: ireturn
        //   74: iconst_0
        //   75: istore_2
        //   76: goto -21 -> 55
        //   79: astore 5
        //   81: aload 4
        //   83: invokevirtual 69	android/os/Parcel:recycle	()V
        //   86: aload_3
        //   87: invokevirtual 69	android/os/Parcel:recycle	()V
        //   90: aload 5
        //   92: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	93	0	this	a
        //   50	2	1	i	int
        //   1	75	2	bool	boolean
        //   13	74	3	localParcel1	Parcel
        //   17	65	4	localParcel2	Parcel
        //   79	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   19	51	79	finally
      }
      
      public final boolean getResult()
      {
        boolean bool = false;
        GMTrace.i(12449499578368L, 92756);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12449499578368L, 92756);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getRet()
      {
        GMTrace.i(12449633796096L, 92757);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12449633796096L, 92757);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getType()
      {
        GMTrace.i(12449768013824L, 92758);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12449768013824L, 92758);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */