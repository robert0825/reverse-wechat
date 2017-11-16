package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.bgb;
import com.tencent.mm.protocal.c.bgg;
import com.tencent.mm.protocal.c.bgh;
import com.tencent.mm.sdk.platformtools.bg;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int eHz;
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private long psT;
  
  public w(long paramLong, String paramString)
  {
    GMTrace.i(8047560753152L, 59959);
    this.psT = 0L;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", "opcode 3" + " snsTagId " + paramLong + " tagName " + paramString);
    this.psT = paramLong;
    this.eHz = 3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bgg();
    ((b.a)localObject).gtG = new bgh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagoption";
    ((b.a)localObject).gtE = 290;
    ((b.a)localObject).gtH = 114;
    ((b.a)localObject).gtI = 1000000114;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bgg)this.fUa.gtC.gtK;
    ((bgg)localObject).tMX = 3;
    ((bgg)localObject).uRT = paramLong;
    ((bgg)localObject).lRR = paramString;
    GMTrace.o(8047560753152L, 59959);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8047829188608L, 59961);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8047829188608L, 59961);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8047963406336L, 59962);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8047963406336L, 59962);
      return;
    }
    paramq = ((bgh)((b)paramq).gtD.gtK).uRV;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", paramq.toString());
    switch (this.eHz)
    {
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8047963406336L, 59962);
      return;
      paramArrayOfByte = ae.bjj().dW(paramq.uRT);
      paramArrayOfByte.field_tagId = paramq.uRT;
      paramArrayOfByte.field_tagName = bg.aq(paramq.lRR, "");
      paramArrayOfByte.field_count = paramq.jhc;
      paramArrayOfByte.bA(paramq.jhd);
      ae.bjj().a(paramArrayOfByte);
      continue;
      paramInt1 = ae.bjj().dX(this.psT);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSnsTagOption", "MM_SNS_TAG_DEL " + paramInt1);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8047694970880L, 59960);
    GMTrace.o(8047694970880L, 59960);
    return 290;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */