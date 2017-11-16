package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkr;
import com.tencent.mm.protocal.c.bks;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String kBO;
  public String kBP;
  
  public m(String paramString1, String paramString2)
  {
    GMTrace.i(11185034362880L, 83335);
    this.fUd = null;
    this.fUa = null;
    this.kBO = paramString1;
    this.kBP = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bkr();
    ((b.a)localObject).gtG = new bks();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/updatecover";
    ((b.a)localObject).gtE = 1040;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bkr)this.fUa.gtC.gtK;
    ((bkr)localObject).uun = paramString1;
    ((bkr)localObject).kBP = paramString2;
    GMTrace.o(11185034362880L, 83335);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11185302798336L, 83337);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11185302798336L, 83337);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11185437016064L, 83338);
    w.d("MicroMsg.NetSceneUpdateRankCoverAndMotto", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11185437016064L, 83338);
  }
  
  public final int getType()
  {
    GMTrace.i(11185168580608L, 83336);
    GMTrace.o(11185168580608L, 83336);
    return 1040;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */