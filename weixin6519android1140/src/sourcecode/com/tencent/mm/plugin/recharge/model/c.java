package com.tencent.mm.plugin.recharge.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ui;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eMW;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public String kry;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(7854689878016L, 58522);
    this.eMW = paramString2;
    this.kry = paramString3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ui();
    ((b.a)localObject).gtG = new uj();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/flowdatarechargepreinquery";
    ((b.a)localObject).gtE = 1555;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ui)this.fUa.gtC.gtK;
    ((ui)localObject).umF = paramString1;
    ((ui)localObject).tUD = paramString2;
    ((ui)localObject).nFI = paramString3;
    ((ui)localObject).umG = paramString4;
    ((ui)localObject).umH = paramString5;
    ((ui)localObject).ugx = com.tencent.mm.plugin.wallet_core.model.mall.c.bzi().Km(paramString1);
    GMTrace.o(7854689878016L, 58522);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7855092531200L, 58525);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7855092531200L, 58525);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7854824095744L, 58523);
    w.d("MicroMsg.NetSceneFlowDataRechargePreinQuery", "errCode " + paramInt3 + ", errMsg " + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7854824095744L, 58523);
  }
  
  public final int getType()
  {
    GMTrace.i(7854958313472L, 58524);
    GMTrace.o(7854958313472L, 58524);
    return 1555;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */