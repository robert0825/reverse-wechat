package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.st;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eHG;
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private ss mFB;
  private st mFC;
  
  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9748904673280L, 72635);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ss();
    ((b.a)localObject).gtG = new st();
    ((b.a)localObject).gtE = 1970;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/ffrequestwxhb";
    this.gUL = ((b.a)localObject).DA();
    this.mFB = ((ss)this.gUL.gtC.gtK);
    this.mFB.jWn = paramInt1;
    this.mFB.nJX = paramInt2;
    this.mFB.mIb = paramInt3;
    this.mFB.uiL = paramInt4;
    localObject = h.byp();
    if (localObject != null)
    {
      this.mFB.latitude = ((at)localObject).latitude;
      this.mFB.longitude = ((at)localObject).longitude;
    }
    GMTrace.o(9748904673280L, 72635);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9749307326464L, 72638);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(9749307326464L, 72638);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9749038891008L, 72636);
    w.i("NetSceneF2FLuckyMoneyPrepare", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mFC = ((st)((b)paramq).gtD.gtK);
    this.eHG = this.mFC.mJK;
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(9749038891008L, 72636);
  }
  
  public final int getType()
  {
    GMTrace.i(15406316126208L, 114786);
    GMTrace.o(15406316126208L, 114786);
    return 1970;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */