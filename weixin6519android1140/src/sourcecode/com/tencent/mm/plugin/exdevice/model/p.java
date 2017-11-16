package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public final class p
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10986794778624L, 81858);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10986794778624L, 81858);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10986526343168L, 81856);
    w.i("MicroMsg.exdevice.NetSceneGetHardDeviceHelpUrl", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10986526343168L, 81856);
  }
  
  public final int getType()
  {
    GMTrace.i(10986660560896L, 81857);
    GMTrace.o(10986660560896L, 81857);
    return 1719;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */