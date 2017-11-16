package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.protocal.c.p;
import com.tencent.mm.protocal.c.q;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.a<q>
{
  public a(String paramString1, long paramLong, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(17093030313984L, 127353);
    p localp = new p();
    localp.tLZ = paramString1;
    localp.tMs = paramLong;
    localp.scene = paramInt;
    localp.tMa = paramString2;
    localp.tMu = paramString3;
    localp.omN = paramString4;
    paramString1 = new b.a();
    paramString1.gtF = localp;
    paramString1.gtG = new q();
    paramString1.gtE = 1344;
    paramString1.uri = "/cgi-bin/mmpay-bin/newaapaysucc";
    paramString1.gtH = 0;
    paramString1.gtI = 0;
    this.fUa = paramString1.DA();
    w.i("MicroMsg.CgiAAPaySucc", "CgiAAPaySucc, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s, out_trade_no: %s, trans_id: %s", new Object[] { localp.tLZ, Long.valueOf(localp.tMs), Integer.valueOf(localp.scene), localp.tMa, localp.tMu, localp.omN });
    GMTrace.o(17093030313984L, 127353);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */