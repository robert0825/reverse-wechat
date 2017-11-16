package com.tencent.mm.plugin.profile.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.protocal.c.bcq;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString, int paramInt)
  {
    GMTrace.i(6717865721856L, 50052);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bcp();
    ((b.a)localObject).gtG = new bcq();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/setbrandflag";
    ((b.a)localObject).gtE = 1363;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bcp)this.fUa.gtC.gtK;
    ((bcp)localObject).tVU = paramString;
    ((bcp)localObject).uPc = paramInt;
    ((bcp)localObject).uPd = 4;
    GMTrace.o(6717865721856L, 50052);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6718268375040L, 50055);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneSetBrandFlag", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(6718268375040L, 50055);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6717999939584L, 50053);
    w.d("MicroMsg.brandservice.NetSceneSetBrandFlag", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(6717999939584L, 50053);
  }
  
  public final int getType()
  {
    GMTrace.i(6718134157312L, 50054);
    GMTrace.o(6718134157312L, 50054);
    return 1363;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */