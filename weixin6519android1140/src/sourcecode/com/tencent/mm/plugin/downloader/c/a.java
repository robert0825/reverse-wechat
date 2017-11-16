package com.tencent.mm.plugin.downloader.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.b.b;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.i.b;
import com.tencent.mm.modelcdntran.j;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements b.b
{
  private static a kdY;
  private af fZz;
  public Queue<String> gzF;
  public Map<String, i> gzG;
  public Map<String, i> gzH;
  public Map<String, Integer> gzI;
  private String gzJ;
  private long gzK;
  public HashSet<String> gzL;
  public b kdZ;
  
  static
  {
    GMTrace.i(20080180068352L, 149609);
    kdY = null;
    GMTrace.o(20080180068352L, 149609);
  }
  
  public a()
  {
    GMTrace.i(20078972108800L, 149600);
    this.gzF = new LinkedList();
    this.gzG = new ConcurrentHashMap();
    this.gzH = new ConcurrentHashMap();
    this.gzI = new ConcurrentHashMap();
    this.fZz = new af();
    this.kdZ = new b(ab.getContext().getFilesDir() + "/NativeCDNInfo", this);
    this.gzJ = "";
    this.gzK = 0L;
    this.gzL = new HashSet();
    GMTrace.o(20078972108800L, 149600);
  }
  
  public static boolean a(keep_ProgressInfo paramkeep_ProgressInfo)
  {
    GMTrace.i(20079643197440L, 149605);
    if (paramkeep_ProgressInfo != null)
    {
      if (paramkeep_ProgressInfo.field_finishedLength == paramkeep_ProgressInfo.field_toltalLength)
      {
        GMTrace.o(20079643197440L, 149605);
        return true;
      }
      GMTrace.o(20079643197440L, 149605);
      return false;
    }
    GMTrace.o(20079643197440L, 149605);
    return true;
  }
  
  public static a apy()
  {
    try
    {
      GMTrace.i(20079106326528L, 149601);
      if (kdY == null) {
        kdY = new a();
      }
      a locala = kdY;
      GMTrace.o(20079106326528L, 149601);
      return locala;
    }
    finally {}
  }
  
  public static boolean vq(String paramString)
  {
    GMTrace.i(20079374761984L, 149603);
    int i = CdnLogic.pauseHttpMultiSocketDownloadTask(paramString);
    w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra pauseRecvTask mediaid:%s, ret:%d", new Object[] { paramString, Integer.valueOf(i) });
    if (i == 0)
    {
      GMTrace.o(20079374761984L, 149603);
      return true;
    }
    GMTrace.o(20079374761984L, 149603);
    return false;
  }
  
  public final int a(final String paramString, final keep_ProgressInfo paramkeep_ProgressInfo, final keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(20079508979712L, 149604);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "cdn callback mediaid is null");
      GMTrace.o(20079508979712L, 149604);
      return -1;
    }
    if ((paramkeep_ProgressInfo == null) && (paramkeep_SceneResult == null))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "cdn callback info all null");
      GMTrace.o(20079508979712L, 149604);
      return -2;
    }
    if (paramkeep_ProgressInfo != null) {
      w.d("MicroMsg.CdnDownloadNativeService", "CDN progress. total:%d, cur:%d, canshow:%b", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength), Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify) });
    }
    this.gzK = bg.Pv();
    this.gzJ = paramString;
    this.fZz.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20080448503808L, 149611);
        i locali = (i)a.this.gzH.get(paramString);
        if (locali == null)
        {
          w.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", new Object[] { paramString });
          GMTrace.o(20080448503808L, 149611);
          return;
        }
        if (paramkeep_ProgressInfo != null)
        {
          paramkeep_ProgressInfo.mediaId = paramString;
          w.i("MicroMsg.CdnDownloadNativeService", "MTL: total:%d, cur:%d, mtl:%b", new Object[] { Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength), Boolean.valueOf(paramkeep_ProgressInfo.field_mtlnotify) });
        }
        if (paramkeep_SceneResult != null) {
          paramkeep_SceneResult.mediaId = paramString;
        }
        if (locali.gAB != null)
        {
          long l = bg.Pv();
          if ((paramkeep_SceneResult == null) && (paramkeep_ProgressInfo != null) && (!paramkeep_ProgressInfo.field_mtlnotify) && (am.getNetWorkType(ab.getContext()) == -1))
          {
            GMTrace.o(20080448503808L, 149611);
            return;
          }
          locali.field_lastProgressCallbackTime = l;
          locali.gAB.a(paramString, 0, paramkeep_ProgressInfo, paramkeep_SceneResult, locali.field_onlycheckexist);
        }
        if (a.a(paramkeep_ProgressInfo)) {
          a.this.gzI.remove(paramString);
        }
        if (paramkeep_SceneResult != null)
        {
          a.this.gzH.remove(paramString);
          if (paramkeep_SceneResult.field_retCode == -5103011)
          {
            w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn ERR_VALIDATE_AUTHKEY");
            g.ork.a(546L, 4L, 1L, true);
            a.this.kdZ.keep_OnRequestDoGetCdnDnsInfo(999);
          }
        }
        GMTrace.o(20080448503808L, 149611);
      }
      
      public final String toString()
      {
        GMTrace.i(20080582721536L, 149612);
        String str = super.toString() + "|callback";
        GMTrace.o(20080582721536L, 149612);
        return str;
      }
    });
    GMTrace.o(20079508979712L, 149604);
    return 0;
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    GMTrace.i(20079777415168L, 149606);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "cdn callback getauthbuf mediaid is null");
      GMTrace.o(20079777415168L, 149606);
      return;
    }
    i locali = (i)this.gzH.get(paramString);
    if (locali == null)
    {
      w.e("MicroMsg.CdnDownloadNativeService", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
      GMTrace.o(20079777415168L, 149606);
      return;
    }
    if (locali.gAB != null)
    {
      locali.gAB.a(paramString, paramByteArrayOutputStream);
      GMTrace.o(20079777415168L, 149606);
      return;
    }
    w.e("MicroMsg.CdnDownloadNativeService", "getCdnAuthInfo fail, null taskcallback.");
    GMTrace.o(20079777415168L, 149606);
  }
  
  public final void b(final String paramString, final keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(20845221117952L, 155309);
    if (bg.nm(paramString))
    {
      GMTrace.o(20845221117952L, 155309);
      return;
    }
    this.fZz.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20081253810176L, 149617);
        i locali = (i)a.this.gzH.get(paramString);
        if (locali == null)
        {
          w.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", new Object[] { paramString });
          GMTrace.o(20081253810176L, 149617);
          return;
        }
        if (locali.gAO != null) {
          locali.gAO.b(paramString, paramkeep_SceneResult);
        }
        GMTrace.o(20081253810176L, 149617);
      }
    });
    GMTrace.o(20845221117952L, 155309);
  }
  
  public final int d(final i parami)
  {
    GMTrace.i(20079240544256L, 149602);
    if (bg.nm(parami.field_mediaId))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId is null");
      GMTrace.o(20079240544256L, 149602);
      return -1;
    }
    if (parami.field_fileId == null) {
      parami.field_fileId = "";
    }
    if (parami.field_aesKey == null) {
      parami.field_aesKey = "";
    }
    if (this.gzF.contains(parami.field_fileId))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in queueTask");
      GMTrace.o(20079240544256L, 149602);
      return -2;
    }
    if (this.gzG.containsKey(parami.field_fileId))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapWaitTask");
      GMTrace.o(20079240544256L, 149602);
      return -2;
    }
    if (this.gzH.containsKey(parami.field_fileId))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapTaskInJni");
      GMTrace.o(20079240544256L, 149602);
      return -2;
    }
    parami.eYr = false;
    this.fZz.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20080851156992L, 149614);
        if (this.gzN != -1) {
          a.this.gzI.put(parami.field_mediaId, Integer.valueOf(this.gzN));
        }
        a.this.gzF.add(parami.field_mediaId);
        a.this.gzG.put(parami.field_mediaId, parami);
        a locala = a.this;
        w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart queue:%d", new Object[] { Integer.valueOf(locala.gzF.size()) });
        Object localObject;
        i locali;
        int i;
        label253:
        int j;
        for (;;)
        {
          if (!locala.gzF.isEmpty())
          {
            localObject = (String)locala.gzF.poll();
            locali = (i)locala.gzG.remove(localObject);
            if (locali == null)
            {
              w.e("MicroMsg.CdnDownloadNativeService", "summersafecdn task queue is empty , maybe bug here");
              GMTrace.o(20080851156992L, 149614);
              return;
            }
            w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", new Object[] { locali.field_mediaId, Boolean.valueOf(locali.field_autostart), Integer.valueOf(locali.field_chattype) });
            locali.field_startTime = bg.Pv();
            if (locali.eYr)
            {
              if (locali.field_fullpath == null)
              {
                i = -1;
                if (locali.field_thumbpath != null) {
                  break label455;
                }
              }
              label455:
              for (j = -1;; j = locali.field_thumbpath.length())
              {
                w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bg.SJ(locali.field_svr_signature), bg.SJ(locali.field_aesKey), Integer.valueOf(locali.field_fileType), locali.field_mediaId, Boolean.valueOf(locali.field_onlycheckexist) });
                if (locali.field_fullpath == null) {
                  locali.field_fullpath = "";
                }
                if (locali.field_thumbpath == null) {
                  locali.field_thumbpath = "";
                }
                i = b.b(locali);
                if (i == 0) {
                  break label467;
                }
                w.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), locali.field_mediaId });
                if (locali.gAB == null) {
                  break;
                }
                locali.gAB.a(locali.field_mediaId, i, null, null, locali.field_onlycheckexist);
                break;
                i = locali.field_fullpath.length();
                break label253;
              }
              label467:
              w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia ok, field_mediaId[%s]", new Object[] { locali.field_mediaId });
              locala.gzH.put(locali.field_mediaId, locali);
            }
            else
            {
              i = -1;
              if (locali.gAC)
              {
                j = i;
                if (locali.field_fullpath != null)
                {
                  j = i;
                  if (!locali.field_fullpath.isEmpty()) {
                    j = b.a(locali.field_mediaId, locali.gAD, locali.field_fullpath, locali.gAE, locali.gAF, locali.gAG, locali.gAH);
                  }
                }
                if (locali.field_fullpath == null)
                {
                  i = -1;
                  label589:
                  w.i("MicroMsg.CdnDownloadNativeService", "https download tryStart recv file:%d field_mediaId[%s], download_url[%s]", new Object[] { Integer.valueOf(i), locali.field_mediaId, locali.gAD });
                  i = j;
                }
              }
            }
          }
        }
        for (;;)
        {
          if (i != 0)
          {
            w.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), locali.field_mediaId });
            if (locali.gAB == null) {
              break;
            }
            locali.gAB.a(locali.field_mediaId, i, null, null, locali.field_onlycheckexist);
            break;
            i = locali.field_fullpath.length();
            break label589;
            if (locali.gAI)
            {
              j = i;
              if (locali.field_fullpath != null)
              {
                j = i;
                if (!locali.field_fullpath.isEmpty()) {
                  j = b.a(locali.field_mediaId, locali.field_fullpath, locali.gAD, locali.gAJ, locali.gAK, locali.allow_mobile_net_download, locali.gAE, locali.gAF, locali.is_resume_task, locali.gAG);
                }
              }
              if (locali.field_fullpath == null) {}
              for (localObject = "";; localObject = locali.field_fullpath)
              {
                w.i("MicroMsg.CdnDownloadNativeService", "game package download tryStart recv file:%s field_mediaId[%s], download_url[%s] https url[%s]", new Object[] { localObject, locali.field_mediaId, locali.gAD, locali.gAJ });
                i = j;
                break;
              }
            }
            if (locali.field_fullpath == null)
            {
              j = -1;
              label864:
              if (locali.field_thumbpath != null) {
                break label1001;
              }
            }
            label1001:
            for (int k = -1;; k = locali.field_thumbpath.length())
            {
              w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), locali.field_svr_signature, locali.field_aesKey, Integer.valueOf(locali.field_fileType), locali.field_mediaId, Boolean.valueOf(locali.field_onlycheckexist) });
              if (locali.gAM != 2) {
                break label1088;
              }
              if (!(locali instanceof j)) {
                break label1150;
              }
              localObject = (j)locali;
              if (!((j)localObject).Go()) {
                break label1013;
              }
              i = b.a(locali, 2);
              break;
              j = locali.field_fullpath.length();
              break label864;
            }
            label1013:
            if (((j)localObject).Gn()) {
              i = b.a(((j)localObject).field_mediaId, ((j)localObject).url, ((j)localObject).referer, ((j)localObject).field_fullpath, ((j)localObject).gAS, ((j)localObject).iplist, ((j)localObject).initialDownloadOffset, ((j)localObject).initialDownloadLength, ((j)localObject).isColdSnsData, ((j)localObject).signalQuality, ((j)localObject).snsScene, ((j)localObject).field_preloadRatio);
            }
            continue;
            label1088:
            i = CdnLogic.startC2CDownload(b.a(locali));
            continue;
          }
          w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s]", new Object[] { locali.field_mediaId });
          locala.gzH.put(locali.field_mediaId, locali);
          break;
          GMTrace.o(20080851156992L, 149614);
          return;
          label1150:
          i = -1;
        }
      }
      
      public final String toString()
      {
        GMTrace.i(20080985374720L, 149615);
        String str = super.toString() + "|addRecvTask";
        GMTrace.o(20080985374720L, 149615);
        return str;
      }
    });
    GMTrace.o(20079240544256L, 149602);
    return 0;
  }
  
  public final byte[] h(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(20079911632896L, 149607);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.CdnDownloadNativeService", "cdn callback decodePrepareResponse mediaid is null");
      GMTrace.o(20079911632896L, 149607);
      return null;
    }
    i locali = (i)this.gzH.get(paramString);
    if (locali == null)
    {
      w.e("MicroMsg.CdnDownloadNativeService", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
      GMTrace.o(20079911632896L, 149607);
      return null;
    }
    if (locali.gAB != null)
    {
      paramString = locali.gAB.h(paramString, paramArrayOfByte);
      GMTrace.o(20079911632896L, 149607);
      return paramString;
    }
    w.e("MicroMsg.CdnDownloadNativeService", "decodePrepareResponse fail, null taskcallback.");
    GMTrace.o(20079911632896L, 149607);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */