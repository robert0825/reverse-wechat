package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.bof;
import com.tencent.mm.protocal.c.bpp;
import com.tencent.mm.protocal.c.bpq;
import com.tencent.mm.protocal.c.bps;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class h
  extends n<bpp, bpq>
{
  public h(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    GMTrace.i(5288715354112L, 39404);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpp();
    ((b.a)localObject).gtG = new bpq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipRedirect";
    ((b.a)localObject).gtE = 678;
    ((b.a)localObject).gtH = 240;
    ((b.a)localObject).gtI = 1000000240;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpp)this.fUa.gtC.gtK;
    ((bpp)localObject).uhU = paramInt1;
    ((bpp)localObject).uhV = paramLong;
    ((bpp)localObject).uKq = paramInt2;
    ((bpp)localObject).uZL = paramInt3;
    ((bpp)localObject).uZM = paramInt4;
    paramInt2 = 0;
    paramInt1 = 0;
    while (paramInt1 < paramInt4)
    {
      bps localbps = new bps();
      paramInt3 = paramInt2 + 1;
      localbps.uZW = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt3 + 1;
      localbps.uZX = paramArrayOfInt[paramInt3];
      paramInt3 = paramInt2 + 1;
      localbps.uZY = paramArrayOfInt[paramInt2];
      int i = paramInt3 + 1;
      localbps.uZZ = paramArrayOfInt[paramInt3];
      paramInt2 = i + 1;
      localbps.vaa = paramArrayOfInt[i];
      ((bpp)localObject).uZN.add(localbps);
      paramInt1 += 1;
    }
    paramInt1 = 0;
    if (this.qFK.qFr.qKT.qGF != 0L) {
      paramInt1 = (int)((System.currentTimeMillis() - this.qFK.qFr.qKT.qGF) / 1000L);
    }
    ((bpp)localObject).uZO = paramInt1;
    GMTrace.o(5288715354112L, 39404);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5289118007296L, 39407);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5292607668224L, 39433);
        a.dV("MicroMsg.Voip.Redirect", "Redirect response:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " status:" + h.this.qFK.mStatus);
        if (paramAnonymousInt2 != 0)
        {
          a.dU("MicroMsg.Voip.Redirect", " redirect response with error code:" + paramAnonymousInt2);
          GMTrace.o(5292607668224L, 39433);
          return;
        }
        paramAnonymousString = (bpq)h.this.bvh();
        a.dV("MicroMsg.Voip.Redirect", "room " + paramAnonymousString.uhU + " member " + paramAnonymousString.uKq + " key " + paramAnonymousString.uhV + " relay addr cnt " + paramAnonymousString.uZP + " RedirectThreshold " + paramAnonymousString.uZU + " RedirectDecision " + paramAnonymousString.uZV);
        paramAnonymousk = new bof();
        bof localbof1 = new bof();
        bof localbof2 = new bof();
        paramAnonymousk.uYd = paramAnonymousString.uZP;
        paramAnonymousk.uYe = paramAnonymousString.uZQ;
        localbof1.uYd = paramAnonymousString.uZR;
        localbof1.uYe = paramAnonymousString.uZS;
        localbof2.uYd = paramAnonymousString.uZT;
        localbof2.uYe = paramAnonymousString.uYH;
        h.this.qFK.qFr.a(paramAnonymousk, localbof1, localbof2, paramAnonymousString.uZU, paramAnonymousString.uZV);
        GMTrace.o(5292607668224L, 39433);
      }
    };
    GMTrace.o(5289118007296L, 39407);
    return local1;
  }
  
  public final void dp(int paramInt1, int paramInt2)
  {
    GMTrace.i(5288983789568L, 39406);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bpq localbpq = (bpq)this.fUa.gtD.gtK;
      if (localbpq != null) {
        w.i("MicroMsg.Voip.Redirect", "roomId:%d, roomKey:%s, member:%d", new Object[] { Integer.valueOf(localbpq.uhU), Long.valueOf(localbpq.uhV), Integer.valueOf(localbpq.uKq) });
      }
      GMTrace.o(5288983789568L, 39406);
      return;
    }
    w.i("MicroMsg.Voip.Redirect", "Redirect error");
    GMTrace.o(5288983789568L, 39406);
  }
  
  public final int getType()
  {
    GMTrace.i(5288849571840L, 39405);
    GMTrace.o(5288849571840L, 39405);
    return 678;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */