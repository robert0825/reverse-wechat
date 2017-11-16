package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.az;
import com.tencent.mm.protocal.c.ba;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private LinkedList<bf> prZ;
  
  public k(LinkedList<bf> paramLinkedList)
  {
    GMTrace.i(16639508611072L, 123974);
    b.a locala = new b.a();
    locala.gtF = new az();
    locala.gtG = new ba();
    locala.uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    locala.gtE = 1295;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((az)this.fUa.gtC.gtK).tPk = paramLinkedList;
    this.prZ = paramLinkedList;
    GMTrace.o(16639508611072L, 123974);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(16639777046528L, 123976);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(16639777046528L, 123976);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(16639911264256L, 123977);
    w.d("MicroMsg.NetSceneSnsAdDataReport", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(16639911264256L, 123977);
  }
  
  public final int getType()
  {
    GMTrace.i(16639642828800L, 123975);
    GMTrace.o(16639642828800L, 123975);
    return 1295;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */