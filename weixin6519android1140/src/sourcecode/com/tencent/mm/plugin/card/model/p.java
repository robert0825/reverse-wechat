package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aj;
import com.tencent.mm.protocal.c.ak;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jzG;
  public int jzH;
  public String jzI;
  
  public p(LinkedList<jn> paramLinkedList, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(4912234627072L, 36599);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aj();
    ((b.a)localObject).gtG = new ak();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcardlistfromapp";
    ((b.a)localObject).gtE = 687;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aj)this.fUa.gtC.gtK;
    ((aj)localObject).tNM = paramLinkedList;
    ((aj)localObject).eTL = paramInt1;
    ((aj)localObject).tNI = paramString1;
    ((aj)localObject).tNH = paramString2;
    ((aj)localObject).tNJ = paramInt2;
    GMTrace.o(4912234627072L, 36599);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4912503062528L, 36601);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4912503062528L, 36601);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4912637280256L, 36602);
    w.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ak)this.fUa.gtD.gtK;
      this.jzG = paramq.jzG;
      this.jzH = paramq.jzH;
      this.jzI = paramq.jzI;
      w.e("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, ret_code = " + this.jzH + " ret_msg = " + this.jzI);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4912637280256L, 36602);
  }
  
  public final int getType()
  {
    GMTrace.i(4912368844800L, 36600);
    GMTrace.o(4912368844800L, 36600);
    return 687;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */