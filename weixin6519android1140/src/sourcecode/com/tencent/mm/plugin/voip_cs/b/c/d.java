package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bor;
import com.tencent.mm.protocal.c.bos;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public d(long paramLong1, long paramLong2)
  {
    GMTrace.i(11257109282816L, 83872);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bor();
    ((b.a)localObject).gtG = new bos();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipredirect";
    ((b.a)localObject).gtE = 285;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bor)this.fUa.gtC.gtK;
    ((bor)localObject).uYy = paramLong1;
    ((bor)localObject).uhV = paramLong2;
    ((bor)localObject).uKe = System.currentTimeMillis();
    GMTrace.o(11257109282816L, 83872);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11257511936000L, 83875);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11257511936000L, 83875);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11257243500544L, 83873);
    w.i("MicroMsg.NetSceneVoipCSRedirect", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11257243500544L, 83873);
  }
  
  public final int getType()
  {
    GMTrace.i(11257377718272L, 83874);
    GMTrace.o(11257377718272L, 83874);
    return 285;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */