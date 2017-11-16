package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.service.j.a;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.fq;
import com.tencent.mm.protocal.c.fr;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class aa
  extends j.a
  implements e
{
  static Object gwY;
  private static final byte[] kAc;
  private static aa kAd;
  static LinkedList<String> kAh;
  private static HashMap<String, fr> kAi;
  final aj ikv;
  a kAe;
  HashMap<String, byte[]> kAf;
  LinkedList<com.tencent.mm.ad.k> kAg;
  volatile String kyK;
  boolean kzq;
  
  static
  {
    GMTrace.i(10949482250240L, 81580);
    kAc = new byte[] { -2, 1, 1 };
    gwY = new Object();
    kAh = new LinkedList();
    kAi = new HashMap(32);
    GMTrace.o(10949482250240L, 81580);
  }
  
  private aa()
  {
    GMTrace.i(10948676943872L, 81574);
    this.kAf = new HashMap();
    this.kAg = new LinkedList();
    this.ikv = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(10969078038528L, 81726);
        w.i("MicroMsg.exdevice.ScanDeviceLogic", "Restart scanning...");
        ad.atY().a(0, aa.this);
        GMTrace.o(10969078038528L, 81726);
        return true;
      }
    }, true);
    this.kzq = false;
    GMTrace.o(10948676943872L, 81574);
  }
  
  private void a(fr paramfr)
  {
    GMTrace.i(10949213814784L, 81578);
    if (paramfr == null)
    {
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "item null..");
      GMTrace.o(10949213814784L, 81578);
      return;
    }
    if (bg.nm(paramfr.tTU))
    {
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
      GMTrace.o(10949213814784L, 81578);
      return;
    }
    if (paramfr.tST != 0)
    {
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "device(%s) is invalid", new Object[] { paramfr.tTU });
      GMTrace.o(10949213814784L, 81578);
      return;
    }
    if ((paramfr.tUb == null) || (bg.nm(paramfr.tUb.jhl)))
    {
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid device id(mac=%s)", new Object[] { paramfr.tTU });
      GMTrace.o(10949213814784L, 81578);
      return;
    }
    if ((bg.nm(paramfr.tUb.tSz)) || (!paramfr.tUb.tSz.equals(this.kyK)))
    {
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "device type (%s) is not equal to brand name (%s)", new Object[] { paramfr.jhm, this.kyK });
      GMTrace.o(10949213814784L, 81578);
      return;
    }
    byte[] arrayOfByte = (byte[])this.kAf.get(paramfr.tTU);
    String str1 = paramfr.tTU;
    String str2 = paramfr.tUb.tSz;
    String str3 = paramfr.tUb.jhl;
    String str4 = paramfr.jhm;
    int i;
    if (arrayOfByte == null)
    {
      i = 0;
      w.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, BatchSearch find mac=%s, deviceType=%s, deviceId=%s, %s, %s", new Object[] { str1, str2, str3, str4, Integer.valueOf(i) });
      if (this.kAe == null) {
        break label337;
      }
      if (arrayOfByte == null) {
        break label353;
      }
    }
    label337:
    label353:
    for (arrayOfByte = ak(arrayOfByte);; arrayOfByte = null)
    {
      this.kAe.a(paramfr.tUb.jhl, arrayOfByte, false);
      GMTrace.o(10949213814784L, 81578);
      return;
      i = arrayOfByte.length;
      break;
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "mCallback null");
      GMTrace.o(10949213814784L, 81578);
      return;
    }
  }
  
  private static byte[] ak(byte[] paramArrayOfByte)
  {
    GMTrace.i(10949348032512L, 81579);
    byte[] arrayOfByte = null;
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k;
      try
      {
        int m;
        if (i < paramArrayOfByte.length - 2)
        {
          m = i + 1;
          k = paramArrayOfByte[i];
          if (k != 0) {
            i = m + 1;
          }
        }
        switch (paramArrayOfByte[m])
        {
        case -1: 
          w.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data size = %s", new Object[] { Integer.valueOf(k) });
          arrayOfByte = new byte[k - 1];
          if (k > 1)
          {
            if ((j < 32) && (j < arrayOfByte.length))
            {
              m = i + 1;
              arrayOfByte[j] = paramArrayOfByte[i];
              j += 1;
              i = m;
              break label221;
            }
          }
          else
          {
            w.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data %s" + b.al(arrayOfByte));
            continue;
            GMTrace.o(10949348032512L, 81579);
            return arrayOfByte;
          }
          break;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.exdevice.ScanDeviceLogic", paramArrayOfByte, "", new Object[0]);
        w.e("MicroMsg.exdevice.ScanDeviceLogic", "EX in parseBroadcastPacket %s", new Object[] { paramArrayOfByte.getMessage() });
        GMTrace.o(10949348032512L, 81579);
        return null;
      }
      break label221;
      i = k - 1 + i;
      continue;
      label221:
      k -= 1;
    }
  }
  
  public static aa atO()
  {
    GMTrace.i(10948542726144L, 81573);
    if (kAd != null)
    {
      localaa = kAd;
      GMTrace.o(10948542726144L, 81573);
      return localaa;
    }
    aa localaa = new aa();
    kAd = localaa;
    GMTrace.o(10948542726144L, 81573);
    return localaa;
  }
  
  public final void a(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(10949079597056L, 81577);
    if (paramk == null) {}
    for (Object localObject = "";; localObject = Integer.valueOf(paramk.getType()))
    {
      w.i("MicroMsg.exdevice.ScanDeviceLogic", "onSceneEnd, %s, errType=%d, errCode=%d, errMsg=%s", new Object[] { localObject, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ??? });
      this.kAg.remove(paramk);
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk != null)) {
        break;
      }
      w.e("MicroMsg.exdevice.ScanDeviceLogic", "do scene failed!!!");
      GMTrace.o(10949079597056L, 81577);
      return;
    }
    if (542 == paramk.getType())
    {
      paramk = ((k)paramk).atJ().tTY.iterator();
      while (paramk.hasNext())
      {
        localObject = (fr)paramk.next();
        if (bg.nm(((fr)localObject).tTU))
        {
          w.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
        }
        else
        {
          String str = this.kyK + "_" + ((fr)localObject).tTU;
          synchronized (gwY)
          {
            if (kAh.contains(str)) {
              kAh.remove(str);
            }
            if (!kAi.containsKey(str))
            {
              w.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, put into cache, %s", new Object[] { str });
              kAi.put(str, localObject);
            }
            a((fr)localObject);
          }
        }
      }
    }
    GMTrace.o(10949079597056L, 81577);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String arg5, int paramInt3, byte[] paramArrayOfByte)
  {
    GMTrace.i(10948945379328L, 81576);
    if (this.kAf.containsKey(paramString2))
    {
      GMTrace.o(10948945379328L, 81576);
      return;
    }
    if (paramString2 == null)
    {
      w.w("MicroMsg.exdevice.ScanDeviceLogic", "deviceMac is null");
      GMTrace.o(10948945379328L, 81576);
      return;
    }
    paramString1 = paramString2.replaceAll(":", "");
    ??? = kAc;
    if ((bg.bq(paramArrayOfByte)) || (bg.bq(???)) || (???.length > paramArrayOfByte.length)) {
      paramInt1 = -1;
    }
    for (;;)
    {
      if (paramInt1 != -1) {
        if (paramInt1 + 9 <= paramArrayOfByte.length)
        {
          ??? = new byte[paramInt1 + 9];
          System.arraycopy(paramArrayOfByte, 0, ???, 0, ???.length);
          w.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, scanFound mac:%s, realAd:%s", new Object[] { paramString1, b.al(???) });
          this.kAf.put(paramString1, ???);
          label167:
          paramString1 = this.kyK + "_" + paramString2;
          if (kAi.containsKey(paramString1)) {
            break label406;
          }
        }
      }
      synchronized (gwY)
      {
        if (kAh.contains(paramString1))
        {
          w.d("MicroMsg.exdevice.ScanDeviceLogic", "hakon, already doing");
          GMTrace.o(10948945379328L, 81576);
          return;
          paramInt2 = 0;
          for (;;)
          {
            if (paramInt2 >= paramArrayOfByte.length) {
              break label274;
            }
            paramInt1 = paramInt2;
            if (b.a(paramArrayOfByte, paramInt2, ???)) {
              break;
            }
            paramInt2 += 1;
          }
          label274:
          paramInt1 = -1;
          continue;
          this.kAf.put(paramString1, null);
          break label167;
          this.kAf.put(paramString1, null);
          break label167;
        }
        else
        {
          kAh.add(paramString1);
          ??? = this.kyK;
          paramString2 = new k(new String[] { paramString2 }, ???);
          if (at.wS().a(paramString2, 0))
          {
            this.kAg.add(paramString2);
            GMTrace.o(10948945379328L, 81576);
            return;
          }
        }
      }
    }
    kAh.remove(paramString1);
    w.e("MicroMsg.exdevice.ScanDeviceLogic", "MMCore.getNetSceneQueue().doScene failed!!!");
    GMTrace.o(10948945379328L, 81576);
    return;
    label406:
    w.d("MicroMsg.exdevice.ScanDeviceLogic", "hakon, hit cache %s, %s", new Object[] { this.kyK, paramString2 });
    a((fr)kAi.get(paramString1));
    GMTrace.o(10948945379328L, 81576);
  }
  
  public final void mX(int paramInt)
  {
    GMTrace.i(10948811161600L, 81575);
    w.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice %s, stopTimer", new Object[] { Integer.valueOf(paramInt) });
    this.ikv.stopTimer();
    if (this.kzq)
    {
      ??? = ad.atY();
      w.i("MicroMsg.exdevice.ExdeviceConnectManager", "stopScanLogic, bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
      if (this == null) {
        w.e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
      }
      for (;;)
      {
        this.kzq = false;
        this.kyK = null;
        this.kAf.clear();
        at.wS().b(542, this);
        ??? = this.kAg.iterator();
        while (((Iterator)???).hasNext())
        {
          com.tencent.mm.ad.k localk = (com.tencent.mm.ad.k)((Iterator)???).next();
          if (localk != null) {
            at.wS().c(localk);
          }
        }
        if (((d)???).kxu == null) {
          w.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
        } else if (u.aut().kxo == null) {
          w.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
        } else if (!u.aut().kxo.c(paramInt, ((d)???).kxA)) {
          w.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
        }
      }
      this.kAg.clear();
      if (this.kAe != null) {
        this.kAe.a(null, null, true);
      }
      this.kAe = null;
    }
    synchronized (gwY)
    {
      kAh.clear();
      GMTrace.o(10948811161600L, 81575);
      return;
      w.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice has been stoped");
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */