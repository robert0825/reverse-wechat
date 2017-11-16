package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ar;
import com.tencent.mm.protocal.c.auj;
import com.tencent.mm.protocal.c.auk;
import com.tencent.mm.protocal.c.azu;
import com.tencent.mm.protocal.c.rz;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String nHE;
  public LinkedList<rz> nHP;
  public LinkedList<ar> nHQ;
  
  public j(LinkedList<azu> paramLinkedList, int paramInt)
  {
    GMTrace.i(5989197676544L, 44623);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new auj();
    ((b.a)localObject).gtG = new auk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/presubmitorder";
    ((b.a)localObject).gtE = 554;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (auj)this.fUa.gtC.gtK;
    ((auj)localObject).tYO = paramLinkedList;
    if (paramLinkedList != null) {
      i = paramLinkedList.size();
    }
    ((auj)localObject).nFo = i;
    ((auj)localObject).uJH = paramInt;
    GMTrace.o(5989197676544L, 44623);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5989600329728L, 44626);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5989600329728L, 44626);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5989331894272L, 44624);
    paramArrayOfByte = (auk)((b)paramq).gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.tYQ == 0))
    {
      w.d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.ExpressCount " + paramArrayOfByte.urD);
      w.d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.LockId " + paramArrayOfByte.tYP);
      this.nHP = paramArrayOfByte.uJI;
      this.nHE = paramArrayOfByte.tYP;
      this.nHQ = paramArrayOfByte.uJJ;
    }
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.tYQ != 0)
      {
        paramInt1 = paramArrayOfByte.tYQ;
        paramq = paramArrayOfByte.tYR;
      }
    }
    w.d("MicroMsg.NetSceneMallPreSubmitOrder", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.fUd.a(paramInt2, paramInt1, paramq, this);
    GMTrace.o(5989331894272L, 44624);
  }
  
  public final int getType()
  {
    GMTrace.i(5989466112000L, 44625);
    GMTrace.o(5989466112000L, 44625);
    return 554;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */