package com.tencent.mm.plugin.exdevice.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.dk;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.d;
import com.tencent.mm.plugin.exdevice.model.d.4;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends q.a
{
  private static e kCZ;
  
  static
  {
    GMTrace.i(11161009389568L, 83156);
    kCZ = new e();
    GMTrace.o(11161009389568L, 83156);
  }
  
  private e()
  {
    GMTrace.i(11160472518656L, 83152);
    GMTrace.o(11160472518656L, 83152);
  }
  
  public static e auj()
  {
    GMTrace.i(11160606736384L, 83153);
    e locale = kCZ;
    GMTrace.o(11160606736384L, 83153);
    return locale;
  }
  
  public final boolean Z(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(11160740954112L, 83154);
    w.i("MicroMsg.exdevice.ExdeviceIBeaconManager", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    if (paramString == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "uuid is null");
      GMTrace.o(11160740954112L, 83154);
      return false;
    }
    if (u.aut().kxo == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "MMExDeviceCore.getTaskQueue().getDispatcher() is null !!!now retry invoke doTaskAfterServiceStarted!");
      d locald = ad.atY();
      paramString = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11175504904192L, 83264);
          if (u.aut().kxo != null) {
            u.aut().kxo.a(paramString, paramBoolean, e.this);
          }
          GMTrace.o(11175504904192L, 83264);
        }
      };
      w.d("MicroMsg.exdevice.ExdeviceConnectManager", "doTaskAfterServiceStarted");
      if (locald.kxu == null)
      {
        locald.kxu = new c();
        locald.kxu.kCW = new d.4(locald, paramString);
        locald.kxu.ck(ab.getContext());
      }
      for (;;)
      {
        GMTrace.o(11160740954112L, 83154);
        return false;
        locald.kxu.q(paramString);
      }
    }
    paramBoolean = u.aut().kxo.a(paramString, paramBoolean, this);
    GMTrace.o(11160740954112L, 83154);
    return paramBoolean;
  }
  
  public final void a(double paramDouble1, int paramInt1, int paramInt2, byte[] paramArrayOfByte, double paramDouble2, int paramInt3, String paramString)
  {
    GMTrace.i(11160875171840L, 83155);
    w.d("MicroMsg.exdevice.ExdeviceIBeaconManager", "onRangdingCallback, distance = %f, major = %d, minor = %d, uuid = %s, rssi = %f,aMac = %s,txPower = %d", new Object[] { Double.valueOf(paramDouble1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), b.al(paramArrayOfByte), Double.valueOf(paramDouble2), paramString, Integer.valueOf(paramInt3) });
    dk localdk = new dk();
    String str = b.al(paramArrayOfByte);
    paramArrayOfByte = str;
    if (str.length() >= 32) {
      paramArrayOfByte = str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20);
    }
    localdk.eFd.eFb = paramArrayOfByte;
    localdk.eFd.eFg = paramDouble1;
    localdk.eFd.eFe = paramInt1;
    localdk.eFd.eFf = paramInt2;
    localdk.eFd.eFh = paramDouble2;
    localdk.eFd.eFi = paramString;
    localdk.eFd.eFj = paramInt3;
    a.vgX.m(localdk);
    GMTrace.o(11160875171840L, 83155);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */