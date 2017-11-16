package com.tencent.mm.plugin.product.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azu;
import com.tencent.mm.protocal.c.jd;
import com.tencent.mm.protocal.c.je;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public f(LinkedList<azu> paramLinkedList, String paramString)
  {
    GMTrace.i(5990674071552L, 44634);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new jd();
    ((b.a)localObject).gtG = new je();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cancelpreorder";
    ((b.a)localObject).gtE = 555;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (jd)this.fUa.gtC.gtK;
    ((jd)localObject).tYO = paramLinkedList;
    if (paramLinkedList != null) {
      i = paramLinkedList.size();
    }
    ((jd)localObject).nFo = i;
    ((jd)localObject).tYP = paramString;
    w.d("MicroMsg.NetSceneMallCancelPreOrder", "lockId " + paramString);
    GMTrace.o(5990674071552L, 44634);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5991076724736L, 44637);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5991076724736L, 44637);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5990808289280L, 44635);
    paramArrayOfByte = (je)((b)paramq).gtD.gtK;
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
    w.d("MicroMsg.NetSceneMallCancelPreOrder", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.fUd.a(paramInt2, paramInt1, paramq, this);
    GMTrace.o(5990808289280L, 44635);
  }
  
  public final int getType()
  {
    GMTrace.i(5990942507008L, 44636);
    GMTrace.o(5990942507008L, 44636);
    return 555;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */