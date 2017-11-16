package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.io.ByteArrayOutputStream;

public final class j
  implements i.a
{
  public String kBG;
  public a mIR;
  public String mIS;
  private boolean mIT;
  
  public j()
  {
    GMTrace.i(9727027183616L, 72472);
    this.kBG = null;
    this.mIT = true;
    GMTrace.o(9727027183616L, 72472);
  }
  
  public static String aMf()
  {
    GMTrace.i(9727161401344L, 72473);
    String str = bg.nl(d.a("NewYearImg", System.currentTimeMillis(), q.Ak().field_username, ""));
    GMTrace.o(9727161401344L, 72473);
    return str;
  }
  
  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
  {
    GMTrace.i(9727429836800L, 72475);
    w.d("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
    if ((paramkeep_SceneResult != null) && (this.kBG.equals(paramString)) && (!bg.nm(paramkeep_SceneResult.field_fileId)))
    {
      w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer success, sceneResult.field_retCode:" + paramkeep_SceneResult.field_retCode);
      if ((paramInt == 0) && (paramkeep_SceneResult.field_retCode == 0)) {
        if (this.mIT)
        {
          w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, upload callback success");
          w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:transfer done, mediaid=%s, completeInfo=%s", new Object[] { paramString, paramkeep_SceneResult.toString() });
          if (this.mIR != null) {
            this.mIR.a(paramkeep_SceneResult, this.mIS, true);
          }
        }
      }
    }
    for (;;)
    {
      GMTrace.o(9727429836800L, 72475);
      return 0;
      w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, download callback success");
      break;
      w.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail");
      if (this.mIR != null)
      {
        this.mIR.a(paramkeep_SceneResult, this.mIS, false);
        continue;
        if ((paramkeep_SceneResult != null) && (this.kBG.equals(paramString)) && (paramkeep_SceneResult.field_retCode != 0))
        {
          w.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail, sceneResult.field_retCode:" + paramkeep_SceneResult.field_retCode);
          if (this.mIR != null) {
            this.mIR.a(paramkeep_SceneResult, this.mIS, false);
          }
        }
        else if (paramkeep_ProgressInfo != null)
        {
          w.d("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: upload progressing....");
        }
      }
    }
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    GMTrace.i(9727564054528L, 72476);
    GMTrace.o(9727564054528L, 72476);
  }
  
  public final boolean a(String paramString1, String paramString2, int paramInt, String paramString3, a parama)
  {
    GMTrace.i(9727295619072L, 72474);
    w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. imageId:%s", new Object[] { paramString1 });
    this.mIT = false;
    this.kBG = aMf();
    w.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. client id:%s", new Object[] { this.kBG });
    this.mIS = paramString3;
    this.mIR = parama;
    parama = new i();
    parama.eYr = false;
    parama.gAB = this;
    parama.field_fullpath = paramString3;
    parama.field_mediaId = this.kBG;
    parama.field_fileId = paramString1;
    parama.field_aesKey = paramString2;
    parama.field_totalLen = paramInt;
    parama.field_fileType = b.MediaType_FILE;
    parama.field_priority = b.gzd;
    parama.field_needStorage = false;
    parama.field_isStreamMedia = false;
    parama.field_appType = 0;
    parama.field_bzScene = 0;
    if (!g.Gk().b(parama, -1))
    {
      w.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: cdntra addSendTask failed. imageId:%s", new Object[] { paramString1 });
      GMTrace.o(9727295619072L, 72474);
      return false;
    }
    GMTrace.o(9727295619072L, 72474);
    return true;
  }
  
  public final byte[] h(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(9727698272256L, 72477);
    GMTrace.o(9727698272256L, 72477);
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void a(keep_SceneResult paramkeep_SceneResult, String paramString, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */