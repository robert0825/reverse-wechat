package com.tencent.mm.plugin.ext.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.protocal.c.lr;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  public int kOg;
  public String mUrl;
  
  public a(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(20570343211008L, 153261);
    this.kOg = -1;
    this.mUrl = null;
    this.mUrl = paramString;
    b.a locala = new b.a();
    locala.gtF = new lq();
    locala.gtG = new lr();
    locala.uri = "/cgi-bin/micromsg-bin/checkcamerascan";
    locala.gtE = 782;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    w.i("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: checking url: %s", new Object[] { paramString });
    paramString = (lq)this.fUa.gtC.gtK;
    paramString.URL = this.mUrl;
    paramString.uco = paramInt1;
    paramString.ucp = paramInt2;
    GMTrace.o(20570343211008L, 153261);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20570611646464L, 153263);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20570611646464L, 153263);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20570745864192L, 153264);
    w.d("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: on get camera url end. errType; %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (lr)((b)paramq).gtD.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      this.kOg = paramq.jib;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(20570745864192L, 153264);
  }
  
  public final int getType()
  {
    GMTrace.i(20570477428736L, 153262);
    GMTrace.o(20570477428736L, 153262);
    return 782;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */