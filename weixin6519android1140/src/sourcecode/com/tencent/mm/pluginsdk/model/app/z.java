package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.protocal.c.ll;
import com.tencent.mm.protocal.c.lm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;

public final class z
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private final a toj;
  
  public z(f.a parama, String paramString1, String paramString2, a parama1)
  {
    GMTrace.i(814298955776L, 6067);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ll();
    ((b.a)localObject).gtG = new lm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkbigfileupload";
    ((b.a)localObject).gtE = 727;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ll)this.fUa.gtC.gtK;
    if (parama != null)
    {
      ((ll)localObject).tYF = parama.giJ;
      ((ll)localObject).ucc = parama.filemd5;
      ((ll)localObject).gPS = parama.title;
      ((ll)localObject).ucd = parama.giw;
    }
    for (((ll)localObject).ucb = parama.giv;; ((ll)localObject).ucb = com.tencent.mm.a.e.aY(paramString1))
    {
      ((ll)localObject).tRF = com.tencent.mm.modelcdntran.b.gzf;
      ((ll)localObject).lSX = paramString2;
      ((ll)localObject).lSY = com.tencent.mm.y.q.zE();
      this.toj = parama1;
      w.i("MicroMsg.NetSceneCheckBigFileUpload", "summerbig NetSceneCheckBigFileUpload content[%s], aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", new Object[] { parama, ((ll)localObject).tYF, ((ll)localObject).ucc, ((ll)localObject).gPS, Long.valueOf(((ll)localObject).ucb), ((ll)localObject).ucd, ((ll)localObject).lSX, ((ll)localObject).lSY, bg.bQW() });
      GMTrace.o(814298955776L, 6067);
      return;
      g.Gl();
      ((ll)localObject).tYF = com.tencent.mm.modelcdntran.b.Gd();
      g.Gl();
      ((ll)localObject).ucc = com.tencent.mm.modelcdntran.b.jt(paramString1);
      ((ll)localObject).gPS = com.tencent.mm.a.e.bc(paramString1);
      ((ll)localObject).ucd = com.tencent.mm.a.e.bb(paramString1);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(814567391232L, 6069);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(814567391232L, 6069);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(814701608960L, 6070);
    w.d("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      if (this.toj != null) {
        this.toj.a("", "", "", "", "", 0L);
      }
      GMTrace.o(814701608960L, 6070);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    paramString = (ll)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (lm)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.d("MicroMsg.NetSceneCheckBigFileUpload", "summersafecdn onGYNetEnd Signature[%s], fuin[%d], faeskey[%s], fSignature[%s]", new Object[] { paramq.gCA, Integer.valueOf(paramq.uce), paramq.ucf, paramq.ucg });
    if (this.toj != null) {
      this.toj.a(paramString.ucc, paramString.tYF, paramq.gCA, paramq.ucf, paramq.ucg, paramString.ucb);
    }
    GMTrace.o(814701608960L, 6070);
  }
  
  public final int getType()
  {
    GMTrace.i(814433173504L, 6068);
    GMTrace.o(814433173504L, 6068);
    return 727;
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */