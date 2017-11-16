package com.tencent.mm.plugin.webview.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ayr;
import com.tencent.mm.protocal.c.ays;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gMj;
  private String rCK;
  private int scene;
  
  public j(ayr paramayr)
  {
    GMTrace.i(12467618971648L, 92891);
    b.a locala = new b.a();
    locala.gtE = 1134;
    locala.uri = "/cgi-bin/mmsearch-bin/searchreport";
    locala.gtF = paramayr;
    locala.gtG = new ays();
    this.gMj = locala.DA();
    this.scene = paramayr.tOG;
    this.rCK = paramayr.uNa;
    GMTrace.o(12467618971648L, 92891);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12468021624832L, 92894);
    w.i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", new Object[] { Integer.valueOf(this.scene) });
    com.tencent.mm.az.k.gT(5);
    com.tencent.mm.az.k.c(this.scene, 4, this.rCK);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(12468021624832L, 92894);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12467753189376L, 92892);
    w.i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      com.tencent.mm.az.k.gT(7);
      GMTrace.o(12467753189376L, 92892);
      return;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    com.tencent.mm.az.k.gT(6);
    com.tencent.mm.az.k.a(this.scene, 5, paramInt2, paramInt3, this.rCK);
    GMTrace.o(12467753189376L, 92892);
  }
  
  public final int getType()
  {
    GMTrace.i(12467887407104L, 92893);
    GMTrace.o(12467887407104L, 92893);
    return 1134;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */