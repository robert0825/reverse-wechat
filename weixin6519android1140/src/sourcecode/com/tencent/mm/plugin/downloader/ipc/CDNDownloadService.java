package com.tencent.mm.plugin.downloader.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnTaskStateInfo;
import com.tencent.mm.ipcinvoker.wx_extension.b.b.a;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.downloader.a.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CDNDownloadService
  extends Service
  implements com.tencent.mm.ipcinvoker.wx_extension.b.a
{
  private com.tencent.mm.plugin.downloader.a.b kej;
  private final a.a keq;
  private i.a ker;
  
  public CDNDownloadService()
  {
    GMTrace.i(20084340817920L, 149640);
    this.keq = new a.a()
    {
      public final int a(CDNTaskInfo paramAnonymousCDNTaskInfo)
      {
        GMTrace.i(20085817212928L, 149651);
        w.i("MicroMsg.CDNDownloadService", "addDownloadTask: %s filepath:%s", new Object[] { paramAnonymousCDNTaskInfo.downloadUrl, paramAnonymousCDNTaskInfo.filePath });
        i locali = new i();
        locali.gAI = paramAnonymousCDNTaskInfo.gAI;
        locali.field_mediaId = paramAnonymousCDNTaskInfo.mediaId;
        locali.field_fullpath = paramAnonymousCDNTaskInfo.filePath;
        locali.gAD = paramAnonymousCDNTaskInfo.downloadUrl;
        locali.gAJ = paramAnonymousCDNTaskInfo.ket;
        locali.gAB = CDNDownloadService.a(CDNDownloadService.this);
        locali.gAE = paramAnonymousCDNTaskInfo.kev;
        locali.gAF = paramAnonymousCDNTaskInfo.kew;
        locali.allow_mobile_net_download = paramAnonymousCDNTaskInfo.kex;
        CDNDownloadService.a(locali, paramAnonymousCDNTaskInfo.keu);
        int i = com.tencent.mm.plugin.downloader.c.a.apy().d(locali);
        w.i("MicroMsg.CDNDownloadService", "addDownloadTask: " + i);
        GMTrace.o(20085817212928L, 149651);
        return i;
      }
      
      public final void a(com.tencent.mm.plugin.downloader.a.b paramAnonymousb)
      {
        GMTrace.i(20086488301568L, 149656);
        w.i("MicroMsg.CDNDownloadService", "registerCallback");
        CDNDownloadService.a(CDNDownloadService.this, paramAnonymousb);
        GMTrace.o(20086488301568L, 149656);
      }
      
      public final void apv()
      {
        GMTrace.i(20086890954752L, 149659);
        if (!b.a.fWb.c(CDNDownloadService.this))
        {
          w.i("MicroMsg.CDNDownloadService", "addIPCTaskMarker");
          b.a.fWb.a(CDNDownloadService.this);
        }
        GMTrace.o(20086890954752L, 149659);
      }
      
      public final void apw()
      {
        GMTrace.i(20087025172480L, 149660);
        w.i("MicroMsg.CDNDownloadService", "removeIPCTaskMarker");
        b.a.fWb.b(CDNDownloadService.this);
        GMTrace.o(20087025172480L, 149660);
      }
      
      public final void apx()
      {
        GMTrace.i(20375861723136L, 151812);
        GMTrace.o(20375861723136L, 151812);
      }
      
      public final int b(CDNTaskInfo paramAnonymousCDNTaskInfo)
      {
        GMTrace.i(20085951430656L, 149652);
        w.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: %s", new Object[] { paramAnonymousCDNTaskInfo.downloadUrl });
        i locali = new i();
        locali.gAI = paramAnonymousCDNTaskInfo.gAI;
        locali.field_mediaId = paramAnonymousCDNTaskInfo.mediaId;
        locali.field_fullpath = paramAnonymousCDNTaskInfo.filePath;
        locali.gAD = paramAnonymousCDNTaskInfo.downloadUrl;
        locali.gAJ = paramAnonymousCDNTaskInfo.ket;
        locali.gAB = CDNDownloadService.a(CDNDownloadService.this);
        locali.gAE = paramAnonymousCDNTaskInfo.kev;
        locali.gAF = paramAnonymousCDNTaskInfo.kew;
        locali.allow_mobile_net_download = paramAnonymousCDNTaskInfo.kex;
        CDNDownloadService.a(locali, paramAnonymousCDNTaskInfo.keu);
        paramAnonymousCDNTaskInfo = com.tencent.mm.plugin.downloader.c.a.apy();
        int i;
        if (paramAnonymousCDNTaskInfo.gzH.containsKey(locali.field_mediaId))
        {
          i = CdnLogic.resumeHttpMultiSocketDownloadTask(locali.field_mediaId);
          w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task resume mediaid:%s, ret:%d", new Object[] { locali.field_mediaId, Integer.valueOf(i) });
        }
        for (;;)
        {
          w.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: " + i);
          GMTrace.o(20085951430656L, 149652);
          return i;
          w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task add new mediaid:%s", new Object[] { locali.field_mediaId });
          i = paramAnonymousCDNTaskInfo.d(locali);
        }
      }
      
      public final void b(com.tencent.mm.plugin.downloader.a.b paramAnonymousb)
      {
        GMTrace.i(20086622519296L, 149657);
        CDNDownloadService.a(CDNDownloadService.this, null);
        GMTrace.o(20086622519296L, 149657);
      }
      
      public final void ms(int paramAnonymousInt)
      {
        GMTrace.i(20086756737024L, 149658);
        w.i("MicroMsg.CDNDownloadService", "notifyNetworkChange: " + paramAnonymousInt);
        BaseEvent.onNetworkChange();
        GMTrace.o(20086756737024L, 149658);
      }
      
      public final boolean vn(String paramAnonymousString)
      {
        GMTrace.i(20086085648384L, 149653);
        com.tencent.mm.plugin.downloader.c.a.apy();
        boolean bool = com.tencent.mm.plugin.downloader.c.a.vq(paramAnonymousString);
        w.i("MicroMsg.CDNDownloadService", "pauseDownloadTask: " + bool);
        GMTrace.o(20086085648384L, 149653);
        return bool;
      }
      
      public final boolean vo(String paramAnonymousString)
      {
        GMTrace.i(20086219866112L, 149654);
        com.tencent.mm.plugin.downloader.c.a locala = com.tencent.mm.plugin.downloader.c.a.apy();
        i locali = (i)locala.gzH.remove(paramAnonymousString);
        if (locali != null)
        {
          if (!locali.gAC) {
            break label165;
          }
          com.tencent.mm.modelcdntran.b.jw(paramAnonymousString);
        }
        for (;;)
        {
          g.ork.i(10769, new Object[] { Integer.valueOf(d.gAb), Integer.valueOf(locali.field_fileType), Long.valueOf(bg.Pv() - locali.field_startTime) });
          locala.gzG.remove(paramAnonymousString);
          locala.gzI.remove(paramAnonymousString);
          w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramAnonymousString, locali, Integer.valueOf(0) });
          w.i("MicroMsg.CDNDownloadService", "removeDownloadTask: true");
          GMTrace.o(20086219866112L, 149654);
          return true;
          label165:
          if (locali.gAI) {
            com.tencent.mm.modelcdntran.b.jx(paramAnonymousString);
          } else {
            com.tencent.mm.modelcdntran.b.js(paramAnonymousString);
          }
        }
      }
      
      public final CDNTaskState vp(String paramAnonymousString)
      {
        GMTrace.i(20086354083840L, 149655);
        paramAnonymousString = CdnLogic.httpMultiSocketDownloadTaskState(paramAnonymousString);
        if (paramAnonymousString != null)
        {
          CDNTaskState localCDNTaskState = new CDNTaskState();
          localCDNTaskState.taskState = paramAnonymousString.taskState;
          localCDNTaskState.fileTotalSize = paramAnonymousString.fileTotalSize;
          localCDNTaskState.completeSize = paramAnonymousString.completeSize;
          GMTrace.o(20086354083840L, 149655);
          return localCDNTaskState;
        }
        GMTrace.o(20086354083840L, 149655);
        return null;
      }
    };
    this.ker = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(20081924898816L, 149622);
        String str1;
        if (paramAnonymouskeep_ProgressInfo == null)
        {
          str1 = "null";
          if (paramAnonymouskeep_SceneResult != null) {
            break label98;
          }
        }
        label98:
        for (String str2 = "null";; str2 = paramAnonymouskeep_SceneResult.toString())
        {
          w.d("MicroMsg.CDNDownloadService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), str1, str2 });
          if (paramAnonymousInt != 44530) {
            break label108;
          }
          w.i("MicroMsg.CDNDownloadService", "duplicate request, ignore this request, media id is %s", new Object[] { paramAnonymousString });
          GMTrace.o(20081924898816L, 149622);
          return 0;
          str1 = paramAnonymouskeep_ProgressInfo.toString();
          break;
        }
        label108:
        if (paramAnonymousInt != 0)
        {
          w.e("MicroMsg.CDNDownloadService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          CDNDownloadService.a(CDNDownloadService.this, paramAnonymousString, 4, paramAnonymousInt);
          GMTrace.o(20081924898816L, 149622);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          CDNDownloadService.a(CDNDownloadService.this, paramAnonymousString, paramAnonymouskeep_ProgressInfo.field_finishedLength, paramAnonymouskeep_ProgressInfo.field_toltalLength);
          GMTrace.o(20081924898816L, 149622);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label254;
          }
          w.e("MicroMsg.CDNDownloadService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
          CDNDownloadService.a(CDNDownloadService.this, paramAnonymousString, 4, paramAnonymouskeep_SceneResult.field_retCode);
        }
        for (;;)
        {
          GMTrace.o(20081924898816L, 149622);
          return 0;
          label254:
          w.i("MicroMsg.CDNDownloadService", "cdn trans suceess, media id : %s", new Object[] { paramAnonymousString });
          CDNDownloadService.a(CDNDownloadService.this, paramAnonymousString, 3, 0);
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(20082059116544L, 149623);
        GMTrace.o(20082059116544L, 149623);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(20082193334272L, 149624);
        GMTrace.o(20082193334272L, 149624);
        return new byte[0];
      }
    };
    GMTrace.o(20084340817920L, 149640);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(20084475035648L, 149641);
    w.i("MicroMsg.CDNDownloadService", "onBind");
    paramIntent = this.keq;
    GMTrace.o(20084475035648L, 149641);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(20084743471104L, 149643);
    super.onCreate();
    w.i("MicroMsg.CDNDownloadService", "onCreate");
    GMTrace.o(20084743471104L, 149643);
  }
  
  public void onDestroy()
  {
    GMTrace.i(20084877688832L, 149644);
    super.onDestroy();
    w.i("MicroMsg.CDNDownloadService", "onDestroy");
    b.a.fWb.b(this);
    Object localObject1 = com.tencent.mm.plugin.downloader.c.a.apy();
    Object localObject2 = ((com.tencent.mm.plugin.downloader.c.a)localObject1).gzG.entrySet().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      String str = (String)((Map.Entry)localObject3).getKey();
      if (((i)((Map.Entry)localObject3).getValue()).gAI)
      {
        ((com.tencent.mm.plugin.downloader.c.a)localObject1).gzG.remove(str);
        ((com.tencent.mm.plugin.downloader.c.a)localObject1).gzI.remove(str);
        w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra mapWaitTask cancelAllGamePacketDownloadTask mediaid:%s", new Object[] { str });
        ((Iterator)localObject2).remove();
      }
    }
    localObject1 = ((com.tencent.mm.plugin.downloader.c.a)localObject1).gzH.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      if (((i)((Map.Entry)localObject2).getValue()).gAI)
      {
        com.tencent.mm.modelcdntran.b.jx((String)localObject3);
        w.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra mapTaskInJni cancelAllGamePacketDownloadTask mediaid:%s  ret:%d", new Object[] { localObject3, Integer.valueOf(0) });
        ((Iterator)localObject1).remove();
      }
    }
    g.ork.a(710L, 1L, 1L, false);
    GMTrace.o(20084877688832L, 149644);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    GMTrace.i(20084609253376L, 149642);
    w.i("MicroMsg.CDNDownloadService", "onUnbind");
    boolean bool = super.onUnbind(paramIntent);
    GMTrace.o(20084609253376L, 149642);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\ipc\CDNDownloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */