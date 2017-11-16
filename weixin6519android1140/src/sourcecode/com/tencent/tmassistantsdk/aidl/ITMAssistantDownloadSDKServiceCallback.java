package com.tencent.tmassistantsdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface ITMAssistantDownloadSDKServiceCallback
  extends IInterface
{
  public abstract void OnDownloadSDKServiceTaskProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2);
  
  public abstract void OnDownloadSDKServiceTaskStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2);
  
  public static abstract class Stub
    extends Binder
    implements ITMAssistantDownloadSDKServiceCallback
  {
    private static final String DESCRIPTOR = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";
    static final int TRANSACTION_OnDownloadSDKServiceTaskProgressChanged = 2;
    static final int TRANSACTION_OnDownloadSDKServiceTaskStateChanged = 1;
    
    public Stub()
    {
      attachInterface(this, "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
    }
    
    public static ITMAssistantDownloadSDKServiceCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      if ((localIInterface != null) && ((localIInterface instanceof ITMAssistantDownloadSDKServiceCallback))) {
        return (ITMAssistantDownloadSDKServiceCallback)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
        String str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        String str3 = paramParcel1.readString();
        boolean bool1;
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label138;
          }
        }
        label138:
        for (boolean bool2 = true;; bool2 = false)
        {
          OnDownloadSDKServiceTaskStateChanged(str1, str2, paramInt1, paramInt2, str3, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
          bool1 = false;
          break;
        }
      }
      paramParcel1.enforceInterface("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
      OnDownloadSDKServiceTaskProgressChanged(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class Proxy
      implements ITMAssistantDownloadSDKServiceCallback
    {
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public void OnDownloadSDKServiceTaskProgressChanged(String paramString1, String paramString2, long paramLong1, long paramLong2)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeLong(paramLong1);
          localParcel1.writeLong(paramLong2);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void OnDownloadSDKServiceTaskStateChanged(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 8
        //   3: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 9
        //   8: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 10
        //   13: aload 9
        //   15: ldc 30
        //   17: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload 9
        //   22: aload_1
        //   23: invokevirtual 37	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   26: aload 9
        //   28: aload_2
        //   29: invokevirtual 37	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   32: aload 9
        //   34: iload_3
        //   35: invokevirtual 59	android/os/Parcel:writeInt	(I)V
        //   38: aload 9
        //   40: iload 4
        //   42: invokevirtual 59	android/os/Parcel:writeInt	(I)V
        //   45: aload 9
        //   47: aload 5
        //   49: invokevirtual 37	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   52: iload 6
        //   54: ifeq +57 -> 111
        //   57: iconst_1
        //   58: istore_3
        //   59: aload 9
        //   61: iload_3
        //   62: invokevirtual 59	android/os/Parcel:writeInt	(I)V
        //   65: iload 7
        //   67: ifeq +49 -> 116
        //   70: iload 8
        //   72: istore_3
        //   73: aload 9
        //   75: iload_3
        //   76: invokevirtual 59	android/os/Parcel:writeInt	(I)V
        //   79: aload_0
        //   80: getfield 19	com/tencent/tmassistantsdk/aidl/ITMAssistantDownloadSDKServiceCallback$Stub$Proxy:mRemote	Landroid/os/IBinder;
        //   83: iconst_1
        //   84: aload 9
        //   86: aload 10
        //   88: iconst_0
        //   89: invokeinterface 47 5 0
        //   94: pop
        //   95: aload 10
        //   97: invokevirtual 50	android/os/Parcel:readException	()V
        //   100: aload 10
        //   102: invokevirtual 53	android/os/Parcel:recycle	()V
        //   105: aload 9
        //   107: invokevirtual 53	android/os/Parcel:recycle	()V
        //   110: return
        //   111: iconst_0
        //   112: istore_3
        //   113: goto -54 -> 59
        //   116: iconst_0
        //   117: istore_3
        //   118: goto -45 -> 73
        //   121: astore_1
        //   122: aload 10
        //   124: invokevirtual 53	android/os/Parcel:recycle	()V
        //   127: aload 9
        //   129: invokevirtual 53	android/os/Parcel:recycle	()V
        //   132: aload_1
        //   133: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	134	0	this	Proxy
        //   0	134	1	paramString1	String
        //   0	134	2	paramString2	String
        //   0	134	3	paramInt1	int
        //   0	134	4	paramInt2	int
        //   0	134	5	paramString3	String
        //   0	134	6	paramBoolean1	boolean
        //   0	134	7	paramBoolean2	boolean
        //   1	70	8	i	int
        //   6	122	9	localParcel1	Parcel
        //   11	112	10	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	52	121	finally
        //   59	65	121	finally
        //   73	100	121	finally
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public String getInterfaceDescriptor()
      {
        return "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\aidl\ITMAssistantDownloadSDKServiceCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */