package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.nz;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.protocal.c.wz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(7023345270784L, 52328);
    w.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new wy();
    ((b.a)localObject).gtG = new wz();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bankresource";
    ((b.a)localObject).gtE = 1650;
    this.fUa = ((b.a)localObject).DA();
    this.fUa.gtT = true;
    localObject = (wy)this.fUa.gtC.gtK;
    ((wy)localObject).uoN = paramLinkedList;
    ((wy)localObject).tYT = com.tencent.mm.plugin.wallet_core.model.h.byp();
    com.tencent.mm.wallet_core.ui.e.EQ(42);
    GMTrace.o(7023345270784L, 52328);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7023613706240L, 52330);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7023613706240L, 52330);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7023747923968L, 52331);
    w.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (wz)((com.tencent.mm.ad.b)paramq).gtD.gtK;
      w.i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", new Object[] { paramq.uoP });
      paramArrayOfByte = paramq.uoO;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.size() == 0))
      {
        w.d("MicroMsg.NetSceneGetBankcardLogo", "empty bank logo list");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vuc, bg.aq(paramq.uoP, ""));
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vud, Long.valueOf(System.currentTimeMillis() / 1000L));
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(7023747923968L, 52331);
      return;
      nz localnz = new nz();
      localnz.eST.eSV = paramArrayOfByte;
      a.vgX.m(localnz);
      break;
      com.tencent.mm.wallet_core.ui.e.EQ(43);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(15395041837056L, 114702);
    GMTrace.o(15395041837056L, 114702);
    return 1650;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */