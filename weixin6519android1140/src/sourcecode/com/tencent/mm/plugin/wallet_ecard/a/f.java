package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avu;
import com.tencent.mm.protocal.c.avv;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public avv rrD;
  
  public f(String paramString, int paramInt)
  {
    GMTrace.i(19592567062528L, 145976);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new avu();
    ((b.a)localObject).gtG = new avv();
    ((b.a)localObject).gtE = 1988;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/qryecardbanklist4bind";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (avu)this.fUa.gtC.gtK;
    ((avu)localObject).tUk = paramString;
    ((avu)localObject).ePo = paramInt;
    w.i("MicroMsg.NetSceneQryBankList4Bind", "cardType: %s, openScene: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
    GMTrace.o(19592567062528L, 145976);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19592969715712L, 145979);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19592969715712L, 145979);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19592701280256L, 145977);
    w.i("MicroMsg.NetSceneQryBankList4Bind", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.rrD = ((avv)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQryBankList4Bind", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.rrD.jzH), this.rrD.jzI });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19592701280256L, 145977);
  }
  
  public final int getType()
  {
    GMTrace.i(19592835497984L, 145978);
    GMTrace.o(19592835497984L, 145978);
    return 1988;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */