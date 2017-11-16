package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awn;
import com.tencent.mm.protocal.c.awo;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public u(String paramString1, String paramString2)
  {
    GMTrace.i(4581924798464L, 34138);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new awn();
    ((b.a)localObject).gtG = new awo();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/quitbizchat";
    ((b.a)localObject).gtE = 1358;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (awn)this.fUa.gtC.gtK;
    ((awn)localObject).tVU = paramString1;
    ((awn)localObject).tVO = paramString2;
    GMTrace.o(4581924798464L, 34138);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4582327451648L, 34141);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneQuitBizChat", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4582327451648L, 34141);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4582059016192L, 34139);
    w.d("MicroMsg.brandservice.NetSceneQuitBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4582059016192L, 34139);
  }
  
  public final int getType()
  {
    GMTrace.i(4582193233920L, 34140);
    GMTrace.o(4582193233920L, 34140);
    return 1358;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */