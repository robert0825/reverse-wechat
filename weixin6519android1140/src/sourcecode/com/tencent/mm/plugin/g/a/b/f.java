package com.tencent.mm.plugin.g.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.g.a.b.a.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import junit.framework.Assert;

@TargetApi(18)
public final class f
{
  static int jmb;
  private int gGO;
  private BluetoothAdapter jkt;
  Runnable jlB;
  private final LinkedList<byte[]> jlD;
  private volatile boolean jlE;
  public volatile int jlF;
  final BluetoothGattCallback jlG;
  public a jlU;
  private Runnable jlV;
  private f jlW;
  HashMap<String, HashMap<String, BluetoothGattCharacteristic>> jlX;
  public long jlY;
  ArrayList<BluetoothGattCharacteristic> jlZ;
  public BluetoothDevice jls;
  Context jlt;
  BluetoothGatt jlu;
  private a jly;
  private Runnable jlz;
  public boolean jma;
  public ae mHandler;
  public long mSessionId;
  private HandlerThread mThread;
  
  static
  {
    GMTrace.i(4836804263936L, 36037);
    jmb = 0;
    GMTrace.o(4836804263936L, 36037);
  }
  
  @TargetApi(18)
  public f(long paramLong, Context paramContext, a parama)
  {
    GMTrace.i(4833448820736L, 36012);
    this.jlD = new LinkedList();
    this.jlE = false;
    this.jlX = new HashMap();
    this.jlY = 0L;
    this.jlZ = new ArrayList();
    this.jlG = new BluetoothGattCallback()
    {
      public final void onCharacteristicChanged(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic)
      {
        GMTrace.i(4838414876672L, 36049);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataReceive------");
        if (!f.this.mHandler.sendMessage(f.this.mHandler.obtainMessage(8, paramAnonymousBluetoothGattCharacteristic))) {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(8) });
        }
        GMTrace.o(4838414876672L, 36049);
      }
      
      public final void onCharacteristicRead(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic, int paramAnonymousInt)
      {
        GMTrace.i(4838549094400L, 36050);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onCharacteristicRead------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt == 0) && (!f.this.mHandler.sendMessage(f.this.mHandler.obtainMessage(8, paramAnonymousBluetoothGattCharacteristic)))) {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(8) });
        }
        GMTrace.o(4838549094400L, 36050);
      }
      
      public final void onCharacteristicWrite(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic, int paramAnonymousInt)
      {
        GMTrace.i(4838683312128L, 36051);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataWriteCallback------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!f.this.mHandler.sendMessage(f.this.mHandler.obtainMessage(7, paramAnonymousInt, 0))) {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(7) });
        }
        GMTrace.o(4838683312128L, 36051);
      }
      
      public final void onConnectionStateChange(BluetoothGatt paramAnonymousBluetoothGatt, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4838012223488L, 36046);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", new Object[] { Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(f.this.jlF) });
        if (!f.this.mHandler.sendMessage(f.this.mHandler.obtainMessage(4, paramAnonymousInt2, 0))) {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(4) });
        }
        GMTrace.o(4838012223488L, 36046);
      }
      
      public final void onDescriptorWrite(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattDescriptor paramAnonymousBluetoothGattDescriptor, int paramAnonymousInt)
      {
        GMTrace.i(4838280658944L, 36048);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDescriptorWrite------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!f.this.mHandler.sendMessage(f.this.mHandler.obtainMessage(6, paramAnonymousInt, 0, paramAnonymousBluetoothGatt))) {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(6) });
        }
        GMTrace.o(4838280658944L, 36048);
      }
      
      public final void onServicesDiscovered(BluetoothGatt paramAnonymousBluetoothGatt, int paramAnonymousInt)
      {
        GMTrace.i(4838146441216L, 36047);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onServicesDiscovered------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!f.this.mHandler.sendMessage(f.this.mHandler.obtainMessage(5, paramAnonymousInt, 0, paramAnonymousBluetoothGatt))) {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(5) });
        }
        GMTrace.o(4838146441216L, 36047);
      }
    };
    this.gGO = -1;
    this.gGO = hashCode();
    this.jlW = this;
    this.jlU = parama;
    this.jlt = paramContext;
    this.jkt = ((BluetoothManager)this.jlt.getSystemService("bluetooth")).getAdapter();
    this.mSessionId = paramLong;
    this.jlF = 3;
    this.jls = this.jkt.getRemoteDevice(com.tencent.mm.plugin.g.a.e.a.aU(paramLong));
    this.jly = new a();
    this.jma = false;
    this.mThread = e.SV("BluetoothLESimpleSession_handlerThread");
    this.mThread.start();
    this.mHandler = new b(this.mThread.getLooper(), this);
    this.jlz = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4826066845696L, 35957);
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Write data timeout, mac=%s, name=%s", new Object[] { b.bS(f.this.mSessionId), f.this.jls.getName() });
        if (f.this.jlU != null) {
          f.this.jlU.e(f.this.mSessionId, false);
        }
        f.this.ahe();
        GMTrace.o(4826066845696L, 35957);
      }
    };
    this.jlB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4837743788032L, 36044);
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected timeout!!!, mac=%s, name=%s", new Object[] { b.bS(f.this.mSessionId), f.this.jls.getName() });
        if (3 == f.this.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already disconnet or close, just leave");
          GMTrace.o(4837743788032L, 36044);
          return;
        }
        if (f.this.jlF == 1)
        {
          w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already connected, just leave.");
          GMTrace.o(4837743788032L, 36044);
          return;
        }
        f.this.ahf();
        GMTrace.o(4837743788032L, 36044);
      }
    };
    this.jlV = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4831569772544L, 35998);
        if (f.this.jma)
        {
          if (f.this.jlU != null) {
            f.this.jlU.a(f.this.mSessionId, false, f.this.jlY);
          }
          w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "close timeout!!! stop handle thread.");
          f.this.ahg();
        }
        GMTrace.o(4831569772544L, 35998);
      }
    };
    GMTrace.o(4833448820736L, 36012);
  }
  
  public final void Z(byte[] paramArrayOfByte)
  {
    boolean bool2 = true;
    GMTrace.i(16025059852288L, 119396);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------writeDataAsync------parserobj length = %d, mac=%s, name=%s", new Object[] { Integer.valueOf(paramArrayOfByte.length), b.bS(this.mSessionId), this.jls.getName() });
    if (1 != this.jlF)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Not ready for write data, connectstate = %d", new Object[] { Integer.valueOf(this.jlF) });
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, false);
      }
      GMTrace.o(16025059852288L, 119396);
      return;
    }
    Object localObject = com.tencent.mm.plugin.g.a.b.a.a.aa(paramArrayOfByte);
    if (localObject == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "write data error, no match ProfileParser, connect state = %d", new Object[] { Integer.valueOf(this.jlF) });
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, false);
      }
      GMTrace.o(16025059852288L, 119396);
      return;
    }
    w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "rawData data dump = %s", new Object[] { b.al(((com.tencent.mm.plugin.g.a.b.a.a)localObject).ahm()) });
    String str = ((com.tencent.mm.plugin.g.a.b.a.a)localObject).jmF;
    int i = ((com.tencent.mm.plugin.g.a.b.a.a)localObject).jmG;
    localObject = c.aS(((com.tencent.mm.plugin.g.a.b.a.a)localObject).jlY);
    HashMap localHashMap = (HashMap)this.jlX.get(localObject);
    if (localHashMap == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found", new Object[] { localObject });
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, false);
      }
      GMTrace.o(16025059852288L, 119396);
      return;
    }
    localObject = (BluetoothGattCharacteristic)localHashMap.get(str);
    if (localObject == null)
    {
      if (str == null) {}
      for (paramArrayOfByte = "null";; paramArrayOfByte = str)
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found", new Object[] { paramArrayOfByte });
        if (this.jlU != null) {
          this.jlU.e(this.mSessionId, false);
        }
        GMTrace.o(16025059852288L, 119396);
        return;
      }
    }
    if ((((BluetoothGattCharacteristic)localObject).getProperties() | i) == 0)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "property not support. current = %d, provided = %d", new Object[] { Integer.valueOf(((BluetoothGattCharacteristic)localObject).getProperties()), Integer.valueOf(i) });
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, false);
      }
      GMTrace.o(16025059852288L, 119396);
      return;
    }
    if (i == 2)
    {
      if (localObject == null)
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic not found");
        i = 0;
        if (i == 0) {
          break label526;
        }
      }
      label526:
      for (paramArrayOfByte = "true";; paramArrayOfByte = "false")
      {
        w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "readCharacteristic state: %s", new Object[] { paramArrayOfByte });
        if (this.jlU == null) {
          break label545;
        }
        if (i == 0) {
          break label533;
        }
        this.jlU.e(this.mSessionId, true);
        GMTrace.o(16025059852288L, 119396);
        return;
        if (!this.jlu.readCharacteristic((BluetoothGattCharacteristic)localObject))
        {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.readCharacteristic Failed!!!");
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      label533:
      this.jlU.e(this.mSessionId, false);
      label545:
      GMTrace.o(16025059852288L, 119396);
      return;
    }
    if (this.jlu != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      this.jlD.add(paramArrayOfByte);
      if (!this.jlE) {
        if (1 != this.jlD.size()) {
          break label619;
        }
      }
    }
    label619:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      ahe();
      GMTrace.o(16025059852288L, 119396);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void a(BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    GMTrace.i(16024254545920L, 119390);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataReceiveImp------, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    if (paramBluetoothGattCharacteristic == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic is null");
      GMTrace.o(16024254545920L, 119390);
      return;
    }
    byte[] arrayOfByte = paramBluetoothGattCharacteristic.getValue();
    String str = b.w(arrayOfByte, arrayOfByte.length);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "data length = %d", new Object[] { Integer.valueOf(arrayOfByte.length) });
    w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "data dump = %s", new Object[] { str });
    paramBluetoothGattCharacteristic = c.a(paramBluetoothGattCharacteristic, arrayOfByte);
    if (paramBluetoothGattCharacteristic == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "parse data error");
      GMTrace.o(16024254545920L, 119390);
      return;
    }
    if (this.jlU != null) {
      this.jlU.b(this.mSessionId, paramBluetoothGattCharacteristic);
    }
    GMTrace.o(16024254545920L, 119390);
  }
  
  final void ahd()
  {
    GMTrace.i(4833851473920L, 36015);
    this.jlE = false;
    this.jlD.clear();
    GMTrace.o(4833851473920L, 36015);
  }
  
  public final void ahe()
  {
    GMTrace.i(4834119909376L, 36017);
    if (this.jlD.isEmpty())
    {
      this.jlE = false;
      GMTrace.o(4834119909376L, 36017);
      return;
    }
    Object localObject = com.tencent.mm.plugin.g.a.b.a.a.aa((byte[])this.jlD.pop());
    byte[] arrayOfByte = ((com.tencent.mm.plugin.g.a.b.a.a)localObject).ahm();
    String str = ((com.tencent.mm.plugin.g.a.b.a.a)localObject).jmF;
    int i = ((com.tencent.mm.plugin.g.a.b.a.a)localObject).jmG;
    localObject = c.aS(((com.tencent.mm.plugin.g.a.b.a.a)localObject).jlY);
    HashMap localHashMap = (HashMap)this.jlX.get(localObject);
    if (localHashMap == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found, mac=%s, name=%s", new Object[] { localObject, b.bS(this.mSessionId), this.jls.getName() });
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, false);
      }
      GMTrace.o(4834119909376L, 36017);
      return;
    }
    localObject = (BluetoothGattCharacteristic)localHashMap.get(str);
    if (localObject == null)
    {
      if (str == null) {
        str = "null";
      }
      for (;;)
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found, mac=%s, name=%s", new Object[] { str, b.bS(this.mSessionId), this.jls.getName() });
        if (this.jlU != null) {
          this.jlU.e(this.mSessionId, false);
        }
        GMTrace.o(4834119909376L, 36017);
        return;
      }
    }
    if (i == 8)
    {
      this.jly.jkY = ((BluetoothGattCharacteristic)localObject);
      this.jly.setData(arrayOfByte);
      arrayOfByte = this.jly.agY();
      w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "write data to character, dump = %s, characteristicUuid=%s, mac=%s, name=%s", new Object[] { b.al(arrayOfByte), str, b.bS(this.mSessionId), this.jls.getName() });
      ((BluetoothGattCharacteristic)localObject).setValue(arrayOfByte);
      this.mHandler.postDelayed(this.jlz, 5000L);
      if (!this.jlu.writeCharacteristic((BluetoothGattCharacteristic)localObject))
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.writeCharacteristic Failed!!!, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
        if (this.jlU != null) {
          this.jlU.e(this.mSessionId, false);
        }
        GMTrace.o(4834119909376L, 36017);
        return;
      }
      this.jlE = true;
      GMTrace.o(4834119909376L, 36017);
      return;
    }
    w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "write property is needed. but current property is %d, mac=%s, name=%s", new Object[] { Integer.valueOf(i), b.bS(this.mSessionId), this.jls.getName() });
    if (this.jlU != null) {
      this.jlU.e(this.mSessionId, false);
    }
    GMTrace.o(4834119909376L, 36017);
  }
  
  final void ahf()
  {
    GMTrace.i(4833314603008L, 36011);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "markSessionDisconnected, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    this.jlF = 2;
    this.mHandler.removeCallbacks(this.jlB);
    this.mHandler.removeCallbacks(this.jlV);
    ahj();
    ahg();
    GMTrace.o(4833314603008L, 36011);
  }
  
  public final void ahg()
  {
    GMTrace.i(4833583038464L, 36013);
    if (this.jlu == null)
    {
      w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------ nothing to release, objid=%d, mac=%s, name=%s", new Object[] { Integer.valueOf(hashCode()), b.bS(this.mSessionId), this.jls.getName() });
      GMTrace.o(4833583038464L, 36013);
      return;
    }
    jmb -= 1;
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------, objid=%d, resourceCount=%d, mac=%s, name=%s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(jmb), b.bS(this.mSessionId), this.jls.getName() });
    this.jma = false;
    this.jlu.close();
    this.mThread.quitSafely();
    this.jlu = null;
    this.mThread = null;
    GMTrace.o(4833583038464L, 36013);
  }
  
  public final void ahh()
  {
    GMTrace.i(16024657199104L, 119393);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------disconnectImp------, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    if (3 == this.jlF)
    {
      w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "diconnect or close is called aready, just leave");
      GMTrace.o(16024657199104L, 119393);
      return;
    }
    if (2 == this.jlF)
    {
      w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "already disconnected, just leave");
      GMTrace.o(16024657199104L, 119393);
      return;
    }
    ahd();
    if (this.jlu == null)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "disconnect:BluetoothGatt not found");
      GMTrace.o(16024657199104L, 119393);
      return;
    }
    this.jlF = 3;
    this.mHandler.removeCallbacks(this.jlB);
    if (this.jlu != null) {
      this.jlu.disconnect();
    }
    GMTrace.o(16024657199104L, 119393);
  }
  
  public final void ahi()
  {
    GMTrace.i(16024925634560L, 119395);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------closeImp------, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    if (3 == this.jlF)
    {
      w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Close aready, Just leave");
      ahj();
      GMTrace.o(16024925634560L, 119395);
      return;
    }
    ahd();
    if (this.jlu == null)
    {
      w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "close:BluetoothGatt not found");
      ahj();
      GMTrace.o(16024925634560L, 119395);
      return;
    }
    this.jlF = 3;
    this.mHandler.removeCallbacks(this.jlB);
    ahj();
    if (this.jlu != null)
    {
      w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "disconnect gatt, and wait gatt disconnected callback, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
      this.jlu.disconnect();
      this.jma = true;
      this.mHandler.postDelayed(this.jlV, 10000L);
    }
    GMTrace.o(16024925634560L, 119395);
  }
  
  final void ahj()
  {
    GMTrace.i(4833985691648L, 36016);
    if (this.jlU == null)
    {
      w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------ don't need to notify, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
      GMTrace.o(4833985691648L, 36016);
      return;
    }
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    if (this.jlU != null) {
      this.jlU.a(this.mSessionId, false, this.jlY);
    }
    this.jlU = null;
    GMTrace.o(4833985691648L, 36016);
  }
  
  public final void ahk()
  {
    GMTrace.i(16025194070016L, 119397);
    while (this.jlZ.size() > 0)
    {
      BluetoothGattCharacteristic localBluetoothGattCharacteristic = (BluetoothGattCharacteristic)this.jlZ.remove(0);
      f localf = this.jlW;
      int i = localBluetoothGattCharacteristic.getProperties();
      if ((i & 0x30) == 0)
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "no indicate and notify");
        i = 0;
      }
      while (i != 0)
      {
        GMTrace.o(16025194070016L, 119397);
        return;
        if (!localf.jlu.setCharacteristicNotification(localBluetoothGattCharacteristic, true))
        {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Unable to set indicator for read characteristic");
          i = 0;
        }
        else
        {
          BluetoothGattDescriptor localBluetoothGattDescriptor = localBluetoothGattCharacteristic.getDescriptor(UUID.fromString(h.jmj));
          if (localBluetoothGattDescriptor == null)
          {
            w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Can not get configure descriptor");
            i = 0;
          }
          else
          {
            w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "Configure descriptor permissions: " + localBluetoothGattDescriptor.getPermissions());
            byte[] arrayOfByte = new byte[2];
            byte[] tmp160_158 = arrayOfByte;
            tmp160_158[0] = 0;
            byte[] tmp166_160 = tmp160_158;
            tmp166_160[1] = 0;
            tmp166_160;
            if ((i & 0x20) != 0)
            {
              arrayOfByte[0] = ((byte)(arrayOfByte[0] | BluetoothGattDescriptor.ENABLE_INDICATION_VALUE[0]));
              arrayOfByte[1] = ((byte)(arrayOfByte[1] | BluetoothGattDescriptor.ENABLE_INDICATION_VALUE[1]));
            }
            if ((i & 0x10) != 0)
            {
              arrayOfByte[0] = ((byte)(arrayOfByte[0] | BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE[0]));
              arrayOfByte[1] = ((byte)(arrayOfByte[1] | BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE[1]));
            }
            if (!localBluetoothGattDescriptor.setValue(arrayOfByte))
            {
              w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Can not set configure descriptor value");
              i = 0;
            }
            else if (!localf.jlu.writeDescriptor(localBluetoothGattDescriptor))
            {
              w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Can not write configure descriptor value");
              i = 0;
            }
            else
            {
              i = 1;
            }
          }
        }
      }
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mSelfSession.setCharacteristicNotification Failed!!!. uuid = %s, properties = %d", new Object[] { localBluetoothGattCharacteristic.getUuid().toString(), Integer.valueOf(localBluetoothGattCharacteristic.getProperties()) });
    }
    w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "onConnected = true");
    this.jlF = 1;
    this.mHandler.removeCallbacks(this.jlB);
    if (this.jlU != null) {
      this.jlU.a(this.mSessionId, true, this.jlY);
    }
    GMTrace.o(16025194070016L, 119397);
  }
  
  public final boolean connect()
  {
    GMTrace.i(4833717256192L, 36014);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------connect------, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    boolean bool = this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
    GMTrace.o(4833717256192L, 36014);
    return bool;
  }
  
  public final void disconnect()
  {
    GMTrace.i(16024791416832L, 119394);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------disconnect------, mac=%s, name=%s", new Object[] { b.bS(this.mSessionId), this.jls.getName() });
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1))) {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(1) });
    }
    GMTrace.o(16024791416832L, 119394);
  }
  
  public final void kZ(int paramInt)
  {
    GMTrace.i(16024388763648L, 119391);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDescriptorWriteImp------ status = %d, mac=%s, name=%s", new Object[] { Integer.valueOf(paramInt), b.bS(this.mSessionId), this.jls.getName() });
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(9))) {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(9) });
    }
    GMTrace.o(16024388763648L, 119391);
  }
  
  public final void la(int paramInt)
  {
    GMTrace.i(16024522981376L, 119392);
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataWriteCallbackImp------ status = %d, mac=%s, name=%s", new Object[] { Integer.valueOf(paramInt), b.bS(this.mSessionId), this.jls.getName() });
    this.mHandler.removeCallbacks(this.jlz);
    if (paramInt != 0)
    {
      w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "write data error: " + paramInt);
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, false);
      }
      ahe();
      GMTrace.o(16024522981376L, 119392);
      return;
    }
    byte[] arrayOfByte = this.jly.agY();
    w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "Out data dump = %s", new Object[] { b.al(arrayOfByte) });
    if (arrayOfByte == null)
    {
      w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "write data complete");
      if (this.jlU != null) {
        this.jlU.e(this.mSessionId, true);
      }
      ahe();
      GMTrace.o(16024522981376L, 119392);
      return;
    }
    w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "write next chunk...");
    this.jly.jkY.setValue(arrayOfByte);
    this.jlu.writeCharacteristic(this.jly.jkY);
    this.mHandler.postDelayed(this.jlz, 5000L);
    GMTrace.o(16024522981376L, 119392);
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(4839085965312L, 36054);
      GMTrace.o(4839085965312L, 36054);
    }
    
    public void a(long paramLong1, boolean paramBoolean, long paramLong2)
    {
      GMTrace.i(4839220183040L, 36055);
      GMTrace.o(4839220183040L, 36055);
    }
    
    public void b(long paramLong, byte[] paramArrayOfByte)
    {
      GMTrace.i(4839354400768L, 36056);
      GMTrace.o(4839354400768L, 36056);
    }
    
    public void e(long paramLong, boolean paramBoolean)
    {
      GMTrace.i(4839488618496L, 36057);
      GMTrace.o(4839488618496L, 36057);
    }
  }
  
  private static final class b
    extends ae
  {
    private final WeakReference<f> jlI;
    
    public b(Looper paramLooper, f paramf)
    {
      super();
      GMTrace.i(4839891271680L, 36060);
      this.jlI = new WeakReference(paramf);
      GMTrace.o(4839891271680L, 36060);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(4840025489408L, 36061);
      f localf = (f)this.jlI.get();
      if (localf == null)
      {
        w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "null == BluetoothLESession");
        GMTrace.o(4840025489408L, 36061);
        return;
      }
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(4840025489408L, 36061);
        return;
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------connectImp------, mac=%s, name=%s", new Object[] { b.bS(localf.mSessionId), localf.jls.getName() });
        if (1 == localf.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Remote device is connected !!!");
          if (localf.jlU != null)
          {
            w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "Remote device has connected, just callback.");
            localf.jlU.a(localf.mSessionId, true, localf.jlY);
          }
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        if (localf.jlF == 0)
        {
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Remote device is connecting !!!");
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        localf.ahd();
        if (localf.jlu != null)
        {
          if (!localf.jlu.connect())
          {
            w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.connect() Failed!!!");
            localf.ahj();
            GMTrace.o(4840025489408L, 36061);
            return;
          }
          localf.jlF = 0;
          localf.mHandler.postDelayed(localf.jlB, 10000L);
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        localf.jlu = localf.jls.connectGatt(localf.jlt, false, localf.jlG);
        f.jmb += 1;
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------create resource------, objid=%d, resourceCount=%d, mac=%s, name=%s", new Object[] { Integer.valueOf(localf.hashCode()), Integer.valueOf(f.jmb), b.bS(localf.mSessionId), localf.jls.getName() });
        if (localf.jlu == null)
        {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mDevice.connectGatt Failed!!!");
          localf.ahj();
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        localf.jlF = 0;
        localf.mHandler.postDelayed(localf.jlB, 10000L);
        GMTrace.o(4840025489408L, 36061);
        return;
        int i = paramMessage.arg1;
        if (i == 2) {}
        for (paramMessage = "Connected";; paramMessage = "Disconnected")
        {
          w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onConnectionStateChangeImp------ aState = %s, mac=%s, name=%s", new Object[] { paramMessage, b.bS(localf.mSessionId), localf.jls.getName() });
          if (i != 2) {
            break label685;
          }
          w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "PHY Connected is OK, mConnectState = %d", new Object[] { Integer.valueOf(localf.jlF) });
          if (3 != localf.jlF) {
            break;
          }
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Close or disconnect is Called, Leave without discover Services");
          localf.mHandler.removeCallbacks(localf.jlB);
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        if (1 == localf.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected is done, Leave without discover Services");
          localf.mHandler.removeCallbacks(localf.jlB);
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        if (!localf.jlu.discoverServices())
        {
          w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "discover Services start failed!!!");
          localf.ahf();
          GMTrace.o(4840025489408L, 36061);
          return;
        }
        localf.mHandler.removeCallbacks(localf.jlB);
        localf.mHandler.postDelayed(localf.jlB, 10000L);
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "start discoverServices...");
        GMTrace.o(4840025489408L, 36061);
        return;
        label685:
        if (i == 0)
        {
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Disconnected from GATT server.");
          localf.jlX.clear();
          localf.jlZ.clear();
          localf.jlY = 0L;
          localf.ahf();
        }
        GMTrace.o(4840025489408L, 36061);
        return;
        Object localObject = (BluetoothGatt)paramMessage.obj;
        i = paramMessage.arg1;
        w.i("MicroMsg.exdevice.BluetoothLESimpleSession", "onServicesDiscoveredImp, status = %d, mac=%s, name=%s", new Object[] { Integer.valueOf(i), b.bS(localf.mSessionId), localf.jls.getName() });
        localf.mHandler.removeCallbacks(localf.jlB);
        if (3 == localf.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Close or disconnect is Called, Just Leave");
          i = 0;
          if (i == 0)
          {
            localf.disconnect();
            GMTrace.o(4840025489408L, 36061);
          }
        }
        else
        {
          if (1 == localf.jlF) {
            w.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected is done, Just Leave");
          }
          for (;;)
          {
            i = 1;
            break;
            if (i != 0)
            {
              w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Discover services error");
              localf.ahf();
              i = 0;
              break;
            }
            List localList1 = ((BluetoothGatt)localObject).getServices();
            int j = 0;
            if (j < localList1.size())
            {
              BluetoothGattService localBluetoothGattService = (BluetoothGattService)localList1.get(j);
              if (localBluetoothGattService == null)
              {
                w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "service is null");
                i = 0;
              }
              for (;;)
              {
                if (i == 0) {
                  w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "parseService error. service uuid = %s", new Object[] { localBluetoothGattService.getUuid().toString() });
                }
                j += 1;
                break;
                if (!c.b(localBluetoothGattService))
                {
                  w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "parse service error");
                  i = 0;
                }
                else
                {
                  localf.jlY |= c.a(localBluetoothGattService);
                  HashMap localHashMap = new HashMap();
                  List localList2 = localBluetoothGattService.getCharacteristics();
                  i = 0;
                  while (i < localList2.size())
                  {
                    BluetoothGattCharacteristic localBluetoothGattCharacteristic = (BluetoothGattCharacteristic)localList2.get(i);
                    localObject = localBluetoothGattCharacteristic.getUuid().toString();
                    w.d("MicroMsg.exdevice.BluetoothLESimpleSession", "found characteristic = %s, properties = %d, permission = %d", new Object[] { localObject, Integer.valueOf(localBluetoothGattCharacteristic.getProperties()), Integer.valueOf(localBluetoothGattCharacteristic.getPermissions()) });
                    paramMessage = (Message)localObject;
                    if (localObject == null) {
                      paramMessage = "null";
                    }
                    localHashMap.put(paramMessage, localBluetoothGattCharacteristic);
                    localf.jlZ.add(localBluetoothGattCharacteristic);
                    i += 1;
                  }
                  localf.jlX.put(localBluetoothGattService.getUuid().toString(), localHashMap);
                  i = 1;
                }
              }
            }
            if (0L == localf.jlY)
            {
              w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "the device hasn't pass test");
              localf.ahf();
              i = 0;
              break;
            }
            if (!localf.mHandler.sendMessage(localf.mHandler.obtainMessage(9))) {
              w.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(9) });
            }
          }
          localObject = paramMessage.obj;
          localf.kZ(paramMessage.arg1);
          GMTrace.o(4840025489408L, 36061);
          return;
          localf.ahh();
          GMTrace.o(4840025489408L, 36061);
          return;
          localf.Z((byte[])paramMessage.obj);
          GMTrace.o(4840025489408L, 36061);
          return;
          localf.la(paramMessage.arg1);
          GMTrace.o(4840025489408L, 36061);
          return;
          localf.a((BluetoothGattCharacteristic)paramMessage.obj);
          GMTrace.o(4840025489408L, 36061);
          return;
          localf.ahi();
          GMTrace.o(4840025489408L, 36061);
          return;
          localf.ahk();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */