package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gb;
import com.tencent.mm.protocal.c.gc;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public gc rrx;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(19589211619328L, 145951);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new gb();
    ((b.a)localObject).gtG = new gc();
    ((b.a)localObject).gtE = 1986;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bindecard";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (gb)this.fUa.gtC.gtK;
    ((gb)localObject).tUk = paramString1;
    ((gb)localObject).tUl = paramString2;
    ((gb)localObject).riG = paramString3;
    ((gb)localObject).tUm = paramString4;
    ((gb)localObject).ePo = paramInt;
    w.i("MicroMsg.NetSceneBindECard", "cardType: %s, reqSerial: %s, openScene: %s, verifyCode: %s, bindToken: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3, paramString4 });
    GMTrace.o(19589211619328L, 145951);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19589614272512L, 145954);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19589614272512L, 145954);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19589345837056L, 145952);
    w.i("MicroMsg.NetSceneBindECard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.rrx = ((gc)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBindECard", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.rrx.jzH), this.rrx.jzI });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19589345837056L, 145952);
  }
  
  public final int getType()
  {
    GMTrace.i(19589480054784L, 145953);
    GMTrace.o(19589480054784L, 145953);
    return 1986;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */