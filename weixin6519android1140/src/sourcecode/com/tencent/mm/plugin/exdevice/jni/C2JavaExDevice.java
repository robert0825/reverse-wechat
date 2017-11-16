package com.tencent.mm.plugin.exdevice.jni;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.model.j;
import com.tencent.mm.plugin.exdevice.service.a;
import com.tencent.mm.plugin.exdevice.service.b;
import com.tencent.mm.sdk.platformtools.w;

public final class C2JavaExDevice
{
  private static final String TAG = "MicroMsg.exdevice.C2JavaExDevice";
  
  public C2JavaExDevice()
  {
    GMTrace.i(10915525165056L, 81327);
    GMTrace.o(10915525165056L, 81327);
  }
  
  public static void C2Java_onStateChange(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(10915793600512L, 81329);
    a.b(paramLong, paramInt1, paramInt2, paramInt3);
    GMTrace.o(10915793600512L, 81329);
  }
  
  public static void C2Java_onTaskEnd(long paramLong, int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(10915659382784L, 81328);
    a.c(paramLong, paramInt1, paramInt2, paramString);
    GMTrace.o(10915659382784L, 81328);
  }
  
  public static boolean connect(long paramLong)
  {
    GMTrace.i(10916330471424L, 81333);
    boolean bool = b.connect(paramLong);
    GMTrace.o(10916330471424L, 81333);
    return bool;
  }
  
  public static void createSession(long paramLong1, long paramLong2)
  {
    GMTrace.i(10916062035968L, 81331);
    b.createSession(paramLong1, paramLong2);
    GMTrace.o(10916062035968L, 81331);
  }
  
  public static void destroySession(long paramLong)
  {
    GMTrace.i(10916464689152L, 81334);
    b.destroySession(paramLong);
    GMTrace.o(10916464689152L, 81334);
  }
  
  public static void onAirKissCallback(int paramInt1, int paramInt2)
  {
    GMTrace.i(10916598906880L, 81335);
    w.v("MicroMsg.exdevice.C2JavaExDevice", "onAirKissCallback(errType : %d, errCode : %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    j.atI().g(0, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(10916598906880L, 81335);
  }
  
  public static void onDeviceRequest(long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(10915927818240L, 81330);
    a.onDeviceRequest(paramLong, paramShort1, paramShort2, paramArrayOfByte, paramInt);
    GMTrace.o(10915927818240L, 81330);
  }
  
  public static void onReceiveWCLanDeviceDiscPackage(byte[] paramArrayOfByte)
  {
    GMTrace.i(10916733124608L, 81336);
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.C2JavaExDevice", "onReceiveWCLanDeviceDiscPackage, dataLen(%d).", new Object[] { Integer.valueOf(i) });
      j.atI().g(10, new Object[] { paramArrayOfByte });
      GMTrace.o(10916733124608L, 81336);
      return;
    }
  }
  
  public static void onReceiveWCLanDeviceProfile(byte[] paramArrayOfByte)
  {
    GMTrace.i(10917269995520L, 81340);
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.C2JavaExDevice", "onReceiveWCLanDeviceProfile, data(%d).", new Object[] { Integer.valueOf(i) });
      j.atI().g(14, new Object[] { paramArrayOfByte });
      GMTrace.o(10917269995520L, 81340);
      return;
    }
  }
  
  public static void onWCLanDeviceConnectStateNotify(String paramString, int paramInt)
  {
    GMTrace.i(10917135777792L, 81339);
    w.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanDeviceConnectStateNotify, devclassinfo(%s), stateCode(%d).", new Object[] { paramString, Integer.valueOf(paramInt) });
    j.atI().g(13, new Object[] { paramString, Integer.valueOf(paramInt) });
    GMTrace.o(10917135777792L, 81339);
  }
  
  public static void onWCLanDeviceUdpError(int paramInt)
  {
    GMTrace.i(10916867342336L, 81337);
    w.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanDeviceUdpError, errCode(%d).", new Object[] { Integer.valueOf(paramInt) });
    j.atI().g(11, new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(10916867342336L, 81337);
  }
  
  public static void onWCLanFileTransferUpdate(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(10917404213248L, 81341);
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanFileTransferUpdate, cmdId(%d), data(%d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      j.atI().g(15, new Object[] { Integer.valueOf(paramInt), paramArrayOfByte });
      GMTrace.o(10917404213248L, 81341);
      return;
    }
  }
  
  public static void onWCLanReceiveNotify(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(10917538430976L, 81342);
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanReceiveNotify, devclassinfo(%s), data(%d).", new Object[] { paramString, Integer.valueOf(i) });
      j.atI().g(16, new Object[] { paramString, paramArrayOfByte });
      GMTrace.o(10917538430976L, 81342);
      return;
    }
  }
  
  public static void onWCLanReceiveResponse(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(10917001560064L, 81338);
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      w.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanReceiveResponse, cmdId(%d), data(%d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      j.atI().g(12, new Object[] { Integer.valueOf(paramInt), paramArrayOfByte });
      GMTrace.o(10917001560064L, 81338);
      return;
    }
  }
  
  public static boolean sendData(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(10916196253696L, 81332);
    boolean bool = b.sendData(paramLong, paramArrayOfByte);
    GMTrace.o(10916196253696L, 81332);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\exdevice\jni\C2JavaExDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */