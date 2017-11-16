package com.tencent.mm.plugin.exdevice.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.a.f.6;
import com.tencent.mm.plugin.g.a.a.f.7;
import com.tencent.mm.plugin.g.a.a.h;
import com.tencent.mm.plugin.g.a.b.e.4;
import com.tencent.mm.plugin.g.a.b.e.5;
import com.tencent.mm.plugin.g.a.b.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import junit.framework.Assert;

public final class y
  extends h.a
  implements g, com.tencent.mm.plugin.g.a.a.b, com.tencent.mm.plugin.g.a.d.a.a
{
  private RemoteCallbackList<t> kDA;
  com.tencent.mm.plugin.g.a.b.e kDB;
  private e.a kDC;
  private a kDm;
  private RemoteCallbackList<k> kDn;
  private RemoteCallbackList<p> kDo;
  private RemoteCallbackList<j> kDp;
  private RemoteCallbackList<i> kDq;
  private RemoteCallbackList<q> kDr;
  private RemoteCallbackList<n> kDs;
  private final l kDt;
  private int kDu;
  private final com.tencent.mm.plugin.g.a.a.f kDv;
  private final com.tencent.mm.plugin.g.a.d.a kDw;
  private RemoteCallbackList<j> kDx;
  private RemoteCallbackList<k> kDy;
  private RemoteCallbackList<s> kDz;
  private final ae mHandler;
  
  public y()
  {
    GMTrace.i(16665278414848L, 124166);
    this.kDm = null;
    this.kDn = new RemoteCallbackList();
    this.kDo = new RemoteCallbackList();
    this.kDp = new RemoteCallbackList();
    this.kDq = new RemoteCallbackList();
    this.kDr = new RemoteCallbackList();
    this.kDs = new RemoteCallbackList();
    this.kDt = new l();
    this.kDu = 0;
    this.kDx = new RemoteCallbackList();
    this.kDy = new RemoteCallbackList();
    this.kDz = new RemoteCallbackList();
    this.kDA = new RemoteCallbackList();
    this.kDm = new a(this);
    this.mHandler = new a(v.auu().kxr.ngv.getLooper());
    if (Build.VERSION.SDK_INT >= 18) {}
    for (this.kDv = new com.tencent.mm.plugin.g.a.a.f(this);; this.kDv = null)
    {
      this.kDw = new com.tencent.mm.plugin.g.a.d.a(this);
      this.kDC = new e.a()
      {
        public final void a(long paramAnonymousLong1, boolean paramAnonymousBoolean, long paramAnonymousLong2)
        {
          GMTrace.i(11127723393024L, 82908);
          Object localObject;
          if (paramAnonymousBoolean)
          {
            localObject = "true";
            w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onConnected. seesionId=%d, connected=%s, profileType=%d", new Object[] { Long.valueOf(paramAnonymousLong1), localObject, Long.valueOf(paramAnonymousLong2) });
            localObject = new y.c();
            ((y.c)localObject).joF = paramAnonymousLong1;
            if (!paramAnonymousBoolean) {
              break label157;
            }
          }
          label157:
          for (int i = 2;; i = 4)
          {
            ((y.c)localObject).kCE = i;
            ((y.c)localObject).kCD = 1;
            ((y.c)localObject).kwP = 0;
            ((y.c)localObject).jlY = paramAnonymousLong2;
            if (!y.a(y.this).sendMessage(y.a(y.this).obtainMessage(9, localObject))) {
              w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(9) });
            }
            GMTrace.o(11127723393024L, 82908);
            return;
            localObject = "false";
            break;
          }
        }
        
        public final void a(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(11128126046208L, 82911);
          w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDiscover. deviceMac=%s, deviceName=%s", new Object[] { paramAnonymousString1, paramAnonymousString2 });
          y.g localg = new y.g();
          localg.kDH = false;
          localg.joI = paramAnonymousString1;
          localg.joJ = paramAnonymousString2;
          localg.joK = paramAnonymousInt;
          localg.kDI = paramAnonymousArrayOfByte;
          if (!y.a(y.this).sendMessage(y.a(y.this).obtainMessage(13, localg))) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(13) });
          }
          GMTrace.o(11128126046208L, 82911);
        }
        
        public final void ahb()
        {
          GMTrace.i(11128260263936L, 82912);
          w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDiscoverFinished");
          y.g localg = new y.g();
          localg.kDH = true;
          localg.joI = null;
          localg.joJ = null;
          localg.joK = 0;
          localg.kDI = null;
          if (!y.a(y.this).sendMessage(y.a(y.this).obtainMessage(13, localg))) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(13) });
          }
          GMTrace.o(11128260263936L, 82912);
        }
        
        public final void b(long paramAnonymousLong, byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(11127857610752L, 82909);
          y.f localf = new y.f();
          localf.kzS = paramAnonymousLong;
          localf.jkV = paramAnonymousArrayOfByte;
          if (!y.a(y.this).sendMessage(y.a(y.this).obtainMessage(12, localf))) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(12) });
          }
          GMTrace.o(11127857610752L, 82909);
        }
        
        public final void e(long paramAnonymousLong, boolean paramAnonymousBoolean)
        {
          GMTrace.i(11127991828480L, 82910);
          Object localObject;
          if (paramAnonymousBoolean)
          {
            localObject = "true";
            w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onSend. sessionId=%d, success=%s", new Object[] { Long.valueOf(paramAnonymousLong), localObject });
            localObject = new y.h();
            ((y.h)localObject).kzS = paramAnonymousLong;
            if (!paramAnonymousBoolean) {
              break label139;
            }
            ((y.h)localObject).kxb = 0;
          }
          for (((y.h)localObject).kwP = 0;; ((y.h)localObject).kwP = -1)
          {
            ((y.h)localObject).kxc = "";
            if (!y.a(y.this).sendMessage(y.a(y.this).obtainMessage(11, localObject))) {
              w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(11) });
            }
            GMTrace.o(11127991828480L, 82910);
            return;
            localObject = "false";
            break;
            label139:
            ((y.h)localObject).kxb = -1;
          }
        }
      };
      com.tencent.mm.compatible.a.a.a(18, new com.tencent.mm.compatible.a.a.a()
      {
        public final void run()
        {
          GMTrace.i(11125844344832L, 82894);
          y.a(y.this, new com.tencent.mm.plugin.g.a.b.e(y.b(y.this)));
          GMTrace.o(11125844344832L, 82894);
        }
      });
      GMTrace.o(16665278414848L, 124166);
      return;
    }
  }
  
  private static IInterface a(long paramLong, RemoteCallbackList paramRemoteCallbackList, int paramInt)
  {
    GMTrace.i(11137252851712L, 82979);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "findCallbackbyId, Id = %d, count = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    int i = 0;
    while (i < paramInt)
    {
      HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(i);
      if (localHashMap.containsKey(Long.valueOf(paramLong)))
      {
        paramRemoteCallbackList = (IInterface)localHashMap.get(Long.valueOf(paramLong));
        GMTrace.o(11137252851712L, 82979);
        return paramRemoteCallbackList;
      }
      i += 1;
    }
    w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find id in the callback list");
    GMTrace.o(11137252851712L, 82979);
    return null;
  }
  
  private static boolean a(RemoteCallbackList paramRemoteCallbackList, long paramLong, IInterface paramIInterface)
  {
    GMTrace.i(11138192375808L, 82986);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registerRemoteCB, ID = %d", new Object[] { Long.valueOf(paramLong) });
    if ((paramRemoteCallbackList == null) || (paramIInterface == null))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aCallbackList || null == aCallback");
      GMTrace.o(11138192375808L, 82986);
      return false;
    }
    int i = paramRemoteCallbackList.beginBroadcast();
    int j;
    do
    {
      j = i - 1;
      if (j < 0) {
        break;
      }
      i = j;
    } while (!paramRemoteCallbackList.getBroadcastItem(j).asBinder().equals(paramIInterface.asBinder()));
    if (j < 0)
    {
      w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Register a new process in callback list.");
      localHashMap = new HashMap();
      localHashMap.put(Long.valueOf(paramLong), paramIInterface);
      paramRemoteCallbackList.register(paramIInterface, localHashMap);
      paramRemoteCallbackList.finishBroadcast();
      GMTrace.o(11138192375808L, 82986);
      return true;
    }
    HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(j);
    if (localHashMap == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == map");
      paramRemoteCallbackList.finishBroadcast();
      GMTrace.o(11138192375808L, 82986);
      return false;
    }
    localHashMap.put(Long.valueOf(paramLong), paramIInterface);
    paramRemoteCallbackList.finishBroadcast();
    GMTrace.o(11138192375808L, 82986);
    return true;
  }
  
  private static boolean a(RemoteCallbackList paramRemoteCallbackList, long paramLong, IInterface paramIInterface, int paramInt)
  {
    GMTrace.i(11138326593536L, 82987);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB, device id = %d, aCount = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if ((paramRemoteCallbackList == null) || (paramIInterface == null))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aCallbackList || null == aCallback");
      GMTrace.o(11138326593536L, 82987);
      return false;
    }
    int i;
    do
    {
      i = paramInt - 1;
      if (i < 0) {
        break;
      }
      paramInt = i;
    } while (!paramRemoteCallbackList.getBroadcastItem(i).asBinder().equals(paramIInterface.asBinder()));
    if (i < 0)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find callback in callback list");
      GMTrace.o(11138326593536L, 82987);
      return false;
    }
    HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(i);
    if (localHashMap == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == map");
      GMTrace.o(11138326593536L, 82987);
      return false;
    }
    if ((IInterface)localHashMap.remove(Long.valueOf(paramLong)) == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find id in the map");
      GMTrace.o(11138326593536L, 82987);
      return false;
    }
    if (!localHashMap.isEmpty())
    {
      GMTrace.o(11138326593536L, 82987);
      return true;
    }
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "No id is in the map, unregister this process");
    boolean bool = paramRemoteCallbackList.unregister(paramIInterface);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallbackList.unregister failed!!!");
    }
    GMTrace.o(11138326593536L, 82987);
    return bool;
  }
  
  private boolean b(long paramLong, p paramp)
  {
    GMTrace.i(11138863464448L, 82991);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTaskImp, task Id = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramp == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aTask");
      d(paramLong, -1, -1, "null == aTask");
      GMTrace.o(11138863464448L, 82991);
      return false;
    }
    a locala = this.kDm;
    w.i("MicroMsg.exdevice.BTDeviceManager", "startTask, taskId = %d", new Object[] { Long.valueOf(paramLong) });
    Assert.assertNotNull(paramp);
    a.g localg = new a.g(paramLong, paramp);
    if (locala.mHandler.sendMessage(locala.mHandler.obtainMessage(8, localg))) {}
    for (int i = 0; i != 0; i = -1)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.startTask Failed ret = -1");
      d(paramLong, -1, -1, "mBTDeviceMrg.startTask Failed!!!");
      GMTrace.o(11138863464448L, 82991);
      return false;
    }
    if (!a(this.kDo, paramLong, paramp))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registerRemoteCB Fail!!!");
      d(paramLong, -1, -1, "registerRemoteCB Fail!!!");
      GMTrace.o(11138863464448L, 82991);
      return false;
    }
    GMTrace.o(11138863464448L, 82991);
    return true;
  }
  
  private boolean c(j paramj)
  {
    GMTrace.i(11137387069440L, 82980);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
    boolean bool = this.kDp.unregister(paramj);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
    }
    for (;;)
    {
      GMTrace.o(11137387069440L, 82980);
      return bool;
      this.kDu -= 1;
    }
  }
  
  private void d(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(11139668770816L, 82997);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEndImp taskId = %d, errType = %d, errCode =%d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    int i = this.kDo.beginBroadcast();
    p localp = (p)a(paramLong, this.kDo, i);
    if (localp == null)
    {
      w.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By taskId = " + paramLong);
      this.kDo.finishBroadcast();
      GMTrace.o(11139668770816L, 82997);
      return;
    }
    try
    {
      localp.auq().a(paramLong, paramInt1, paramInt2, paramString, localp);
      if (!a(this.kDo, paramLong, localp, i)) {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB failed!!!");
      }
      this.kDo.finishBroadcast();
      GMTrace.o(11139668770816L, 82997);
      return;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onTaskEnd Error!!!");
        w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramString, "", new Object[0]);
      }
    }
  }
  
  private boolean f(int paramInt, j paramj)
  {
    GMTrace.i(11137655504896L, 82982);
    if (paramj == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
      throw new IllegalArgumentException("scanImp: null == aCallback");
    }
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnscanCallback");
    boolean bool = this.kDp.register(paramj);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.register Failed!!!");
    }
    for (;;)
    {
      if (!bool) {
        try
        {
          paramj.a(0, -1, "scanImp: registScanCallback failed!!!", "", "", 0, null);
          GMTrace.o(11137655504896L, 82982);
          return false;
          this.kDu += 1;
        }
        catch (RemoteException paramj)
        {
          for (;;)
          {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", new Object[] { paramj.getMessage() });
            w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramj, "", new Object[0]);
          }
        }
      }
    }
    a locala = this.kDm;
    w.i("MicroMsg.exdevice.BTDeviceManager", "------scan------ bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
    if (!b.a(paramInt, locala, new int[0]))
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.scan Failed!!!");
      bool = false;
    }
    for (;;)
    {
      if (!bool) {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.scan Failed!!!");
      }
      try
      {
        paramj.a(0, -1, "scanImp: mBTDeviceMrg.scan failed!!!", "", "", 0, null);
        if (!c(paramj)) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
        }
        GMTrace.o(11137655504896L, 82982);
        return bool;
        bool = true;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", new Object[] { localRemoteException.getMessage() });
          w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
        }
      }
    }
  }
  
  private boolean g(int paramInt, j paramj)
  {
    GMTrace.i(11137923940352L, 82984);
    if (paramj == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
      GMTrace.o(11137923940352L, 82984);
      return false;
    }
    boolean bool = a.mY(paramInt);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
    }
    try
    {
      paramj.a(0, -1, "stopScanImp: mBTDeviceMrg.stopScan failed!!!", "", "", 0, null);
      if (!c(paramj)) {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
      }
      GMTrace.o(11137923940352L, 82984);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp: aCallback.onScanCallback failed!!!, %s", new Object[] { localRemoteException.getMessage() });
        w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  public final long a(p paramp)
  {
    GMTrace.i(11138997682176L, 82992);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTask");
    if (paramp == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aTask");
      GMTrace.o(11138997682176L, 82992);
      return -1L;
    }
    l locall = this.kDt;
    if (Long.MAX_VALUE == locall.kCF)
    {
      w.w("MicroMsg.TaskId", "TaskId Data-overrun!!!");
      locall.kCF = 0L;
    }
    long l = locall.kCF;
    locall.kCF = (1L + l);
    paramp = new k(l, paramp);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(0, paramp)))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! messsage what  = %d", new Object[] { Integer.valueOf(0) });
      GMTrace.o(11138997682176L, 82992);
      return -1L;
    }
    GMTrace.o(11138997682176L, 82992);
    return l;
  }
  
  public final void a(double paramDouble, com.tencent.mm.plugin.g.a.a.c paramc)
  {
    GMTrace.i(11140474077184L, 83003);
    if (paramc == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aContext is null");
      GMTrace.o(11140474077184L, 83003);
      return;
    }
    h localh = paramc.jki.jkn;
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onRangingCallback, distance = %f, uuid = %s, major = %d, minor = %d ,minor&0xFFFF = %d", new Object[] { Double.valueOf(paramDouble), com.tencent.mm.plugin.exdevice.j.b.al(localh.jkO), Short.valueOf(localh.jkP), Short.valueOf(localh.jkQ), Integer.valueOf(localh.jkQ & 0xFFFF) });
    try
    {
      int j = this.kDr.beginBroadcast();
      int i = 0;
      for (;;)
      {
        if (i < j) {
          try
          {
            ((q)this.kDr.getBroadcastItem(i)).a(paramDouble, localh.jkP, localh.jkQ, localh.jkO, paramc.jkj, paramc.jki.jkn.jkR, paramc.aKJ);
            i += 1;
          }
          catch (RemoteException localRemoteException)
          {
            for (;;)
            {
              w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.getBroadcastItem failed!!!, i = %d, (%s)", new Object[] { Integer.valueOf(i), localRemoteException.toString() });
              w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
            }
          }
        }
      }
      this.kDr.finishBroadcast();
      GMTrace.o(11140474077184L, 83003);
      return;
    }
    catch (Exception paramc)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "[shakezb] beginBroadcast fail!", new Object[] { paramc.toString() });
      w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramc, "", new Object[0]);
      this.kDr.finishBroadcast();
      GMTrace.o(11140474077184L, 83003);
      return;
    }
    finally
    {
      this.kDr.finishBroadcast();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, byte[] paramArrayOfByte)
  {
    GMTrace.i(11139534553088L, 82996);
    int j = this.kDp.beginBroadcast();
    int i = 0;
    while (i < j)
    {
      try
      {
        ((j)this.kDp.getBroadcastItem(i)).a(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramInt3, paramArrayOfByte);
        if ((2 == paramInt1) && (!this.kDp.unregister(this.kDp.getBroadcastItem(i)))) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback: mCBListOnScanCallback.unregister failed!!!");
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback Exception i = " + i);
          w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
        }
      }
      i += 1;
    }
    this.kDp.finishBroadcast();
    GMTrace.o(11139534553088L, 82996);
  }
  
  public final void a(int paramInt, long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte)
  {
    GMTrace.i(11139937206272L, 82999);
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDeviceRequest errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Short.valueOf(paramShort1), Short.valueOf(paramShort2), Integer.valueOf(i) });
      b localb = new b();
      localb.kCC = paramShort2;
      localb.kwQ = paramArrayOfByte;
      localb.joF = paramLong;
      localb.kwW = paramShort1;
      localb.mErrorCode = paramInt;
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(6, localb))) {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(6) });
      }
      GMTrace.o(11139937206272L, 82999);
      return;
    }
  }
  
  public final void a(n paramn)
  {
    GMTrace.i(11140742512640L, 83005);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registExDeviceInvokerHandler");
    if (!this.kDs.register(paramn)) {
      w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.register failed!!!");
    }
    GMTrace.o(11140742512640L, 83005);
  }
  
  public final boolean a(long paramLong, int paramInt, k paramk)
  {
    GMTrace.i(11138460811264L, 82988);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannel deviceId = %d, bluetoothVersion = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (paramk == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == callback");
      GMTrace.o(11138460811264L, 82988);
      return false;
    }
    if (paramLong < 0L)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(11138460811264L, 82988);
      return false;
    }
    if ((1 != paramInt) && (paramInt != 0))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11138460811264L, 82988);
      return false;
    }
    paramk = new j(paramLong, paramInt, paramk);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(3, paramk)))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", new Object[] { Integer.valueOf(3) });
      GMTrace.o(11138460811264L, 82988);
      return false;
    }
    GMTrace.o(11138460811264L, 82988);
    return true;
  }
  
  public final boolean a(i parami)
  {
    GMTrace.i(11139266117632L, 82994);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnDeviceRequest");
    boolean bool = this.kDq.register(parami);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.register Failed!!!");
    }
    GMTrace.o(11139266117632L, 82994);
    return bool;
  }
  
  public final boolean a(s params)
  {
    GMTrace.i(11141547819008L, 83011);
    if (params == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
      GMTrace.o(11141547819008L, 83011);
      return false;
    }
    boolean bool = this.kDz.register(params);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBluetoothRegistOnRecv error");
    }
    GMTrace.o(11141547819008L, 83011);
    return bool;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, q paramq)
  {
    GMTrace.i(11140339859456L, 83002);
    if ((Build.VERSION.SDK_INT < 18) || (this.kDv == null))
    {
      GMTrace.o(11140339859456L, 83002);
      return false;
    }
    boolean bool = ab.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    Object localObject = BluetoothAdapter.getDefaultAdapter();
    if ((!bool) || (localObject == null))
    {
      GMTrace.o(11140339859456L, 83002);
      return false;
    }
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    if (!this.kDr.register(paramq))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.register failed!!!");
      GMTrace.o(11140339859456L, 83002);
      return false;
    }
    for (;;)
    {
      com.tencent.mm.plugin.g.a.a.f localf;
      try
      {
        localObject = UUID.fromString(paramString);
        localf = this.kDv;
        com.tencent.mm.plugin.g.a.a.f.jks = ab.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
        if (localObject == null)
        {
          paramString = "";
          w.d("MicroMsg.exdevice.IBeaconServer", "Ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
          if (localObject != null) {
            break label266;
          }
          w.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
          paramBoolean = false;
          if (!paramBoolean) {
            break;
          }
          GMTrace.o(11140339859456L, 83002);
          return true;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "UUID.fromString failed!!!, (%s)", new Object[] { paramString.getMessage() });
        GMTrace.o(11140339859456L, 83002);
        return false;
      }
      paramString = ((UUID)localObject).toString();
      continue;
      label266:
      if (paramBoolean) {
        paramBoolean = localf.mHandler.post(new f.6(localf, (UUID)localObject));
      } else {
        paramBoolean = localf.mHandler.post(new f.7(localf, (UUID)localObject));
      }
    }
    w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mIBeaconServer.ranging failed!!!");
    if (!this.kDr.unregister(paramq)) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.unregister failed!!!");
    }
    GMTrace.o(11140339859456L, 83002);
    return false;
  }
  
  public final long[] aug()
  {
    GMTrace.i(11138058158080L, 82985);
    long[] arrayOfLong = a.aug();
    GMTrace.o(11138058158080L, 82985);
    return arrayOfLong;
  }
  
  public final void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11140071424000L, 83000);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onStateChange deviceId = " + paramLong + " oldState" + paramInt1 + " newState = " + paramInt2 + " errCode = " + paramInt3);
    c localc = new c();
    localc.joF = paramLong;
    localc.kCD = paramInt1;
    localc.kCE = paramInt2;
    localc.kwP = paramInt3;
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(5, localc))) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, messagewhat = %d", new Object[] { Integer.valueOf(5) });
    }
    GMTrace.o(11140071424000L, 83000);
  }
  
  public final boolean b(final int paramInt, final j paramj)
  {
    GMTrace.i(11137521287168L, 82981);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---scan--- aBluetoothVersion = " + paramInt);
    if (paramj == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
      GMTrace.o(11137521287168L, 82981);
      return false;
    }
    boolean bool = this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11163827961856L, 83177);
        if (!y.a(y.this, paramInt, paramj)) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scanImp failed!!!");
        }
        GMTrace.o(11163827961856L, 83177);
      }
    });
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan: mHandler.post failed!!!");
    }
    GMTrace.o(11137521287168L, 82981);
    return bool;
  }
  
  public final boolean b(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    GMTrace.i(11142084689920L, 83015);
    w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSateChangeImpl. mac=%d, oldstate = %d, newsate=%d, errcode=%d", new Object[] { Long.valueOf(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    int i = this.kDy.beginBroadcast();
    k localk = (k)a(paramLong1, this.kDy, i);
    if (localk == null)
    {
      w.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By deviceId = " + paramLong1);
      this.kDy.finishBroadcast();
      GMTrace.o(11142084689920L, 83015);
      return false;
    }
    try
    {
      localk.a(paramLong1, paramInt1, paramInt2, paramInt3, paramLong2);
      this.kDy.finishBroadcast();
      GMTrace.o(11142084689920L, 83015);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onStateChange Failed!!!");
      w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
      this.kDy.finishBroadcast();
      GMTrace.o(11142084689920L, 83015);
      return false;
    }
    finally
    {
      this.kDy.finishBroadcast();
    }
  }
  
  public final boolean b(long paramLong, int paramInt, k paramk)
  {
    GMTrace.i(11141279383552L, 83009);
    if (paramk == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
      GMTrace.o(11141279383552L, 83009);
      return false;
    }
    if (paramLong < 0L)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(11141279383552L, 83009);
      return false;
    }
    if (paramInt != 0)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11141279383552L, 83009);
      return false;
    }
    e locale = new e();
    locale.kzS = paramLong;
    locale.kDF = paramInt;
    locale.kDG = paramk;
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(7, locale)))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(7) });
      GMTrace.o(11141279383552L, 83009);
      return false;
    }
    GMTrace.o(11141279383552L, 83009);
    return true;
  }
  
  public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    GMTrace.i(11141682036736L, 83012);
    if (0L > paramLong)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mac < 0");
      GMTrace.o(11141682036736L, 83012);
      return false;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "data is empty");
      GMTrace.o(11141682036736L, 83012);
      return false;
    }
    if (paramt == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
      GMTrace.o(11141682036736L, 83012);
      return false;
    }
    i locali = new i();
    locali.kzS = paramLong;
    locali.jkV = paramArrayOfByte;
    locali.kDJ = paramt;
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(10, locali)))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(10) });
      GMTrace.o(11141682036736L, 83012);
      return false;
    }
    GMTrace.o(11141682036736L, 83012);
    return true;
  }
  
  public final boolean b(i parami)
  {
    GMTrace.i(11139400335360L, 82995);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnDeviceRequest");
    boolean bool = this.kDq.unregister(parami);
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.unregister Failed!!!");
    }
    GMTrace.o(11139400335360L, 82995);
    return bool;
  }
  
  public final boolean bN(long paramLong)
  {
    GMTrace.i(11138595028992L, 82989);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopChannel deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 0L)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(11138595028992L, 82989);
      return false;
    }
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Long.valueOf(paramLong))))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", new Object[] { Integer.valueOf(4) });
      GMTrace.o(11138595028992L, 82989);
      return false;
    }
    GMTrace.o(11138595028992L, 82989);
    return true;
  }
  
  public final boolean bO(long paramLong)
  {
    GMTrace.i(11138729246720L, 82990);
    GMTrace.o(11138729246720L, 82990);
    return false;
  }
  
  public final boolean bP(long paramLong)
  {
    GMTrace.i(11139131899904L, 82993);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopTask, task Id = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 0L)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "taskId < 0");
      GMTrace.o(11139131899904L, 82993);
      return false;
    }
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1, Long.valueOf(paramLong))))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage, message what = %d", new Object[] { Integer.valueOf(1) });
      GMTrace.o(11139131899904L, 82993);
      return false;
    }
    GMTrace.o(11139131899904L, 82993);
    return true;
  }
  
  public final boolean bQ(long paramLong)
  {
    GMTrace.i(11141413601280L, 83010);
    if (paramLong < 0L)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(11141413601280L, 83010);
      return false;
    }
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(8, Long.valueOf(paramLong))))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(8) });
      GMTrace.o(11141413601280L, 83010);
      return false;
    }
    GMTrace.o(11141413601280L, 83010);
    return true;
  }
  
  public final void c(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(11139802988544L, 82998);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEnd taskId = %d, errTpye = %d, errCode = %d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    d locald = new d();
    locald.kCF = paramLong;
    locald.kxb = paramInt1;
    locald.kwP = paramInt2;
    locald.kxc = paramString;
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2, locald))) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, MessageWhat = %d", new Object[] { Integer.valueOf(2) });
    }
    GMTrace.o(11139802988544L, 82998);
  }
  
  public final boolean c(final int paramInt, final j paramj)
  {
    GMTrace.i(11137789722624L, 82983);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---stopScan--- aBluetoothVersion = " + paramInt);
    if (paramj == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback");
      GMTrace.o(11137789722624L, 82983);
      return false;
    }
    boolean bool = this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11134165843968L, 82956);
        if (!y.b(y.this, paramInt, paramj)) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp failed!!!");
        }
        GMTrace.o(11134165843968L, 82956);
      }
    });
    if (!bool) {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScan: mHandler.post failed!!!");
    }
    GMTrace.o(11137789722624L, 82983);
    return bool;
  }
  
  public final boolean c(long paramLong, int paramInt, k paramk)
  {
    GMTrace.i(11141816254464L, 83013);
    w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTConnectImpl. mac=%d, bTVersion=%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (!a(this.kDy, paramLong, paramk))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "register connect callback error");
      try
      {
        paramk.a(paramLong, -1, 4, -1, 0L);
        GMTrace.o(11141816254464L, 83013);
        return false;
      }
      catch (RemoteException paramk)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramk, "", new Object[0]);
        }
      }
    }
    try
    {
      paramk.a(paramLong, -1, 1, -1, 0L);
      if (this.kDB != null)
      {
        com.tencent.mm.plugin.g.a.b.e locale = this.kDB;
        w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "connect. mac = %d", new Object[] { Long.valueOf(paramLong) });
        if (!locale.aha())
        {
          w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
          bool = false;
          if (bool) {
            break label360;
          }
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "connect device(mac=%d) error", new Object[] { Long.valueOf(paramLong) });
          if (paramk == null) {}
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        for (;;)
        {
          paramk.a(paramLong, 1, 4, -1, 0L);
          GMTrace.o(11141816254464L, 83013);
          return false;
          localRemoteException = localRemoteException;
          w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
          continue;
          com.tencent.mm.plugin.g.a.b.f localf = (com.tencent.mm.plugin.g.a.b.f)localRemoteException.jla.get(Long.valueOf(paramLong));
          if (localf != null)
          {
            w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "session(mac=%s) has been in map");
            bool = localf.connect();
          }
          else
          {
            localf = new com.tencent.mm.plugin.g.a.b.f(paramLong, localRemoteException.sN, localRemoteException.jlM);
            if (!localf.connect()) {
              break;
            }
            localRemoteException.o(new e.4(localRemoteException, paramLong, localf));
            bool = true;
          }
        }
        w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "tmpConnectForScan error");
        boolean bool = false;
      }
      catch (RemoteException paramk)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramk, "", new Object[0]);
        }
      }
      label360:
      GMTrace.o(11141816254464L, 83013);
    }
    return true;
  }
  
  public final boolean c(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    GMTrace.i(11141950472192L, 83014);
    w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTSendDataImpl. mac=%d, data=%s", new Object[] { Long.valueOf(paramLong), com.tencent.mm.plugin.exdevice.j.b.al(paramArrayOfByte) });
    if (this.kDB != null)
    {
      Object localObject = this.kDB;
      w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "writeData. mac = %d", new Object[] { Long.valueOf(paramLong) });
      boolean bool;
      if (!((com.tencent.mm.plugin.g.a.b.e)localObject).aha())
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
        bool = false;
      }
      for (;;)
      {
        if (!bool)
        {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "writeData error");
          if (paramt != null) {}
          try
          {
            paramt.b(paramLong, -1, -1, "start write data error");
            GMTrace.o(11141950472192L, 83014);
            return false;
            localObject = (com.tencent.mm.plugin.g.a.b.f)((com.tencent.mm.plugin.g.a.b.e)localObject).jla.get(Long.valueOf(paramLong));
            if (localObject == null)
            {
              w.w("MicroMsg.exdevice.BluetoothLESimpleManager", "session is null, may be this session is closed");
              bool = false;
            }
            else
            {
              w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------writeData------parserobj, length = %d, mac=%s, name=%s", new Object[] { Integer.valueOf(paramArrayOfByte.length), com.tencent.mm.plugin.exdevice.j.b.bS(((com.tencent.mm.plugin.g.a.b.f)localObject).mSessionId), ((com.tencent.mm.plugin.g.a.b.f)localObject).jls.getName() });
              bool = ((com.tencent.mm.plugin.g.a.b.f)localObject).mHandler.sendMessage(((com.tencent.mm.plugin.g.a.b.f)localObject).mHandler.obtainMessage(3, paramArrayOfByte));
            }
          }
          catch (RemoteException paramArrayOfByte)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramArrayOfByte, "", new Object[0]);
            }
          }
        }
      }
    }
    if (!a(this.kDA, paramLong, paramt))
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "register on send end callback error");
      GMTrace.o(11141950472192L, 83014);
      return false;
    }
    GMTrace.o(11141950472192L, 83014);
    return true;
  }
  
  public final boolean d(int paramInt, j paramj)
  {
    GMTrace.i(11141010948096L, 83007);
    w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBlutoothScan. bluetoothVersion=%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramj == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan callback is null. just return");
      GMTrace.o(11141010948096L, 83007);
      return false;
    }
    if (paramInt != 0)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "this is not ble scan cmd");
      GMTrace.o(11141010948096L, 83007);
      return false;
    }
    boolean bool3 = this.kDx.register(paramj);
    if (bool3) {
      w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "regist simple ble scan callback ok");
    }
    for (;;)
    {
      if (this.kDB != null)
      {
        com.tencent.mm.plugin.g.a.b.e locale = this.kDB;
        w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "simple ble scan");
        boolean bool1;
        if (locale.jlc != null)
        {
          bool1 = true;
          label129:
          Assert.assertTrue(bool1);
          if (locale.aha()) {
            break label224;
          }
          w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
          bool1 = false;
          label152:
          if (bool1) {
            break label301;
          }
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simple ble scan fail");
        }
        try
        {
          paramj.a(0, -1, "simpleBLE.scan failed!!!", "", "", 0, null);
          if (bool3) {
            this.kDx.unregister(paramj);
          }
          GMTrace.o(11141010948096L, 83007);
          return false;
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "regist simple ble scan callback fail");
          continue;
          bool1 = false;
          break label129;
          label224:
          boolean bool2 = locale.jlc.a(true, locale.jlf);
          bool1 = bool2;
          if (!bool2) {
            break label152;
          }
          locale.jlK.clear();
          bool1 = bool2;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;)
          {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.scan callback failed!!!, %s", new Object[] { localRemoteException.getMessage() });
            w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
          }
        }
      }
    }
    label301:
    GMTrace.o(11141010948096L, 83007);
    return true;
  }
  
  /* Error */
  public final boolean d(long paramLong, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc2_w 1165
    //   6: ldc_w 1167
    //   9: invokestatic 101	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_3
    //   13: ifnonnull +105 -> 118
    //   16: ldc_w 1169
    //   19: astore 6
    //   21: ldc -53
    //   23: ldc_w 1171
    //   26: iconst_2
    //   27: anewarray 207	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: lload_1
    //   33: invokestatic 213	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: aload 6
    //   41: aastore
    //   42: invokestatic 359	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: aload_0
    //   46: getfield 129	com/tencent/mm/plugin/exdevice/service/y:kDz	Landroid/os/RemoteCallbackList;
    //   49: invokevirtual 271	android/os/RemoteCallbackList:beginBroadcast	()I
    //   52: istore 5
    //   54: ldc -53
    //   56: ldc_w 1173
    //   59: iconst_1
    //   60: anewarray 207	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: iload 5
    //   67: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   70: aastore
    //   71: invokestatic 359	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: iload 4
    //   76: iload 5
    //   78: if_icmpge +100 -> 178
    //   81: aload_0
    //   82: getfield 129	com/tencent/mm/plugin/exdevice/service/y:kDz	Landroid/os/RemoteCallbackList;
    //   85: iload 4
    //   87: invokevirtual 275	android/os/RemoteCallbackList:getBroadcastItem	(I)Landroid/os/IInterface;
    //   90: checkcast 1175	com/tencent/mm/plugin/exdevice/service/s
    //   93: astore 6
    //   95: aload 6
    //   97: ifnull +30 -> 127
    //   100: aload 6
    //   102: lload_1
    //   103: aload_3
    //   104: invokeinterface 1178 4 0
    //   109: iload 4
    //   111: iconst_1
    //   112: iadd
    //   113: istore 4
    //   115: goto -41 -> 74
    //   118: aload_3
    //   119: invokestatic 706	com/tencent/mm/plugin/exdevice/j/b:al	([B)Ljava/lang/String;
    //   122: astore 6
    //   124: goto -103 -> 21
    //   127: ldc -53
    //   129: ldc_w 1180
    //   132: invokestatic 244	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: goto -26 -> 109
    //   138: astore_3
    //   139: ldc -53
    //   141: ldc_w 1182
    //   144: invokestatic 244	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: ldc -53
    //   149: aload_3
    //   150: ldc_w 301
    //   153: iconst_0
    //   154: anewarray 207	java/lang/Object
    //   157: invokestatic 305	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload_0
    //   161: getfield 129	com/tencent/mm/plugin/exdevice/service/y:kDz	Landroid/os/RemoteCallbackList;
    //   164: invokevirtual 308	android/os/RemoteCallbackList:finishBroadcast	()V
    //   167: ldc2_w 1165
    //   170: ldc_w 1167
    //   173: invokestatic 196	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   176: iconst_1
    //   177: ireturn
    //   178: aload_0
    //   179: getfield 129	com/tencent/mm/plugin/exdevice/service/y:kDz	Landroid/os/RemoteCallbackList;
    //   182: invokevirtual 308	android/os/RemoteCallbackList:finishBroadcast	()V
    //   185: goto -18 -> 167
    //   188: astore_3
    //   189: aload_0
    //   190: getfield 129	com/tencent/mm/plugin/exdevice/service/y:kDz	Landroid/os/RemoteCallbackList;
    //   193: invokevirtual 308	android/os/RemoteCallbackList:finishBroadcast	()V
    //   196: aload_3
    //   197: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	y
    //   0	198	1	paramLong	long
    //   0	198	3	paramArrayOfByte	byte[]
    //   1	113	4	i	int
    //   52	27	5	j	int
    //   19	104	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   81	95	138	android/os/RemoteException
    //   100	109	138	android/os/RemoteException
    //   127	135	138	android/os/RemoteException
    //   81	95	188	finally
    //   100	109	188	finally
    //   127	135	188	finally
    //   139	160	188	finally
  }
  
  public final boolean e(int paramInt, j paramj)
  {
    GMTrace.i(11141145165824L, 83008);
    w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBlutoothStopScan. bluetoothVersion=%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramj == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan callback is null. just return");
      GMTrace.o(11141145165824L, 83008);
      return false;
    }
    if (this.kDB == null)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan mBLESimpleMgr is null. just return");
      GMTrace.o(11141145165824L, 83008);
      return false;
    }
    com.tencent.mm.plugin.g.a.b.e locale = this.kDB;
    w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "simple ble stop scan");
    boolean bool;
    if (locale.jlc != null) {
      bool = true;
    }
    for (;;)
    {
      Assert.assertTrue(bool);
      if (!locale.aha())
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
        bool = false;
        if (!bool) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
        }
      }
      try
      {
        paramj.a(0, -1, "simpleBLE.stopScan failed!!!", "", "", 0, null);
        GMTrace.o(11141145165824L, 83008);
        return bool;
        bool = false;
        continue;
        locale.mHandler.removeCallbacks(locale.mRunnable);
        bool = locale.jlc.a(false, locale.jlf);
      }
      catch (RemoteException paramj)
      {
        for (;;)
        {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.onScanCallback failed!!!, %s", new Object[] { paramj.getMessage() });
          w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramj, "", new Object[0]);
        }
      }
    }
  }
  
  public final boolean e(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(11142218907648L, 83016);
    w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSendEndImpl. mac=%d, errType = %d, errCode=%d, errMsg=%s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    int i = this.kDA.beginBroadcast();
    t localt = (t)a(paramLong, this.kDA, i);
    if (localt == null)
    {
      w.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By deviceId = " + paramLong);
      this.kDA.finishBroadcast();
      GMTrace.o(11142218907648L, 83016);
      return false;
    }
    try
    {
      localt.b(paramLong, paramInt1, paramInt2, paramString);
      this.kDA.finishBroadcast();
      GMTrace.o(11142218907648L, 83016);
      return true;
    }
    catch (RemoteException paramString)
    {
      w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onSendEnd Failed!!!");
      w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramString, "", new Object[0]);
      this.kDA.finishBroadcast();
      GMTrace.o(11142218907648L, 83016);
      return false;
    }
    finally
    {
      this.kDA.finishBroadcast();
    }
  }
  
  public final void lb(int paramInt)
  {
    GMTrace.i(11140608294912L, 83004);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "OnBluetoothStateChange, state = %d", new Object[] { Integer.valueOf(paramInt) });
    int i = this.kDs.beginBroadcast() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("key_state", paramInt);
        try
        {
          ((n)this.kDs.getBroadcastItem(i)).h(0, localBundle);
          i -= 1;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;)
          {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.getBroadcastItem(%d).onExdeviceInvoke failed!!!", new Object[] { Integer.valueOf(i) });
            w.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
          }
        }
      }
    }
    this.kDs.finishBroadcast();
    GMTrace.o(11140608294912L, 83004);
  }
  
  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(11140205641728L, 83001);
    w.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---setChannelSessionKey--- deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    a locala = this.kDm;
    w.i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKey------ deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    paramArrayOfByte = new a.f(paramLong, paramArrayOfByte);
    if (!locala.mHandler.sendMessage(locala.mHandler.obtainMessage(10, paramArrayOfByte))) {
      w.e("MicroMsg.exdevice.BTDeviceManager", "mHandler.sendMessage failed!!! messageWhat = %d", new Object[] { Integer.valueOf(10) });
    }
    GMTrace.o(11140205641728L, 83001);
  }
  
  private final class a
    extends ae
  {
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(11166780751872L, 83199);
      GMTrace.o(11166780751872L, 83199);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11166914969600L, 83200);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(11166914969600L, 83200);
        return;
        paramMessage = (y.d)paramMessage.obj;
        y.a(y.this, paramMessage.kCF, paramMessage.kxb, paramMessage.kwP, paramMessage.kxc);
        GMTrace.o(11166914969600L, 83200);
        return;
        paramMessage = (y.k)paramMessage.obj;
        if (!y.a(y.this, paramMessage.kCF, paramMessage.kDL)) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTaskImp failed!!!");
        }
        GMTrace.o(11166914969600L, 83200);
        return;
        long l = ((Long)paramMessage.obj).longValue();
        if (!y.a(y.this, l)) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopTaskImp failed!!!");
        }
        GMTrace.o(11166914969600L, 83200);
        return;
        paramMessage = (y.c)paramMessage.obj;
        y.a(y.this, paramMessage.joF, paramMessage.kCD, paramMessage.kCE, paramMessage.kwP);
        GMTrace.o(11166914969600L, 83200);
        return;
        paramMessage = (y.j)paramMessage.obj;
        if (!y.a(y.this, paramMessage.joF, paramMessage.kDK, paramMessage.kDG)) {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannelImp failed!!!");
        }
        GMTrace.o(11166914969600L, 83200);
        return;
        if (!y.b(y.this, ((Long)paramMessage.obj).longValue()))
        {
          w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopChannelImp failed!!!");
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.b)paramMessage.obj;
          y.a(y.this, paramMessage.mErrorCode, paramMessage.joF, paramMessage.kwW, paramMessage.kCC, paramMessage.kwQ);
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.e)paramMessage.obj;
          if (!y.this.c(paramMessage.kzS, paramMessage.kDF, paramMessage.kDG)) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTConnectImpl error");
          }
          GMTrace.o(11166914969600L, 83200);
          return;
          l = ((Long)paramMessage.obj).longValue();
          paramMessage = y.this;
          w.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTDisonnectImpl. mac=%d", new Object[] { Long.valueOf(l) });
          if (paramMessage.kDB != null)
          {
            paramMessage = paramMessage.kDB;
            w.d("MicroMsg.exdevice.BluetoothLESimpleManager", "disconnect. mac = %d", new Object[] { Long.valueOf(l) });
            if (!paramMessage.aha())
            {
              w.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
              GMTrace.o(11166914969600L, 83200);
              return;
            }
            paramMessage.o(new e.5(paramMessage, l));
          }
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.c)paramMessage.obj;
          if (!y.this.b(paramMessage.joF, paramMessage.kCD, paramMessage.kCE, paramMessage.kwP, paramMessage.jlY)) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSateChangeImpl error");
          }
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.i)paramMessage.obj;
          if (!y.this.c(paramMessage.kzS, paramMessage.jkV, paramMessage.kDJ)) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTSendDataImpl error");
          }
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.h)paramMessage.obj;
          if (!y.this.e(paramMessage.kzS, paramMessage.kxb, paramMessage.kwP, paramMessage.kxc)) {
            w.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSendEndImpl error");
          }
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.f)paramMessage.obj;
          y.this.d(paramMessage.kzS, paramMessage.jkV);
          GMTrace.o(11166914969600L, 83200);
          return;
          paramMessage = (y.g)paramMessage.obj;
          y.a(y.this, paramMessage);
        }
      }
    }
  }
  
  private static final class b
  {
    long joF;
    short kCC;
    byte[] kwQ;
    short kwW;
    int mErrorCode;
    
    public b()
    {
      GMTrace.i(11164096397312L, 83179);
      this.joF = 0L;
      this.kwW = 0;
      this.kCC = 0;
      this.kwQ = null;
      this.mErrorCode = 0;
      GMTrace.o(11164096397312L, 83179);
    }
  }
  
  private static final class c
  {
    public long jlY;
    public long joF;
    public int kCD;
    public int kCE;
    public int kwP;
    
    public c()
    {
      GMTrace.i(11162888437760L, 83170);
      this.joF = 0L;
      this.kCD = 0;
      this.kCE = 0;
      this.kwP = 0;
      this.jlY = 0L;
      GMTrace.o(11162888437760L, 83170);
    }
  }
  
  private static final class d
  {
    long kCF;
    int kwP;
    int kxb;
    String kxc;
    
    public d()
    {
      GMTrace.i(11127454957568L, 82906);
      this.kCF = 0L;
      this.kxb = 0;
      this.kwP = 0;
      this.kxc = null;
      GMTrace.o(11127454957568L, 82906);
    }
  }
  
  private static final class e
  {
    public int kDF;
    public k kDG;
    public long kzS;
    
    public e()
    {
      GMTrace.i(11165841227776L, 83192);
      GMTrace.o(11165841227776L, 83192);
    }
  }
  
  private static final class f
  {
    public byte[] jkV;
    public long kzS;
    
    public f()
    {
      GMTrace.i(11158190817280L, 83135);
      GMTrace.o(11158190817280L, 83135);
    }
  }
  
  private static final class g
  {
    String joI;
    String joJ;
    int joK;
    boolean kDH;
    byte[] kDI;
    
    public g()
    {
      GMTrace.i(11148392923136L, 83062);
      GMTrace.o(11148392923136L, 83062);
    }
  }
  
  private static final class h
  {
    public int kwP;
    public int kxb;
    public String kxc;
    public long kzS;
    
    public h()
    {
      GMTrace.i(11134836932608L, 82961);
      GMTrace.o(11134836932608L, 82961);
    }
  }
  
  private static final class i
  {
    public byte[] jkV;
    public t kDJ;
    public long kzS;
    
    public i()
    {
      GMTrace.i(11167451840512L, 83204);
      GMTrace.o(11167451840512L, 83204);
    }
  }
  
  private static final class j
  {
    long joF;
    k kDG;
    int kDK;
    
    public j(long paramLong, int paramInt, k paramk)
    {
      GMTrace.i(11128394481664L, 82913);
      this.joF = paramLong;
      this.kDK = paramInt;
      this.kDG = paramk;
      GMTrace.o(11128394481664L, 82913);
    }
  }
  
  private static final class k
  {
    long kCF;
    p kDL;
    
    public k(long paramLong, p paramp)
    {
      GMTrace.i(11177518170112L, 83279);
      this.kCF = paramLong;
      this.kDL = paramp;
      GMTrace.o(11177518170112L, 83279);
    }
  }
  
  private static final class l
  {
    long kCF;
    
    public l()
    {
      GMTrace.i(11157788164096L, 83132);
      this.kCF = 0L;
      GMTrace.o(11157788164096L, 83132);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */