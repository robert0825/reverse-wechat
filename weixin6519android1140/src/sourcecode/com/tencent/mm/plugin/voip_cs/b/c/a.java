package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bok;
import com.tencent.mm.protocal.c.bol;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(int paramInt1, long paramLong1, long paramLong2, String paramString, int paramInt2)
  {
    GMTrace.i(11254961799168L, 83856);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bok();
    ((b.a)localObject).gtG = new bol();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoiphangup";
    ((b.a)localObject).gtE = 880;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bok)this.fUa.gtC.gtK;
    ((bok)localObject).uKf = paramInt1;
    ((bok)localObject).uYy = paramLong1;
    ((bok)localObject).uhV = paramLong2;
    ((bok)localObject).uYz = paramString;
    ((bok)localObject).unQ = paramInt2;
    ((bok)localObject).uKe = System.currentTimeMillis();
    GMTrace.o(11254961799168L, 83856);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11255230234624L, 83858);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11255230234624L, 83858);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11255364452352L, 83859);
    w.i("MicroMsg.NetSceneVoipCSHangUp", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11255364452352L, 83859);
  }
  
  public final int getType()
  {
    GMTrace.i(11255096016896L, 83857);
    GMTrace.o(11255096016896L, 83857);
    return 880;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */