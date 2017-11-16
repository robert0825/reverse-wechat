package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bgb;
import com.tencent.mm.protocal.c.bge;
import com.tencent.mm.protocal.c.bgf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private int eHz;
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private long psS;
  private int scene;
  
  public v(int paramInt1, long paramLong, String paramString, int paramInt2, List<String> paramList, int paramInt3)
  {
    GMTrace.i(8049305583616L, 59972);
    this.scene = 0;
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "opCode " + paramInt1 + " tagName " + paramString + " memberList " + paramList.size() + " scene " + paramInt3);
    this.eHz = paramInt1;
    this.psS = paramLong;
    this.scene = paramInt3;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bge();
    ((b.a)localObject).gtG = new bgf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
    ((b.a)localObject).gtE = 291;
    ((b.a)localObject).gtH = 115;
    ((b.a)localObject).gtI = 1000000115;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bge)this.fUa.gtC.gtK;
    ((bge)localObject).tMX = paramInt1;
    ((bge)localObject).uRT = paramLong;
    ((bge)localObject).lRR = paramString;
    ((bge)localObject).jhc = paramInt2;
    ((bge)localObject).tOG = this.scene;
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      paramString.add(new azq().Rq(str));
    }
    ((bge)localObject).jhd = paramString;
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "rr.req.rImpl " + localObject.toString());
    GMTrace.o(8049305583616L, 59972);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8049439801344L, 59973);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8049439801344L, 59973);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8049708236800L, 59975);
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8049708236800L, 59975);
      return;
    }
    paramq = ((bgf)((b)paramq).gtD.gtK).uRV;
    w.d("MicroMsg.NetSceneSnsTagMemberOption", "Resp.rImpl " + paramq.toString());
    paramArrayOfByte = ae.bjj().dW(paramq.uRT);
    paramArrayOfByte.field_tagId = paramq.uRT;
    paramArrayOfByte.field_tagName = bg.aq(paramq.lRR, "");
    switch (this.eHz)
    {
    }
    for (;;)
    {
      ae.bjj().a(paramArrayOfByte);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8049708236800L, 59975);
      return;
      paramArrayOfByte.field_count = paramq.jhc;
      paramArrayOfByte.bA(paramq.jhd);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8049574019072L, 59974);
    GMTrace.o(8049574019072L, 59974);
    return 291;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */