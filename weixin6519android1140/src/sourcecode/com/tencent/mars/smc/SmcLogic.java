package com.tencent.mars.smc;

import com.tencent.mars.Mars;
import com.tencent.mm.plugin.report.service.g;
import java.util.ArrayList;

public class SmcLogic
{
  private static final String TAG = "mars.SmcLogic";
  private static ICallBack callBack;
  
  static
  {
    try
    {
      ArrayList localArrayList = getLoadLibraries();
      Mars.checkLoadedModules(localArrayList, "mars.SmcLogic");
      callBack = null;
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;)
      {
        Object localObject = null;
        Mars.loadDefaultMarsLibrary();
      }
    }
  }
  
  public static native void OnPluginMsg(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);
  
  public static native void OnReportResp(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3);
  
  private static boolean OnSelfMonitorOpLogReady(byte[] paramArrayOfByte)
  {
    if (callBack == null) {
      return false;
    }
    return callBack.OnSelfMonitorOpLogReady(paramArrayOfByte);
  }
  
  public static native void OnStrategyResp(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3);
  
  public static native void SetDebugFlag(boolean paramBoolean);
  
  public static native void SetMonitorId(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  private static String getKVCommPath()
  {
    if (callBack == null) {
      return "";
    }
    return callBack.getKVCommPath();
  }
  
  private static BaseInfo getKVCommReqBaseInfo()
  {
    if (callBack == null) {
      return new BaseInfo();
    }
    return callBack.getKVCommReqBaseInfo();
  }
  
  private static native ArrayList<String> getLoadLibraries();
  
  private static int getSingleReportBufSizeB()
  {
    if (callBack == null) {
      return 0;
    }
    return callBack.getSingleReportBufSizeB();
  }
  
  public static native ArrayList<Integer> getStrategyVersions();
  
  private static void onReportDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (callBack == null) {
      return;
    }
    callBack.onReportDataReady(paramArrayOfByte1, paramArrayOfByte2, paramInt);
  }
  
  private static boolean onRequestGetStrategy(byte[] paramArrayOfByte, int paramInt)
  {
    if (callBack == null) {
      return false;
    }
    return callBack.onRequestGetStrategy(paramArrayOfByte, paramInt);
  }
  
  public static native void reportIDKey(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
  
  public static native void reportListIDKey(IDKey[] paramArrayOfIDKey, boolean paramBoolean);
  
  public static void setCallBack(ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }
  
  public static native void setUin(long paramLong);
  
  public static native void writeImportKvData(long paramLong, String paramString, boolean paramBoolean);
  
  public static native void writeImportKvPbData(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean);
  
  public static native void writeKvData(long paramLong, String paramString, boolean paramBoolean);
  
  public static native void writeKvPbData(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean);
  
  public static class BaseInfo
  {
    public String deviceBrand;
    public String deviceModel;
    public String languageVer;
    public String osName;
    public String osVersion;
  }
  
  public static abstract interface ICallBack
  {
    public abstract boolean OnSelfMonitorOpLogReady(byte[] paramArrayOfByte);
    
    public abstract String getKVCommPath();
    
    public abstract SmcLogic.BaseInfo getKVCommReqBaseInfo();
    
    public abstract int getSingleReportBufSizeB();
    
    public abstract void onReportDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt);
    
    public abstract boolean onRequestGetStrategy(byte[] paramArrayOfByte, int paramInt);
  }
  
  public static class IPCSmcLogic
  {
    private static void reportGroupIDKey(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int paramInt, boolean paramBoolean)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < paramInt)
      {
        localArrayList.add(new IDKey(paramArrayOfInt1[i], paramArrayOfInt2[i], paramArrayOfInt3[i]));
        i += 1;
      }
      g.ork.b(localArrayList, paramBoolean);
    }
    
    private static void reportIDKey(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
    {
      g.ork.a(paramLong1, paramLong2, paramLong3, paramBoolean);
    }
    
    private static void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      g.ork.a((int)paramLong, paramString, paramBoolean2, paramBoolean1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\smc\SmcLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */