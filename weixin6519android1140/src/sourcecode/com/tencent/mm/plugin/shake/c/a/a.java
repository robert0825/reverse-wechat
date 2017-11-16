package com.tencent.mm.plugin.shake.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(6518955048960L, 48570);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new jh();
    ((b.a)localObject).gtG = new ji();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/cancelshakecard";
    ((b.a)localObject).gtE = 1252;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (jh)this.fUa.gtC.gtK;
    ((jh)localObject).jxF = paramString1;
    ((jh)localObject).eTK = paramString2;
    GMTrace.o(6518955048960L, 48570);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6519223484416L, 48572);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6519223484416L, 48572);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6519357702144L, 48573);
    w.i("MicroMsg.NetSceneCancelShakeCard", "onGYNetEnd, getType = 1252" + " errType = " + paramInt2 + " errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6519357702144L, 48573);
  }
  
  public final int getType()
  {
    GMTrace.i(6519089266688L, 48571);
    GMTrace.o(6519089266688L, 48571);
    return 1252;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */