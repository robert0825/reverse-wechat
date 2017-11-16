package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.auo;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.platformtools.w;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private auo gUM;
  
  public v(int paramInt)
  {
    GMTrace.i(20304189456384L, 151278);
    b.a locala = new b.a();
    locala.gtF = new auo();
    locala.gtG = new es();
    locala.gtE = 268;
    locala.gtH = 0;
    locala.gtI = 0;
    locala.uri = "/cgi-bin/micromsg-bin/privacypolicychoise";
    this.gUL = locala.DA();
    this.gUM = ((auo)this.gUL.gtC.gtK);
    this.gUM.uJS = paramInt;
    GMTrace.o(20304189456384L, 151278);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20304457891840L, 151280);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(20304457891840L, 151280);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20304592109568L, 151281);
    w.i("MicroMsg.NetScenePrivacyPolicyChoice", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(20304592109568L, 151281);
  }
  
  public final int getType()
  {
    GMTrace.i(20304323674112L, 151279);
    GMTrace.o(20304323674112L, 151279);
    return 268;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */