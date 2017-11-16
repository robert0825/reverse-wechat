package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.j;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final q guL;
  
  public m()
  {
    GMTrace.i(13157632311296L, 98032);
    this.guL = new j();
    GMTrace.o(13157632311296L, 98032);
  }
  
  public final boolean DH()
  {
    GMTrace.i(13157900746752L, 98034);
    GMTrace.o(13157900746752L, 98034);
    return false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13158034964480L, 98035);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(13158034964480L, 98035);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13158169182208L, 98036);
    w.d("MicroMsg.NetSceneGetCert", "dkcert onGYNetEnd [%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13158169182208L, 98036);
  }
  
  public final int getType()
  {
    GMTrace.i(13157766529024L, 98033);
    GMTrace.o(13157766529024L, 98033);
    return 381;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */