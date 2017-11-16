package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bpe;
import com.tencent.mm.protocal.c.bpf;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends n<bpe, bpf>
{
  public d(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte, int paramInt7)
  {
    GMTrace.i(5291265490944L, 39423);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpe();
    ((b.a)localObject).gtG = new bpf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipDoubleLinkSwitch";
    ((b.a)localObject).gtE = 249;
    ((b.a)localObject).gtH = 249;
    ((b.a)localObject).gtI = 1000000249;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpe)this.fUa.gtC.gtK;
    ((bpe)localObject).uhU = paramInt1;
    ((bpe)localObject).uhV = paramLong;
    ((bpe)localObject).uKq = paramInt2;
    ((bpe)localObject).uYS = paramInt3;
    ((bpe)localObject).uYT = paramInt4;
    ((bpe)localObject).uYU = paramInt5;
    ((bpe)localObject).uYV = paramInt6;
    ((bpe)localObject).uYW = 1;
    ((bpe)localObject).tTe = new azp().z(paramArrayOfByte, paramInt7);
    GMTrace.o(5291265490944L, 39423);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5291668144128L, 39426);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5293547192320L, 39440);
        a.dV("MicroMsg.Voip.DoubleLinkSwitch", "double link switch response:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " status:" + d.this.qFK.mStatus);
        if (paramAnonymousInt2 != 0)
        {
          a.dU("MicroMsg.Voip.DoubleLinkSwitch", " double link switch  response with error code:" + paramAnonymousInt2);
          GMTrace.o(5293547192320L, 39440);
          return;
        }
        paramAnonymousString = (bpf)d.this.bvh();
        d.this.qFK.qFe = paramAnonymousString.uGz;
        if (d.this.qFK.qFe == 0)
        {
          GMTrace.o(5293547192320L, 39440);
          return;
        }
        if (d.this.qFK.qFr.doubleLinkSwitch(paramAnonymousString.uYX) == 0)
        {
          if (1 != paramAnonymousString.uYX) {
            break label330;
          }
          paramAnonymousk = d.this.qFK.qFr;
          paramAnonymousk.qKk += 1;
        }
        for (;;)
        {
          a.dV("MicroMsg.Voip.DoubleLinkSwitch", "zhengxue[DOUBLELINK]room " + paramAnonymousString.uhU + " member " + paramAnonymousString.uKq + " key " + paramAnonymousString.uhV + "report flag " + paramAnonymousString.uGz + "switch to link type " + paramAnonymousString.uYX + "doubleLinkSwitchReportStatus " + d.this.qFK.qFe + "mDoubleLinkSwitchSucToDirectCnt" + d.this.qFK.qFr.qKk + "mDoubleLinkSwitchSucToRelayCnt" + d.this.qFK.qFr.qKl);
          GMTrace.o(5293547192320L, 39440);
          return;
          label330:
          if (2 == paramAnonymousString.uYX)
          {
            paramAnonymousk = d.this.qFK.qFr;
            paramAnonymousk.qKl += 1;
          }
        }
      }
    };
    GMTrace.o(5291668144128L, 39426);
    return local1;
  }
  
  public final void dp(int paramInt1, int paramInt2)
  {
    GMTrace.i(5291533926400L, 39425);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bpf localbpf = (bpf)bvh();
      if (localbpf != null) {
        w.i("MicroMsg.Voip.DoubleLinkSwitch", "roomId:%d, roomKey:%s, member:%d", new Object[] { Integer.valueOf(localbpf.uhU), Long.valueOf(localbpf.uhV), Integer.valueOf(localbpf.uKq) });
      }
      GMTrace.o(5291533926400L, 39425);
      return;
    }
    w.i("MicroMsg.Voip.DoubleLinkSwitch", "double link switch error");
    GMTrace.o(5291533926400L, 39425);
  }
  
  public final int getType()
  {
    GMTrace.i(5291399708672L, 39424);
    GMTrace.o(5291399708672L, 39424);
    return 249;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */