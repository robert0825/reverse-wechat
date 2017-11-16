package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bpt;
import com.tencent.mm.protocal.c.bpu;
import com.tencent.mm.protocal.c.bpz;

public final class i
  extends n<bpt, bpu>
{
  public String TAG;
  
  public i(int paramInt, long paramLong, String paramString)
  {
    GMTrace.i(5295426240512L, 39454);
    this.TAG = "MicroMsg.NetSceneVoipShutDown";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bpt();
    ((b.a)localObject).gtG = new bpu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipshutdown";
    ((b.a)localObject).gtE = 173;
    ((b.a)localObject).gtH = 66;
    ((b.a)localObject).gtI = 1000000066;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bpt)this.fUa.gtC.gtK;
    ((bpt)localObject).uhU = paramInt;
    ((bpt)localObject).uhV = paramLong;
    bpz localbpz = new bpz();
    azq localazq = new azq();
    localazq.Rq(paramString);
    localbpz.uTT = localazq;
    ((bpt)localObject).uYP = localbpz;
    ((bpt)localObject).uXW = System.currentTimeMillis();
    GMTrace.o(5295426240512L, 39454);
  }
  
  public final e bvd()
  {
    GMTrace.i(5295694675968L, 39456);
    e local1 = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5297171070976L, 39467);
        a.dW(i.this.TAG, "onSceneEnd type:" + paramAnonymousk.getType() + " errType:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2);
        GMTrace.o(5297171070976L, 39467);
      }
    };
    GMTrace.o(5295694675968L, 39456);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5295560458240L, 39455);
    GMTrace.o(5295560458240L, 39455);
    return 173;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */