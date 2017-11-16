package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.boz;
import com.tencent.mm.protocal.c.bpz;

public final class c
  extends n<boy, boz>
{
  public c(int paramInt1, long paramLong, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(5293949845504L, 39443);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new boy();
    ((b.a)localObject).gtG = new boz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipcancelinvite";
    ((b.a)localObject).gtE = 171;
    ((b.a)localObject).gtH = 64;
    ((b.a)localObject).gtI = 1000000064;
    this.fUa = ((b.a)localObject).DA();
    localObject = (boy)this.fUa.gtC.gtK;
    ((boy)localObject).uhU = paramInt1;
    ((boy)localObject).uhV = paramLong;
    ((boy)localObject).lSX = paramString1;
    ((boy)localObject).uKf = paramInt2;
    paramString1 = new bpz();
    azq localazq = new azq();
    localazq.Rq(paramString2);
    paramString1.uTT = localazq;
    ((boy)localObject).uYP = paramString1;
    ((boy)localObject).uXW = System.currentTimeMillis();
    GMTrace.o(5293949845504L, 39443);
  }
  
  public final e bvd()
  {
    GMTrace.i(5294352498688L, 39446);
    e local1 = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5292339232768L, 39431);
        a.dW("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
        GMTrace.o(5292339232768L, 39431);
      }
    };
    GMTrace.o(5294352498688L, 39446);
    return local1;
  }
  
  public final int bve()
  {
    GMTrace.i(5294084063232L, 39444);
    boy localboy = (boy)bvi();
    if ((localboy.uhU == 0) && (localboy.uKf == 0))
    {
      GMTrace.o(5294084063232L, 39444);
      return -1;
    }
    GMTrace.o(5294084063232L, 39444);
    return 0;
  }
  
  public final int getType()
  {
    GMTrace.i(5294218280960L, 39445);
    GMTrace.o(5294218280960L, 39445);
    return 171;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */