package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.su;
import com.tencent.mm.protocal.c.sv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public int opType;
  
  public g(int paramInt, String paramString)
  {
    GMTrace.i(1361638850560L, 10145);
    this.opType = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new su();
    ((b.a)localObject).gtG = new sv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/facebookauth";
    ((b.a)localObject).gtE = 183;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    su localsu = (su)this.fUa.gtC.gtK;
    localObject = paramString;
    if (bg.nm(paramString)) {
      localObject = "";
    }
    localsu.uiM = ((String)localObject);
    localsu.lQF = paramInt;
    GMTrace.o(1361638850560L, 10145);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1361773068288L, 10146);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1361773068288L, 10146);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1362041503744L, 10148);
    w.d("MicroMsg.NetSceneFaceBookAuth", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (sv)this.fUa.gtD.gtK;
      paramInt1 = paramq.uND.tST;
      if (paramInt1 != 0)
      {
        w.e("MicroMsg.NetSceneFaceBookAuth", "baseresponse.ret = " + paramInt1);
        this.fUd.a(4, paramInt1, paramString, this);
        GMTrace.o(1362041503744L, 10148);
        return;
      }
      w.d("MicroMsg.NetSceneFaceBookAuth", "fbuserid = " + paramq.uiO + ", fbusername = " + paramq.uiP);
      if ((this.opType == 0) || (this.opType == 1))
      {
        at.AR();
        c.xh().set(65825, paramq.uiO);
        com.tencent.mm.ac.b.hL(paramq.uiO);
        at.AR();
        c.xh().set(65826, paramq.uiP);
        at.AR();
        c.xh().kL(true);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1362041503744L, 10148);
  }
  
  public final int getType()
  {
    GMTrace.i(1361907286016L, 10147);
    GMTrace.o(1361907286016L, 10147);
    return 183;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */