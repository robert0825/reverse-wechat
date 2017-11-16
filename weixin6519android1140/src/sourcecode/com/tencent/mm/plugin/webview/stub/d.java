package com.tencent.mm.plugin.webview.stub;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract interface d
  extends IInterface
{
  public abstract boolean Al();
  
  public abstract void E(String paramString1, String paramString2, int paramInt);
  
  public abstract List<String> Fu();
  
  public abstract boolean Fv();
  
  public abstract String LH(String paramString);
  
  public abstract String LI(String paramString);
  
  public abstract void LJ(String paramString);
  
  public abstract String LK(String paramString);
  
  public abstract boolean LL(String paramString);
  
  public abstract String LM(String paramString);
  
  public abstract void LN(String paramString);
  
  public abstract int LO(String paramString);
  
  public abstract void LP(String paramString);
  
  public abstract void LQ(String paramString);
  
  public abstract void LR(String paramString);
  
  public abstract String LS(String paramString);
  
  public abstract void S(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract b T(Bundle paramBundle);
  
  public abstract boolean U(Bundle paramBundle);
  
  public abstract void a(int paramInt1, Bundle paramBundle, int paramInt2);
  
  public abstract void a(e parame, int paramInt);
  
  public abstract void a(String paramString, Bundle paramBundle, int paramInt);
  
  public abstract boolean a(String paramString1, String paramString2, String paramString3, Bundle paramBundle1, Bundle paramBundle2, int paramInt);
  
  public abstract boolean a(String paramString, boolean paramBoolean, Bundle paramBundle);
  
  public abstract String aB(int paramInt, String paramString);
  
  public abstract boolean aDJ();
  
  public abstract void aF(String paramString, boolean paramBoolean);
  
  public abstract void aa(Intent paramIntent);
  
  public abstract String[] bDk();
  
  public abstract String bDl();
  
  public abstract String bDm();
  
  public abstract String bDn();
  
  public abstract Map bDo();
  
  public abstract int bDp();
  
  public abstract int bDq();
  
  public abstract void bDr();
  
  public abstract void bDs();
  
  public abstract boolean bDt();
  
  public abstract boolean bDu();
  
  public abstract boolean bDv();
  
  public abstract List<String> bDw();
  
  public abstract int bDx();
  
  public abstract boolean bDy();
  
  public abstract String[] bDz();
  
  public abstract boolean bP(String paramString);
  
  public abstract void ci(String paramString, int paramInt);
  
  public abstract String cj(String paramString, int paramInt);
  
  public abstract void ck(String paramString, int paramInt);
  
  public abstract Bundle d(int paramInt, Bundle paramBundle);
  
  public abstract int dG(int paramInt1, int paramInt2);
  
  public abstract void dH(int paramInt1, int paramInt2);
  
  public abstract String ek(String paramString1, String paramString2);
  
  public abstract void f(int paramInt, List<String> paramList);
  
  public abstract void f(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);
  
  public abstract boolean fC(String paramString);
  
  public abstract boolean fD(String paramString);
  
  public abstract void favEditTag();
  
  public abstract String fs(String paramString);
  
  public abstract void g(int paramInt, Bundle paramBundle);
  
  public abstract String getLanguage();
  
  public abstract boolean gm(String paramString);
  
  public abstract void i(String paramString, boolean paramBoolean, int paramInt);
  
  public abstract boolean isSDCardAvailable();
  
  public abstract Bundle n(int paramInt, Bundle paramBundle);
  
  public abstract void p(int paramInt, Bundle paramBundle);
  
  public abstract boolean q(int paramInt, Bundle paramBundle);
  
  public abstract boolean r(long paramLong, String paramString);
  
  public abstract boolean ty();
  
  public abstract void w(int paramInt, String paramString1, String paramString2);
  
  public abstract void xB(int paramInt);
  
  public abstract Bundle xD(int paramInt);
  
  public abstract boolean xE(int paramInt);
  
  public abstract void xF(int paramInt);
  
  public abstract void xG(int paramInt);
  
  public abstract void xH(int paramInt);
  
  public abstract String zA(String paramString);
  
  public static abstract class a
    extends Binder
    implements d
  {
    public a()
    {
      GMTrace.i(12430306443264L, 92613);
      attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
      GMTrace.o(12430306443264L, 92613);
    }
    
    public static d X(IBinder paramIBinder)
    {
      GMTrace.i(12430440660992L, 92614);
      if (paramIBinder == null)
      {
        GMTrace.o(12430440660992L, 92614);
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof d)))
      {
        paramIBinder = (d)localIInterface;
        GMTrace.o(12430440660992L, 92614);
        return paramIBinder;
      }
      paramIBinder = new a(paramIBinder);
      GMTrace.o(12430440660992L, 92614);
      return paramIBinder;
    }
    
    public IBinder asBinder()
    {
      GMTrace.i(12430574878720L, 92615);
      GMTrace.o(12430574878720L, 92615);
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      GMTrace.i(12430709096448L, 92616);
      boolean bool;
      Object localObject1;
      label1340:
      label1409:
      label1542:
      label1773:
      label1816:
      label1821:
      label2117:
      Object localObject2;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        GMTrace.o(12430709096448L, 92616);
        return bool;
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = LL(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = fs(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = fC(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = gm(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = fD(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = LH(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = ty();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = isSDCardAvailable();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = aDJ();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = Al();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = dG(paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        dH(paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = aB(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          a(paramInt1, (Bundle)localObject1, paramParcel1.readInt());
          paramParcel2.writeNoException();
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = T(paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label1340;
          }
        }
        for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
        {
          paramParcel2.writeStrongBinder(paramParcel1);
          GMTrace.o(12430709096448L, 92616);
          return true;
          paramParcel1 = null;
          break;
        }
      case 16: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          bool = U(paramParcel1);
          paramParcel2.writeNoException();
          if (!bool) {
            break label1409;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
          paramParcel1 = null;
          break;
        }
      case 17: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = LO(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 18: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        favEditTag();
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 19: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          bool = q(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          if (!bool) {
            break label1542;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
          paramParcel1 = null;
          break;
        }
      case 20: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = r(paramParcel1.readLong(), paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 21: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        LP(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 22: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = Fv();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 23: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = Fu();
        paramParcel2.writeNoException();
        paramParcel2.writeStringList(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 24: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        f(paramParcel1.readInt(), paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 25: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          bool = true;
          if (paramParcel1.readInt() == 0) {
            break label1816;
          }
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          bool = a((String)localObject1, bool, paramParcel1);
          paramParcel2.writeNoException();
          if (!bool) {
            break label1821;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
          bool = false;
          break;
          paramParcel1 = null;
          break label1773;
        }
      case 26: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = LI(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 27: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        ci(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 28: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          aF((String)localObject1, bool);
          paramParcel2.writeNoException();
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 29: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = bP(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 30: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          g(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 31: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = n(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label2117;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(12430709096448L, 92616);
          return true;
          paramParcel1 = null;
          break;
          paramParcel2.writeInt(0);
        }
      case 32: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          i((String)localObject1, bool, paramParcel1.readInt());
          paramParcel2.writeNoException();
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 33: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = xD(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(12430709096448L, 92616);
          return true;
          paramParcel2.writeInt(0);
        }
      case 34: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = xE(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 35: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        String str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        String str3 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label2396;
          }
          localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          bool = a(str1, str2, str3, (Bundle)localObject1, (Bundle)localObject2, paramParcel1.readInt());
          paramParcel2.writeNoException();
          if (!bool) {
            break label2402;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
          localObject1 = null;
          break;
          localObject2 = null;
          break label2344;
        }
      case 36: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        E(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 37: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          a((String)localObject2, (Bundle)localObject1, paramParcel1.readInt());
          paramParcel2.writeNoException();
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 38: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        LJ(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 39: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = LK(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 40: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        S(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 41: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        a(e.a.Y(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 42: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        xF(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 43: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDk();
        paramParcel2.writeNoException();
        paramParcel2.writeStringArray(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 44: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDl();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 45: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = zA(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 46: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDm();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 47: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = LM(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 48: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDo();
        paramParcel2.writeNoException();
        paramParcel2.writeMap(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 49: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = ek(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 50: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        LN(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 51: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = cj(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 52: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = getLanguage();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 53: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDn();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 54: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = bDp();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 55: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = bDq();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 56: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bDr();
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 57: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bDs();
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 58: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        xG(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 59: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        xH(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 60: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        xB(paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 61: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        ck(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 62: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = bDt();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 63: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = LS(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 64: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = bDv();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 65: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = bDu();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 66: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        bool = bDy();
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 67: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        LQ(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 68: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        LR(paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 69: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        f(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 70: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = d(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label3623;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          GMTrace.o(12430709096448L, 92616);
          return true;
          paramParcel1 = null;
          break;
          paramParcel2.writeInt(0);
        }
      case 71: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          aa(paramParcel1);
          paramParcel2.writeNoException();
          GMTrace.o(12430709096448L, 92616);
          return true;
        }
      case 72: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        w(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 73: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDw();
        paramParcel2.writeNoException();
        paramParcel2.writeStringList(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 74: 
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramInt1 = bDx();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      case 75: 
        label2344:
        label2396:
        label2402:
        label3623:
        paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
        paramParcel1 = bDz();
        paramParcel2.writeNoException();
        paramParcel2.writeStringArray(paramParcel1);
        GMTrace.o(12430709096448L, 92616);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        p(paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        GMTrace.o(12430709096448L, 92616);
        return true;
      }
    }
    
    private static final class a
      implements d
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        GMTrace.i(12430843314176L, 92617);
        this.mRemote = paramIBinder;
        GMTrace.o(12430843314176L, 92617);
      }
      
      public final boolean Al()
      {
        boolean bool = false;
        GMTrace.i(12432319709184L, 92628);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12432319709184L, 92628);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void E(String paramString1, String paramString2, int paramInt)
      {
        GMTrace.i(12435675152384L, 92653);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(36, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12435675152384L, 92653);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final List<String> Fu()
      {
        GMTrace.i(12434064539648L, 92641);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(23, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ArrayList localArrayList = localParcel2.createStringArrayList();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12434064539648L, 92641);
          return localArrayList;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean Fv()
      {
        boolean bool = false;
        GMTrace.i(12433930321920L, 92640);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(22, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12433930321920L, 92640);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String LH(String paramString)
      {
        GMTrace.i(12431782838272L, 92624);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12431782838272L, 92624);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String LI(String paramString)
      {
        GMTrace.i(12434467192832L, 92644);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(26, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12434467192832L, 92644);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void LJ(String paramString)
      {
        GMTrace.i(12435943587840L, 92655);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(38, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12435943587840L, 92655);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String LK(String paramString)
      {
        GMTrace.i(12436077805568L, 92656);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(39, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12436077805568L, 92656);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean LL(String paramString)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_3
        //   2: ldc2_w 115
        //   5: ldc 117
        //   7: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   13: astore 4
        //   15: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   18: astore 5
        //   20: aload 4
        //   22: ldc 44
        //   24: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   27: aload 4
        //   29: aload_1
        //   30: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   33: aload_0
        //   34: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   37: iconst_1
        //   38: aload 4
        //   40: aload 5
        //   42: iconst_0
        //   43: invokeinterface 54 5 0
        //   48: pop
        //   49: aload 5
        //   51: invokevirtual 57	android/os/Parcel:readException	()V
        //   54: aload 5
        //   56: invokevirtual 61	android/os/Parcel:readInt	()I
        //   59: istore_2
        //   60: iload_2
        //   61: ifeq +23 -> 84
        //   64: aload 5
        //   66: invokevirtual 64	android/os/Parcel:recycle	()V
        //   69: aload 4
        //   71: invokevirtual 64	android/os/Parcel:recycle	()V
        //   74: ldc2_w 115
        //   77: ldc 117
        //   79: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   82: iload_3
        //   83: ireturn
        //   84: iconst_0
        //   85: istore_3
        //   86: goto -22 -> 64
        //   89: astore_1
        //   90: aload 5
        //   92: invokevirtual 64	android/os/Parcel:recycle	()V
        //   95: aload 4
        //   97: invokevirtual 64	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	paramString	String
        //   59	2	2	i	int
        //   1	85	3	bool	boolean
        //   13	83	4	localParcel1	Parcel
        //   18	73	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   20	60	89	finally
      }
      
      public final String LM(String paramString)
      {
        GMTrace.i(12437151547392L, 92664);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(47, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437151547392L, 92664);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void LN(String paramString)
      {
        GMTrace.i(12437554200576L, 92667);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(50, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437554200576L, 92667);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int LO(String paramString)
      {
        GMTrace.i(12433259233280L, 92635);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12433259233280L, 92635);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void LP(String paramString)
      {
        GMTrace.i(12433796104192L, 92639);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12433796104192L, 92639);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void LQ(String paramString)
      {
        GMTrace.i(12439835901952L, 92684);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(67, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439835901952L, 92684);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void LR(String paramString)
      {
        GMTrace.i(12439970119680L, 92685);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(68, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439970119680L, 92685);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String LS(String paramString)
      {
        GMTrace.i(12439299031040L, 92680);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(63, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439299031040L, 92680);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void S(int paramInt1, int paramInt2, int paramInt3)
      {
        GMTrace.i(12436212023296L, 92657);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          this.mRemote.transact(40, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12436212023296L, 92657);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final b T(Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 154
        //   3: ldc -100
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_2
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore_3
        //   16: aload_2
        //   17: ldc 44
        //   19: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   22: aload_1
        //   23: ifnull +59 -> 82
        //   26: aload_2
        //   27: iconst_1
        //   28: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   31: aload_1
        //   32: aload_2
        //   33: iconst_0
        //   34: invokevirtual 162	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   41: bipush 15
        //   43: aload_2
        //   44: aload_3
        //   45: iconst_0
        //   46: invokeinterface 54 5 0
        //   51: pop
        //   52: aload_3
        //   53: invokevirtual 57	android/os/Parcel:readException	()V
        //   56: aload_3
        //   57: invokevirtual 166	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   60: invokestatic 172	com/tencent/mm/plugin/webview/stub/b$a:W	(Landroid/os/IBinder;)Lcom/tencent/mm/plugin/webview/stub/b;
        //   63: astore_1
        //   64: aload_3
        //   65: invokevirtual 64	android/os/Parcel:recycle	()V
        //   68: aload_2
        //   69: invokevirtual 64	android/os/Parcel:recycle	()V
        //   72: ldc2_w 154
        //   75: ldc -100
        //   77: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   80: aload_1
        //   81: areturn
        //   82: aload_2
        //   83: iconst_0
        //   84: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   87: goto -50 -> 37
        //   90: astore_1
        //   91: aload_3
        //   92: invokevirtual 64	android/os/Parcel:recycle	()V
        //   95: aload_2
        //   96: invokevirtual 64	android/os/Parcel:recycle	()V
        //   99: aload_1
        //   100: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	101	0	this	a
        //   0	101	1	paramBundle	Bundle
        //   11	85	2	localParcel1	Parcel
        //   15	77	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	90	finally
        //   26	37	90	finally
        //   37	64	90	finally
        //   82	87	90	finally
      }
      
      public final boolean U(Bundle paramBundle)
      {
        boolean bool = true;
        GMTrace.i(12433125015552L, 92634);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(16, localParcel1, localParcel2, 0);
              localParcel2.readException();
              int i = localParcel2.readInt();
              if (i != 0)
              {
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12433125015552L, 92634);
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
      public final void a(int paramInt1, Bundle paramBundle, int paramInt2)
      {
        // Byte code:
        //   0: ldc2_w 179
        //   3: ldc -75
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 4
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 5
        //   18: aload 4
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload 4
        //   27: iload_1
        //   28: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   31: aload_2
        //   32: ifnull +63 -> 95
        //   35: aload 4
        //   37: iconst_1
        //   38: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   41: aload_2
        //   42: aload 4
        //   44: iconst_0
        //   45: invokevirtual 162	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   48: aload 4
        //   50: iload_3
        //   51: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   54: aload_0
        //   55: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   58: bipush 14
        //   60: aload 4
        //   62: aload 5
        //   64: iconst_0
        //   65: invokeinterface 54 5 0
        //   70: pop
        //   71: aload 5
        //   73: invokevirtual 57	android/os/Parcel:readException	()V
        //   76: aload 5
        //   78: invokevirtual 64	android/os/Parcel:recycle	()V
        //   81: aload 4
        //   83: invokevirtual 64	android/os/Parcel:recycle	()V
        //   86: ldc2_w 179
        //   89: ldc -75
        //   91: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   94: return
        //   95: aload 4
        //   97: iconst_0
        //   98: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   101: goto -53 -> 48
        //   104: astore_2
        //   105: aload 5
        //   107: invokevirtual 64	android/os/Parcel:recycle	()V
        //   110: aload 4
        //   112: invokevirtual 64	android/os/Parcel:recycle	()V
        //   115: aload_2
        //   116: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	117	0	this	a
        //   0	117	1	paramInt1	int
        //   0	117	2	paramBundle	Bundle
        //   0	117	3	paramInt2	int
        //   11	100	4	localParcel1	Parcel
        //   16	90	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	31	104	finally
        //   35	48	104	finally
        //   48	76	104	finally
        //   95	101	104	finally
      }
      
      /* Error */
      public final void a(e parame, int paramInt)
      {
        // Byte code:
        //   0: ldc2_w 183
        //   3: ldc -71
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore_3
        //   12: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   15: astore 4
        //   17: aload_3
        //   18: ldc 44
        //   20: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   23: aload_1
        //   24: ifnull +59 -> 83
        //   27: aload_1
        //   28: invokeinterface 190 1 0
        //   33: astore_1
        //   34: aload_3
        //   35: aload_1
        //   36: invokevirtual 193	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   39: aload_3
        //   40: iload_2
        //   41: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   48: bipush 41
        //   50: aload_3
        //   51: aload 4
        //   53: iconst_0
        //   54: invokeinterface 54 5 0
        //   59: pop
        //   60: aload 4
        //   62: invokevirtual 57	android/os/Parcel:readException	()V
        //   65: aload 4
        //   67: invokevirtual 64	android/os/Parcel:recycle	()V
        //   70: aload_3
        //   71: invokevirtual 64	android/os/Parcel:recycle	()V
        //   74: ldc2_w 183
        //   77: ldc -71
        //   79: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   82: return
        //   83: aconst_null
        //   84: astore_1
        //   85: goto -51 -> 34
        //   88: astore_1
        //   89: aload 4
        //   91: invokevirtual 64	android/os/Parcel:recycle	()V
        //   94: aload_3
        //   95: invokevirtual 64	android/os/Parcel:recycle	()V
        //   98: aload_1
        //   99: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	100	0	this	a
        //   0	100	1	parame	e
        //   0	100	2	paramInt	int
        //   11	84	3	localParcel1	Parcel
        //   15	75	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   17	23	88	finally
        //   27	34	88	finally
        //   34	65	88	finally
      }
      
      /* Error */
      public final void a(String paramString, Bundle paramBundle, int paramInt)
      {
        // Byte code:
        //   0: ldc2_w 195
        //   3: ldc -59
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 4
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 5
        //   18: aload 4
        //   20: ldc 44
        //   22: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   25: aload 4
        //   27: aload_1
        //   28: invokevirtual 72	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   31: aload_2
        //   32: ifnull +63 -> 95
        //   35: aload 4
        //   37: iconst_1
        //   38: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   41: aload_2
        //   42: aload 4
        //   44: iconst_0
        //   45: invokevirtual 162	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   48: aload 4
        //   50: iload_3
        //   51: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   54: aload_0
        //   55: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   58: bipush 37
        //   60: aload 4
        //   62: aload 5
        //   64: iconst_0
        //   65: invokeinterface 54 5 0
        //   70: pop
        //   71: aload 5
        //   73: invokevirtual 57	android/os/Parcel:readException	()V
        //   76: aload 5
        //   78: invokevirtual 64	android/os/Parcel:recycle	()V
        //   81: aload 4
        //   83: invokevirtual 64	android/os/Parcel:recycle	()V
        //   86: ldc2_w 195
        //   89: ldc -59
        //   91: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   94: return
        //   95: aload 4
        //   97: iconst_0
        //   98: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   101: goto -53 -> 48
        //   104: astore_1
        //   105: aload 5
        //   107: invokevirtual 64	android/os/Parcel:recycle	()V
        //   110: aload 4
        //   112: invokevirtual 64	android/os/Parcel:recycle	()V
        //   115: aload_1
        //   116: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	117	0	this	a
        //   0	117	1	paramString	String
        //   0	117	2	paramBundle	Bundle
        //   0	117	3	paramInt	int
        //   11	100	4	localParcel1	Parcel
        //   16	90	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	31	104	finally
        //   35	48	104	finally
        //   48	76	104	finally
        //   95	101	104	finally
      }
      
      public final boolean a(String paramString1, String paramString2, String paramString3, Bundle paramBundle1, Bundle paramBundle2, int paramInt)
      {
        GMTrace.i(12435540934656L, 92652);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            localParcel1.writeString(paramString3);
            if (paramBundle1 != null)
            {
              localParcel1.writeInt(1);
              paramBundle1.writeToParcel(localParcel1, 0);
              if (paramBundle2 != null)
              {
                localParcel1.writeInt(1);
                paramBundle2.writeToParcel(localParcel1, 0);
                localParcel1.writeInt(paramInt);
                this.mRemote.transact(35, localParcel1, localParcel2, 0);
                localParcel2.readException();
                paramInt = localParcel2.readInt();
                if (paramInt == 0) {
                  break label177;
                }
                bool = true;
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12435540934656L, 92652);
                return bool;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          continue;
          label177:
          boolean bool = false;
        }
      }
      
      public final boolean a(String paramString, boolean paramBoolean, Bundle paramBundle)
      {
        boolean bool = true;
        GMTrace.i(12434332975104L, 92643);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        label150:
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            localParcel1.writeString(paramString);
            int i;
            if (paramBoolean)
            {
              i = 1;
              localParcel1.writeInt(i);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.mRemote.transact(25, localParcel1, localParcel2, 0);
                localParcel2.readException();
                i = localParcel2.readInt();
                if (i == 0) {
                  break label150;
                }
                paramBoolean = bool;
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12434332975104L, 92643);
                return paramBoolean;
              }
            }
            else
            {
              i = 0;
              continue;
            }
            localParcel1.writeInt(0);
            continue;
            paramBoolean = false;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public final String aB(int paramInt, String paramString)
      {
        GMTrace.i(12432722362368L, 92631);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12432722362368L, 92631);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean aDJ()
      {
        boolean bool = false;
        GMTrace.i(12432185491456L, 92627);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12432185491456L, 92627);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void aF(String paramString, boolean paramBoolean)
      {
        int i = 0;
        GMTrace.i(12434735628288L, 92646);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.mRemote.transact(28, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12434735628288L, 92646);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void aa(Intent paramIntent)
      {
        // Byte code:
        //   0: ldc2_w 222
        //   3: ldc -32
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
        //   26: aload_2
        //   27: iconst_1
        //   28: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   31: aload_1
        //   32: aload_2
        //   33: iconst_0
        //   34: invokevirtual 227	android/content/Intent:writeToParcel	(Landroid/os/Parcel;I)V
        //   37: aload_0
        //   38: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   41: bipush 71
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
        //   64: ldc2_w 222
        //   67: ldc -32
        //   69: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   72: return
        //   73: aload_2
        //   74: iconst_0
        //   75: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   78: goto -41 -> 37
        //   81: astore_1
        //   82: aload_3
        //   83: invokevirtual 64	android/os/Parcel:recycle	()V
        //   86: aload_2
        //   87: invokevirtual 64	android/os/Parcel:recycle	()V
        //   90: aload_1
        //   91: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	92	0	this	a
        //   0	92	1	paramIntent	Intent
        //   11	76	2	localParcel1	Parcel
        //   15	68	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   16	22	81	finally
        //   26	37	81	finally
        //   37	56	81	finally
        //   73	78	81	finally
      }
      
      public final IBinder asBinder()
      {
        GMTrace.i(12430977531904L, 92618);
        IBinder localIBinder = this.mRemote;
        GMTrace.o(12430977531904L, 92618);
        return localIBinder;
      }
      
      public final String[] bDk()
      {
        GMTrace.i(12436614676480L, 92660);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(43, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String[] arrayOfString = localParcel2.createStringArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12436614676480L, 92660);
          return arrayOfString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String bDl()
      {
        GMTrace.i(12436748894208L, 92661);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(44, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12436748894208L, 92661);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String bDm()
      {
        GMTrace.i(12437017329664L, 92663);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(46, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437017329664L, 92663);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String bDn()
      {
        GMTrace.i(12437956853760L, 92670);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(53, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437956853760L, 92670);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final Map bDo()
      {
        GMTrace.i(12437285765120L, 92665);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(48, localParcel1, localParcel2, 0);
          localParcel2.readException();
          HashMap localHashMap = localParcel2.readHashMap(getClass().getClassLoader());
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437285765120L, 92665);
          return localHashMap;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int bDp()
      {
        GMTrace.i(12438091071488L, 92671);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(54, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438091071488L, 92671);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int bDq()
      {
        GMTrace.i(12438225289216L, 92672);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(55, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438225289216L, 92672);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bDr()
      {
        GMTrace.i(12438359506944L, 92673);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(56, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438359506944L, 92673);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void bDs()
      {
        GMTrace.i(12438493724672L, 92674);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(57, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438493724672L, 92674);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bDt()
      {
        boolean bool = false;
        GMTrace.i(12439164813312L, 92679);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(62, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439164813312L, 92679);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bDu()
      {
        boolean bool = false;
        GMTrace.i(12439567466496L, 92682);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(65, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439567466496L, 92682);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bDv()
      {
        boolean bool = false;
        GMTrace.i(12439433248768L, 92681);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(64, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439433248768L, 92681);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final List<String> bDw()
      {
        GMTrace.i(12440641208320L, 92690);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(73, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ArrayList localArrayList = localParcel2.createStringArrayList();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12440641208320L, 92690);
          return localArrayList;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int bDx()
      {
        GMTrace.i(12440775426048L, 92691);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(74, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12440775426048L, 92691);
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bDy()
      {
        boolean bool = false;
        GMTrace.i(12439701684224L, 92683);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(66, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439701684224L, 92683);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String[] bDz()
      {
        GMTrace.i(12440909643776L, 92692);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(75, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String[] arrayOfString = localParcel2.createStringArray();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12440909643776L, 92692);
          return arrayOfString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean bP(String paramString)
      {
        boolean bool = false;
        GMTrace.i(12434869846016L, 92647);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(29, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12434869846016L, 92647);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ci(String paramString, int paramInt)
      {
        GMTrace.i(12434601410560L, 92645);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(27, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12434601410560L, 92645);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String cj(String paramString, int paramInt)
      {
        GMTrace.i(12437688418304L, 92668);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(51, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437688418304L, 92668);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ck(String paramString, int paramInt)
      {
        GMTrace.i(12439030595584L, 92678);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(61, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12439030595584L, 92678);
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
        GMTrace.i(12440238555136L, 92687);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(70, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12440238555136L, 92687);
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
      
      public final int dG(int paramInt1, int paramInt2)
      {
        GMTrace.i(12432453926912L, 92629);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt1 = localParcel2.readInt();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12432453926912L, 92629);
          return paramInt1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void dH(int paramInt1, int paramInt2)
      {
        GMTrace.i(12432588144640L, 92630);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12432588144640L, 92630);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String ek(String paramString1, String paramString2)
      {
        GMTrace.i(12437419982848L, 92666);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(49, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString1 = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437419982848L, 92666);
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void f(int paramInt, List<String> paramList)
      {
        GMTrace.i(12434198757376L, 92642);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeStringList(paramList);
          this.mRemote.transact(24, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12434198757376L, 92642);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void f(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
      {
        GMTrace.i(16337384505344L, 121723);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeString(paramString3);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          this.mRemote.transact(69, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(16337384505344L, 121723);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean fC(String paramString)
      {
        boolean bool = false;
        GMTrace.i(12431380185088L, 92621);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12431380185088L, 92621);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean fD(String paramString)
      {
        boolean bool = false;
        GMTrace.i(12431648620544L, 92623);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12431648620544L, 92623);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void favEditTag()
      {
        GMTrace.i(12433393451008L, 92636);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12433393451008L, 92636);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String fs(String paramString)
      {
        GMTrace.i(12431245967360L, 92620);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12431245967360L, 92620);
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void g(int paramInt, Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 394
        //   3: ldc_w 396
        //   6: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   9: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   12: astore_3
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 4
        //   18: aload_3
        //   19: ldc 44
        //   21: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   24: aload_3
        //   25: iload_1
        //   26: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: ifnull +54 -> 84
        //   33: aload_3
        //   34: iconst_1
        //   35: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   38: aload_2
        //   39: aload_3
        //   40: iconst_0
        //   41: invokevirtual 162	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   48: bipush 30
        //   50: aload_3
        //   51: aload 4
        //   53: iconst_0
        //   54: invokeinterface 54 5 0
        //   59: pop
        //   60: aload 4
        //   62: invokevirtual 57	android/os/Parcel:readException	()V
        //   65: aload 4
        //   67: invokevirtual 64	android/os/Parcel:recycle	()V
        //   70: aload_3
        //   71: invokevirtual 64	android/os/Parcel:recycle	()V
        //   74: ldc2_w 394
        //   77: ldc_w 396
        //   80: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   83: return
        //   84: aload_3
        //   85: iconst_0
        //   86: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   89: goto -45 -> 44
        //   92: astore_2
        //   93: aload 4
        //   95: invokevirtual 64	android/os/Parcel:recycle	()V
        //   98: aload_3
        //   99: invokevirtual 64	android/os/Parcel:recycle	()V
        //   102: aload_2
        //   103: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	104	0	this	a
        //   0	104	1	paramInt	int
        //   0	104	2	paramBundle	Bundle
        //   12	87	3	localParcel1	Parcel
        //   16	78	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	29	92	finally
        //   33	44	92	finally
        //   44	65	92	finally
        //   84	89	92	finally
      }
      
      public final String getLanguage()
      {
        GMTrace.i(12437822636032L, 92669);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(52, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12437822636032L, 92669);
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean gm(String paramString)
      {
        boolean bool = false;
        GMTrace.i(12431514402816L, 92622);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12431514402816L, 92622);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void i(String paramString, boolean paramBoolean, int paramInt)
      {
        int i = 0;
        GMTrace.i(12435138281472L, 92649);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(32, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12435138281472L, 92649);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean isSDCardAvailable()
      {
        boolean bool = false;
        GMTrace.i(12432051273728L, 92626);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12432051273728L, 92626);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final Bundle n(int paramInt, Bundle paramBundle)
      {
        GMTrace.i(16230278758400L, 120925);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(31, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(16230278758400L, 120925);
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
      
      /* Error */
      public final void p(int paramInt, Bundle paramBundle)
      {
        // Byte code:
        //   0: ldc2_w 418
        //   3: ldc_w 420
        //   6: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   9: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   12: astore_3
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 4
        //   18: aload_3
        //   19: ldc 44
        //   21: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   24: aload_3
        //   25: iload_1
        //   26: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: ifnull +54 -> 84
        //   33: aload_3
        //   34: iconst_1
        //   35: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   38: aload_2
        //   39: aload_3
        //   40: iconst_0
        //   41: invokevirtual 162	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   44: aload_0
        //   45: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   48: bipush 76
        //   50: aload_3
        //   51: aload 4
        //   53: iconst_0
        //   54: invokeinterface 54 5 0
        //   59: pop
        //   60: aload 4
        //   62: invokevirtual 57	android/os/Parcel:readException	()V
        //   65: aload 4
        //   67: invokevirtual 64	android/os/Parcel:recycle	()V
        //   70: aload_3
        //   71: invokevirtual 64	android/os/Parcel:recycle	()V
        //   74: ldc2_w 418
        //   77: ldc_w 420
        //   80: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   83: return
        //   84: aload_3
        //   85: iconst_0
        //   86: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   89: goto -45 -> 44
        //   92: astore_2
        //   93: aload 4
        //   95: invokevirtual 64	android/os/Parcel:recycle	()V
        //   98: aload_3
        //   99: invokevirtual 64	android/os/Parcel:recycle	()V
        //   102: aload_2
        //   103: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	104	0	this	a
        //   0	104	1	paramInt	int
        //   0	104	2	paramBundle	Bundle
        //   12	87	3	localParcel1	Parcel
        //   16	78	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	29	92	finally
        //   33	44	92	finally
        //   44	65	92	finally
        //   84	89	92	finally
      }
      
      public final boolean q(int paramInt, Bundle paramBundle)
      {
        boolean bool = true;
        GMTrace.i(12433527668736L, 92637);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
            localParcel1.writeInt(paramInt);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.mRemote.transact(19, localParcel1, localParcel2, 0);
              localParcel2.readException();
              paramInt = localParcel2.readInt();
              if (paramInt != 0)
              {
                localParcel2.recycle();
                localParcel1.recycle();
                GMTrace.o(12433527668736L, 92637);
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
      
      public final boolean r(long paramLong, String paramString)
      {
        boolean bool = false;
        GMTrace.i(12433661886464L, 92638);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeLong(paramLong);
          localParcel1.writeString(paramString);
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12433661886464L, 92638);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean ty()
      {
        boolean bool = false;
        GMTrace.i(12431917056000L, 92625);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12431917056000L, 92625);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void w(int paramInt, String paramString1, String paramString2)
      {
        GMTrace.i(12440506990592L, 92689);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.mRemote.transact(72, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12440506990592L, 92689);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void xB(int paramInt)
      {
        GMTrace.i(12438896377856L, 92677);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(60, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438896377856L, 92677);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final Bundle xD(int paramInt)
      {
        // Byte code:
        //   0: ldc2_w 450
        //   3: ldc_w 452
        //   6: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   9: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   12: astore_3
        //   13: invokestatic 42	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   16: astore 4
        //   18: aload_3
        //   19: ldc 44
        //   21: invokevirtual 48	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   24: aload_3
        //   25: iload_1
        //   26: invokevirtual 76	android/os/Parcel:writeInt	(I)V
        //   29: aload_0
        //   30: getfield 27	com/tencent/mm/plugin/webview/stub/d$a$a:mRemote	Landroid/os/IBinder;
        //   33: bipush 33
        //   35: aload_3
        //   36: aload 4
        //   38: iconst_0
        //   39: invokeinterface 54 5 0
        //   44: pop
        //   45: aload 4
        //   47: invokevirtual 57	android/os/Parcel:readException	()V
        //   50: aload 4
        //   52: invokevirtual 61	android/os/Parcel:readInt	()I
        //   55: ifeq +37 -> 92
        //   58: getstatic 340	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
        //   61: aload 4
        //   63: invokeinterface 346 2 0
        //   68: checkcast 158	android/os/Bundle
        //   71: astore_2
        //   72: aload 4
        //   74: invokevirtual 64	android/os/Parcel:recycle	()V
        //   77: aload_3
        //   78: invokevirtual 64	android/os/Parcel:recycle	()V
        //   81: ldc2_w 450
        //   84: ldc_w 452
        //   87: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   90: aload_2
        //   91: areturn
        //   92: aconst_null
        //   93: astore_2
        //   94: goto -22 -> 72
        //   97: astore_2
        //   98: aload 4
        //   100: invokevirtual 64	android/os/Parcel:recycle	()V
        //   103: aload_3
        //   104: invokevirtual 64	android/os/Parcel:recycle	()V
        //   107: aload_2
        //   108: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	109	0	this	a
        //   0	109	1	paramInt	int
        //   71	23	2	localBundle	Bundle
        //   97	11	2	localObject	Object
        //   12	92	3	localParcel1	Parcel
        //   16	83	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   18	72	97	finally
      }
      
      public final boolean xE(int paramInt)
      {
        boolean bool = false;
        GMTrace.i(12435406716928L, 92651);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(34, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt = localParcel2.readInt();
          if (paramInt != 0) {
            bool = true;
          }
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12435406716928L, 92651);
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void xF(int paramInt)
      {
        GMTrace.i(12436480458752L, 92659);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(42, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12436480458752L, 92659);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void xG(int paramInt)
      {
        GMTrace.i(12438627942400L, 92675);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(58, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438627942400L, 92675);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void xH(int paramInt)
      {
        GMTrace.i(12438762160128L, 92676);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(59, localParcel1, localParcel2, 0);
          localParcel2.readException();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12438762160128L, 92676);
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String zA(String paramString)
      {
        GMTrace.i(12436883111936L, 92662);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.WebViewStub_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(45, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          localParcel2.recycle();
          localParcel1.recycle();
          GMTrace.o(12436883111936L, 92662);
          return paramString;
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\stub\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */