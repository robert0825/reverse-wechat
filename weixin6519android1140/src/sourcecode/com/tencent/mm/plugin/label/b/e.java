package com.tencent.mm.plugin.label.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aky;
import com.tencent.mm.protocal.c.bkn;
import com.tencent.mm.protocal.c.bko;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private aky muQ;
  
  public e(int paramInt, String paramString)
  {
    GMTrace.i(7276614123520L, 54215);
    this.muQ = null;
    b.a locala = new b.a();
    locala.gtF = new bkn();
    locala.gtG = new bko();
    locala.uri = "/cgi-bin/micromsg-bin/updatecontactlabel";
    locala.gtE = 637;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    if ((paramInt >= 0) && (!bg.nm(paramString)))
    {
      this.muQ = new aky();
      this.muQ.uAa = paramInt;
      this.muQ.uzZ = paramString;
    }
    GMTrace.o(7276614123520L, 54215);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7277016776704L, 54218);
    this.fUd = parame1;
    bkn localbkn = (bkn)this.fUa.gtC.gtK;
    if (this.muQ != null)
    {
      localbkn.uVh = this.muQ;
      int i = a(parame, this.fUa, this);
      GMTrace.o(7277016776704L, 54218);
      return i;
    }
    w.e("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[doScene] label pair is null.");
    parame1.a(3, -1, "[doScene]empty label pair.", this);
    GMTrace.o(7277016776704L, 54218);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7276748341248L, 54216);
    w.d("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7276748341248L, 54216);
  }
  
  public final int getType()
  {
    GMTrace.i(7276882558976L, 54217);
    GMTrace.o(7276882558976L, 54217);
    return 637;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */