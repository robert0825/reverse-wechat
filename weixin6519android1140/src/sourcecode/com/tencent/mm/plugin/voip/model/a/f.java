package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.bpi;
import com.tencent.mm.protocal.c.bpj;

public final class f
  extends n<bpi, bpj>
{
  public String TAG;
  
  public f(int paramInt1, long paramLong, int paramInt2)
  {
    GMTrace.i(5296634200064L, 39463);
    this.TAG = "MicroMsg.NetSceneVoipHeartBeat";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpi();
    ((b.a)localObject).gtG = new bpj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipheartbeat";
    ((b.a)localObject).gtE = 178;
    ((b.a)localObject).gtH = 81;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpi)this.fUa.gtC.gtK;
    ((bpi)localObject).uhU = paramInt1;
    ((bpi)localObject).uhV = paramLong;
    ((bpi)localObject).uXW = System.currentTimeMillis();
    ((bpi)localObject).uZa = paramInt2;
    GMTrace.o(5296634200064L, 39463);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5296902635520L, 39465);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5288178483200L, 39400);
        if ((paramAnonymousInt1 != 0) && (paramAnonymousInt2 == 231))
        {
          a.dU(f.this.TAG, "Voip heartbeat Failed, type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
          f.this.qFK.qFr.qKT.qGe = 111;
          f.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
          f.this.qFK.qFr.qKT.qGw = 2;
          f.this.qFK.r(1, 56532, "");
          GMTrace.o(5288178483200L, 39400);
          return;
        }
        GMTrace.o(5288178483200L, 39400);
      }
    };
    GMTrace.o(5296902635520L, 39465);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5296768417792L, 39464);
    GMTrace.o(5296768417792L, 39464);
    return 178;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */