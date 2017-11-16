package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ie;
import com.tencent.mm.protocal.c.if;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  public if oma;
  
  public d(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    GMTrace.i(19339566645248L, 144091);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ie();
    ((b.a)localObject).gtG = new if();
    ((b.a)localObject).gtE = 1537;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fpayok";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gUL = ((b.a)localObject).DA();
    localObject = (ie)this.gUL.gtC.gtK;
    ((ie)localObject).tXc = paramString1;
    ((ie)localObject).tXd = paramString2;
    ((ie)localObject).omK = paramString3;
    ((ie)localObject).tXg = paramString4;
    ((ie)localObject).tXe = paramInt;
    w.i("MicroMsg.NetSceneBusiF2fResult", "f2fId: %s, transId: %s, amount: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    GMTrace.o(19339566645248L, 144091);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19339835080704L, 144093);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(19339835080704L, 144093);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19339969298432L, 144094);
    w.i("MicroMsg.NetSceneBusiF2fResult", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.oma = ((if)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBusiF2fResult", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.oma.jzH), this.oma.jzI });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19339969298432L, 144094);
  }
  
  public final int getType()
  {
    GMTrace.i(19339700862976L, 144092);
    GMTrace.o(19339700862976L, 144092);
    return 1537;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */