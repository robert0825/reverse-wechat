package c.t.m.g;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"NewApi"})
public final class cq
  extends ScanCallback
{
  private final Context a;
  private BluetoothManager b;
  private BluetoothAdapter c;
  private BluetoothLeScanner d;
  private ScanSettings e;
  private List<ScanFilter> f;
  private List<de> g;
  private long h;
  private String[] i;
  private boolean j;
  private a k;
  private HandlerThread l;
  private Looper m;
  
  public cq(Context paramContext)
  {
    this.a = paramContext;
    this.g = new LinkedList();
    this.i = "AB8190D5-D11E-4941-ACC4-42F30510B408,FDA50693-A4E2-4FB1-AFCF-C6EB07647825".split(",");
  }
  
  private static ScanFilter a(String paramString)
  {
    byte[] arrayOfByte1 = new byte[23];
    byte[] tmp6_5 = arrayOfByte1;
    tmp6_5[0] = 0;
    byte[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 0;
    byte[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 0;
    byte[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 0;
    byte[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 0;
    byte[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 0;
    byte[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 0;
    byte[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 0;
    byte[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 0;
    byte[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 0;
    byte[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 0;
    byte[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 0;
    byte[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 0;
    byte[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 0;
    byte[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 0;
    byte[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 0;
    byte[] tmp96_90 = tmp90_84;
    tmp96_90[16] = 0;
    byte[] tmp102_96 = tmp96_90;
    tmp102_96[17] = 0;
    byte[] tmp108_102 = tmp102_96;
    tmp108_102[18] = 0;
    byte[] tmp114_108 = tmp108_102;
    tmp114_108[19] = 0;
    byte[] tmp120_114 = tmp114_108;
    tmp120_114[20] = 0;
    byte[] tmp126_120 = tmp120_114;
    tmp126_120[21] = 0;
    byte[] tmp132_126 = tmp126_120;
    tmp132_126[22] = 0;
    tmp132_126;
    paramString = paramString.replace("-", "");
    int i1 = paramString.length();
    byte[] arrayOfByte2 = new byte[i1 / 2];
    int n = 0;
    while (n < i1)
    {
      arrayOfByte2[(n / 2)] = ((byte)((Character.digit(paramString.charAt(n), 16) << 4) + Character.digit(paramString.charAt(n + 1), 16)));
      n += 2;
    }
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 2, 16);
    return new ScanFilter.Builder().setManufacturerData(76, arrayOfByte1, new byte[] { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 }).build();
  }
  
  public final void a()
  {
    this.l = new HandlerThread("bluetooth_provider");
    this.l.start();
    this.m = this.l.getLooper();
    this.k = new a(this.m);
    this.b = ((BluetoothManager)this.a.getSystemService("bluetooth"));
    try
    {
      this.c = this.b.getAdapter();
      if (this.c != null) {
        this.d = this.c.getBluetoothLeScanner();
      }
      this.k.sendEmptyMessage(1000);
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        localThrowable.toString();
      }
    }
  }
  
  public final void b()
  {
    if ((this.j) && (this.k != null)) {
      this.k.sendEmptyMessage(2000);
    }
  }
  
  public final List<de> c()
  {
    synchronized (this.g)
    {
      if (System.currentTimeMillis() - this.h <= 5000L)
      {
        List localList2 = this.g;
        return localList2;
      }
      return null;
    }
  }
  
  public final void onBatchScanResults(List<ScanResult> paramList) {}
  
  public final void onScanFailed(int paramInt) {}
  
  public final void onScanResult(int paramInt, ScanResult paramScanResult)
  {
    Message localMessage = new Message();
    localMessage.what = 3000;
    localMessage.obj = paramScanResult;
    if (this.k.getLooper() != null) {
      this.k.sendMessage(localMessage);
    }
  }
  
  final class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        return;
      case 1000: 
        cq.a(cq.this);
        return;
      case 2000: 
        cq.b(cq.this);
        return;
      }
      cq.a(cq.this, (ScanResult)paramMessage.obj);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */