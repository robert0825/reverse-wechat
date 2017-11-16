package com.tencent.mm.plugin.exdevice.jni;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.a;

public final class Java2CExDevice
{
  static
  {
    GMTrace.i(10922236051456L, 81377);
    k.b(a.vgO, Java2CExDevice.class.getClassLoader());
    onCreate();
    initBluetoothAccessoryLib();
    GMTrace.o(10922236051456L, 81377);
  }
  
  public Java2CExDevice()
  {
    GMTrace.i(10917941084160L, 81345);
    GMTrace.o(10917941084160L, 81345);
  }
  
  public static native void cancelWCLanDeviceTask(int paramInt);
  
  public static native void closeBluetoothAccessoryLib();
  
  public static native int connectWCLanDevice(byte[] paramArrayOfByte, boolean paramBoolean);
  
  public static native int createChannel(long paramLong, LongWrapper paramLongWrapper);
  
  public static native void destroyChannel(long paramLong);
  
  public static native int disconnectWCLanDevice(byte[] paramArrayOfByte);
  
  public static native int getWCLanDeviceService(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native void initBluetoothAccessoryLib();
  
  public static native void initWCLanDeviceLib();
  
  public static native void onBluetoothConnected(long paramLong);
  
  public static native void onBluetoothDisconnected(long paramLong);
  
  public static native void onBluetoothError(long paramLong, int paramInt);
  
  public static native void onBluetoothRecvData(long paramLong, byte[] paramArrayOfByte);
  
  public static native void onBluetoothSendDataCompleted(long paramLong);
  
  public static native void onBluetoothSessionCreated(long paramLong1, long paramLong2, long paramLong3);
  
  public static native void onCreate();
  
  public static native int readFileDataFromWCLanDevice(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native void releaseWCLanDeviceLib();
  
  public static native int sendFileToWCLanDevice(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
  
  public static native void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte);
  
  public static native int startAirKiss(String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong);
  
  public static native int startAirKissWithInter(String paramString1, String paramString2, byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2);
  
  public static native int startChannelService(long paramLong);
  
  public static native void startScanWCLanDevice(byte[] paramArrayOfByte, int paramInt);
  
  public static native int startTask(long paramLong, short paramShort, AccessoryCmd paramAccessoryCmd, byte[] paramArrayOfByte);
  
  public static native void stopAirKiss();
  
  public static native void stopChannelService(long paramLong);
  
  public static native void stopScanWCLanDevice();
  
  public static native void stopTask(long paramLong);
  
  public static native int useWCLanDeviceService(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native int writeFileDataToWCLanDevice(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static class AccessoryCmd
  {
    public long channelID;
    public int reqCmdID;
    public int respCmdID;
    
    public AccessoryCmd()
    {
      GMTrace.i(10917672648704L, 81343);
      GMTrace.o(10917672648704L, 81343);
    }
  }
  
  public static class LongWrapper
  {
    public long value;
    
    public LongWrapper()
    {
      GMTrace.i(10917806866432L, 81344);
      GMTrace.o(10917806866432L, 81344);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\jni\Java2CExDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */