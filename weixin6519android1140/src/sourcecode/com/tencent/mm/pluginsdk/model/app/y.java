package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lj;
import com.tencent.mm.protocal.c.lk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;

public final class y
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private final b toi;
  
  public y(b paramb, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(825439027200L, 6150);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new lj();
    ((b.a)localObject).gtG = new lk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkbigfiledownload";
    ((b.a)localObject).gtE = 728;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.toi = paramb;
    localObject = (lj)this.fUa.gtC.gtK;
    ((lj)localObject).tYF = paramString1;
    ((lj)localObject).ucb = paramb.field_totalLen;
    ((lj)localObject).ucc = paramString2;
    ((lj)localObject).gPS = paramString3;
    ((lj)localObject).ucd = paramString4;
    ((lj)localObject).lSY = paramString5;
    at.AR();
    ((lj)localObject).lSX = ((String)com.tencent.mm.y.c.xh().get(2, ""));
    ((lj)localObject).tRF = com.tencent.mm.modelcdntran.b.gzf;
    w.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig AESKey[%s] FileMd5[%s] FileName[%s] FileExt[%s] FileSize[%d] FileType[%d] stack[%s]", new Object[] { bg.SJ(((lj)localObject).tYF), ((lj)localObject).ucc, ((lj)localObject).gPS, ((lj)localObject).ucd, Long.valueOf(((lj)localObject).ucb), Integer.valueOf(((lj)localObject).tRF), bg.bQW() });
    GMTrace.o(825439027200L, 6150);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(825707462656L, 6152);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(825707462656L, 6152);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(825841680384L, 6153);
    w.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (lk)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      this.toi.field_signature = paramq.gCA;
      this.toi.field_fakeAeskey = paramq.ucf;
      this.toi.field_fakeSignature = paramq.ucg;
      boolean bool = an.afP().c(this.toi, new String[0]);
      w.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd field_signature[%s], field_fakeAeskey[%s], field_fakeSignature[%s], update[%b]", new Object[] { bg.SJ(this.toi.field_signature), bg.SJ(this.toi.field_fakeAeskey), bg.SJ(this.toi.field_fakeSignature), Boolean.valueOf(bool) });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(825841680384L, 6153);
  }
  
  public final int getType()
  {
    GMTrace.i(825573244928L, 6151);
    GMTrace.o(825573244928L, 6151);
    return 728;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */