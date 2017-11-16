package com.tencent.mm.plugin.g.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.service.r;
import com.tencent.mm.plugin.exdevice.service.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(18)
public final class f
  implements BluetoothAdapter.LeScanCallback, r, b
{
  public static boolean jkq;
  public static boolean jks;
  public final aj jkA;
  public final aj jkB;
  private final aj jkC;
  private final aj jkD;
  private final b jkl;
  public final d jko;
  public final HashSet<UUID> jkp;
  private boolean jkr;
  BluetoothAdapter jkt;
  private boolean jku;
  public int jkv;
  public String jkw;
  public e jkx;
  private Map<String, Long> jky;
  private final aj jkz;
  public final ae mHandler;
  
  static
  {
    GMTrace.i(4799491735552L, 35759);
    jkq = false;
    jks = false;
    GMTrace.o(4799491735552L, 35759);
  }
  
  public f(b paramb)
  {
    GMTrace.i(4796270510080L, 35735);
    this.jkr = false;
    this.jku = true;
    this.jkv = 0;
    this.jkw = "";
    this.jkx = null;
    this.jky = new ConcurrentHashMap();
    this.jkz = new aj(v.auu().kxr.ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4799894388736L, 35762);
        f.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4800431259648L, 35766);
            f.this.jko.a(f.this.jkv, f.this.jkw, f.this.jkx);
            GMTrace.o(4800431259648L, 35766);
          }
        });
        GMTrace.o(4799894388736L, 35762);
        return false;
      }
    }, true);
    this.jkA = new aj(v.auu().kxr.ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4803920920576L, 35792);
        Object localObject;
        if (f.this.jkp.size() > 0)
        {
          w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer now start");
          localObject = f.this;
          if (((f)localObject).jkt == null) {
            break label148;
          }
          localObject = Boolean.valueOf(((f)localObject).jkt.startLeScan((BluetoothAdapter.LeScanCallback)localObject));
          if (!((Boolean)localObject).booleanValue()) {
            break label156;
          }
          w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer restart bleScan ok");
        }
        for (;;)
        {
          boolean bool = ab.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
          f.jks = bool;
          if (!bool)
          {
            if (!f.this.jkB.bQn()) {
              f.this.jkB.stopTimer();
            }
            if (!f.this.jkA.bQn()) {
              f.this.jkA.stopTimer();
            }
          }
          GMTrace.o(4803920920576L, 35792);
          return false;
          label148:
          localObject = Boolean.valueOf(false);
          break;
          label156:
          w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer restart bleScan fail");
        }
      }
    }, true);
    this.jkB = new aj(v.auu().kxr.ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4803249831936L, 35787);
        if (f.this.jkp.size() > 0)
        {
          w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]mSelfAdaptionTimer now stop");
          f localf = f.this;
          if (localf.jkt != null) {
            localf.jkt.stopLeScan(localf);
          }
          if (f.this.jkA.bQn()) {
            f.this.jkA.z(2000L, 2000L);
          }
          GMTrace.o(4803249831936L, 35787);
          return true;
        }
        GMTrace.o(4803249831936L, 35787);
        return false;
      }
    }, true);
    this.jkC = new aj(v.auu().kxr.ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4800162824192L, 35764);
        w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]make isScanning status false");
        f.jkq = false;
        GMTrace.o(4800162824192L, 35764);
        return false;
      }
    }, true);
    this.jkD = new aj(v.auu().kxr.ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4801639219200L, 35775);
        w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]time out ,let's stop this new method scan");
        f.this.agW();
        GMTrace.o(4801639219200L, 35775);
        return false;
      }
    }, true);
    if (paramb == null) {
      throw new NullPointerException("aCallback is null");
    }
    this.jkp = new HashSet();
    this.jko = new d(this);
    this.jkl = paramb;
    this.mHandler = new ae(v.auu().kxr.ngv.getLooper());
    this.jkt = ((BluetoothManager)ab.getContext().getSystemService("bluetooth")).getAdapter();
    GMTrace.o(4796270510080L, 35735);
  }
  
  public final void a(double paramDouble, c paramc)
  {
    GMTrace.i(4796673163264L, 35738);
    w.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback, distance = %f", new Object[] { Double.valueOf(paramDouble) });
    String str2 = com.tencent.mm.plugin.exdevice.j.b.al(paramc.jki.jkn.jkO);
    String str1 = str2;
    if (str2.length() >= 32) {
      str1 = str2.substring(0, 8) + "-" + str2.substring(8, 12) + "-" + str2.substring(12, 16) + "-" + str2.substring(16, 20) + "-" + str2.substring(20);
    }
    str2 = str1 + paramc.jki.jkn.jkP + paramc.jki.jkn.jkQ;
    if (!this.jky.containsKey(str2))
    {
      this.jky.put(str2, Long.valueOf(System.currentTimeMillis()));
      this.jkl.a(paramDouble, paramc);
      int i = paramc.jki.jkn.jkQ;
      w.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback,uuid = " + str1 + ",major = " + paramc.jki.jkn.jkP + ",minor = " + (i & 0xFFFF));
      GMTrace.o(4796673163264L, 35738);
      return;
    }
    long l1 = ((Long)this.jky.get(str2)).longValue();
    long l2 = System.currentTimeMillis();
    if (l2 - l1 > 500L)
    {
      this.jky.put(str2, Long.valueOf(l2));
      this.jkl.a(paramDouble, paramc);
    }
    GMTrace.o(4796673163264L, 35738);
  }
  
  public final void a(final String paramString1, final String paramString2, int paramInt1, final int paramInt2, byte[] paramArrayOfByte)
  {
    GMTrace.i(4796941598720L, 35740);
    w.d("MicroMsg.exdevice.IBeaconServer", "onScanFound, device mac = %s, device name = %s, bluetooth version = %d, rssi = %d, advertisment = %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), com.tencent.mm.plugin.exdevice.j.b.al(paramArrayOfByte) });
    if (paramInt1 != 0)
    {
      GMTrace.o(4796941598720L, 35740);
      return;
    }
    paramString2 = new e();
    if (!paramString2.X(paramArrayOfByte))
    {
      w.d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
      GMTrace.o(4796941598720L, 35740);
      return;
    }
    paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.an(paramString2.jkn.jkO);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
      GMTrace.o(4796941598720L, 35740);
      return;
    }
    if (!this.jkp.contains(paramArrayOfByte))
    {
      w.d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
      GMTrace.o(4796941598720L, 35740);
      return;
    }
    if (this.jku) {
      this.jkw = paramString1;
    }
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4804457791488L, 35796);
        f.this.jko.a(paramInt2, paramString1, paramString2);
        GMTrace.o(4804457791488L, 35796);
      }
    });
    GMTrace.o(4796941598720L, 35740);
  }
  
  public final void agW()
  {
    GMTrace.i(4796404727808L, 35736);
    this.jky.clear();
    jkq = false;
    if (!this.jkC.bQn()) {
      this.jkC.stopTimer();
    }
    if (!this.jkB.bQn()) {
      this.jkB.stopTimer();
    }
    if (!this.jkA.bQn()) {
      this.jkA.stopTimer();
    }
    if (!this.jkz.bQn()) {
      this.jkz.stopTimer();
    }
    if (!this.jkD.bQn()) {
      this.jkD.stopTimer();
    }
    if ((this.jkr) && (this.jkt != null))
    {
      this.jkt.stopLeScan(this);
      this.jkr = false;
    }
    GMTrace.o(4796404727808L, 35736);
  }
  
  final void agX()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(4796538945536L, 35737);
        if (this.jkC.bQn()) {
          this.jkC.z(2000L, 2000L);
        }
        if ((jks) && (this.jkB.bQn())) {
          this.jkB.z(10000L, 10000L);
        }
        if (this.jkD.bQn())
        {
          if (!jks) {
            this.jkD.z(120000L, 120000L);
          }
        }
        else
        {
          if (jkq) {
            break label289;
          }
          this.jku = true;
          Object localObject1 = Boolean.valueOf(this.jkt.startLeScan(this));
          if ((((Boolean)localObject1).booleanValue()) || (jkq)) {
            break label272;
          }
          int i = 0;
          if ((((Boolean)localObject1).booleanValue()) || (i >= 3) || (jkq)) {
            break;
          }
          int j = i + 1;
          this.jkt.stopLeScan(this);
          w.e("MicroMsg.exdevice.IBeaconServer", "start IBEACON BLE scan failed,retry no " + j + " time");
          Boolean localBoolean = Boolean.valueOf(this.jkt.startLeScan(this));
          i = j;
          localObject1 = localBoolean;
          if (!localBoolean.booleanValue()) {
            continue;
          }
          jkq = true;
          this.jkr = true;
          w.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
          i = j;
          localObject1 = localBoolean;
          continue;
        }
        this.jkD.z(1800000L, 1800000L);
      }
      finally {}
    }
    GMTrace.o(4796538945536L, 35737);
    for (;;)
    {
      return;
      label272:
      this.jkr = true;
      jkq = true;
      w.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
      label289:
      GMTrace.o(4796538945536L, 35737);
    }
  }
  
  public final void kX(int paramInt)
  {
    GMTrace.i(4796807380992L, 35739);
    if (paramInt != 0)
    {
      GMTrace.o(4796807380992L, 35739);
      return;
    }
    agW();
    GMTrace.o(4796807380992L, 35739);
  }
  
  public final void onLeScan(final BluetoothDevice paramBluetoothDevice, final int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(4797210034176L, 35742);
    final e locale = new e();
    if (!locale.X(paramArrayOfByte))
    {
      w.d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
      GMTrace.o(4797210034176L, 35742);
      return;
    }
    paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.an(locale.jkn.jkO);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
      GMTrace.o(4797210034176L, 35742);
      return;
    }
    if (!this.jkp.contains(paramArrayOfByte))
    {
      w.d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
      GMTrace.o(4797210034176L, 35742);
      return;
    }
    if (this.jku)
    {
      this.jkv = paramInt;
      this.jkx = locale;
      if (this.jkz.bQn()) {
        this.jkz.z(2000L, 2000L);
      }
      this.jku = false;
    }
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4802712961024L, 35783);
        f.this.jko.a(paramInt, paramBluetoothDevice.getAddress(), locale);
        GMTrace.o(4802712961024L, 35783);
      }
    });
    GMTrace.o(4797210034176L, 35742);
  }
  
  public final void tB(String paramString)
  {
    GMTrace.i(4797075816448L, 35741);
    w.e("MicroMsg.exdevice.IBeaconServer", "------onScanError------ error code = %s, error msg = %s", new Object[] { Integer.valueOf(-1), paramString });
    GMTrace.o(4797075816448L, 35741);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */