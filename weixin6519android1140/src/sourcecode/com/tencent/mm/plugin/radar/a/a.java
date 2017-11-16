package com.tencent.mm.plugin.radar.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8888703254528L, 66226);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8888703254528L, 66226);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8888837472256L, 66227);
    w.d("MicroMsg.Radar.NetSceneRadarRelationChain", "netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 != 0) && (paramInt2 != 4))
    {
      GMTrace.o(8888837472256L, 66227);
      return;
    }
    GMTrace.o(8888837472256L, 66227);
  }
  
  public final int getType()
  {
    GMTrace.i(8888971689984L, 66228);
    GMTrace.o(8888971689984L, 66228);
    return 602;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */