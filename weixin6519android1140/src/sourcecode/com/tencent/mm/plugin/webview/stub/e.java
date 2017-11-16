package com.tencent.mm.plugin.webview.stub;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public abstract interface e
  extends IInterface
{
  public abstract void LF(String paramString);
  
  public abstract void Q(Bundle paramBundle);
  
  public abstract void R(Bundle paramBundle);
  
  public abstract String Zi();
  
  public abstract boolean a(c paramc);
  
  public abstract boolean a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean);
  
  public abstract String bDg();
  
  public abstract String bDh();
  
  public abstract void bDi();
  
  public abstract void bDj();
  
  public abstract Bundle d(int paramInt, Bundle paramBundle);
  
  public abstract void e(String paramString1, String paramString2, int paramInt1, int paramInt2);
  
  public abstract void ei(String paramString1, String paramString2);
  
  public abstract void ej(String paramString1, String paramString2);
  
  public abstract void jt(boolean paramBoolean);
  
  public abstract void ju(boolean paramBoolean);
  
  public abstract void jv(boolean paramBoolean);
  
  public abstract boolean m(int paramInt, Bundle paramBundle);
  
  public abstract void o(int paramInt, Bundle paramBundle);
  
  public abstract boolean xC(int paramInt);
  
  public static abstract class a
    extends Binder
    implements e
  {
    public a()
    {
      GMTrace.i(12441178079232L, 92694);
      attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      GMTrace.o(12441178079232L, 92694);
    }
    
    public static e Y(IBinder paramIBinder)
    {
      GMTrace.i(12441312296960L, 92695);
      if (paramIBinder == null)
      {
        GMTrace.o(12441312296960L, 92695);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof e)))
      {
        paramIBinder = (e)localIInterface;
        GMTrace.o(12441312296960L, 92695);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(12441312296960L, 92695);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(12441446514688L, 92696);
      GMTrace.o(12441446514688L, 92696);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str1 = null;
      Object localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      String str2 = null;
      int j = 0;
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      int i = 0;
      GMTrace.i(12441580732416L, 92697);
      switch (paramInt1)
      {
      default: 
        bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(12441580732416L, 92697);
        return bool1;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        bool1 = xC(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (bool1) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12441580732416L, 92697);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramInt1 = paramParcel1.readInt();
        localObject1 = str2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        bool1 = m(paramInt1, (Bundle)localObject1);
        paramParcel2.writeNoException();
        if (bool1)
        {
          paramInt1 = 1;
          paramParcel2.writeInt(paramInt1);
          if (localObject1 == null) {
            break label402;
          }
          paramParcel2.writeInt(1);
          ((Bundle)localObject1).writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(12441580732416L, 92697);
          return true;
          paramInt1 = 0;
          break;
          paramParcel2.writeInt(0);
        }
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = str1;
        }
        for (;;)
        {
          bool1 = a(paramParcel1);
          paramParcel2.writeNoException();
          paramInt1 = i;
          if (bool1) {
            paramInt1 = 1;
          }
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12441580732416L, 92697);
          return true;
          localObject1 = paramParcel1.queryLocalInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
          if ((localObject1 != null) && ((localObject1 instanceof c))) {
            paramParcel1 = (c)localObject1;
          } else {
            paramParcel1 = new c.a.a(paramParcel1);
          }
        }
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        str1 = paramParcel1.readString();
        str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          bool1 = a(str1, str2, (Bundle)localObject1, bool1);
          paramParcel2.writeNoException();
          paramInt1 = j;
          if (bool1) {
            paramInt1 = 1;
          }
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12441580732416L, 92697);
          return true;
        }
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramParcel1 = bDg();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramParcel1 = Zi();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramParcel1 = bDh();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        jt(bool1);
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        bool1 = bool2;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        ju(bool1);
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramInt1 = paramParcel1.readInt();
        localObject1 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        o(paramInt1, (Bundle)localObject1);
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        bDi();
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        localObject1 = localObject3;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        Q((Bundle)localObject1);
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        LF(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        ei(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        bDj();
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 16: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        e(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 17: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        paramInt1 = paramParcel1.readInt();
        localObject1 = localObject4;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = d(paramInt1, (Bundle)localObject1);
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(12441580732416L, 92697);
          return true;
          paramParcel2.writeInt(0);
        }
      case 18: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        localObject1 = localObject5;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        R((Bundle)localObject1);
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      case 19: 
        label402:
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        bool1 = bool3;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        jv(bool1);
        paramParcel2.writeNoException();
        GMTrace.o(12441580732416L, 92697);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
      ej(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      GMTrace.o(12441580732416L, 92697);
      return true;
    }
    
    private static final class a
      implements e
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(12405610381312L, 92429);
        this.mRemote = paramIBinder;
        GMTrace.o(12405610381312L, 92429);
      }
      
      public final void LF(String paramString)
      {
        GMTrace.i(12407489429504L, 92443);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12407489429504L, 92443);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void Q(Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 65
        //   3: ldc 67
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +50 -> 73
        //   26: aload_2
        //   27: iconst_1
        //   28: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   31: aload_1
        //   32: aload_2
        //   33: iconst_0
        //   34: invokevirtual 77	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/plugin/webview/stub/e$a$a:mRemote	Landroid/os/IBinder;
        //   41: bipush 12
        //   43: aload_2
        //   44: aload_3
        //   45: iconst_0
        //   46: invokeinterface 56 5 0
        //   51: pop
        //   52: aload_3
        //   53: invokevirtual 59	android/os/Parcel:readException	()V
        //   56: aload_3
        //   57: invokevirtual 62	android/os/Parcel:recycle	()V
        //   60: aload_2
        //   61: invokevirtual 62	android/os/Parcel:recycle	()V
        //   64: ldc2_w 65
        //   67: ldc 67
        //   69: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: return
        //   73: aload_2
        //   74: iconst_0
        //   75: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   78: goto -41 -> 37
        //   81: astore_1
        //   82: aload_3
        //   83: invokevirtual 62	android/os/Parcel:recycle	()V
        //   86: aload_2
        //   87: invokevirtual 62	android/os/Parcel:recycle	()V
        //   90: aload_1
        //   91: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	92	0	this	a
        //   0	92	1	paramBundle	Bundle
        //   11	76	2	localParcel1	Parcel
        //   15	68	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	81	finally
        //   26	37	81	finally
        //   37	56	81	finally
        //   73	78	81	finally
      }
      
      /* Error */
      public final void R(Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 79
        //   3: ldc 81
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +50 -> 73
        //   26: aload_2
        //   27: iconst_1
        //   28: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   31: aload_1
        //   32: aload_2
        //   33: iconst_0
        //   34: invokevirtual 77	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/plugin/webview/stub/e$a$a:mRemote	Landroid/os/IBinder;
        //   41: bipush 18
        //   43: aload_2
        //   44: aload_3
        //   45: iconst_0
        //   46: invokeinterface 56 5 0
        //   51: pop
        //   52: aload_3
        //   53: invokevirtual 59	android/os/Parcel:readException	()V
        //   56: aload_3
        //   57: invokevirtual 62	android/os/Parcel:recycle	()V
        //   60: aload_2
        //   61: invokevirtual 62	android/os/Parcel:recycle	()V
        //   64: ldc2_w 79
        //   67: ldc 81
        //   69: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: return
        //   73: aload_2
        //   74: iconst_0
        //   75: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   78: goto -41 -> 37
        //   81: astore_1
        //   82: aload_3
        //   83: invokevirtual 62	android/os/Parcel:recycle	()V
        //   86: aload_2
        //   87: invokevirtual 62	android/os/Parcel:recycle	()V
        //   90: aload_1
        //   91: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	92	0	this	a
        //   0	92	1	paramBundle	Bundle
        //   11	76	2	localParcel1	Parcel
        //   15	68	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	81	finally
        //   26	37	81	finally
        //   37	56	81	finally
        //   73	78	81	finally
      }
      
      public final String Zi()
      {
        GMTrace.i(12406549905408L, 92436);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12406549905408L, 92436);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean a(c paramc)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: ldc2_w 91
        //   5: ldc 93
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 44
        //   24: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload_1
        //   28: ifnull +69 -> 97
        //   31: aload_1
        //   32: invokeinterface 99 1 0
        //   37: astore_1
        //   38: aload 4
        //   40: aload_1
        //   41: invokevirtual 102	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/webview/stub/e$a$a:mRemote	Landroid/os/IBinder;
        //   48: iconst_3
        //   49: aload 4
        //   51: aload 5
        //   53: iconst_0
        //   54: invokeinterface 56 5 0
        //   59: pop
        //   60: aload 5
        //   62: invokevirtual 59	android/os/Parcel:readException	()V
        //   65: aload 5
        //   67: invokevirtual 106	android/os/Parcel:readInt	()I
        //   70: istore_2
        //   71: iload_2
        //   72: ifeq +5 -> 77
        //   75: iconst_1
        //   76: istore_3
        //   77: aload 5
        //   79: invokevirtual 62	android/os/Parcel:recycle	()V
        //   82: aload 4
        //   84: invokevirtual 62	android/os/Parcel:recycle	()V
        //   87: ldc2_w 91
        //   90: ldc 93
        //   92: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   95: iload_3
        //   96: ireturn
        //   97: aconst_null
        //   98: astore_1
        //   99: goto -61 -> 38
        //   102: astore_1
        //   103: aload 5
        //   105: invokevirtual 62	android/os/Parcel:recycle	()V
        //   108: aload 4
        //   110: invokevirtual 62	android/os/Parcel:recycle	()V
        //   113: aload_1
        //   114: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	115	0	this	a
        //   0	115	1	paramc	c
        //   70	2	2	i	int
        //   1	95	3	bool	boolean
        //   13	96	4	localParcel1	Parcel
        //   18	86	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	27	102	finally
        //   31	38	102	finally
        //   38	71	102	finally
      }
      
      public final boolean a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
      {
        boolean bool = true;
        GMTrace.i(12406281469952L, 92434);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              break label159;
              localParcel1.writeInt(i);
              this.mRemote.transact(4, localParcel1, localParcel2, 0);
              localParcel2.readException();
              i = localParcel2.readInt();
              if (i != 0)
              {
                paramBoolean = bool;
                label104:
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12406281469952L, 92434);
                return paramBoolean;
              }
            }
            else
            {
              localParcel1.writeInt(0);
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          label159:
          do
          {
            i = 0;
            break;
            paramBoolean = false;
            break label104;
          } while (!paramBoolean);
          int i = 1;
        }
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12405744599040L, 92430);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(12405744599040L, 92430);
        return localIBinder;
      }
      
      public final String bDg()
      {
        GMTrace.i(12406415687680L, 92435);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12406415687680L, 92435);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String bDh()
      {
        GMTrace.i(12406684123136L, 92437);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12406684123136L, 92437);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bDi()
      {
        GMTrace.i(12407220994048L, 92441);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12407220994048L, 92441);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bDj()
      {
        GMTrace.i(12407757864960L, 92445);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12407757864960L, 92445);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final Bundle d(int paramInt, Bundle paramBundle)
      {
        GMTrace.i(12408026300416L, 92447);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(17, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12408026300416L, 92447);
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
      
      public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
      {
        GMTrace.i(12407892082688L, 92446);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12407892082688L, 92446);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ei(String paramString1, String paramString2)
      {
        GMTrace.i(12407623647232L, 92444);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12407623647232L, 92444);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ej(String paramString1, String paramString2)
      {
        GMTrace.i(16002913927168L, 119231);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16002913927168L, 119231);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void jt(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(12406818340864L, 92438);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12406818340864L, 92438);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ju(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(12406952558592L, 92439);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12406952558592L, 92439);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void jv(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(12408294735872L, 92449);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12408294735872L, 92449);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean m(int paramInt, Bundle paramBundle)
      {
        boolean bool = true;
        GMTrace.i(12406013034496L, 92432);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(2, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                if (localParcel2.readInt() != 0) {
                  paramBundle.readFromParcel(localParcel2);
                }
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12406013034496L, 92432);
                return bool;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            bool = false;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public final void o(int paramInt, Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 182
        //   3: ldc -72
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_3
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore 4
        //   17: aload_3
        //   18: ldc 44
        //   20: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   23: aload_3
        //   24: iload_1
        //   25: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   28: aload_2
        //   29: ifnull +53 -> 82
        //   32: aload_3
        //   33: iconst_1
        //   34: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokevirtual 77	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   43: aload_0
        //   44: getfield 27	com/tencent/mm/plugin/webview/stub/e$a$a:mRemote	Landroid/os/IBinder;
        //   47: bipush 10
        //   49: aload_3
        //   50: aload 4
        //   52: iconst_0
        //   53: invokeinterface 56 5 0
        //   58: pop
        //   59: aload 4
        //   61: invokevirtual 59	android/os/Parcel:readException	()V
        //   64: aload 4
        //   66: invokevirtual 62	android/os/Parcel:recycle	()V
        //   69: aload_3
        //   70: invokevirtual 62	android/os/Parcel:recycle	()V
        //   73: ldc2_w 182
        //   76: ldc -72
        //   78: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   81: return
        //   82: aload_3
        //   83: iconst_0
        //   84: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   87: goto -44 -> 43
        //   90: astore_2
        //   91: aload 4
        //   93: invokevirtual 62	android/os/Parcel:recycle	()V
        //   96: aload_3
        //   97: invokevirtual 62	android/os/Parcel:recycle	()V
        //   100: aload_2
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	paramInt	int
        //   0	102	2	paramBundle	Bundle
        //   11	86	3	localParcel1	Parcel
        //   15	77	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   17	28	90	finally
        //   32	43	90	finally
        //   43	64	90	finally
        //   82	87	90	finally
      }
      
      /* Error */
      public final boolean xC(int paramInt)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_2
        //   2: ldc2_w 187
        //   5: ldc -67
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore_3
        //   14: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   17: astore 4
        //   19: aload_3
        //   20: ldc 44
        //   22: invokevirtual 47	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload_3
        //   26: iload_1
        //   27: invokevirtual 71	android/os/Parcel:writeInt	(I)V
        //   30: aload_0
        //   31: getfield 27	com/tencent/mm/plugin/webview/stub/e$a$a:mRemote	Landroid/os/IBinder;
        //   34: iconst_1
        //   35: aload_3
        //   36: aload 4
        //   38: iconst_0
        //   39: invokeinterface 56 5 0
        //   44: pop
        //   45: aload 4
        //   47: invokevirtual 59	android/os/Parcel:readException	()V
        //   50: aload 4
        //   52: invokevirtual 106	android/os/Parcel:readInt	()I
        //   55: istore_1
        //   56: iload_1
        //   57: ifeq +22 -> 79
        //   60: aload 4
        //   62: invokevirtual 62	android/os/Parcel:recycle	()V
        //   65: aload_3
        //   66: invokevirtual 62	android/os/Parcel:recycle	()V
        //   69: ldc2_w 187
        //   72: ldc -67
        //   74: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   77: iload_2
        //   78: ireturn
        //   79: iconst_0
        //   80: istore_2
        //   81: goto -21 -> 60
        //   84: astore 5
        //   86: aload 4
        //   88: invokevirtual 62	android/os/Parcel:recycle	()V
        //   91: aload_3
        //   92: invokevirtual 62	android/os/Parcel:recycle	()V
        //   95: aload 5
        //   97: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	98	0	this	a
        //   0	98	1	paramInt	int
        //   1	80	2	bool	boolean
        //   13	79	3	localParcel1	Parcel
        //   17	70	4	localParcel2	Parcel
        //   84	12	5	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   19	56	84	finally
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */