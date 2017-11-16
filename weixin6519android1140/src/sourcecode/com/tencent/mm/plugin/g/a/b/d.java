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
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.UUID;
import junit.framework.Assert;

@TargetApi(18)
public final class d
{
  private int gGO;
  private BluetoothAdapter jkt;
  public Runnable jlA;
  public Runnable jlB;
  d jlC;
  final LinkedList<byte[]> jlD;
  volatile boolean jlE;
  public int jlF;
  final BluetoothGattCallback jlG;
  BluetoothDevice jls;
  Context jlt;
  BluetoothGatt jlu;
  public b jlv;
  BluetoothGattCharacteristic jlw;
  BluetoothGattCharacteristic jlx;
  a jly;
  Runnable jlz;
  public ae mHandler;
  public long mSessionId;
  private HandlerThread mThread;
  
  @TargetApi(18)
  public d(long paramLong, Context paramContext, b paramb)
  {
    GMTrace.i(4830227595264L, 35988);
    this.jlD = new LinkedList();
    this.jlE = false;
    this.jlG = new BluetoothGattCallback()
    {
      public final void onCharacteristicChanged(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic)
      {
        GMTrace.i(4829019635712L, 35979);
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceive------");
        if (!d.this.mHandler.sendMessage(d.this.mHandler.obtainMessage(8, paramAnonymousBluetoothGattCharacteristic.getValue()))) {
          w.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(8) });
        }
        GMTrace.o(4829019635712L, 35979);
      }
      
      public final void onCharacteristicRead(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic, int paramAnonymousInt)
      {
        GMTrace.i(4829153853440L, 35980);
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onCharacteristicRead------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(4829153853440L, 35980);
      }
      
      public final void onCharacteristicWrite(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic, int paramAnonymousInt)
      {
        GMTrace.i(4829288071168L, 35981);
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallback------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!d.this.mHandler.sendMessage(d.this.mHandler.obtainMessage(7, paramAnonymousInt, 0))) {
          w.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(7) });
        }
        GMTrace.o(4829288071168L, 35981);
      }
      
      public final void onConnectionStateChange(BluetoothGatt paramAnonymousBluetoothGatt, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4828616982528L, 35976);
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", new Object[] { Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(d.this.jlF) });
        if (!d.this.mHandler.sendMessage(d.this.mHandler.obtainMessage(4, paramAnonymousInt2, 0))) {
          w.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(4) });
        }
        GMTrace.o(4828616982528L, 35976);
      }
      
      public final void onDescriptorWrite(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattDescriptor paramAnonymousBluetoothGattDescriptor, int paramAnonymousInt)
      {
        GMTrace.i(4828885417984L, 35978);
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWrite------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!d.this.mHandler.sendMessage(d.this.mHandler.obtainMessage(6, paramAnonymousInt, 0, paramAnonymousBluetoothGatt))) {
          w.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(6) });
        }
        GMTrace.o(4828885417984L, 35978);
      }
      
      public final void onServicesDiscovered(BluetoothGatt paramAnonymousBluetoothGatt, int paramAnonymousInt)
      {
        GMTrace.i(4828751200256L, 35977);
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onServicesDiscovered------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!d.this.mHandler.sendMessage(d.this.mHandler.obtainMessage(5, paramAnonymousInt, 0, paramAnonymousBluetoothGatt))) {
          w.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(5) });
        }
        GMTrace.o(4828751200256L, 35977);
      }
    };
    this.gGO = -1;
    this.gGO = hashCode();
    this.jlC = this;
    this.jlv = paramb;
    this.jlt = paramContext;
    this.jkt = ((BluetoothManager)this.jlt.getSystemService("bluetooth")).getAdapter();
    this.mSessionId = paramLong;
    this.jlF = 3;
    this.jls = this.jkt.getRemoteDevice(com.tencent.mm.plugin.g.a.e.a.aU(paramLong));
    this.jlw = null;
    this.jlx = null;
    this.jly = new a();
    this.mThread = e.SV("BluetoothLESession_handlerThread");
    this.mThread.start();
    this.mHandler = new a(this.mThread.getLooper(), this);
    this.jlz = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4825798410240L, 35955);
        w.e("MicroMsg.exdevice.BluetoothLESession", "Write data timeout");
        if (d.this.jlv != null) {
          d.this.jlv.jkZ.e(d.this.mSessionId, false);
        }
        d.this.ahe();
        GMTrace.o(4825798410240L, 35955);
      }
    };
    this.jlA = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4831032901632L, 35994);
        w.e("MicroMsg.exdevice.BluetoothLESession", "Write descriptor timeout!!!");
        if (3 == d.this.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
          GMTrace.o(4831032901632L, 35994);
          return;
        }
        d.this.mHandler.removeCallbacks(d.this.jlB);
        d.this.jlF = 2;
        if (d.this.jlv != null) {
          d.this.jlv.jkZ.d(d.this.mSessionId, false);
        }
        GMTrace.o(4831032901632L, 35994);
      }
    };
    this.jlB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4838951747584L, 36053);
        w.e("MicroMsg.exdevice.BluetoothLESession", "Connected timeout!!!");
        if (3 == d.this.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
          GMTrace.o(4838951747584L, 36053);
          return;
        }
        d.this.mHandler.removeCallbacks(d.this.jlA);
        d.this.jlF = 2;
        if (d.this.jlv != null) {
          d.this.jlv.jkZ.d(d.this.mSessionId, false);
        }
        GMTrace.o(4838951747584L, 36053);
      }
    };
    GMTrace.o(4830227595264L, 35988);
  }
  
  final void ahd()
  {
    GMTrace.i(4830630248448L, 35991);
    this.jlE = false;
    this.jlD.clear();
    GMTrace.o(4830630248448L, 35991);
  }
  
  public final void ahe()
  {
    GMTrace.i(4830764466176L, 35992);
    if (this.jlD.isEmpty())
    {
      this.jlE = false;
      GMTrace.o(4830764466176L, 35992);
      return;
    }
    byte[] arrayOfByte = (byte[])this.jlD.pop();
    this.jly.setData(arrayOfByte);
    arrayOfByte = this.jly.agY();
    w.d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.al(arrayOfByte) });
    this.jlx.setValue(arrayOfByte);
    this.mHandler.postDelayed(this.jlz, 5000L);
    if (!this.jlu.writeCharacteristic(this.jlx)) {
      w.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.writeCharacteristic Failed!!!");
    }
    this.jlE = true;
    GMTrace.o(4830764466176L, 35992);
  }
  
  public final void close()
  {
    GMTrace.i(4830496030720L, 35990);
    w.i("MicroMsg.exdevice.BluetoothLESession", "------close------");
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2))) {
      w.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(2) });
    }
    this.mThread.quitSafely();
    GMTrace.o(4830496030720L, 35990);
  }
  
  public final boolean connect()
  {
    GMTrace.i(4830361812992L, 35989);
    w.i("MicroMsg.exdevice.BluetoothLESession", "------connect------");
    boolean bool = this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
    GMTrace.o(4830361812992L, 35989);
    return bool;
  }
  
  private static final class a
    extends ae
  {
    private final WeakReference<d> jlI;
    
    public a(Looper paramLooper, d paramd)
    {
      super();
      GMTrace.i(4829959159808L, 35986);
      this.jlI = new WeakReference(paramd);
      GMTrace.o(4829959159808L, 35986);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      boolean bool2 = true;
      int i = 1;
      GMTrace.i(4830093377536L, 35987);
      d locald = (d)this.jlI.get();
      if (locald == null)
      {
        w.e("MicroMsg.exdevice.BluetoothLESession", "null == BluetoothLESession");
        GMTrace.o(4830093377536L, 35987);
        return;
      }
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        GMTrace.o(4830093377536L, 35987);
        return;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------connectImp------");
        if (1 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Remote device is connected !!!");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (locald.jlF == 0)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Remote device is connecting !!!");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.ahd();
        if (locald.jlu != null)
        {
          if (!locald.jlu.connect())
          {
            w.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.connect() Failed!!!");
            if (locald.jlv != null) {
              locald.jlv.jkZ.d(locald.mSessionId, false);
            }
            GMTrace.o(4830093377536L, 35987);
            return;
          }
          locald.jlF = 0;
          locald.mHandler.postDelayed(locald.jlB, 10000L);
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlu = locald.jls.connectGatt(locald.jlt, false, locald.jlG);
        if (locald.jlu == null)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "mDevice.connectGatt Failed!!!");
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlF = 0;
        locald.mHandler.postDelayed(locald.jlB, 10000L);
        GMTrace.o(4830093377536L, 35987);
        return;
        i = paramMessage.arg1;
        if (i == 2) {}
        for (paramMessage = "Connected";; paramMessage = "Disconnected")
        {
          w.i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChangeImp------ aState = %s", new Object[] { paramMessage });
          if (i != 2) {
            break label591;
          }
          w.i("MicroMsg.exdevice.BluetoothLESession", "PHY Connected is OK, mConnectState = %d", new Object[] { Integer.valueOf(locald.jlF) });
          if (3 != locald.jlF) {
            break;
          }
          w.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Leave without discover Services");
          locald.mHandler.removeCallbacks(locald.jlB);
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (1 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Leave without discover Services");
          locald.mHandler.removeCallbacks(locald.jlB);
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (!locald.jlu.discoverServices())
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "discover Services start failed!!!");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        w.i("MicroMsg.exdevice.BluetoothLESession", "start discoverServices...");
        GMTrace.o(4830093377536L, 35987);
        return;
        label591:
        if (i == 0)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Disconnected from GATT server.");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
        }
        GMTrace.o(4830093377536L, 35987);
        return;
        Object localObject = (BluetoothGatt)paramMessage.obj;
        int j = paramMessage.arg1;
        w.i("MicroMsg.exdevice.BluetoothLESession", "onServicesDiscoveredImp, status = %d", new Object[] { Integer.valueOf(j) });
        if (3 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Just Leave");
          locald.mHandler.removeCallbacks(locald.jlB);
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (1 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Just Leave");
          locald.mHandler.removeCallbacks(locald.jlB);
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (j != 0)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Discover services error");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        paramMessage = ((BluetoothGatt)localObject).getService(UUID.fromString(h.jmk));
        if (paramMessage == null)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find service(with UUID 0xfee7)");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlw = paramMessage.getCharacteristic(UUID.fromString(h.jmm));
        if (locald.jlw == null)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find characteristic(with UUID 0xfec8)");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlx = paramMessage.getCharacteristic(UUID.fromString(h.jml));
        if (locald.jlx == null)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find characteristic(with UUID 0xfec7)");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        j = locald.jlw.getProperties();
        w.i("MicroMsg.exdevice.BluetoothLESession", "mRecvCharacteristic.getProperties = %d", new Object[] { Integer.valueOf(j) });
        if ((j & 0x20) == 0)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Read characteristic can not be indicated");
          locald.jlF = 2;
          locald.mHandler.removeCallbacks(locald.jlB);
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        w.i("MicroMsg.exdevice.BluetoothLESession", "Set read characteristic indicator");
        paramMessage = locald.jlC;
        localObject = locald.jlw;
        if (!paramMessage.jlu.setCharacteristicNotification((BluetoothGattCharacteristic)localObject, true))
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Unable to set indicator for read characteristic");
          i = 0;
        }
        for (;;)
        {
          if (i == 0)
          {
            w.e("MicroMsg.exdevice.BluetoothLESession", "mSelfSession.setCharacteristicNotification Failed!!!");
            locald.jlF = 2;
            locald.mHandler.removeCallbacks(locald.jlB);
            if (locald.jlv != null) {
              locald.jlv.jkZ.d(locald.mSessionId, false);
            }
          }
          GMTrace.o(4830093377536L, 35987);
          return;
          localObject = ((BluetoothGattCharacteristic)localObject).getDescriptor(UUID.fromString(h.jmj));
          if (localObject == null)
          {
            w.e("MicroMsg.exdevice.BluetoothLESession", "Can not get configure descriptor");
            i = 0;
          }
          else
          {
            w.i("MicroMsg.exdevice.BluetoothLESession", "Configure descriptor permissions: " + ((BluetoothGattDescriptor)localObject).getPermissions());
            if (!((BluetoothGattDescriptor)localObject).setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE))
            {
              w.e("MicroMsg.exdevice.BluetoothLESession", "Can not set configure descriptor value");
              i = 0;
            }
            else if (!paramMessage.jlu.writeDescriptor((BluetoothGattDescriptor)localObject))
            {
              w.e("MicroMsg.exdevice.BluetoothLESession", "Can not write configure descriptor value");
              i = 0;
            }
            else
            {
              paramMessage.mHandler.postDelayed(paramMessage.jlA, 5000L);
            }
          }
        }
        localObject = paramMessage.obj;
        i = paramMessage.arg1;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWriteImp------ status = %d", new Object[] { Integer.valueOf(i) });
        locald.mHandler.removeCallbacks(locald.jlA);
        locald.mHandler.removeCallbacks(locald.jlB);
        if (3 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Just Leave");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (1 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Just Leave");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if (i != 0)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Write configure descriptor error");
          locald.jlF = 2;
          if (locald.jlv != null) {
            locald.jlv.jkZ.d(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlF = 1;
        if (locald.jlv != null) {
          locald.jlv.jkZ.d(locald.mSessionId, true);
        }
        w.i("MicroMsg.exdevice.BluetoothLESession", "------BLE connect successfully------ mConnectState = %d", new Object[] { Integer.valueOf(locald.jlF) });
        GMTrace.o(4830093377536L, 35987);
        return;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------disconnectImp------");
        if (3 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "diconnect or close is called aready, just leave");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.ahd();
        if (locald.jlu == null)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "disconnect:BluetoothGatt not found");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlF = 3;
        locald.mHandler.removeCallbacks(locald.jlB);
        locald.mHandler.removeCallbacks(locald.jlA);
        locald.jlu.disconnect();
        GMTrace.o(4830093377536L, 35987);
        return;
        paramMessage = (byte[])paramMessage.obj;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------writeDataAsync------ length = %d", new Object[] { Integer.valueOf(paramMessage.length) });
        if (1 != locald.jlF)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Not ready for write data, connectstate = %d", new Object[] { Integer.valueOf(locald.jlF) });
          if (locald.jlv != null) {
            locald.jlv.jkZ.e(locald.mSessionId, false);
          }
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        if ((locald.jlu != null) && (locald.jlx != null))
        {
          bool1 = true;
          Assert.assertTrue(bool1);
          locald.jlD.add(paramMessage);
          if (!locald.jlE) {
            if (1 != locald.jlD.size()) {
              break label1909;
            }
          }
        }
        label1909:
        for (boolean bool1 = bool2;; bool1 = false)
        {
          Assert.assertTrue(bool1);
          locald.ahe();
          GMTrace.o(4830093377536L, 35987);
          return;
          bool1 = false;
          break;
        }
        i = paramMessage.arg1;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallbackImp------ status = %d", new Object[] { Integer.valueOf(i) });
        locald.mHandler.removeCallbacks(locald.jlz);
        if (i != 0)
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "write data error: " + i);
          if (locald.jlv != null) {
            locald.jlv.jkZ.e(locald.mSessionId, false);
          }
          locald.ahe();
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        paramMessage = locald.jly.agY();
        w.d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.al(paramMessage) });
        if (paramMessage == null)
        {
          w.i("MicroMsg.exdevice.BluetoothLESession", "write data complete");
          if (locald.jlv != null) {
            locald.jlv.jkZ.e(locald.mSessionId, true);
          }
          locald.ahe();
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        w.i("MicroMsg.exdevice.BluetoothLESession", "write next chunk...");
        locald.jlx.setValue(paramMessage);
        locald.jlu.writeCharacteristic(locald.jlx);
        locald.mHandler.postDelayed(locald.jlz, 5000L);
        GMTrace.o(4830093377536L, 35987);
        return;
        paramMessage = (byte[])paramMessage.obj;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceiveImp------");
        if (bg.bq(paramMessage))
        {
          w.e("MicroMsg.exdevice.BluetoothLESession", "Receive data is null or nil");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        localObject = com.tencent.mm.plugin.exdevice.j.b.w(paramMessage, paramMessage.length);
        w.i("MicroMsg.exdevice.BluetoothLESession", "data length = %d", new Object[] { Integer.valueOf(paramMessage.length) });
        w.d("MicroMsg.exdevice.BluetoothLESession", "data dump = %s", new Object[] { localObject });
        if (locald.jlv != null) {
          locald.jlv.jkZ.b(locald.mSessionId, paramMessage);
        }
        GMTrace.o(4830093377536L, 35987);
        return;
        w.i("MicroMsg.exdevice.BluetoothLESession", "------closeImp------");
        if (3 == locald.jlF)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "Close aready, Just leave");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.ahd();
        if (locald.jlu == null)
        {
          w.w("MicroMsg.exdevice.BluetoothLESession", "close:BluetoothGatt not found");
          GMTrace.o(4830093377536L, 35987);
          return;
        }
        locald.jlF = 3;
        locald.jlu.disconnect();
        locald.jlu.close();
        locald.jlu = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */