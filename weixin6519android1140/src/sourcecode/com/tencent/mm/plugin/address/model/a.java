package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.protocal.c.pt;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(int paramInt)
  {
    GMTrace.i(15200023478272L, 113249);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ps();
    ((b.a)localObject).gtG = new pt();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
    ((b.a)localObject).gtE = 1194;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ps)this.fUa.gtC.gtK;
    ((ps)localObject).ufN = "invoice_info";
    ((ps)localObject).ufO = paramInt;
    ((ps)localObject).cfz = 2;
    GMTrace.o(15200023478272L, 113249);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(15200426131456L, 113252);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(15200426131456L, 113252);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(15200157696000L, 113250);
    w.d("MicroMsg.NetSceneDeleteUserAutoFillInfo", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      w.i("MicroMsg.NetSceneDeleteUserAutoFillInfo", "");
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(15200157696000L, 113250);
  }
  
  public final int getType()
  {
    GMTrace.i(15200291913728L, 113251);
    GMTrace.o(15200291913728L, 113251);
    return 1194;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */