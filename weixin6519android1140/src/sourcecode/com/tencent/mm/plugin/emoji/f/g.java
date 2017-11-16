package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.protocal.c.qz;
import com.tencent.mm.protocal.c.rs;
import com.tencent.mm.protocal.c.rt;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  public String gIp;
  private int gRb;
  public boolean guN;
  public String klt;
  public String klu;
  public String klv;
  private int klw;
  private i.a klx;
  public EmojiGroupInfo kly;
  
  public g(String paramString)
  {
    this(paramString, null, "", 1, 0);
    GMTrace.i(15699044990976L, 116967);
    GMTrace.o(15699044990976L, 116967);
  }
  
  public g(String paramString, byte paramByte)
  {
    this(paramString, null, "", 1, 1);
    GMTrace.i(11300327391232L, 84194);
    GMTrace.o(11300327391232L, 84194);
  }
  
  public g(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2, 0, 0);
    GMTrace.i(11300058955776L, 84192);
    GMTrace.o(11300058955776L, 84192);
  }
  
  public g(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, paramString2, paramString3, 0, 0);
    GMTrace.i(11299924738048L, 84191);
    GMTrace.o(11299924738048L, 84191);
  }
  
  private g(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(11299790520320L, 84190);
    this.gIp = "";
    this.klx = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(11288516231168L, 84106);
        if ((bg.nm(g.this.gIp)) || (!paramAnonymousString.equals(g.this.gIp)))
        {
          w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra mediaId is no equal");
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        if (paramAnonymousInt == 44530)
        {
          w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { g.this.gIp });
          g.f(g.this.klt, 6, 0, g.this.gIp);
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          w.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "download emoji pack failed. mProductId:%s:", new Object[] { g.this.klt });
          g.f(g.this.klt, -1, 0, g.this.gIp);
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          if (paramAnonymouskeep_ProgressInfo.field_finishedLength == paramAnonymouskeep_ProgressInfo.field_toltalLength)
          {
            w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra ignore progress 100%");
            GMTrace.o(11288516231168L, 84106);
            return 0;
          }
          w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra progresscallback id:%s finish:%d total:%d", new Object[] { g.this.gIp, Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_finishedLength), Integer.valueOf(paramAnonymouskeep_ProgressInfo.field_toltalLength) });
          if (!g.this.guN) {
            g.f(g.this.klt, 6, (int)(paramAnonymouskeep_ProgressInfo.field_finishedLength / paramAnonymouskeep_ProgressInfo.field_toltalLength * 100.0F), g.this.gIp);
          }
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(10625, new Object[] { Integer.valueOf(2), paramAnonymouskeep_SceneResult.field_fileId, g.this.klt, paramAnonymouskeep_SceneResult.field_transInfo });
          if (paramAnonymouskeep_SceneResult.field_retCode != 0)
          {
            w.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji pack faild. ProductId:%s code:%d ", new Object[] { g.this.klt, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode) });
            g.f(g.this.klt, -1, 0, g.this.gIp);
          }
        }
        else
        {
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji success.");
        try
        {
          paramAnonymousString = com.tencent.mm.plugin.emoji.e.c.aqt();
          paramAnonymouskeep_ProgressInfo = g.this.klt;
          if ((paramAnonymousString.kij != null) && (paramAnonymousString.kij.contains(paramAnonymouskeep_ProgressInfo))) {
            paramAnonymousString.kij.remove(paramAnonymouskeep_ProgressInfo);
          }
          EmojiLogic.a(g.this.klt, g.this.klu, g.this.kly);
          h.arl().kjy.doNotify();
          g.f(g.this.klt, 7, 100, g.this.gIp);
          paramAnonymousString = new File(com.tencent.mm.compatible.util.e.fRX + g.this.klt);
          if ((paramAnonymousString.isFile()) && (paramAnonymousString.exists())) {
            paramAnonymousString.delete();
          }
          g.T(g.this.klt, true);
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Error." + bg.bQW());
          g.f(g.this.klt, -1, 0, g.this.gIp);
          g.T(g.this.klt, false);
          GMTrace.o(11288516231168L, 84106);
          return 0;
        }
        catch (OutOfMemoryError paramAnonymousString)
        {
          for (;;)
          {
            w.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Out Of Memory Error." + bg.bQW());
          }
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(11288650448896L, 84107);
        GMTrace.o(11288650448896L, 84107);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(11288784666624L, 84108);
        GMTrace.o(11288784666624L, 84108);
        return null;
      }
    };
    this.klt = paramString1;
    this.klu = paramString3;
    this.klv = paramString2;
    this.kly = null;
    this.klw = paramInt1;
    this.gRb = paramInt2;
    paramString1 = new b.a();
    paramString1.gtF = new rs();
    paramString1.gtG = new rt();
    paramString1.uri = "/cgi-bin/micromsg-bin/exchangeemotionpack";
    paramString1.gtE = 423;
    paramString1.gtH = 213;
    paramString1.gtI = 1000000213;
    this.fUa = paramString1.DA();
    GMTrace.o(11299790520320L, 84190);
  }
  
  public static void T(String paramString, boolean paramBoolean)
  {
    GMTrace.i(16062238162944L, 119673);
    if (!bg.nm(paramString))
    {
      w.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "[cpan] publicStoreEmojiDownLoadTaskEvent productId:%s success:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      cq localcq = new cq();
      localcq.eDV.eDW = paramString;
      localcq.eDV.eCx = 2;
      localcq.eDV.success = paramBoolean;
      a.vgX.m(localcq);
    }
    GMTrace.o(16062238162944L, 119673);
  }
  
  public static void f(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(11300864262144L, 84198);
    h.arn().f(paramString1, paramInt1, paramInt2, paramString2);
    GMTrace.o(11300864262144L, 84198);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11300730044416L, 84197);
    w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "doScene");
    this.fXo = parame1;
    if (this.gRb == 0) {
      f(this.klt, 6, 0, this.gIp);
    }
    parame1 = (rs)this.fUa.gtC.gtK;
    parame1.tRS = this.klt;
    parame1.uib = this.klv;
    parame1.uic = this.klw;
    parame1.tOG = this.gRb;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11300730044416L, 84197);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11300595826688L, 84196);
    w.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      f(this.klt, -1, 0, this.gIp);
      GMTrace.o(11300595826688L, 84196);
      return;
    }
    if (this.gRb == 0)
    {
      paramq = new File(com.tencent.mm.compatible.util.e.fRX);
      if (!paramq.exists()) {
        paramq.mkdirs();
      }
      long l = System.currentTimeMillis();
      paramq = new StringBuilder();
      at.AR();
      this.gIp = com.tencent.mm.modelcdntran.d.a("downzip", l, com.tencent.mm.y.c.ww(), "emoji");
      paramq = ((rt)this.fUa.gtD.gtK).uie;
      paramArrayOfByte = new i();
      paramArrayOfByte.field_mediaId = this.gIp;
      paramArrayOfByte.field_fullpath = (com.tencent.mm.compatible.util.e.fRX + this.klt);
      paramArrayOfByte.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
      paramArrayOfByte.field_totalLen = paramq.ufa;
      paramArrayOfByte.field_aesKey = paramq.ugB;
      paramArrayOfByte.field_fileId = paramq.lPM;
      paramArrayOfByte.field_priority = com.tencent.mm.modelcdntran.b.gzd;
      paramArrayOfByte.gAB = this.klx;
      paramArrayOfByte.field_needStorage = true;
      this.guN = false;
      if (!com.tencent.mm.modelcdntran.g.Gk().b(paramArrayOfByte, -1)) {
        w.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add task failed:");
      }
    }
    for (;;)
    {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      paramString = new k(this.klt);
      at.wS().a(paramString, 0);
      GMTrace.o(11300595826688L, 84196);
      return;
      w.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add custom emoji.need no download pack");
    }
  }
  
  protected final void cancel()
  {
    GMTrace.i(11300998479872L, 84199);
    super.cancel();
    this.guN = true;
    GMTrace.o(11300998479872L, 84199);
  }
  
  public final int getType()
  {
    GMTrace.i(11300461608960L, 84195);
    GMTrace.o(11300461608960L, 84195);
    return 423;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */