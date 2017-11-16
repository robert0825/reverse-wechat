package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.mm.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ble;
import com.tencent.mm.protocal.c.blf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public final class ak
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public f.a eAI;
  public String eDA;
  private boolean fUM;
  public int fUO;
  public keep_SceneResult fUP;
  public com.tencent.mm.sdk.b.c fUR;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public boolean gIH;
  public String gIp;
  private i.a gIz;
  private String gix;
  public int retCode;
  public long startTime;
  private boolean toG;
  private long toH;
  public String toUser;
  public b toi;
  public long tol;
  
  public ak(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(805440585728L, 6001);
    this.toi = null;
    this.eAI = null;
    this.tol = -1L;
    this.gix = null;
    this.toG = true;
    this.gIH = true;
    this.retCode = 0;
    this.startTime = 0L;
    this.toH = -1L;
    this.gIp = "";
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, final int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(824633720832L, 6144);
        paramAnonymousString = ak.this.gIp;
        boolean bool1;
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          bool1 = true;
          if (paramAnonymouskeep_SceneResult == null) {
            break label155;
          }
        }
        label155:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.d("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], progressing[%b], finish[%b], onlyCheckExist[%b]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(paramAnonymousBoolean) });
          an.afP().b(ak.this.tol, ak.this.toi);
          if (paramAnonymousInt != 44531) {
            break label161;
          }
          w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { ak.this.gIp });
          GMTrace.o(824633720832L, 6144);
          return 0;
          bool1 = false;
          break;
        }
        label161:
        if (paramAnonymousInt != 0)
        {
          l.et(ak.this.toi.vmr);
          an.afP().b(ak.this.tol, ak.this.toi);
          ak.this.toi.field_signature = "";
          paramAnonymousBoolean = an.afP().c(ak.this.toi, new String[0]);
          w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", new Object[] { Integer.valueOf(paramAnonymousInt), Long.valueOf(ak.this.tol), Boolean.valueOf(paramAnonymousBoolean) });
          ak.this.fUd.a(3, paramAnonymousInt, "", ak.this);
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(ak.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(0), "" });
          GMTrace.o(824633720832L, 6144);
          return 0;
        }
        if (ak.this.toi.field_status == 105L)
        {
          w.i("MicroMsg.NetSceneUploadAppAttach", "attach upload has paused, status:%d, rowid:%d", new Object[] { Long.valueOf(ak.this.toi.field_status), Long.valueOf(ak.this.tol) });
          com.tencent.mm.modelcdntran.g.Gk().jy(ak.this.gIp);
          ak.this.fUd.a(3, paramAnonymousInt, "attach  has paused, status" + ak.this.toi.field_status, ak.this);
          GMTrace.o(824633720832L, 6144);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          ak.this.toi.field_lastModifyTime = bg.Pu();
          ak.this.toi.field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
          paramAnonymousBoolean = an.afP().c(ak.this.toi, new String[0]);
          if (!paramAnonymousBoolean)
          {
            w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + paramAnonymousBoolean);
            ak.this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
            ak.this.fUd.a(3, paramAnonymousInt, "", ak.this);
            GMTrace.o(824633720832L, 6144);
            return 0;
          }
          GMTrace.o(824633720832L, 6144);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1188;
          }
          w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult.field_arg, paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          l.et(ak.this.toi.vmr);
          an.afP().b(ak.this.tol, ak.this.toi);
          ak.this.toi.field_signature = "";
          paramAnonymousBoolean = an.afP().c(ak.this.toi, new String[0]);
          w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] sceneResult.field_retCode[%d], rowid[%d], reset signature ret[%b]", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Long.valueOf(ak.this.tol), Boolean.valueOf(paramAnonymousBoolean) });
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(ak.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(1), Long.valueOf(ak.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
          ak.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", ak.this);
        }
        for (;;)
        {
          GMTrace.o(824633720832L, 6144);
          return 0;
          label1188:
          w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymousBoolean), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_exist_whencheck), bg.SJ(ak.this.toi.field_signature) });
          if (paramAnonymousBoolean)
          {
            if (paramAnonymouskeep_SceneResult.field_exist_whencheck)
            {
              at.wS().a(new z(ak.this.eAI, ak.this.toi.field_fileFullPath, ak.this.toUser, new z.a()
              {
                public final void a(String paramAnonymous2String1, String paramAnonymous2String2, String paramAnonymous2String3, String paramAnonymous2String4, String paramAnonymous2String5, long paramAnonymous2Long)
                {
                  GMTrace.i(825304809472L, 6149);
                  paramAnonymous2String2 = bg.SJ(paramAnonymous2String2);
                  String str1 = bg.SJ(paramAnonymous2String3);
                  String str2 = bg.SJ(paramAnonymous2String4);
                  String str3 = bg.SJ(paramAnonymous2String5);
                  if (ak.this.eAI == null) {}
                  for (boolean bool = true;; bool = false)
                  {
                    w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload exist_whencheck call back new md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", new Object[] { paramAnonymous2String1, paramAnonymous2String2, str1, str2, str3, Boolean.valueOf(bool), Boolean.valueOf(ak.this.gIH) });
                    if (!bg.nm(paramAnonymous2String3))
                    {
                      ak.this.toi.field_signature = paramAnonymous2String3;
                      ak.this.toi.field_fakeAeskey = paramAnonymous2String4;
                      ak.this.toi.field_fakeSignature = paramAnonymous2String5;
                    }
                    ak.1.this.a(paramAnonymousInt, paramAnonymouskeep_SceneResult);
                    GMTrace.o(825304809472L, 6149);
                    return;
                  }
                }
              }), 0);
            }
            else
            {
              w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig upload check but not exist");
              at.wS().a(new z(null, ak.this.toi.field_fileFullPath, ak.this.toUser, new z.a()
              {
                public final void a(String paramAnonymous2String1, String paramAnonymous2String2, String paramAnonymous2String3, String paramAnonymous2String4, String paramAnonymous2String5, long paramAnonymous2Long)
                {
                  GMTrace.i(811346165760L, 6045);
                  String str1 = bg.SJ(paramAnonymous2String2);
                  String str2 = bg.SJ(paramAnonymous2String3);
                  String str3 = bg.SJ(paramAnonymous2String4);
                  String str4 = bg.SJ(paramAnonymous2String5);
                  if (ak.this.eAI == null) {}
                  for (boolean bool = true;; bool = false)
                  {
                    w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload not exist_whencheck call back new md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", new Object[] { paramAnonymous2String1, str1, str2, str3, str4, Boolean.valueOf(bool), Boolean.valueOf(ak.this.gIH) });
                    if (!bg.nm(paramAnonymous2String3))
                    {
                      ak.this.toi.field_signature = paramAnonymous2String3;
                      ak.this.toi.field_fakeAeskey = paramAnonymous2String4;
                      ak.this.toi.field_fakeSignature = paramAnonymous2String5;
                      ak.this.toi.field_lastModifyTime = bg.Pv();
                      if (ak.this.eAI != null)
                      {
                        ak.this.eAI.filemd5 = paramAnonymous2String1;
                        ak.this.eAI.giJ = paramAnonymous2String2;
                        ak.this.eAI.giv = ((int)paramAnonymous2Long);
                        at.AR();
                        paramAnonymous2String1 = com.tencent.mm.y.c.yM().cM(ak.this.toi.field_msgInfoId);
                        paramAnonymous2String1.setContent(f.a.a(ak.this.eAI, null, null));
                        at.AR();
                        com.tencent.mm.y.c.yM().a(paramAnonymous2String1.field_msgId, paramAnonymous2String1);
                      }
                    }
                    ak.this.gIH = false;
                    bool = an.afP().c(ak.this.toi, new String[0]);
                    if (bool) {
                      break;
                    }
                    w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + bool);
                    ak.this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
                    ak.this.fUd.a(3, paramAnonymousInt, "", ak.this);
                    GMTrace.o(811346165760L, 6045);
                    return;
                  }
                  at.xB().A(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(806648545280L, 6010);
                      w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene again");
                      ak.this.a(ak.this.gtW, ak.this.fUd);
                      GMTrace.o(806648545280L, 6010);
                    }
                  });
                  GMTrace.o(811346165760L, 6045);
                }
              }), 0);
            }
          }
          else {
            a(paramAnonymousInt, paramAnonymouskeep_SceneResult);
          }
        }
      }
      
      public final void a(int paramAnonymousInt, final keep_SceneResult paramAnonymouskeep_SceneResult)
      {
        GMTrace.i(824767938560L, 6145);
        ak.this.toi.field_status = 199L;
        boolean bool = an.afP().c(ak.this.toi, new String[0]);
        if (!bool)
        {
          w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + bool);
          ak.this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
          ak.this.fUd.a(3, paramAnonymousInt, "", ak.this);
          GMTrace.o(824767938560L, 6145);
          return;
        }
        l.a(ak.this.toi.field_msgInfoId, ak.this.toi.field_mediaSvrId, paramAnonymouskeep_SceneResult);
        at.wS().a(new ai(ak.this.toi.field_msgInfoId, true, paramAnonymouskeep_SceneResult, new ai.a()
        {
          public final void bb(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(804366843904L, 5993);
            w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
            if ((paramAnonymous2Int1 == 4) && (paramAnonymous2Int2 == 102))
            {
              at.xB().A(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(811614601216L, 6047);
                  ak.this.gIH = false;
                  ak.this.toi.field_createTime = bg.Pv();
                  ak.this.toi.field_lastModifyTime = bg.Pu();
                  ak.this.toi.field_offset = 0L;
                  ak.this.toi.field_status = 101L;
                  boolean bool = an.afP().c(ak.this.toi, new String[0]);
                  w.i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", new Object[] { Boolean.valueOf(ak.this.gIH), Boolean.valueOf(bool), Long.valueOf(ak.this.toi.field_createTime) });
                  ak.this.a(ak.this.gtW, ak.this.fUd);
                  GMTrace.o(811614601216L, 6047);
                }
              });
              GMTrace.o(804366843904L, 5993);
              return;
            }
            com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(1), Long.valueOf(ak.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", paramAnonymouskeep_SceneResult.report_Part2 });
            if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0)) {
              ak.this.c(paramAnonymouskeep_SceneResult);
            }
            ak.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", ak.this);
            GMTrace.o(804366843904L, 5993);
          }
        }, ak.this.eDA, ak.this.toi), 0);
        GMTrace.o(824767938560L, 6145);
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(824902156288L, 6146);
        GMTrace.o(824902156288L, 6146);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(825036374016L, 6147);
        GMTrace.o(825036374016L, 6147);
        return null;
      }
    };
    this.fUM = false;
    this.fUO = 0;
    this.fUR = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(mm paramAnonymousmm)
      {
        GMTrace.i(791750377472L, 5899);
        if (!paramAnonymousmm.eRt.filePath.equals(ak.this.toi.field_fileFullPath))
        {
          GMTrace.o(791750377472L, 5899);
          return false;
        }
        Object localObject1 = "";
        try
        {
          paramAnonymousmm = URLEncoder.encode(paramAnonymousmm.eRt.result, "UTF-8");
          if (ak.this.fUO == 1)
          {
            at.AR();
            Object localObject2 = com.tencent.mm.y.c.yM().cM(ak.this.toi.field_msgInfoId);
            com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
            locald.q("20toUser", ak.this.toUser + ",");
            locald.q("21source", "4,");
            locald.q("22qrUrl", paramAnonymousmm + ",");
            localObject1 = new StringBuilder();
            if (ak.this.fUP == null)
            {
              paramAnonymousmm = "";
              locald.q("23md5", paramAnonymousmm + ",");
              localObject1 = new StringBuilder();
              if (ak.this.fUP != null) {
                break label472;
              }
              paramAnonymousmm = "";
              locald.q("24cdnFileId", paramAnonymousmm + ",");
              localObject1 = new StringBuilder();
              if (ak.this.fUP != null) {
                break label486;
              }
              paramAnonymousmm = "";
              locald.q("25cdnAesKey", paramAnonymousmm + ",");
              localObject1 = "";
              paramAnonymousmm = (mm)localObject1;
              if (((au)localObject2).aCp())
              {
                localObject2 = f.a.eS(((ce)localObject2).field_content);
                paramAnonymousmm = (mm)localObject1;
                if (localObject2 != null) {
                  paramAnonymousmm = ((f.a)localObject2).appId;
                }
              }
              locald.q("26appip", paramAnonymousmm + ",");
              locald.q("2toUsersCount", m.fk(ak.this.toUser) + ",");
              w.i("MicroMsg.NetSceneUploadAppAttach", "report qrCodeImgChatting(13628): " + locald.LT());
              com.tencent.mm.modelstat.n.r(13628, locald.toString());
            }
          }
          else
          {
            a.vgX.c(ak.this.fUR);
            GMTrace.o(791750377472L, 5899);
            return false;
          }
        }
        catch (UnsupportedEncodingException paramAnonymousmm)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.NetSceneUploadAppAttach", paramAnonymousmm, "", new Object[0]);
            paramAnonymousmm = (mm)localObject1;
            continue;
            paramAnonymousmm = ak.this.fUP.field_filemd5;
            continue;
            label472:
            paramAnonymousmm = ak.this.fUP.field_fileId;
            continue;
            label486:
            paramAnonymousmm = ak.this.fUP.field_aesKey;
          }
        }
      }
    };
    this.tol = paramLong;
    this.gix = paramString1;
    this.eDA = paramString2;
    paramString2 = new b.a();
    paramString2.gtF = new ble();
    paramString2.gtG = new blf();
    paramString2.uri = "/cgi-bin/micromsg-bin/uploadappattach";
    paramString2.gtE = 220;
    paramString2.gtH = 105;
    paramString2.gtI = 1000000105;
    this.fUa = paramString2.DA();
    w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig new NetSceneUploadAppAttach rowid[%d], emoticonmd5[%s], stack[%s]", new Object[] { Long.valueOf(paramLong), paramString1, bg.bQW() });
    GMTrace.o(805440585728L, 6001);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(805574803456L, 6002);
    this.fUd = parame1;
    this.toi = new b();
    if ((!an.afP().b(this.tol, this.toi)) || (this.toi == null))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.tC() + " summerbig get info failed rowid:" + this.tol);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.toi = null;
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    if (this.toi.field_status != 101L)
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.tC() + " summerbig get field_status failed rowid:" + this.tol + " status:" + this.toi.field_status);
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    if (this.startTime == 0L)
    {
      this.startTime = bg.Pv();
      this.toH = this.toi.field_offset;
    }
    w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene rowid[%d], fileFullPath[%s], totalLen[%d],isUpload[%b], isUseCdn[%b], type[%d]", new Object[] { Long.valueOf(this.tol), this.toi.field_fileFullPath, Long.valueOf(this.toi.field_totalLen), Boolean.valueOf(this.toi.field_isUpload), Integer.valueOf(this.toi.field_isUseCdn), Long.valueOf(this.toi.field_type) });
    if (bg.nm(this.toi.field_appId))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : appId is null");
      if ((this.toi.field_type != 8L) && (this.toi.field_type != 6L))
      {
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
        GMTrace.o(805574803456L, 6002);
        return -1;
      }
    }
    if ((this.toi.field_type == 8L) || (this.toi.field_type == 9L))
    {
      w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra cdn not support Emoji or voiceremind now type:%d", new Object[] { Long.valueOf(this.toi.field_type) });
      i = 0;
    }
    while (i != 0)
    {
      w.d("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene cdntra use cdn return -1 for onGYNetEnd client rowid:%d", new Object[] { Long.valueOf(this.tol) });
      GMTrace.o(805574803456L, 6002);
      return 0;
      com.tencent.mm.modelcdntran.g.Gk();
      if ((!com.tencent.mm.modelcdntran.c.fT(4)) && (this.toi.field_isUseCdn != 1))
      {
        com.tencent.mm.modelcdntran.g.Gk();
        w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra not use cdn flag:%b getCdnInfo:%d", new Object[] { Boolean.valueOf(com.tencent.mm.modelcdntran.c.fT(4)), Integer.valueOf(this.toi.field_isUseCdn) });
        i = 0;
      }
      else
      {
        at.AR();
        au localau = com.tencent.mm.y.c.yM().cM(this.toi.field_msgInfoId);
        if (localau.field_msgId != this.toi.field_msgInfoId)
        {
          w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra read msg info failed msgId[%d], rowid[%d], createtime[%d], len[%d], status[%d], upload[%b], useCdn[%d], mediaId[%s]", new Object[] { Long.valueOf(this.toi.field_msgInfoId), Long.valueOf(this.toi.vmr), Long.valueOf(this.toi.field_createTime), Long.valueOf(this.toi.field_totalLen), Long.valueOf(this.toi.field_status), Boolean.valueOf(this.toi.field_isUpload), Integer.valueOf(this.toi.field_isUseCdn), this.toi.field_mediaId });
          this.toUser = null;
          i = 0;
        }
        else
        {
          this.toUser = localau.field_talker;
          parame1 = "";
          if (!bg.nm(localau.field_imgPath)) {
            parame1 = com.tencent.mm.ao.n.IZ().ke(localau.field_imgPath);
          }
          int k = com.tencent.mm.a.e.aY(parame1);
          int m = com.tencent.mm.a.e.aY(this.toi.field_fileFullPath);
          if (k >= com.tencent.mm.modelcdntran.b.gzs)
          {
            w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", new Object[] { parame1, Integer.valueOf(k) });
            i = 0;
          }
          else
          {
            this.gIp = com.tencent.mm.modelcdntran.d.a("upattach", this.toi.field_createTime, localau.field_talker, this.tol);
            w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra genClientId field_createTime[%d], useCdnTransClientId[%s]", new Object[] { Long.valueOf(this.toi.field_createTime), this.gIp });
            if (bg.nm(this.gIp))
            {
              w.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra genClientId failed not use cdn rowid:%d", new Object[] { Long.valueOf(this.tol) });
              i = 0;
            }
            else
            {
              i locali = new i();
              String str = localau.field_content;
              localObject = str;
              if (s.eb(localau.field_talker))
              {
                i = bc.gO(localau.field_content);
                localObject = str;
                if (i != -1) {
                  localObject = (localau.field_content + " ").substring(i + 2).trim();
                }
              }
              this.eAI = f.a.eS(bg.Sx((String)localObject));
              label1105:
              int j;
              label1150:
              label1173:
              boolean bool;
              if (this.eAI != null)
              {
                w.d("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra amc.cdnAttachUrl[%s], amc.aesKey[%s], amc.filemd5[%s], amc.type[%d]", new Object[] { this.eAI.giC, bg.SJ(this.eAI.giJ), this.eAI.filemd5, Integer.valueOf(this.eAI.type) });
                locali.field_fileId = this.eAI.giC;
                locali.field_aesKey = this.eAI.giJ;
                locali.field_filemd5 = this.eAI.filemd5;
                if ((this.eAI.giz != 0) || (this.eAI.giv > 26214400))
                {
                  i = 1;
                  locali.gAB = this.gIz;
                  locali.field_mediaId = this.gIp;
                  locali.field_fullpath = this.toi.field_fileFullPath;
                  locali.field_thumbpath = parame1;
                  if (i == 0) {
                    break label1530;
                  }
                  j = com.tencent.mm.modelcdntran.b.gzf;
                  locali.field_fileType = j;
                  if (i == 0) {
                    break label1538;
                  }
                  localObject = bg.nl(this.toi.field_signature);
                  locali.field_svr_signature = ((String)localObject);
                  if (i == 0) {
                    break label1545;
                  }
                  bool = bg.nm(this.toi.field_signature);
                  label1196:
                  locali.field_onlycheckexist = bool;
                  locali.field_fake_bigfile_signature_aeskey = this.toi.field_fakeAeskey;
                  locali.field_fake_bigfile_signature = this.toi.field_fakeSignature;
                  locali.field_talker = localau.field_talker;
                  locali.field_priority = com.tencent.mm.modelcdntran.b.gzd;
                  locali.field_totalLen = m;
                  locali.field_needStorage = false;
                  locali.field_isStreamMedia = false;
                  locali.field_enable_hitcheck = this.gIH;
                  if (!s.eb(localau.field_talker)) {
                    break label1551;
                  }
                }
              }
              label1530:
              label1538:
              label1545:
              label1551:
              for (i = 1;; i = 0)
              {
                locali.field_chattype = i;
                locali.field_force_aeskeycdn = false;
                locali.field_trysafecdn = true;
                w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra checkUseCdn msgId:%d file[%s][%d] thumb[%s][%d], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b] force_aeskeycdn[%b] trysafecdn[%b] aeskey[%s], md5[%s], signature[%s], faeskey[%s], fsignature[%s]", new Object[] { Long.valueOf(this.toi.field_msgInfoId), locali.field_fullpath, Integer.valueOf(m), parame1, Integer.valueOf(k), this.gIp, Integer.valueOf(locali.field_fileType), Boolean.valueOf(locali.field_enable_hitcheck), Boolean.valueOf(locali.field_onlycheckexist), Boolean.valueOf(locali.field_force_aeskeycdn), Boolean.valueOf(locali.field_trysafecdn), bg.SJ(locali.field_aesKey), locali.field_filemd5, bg.SJ(locali.field_svr_signature), bg.SJ(locali.field_fake_bigfile_signature_aeskey), bg.SJ(locali.field_fake_bigfile_signature) });
                if (com.tencent.mm.modelcdntran.g.Gk().c(locali)) {
                  break label1556;
                }
                w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra addSendTask failed.");
                this.gIp = "";
                i = 0;
                break;
                i = 0;
                break label1105;
                w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra parse content xml failed");
                i = 0;
                break label1105;
                j = com.tencent.mm.modelcdntran.b.MediaType_FILE;
                break label1150;
                localObject = "";
                break label1173;
                bool = false;
                break label1196;
              }
              label1556:
              if (this.toi.field_isUseCdn != 1)
              {
                this.toi.field_isUseCdn = 1;
                bool = an.afP().c(this.toi, new String[0]);
                if (!bool)
                {
                  w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig checkUseCdn update info ret:" + bool);
                  this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
                  this.fUd.a(3, -1, "", this);
                  i = 0;
                  continue;
                }
              }
              w.i("MicroMsg.NetSceneUploadAppAttach", "summerbig checkUseCdn ret true useCdnTransClientId[%s]", new Object[] { this.gIp });
              i = 1;
            }
          }
        }
      }
    }
    if (this.toi.field_netTimes > 3200L)
    {
      l.et(this.toi.vmr);
      w.e("MicroMsg.NetSceneUploadAppAttach", com.tencent.mm.compatible.util.g.tC() + " summerbig doScene info.field_netTimes > DOSCENE_LIMIT SET ERROR! rowid:" + this.tol);
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    parame1 = this.toi;
    parame1.field_netTimes += 1L;
    if (bg.nm(this.toi.field_clientAppDataId))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : clientAppDataId is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    if ((this.toi.field_totalLen <= 0L) || (this.toi.field_totalLen > 26214400L))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : totalLen is invalid, totalLen = " + this.toi.field_totalLen);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      if (this.toi.field_totalLen > 26214400L) {
        l.et(this.toi.vmr);
      }
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    if (bg.nm(this.toi.field_fileFullPath))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene checkArgs : fileFullPath is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    if (com.tencent.mm.a.e.aY(this.toi.field_fileFullPath) > 26214400)
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene doScene : file is too large");
      l.et(this.toi.vmr);
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    if (bg.nm(this.gix)) {}
    for (parame1 = com.tencent.mm.a.e.d(this.toi.field_fileFullPath, (int)this.toi.field_offset, 8192); bg.bq(parame1); parame1 = com.tencent.mm.a.e.d(this.toi.field_fileFullPath, (int)this.toi.field_offset, 32768))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene doScene : data is null");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      GMTrace.o(805574803456L, 6002);
      return -1;
    }
    Object localObject = (ble)this.fUa.gtC.gtK;
    ((ble)localObject).lQa = this.toi.field_appId;
    ((ble)localObject).tQM = ((int)this.toi.field_sdkVer);
    ((ble)localObject).uVp = this.toi.field_clientAppDataId;
    ((ble)localObject).jib = ((int)this.toi.field_type);
    ((ble)localObject).jhi = com.tencent.mm.y.q.zE();
    ((ble)localObject).tRC = ((int)this.toi.field_totalLen);
    ((ble)localObject).tRD = ((int)this.toi.field_offset);
    if ((this.gix != null) && (this.toG))
    {
      ((ble)localObject).ugH = this.gix;
      ((ble)localObject).tRC = ((int)this.toi.field_totalLen);
      ((ble)localObject).tRE = 0;
      ((ble)localObject).ues = new azp().be(new byte[0]);
      this.toG = false;
      i = a(parame, this.fUa, this);
      GMTrace.o(805574803456L, 6002);
      return i;
    }
    ((ble)localObject).tRE = parame1.length;
    ((ble)localObject).ues = new azp().be(parame1);
    if (this.gix != null) {
      ((ble)localObject).ugH = this.gix;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(805574803456L, 6002);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(806111674368L, 6006);
    int i = k.b.gum;
    GMTrace.o(806111674368L, 6006);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(805709021184L, 6003);
    w.d("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w("MicroMsg.NetSceneUploadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(805709021184L, 6003);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      if (paramInt2 == 4) {
        com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(this.toi.field_totalLen - this.toH) });
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(805709021184L, 6003);
      return;
    }
    paramString = (blf)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramString.lQa != null) && (this.gix == null) && ((!paramString.lQa.equals(this.toi.field_appId)) || (!paramString.uVp.equals(this.toi.field_clientAppDataId))))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "argument is not consistent");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(805709021184L, 6003);
      return;
    }
    if ((paramString.tRC < 0) || (paramString.tRC != this.toi.field_totalLen) || (paramString.tRD < 0) || (paramString.tRD > this.toi.field_totalLen))
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "dataLen, startPos or totalLen is incorrect");
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      this.fUd.a(3, -1, "", this);
      GMTrace.o(805709021184L, 6003);
      return;
    }
    this.toi.field_offset = paramString.tRD;
    paramq = this.toi;
    if (l.Oy(paramString.ugf)) {}
    for (paramString = paramString.ugf;; paramString = "")
    {
      paramq.field_mediaSvrId = paramString;
      if (this.toi.field_status != 105L) {
        break;
      }
      w.w("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd STATUS PAUSE [" + this.toi.field_mediaSvrId + "," + this.toi.field_offset + "] ");
      this.fUd.a(paramInt2, -1, "", this);
      GMTrace.o(805709021184L, 6003);
      return;
    }
    if (this.toi.field_offset == this.toi.field_totalLen)
    {
      if (bg.nm(this.toi.field_mediaSvrId))
      {
        w.e("MicroMsg.NetSceneUploadAppAttach", "finish upload but mediaid == null!");
        this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
        this.fUd.a(3, -1, "", this);
        l.et(this.toi.vmr);
        GMTrace.o(805709021184L, 6003);
        return;
      }
      this.toi.field_status = 199L;
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_FILE), Long.valueOf(this.toi.field_totalLen - this.toH) });
    }
    boolean bool = an.afP().c(this.toi, new String[0]);
    if (!bool)
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd update info ret:" + bool);
      this.retCode = (55536 - com.tencent.mm.compatible.util.g.tA());
      c(null);
      this.fUd.a(3, -1, "", this);
      GMTrace.o(805709021184L, 6003);
      return;
    }
    if (this.toi.field_status == 199L)
    {
      this.fUd.a(0, 0, "", this);
      GMTrace.o(805709021184L, 6003);
      return;
    }
    if (a(this.gtW, this.fUd) < 0)
    {
      w.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : doScene fail");
      this.fUd.a(3, -1, "", this);
    }
    GMTrace.o(805709021184L, 6003);
  }
  
  public final void c(keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(806245892096L, 6007);
    if (this.toi.field_type != 2L)
    {
      GMTrace.o(806245892096L, 6007);
      return;
    }
    com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100131");
    if (localc.isValid()) {
      this.fUO = t.getInt((String)localc.bSg().get("needUploadData"), 1);
    }
    if ((this.fUM) || (this.fUO == 0))
    {
      GMTrace.o(806245892096L, 6007);
      return;
    }
    this.fUP = paramkeep_SceneResult;
    this.fUM = true;
    paramkeep_SceneResult = new mk();
    a.vgX.b(this.fUR);
    paramkeep_SceneResult.eRq.filePath = this.toi.field_fileFullPath;
    a.vgX.m(paramkeep_SceneResult);
    GMTrace.o(806245892096L, 6007);
  }
  
  public final int getType()
  {
    GMTrace.i(805977456640L, 6005);
    GMTrace.o(805977456640L, 6005);
    return 220;
  }
  
  protected final int vB()
  {
    GMTrace.i(805843238912L, 6004);
    GMTrace.o(805843238912L, 6004);
    return 3200;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */