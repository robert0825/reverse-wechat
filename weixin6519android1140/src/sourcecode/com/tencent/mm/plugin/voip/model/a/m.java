package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.o;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bpb;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.bqe;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;

public final class m
  extends n<bqd, bqe>
{
  public m(int paramInt1, bpb parambpb, byte[] paramArrayOfByte, long paramLong, int paramInt2)
  {
    GMTrace.i(5298379030528L, 39476);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bqd();
    ((b.a)localObject).gtG = new bqe();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipsync";
    ((b.a)localObject).gtE = 174;
    ((b.a)localObject).gtH = 62;
    ((b.a)localObject).gtI = 1000000062;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bqd)this.fUa.gtC.gtK;
    ((bqd)localObject).uhU = paramInt1;
    ((bqd)localObject).vam = parambpb;
    ((bqd)localObject).uhV = paramLong;
    ((bqd)localObject).uKB = q.zE();
    ((bqd)localObject).tZz = paramInt2;
    ((bqd)localObject).tZA = new azp().be(paramArrayOfByte);
    ((bqd)localObject).uXW = System.currentTimeMillis();
    w.d("MicroMsg.NetSceneVoipSync", "sync timestamp: " + ((bqd)localObject).uXW);
    GMTrace.o(5298379030528L, 39476);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5298781683712L, 39479);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5289386442752L, 39409);
        a.dW("MicroMsg.NetSceneVoipSync", "onSceneEnd type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
        try
        {
          if (((bqe)m.this.bvh()).uhU != m.this.qFK.qFr.mjF)
          {
            a.dU("MicroMsg.NetSceneVoipSync", "syncOnSceneEnd: recv roomId != current roomid");
            GMTrace.o(5289386442752L, 39409);
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          if (paramAnonymousInt1 != 0)
          {
            a.dU("MicroMsg.NetSceneVoipSync", "VoipSync Failed, type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
            m.this.qFK.qFr.qKT.qGe = 11;
            m.this.qFK.qFr.qKT.qGg = paramAnonymousInt2;
            m.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
            m.this.qFK.qFr.qKT.qGw = 3;
            if (paramAnonymousInt1 == 1) {}
            for (m.this.qFK.qFr.qKT.qGq = 8;; m.this.qFK.qFr.qKT.qGq = 99)
            {
              m.this.qFK.r(1, 56532, "");
              GMTrace.o(5289386442752L, 39409);
              return;
            }
          }
          m.this.qFK.qFu.o(paramAnonymousk);
          GMTrace.o(5289386442752L, 39409);
        }
      }
    };
    GMTrace.o(5298781683712L, 39479);
    return local1;
  }
  
  public final int bvf()
  {
    GMTrace.i(5298647465984L, 39478);
    int i = ((bqd)this.fUa.gtC.gtK).tZz;
    GMTrace.o(5298647465984L, 39478);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(5298513248256L, 39477);
    GMTrace.o(5298513248256L, 39477);
    return 174;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */