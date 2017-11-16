package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.sm;
import com.tencent.mm.protocal.c.sn;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private sm mFn;
  private sn mFo;
  
  public a(String paramString)
  {
    GMTrace.i(9749441544192L, 72639);
    b.a locala = new b.a();
    locala.gtF = new sm();
    locala.gtG = new sn();
    locala.gtE = 1987;
    locala.gtH = 0;
    locala.gtI = 0;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/ffclearwxhb";
    this.gUL = locala.DA();
    this.mFn = ((sm)this.gUL.gtC.gtK);
    this.mFn.mFr = paramString;
    GMTrace.o(9749441544192L, 72639);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9749844197376L, 72642);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(9749844197376L, 72642);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9749575761920L, 72640);
    this.mFo = ((sn)((b)paramq).gtD.gtK);
    w.i("NetSceneF2FLuckyMoneyClear", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.mFo.jWs), this.mFo.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, this.mFo.jWs, this.mFo.jWt, this);
    }
    GMTrace.o(9749575761920L, 72640);
  }
  
  public final int getType()
  {
    GMTrace.i(15406450343936L, 114787);
    GMTrace.o(15406450343936L, 114787);
    return 1987;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */