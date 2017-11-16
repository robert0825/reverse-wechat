package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alt;
import com.tencent.mm.protocal.c.alu;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eSe;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gjJ;
  public String kCc;
  
  public l(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(11184094838784L, 83328);
    this.fUd = null;
    this.fUa = null;
    this.kCc = paramString3;
    this.gjJ = paramString2;
    this.eSe = paramInt;
    this.kCc = paramString3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new alt();
    ((b.a)localObject).gtG = new alu();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/addlike";
    ((b.a)localObject).gtE = 1041;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (alt)this.fUa.gtC.gtK;
    ((alt)localObject).kJb = paramString2;
    ((alt)localObject).username = paramString1;
    ((alt)localObject).eSe = paramInt;
    ((alt)localObject).gjb = paramString3;
    GMTrace.o(11184094838784L, 83328);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11184363274240L, 83330);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11184363274240L, 83330);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11184497491968L, 83331);
    w.d("MicroMsg.NetSceneUpdateLikeStatus", "hy: end. errType: %d, errCode: %d, errMsg: %s, ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11184497491968L, 83331);
  }
  
  public final int getType()
  {
    GMTrace.i(11184229056512L, 83329);
    GMTrace.o(11184229056512L, 83329);
    return 1041;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */