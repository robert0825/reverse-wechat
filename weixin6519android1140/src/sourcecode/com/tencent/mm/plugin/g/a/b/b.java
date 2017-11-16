package com.tencent.mm.plugin.g.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.view.InputDevice;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

@TargetApi(18)
public final class b
{
  public a jkZ;
  public BluetoothAdapter jkt;
  public final HashMap<String, d> jla;
  public volatile boolean jlb;
  public c jlc;
  public g jld;
  public final HashSet<Long> jle;
  private c.a jlf;
  private g.a jlg;
  public ae mHandler;
  public volatile boolean mIsInit;
  private Runnable mRunnable;
  public Context sN;
  
  public b(af paramaf)
  {
    GMTrace.i(4816000516096L, 35882);
    this.jkZ = null;
    this.sN = null;
    this.jla = new HashMap();
    this.jkt = null;
    this.mHandler = null;
    this.mRunnable = null;
    this.jlb = false;
    this.mIsInit = false;
    this.jle = new HashSet();
    this.jlf = new c.a()
    {
      public final void ahb()
      {
        GMTrace.i(4832240861184L, 36003);
        GMTrace.o(4832240861184L, 36003);
      }
      
      public final void c(final BluetoothDevice paramAnonymousBluetoothDevice, final int paramAnonymousInt, final byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4832106643456L, 36002);
        w.d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", new Object[] { paramAnonymousBluetoothDevice.getName(), paramAnonymousBluetoothDevice.getAddress(), Long.valueOf(com.tencent.mm.plugin.exdevice.j.b.xh(paramAnonymousBluetoothDevice.getAddress())) });
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4831301337088L, 35996);
            b.this.b(paramAnonymousBluetoothDevice, paramAnonymousInt, paramAnonymousArrayOfByte);
            GMTrace.o(4831301337088L, 35996);
          }
        });
        GMTrace.o(4832106643456L, 36002);
      }
    };
    this.jlg = new g.a()
    {
      public final void c(final BluetoothDevice paramAnonymousBluetoothDevice, final int paramAnonymousInt, final byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(4819355959296L, 35907);
        w.d("MicroMsg.exdevice.BluetoothLEManager", "------onDiscover------ device Name = %s, mac = %s(%d)", new Object[] { paramAnonymousBluetoothDevice.getName(), paramAnonymousBluetoothDevice.getAddress(), Long.valueOf(com.tencent.mm.plugin.exdevice.j.b.xh(paramAnonymousBluetoothDevice.getAddress())) });
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4832509296640L, 36005);
            b.this.b(paramAnonymousBluetoothDevice, paramAnonymousInt, paramAnonymousArrayOfByte);
            GMTrace.o(4832509296640L, 36005);
          }
        });
        GMTrace.o(4819355959296L, 35907);
      }
      
      public final void kY(int paramAnonymousInt)
      {
        GMTrace.i(4819490177024L, 35908);
        w.i("MicroMsg.exdevice.BluetoothLEManager", "(API21)start ble scan failed, errorCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt != 1) {
          b.this.mHandler.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4819087523840L, 35905);
              if (!b.this.jle.isEmpty())
              {
                Iterator localIterator = b.this.jle.iterator();
                while (localIterator.hasNext())
                {
                  Long localLong = (Long)localIterator.next();
                  w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
                  if (b.this.jkZ != null) {
                    b.this.jkZ.d(localLong.longValue(), false);
                  }
                }
                b.this.jle.clear();
              }
              GMTrace.o(4819087523840L, 35905);
            }
          });
        }
        GMTrace.o(4819490177024L, 35908);
      }
    };
    this.mRunnable = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4839757053952L, 36059);
        b.this.jlb = false;
        b.this.dm(false);
        w.i("MicroMsg.exdevice.BluetoothLEManager", "Time out for discovering. Stop it");
        b.this.agZ();
        if (b.this.jkZ != null) {
          b.this.jkZ.ahb();
        }
        GMTrace.o(4839757053952L, 36059);
      }
    };
    this.mHandler = new ae(paramaf.ngv.getLooper());
    GMTrace.o(4816000516096L, 35882);
  }
  
  private void agW()
  {
    GMTrace.i(4816403169280L, 35885);
    if (!this.jlb)
    {
      GMTrace.o(4816403169280L, 35885);
      return;
    }
    this.mHandler.removeCallbacks(this.mRunnable);
    this.jlb = false;
    dm(false);
    agZ();
    if (this.jkZ != null) {
      this.jkZ.ahb();
    }
    GMTrace.o(4816403169280L, 35885);
  }
  
  public final boolean a(boolean paramBoolean, int... paramVarArgs)
  {
    GMTrace.i(4816537387008L, 35886);
    StringBuilder localStringBuilder = new StringBuilder("------scanLEDevice------");
    if (paramBoolean) {}
    for (Object localObject = "true";; localObject = "false")
    {
      w.i("MicroMsg.exdevice.BluetoothLEManager", (String)localObject);
      Assert.assertTrue(this.mIsInit);
      if (aha()) {
        break;
      }
      w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      GMTrace.o(4816537387008L, 35886);
      return false;
    }
    if (paramBoolean)
    {
      if (this.jlb)
      {
        GMTrace.o(4816537387008L, 35886);
        return true;
      }
      if (!dm(paramBoolean))
      {
        w.e("MicroMsg.exdevice.BluetoothLEManager", "mAdapter.startLeScan Failed!!!");
        if (!this.jle.isEmpty())
        {
          paramVarArgs = this.jle.iterator();
          while (paramVarArgs.hasNext())
          {
            localObject = (Long)paramVarArgs.next();
            w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localObject });
            if (this.jkZ != null) {
              this.jkZ.d(((Long)localObject).longValue(), false);
            }
          }
          this.jle.clear();
        }
        GMTrace.o(4816537387008L, 35886);
        return false;
      }
      if ((paramVarArgs != null) && (paramVarArgs.length > 0) && (paramVarArgs[0] == 1)) {
        this.mHandler.removeCallbacks(this.mRunnable);
      }
      for (;;)
      {
        this.jlb = true;
        GMTrace.o(4816537387008L, 35886);
        return true;
        this.mHandler.postDelayed(this.mRunnable, 10000L);
      }
    }
    agW();
    GMTrace.o(4816537387008L, 35886);
    return true;
  }
  
  public final void agZ()
  {
    GMTrace.i(4816134733824L, 35883);
    w.i("MicroMsg.exdevice.BluetoothLEManager", "tryToCleanPreScanSet");
    if (!this.jle.isEmpty())
    {
      Iterator localIterator = this.jle.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        w.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
        if (this.jkZ != null) {
          this.jkZ.d(localLong.longValue(), false);
        }
      }
      this.jle.clear();
    }
    GMTrace.o(4816134733824L, 35883);
  }
  
  @TargetApi(18)
  public final boolean aha()
  {
    GMTrace.i(4816268951552L, 35884);
    Assert.assertTrue(this.mIsInit);
    boolean bool = this.sN.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    GMTrace.o(4816268951552L, 35884);
    return bool;
  }
  
  public final void b(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(16024120328192L, 119389);
    w.d("MicroMsg.exdevice.BluetoothLEManager", "onLeScanImp");
    long l;
    d locald;
    if (!this.jle.isEmpty())
    {
      l = com.tencent.mm.plugin.exdevice.j.b.xh(paramBluetoothDevice.getAddress());
      if (this.jle.contains(Long.valueOf(l)))
      {
        w.i("MicroMsg.exdevice.BluetoothLEManager", "------onConnectPreScanFound------ sessionid = %d", new Object[] { Long.valueOf(l) });
        locald = (d)this.jla.get(String.valueOf(l));
        if (locald != null) {
          break label181;
        }
        w.e("MicroMsg.exdevice.BluetoothLEManager", "null == les");
        if (this.jkZ != null) {
          this.jkZ.d(l, false);
        }
      }
    }
    for (;;)
    {
      this.jle.remove(Long.valueOf(l));
      if (this.jle.isEmpty()) {
        w.i("MicroMsg.exdevice.BluetoothLEManager", "Connect PreScan is done.");
      }
      if (this.jkZ != null) {
        this.jkZ.a(paramBluetoothDevice.getAddress(), paramBluetoothDevice.getName(), paramInt, paramArrayOfByte);
      }
      GMTrace.o(16024120328192L, 119389);
      return;
      label181:
      if (!locald.connect())
      {
        w.e("MicroMsg.exdevice.BluetoothLEManager", "les.connect() Failed!!!");
        if (this.jkZ != null) {
          this.jkZ.d(l, false);
        }
      }
    }
  }
  
  public final boolean connect(long paramLong)
  {
    GMTrace.i(4816805822464L, 35888);
    w.i("MicroMsg.exdevice.BluetoothLEManager", "------connect------ sessionId = %d ", new Object[] { Long.valueOf(paramLong) });
    Assert.assertTrue(this.mIsInit);
    if (!aha())
    {
      w.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
      GMTrace.o(4816805822464L, 35888);
      return false;
    }
    d locald = (d)this.jla.get(String.valueOf(paramLong));
    boolean bool;
    Object localObject1;
    if (locald != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localObject1 = (BluetoothManager)this.sN.getSystemService("bluetooth");
      if (localObject1 != null) {
        break label157;
      }
      w.e("MicroMsg.exdevice.BluetoothLEManager", "null == bluetoothManager");
    }
    label157:
    label650:
    for (;;)
    {
      this.jle.add(Long.valueOf(paramLong));
      bool = a(true, new int[0]);
      GMTrace.o(4816805822464L, 35888);
      return bool;
      bool = false;
      break;
      Object localObject2 = ((BluetoothManager)localObject1).getConnectedDevices(8);
      if (localObject2 == null)
      {
        w.i("MicroMsg.exdevice.BluetoothLEManager", "null == list, may be no device is connected phone now");
      }
      else
      {
        localObject2 = ((List)localObject2).iterator();
        Object localObject3;
        long l;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (BluetoothDevice)((Iterator)localObject2).next();
          l = com.tencent.mm.plugin.exdevice.j.b.xh(((BluetoothDevice)localObject3).getAddress());
          w.i("MicroMsg.exdevice.BluetoothLEManager", "get connected device: mac = %s, long of mac =%d, name = %s", new Object[] { ((BluetoothDevice)localObject3).getAddress(), Long.valueOf(l), ((BluetoothDevice)localObject3).getName() });
          if (paramLong == l)
          {
            w.i("MicroMsg.exdevice.BluetoothLEManager", "This device is connected to phone now, start connecting without scan...");
            bool = locald.connect();
            GMTrace.o(4816805822464L, 35888);
            return bool;
          }
        }
        w.i("MicroMsg.exdevice.BluetoothLEManager", "Android version realse code: %s", new Object[] { Build.VERSION.RELEASE });
        if ((f.et(23)) && (!((LocationManager)this.sN.getSystemService("location")).isProviderEnabled("gps")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
        {
          bool = locald.connect();
          GMTrace.o(4816805822464L, 35888);
          return bool;
        }
        localObject1 = ((BluetoothManager)localObject1).getAdapter().getBondedDevices();
        if (localObject1 == null)
        {
          w.i("MicroMsg.exdevice.BluetoothLEManager", "null == pairedDevices,get paired devices failed");
        }
        else
        {
          localObject1 = ((Set)localObject1).iterator();
          for (;;)
          {
            if (!((Iterator)localObject1).hasNext()) {
              break label650;
            }
            localObject2 = (BluetoothDevice)((Iterator)localObject1).next();
            l = com.tencent.mm.plugin.exdevice.j.b.xh(((BluetoothDevice)localObject2).getAddress());
            w.i("MicroMsg.exdevice.BluetoothLEManager", "get paired device: mac = %s, long of mac =%d, name = %s", new Object[] { ((BluetoothDevice)localObject2).getAddress(), Long.valueOf(l), ((BluetoothDevice)localObject2).getName() });
            if (paramLong == l)
            {
              w.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device is paired to phone now, check if it is connected...");
              localObject3 = (InputManager)this.sN.getSystemService("input");
              int[] arrayOfInt = ((InputManager)localObject3).getInputDeviceIds();
              if (arrayOfInt == null)
              {
                w.i("MicroMsg.exdevice.BluetoothLEManager", "get input devices failed");
                break;
              }
              int i = 0;
              while (i < arrayOfInt.length)
              {
                Object localObject4 = ((InputManager)localObject3).getInputDevice(arrayOfInt[i]);
                if (localObject4 != null)
                {
                  localObject4 = ((InputDevice)localObject4).getName();
                  w.d("MicroMsg.exdevice.BluetoothLEManager", "Input devices: %s", new Object[] { localObject4 });
                  if ((localObject4 != null) && (((String)localObject4).equals(((BluetoothDevice)localObject2).getName())))
                  {
                    w.i("MicroMsg.exdevice.BluetoothLEManager", "This HID deivce has connected to phone as a input device");
                    bool = locald.connect();
                    GMTrace.o(4816805822464L, 35888);
                    return bool;
                  }
                }
                i += 1;
              }
              w.i("MicroMsg.exdevice.BluetoothLEManager", "This HID device hasn't been connected...");
            }
          }
        }
      }
    }
  }
  
  public final boolean dm(boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    GMTrace.i(4816671604736L, 35887);
    if ((f.et(21)) && (this.jld != null))
    {
      Object localObject = this.jld;
      g.a locala = this.jlg;
      w.i("MicroMsg.exdevice.NewBluetoothLEScanner", "(API21)execute scan");
      localObject = (Boolean)new g.1((g)localObject, paramBoolean, locala).b(((g)localObject).mHandler);
      paramBoolean = bool1;
      if (localObject != null) {
        paramBoolean = true;
      }
      Assert.assertTrue(paramBoolean);
      paramBoolean = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      GMTrace.o(4816671604736L, 35887);
      return paramBoolean;
      if (this.jlc != null)
      {
        paramBoolean = this.jlc.a(paramBoolean, this.jlf);
      }
      else
      {
        w.e("MicroMsg.exdevice.BluetoothLEManager", "Scanner is null");
        paramBoolean = bool2;
      }
    }
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(4824456232960L, 35945);
      GMTrace.o(4824456232960L, 35945);
    }
    
    public void a(long paramLong1, long paramLong2, long paramLong3)
    {
      GMTrace.i(4824590450688L, 35946);
      GMTrace.o(4824590450688L, 35946);
    }
    
    public void a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
    {
      GMTrace.i(4825127321600L, 35950);
      GMTrace.o(4825127321600L, 35950);
    }
    
    public void ahb()
    {
      GMTrace.i(4825261539328L, 35951);
      GMTrace.o(4825261539328L, 35951);
    }
    
    public void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4824858886144L, 35948);
      GMTrace.o(4824858886144L, 35948);
    }
    
    public void d(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4824724668416L, 35947);
      GMTrace.o(4824724668416L, 35947);
    }
    
    public void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4824993103872L, 35949);
      GMTrace.o(4824993103872L, 35949);
    }
  }
  
  private final class b
    implements Runnable
  {
    private long jll;
    private long jlm;
    
    public b(long paramLong1, long paramLong2)
    {
      GMTrace.i(4840159707136L, 36062);
      this.jll = 0L;
      this.jlm = 0L;
      this.jll = paramLong1;
      this.jlm = paramLong2;
      GMTrace.o(4840159707136L, 36062);
    }
    
    public final void run()
    {
      GMTrace.i(4840293924864L, 36063);
      b localb = b.this;
      long l = this.jll;
      d locald1 = new d(l, localb.sN, localb);
      String str = String.valueOf(locald1.mSessionId);
      w.i("MicroMsg.exdevice.BluetoothLEManager", "BluetoothLESession hashCode = %d, macAddr = %d, mapKey = %s", new Object[] { Integer.valueOf(locald1.hashCode()), Long.valueOf(l), str });
      d locald2 = (d)localb.jla.remove(str);
      if (locald2 != null) {
        locald2.close();
      }
      localb.jla.put(str, locald1);
      l = locald1.mSessionId;
      if (b.this.jkZ != null) {
        b.this.jkZ.a(l, this.jll, this.jlm);
      }
      GMTrace.o(4840293924864L, 36063);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */