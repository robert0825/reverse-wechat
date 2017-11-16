package com.tencent.mars.cdn;

import com.tencent.mars.Mars;
import java.util.ArrayList;

public class CdnLogic
{
  public static final int HIT_FILEID = 1;
  public static final int HIT_UPLOADCHECKMD5 = 2;
  public static final int HIT_UPLOADWITHMD5 = 3;
  public static final int MediaType_FAVORITE_FILE = 10001;
  public static final int MediaType_FAVORITE_VIDEO = 10002;
  public static final int MediaType_FILE = 5;
  public static final int MediaType_FRIENDS = 20201;
  public static final int MediaType_FRIENDS_Video = 20202;
  public static final int MediaType_FULLSIZEIMAGE = 1;
  public static final int MediaType_IMAGE = 2;
  public static final int MediaType_THUMBIMAGE = 3;
  public static final int MediaType_TinyVideo = 6;
  public static final int MediaType_VIDEO = 4;
  public static final int NO_ERROR = 0;
  public static final int NO_HITCACHE = 0;
  public static final int PreloadMode = 2;
  public static final int StorageMode = 0;
  private static final String TAG = "mars.CdnLogic";
  public static final int VideoFormat_Unknown = 0;
  public static final int VideoFormat_X264 = 1;
  public static final int VideoFormat_X265 = 2;
  public static final int VideoPlayMode = 1;
  private static ICallback callBack;
  public static final int kIpSource_NewDNS = 1;
  public static final int kIpSource_None = 0;
  public static final int kIpSource_SysDNS = 2;
  
  static
  {
    try
    {
      ArrayList localArrayList = getLoadLibraries();
      Mars.checkLoadedModules(localArrayList, "mars.CdnLogic");
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
  
  public static void RequestGetCDN(int paramInt)
  {
    if (callBack == null) {
      return;
    }
    callBack.RequestGetCDN(paramInt);
  }
  
  public static native int cancelDownloadTaskWithResult(String paramString, C2CDownloadResult paramC2CDownloadResult);
  
  public static native void cancelTask(String paramString);
  
  public static native int cancelUploadTaskWithResult(String paramString, C2CUploadResult paramC2CUploadResult);
  
  public static native String createAeskey();
  
  private static byte[] decodeSessionResponseBuf(String paramString, byte[] paramArrayOfByte)
  {
    if (callBack == null) {
      return null;
    }
    return callBack.decodeSessionResponseBuf(paramString, paramArrayOfByte);
  }
  
  public static native int getFileCrc32(String paramString);
  
  public static native String getFileMD5(String paramString);
  
  private static native ArrayList<String> getLoadLibraries();
  
  public static native String getMP4IdentifyMD5(String paramString);
  
  private static byte[] getSessionRequestBuf(String paramString, byte[] paramArrayOfByte)
  {
    if (callBack == null) {
      return null;
    }
    return callBack.getSessionRequestBuf(paramString, paramArrayOfByte);
  }
  
  public static native CdnTaskStateInfo httpMultiSocketDownloadTaskState(String paramString);
  
  public static native boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2);
  
  private static void onC2CDownloadCompleted(String paramString, C2CDownloadResult paramC2CDownloadResult)
  {
    if (callBack == null) {
      return;
    }
    callBack.onC2CDownloadCompleted(paramString, paramC2CDownloadResult);
  }
  
  private static void onC2CUploadCompleted(String paramString, C2CUploadResult paramC2CUploadResult)
  {
    if (callBack == null) {
      return;
    }
    callBack.onC2CUploadCompleted(paramString, paramC2CUploadResult);
  }
  
  private static void onCheckFileIDCompleted(String paramString, CheckFileIDResult paramCheckFileIDResult)
  {
    if (callBack == null) {
      return;
    }
    callBack.onCheckFileidCompleted(paramString, paramCheckFileIDResult);
  }
  
  public static native void onCreate(String paramString);
  
  public static void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    if (callBack == null) {
      return;
    }
    callBack.onDataAvailable(paramString, paramInt1, paramInt2);
  }
  
  public static void onDownloadToEnd(String paramString, int paramInt1, int paramInt2)
  {
    if (callBack == null) {
      return;
    }
    callBack.onDownloadToEnd(paramString, paramInt1, paramInt2);
  }
  
  public static void onMoovReady(String paramString, int paramInt1, int paramInt2)
  {
    if (callBack == null) {
      return;
    }
    callBack.onMoovReady(paramString, paramInt1, paramInt2);
  }
  
  public static void onPreloadCompleted(String paramString, int paramInt1, int paramInt2)
  {
    if (callBack == null) {
      return;
    }
    callBack.onPreloadCompleted(paramString, paramInt1, paramInt2);
  }
  
  public static void onPreloadCompletedWithResult(String paramString, C2CDownloadResult paramC2CDownloadResult)
  {
    if (callBack == null) {
      return;
    }
    callBack.onPreloadCompletedWithResult(paramString, paramC2CDownloadResult);
  }
  
  private static void onProgressChanged(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (callBack == null) {
      return;
    }
    callBack.onProgressChanged(paramString, paramInt1, paramInt2, paramBoolean);
  }
  
  private static void onRecvedData(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    if (callBack == null) {
      return;
    }
    callBack.onRecvedData(paramString, paramInt, paramArrayOfByte);
  }
  
  public static native int pauseHttpMultiSocketDownloadTask(String paramString);
  
  public static native int requestVideoData(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public static native int resumeHttpMultiSocketDownloadTask(String paramString);
  
  public static void setCallBack(ICallback paramICallback)
  {
    callBack = paramICallback;
  }
  
  public static native void setCdnInfo(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native void setCdnInfoParams(CdnInfoParams paramCdnInfoParams1, CdnInfoParams paramCdnInfoParams2, int paramInt);
  
  public static native void setConfig(Config paramConfig);
  
  public static native void setDebugIP(String paramString);
  
  public static native void setFlowLimitPerHour(int paramInt);
  
  public static native void setLegacyCdnInfo(CdnInfo paramCdnInfo1, CdnInfo paramCdnInfo2, CdnInfo paramCdnInfo3, CdnInfo paramCdnInfo4, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native void setRSAPublicKeyParams(String paramString1, String paramString2, String paramString3);
  
  public static native void setToUserCiper(String paramString);
  
  public static native int startC2CDownload(C2CDownloadRequest paramC2CDownloadRequest);
  
  public static native int startC2CUpload(C2CUploadRequest paramC2CUploadRequest);
  
  public static native int startCheckFileId(CheckFileIdRequest paramCheckFileIdRequest);
  
  public static native int startHttpMultiSocketDownloadTask(C2CDownloadRequest paramC2CDownloadRequest);
  
  public static native int startHttpVideoStreamingDownload(C2CDownloadRequest paramC2CDownloadRequest, int paramInt);
  
  public static native int startHttpsDownload(C2CDownloadRequest paramC2CDownloadRequest);
  
  public static native int startSNSDownload(C2CDownloadRequest paramC2CDownloadRequest, int paramInt);
  
  public static native int startVideoStreamingDownload(C2CDownloadRequest paramC2CDownloadRequest, int paramInt);
  
  public static class C2CDownloadRequest
  {
    public String aeskey = "";
    public boolean allow_mobile_net_download = false;
    public String argInfo = "";
    public String bakup_url = "";
    public String bigfileSignature = "";
    public int chatType = 0;
    public String customHttpHeader = "";
    public String fakeBigfileSignature = "";
    public String fakeBigfileSignatureAeskey = "";
    public String fileKey = "";
    public int fileSize = 0;
    public int fileType = 0;
    public String fileid = "";
    public String host = "";
    public int initialDownloadLength = -1;
    public int initialDownloadOffset = -1;
    public String[] iplist = null;
    public int iplistSource = 2;
    public boolean isAutoStart = false;
    public boolean isColdSnsData = false;
    public boolean isLargeSVideo = false;
    public boolean isSilentTask = false;
    public boolean isSmallVideo = false;
    public boolean isStorageMode = false;
    public boolean is_resume_task = false;
    public int limitRate = 0;
    public String msgExtra = "";
    public int preloadRatio = 30;
    public int queueTimeoutSeconds = 1800;
    public String referer = "";
    public int requestVideoFormat = 1;
    public String savePath = "";
    public String serialized_verify_headers = "";
    public String signalQuality = "";
    public String snsCipherKey = "";
    public String snsScene = "";
    public int transforTimeoutSeconds = 600;
    public String url = "";
    public String videofileid = "";
  }
  
  public static class C2CDownloadResult
  {
    public String argInfo = "";
    public int averageConnectCost = 0;
    public int averageSpeed = 0;
    public long enQueueTime = 0L;
    public long endTime = 0L;
    public int errorCode = 0;
    public int fileSize = 0;
    public String fileid = "";
    public int firstConnectCost = 0;
    public boolean firstRequestCompleted = false;
    public int firstRequestCost = 0;
    public int firstRequestDownloadSize = 0;
    public int firstRequestSize = 0;
    public String httpResponseHeader = "";
    public int httpStatusCode = 0;
    public boolean moovCompleted = false;
    public int moovCost = 0;
    public int moovFailReason = 0;
    public int moovRequestTimes = 0;
    public int moovSize = 0;
    public int netConnectTimes = 0;
    public int recvedBytes = 0;
    public long startTime = 0L;
    public String transforMsg = "";
    public String[] usedSvrIps;
    public int videoFormat = 0;
  }
  
  public static class C2CUploadRequest
  {
    public int apptype = 0;
    public String bigfileSignature = "";
    public int bizscene = 0;
    public int chatType = 0;
    public boolean checkExistOnly = false;
    public boolean enableHitCheck = true;
    public String fakeBigfileSignature = "";
    public String fakeBigfileSignatureAeskey = "";
    public String fileKey = "";
    public String filePath = "";
    public int fileSize = 0;
    public int fileType = 0;
    public boolean forceNoSafeCdn = false;
    public String forwardAeskey = "";
    public String forwardFileid = "";
    public boolean isLargeSVideo = false;
    public boolean isSmallVideo = false;
    public boolean isSnsAdVideo = false;
    public boolean isStorageMode = false;
    public boolean isStreamMedia = false;
    public int midfileSize = 0;
    public String midimgPath = "";
    public boolean needCompressImage = false;
    public boolean onlyCheckExist = false;
    public int queueTimeoutSeconds = 1800;
    public boolean sendmsgFromCDN = false;
    public String thumbfilePath = "";
    public String toUser = "";
    public int transforTimeoutSeconds = 600;
    public boolean trySafeCdn = false;
  }
  
  public static class C2CUploadResult
  {
    public String aeskey = "";
    public int errorCode = 0;
    public boolean existOnSvr = false;
    public int fileCrc32 = 0;
    public int fileSize = 0;
    public String fileUrl = "";
    public String fileid = "";
    public String filemd5 = "";
    public int filetype = 0;
    public int hitCache = 0;
    public boolean isVideoReduced = false;
    public int midfileSize = 0;
    public String mp4identifymd5 = "";
    public boolean sendmsgFromCDN = false;
    public byte[] skeyrespbuf = null;
    public int thumbfileSize = 0;
    public String thumbfileUrl = "";
    public String thumbfilemd5 = "";
    public String touser = "";
    public String transforMsg = "";
    public boolean uploadBySafecdn = false;
    public String[] usedSvrIps;
    public String videofileid = "";
  }
  
  public static class CdnInfo
  {
    public byte[] authkey = null;
    public int frontid = 0;
    public String frontip1 = null;
    public String frontip2 = null;
    public int[] frontports = null;
    public int nettype = 0;
    public int uin = 0;
    public int ver = 0;
    public int zoneid = 0;
    public String zoneip1 = null;
    public String zoneip2 = null;
    public int[] zoneports = null;
  }
  
  public static class CdnInfoParams
  {
    public int c2CretryIntervalMs = 0;
    public int c2CrwtimeoutMs = 0;
    public int c2CshowErrorDelayMs = 0;
    public int snsretryIntervalMs = 0;
    public int snsrwtimeoutMs = 0;
    public int snsshowErrorDelayMs = 0;
  }
  
  public static class CdnTaskStateInfo
  {
    public static final int kNotExits = 103;
    public static final int kPausing = 102;
    public static final int kRunning = 100;
    public static final int kWaiting = 101;
    public int completeSize = 0;
    public int fileTotalSize = 0;
    public int taskState = -100;
  }
  
  public static class CheckFileIDResult
  {
    public int errorCode = 0;
    public int[] existFlags = null;
    public CdnLogic.CheckFileidItem[] fileItems = null;
    public String fileKey = "";
    public String[] newFileids = null;
  }
  
  public static class CheckFileIdRequest
  {
    public CdnLogic.CheckFileidItem[] fileItems = null;
    public String fileKey = "";
    public int queueTimeoutSeconds = 1800;
    public String toUser = "";
    public int transforTimeoutSeconds = 600;
  }
  
  public static class CheckFileidItem
  {
    public int fileType = 0;
    public String fileid = "";
  }
  
  public static class Config
  {
    public int AckSlice = 8192;
    public int C2COverloadDelaySeconds = 10;
    public int EnableCDNVerifyConnect = 1;
    public int EnableCDNVideoRedirectOC = 1;
    public int EnableSafeCDN = 0;
    public int EnableSnsImageDownload = 0;
    public int EnableSnsStreamDownload = 0;
    public int EnableStreamUploadVideo = 1;
    public int MobileEtl = 70;
    public int Ptl = 35;
    public int SNSOverloadDelaySeconds = 60;
    public int UseDynamicETL = 0;
    public int UseStreamCDN = 1;
    public int WifiEtl = 90;
    public boolean onlyrecvPtl = false;
    public boolean onlysendETL = false;
    
    public String toString()
    {
      return String.format("wifietl:%d, nowifietl:%d,ptl:%d,UseStreamCDN:%d,onlysendetl:%b,onlyrecvptl:%b,ackslice:%d,enableverify:%d,enableoc:%d,enablevideo:%d,dynamicetl:%b,c2coverload:%d,snsoverload:%d,safecdn:%d,snsstream:%d, snsimage:%d", new Object[] { Integer.valueOf(this.WifiEtl), Integer.valueOf(this.MobileEtl), Integer.valueOf(this.Ptl), Integer.valueOf(this.UseStreamCDN), Boolean.valueOf(this.onlysendETL), Boolean.valueOf(this.onlyrecvPtl), Integer.valueOf(this.AckSlice), Integer.valueOf(this.EnableCDNVerifyConnect), Integer.valueOf(this.EnableCDNVideoRedirectOC), Integer.valueOf(this.EnableStreamUploadVideo), Integer.valueOf(this.UseDynamicETL), Integer.valueOf(this.C2COverloadDelaySeconds), Integer.valueOf(this.SNSOverloadDelaySeconds), Integer.valueOf(this.EnableSafeCDN), Integer.valueOf(this.EnableSnsStreamDownload), Integer.valueOf(this.EnableSnsImageDownload) });
    }
  }
  
  public static abstract interface ICallback
  {
    public abstract void RequestGetCDN(int paramInt);
    
    public abstract byte[] decodeSessionResponseBuf(String paramString, byte[] paramArrayOfByte);
    
    public abstract byte[] getSessionRequestBuf(String paramString, byte[] paramArrayOfByte);
    
    public abstract void onC2CDownloadCompleted(String paramString, CdnLogic.C2CDownloadResult paramC2CDownloadResult);
    
    public abstract void onC2CUploadCompleted(String paramString, CdnLogic.C2CUploadResult paramC2CUploadResult);
    
    public abstract void onCheckFileidCompleted(String paramString, CdnLogic.CheckFileIDResult paramCheckFileIDResult);
    
    public abstract void onDataAvailable(String paramString, int paramInt1, int paramInt2);
    
    public abstract void onDownloadToEnd(String paramString, int paramInt1, int paramInt2);
    
    public abstract void onMoovReady(String paramString, int paramInt1, int paramInt2);
    
    public abstract void onPreloadCompleted(String paramString, int paramInt1, int paramInt2);
    
    public abstract void onPreloadCompletedWithResult(String paramString, CdnLogic.C2CDownloadResult paramC2CDownloadResult);
    
    public abstract void onProgressChanged(String paramString, int paramInt1, int paramInt2, boolean paramBoolean);
    
    public abstract void onRecvedData(String paramString, int paramInt, byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\cdn\CdnLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */