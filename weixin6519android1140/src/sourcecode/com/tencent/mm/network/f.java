package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.a.b;
import com.tencent.mm.network.a.b.a.a;
import com.tencent.mm.protocal.ab;
import com.tencent.mm.protocal.ab.a.a;
import java.util.ArrayList;
import java.util.List;

public abstract interface f
  extends IInterface
{
  public abstract boolean DO();
  
  public abstract void Ea();
  
  public abstract void Eb();
  
  public abstract void OA();
  
  public abstract i OB();
  
  public abstract d Oz();
  
  public abstract int a(r paramr, l paraml);
  
  public abstract int a(String paramString, boolean paramBoolean, List<String> paramList);
  
  public abstract int a(boolean paramBoolean, List<String> paramList);
  
  public abstract void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean);
  
  public abstract void a(b paramb);
  
  public abstract void a(g paramg);
  
  public abstract void a(h paramh);
  
  public abstract void a(o paramo);
  
  public abstract void a(s params);
  
  public abstract void a(ab paramab);
  
  public abstract void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4);
  
  public abstract void bm(boolean paramBoolean);
  
  public abstract void bn(boolean paramBoolean);
  
  public abstract void bo(boolean paramBoolean);
  
  public abstract void bp(boolean paramBoolean);
  
  public abstract void cancel(int paramInt);
  
  public abstract void d(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract int g(int paramInt, byte[] paramArrayOfByte);
  
  public abstract int getHostByName(String paramString, List<String> paramList);
  
  public abstract String[] getIPsString(boolean paramBoolean);
  
  public abstract String getIspId();
  
  public abstract String getNetworkServerIp();
  
  public abstract void ij(String paramString);
  
  public abstract void ik(String paramString);
  
  public abstract void keepSignalling();
  
  public abstract void reportFailIp(String paramString);
  
  public abstract void reset();
  
  public abstract void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt);
  
  public abstract void setNewDnsDebugHost(String paramString1, String paramString2);
  
  public abstract void setSignallingStrategy(long paramLong1, long paramLong2);
  
  public abstract void stopSignalling();
  
  public static abstract class a
    extends Binder
    implements f
  {
    public a()
    {
      GMTrace.i(13699737714688L, 102071);
      attachInterface(this, "com.tencent.mm.network.IDispatcher_AIDL");
      GMTrace.o(13699737714688L, 102071);
    }
    
    public static f B(IBinder paramIBinder)
    {
      GMTrace.i(13699871932416L, 102072);
      if (paramIBinder == null)
      {
        GMTrace.o(13699871932416L, 102072);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof f)))
      {
        paramIBinder = (f)localIInterface;
        GMTrace.o(13699871932416L, 102072);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(13699871932416L, 102072);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(13700006150144L, 102073);
      GMTrace.o(13700006150144L, 102073);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(13700140367872L, 102074);
      boolean bool;
      Object localObject;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(13700140367872L, 102074);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.network.IDispatcher_AIDL");
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        localObject = r.a.F(paramParcel1.readStrongBinder());
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          paramInt1 = a((r)localObject, paramParcel1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(13700140367872L, 102074);
          return true;
          IInterface localIInterface = paramParcel1.queryLocalInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
          if ((localIInterface != null) && ((localIInterface instanceof l))) {
            paramParcel1 = (l)localIInterface;
          } else {
            paramParcel1 = new l.a.a(paramParcel1);
          }
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        cancel(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = Oz();
        paramParcel2.writeNoException();
        if (paramParcel1 != null) {}
        for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
        {
          paramParcel2.writeStrongBinder(paramParcel1);
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        reset();
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
          if ((localObject != null) && ((localObject instanceof ab))) {
            paramParcel1 = (ab)localObject;
          } else {
            paramParcel1 = new ab.a.a(paramParcel1);
          }
        }
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          a(bool, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createIntArray(), paramParcel1.createIntArray(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          paramParcel1 = getIPsString(bool);
          paramParcel2.writeNoException();
          paramParcel2.writeStringArray(paramParcel1);
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = getNetworkServerIp();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          bm(bool);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        d(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        setNewDnsDebugHost(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        OA();
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        bool = DO();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
          if ((localObject != null) && ((localObject instanceof b))) {
            paramParcel1 = (b)localObject;
          } else {
            paramParcel1 = new b.a.a(paramParcel1);
          }
        }
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        ij(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 16: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = OB();
        paramParcel2.writeNoException();
        if (paramParcel1 != null) {}
        for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
        {
          paramParcel2.writeStrongBinder(paramParcel1);
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 17: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = paramParcel1.readString();
        localObject = new ArrayList();
        paramInt1 = getHostByName(paramParcel1, (List)localObject);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        paramParcel2.writeStringList((List)localObject);
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 18: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          paramParcel1 = new ArrayList();
          paramInt1 = a(bool, paramParcel1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          paramParcel2.writeStringList(paramParcel1);
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 19: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        localObject = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          paramParcel1 = new ArrayList();
          paramInt1 = a((String)localObject, bool, paramParcel1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          paramParcel2.writeStringList(paramParcel1);
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 20: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        reportFailIp(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 21: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        setHostInfo(paramParcel1.createStringArray(), paramParcel1.createStringArray(), paramParcel1.createIntArray());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 22: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramInt1 = paramParcel1.readInt();
        localObject = paramParcel1.readString();
        paramInt2 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          a(paramInt1, (String)localObject, paramInt2, bool);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 23: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        Ea();
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 24: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = getIspId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 25: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramInt1 = g(paramParcel1.readInt(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 26: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        setSignallingStrategy(paramParcel1.readLong(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 27: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        keepSignalling();
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 28: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        stopSignalling();
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 29: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.network.IOnReportKV_AIDL");
          if ((localObject != null) && ((localObject instanceof o))) {
            paramParcel1 = (o)localObject;
          } else {
            paramParcel1 = new o.a.a(paramParcel1);
          }
        }
      case 30: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
          if ((localObject != null) && ((localObject instanceof s))) {
            paramParcel1 = (s)localObject;
          } else {
            paramParcel1 = new s.a.a(paramParcel1);
          }
        }
      case 31: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        paramParcel1 = paramParcel1.readStrongBinder();
        if (paramParcel1 == null) {
          paramParcel1 = null;
        }
        for (;;)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
          localObject = paramParcel1.queryLocalInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
          if ((localObject != null) && ((localObject instanceof g))) {
            paramParcel1 = (g)localObject;
          } else {
            paramParcel1 = new g.a.a(paramParcel1);
          }
        }
      case 32: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        ik(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      case 33: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          bn(bool);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 34: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          bo(bool);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 35: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          bp(bool);
          paramParcel2.writeNoException();
          GMTrace.o(13700140367872L, 102074);
          return true;
        }
      case 36: 
        paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        Eb();
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
      paramParcel1 = paramParcel1.readStrongBinder();
      if (paramParcel1 == null) {
        paramParcel1 = null;
      }
      for (;;)
      {
        a(paramParcel1);
        paramParcel2.writeNoException();
        GMTrace.o(13700140367872L, 102074);
        return true;
        localObject = paramParcel1.queryLocalInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
        if ((localObject != null) && ((localObject instanceof h))) {
          paramParcel1 = (h)localObject;
        } else {
          paramParcel1 = new h.a.a(paramParcel1);
        }
      }
    }
    
    private static final class a
      implements f
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(13680410361856L, 101927);
        this.mRemote = paramIBinder;
        GMTrace.o(13680410361856L, 101927);
      }
      
      public final boolean DO()
      {
        boolean bool = false;
        GMTrace.i(13682289410048L, 101941);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682289410048L, 101941);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void Ea()
      {
        GMTrace.i(13683631587328L, 101951);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(23, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683631587328L, 101951);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void Eb()
      {
        GMTrace.i(21016482938880L, 156585);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(36, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(21016482938880L, 156585);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void OA()
      {
        GMTrace.i(13682155192320L, 101940);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682155192320L, 101940);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final i OB()
      {
        GMTrace.i(13682692063232L, 101944);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i locali = i.a.C(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682692063232L, 101944);
          return locali;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final d Oz()
      {
        GMTrace.i(13680947232768L, 101931);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.A(localParcel2.readStrongBinder());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13680947232768L, 101931);
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final int a(r paramr, l paraml)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 4
        //   3: ldc2_w 104
        //   6: ldc 106
        //   8: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   14: astore 5
        //   16: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   19: astore 6
        //   21: aload 5
        //   23: ldc 44
        //   25: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   28: aload_1
        //   29: ifnull +83 -> 112
        //   32: aload_1
        //   33: invokeinterface 111 1 0
        //   38: astore_1
        //   39: aload 5
        //   41: aload_1
        //   42: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   45: aload 4
        //   47: astore_1
        //   48: aload_2
        //   49: ifnull +10 -> 59
        //   52: aload_2
        //   53: invokeinterface 117 1 0
        //   58: astore_1
        //   59: aload 5
        //   61: aload_1
        //   62: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   65: aload_0
        //   66: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   69: iconst_1
        //   70: aload 5
        //   72: aload 6
        //   74: iconst_0
        //   75: invokeinterface 54 5 0
        //   80: pop
        //   81: aload 6
        //   83: invokevirtual 57	android/os/Parcel:readException	()V
        //   86: aload 6
        //   88: invokevirtual 61	android/os/Parcel:readInt	()I
        //   91: istore_3
        //   92: aload 6
        //   94: invokevirtual 64	android/os/Parcel:recycle	()V
        //   97: aload 5
        //   99: invokevirtual 64	android/os/Parcel:recycle	()V
        //   102: ldc2_w 104
        //   105: ldc 106
        //   107: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   110: iload_3
        //   111: ireturn
        //   112: aconst_null
        //   113: astore_1
        //   114: goto -75 -> 39
        //   117: astore_1
        //   118: aload 6
        //   120: invokevirtual 64	android/os/Parcel:recycle	()V
        //   123: aload 5
        //   125: invokevirtual 64	android/os/Parcel:recycle	()V
        //   128: aload_1
        //   129: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	130	0	this	a
        //   0	130	1	paramr	r
        //   0	130	2	paraml	l
        //   91	20	3	i	int
        //   1	45	4	localObject	Object
        //   14	110	5	localParcel1	Parcel
        //   19	100	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   21	28	117	finally
        //   32	39	117	finally
        //   39	45	117	finally
        //   52	59	117	finally
        //   59	92	117	finally
      }
      
      public final int a(String paramString, boolean paramBoolean, List<String> paramList)
      {
        int i = 0;
        GMTrace.i(13683094716416L, 101947);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          localParcel2.readStringList(paramList);
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683094716416L, 101947);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int a(boolean paramBoolean, List<String> paramList)
      {
        int i = 0;
        GMTrace.i(13682960498688L, 101946);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          localParcel2.readStringList(paramList);
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682960498688L, 101946);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(13683497369600L, 101950);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt2);
          paramInt1 = i;
          if (paramBoolean) {
            paramInt1 = 1;
          }
          localParcel1.writeInt(paramInt1);
          this.mRemote.transact(22, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683497369600L, 101950);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void a(b paramb)
      {
        // Byte code:
        //   0: ldc2_w 145
        //   3: ldc -109
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +51 -> 74
        //   26: aload_1
        //   27: invokeinterface 150 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 14
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 57	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 64	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 64	android/os/Parcel:recycle	()V
        //   65: ldc2_w 145
        //   68: ldc -109
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 64	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 64	android/os/Parcel:recycle	()V
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
      
      /* Error */
      public final void a(g paramg)
      {
        // Byte code:
        //   0: ldc2_w 152
        //   3: ldc -102
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +51 -> 74
        //   26: aload_1
        //   27: invokeinterface 157 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 31
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 57	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 64	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 64	android/os/Parcel:recycle	()V
        //   65: ldc2_w 152
        //   68: ldc -102
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 64	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 64	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramg	g
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      /* Error */
      public final void a(h paramh)
      {
        // Byte code:
        //   0: ldc2_w 159
        //   3: ldc -95
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +51 -> 74
        //   26: aload_1
        //   27: invokeinterface 164 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 37
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 57	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 64	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 64	android/os/Parcel:recycle	()V
        //   65: ldc2_w 159
        //   68: ldc -95
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 64	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 64	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramh	h
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      /* Error */
      public final void a(o paramo)
      {
        // Byte code:
        //   0: ldc2_w 166
        //   3: ldc -88
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +51 -> 74
        //   26: aload_1
        //   27: invokeinterface 171 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 29
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 57	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 64	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 64	android/os/Parcel:recycle	()V
        //   65: ldc2_w 166
        //   68: ldc -88
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 64	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 64	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	paramo	o
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      /* Error */
      public final void a(s params)
      {
        // Byte code:
        //   0: ldc2_w 173
        //   3: ldc -81
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +51 -> 74
        //   26: aload_1
        //   27: invokeinterface 178 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   42: bipush 30
        //   44: aload_2
        //   45: aload_3
        //   46: iconst_0
        //   47: invokeinterface 54 5 0
        //   52: pop
        //   53: aload_3
        //   54: invokevirtual 57	android/os/Parcel:readException	()V
        //   57: aload_3
        //   58: invokevirtual 64	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 64	android/os/Parcel:recycle	()V
        //   65: ldc2_w 173
        //   68: ldc -81
        //   70: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -43 -> 33
        //   79: astore_1
        //   80: aload_3
        //   81: invokevirtual 64	android/os/Parcel:recycle	()V
        //   84: aload_2
        //   85: invokevirtual 64	android/os/Parcel:recycle	()V
        //   88: aload_1
        //   89: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	90	0	this	a
        //   0	90	1	params	s
        //   11	74	2	localParcel1	Parcel
        //   15	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	79	finally
        //   26	33	79	finally
        //   33	57	79	finally
      }
      
      /* Error */
      public final void a(ab paramab)
      {
        // Byte code:
        //   0: ldc2_w 180
        //   3: ldc -74
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +50 -> 73
        //   26: aload_1
        //   27: invokeinterface 185 1 0
        //   32: astore_1
        //   33: aload_2
        //   34: aload_1
        //   35: invokevirtual 114	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   38: aload_0
        //   39: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   42: iconst_5
        //   43: aload_2
        //   44: aload_3
        //   45: iconst_0
        //   46: invokeinterface 54 5 0
        //   51: pop
        //   52: aload_3
        //   53: invokevirtual 57	android/os/Parcel:readException	()V
        //   56: aload_3
        //   57: invokevirtual 64	android/os/Parcel:recycle	()V
        //   60: aload_2
        //   61: invokevirtual 64	android/os/Parcel:recycle	()V
        //   64: ldc2_w 180
        //   67: ldc -74
        //   69: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: return
        //   73: aconst_null
        //   74: astore_1
        //   75: goto -42 -> 33
        //   78: astore_1
        //   79: aload_3
        //   80: invokevirtual 64	android/os/Parcel:recycle	()V
        //   83: aload_2
        //   84: invokevirtual 64	android/os/Parcel:recycle	()V
        //   87: aload_1
        //   88: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	89	0	this	a
        //   0	89	1	paramab	ab
        //   11	73	2	localParcel1	Parcel
        //   15	65	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	78	finally
        //   26	33	78	finally
        //   33	56	78	finally
      }
      
      /* Error */
      public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
      {
        // Byte code:
        //   0: ldc2_w 187
        //   3: ldc -67
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 11
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 12
        //   18: aload 11
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: iload_1
        //   26: ifeq +108 -> 134
        //   29: iconst_1
        //   30: istore 10
        //   32: aload 11
        //   34: iload 10
        //   36: invokevirtual 128	android/os/Parcel:writeInt	(I)V
        //   39: aload 11
        //   41: aload_2
        //   42: invokevirtual 124	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   45: aload 11
        //   47: aload_3
        //   48: invokevirtual 124	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   51: aload 11
        //   53: aload 4
        //   55: invokevirtual 193	android/os/Parcel:writeIntArray	([I)V
        //   58: aload 11
        //   60: aload 5
        //   62: invokevirtual 193	android/os/Parcel:writeIntArray	([I)V
        //   65: aload 11
        //   67: iload 6
        //   69: invokevirtual 128	android/os/Parcel:writeInt	(I)V
        //   72: aload 11
        //   74: iload 7
        //   76: invokevirtual 128	android/os/Parcel:writeInt	(I)V
        //   79: aload 11
        //   81: aload 8
        //   83: invokevirtual 124	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   86: aload 11
        //   88: aload 9
        //   90: invokevirtual 124	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   93: aload_0
        //   94: getfield 27	com/tencent/mm/network/f$a$a:mRemote	Landroid/os/IBinder;
        //   97: bipush 6
        //   99: aload 11
        //   101: aload 12
        //   103: iconst_0
        //   104: invokeinterface 54 5 0
        //   109: pop
        //   110: aload 12
        //   112: invokevirtual 57	android/os/Parcel:readException	()V
        //   115: aload 12
        //   117: invokevirtual 64	android/os/Parcel:recycle	()V
        //   120: aload 11
        //   122: invokevirtual 64	android/os/Parcel:recycle	()V
        //   125: ldc2_w 187
        //   128: ldc -67
        //   130: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   133: return
        //   134: iconst_0
        //   135: istore 10
        //   137: goto -105 -> 32
        //   140: astore_2
        //   141: aload 12
        //   143: invokevirtual 64	android/os/Parcel:recycle	()V
        //   146: aload 11
        //   148: invokevirtual 64	android/os/Parcel:recycle	()V
        //   151: aload_2
        //   152: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	153	0	this	a
        //   0	153	1	paramBoolean	boolean
        //   0	153	2	paramString1	String
        //   0	153	3	paramString2	String
        //   0	153	4	paramArrayOfInt1	int[]
        //   0	153	5	paramArrayOfInt2	int[]
        //   0	153	6	paramInt1	int
        //   0	153	7	paramInt2	int
        //   0	153	8	paramString3	String
        //   0	153	9	paramString4	String
        //   30	106	10	i	int
        //   11	136	11	localParcel1	Parcel
        //   16	126	12	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	25	140	finally
        //   32	115	140	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(13680544579584L, 101928);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(13680544579584L, 101928);
        return localIBinder;
      }
      
      public final void bm(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(13681752539136L, 101937);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13681752539136L, 101937);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bn(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(13684973764608L, 101961);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(33, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13684973764608L, 101961);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bo(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(13685107982336L, 101962);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(34, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13685107982336L, 101962);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bp(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(13685242200064L, 101963);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(35, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13685242200064L, 101963);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void cancel(int paramInt)
      {
        GMTrace.i(13680813015040L, 101930);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13680813015040L, 101930);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void d(String paramString1, String paramString2, String paramString3, String paramString4)
      {
        GMTrace.i(13681886756864L, 101938);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeString(paramString4);
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13681886756864L, 101938);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int g(int paramInt, byte[] paramArrayOfByte)
      {
        GMTrace.i(13683900022784L, 101953);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(25, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683900022784L, 101953);
          return paramInt;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getHostByName(String paramString, List<String> paramList)
      {
        GMTrace.i(13682826280960L, 101945);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.readStringList(paramList);
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682826280960L, 101945);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String[] getIPsString(boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(13681484103680L, 101935);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String[] arrayOfString = localParcel2.createStringArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13681484103680L, 101935);
          return arrayOfString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getIspId()
      {
        GMTrace.i(13683765805056L, 101952);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(24, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683765805056L, 101952);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getNetworkServerIp()
      {
        GMTrace.i(13681618321408L, 101936);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13681618321408L, 101936);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ij(String paramString)
      {
        GMTrace.i(13682557845504L, 101943);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682557845504L, 101943);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ik(String paramString)
      {
        GMTrace.i(13684839546880L, 101960);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(32, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13684839546880L, 101960);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void keepSignalling()
      {
        GMTrace.i(13684168458240L, 101955);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(27, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13684168458240L, 101955);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void reportFailIp(String paramString)
      {
        GMTrace.i(13683228934144L, 101948);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683228934144L, 101948);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void reset()
      {
        GMTrace.i(13681081450496L, 101932);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13681081450496L, 101932);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
      {
        GMTrace.i(13683363151872L, 101949);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeStringArray(paramArrayOfString1);
          localParcel1.writeStringArray(paramArrayOfString2);
          localParcel1.writeIntArray(paramArrayOfInt);
          this.mRemote.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13683363151872L, 101949);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void setNewDnsDebugHost(String paramString1, String paramString2)
      {
        GMTrace.i(13682020974592L, 101939);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13682020974592L, 101939);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void setSignallingStrategy(long paramLong1, long paramLong2)
      {
        GMTrace.i(13684034240512L, 101954);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          localParcel1.writeLong(paramLong1);
          localParcel1.writeLong(paramLong2);
          this.mRemote.transact(26, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13684034240512L, 101954);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void stopSignalling()
      {
        GMTrace.i(13684302675968L, 101956);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
          this.mRemote.transact(28, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(13684302675968L, 101956);
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */