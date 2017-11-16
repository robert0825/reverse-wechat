package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xi;
import com.tencent.mm.protocal.c.xj;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  boolean gyN;
  
  public o(String paramString1, String paramString2)
  {
    GMTrace.i(4559376220160L, 33970);
    this.gyN = false;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xi();
    ((b.a)localObject).gtG = new xj();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizchatinfo";
    ((b.a)localObject).gtE = 1352;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (xi)this.fUa.gtC.gtK;
    ((xi)localObject).tVO = paramString1;
    ((xi)localObject).tVU = paramString2;
    this.gyN = true;
    GMTrace.o(4559376220160L, 33970);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4559778873344L, 33973);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneGetBizChatInfo", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4559778873344L, 33973);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4559510437888L, 33971);
    w.d("MicroMsg.brandservice.NetSceneGetBizChatInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4559510437888L, 33971);
  }
  
  public final int getType()
  {
    GMTrace.i(4559644655616L, 33972);
    GMTrace.o(4559644655616L, 33972);
    return 1352;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */