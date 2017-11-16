package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bax;
import com.tencent.mm.protocal.c.bay;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public o(String paramString)
  {
    GMTrace.i(19135018827776L, 142567);
    Object localObject = new b.a();
    ((b.a)localObject).gtE = 1944;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchlocalpage";
    ((b.a)localObject).gtF = new bax();
    ((b.a)localObject).gtG = new bay();
    this.fUa = ((b.a)localObject).DA();
    localObject = (bax)this.fUa.gtC.gtK;
    ((bax)localObject).uOq = paramString;
    ((bax)localObject).tOG = 25;
    ((bax)localObject).kBh = v.eq(ab.getContext());
    ((bax)localObject).uBS = e.CO();
    GMTrace.o(19135018827776L, 142567);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19135287263232L, 142569);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19135287263232L, 142569);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19135421480960L, 142570);
    w.i("MicroMsg.FTS.NetSceneWebSearchLocalPage", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19135421480960L, 142570);
  }
  
  public final int getType()
  {
    GMTrace.i(19135153045504L, 142568);
    int i = this.fUa.gtE;
    GMTrace.o(19135153045504L, 142568);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\az\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */