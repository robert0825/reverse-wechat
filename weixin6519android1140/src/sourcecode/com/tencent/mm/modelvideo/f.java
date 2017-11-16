package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.i.b;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.r.a.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.m;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public final class f
{
  long eDr;
  public String eEM;
  private i.b gAO;
  public String gAQ;
  private i.a gIz;
  private com.tencent.mm.modelcdntran.j haF;
  public boolean haQ;
  public String haR;
  private long haS;
  public long haT;
  public long haU;
  public int haV;
  private String haW;
  public a haX;
  private String mediaId;
  
  public f(long paramLong)
  {
    GMTrace.i(17455820832768L, 130056);
    this.haQ = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17455418179584L, 130053);
        if (paramAnonymousInt != 0)
        {
          w.w("MicroMsg.NetScenePreloadVideoFake", "%d preload video error startRet[%d]", new Object[] { Integer.valueOf(f.this.hashCode()), Integer.valueOf(paramAnonymousInt) });
          if (f.this.haX != null) {
            f.this.haX.a(f.this, false, 0, 0);
          }
        }
        if (paramAnonymouskeep_ProgressInfo != null) {
          w.d("MicroMsg.NetScenePreloadVideoFake", "%d preload video[%d %d] mediaId[%s]", new Object[] { Integer.valueOf(f.this.hashCode()), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength), paramAnonymousString });
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video error [%d]", new Object[] { Integer.valueOf(f.this.hashCode()), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label211;
          }
          if (f.this.haX != null) {
            f.this.haX.a(f.this, false, 0, 0);
          }
        }
        for (;;)
        {
          GMTrace.o(17455418179584L, 130053);
          return 0;
          label211:
          w.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video download all video file", new Object[] { Integer.valueOf(f.this.hashCode()) });
          f.this.f(f.this.haR, paramAnonymouskeep_SceneResult.field_fileLength, f.this.gAQ);
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(17455552397312L, 130054);
        GMTrace.o(17455552397312L, 130054);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(17455686615040L, 130055);
        GMTrace.o(17455686615040L, 130055);
        return new byte[0];
      }
    };
    this.gAO = new i.b()
    {
      public final void b(String paramAnonymousString, keep_SceneResult paramAnonymouskeep_SceneResult)
      {
        GMTrace.i(20976217620480L, 156285);
        if (paramAnonymouskeep_SceneResult == null)
        {
          w.w("MicroMsg.NetScenePreloadVideoFake", "%s onPreload completed but sceneResult is null", new Object[] { Integer.valueOf(f.this.hashCode()) });
          if (f.this.haX != null) {
            f.this.haX.a(f.this, false, 0, 0);
          }
          GMTrace.o(20976217620480L, 156285);
          return;
        }
        int i = paramAnonymouskeep_SceneResult.field_recvedBytes;
        int j = paramAnonymouskeep_SceneResult.field_fileLength;
        w.i("MicroMsg.NetScenePreloadVideoFake", "%d onPreload Completed [%s] videoInfoName[%s] [%d, %d] videoFormat[%d]", new Object[] { Integer.valueOf(f.this.hashCode()), paramAnonymousString, f.this.haR, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramAnonymouskeep_SceneResult.field_videoFormat) });
        if ((i > 0) && (j > 0)) {
          f.this.haU = f.c(f.this.haR, i, true);
        }
        boolean bool;
        if (f.this.haX != null)
        {
          paramAnonymousString = f.this.haX;
          f localf = f.this;
          if ((i > 0) && (j > 0))
          {
            bool = true;
            paramAnonymousString.a(localf, bool, i, j);
          }
        }
        else
        {
          f.this.haT = bg.Pu();
          f.this.Na();
          if (!f.this.haQ) {
            break label345;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 142L, 1L, false);
          if (f.this.haV != 1) {
            break label328;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 123L, 1L, false);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(354L, paramAnonymouskeep_SceneResult.field_videoFormat + 240, 1L, false);
          GMTrace.o(20976217620480L, 156285);
          return;
          bool = false;
          break;
          label328:
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 124L, 1L, false);
        }
        label345:
        com.tencent.mm.plugin.report.service.g.ork.a(354L, 143L, 1L, false);
        GMTrace.o(20976217620480L, 156285);
      }
    };
    this.eDr = paramLong;
    this.haQ = true;
    GMTrace.o(17455820832768L, 130056);
  }
  
  public f(com.tencent.mm.modelcdntran.j paramj, String paramString)
  {
    GMTrace.i(17455955050496L, 130057);
    this.haQ = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17455418179584L, 130053);
        if (paramAnonymousInt != 0)
        {
          w.w("MicroMsg.NetScenePreloadVideoFake", "%d preload video error startRet[%d]", new Object[] { Integer.valueOf(f.this.hashCode()), Integer.valueOf(paramAnonymousInt) });
          if (f.this.haX != null) {
            f.this.haX.a(f.this, false, 0, 0);
          }
        }
        if (paramAnonymouskeep_ProgressInfo != null) {
          w.d("MicroMsg.NetScenePreloadVideoFake", "%d preload video[%d %d] mediaId[%s]", new Object[] { Integer.valueOf(f.this.hashCode()), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength), paramAnonymousString });
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video error [%d]", new Object[] { Integer.valueOf(f.this.hashCode()), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label211;
          }
          if (f.this.haX != null) {
            f.this.haX.a(f.this, false, 0, 0);
          }
        }
        for (;;)
        {
          GMTrace.o(17455418179584L, 130053);
          return 0;
          label211:
          w.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video download all video file", new Object[] { Integer.valueOf(f.this.hashCode()) });
          f.this.f(f.this.haR, paramAnonymouskeep_SceneResult.field_fileLength, f.this.gAQ);
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(17455552397312L, 130054);
        GMTrace.o(17455552397312L, 130054);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(17455686615040L, 130055);
        GMTrace.o(17455686615040L, 130055);
        return new byte[0];
      }
    };
    this.gAO = new i.b()
    {
      public final void b(String paramAnonymousString, keep_SceneResult paramAnonymouskeep_SceneResult)
      {
        GMTrace.i(20976217620480L, 156285);
        if (paramAnonymouskeep_SceneResult == null)
        {
          w.w("MicroMsg.NetScenePreloadVideoFake", "%s onPreload completed but sceneResult is null", new Object[] { Integer.valueOf(f.this.hashCode()) });
          if (f.this.haX != null) {
            f.this.haX.a(f.this, false, 0, 0);
          }
          GMTrace.o(20976217620480L, 156285);
          return;
        }
        int i = paramAnonymouskeep_SceneResult.field_recvedBytes;
        int j = paramAnonymouskeep_SceneResult.field_fileLength;
        w.i("MicroMsg.NetScenePreloadVideoFake", "%d onPreload Completed [%s] videoInfoName[%s] [%d, %d] videoFormat[%d]", new Object[] { Integer.valueOf(f.this.hashCode()), paramAnonymousString, f.this.haR, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramAnonymouskeep_SceneResult.field_videoFormat) });
        if ((i > 0) && (j > 0)) {
          f.this.haU = f.c(f.this.haR, i, true);
        }
        boolean bool;
        if (f.this.haX != null)
        {
          paramAnonymousString = f.this.haX;
          f localf = f.this;
          if ((i > 0) && (j > 0))
          {
            bool = true;
            paramAnonymousString.a(localf, bool, i, j);
          }
        }
        else
        {
          f.this.haT = bg.Pu();
          f.this.Na();
          if (!f.this.haQ) {
            break label345;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 142L, 1L, false);
          if (f.this.haV != 1) {
            break label328;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 123L, 1L, false);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(354L, paramAnonymouskeep_SceneResult.field_videoFormat + 240, 1L, false);
          GMTrace.o(20976217620480L, 156285);
          return;
          bool = false;
          break;
          label328:
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 124L, 1L, false);
        }
        label345:
        com.tencent.mm.plugin.report.service.g.ork.a(354L, 143L, 1L, false);
        GMTrace.o(20976217620480L, 156285);
      }
    };
    this.haF = paramj;
    this.eEM = paramString;
    this.haQ = false;
    GMTrace.o(17455955050496L, 130057);
  }
  
  public static int c(String paramString, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(18681228689408L, 139186);
    r localr = t.mw(paramString);
    int j;
    if (localr != null)
    {
      j = localr.eMO;
      if (paramBoolean)
      {
        localr.eMO = paramInt;
        w.i("MicroMsg.NetScenePreloadVideoFake", "update video info[%s] preload[%d %d %d] isFinish[%b] ", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(localr.eMO), Boolean.valueOf(paramBoolean) });
        localr.hct = bg.Pu();
        localr.eQl = 1025;
        t.e(localr);
        if (!paramBoolean) {
          break label145;
        }
        paramInt -= j;
        label117:
        if (paramInt >= 0) {
          break label158;
        }
        paramInt = i;
      }
    }
    label145:
    label158:
    for (;;)
    {
      GMTrace.o(18681228689408L, 139186);
      return paramInt;
      localr.eMO = (j + paramInt);
      break;
      break label117;
      GMTrace.o(18681228689408L, 139186);
      return paramInt;
    }
  }
  
  public final String MZ()
  {
    GMTrace.i(17456089268224L, 130058);
    if (this.haQ)
    {
      str = this.eDr;
      GMTrace.o(17456089268224L, 130058);
      return str;
    }
    String str = this.eEM;
    GMTrace.o(17456089268224L, 130058);
    return str;
  }
  
  public final void Na()
  {
    GMTrace.i(18681497124864L, 139188);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.haS).append(",");
    ((StringBuffer)localObject).append(this.haT).append(",");
    ((StringBuffer)localObject).append(this.haU).append(",");
    ((StringBuffer)localObject).append(this.haW).append(",");
    ((StringBuffer)localObject).append(this.haV).append(",");
    try
    {
      long l = this.haU / 1024L / (this.haT - this.haS);
      i = (int)l;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = 0;
      }
    }
    ((StringBuffer)localObject).append(i).append(",");
    ((StringBuffer)localObject).append(0);
    localObject = ((StringBuffer)localObject).toString();
    w.d("MicroMsg.NetScenePreloadVideoFake", "%d rpt content[%s]", new Object[] { Integer.valueOf(hashCode()), localObject });
    com.tencent.mm.plugin.report.service.g.ork.A(14499, (String)localObject);
    GMTrace.o(18681497124864L, 139188);
  }
  
  public final int a(a parama)
  {
    GMTrace.i(17456357703680L, 130060);
    this.haX = parama;
    for (;;)
    {
      try
      {
        w.i("MicroMsg.NetScenePreloadVideoFake", "%d preload begin msgId[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.eDr) });
        Object localObject;
        String str1;
        int j;
        if (this.haQ)
        {
          parama = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(this.eDr);
          localObject = bc.gT(parama.fwv);
          if ((localObject == null) || (((bc.b)localObject).god <= 0))
          {
            w.w("MicroMsg.NetScenePreloadVideoFake", "%d msgsource is null", new Object[] { Integer.valueOf(hashCode()) });
            parama = null;
            if (parama == null) {
              break label982;
            }
            if (!com.tencent.mm.y.s.eb(parama.gAT)) {
              break label995;
            }
            i = 2;
            this.haV = i;
            com.tencent.mm.plugin.report.service.g.ork.a(354L, 140L, 1L, false);
            if (this.haV == 1)
            {
              com.tencent.mm.plugin.report.service.g.ork.a(354L, 121L, 1L, false);
              if (parama != null) {
                continue;
              }
              w.w("MicroMsg.NetScenePreloadVideoFake", "%d preload task is null", new Object[] { Integer.valueOf(hashCode()) });
              i = 0;
              if (i == 0) {
                continue;
              }
              GMTrace.o(17456357703680L, 130060);
              return 0;
            }
          }
          else
          {
            str1 = parama.field_imgPath;
            r localr = t.mw(str1);
            if (localr == null)
            {
              parama = null;
              continue;
            }
            parama = bh.q(localr.Nt(), "msg");
            if (parama == null)
            {
              w.w("MicroMsg.NetScenePreloadVideoFake", "cdntra parse video recv xml failed");
              parama = null;
              continue;
            }
            String str2 = (String)parama.get(".msg.videomsg.$cdnvideourl");
            if (bg.nm(str2))
            {
              w.w("MicroMsg.NetScenePreloadVideoFake", "cdntra parse video recv xml failed");
              parama = null;
              continue;
            }
            j = Integer.valueOf((String)parama.get(".msg.videomsg.$length")).intValue();
            String str3 = (String)parama.get(".msg.videomsg.$md5");
            String str4 = (String)parama.get(".msg.videomsg.$newmd5");
            String str5 = (String)parama.get(".msg.videomsg.$aeskey");
            String str6 = (String)parama.get(".msg.videomsg.$fileparam");
            String str7 = com.tencent.mm.modelcdntran.d.a("downvideo", localr.hcs, localr.Nq(), localr.getFileName());
            if (bg.nm(str7))
            {
              w.w("MicroMsg.NetScenePreloadVideoFake", "cdntra genClientId failed not use cdn file:%s", new Object[] { localr.getFileName() });
              parama = null;
              continue;
            }
            o.Nh();
            String str8 = s.mk(str1);
            parama = new com.tencent.mm.modelcdntran.j();
            parama.filename = str1;
            parama.gAQ = str3;
            parama.gAR = j;
            parama.gAS = 2;
            parama.eMI = localr.Nr();
            parama.gAT = localr.Nq();
            if (!com.tencent.mm.y.s.eb(localr.Nq())) {
              break label985;
            }
            i = m.fk(localr.Nq());
            parama.eMK = i;
            parama.field_mediaId = str7;
            parama.field_fullpath = str8;
            parama.field_fileType = b.MediaType_VIDEO;
            parama.field_totalLen = j;
            parama.field_aesKey = str5;
            parama.field_fileId = str2;
            parama.field_priority = b.gzd;
            parama.field_wxmsgparam = str6;
            if (!com.tencent.mm.y.s.eb(localr.Nq())) {
              break label990;
            }
            i = 1;
            parama.field_chattype = i;
            parama.field_autostart = false;
            parama.field_requestVideoFormat = com.tencent.mm.modelcontrol.d.a(2, localr);
            parama.field_preloadRatio = ((bc.b)localObject).god;
            parama.ern = str4;
            continue;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 122L, 1L, false);
          continue;
        }
        else
        {
          this.haV = 3;
          parama = this.haF;
          com.tencent.mm.plugin.report.service.g.ork.a(354L, 141L, 1L, false);
          continue;
        }
        if (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vvc, Integer.valueOf(-1))).intValue() == 2)
        {
          w.i("MicroMsg.NetScenePreloadVideoFake", "command set do not check media duplication.");
          break label1000;
          if (i != 0)
          {
            w.i("MicroMsg.NetScenePreloadVideoFake", "%d it already had video file", new Object[] { Integer.valueOf(hashCode()) });
            i = 0;
          }
        }
        else
        {
          if (parama.Gp()) {
            break label1000;
          }
          localObject = parama.gAQ;
          i = parama.gAR;
          str1 = ((a)com.tencent.mm.kernel.h.h(a.class)).yR().cN((String)localObject, i);
          j = i - com.tencent.mm.a.e.aY(str1);
          if ((bg.nm(str1)) || (j < 0) || (j > 16)) {
            break label1000;
          }
          w.i("MicroMsg.NetScenePreloadVideoFake", "it had download this video[%d, %s, %s].", new Object[] { Integer.valueOf(i), localObject, str1 });
          com.tencent.mm.sdk.platformtools.j.eR(str1, parama.field_fullpath);
          f(parama.filename, i, (String)localObject);
          i = 1;
          continue;
        }
        parama.gAO = this.gAO;
        parama.gAB = this.gIz;
        parama.gAM = 2;
        this.gAQ = parama.gAQ;
        this.mediaId = parama.field_mediaId;
        this.haR = parama.filename;
        this.haS = bg.Pu();
        this.haW = parama.ern;
        w.i("MicroMsg.NetScenePreloadVideoFake", "%d send to cdn service task[%s]", new Object[] { Integer.valueOf(hashCode()), parama });
        com.tencent.mm.modelcdntran.g.Gk().b(parama, -1);
        i = 1;
        continue;
        continue;
      }
      catch (Exception parama)
      {
        w.printErrStackTrace("MicroMsg.NetScenePreloadVideoFake", parama, "", new Object[0]);
        this.haX = null;
        GMTrace.o(17456357703680L, 130060);
        return -1;
      }
      label982:
      label985:
      int i = 0;
      continue;
      label990:
      i = 0;
      continue;
      label995:
      i = 1;
      continue;
      label1000:
      i = 0;
    }
  }
  
  public final void f(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(18681362907136L, 139187);
    w.i("MicroMsg.NetScenePreloadVideoFake", "%d update finish video [%s] [%d] [%s]", new Object[] { Integer.valueOf(hashCode()), paramString1, Integer.valueOf(paramInt), paramString2 });
    if (t.mw(paramString1) != null)
    {
      t.N(paramString1, paramInt);
      if (!bg.nm(paramString2))
      {
        o.Nh();
        paramString1 = s.mk(paramString1);
        if ((bg.nm(paramString2)) || (paramInt <= 0) || (bg.nm(paramString1)) || (!com.tencent.mm.a.e.aZ(paramString1)))
        {
          w.w("MicroMsg.NetScenePreloadVideoFake", "insert media duplication but args is error.[%d, %s, %s]", new Object[] { Integer.valueOf(paramInt), paramString2, paramString1 });
          GMTrace.o(18681362907136L, 139187);
          return;
        }
        ((a)com.tencent.mm.kernel.h.h(a.class)).yR().u(paramString2, paramInt, paramString1);
      }
    }
    GMTrace.o(18681362907136L, 139187);
  }
  
  public final void stop()
  {
    GMTrace.i(17456223485952L, 130059);
    w.i("MicroMsg.NetScenePreloadVideoFake", "%d stop preload video[%s]", new Object[] { Integer.valueOf(hashCode()), this.mediaId });
    PInt localPInt = new PInt();
    if (!bg.nm(this.mediaId))
    {
      com.tencent.mm.modelcdntran.c localc = com.tencent.mm.modelcdntran.g.Gk();
      String str = this.mediaId;
      int i = 0;
      i locali = (i)localc.gzH.remove(str);
      if (locali != null)
      {
        keep_SceneResult localkeep_SceneResult = new keep_SceneResult();
        com.tencent.mm.modelcdntran.g.Gl();
        i = b.a(str, localkeep_SceneResult);
        localPInt.value = localkeep_SceneResult.field_recvedBytes;
        com.tencent.mm.plugin.report.service.g.ork.i(10769, new Object[] { Integer.valueOf(com.tencent.mm.modelcdntran.d.gAb), Integer.valueOf(locali.field_fileType), Long.valueOf(bg.Pv() - locali.field_startTime) });
      }
      localc.gzG.remove(str);
      localc.gzI.remove(str);
      w.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { str, locali, Integer.valueOf(i) });
      this.haT = bg.Pu();
      this.haU = c(this.haR, localPInt.value, false);
      Na();
    }
    this.haX = null;
    GMTrace.o(17456223485952L, 130059);
  }
  
  public static abstract interface a
  {
    public abstract void a(f paramf, boolean paramBoolean, int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */