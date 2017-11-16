package com.tencent.mm.ao;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.t;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.j.a.a;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bma;
import com.tencent.mm.protocal.c.bmb;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.ja;
import com.tencent.mm.protocal.c.jb;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.be;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static boolean DEBUG;
  private static long gIQ;
  public String TAG;
  public au eAH;
  public float eMl;
  public String eTy;
  public long fUI;
  public int fUJ;
  private d fUK;
  private boolean fUQ;
  public final com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  public int gGV;
  public long gGZ;
  public String gIF;
  public String gIG;
  public boolean gIH;
  private d gII;
  private int gIJ;
  public b gIK;
  public String gIL;
  private boolean gIM;
  public float gIN;
  public String gIO;
  public String gIP;
  public final com.tencent.mm.ad.f gIl;
  public long gIm;
  private com.tencent.mm.modelstat.g gIo;
  public String gIp;
  public int gIq;
  private int gIt;
  private i.a gIz;
  public int scene;
  public int startOffset;
  public long startTime;
  
  static
  {
    GMTrace.i(3556769792000L, 26500);
    DEBUG = true;
    GMTrace.o(3556769792000L, 26500);
  }
  
  public k(int paramInt1, int paramInt2)
  {
    GMTrace.i(3549656252416L, 26447);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.gIF = "";
    this.gIG = "";
    this.gIH = true;
    this.gIJ = 16384;
    this.gGV = 0;
    this.eAH = null;
    this.gIo = null;
    this.gIp = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.gIq = 0;
    this.gIK = new b(null);
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3505901273088L, 26121);
        w.d(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.w(k.this.TAG, "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          k.this.fUd.a(3, paramAnonymousInt, "", k.this);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        long l1;
        long l2;
        int i;
        int j;
        int k;
        if (paramAnonymousInt != 0)
        {
          w.e(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt) });
          h.gv((int)k.this.gIm);
          h.gu((int)k.this.gIm);
          if (paramAnonymouskeep_SceneResult != null)
          {
            paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            localObject = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult != null) {
              break label428;
            }
          }
          label428:
          for (paramAnonymousString = "";; paramAnonymousString = k.kg(paramAnonymouskeep_SceneResult.report_Part2))
          {
            paramAnonymouskeep_ProgressInfo.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), localObject, "", "", "", "", "", "", "", paramAnonymousString });
            k.this.fUd.a(3, paramAnonymousInt, "", k.this);
            if (k.this.gIK != null) {
              k.this.gIK.IM();
            }
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
        }
        final Object localObject = k.this.IN();
        if ((localObject == null) || (((d)localObject).gGR != k.this.fUI))
        {
          com.tencent.mm.modelcdntran.g.Gk().jy(k.this.gIp);
          w.e(k.this.TAG, "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s", new Object[] { Long.valueOf(k.this.fUI), k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          k.this.a((d)localObject, paramAnonymouskeep_ProgressInfo.field_finishedLength, 0L, 0, paramAnonymouskeep_SceneResult);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i(k.this.TAG, "dkupimg sceneResult:%s", new Object[] { paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1443;
          }
          w.e(k.this.TAG, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 44425)
          {
            w.w(k.this.TAG, "summersafecdn cdntra  ERR_CDNCOM_SAFEPROTO_NOAESKEY clientid:%s, enableHitcheck:%b", new Object[] { k.this.gIp, Boolean.valueOf(k.this.gIH) });
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3557038227456L, 26502);
                k.this.gIH = false;
                k.this.startTime = 0L;
                k.this.startOffset = 0;
                Object localObject = k.this.IN();
                ((d)localObject).gk(0);
                k.this.eAH.E(bc.gR(k.this.eAH.field_talker));
                k.this.gIp = com.tencent.mm.modelcdntran.d.a("upimg", k.this.eAH.field_createTime, k.this.eAH.field_talker, k.this.eAH.field_msgId + "_" + k.this.fUI + "_" + k.this.gGV);
                boolean bool = k.this.a((d)localObject, 0, 0L, 0, paramAnonymouskeep_SceneResult);
                localObject = (bma)k.this.fUa.gtC.gtK;
                if (localObject == null) {
                  w.w(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again but old req is null");
                }
                for (;;)
                {
                  w.i(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again enableHitcheck[%b], ret[%b] new clientid[%s] createtime[%d]", new Object[] { Boolean.valueOf(k.this.gIH), Boolean.valueOf(bool), k.this.gIp, Long.valueOf(k.this.eAH.field_createTime) });
                  k.this.a(k.b(k.this), k.this.fUd);
                  GMTrace.o(3557038227456L, 26502);
                  return;
                  ((bma)localObject).uVR = new azq().Rq(k.this.gIp);
                }
              }
            });
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
          paramAnonymousString = null;
          if (!bg.bq(paramAnonymouskeep_SceneResult.field_sKeyrespbuf)) {
            paramAnonymousString = new bmb();
          }
        }
        for (;;)
        {
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
            h.gv((int)k.this.gIm);
            h.gu((int)k.this.gIm);
            localObject = com.tencent.mm.plugin.report.service.g.ork;
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            String str = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult == null)
            {
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              localObject = com.tencent.mm.plugin.report.service.g.ork;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
              l1 = k.this.startTime;
              l2 = bg.Pv();
              i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
              j = k.this.gIq;
              k = paramAnonymouskeep_SceneResult.field_fileLength;
              str = paramAnonymouskeep_SceneResult.field_transInfo;
              if (paramAnonymouskeep_SceneResult != null) {
                continue;
              }
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              if ((paramAnonymousString == null) || (paramAnonymousString.uND.tST == 0)) {
                continue;
              }
              k.this.fUd.a(4, paramAnonymousString.uND.tST, paramAnonymousString.uND.tTE.toString(), k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
            }
          }
          catch (IOException paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
          }
          catch (b.a.a.b paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse UninitializedMessageException: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
            continue;
          }
          label1443:
          w.i(k.this.TAG, "summersafecdn uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_needSendMsgField) });
          paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
          if (((d)localObject).cfz == 0)
          {
            paramAnonymousInt = 3;
            label1496:
            paramAnonymousString.i(13230, new Object[] { Integer.valueOf(paramAnonymousInt), k.this.gIF, Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType) });
            paramAnonymousString = k.this.gIL;
            if (!bg.nm(paramAnonymousString)) {
              break label1913;
            }
            paramAnonymousString = "<msg><img aeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnthumblength=\"" + paramAnonymouskeep_SceneResult.field_thumbimgLength + "\" ";
            paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
            if (paramAnonymouskeep_SceneResult.field_midimgLength != 0) {
              break label1904;
            }
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
            label1701:
            paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>";
            w.i(k.this.TAG, "cdn callback new build cdnInfo:%s", new Object[] { paramAnonymousString });
            label1751:
            paramAnonymouskeep_ProgressInfo = paramAnonymousString;
            if (paramAnonymouskeep_SceneResult.isUploadBySafeCDNWithMD5())
            {
              if (!bg.nm(k.this.gIP)) {
                break label2401;
              }
              w.w(k.this.TAG, "summersafecdn sceneResult isUploadBySafeCDNWithMD5 but prepareResponse AESKey is null");
            }
          }
          for (paramAnonymouskeep_ProgressInfo = paramAnonymousString;; paramAnonymouskeep_ProgressInfo = paramAnonymousString + "length=\"" + paramAnonymouskeep_SceneResult.field_midimgLength + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
          {
            ((d)localObject).kc(paramAnonymouskeep_ProgressInfo);
            if (k.this.gIm != k.this.fUI) {
              k.this.IO().kc(paramAnonymouskeep_ProgressInfo);
            }
            if (!paramAnonymouskeep_SceneResult.field_needSendMsgField) {
              break label2562;
            }
            com.tencent.mm.kernel.h.xx().fYr.a(new l(k.this.fUJ, (bma)k.this.fUa.gtC.gtK, (d)localObject, paramAnonymouskeep_SceneResult, new l.a()
            {
              public final void a(long paramAnonymous2Long, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
              {
                GMTrace.i(3541066317824L, 26383);
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int3), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
                w.i(k.this.TAG, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(paramAnonymous2Int3) });
                if ((paramAnonymous2Int2 != 0) || (paramAnonymous2Int3 != 0))
                {
                  h.gv((int)k.this.gIm);
                  h.gu((int)k.this.gIm);
                  k.this.fUd.a(paramAnonymous2Int2, paramAnonymous2Int3, "", k.this);
                  if (k.this.gIK != null) {
                    k.this.gIK.IM();
                  }
                  GMTrace.o(3541066317824L, 26383);
                  return;
                }
                k.this.a(localObject, localObject.gsL, paramAnonymous2Long, paramAnonymous2Int1, paramAnonymouskeep_SceneResult);
                GMTrace.o(3541066317824L, 26383);
              }
            }), 0);
            break;
            paramAnonymousInt = ((d)localObject).cfz;
            break label1496;
            label1904:
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
            break label1701;
            label1913:
            paramAnonymouskeep_ProgressInfo = bh.q(paramAnonymousString, "msg");
            if (paramAnonymouskeep_ProgressInfo == null) {
              break label1751;
            }
            if (((d)localObject).gGV == 0)
            {
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnbigimgurl") + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
              paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
              if (paramAnonymouskeep_SceneResult.field_midimgLength == 0) {
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
              }
            }
            label2119:
            for (paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$hdlength") + "\"/></msg>";; paramAnonymousString = paramAnonymousString + "length=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$length") + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
            {
              w.i(k.this.TAG, "cdn callback rebuild cdnInfo:%s", new Object[] { paramAnonymousString });
              break;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
              break label2119;
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnmidimgurl") + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
            }
            label2401:
            paramAnonymousString = "<msg><img aeskey=\"" + k.this.gIP + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + k.this.gIP + "\" ";
          }
          label2562:
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
          paramAnonymousString = new bmb();
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            if (paramAnonymousString.tQd != 0L) {}
            for (l1 = paramAnonymousString.tQd;; l1 = paramAnonymousInt)
            {
              w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
              k.this.a((d)localObject, ((d)localObject).gsL, l1, paramAnonymousString.nFd, paramAnonymouskeep_SceneResult);
              k.this.fUd.a(0, 0, "", k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
              paramAnonymousInt = paramAnonymousString.tPV;
            }
            if (k.this.gIK == null) {
              continue;
            }
          }
          catch (IOException paramAnonymousString)
          {
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymousString });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymousString) });
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
          }
          k.this.gIK.IM();
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(3506035490816L, 26122);
        Object localObject1 = (bma)k.this.fUa.gtC.gtK;
        ja localja = new ja();
        localja.tYu = ((bma)localObject1).uVR.uNR;
        localja.lSY = ((bma)localObject1).tPW.uNR;
        localja.lSX = ((bma)localObject1).tPX.uNR;
        localja.tYv = ((bma)localObject1).uVY;
        localja.tYw = ((bma)localObject1).uVZ;
        localja.tOG = k.this.scene;
        localja.tYy = k.this.gIN;
        localja.tYz = k.this.eMl;
        localja.tYA = k.this.gIO;
        localja.tQb = ((bma)localObject1).tQb;
        localja.tYF = k.this.gIG;
        localObject1 = k.this.IN();
        Object localObject2 = n.IZ().l(((d)localObject1).gGS, "", "");
        com.tencent.mm.modelcdntran.g.Gl();
        localja.tYH = com.tencent.mm.modelcdntran.b.ju((String)localObject2);
        localja.tYI = ((d)localObject1).gGW;
        int i;
        label298:
        String str;
        if (localja.tYI <= 0)
        {
          if (k.this.fUJ == 4)
          {
            i = 2;
            localja.tYI = i;
          }
        }
        else {
          switch (k.this.fUJ)
          {
          case 3: 
          case 5: 
          default: 
            localja.tQP = 2;
            if (localja.tYI == 3) {
              localja.tQP = 4;
            }
            w.i(k.this.TAG, "getCdnAuthInfo: mediaid:%s thumbwidth:%d, thumbheight:%d,MsgSource:%s,touser:%s aeskey[%s], imgLocalId[%d], msgLocalId[%d], getBigImgPath()[%s], fullpath[%s], prereq.CRC32[%d] prereq.MsgForwardType[%d], prereq.Source[%d]", new Object[] { paramAnonymousString, Integer.valueOf(localja.tYv), Integer.valueOf(localja.tYw), localja.tQb, localja.lSX, localja.tYF, Long.valueOf(k.this.fUI), Long.valueOf(k.this.gGZ), ((d)localObject1).gGS, localObject2, Integer.valueOf(localja.tYH), Integer.valueOf(localja.tYI), Integer.valueOf(localja.tQP) });
            paramAnonymousString = new b.a();
            paramAnonymousString.gtF = localja;
            paramAnonymousString.gtG = new bmb();
            paramAnonymousString.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
            paramAnonymousString.gtE = 625;
            paramAnonymousString.gtH = 9;
            paramAnonymousString.gtI = 1000000009;
            localObject1 = paramAnonymousString.DA();
            localObject2 = k.c(k.this).DY();
            str = k.this.TAG;
            if (localObject2 != null) {
              break;
            }
          }
        }
        for (paramAnonymousString = "acc == null";; paramAnonymousString = Boolean.valueOf(((com.tencent.mm.network.c)localObject2).DU()))
        {
          w.i(str, "getCdnAuthInfo login:%s", new Object[] { paramAnonymousString });
          if ((localObject2 == null) || (!((com.tencent.mm.network.c)localObject2).DU())) {
            break label737;
          }
          if (!com.tencent.mm.ad.r.a(((com.tencent.mm.network.c)localObject2).wR(), ((com.tencent.mm.network.c)localObject2).DT(), ((com.tencent.mm.network.c)localObject2).DV(), ((com.tencent.mm.ad.b)localObject1).DC(), paramAnonymousByteArrayOutputStream, ((com.tencent.mm.network.c)localObject2).DW())) {
            break label702;
          }
          w.d(k.this.TAG, "getCdnAuthInfo successed.clientimgid:%s", new Object[] { localja.tYu });
          GMTrace.o(3506035490816L, 26122);
          return;
          i = 1;
          break;
          localja.tQP = 1;
          break label298;
          localja.tQP = 3;
          break label298;
          localja.tQP = 5;
          break label298;
        }
        label702:
        w.e(k.this.TAG, "getCdnAuthInfo failed. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
        return;
        label737:
        w.e(k.this.TAG, "getCdnAuthInfo accinfo return null. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(3506169708544L, 26123);
        PInt localPInt = new PInt();
        jb localjb = new jb();
        try
        {
          paramAnonymousArrayOfByte = t.a(paramAnonymousArrayOfByte, com.tencent.mm.kernel.h.xx().fYr.gus.DY().wR(), localPInt, localjb);
          w.i(k.this.TAG, "decodePrepareResponse aeskey[%s], fileid[%s], clientimgid[%s]", new Object[] { localjb.tYF, localjb.tYJ, localjb.tYu });
          k.this.gIP = localjb.tYF;
          w.i(k.this.TAG, "decodePrepareResponse, clientmediaid:%s, ret:%d", new Object[] { paramAnonymousString, Integer.valueOf(localPInt.value) });
          GMTrace.o(3506169708544L, 26123);
          return paramAnonymousArrayOfByte;
        }
        catch (Exception paramAnonymousString)
        {
          w.e(k.this.TAG, "decodePrepareResponse Exception:%s", new Object[] { paramAnonymousString });
          k.this.gIP = null;
          GMTrace.o(3506169708544L, 26123);
        }
        return null;
      }
    };
    this.fUQ = false;
    w.i(this.TAG, "dkupimg init id:%d cmptype:%d  [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bg.bQW() });
    this.gIm = paramInt1;
    this.fUI = paramInt1;
    this.gGV = paramInt2;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bma();
    ((b.a)localObject1).gtG = new bmb();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
    ((b.a)localObject1).gtE = 110;
    ((b.a)localObject1).gtH = 9;
    ((b.a)localObject1).gtI = 1000000009;
    this.fUa = ((b.a)localObject1).DA();
    this.gIl = null;
    w.d(this.TAG, "FROM B SERVICE:" + this.gIm);
    if (!h.gt((int)this.gIm))
    {
      this.gIm = -1L;
      GMTrace.o(3549656252416L, 26447);
      return;
    }
    localObject1 = n.IZ().b(Long.valueOf(this.gIm));
    this.gGZ = ((d)localObject1).gGZ;
    if (paramInt2 == 1)
    {
      this.fUI = ((d)localObject1).gHb;
      localObject1 = n.IZ().b(Long.valueOf(this.fUI));
    }
    for (;;)
    {
      Object localObject2 = n.IZ().gs((int)((d)localObject1).gGR);
      if (localObject2 != null) {
        this.gGZ = ((d)localObject2).gGZ;
      }
      this.eAH = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(this.gGZ);
      if ((this.eAH != null) && (this.eAH.field_msgId != this.gGZ))
      {
        w.w(this.TAG, "init get msg by id failed:%d", new Object[] { Long.valueOf(this.gGZ) });
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 206L, 1L, false);
        this.eAH = null;
        GMTrace.o(3549656252416L, 26447);
        return;
      }
      if (this.eAH != null)
      {
        localObject2 = (bma)this.fUa.gtC.gtK;
        ((bma)localObject2).tPW = new azq().Rq(com.tencent.mm.y.q.zE());
        ((bma)localObject2).tPX = new azq().Rq(this.eAH.field_talker);
        ((bma)localObject2).tRD = ((d)localObject1).offset;
        ((bma)localObject2).tRC = ((d)localObject1).gsL;
        ((bma)localObject2).lQc = this.eAH.field_type;
        ((bma)localObject2).usj = paramInt2;
        if (!com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {
          break label735;
        }
      }
      label735:
      for (paramInt1 = 1;; paramInt1 = 2)
      {
        ((bma)localObject2).udE = paramInt1;
        ((bma)localObject2).uSf = ((d)localObject1).cfz;
        ((bma)localObject2).tYI = ((d)localObject1).gGW;
        ((bma)localObject2).tYI = ((d)localObject1).gGW;
        ((bma)localObject2).uVY = this.eAH.fwx;
        ((bma)localObject2).uVZ = this.eAH.fww;
        w.i(this.TAG, "LINE425 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(((bma)localObject2).uVY), Integer.valueOf(((bma)localObject2).uVZ) });
        w.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(((d)localObject1).cfz), Integer.valueOf(((bma)localObject2).tYI) });
        if (((d)localObject1).offset == 0) {
          this.gIo = new com.tencent.mm.modelstat.g(110, true, ((d)localObject1).gsL);
        }
        GMTrace.o(3549656252416L, 26447);
        return;
      }
    }
  }
  
  public k(int paramInt1, int paramInt2, byte paramByte)
  {
    GMTrace.i(3549790470144L, 26448);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.gIF = "";
    this.gIG = "";
    this.gIH = true;
    this.gIJ = 16384;
    this.gGV = 0;
    this.eAH = null;
    this.gIo = null;
    this.gIp = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.gIq = 0;
    this.gIK = new b(null);
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3505901273088L, 26121);
        w.d(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.w(k.this.TAG, "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          k.this.fUd.a(3, paramAnonymousInt, "", k.this);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        long l1;
        long l2;
        int i;
        int j;
        int k;
        if (paramAnonymousInt != 0)
        {
          w.e(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt) });
          h.gv((int)k.this.gIm);
          h.gu((int)k.this.gIm);
          if (paramAnonymouskeep_SceneResult != null)
          {
            paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            localObject = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult != null) {
              break label428;
            }
          }
          label428:
          for (paramAnonymousString = "";; paramAnonymousString = k.kg(paramAnonymouskeep_SceneResult.report_Part2))
          {
            paramAnonymouskeep_ProgressInfo.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), localObject, "", "", "", "", "", "", "", paramAnonymousString });
            k.this.fUd.a(3, paramAnonymousInt, "", k.this);
            if (k.this.gIK != null) {
              k.this.gIK.IM();
            }
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
        }
        final Object localObject = k.this.IN();
        if ((localObject == null) || (((d)localObject).gGR != k.this.fUI))
        {
          com.tencent.mm.modelcdntran.g.Gk().jy(k.this.gIp);
          w.e(k.this.TAG, "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s", new Object[] { Long.valueOf(k.this.fUI), k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          k.this.a((d)localObject, paramAnonymouskeep_ProgressInfo.field_finishedLength, 0L, 0, paramAnonymouskeep_SceneResult);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i(k.this.TAG, "dkupimg sceneResult:%s", new Object[] { paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1443;
          }
          w.e(k.this.TAG, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 44425)
          {
            w.w(k.this.TAG, "summersafecdn cdntra  ERR_CDNCOM_SAFEPROTO_NOAESKEY clientid:%s, enableHitcheck:%b", new Object[] { k.this.gIp, Boolean.valueOf(k.this.gIH) });
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3557038227456L, 26502);
                k.this.gIH = false;
                k.this.startTime = 0L;
                k.this.startOffset = 0;
                Object localObject = k.this.IN();
                ((d)localObject).gk(0);
                k.this.eAH.E(bc.gR(k.this.eAH.field_talker));
                k.this.gIp = com.tencent.mm.modelcdntran.d.a("upimg", k.this.eAH.field_createTime, k.this.eAH.field_talker, k.this.eAH.field_msgId + "_" + k.this.fUI + "_" + k.this.gGV);
                boolean bool = k.this.a((d)localObject, 0, 0L, 0, paramAnonymouskeep_SceneResult);
                localObject = (bma)k.this.fUa.gtC.gtK;
                if (localObject == null) {
                  w.w(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again but old req is null");
                }
                for (;;)
                {
                  w.i(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again enableHitcheck[%b], ret[%b] new clientid[%s] createtime[%d]", new Object[] { Boolean.valueOf(k.this.gIH), Boolean.valueOf(bool), k.this.gIp, Long.valueOf(k.this.eAH.field_createTime) });
                  k.this.a(k.b(k.this), k.this.fUd);
                  GMTrace.o(3557038227456L, 26502);
                  return;
                  ((bma)localObject).uVR = new azq().Rq(k.this.gIp);
                }
              }
            });
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
          paramAnonymousString = null;
          if (!bg.bq(paramAnonymouskeep_SceneResult.field_sKeyrespbuf)) {
            paramAnonymousString = new bmb();
          }
        }
        for (;;)
        {
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
            h.gv((int)k.this.gIm);
            h.gu((int)k.this.gIm);
            localObject = com.tencent.mm.plugin.report.service.g.ork;
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            String str = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult == null)
            {
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              localObject = com.tencent.mm.plugin.report.service.g.ork;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
              l1 = k.this.startTime;
              l2 = bg.Pv();
              i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
              j = k.this.gIq;
              k = paramAnonymouskeep_SceneResult.field_fileLength;
              str = paramAnonymouskeep_SceneResult.field_transInfo;
              if (paramAnonymouskeep_SceneResult != null) {
                continue;
              }
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              if ((paramAnonymousString == null) || (paramAnonymousString.uND.tST == 0)) {
                continue;
              }
              k.this.fUd.a(4, paramAnonymousString.uND.tST, paramAnonymousString.uND.tTE.toString(), k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
            }
          }
          catch (IOException paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
          }
          catch (b.a.a.b paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse UninitializedMessageException: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
            continue;
          }
          label1443:
          w.i(k.this.TAG, "summersafecdn uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_needSendMsgField) });
          paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
          if (((d)localObject).cfz == 0)
          {
            paramAnonymousInt = 3;
            label1496:
            paramAnonymousString.i(13230, new Object[] { Integer.valueOf(paramAnonymousInt), k.this.gIF, Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType) });
            paramAnonymousString = k.this.gIL;
            if (!bg.nm(paramAnonymousString)) {
              break label1913;
            }
            paramAnonymousString = "<msg><img aeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnthumblength=\"" + paramAnonymouskeep_SceneResult.field_thumbimgLength + "\" ";
            paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
            if (paramAnonymouskeep_SceneResult.field_midimgLength != 0) {
              break label1904;
            }
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
            label1701:
            paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>";
            w.i(k.this.TAG, "cdn callback new build cdnInfo:%s", new Object[] { paramAnonymousString });
            label1751:
            paramAnonymouskeep_ProgressInfo = paramAnonymousString;
            if (paramAnonymouskeep_SceneResult.isUploadBySafeCDNWithMD5())
            {
              if (!bg.nm(k.this.gIP)) {
                break label2401;
              }
              w.w(k.this.TAG, "summersafecdn sceneResult isUploadBySafeCDNWithMD5 but prepareResponse AESKey is null");
            }
          }
          for (paramAnonymouskeep_ProgressInfo = paramAnonymousString;; paramAnonymouskeep_ProgressInfo = paramAnonymousString + "length=\"" + paramAnonymouskeep_SceneResult.field_midimgLength + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
          {
            ((d)localObject).kc(paramAnonymouskeep_ProgressInfo);
            if (k.this.gIm != k.this.fUI) {
              k.this.IO().kc(paramAnonymouskeep_ProgressInfo);
            }
            if (!paramAnonymouskeep_SceneResult.field_needSendMsgField) {
              break label2562;
            }
            com.tencent.mm.kernel.h.xx().fYr.a(new l(k.this.fUJ, (bma)k.this.fUa.gtC.gtK, (d)localObject, paramAnonymouskeep_SceneResult, new l.a()
            {
              public final void a(long paramAnonymous2Long, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
              {
                GMTrace.i(3541066317824L, 26383);
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int3), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
                w.i(k.this.TAG, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(paramAnonymous2Int3) });
                if ((paramAnonymous2Int2 != 0) || (paramAnonymous2Int3 != 0))
                {
                  h.gv((int)k.this.gIm);
                  h.gu((int)k.this.gIm);
                  k.this.fUd.a(paramAnonymous2Int2, paramAnonymous2Int3, "", k.this);
                  if (k.this.gIK != null) {
                    k.this.gIK.IM();
                  }
                  GMTrace.o(3541066317824L, 26383);
                  return;
                }
                k.this.a(localObject, localObject.gsL, paramAnonymous2Long, paramAnonymous2Int1, paramAnonymouskeep_SceneResult);
                GMTrace.o(3541066317824L, 26383);
              }
            }), 0);
            break;
            paramAnonymousInt = ((d)localObject).cfz;
            break label1496;
            label1904:
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
            break label1701;
            label1913:
            paramAnonymouskeep_ProgressInfo = bh.q(paramAnonymousString, "msg");
            if (paramAnonymouskeep_ProgressInfo == null) {
              break label1751;
            }
            if (((d)localObject).gGV == 0)
            {
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnbigimgurl") + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
              paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
              if (paramAnonymouskeep_SceneResult.field_midimgLength == 0) {
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
              }
            }
            label2119:
            for (paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$hdlength") + "\"/></msg>";; paramAnonymousString = paramAnonymousString + "length=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$length") + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
            {
              w.i(k.this.TAG, "cdn callback rebuild cdnInfo:%s", new Object[] { paramAnonymousString });
              break;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
              break label2119;
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnmidimgurl") + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
            }
            label2401:
            paramAnonymousString = "<msg><img aeskey=\"" + k.this.gIP + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + k.this.gIP + "\" ";
          }
          label2562:
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
          paramAnonymousString = new bmb();
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            if (paramAnonymousString.tQd != 0L) {}
            for (l1 = paramAnonymousString.tQd;; l1 = paramAnonymousInt)
            {
              w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
              k.this.a((d)localObject, ((d)localObject).gsL, l1, paramAnonymousString.nFd, paramAnonymouskeep_SceneResult);
              k.this.fUd.a(0, 0, "", k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
              paramAnonymousInt = paramAnonymousString.tPV;
            }
            if (k.this.gIK == null) {
              continue;
            }
          }
          catch (IOException paramAnonymousString)
          {
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymousString });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymousString) });
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
          }
          k.this.gIK.IM();
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(3506035490816L, 26122);
        Object localObject1 = (bma)k.this.fUa.gtC.gtK;
        ja localja = new ja();
        localja.tYu = ((bma)localObject1).uVR.uNR;
        localja.lSY = ((bma)localObject1).tPW.uNR;
        localja.lSX = ((bma)localObject1).tPX.uNR;
        localja.tYv = ((bma)localObject1).uVY;
        localja.tYw = ((bma)localObject1).uVZ;
        localja.tOG = k.this.scene;
        localja.tYy = k.this.gIN;
        localja.tYz = k.this.eMl;
        localja.tYA = k.this.gIO;
        localja.tQb = ((bma)localObject1).tQb;
        localja.tYF = k.this.gIG;
        localObject1 = k.this.IN();
        Object localObject2 = n.IZ().l(((d)localObject1).gGS, "", "");
        com.tencent.mm.modelcdntran.g.Gl();
        localja.tYH = com.tencent.mm.modelcdntran.b.ju((String)localObject2);
        localja.tYI = ((d)localObject1).gGW;
        int i;
        label298:
        String str;
        if (localja.tYI <= 0)
        {
          if (k.this.fUJ == 4)
          {
            i = 2;
            localja.tYI = i;
          }
        }
        else {
          switch (k.this.fUJ)
          {
          case 3: 
          case 5: 
          default: 
            localja.tQP = 2;
            if (localja.tYI == 3) {
              localja.tQP = 4;
            }
            w.i(k.this.TAG, "getCdnAuthInfo: mediaid:%s thumbwidth:%d, thumbheight:%d,MsgSource:%s,touser:%s aeskey[%s], imgLocalId[%d], msgLocalId[%d], getBigImgPath()[%s], fullpath[%s], prereq.CRC32[%d] prereq.MsgForwardType[%d], prereq.Source[%d]", new Object[] { paramAnonymousString, Integer.valueOf(localja.tYv), Integer.valueOf(localja.tYw), localja.tQb, localja.lSX, localja.tYF, Long.valueOf(k.this.fUI), Long.valueOf(k.this.gGZ), ((d)localObject1).gGS, localObject2, Integer.valueOf(localja.tYH), Integer.valueOf(localja.tYI), Integer.valueOf(localja.tQP) });
            paramAnonymousString = new b.a();
            paramAnonymousString.gtF = localja;
            paramAnonymousString.gtG = new bmb();
            paramAnonymousString.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
            paramAnonymousString.gtE = 625;
            paramAnonymousString.gtH = 9;
            paramAnonymousString.gtI = 1000000009;
            localObject1 = paramAnonymousString.DA();
            localObject2 = k.c(k.this).DY();
            str = k.this.TAG;
            if (localObject2 != null) {
              break;
            }
          }
        }
        for (paramAnonymousString = "acc == null";; paramAnonymousString = Boolean.valueOf(((com.tencent.mm.network.c)localObject2).DU()))
        {
          w.i(str, "getCdnAuthInfo login:%s", new Object[] { paramAnonymousString });
          if ((localObject2 == null) || (!((com.tencent.mm.network.c)localObject2).DU())) {
            break label737;
          }
          if (!com.tencent.mm.ad.r.a(((com.tencent.mm.network.c)localObject2).wR(), ((com.tencent.mm.network.c)localObject2).DT(), ((com.tencent.mm.network.c)localObject2).DV(), ((com.tencent.mm.ad.b)localObject1).DC(), paramAnonymousByteArrayOutputStream, ((com.tencent.mm.network.c)localObject2).DW())) {
            break label702;
          }
          w.d(k.this.TAG, "getCdnAuthInfo successed.clientimgid:%s", new Object[] { localja.tYu });
          GMTrace.o(3506035490816L, 26122);
          return;
          i = 1;
          break;
          localja.tQP = 1;
          break label298;
          localja.tQP = 3;
          break label298;
          localja.tQP = 5;
          break label298;
        }
        label702:
        w.e(k.this.TAG, "getCdnAuthInfo failed. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
        return;
        label737:
        w.e(k.this.TAG, "getCdnAuthInfo accinfo return null. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(3506169708544L, 26123);
        PInt localPInt = new PInt();
        jb localjb = new jb();
        try
        {
          paramAnonymousArrayOfByte = t.a(paramAnonymousArrayOfByte, com.tencent.mm.kernel.h.xx().fYr.gus.DY().wR(), localPInt, localjb);
          w.i(k.this.TAG, "decodePrepareResponse aeskey[%s], fileid[%s], clientimgid[%s]", new Object[] { localjb.tYF, localjb.tYJ, localjb.tYu });
          k.this.gIP = localjb.tYF;
          w.i(k.this.TAG, "decodePrepareResponse, clientmediaid:%s, ret:%d", new Object[] { paramAnonymousString, Integer.valueOf(localPInt.value) });
          GMTrace.o(3506169708544L, 26123);
          return paramAnonymousArrayOfByte;
        }
        catch (Exception paramAnonymousString)
        {
          w.e(k.this.TAG, "decodePrepareResponse Exception:%s", new Object[] { paramAnonymousString });
          k.this.gIP = null;
          GMTrace.o(3506169708544L, 26123);
        }
        return null;
      }
    };
    this.fUQ = false;
    w.i(this.TAG, "dkupimg init id:%d cmptype:%d pro:%s  [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), null, bg.bQW() });
    this.gIm = paramInt1;
    this.fUI = paramInt1;
    this.gGV = paramInt2;
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bma();
    ((b.a)localObject1).gtG = new bmb();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
    ((b.a)localObject1).gtE = 110;
    ((b.a)localObject1).gtH = 9;
    ((b.a)localObject1).gtI = 1000000009;
    this.fUa = ((b.a)localObject1).DA();
    this.gIl = null;
    w.d(this.TAG, "FROM C SERVICE:" + this.gIm);
    if (!h.gt((int)this.gIm))
    {
      this.gIm = -1L;
      GMTrace.o(3549790470144L, 26448);
      return;
    }
    localObject1 = n.IZ().b(Long.valueOf(this.gIm));
    this.gGZ = ((d)localObject1).gGZ;
    ((d)localObject1).dB(0);
    ((d)localObject1).D(0L);
    ((d)localObject1).setOffset(0);
    n.IZ().a((int)this.fUI, (d)localObject1);
    if (paramInt2 == 1)
    {
      this.fUI = ((d)localObject1).gHb;
      localObject1 = n.IZ().b(Long.valueOf(this.fUI));
    }
    for (;;)
    {
      this.eAH = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(this.gGZ);
      Object localObject2;
      if (this.eAH != null)
      {
        this.eAH.dB(1);
        localObject2 = ((d)localObject1).gGU;
        if ((localObject2 == null) || (!((String)localObject2).startsWith("THUMBNAIL_DIRPATH://"))) {
          break label748;
        }
        this.eAH.dc((String)localObject2);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.gGZ, this.eAH);
        localObject2 = (bma)this.fUa.gtC.gtK;
        ((bma)localObject2).tPW = new azq().Rq(com.tencent.mm.y.q.zE());
        ((bma)localObject2).tPX = new azq().Rq(this.eAH.field_talker);
        ((bma)localObject2).tRD = ((d)localObject1).offset;
        ((bma)localObject2).tRC = ((d)localObject1).gsL;
        ((bma)localObject2).lQc = this.eAH.field_type;
        ((bma)localObject2).usj = paramInt2;
        if (!com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {
          break label779;
        }
      }
      label748:
      label779:
      for (paramInt1 = 1;; paramInt1 = 2)
      {
        ((bma)localObject2).udE = paramInt1;
        ((bma)localObject2).uSf = ((d)localObject1).cfz;
        ((bma)localObject2).tYI = ((d)localObject1).gGW;
        ((bma)localObject2).uVY = this.eAH.fwx;
        ((bma)localObject2).uVZ = this.eAH.fww;
        w.i(this.TAG, "LINE492 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(((bma)localObject2).uVY), Integer.valueOf(((bma)localObject2).uVZ) });
        w.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(((d)localObject1).cfz), Integer.valueOf(((bma)localObject2).tYI) });
        if (((d)localObject1).offset == 0) {
          this.gIo = new com.tencent.mm.modelstat.g(110, true, ((d)localObject1).gsL);
        }
        GMTrace.o(3549790470144L, 26448);
        return;
        this.eAH.dc("THUMBNAIL://" + ((d)localObject1).gGR);
        break;
      }
    }
  }
  
  public k(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.ad.f paramf, int paramInt3, a parama, int paramInt4)
  {
    this(3, paramString1, paramString2, paramString3, paramInt2, paramf, paramInt3, "", "", true, paramInt4);
    GMTrace.i(3548850946048L, 26441);
    this.gIK = new b(parama);
    GMTrace.o(3548850946048L, 26441);
  }
  
  public k(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.ad.f paramf, int paramInt3, String paramString4, String paramString5, boolean paramBoolean, int paramInt4)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramf, paramInt3, paramString4, paramString5, paramBoolean, paramInt4, 0, -1000.0F, -1000.0F);
    GMTrace.i(3549119381504L, 26443);
    GMTrace.o(3549119381504L, 26443);
  }
  
  public k(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, final com.tencent.mm.ad.f paramf, int paramInt3, String paramString4, String paramString5, boolean paramBoolean, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3549253599232L, 26444);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.gIF = "";
    this.gIG = "";
    this.gIH = true;
    this.gIJ = 16384;
    this.gGV = 0;
    this.eAH = null;
    this.gIo = null;
    this.gIp = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.gIq = 0;
    this.gIK = new b(null);
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3505901273088L, 26121);
        w.d(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.w(k.this.TAG, "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          k.this.fUd.a(3, paramAnonymousInt, "", k.this);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        long l1;
        long l2;
        int i;
        int j;
        int k;
        if (paramAnonymousInt != 0)
        {
          w.e(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt) });
          h.gv((int)k.this.gIm);
          h.gu((int)k.this.gIm);
          if (paramAnonymouskeep_SceneResult != null)
          {
            paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            localObject = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult != null) {
              break label428;
            }
          }
          label428:
          for (paramAnonymousString = "";; paramAnonymousString = k.kg(paramAnonymouskeep_SceneResult.report_Part2))
          {
            paramAnonymouskeep_ProgressInfo.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), localObject, "", "", "", "", "", "", "", paramAnonymousString });
            k.this.fUd.a(3, paramAnonymousInt, "", k.this);
            if (k.this.gIK != null) {
              k.this.gIK.IM();
            }
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
        }
        final Object localObject = k.this.IN();
        if ((localObject == null) || (((d)localObject).gGR != k.this.fUI))
        {
          com.tencent.mm.modelcdntran.g.Gk().jy(k.this.gIp);
          w.e(k.this.TAG, "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s", new Object[] { Long.valueOf(k.this.fUI), k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          k.this.a((d)localObject, paramAnonymouskeep_ProgressInfo.field_finishedLength, 0L, 0, paramAnonymouskeep_SceneResult);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i(k.this.TAG, "dkupimg sceneResult:%s", new Object[] { paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1443;
          }
          w.e(k.this.TAG, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 44425)
          {
            w.w(k.this.TAG, "summersafecdn cdntra  ERR_CDNCOM_SAFEPROTO_NOAESKEY clientid:%s, enableHitcheck:%b", new Object[] { k.this.gIp, Boolean.valueOf(k.this.gIH) });
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3557038227456L, 26502);
                k.this.gIH = false;
                k.this.startTime = 0L;
                k.this.startOffset = 0;
                Object localObject = k.this.IN();
                ((d)localObject).gk(0);
                k.this.eAH.E(bc.gR(k.this.eAH.field_talker));
                k.this.gIp = com.tencent.mm.modelcdntran.d.a("upimg", k.this.eAH.field_createTime, k.this.eAH.field_talker, k.this.eAH.field_msgId + "_" + k.this.fUI + "_" + k.this.gGV);
                boolean bool = k.this.a((d)localObject, 0, 0L, 0, paramAnonymouskeep_SceneResult);
                localObject = (bma)k.this.fUa.gtC.gtK;
                if (localObject == null) {
                  w.w(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again but old req is null");
                }
                for (;;)
                {
                  w.i(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again enableHitcheck[%b], ret[%b] new clientid[%s] createtime[%d]", new Object[] { Boolean.valueOf(k.this.gIH), Boolean.valueOf(bool), k.this.gIp, Long.valueOf(k.this.eAH.field_createTime) });
                  k.this.a(k.b(k.this), k.this.fUd);
                  GMTrace.o(3557038227456L, 26502);
                  return;
                  ((bma)localObject).uVR = new azq().Rq(k.this.gIp);
                }
              }
            });
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
          paramAnonymousString = null;
          if (!bg.bq(paramAnonymouskeep_SceneResult.field_sKeyrespbuf)) {
            paramAnonymousString = new bmb();
          }
        }
        for (;;)
        {
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
            h.gv((int)k.this.gIm);
            h.gu((int)k.this.gIm);
            localObject = com.tencent.mm.plugin.report.service.g.ork;
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            String str = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult == null)
            {
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              localObject = com.tencent.mm.plugin.report.service.g.ork;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
              l1 = k.this.startTime;
              l2 = bg.Pv();
              i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
              j = k.this.gIq;
              k = paramAnonymouskeep_SceneResult.field_fileLength;
              str = paramAnonymouskeep_SceneResult.field_transInfo;
              if (paramAnonymouskeep_SceneResult != null) {
                continue;
              }
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              if ((paramAnonymousString == null) || (paramAnonymousString.uND.tST == 0)) {
                continue;
              }
              k.this.fUd.a(4, paramAnonymousString.uND.tST, paramAnonymousString.uND.tTE.toString(), k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
            }
          }
          catch (IOException paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
          }
          catch (b.a.a.b paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse UninitializedMessageException: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
            continue;
          }
          label1443:
          w.i(k.this.TAG, "summersafecdn uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_needSendMsgField) });
          paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
          if (((d)localObject).cfz == 0)
          {
            paramAnonymousInt = 3;
            label1496:
            paramAnonymousString.i(13230, new Object[] { Integer.valueOf(paramAnonymousInt), k.this.gIF, Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType) });
            paramAnonymousString = k.this.gIL;
            if (!bg.nm(paramAnonymousString)) {
              break label1913;
            }
            paramAnonymousString = "<msg><img aeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnthumblength=\"" + paramAnonymouskeep_SceneResult.field_thumbimgLength + "\" ";
            paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
            if (paramAnonymouskeep_SceneResult.field_midimgLength != 0) {
              break label1904;
            }
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
            label1701:
            paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>";
            w.i(k.this.TAG, "cdn callback new build cdnInfo:%s", new Object[] { paramAnonymousString });
            label1751:
            paramAnonymouskeep_ProgressInfo = paramAnonymousString;
            if (paramAnonymouskeep_SceneResult.isUploadBySafeCDNWithMD5())
            {
              if (!bg.nm(k.this.gIP)) {
                break label2401;
              }
              w.w(k.this.TAG, "summersafecdn sceneResult isUploadBySafeCDNWithMD5 but prepareResponse AESKey is null");
            }
          }
          for (paramAnonymouskeep_ProgressInfo = paramAnonymousString;; paramAnonymouskeep_ProgressInfo = paramAnonymousString + "length=\"" + paramAnonymouskeep_SceneResult.field_midimgLength + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
          {
            ((d)localObject).kc(paramAnonymouskeep_ProgressInfo);
            if (k.this.gIm != k.this.fUI) {
              k.this.IO().kc(paramAnonymouskeep_ProgressInfo);
            }
            if (!paramAnonymouskeep_SceneResult.field_needSendMsgField) {
              break label2562;
            }
            com.tencent.mm.kernel.h.xx().fYr.a(new l(k.this.fUJ, (bma)k.this.fUa.gtC.gtK, (d)localObject, paramAnonymouskeep_SceneResult, new l.a()
            {
              public final void a(long paramAnonymous2Long, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
              {
                GMTrace.i(3541066317824L, 26383);
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int3), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
                w.i(k.this.TAG, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(paramAnonymous2Int3) });
                if ((paramAnonymous2Int2 != 0) || (paramAnonymous2Int3 != 0))
                {
                  h.gv((int)k.this.gIm);
                  h.gu((int)k.this.gIm);
                  k.this.fUd.a(paramAnonymous2Int2, paramAnonymous2Int3, "", k.this);
                  if (k.this.gIK != null) {
                    k.this.gIK.IM();
                  }
                  GMTrace.o(3541066317824L, 26383);
                  return;
                }
                k.this.a(localObject, localObject.gsL, paramAnonymous2Long, paramAnonymous2Int1, paramAnonymouskeep_SceneResult);
                GMTrace.o(3541066317824L, 26383);
              }
            }), 0);
            break;
            paramAnonymousInt = ((d)localObject).cfz;
            break label1496;
            label1904:
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
            break label1701;
            label1913:
            paramAnonymouskeep_ProgressInfo = bh.q(paramAnonymousString, "msg");
            if (paramAnonymouskeep_ProgressInfo == null) {
              break label1751;
            }
            if (((d)localObject).gGV == 0)
            {
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnbigimgurl") + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
              paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
              if (paramAnonymouskeep_SceneResult.field_midimgLength == 0) {
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
              }
            }
            label2119:
            for (paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$hdlength") + "\"/></msg>";; paramAnonymousString = paramAnonymousString + "length=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$length") + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
            {
              w.i(k.this.TAG, "cdn callback rebuild cdnInfo:%s", new Object[] { paramAnonymousString });
              break;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
              break label2119;
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnmidimgurl") + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
            }
            label2401:
            paramAnonymousString = "<msg><img aeskey=\"" + k.this.gIP + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + k.this.gIP + "\" ";
          }
          label2562:
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
          paramAnonymousString = new bmb();
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            if (paramAnonymousString.tQd != 0L) {}
            for (l1 = paramAnonymousString.tQd;; l1 = paramAnonymousInt)
            {
              w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
              k.this.a((d)localObject, ((d)localObject).gsL, l1, paramAnonymousString.nFd, paramAnonymouskeep_SceneResult);
              k.this.fUd.a(0, 0, "", k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
              paramAnonymousInt = paramAnonymousString.tPV;
            }
            if (k.this.gIK == null) {
              continue;
            }
          }
          catch (IOException paramAnonymousString)
          {
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymousString });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymousString) });
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
          }
          k.this.gIK.IM();
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(3506035490816L, 26122);
        Object localObject1 = (bma)k.this.fUa.gtC.gtK;
        ja localja = new ja();
        localja.tYu = ((bma)localObject1).uVR.uNR;
        localja.lSY = ((bma)localObject1).tPW.uNR;
        localja.lSX = ((bma)localObject1).tPX.uNR;
        localja.tYv = ((bma)localObject1).uVY;
        localja.tYw = ((bma)localObject1).uVZ;
        localja.tOG = k.this.scene;
        localja.tYy = k.this.gIN;
        localja.tYz = k.this.eMl;
        localja.tYA = k.this.gIO;
        localja.tQb = ((bma)localObject1).tQb;
        localja.tYF = k.this.gIG;
        localObject1 = k.this.IN();
        Object localObject2 = n.IZ().l(((d)localObject1).gGS, "", "");
        com.tencent.mm.modelcdntran.g.Gl();
        localja.tYH = com.tencent.mm.modelcdntran.b.ju((String)localObject2);
        localja.tYI = ((d)localObject1).gGW;
        int i;
        label298:
        String str;
        if (localja.tYI <= 0)
        {
          if (k.this.fUJ == 4)
          {
            i = 2;
            localja.tYI = i;
          }
        }
        else {
          switch (k.this.fUJ)
          {
          case 3: 
          case 5: 
          default: 
            localja.tQP = 2;
            if (localja.tYI == 3) {
              localja.tQP = 4;
            }
            w.i(k.this.TAG, "getCdnAuthInfo: mediaid:%s thumbwidth:%d, thumbheight:%d,MsgSource:%s,touser:%s aeskey[%s], imgLocalId[%d], msgLocalId[%d], getBigImgPath()[%s], fullpath[%s], prereq.CRC32[%d] prereq.MsgForwardType[%d], prereq.Source[%d]", new Object[] { paramAnonymousString, Integer.valueOf(localja.tYv), Integer.valueOf(localja.tYw), localja.tQb, localja.lSX, localja.tYF, Long.valueOf(k.this.fUI), Long.valueOf(k.this.gGZ), ((d)localObject1).gGS, localObject2, Integer.valueOf(localja.tYH), Integer.valueOf(localja.tYI), Integer.valueOf(localja.tQP) });
            paramAnonymousString = new b.a();
            paramAnonymousString.gtF = localja;
            paramAnonymousString.gtG = new bmb();
            paramAnonymousString.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
            paramAnonymousString.gtE = 625;
            paramAnonymousString.gtH = 9;
            paramAnonymousString.gtI = 1000000009;
            localObject1 = paramAnonymousString.DA();
            localObject2 = k.c(k.this).DY();
            str = k.this.TAG;
            if (localObject2 != null) {
              break;
            }
          }
        }
        for (paramAnonymousString = "acc == null";; paramAnonymousString = Boolean.valueOf(((com.tencent.mm.network.c)localObject2).DU()))
        {
          w.i(str, "getCdnAuthInfo login:%s", new Object[] { paramAnonymousString });
          if ((localObject2 == null) || (!((com.tencent.mm.network.c)localObject2).DU())) {
            break label737;
          }
          if (!com.tencent.mm.ad.r.a(((com.tencent.mm.network.c)localObject2).wR(), ((com.tencent.mm.network.c)localObject2).DT(), ((com.tencent.mm.network.c)localObject2).DV(), ((com.tencent.mm.ad.b)localObject1).DC(), paramAnonymousByteArrayOutputStream, ((com.tencent.mm.network.c)localObject2).DW())) {
            break label702;
          }
          w.d(k.this.TAG, "getCdnAuthInfo successed.clientimgid:%s", new Object[] { localja.tYu });
          GMTrace.o(3506035490816L, 26122);
          return;
          i = 1;
          break;
          localja.tQP = 1;
          break label298;
          localja.tQP = 3;
          break label298;
          localja.tQP = 5;
          break label298;
        }
        label702:
        w.e(k.this.TAG, "getCdnAuthInfo failed. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
        return;
        label737:
        w.e(k.this.TAG, "getCdnAuthInfo accinfo return null. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(3506169708544L, 26123);
        PInt localPInt = new PInt();
        jb localjb = new jb();
        try
        {
          paramAnonymousArrayOfByte = t.a(paramAnonymousArrayOfByte, com.tencent.mm.kernel.h.xx().fYr.gus.DY().wR(), localPInt, localjb);
          w.i(k.this.TAG, "decodePrepareResponse aeskey[%s], fileid[%s], clientimgid[%s]", new Object[] { localjb.tYF, localjb.tYJ, localjb.tYu });
          k.this.gIP = localjb.tYF;
          w.i(k.this.TAG, "decodePrepareResponse, clientmediaid:%s, ret:%d", new Object[] { paramAnonymousString, Integer.valueOf(localPInt.value) });
          GMTrace.o(3506169708544L, 26123);
          return paramAnonymousArrayOfByte;
        }
        catch (Exception paramAnonymousString)
        {
          w.e(k.this.TAG, "decodePrepareResponse Exception:%s", new Object[] { paramAnonymousString });
          k.this.gIP = null;
          GMTrace.o(3506169708544L, 26123);
        }
        return null;
      }
    };
    this.fUQ = false;
    w.i(this.TAG, "dkupimg init uploadsrc:%d from:%s to:%s ori:%s cmptype:%d prog:%s rotate:%d cdn:%s thumb:%s chatt:%b , res:%d run:%b [%s], scene: %d, longtitude: %f, latitude: %f", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, paramString3, Integer.valueOf(paramInt2), paramf, Integer.valueOf(paramInt3), paramString4, paramString5, Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt4), Boolean.valueOf(true), bg.bQW(), Integer.valueOf(paramInt5), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    this.gIM = paramBoolean;
    this.gIt = paramInt4;
    this.gIl = paramf;
    this.gGV = paramInt2;
    this.scene = paramInt5;
    this.eMl = paramFloat2;
    this.gIN = paramFloat1;
    this.fUJ = paramInt1;
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    this.gIL = paramString4;
    localPString.value = paramString5;
    this.gIm = n.IZ().a(paramString3, paramInt2, paramInt1, paramInt3, localPString, localPInt1, localPInt2);
    this.fUI = this.gIm;
    w.i(this.TAG, "FROM A UI :" + paramString2 + " " + this.gIm);
    if ((this.gIm < 0L) || (!h.gt((int)this.gIm)))
    {
      w.e(this.TAG, "insert to img storage failed id:" + this.gIm);
      this.gGZ = -1L;
      this.fUa = null;
      GMTrace.o(3549253599232L, 26444);
      return;
    }
    if (this.gIm >= 0L)
    {
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      paramString3 = new b.a();
      paramString3.gtF = new bma();
      paramString3.gtG = new bmb();
      paramString3.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
      paramString3.gtE = 110;
      paramString3.gtH = 9;
      paramString3.gtI = 1000000009;
      this.fUa = paramString3.DA();
      this.eTy = paramString2;
      this.eAH = new au();
      this.eAH.setType(s.gp(paramString2));
      this.eAH.db(paramString2);
      this.eAH.dC(1);
      this.eAH.dB(1);
      this.eAH.dc(localPString.value);
      this.eAH.dN(localPInt1.value);
      this.eAH.dO(localPInt2.value);
      this.eAH.E(bc.gR(this.eAH.field_talker));
      a.a.sa().b(this.eAH);
      this.gGZ = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P(this.eAH);
      if (this.gGZ < 0L) {
        break label1221;
      }
      paramBoolean = true;
      label704:
      Assert.assertTrue(paramBoolean);
      w.i(this.TAG, "NetSceneUploadMsgImg: local msgId = " + this.gGZ);
      paramString3 = IO();
      paramString3.an((int)this.gGZ);
      n.IZ().a(Long.valueOf(this.gIm), paramString3);
      if (paramInt2 != 1) {
        break label1238;
      }
      this.fUI = paramString3.gHb;
      paramString3 = IN();
    }
    label972:
    label1221:
    label1233:
    label1238:
    for (;;)
    {
      paramString3.gm(com.tencent.mm.a.e.aY(n.IZ().l(paramString3.gGS, "", "")));
      n.IZ().a(Long.valueOf(this.fUI), paramString3);
      w.i(this.TAG, "NetSceneUploadMsgImg: local imgId = " + this.fUI + " img len = " + paramString3.gsL);
      paramString4 = (bma)this.fUa.gtC.gtK;
      paramString4.tPW = new azq().Rq(paramString1);
      paramString4.tPX = new azq().Rq(paramString2);
      paramString4.tRD = paramString3.offset;
      paramString4.tRC = paramString3.gsL;
      paramString4.lQc = this.eAH.field_type;
      paramString4.usj = paramInt2;
      if (com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext()))
      {
        paramInt3 = 1;
        paramString4.udE = paramInt3;
        paramString4.uSf = paramString3.cfz;
        paramString4.tYI = paramString3.gGW;
        paramString4.uVY = localPInt2.value;
        paramString4.uVZ = localPInt1.value;
        w.i(this.TAG, "LINE237 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(paramString4.uVY), Integer.valueOf(paramString4.uVZ) });
        if (paramString4.tYI == 0) {
          if (paramInt1 != 4) {
            break label1233;
          }
        }
      }
      for (paramInt1 = 2;; paramInt1 = 1)
      {
        paramString4.tYI = paramInt1;
        w.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(paramString3.cfz), Integer.valueOf(paramString4.tYI) });
        if (paramString3.offset == 0) {
          this.gIo = new com.tencent.mm.modelstat.g(110, true, paramString3.gsL);
        }
        long l = System.currentTimeMillis();
        gw(paramInt2);
        w.d(this.TAG, "hy: create HDThumb using %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        if (paramf != null) {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3518920392704L, 26218);
              paramf.a(this.gIB, this.gIC, k.this);
              GMTrace.o(3518920392704L, 26218);
            }
          });
        }
        GMTrace.o(3549253599232L, 26444);
        return;
        paramBoolean = false;
        break;
        paramBoolean = false;
        break label704;
        paramInt3 = 2;
        break label972;
      }
    }
  }
  
  private k(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, com.tencent.mm.ad.f paramf, String paramString4, String paramString5)
  {
    this(4, paramString1, paramString2, paramString3, paramInt2, null, 0, paramString4, paramString5, false, -1);
    GMTrace.i(3548985163776L, 26442);
    GMTrace.o(3548985163776L, 26442);
  }
  
  public k(long paramLong, int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, final com.tencent.mm.ad.f paramf, int paramInt3, String paramString4, String paramString5, int paramInt4)
  {
    GMTrace.i(3549387816960L, 26445);
    this.TAG = "MicroMsg.NetSceneUploadMsgImg";
    this.gIF = "";
    this.gIG = "";
    this.gIH = true;
    this.gIJ = 16384;
    this.gGV = 0;
    this.eAH = null;
    this.gIo = null;
    this.gIp = "";
    this.startTime = 0L;
    this.startOffset = -1;
    this.gIq = 0;
    this.gIK = new b(null);
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, final keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3505901273088L, 26121);
        w.d(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt), paramAnonymouskeep_ProgressInfo, paramAnonymouskeep_SceneResult });
        if (paramAnonymousInt == 44531)
        {
          w.w(k.this.TAG, "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          k.this.fUd.a(3, paramAnonymousInt, "", k.this);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        long l1;
        long l2;
        int i;
        int j;
        int k;
        if (paramAnonymousInt != 0)
        {
          w.e(k.this.TAG, "cdntra cdnCallback clientid:%s startRet:%d", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymousInt) });
          h.gv((int)k.this.gIm);
          h.gu((int)k.this.gIm);
          if (paramAnonymouskeep_SceneResult != null)
          {
            paramAnonymouskeep_ProgressInfo = com.tencent.mm.plugin.report.service.g.ork;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            localObject = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult != null) {
              break label428;
            }
          }
          label428:
          for (paramAnonymousString = "";; paramAnonymousString = k.kg(paramAnonymouskeep_SceneResult.report_Part2))
          {
            paramAnonymouskeep_ProgressInfo.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), localObject, "", "", "", "", "", "", "", paramAnonymousString });
            k.this.fUd.a(3, paramAnonymousInt, "", k.this);
            if (k.this.gIK != null) {
              k.this.gIK.IM();
            }
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
        }
        final Object localObject = k.this.IN();
        if ((localObject == null) || (((d)localObject).gGR != k.this.fUI))
        {
          com.tencent.mm.modelcdntran.g.Gk().jy(k.this.gIp);
          w.e(k.this.TAG, "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s", new Object[] { Long.valueOf(k.this.fUI), k.this.gIp });
          if (k.this.gIK != null) {
            k.this.gIK.IM();
          }
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          k.this.a((d)localObject, paramAnonymouskeep_ProgressInfo.field_finishedLength, 0L, 0, paramAnonymouskeep_SceneResult);
          GMTrace.o(3505901273088L, 26121);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          w.i(k.this.TAG, "dkupimg sceneResult:%s", new Object[] { paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label1443;
          }
          w.e(k.this.TAG, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
          if (paramAnonymouskeep_SceneResult.field_retCode == 44425)
          {
            w.w(k.this.TAG, "summersafecdn cdntra  ERR_CDNCOM_SAFEPROTO_NOAESKEY clientid:%s, enableHitcheck:%b", new Object[] { k.this.gIp, Boolean.valueOf(k.this.gIH) });
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3557038227456L, 26502);
                k.this.gIH = false;
                k.this.startTime = 0L;
                k.this.startOffset = 0;
                Object localObject = k.this.IN();
                ((d)localObject).gk(0);
                k.this.eAH.E(bc.gR(k.this.eAH.field_talker));
                k.this.gIp = com.tencent.mm.modelcdntran.d.a("upimg", k.this.eAH.field_createTime, k.this.eAH.field_talker, k.this.eAH.field_msgId + "_" + k.this.fUI + "_" + k.this.gGV);
                boolean bool = k.this.a((d)localObject, 0, 0L, 0, paramAnonymouskeep_SceneResult);
                localObject = (bma)k.this.fUa.gtC.gtK;
                if (localObject == null) {
                  w.w(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again but old req is null");
                }
                for (;;)
                {
                  w.i(k.this.TAG, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again enableHitcheck[%b], ret[%b] new clientid[%s] createtime[%d]", new Object[] { Boolean.valueOf(k.this.gIH), Boolean.valueOf(bool), k.this.gIp, Long.valueOf(k.this.eAH.field_createTime) });
                  k.this.a(k.b(k.this), k.this.fUd);
                  GMTrace.o(3557038227456L, 26502);
                  return;
                  ((bma)localObject).uVR = new azq().Rq(k.this.gIp);
                }
              }
            });
            GMTrace.o(3505901273088L, 26121);
            return 0;
          }
          paramAnonymousString = null;
          if (!bg.bq(paramAnonymouskeep_SceneResult.field_sKeyrespbuf)) {
            paramAnonymousString = new bmb();
          }
        }
        for (;;)
        {
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
            h.gv((int)k.this.gIm);
            h.gu((int)k.this.gIm);
            localObject = com.tencent.mm.plugin.report.service.g.ork;
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
            l1 = k.this.startTime;
            l2 = bg.Pv();
            i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
            j = k.this.gIq;
            k = paramAnonymouskeep_SceneResult.field_fileLength;
            String str = paramAnonymouskeep_SceneResult.field_transInfo;
            if (paramAnonymouskeep_SceneResult == null)
            {
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              localObject = com.tencent.mm.plugin.report.service.g.ork;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
              l1 = k.this.startTime;
              l2 = bg.Pv();
              i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
              j = k.this.gIq;
              k = paramAnonymouskeep_SceneResult.field_fileLength;
              str = paramAnonymouskeep_SceneResult.field_transInfo;
              if (paramAnonymouskeep_SceneResult != null) {
                continue;
              }
              paramAnonymouskeep_ProgressInfo = "";
              ((com.tencent.mm.plugin.report.service.g)localObject).i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(1), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), str, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
              if ((paramAnonymousString == null) || (paramAnonymousString.uND.tST == 0)) {
                continue;
              }
              k.this.fUd.a(4, paramAnonymousString.uND.tST, paramAnonymousString.uND.tTE.toString(), k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
            }
          }
          catch (IOException paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
          }
          catch (b.a.a.b paramAnonymouskeep_ProgressInfo)
          {
            paramAnonymousString = null;
            w.e(k.this.TAG, "UploadMsgImgResponse parse UninitializedMessageException: %s", new Object[] { paramAnonymouskeep_ProgressInfo });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymouskeep_ProgressInfo) });
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            paramAnonymouskeep_ProgressInfo = k.kg(paramAnonymouskeep_SceneResult.report_Part2);
            continue;
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
            continue;
          }
          label1443:
          w.i(k.this.TAG, "summersafecdn uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType), Boolean.valueOf(paramAnonymouskeep_SceneResult.field_needSendMsgField) });
          paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
          if (((d)localObject).cfz == 0)
          {
            paramAnonymousInt = 3;
            label1496:
            paramAnonymousString.i(13230, new Object[] { Integer.valueOf(paramAnonymousInt), k.this.gIF, Integer.valueOf(paramAnonymouskeep_SceneResult.field_UploadHitCacheType) });
            paramAnonymousString = k.this.gIL;
            if (!bg.nm(paramAnonymousString)) {
              break label1913;
            }
            paramAnonymousString = "<msg><img aeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + paramAnonymouskeep_SceneResult.field_aesKey + "\" cdnthumblength=\"" + paramAnonymouskeep_SceneResult.field_thumbimgLength + "\" ";
            paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
            if (paramAnonymouskeep_SceneResult.field_midimgLength != 0) {
              break label1904;
            }
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
            label1701:
            paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>";
            w.i(k.this.TAG, "cdn callback new build cdnInfo:%s", new Object[] { paramAnonymousString });
            label1751:
            paramAnonymouskeep_ProgressInfo = paramAnonymousString;
            if (paramAnonymouskeep_SceneResult.isUploadBySafeCDNWithMD5())
            {
              if (!bg.nm(k.this.gIP)) {
                break label2401;
              }
              w.w(k.this.TAG, "summersafecdn sceneResult isUploadBySafeCDNWithMD5 but prepareResponse AESKey is null");
            }
          }
          for (paramAnonymouskeep_ProgressInfo = paramAnonymousString;; paramAnonymouskeep_ProgressInfo = paramAnonymousString + "length=\"" + paramAnonymouskeep_SceneResult.field_midimgLength + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
          {
            ((d)localObject).kc(paramAnonymouskeep_ProgressInfo);
            if (k.this.gIm != k.this.fUI) {
              k.this.IO().kc(paramAnonymouskeep_ProgressInfo);
            }
            if (!paramAnonymouskeep_SceneResult.field_needSendMsgField) {
              break label2562;
            }
            com.tencent.mm.kernel.h.xx().fYr.a(new l(k.this.fUJ, (bma)k.this.fUa.gtC.gtK, (d)localObject, paramAnonymouskeep_SceneResult, new l.a()
            {
              public final void a(long paramAnonymous2Long, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
              {
                GMTrace.i(3541066317824L, 26383);
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymous2Int3), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
                w.i(k.this.TAG, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", new Object[] { k.this.gIp, Integer.valueOf(paramAnonymous2Int2), Integer.valueOf(paramAnonymous2Int3) });
                if ((paramAnonymous2Int2 != 0) || (paramAnonymous2Int3 != 0))
                {
                  h.gv((int)k.this.gIm);
                  h.gu((int)k.this.gIm);
                  k.this.fUd.a(paramAnonymous2Int2, paramAnonymous2Int3, "", k.this);
                  if (k.this.gIK != null) {
                    k.this.gIK.IM();
                  }
                  GMTrace.o(3541066317824L, 26383);
                  return;
                }
                k.this.a(localObject, localObject.gsL, paramAnonymous2Long, paramAnonymous2Int1, paramAnonymouskeep_SceneResult);
                GMTrace.o(3541066317824L, 26383);
              }
            }), 0);
            break;
            paramAnonymousInt = ((d)localObject).cfz;
            break label1496;
            label1904:
            paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
            break label1701;
            label1913:
            paramAnonymouskeep_ProgressInfo = bh.q(paramAnonymousString, "msg");
            if (paramAnonymouskeep_ProgressInfo == null) {
              break label1751;
            }
            if (((d)localObject).gGV == 0)
            {
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnbigimgurl") + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
              paramAnonymousString = new StringBuilder().append(paramAnonymousString).append("length=\"");
              if (paramAnonymouskeep_SceneResult.field_midimgLength == 0) {
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_fileLength;
              }
            }
            label2119:
            for (paramAnonymousString = paramAnonymousInt + "\" hdlength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$hdlength") + "\"/></msg>";; paramAnonymousString = paramAnonymousString + "length=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$length") + "\" hdlength=\"" + paramAnonymouskeep_SceneResult.field_fileLength + "\"/></msg>")
            {
              w.i(k.this.TAG, "cdn callback rebuild cdnInfo:%s", new Object[] { paramAnonymousString });
              break;
              paramAnonymousInt = paramAnonymouskeep_SceneResult.field_midimgLength;
              break label2119;
              paramAnonymousString = "<msg><img aeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$aeskey") + "\" cdnmidimgurl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnmidimgurl") + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
              paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumburl") + "\" cdnthumbaeskey=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.$cdnthumbaeskey") + "\" cdnthumblength=\"" + (String)paramAnonymouskeep_ProgressInfo.get(".msg.img.cdnthumblength") + "\" ";
            }
            label2401:
            paramAnonymousString = "<msg><img aeskey=\"" + k.this.gIP + "\" cdnmidimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" ";
            paramAnonymousString = paramAnonymousString + "cdnthumburl=\"" + paramAnonymouskeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + k.this.gIP + "\" ";
          }
          label2562:
          com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(k.this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(k.this.gIq), Integer.valueOf(paramAnonymouskeep_SceneResult.field_fileLength), paramAnonymouskeep_SceneResult.field_transInfo, "", "", "", "", "", "", "", k.kg(paramAnonymouskeep_SceneResult.report_Part2) });
          paramAnonymousString = new bmb();
          try
          {
            paramAnonymousString.aD(paramAnonymouskeep_SceneResult.field_sKeyrespbuf);
            if (paramAnonymousString.tQd != 0L) {}
            for (l1 = paramAnonymousString.tQd;; l1 = paramAnonymousInt)
            {
              w.d(k.this.TAG, "parse skeyrespbuf: ret:%d,msg:%s", new Object[] { Integer.valueOf(paramAnonymousString.uND.tST), paramAnonymousString.uND.tTE.toString() });
              k.this.a((d)localObject, ((d)localObject).gsL, l1, paramAnonymousString.nFd, paramAnonymouskeep_SceneResult);
              k.this.fUd.a(0, 0, "", k.this);
              if (k.this.gIK != null) {
                k.this.gIK.IM();
              }
              GMTrace.o(3505901273088L, 26121);
              return 0;
              paramAnonymousInt = paramAnonymousString.tPV;
            }
            if (k.this.gIK == null) {
              continue;
            }
          }
          catch (IOException paramAnonymousString)
          {
            w.e(k.this.TAG, "UploadMsgImgResponse parse fail: %s", new Object[] { paramAnonymousString });
            w.e(k.this.TAG, "exception:%s", new Object[] { bg.f(paramAnonymousString) });
            k.this.fUd.a(3, paramAnonymouskeep_SceneResult.field_retCode, "", k.this);
          }
          k.this.gIK.IM();
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(3506035490816L, 26122);
        Object localObject1 = (bma)k.this.fUa.gtC.gtK;
        ja localja = new ja();
        localja.tYu = ((bma)localObject1).uVR.uNR;
        localja.lSY = ((bma)localObject1).tPW.uNR;
        localja.lSX = ((bma)localObject1).tPX.uNR;
        localja.tYv = ((bma)localObject1).uVY;
        localja.tYw = ((bma)localObject1).uVZ;
        localja.tOG = k.this.scene;
        localja.tYy = k.this.gIN;
        localja.tYz = k.this.eMl;
        localja.tYA = k.this.gIO;
        localja.tQb = ((bma)localObject1).tQb;
        localja.tYF = k.this.gIG;
        localObject1 = k.this.IN();
        Object localObject2 = n.IZ().l(((d)localObject1).gGS, "", "");
        com.tencent.mm.modelcdntran.g.Gl();
        localja.tYH = com.tencent.mm.modelcdntran.b.ju((String)localObject2);
        localja.tYI = ((d)localObject1).gGW;
        int i;
        label298:
        String str;
        if (localja.tYI <= 0)
        {
          if (k.this.fUJ == 4)
          {
            i = 2;
            localja.tYI = i;
          }
        }
        else {
          switch (k.this.fUJ)
          {
          case 3: 
          case 5: 
          default: 
            localja.tQP = 2;
            if (localja.tYI == 3) {
              localja.tQP = 4;
            }
            w.i(k.this.TAG, "getCdnAuthInfo: mediaid:%s thumbwidth:%d, thumbheight:%d,MsgSource:%s,touser:%s aeskey[%s], imgLocalId[%d], msgLocalId[%d], getBigImgPath()[%s], fullpath[%s], prereq.CRC32[%d] prereq.MsgForwardType[%d], prereq.Source[%d]", new Object[] { paramAnonymousString, Integer.valueOf(localja.tYv), Integer.valueOf(localja.tYw), localja.tQb, localja.lSX, localja.tYF, Long.valueOf(k.this.fUI), Long.valueOf(k.this.gGZ), ((d)localObject1).gGS, localObject2, Integer.valueOf(localja.tYH), Integer.valueOf(localja.tYI), Integer.valueOf(localja.tQP) });
            paramAnonymousString = new b.a();
            paramAnonymousString.gtF = localja;
            paramAnonymousString.gtG = new bmb();
            paramAnonymousString.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
            paramAnonymousString.gtE = 625;
            paramAnonymousString.gtH = 9;
            paramAnonymousString.gtI = 1000000009;
            localObject1 = paramAnonymousString.DA();
            localObject2 = k.c(k.this).DY();
            str = k.this.TAG;
            if (localObject2 != null) {
              break;
            }
          }
        }
        for (paramAnonymousString = "acc == null";; paramAnonymousString = Boolean.valueOf(((com.tencent.mm.network.c)localObject2).DU()))
        {
          w.i(str, "getCdnAuthInfo login:%s", new Object[] { paramAnonymousString });
          if ((localObject2 == null) || (!((com.tencent.mm.network.c)localObject2).DU())) {
            break label737;
          }
          if (!com.tencent.mm.ad.r.a(((com.tencent.mm.network.c)localObject2).wR(), ((com.tencent.mm.network.c)localObject2).DT(), ((com.tencent.mm.network.c)localObject2).DV(), ((com.tencent.mm.ad.b)localObject1).DC(), paramAnonymousByteArrayOutputStream, ((com.tencent.mm.network.c)localObject2).DW())) {
            break label702;
          }
          w.d(k.this.TAG, "getCdnAuthInfo successed.clientimgid:%s", new Object[] { localja.tYu });
          GMTrace.o(3506035490816L, 26122);
          return;
          i = 1;
          break;
          localja.tQP = 1;
          break label298;
          localja.tQP = 3;
          break label298;
          localja.tQP = 5;
          break label298;
        }
        label702:
        w.e(k.this.TAG, "getCdnAuthInfo failed. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
        return;
        label737:
        w.e(k.this.TAG, "getCdnAuthInfo accinfo return null. clientimgid:%s", new Object[] { localja.tYu });
        GMTrace.o(3506035490816L, 26122);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(3506169708544L, 26123);
        PInt localPInt = new PInt();
        jb localjb = new jb();
        try
        {
          paramAnonymousArrayOfByte = t.a(paramAnonymousArrayOfByte, com.tencent.mm.kernel.h.xx().fYr.gus.DY().wR(), localPInt, localjb);
          w.i(k.this.TAG, "decodePrepareResponse aeskey[%s], fileid[%s], clientimgid[%s]", new Object[] { localjb.tYF, localjb.tYJ, localjb.tYu });
          k.this.gIP = localjb.tYF;
          w.i(k.this.TAG, "decodePrepareResponse, clientmediaid:%s, ret:%d", new Object[] { paramAnonymousString, Integer.valueOf(localPInt.value) });
          GMTrace.o(3506169708544L, 26123);
          return paramAnonymousArrayOfByte;
        }
        catch (Exception paramAnonymousString)
        {
          w.e(k.this.TAG, "decodePrepareResponse Exception:%s", new Object[] { paramAnonymousString });
          k.this.gIP = null;
          GMTrace.o(3506169708544L, 26123);
        }
        return null;
      }
    };
    this.fUQ = false;
    w.i(this.TAG, "dkupimg init id:%d uploadsrc:%d from:%s to:%s ori:%s cmptype:%d prog:%s rotate:%d cdn:%s thumb:%s chatt:%b , res:%d run:%b [%s]", new Object[] { Long.valueOf(paramLong), Integer.valueOf(3), paramString1, paramString2, paramString3, Integer.valueOf(paramInt2), paramf, Integer.valueOf(paramInt3), paramString4, paramString5, Boolean.valueOf(true), Integer.valueOf(paramInt4), Boolean.valueOf(true), bg.bQW() });
    this.gIM = true;
    this.gIt = paramInt4;
    this.gIl = paramf;
    this.gGV = paramInt2;
    this.fUJ = 3;
    paramString5 = new PInt();
    PInt localPInt = new PInt();
    this.gIL = paramString4;
    this.gIm = paramLong;
    this.fUI = this.gIm;
    paramString3 = IO();
    this.eAH = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramString3.gGZ);
    this.gGZ = this.eAH.field_msgId;
    localPInt.value = this.eAH.fwx;
    paramString5.value = this.eAH.fww;
    if (paramInt2 == 1)
    {
      this.fUI = paramString3.gHb;
      this.fUK = null;
      paramString3 = IN();
    }
    for (;;)
    {
      if (!this.eAH.field_talker.equals(paramString2))
      {
        w.e(this.TAG, "fatal!! Send user mis-match, want:%s, fact:%s", new Object[] { paramString2, this.eAH.field_talker });
        com.tencent.mm.plugin.report.service.g.ork.a(594L, 4L, 1L, true);
      }
      for (paramString4 = this.eAH.field_talker;; paramString4 = paramString2)
      {
        w.i(this.TAG, "NetSceneUploadMsgImg: local msgId = " + this.eAH.field_msgId);
        w.d(this.TAG, "FROM A UI :" + paramString2 + "   msg:" + paramString4 + this.gIm);
        if ((this.gIm < 0L) || (!h.gt((int)this.gIm)))
        {
          w.e(this.TAG, "insert to img storage failed id:" + this.gIm);
          this.gGZ = -1L;
          this.fUa = null;
          GMTrace.o(3549387816960L, 26445);
          return;
        }
        boolean bool;
        if (this.gIm >= 0L)
        {
          bool = true;
          Assert.assertTrue(bool);
          paramString2 = new b.a();
          paramString2.gtF = new bma();
          paramString2.gtG = new bmb();
          paramString2.uri = "/cgi-bin/micromsg-bin/uploadmsgimg";
          paramString2.gtE = 110;
          paramString2.gtH = 9;
          paramString2.gtI = 1000000009;
          this.fUa = paramString2.DA();
          w.i(this.TAG, "NetSceneUploadMsgImg: local imgId = " + this.fUI + " img len = " + paramString3.gsL);
          paramString2 = (bma)this.fUa.gtC.gtK;
          paramString2.tPW = new azq().Rq(paramString1);
          paramString2.tPX = new azq().Rq(paramString4);
          paramString2.tRD = paramString3.offset;
          paramString2.tRC = paramString3.gsL;
          paramString2.lQc = this.eAH.field_type;
          paramString2.usj = paramInt2;
          if (!com.tencent.mm.network.ab.bv(com.tencent.mm.sdk.platformtools.ab.getContext())) {
            break label1024;
          }
        }
        label1024:
        for (paramInt1 = 1;; paramInt1 = 2)
        {
          paramString2.udE = paramInt1;
          paramString2.uSf = paramString3.cfz;
          paramString2.tYI = paramString3.gGW;
          paramString2.uVY = localPInt.value;
          paramString2.uVZ = paramString5.value;
          w.i(this.TAG, "LINE350 thumb.width:%d,thumb.height:%d", new Object[] { Integer.valueOf(paramString2.uVY), Integer.valueOf(paramString2.uVZ) });
          if (paramString2.tYI == 0) {
            paramString2.tYI = 1;
          }
          w.d(this.TAG, "dkimgsource: %d, forwardtype:%d", new Object[] { Integer.valueOf(paramString3.cfz), Integer.valueOf(paramString2.tYI) });
          if (paramString3.offset == 0) {
            this.gIo = new com.tencent.mm.modelstat.g(110, true, paramString3.gsL);
          }
          if (paramf != null) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3538247745536L, 26362);
                paramf.a(this.gIB, this.gIC, k.this);
                GMTrace.o(3538247745536L, 26362);
              }
            });
          }
          GMTrace.o(3549387816960L, 26445);
          return;
          bool = false;
          break;
        }
      }
    }
  }
  
  public k(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(4, paramString1, paramString2, paramString3, paramInt, null, "", "");
    GMTrace.i(3548716728320L, 26440);
    GMTrace.o(3548716728320L, 26440);
  }
  
  public static void as(long paramLong)
  {
    GMTrace.i(3550998429696L, 26457);
    gIQ = paramLong;
    GMTrace.o(3550998429696L, 26457);
  }
  
  private int gx(int paramInt)
  {
    GMTrace.i(3550193123328L, 26451);
    w.e(this.TAG, "do Scene error code : " + paramInt + " hashcode : " + hashCode());
    if (this.gIK != null) {
      this.gIK.IM();
    }
    GMTrace.o(3550193123328L, 26451);
    return -1;
  }
  
  public static String kg(String paramString)
  {
    GMTrace.i(3551132647424L, 26458);
    try
    {
      boolean bool = bg.nm(paramString);
      if (bool)
      {
        GMTrace.o(3551132647424L, 26458);
        return paramString;
      }
      Object localObject = paramString.split(",");
      if ((localObject != null) && (localObject.length > 19))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        long l = gIQ;
        gIQ = -1L;
        localObject[19] = l;
        localObject = bg.c(bg.g((String[])localObject), ",");
        GMTrace.o(3551132647424L, 26458);
        return (String)localObject;
      }
      GMTrace.o(3551132647424L, 26458);
      return paramString;
    }
    catch (Exception localException)
    {
      GMTrace.o(3551132647424L, 26458);
    }
    return paramString;
  }
  
  public final d IN()
  {
    GMTrace.i(3548448292864L, 26438);
    if (this.fUK == null) {
      this.fUK = n.IZ().b(Long.valueOf(this.fUI));
    }
    d locald = this.fUK;
    GMTrace.o(3548448292864L, 26438);
    return locald;
  }
  
  public final d IO()
  {
    GMTrace.i(3548582510592L, 26439);
    if (this.gII == null) {
      this.gII = n.IZ().b(Long.valueOf(this.gIm));
    }
    d locald = this.gII;
    GMTrace.o(3548582510592L, 26439);
    return locald;
  }
  
  public final void IP()
  {
    GMTrace.i(3550729994240L, 26455);
    w.i(this.TAG, "send img from system");
    this.fUQ = true;
    GMTrace.o(3550729994240L, 26455);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(3550058905600L, 26450);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3517578215424L, 26208);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BX("SendImgSpeeder");
        GMTrace.o(3517578215424L, 26208);
      }
    }, 100L);
    if (this.fUI < 0L)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 204L, 1L, false);
      w.e(this.TAG, "doScene invalid imgLocalId:" + this.fUI);
      i = gx(-1);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    if (this.eAH == null)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 203L, 1L, false);
      w.e(this.TAG, "doScene msg is null imgid:%d", new Object[] { Long.valueOf(this.fUI) });
      h.gv((int)this.gIm);
      i = gx(-2);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    this.fUd = parame1;
    c(parame);
    bma localbma = (bma)this.fUa.gtC.gtK;
    d locald = IN();
    parame1 = n.IZ().gs((int)locald.gGR);
    if (parame1 != null)
    {
      if (parame1.status == -1)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 202L, 1L, false);
        w.e(this.TAG, "doScene hd img info is null or error.");
        i = gx(-3);
        GMTrace.o(3550058905600L, 26450);
        return i;
      }
    }
    else if ((locald == null) || (locald.status == -1))
    {
      w.e(this.TAG, "doScene img info is null or error.");
      i = gx(-4);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    if (a.a.sa().dL(this.eAH.field_talker)) {}
    String str1;
    String str2;
    for (localbma.tQb = a.a.sa().c(this.eAH);; localbma.tQb = this.eAH.fwv)
    {
      str1 = n.IZ().l(locald.gGS, "", "");
      str2 = n.IZ().l(locald.gGU, "", "");
      parame1 = "";
      if (!bg.nm(locald.gGT)) {
        parame1 = n.IZ().l(locald.gGT, "", "");
      }
      if ((com.tencent.mm.a.e.aY(str1) > 0) && (com.tencent.mm.a.e.aY(str2) > 0)) {
        break;
      }
      w.e(this.TAG, "doScene invalid imgLocalId:%d filesize:[%d,%d] %s %s", new Object[] { Long.valueOf(this.fUI), Integer.valueOf(com.tencent.mm.a.e.aY(str1)), Integer.valueOf(com.tencent.mm.a.e.aY(str2)), str1, str2 });
      i = gx(-5);
      GMTrace.o(3550058905600L, 26450);
      return i;
      parame1 = be.Br();
      if (((parame1 != null) && (!parame1.equals(this.eAH.fwv))) || ((parame1 == null) && (!bg.nm(this.eAH.fwv))))
      {
        this.eAH.dh(parame1);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.eAH.field_msgId, this.eAH);
      }
    }
    Object localObject;
    if ((localbma.uVR == null) || (bg.nm(localbma.uVR.uNR)))
    {
      if (bg.nm(this.gIp))
      {
        w.i(this.TAG, "createMediaId time:%d talker:%s msg:%d img:%d compressType:%d", new Object[] { Long.valueOf(this.eAH.field_createTime), this.eAH.field_talker, Long.valueOf(this.eAH.field_msgId), Long.valueOf(this.fUI), Integer.valueOf(this.gGV) });
        this.gIp = com.tencent.mm.modelcdntran.d.a("upimg", this.eAH.field_createTime, this.eAH.field_talker, this.eAH.field_msgId + "_" + this.fUI + "_" + this.gGV);
      }
      localbma.uVR = new azq().Rq(this.gIp);
      localObject = this.eAH;
      ((ce)localObject).fwC = this.gIp;
      ((ce)localObject).fso = true;
    }
    if (this.startTime == 0L)
    {
      this.startTime = bg.Pv();
      this.startOffset = locald.offset;
      if (this.gGV == 1)
      {
        i = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
        this.gIq = i;
      }
    }
    else
    {
      w.i(this.TAG, "before checkUseCdn %s, %s, imgBitPath:%s", new Object[] { str1, str2, locald.gGS });
      if (!s.gn(this.eAH.field_talker)) {
        break label965;
      }
      w.w(this.TAG, "cdntra not use cdn user:%s", new Object[] { this.eAH.field_talker });
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label1721;
      }
      w.d(this.TAG, "cdntra use cdn return -1 for onGYNetEnd clientid:%s", new Object[] { localbma.uVR.uNR });
      GMTrace.o(3550058905600L, 26450);
      return 0;
      i = com.tencent.mm.modelcdntran.b.MediaType_IMAGE;
      break;
      label965:
      com.tencent.mm.modelcdntran.g.Gk();
      if ((!com.tencent.mm.modelcdntran.c.fT(1)) && (bg.nm(locald.gHc)))
      {
        parame1 = this.TAG;
        com.tencent.mm.modelcdntran.g.Gk();
        w.w(parame1, "cdntra not use cdn flag:%b getCdnInfo:%s", new Object[] { Boolean.valueOf(com.tencent.mm.modelcdntran.c.fT(1)), locald.gHc });
        i = 0;
      }
      else if (bg.nm(this.gIp))
      {
        w.w(this.TAG, "cdntra genClientId failed not use cdn imgLocalId:%d", new Object[] { Long.valueOf(this.fUI) });
        i = 0;
      }
      else
      {
        localObject = new i();
        ((i)localObject).gAB = this.gIz;
        ((i)localObject).field_mediaId = this.gIp;
        ((i)localObject).field_fullpath = str1;
        ((i)localObject).field_thumbpath = str2;
        ((i)localObject).field_fileType = this.gIq;
        ((i)localObject).field_talker = this.eAH.field_talker;
        if (s.eb(this.eAH.field_talker))
        {
          i = 1;
          label1146:
          ((i)localObject).field_chattype = i;
          ((i)localObject).field_priority = com.tencent.mm.modelcdntran.b.gzd;
          ((i)localObject).field_needStorage = false;
          ((i)localObject).field_isStreamMedia = false;
          ((i)localObject).field_sendmsg_viacdn = true;
          ((i)localObject).field_enable_hitcheck = this.gIH;
          ((i)localObject).field_midimgpath = parame1;
          ((i)localObject).field_force_aeskeycdn = false;
          ((i)localObject).field_trysafecdn = true;
          if ((((i)localObject).field_fileType == com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE) && (bg.nm(((i)localObject).field_midimgpath)))
          {
            com.tencent.mm.modelcdntran.g.Gk();
            if (com.tencent.mm.modelcdntran.c.fT(256))
            {
              w.w(this.TAG, "summersafecdn send fullsizeimage but midimgpath is null set field_force_aeskeycdn true");
              ((i)localObject).field_force_aeskeycdn = true;
              ((i)localObject).field_trysafecdn = false;
            }
          }
          parame1 = bh.q(this.gIL, "msg");
          if (parame1 == null) {
            break label1661;
          }
          if (this.gGV == 1) {
            break label1614;
          }
          ((i)localObject).field_fileId = ((String)parame1.get(".msg.img.$cdnmidimgurl"));
          ((i)localObject).field_midFileLength = bg.getInt((String)parame1.get(".msg.img.$length"), 0);
          ((i)localObject).field_totalLen = 0;
          label1329:
          ((i)localObject).field_aesKey = ((String)parame1.get(".msg.img.$aeskey"));
        }
        for (;;)
        {
          if (bg.nm(((i)localObject).field_aesKey))
          {
            com.tencent.mm.modelcdntran.g.Gl();
            ((i)localObject).field_aesKey = com.tencent.mm.modelcdntran.b.Gd();
            w.i(this.TAG, "summersafecdn cdntra oldAeskey is null and gen new[%s]", new Object[] { ((i)localObject).field_aesKey });
          }
          w.i(this.TAG, "dkupimg src:%d fileid:%s", new Object[] { Integer.valueOf(locald.cfz), ((i)localObject).field_fileId });
          this.gIF = ((i)localObject).field_fileId;
          this.gIG = ((i)localObject).field_aesKey;
          w.d(this.TAG, "summersafecdn checkUseCdn field_enable_hitcheck[%b], field_fileType[%d], field_midimgpath[%s], field_fullpath[%s], aeskey[%s], fileid[%s], enable_hitcheck[%b], aeskeycdn[%b], trysafecdn[%b]", new Object[] { Boolean.valueOf(((i)localObject).field_enable_hitcheck), Integer.valueOf(((i)localObject).field_fileType), ((i)localObject).field_midimgpath, ((i)localObject).field_fullpath, ((i)localObject).field_aesKey, ((i)localObject).field_fileId, Boolean.valueOf(((i)localObject).field_enable_hitcheck), Boolean.valueOf(((i)localObject).field_force_aeskeycdn), Boolean.valueOf(((i)localObject).field_trysafecdn) });
          this.gIP = null;
          if (com.tencent.mm.modelcdntran.g.Gk().c((i)localObject)) {
            break label1686;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(111L, 205L, 1L, false);
          w.e(this.TAG, "cdntra addSendTask failed. clientid:%s", new Object[] { this.gIp });
          this.gIp = "";
          i = 0;
          break;
          i = 0;
          break label1146;
          label1614:
          ((i)localObject).field_fileId = ((String)parame1.get(".msg.img.$cdnbigimgurl"));
          ((i)localObject).field_midFileLength = bg.getInt((String)parame1.get(".msg.img.$length"), 0);
          ((i)localObject).field_totalLen = 0;
          break label1329;
          label1661:
          w.i(this.TAG, "parse cdnInfo failed. [%s]", new Object[] { locald.gHc });
        }
        label1686:
        if (bg.nl(locald.gHc).length() <= 0)
        {
          locald.kc("CDNINFO_SEND");
          locald.eQl = 4096;
        }
        i = 1;
      }
    }
    label1721:
    w.i(this.TAG, "after checkUseCdn, it use cgi to upload image.");
    int i = locald.gHa;
    if (i >= vB())
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 201L, 1L, false);
      w.e(this.TAG, "doScene limit net time:" + i);
      h.gv((int)this.gIm);
      i = gx(-6);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    locald.gk(i + 1);
    locald.eQl = 512;
    n.IZ().a(Long.valueOf(this.fUI), locald);
    int j = locald.gsL - locald.offset;
    i = j;
    if (j > this.gIJ) {
      i = this.gIJ;
    }
    if (com.tencent.mm.a.e.aY(str1) > 10485760)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 200L, 1L, false);
      w.e(this.TAG, "doScene, file size is too large");
      i = gx(-7);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    parame1 = com.tencent.mm.a.e.c(str1, locald.offset, i);
    if ((parame1 == null) || (parame1.length <= 0))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 199L, 1L, false);
      w.e(this.TAG, "doScene, file read buf error.");
      i = gx(-8);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    localbma.tRE = parame1.length;
    localbma.tRD = locald.offset;
    localbma.ues = new azp().be(parame1);
    if (this.gIo != null) {
      this.gIo.Mn();
    }
    i = a(parame, this.fUa, this);
    if (i < 0)
    {
      w.e(this.TAG, "doScene netId error");
      h.gv((int)this.gIm);
      i = gx(-9);
      GMTrace.o(3550058905600L, 26450);
      return i;
    }
    GMTrace.o(3550058905600L, 26450);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(3549924687872L, 26449);
    int i = com.tencent.mm.ad.k.b.gum;
    GMTrace.o(3549924687872L, 26449);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(3550595776512L, 26454);
    paramq = (bmb)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.i(this.TAG, "cdntra onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " useCdnTransClientId:" + this.gIp);
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!bg.nm(this.gIp)))
    {
      w.w(this.TAG, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", new Object[] { this.gIp });
      GMTrace.o(3550595776512L, 26454);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e(this.TAG, "onGYNetEnd failed errtype:" + paramInt2 + " errcode:" + paramInt3);
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 198L, 1L, false);
      h.gv((int)this.gIm);
      h.gu((int)this.gIm);
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.gIq), Integer.valueOf(0) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      if (this.gIK != null) {
        this.gIK.IM();
      }
      GMTrace.o(3550595776512L, 26454);
      return;
    }
    this.gIJ = paramq.tRE;
    if (this.gIJ > 16384) {
      this.gIJ = 16384;
    }
    paramString = IN();
    w.v(this.TAG, "onGYNetEnd localId:" + this.fUI + "  totalLen:" + paramString.gsL + " offSet:" + paramString.offset);
    if ((paramq.tRD < 0) || ((paramq.tRD > paramString.gsL) && (paramString.gsL > 0)))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 197L, 1L, false);
      w.e(this.TAG, "onGYNetEnd invalid server return value : startPos = " + paramq.tRD + " img totalLen = " + paramString.gsL);
      h.gv((int)this.gIm);
      h.gu((int)this.gIm);
      com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(-2), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.gIq), Integer.valueOf(0) });
      this.fUd.a(4, -2, "", this);
      if (this.gIK != null) {
        this.gIK.IM();
      }
      GMTrace.o(3550595776512L, 26454);
      return;
    }
    if ((paramq.tRD < paramString.offset) || ((e.b(paramString)) && (this.gIJ <= 0)))
    {
      w.e(this.TAG, "onGYNetEnd invalid data startPos = " + paramq.tRD + " totalLen = " + paramString.gsL + " off:" + paramString.offset);
      h.gv((int)this.gIm);
      h.gu((int)this.gIm);
      this.fUd.a(4, -1, "", this);
      if (this.gIK != null) {
        this.gIK.IM();
      }
      GMTrace.o(3550595776512L, 26454);
      return;
    }
    w.d("ImgInfoLogic", "resp.rImpl.getStartPos() " + paramq.tRD);
    if ((a(paramString, paramq.tRD, paramq.tQd, paramq.nFd, null)) && (a(this.gtW, this.fUd) < 0))
    {
      h.gu((int)this.gIm);
      this.fUd.a(3, -1, "", this);
      if (this.gIK != null) {
        this.gIK.IM();
      }
    }
    GMTrace.o(3550595776512L, 26454);
  }
  
  public final boolean a(d paramd, final int paramInt1, final long paramLong, int paramInt2, keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(3550864211968L, 26456);
    w.d(this.TAG, "cdntra clientid:%s start:%d svrid:%d createtime:%d", new Object[] { this.gIp, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    w.d(this.TAG, "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(com.tencent.mm.platformtools.r.hkk) });
    long l = paramLong;
    if (10007 == com.tencent.mm.platformtools.r.hkj)
    {
      l = paramLong;
      if (com.tencent.mm.platformtools.r.hkk != 0)
      {
        l = com.tencent.mm.platformtools.r.hkk;
        com.tencent.mm.platformtools.r.hkk = 0;
      }
    }
    paramLong = paramd.gGR;
    paramInt2 = paramd.gsL;
    if (this.gIl != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16420465278976L, 122342);
          m localm = m.IQ();
          long l1 = paramLong;
          long l2 = paramInt1;
          long l3 = this.gIU;
          if (localm.gIY.containsKey(Long.valueOf(l1))) {}
          for (m.d locald = (m.d)localm.gIY.get(Long.valueOf(l1));; locald = new m.d())
          {
            locald.mK = l3;
            locald.eMG = l2;
            localm.gIY.put(Long.valueOf(l1), locald);
            k.this.gIl.a(this.gIU, paramInt1, k.this);
            GMTrace.o(16420465278976L, 122342);
            return;
          }
        }
      });
    }
    paramd.setOffset(paramInt1);
    paramd.D(l);
    if ((e.b(paramd)) && (this.gIm != this.fUI))
    {
      d locald = n.IZ().b(Long.valueOf(this.gIm));
      locald.D(l);
      locald.gm(paramd.gsL);
      locald.setOffset(paramd.gsL);
      n.IZ().a(Long.valueOf(this.gIm), locald);
    }
    if (e.b(paramd))
    {
      if (bg.nm(this.gIp)) {
        com.tencent.mm.plugin.report.service.g.ork.i(10420, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Long.valueOf(this.startTime), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(this.gIq), Integer.valueOf(paramd.gsL - this.startOffset) });
      }
      this.eAH.dB(2);
      this.eAH.D(l);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.gGZ, this.eAH);
      if (com.tencent.mm.modelstat.q.gZI != null) {
        com.tencent.mm.modelstat.q.gZI.f(this.eAH);
      }
      h.gu((int)this.gIm);
      if (this.gIo != null) {
        this.gIo.ay(0L);
      }
      this.fUd.a(0, 0, "", this);
      if (q.gJS != null) {
        q.gJS.a(this.fUI, this.eAH, this.fUa, this.fUJ, this.fUQ, paramkeep_SceneResult);
      }
      if (this.gIK != null) {
        this.gIK.IM();
      }
      GMTrace.o(3550864211968L, 26456);
      return false;
    }
    GMTrace.o(3550864211968L, 26456);
    return true;
  }
  
  public final void ar(final long paramLong)
  {
    GMTrace.i(16021838626816L, 119372);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3518651957248L, 26216);
        m localm = m.IQ();
        long l = paramLong;
        localm.gIY.remove(Long.valueOf(l));
        GMTrace.o(3518651957248L, 26216);
      }
    });
    GMTrace.o(16021838626816L, 119372);
  }
  
  public final int getType()
  {
    GMTrace.i(15343233794048L, 114316);
    GMTrace.o(15343233794048L, 114316);
    return 110;
  }
  
  public final void gw(int paramInt)
  {
    int i = 0;
    GMTrace.i(3549522034688L, 26446);
    if (this.eAH == null)
    {
      w.w(this.TAG, "createHDThumb but msg is null msgLocalId[%d], compressType[%d]", new Object[] { Long.valueOf(this.gGZ), Integer.valueOf(paramInt) });
      GMTrace.o(3549522034688L, 26446);
      return;
    }
    if (this.gIM)
    {
      if (this.eAH.fwA == 0)
      {
        Object localObject = n.IZ();
        au localau = this.eAH;
        int j = this.gIt;
        String str = f.p(localau);
        if (!bg.nm(str)) {}
        for (boolean bool = ((f)localObject).a(str, localau.field_imgPath, j, paramInt);; bool = false)
        {
          localObject = this.eAH;
          paramInt = i;
          if (bool) {
            paramInt = 1;
          }
          ((ce)localObject).fwA = paramInt;
          ((ce)localObject).fso = true;
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this.gGZ, this.eAH);
          GMTrace.o(3549522034688L, 26446);
          return;
        }
      }
    }
    else {
      n.IZ().a(this.eAH.field_imgPath, com.tencent.mm.br.a.getDensity(com.tencent.mm.sdk.platformtools.ab.getContext()), true);
    }
    GMTrace.o(3549522034688L, 26446);
  }
  
  protected final int vB()
  {
    GMTrace.i(3550461558784L, 26453);
    if (this.gGV == 0)
    {
      GMTrace.o(3550461558784L, 26453);
      return 100;
    }
    GMTrace.o(3550461558784L, 26453);
    return 1350;
  }
  
  public static abstract interface a
  {
    public abstract void IM();
  }
  
  private final class b
  {
    public k.a gIV;
    
    public b(k.a parama)
    {
      GMTrace.i(3505364402176L, 26117);
      this.gIV = parama;
      GMTrace.o(3505364402176L, 26117);
    }
    
    final void IM()
    {
      GMTrace.i(3505230184448L, 26116);
      if (k.this.gIm == k.this.fUI) {}
      for (d locald = k.this.IN();; locald = k.this.IO())
      {
        if (locald.gHd == 1)
        {
          com.tencent.mm.plugin.report.service.f.tq(23);
          com.tencent.mm.plugin.report.service.f.tq(21);
        }
        if (n.IZ().a(Long.valueOf(k.this.fUI), k.this.IN()) < 0)
        {
          w.e(k.this.TAG, "update db failed local id:" + k.this.fUI + " server id:" + k.this.IN().eSf);
          h.gv((int)k.this.gIm);
          h.gu((int)k.this.gIm);
          k.this.fUd.a(3, -1, "", k.this);
        }
        if (k.this.fUI != k.this.gIm) {
          n.IZ().a(Long.valueOf(k.this.gIm), k.this.IO());
        }
        k.this.ar(k.this.fUI);
        if (k.this.gIm != k.this.fUI) {
          k.this.ar(k.this.gIm);
        }
        if (this.gIV != null) {
          this.gIV.IM();
        }
        k.this.gw(k.this.gGV);
        k.this.gIK = null;
        GMTrace.o(3505230184448L, 26116);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */