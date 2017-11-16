package com.tencent.mm.modelcdntran;

import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class i
{
  public boolean allow_mobile_net_download;
  public boolean eYr;
  public int field_advideoflag;
  public String field_aesKey;
  public int field_appType;
  public int field_arg;
  public boolean field_autostart;
  public int field_bzScene;
  public int field_chattype;
  public boolean field_enable_hitcheck;
  public String field_fake_bigfile_signature;
  public String field_fake_bigfile_signature_aeskey;
  public String field_fileId;
  public int field_fileType;
  public String field_filemd5;
  public boolean field_force_aeskeycdn;
  public String field_fullpath;
  public boolean field_isColdSnsData;
  public boolean field_isSilentTask;
  public boolean field_isStreamMedia;
  public boolean field_largesvideo;
  public long field_lastProgressCallbackTime;
  public int field_limitrate;
  public String field_mediaId;
  public int field_midFileLength;
  public String field_midimgpath;
  public boolean field_needCompressImage;
  public boolean field_needStorage;
  public boolean field_onlycheckexist;
  public int field_preloadRatio;
  public int field_priority;
  public int field_requestVideoFormat;
  public boolean field_sendmsg_viacdn;
  public String field_signalQuality;
  public int field_smallVideoFlag;
  public String field_snsScene;
  public long field_startTime;
  public String field_svr_signature;
  public String field_talker;
  public String field_thumbpath;
  public int field_totalLen;
  public boolean field_trysafecdn;
  public String field_videoFileId;
  public String field_wxmsgparam;
  public a gAB;
  public boolean gAC;
  public String gAD;
  public int gAE;
  public int gAF;
  public String[] gAG;
  public boolean gAH;
  public boolean gAI;
  public String gAJ;
  public Map<String, String> gAK;
  public boolean gAL;
  public int gAM;
  public int gAN;
  public b gAO;
  public int initialDownloadLength;
  public int initialDownloadOffset;
  public boolean is_resume_task;
  
  public i()
  {
    GMTrace.i(575659835392L, 4289);
    this.field_fullpath = "";
    this.field_thumbpath = "";
    this.field_talker = "";
    this.field_fileType = 0;
    this.field_mediaId = "";
    this.field_fileId = "";
    this.field_totalLen = 0;
    this.field_aesKey = "";
    this.field_priority = 0;
    this.field_needStorage = false;
    this.field_isStreamMedia = false;
    this.field_videoFileId = "";
    this.field_arg = 0;
    this.field_lastProgressCallbackTime = 0L;
    this.field_startTime = 0L;
    this.field_midFileLength = 0;
    this.field_appType = 0;
    this.field_bzScene = 0;
    this.field_smallVideoFlag = 0;
    this.field_sendmsg_viacdn = false;
    this.field_wxmsgparam = "";
    this.field_chattype = 0;
    this.field_autostart = false;
    this.field_limitrate = 0;
    this.field_filemd5 = "";
    this.field_advideoflag = 0;
    this.field_force_aeskeycdn = false;
    this.field_trysafecdn = false;
    this.field_largesvideo = false;
    this.field_isSilentTask = false;
    this.field_needCompressImage = false;
    this.field_requestVideoFormat = 1;
    this.field_isColdSnsData = false;
    this.field_signalQuality = "";
    this.field_snsScene = "";
    this.field_enable_hitcheck = true;
    this.field_midimgpath = "";
    this.field_fake_bigfile_signature = "";
    this.field_fake_bigfile_signature_aeskey = "";
    this.field_svr_signature = "";
    this.field_onlycheckexist = false;
    this.initialDownloadLength = -1;
    this.initialDownloadOffset = -1;
    this.field_preloadRatio = 30;
    this.gAC = false;
    this.gAD = "";
    this.gAE = 0;
    this.gAF = 0;
    this.gAG = null;
    this.gAH = true;
    this.gAI = false;
    this.allow_mobile_net_download = false;
    this.is_resume_task = false;
    this.gAJ = "";
    this.gAK = null;
    this.gAL = false;
    this.gAN = 1;
    GMTrace.o(575659835392L, 4289);
  }
  
  public final boolean Gn()
  {
    GMTrace.i(17506018263040L, 130430);
    if (this.gAN == 2)
    {
      GMTrace.o(17506018263040L, 130430);
      return true;
    }
    GMTrace.o(17506018263040L, 130430);
    return false;
  }
  
  public final boolean Go()
  {
    GMTrace.i(17506152480768L, 130431);
    if (this.gAN == 1)
    {
      GMTrace.o(17506152480768L, 130431);
      return true;
    }
    GMTrace.o(17506152480768L, 130431);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean);
    
    public abstract void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream);
    
    public abstract byte[] h(String paramString, byte[] paramArrayOfByte);
  }
  
  public static abstract interface b
  {
    public abstract void b(String paramString, keep_SceneResult paramkeep_SceneResult);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */