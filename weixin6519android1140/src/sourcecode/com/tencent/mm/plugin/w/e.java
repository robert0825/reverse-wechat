package com.tencent.mm.plugin.w;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class e
  implements a.a, ap
{
  public static e nlC;
  public int eNf;
  private String fJS;
  private i.a gIz;
  public c nlD;
  public byte[] nlE;
  public String nlF;
  public String nlG;
  public int nlH;
  public long nlI;
  public long nlJ;
  public long nlK;
  public long nlL;
  public boolean nlM;
  public final com.tencent.mm.ad.e nlN;
  
  public e()
  {
    GMTrace.i(14716571222016L, 109647);
    this.nlD = new c();
    this.nlM = false;
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(16656285827072L, 124099);
        w.d("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdnCallback clientid:%s, startRet:%d proginfo:[%s], res:[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.d("MicroMsg.MsgSynchronizeServer", "msgSynchronize  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { paramAnonymousString });
          GMTrace.o(16656285827072L, 124099);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          w.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback startRet failed. clientid:%s, startRet:%d", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
          com.tencent.mm.plugin.report.service.g.ork.a(466L, 2L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.i(14108, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(e.this.eNf) });
          GMTrace.o(16656285827072L, 124099);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label332;
          }
          w.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback failed. sceneResult.retCode[%d], arg[%s], info[%s], clientid[%s], filemd5[%s]", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult.field_arg, paramAnonymouskeep_SceneResult.field_transInfo, paramAnonymousString, paramAnonymouskeep_SceneResult.field_filemd5 });
          com.tencent.mm.plugin.report.service.g.ork.a(466L, 2L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.i(14108, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(e.this.eNf) });
        }
        for (;;)
        {
          GMTrace.o(16656285827072L, 124099);
          return 0;
          label332:
          w.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback success. clientid[%s], filemd5[%s], isHitCacheUpload[%d]", new Object[] { paramAnonymousString, paramAnonymouskeep_SceneResult.field_filemd5, Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType) });
          paramAnonymousString = new PByteArray();
          if (!MMProtocalJni.rsaPublicEncryptPemkey(paramAnonymouskeep_SceneResult.field_aesKey.getBytes(), paramAnonymousString, e.this.nlE))
          {
            w.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize MMProtocalJni rsaPublicEncryptPemkey failed!");
            GMTrace.o(16656285827072L, 124099);
            return -1;
          }
          paramAnonymousString = bg.bs(paramAnonymousString.value);
          e.this.nlF = paramAnonymouskeep_SceneResult.field_fileId;
          e.this.nlG = paramAnonymousString;
          e.this.nlH = paramAnonymouskeep_SceneResult.field_fileLength;
          if (com.tencent.mm.kernel.a.fg(h.xw().fYb))
          {
            w.i("MicroMsg.MsgSynchronizeServer", "sendAppMsg immediately.");
            e.this.aQL();
          }
          else
          {
            w.i("MicroMsg.MsgSynchronizeServer", "wait getOnlineInfoExtDeviceOnlineListener to sendAppMsg.");
            at.AR();
            com.tencent.mm.y.c.a(e.this);
            e.this.nlM = true;
          }
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(16656420044800L, 124100);
        GMTrace.o(16656420044800L, 124100);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(16656554262528L, 124101);
        GMTrace.o(16656554262528L, 124101);
        return new byte[0];
      }
    };
    this.nlN = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(14714021085184L, 109628);
        at.wS().b(222, e.this.nlN);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize appmsg.  errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          com.tencent.mm.plugin.report.service.g.ork.a(466L, 3L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.i(14108, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(e.this.eNf) });
          GMTrace.o(14714021085184L, 109628);
          return;
        }
        w.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize success. ");
        com.tencent.mm.a.e.f(new File(f.aQN()));
        com.tencent.mm.a.e.f(new File(f.aQO()));
        long l = bg.aH(e.this.nlI);
        com.tencent.mm.plugin.report.service.g.ork.a(466L, 1L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(466L, 5L, e.this.nlL, false);
        com.tencent.mm.plugin.report.service.g.ork.a(466L, 7L, l, false);
        com.tencent.mm.plugin.report.service.g.ork.a(466L, 11L, e.this.nlK, false);
        com.tencent.mm.plugin.report.service.g.ork.a(466L, 12L, e.this.nlJ, false);
        com.tencent.mm.plugin.report.service.g.ork.i(14108, new Object[] { Long.valueOf(e.this.nlL), Long.valueOf(l), Long.valueOf(e.this.nlK), Long.valueOf(e.this.nlJ), Integer.valueOf(0), Integer.valueOf(e.this.eNf) });
        GMTrace.o(14714021085184L, 109628);
      }
    };
    GMTrace.o(14716571222016L, 109647);
  }
  
  public final void AI()
  {
    GMTrace.i(16096597901312L, 119929);
    w.i("MicroMsg.MsgSynchronizeServer", "receive onNotifyUserStatusChange, needWaitExtLoginCallback[%b], isWebWXOnline:[%b]", new Object[] { Boolean.valueOf(this.nlM), Boolean.valueOf(com.tencent.mm.kernel.a.fg(h.xw().fYb)) });
    if ((this.nlM) && (com.tencent.mm.kernel.a.fg(h.xw().fYb)))
    {
      w.i("MicroMsg.MsgSynchronizeServer", "onNotifyUserStatusChange need send msgSynchronize appMsg.");
      at.AR();
      com.tencent.mm.y.c.b(this);
      this.nlM = false;
      aQL();
    }
    GMTrace.o(16096597901312L, 119929);
  }
  
  public final void a(String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    GMTrace.i(14716705439744L, 109648);
    w.i("MicroMsg.MsgSynchronizeServer", "onMsgSynchronizePackFinish filePath:%s, conversationSize:%d", new Object[] { paramString1, Integer.valueOf(paramInt1) });
    this.nlJ = paramInt2;
    this.nlK = paramLong1;
    this.nlL = paramLong2;
    this.fJS = paramString2;
    paramString2 = "MSG_SYNCHRONIZE_" + paramInt1 + "_" + bg.Pv();
    i locali = new i();
    locali.gAB = this.gIz;
    locali.field_mediaId = paramString2;
    locali.field_fullpath = paramString1;
    locali.field_fileType = b.MediaType_FILE;
    locali.field_talker = ((String)com.tencent.mm.plugin.backup.g.a.afG().afH().xh().get(2, null));
    locali.field_priority = b.gzd;
    if (!com.tencent.mm.modelcdntran.g.Gk().c(locali))
    {
      w.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize addSendTask failed. clientid:%s", new Object[] { paramString2 });
      com.tencent.mm.plugin.report.service.g.ork.a(466L, 2L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.i(14108, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(this.eNf) });
    }
    GMTrace.o(14716705439744L, 109648);
  }
  
  public final void aQL()
  {
    GMTrace.i(16048279519232L, 119569);
    w.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize start send AppMsg.");
    at.wS().a(222, this.nlN);
    d locald = new d(this.nlF, this.nlG, this.nlH, this.fJS);
    at.wS().a(locald, 0);
    GMTrace.o(16048279519232L, 119569);
  }
  
  public final void aee()
  {
    GMTrace.i(14716839657472L, 109649);
    w.e("MicroMsg.MsgSynchronizeServer", "MsgSynchronizeServer cancel, Caller:%s", new Object[] { ah.bQk() });
    this.nlD.nlv = true;
    GMTrace.o(14716839657472L, 109649);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\w\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */