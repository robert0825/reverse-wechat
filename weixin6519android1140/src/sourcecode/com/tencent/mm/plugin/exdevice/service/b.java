package com.tencent.mm.plugin.exdevice.service;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.g.a.b.d;
import com.tencent.mm.plugin.g.a.c.a.a;
import com.tencent.mm.plugin.g.a.c.c.a;
import com.tencent.mm.plugin.g.a.c.c.c;
import com.tencent.mm.plugin.g.a.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import junit.framework.Assert;

public final class b
  implements c
{
  private static b kCL;
  public com.tencent.mm.plugin.g.a.d.b kCH;
  final Vector<r> kCI;
  final HashMap<Long, Integer> kCJ;
  final HashMap<Long, Integer> kCK;
  public CountDownLatch kCM;
  private ae mHandler;
  
  static
  {
    GMTrace.i(11152419454976L, 83092);
    kCL = null;
    GMTrace.o(11152419454976L, 83092);
  }
  
  public b()
  {
    GMTrace.i(11149332447232L, 83069);
    this.kCH = null;
    this.kCI = new Vector();
    this.kCJ = new HashMap();
    this.kCK = new HashMap();
    this.mHandler = new ae(v.auu().kxr.ngv.getLooper());
    long l1 = Thread.currentThread().getId();
    long l2 = Looper.getMainLooper().getThread().getId();
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now thread id : %d, main thread is : %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    if ((Build.VERSION.SDK_INT == 14) || (Build.VERSION.SDK_INT == 15))
    {
      if (l1 == l2)
      {
        w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "it is main thread now, init the bluetoothadapter directly");
        this.kCH = new com.tencent.mm.plugin.g.a.d.b(ab.getContext(), this, v.auu().kxr);
        GMTrace.o(11149332447232L, 83069);
        return;
      }
      new ae(Looper.getMainLooper()).postAtFrontOfQueueV2(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11176175992832L, 83269);
          b.this.kCH = new com.tencent.mm.plugin.g.a.d.b(ab.getContext(), b.this, v.auu().kxr);
          w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now notify");
          b.this.kCM.countDown();
          GMTrace.o(11176175992832L, 83269);
        }
      });
      this.kCM = new CountDownLatch(1);
    }
    try
    {
      this.kCM.await();
      w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now has init the sdk adapter");
      GMTrace.o(11149332447232L, 83069);
      return;
      this.kCH = new com.tencent.mm.plugin.g.a.d.b(ab.getContext(), this, v.auu().kxr);
      GMTrace.o(11149332447232L, 83069);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(final int paramInt, final r paramr, final int... paramVarArgs)
  {
    GMTrace.i(11149600882688L, 83071);
    if (paramr == null)
    {
      w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "Error parameter: null == aCallback");
      GMTrace.o(11149600882688L, 83071);
      return false;
    }
    b localb = auh();
    boolean bool = localb.mHandler.post(new Runnable()
    {
      public final void run()
      {
        int j = 0;
        GMTrace.i(11158593470464L, 83138);
        b localb = this.kCO;
        int i = paramInt;
        r localr = paramr;
        int[] arrayOfInt = paramVarArgs;
        if (localr == null)
        {
          w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "Error parameter: null == aCallback");
          throw new IllegalArgumentException("scanImp: null == aCallback");
        }
        boolean bool;
        if (arrayOfInt == null)
        {
          bool = localb.kCH.a(i, new int[0]);
          if (bool) {
            break label137;
          }
          w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.scan failed!!!");
          i = j;
          if (localr != null) {
            localr.tB("scanImp: mBTSDKMrg.scan failed!!!");
          }
        }
        for (i = j;; i = 1)
        {
          if (i == 0) {
            w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.scanImp failed!!!");
          }
          GMTrace.o(11158593470464L, 83138);
          return;
          bool = localb.kCH.a(i, arrayOfInt);
          break;
          label137:
          localb.kCI.add(localr);
        }
      }
    });
    if (!bool) {
      w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "scan: instance.mHandler.post failed!!!");
    }
    GMTrace.o(11149600882688L, 83071);
    return bool;
  }
  
  private static b auh()
  {
    GMTrace.i(11149466664960L, 83070);
    if (kCL != null)
    {
      localb = kCL;
      GMTrace.o(11149466664960L, 83070);
      return localb;
    }
    b localb = new b();
    kCL = localb;
    GMTrace.o(11149466664960L, 83070);
    return localb;
  }
  
  public static boolean connect(final long paramLong)
  {
    GMTrace.i(11150137753600L, 83075);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---connect--- aSessionId = %d", new Object[] { Long.valueOf(paramLong) });
    b localb = auh();
    boolean bool = localb.mHandler.post(new Runnable()
    {
      public final void run()
      {
        boolean bool2 = true;
        GMTrace.i(11126112780288L, 82896);
        b localb = this.kCO;
        long l = paramLong;
        Assert.assertTrue(localb.kCK.containsKey(Long.valueOf(l)));
        Object localObject = localb.kCH;
        int i = ((Integer)localb.kCK.get(Long.valueOf(l))).intValue();
        w.i("MicroMsg.exdevice.BluetoothSDKManager", "***connect*** aSessionId = " + l + " aBluetoothVersion = " + i);
        boolean bool1;
        switch (i)
        {
        default: 
          Assert.assertTrue(false);
          bool1 = false;
        }
        for (;;)
        {
          if (!bool1)
          {
            w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.connect failed!!!");
            localb.d(l, false);
          }
          if (!bool1) {
            w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.connectImp failed!!!");
          }
          GMTrace.o(11126112780288L, 82896);
          return;
          if (((com.tencent.mm.plugin.g.a.d.b)localObject).joA == null)
          {
            w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            bool1 = false;
          }
          else
          {
            bool1 = ((com.tencent.mm.plugin.g.a.d.b)localObject).joA.connect(l);
            continue;
            if (((com.tencent.mm.plugin.g.a.d.b)localObject).joB == null)
            {
              w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
              bool1 = false;
            }
            else
            {
              localObject = ((com.tencent.mm.plugin.g.a.d.b)localObject).joB;
              w.i("MicroMsg.exdevice.BluetoothChatManager", "connect, session id = %d, secure = %s", new Object[] { Long.valueOf(l), "true" });
              Assert.assertTrue(((com.tencent.mm.plugin.g.a.c.a)localObject).mIsInit);
              if (!((com.tencent.mm.plugin.g.a.c.a)localObject).ahn())
              {
                w.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
                bool1 = false;
              }
              else
              {
                com.tencent.mm.plugin.g.a.c.b localb1 = (com.tencent.mm.plugin.g.a.c.b)((com.tencent.mm.plugin.g.a.c.a)localObject).jla.get(Long.valueOf(l));
                if (localb1 != null) {}
                for (bool1 = true;; bool1 = false)
                {
                  Assert.assertTrue(bool1);
                  w.i("MicroMsg.exdevice.BluetoothChatSession", "connect");
                  if (localb1.jls != null) {
                    break label387;
                  }
                  w.e("MicroMsg.exdevice.BluetoothChatSession", "Can not found remote device(" + com.tencent.mm.plugin.g.a.e.a.aU(localb1.joh) + ")");
                  if (localObject != null) {
                    ((com.tencent.mm.plugin.g.a.c.a)localObject).joe.b(localb1.mSessionId, 7, "Device not found");
                  }
                  bool1 = false;
                  break;
                }
                label387:
                localb1.mState = 2;
                if (localb1.joi != null)
                {
                  localb1.joi.disconnect();
                  localb1.joi = null;
                }
                localb1.joi = new c.a(localb1, (com.tencent.mm.plugin.g.a.c.a)localObject, localb1.jls, true);
                localObject = localb1.joi;
                w.i("MicroMsg.exdevice.ConnectThread", "------connect------");
                bool1 = bool2;
                if (!((c.a)localObject).mHandler.sendMessage(((c.a)localObject).mHandler.obtainMessage(0)))
                {
                  w.e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", new Object[] { Integer.valueOf(0) });
                  bool1 = bool2;
                  if (((c.a)localObject).joo != null)
                  {
                    ((c.a)localObject).joo.joe.d(((c.a)localObject).jon.mSessionId, false);
                    bool1 = bool2;
                  }
                }
              }
            }
          }
        }
      }
    });
    if (!bool) {
      w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "connect: instance.mHandler.post failed!!!");
    }
    GMTrace.o(11150137753600L, 83075);
    return bool;
  }
  
  public static void createSession(final long paramLong1, long paramLong2)
  {
    GMTrace.i(11149869318144L, 83073);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---createSession--- aDeviceId = %d, aChannelId = %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    b localb = auh();
    if (!localb.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11135239585792L, 82964);
        b localb = this.kCO;
        long l1 = paramLong1;
        long l2 = this.kCS;
        if (localb.kCJ.containsKey(Long.valueOf(l1)))
        {
          localb.kCH.c(l1, l2, ((Integer)localb.kCJ.get(Long.valueOf(l1))).intValue());
          GMTrace.o(11135239585792L, 82964);
          return;
        }
        Object localObject = v.auu();
        int i;
        if (!((v)localObject).kDk.containsKey(Long.valueOf(l1)))
        {
          w.e("MicroMsg.exdevice.MMExDevicePushCore", "getBluetoothVersionByDeviceId Failed!!! Cannot find BLuetoothVersion by DeviceId(%d)", new Object[] { Long.valueOf(l1) });
          i = -1;
          if (-1 == i) {
            break label266;
          }
          bool = true;
          label126:
          Assert.assertTrue(bool);
          localObject = com.tencent.mm.plugin.exdevice.j.b.bS(l1);
          w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "insertDeviceIdTypeMap deviceid = %s, BTVersion = %d", new Object[] { localObject, Integer.valueOf(i) });
          Assert.assertNotNull(localObject);
          if ((1 != i) && (i != 0)) {
            break label272;
          }
        }
        label266:
        label272:
        for (boolean bool = true;; bool = false)
        {
          Assert.assertTrue(bool);
          long l3 = com.tencent.mm.plugin.exdevice.j.b.xh((String)localObject);
          if (!localb.kCJ.containsKey(Long.valueOf(l3))) {
            localb.kCJ.put(Long.valueOf(l3), Integer.valueOf(i));
          }
          localb.kCH.c(l1, l2, i);
          GMTrace.o(11135239585792L, 82964);
          return;
          i = ((Integer)((v)localObject).kDk.get(Long.valueOf(l1))).intValue();
          break;
          bool = false;
          break label126;
        }
      }
    })) {
      w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "createSession: instance.mHandler.post failed!!!");
    }
    GMTrace.o(11149869318144L, 83073);
  }
  
  public static void destroySession(final long paramLong)
  {
    GMTrace.i(11150271971328L, 83076);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---destroySession--- aSessionId = %d", new Object[] { Long.valueOf(paramLong) });
    b localb = auh();
    if (!localb.mHandler.post(new Runnable()
    {
      public final void run()
      {
        boolean bool = true;
        GMTrace.i(11125575909376L, 82892);
        Object localObject = this.kCO;
        long l = paramLong;
        if (!((b)localObject).kCJ.containsKey(Long.valueOf(l)))
        {
          w.w("MicroMsg.exdevice.BluetoothSDKAdapter", "the session not exist");
          GMTrace.o(11125575909376L, 82892);
          return;
        }
        com.tencent.mm.plugin.g.a.d.b localb = ((b)localObject).kCH;
        int i = ((Integer)((b)localObject).kCK.get(Long.valueOf(l))).intValue();
        w.i("MicroMsg.exdevice.BluetoothSDKManager", "***Destroy Session*** aSessionId = " + l + " aBluetoothVersion" + i);
        switch (i)
        {
        default: 
          Assert.assertTrue(false);
          GMTrace.o(11125575909376L, 82892);
          return;
        case 0: 
          if (localb.joA == null)
          {
            w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            GMTrace.o(11125575909376L, 82892);
            return;
          }
          localObject = localb.joA;
          w.i("MicroMsg.exdevice.BluetoothLEManager", "------destroySession------ sessionId = %d", new Object[] { Long.valueOf(l) });
          Assert.assertTrue(((com.tencent.mm.plugin.g.a.b.b)localObject).mIsInit);
          if (!((com.tencent.mm.plugin.g.a.b.b)localObject).aha())
          {
            w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
            GMTrace.o(11125575909376L, 82892);
            return;
          }
          localObject = (d)((com.tencent.mm.plugin.g.a.b.b)localObject).jla.remove(String.valueOf(l));
          if (localObject == null)
          {
            w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot find BluetoothLESession by sessionId(%d)", new Object[] { Long.valueOf(l) });
            GMTrace.o(11125575909376L, 82892);
            return;
          }
          ((d)localObject).close();
          GMTrace.o(11125575909376L, 82892);
          return;
        }
        if (localb.joB == null)
        {
          w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
          GMTrace.o(11125575909376L, 82892);
          return;
        }
        localObject = localb.joB;
        w.i("MicroMsg.exdevice.BluetoothChatManager", "------destroySession------ sessionId = %d", new Object[] { Long.valueOf(l) });
        Assert.assertTrue(((com.tencent.mm.plugin.g.a.c.a)localObject).mIsInit);
        if (!((com.tencent.mm.plugin.g.a.c.a)localObject).ahn())
        {
          w.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
          GMTrace.o(11125575909376L, 82892);
          return;
        }
        localObject = (com.tencent.mm.plugin.g.a.c.b)((com.tencent.mm.plugin.g.a.c.a)localObject).jla.remove(Long.valueOf(l));
        if (localObject != null) {}
        for (;;)
        {
          Assert.assertTrue(bool);
          ((com.tencent.mm.plugin.g.a.c.b)localObject).disconnect();
          GMTrace.o(11125575909376L, 82892);
          return;
          bool = false;
        }
      }
    })) {
      w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "destroySession: instance.mHandler.post failed!!!");
    }
    GMTrace.o(11150271971328L, 83076);
  }
  
  public static boolean mY(final int paramInt)
  {
    GMTrace.i(11149735100416L, 83072);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---stopScan--- aBluetoothVersion = %d", new Object[] { Integer.valueOf(paramInt) });
    b localb = auh();
    boolean bool = localb.mHandler.post(new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(11152822108160L, 83095);
        Object localObject = this.kCO;
        int j = paramInt;
        localObject = ((b)localObject).kCH;
        w.i("MicroMsg.exdevice.BluetoothSDKManager", "***stopScan*** aBluetoothVersion = " + j);
        boolean bool;
        switch (j)
        {
        default: 
          Assert.assertTrue(false);
          bool = false;
          if (!bool) {
            w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.stopScan failed!!!");
          }
          break;
        }
        for (;;)
        {
          if (i == 0) {
            w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.stopScanImp failed!!!");
          }
          GMTrace.o(11152822108160L, 83095);
          return;
          if (((com.tencent.mm.plugin.g.a.d.b)localObject).joB == null)
          {
            w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
            bool = false;
            break;
          }
          bool = ((com.tencent.mm.plugin.g.a.d.b)localObject).joB.dn(false);
          break;
          if (((com.tencent.mm.plugin.g.a.d.b)localObject).joA == null)
          {
            w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
            bool = false;
            break;
          }
          bool = ((com.tencent.mm.plugin.g.a.d.b)localObject).joA.a(false, new int[0]);
          break;
          i = 1;
        }
      }
    });
    if (!bool) {
      w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "stopScan: instance.mHandler.post failed!!!");
    }
    GMTrace.o(11149735100416L, 83072);
    return bool;
  }
  
  public static boolean sendData(final long paramLong, byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(11150003535872L, 83074);
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "----sendData---- aSessionId = %d, datalength = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      Assert.assertNotNull(paramArrayOfByte);
      b localb = auh();
      boolean bool = localb.mHandler.post(new Runnable()
      {
        public final void run()
        {
          boolean bool = true;
          GMTrace.i(11167854493696L, 83207);
          b localb = this.kCO;
          long l = paramLong;
          byte[] arrayOfByte = this.kCU;
          Assert.assertTrue(localb.kCK.containsKey(Long.valueOf(l)));
          Object localObject = localb.kCH;
          int i = ((Integer)localb.kCK.get(Long.valueOf(l))).intValue();
          Assert.assertNotNull(arrayOfByte);
          w.i("MicroMsg.exdevice.BluetoothSDKManager", "***SendData*** sessionId = " + l + "bluetoothVersion = " + i);
          switch (i)
          {
          default: 
            Assert.assertTrue(false);
            bool = false;
          }
          for (;;)
          {
            if (!bool)
            {
              w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "mBTSDKMrg.sendData failed!!!");
              localb.e(l, false);
            }
            if (!bool) {
              w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.sendDataImp failed!!!");
            }
            GMTrace.o(11167854493696L, 83207);
            return;
            if (((com.tencent.mm.plugin.g.a.d.b)localObject).joA == null)
            {
              w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBLE == null");
              bool = false;
            }
            else
            {
              localObject = ((com.tencent.mm.plugin.g.a.d.b)localObject).joA;
              w.i("MicroMsg.exdevice.BluetoothLEManager", "------writeData------ sessionId = %d, data length = %d", new Object[] { Long.valueOf(l), Integer.valueOf(arrayOfByte.length) });
              Assert.assertTrue(((com.tencent.mm.plugin.g.a.b.b)localObject).mIsInit);
              if (!((com.tencent.mm.plugin.g.a.b.b)localObject).aha())
              {
                w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
                bool = false;
              }
              else
              {
                localObject = (d)((com.tencent.mm.plugin.g.a.b.b)localObject).jla.get(String.valueOf(l));
                if (localObject == null)
                {
                  w.w("MicroMsg.exdevice.BluetoothLEManager", "session is null, may be this session is closed");
                  bool = false;
                }
                else
                {
                  w.i("MicroMsg.exdevice.BluetoothLESession", "------writeData------length = %d", new Object[] { Integer.valueOf(arrayOfByte.length) });
                  w.d("MicroMsg.exdevice.BluetoothLESession", "writeData data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.al(arrayOfByte) });
                  bool = ((d)localObject).mHandler.sendMessage(((d)localObject).mHandler.obtainMessage(3, arrayOfByte));
                  continue;
                  if (((com.tencent.mm.plugin.g.a.d.b)localObject).joB == null)
                  {
                    w.e("MicroMsg.exdevice.BluetoothSDKManager", "mMrgBC == null");
                    bool = false;
                  }
                  else
                  {
                    localObject = ((com.tencent.mm.plugin.g.a.d.b)localObject).joB;
                    w.i("MicroMsg.exdevice.BluetoothChatManager", "writeData to: " + l);
                    Assert.assertTrue(((com.tencent.mm.plugin.g.a.c.a)localObject).mIsInit);
                    if (!((com.tencent.mm.plugin.g.a.c.a)localObject).ahn())
                    {
                      w.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
                      bool = false;
                    }
                    else
                    {
                      localObject = (com.tencent.mm.plugin.g.a.c.b)((com.tencent.mm.plugin.g.a.c.a)localObject).jla.get(Long.valueOf(l));
                      if (localObject != null) {}
                      for (;;)
                      {
                        Assert.assertTrue(bool);
                        w.i("MicroMsg.exdevice.BluetoothChatSession", "write");
                        if (((com.tencent.mm.plugin.g.a.c.b)localObject).jok == null) {
                          break label486;
                        }
                        bool = ((com.tencent.mm.plugin.g.a.c.b)localObject).jok.ac(arrayOfByte);
                        break;
                        bool = false;
                      }
                      label486:
                      bool = false;
                    }
                  }
                }
              }
            }
          }
        }
      });
      if (!bool) {
        w.e("MicroMsg.exdevice.BluetoothSDKAdapter", "sendData: instance.mHandler.post failed!!!");
      }
      GMTrace.o(11150003535872L, 83074);
      return bool;
      i = paramArrayOfByte.length;
    }
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3)
  {
    GMTrace.i(11150406189056L, 83077);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSessionCreate--- aSessionId = " + paramLong1 + " aDeviceID = " + paramLong2);
    Assert.assertTrue(this.kCJ.containsKey(Long.valueOf(paramLong2)));
    if (!this.kCK.containsKey(Long.valueOf(paramLong1))) {
      this.kCK.put(Long.valueOf(paramLong1), this.kCJ.get(Long.valueOf(paramLong2)));
    }
    Java2CExDevice.onBluetoothSessionCreated(paramLong2, paramLong3, paramLong1);
    GMTrace.o(11150406189056L, 83077);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(11150674624512L, 83079);
    if (paramArrayOfByte == null) {}
    for (int i = -1;; i = paramArrayOfByte.length)
    {
      w.d("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFound--- deviceMac = %s, deviceName = %s, BTversion = %d, rssi = %d, advertisment length = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (!this.kCI.isEmpty()) {
        break;
      }
      w.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
      GMTrace.o(11150674624512L, 83079);
      return;
    }
    Iterator localIterator = this.kCI.iterator();
    while (localIterator.hasNext()) {
      ((r)localIterator.next()).a(paramString1, paramString2, paramInt1, paramInt2, paramArrayOfByte);
    }
    GMTrace.o(11150674624512L, 83079);
  }
  
  public final void aT(long paramLong)
  {
    GMTrace.i(11151211495424L, 83083);
    Java2CExDevice.onBluetoothError(paramLong, 0);
    GMTrace.o(11151211495424L, 83083);
  }
  
  public final void b(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(11150943059968L, 83081);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onRecv--- sessionId = " + paramLong);
    Java2CExDevice.onBluetoothRecvData(paramLong, paramArrayOfByte);
    GMTrace.o(11150943059968L, 83081);
  }
  
  public final void d(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(11150808842240L, 83080);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onConnected--- sessionId = " + paramLong + "Connected = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothConnected(paramLong);
      GMTrace.o(11150808842240L, 83080);
      return;
    }
    Java2CExDevice.onBluetoothDisconnected(paramLong);
    GMTrace.o(11150808842240L, 83080);
  }
  
  public final void e(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(11151077277696L, 83082);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSend--- sessionId = " + paramLong + "success = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothSendDataCompleted(paramLong);
      GMTrace.o(11151077277696L, 83082);
      return;
    }
    Java2CExDevice.onBluetoothError(paramLong, 0);
    GMTrace.o(11151077277696L, 83082);
  }
  
  public final void kX(int paramInt)
  {
    GMTrace.i(11150540406784L, 83078);
    w.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFinished--- aBluetoothVersion =%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.kCI.isEmpty())
    {
      w.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
      GMTrace.o(11150540406784L, 83078);
      return;
    }
    Iterator localIterator = this.kCI.iterator();
    while (localIterator.hasNext())
    {
      r localr = (r)localIterator.next();
      if (localr != null) {
        localr.kX(paramInt);
      }
    }
    this.kCI.clear();
    GMTrace.o(11150540406784L, 83078);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */