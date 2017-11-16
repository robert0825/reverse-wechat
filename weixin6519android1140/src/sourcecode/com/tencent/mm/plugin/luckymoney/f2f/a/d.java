package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  public String kBQ;
  private sq mFD;
  private sr mFE;
  public String mFF;
  public String mFG;
  public int mFH;
  public String mFr;
  
  public d()
  {
    GMTrace.i(9748367802368L, 72631);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new sq();
    ((b.a)localObject).gtG = new sr();
    ((b.a)localObject).gtE = 1990;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffquerydowxhb";
    this.gUL = ((b.a)localObject).DA();
    this.mFD = ((sq)this.gUL.gtC.gtK);
    this.mFD.timestamp = (System.currentTimeMillis() / 1000L);
    localObject = h.byp();
    if (localObject != null)
    {
      this.mFD.latitude = ((at)localObject).latitude;
      this.mFD.longitude = ((at)localObject).longitude;
    }
    GMTrace.o(9748367802368L, 72631);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9748770455552L, 72634);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(9748770455552L, 72634);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9748502020096L, 72632);
    w.i("NetSceneF2FLuckyMoneyQuery", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mFE = ((sr)((b)paramq).gtD.gtK);
    this.mFr = this.mFE.mFr;
    this.kBQ = this.mFE.kBQ;
    this.mFH = this.mFE.uiK;
    this.mFF = this.mFE.mFF;
    this.mFG = this.mFE.mFG;
    if (this.fUd != null) {
      this.fUd.a(paramInt2, this.mFE.jWs, this.mFE.jWt, this);
    }
    GMTrace.o(9748502020096L, 72632);
  }
  
  public final int getType()
  {
    GMTrace.i(15406181908480L, 114785);
    GMTrace.o(15406181908480L, 114785);
    return 1990;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */