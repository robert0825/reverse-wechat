package com.tencent.mm.modelappbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.adj;
import com.tencent.mm.protocal.c.adk;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  public final b grb;
  
  public l(int paramInt)
  {
    GMTrace.i(12928791085056L, 96327);
    b.a locala = new b.a();
    locala.gtF = new adj();
    locala.gtG = new adk();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getservicenotifyoptions";
    locala.gtE = 1145;
    locala.gtH = 0;
    locala.gtI = 0;
    this.grb = locala.DA();
    ((adj)this.grb.gtC.gtK).utx = paramInt;
    GMTrace.o(12928791085056L, 96327);
  }
  
  public final adk CL()
  {
    GMTrace.i(12928925302784L, 96328);
    adk localadk = (adk)this.grb.gtD.gtK;
    GMTrace.o(12928925302784L, 96328);
    return localadk;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12929327955968L, 96331);
    w.i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.grb, this);
    GMTrace.o(12929327955968L, 96331);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12929059520512L, 96329);
    w.i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(12929059520512L, 96329);
  }
  
  public final int getType()
  {
    GMTrace.i(15657974366208L, 116661);
    GMTrace.o(15657974366208L, 116661);
    return 1145;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */