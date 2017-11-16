package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.bgy;
import com.tencent.mm.protocal.c.bpx;
import com.tencent.mm.protocal.c.bpy;

public final class k
  extends n<bpx, bpy>
{
  public k(bgy parambgy)
  {
    GMTrace.i(5296231546880L, 39460);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpx();
    ((b.a)localObject).gtG = new bpy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipspeedtest";
    ((b.a)localObject).gtE = 765;
    ((b.a)localObject).gtH = 765;
    ((b.a)localObject).gtI = 1000000765;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpx)this.fUa.gtC.gtK;
    ((bpx)localObject).uhU = parambgy.uhU;
    ((bpx)localObject).uSE = parambgy.uSE;
    ((bpx)localObject).udE = parambgy.udE;
    ((bpx)localObject).uSF = parambgy.uSF;
    ((bpx)localObject).uSG = parambgy.uSG;
    ((bpx)localObject).uSH = parambgy.uSH;
    ((bpx)localObject).uSI = parambgy.uSI;
    ((bpx)localObject).uSJ = parambgy.uSJ;
    ((bpx)localObject).uSK = parambgy.uSK;
    ((bpx)localObject).uSL = parambgy.uSL;
    ((bpx)localObject).uSM = parambgy.uSM;
    ((bpx)localObject).uSN = parambgy.uSN;
    ((bpx)localObject).uSO = parambgy.uSO;
    GMTrace.o(5296231546880L, 39460);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5296499982336L, 39462);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(5295023587328L, 39451);
        a.dW("MicroMsg.NetSceneVoipSpeedTest", "onSceneEnd type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
        try
        {
          paramAnonymousString = (bpy)k.this.bvh();
          if ((paramAnonymousString.vaf == 0) || (paramAnonymousString.vag == 0))
          {
            a.dU("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, svrCount = " + paramAnonymousString.vag);
            GMTrace.o(5295023587328L, 39451);
            return;
          }
          if (k.this.qFK.qEW != 1)
          {
            a.dU("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, for mSpeedTestStatus = " + k.this.qFK.qEW);
            GMTrace.o(5295023587328L, 39451);
            return;
          }
          k.this.qFK.qEW = 2;
          k.this.qFK.qEY = paramAnonymousString.vab;
          paramAnonymousk = k.this.qFK.qFr;
          if (paramAnonymousk.qKz != 0L)
          {
            a.dW("MicroMsg.Voip", "v2protocal StartVoipSpeedTest fail: a speedtest is doing");
            GMTrace.o(5295023587328L, 39451);
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          k.this.qFK.qEW = 0;
          GMTrace.o(5295023587328L, 39451);
          return;
        }
        paramAnonymousk.qKz = paramAnonymousString.vab;
        paramAnonymousk.field_SpeedTestSvrParaArray = a.a(paramAnonymousString);
        paramAnonymousk.StartSpeedTest(paramAnonymousString.vab, paramAnonymousString.vag);
        GMTrace.o(5295023587328L, 39451);
      }
    };
    GMTrace.o(5296499982336L, 39462);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5296365764608L, 39461);
    GMTrace.o(5296365764608L, 39461);
    return 765;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */