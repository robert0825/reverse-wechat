package com.tencent.mm.plugin.g.a.e;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  @Deprecated
  public static String aU(long paramLong)
  {
    GMTrace.i(4809558065152L, 35834);
    String str = b.bS(paramLong);
    GMTrace.o(4809558065152L, 35834);
    return str;
  }
  
  public static boolean ahn()
  {
    GMTrace.i(4809289629696L, 35832);
    if (BluetoothAdapter.getDefaultAdapter() != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.exdevice.BluetoothSDKUtil", "isSupportBC: %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(4809289629696L, 35832);
      return bool;
    }
  }
  
  public static boolean ahp()
  {
    GMTrace.i(4809423847424L, 35833);
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter == null)
    {
      GMTrace.o(4809423847424L, 35833);
      return false;
    }
    boolean bool = localBluetoothAdapter.isEnabled();
    w.i("MicroMsg.exdevice.BluetoothSDKUtil", "isBluetoothOpen: %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(4809423847424L, 35833);
    return bool;
  }
  
  public static boolean cc(Context paramContext)
  {
    GMTrace.i(4809155411968L, 35831);
    boolean bool = paramContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    w.i("MicroMsg.exdevice.BluetoothSDKUtil", "isBLESupported, ret = %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(4809155411968L, 35831);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */