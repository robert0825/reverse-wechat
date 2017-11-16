package com.tencent.mm.plugin.talkroom.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ru;
import com.tencent.mm.protocal.c.rv;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private int nvM;
  
  public b(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    GMTrace.i(5204023967744L, 38773);
    this.nvM = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ru();
    ((b.a)localObject).gtG = new rv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/exittalkroom";
    ((b.a)localObject).gtE = 333;
    ((b.a)localObject).gtH = 148;
    ((b.a)localObject).gtI = 1000000148;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ru)this.fUa.gtC.gtK;
    ((ru)localObject).uhT = paramString;
    ((ru)localObject).uhU = paramInt1;
    ((ru)localObject).uhV = paramLong;
    ((ru)localObject).tOG = paramInt2;
    GMTrace.o(5204023967744L, 38773);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5204158185472L, 38774);
    w.d("MicroMsg.NetSceneExitTalkRoom", "doScene %d", new Object[] { Integer.valueOf(this.nvM) });
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5204158185472L, 38774);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5204426620928L, 38776);
    w.d("MicroMsg.NetSceneExitTalkRoom", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5204426620928L, 38776);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5204426620928L, 38776);
  }
  
  public final int getType()
  {
    GMTrace.i(5204292403200L, 38775);
    GMTrace.o(5204292403200L, 38775);
    return 333;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */