package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ic;
import com.tencent.mm.protocal.c.id;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gUL;
  public id olY;
  
  public b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(19340103516160L, 144095);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ic();
    ((b.a)localObject).gtG = new id();
    ((b.a)localObject).gtE = 1241;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fpaycheck";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gUL = ((b.a)localObject).DA();
    localObject = (ic)this.gUL.gtC.gtK;
    ((ic)localObject).omK = paramString3;
    ((ic)localObject).tXc = paramString1;
    ((ic)localObject).tXd = paramString2;
    ((ic)localObject).tXe = paramInt;
    w.i("MicroMsg.NetSceneBusiF2fPayCheck", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    GMTrace.o(19340103516160L, 144095);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19340371951616L, 144097);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(19340371951616L, 144097);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19340506169344L, 144098);
    w.i("MicroMsg.NetSceneBusiF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.olY = ((id)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBusiF2fPayCheck", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.olY.jzH), this.olY.jzI });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19340506169344L, 144098);
  }
  
  public final int getType()
  {
    GMTrace.i(19340237733888L, 144096);
    GMTrace.o(19340237733888L, 144096);
    return 1241;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */