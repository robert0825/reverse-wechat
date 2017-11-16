package com.tencent.mars.stn;

import com.tencent.mars.Mars;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class StnLogic
{
  public static final int CONNECTED = 4;
  public static final int CONNECTTING = 3;
  public static int ECHECK_NEVER = 0;
  public static int ECHECK_NEXT = 0;
  public static int ECHECK_NOW = 0;
  public static final int GATEWAY_FAILED = 1;
  public static final int INVALID_TASK_ID = -1;
  public static final int NETWORK_UNAVAILABLE = 0;
  public static final int NETWORK_UNKNOWN = -1;
  public static int RESP_FAIL_HANDLE_DEFAULT = 0;
  public static int RESP_FAIL_HANDLE_NORMAL = 0;
  public static int RESP_FAIL_HANDLE_SESSION_TIMEOUT = 0;
  public static int RESP_FAIL_HANDLE_TASK_END = 0;
  public static final int SERVER_DOWN = 5;
  public static final int SERVER_FAILED = 2;
  private static final String TAG = "mars.StnLogic";
  private static ICallBack callBack;
  public static final int ectDial = 2;
  public static final int ectDns = 3;
  public static final int ectEnDecode = 7;
  public static final int ectFalse = 1;
  public static final int ectHttp = 5;
  public static final int ectLocal = 9;
  public static final int ectNetMsgXP = 6;
  public static final int ectOK = 0;
  public static final int ectServer = 8;
  public static final int ectSocket = 4;
  
  static
  {
    try
    {
      ArrayList localArrayList = getLoadLibraries();
      Mars.checkLoadedModules(localArrayList, "mars.StnLogic");
      ECHECK_NOW = 0;
      ECHECK_NEXT = 1;
      ECHECK_NEVER = 2;
      RESP_FAIL_HANDLE_NORMAL = 0;
      RESP_FAIL_HANDLE_DEFAULT = -1;
      RESP_FAIL_HANDLE_SESSION_TIMEOUT = -13;
      RESP_FAIL_HANDLE_TASK_END = -14;
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
  
  private static int buf2Resp(int paramInt1, Object paramObject, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2)
  {
    return 0;
  }
  
  private static int buf2Resp(int paramInt1, Object paramObject, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2)
  {
    if (callBack == null) {
      return RESP_FAIL_HANDLE_TASK_END;
    }
    return callBack.buf2Resp(paramInt1, paramObject, paramArrayOfByte, paramArrayOfInt1, paramArrayOfInt2, paramInt2);
  }
  
  public static native void clearTask();
  
  private static String exception2String(Exception paramException)
  {
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  private static native ArrayList<String> getLoadLibraries();
  
  private static int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2, int[] paramArrayOfInt)
  {
    if (callBack == null) {
      return ECHECK_NEVER;
    }
    return callBack.getLongLinkIdentifyCheckBuffer(paramByteArrayOutputStream1, paramByteArrayOutputStream2, paramArrayOfInt);
  }
  
  public static native boolean hasTask(int paramInt);
  
  public static boolean isLogoned()
  {
    if (callBack == null) {
      return false;
    }
    return callBack.isLogoned();
  }
  
  public static native void keepSignalling();
  
  private static boolean makesureAuthed()
  {
    if (callBack == null) {
      return false;
    }
    return callBack.makesureAuthed();
  }
  
  public static native void makesureLongLinkConnected();
  
  private static void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    if (callBack == null) {
      return;
    }
    callBack.networkAnalysisCallBack(paramInt1, paramInt2, paramBoolean, paramString);
  }
  
  private static boolean onLongLinkIdentifyResp(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (callBack == null) {
      return false;
    }
    return callBack.onLongLinkIdentifyResp(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  private static String[] onNewDns(String paramString)
  {
    if (callBack == null) {
      return null;
    }
    return callBack.onNewDns(paramString);
  }
  
  private static void onPush(int paramInt, byte[] paramArrayOfByte)
  {
    if (callBack == null) {
      return;
    }
    callBack.onPush(paramInt, paramArrayOfByte);
  }
  
  private static int onTaskEnd(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    if (callBack == null) {
      return 0;
    }
    return callBack.onTaskEnd(paramInt1, paramObject, paramInt2, paramInt3);
  }
  
  public static native void redoTask();
  
  private static void reportConnectStatus(int paramInt1, int paramInt2)
  {
    if (callBack == null) {
      return;
    }
    callBack.reportConnectInfo(paramInt1, paramInt2);
  }
  
  private static void reportTaskProfile(String paramString) {}
  
  private static boolean req2Buf(int paramInt1, Object paramObject, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2)
  {
    if (callBack == null) {
      return false;
    }
    return callBack.req2Buf(paramInt1, paramObject, paramByteArrayOutputStream, paramArrayOfInt, paramInt2);
  }
  
  public static void requestDoSync()
  {
    if (callBack == null) {
      return;
    }
    callBack.requestDoSync();
  }
  
  private static String[] requestNetCheckShortLinkHosts()
  {
    if (callBack == null) {
      return null;
    }
    return callBack.requestNetCheckShortLinkHosts();
  }
  
  public static native void reset();
  
  public static native void setBackupIPs(String paramString, String[] paramArrayOfString);
  
  public static void setCallBack(ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }
  
  public static native void setDebugIP(String paramString1, String paramString2);
  
  public static void setLonglinkSvrAddr(String paramString, int[] paramArrayOfInt)
  {
    setLonglinkSvrAddr(paramString, paramArrayOfInt, null);
  }
  
  public static native void setLonglinkSvrAddr(String paramString1, int[] paramArrayOfInt, String paramString2);
  
  public static native void setProductID(short paramShort);
  
  public static void setShortlinkSvrAddr(int paramInt)
  {
    setShortlinkSvrAddr(paramInt, null);
  }
  
  public static native void setShortlinkSvrAddr(int paramInt, String paramString);
  
  public static native void setSignallingStrategy(long paramLong1, long paramLong2);
  
  public static native boolean startNetworkAnalysis();
  
  public static native void startTask(Task paramTask);
  
  public static native void stopSignalling();
  
  public static native void stopTask(int paramInt);
  
  private static void trafficData(int paramInt1, int paramInt2) {}
  
  public static abstract interface ICallBack
  {
    public static final int BaseNetDetectEnd = 2;
    public static final int DetectConnectFail = 1;
    public static final int DetectConnectOK = 0;
    public static final int DetectEnd = 4;
    public static final int DetectLongLinkEnd = 0;
    public static final int DetectNotStart = 3;
    public static final int DetectShortLinkEnd = 1;
    public static final int DetectTimeout = 2;
    
    public abstract int buf2Resp(int paramInt1, Object paramObject, byte[] paramArrayOfByte, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt2);
    
    public abstract int getLongLinkIdentifyCheckBuffer(ByteArrayOutputStream paramByteArrayOutputStream1, ByteArrayOutputStream paramByteArrayOutputStream2, int[] paramArrayOfInt);
    
    public abstract boolean isLogoned();
    
    public abstract boolean makesureAuthed();
    
    public abstract void networkAnalysisCallBack(int paramInt1, int paramInt2, boolean paramBoolean, String paramString);
    
    public abstract boolean onLongLinkIdentifyResp(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
    
    public abstract String[] onNewDns(String paramString);
    
    public abstract void onPush(int paramInt, byte[] paramArrayOfByte);
    
    public abstract int onTaskEnd(int paramInt1, Object paramObject, int paramInt2, int paramInt3);
    
    public abstract void reportConnectInfo(int paramInt1, int paramInt2);
    
    public abstract boolean req2Buf(int paramInt1, Object paramObject, ByteArrayOutputStream paramByteArrayOutputStream, int[] paramArrayOfInt, int paramInt2);
    
    public abstract void requestDoSync();
    
    public abstract String[] requestNetCheckShortLinkHosts();
  }
  
  public static class Task
  {
    public static final int EBoth = 3;
    public static final int EFAST = 1;
    public static final int ELong = 2;
    public static final int ENORMAL = 0;
    public static final int EShort = 1;
    public static final int ETASK_PRIORITY_0 = 0;
    public static final int ETASK_PRIORITY_1 = 1;
    public static final int ETASK_PRIORITY_2 = 2;
    public static final int ETASK_PRIORITY_3 = 3;
    public static final int ETASK_PRIORITY_4 = 4;
    public static final int ETASK_PRIORITY_5 = 5;
    public static final int ETASK_PRIORITY_HIGHEST = 0;
    public static final int ETASK_PRIORITY_LOWEST = 5;
    public static final int ETASK_PRIORITY_NORMAL = 3;
    private static AtomicInteger ai = new AtomicInteger(0);
    public String cgi;
    public int channelSelect;
    public int channelStrategy;
    public int cmdID;
    public boolean limitFlow;
    public boolean limitFrequency;
    public boolean needAuthed;
    public boolean networkStatusSensitive;
    public int priority;
    public String reportArg;
    public int retryCount = -1;
    public boolean sendOnly;
    public int serverProcessCost;
    public ArrayList<String> shortLinkHostList;
    public int taskID = ai.incrementAndGet();
    public int totalTimeout;
    public Object userContext;
    
    public Task() {}
    
    public Task(int paramInt1, int paramInt2, String paramString, ArrayList<String> paramArrayList)
    {
      this.channelSelect = paramInt1;
      this.cmdID = paramInt2;
      this.cgi = paramString;
      this.shortLinkHostList = paramArrayList;
      this.sendOnly = false;
      this.needAuthed = true;
      this.limitFlow = true;
      this.limitFrequency = true;
      this.channelStrategy = 0;
      this.networkStatusSensitive = false;
      this.priority = 3;
      this.retryCount = -1;
      this.serverProcessCost = 0;
      this.totalTimeout = 0;
      this.userContext = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\stn\StnLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */