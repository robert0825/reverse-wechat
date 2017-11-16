package com.tencent.mm.modelcdntran;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public class keep_SceneResult
{
  protected static final char[] hexArray;
  public String dummyvalue;
  public int field_UploadHitCacheType;
  public String field_aesKey;
  public String field_arg;
  public String field_argInfo;
  public int field_averageConnectCost;
  public int field_averageSpeed;
  public boolean field_convert2baseline;
  public long field_enQueueTime;
  public long field_endTime;
  public boolean field_exist_whencheck;
  public String field_fileId;
  public int field_fileLength;
  public String field_fileUrl;
  public int field_filecrc;
  public String field_filemd5;
  public int field_firstConnectCost;
  public boolean field_firstRequestCompleted;
  public int field_firstRequestCost;
  public int field_firstRequestDownloadSize;
  public int field_firstRequestSize;
  public String field_httpResponseHeader;
  public int field_httpStatusCode;
  public boolean field_isVideoReduced;
  public int field_midimgLength;
  public boolean field_moovCompleted;
  public int field_moovCost;
  public int field_moovFailReason;
  public int field_moovRequestTimes;
  public int field_moovSize;
  public String field_mp4identifymd5;
  public boolean field_needSendMsgField;
  public int field_netConnectTimes;
  public int field_recvedBytes;
  public int field_retCode;
  public byte[] field_sKeyrespbuf;
  public long field_startTime;
  public String field_thumbUrl;
  public String field_thumbfilemd5;
  public int field_thumbimgLength;
  public String field_toUser;
  public String field_transInfo;
  public boolean field_upload_by_safecdn;
  public String[] field_usedSvrIps;
  public String field_videoFileId;
  public int field_videoFormat;
  public String mediaId;
  public String report_Part2;
  
  static
  {
    GMTrace.i(574854529024L, 4283);
    hexArray = "0123456789ABCDEF".toCharArray();
    GMTrace.o(574854529024L, 4283);
  }
  
  public keep_SceneResult()
  {
    GMTrace.i(574451875840L, 4280);
    this.report_Part2 = "";
    this.dummyvalue = ",,,,,,";
    this.field_thumbUrl = "";
    this.field_fileUrl = "";
    this.field_filemd5 = "";
    this.field_thumbfilemd5 = "";
    this.field_mp4identifymd5 = "";
    this.field_exist_whencheck = false;
    this.field_recvedBytes = 0;
    this.field_videoFormat = 0;
    this.field_startTime = 0L;
    this.field_endTime = 0L;
    this.field_enQueueTime = 0L;
    this.field_firstRequestCost = 0;
    this.field_firstRequestSize = 0;
    this.field_firstRequestDownloadSize = 0;
    this.field_firstRequestCompleted = false;
    this.field_averageSpeed = 0;
    this.field_averageConnectCost = 0;
    this.field_firstConnectCost = 0;
    this.field_netConnectTimes = 0;
    this.field_moovRequestTimes = 0;
    this.field_moovCost = 0;
    this.field_moovSize = 0;
    this.field_moovCompleted = false;
    this.field_moovFailReason = 0;
    this.field_httpStatusCode = 0;
    this.field_isVideoReduced = false;
    this.field_httpResponseHeader = "";
    this.field_UploadHitCacheType = 0;
    this.field_needSendMsgField = true;
    this.field_convert2baseline = false;
    this.field_exist_whencheck = false;
    GMTrace.o(574451875840L, 4280);
  }
  
  private String bytesToHex(byte[] paramArrayOfByte)
  {
    GMTrace.i(574586093568L, 4281);
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i * 2)] = hexArray[(j >>> 4)];
      arrayOfChar[(i * 2 + 1)] = hexArray[(j & 0xF)];
      i += 1;
    }
    paramArrayOfByte = new String(arrayOfChar);
    GMTrace.o(574586093568L, 4281);
    return paramArrayOfByte;
  }
  
  public boolean isUploadBySafeCDNWithMD5()
  {
    GMTrace.i(574317658112L, 4279);
    if ((this.field_upload_by_safecdn) && ((2 == this.field_UploadHitCacheType) || (3 == this.field_UploadHitCacheType)))
    {
      GMTrace.o(574317658112L, 4279);
      return true;
    }
    GMTrace.o(574317658112L, 4279);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(574720311296L, 4282);
    String str2 = String.format("id:%s file:%s filelen:%d midlen:%d thlen:%d transInfo:%s retCode:%d toUser:%s arg:%s videoFileId:%s argInfo:%s hitcache:%d needsend:%b msgid:%d convert2baseline:%b thumbUrl:%s fileUrl:%s filemd5:%s thumbfilemd5:%s,mp4identifymd5:%s, exist_whencheck[%b], aesKey[%s], crc[%s], safecdn:%b", new Object[] { this.mediaId, this.field_fileId, Integer.valueOf(this.field_fileLength), Integer.valueOf(this.field_midimgLength), Integer.valueOf(this.field_thumbimgLength), this.field_transInfo, Integer.valueOf(this.field_retCode), this.field_toUser, this.field_arg, this.field_videoFileId, this.field_argInfo, Integer.valueOf(this.field_UploadHitCacheType), Boolean.valueOf(this.field_needSendMsgField), Integer.valueOf(0), Boolean.valueOf(this.field_convert2baseline), this.field_thumbUrl, this.field_fileUrl, this.field_filemd5, this.field_thumbfilemd5, this.field_mp4identifymd5, Boolean.valueOf(this.field_exist_whencheck), bg.SJ(this.field_aesKey), Integer.valueOf(this.field_filecrc), Boolean.valueOf(this.field_upload_by_safecdn) });
    String str1 = str2;
    if (this.field_sKeyrespbuf != null) {
      str1 = str2 + String.format("skeyrespbuf:%s", new Object[] { bytesToHex(this.field_sKeyrespbuf) });
    }
    GMTrace.o(574720311296L, 4282);
    return str1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\keep_SceneResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */