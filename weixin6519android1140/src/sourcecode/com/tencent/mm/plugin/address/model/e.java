package com.tencent.mm.plugin.address.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.axh;
import com.tencent.mm.protocal.c.axi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eCQ;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public boolean hum;
  public String username;
  
  public e(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(12787862470656L, 95277);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axh();
    ((b.a)localObject).gtG = new axi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoquery";
    ((b.a)localObject).gtE = 417;
    ((b.a)localObject).gtH = 202;
    ((b.a)localObject).gtI = 1000000202;
    this.fUa = ((b.a)localObject).DA();
    localObject = (axh)this.fUa.gtC.gtK;
    ((axh)localObject).jWT = 0;
    ((axh)localObject).uMj = paramString1;
    ((axh)localObject).eSd = paramString2;
    ((axh)localObject).scene = paramInt;
    GMTrace.o(12787862470656L, 95277);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12788265123840L, 95280);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12788265123840L, 95280);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    GMTrace.i(12787996688384L, 95278);
    w.d("MicroMsg.NetSceneRcptInfoQuery", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (axi)((b)paramq).gtD.gtK;
      this.username = paramq.kJb;
      this.eCQ = paramq.uMm;
      if (paramq.uMl != 1) {
        break label202;
      }
    }
    for (;;)
    {
      this.hum = bool;
      if (paramq.uLW.uLZ != null)
      {
        w.d("MicroMsg.NetSceneRcptInfoQuery", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.uLW.uLZ.size());
        a.QM();
        a.QO().q(paramq.uLW.uLZ);
        a.QM();
        a.QO().QQ();
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12787996688384L, 95278);
      return;
      label202:
      bool = false;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12788130906112L, 95279);
    GMTrace.o(12788130906112L, 95279);
    return 417;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */