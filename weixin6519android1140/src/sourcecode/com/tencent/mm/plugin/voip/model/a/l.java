package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bpz;
import com.tencent.mm.protocal.c.bqa;
import com.tencent.mm.protocal.c.bqb;

public final class l
  extends n<bqa, bqb>
{
  public l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(5288312700928L, 39401);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bqa();
    ((b.a)localObject).gtG = new bqb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipstatreport";
    ((b.a)localObject).gtE = 320;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bqa)this.fUa.gtC.gtK;
    bpz localbpz = new bpz();
    azq localazq = new azq();
    localazq.Rq(paramString1);
    localbpz.uTT = localazq;
    paramString1 = new bpz();
    localazq = new azq();
    localazq.Rq(paramString2);
    paramString1.uTT = localazq;
    paramString2 = new bpz();
    localazq = new azq();
    localazq.Rq(paramString3);
    paramString2.uTT = localazq;
    paramString3 = new bpz();
    localazq = new azq();
    localazq.Rq(paramString4);
    paramString3.uTT = localazq;
    paramString4 = new bpz();
    localazq = new azq();
    localazq.Rq(paramString5);
    paramString4.uTT = localazq;
    ((bqa)localObject).uYP = localbpz;
    ((bqa)localObject).vaj = paramString1;
    ((bqa)localObject).vai = paramString2;
    ((bqa)localObject).vak = paramString3;
    ((bqa)localObject).val = paramString4;
    GMTrace.o(5288312700928L, 39401);
  }
  
  public final e bvd()
  {
    GMTrace.i(5288581136384L, 39403);
    e local1 = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5295292022784L, 39453);
        a.dW("MicroMsg.NetSceneVoipStatReport", "onSceneEnd type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
        GMTrace.o(5295292022784L, 39453);
      }
    };
    GMTrace.o(5288581136384L, 39403);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5288446918656L, 39402);
    GMTrace.o(5288446918656L, 39402);
    return 320;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */