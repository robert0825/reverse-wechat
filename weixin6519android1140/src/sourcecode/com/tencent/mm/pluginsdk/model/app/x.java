package com.tencent.mm.pluginsdk.model.app;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.co;
import com.tencent.mm.protocal.c.cp;

public final class x
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  int tog;
  w toh;
  
  public x(int paramInt, w paramw)
  {
    GMTrace.i(793629425664L, 5913);
    this.tog = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new co();
    ((b.a)localObject).gtG = new cp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/appcenter";
    ((b.a)localObject).gtE = 452;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (co)this.fUa.gtC.gtK;
    byte[] arrayOfByte = paramw.aFZ();
    if (arrayOfByte != null) {
      ((co)localObject).tQz = new azp().be(arrayOfByte);
    }
    ((co)localObject).jib = paramInt;
    this.toh = paramw;
    GMTrace.o(793629425664L, 5913);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(794032078848L, 5916);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(794032078848L, 5916);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(793763643392L, 5914);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneAppCenter", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneAppCenter", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(793763643392L, 5914);
      return;
    }
    this.toh.au(n.a(((cp)this.fUa.gtD.gtK).tQA));
    this.toh.a(paramInt1, paramInt2, paramInt3, paramString, this.fUa, paramArrayOfByte);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(793763643392L, 5914);
  }
  
  public final int getType()
  {
    GMTrace.i(793897861120L, 5915);
    GMTrace.o(793897861120L, 5915);
    return 452;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */