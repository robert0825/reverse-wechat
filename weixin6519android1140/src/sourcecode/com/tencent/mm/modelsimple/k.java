package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.rn;
import com.tencent.mm.protocal.c.ro;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public k(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(1345666940928L, 10026);
    w.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new rn();
    ((b.a)localObject).gtG = new ro();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/entertempsession";
    ((b.a)localObject).gtE = 1066;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    if (paramString2 != null)
    {
      localObject = paramString2;
      if (paramString2.length() > 32)
      {
        localObject = paramString2;
        if (paramInt == 19) {}
      }
    }
    for (localObject = paramString2.substring(0, 32);; localObject = "")
    {
      paramString2 = (rn)this.fUa.gtC.gtK;
      paramString2.tVK = paramString1;
      paramString2.tQP = paramInt;
      paramString2.uhZ = com.tencent.mm.bm.b.Qb((String)localObject);
      paramString2.ufH = com.tencent.mm.bm.b.aX(new byte[0]);
      w.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", new Object[] { paramString1, Integer.valueOf(paramInt), Integer.valueOf(paramString2.ufH.tJp.length) });
      GMTrace.o(1345666940928L, 10026);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1345935376384L, 10028);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1345935376384L, 10028);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1346069594112L, 10029);
    w.i("MicroMsg.NetSceneEnterTempSession", "onGYNetEnd: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1346069594112L, 10029);
  }
  
  public final int getType()
  {
    GMTrace.i(1345801158656L, 10027);
    GMTrace.o(1345801158656L, 10027);
    return 1066;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */