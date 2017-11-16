package com.tencent.mm.plugin.record.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.pluginsdk.model.app.aa;
import com.tencent.mm.pluginsdk.model.app.aa.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends f<g>
{
  private i.a gIz;
  
  public h()
  {
    GMTrace.i(7514179502080L, 55985);
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(7519279775744L, 56023);
        w.v("MicroMsg.RecordMsgCDNService", "cdn transfer callback, startRet[%d], mediaId[%s]", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        if (paramAnonymouskeep_ProgressInfo != null) {
          w.v("MicroMsg.RecordMsgCDNService", "cdn transfer callback, mediaid[%s], totallen[%d], offset[%d]", new Object[] { paramAnonymouskeep_ProgressInfo.mediaId, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength) });
        }
        if ((paramAnonymousInt == 44530) || (paramAnonymousInt == 44531))
        {
          h.this.baH();
          GMTrace.o(7519279775744L, 56023);
          return 0;
        }
        final g localg = s.baL().Fv(paramAnonymousString);
        if (localg == null)
        {
          w.w("MicroMsg.RecordMsgCDNService", "onCdnCallback info null, mediaId[%s]", new Object[] { paramAnonymousString });
          h.this.baH();
          GMTrace.o(7519279775744L, 56023);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          w.w("MicroMsg.RecordMsgCDNService", "tran fail, startRet[%d], mediaId[%s], type[%d]", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString, Integer.valueOf(localg.field_type) });
          if (-5103059 == paramAnonymousInt)
          {
            localg.field_status = 4;
            localg.field_errCode = paramAnonymousInt;
            s.baL().b(localg, new String[] { "localId" });
          }
        }
        for (;;)
        {
          h.this.baH();
          label297:
          do
          {
            for (;;)
            {
              GMTrace.o(7519279775744L, 56023);
              return 0;
              localg.field_status = 3;
              break;
              if (paramAnonymouskeep_ProgressInfo == null) {
                break label297;
              }
              localg.field_offset = paramAnonymouskeep_ProgressInfo.field_finishedLength;
              localg.field_totalLen = paramAnonymouskeep_ProgressInfo.field_toltalLength;
              localg.field_status = 1;
              s.baL().b(localg, new String[] { "localId" });
            }
          } while (paramAnonymouskeep_SceneResult == null);
          w.i("MicroMsg.RecordMsgCDNService", "summersafecdn cdnCallback upload attach by cdn, retCode:%d isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymousBoolean), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_exist_whencheck), bg.SJ(paramAnonymouskeep_SceneResult.field_aesKey), paramAnonymouskeep_SceneResult.field_filemd5 });
          if (paramAnonymouskeep_SceneResult.field_retCode < 0) {
            break label765;
          }
          localg.field_status = 2;
          if (1 == localg.field_type)
          {
            paramAnonymousString = localg.field_path + ".temp";
            paramAnonymouskeep_SceneResult = localg.field_path;
            if ((bg.nm(paramAnonymousString)) || (bg.nm(paramAnonymouskeep_SceneResult))) {
              w.w("MicroMsg.RecordMsgCDNService", "do rename and copy file, but path error");
            }
            for (;;)
            {
              s.baL().a(localg, new String[] { "localId" });
              break;
              paramAnonymouskeep_ProgressInfo = new File(paramAnonymousString);
              paramAnonymouskeep_SceneResult = new File(paramAnonymouskeep_SceneResult);
              if (paramAnonymouskeep_ProgressInfo.exists()) {
                w.v("MicroMsg.RecordMsgCDNService", "rename file suc:%b, old:%s, new:%s", new Object[] { Boolean.valueOf(paramAnonymouskeep_ProgressInfo.renameTo(paramAnonymouskeep_SceneResult)), paramAnonymousString, paramAnonymouskeep_SceneResult });
              }
            }
          }
          w.i("MicroMsg.RecordMsgCDNService", "transfer done, mediaid=%s, md5=%s", new Object[] { paramAnonymouskeep_SceneResult.mediaId, paramAnonymousString });
          w.d("MicroMsg.RecordMsgCDNService", "transfer done, completeInfo=%s", new Object[] { paramAnonymouskeep_SceneResult });
          w.d("MicroMsg.RecordMsgCDNService", "summersafecdn cdnCallback upload field_aesKey[%s], field_fileId[%s]", new Object[] { paramAnonymouskeep_SceneResult.field_aesKey, paramAnonymouskeep_SceneResult.field_fileId });
          if (paramAnonymouskeep_SceneResult.isUploadBySafeCDNWithMD5())
          {
            w.i("MicroMsg.RecordMsgCDNService", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s], newmd5[%s]", new Object[] { Boolean.valueOf(paramAnonymouskeep_SceneResult.field_upload_by_safecdn), Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Integer.valueOf(paramAnonymouskeep_SceneResult.field_filecrc), paramAnonymouskeep_SceneResult.field_aesKey, paramAnonymouskeep_SceneResult.field_mp4identifymd5 });
            at.wS().a(new aa(paramAnonymouskeep_SceneResult.field_fileId, paramAnonymouskeep_SceneResult.field_filemd5, paramAnonymouskeep_SceneResult.field_mp4identifymd5, paramAnonymouskeep_SceneResult.field_filecrc, new aa.a()
            {
              public final void M(String paramAnonymous2String, int paramAnonymous2Int1, int paramAnonymous2Int2)
              {
                GMTrace.i(7501294600192L, 55889);
                w.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 callback [%d, %d], [%s]", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
                if ((paramAnonymous2Int1 == 4) && (paramAnonymous2Int2 == 102))
                {
                  w.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 MM_ERR_GET_AESKEY_FAILED old status[%d, %d, %d]", new Object[] { Integer.valueOf(localg.field_status), Integer.valueOf(localg.field_offset), Integer.valueOf(localg.field_totalLen) });
                  localg.field_offset = 0;
                  localg.field_totalLen = 0;
                  localg.field_status = 0;
                  s.baL().b(localg, new String[] { "localId" });
                  h.this.a(localg, false);
                  GMTrace.o(7501294600192L, 55889);
                  return;
                }
                localg.field_cdnKey = paramAnonymous2String;
                localg.field_cdnUrl = paramAnonymouskeep_SceneResult.field_fileId;
                s.baL().b(localg, new String[] { "localId" });
                h.this.baH();
                GMTrace.o(7501294600192L, 55889);
              }
            }), 0);
            GMTrace.o(7519279775744L, 56023);
            return 0;
          }
          localg.field_cdnKey = paramAnonymouskeep_SceneResult.field_aesKey;
          localg.field_cdnUrl = paramAnonymouskeep_SceneResult.field_fileId;
          s.baL().b(localg, new String[] { "localId" });
        }
        label765:
        w.e("MicroMsg.RecordMsgCDNService", "transfer error, mediaid=%s, retCode:%d", new Object[] { paramAnonymouskeep_SceneResult.mediaId, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
        if (-5103059 == paramAnonymouskeep_SceneResult.field_retCode) {}
        for (localg.field_status = 4;; localg.field_status = 3)
        {
          localg.field_errCode = paramAnonymouskeep_SceneResult.field_retCode;
          s.baL().b(localg, new String[] { "localId" });
          break;
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(7519413993472L, 56024);
        GMTrace.o(7519413993472L, 56024);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(7519548211200L, 56025);
        GMTrace.o(7519548211200L, 56025);
        return null;
      }
    };
    GMTrace.o(7514179502080L, 55985);
  }
  
  public final void a(g paramg, boolean paramBoolean)
  {
    GMTrace.i(7514447937536L, 55987);
    w.d("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, md5:%s, mediaId:%s, jobType[%d], jobStatus[%s]", new Object[] { paramg.field_dataId, paramg.field_mediaId, Integer.valueOf(paramg.field_type), Integer.valueOf(paramg.field_status) });
    com.tencent.mm.modelcdntran.i locali = new com.tencent.mm.modelcdntran.i();
    locali.gAB = this.gIz;
    locali.field_mediaId = paramg.field_mediaId;
    if (2 == paramg.field_type)
    {
      locali.eYr = true;
      locali.field_priority = b.gzc;
      locali.field_needStorage = false;
      locali.field_totalLen = paramg.field_totalLen;
      locali.field_aesKey = paramg.field_cdnKey;
      locali.field_fileId = paramg.field_cdnUrl;
      locali.gAB = this.gIz;
      locali.field_fullpath = paramg.field_path;
      locali.field_fileType = paramg.field_fileType;
      locali.field_talker = paramg.field_toUser;
      locali.field_force_aeskeycdn = false;
      locali.field_trysafecdn = true;
      locali.field_enable_hitcheck = paramBoolean;
      w.i("MicroMsg.RecordMsgCDNService", "summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b]", new Object[] { Boolean.valueOf(locali.field_force_aeskeycdn), Integer.valueOf(locali.field_fileType), locali.field_aesKey, locali.field_fileId, Boolean.valueOf(locali.field_force_aeskeycdn), Boolean.valueOf(locali.field_trysafecdn), Boolean.valueOf(locali.field_enable_hitcheck) });
      com.tencent.mm.modelcdntran.g.Gk().c(locali);
    }
    for (;;)
    {
      w.d("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, isSend:%B totallen:%d, aseKey:%s, url[%s], fullPath[%s], fileType[%d], enable_hitcheck[%b], force_aeskeycdn[%b]", new Object[] { Boolean.valueOf(locali.eYr), Integer.valueOf(locali.field_totalLen), locali.field_aesKey, locali.field_fileId, locali.field_fullpath, Integer.valueOf(locali.field_fileType), Boolean.valueOf(locali.field_enable_hitcheck), Boolean.valueOf(locali.field_force_aeskeycdn) });
      GMTrace.o(7514447937536L, 55987);
      return;
      locali.eYr = false;
      locali.field_priority = b.gzd;
      locali.field_needStorage = false;
      locali.field_totalLen = paramg.field_totalLen;
      locali.field_aesKey = paramg.field_cdnKey;
      locali.field_fileId = paramg.field_cdnUrl;
      locali.gAB = this.gIz;
      locali.field_fullpath = (paramg.field_path + ".temp");
      locali.field_fileType = paramg.field_fileType;
      com.tencent.mm.modelcdntran.g.Gk().b(locali, -1);
    }
  }
  
  protected final List<g> baG()
  {
    GMTrace.i(7514313719808L, 55986);
    Object localObject = s.baL();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((i)localObject).fTZ.a("SELECT * FROM RecordCDNInfo WHERE status != 3 AND status != 4 AND status != 2", null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        g localg = new g();
        localg.b((Cursor)localObject);
        localLinkedList.add(localg);
      }
      ((Cursor)localObject).close();
    }
    w.d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    w.d("MicroMsg.RecordMsgCDNService", "get to do jobs, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    GMTrace.o(7514313719808L, 55986);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */