package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.btk;
import com.tencent.mm.protocal.c.btl;
import com.tencent.mm.protocal.c.nq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gMj;
  btk gSc;
  btl gSd;
  
  public m(List<String> paramList, int paramInt, long paramLong, List<nq> paramList1)
  {
    GMTrace.i(1325936934912L, 9879);
    this.gSc = new btk();
    paramList = new b.a();
    paramList.gtE = 1948;
    paramList.uri = "/cgi-bin/mmsearch-bin/websearchconfig";
    paramList.gtF = new btk();
    paramList.gtG = new btl();
    this.gMj = paramList.DA();
    this.gSc = ((btk)this.gMj.gtC.gtK);
    this.gSc.uBR = e.GL();
    this.gSc.kBh = v.eq(ab.getContext());
    this.gSc.unS = e.Ku();
    this.gSc.uBS = e.CO();
    this.gSc.tOG = paramInt;
    this.gSc.tXu = 0L;
    GMTrace.o(1325936934912L, 9879);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1326205370368L, 9881);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(1326205370368L, 9881);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1326339588096L, 9882);
    w.i("MicroMsg.FTS.NetSceneWebSearchConfig", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1326339588096L, 9882);
      return;
    }
    this.gSd = ((btl)this.gMj.gtD.gtK);
    if (this.gSd != null) {
      w.v("MicroMsg.FTS.NetSceneWebSearchConfig", "return data\n%s", new Object[] { this.gSd.tWC });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1326339588096L, 9882);
  }
  
  public final int getType()
  {
    GMTrace.i(1326071152640L, 9880);
    GMTrace.o(1326071152640L, 9880);
    return 1948;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */