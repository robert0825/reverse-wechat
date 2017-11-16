package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ka;
import com.tencent.mm.protocal.c.kb;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  public kb jWq;
  
  public j()
  {
    GMTrace.i(17427903545344L, 129848);
    b.a locala = new b.a();
    locala.gtF = new ka();
    locala.gtG = new kb();
    locala.gtE = 1256;
    locala.uri = "/cgi-bin/mmpay-bin/f2fannounce";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    w.d("MicroMsg.NetSceneF2fAnnouce", "do cgi");
    GMTrace.o(17427903545344L, 129848);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(17428171980800L, 129850);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(17428171980800L, 129850);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(17428306198528L, 129851);
    w.i("MicroMsg.NetSceneF2fAnnouce", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.jWq = ((kb)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(17428306198528L, 129851);
  }
  
  public final int getType()
  {
    GMTrace.i(17428037763072L, 129849);
    GMTrace.o(17428037763072L, 129849);
    return 1256;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */