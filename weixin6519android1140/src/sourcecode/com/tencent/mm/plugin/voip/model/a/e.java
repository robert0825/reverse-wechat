package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.protocal.c.bpg;
import com.tencent.mm.protocal.c.bph;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends n<bpg, bph>
{
  public e(int paramInt, long paramLong, String paramString)
  {
    GMTrace.i(5297842159616L, 39472);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpg();
    ((b.a)localObject).gtG = new bph();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipgetroominfo";
    ((b.a)localObject).gtE = 303;
    ((b.a)localObject).gtH = 119;
    ((b.a)localObject).gtI = 1000000119;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpg)this.fUa.gtC.gtK;
    ((bpg)localObject).uhU = paramInt;
    ((bpg)localObject).uhV = paramLong;
    ((bpg)localObject).uYY = paramString;
    ((bpg)localObject).jib = 1;
    ((bpg)localObject).uXW = System.currentTimeMillis();
    GMTrace.o(5297842159616L, 39472);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5298244812800L, 39475);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5297707941888L, 39471);
        a.dU("MicroMsg.Voip.GetRoomInfo", "Voip onSceneEnd type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousk != null))
        {
          paramAnonymousString = (bph)e.this.bvh();
          if ((paramAnonymousString.uND.tST == 0) && (!d.btG().qIe.buU())) {
            d.btG().a(paramAnonymousString);
          }
        }
        GMTrace.o(5297707941888L, 39471);
      }
    };
    GMTrace.o(5298244812800L, 39475);
    return local1;
  }
  
  public final void dp(int paramInt1, int paramInt2)
  {
    GMTrace.i(5298110595072L, 39474);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bph localbph = (bph)bvh();
      if (localbph != null) {
        w.i("MicroMsg.Voip.GetRoomInfo", "roomId:%d, roomKey:%s, memberCount:%d, inviteType:%d", new Object[] { Integer.valueOf(localbph.uhU), Long.valueOf(localbph.uhV), Integer.valueOf(localbph.jNj), Integer.valueOf(localbph.uYQ) });
      }
      GMTrace.o(5298110595072L, 39474);
      return;
    }
    w.i("MicroMsg.Voip.GetRoomInfo", "Get RoomInfo error");
    GMTrace.o(5298110595072L, 39474);
  }
  
  public final int getType()
  {
    GMTrace.i(5297976377344L, 39473);
    GMTrace.o(5297976377344L, 39473);
    return 303;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */