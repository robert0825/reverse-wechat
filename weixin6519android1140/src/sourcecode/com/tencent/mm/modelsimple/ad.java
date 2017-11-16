package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbp;
import com.tencent.mm.protocal.c.bbq;
import java.util.LinkedList;

public final class ad
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ad(int[] paramArrayOfInt)
  {
    GMTrace.i(1347814424576L, 10042);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bbp();
    ((b.a)localObject).gtG = new bbq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendinviteemail";
    ((b.a)localObject).gtE = 116;
    ((b.a)localObject).gtH = 41;
    ((b.a)localObject).gtI = 1000000041;
    this.fUa = ((b.a)localObject).DA();
    localObject = new LinkedList();
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      ((LinkedList)localObject).add(Integer.valueOf(paramArrayOfInt[i]));
      i += 1;
    }
    ((bbp)this.fUa.gtC.gtK).uON = ((LinkedList)localObject);
    ((bbp)this.fUa.gtC.gtK).uOM = ((LinkedList)localObject).size();
    GMTrace.o(1347814424576L, 10042);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1347948642304L, 10043);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1347948642304L, 10043);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1348217077760L, 10045);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1348217077760L, 10045);
  }
  
  public final int getType()
  {
    GMTrace.i(1348082860032L, 10044);
    GMTrace.o(1348082860032L, 10044);
    return 116;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */