package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.protocal.c.qd;
import com.tencent.mm.protocal.c.qe;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class ab
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public long eDr;
  public au eRz;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public f gIl;
  public String gIp;
  private i.a gIz;
  private long iZG;
  public String mediaId;
  int retCode;
  public long startTime;
  public b toi;
  long tol;
  private int tom;
  public String ton;
  public boolean too;
  private boolean toq;
  private boolean tor;
  private int type;
  
  public ab(long paramLong1, long paramLong2, f paramf)
  {
    GMTrace.i(17442801713152L, 129959);
    this.toi = null;
    this.tol = -1L;
    this.mediaId = "";
    this.eDr = 0L;
    this.eRz = null;
    this.gIp = "";
    this.startTime = 0L;
    this.tom = -1;
    this.ton = "";
    this.type = 0;
    this.retCode = 0;
    this.too = false;
    this.toq = false;
    this.iZG = 0L;
    this.tor = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(795642691584L, 5928);
        if (paramAnonymouskeep_ProgressInfo == null) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback mediaId[%s], startRet[%d], progressInfo[%s], sceneResult[%s], finish[%b]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult, Boolean.valueOf(paramAnonymousBoolean) });
          if (paramAnonymousInt != 44530) {
            break;
          }
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { ab.this.gIp });
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          l.et(ab.this.toi.vmr);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0), "" });
          ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        ab.this.toi = an.afP().eq(ab.this.eDr);
        if (ab.this.toi == null)
        {
          w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig attachInfo is null");
          ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (ab.this.toi.field_status == 102L)
        {
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig dancy attach download has paused, status:%d", new Object[] { Long.valueOf(ab.this.toi.field_status) });
          com.tencent.mm.modelcdntran.g.Gk().jy(ab.this.gIp);
          ab.this.fUd.a(3, paramAnonymousInt, "attach  has paused, status=" + ab.this.toi.field_status, ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (paramAnonymouskeep_ProgressInfo.field_finishedLength == ab.this.toi.field_totalLen)
          {
            w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra ignore progress 100%");
            GMTrace.o(795642691584L, 5928);
            return 0;
          }
          if (ab.this.toi.field_offset > paramAnonymouskeep_ProgressInfo.field_finishedLength)
          {
            w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdnEndProc error oldpos:%d newpos:%d", new Object[] { Long.valueOf(ab.this.toi.field_offset), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
            l.et(ab.this.toi.vmr);
            ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
            GMTrace.o(795642691584L, 5928);
            return 0;
          }
          ab.this.toi.field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
          an.afP().c(ab.this.toi, new String[0]);
          if (ab.this.gIl != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(792824119296L, 5907);
                ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
                GMTrace.o(792824119296L, 5907);
              }
            });
          }
          w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra progresscallback id:%s finish:%d total:%d", new Object[] { ab.this.gIp, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength) });
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1076;
          }
          l.et(ab.this.toi.vmr);
          w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra sceneResult.retCode :%d", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          ab.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", ab.this);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(ab.this.toi.field_totalLen), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          if (paramAnonymouskeep_SceneResult.field_retCode != 0) {
            com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(ab.this.toi.field_totalLen), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          }
          if (ab.this.gIl != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(810809294848L, 6041);
                ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
                GMTrace.o(810809294848L, 6041);
              }
            });
          }
        }
        GMTrace.o(795642691584L, 5928);
        return 0;
        label1076:
        new File(ab.this.ton).renameTo(new File(ab.this.toi.field_fileFullPath));
        ab.this.toi.field_status = 199L;
        ab.this.toi.field_offset = ab.this.toi.field_totalLen;
        an.afP().c(ab.this.toi, new String[0]);
        com.tencent.mm.plugin.report.service.g.ork.a(198L, 45L, ab.this.toi.field_totalLen, false);
        com.tencent.mm.plugin.report.service.g.ork.a(198L, 46L, 1L, false);
        paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
        label1216:
        long l;
        if (ab.this.eRz == null)
        {
          paramAnonymousString = "";
          if (!s.eb(paramAnonymousString)) {
            break label1329;
          }
          l = 48L;
          label1228:
          paramAnonymouskeep_ProgressInfo.a(198L, l, 1L, false);
          at.AR();
          paramAnonymousString = com.tencent.mm.y.c.yM().cM(ab.this.toi.field_msgInfoId);
          if (paramAnonymousString.field_status != 5) {
            break label1337;
          }
          paramAnonymousString.dB(3);
          at.AR();
          com.tencent.mm.y.c.yM().a(paramAnonymousString.field_msgId, paramAnonymousString);
        }
        for (;;)
        {
          ab.this.fUd.a(0, 0, "", ab.this);
          break;
          paramAnonymousString = ab.this.eRz.field_talker;
          break label1216;
          label1329:
          l = 47L;
          break label1228;
          label1337:
          at.AR();
          com.tencent.mm.y.c.yM().a(new c.c(paramAnonymousString.field_talker, "update", paramAnonymousString));
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(795776909312L, 5929);
        GMTrace.o(795776909312L, 5929);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(795911127040L, 5930);
        GMTrace.o(795911127040L, 5930);
        return null;
      }
    };
    this.iZG = paramLong2;
    this.eDr = paramLong1;
    this.toi = an.afP().eq(paramLong1);
    this.gIl = paramf;
    this.toq = true;
    if (this.toi == null)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "big appMsg, info is null, msgid = , svrId" + paramLong1, new Object[] { Long.valueOf(paramLong2) });
      GMTrace.o(17442801713152L, 129959);
      return;
    }
    paramf = new b.a();
    paramf.gtF = new qd();
    paramf.gtG = new qe();
    paramf.uri = "/cgi-bin/micromsg-bin/downloadappattach";
    paramf.gtE = 221;
    paramf.gtH = 106;
    paramf.gtI = 1000000106;
    this.fUa = paramf.DA();
    GMTrace.o(17442801713152L, 129959);
  }
  
  public ab(long paramLong, String paramString, f paramf)
  {
    this(paramString, paramf, 0);
    GMTrace.i(819399229440L, 6105);
    this.eDr = paramLong;
    GMTrace.o(819399229440L, 6105);
  }
  
  public ab(b paramb)
  {
    GMTrace.i(819533447168L, 6106);
    this.toi = null;
    this.tol = -1L;
    this.mediaId = "";
    this.eDr = 0L;
    this.eRz = null;
    this.gIp = "";
    this.startTime = 0L;
    this.tom = -1;
    this.ton = "";
    this.type = 0;
    this.retCode = 0;
    this.too = false;
    this.toq = false;
    this.iZG = 0L;
    this.tor = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(795642691584L, 5928);
        if (paramAnonymouskeep_ProgressInfo == null) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback mediaId[%s], startRet[%d], progressInfo[%s], sceneResult[%s], finish[%b]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult, Boolean.valueOf(paramAnonymousBoolean) });
          if (paramAnonymousInt != 44530) {
            break;
          }
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { ab.this.gIp });
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          l.et(ab.this.toi.vmr);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0), "" });
          ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        ab.this.toi = an.afP().eq(ab.this.eDr);
        if (ab.this.toi == null)
        {
          w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig attachInfo is null");
          ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (ab.this.toi.field_status == 102L)
        {
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig dancy attach download has paused, status:%d", new Object[] { Long.valueOf(ab.this.toi.field_status) });
          com.tencent.mm.modelcdntran.g.Gk().jy(ab.this.gIp);
          ab.this.fUd.a(3, paramAnonymousInt, "attach  has paused, status=" + ab.this.toi.field_status, ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (paramAnonymouskeep_ProgressInfo.field_finishedLength == ab.this.toi.field_totalLen)
          {
            w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra ignore progress 100%");
            GMTrace.o(795642691584L, 5928);
            return 0;
          }
          if (ab.this.toi.field_offset > paramAnonymouskeep_ProgressInfo.field_finishedLength)
          {
            w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdnEndProc error oldpos:%d newpos:%d", new Object[] { Long.valueOf(ab.this.toi.field_offset), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
            l.et(ab.this.toi.vmr);
            ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
            GMTrace.o(795642691584L, 5928);
            return 0;
          }
          ab.this.toi.field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
          an.afP().c(ab.this.toi, new String[0]);
          if (ab.this.gIl != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(792824119296L, 5907);
                ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
                GMTrace.o(792824119296L, 5907);
              }
            });
          }
          w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra progresscallback id:%s finish:%d total:%d", new Object[] { ab.this.gIp, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength) });
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1076;
          }
          l.et(ab.this.toi.vmr);
          w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra sceneResult.retCode :%d", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          ab.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", ab.this);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(ab.this.toi.field_totalLen), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          if (paramAnonymouskeep_SceneResult.field_retCode != 0) {
            com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(ab.this.toi.field_totalLen), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          }
          if (ab.this.gIl != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(810809294848L, 6041);
                ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
                GMTrace.o(810809294848L, 6041);
              }
            });
          }
        }
        GMTrace.o(795642691584L, 5928);
        return 0;
        label1076:
        new File(ab.this.ton).renameTo(new File(ab.this.toi.field_fileFullPath));
        ab.this.toi.field_status = 199L;
        ab.this.toi.field_offset = ab.this.toi.field_totalLen;
        an.afP().c(ab.this.toi, new String[0]);
        com.tencent.mm.plugin.report.service.g.ork.a(198L, 45L, ab.this.toi.field_totalLen, false);
        com.tencent.mm.plugin.report.service.g.ork.a(198L, 46L, 1L, false);
        paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
        label1216:
        long l;
        if (ab.this.eRz == null)
        {
          paramAnonymousString = "";
          if (!s.eb(paramAnonymousString)) {
            break label1329;
          }
          l = 48L;
          label1228:
          paramAnonymouskeep_ProgressInfo.a(198L, l, 1L, false);
          at.AR();
          paramAnonymousString = com.tencent.mm.y.c.yM().cM(ab.this.toi.field_msgInfoId);
          if (paramAnonymousString.field_status != 5) {
            break label1337;
          }
          paramAnonymousString.dB(3);
          at.AR();
          com.tencent.mm.y.c.yM().a(paramAnonymousString.field_msgId, paramAnonymousString);
        }
        for (;;)
        {
          ab.this.fUd.a(0, 0, "", ab.this);
          break;
          paramAnonymousString = ab.this.eRz.field_talker;
          break label1216;
          label1329:
          l = 47L;
          break label1228;
          label1337:
          at.AR();
          com.tencent.mm.y.c.yM().a(new c.c(paramAnonymousString.field_talker, "update", paramAnonymousString));
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(795776909312L, 5929);
        GMTrace.o(795776909312L, 5929);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(795911127040L, 5930);
        GMTrace.o(795911127040L, 5930);
        return null;
      }
    };
    this.toi = paramb;
    this.too = true;
    this.mediaId = this.toi.field_mediaId;
    this.gIl = null;
    this.type = 0;
    if (paramb == null)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + this.mediaId);
      GMTrace.o(819533447168L, 6106);
      return;
    }
    b.a locala = new b.a();
    locala.gtF = new qd();
    locala.gtG = new qe();
    locala.uri = "/cgi-bin/micromsg-bin/downloadappattach";
    locala.gtE = 221;
    locala.gtH = 106;
    locala.gtI = 1000000106;
    this.fUa = locala.DA();
    w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach info fullpath[%s], justSaveFile[%b], stack[%s]", new Object[] { paramb.field_fileFullPath, Boolean.valueOf(true), bg.bQW() });
    GMTrace.o(819533447168L, 6106);
  }
  
  public ab(String paramString)
  {
    this(paramString, null, 0);
    GMTrace.i(819265011712L, 6104);
    GMTrace.o(819265011712L, 6104);
  }
  
  public ab(String paramString, f paramf, int paramInt)
  {
    GMTrace.i(819667664896L, 6107);
    this.toi = null;
    this.tol = -1L;
    this.mediaId = "";
    this.eDr = 0L;
    this.eRz = null;
    this.gIp = "";
    this.startTime = 0L;
    this.tom = -1;
    this.ton = "";
    this.type = 0;
    this.retCode = 0;
    this.too = false;
    this.toq = false;
    this.iZG = 0L;
    this.tor = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(795642691584L, 5928);
        if (paramAnonymouskeep_ProgressInfo == null) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback mediaId[%s], startRet[%d], progressInfo[%s], sceneResult[%s], finish[%b]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult, Boolean.valueOf(paramAnonymousBoolean) });
          if (paramAnonymousInt != 44530) {
            break;
          }
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { ab.this.gIp });
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          l.et(ab.this.toi.vmr);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0), "" });
          ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        ab.this.toi = an.afP().eq(ab.this.eDr);
        if (ab.this.toi == null)
        {
          w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig attachInfo is null");
          ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (ab.this.toi.field_status == 102L)
        {
          w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig dancy attach download has paused, status:%d", new Object[] { Long.valueOf(ab.this.toi.field_status) });
          com.tencent.mm.modelcdntran.g.Gk().jy(ab.this.gIp);
          ab.this.fUd.a(3, paramAnonymousInt, "attach  has paused, status=" + ab.this.toi.field_status, ab.this);
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (paramAnonymouskeep_ProgressInfo.field_finishedLength == ab.this.toi.field_totalLen)
          {
            w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra ignore progress 100%");
            GMTrace.o(795642691584L, 5928);
            return 0;
          }
          if (ab.this.toi.field_offset > paramAnonymouskeep_ProgressInfo.field_finishedLength)
          {
            w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdnEndProc error oldpos:%d newpos:%d", new Object[] { Long.valueOf(ab.this.toi.field_offset), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
            l.et(ab.this.toi.vmr);
            ab.this.fUd.a(3, paramAnonymousInt, "", ab.this);
            GMTrace.o(795642691584L, 5928);
            return 0;
          }
          ab.this.toi.field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
          an.afP().c(ab.this.toi, new String[0]);
          if (ab.this.gIl != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(792824119296L, 5907);
                ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
                GMTrace.o(792824119296L, 5907);
              }
            });
          }
          w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra progresscallback id:%s finish:%d total:%d", new Object[] { ab.this.gIp, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength) });
          GMTrace.o(795642691584L, 5928);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1076;
          }
          l.et(ab.this.toi.vmr);
          w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig callback cdntra sceneResult.retCode :%d", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
          ab.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", ab.this);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(ab.this.toi.field_totalLen), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          if (paramAnonymouskeep_SceneResult.field_retCode != 0) {
            com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(2), Long.valueOf(ab.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(ab.this.toi.field_totalLen), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          }
          if (ab.this.gIl != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(810809294848L, 6041);
                ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
                GMTrace.o(810809294848L, 6041);
              }
            });
          }
        }
        GMTrace.o(795642691584L, 5928);
        return 0;
        label1076:
        new File(ab.this.ton).renameTo(new File(ab.this.toi.field_fileFullPath));
        ab.this.toi.field_status = 199L;
        ab.this.toi.field_offset = ab.this.toi.field_totalLen;
        an.afP().c(ab.this.toi, new String[0]);
        com.tencent.mm.plugin.report.service.g.ork.a(198L, 45L, ab.this.toi.field_totalLen, false);
        com.tencent.mm.plugin.report.service.g.ork.a(198L, 46L, 1L, false);
        paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
        label1216:
        long l;
        if (ab.this.eRz == null)
        {
          paramAnonymousString = "";
          if (!s.eb(paramAnonymousString)) {
            break label1329;
          }
          l = 48L;
          label1228:
          paramAnonymouskeep_ProgressInfo.a(198L, l, 1L, false);
          at.AR();
          paramAnonymousString = com.tencent.mm.y.c.yM().cM(ab.this.toi.field_msgInfoId);
          if (paramAnonymousString.field_status != 5) {
            break label1337;
          }
          paramAnonymousString.dB(3);
          at.AR();
          com.tencent.mm.y.c.yM().a(paramAnonymousString.field_msgId, paramAnonymousString);
        }
        for (;;)
        {
          ab.this.fUd.a(0, 0, "", ab.this);
          break;
          paramAnonymousString = ab.this.eRz.field_talker;
          break label1216;
          label1329:
          l = 47L;
          break label1228;
          label1337:
          at.AR();
          com.tencent.mm.y.c.yM().a(new c.c(paramAnonymousString.field_talker, "update", paramAnonymousString));
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(795776909312L, 5929);
        GMTrace.o(795776909312L, 5929);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(795911127040L, 5930);
        GMTrace.o(795911127040L, 5930);
        return null;
      }
    };
    this.mediaId = paramString;
    this.gIl = paramf;
    this.type = paramInt;
    this.toi = an.afP().Op(paramString);
    if (this.toi == null)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + paramString);
      GMTrace.o(819667664896L, 6107);
      return;
    }
    paramString = new b.a();
    paramString.gtF = new qd();
    paramString.gtG = new qe();
    paramString.uri = "/cgi-bin/micromsg-bin/downloadappattach";
    paramString.gtE = 221;
    paramString.gtH = 106;
    paramString.gtI = 1000000106;
    this.fUa = paramString.DA();
    w.d("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach , type[%d], info fullpath[%s], field_type[%d], signature[%s], stack[%s]", new Object[] { Integer.valueOf(paramInt), this.toi.field_fileFullPath, Long.valueOf(this.toi.field_type), this.toi.field_signature, bg.bQW() });
    GMTrace.o(819667664896L, 6107);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(819936100352L, 6109);
    this.fUd = parame1;
    if (this.toi == null)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", com.tencent.mm.compatible.util.g.tC() + " get info failed mediaId:" + this.mediaId);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(819936100352L, 6109);
      return -1;
    }
    at.AR();
    this.eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
    if ((this.eRz == null) || (this.eRz.field_msgId != this.eDr))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", com.tencent.mm.compatible.util.g.tC() + " get msginfo failed mediaId:%s  msgId:%d", new Object[] { this.mediaId, Long.valueOf(this.eDr) });
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(819936100352L, 6109);
      return -1;
    }
    if (this.startTime == 0L)
    {
      this.startTime = bg.Pv();
      this.tom = ((int)this.toi.field_offset);
    }
    if (this.iZG != 0L)
    {
      parame1 = (qd)this.fUa.gtC.gtK;
      parame1.jhi = com.tencent.mm.y.q.zE();
      parame1.tRC = ((int)this.toi.field_totalLen);
      parame1.tRD = ((int)this.toi.field_offset);
      parame1.tRE = 0;
      parame1.jib = 40;
      parame1.tQd = this.iZG;
      i = a(parame, this.fUa, this);
      GMTrace.o(819936100352L, 6109);
      return i;
    }
    Object localObject = this.eRz.field_content;
    parame1 = (com.tencent.mm.ad.e)localObject;
    if (s.eb(this.eRz.field_talker))
    {
      i = bc.gO(this.eRz.field_content);
      parame1 = (com.tencent.mm.ad.e)localObject;
      if (i != -1) {
        parame1 = (this.eRz.field_content + " ").substring(i + 2).trim();
      }
    }
    parame1 = f.a.eS(bg.Sx(parame1));
    if (parame1 == null)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig checkUseCdn cdntra parse content xml failed: mediaId:%s", new Object[] { this.mediaId });
      i = 0;
    }
    while (i != 0)
    {
      w.d("MicroMsg.NetSceneDownloadAppAttach", "cdntra use cdn return -1 for onGYNetEnd mediaid:%s", new Object[] { this.mediaId });
      GMTrace.o(819936100352L, 6109);
      return 0;
      w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra checkUseCdn msgid:%d total:%d fullpath:%s fileid:%s aeskey:%s ", new Object[] { Long.valueOf(this.eDr), Long.valueOf(this.toi.field_totalLen), this.toi.field_fileFullPath, parame1.giC, bg.SJ(parame1.giJ) });
      if ((bg.nm(parame1.giC)) || (bg.nm(parame1.giJ)))
      {
        w.w("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra checkUseCdn msgId:%d Not use CDN  cdnAttachUrl:%s aes:%s ", new Object[] { Long.valueOf(this.eDr), parame1.giC, bg.SJ(parame1.giJ) });
        i = 0;
      }
      else
      {
        this.gIp = d.a("downattach", this.toi.field_createTime, this.eRz.field_talker, this.tol);
        if (bg.nm(this.gIp))
        {
          w.w("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra genClientId failed not use cdn rowid:%d", new Object[] { Long.valueOf(this.tol) });
          i = 0;
        }
        else
        {
          com.tencent.mm.a.e.bf(this.toi.field_fileFullPath);
          this.ton = (this.toi.field_fileFullPath + "_tmp");
          localObject = new i();
          ((i)localObject).field_mediaId = this.gIp;
          ((i)localObject).field_fullpath = this.ton;
          if ((parame1.giz != 0) || (parame1.giv > 26214400))
          {
            i = com.tencent.mm.modelcdntran.b.gzf;
            label751:
            ((i)localObject).field_fileType = i;
            ((i)localObject).field_totalLen = ((int)this.toi.field_totalLen);
            ((i)localObject).field_aesKey = parame1.giJ;
            ((i)localObject).field_fileId = parame1.giC;
            ((i)localObject).field_svr_signature = this.toi.field_signature;
            ((i)localObject).field_fake_bigfile_signature_aeskey = this.toi.field_fakeAeskey;
            ((i)localObject).field_fake_bigfile_signature = this.toi.field_fakeSignature;
            ((i)localObject).field_onlycheckexist = false;
            ((i)localObject).field_priority = com.tencent.mm.modelcdntran.b.gzd;
            ((i)localObject).gAB = this.gIz;
            if (!s.eb(this.eRz.field_talker)) {
              break label994;
            }
          }
          label994:
          for (i = 1;; i = 0)
          {
            ((i)localObject).field_chattype = i;
            w.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig checkUseCdn addRecvTask taskInfo field_fileType[%d], fileFullPath[%s], aeskey[%s], signature[%s], faeskey[%s], fsignature[%s], onlycheckexist[%s]", new Object[] { Integer.valueOf(((i)localObject).field_fileType), ((i)localObject).field_fullpath, bg.SJ(((i)localObject).field_aesKey), bg.SJ(((i)localObject).field_svr_signature), bg.SJ(((i)localObject).field_fake_bigfile_signature_aeskey), bg.SJ(((i)localObject).field_fake_bigfile_signature), Boolean.valueOf(((i)localObject).field_onlycheckexist) });
            if (com.tencent.mm.modelcdntran.g.Gk().b((i)localObject, -1)) {
              break label999;
            }
            w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig cdntra addSendTask failed.");
            this.gIp = "";
            i = 0;
            break;
            i = com.tencent.mm.modelcdntran.b.MediaType_FILE;
            break label751;
          }
          label999:
          if (this.toi.field_isUseCdn != 1)
          {
            this.toi.field_isUseCdn = 1;
            boolean bool = an.afP().c(this.toi, new String[0]);
            if (!bool)
            {
              w.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig checkUseCdn update info ret:" + bool);
              this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
              this.fUd.a(3, -1, "", this);
              i = 0;
              continue;
            }
          }
          i = 1;
        }
      }
    }
    if (this.toi.field_status == 102L)
    {
      this.toi.field_status = 101L;
      if (!this.too) {
        an.afP().c(this.toi, new String[0]);
      }
    }
    this.tol = this.toi.vmr;
    if ((bg.nm(this.toi.field_mediaSvrId)) && (this.iZG == 0L))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : mediaId is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(819936100352L, 6109);
      return -1;
    }
    if ((this.toi.field_totalLen <= 0L) || (this.toi.field_totalLen > 26214400L))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : totalLen is invalid, totalLen = " + this.toi.field_totalLen);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(819936100352L, 6109);
      return -1;
    }
    if ((bg.nm(this.toi.field_fileFullPath)) && (this.iZG == 0L))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : fileFullPath is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(819936100352L, 6109);
      return -1;
    }
    int j = com.tencent.mm.a.e.aY(this.toi.field_fileFullPath);
    int i = j;
    if (this.tor)
    {
      i = j - 6;
      if (i <= 0) {
        break label1439;
      }
    }
    while (i != this.toi.field_offset)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "checkArgs : fileFullPath is invalid, fileLength = " + i + ", info.field_offset = " + this.toi.field_offset);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(819936100352L, 6109);
      return -1;
      label1439:
      i = 0;
    }
    w.i("MicroMsg.NetSceneDownloadAppAttach", "downing attach by non cdn, appId: %s,  mediaId: %s, sdkVer: %d", new Object[] { this.toi.field_appId, this.toi.field_mediaSvrId, Long.valueOf(this.toi.field_sdkVer) });
    parame1 = (qd)this.fUa.gtC.gtK;
    parame1.lQa = this.toi.field_appId;
    parame1.ugf = this.toi.field_mediaSvrId;
    parame1.tQM = ((int)this.toi.field_sdkVer);
    parame1.jhi = com.tencent.mm.y.q.zE();
    parame1.tRC = ((int)this.toi.field_totalLen);
    parame1.tRD = ((int)this.toi.field_offset);
    parame1.tRE = 0;
    if (this.iZG != 0L) {
      parame1.tQd = this.iZG;
    }
    if (this.type != 0) {}
    for (parame1.jib = this.type;; parame1.jib = ((int)this.toi.field_type))
    {
      i = a(parame, this.fUa, this);
      GMTrace.o(819936100352L, 6109);
      return i;
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(820338753536L, 6112);
    int i = k.b.gum;
    GMTrace.o(820338753536L, 6112);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(820070318080L, 6110);
    w.d("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w("MicroMsg.NetSceneDownloadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(820070318080L, 6110);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      if (paramInt2 == 4) {
        com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0) });
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    paramq = (qe)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    this.toi.field_totalLen = paramq.tRC;
    if ((paramq.ugf != null) && (!paramq.ugf.equals(this.toi.field_mediaSvrId)))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "argument is not consistent");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    if (paramq.tRD != this.toi.field_offset)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "startPos, totalLen is incorrect startpos:" + paramq.tRD);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    if (paramq.tRE + this.toi.field_offset > this.toi.field_totalLen)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "data buffer is incorrect datalen:" + paramq.tRE + " off:" + this.toi.field_offset + " total?:" + this.toi.field_totalLen);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    paramString = n.a(paramq.ues);
    if ((paramString == null) || (paramString.length == 0) || (paramString.length != paramq.tRE))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "data buffer is incorrect");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    paramq = new String(paramString);
    w.d("MicroMsg.NetSceneDownloadAppAttach", "dancy download big appmsg : %s", new Object[] { Boolean.valueOf(this.toq) });
    Object localObject;
    StringBuffer localStringBuffer1;
    if ((this.toi.field_offset < this.toi.field_totalLen) && (this.toq))
    {
      at.AR();
      paramArrayOfByte = com.tencent.mm.y.c.yM().cM(this.toi.field_msgInfoId);
      if (!paramq.startsWith("<appmsg")) {
        break label963;
      }
      if (!s.eb(paramArrayOfByte.field_talker)) {
        break label951;
      }
      if (!bg.nm(paramArrayOfByte.field_content))
      {
        localObject = paramArrayOfByte.field_content.split("\n", 2)[0];
        localStringBuffer1 = new StringBuffer();
        this.toi.field_fullXml = ((String)localObject + "\n");
        localObject = new StringBuffer();
        ((StringBuffer)localObject).append(this.toi.field_fullXml).append(paramq);
        this.toi.field_fullXml = ((StringBuffer)localObject).toString();
      }
    }
    for (;;)
    {
      paramArrayOfByte.setContent(this.toi.field_fullXml);
      at.AR();
      com.tencent.mm.y.c.yM().a(this.toi.field_msgInfoId, paramArrayOfByte);
      w.d("MicroMsg.NetSceneDownloadAppAttach", "dancy download full xml succed! xml: [%s]", new Object[] { paramq });
      paramInt1 = com.tencent.mm.a.e.d(this.toi.field_fileFullPath, paramString);
      if ((bg.nm(this.toi.field_fileFullPath)) || (paramInt1 == 0)) {
        break;
      }
      w.e("MicroMsg.NetSceneDownloadAppAttach", "append to file failed:" + paramInt1);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
      label951:
      this.toi.field_fullXml = paramq;
      continue;
      label963:
      if (!paramArrayOfByte.field_content.startsWith("<msg>"))
      {
        localObject = new StringBuffer();
        ((StringBuffer)localObject).append(paramArrayOfByte.field_content).append(paramq);
        this.toi.field_fullXml = ((StringBuffer)localObject).toString();
      }
      if ((paramq.endsWith("</appmsg>")) || (this.toi.field_offset + paramString.length == this.toi.field_totalLen)) {
        if (s.eb(paramArrayOfByte.field_talker))
        {
          localObject = paramArrayOfByte.field_content.split("\n", 2);
          localStringBuffer1 = localObject[0];
          StringBuffer localStringBuffer2 = new StringBuffer();
          localStringBuffer2.append(localStringBuffer1).append("\n<msg>").append(localObject[1]).append(paramq).append("</msg>");
          this.toi.field_fullXml = localStringBuffer2.toString();
        }
        else
        {
          localObject = new StringBuffer();
          ((StringBuffer)localObject).append("<msg>").append(this.toi.field_fullXml).append("</msg>");
          this.toi.field_fullXml = ((StringBuffer)localObject).toString();
        }
      }
    }
    paramq = this.toi;
    paramq.field_offset += paramString.length;
    if (this.toi.field_offset == this.toi.field_totalLen) {
      this.toi.field_status = 199L;
    }
    if (this.gIl != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(822754672640L, 6130);
          ab.this.gIl.a((int)ab.this.toi.field_offset, (int)ab.this.toi.field_totalLen, ab.this);
          GMTrace.o(822754672640L, 6130);
        }
      });
    }
    if (this.too) {}
    for (boolean bool = true; !bool; bool = an.afP().c(this.toi, new String[0]))
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd update info ret:" + paramInt1);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    if (this.toi.field_status == 199L)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(2), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(this.toi.field_totalLen - this.tom) });
      at.AR();
      paramString = com.tencent.mm.y.c.yM().cM(this.toi.field_msgInfoId);
      at.AR();
      com.tencent.mm.y.c.yM().a(new c.c(paramString.field_talker, "update", paramString));
      this.fUd.a(0, 0, "", this);
      GMTrace.o(820070318080L, 6110);
      return;
    }
    if (this.toi.field_status == 102L)
    {
      this.fUd.a(3, -1, "", this);
      this.retCode = 45434;
      GMTrace.o(820070318080L, 6110);
      return;
    }
    if (a(this.gtW, this.fUd) < 0)
    {
      w.e("MicroMsg.NetSceneDownloadAppAttach", "onGYNetEnd : doScene fail");
      this.fUd.a(3, -1, "", this);
    }
    GMTrace.o(820070318080L, 6110);
  }
  
  public final void bJD()
  {
    GMTrace.i(819801882624L, 6108);
    this.tor = true;
    if (this.tor) {
      com.tencent.mm.a.e.d(this.toi.field_fileFullPath, "#!AMR\n".getBytes());
    }
    GMTrace.o(819801882624L, 6108);
  }
  
  public final String getMediaId()
  {
    GMTrace.i(820607188992L, 6114);
    if (this.toi == null)
    {
      GMTrace.o(820607188992L, 6114);
      return "";
    }
    String str = this.toi.field_mediaSvrId;
    GMTrace.o(820607188992L, 6114);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(820204535808L, 6111);
    GMTrace.o(820204535808L, 6111);
    return 221;
  }
  
  protected final int vB()
  {
    GMTrace.i(820472971264L, 6113);
    GMTrace.o(820472971264L, 6113);
    return 400;
  }
  
  public static abstract interface a
  {
    public abstract void bJE();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */