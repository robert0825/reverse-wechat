package com.tencent.mm.plugin.mall.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.acg;
import com.tencent.mm.protocal.c.ach;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gUL;
  private acg mRj;
  public ach mRk;
  
  public b()
  {
    GMTrace.i(20963601154048L, 156191);
    b.a locala = new b.a();
    locala.gtF = new acg();
    locala.gtG = new ach();
    locala.gtE = 1754;
    locala.uri = "/cgi-bin/mmpay-bin/tenpay/getpaymenu";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.mRj = ((acg)this.gUL.gtC.gtK);
    GMTrace.o(20963601154048L, 156191);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20963869589504L, 156193);
    w.d("MicroMsg.NetSceneGetPayMenu", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(20963869589504L, 156193);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20964003807232L, 156194);
    w.i("MicroMsg.NetSceneGetPayMenu", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.mRk = ((ach)this.gUL.gtD.gtK);
      paramq = this.mRk.title;
      paramArrayOfByte = this.mRk.usE;
      if (this.mRk.usE == null) {
        break label148;
      }
    }
    label148:
    for (paramInt1 = this.mRk.usE.size();; paramInt1 = 0)
    {
      w.i("MicroMsg.NetSceneGetPayMenu", "onGYNetEnd, title: %s, sectors: %s, sectors.size: %s", new Object[] { paramq, paramArrayOfByte, Integer.valueOf(paramInt1) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(20964003807232L, 156194);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(20963735371776L, 156192);
    GMTrace.o(20963735371776L, 156192);
    return 1754;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */