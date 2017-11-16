package com.tencent.mm.plugin.exdevice.service;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.AccessoryCmd;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice.LongWrapper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class a
  implements r
{
  private static a kCy;
  public Object gwY;
  public g kCA;
  final HashMap<Long, Long> kCz;
  ae mHandler;
  
  static
  {
    GMTrace.i(11131078836224L, 82933);
    kCy = null;
    GMTrace.o(11131078836224L, 82933);
  }
  
  public a(g paramg)
  {
    GMTrace.i(11128528699392L, 82914);
    this.kCz = new HashMap();
    this.kCA = null;
    this.mHandler = new a(v.auu().kxr.ngv.getLooper());
    this.gwY = new Object();
    this.kCA = paramg;
    kCy = this;
    GMTrace.o(11128528699392L, 82914);
  }
  
  public static long[] aug()
  {
    GMTrace.i(11128797134848L, 82916);
    long[] arrayOfLong = com.tencent.mm.plugin.exdevice.h.a.wR("conneted_device");
    GMTrace.o(11128797134848L, 82916);
    return arrayOfLong;
  }
  
  public static void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11129334005760L, 82920);
    Assert.assertNotNull(kCy);
    w.i("MicroMsg.exdevice.BTDeviceManager", "onStateChange channelId = " + paramLong + " oldState = " + paramInt1 + " newState = " + paramInt2 + " errCode = " + paramInt3);
    paramLong = kCy.bE(paramLong);
    if (-1L == paramLong)
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
      GMTrace.o(11129334005760L, 82920);
      return;
    }
    d locald = new d();
    locald.joF = paramLong;
    locald.kwP = paramInt3;
    locald.kCE = paramInt2;
    locald.kCD = paramInt1;
    Assert.assertTrue(kCy.mHandler.sendMessage(kCy.mHandler.obtainMessage(4, 0, 0, locald)));
    GMTrace.o(11129334005760L, 82920);
  }
  
  public static void bD(long paramLong)
  {
    GMTrace.i(16062103945216L, 119672);
    w.i("MicroMsg.exdevice.BTDeviceManager", "stopTaskImp taskId = %d", new Object[] { Long.valueOf(paramLong) });
    Java2CExDevice.stopTask(paramLong);
    GMTrace.o(16062103945216L, 119672);
  }
  
  private long bE(long paramLong)
  {
    GMTrace.i(11129468223488L, 82921);
    if (!this.kCz.containsValue(Long.valueOf(paramLong)))
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find DeviceId by channelId");
      GMTrace.o(11129468223488L, 82921);
      return -1L;
    }
    Iterator localIterator = this.kCz.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramLong == ((Long)localEntry.getValue()).longValue())
      {
        paramLong = ((Long)localEntry.getKey()).longValue();
        GMTrace.o(11129468223488L, 82921);
        return paramLong;
      }
    }
    Assert.assertTrue(false);
    GMTrace.o(11129468223488L, 82921);
    return -1L;
  }
  
  public static void c(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(11129199788032L, 82919);
    Assert.assertNotNull(kCy);
    w.i("MicroMsg.exdevice.BTDeviceManager", "onTaskEnd taskId = " + paramLong + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    e locale = new e();
    locale.kCF = paramLong;
    locale.kwP = paramInt2;
    locale.kxb = paramInt1;
    locale.kxc = paramString;
    Assert.assertTrue(kCy.mHandler.sendMessage(kCy.mHandler.obtainMessage(3, 0, 0, locale)));
    GMTrace.o(11129199788032L, 82919);
  }
  
  public static boolean mY(int paramInt)
  {
    GMTrace.i(11128662917120L, 82915);
    w.i("MicroMsg.exdevice.BTDeviceManager", "------stopScan------");
    if (!b.mY(paramInt))
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.stopScan Failed!!!");
      GMTrace.o(11128662917120L, 82915);
      return false;
    }
    GMTrace.o(11128662917120L, 82915);
    return true;
  }
  
  public static void onDeviceRequest(long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(11129602441216L, 82922);
    if (paramArrayOfByte == null) {}
    for (int i = -1;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = %d, seq = %d, cmdId =%d, datain len = %d, errCode = %d", new Object[] { Long.valueOf(paramLong), Short.valueOf(paramShort1), Short.valueOf(paramShort2), Integer.valueOf(i), Integer.valueOf(paramInt) });
      Assert.assertNotNull(kCy);
      w.i("MicroMsg.exdevice.BTDeviceManager", "onDeviceRequest channelId = " + paramLong + " seq = " + paramShort1 + "cmdId = " + paramShort2 + "errCode = " + paramInt);
      paramLong = kCy.bE(paramLong);
      if (-1L != paramLong) {
        break;
      }
      w.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId by channelId");
      GMTrace.o(11129602441216L, 82922);
      return;
    }
    b localb = new b();
    localb.joF = paramLong;
    localb.kwQ = paramArrayOfByte;
    localb.kCC = paramShort2;
    localb.kwW = paramShort1;
    Assert.assertTrue(kCy.mHandler.sendMessage(kCy.mHandler.obtainMessage(5, paramInt, 0, localb)));
    GMTrace.o(11129602441216L, 82922);
  }
  
  public final int a(long paramLong, p paramp)
  {
    GMTrace.i(11129065570304L, 82918);
    w.i("MicroMsg.exdevice.BTDeviceManager", "startTaskImp, taskId = %d", new Object[] { Long.valueOf(paramLong) });
    Assert.assertNotNull(paramp);
    long l;
    try
    {
      l = paramp.aup().auk();
      if (!com.tencent.mm.plugin.exdevice.h.a.t("conneted_device", l))
      {
        w.w("MicroMsg.exdevice.BTDeviceManager", "Cannot startTask because this channel is close aready!!!");
        paramp = new e();
        paramp.kCF = paramLong;
        paramp.kwP = -1;
        paramp.kxb = -1;
        paramp.kxc = "Channel is close aready!!!";
        Assert.assertTrue(kCy.mHandler.sendMessage(kCy.mHandler.obtainMessage(3, 0, 0, paramp)));
        GMTrace.o(11129065570304L, 82918);
        return -1;
      }
    }
    catch (RemoteException paramp)
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "Remote getDeviceId failed!!! %s", new Object[] { paramp.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", paramp, "", new Object[0]);
      this.kCA.c(paramLong, -1, -1, "Remote getDeviceId failed!!!");
      GMTrace.o(11129065570304L, 82918);
      return -1;
    }
    if (!this.kCz.containsKey(Long.valueOf(l)))
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find Channel by DeviceId(%s) in mMapDeviceChannelId", new Object[] { Long.valueOf(l) });
      this.kCA.c(paramLong, -1, -1, "Cannot find Channel by DeviceId!!!");
      GMTrace.o(11129065570304L, 82918);
      return -1;
    }
    Java2CExDevice.AccessoryCmd localAccessoryCmd = new Java2CExDevice.AccessoryCmd();
    localAccessoryCmd.channelID = ((Long)this.kCz.get(Long.valueOf(l))).longValue();
    int i;
    try
    {
      localAccessoryCmd.reqCmdID = paramp.aup().aum();
      localAccessoryCmd.respCmdID = paramp.aup().aun();
      byte[] arrayOfByte;
    }
    catch (RemoteException paramp)
    {
      try
      {
        arrayOfByte = paramp.aup().aul();
        i = paramp.aup().auo();
        if (Java2CExDevice.startTask(paramLong, (short)i, localAccessoryCmd, arrayOfByte) == 0) {
          break label490;
        }
        w.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startTask Failed!!!");
        GMTrace.o(11129065570304L, 82918);
        return -1;
      }
      catch (RemoteException paramp)
      {
        w.e("MicroMsg.exdevice.BTDeviceManager", "Remote getDataOut failed!!! %s", new Object[] { paramp.getMessage() });
        w.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", paramp, "", new Object[0]);
        this.kCA.c(paramLong, -1, -1, "Remote getDataOut failed!!!!!!");
        GMTrace.o(11129065570304L, 82918);
        return -1;
      }
      paramp = paramp;
      w.e("MicroMsg.exdevice.BTDeviceManager", "Remote getResquestCmdId or getResponseCmdId failed!!! %s", new Object[] { paramp.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.BTDeviceManager", paramp, "", new Object[0]);
      this.kCA.c(paramLong, -1, -1, "Remote getResquestCmdId or getResponseCmdId failed!!!");
      GMTrace.o(11129065570304L, 82918);
      return -1;
    }
    label490:
    tmp500_497[0] = Long.valueOf(paramLong);
    Object[] tmp507_500 = tmp500_497;
    tmp507_500[1] = Long.valueOf(l);
    Object[] tmp515_507 = tmp507_500;
    tmp515_507[2] = Long.valueOf(tmp507_500.channelID);
    Object[] tmp526_515 = tmp515_507;
    tmp526_515[3] = Integer.valueOf(i);
    Object[] tmp534_526 = tmp526_515;
    tmp534_526[4] = Integer.valueOf(tmp507_500.reqCmdID);
    Object[] tmp545_534 = tmp534_526;
    tmp545_534[5] = Integer.valueOf(tmp507_500.respCmdID);
    w.i("MicroMsg.exdevice.BTDeviceManager", "------let task go------ taskId = %d, deviceId = %d, channelId = %d, seq = %d, reqCmdId = %d, respCmdId = %d", tmp545_534);
    GMTrace.o(11129065570304L, 82918);
    return 0;
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(11129870876672L, 82924);
    if (paramArrayOfByte == null) {}
    for (int i = -1;; i = paramArrayOfByte.length)
    {
      w.d("MicroMsg.exdevice.BTDeviceManager", "------onScanFound------ aBluetoothVersion = %d, device mac = %s, device name = %s, rssi = %d, advertisment length = %d", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i) });
      paramString1 = new c(paramString1, paramString2, paramInt2, paramArrayOfByte);
      Assert.assertTrue(this.mHandler.sendMessage(this.mHandler.obtainMessage(1, 0, 0, paramString1)));
      GMTrace.o(11129870876672L, 82924);
      return;
    }
  }
  
  public final boolean bC(long paramLong)
  {
    GMTrace.i(11128931352576L, 82917);
    w.i("MicroMsg.exdevice.BTDeviceManager", "stopChannelImp deviceId = " + paramLong);
    w.i("MicroMsg.exdevice.BTDeviceManager", "remove the device from connected devices : [%d]", new Object[] { Long.valueOf(paramLong) });
    if (!com.tencent.mm.plugin.exdevice.h.a.v("conneted_device", paramLong)) {
      w.e("MicroMsg.exdevice.BTDeviceManager", "removeFromSharedPreferences failed!!!");
    }
    if (!this.kCz.containsKey(Long.valueOf(paramLong)))
    {
      w.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
      GMTrace.o(11128931352576L, 82917);
      return false;
    }
    Java2CExDevice.stopChannelService(((Long)this.kCz.get(Long.valueOf(paramLong))).longValue());
    Java2CExDevice.destroyChannel(((Long)this.kCz.get(Long.valueOf(paramLong))).longValue());
    GMTrace.o(11128931352576L, 82917);
    return true;
  }
  
  public final void kX(int paramInt)
  {
    GMTrace.i(11129736658944L, 82923);
    w.i("MicroMsg.exdevice.BTDeviceManager", "******onScanFinished******aBluetoothVersion = " + paramInt);
    Assert.assertTrue(this.mHandler.sendMessage(this.mHandler.obtainMessage(2, 0, 0, null)));
    GMTrace.o(11129736658944L, 82923);
  }
  
  public final void tB(String paramString)
  {
    GMTrace.i(11130005094400L, 82925);
    w.i("MicroMsg.exdevice.BTDeviceManager", "------onScanError------ error code = %d, error msg = %s", new Object[] { Integer.valueOf(-1), Integer.valueOf(-1) });
    if (!this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11149198229504L, 83068);
        a.this.kCA.a(0, -1, "", "", "", 0, null);
        GMTrace.o(11149198229504L, 83068);
      }
    })) {
      w.e("MicroMsg.exdevice.BTDeviceManager", "onScanError: mHandler.post failed!!!");
    }
    GMTrace.o(11130005094400L, 82925);
  }
  
  private final class a
    extends ae
  {
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(11134300061696L, 82957);
      GMTrace.o(11134300061696L, 82957);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11134434279424L, 82958);
      long l;
      switch (paramMessage.what)
      {
      default: 
        GMTrace.o(11134434279424L, 82958);
        return;
      case 2: 
        a.this.kCA.a(2, 0, null, null, null, 0, null);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 1: 
        paramMessage = (a.c)paramMessage.obj;
        a.this.kCA.a(1, 0, null, paramMessage.joI, paramMessage.joJ, paramMessage.joK, paramMessage.joL);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 3: 
        paramMessage = (a.e)paramMessage.obj;
        a.this.kCA.c(paramMessage.kCF, paramMessage.kxb, paramMessage.kwP, paramMessage.kxc);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 4: 
        paramMessage = (a.d)paramMessage.obj;
        a.this.kCA.b(paramMessage.joF, paramMessage.kCD, paramMessage.kCE, paramMessage.kwP);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 5: 
        ??? = (a.b)paramMessage.obj;
        a.this.kCA.a(paramMessage.arg1, ((a.b)???).joF, ((a.b)???).kwW, ((a.b)???).kCC, ((a.b)???).kwQ);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 6: 
        GMTrace.o(11134434279424L, 82958);
        return;
      case 7: 
        GMTrace.o(11134434279424L, 82958);
        return;
      case 10: 
        ??? = (a.f)paramMessage.obj;
        paramMessage = a.this;
        l = ((a.f)???).joF;
        ??? = ((a.f)???).jkV;
        w.i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKeyImp------ deviceId = %d", new Object[] { Long.valueOf(l) });
        if (!paramMessage.kCz.containsKey(Long.valueOf(l)))
        {
          w.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
          GMTrace.o(11134434279424L, 82958);
          return;
        }
        Java2CExDevice.setChannelSessionKey(((Long)paramMessage.kCz.get(Long.valueOf(l))).longValue(), (byte[])???);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 8: 
        paramMessage = (a.g)paramMessage.obj;
        a.this.a(paramMessage.kCF, paramMessage.kCG);
        GMTrace.o(11134434279424L, 82958);
        return;
      case 9: 
        a.bD(((Long)paramMessage.obj).longValue());
        GMTrace.o(11134434279424L, 82958);
        return;
      case 11: 
        for (;;)
        {
          a locala;
          synchronized (a.this.gwY)
          {
            locala = a.this;
            l = ((Long)paramMessage.obj).longValue();
            w.i("MicroMsg.exdevice.BTDeviceManager", "startChannelImp deviceId = %d", new Object[] { Long.valueOf(l) });
            if (com.tencent.mm.plugin.exdevice.h.a.t("conneted_device", l))
            {
              w.w("MicroMsg.exdevice.BTDeviceManager", "This deviceId is not call stop channel before startChannel, Call it");
              locala.bC(l);
            }
            paramMessage = new Java2CExDevice.LongWrapper();
            paramMessage.value = -1L;
            i = Java2CExDevice.createChannel(l, paramMessage);
            if (i != 0)
            {
              w.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.createChannel Failed, ret = " + i);
              locala.kCA.b(l, 1, 4, -1);
              GMTrace.o(11134434279424L, 82958);
              return;
            }
            w.i("MicroMsg.exdevice.BTDeviceManager", "Create channel id is ok, deviceId = %d, channelId = %d", new Object[] { Long.valueOf(l), Long.valueOf(paramMessage.value) });
            locala.kCz.put(Long.valueOf(l), Long.valueOf(paramMessage.value));
            w.i("MicroMsg.exdevice.BTDeviceManager", "add the device to connected devices : [%d]", new Object[] { Long.valueOf(l) });
            if (!com.tencent.mm.plugin.exdevice.h.a.u("conneted_device", l))
            {
              w.e("MicroMsg.exdevice.BTDeviceManager", "addToSharedPreferences failed!!!");
              locala.kCA.b(l, 1, 4, -1);
            }
          }
          int i = Java2CExDevice.startChannelService(paramMessage.value);
          if (i != 0)
          {
            w.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startChannelService Failed, ret = " + i);
            locala.kCA.b(l, 1, 4, -1);
          }
        }
      }
      synchronized (a.this.gwY)
      {
        a.this.bC(((Long)paramMessage.obj).longValue());
        GMTrace.o(11134434279424L, 82958);
        return;
      }
    }
  }
  
  private static final class b
  {
    long joF;
    short kCC;
    byte[] kwQ;
    short kwW;
    
    public b()
    {
      GMTrace.i(11136581763072L, 82974);
      this.joF = 0L;
      this.kwW = 0;
      this.kCC = 0;
      this.kwQ = null;
      GMTrace.o(11136581763072L, 82974);
    }
  }
  
  private static final class c
  {
    String joI;
    String joJ;
    int joK;
    byte[] joL;
    
    public c(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(11162754220032L, 83169);
      this.joI = paramString1;
      this.joJ = paramString2;
      this.joK = paramInt;
      this.joL = paramArrayOfByte;
      GMTrace.o(11162754220032L, 83169);
    }
  }
  
  private static final class d
  {
    long joF;
    int kCD;
    int kCE;
    int kwP;
    
    public d()
    {
      GMTrace.i(11166109663232L, 83194);
      this.joF = 0L;
      this.kCD = 0;
      this.kCE = 0;
      this.kwP = 0;
      GMTrace.o(11166109663232L, 83194);
    }
  }
  
  private static final class e
  {
    long kCF;
    int kwP;
    int kxb;
    String kxc;
    
    public e()
    {
      GMTrace.i(11168794017792L, 83214);
      this.kCF = 0L;
      this.kxb = 0;
      this.kwP = 0;
      this.kxc = null;
      GMTrace.o(11168794017792L, 83214);
    }
  }
  
  private static final class f
  {
    byte[] jkV;
    long joF;
    
    public f(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(11152956325888L, 83096);
      this.joF = paramLong;
      this.jkV = paramArrayOfByte;
      GMTrace.o(11152956325888L, 83096);
    }
  }
  
  private static final class g
  {
    long kCF;
    p kCG;
    
    public g(long paramLong, p paramp)
    {
      GMTrace.i(11157117075456L, 83127);
      this.kCF = paramLong;
      this.kCG = paramp;
      GMTrace.o(11157117075456L, 83127);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */