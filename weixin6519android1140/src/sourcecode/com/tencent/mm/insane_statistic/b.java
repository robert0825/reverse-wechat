package com.tencent.mm.insane_statistic;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.q.a;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.ml;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.mm.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bma;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public final class b
  implements q.a
{
  public b()
  {
    GMTrace.i(16312956878848L, 121541);
    GMTrace.o(16312956878848L, 121541);
  }
  
  public final void a(long paramLong, au paramau, com.tencent.mm.ad.b paramb, int paramInt, boolean paramBoolean, keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(16313091096576L, 121542);
    paramau = new a(paramLong, paramau, paramb, paramBoolean, paramInt);
    paramb = com.tencent.mm.y.c.c.Ct().er("100131");
    if (paramb.isValid()) {
      paramau.fUO = t.getInt((String)paramb.bSg().get("needUploadData"), 1);
    }
    if ((paramau.fUM) || ((!paramau.fUQ) && (paramau.fUO == 0)))
    {
      GMTrace.o(16313091096576L, 121542);
      return;
    }
    paramau.fUP = paramkeep_SceneResult;
    paramau.fUM = true;
    paramb = ((bma)paramau.fUa.gtC.gtK).tPX.uNR;
    if ((!bg.nm(paramb)) && (paramb.endsWith("@chatroom")))
    {
      paramInt = 1;
      paramb = new StringBuilder("2,");
      if (paramInt == 0) {
        break label310;
      }
    }
    label310:
    for (paramInt = 2;; paramInt = 1)
    {
      paramau.fUL = (paramInt + ",,");
      if (paramau.fUK == null) {
        paramau.fUK = com.tencent.mm.ao.n.IZ().b(Long.valueOf(paramau.fUI));
      }
      paramb = paramau.fUK;
      if (paramb != null)
      {
        paramkeep_SceneResult = new mk();
        a.vgX.b(paramau.fUR);
        a.vgX.b(paramau.fUS);
        paramau.fUN = com.tencent.mm.ao.n.IZ().l(paramb.gGS, "", "");
        paramkeep_SceneResult.eRq.filePath = paramau.fUN;
        a.vgX.m(paramkeep_SceneResult);
      }
      GMTrace.o(16313091096576L, 121542);
      return;
      paramInt = 0;
      break;
    }
  }
  
  private static final class a
  {
    public au eAH;
    public long fUI;
    public int fUJ;
    com.tencent.mm.ao.d fUK;
    public String fUL;
    boolean fUM;
    public String fUN;
    public int fUO;
    public keep_SceneResult fUP;
    public boolean fUQ;
    com.tencent.mm.sdk.b.c fUR;
    com.tencent.mm.sdk.b.c fUS;
    public final com.tencent.mm.ad.b fUa;
    
    a(long paramLong, au paramau, com.tencent.mm.ad.b paramb, boolean paramBoolean, int paramInt)
    {
      GMTrace.i(16313627967488L, 121546);
      this.eAH = null;
      this.fUM = false;
      this.fUO = 0;
      this.fUQ = false;
      this.fUR = new com.tencent.mm.sdk.b.c()
      {
        private boolean a(mm paramAnonymousmm)
        {
          GMTrace.i(16313359532032L, 121544);
          if (!paramAnonymousmm.eRt.filePath.equals(b.a.this.fUN))
          {
            GMTrace.o(16313359532032L, 121544);
            return false;
          }
          try
          {
            Object localObject1 = URLEncoder.encode(paramAnonymousmm.eRt.result, "UTF-8");
            Object localObject2;
            if (b.a.this.fUQ)
            {
              localObject2 = b.a.this.fUL + (String)localObject1;
              w.i("MicroMsg.OnNetSceneUploadMsgImgEnd", "androidSystemShareFixed(13717) , imgLocalId:%d, scene.hash:%d, %s, filePath:%s", new Object[] { Long.valueOf(b.a.this.fUI), Integer.valueOf(b.a.this.hashCode()), localObject2, paramAnonymousmm.eRt.filePath });
              g.ork.A(13717, (String)localObject2);
            }
            if (b.a.this.fUO == 1)
            {
              localObject2 = new com.tencent.mm.modelsns.d();
              bma localbma = (bma)b.a.this.fUa.gtC.gtK;
              ((com.tencent.mm.modelsns.d)localObject2).q("20toUser", localbma.tPX.uNR + ",");
              ((com.tencent.mm.modelsns.d)localObject2).q("21source", b.a.this.fUJ + ",");
              ((com.tencent.mm.modelsns.d)localObject2).q("22qrUrl", (String)localObject1 + ",");
              localObject1 = new StringBuilder();
              if (b.a.this.fUP == null)
              {
                paramAnonymousmm = "";
                ((com.tencent.mm.modelsns.d)localObject2).q("23md5", paramAnonymousmm + ",");
                localObject1 = new StringBuilder();
                if (b.a.this.fUP != null) {
                  break label585;
                }
                paramAnonymousmm = "";
                ((com.tencent.mm.modelsns.d)localObject2).q("24cdnFileId", paramAnonymousmm + ",");
                localObject1 = new StringBuilder();
                if (b.a.this.fUP != null) {
                  break label599;
                }
                paramAnonymousmm = "";
                ((com.tencent.mm.modelsns.d)localObject2).q("25cdnAesKey", paramAnonymousmm + ",");
                localObject1 = "";
                paramAnonymousmm = (mm)localObject1;
                if (b.a.this.eAH.aCp())
                {
                  f.a locala = f.a.eS(b.a.this.eAH.field_content);
                  paramAnonymousmm = (mm)localObject1;
                  if (locala != null) {
                    paramAnonymousmm = locala.appId;
                  }
                }
                ((com.tencent.mm.modelsns.d)localObject2).q("26appip", paramAnonymousmm + ",");
                ((com.tencent.mm.modelsns.d)localObject2).q("27toUsersCount", m.fk(localbma.tPX.uNR) + ",");
                w.i("MicroMsg.OnNetSceneUploadMsgImgEnd", "report qrCodeImgChatting(13628): " + ((com.tencent.mm.modelsns.d)localObject2).LT());
                com.tencent.mm.modelstat.n.r(13628, ((com.tencent.mm.modelsns.d)localObject2).toString());
              }
            }
            else
            {
              b.a.this.vL();
              GMTrace.o(16313359532032L, 121544);
              return false;
            }
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.OnNetSceneUploadMsgImgEnd", localUnsupportedEncodingException, "", new Object[0]);
              String str = "";
              continue;
              paramAnonymousmm = b.a.this.fUP.field_filemd5;
              continue;
              label585:
              paramAnonymousmm = b.a.this.fUP.field_fileId;
              continue;
              label599:
              paramAnonymousmm = b.a.this.fUP.field_aesKey;
            }
          }
        }
      };
      this.fUS = new com.tencent.mm.sdk.b.c() {};
      this.fUI = paramLong;
      this.eAH = paramau;
      this.fUa = paramb;
      this.fUJ = paramInt;
      this.fUQ = paramBoolean;
      GMTrace.o(16313627967488L, 121546);
    }
    
    public final void vL()
    {
      GMTrace.i(16313762185216L, 121547);
      a.vgX.c(this.fUR);
      a.vgX.c(this.fUS);
      GMTrace.o(16313762185216L, 121547);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\insane_statistic\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */