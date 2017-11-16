package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ia;
import com.tencent.mm.protocal.c.ib;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gUL;
  public ib olX;
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt, com.tencent.mm.bm.b paramb, String paramString4)
  {
    GMTrace.i(19339029774336L, 144087);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ia();
    ((b.a)localObject).gtG = new ib();
    ((b.a)localObject).gtE = 1680;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2factqry";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gUL = ((b.a)localObject).DA();
    localObject = (ia)this.gUL.gtC.gtK;
    ((ia)localObject).omK = paramString3;
    ((ia)localObject).tXc = paramString1;
    ((ia)localObject).tXd = paramString2;
    ((ia)localObject).tXe = paramInt;
    ((ia)localObject).tXf = paramb;
    ((ia)localObject).tXg = paramString4;
    w.i("MicroMsg.NetSceneBusiF2fActQry", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    GMTrace.o(19339029774336L, 144087);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19339298209792L, 144089);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(19339298209792L, 144089);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19339432427520L, 144090);
    w.i("MicroMsg.NetSceneBusiF2fActQry", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.olX = ((ib)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBusiF2fActQry", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.olX.jzH), this.olX.jzI });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19339432427520L, 144090);
  }
  
  public final int getType()
  {
    GMTrace.i(19339163992064L, 144088);
    GMTrace.o(19339163992064L, 144088);
    return 1680;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */